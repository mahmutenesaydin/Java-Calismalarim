public class BalanceInsufficentException extends Exception
{
    String _message;

    public BalanceInsufficentException(String message)
    {
        _message=message;
    }

    @Override
    public String getMessage()
    {
        return _message;
    }
}
