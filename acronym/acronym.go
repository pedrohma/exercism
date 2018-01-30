package main

import (
	"fmt"
	"strings"
)

func getAcronym(word string){
	var acronym = ""
  	wordArray := strings.Fields(word)  
  	for _, v := range wordArray {    
		acronym = acronym + string(v[0])
  	}
	fmt.Println(acronym)
}

func main() {
	getAcronym("Pedro Henrique Arthur")
}
