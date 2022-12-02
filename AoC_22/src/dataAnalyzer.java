/**
 * Designed to help the Day class calculate different information
 *
 * mainly utilized to make day class simpler to read
 */

public class dataAnalyzer {

    public dataAnalyzer() {
    }


    public int checker(String op, String me){
        int status = 0;
        if(op.equalsIgnoreCase("A")){
            if(me.equalsIgnoreCase("X")){
                status = 4;
            }else{
                if(me.equalsIgnoreCase("Y")){
                    status = 8;
                }else{
                    if(me.equalsIgnoreCase("Z")){
                        status = 3;
                    }
                }
            }
        }else{
            if(op.equalsIgnoreCase("B")){
                if(me.equalsIgnoreCase("X")){
                    status = 1;
                }else{
                    if(me.equalsIgnoreCase("Y")){
                        status = 5;
                    }else{
                        if(me.equalsIgnoreCase("Z")){
                            status = 9;
                        }
                    }
                }
            }else{
                if(op.equalsIgnoreCase("C")){
                    if(me.equalsIgnoreCase("X")){
                        status = 7;
                    }else{
                        if(me.equalsIgnoreCase("Y")){
                            status = 2;
                        }else{
                            if(me.equalsIgnoreCase("Z")){
                                status = 6;
                            }
                        }
                    }
                }
            }
        }
        return status;
    }




}
