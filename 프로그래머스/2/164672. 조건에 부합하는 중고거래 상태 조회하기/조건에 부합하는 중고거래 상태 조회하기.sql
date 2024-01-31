-- 코드를 입력하세요
SELECT BOARD_ID, WRITER_ID, TITLE, PRICE, 
case
    when (STATUS like 'DONE') then '거래완료'
    when (STATUS like 'RESERVED') then '예약중'
    when (STATUS like 'SALE') then '판매중'
END as STATUS
from USED_GOODS_BOARD 
where DATE_FORMAT(CREATED_DATE,'%Y-%m-%d') like '2022-10-05'
order by BOARD_ID DESC