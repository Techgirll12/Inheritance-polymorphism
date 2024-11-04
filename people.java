public class people {
    String name;
    int age;

    public people(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo(){
        System.out.println("name: "+ name);
        System.out.println("age: " + age);
    }
}


class woman extends people {
    String child;
    public woman(String name, int age, String child) {

        super(name, age);
        this.child =child;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
    }
    public void displaywomanInfo(){
        System.out.println("cild: " + child);
    }
}


class girl extends woman{
    String nickname;

    public girl(String name, int age, String child, String nickname) {
        super(name, age, child);
        this.nickname = nickname;
    }

    public void displaygirlInfo(){
        displaywomanInfo();
        System.out.println("nickname: " +nickname);
    }
}

class man extends people{
    String beard;

    public man(String name, int age, String beard) {
        super(name, age);
        this.beard = beard;
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
    }
    public void displaymanInfo(){
        System.out.println("beard: " + beard);
    }
}

class main {
    public static void main(String[] args) {

        woman woman= new woman("hani", 17,"cabdi");
        woman.displaywomanInfo();

        girl girll = new girl("ham",12,"kun","kir");
        girll.displaygirlInfo();

        man mn = new man("kun", 17,"black");
        mn.displaymanInfo();
    }
}














