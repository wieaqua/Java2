public class ClassRoom implements Runnable {
    Thread student, teacher;

    ClassRoom() {
        teacher = new Thread(this);
        student = new Thread(this);
        teacher.setName("Doctor Wang");
        student.setName("zhang san");
    }

    public void run() {
        if (Thread.currentThread() == student) {
            try {
                System.out.println(student.getName() + "正在睡觉 不听课");
                Thread.sleep(1000 * 60 * 60);
            } catch (InterruptedException e) {
                System.out.println(student.getName() + "被老师叫醒了");
            }
        } else if (Thread.currentThread() == teacher) {
            for (int i = 1; i <= 3; i++) {
                System.out.println("上课了");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                }
            }
            student.interrupt();
        }
    }
}