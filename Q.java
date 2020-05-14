public class Q extends Thread {
  Semaforo sem1;
  Semaforo sem2;
  Semaforo sem3;
  Semaforo sem4;
  Semaforo sem5;

  public Q(Semaforo s1, Semaforo s2, Semaforo s3, Semaforo s4, Semaforo s5) {
    sem1 = s1;
    sem2 = s2;
    sem3 = s3;
    sem4 = s4;
    sem5 = s5;
  }

  @Override
  public void run() {
    sem1.P();
    System.out.println("A");
    sem2.V();
    sem4.P();
    System.out.println("R");
    sem5.V();
  }
}
