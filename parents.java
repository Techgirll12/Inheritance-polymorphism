public class parents{
    public void performanceAction(){
        System.out.println("parents performance action");
    }
    public void displaydetails(String Name){
        System.out.println("display details for: " + Name);
    }
}


class boy extends parents {

    @Override
    public void performanceAction() {
        super.performanceAction();
        System.out.println("boy is plyaing footbal;");
    }
}

class girll extends parents{

    @Override
    public void performanceAction() {
        super.performanceAction();
        System.out.println("girl is playing basketball.");
    }
}


class mainn {
    public static void main(String[] args) {

        boy  boy = new boy();
        girll gl = new girll();

        boy.performanceAction();
        gl.performanceAction();

        boy.displaydetails("hm");
        gl.displaydetails("kmk");
    }
}
