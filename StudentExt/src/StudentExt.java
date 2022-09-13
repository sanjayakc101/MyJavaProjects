
public class StudentExt extends Student{
 private String gradeType;

 

            public StudentExt(int id, String name, double[] scores, String gradeType) {

                        super(id, name, scores);

                        this.gradeType = gradeType;

            }

            public String getGradeType() {

                        return gradeType;

            }
            
             public String findGrade ( ){
             String grade = super.findGrade ( );
              if (gradeType.equalsIgnoreCase ("Credit")){

  if ( (grade.equalsIgnoreCase ("A")) ||

  (grade.equalsIgnoreCase ("B")) || 

   (grade.equalsIgnoreCase ("C")))

      grade = "CR";

    else

      grade = "NCR";

          }

  return grade;

            }

}


