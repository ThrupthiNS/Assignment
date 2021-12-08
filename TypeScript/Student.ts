class Student{
sid:number=22;
    sName:string="rev";
    sClass:string="fifth"
    
    constructor(i:number, n:string, s:string){  
        this.sid=i;  
        this.sName=n;  
        this.sClass=s;
  
    }
  
    display(){
        console.log(this.sid);
        console.log(this.sName);
        console.log(this.sClass); 
    }
    }
  
    var e1 = new Student(100,"Roopa","first");
    
    e1.display();
  
    var e2 = new Student(101,"Shiva","second");
    
    e2.display();