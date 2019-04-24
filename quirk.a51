ORG 00H
	
;Add two 8-bit nos

;MOV A,#23H
;Mov B,#42H
;ADD A,B
;MOV R0,A



;ADD TWO 16-BIT NOS
;LETS ADD 4503 AND 6705
;NOW TAKE THE LOWER BITS OF BOTH NUMBER SEPERATE, I.E. 03 AND 05
;NOW TAKE THE HIGHER BITS OF BOTH NUMBER SEPERATE, I.E. 45 AND 67
;SEE THE PROBLEM IS DIVIDED INTO TWO 8-BIT PROBLEM :) DIVIDE AND CONQUER

;MOV A,#03H
;Mov B,#05H
;ADD A,B
;MOV R0,A
;MOV A,#45H
;Mov B,#67H
;ADD A,B
;MOV R1,A
;END


;Multiply
;Below multiply is 660, therefore LSB - 60 is stored in A and MSB - 6 in B

;MOV A, #33H
;MOV B, #20H
;MUL AB
;MOV R0, A
;END
;Divide
;Below quotient 33/10 is 3 and remainder is 3
;but why 33/4, q=c and rem = 3
;and why 33/12, q=2 and rem=f

;MOV A, #33H
;MOV B, #12H
;DIV AB
;MOV R0, A
;END


; sum of first 20 even nos

;MOV R0, #20
;MOV A, #0
;LOOP: 
;	ADD A, R0
;	DEC R0
;	DJNZ R0, LOOP
;MOV R1, A
;END




;sum of first 20 odd nos

MOV R0, #20
MOV A, #0
LOOP: 
	DEC R0
	ADD A, R0
	DJNZ R0, LOOP
MOV R1, A
END


;TEST CODE

;MOV R5, #25H	;SAJKHDJ;
;MOV R7, #34H
;MOV A, #0
;ADD A, R5
;ADD A, R7
;ADD A, #12H
;HERE: SJMP HERE
;END


;sum of first 10 natural nos

;MOV R0, #10
;MOV A, #0
;LOOP:
;	ADD A, R0
;	DJNZ R0, LOOP
;MOV R1,A
;END


; SQUARE OF NUMBER

;MOV R0, #07H
;MOV R1, #07H
;CLR A
;AGAIN:ADD A, R1
;DJNZ R0, AGAIN
;MOV R2, A
;END