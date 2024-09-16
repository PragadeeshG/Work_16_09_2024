create table if not exists managed_data_integrations(
source_system Integer not null,
data_catalogue varchar(255) null,
data_cleansing varchar(255) null,
connectors varchar(255) null,
data_ingestion varchar(255) null,
governance varchar(255) null,
migration varchar(255) null,
extaction varchar(255) null,
transformation varchar(255) null,
load1 varchar(255) null,
master_data_management varchar(255) null,
reference_data_management varchar(255) null,
middleware_data varchar(255) null,
common_data_storage varchar(255) null,
constraint managed_data_integrations_pk primary key(source_system));