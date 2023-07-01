package baseball;
import camp.nextstep.edu.missionutils.Console;

public class UserFunction {
    private String userNumber;
    ExceptionContoller exceptionContoller = new ExceptionContoller();
    public String getUserNumber(){  //유저 숫자 받기
        System.out.print(Message.INPUT_USERNUMBER_MESSAGE.getMessage());
        userNumber = Console.readLine();

        exceptionContoller.notIntegerException(userNumber);
        exceptionContoller.notThreeDigitException(userNumber);
        exceptionContoller.reduplicationException(userNumber);
        exceptionContoller.zeroValueException(userNumber);

        return userNumber;
    }
}