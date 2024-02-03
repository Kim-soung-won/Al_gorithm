-- 코드를 입력하세요
SELECT CAR_ID, round(avg(DATEDIFF(END_DATE,START_DATE)+1),1) as AVERAGE_DURATION
from car_rental_company_rental_history
Group by car_id
having AVERAGE_DURATION >= 7.0
order by AVERAGE_DURATION desc, car_id desc