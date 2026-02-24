package factorypattern;

public class PersonBuilderClass {
    private String firstName;
    private String lastName;
    private String email;
    private Integer age;
    private Long phone;

    @Override
    public String toString() {
        return "PersonBuilderClass{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", phone=" + phone +
                '}';
    }
    private PersonBuilderClass(BuilderClass builder) {
        firstName = builder.firstName;
        lastName = builder.lastName;
        email = builder.email;
        age = builder.age;
        phone = builder.phone;
    }

    public static class BuilderClass{
        private String firstName;
        private String lastName;
        private String email;
        private Integer age=null;
        private Long phone = null;

        public BuilderClass(String firstName, String lastName, String email) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.email = email;
        }

        public BuilderClass age(int val){
            age=val;
            return this;
        }

        public BuilderClass phone(long val){
            phone = val;
            return this;
        }

        public PersonBuilderClass build(){
            String isVld = isValidField();
            if(isVld.isBlank())
                return new PersonBuilderClass(this);
            else
                throw new IllegalArgumentException(isVld.toString());
        }

        private String isValidField(){
            String response = "";
            if(firstName==null || firstName.isBlank() || firstName.length()<2)
                return "First Name can't be null and the length should be more than 2 letters";

            if(lastName==null || lastName.isBlank())
                return "Last Name can't be null";

            if(email==null || !String.valueOf(email).contains("@"))
                return "Email can't be null";

            return response;
        }

    }



    public static void main(String[] args) {
        try {
            PersonBuilderClass pb1 = new BuilderClass
                    ("Saurabh",
                            "Tripathi",
                            "saurabhtripathi395@gmail.com")
                    .age(32).phone(9451758380l).build();
            System.out.println(pb1);
        }catch(IllegalArgumentException ie){
            ie.printStackTrace();
        }

        try {
            PersonBuilderClass pb2 =
                    new BuilderClass
                            ("Supriya", "Shukla", "supriya200196@gmail.com").build();
            System.out.println(pb2);
        }catch(IllegalArgumentException ex){
            ex.printStackTrace();
        }

        try {
            PersonBuilderClass pb3 = new BuilderClass(null, "na", "bb@b.com").age(3).build();

            System.out.println(pb3);
        }catch(IllegalArgumentException ie){
            ie.printStackTrace();
        }


        try {
            PersonBuilderClass pb4 = new BuilderClass("Sa", "na", null).build();
            System.out.println(pb4);
        }catch(IllegalArgumentException ie){
            ie.printStackTrace();
        }
    }

}
