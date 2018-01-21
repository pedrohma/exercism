package main

import "fmt"

var p = fmt.Println
var initial, length, count int

func getCodons(RNA string) []string {
	length := len(RNA)
	initial = 0
	count = 3
	runes := []rune(RNA)
	codons := []string{}
	for length > 0 {
		safeSubstring := string(runes[initial:count])
		codons = append(codons, safeSubstring)
		initial = initial + 3
		count = count + 3
		length = length - 3
	}
	return codons
}

func getProteins(codons []string) []string {
	proteins := []string{}
	var isValid = true
	for j := 0; j < len(codons); j++ {
		if !isValid {
			break
		}
		switch codons[j] {
		case "AUG":
			proteins = append(proteins, "Methionine")
		case "UUU":
			proteins = append(proteins, "Phenylalanine")
		case "UUC":
			proteins = append(proteins, "Phenylalanine")
		case "UUA":
			proteins = append(proteins, "Leucine")
		case "UUG":
			proteins = append(proteins, "Leucine")
		case "UCU":
			proteins = append(proteins, "Serine")
		case "UCC":
			proteins = append(proteins, "Serine")
		case "UCA":
			proteins = append(proteins, "Serine")
		case "UCG":
			proteins = append(proteins, "Serine")
		case "UAU":
			proteins = append(proteins, "Tyrosine")
		case "UAC":
			proteins = append(proteins, "Tyrosine")
		case "UGU":
			proteins = append(proteins, "Cysteine")
		case "UGC":
			proteins = append(proteins, "Cysteine")
		case "UGG":
			proteins = append(proteins, "Tryptophan")
		case "UAA":
			isValid = false
		case "UAG":
			isValid = false
		case "UGA":
			isValid = false
		default:
			break
		}
	}

	return proteins
}

func main() {
	codons := getCodons("AUGUUUUCUUAAAUG")
	proteins := getProteins(codons)
	fmt.Print(proteins)
}
