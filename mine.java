public class SpinWords {

  public String spinWords(String sentence) {
    //TODO: Code stuff here
        StringBuilder tt = new StringBuilder();
        String temp = "";
        String result = "";
        for(char a: sentence.toCharArray()){
            if(Character.isLetter(a)){
                temp+= a;
            }else{
                if(temp.length()>4){
                    tt.append(temp);
                    tt = tt.reverse();

                    temp = tt.toString();
                    tt.setLength(0);
                    result = result + " " + temp;
                    temp = "";
                }else{
                    result = result + " " + temp;
                    temp = "";
                }
            }

        }
        if(temp!=null){
            if(temp.length()>5){
                tt.append(temp);
                tt = tt.reverse();

                temp = tt.toString();
                tt.setLength(0);
                result =result+ " " + temp;
                temp = "";
            }else{
                result =result + " " + temp;
                temp = "";
            }
        }
        return result.substring(1);
  }
}
