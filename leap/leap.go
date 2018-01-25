package main

import (
	"fmt"
	"strconv"
)

var p = fmt.Println

func validateYear(year int){
	var isLeap = false
	if ( year % 4 == 0 ){
		if( year % 100 == 0 ) {
			if (year % 400 == 0) {
				isLeap = true	
			}
		} else {
			isLeap = true
		}
	}
	
	if(isLeap){
		p(strconv.Itoa(year) + " is a leap year")
	} else {
		p(strconv.Itoa(year) + " is not a leap year")
	}	
}

func main() {
	validateYear(2012)
	validateYear(1997)
	validateYear(1990)
	validateYear(2000)
}
