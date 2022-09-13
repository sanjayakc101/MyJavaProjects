import javax.swing.JOptionPane;
public class Student implements Status {
			
			private int id;
            private String name;
            private double [] scores;

             

            public Student(int id, String name, double[] scores) {

                super();

                this.id = id;

                this.name = name;

                this.scores = scores.clone();

            }

          
            public int getId() {

                        return id;

            }

            public String getName() {

                        return name;

            }
            public double[] getScores ( )

            {

               return scores.clone();

            }

            public String getStatus ( )

           {

                      String status="";

          status="Student\nid="+id+", name="+name+", scores= ";
          for (int i=0;i<scores.length;i++) 
          {
                      status=status+scores[i]+" ";
          }
          status=status+"\n";

                      return status;

            }

            public void displayStatus()

            {

                      String status=getStatus ();

                      JOptionPane.showMessageDialog (null, status);

           }

           

          }

