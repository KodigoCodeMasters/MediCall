//Function for counting the number of pathologies
var numberOfPathologies = 0;
document.getElementById("num_of_pathologies").innerHTML = numberOfPathologies;
function countPathologies(id){
    if(document.getElementById(id).checked){
        this.numberOfPathologies++;
    }else{
        this.numberOfPathologies--;
    }
    document.getElementById("num_of_pathologies").innerHTML = numberOfPathologies;
    document.getElementById("numOfPathologies").value = numberOfPathologies;
}
