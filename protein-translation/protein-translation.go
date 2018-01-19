package main

import "fmt"

var p = fmt.Println
var initial, length, count int
var codons []string

func getCodons(RNA string) {
	length := len(RNA)
	initial = 0
	count = 3
	runes := []rune(RNA)
	letters := []string{}
	for length > 0 {
		safeSubstring := string(runes[initial:count])
		letters = append(letters, safeSubstring)
		initial = initial + 3
		count = count + 3
		length = length - 3
	}
	fmt.Print(letters)
}

func main() {
	getCodons("AUGUUUUCU")
}
