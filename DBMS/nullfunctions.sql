use demodb;
create table product(product_id int, quantity int, unitprice int);
insert into product(product_id,quantity,unitprice) values(1,10,200);
insert into product(product_id,unitprice) values(2,400);
insert into product(product_id,unitprice) values(3,500);
select * from product;
-- null functions
SELECT product_id, unitprice * (IFNULL(quantity, 0)) as total_price
FROM Product;


