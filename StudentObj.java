
class substu {

    // Private variable declaration

    private String rollno;

    private String name;

    private String dept;

    private String subject[] = new String[4];

    // getter-setter

    public String getroll()

    {

        return rollno;

    }

    public String getname()

    {

        return name;

    }

    public String getdept()

    {

        return dept;

    }

    public void getsub()

    {

        for (String s : subject)

            System.out.println(s);

    }

    public void setsub(String... x)

    {

        for (int i = 0; i < 4; i++)

        {

            subject[i] = x[i];

        }

    }

    public void setdept(String stream)

    {

        dept = stream;

    }

    // constructors

    public substu(String roll, String intro)

    {

        rollno = roll;

        name = intro;

    }

}

class subjectlist {

    public static void main(String args[])

    {

        substu s1 = new substu("GCECTB-R19-2023", "RONIT ROY");

        s1.setdept("INFORMATION TECHNOLOGY");

        System.out.println(
                "-------------------------------------STUDENT DETAILS--------------------------------------------");

        System.out.println("STUDENT NAME: " + s1.getname());

        System.out.println("STUDENT ROLL: " + s1.getroll());

        System.out.println("STUDENT DEPT: " + s1.getdept());

        System.out.println("STUDENT SUBJECT CHOICES");

        s1.setsub("OS", "DBMS", "JAVA", "GRAPHICS");

        s1.getsub();

    }

}