-- 코드를 입력하세요
SELECT b.FLAVOR
from (select a.* from FIRST_HALF as a
     order by a.TOTAL_ORDER DESC, a.SHIPMENT_ID ASC) as b
