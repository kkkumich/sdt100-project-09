class SecretMethod { private void secret(){} }
class PrivateMethodError { public static void main(String[] args){new SecretMethod().secret();} }
