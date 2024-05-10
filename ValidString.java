class ValidString {
    public int addMinimum(String word) {
        String[] temp = word.split("abc");
        int out = 0;
        for(int i=0; i<temp.length; i++){
            String s = temp[i];
            if(temp[i].equals("ab")){
                out += 1;
            }else{
                int j = 0;
                while(j < s.length()){
                    char ch = s.charAt(j);
                    if(ch == 'a'){
                        if(j < s.length()-1){
                            char c = s.charAt(j+1);
                            if(c == 'b'){
                                out++;
                                j = j+2;
                            }else if (c == 'c') {
                                out++;
                                j = j+2;
                            } 
                            else{
                                out += 2;
                                j++;
                            }
                        }else{
                            out += 2;
                            j++;
                        }
                    }else if(ch == 'b'){
                        if(j < s.length()-1){
                            char c = s.charAt(j+1);
                            if(c == 'c'){
                                out++;
                                j = j+2;
                            }else{
                                out += 2;
                                j++;
                            }
                        }else{
                            out += 2;
                            j++;
                        }
                    }else{
                        out += 2;
                        j++;
                    }
                }
            }
        }
        return out;
    }
}
