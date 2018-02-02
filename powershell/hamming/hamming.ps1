[string] $original = "GAGCCTACTAACGGGAT"
[string] $next = "CATCGTAATGACGGCCT"

$arrayOriginal = $original.ToCharArray()
$arrayNext = $next.ToCharArray()

Write-Host $arrayOriginal  
Write-Host $arrayNext 

[uint32] $count = 0

Foreach($i in $arrayOriginal)
{
	if($arrayOriginal[$count] -eq $arrayNext[$count]){
		Write-Host $arrayOriginal[$count]
	}
	else{
		Write-Host "( )"
	}
	$count = $count + 1
}