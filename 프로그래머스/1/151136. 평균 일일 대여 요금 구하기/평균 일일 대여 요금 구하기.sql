-- 코드를 입력하세요
SELECT round(avg(DAILY_FEE),0) as AVERAGE_FEE
from CAR_RENTAL_COMPANY_CAR
group by CAR_TYPE
Having CAR_TYPE = 'SUV'