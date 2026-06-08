 import java.util.*;

// class student implements Comparable<student>{
//     String name;
//     int age ;

//     public student(String name, int age ) {
//         this.name=name;
//         this.age=age;

//     }
//     @Override
//     public int compareTo(student st){
//         return this.age-st.age;
//     }
    
// }
// class NameLength implements Comparator<student>{
//     @Override
//     public int compare(student s1, student s2){
//        return s1.name.length() - s2.name.length();
//     }
// }
// class sortingtest{
//     public static void main(String[] args) {
//         List<student> classList=new ArrayList<>();
//         classList.add(new student("SHLOK", 21));
//         classList.add(new student("RAAM", 22));
        
//         Collections.sort(classList);
//         System.out.println("Sorted by age:");
//         for(student s:classList){
//             System.out.println(s.name+" "+s.age);
//         }
//         classList.sort(new NameLength());
//         System.out.println("Sorted by name length");
//         for (student s :classList){
//             System.out.println(s.name+" "+s.age);
//         }

//     }

// }

class student implements Comparable<student>{
    int age;
    String name;

    public student(int age ,String name) {
        this.name=name;
        this.age=age;
    }

    public int compareTo(student st){
       return this.age-st.age;
    }
    
}

class lengthcheck implements Comparator<student>{
    public int compare(student s1,student s2){
       return  s1.name.length()-s2.name.length();
    }
}
class sortingtest{
    public static void main(String[] args) {
        List<student> classl =new ArrayList<>();
        classl.add(new student(20, "Shlok"));
        classl.add(new student(22, "ram"));

        Collections.sort(classl);
        System.out.println("Sort by age ");
        for(student s : classl){
            System.out.println(s.name+" "+s.age);
        }

        classl.sort(new lengthcheck());
        System.out.println("Sorting by name ");
        for(student s:classl){
            System.out.println(s.name+" "+s.age);
        }

    }
}
