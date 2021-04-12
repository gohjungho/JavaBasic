# 삼항연산자를 사용하여 (if 사용 금지)
# 1이면 1st, 2이면 2nd, 3이면 3rd, 4이면 4th
# 를 출력하는 프로그램을 작성하시오. 

ord = int(input("숫자 입력: "))
crd = (
    (str(ord) + "st") if (abs(ord) % 10 == 1 and abs(ord) % 100 != 11) 
    else (str(ord) + "nd") if (abs(ord) % 10 == 2 and abs(ord) % 100 != 12) 
    else (str(ord) + "rd") if (abs(ord) % 10 == 3 and abs(ord) % 100 != 13) 
    else str(ord) + "th"
)

print(crd)