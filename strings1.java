import java.util.Scanner;
public class strings1
{
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
      System.out.println("enter the statement");
      String s=sc.nextLine();
      System.out.println("enter the statement2");
      String s1=sc.nextLine();
     System.out.println("enter number to ");
      int ch=sc.nextInt();
      switch (ch) {
          case 1:
            System.out.println(s.endsWith(s1));
              
              break;
              case 2:
                System.out.println(s.charAt(0));
                System.out.println(s1.charAt(3));
                break;
                case 3:
                  System.out.println(s.startsWith(s1));
                  break;
                  case 4:
                    System.out.println(s.substring(3));
                    System.out.println(s1.substring(1));
                    break;
                    case 5:
                      System.out.println(s.toLowerCase());
                      System.out.println(s1.toLowerCase());
                      break;
                      case 6:
                        System.out.println(s.toUpperCase());
                        System.out.println(s1.toUpperCase());
                        break;
                        case 7:
                          System.out.println(s.indexOf('v',3));
                          break;
                              default:
              throw new AssertionError();
      }
}
}