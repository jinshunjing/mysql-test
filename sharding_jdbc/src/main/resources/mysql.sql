
create DATABASE testdb1;
create DATABASE testdb2;

CREATE TABLE IF NOT EXISTS `t_order`(
   `order_id` int(20) PRIMARY KEY NOT NULL,
   `order_title` VARCHAR(10) NOT NULL,
   `order_amount` int(3) NOT NULL DEFAULT 0,
   `order_state` int(6) NOT NULL DEFAULT 0,
   `create_time` int(11) NOT NULL DEFAULT 0,
   `modify_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE IF NOT EXISTS `t_order_0`(
   `order_id` int(20) PRIMARY KEY NOT NULL,
   `order_title` VARCHAR(10) NOT NULL,
   `order_amount` int(3) NOT NULL DEFAULT 0,
   `order_state` int(6) NOT NULL DEFAULT 0,
   `create_time` int(11) NOT NULL DEFAULT 0,
   `modify_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE IF NOT EXISTS `t_order_1`(
   `order_id` int(20) PRIMARY KEY NOT NULL,
   `order_title` VARCHAR(10) NOT NULL,
   `order_amount` int(3) NOT NULL DEFAULT 0,
   `order_state` int(6) NOT NULL DEFAULT 0,
   `create_time` int(11) NOT NULL DEFAULT 0,
   `modify_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
)ENGINE=InnoDB DEFAULT CHARSET=utf8;



