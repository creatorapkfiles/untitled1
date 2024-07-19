import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Semaphore;
import java.util.stream.Collectors;
import java.util.stream.Stream;


    public class SemaphoreExample {
        public static void main(String[] args) {
            Semaphore semaphore = new Semaphore(3); // Создание семафора с количеством разрешений 2

            // Потоки запрашивают доступ к ресурсу
            Thread thread1 = new Thread(() -> {
                try {
                    semaphore.acquire();
                    System.out.println("Поток 1 получил доступ");
                    Thread.sleep(2000); // Имитация работы с ресурсом
                    semaphore.release();
                    System.out.println("Поток 1 освободил доступ");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });

            Thread thread2 = new Thread(() -> {
                try {
                    semaphore.acquire();
                    System.out.println("Поток 2 получил доступ");
                    Thread.sleep(2000); // Имитация работы с ресурсом
                    semaphore.release();
                    System.out.println("Поток 2 освободил доступ");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
            Thread thread3 = new Thread(() -> {
                try {
                    semaphore.acquire();
                    System.out.println("Поток 3 получил доступ");
                    Thread.sleep(2000); // Имитация работы с ресурсом
                    semaphore.release();
                    System.out.println("Поток 3 освободил доступ");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });

            Thread thread4 = new Thread(() -> {
                try {
                    semaphore.acquire();
                    System.out.println("Поток 4 получил доступ");
                    Thread.sleep(2000); // Имитация работы с ресурсом
                    semaphore.release();
                    System.out.println("Поток 4 освободил доступ");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });

            thread1.start();
            thread2.start();
            thread3.start();
            thread4.start();
        }
    }

//    public static void main(String[] args) {
//
//    }
//    @Data
//    class User {
//        private String name;
//        private int age;
//        private List<Group> groups;
//    }
//
//    @Data
//    class Group {
//        private String name;
//        private String description;
//    }
//  public class SomeConsumer {
//        public List<User> consume(Stream<User> userStream){
//            return userStream
//                    .filter(user -> user.getGroups().stream()
//                            .anyMatch(group -> group.getName().startsWith("X"))).collect(Collectors.toList());
//        }
//  }

  //получить список пользователей которые состоят в группе, с наименованием начинающейся на "X"

