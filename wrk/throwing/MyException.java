// Custom exception
class MyException extends Exception {

  public MyException(String msg) {
    // I guess what this does is print the msg to the log + some information about where the error occured
    super(msg);
  }
  
}

