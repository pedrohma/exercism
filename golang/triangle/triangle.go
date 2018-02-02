package main

import (
	"fmt"
)

var p = fmt.Println

func getTriangle(l1, l2, l3 int){
	var triangleType = ""
	if(l1 == l2 && l1 == l3){
		triangleType = "Equ"
	} else {
		if(l1 == l2 || l1 == l3 || l2 == l3){
			triangleType = "Iso"
		} else {
			triangleType = "Sca"
		}
	}
	
	p(triangleType)
}

func main() {
	getTriangle(5,4,7)
	getTriangle(5,5,7)
	getTriangle(2,2,2)
}
