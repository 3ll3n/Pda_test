class Pda {

  public boolean func1(int val){
    if(val = 1){
      return true;
    }else{
      return false;
    }
  }

  public int max(int a, int b){
    if(a > b){
      return a;
    }else{
      return b;
    }
  }

  public int looper(){
    int i = 0;
    while(i <= 10){
      i++;
      return i;
    }
  } 

  public void checkLoop(){
    if (looper == 10){
      return "looper passed";
    }
    else{
      return "looper failed";
    }
  }
}
