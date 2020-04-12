grammar Task4;

r : s1 | s2 ;
s0 : '0'* {System.out.print("10");};
s11 : '1'* {System.out.print("01");} | '1'* '0' {System.out.print("10");} | '1'* '0' '0' (s0 | s1 | s2) | '1'* '0' '1' {System.out.print("10");} s11;
s1 : '0'* '1'+ {System.out.println("01");};
s2 : '0'* '1'+ '0' {System.out.print("10");} | '0'* '1'+ '0' '0'+ (s0 | s1 | s2) | '0'* '1'+ '0' '1' {System.out.print("10");} s11 ;

WS : [ \t\r\n]+ -> skip ;