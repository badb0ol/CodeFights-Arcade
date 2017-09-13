// An IP address is a numerical label assigned to each device (e.g., computer, printer)
// participating in a computer network that uses the Internet Protocol for communication.
// There are two versions of the Internet protocol, and thus two versions of addresses.
// One of them is the IPv4 address.

// IPv4 addresses are represented in dot-decimal notation, which consists of four
// decimal numbers, each ranging from 0 to 255, separated by dots, e.g., 172.16.254.1.

// Given a string, find out if it satisfies the IPv4 address naming rules.

boolean isIPv4Address(String inputString) {
    int IPDigit = 0;
    boolean missingInt = true;
    int digitsCount = 0;

    inputString += '.';

    for (int i = 0; i < inputString.length(); i++) {
        if (inputString.charAt(i) == '.') {
            if (missingInt)
                return false;
            digitsCount++;
            IPDigit = 0;
            missingInt = true;
        }
    else{
        int number = inputString.charAt(i) - '0';
        if (number < 0 || number > 9)
            return false;
        missingInt = false;
        IPDigit = IPDigit * 10 + number;
        if (IPDigit > 255) {
            return false;
            }
        }
    }
    return digitsCount == 4;
}
