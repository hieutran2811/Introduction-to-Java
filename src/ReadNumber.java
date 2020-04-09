import java.util.Scanner;

public class ReadNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number to read: ");
        int Number = scanner.nextInt();
        int Number0 = Number%10;
        int Number1 = (Number-Number0)/10;
        int Number3 = ((Number%100)-Number0)/10;
        int Number2 = (Number-(Number%100))/100;

        String ReadNumber="";
        String ReadNumber1="";
        String ReadNumber2="";
        String ReadNumber3="";
        String ReadNumber4="";

        if(Number<100){
            if(Number<20){
                if(Number<10){
                    switch (Number){
                        case 1:
                            ReadNumber="one";
                            break;
                        case 2:
                            ReadNumber="two";
                            break;
                        case 3:
                            ReadNumber="three";
                            break;
                        case 4:
                            ReadNumber="four";
                            break;
                        case 5:
                            ReadNumber="five";
                            break;
                        case 6:
                            ReadNumber="six";
                            break;
                        case 7:
                            ReadNumber="seven";
                            break;
                        case 8:
                            ReadNumber="eight";
                            break;
                        case 9:
                            ReadNumber="nine";
                            break;
                    }
                    System.out.println(ReadNumber);
                }else{
                    switch (Number0){
                        case 0:
                            ReadNumber4="ten";
                            break;
                        case 1:
                            ReadNumber4="eleven";
                            break;
                        case 2:
                            ReadNumber4="twelve";
                            break;
                        case 3:
                            ReadNumber4="thirteen";
                            break;
                        case 4:
                            ReadNumber4="fourteen";
                            break;
                        case 5:
                            ReadNumber4="fifteen";
                            break;
                        case 6:
                            ReadNumber4="sixteen";
                            break;
                        case 7:
                            ReadNumber4="seventeen";
                            break;
                        case 8:
                            ReadNumber4="eighteen";
                            break;
                        case 9:
                            ReadNumber4="nineteen";
                            break;
                    }
                    System.out.println(ReadNumber4);
                }
            }else{
                switch (Number0){
                    case 0:
                        ReadNumber="";
                        break;
                    case 1:
                        ReadNumber="one";
                        break;
                    case 2:
                        ReadNumber="two";
                        break;
                    case 3:
                        ReadNumber="three";
                        break;
                    case 4:
                        ReadNumber="four";
                        break;
                    case 5:
                        ReadNumber="five";
                        break;
                    case 6:
                        ReadNumber="six";
                        break;
                    case 7:
                        ReadNumber="seven";
                        break;
                    case 8:
                        ReadNumber="eight";
                        break;
                    case 9:
                        ReadNumber="nine";
                        break;
                }
                switch (Number1){
                    case 2:
                        ReadNumber1="twenty ";
                        break;
                    case 3:
                        ReadNumber1="thirty ";
                        break;
                    case 4:
                        ReadNumber1="forty ";
                        break;
                    case 5:
                        ReadNumber1="fifty ";
                        break;
                    case 6:
                        ReadNumber1="sixty ";
                        break;
                    case 7:
                        ReadNumber1="seventy ";
                        break;
                    case 8:
                        ReadNumber1="eighty ";
                        break;
                    case 9:
                        ReadNumber1="ninety ";
                        break;
                }
                System.out.println(ReadNumber1+ReadNumber);
            }

        }else{
            switch (Number2){
                case 1:
                    ReadNumber2="one hundred and ";
                    break;
                case 2:
                    ReadNumber2="two hundred and ";
                    break;
                case 3:
                    ReadNumber2="three hundred and ";
                    break;
                case 4:
                    ReadNumber2="four hundred and ";
                    break;
                case 5:
                    ReadNumber2="five hundred and ";
                    break;
                case 6:
                    ReadNumber2="six hundred and ";
                    break;
                case 7:
                    ReadNumber2="seven hundred and ";
                    break;
                case 8:
                    ReadNumber2="eight hundred and";
                    break;
                case 9:
                    ReadNumber2="nine hundred and";
                    break;
            }
            if(Number3==1){
                switch (Number0){
                    case 0:
                        ReadNumber3="ten";
                        break;
                    case 1:
                        ReadNumber3="eleven";
                        break;
                    case 2:
                        ReadNumber3="twelve";
                        break;
                    case 3:
                        ReadNumber3="thirteen";
                        break;
                    case 4:
                        ReadNumber3="fourteen";
                        break;
                    case 5:
                        ReadNumber3="fifteen";
                        break;
                    case 6:
                        ReadNumber3="sixteen";
                        break;
                    case 7:
                        ReadNumber3="seventeen";
                        break;
                    case 8:
                        ReadNumber3="eighteen";
                        break;
                    case 9:
                        ReadNumber3="nineteen";
                        break;
                }
                System.out.println(ReadNumber2+ReadNumber3);

            }else{
                switch (Number3){
                    case 2:
                        ReadNumber1="twenty ";
                        break;
                    case 3:
                        ReadNumber1="thirty ";
                        break;
                    case 4:
                        ReadNumber1="forty ";
                        break;
                    case 5:
                        ReadNumber1="fifty ";
                        break;
                    case 6:
                        ReadNumber1="sixty ";
                        break;
                    case 7:
                        ReadNumber1="seventy ";
                        break;
                    case 8:
                        ReadNumber1="eighty ";
                        break;
                    case 9:
                        ReadNumber1="ninety ";
                        break;
                }
                switch (Number0){
                    case 0:
                        ReadNumber="";
                        break;
                    case 1:
                        ReadNumber="one";
                        break;
                    case 2:
                        ReadNumber="two";
                        break;
                    case 3:
                        ReadNumber="three";
                        break;
                    case 4:
                        ReadNumber="four";
                        break;
                    case 5:
                        ReadNumber="five";
                        break;
                    case 6:
                        ReadNumber="six";
                        break;
                    case 7:
                        ReadNumber="seven";
                        break;
                    case 8:
                        ReadNumber="eight";
                        break;
                    case 9:
                        ReadNumber="nine";
                        break;
                }
                System.out.println(ReadNumber2 + ReadNumber1 + ReadNumber);
            }
        }
    }
}
