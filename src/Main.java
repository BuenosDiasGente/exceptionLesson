public class Main {
    public static void main(String[] args) {

        try{ String login=new String("fgjujk");
            String password=new String("yu87");
            String confirmPassword=new String("hjilkbm");
            registerID(login,password,confirmPassword);
        }
        catch (WrongLoginException e){
            System.out.println( "Уменьшите количество символов ");
        }
        catch (WrongPasswordException e){
            System.out.println("Уменьшите количество символов и/или password и confirmPassword должны совпадать");
        }

    }
    public static void registerID( String login,String password,String confirmPassword) throws WrongLoginException,WrongPasswordException {

        if(login.length()>20){
            throw new WrongLoginException("ошибка в количестве символов ");
           }

        if ( !password.equals(confirmPassword)|| password.length()>=20 ){
            throw new WrongPasswordException("ошибка в сравнении password и  confirmPassword");
           }

        }

    }

