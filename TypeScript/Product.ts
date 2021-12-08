class Product{

    pId:number=11;

    pName: string = "Refridgerator"

    pPrice: number= 400000;
    
    constructor(i:number, n:string, b:number){

        this.pId=i;

        this.pName=n;

        this.pPrice=b;

    }

    Price():number{

       let gst:number= 100;

        return this.pPrice = this.pPrice+gst;

    }

    display(){

        console.log(this.pId);

        console.log(this.pName);

        console.log(this.pPrice);

    }

}

var f1 = new Product(11,"Refridgerator",400000);

var u= f1.Price();

f1.display();