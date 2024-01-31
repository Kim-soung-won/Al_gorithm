-- 코드를 입력하세요
SELECT MEMBER_ID, MEMBER_NAME, GENDER, DATE_FORMAT(DATE_OF_BIRTH,'%Y-%m-%d') as date
from MEMBER_PROFILE
where GENDER like 'W' and DATE_FORMAT(DATE_OF_BIRTH,'%m') like '03' 
and TLNO is not null
order by MEMBER_ID ASC