//in diffrent files with inheritance
// 3. Solve (Mandatory assignment)
// Read complete assignment n then only solve.

// 1.1 Can you arrange Fruit,Apple,Orange,Mango,Alphonso in inheritance hierarchy ?
// Use tight encapsulation.

// 1.2 Properties (instance variables)  in Fruit class-
//  color : String , weight : double , name:String, isFresh : boolean

// 1.3 Add suitable constructors

// 1.4 Override  toString correctly to return state of all fruits (return only  - name ,color , weight )

// 1.5 Add a taste() method : public String taste()

// For Fruit : Can you identify taste of any general fruit ? NO
// So add a taste() with this definition : returns "unknown taste" 

// Apple : should return  "sweet n sour"
// Mango : should return  "sweet"
// Orange : should return  "sour"
// Alphonso : should return  "very very sweet"

// 1.6 Add specific functionality , in the sub classes
// In Alphonso : public void pulp() {Display name n color of the fruit + a mesg  creating  pulp!}
// In Orange : public void juice() {Display name n weight of the fruit + a mesg extracting juice!}
// In Apple : public void jam() {Display name of the fruit + a mesg  making jam!}

// 1.7 Add all of above classes under the package "com.app.fruits"
// 1.8 Create java application FruitBasket , with main method , as a tester
// 1.9 Prompt user for the basket size n create suitable data structure

// 1.10 Supply options
// 1. Add Alphonso
// 2. Add Orange
// 3. Add Apple
// NOTE : You will be ALWAYS adding a fresh fruit in the basket , in all of above options.

// 3. Display names of all fruits in the basket.

// 4. Display name,color,weight , taste of all fresh fruits , in the basket.


// 5. Invoke fruit specific functionality (pulp / juice / jam)
// i/p : index
// Invoke correct functionality (pulp / juice / jam)

// 0. Exit 


// 3. Any questions on pending assignments ?


// 4. Reading H.W (to be done after the lab)
// Go through - today's important readmes and sequence




class Fruit{
    private String color;
    private double weight;
    private String name;
    private boolean isFresh;

    public Fruit(String color, double weight, String name, boolean isFresh){
        this.color = color;
        this.weight = weight;
        this.name = name;
        this.isFresh = isFresh;
    }

    public String getColor(){
        return color;
    }

    public double getWeight(){
        return weight;
    }

    public String getName(){
        return name;
    }

    public boolean getIsFresh(){
        return isFresh;
    }

    public String taste(){
        return "unknown taste";
    }

    @Override
    public String toString(){
        return "Name: " + name + ", Color: " + color + ", Weight: " + weight;
    }

}



