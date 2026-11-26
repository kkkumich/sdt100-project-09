class SecretField { private int number=7; }
class PrivateFieldError { public static void main(String[] args){System.out.println(new SecretField().number);} }
