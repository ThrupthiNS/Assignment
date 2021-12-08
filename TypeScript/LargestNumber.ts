class LargestNumber{

a:number=12;
b:number=25;
c:number=89;

largest(){

    if(this.a>this.b&&this.a>this.c){
        console.log(this.a+"a is large");
    }
    else if (this.b>this.a&&this.b>this.c) {
        console.log(this.b+" is greater");
    } else {
        console.log(this.c+" is greater");
    }
}

}

var o=new LargestNumber();
var o1=o.largest();
console.log(o1);
