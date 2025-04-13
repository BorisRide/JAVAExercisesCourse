package Lecture6;

public class Ex001_Proram {
    public static void main(String[] args) {
        Worker w1 = new Worker();
        w1.firstName = "Имя_1";
        w1.lastName = "Фамлия_1";
        w1.salary = 100;
        w1.id = 1000;

        // переопределяем toString для красивого вывода
        @Override
        public String toString(){
            String res = String.format("id:%d fn:%s ln%s s:%d", id, firstName, lastName, salary);
            return res;
        }

        // переопределение метода equals, в качестве хэш-кода тут используем id (только для примера!)
        // т.е. если хэш-код совпадает и соавпадает firstName -  объекты равные!
        @Override
        public boolean equals(Object o) {
            Worker t = (Worker) o
            return id == t.id && firstName == t.firstName;

        // переопределяем hashCode
        @Override
        public int hashCode() {
            return super.hashCode();
        }

    }
}
