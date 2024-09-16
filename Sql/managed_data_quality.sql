create table if not exists managed_data_quality(
number_of_dimensions varchar(255) not null,
completeness varchar(255) null,
uniqueness varchar(255) null,
validity varchar(255) null,
timeliness varchar(255) null,
accuracy varchar(255) null,
consistency varchar(255) null,
fitness_for_purpose varchar(255) null,
better_business_decisions varchar(255) null,
other_options varchar(255) null,
constraint managed_data_quality_pk primary key(number_of_dimensions));