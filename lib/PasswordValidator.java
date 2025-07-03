package lib;

public class PasswordValidator {

    /**
     @param รับค่า password ต้องมีตัวเลขมากว่าหรือเท่ากับ 8 ตัว และไม่เกิน10ตัว มีอักษร อย่างน้อย 1 ตัว หรือ ตัวอักขระ อย่างน้อย 1 ตัว หรือ ตัวอักษรพิมใหญ่ อย่างน้อย 1 ตัว
     @return ส่งค่าenumของรหัสผ่าน (INVALID,WEAK,MEDIUM,STRONG)
     *ระดับ INVALID มีตัวเลข น้อยกว่า 8 และ ไม่มีอักษร ตัวอักขระ ตัวพิมใหญ๋
     *ระดับ WEAK มีแค่ตัวเลข 8 ตัว มีตัวอักษร อย่างเดียว
     *ระดับ MEDIUM มีตัวเลข 9 ตัว มีอักษรตัวอักขระและอักษร อย่างละ 1 ตัว หรือมากกว่า
     *ระดับ STRONG มีตัวเลข 10 ตัว มีอักษรและตัวอักขระและตัวอักษรพิมใหญ่ อย่างละ 1 ตัวหรือมากกว่่า
     */
    // TODO: แก้ไข return type ของเมธอดนี้ให้ถูกต้อง
    public static  PasswordStrength validate(String password) { // Function Type ให้เป็น PasswordStrength 
    if(password.length()<8){
        return PasswordStrength.INVALID;
    }
    boolean Digit = false ;
    boolean UpperCase = false ;
    boolean LowerCase = false ;
    boolean SpecialCher = false ;

   
        for(char a : password.toCharArray()){
        
        if(Character.isDigit(a)){
            Digit = true ;
        }else if(Character.isUpperCase(a)){
            UpperCase = true ;
       }else if(Character.isLowerCase(a)){
        LowerCase = true ;
       }else if(!Character.isWhitespace(a)&& !Character.isLetterOrDigit(a)){
        SpecialCher = true ;
       }
}
if(LowerCase&&UpperCase&&SpecialCher)
   return PasswordStrength.STRONG ;

else if (LowerCase&&Digit)
  return PasswordStrength.MEDIUM ; 
else if  (LowerCase || UpperCase)
  return PasswordStrength.WEAK ; 
else 
  return PasswordStrength.WEAK ;
}
}
    
