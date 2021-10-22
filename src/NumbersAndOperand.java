public class NumbersAndOperand {
    protected static String numberOne(String str) {
        String num1 = "";
        for(int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != '+' && str.charAt(i) != '-' && str.charAt(i) != '*' && str.charAt(i) != '/'
                    && str.charAt(i) != 's' && str.charAt(i) !='c') {
                num1 += str.charAt(i);
            } else if (str.charAt(i) == '+' || str.charAt(i) == '-' || str.charAt(i) == '*' || str.charAt(i) == '/'
            || str.charAt(i) == 's' || str.charAt(i) =='c') {
                break;
            }
        }
        return num1;
    }

    protected static String numberTwo(String str) {
        String numberReverse = "";
        String num2 = "";
        for(int i = str.length() - 1; i >= 0; i--) {
            if(str.charAt(i) != '+' && str.charAt(i) != '-' && str.charAt(i) != '/' && str.charAt(i) != '*'
                    && str.charAt(i) != 's' && str.charAt(i) !='c') {
                numberReverse += str.charAt(i);
            } else if(str.charAt(i) == '+' || str.charAt(i) == '-' || str.charAt(i) == '*' || str.charAt(i) == '/'
                    || str.charAt(i) == 's' || str.charAt(i) =='c') {
                break;
            }
        }
        for(int i = numberReverse.length() - 1; i >= 0; i--) {
            num2 += numberReverse.charAt(i);
        }
        return num2;
    }

    protected static String operand(String str) {
        String operand = "";
        for(int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '+' || str.charAt(i) == '-' || str.charAt(i) == '*' || str.charAt(i) == '/') {
                operand += str.charAt(i);
                break;
            }
        }
        return operand;
    }
    protected static String exitAreCancel(String str) {
        String exit = "";
        for(int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 's' || str.charAt(i) == 'c') {
                exit += str.charAt(i);
                break;
            }
        }
        return exit;
    }
    protected static void hello() {
        System.out.println("Привет =) Давай я тебе посчитаю пару чисел. Введи уравнение в формате число знак число =)");
        System.out.println("Для выхода введи \"s\"");
        System.out.println("Для сброса набери \"c\"");
    }
}

