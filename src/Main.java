


public class Main {
    public static void main(String[] args) {
        MyBiodata myBiodata = new MyBiodata("Tasya", 18, "Jalan Jalan");
        String name = myBiodata.getName();
        String address = myBiodata.getAddress();
        int age = myBiodata.getAge();

        System.out.println(name);
        System.out.println(age);
        System.out.println(address);


        MyBiodata myBiodata2 = new MyBiodata("Tasya", 18, "Jalan Jalan");
        String name2 = myBiodata2.getName();
        String address2 = myBiodata2.getAddress();
        int age2 = myBiodata2.getAge();

        System.out.println(name2);
        System.out.println(address2);
        System.out.println(age2);
    }
}