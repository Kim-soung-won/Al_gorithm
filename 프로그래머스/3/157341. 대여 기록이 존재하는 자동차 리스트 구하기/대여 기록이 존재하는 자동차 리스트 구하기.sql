-- 코드를 입력하세요
SELECT distinct co.car_id
from car_rental_company_car as co
left join car_rental_company_rental_history as hi on co.car_id = hi.car_id
where date_format(hi.start_date, '%m') = 10 and co.car_type = "세단"
order by co.car_id desc
