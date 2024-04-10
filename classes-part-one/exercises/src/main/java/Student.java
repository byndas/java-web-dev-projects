public class Student {
        private String name;
        private int studentId;
        private int numberOfCredits = 0;
        private double gpa = 0.0;

        public Student(String aName, int aStudentId, int aNumberOfCredits, double aGpa) {
                name = aName;
                studentId = aStudentId;
                numberOfCredits = aNumberOfCredits;
                gpa = aGpa;
        }

        public void setName(String aName) {
                name = aName;
        }

        public void setStudentId(int aStudentId) {
                studentId = aStudentId;
        }

        public void setGpa(double aGpa) {
                gpa = aGpa;
        }

        private void setNumberOfCredits(int aNumberOfCredits) {
                numberOfCredits = aNumberOfCredits;
        }

        public String getName() {
                return name;
        }

        public int getStudentId() {
                return studentId;
        }

        public int getNumberOfCredits() {
                return numberOfCredits;
        }

        public double getGpa() {
                return gpa;
        }
}
