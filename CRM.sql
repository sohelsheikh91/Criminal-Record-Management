CREATE TABLE  "APEX$_ACL" 
   (    "ID" NUMBER NOT NULL ENABLE, 
    "WS_APP_ID" NUMBER NOT NULL ENABLE, 
    "USERNAME" VARCHAR2(255) NOT NULL ENABLE, 
    "PRIV" VARCHAR2(1) NOT NULL ENABLE, 
    "CREATED_ON" DATE NOT NULL ENABLE, 
    "CREATED_BY" VARCHAR2(255) NOT NULL ENABLE, 
    "UPDATED_ON" DATE, 
    "UPDATED_BY" VARCHAR2(255), 
     CONSTRAINT "APEX$_ACL_PRIV_CK" CHECK (priv in ('R','C','A')) ENABLE, 
     CONSTRAINT "APEX$_ACL_PK" PRIMARY KEY ("ID") ENABLE
   ) ;CREATE TABLE  "APEX$_WS_ROWS" 
   (    "ID" NUMBER NOT NULL ENABLE, 
    "WS_APP_ID" NUMBER NOT NULL ENABLE, 
    "DATA_GRID_ID" NUMBER NOT NULL ENABLE, 
    "UNIQUE_VALUE" VARCHAR2(255), 
    "TAGS" VARCHAR2(4000), 
    "PARENT_ROW_ID" NUMBER, 
    "OWNER" VARCHAR2(255), 
    "GEOCODE" VARCHAR2(512), 
    "LOAD_ORDER" NUMBER, 
    "CHANGE_COUNT" NUMBER, 
    "CREATED_ON" DATE NOT NULL ENABLE, 
    "CREATED_BY" VARCHAR2(255) NOT NULL ENABLE, 
    "UPDATED_ON" DATE, 
    "UPDATED_BY" VARCHAR2(255), 
    "C001" VARCHAR2(4000), 
    "C002" VARCHAR2(4000), 
    "C003" VARCHAR2(4000), 
    "C004" VARCHAR2(4000), 
    "C005" VARCHAR2(4000), 
    "C006" VARCHAR2(4000), 
    "C007" VARCHAR2(4000), 
    "C008" VARCHAR2(4000), 
    "C009" VARCHAR2(4000), 
    "C010" VARCHAR2(4000), 
    "C011" VARCHAR2(4000), 
    "C012" VARCHAR2(4000), 
    "C013" VARCHAR2(4000), 
    "C014" VARCHAR2(4000), 
    "C015" VARCHAR2(4000), 
    "C016" VARCHAR2(4000), 
    "C017" VARCHAR2(4000), 
    "C018" VARCHAR2(4000), 
    "C019" VARCHAR2(4000), 
    "C020" VARCHAR2(4000), 
    "C021" VARCHAR2(4000), 
    "C022" VARCHAR2(4000), 
    "C023" VARCHAR2(4000), 
    "C024" VARCHAR2(4000), 
    "C025" VARCHAR2(4000), 
    "C026" VARCHAR2(4000), 
    "C027" VARCHAR2(4000), 
    "C028" VARCHAR2(4000), 
    "C029" VARCHAR2(4000), 
    "C030" VARCHAR2(4000), 
    "C031" VARCHAR2(4000), 
    "C032" VARCHAR2(4000), 
    "C033" VARCHAR2(4000), 
    "C034" VARCHAR2(4000), 
    "C035" VARCHAR2(4000), 
    "C036" VARCHAR2(4000), 
    "C037" VARCHAR2(4000), 
    "C038" VARCHAR2(4000), 
    "C039" VARCHAR2(4000), 
    "C040" VARCHAR2(4000), 
    "C041" VARCHAR2(4000), 
    "C042" VARCHAR2(4000), 
    "C043" VARCHAR2(4000), 
    "C044" VARCHAR2(4000), 
    "C045" VARCHAR2(4000), 
    "C046" VARCHAR2(4000), 
    "C047" VARCHAR2(4000), 
    "C048" VARCHAR2(4000), 
    "C049" VARCHAR2(4000), 
    "C050" VARCHAR2(4000), 
    "N001" NUMBER, 
    "N002" NUMBER, 
    "N003" NUMBER, 
    "N004" NUMBER, 
    "N005" NUMBER, 
    "N006" NUMBER, 
    "N007" NUMBER, 
    "N008" NUMBER, 
    "N009" NUMBER, 
    "N010" NUMBER, 
    "N011" NUMBER, 
    "N012" NUMBER, 
    "N013" NUMBER, 
    "N014" NUMBER, 
    "N015" NUMBER, 
    "N016" NUMBER, 
    "N017" NUMBER, 
    "N018" NUMBER, 
    "N019" NUMBER, 
    "N020" NUMBER, 
    "N021" NUMBER, 
    "N022" NUMBER, 
    "N023" NUMBER, 
    "N024" NUMBER, 
    "N025" NUMBER, 
    "N026" NUMBER, 
    "N027" NUMBER, 
    "N028" NUMBER, 
    "N029" NUMBER, 
    "N030" NUMBER, 
    "N031" NUMBER, 
    "N032" NUMBER, 
    "N033" NUMBER, 
    "N034" NUMBER, 
    "N035" NUMBER, 
    "N036" NUMBER, 
    "N037" NUMBER, 
    "N038" NUMBER, 
    "N039" NUMBER, 
    "N040" NUMBER, 
    "N041" NUMBER, 
    "N042" NUMBER, 
    "N043" NUMBER, 
    "N044" NUMBER, 
    "N045" NUMBER, 
    "N046" NUMBER, 
    "N047" NUMBER, 
    "N048" NUMBER, 
    "N049" NUMBER, 
    "N050" NUMBER, 
    "D001" DATE, 
    "D002" DATE, 
    "D003" DATE, 
    "D004" DATE, 
    "D005" DATE, 
    "D006" DATE, 
    "D007" DATE, 
    "D008" DATE, 
    "D009" DATE, 
    "D010" DATE, 
    "D011" DATE, 
    "D012" DATE, 
    "D013" DATE, 
    "D014" DATE, 
    "D015" DATE, 
    "D016" DATE, 
    "D017" DATE, 
    "D018" DATE, 
    "D019" DATE, 
    "D020" DATE, 
    "D021" DATE, 
    "D022" DATE, 
    "D023" DATE, 
    "D024" DATE, 
    "D025" DATE, 
    "D026" DATE, 
    "D027" DATE, 
    "D028" DATE, 
    "D029" DATE, 
    "D030" DATE, 
    "D031" DATE, 
    "D032" DATE, 
    "D033" DATE, 
    "D034" DATE, 
    "D035" DATE, 
    "D036" DATE, 
    "D037" DATE, 
    "D038" DATE, 
    "D039" DATE, 
    "D040" DATE, 
    "D041" DATE, 
    "D042" DATE, 
    "D043" DATE, 
    "D044" DATE, 
    "D045" DATE, 
    "D046" DATE, 
    "D047" DATE, 
    "D048" DATE, 
    "D049" DATE, 
    "D050" DATE, 
    "CLOB001" CLOB, 
    "SEARCH_CLOB" CLOB, 
     CONSTRAINT "APEX$_WS_ROWS_PK" PRIMARY KEY ("ID") ENABLE
   ) ;CREATE TABLE  "APEX$_WS_FILES" 
   (    "ID" NUMBER, 
    "WS_APP_ID" NUMBER NOT NULL ENABLE, 
    "DATA_GRID_ID" NUMBER, 
    "ROW_ID" NUMBER, 
    "WEBPAGE_ID" NUMBER, 
    "COMPONENT_LEVEL" VARCHAR2(30), 
    "NAME" VARCHAR2(255) NOT NULL ENABLE, 
    "IMAGE_ALIAS" VARCHAR2(255), 
    "IMAGE_ATTRIBUTES" VARCHAR2(255), 
    "CONTENT" BLOB, 
    "CONTENT_LAST_UPDATE" DATE, 
    "MIME_TYPE" VARCHAR2(255) NOT NULL ENABLE, 
    "CONTENT_CHARSET" VARCHAR2(255), 
    "CONTENT_FILENAME" VARCHAR2(500), 
    "DESCRIPTION" VARCHAR2(4000), 
    "CREATED_ON" DATE NOT NULL ENABLE, 
    "CREATED_BY" VARCHAR2(255) NOT NULL ENABLE, 
    "UPDATED_ON" DATE, 
    "UPDATED_BY" VARCHAR2(255), 
     CONSTRAINT "APEX$_WS_FILES_CL_CK" CHECK (component_level in ('WEBSHEET','ROW','WORKSPACE','WEBPAGE')) ENABLE, 
     CONSTRAINT "APEX$_WS_FILES_PK" PRIMARY KEY ("ID") ENABLE
   ) ;CREATE TABLE  "APEX$_WS_HISTORY" 
   (    "ROW_ID" NUMBER NOT NULL ENABLE, 
    "WS_APP_ID" NUMBER NOT NULL ENABLE, 
    "DATA_GRID_ID" NUMBER NOT NULL ENABLE, 
    "COLUMN_NAME" VARCHAR2(255), 
    "OLD_VALUE" VARCHAR2(4000), 
    "NEW_VALUE" VARCHAR2(4000), 
    "APPLICATION_USER_ID" VARCHAR2(255), 
    "CHANGE_DATE" DATE
   ) ;CREATE TABLE  "APEX$_WS_LINKS" 
   (    "ID" NUMBER, 
    "WS_APP_ID" NUMBER NOT NULL ENABLE, 
    "DATA_GRID_ID" NUMBER, 
    "ROW_ID" NUMBER, 
    "WEBPAGE_ID" NUMBER, 
    "COMPONENT_LEVEL" VARCHAR2(30), 
    "TAGS" VARCHAR2(4000), 
    "SHOW_ON_HOMEPAGE" VARCHAR2(1), 
    "LINK_NAME" VARCHAR2(255) NOT NULL ENABLE, 
    "URL" VARCHAR2(4000) NOT NULL ENABLE, 
    "LINK_DESCRIPTION" VARCHAR2(4000), 
    "DISPLAY_SEQUENCE" NUMBER, 
    "CREATED_ON" DATE NOT NULL ENABLE, 
    "CREATED_BY" VARCHAR2(255) NOT NULL ENABLE, 
    "UPDATED_ON" DATE, 
    "UPDATED_BY" VARCHAR2(255), 
     CONSTRAINT "APEX$_WS_LINKS_CL_CK" CHECK (component_level in ('WEBSHEET','ROW','WORKSPACE','WEBPAGE')) ENABLE, 
     CONSTRAINT "APEX$_WS_LINKS_SH_CK" CHECK (show_on_homepage in ('Y','N')) ENABLE, 
     CONSTRAINT "APEX$_WS_LINKS_PK" PRIMARY KEY ("ID") ENABLE
   ) ;CREATE TABLE  "APEX$_WS_NOTES" 
   (    "ID" NUMBER, 
    "WS_APP_ID" NUMBER NOT NULL ENABLE, 
    "DATA_GRID_ID" NUMBER, 
    "ROW_ID" NUMBER, 
    "WEBPAGE_ID" NUMBER, 
    "COMPONENT_LEVEL" VARCHAR2(30), 
    "CONTENT" CLOB, 
    "CREATED_ON" DATE NOT NULL ENABLE, 
    "CREATED_BY" VARCHAR2(255) NOT NULL ENABLE, 
    "UPDATED_ON" DATE, 
    "UPDATED_BY" VARCHAR2(255), 
     CONSTRAINT "APEX$_WS_NOTES_CL_CK" CHECK (component_level in ('WEBSHEET','ROW','WORKSPACE','WEBPAGE')) ENABLE, 
     CONSTRAINT "APEX$_WS_NOTES_PK" PRIMARY KEY ("ID") ENABLE
   ) ;CREATE TABLE  "APEX$_WS_TAGS" 
   (    "ID" NUMBER, 
    "WS_APP_ID" NUMBER NOT NULL ENABLE, 
    "DATA_GRID_ID" NUMBER, 
    "ROW_ID" NUMBER, 
    "WEBPAGE_ID" NUMBER, 
    "COMPONENT_LEVEL" VARCHAR2(30), 
    "TAG" VARCHAR2(4000), 
    "CREATED_ON" DATE NOT NULL ENABLE, 
    "CREATED_BY" VARCHAR2(255) NOT NULL ENABLE, 
    "UPDATED_ON" DATE, 
    "UPDATED_BY" VARCHAR2(255), 
     CONSTRAINT "APEX$_WS_TAGS_CL_CK" CHECK (component_level in ('WEBSHEET','ROW','WORKSPACE','WEBPAGE')) ENABLE, 
     CONSTRAINT "APEX$_WS_TAGS_PK" PRIMARY KEY ("ID") ENABLE
   ) ;CREATE TABLE  "APEX$_WS_WEBPG_SECTIONS" 
   (    "ID" NUMBER NOT NULL ENABLE, 
    "WS_APP_ID" NUMBER NOT NULL ENABLE, 
    "WEBPAGE_ID" NUMBER, 
    "DISPLAY_SEQUENCE" NUMBER, 
    "SECTION_TYPE" VARCHAR2(30) NOT NULL ENABLE, 
    "TITLE" VARCHAR2(4000), 
    "CONTENT" CLOB, 
    "CONTENT_UPPER" CLOB, 
    "NAV_START_WEBPAGE_ID" NUMBER, 
    "NAV_MAX_LEVEL" NUMBER, 
    "NAV_INCLUDE_LINK" VARCHAR2(1), 
    "DATA_GRID_ID" NUMBER, 
    "REPORT_ID" NUMBER, 
    "DATA_SECTION_STYLE" NUMBER, 
    "CHART_TYPE" VARCHAR2(255), 
    "CHART_3D" VARCHAR2(1), 
    "CHART_LABEL" VARCHAR2(255), 
    "LABEL_AXIS_TITLE" VARCHAR2(255), 
    "CHART_VALUE" VARCHAR2(255), 
    "VALUE_AXIS_TITLE" VARCHAR2(255), 
    "CHART_AGGREGATE" VARCHAR2(255), 
    "CHART_SORTING" VARCHAR2(255), 
    "CREATED_ON" DATE NOT NULL ENABLE, 
    "CREATED_BY" VARCHAR2(255) NOT NULL ENABLE, 
    "UPDATED_ON" DATE, 
    "UPDATED_BY" VARCHAR2(255), 
     CONSTRAINT "APEX$_WS_WEBPG_SECTION_TYPE_CK" CHECK (section_type in ('TEXT','DATA','CHART','NAV_PAGE','NAV_SECTION')) ENABLE, 
     CONSTRAINT "APEX$_WS_WEBPG_SECTION_LINK_CK" CHECK (nav_include_link in ('Y','N')) ENABLE, 
     CONSTRAINT "APEX$_WS_WEBPG_SECTION_3D_CK" CHECK (chart_3d in ('Y','N')) ENABLE, 
     CONSTRAINT "APEX$_WS_WEBPG_SECTIONS_PK" PRIMARY KEY ("ID") ENABLE
   ) ;CREATE TABLE  "APEX$_WS_WEBPG_SECTION_HISTORY" 
   (    "SECTION_ID" NUMBER NOT NULL ENABLE, 
    "WS_APP_ID" NUMBER NOT NULL ENABLE, 
    "WEBPAGE_ID" NUMBER NOT NULL ENABLE, 
    "OLD_DISPLAY_SEQUENCE" NUMBER, 
    "NEW_DISPLAY_SEQUENCE" NUMBER, 
    "OLD_TITLE" VARCHAR2(4000), 
    "NEW_TITLE" VARCHAR2(4000), 
    "OLD_CONTENT" CLOB, 
    "NEW_CONTENT" CLOB, 
    "APPLICATION_USER_ID" VARCHAR2(255) NOT NULL ENABLE, 
    "CHANGE_DATE" DATE NOT NULL ENABLE
   ) ;CREATE TABLE  "CRIMINALDETAILS" 
   (    "CRIMINALID" NUMBER, 
    "NAME" VARCHAR2(20), 
    "TYPE" VARCHAR2(20), 
    "CRIMEDETAIL" VARCHAR2(50), 
    "BLOODGROUP" VARCHAR2(3), 
    "DNA" VARCHAR2(20), 
    "HEALTHCONDITION" VARCHAR2(10), 
    "PUNISHMENT" VARCHAR2(20), 
    "CRIMEDATE" DATE, 
     PRIMARY KEY ("CRIMINALID") ENABLE
   ) ;CREATE TABLE  "CRIMINALLOCATION" 
   (    "CELLNO" NUMBER, 
    "JAILNAME" VARCHAR2(20), 
    "CRIMINALID" NUMBER, 
     PRIMARY KEY ("CELLNO") ENABLE
   ) ;CREATE TABLE  "CRIMINALMEETINGS" 
   (    "SRNO" NUMBER, 
    "OUTSIDERNAME" VARCHAR2(20), 
    "CRIMINALID" NUMBER, 
    "MEETDATE" DATE, 
     PRIMARY KEY ("SRNO") ENABLE
   ) ;CREATE TABLE  "DEMO_CUSTOMERS" 
   (    "CUSTOMER_ID" NUMBER NOT NULL ENABLE, 
    "CUST_FIRST_NAME" VARCHAR2(20) NOT NULL ENABLE, 
    "CUST_LAST_NAME" VARCHAR2(20) NOT NULL ENABLE, 
    "CUST_STREET_ADDRESS1" VARCHAR2(60), 
    "CUST_STREET_ADDRESS2" VARCHAR2(60), 
    "CUST_CITY" VARCHAR2(30), 
    "CUST_STATE" VARCHAR2(2), 
    "CUST_POSTAL_CODE" VARCHAR2(10), 
    "PHONE_NUMBER1" VARCHAR2(25), 
    "PHONE_NUMBER2" VARCHAR2(25), 
    "CREDIT_LIMIT" NUMBER(9,2), 
    "CUST_EMAIL" VARCHAR2(30), 
     CONSTRAINT "DEMO_CUST_CREDIT_LIMIT_MAX" CHECK (credit_limit <= 5000) ENABLE, 
     CONSTRAINT "DEMO_CUSTOMERS_PK" PRIMARY KEY ("CUSTOMER_ID") ENABLE
   ) ;CREATE TABLE  "DEMO_USERS" 
   (    "USER_ID" NUMBER, 
    "USER_NAME" VARCHAR2(100), 
    "PASSWORD" VARCHAR2(4000), 
    "CREATED_ON" DATE, 
    "QUOTA" NUMBER, 
    "PRODUCTS" CHAR(1), 
    "EXPIRES_ON" DATE, 
    "ADMIN_USER" CHAR(1), 
     CONSTRAINT "DEMO_USERS_PK" PRIMARY KEY ("USER_ID") ENABLE
   ) ;CREATE TABLE  "DEMO_ORDERS" 
   (    "ORDER_ID" NUMBER NOT NULL ENABLE, 
    "CUSTOMER_ID" NUMBER NOT NULL ENABLE, 
    "ORDER_TOTAL" NUMBER(8,2), 
    "ORDER_TIMESTAMP" DATE, 
    "USER_ID" NUMBER, 
     CONSTRAINT "DEMO_ORDER_TOTAL_MIN" CHECK (order_total >= 0) ENABLE, 
     CONSTRAINT "DEMO_ORDER_PK" PRIMARY KEY ("ORDER_ID") ENABLE
   ) ;CREATE TABLE  "DEMO_PRODUCT_INFO" 
   (    "PRODUCT_ID" NUMBER NOT NULL ENABLE, 
    "PRODUCT_NAME" VARCHAR2(50), 
    "PRODUCT_DESCRIPTION" VARCHAR2(2000), 
    "CATEGORY" VARCHAR2(30), 
    "PRODUCT_AVAIL" VARCHAR2(1), 
    "LIST_PRICE" NUMBER(8,2), 
    "PRODUCT_IMAGE" BLOB, 
    "MIMETYPE" VARCHAR2(255), 
    "FILENAME" VARCHAR2(400), 
    "IMAGE_LAST_UPDATE" DATE, 
     CONSTRAINT "DEMO_PRODUCT_INFO_PK" PRIMARY KEY ("PRODUCT_ID") ENABLE
   ) ;CREATE TABLE  "DEMO_ORDER_ITEMS" 
   (    "ORDER_ITEM_ID" NUMBER(3,0) NOT NULL ENABLE, 
    "ORDER_ID" NUMBER NOT NULL ENABLE, 
    "PRODUCT_ID" NUMBER NOT NULL ENABLE, 
    "UNIT_PRICE" NUMBER(8,2) NOT NULL ENABLE, 
    "QUANTITY" NUMBER(8,0) NOT NULL ENABLE, 
     CONSTRAINT "DEMO_ORDER_ITEMS_PK" PRIMARY KEY ("ORDER_ITEM_ID") ENABLE
   ) ;CREATE TABLE  "DEMO_STATES" 
   (    "ST" VARCHAR2(30), 
    "STATE_NAME" VARCHAR2(30)
   ) ;CREATE TABLE  "DEPT" 
   (    "DEPTNO" NUMBER(2,0), 
    "DNAME" VARCHAR2(14), 
    "LOC" VARCHAR2(13), 
     PRIMARY KEY ("DEPTNO") ENABLE
   ) ;CREATE TABLE  "EMP" 
   (    "EMPNO" NUMBER(4,0) NOT NULL ENABLE, 
    "ENAME" VARCHAR2(10), 
    "JOB" VARCHAR2(9), 
    "MGR" NUMBER(4,0), 
    "HIREDATE" DATE, 
    "SAL" NUMBER(7,2), 
    "COMM" NUMBER(7,2), 
    "DEPTNO" NUMBER(2,0), 
     PRIMARY KEY ("EMPNO") ENABLE
   ) ;ALTER TABLE  "APEX$_WS_FILES" ADD CONSTRAINT "APEX$_WS_FILES_FK" FOREIGN KEY ("ROW_ID")
      REFERENCES  "APEX$_WS_ROWS" ("ID") ON DELETE CASCADE ENABLE;ALTER TABLE  "APEX$_WS_LINKS" ADD CONSTRAINT "APEX$_WS_LINKS_FK" FOREIGN KEY ("ROW_ID")
      REFERENCES  "APEX$_WS_ROWS" ("ID") ON DELETE CASCADE ENABLE;ALTER TABLE  "APEX$_WS_NOTES" ADD CONSTRAINT "APEX$_WS_NOTES_FK" FOREIGN KEY ("ROW_ID")
      REFERENCES  "APEX$_WS_ROWS" ("ID") ON DELETE CASCADE ENABLE;ALTER TABLE  "APEX$_WS_TAGS" ADD CONSTRAINT "APEX$_WS_TAGS_FK" FOREIGN KEY ("ROW_ID")
      REFERENCES  "APEX$_WS_ROWS" ("ID") ON DELETE CASCADE ENABLE;ALTER TABLE  "DEMO_ORDERS" ADD CONSTRAINT "DEMO_ORDERS_CUSTOMER_ID_FK" FOREIGN KEY ("CUSTOMER_ID")
      REFERENCES  "DEMO_CUSTOMERS" ("CUSTOMER_ID") ENABLE;ALTER TABLE  "DEMO_ORDERS" ADD CONSTRAINT "DEMO_ORDERS_USER_ID_FK" FOREIGN KEY ("USER_ID")
      REFERENCES  "DEMO_USERS" ("USER_ID") ENABLE;ALTER TABLE  "DEMO_ORDER_ITEMS" ADD CONSTRAINT "DEMO_ORDER_ITEMS_FK" FOREIGN KEY ("ORDER_ID")
      REFERENCES  "DEMO_ORDERS" ("ORDER_ID") ON DELETE CASCADE ENABLE;ALTER TABLE  "DEMO_ORDER_ITEMS" ADD CONSTRAINT "DEMO_ORDER_ITEMS_PRODUCT_ID_FK" FOREIGN KEY ("PRODUCT_ID")
      REFERENCES  "DEMO_PRODUCT_INFO" ("PRODUCT_ID") ON DELETE CASCADE ENABLE;ALTER TABLE  "EMP" ADD FOREIGN KEY ("MGR")
      REFERENCES  "EMP" ("EMPNO") ENABLE;ALTER TABLE  "EMP" ADD FOREIGN KEY ("DEPTNO")
      REFERENCES  "DEPT" ("DEPTNO") ENABLE;ALTER TABLE  "CRIMINALLOCATION" ADD FOREIGN KEY ("CRIMINALID")
      REFERENCES  "CRIMINALDETAILS" ("CRIMINALID") ENABLE;ALTER TABLE  "CRIMINALMEETINGS" ADD FOREIGN KEY ("CRIMINALID")
      REFERENCES  "CRIMINALDETAILS" ("CRIMINALID") ENABLE;