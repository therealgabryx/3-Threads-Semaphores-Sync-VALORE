public class P extends Thread {
  Semaforo sem1;
  Semaforo sem2;
  Semaforo sem3;
  Semaforo sem4;
  Semaforo sem5;

  public P(Semaforo s1, Semaforo s2, Semaforo s3, Semaforo s4, Semaforo s5) {
    sem1 = s1;
    sem2 = s2;
    sem3 = s3;
    sem4 = s4;
    sem5 = s5;
  }

  @Override
  public void run() {
    System.out.println("V");
    sem1.V();
    sem2.P();
    System.out.println("L");
    sem3.V();
  }
}