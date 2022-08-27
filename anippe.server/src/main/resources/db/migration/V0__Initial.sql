DROP TABLE IF EXISTS public.countries;
DROP TABLE IF EXISTS public.organisations;
DROP TABLE IF EXISTS public.organisation_settings;
DROP TABLE IF EXISTS public.customers;
DROP TABLE IF EXISTS public.activity_log;
DROP TABLE IF EXISTS public.users;
DROP TABLE IF EXISTS public.tickets;
DROP TABLE IF EXISTS public.projects;
DROP TABLE IF EXISTS public.roles;
DROP TABLE IF EXISTS public.leads;
DROP TABLE IF EXISTS public.lead_sources;
DROP TABLE IF EXISTS public.lead_statuses;


CREATE TABLE IF NOT EXISTS public.countries
(
    id bigserial primary key,
    code character varying ,
    name character varying,
    created_at timestamp without time zone,
    deleted_at timestamp without time zone,
    currency_symbol character varying,
    currency_name character varying,
    languages character varying,
    country_code character varying ,
    phone smallint,
    capital character varying ,
    currency_code character varying ,
    continent character varying,
    continent_code character varying,
    alpha_3 character varying
);


INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (2, 'SLO', 'Slovenija', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (3, 'AF', 'Afghanistan', NULL, NULL, '؋', NULL, NULL, NULL, 93, 'Kabul', 'AFN', 'Asia', 'AS', 'AFG');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (4, 'AX', 'Aland Islands', NULL, NULL, '€', NULL, NULL, NULL, 358, 'Mariehamn', 'EUR', 'Europe', 'EU', 'ALA');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (5, 'AL', 'Albania', NULL, NULL, 'Lek', NULL, NULL, NULL, 355, 'Tirana', 'ALL', 'Europe', 'EU', 'ALB');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (6, 'DZ', 'Algeria', NULL, NULL, 'دج', NULL, NULL, NULL, 213, 'Algiers', 'DZD', 'Africa', 'AF', 'DZA');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (7, 'AS', 'American Samoa', NULL, NULL, '$', NULL, NULL, NULL, 1684, 'Pago Pago', 'USD', 'Oceania', 'OC', 'ASM');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (8, 'AD', 'Andorra', NULL, NULL, '€', NULL, NULL, NULL, 376, 'Andorra la Vella', 'EUR', 'Europe', 'EU', 'AND');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (9, 'AO', 'Angola', NULL, NULL, 'Kz', NULL, NULL, NULL, 244, 'Luanda', 'AOA', 'Africa', 'AF', 'AGO');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (10, 'AI', 'Anguilla', NULL, NULL, '$', NULL, NULL, NULL, 1264, 'The Valley', 'XCD', 'North America', 'NA', 'AIA');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (11, 'AQ', 'Antarctica', NULL, NULL, '$', NULL, NULL, NULL, 672, 'Antarctica', 'AAD', 'Antarctica', 'AN', 'ATA');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (12, 'AG', 'Antigua and Barbuda', NULL, NULL, '$', NULL, NULL, NULL, 1268, 'St. John\s', 'XCD', 'North America', 'NA', 'ATG');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (13, 'AR', 'Argentina', NULL, NULL, '$', NULL, NULL, NULL, 54, 'Buenos Aires', 'ARS', 'South America', 'SA', 'ARG');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (14, 'AM', 'Armenia', NULL, NULL, '֏', NULL, NULL, NULL, 374, 'Yerevan', 'AMD', 'Asia', 'AS', 'ARM');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (15, 'AW', 'Aruba', NULL, NULL, 'ƒ', NULL, NULL, NULL, 297, 'Oranjestad', 'AWG', 'North America', 'NA', 'ABW');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (16, 'AU', 'Australia', NULL, NULL, '$', NULL, NULL, NULL, 61, 'Canberra', 'AUD', 'Oceania', 'OC', 'AUS');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (17, 'AT', 'Austria', NULL, NULL, '€', NULL, NULL, NULL, 43, 'Vienna', 'EUR', 'Europe', 'EU', 'AUT');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (18, 'AZ', 'Azerbaijan', NULL, NULL, 'm', NULL, NULL, NULL, 994, 'Baku', 'AZN', 'Asia', 'AS', 'AZE');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (19, 'BS', 'Bahamas', NULL, NULL, 'B$', NULL, NULL, NULL, 1242, 'Nassau', 'BSD', 'North America', 'NA', 'BHS');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (20, 'BH', 'Bahrain', NULL, NULL, '.د.ب', NULL, NULL, NULL, 973, 'Manama', 'BHD', 'Asia', 'AS', 'BHR');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (21, 'BD', 'Bangladesh', NULL, NULL, '৳', NULL, NULL, NULL, 880, 'Dhaka', 'BDT', 'Asia', 'AS', 'BGD');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (22, 'BB', 'Barbados', NULL, NULL, 'Bds$', NULL, NULL, NULL, 1246, 'Bridgetown', 'BBD', 'North America', 'NA', 'BRB');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (23, 'BY', 'Belarus', NULL, NULL, 'Br', NULL, NULL, NULL, 375, 'Minsk', 'BYN', 'Europe', 'EU', 'BLR');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (24, 'BE', 'Belgium', NULL, NULL, '€', NULL, NULL, NULL, 32, 'Brussels', 'EUR', 'Europe', 'EU', 'BEL');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (25, 'BZ', 'Belize', NULL, NULL, '$', NULL, NULL, NULL, 501, 'Belmopan', 'BZD', 'North America', 'NA', 'BLZ');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (26, 'BJ', 'Benin', NULL, NULL, 'CFA', NULL, NULL, NULL, 229, 'Porto-Novo', 'XOF', 'Africa', 'AF', 'BEN');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (27, 'BM', 'Bermuda', NULL, NULL, '$', NULL, NULL, NULL, 1441, 'Hamilton', 'BMD', 'North America', 'NA', 'BMU');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (28, 'BT', 'Bhutan', NULL, NULL, 'Nu.', NULL, NULL, NULL, 975, 'Thimphu', 'BTN', 'Asia', 'AS', 'BTN');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (29, 'BO', 'Bolivia', NULL, NULL, 'Bs.', NULL, NULL, NULL, 591, 'Sucre', 'BOB', 'South America', 'SA', 'BOL');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (30, 'BQ', 'Bonaire, Sint Eustatius and Saba', NULL, NULL, '$', NULL, NULL, NULL, 599, 'Kralendijk', 'USD', 'North America', 'NA', 'BES');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (31, 'BA', 'Bosnia and Herzegovina', NULL, NULL, 'KM', NULL, NULL, NULL, 387, 'Sarajevo', 'BAM', 'Europe', 'EU', 'BIH');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (32, 'BW', 'Botswana', NULL, NULL, 'P', NULL, NULL, NULL, 267, 'Gaborone', 'BWP', 'Africa', 'AF', 'BWA');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (33, 'BV', 'Bouvet Island', NULL, NULL, 'kr', NULL, NULL, NULL, 55, '', 'NOK', 'Antarctica', 'AN', 'BVT');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (34, 'BR', 'Brazil', NULL, NULL, 'R$', NULL, NULL, NULL, 55, 'Brasilia', 'BRL', 'South America', 'SA', 'BRA');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (35, 'IO', 'British Indian Ocean Territory', NULL, NULL, '$', NULL, NULL, NULL, 246, 'Diego Garcia', 'USD', 'Asia', 'AS', 'IOT');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (36, 'BN', 'Brunei Darussalam', NULL, NULL, 'B$', NULL, NULL, NULL, 673, 'Bandar Seri Begawan', 'BND', 'Asia', 'AS', 'BRN');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (37, 'BG', 'Bulgaria', NULL, NULL, 'Лв.', NULL, NULL, NULL, 359, 'Sofia', 'BGN', 'Europe', 'EU', 'BGR');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (38, 'BF', 'Burkina Faso', NULL, NULL, 'CFA', NULL, NULL, NULL, 226, 'Ouagadougou', 'XOF', 'Africa', 'AF', 'BFA');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (39, 'BI', 'Burundi', NULL, NULL, 'FBu', NULL, NULL, NULL, 257, 'Bujumbura', 'BIF', 'Africa', 'AF', 'BDI');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (40, 'KH', 'Cambodia', NULL, NULL, 'KHR', NULL, NULL, NULL, 855, 'Phnom Penh', 'KHR', 'Asia', 'AS', 'KHM');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (41, 'CM', 'Cameroon', NULL, NULL, 'FCFA', NULL, NULL, NULL, 237, 'Yaounde', 'XAF', 'Africa', 'AF', 'CMR');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (42, 'CA', 'Canada', NULL, NULL, '$', NULL, NULL, NULL, 1, 'Ottawa', 'CAD', 'North America', 'NA', 'CAN');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (43, 'CV', 'Cape Verde', NULL, NULL, '$', NULL, NULL, NULL, 238, 'Praia', 'CVE', 'Africa', 'AF', 'CPV');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (44, 'KY', 'Cayman Islands', NULL, NULL, '$', NULL, NULL, NULL, 1345, 'George Town', 'KYD', 'North America', 'NA', 'CYM');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (45, 'CF', 'Central African Republic', NULL, NULL, 'FCFA', NULL, NULL, NULL, 236, 'Bangui', 'XAF', 'Africa', 'AF', 'CAF');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (46, 'TD', 'Chad', NULL, NULL, 'FCFA', NULL, NULL, NULL, 235, 'NDjamena', 'XAF', 'Africa', 'AF', 'TCD');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (47, 'CL', 'Chile', NULL, NULL, '$', NULL, NULL, NULL, 56, 'Santiago', 'CLP', 'South America', 'SA', 'CHL');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (48, 'CN', 'China', NULL, NULL, '¥', NULL, NULL, NULL, 86, 'Beijing', 'CNY', 'Asia', 'AS', 'CHN');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (49, 'CX', 'Christmas Island', NULL, NULL, '$', NULL, NULL, NULL, 61, 'Flying Fish Cove', 'AUD', 'Asia', 'AS', 'CXR');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (50, 'CC', 'Cocos (Keeling) Islands', NULL, NULL, '$', NULL, NULL, NULL, 672, 'West Island', 'AUD', 'Asia', 'AS', 'CCK');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (51, 'CO', 'Colombia', NULL, NULL, '$', NULL, NULL, NULL, 57, 'Bogota', 'COP', 'South America', 'SA', 'COL');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (52, 'KM', 'Comoros', NULL, NULL, 'CF', NULL, NULL, NULL, 269, 'Moroni', 'KMF', 'Africa', 'AF', 'COM');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (53, 'CG', 'Congo', NULL, NULL, 'FC', NULL, NULL, NULL, 242, 'Brazzaville', 'XAF', 'Africa', 'AF', 'COG');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (54, 'CD', 'Congo, Democratic Republic of the Congo', NULL, NULL, 'FC', NULL, NULL, NULL, 242, 'Kinshasa', 'CDF', 'Africa', 'AF', 'COD');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (55, 'CK', 'Cook Islands', NULL, NULL, '$', NULL, NULL, NULL, 682, 'Avarua', 'NZD', 'Oceania', 'OC', 'COK');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (56, 'CR', 'Costa Rica', NULL, NULL, '₡', NULL, NULL, NULL, 506, 'San Jose', 'CRC', 'North America', 'NA', 'CRI');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (57, 'CI', 'Cote DIvoire', NULL, NULL, 'CFA', NULL, NULL, NULL, 225, 'Yamoussoukro', 'XOF', 'Africa', 'AF', 'CIV');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (58, 'HR', 'Croatia', NULL, NULL, 'kn', NULL, NULL, NULL, 385, 'Zagreb', 'HRK', 'Europe', 'EU', 'HRV');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (59, 'CU', 'Cuba', NULL, NULL, '$', NULL, NULL, NULL, 53, 'Havana', 'CUP', 'North America', 'NA', 'CUB');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (60, 'CW', 'Curacao', NULL, NULL, 'ƒ', NULL, NULL, NULL, 599, 'Willemstad', 'ANG', 'North America', 'NA', 'CUW');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (61, 'CY', 'Cyprus', NULL, NULL, '€', NULL, NULL, NULL, 357, 'Nicosia', 'EUR', 'Asia', 'AS', 'CYP');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (62, 'CZ', 'Czech Republic', NULL, NULL, 'Kč', NULL, NULL, NULL, 420, 'Prague', 'CZK', 'Europe', 'EU', 'CZE');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (63, 'DK', 'Denmark', NULL, NULL, 'Kr.', NULL, NULL, NULL, 45, 'Copenhagen', 'DKK', 'Europe', 'EU', 'DNK');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (64, 'DJ', 'Djibouti', NULL, NULL, 'Fdj', NULL, NULL, NULL, 253, 'Djibouti', 'DJF', 'Africa', 'AF', 'DJI');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (65, 'DM', 'Dominica', NULL, NULL, '$', NULL, NULL, NULL, 1767, 'Roseau', 'XCD', 'North America', 'NA', 'DMA');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (66, 'DO', 'Dominican Republic', NULL, NULL, '$', NULL, NULL, NULL, 1809, 'Santo Domingo', 'DOP', 'North America', 'NA', 'DOM');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (67, 'EC', 'Ecuador', NULL, NULL, '$', NULL, NULL, NULL, 593, 'Quito', 'USD', 'South America', 'SA', 'ECU');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (68, 'EG', 'Egypt', NULL, NULL, 'ج.م', NULL, NULL, NULL, 20, 'Cairo', 'EGP', 'Africa', 'AF', 'EGY');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (69, 'SV', 'El Salvador', NULL, NULL, '$', NULL, NULL, NULL, 503, 'San Salvador', 'USD', 'North America', 'NA', 'SLV');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (70, 'GQ', 'Equatorial Guinea', NULL, NULL, 'FCFA', NULL, NULL, NULL, 240, 'Malabo', 'XAF', 'Africa', 'AF', 'GNQ');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (71, 'ER', 'Eritrea', NULL, NULL, 'Nfk', NULL, NULL, NULL, 291, 'Asmara', 'ERN', 'Africa', 'AF', 'ERI');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (72, 'EE', 'Estonia', NULL, NULL, '€', NULL, NULL, NULL, 372, 'Tallinn', 'EUR', 'Europe', 'EU', 'EST');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (73, 'ET', 'Ethiopia', NULL, NULL, 'Nkf', NULL, NULL, NULL, 251, 'Addis Ababa', 'ETB', 'Africa', 'AF', 'ETH');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (74, 'FK', 'Falkland Islands (Malvinas)', NULL, NULL, '£', NULL, NULL, NULL, 500, 'Stanley', 'FKP', 'South America', 'SA', 'FLK');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (75, 'FO', 'Faroe Islands', NULL, NULL, 'Kr.', NULL, NULL, NULL, 298, 'Torshavn', 'DKK', 'Europe', 'EU', 'FRO');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (76, 'FJ', 'Fiji', NULL, NULL, 'FJ$', NULL, NULL, NULL, 679, 'Suva', 'FJD', 'Oceania', 'OC', 'FJI');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (77, 'FI', 'Finland', NULL, NULL, '€', NULL, NULL, NULL, 358, 'Helsinki', 'EUR', 'Europe', 'EU', 'FIN');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (78, 'FR', 'France', NULL, NULL, '€', NULL, NULL, NULL, 33, 'Paris', 'EUR', 'Europe', 'EU', 'FRA');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (79, 'GF', 'French Guiana', NULL, NULL, '€', NULL, NULL, NULL, 594, 'Cayenne', 'EUR', 'South America', 'SA', 'GUF');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (80, 'PF', 'French Polynesia', NULL, NULL, '₣', NULL, NULL, NULL, 689, 'Papeete', 'XPF', 'Oceania', 'OC', 'PYF');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (81, 'TF', 'French Southern Territories', NULL, NULL, '€', NULL, NULL, NULL, 262, 'Port-aux-Francais', 'EUR', 'Antarctica', 'AN', 'ATF');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (82, 'GA', 'Gabon', NULL, NULL, 'FCFA', NULL, NULL, NULL, 241, 'Libreville', 'XAF', 'Africa', 'AF', 'GAB');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (83, 'GM', 'Gambia', NULL, NULL, 'D', NULL, NULL, NULL, 220, 'Banjul', 'GMD', 'Africa', 'AF', 'GMB');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (84, 'GE', 'Georgia', NULL, NULL, 'ლ', NULL, NULL, NULL, 995, 'Tbilisi', 'GEL', 'Asia', 'AS', 'GEO');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (85, 'DE', 'Germany', NULL, NULL, '€', NULL, NULL, NULL, 49, 'Berlin', 'EUR', 'Europe', 'EU', 'DEU');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (86, 'GH', 'Ghana', NULL, NULL, 'GH₵', NULL, NULL, NULL, 233, 'Accra', 'GHS', 'Africa', 'AF', 'GHA');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (87, 'GI', 'Gibraltar', NULL, NULL, '£', NULL, NULL, NULL, 350, 'Gibraltar', 'GIP', 'Europe', 'EU', 'GIB');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (88, 'GR', 'Greece', NULL, NULL, '€', NULL, NULL, NULL, 30, 'Athens', 'EUR', 'Europe', 'EU', 'GRC');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (89, 'GL', 'Greenland', NULL, NULL, 'Kr.', NULL, NULL, NULL, 299, 'Nuuk', 'DKK', 'North America', 'NA', 'GRL');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (90, 'GD', 'Grenada', NULL, NULL, '$', NULL, NULL, NULL, 1473, 'St. Georges', 'XCD', 'North America', 'NA', 'GRD');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (91, 'GP', 'Guadeloupe', NULL, NULL, '€', NULL, NULL, NULL, 590, 'Basse-Terre', 'EUR', 'North America', 'NA', 'GLP');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (92, 'GU', 'Guam', NULL, NULL, '$', NULL, NULL, NULL, 1671, 'Hagatna', 'USD', 'Oceania', 'OC', 'GUM');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (93, 'GT', 'Guatemala', NULL, NULL, 'Q', NULL, NULL, NULL, 502, 'Guatemala City', 'GTQ', 'North America', 'NA', 'GTM');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (94, 'GG', 'Guernsey', NULL, NULL, '£', NULL, NULL, NULL, 44, 'St Peter Port', 'GBP', 'Europe', 'EU', 'GGY');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (95, 'GN', 'Guinea', NULL, NULL, 'FG', NULL, NULL, NULL, 224, 'Conakry', 'GNF', 'Africa', 'AF', 'GIN');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (96, 'GW', 'Guinea-Bissau', NULL, NULL, 'CFA', NULL, NULL, NULL, 245, 'Bissau', 'XOF', 'Africa', 'AF', 'GNB');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (97, 'GY', 'Guyana', NULL, NULL, '$', NULL, NULL, NULL, 592, 'Georgetown', 'GYD', 'South America', 'SA', 'GUY');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (98, 'HT', 'Haiti', NULL, NULL, 'G', NULL, NULL, NULL, 509, 'Port-au-Prince', 'HTG', 'North America', 'NA', 'HTI');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (99, 'HM', 'Heard Island and Mcdonald Islands', NULL, NULL, '$', NULL, NULL, NULL, 0, '', 'AUD', 'Antarctica', 'AN', 'HMD');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (100, 'VA', 'Holy See (Vatican City State)', NULL, NULL, '€', NULL, NULL, NULL, 39, 'Vatican City', 'EUR', 'Europe', 'EU', 'VAT');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (101, 'HN', 'Honduras', NULL, NULL, 'L', NULL, NULL, NULL, 504, 'Tegucigalpa', 'HNL', 'North America', 'NA', 'HND');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (102, 'HK', 'Hong Kong', NULL, NULL, '$', NULL, NULL, NULL, 852, 'Hong Kong', 'HKD', 'Asia', 'AS', 'HKG');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (103, 'HU', 'Hungary', NULL, NULL, 'Ft', NULL, NULL, NULL, 36, 'Budapest', 'HUF', 'Europe', 'EU', 'HUN');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (104, 'IS', 'Iceland', NULL, NULL, 'kr', NULL, NULL, NULL, 354, 'Reykjavik', 'ISK', 'Europe', 'EU', 'ISL');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (105, 'IN', 'India', NULL, NULL, '₹', NULL, NULL, NULL, 91, 'New Delhi', 'INR', 'Asia', 'AS', 'IND');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (106, 'ID', 'Indonesia', NULL, NULL, 'Rp', NULL, NULL, NULL, 62, 'Jakarta', 'IDR', 'Asia', 'AS', 'IDN');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (107, 'IR', 'Iran, Islamic Republic of', NULL, NULL, '﷼', NULL, NULL, NULL, 98, 'Tehran', 'IRR', 'Asia', 'AS', 'IRN');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (108, 'IQ', 'Iraq', NULL, NULL, 'د.ع', NULL, NULL, NULL, 964, 'Baghdad', 'IQD', 'Asia', 'AS', 'IRQ');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (109, 'IE', 'Ireland', NULL, NULL, '€', NULL, NULL, NULL, 353, 'Dublin', 'EUR', 'Europe', 'EU', 'IRL');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (110, 'IM', 'Isle of Man', NULL, NULL, '£', NULL, NULL, NULL, 44, 'Douglas, Isle of Man', 'GBP', 'Europe', 'EU', 'IMN');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (111, 'IL', 'Israel', NULL, NULL, '₪', NULL, NULL, NULL, 972, 'Jerusalem', 'ILS', 'Asia', 'AS', 'ISR');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (112, 'IT', 'Italy', NULL, NULL, '€', NULL, NULL, NULL, 39, 'Rome', 'EUR', 'Europe', 'EU', 'ITA');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (113, 'JM', 'Jamaica', NULL, NULL, 'J$', NULL, NULL, NULL, 1876, 'Kingston', 'JMD', 'North America', 'NA', 'JAM');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (114, 'JP', 'Japan', NULL, NULL, '¥', NULL, NULL, NULL, 81, 'Tokyo', 'JPY', 'Asia', 'AS', 'JPN');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (115, 'JE', 'Jersey', NULL, NULL, '£', NULL, NULL, NULL, 44, 'Saint Helier', 'GBP', 'Europe', 'EU', 'JEY');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (116, 'JO', 'Jordan', NULL, NULL, 'ا.د', NULL, NULL, NULL, 962, 'Amman', 'JOD', 'Asia', 'AS', 'JOR');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (117, 'KZ', 'Kazakhstan', NULL, NULL, 'лв', NULL, NULL, NULL, 7, 'Astana', 'KZT', 'Asia', 'AS', 'KAZ');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (118, 'KE', 'Kenya', NULL, NULL, 'KSh', NULL, NULL, NULL, 254, 'Nairobi', 'KES', 'Africa', 'AF', 'KEN');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (119, 'KI', 'Kiribati', NULL, NULL, '$', NULL, NULL, NULL, 686, 'Tarawa', 'AUD', 'Oceania', 'OC', 'KIR');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (120, 'KP', 'Korea, Democratic Peoples Republic of', NULL, NULL, '₩', NULL, NULL, NULL, 850, 'Pyongyang', 'KPW', 'Asia', 'AS', 'PRK');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (121, 'KR', 'Korea, Republic of', NULL, NULL, '₩', NULL, NULL, NULL, 82, 'Seoul', 'KRW', 'Asia', 'AS', 'KOR');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (122, 'XK', 'Kosovo', NULL, NULL, '€', NULL, NULL, NULL, 381, 'Pristina', 'EUR', 'Europe', 'EU', 'XKX');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (123, 'KW', 'Kuwait', NULL, NULL, 'ك.د', NULL, NULL, NULL, 965, 'Kuwait City', 'KWD', 'Asia', 'AS', 'KWT');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (124, 'KG', 'Kyrgyzstan', NULL, NULL, 'лв', NULL, NULL, NULL, 996, 'Bishkek', 'KGS', 'Asia', 'AS', 'KGZ');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (125, 'LA', 'Lao Peoples Democratic Republic', NULL, NULL, '₭', NULL, NULL, NULL, 856, 'Vientiane', 'LAK', 'Asia', 'AS', 'LAO');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (126, 'LV', 'Latvia', NULL, NULL, '€', NULL, NULL, NULL, 371, 'Riga', 'EUR', 'Europe', 'EU', 'LVA');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (127, 'LB', 'Lebanon', NULL, NULL, '£', NULL, NULL, NULL, 961, 'Beirut', 'LBP', 'Asia', 'AS', 'LBN');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (128, 'LS', 'Lesotho', NULL, NULL, 'L', NULL, NULL, NULL, 266, 'Maseru', 'LSL', 'Africa', 'AF', 'LSO');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (129, 'LR', 'Liberia', NULL, NULL, '$', NULL, NULL, NULL, 231, 'Monrovia', 'LRD', 'Africa', 'AF', 'LBR');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (130, 'LY', 'Libyan Arab Jamahiriya', NULL, NULL, 'د.ل', NULL, NULL, NULL, 218, 'Tripolis', 'LYD', 'Africa', 'AF', 'LBY');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (131, 'LI', 'Liechtenstein', NULL, NULL, 'CHf', NULL, NULL, NULL, 423, 'Vaduz', 'CHF', 'Europe', 'EU', 'LIE');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (132, 'LT', 'Lithuania', NULL, NULL, '€', NULL, NULL, NULL, 370, 'Vilnius', 'EUR', 'Europe', 'EU', 'LTU');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (133, 'LU', 'Luxembourg', NULL, NULL, '€', NULL, NULL, NULL, 352, 'Luxembourg', 'EUR', 'Europe', 'EU', 'LUX');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (134, 'MO', 'Macao', NULL, NULL, '$', NULL, NULL, NULL, 853, 'Macao', 'MOP', 'Asia', 'AS', 'MAC');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (135, 'MK', 'Macedonia, the Former Yugoslav Republic of', NULL, NULL, 'ден', NULL, NULL, NULL, 389, 'Skopje', 'MKD', 'Europe', 'EU', 'MKD');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (136, 'MG', 'Madagascar', NULL, NULL, 'Ar', NULL, NULL, NULL, 261, 'Antananarivo', 'MGA', 'Africa', 'AF', 'MDG');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (137, 'MW', 'Malawi', NULL, NULL, 'MK', NULL, NULL, NULL, 265, 'Lilongwe', 'MWK', 'Africa', 'AF', 'MWI');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (138, 'MY', 'Malaysia', NULL, NULL, 'RM', NULL, NULL, NULL, 60, 'Kuala Lumpur', 'MYR', 'Asia', 'AS', 'MYS');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (139, 'MV', 'Maldives', NULL, NULL, 'Rf', NULL, NULL, NULL, 960, 'Male', 'MVR', 'Asia', 'AS', 'MDV');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (140, 'ML', 'Mali', NULL, NULL, 'CFA', NULL, NULL, NULL, 223, 'Bamako', 'XOF', 'Africa', 'AF', 'MLI');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (141, 'MT', 'Malta', NULL, NULL, '€', NULL, NULL, NULL, 356, 'Valletta', 'EUR', 'Europe', 'EU', 'MLT');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (142, 'MH', 'Marshall Islands', NULL, NULL, '$', NULL, NULL, NULL, 692, 'Majuro', 'USD', 'Oceania', 'OC', 'MHL');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (143, 'MQ', 'Martinique', NULL, NULL, '€', NULL, NULL, NULL, 596, 'Fort-de-France', 'EUR', 'North America', 'NA', 'MTQ');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (144, 'MR', 'Mauritania', NULL, NULL, 'MRU', NULL, NULL, NULL, 222, 'Nouakchott', 'MRO', 'Africa', 'AF', 'MRT');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (145, 'MU', 'Mauritius', NULL, NULL, '₨', NULL, NULL, NULL, 230, 'Port Louis', 'MUR', 'Africa', 'AF', 'MUS');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (146, 'YT', 'Mayotte', NULL, NULL, '€', NULL, NULL, NULL, 269, 'Mamoudzou', 'EUR', 'Africa', 'AF', 'MYT');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (147, 'MX', 'Mexico', NULL, NULL, '$', NULL, NULL, NULL, 52, 'Mexico City', 'MXN', 'North America', 'NA', 'MEX');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (148, 'FM', 'Micronesia, Federated States of', NULL, NULL, '$', NULL, NULL, NULL, 691, 'Palikir', 'USD', 'Oceania', 'OC', 'FSM');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (149, 'MD', 'Moldova, Republic of', NULL, NULL, 'L', NULL, NULL, NULL, 373, 'Chisinau', 'MDL', 'Europe', 'EU', 'MDA');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (150, 'MC', 'Monaco', NULL, NULL, '€', NULL, NULL, NULL, 377, 'Monaco', 'EUR', 'Europe', 'EU', 'MCO');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (151, 'MN', 'Mongolia', NULL, NULL, '₮', NULL, NULL, NULL, 976, 'Ulan Bator', 'MNT', 'Asia', 'AS', 'MNG');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (152, 'ME', 'Montenegro', NULL, NULL, '€', NULL, NULL, NULL, 382, 'Podgorica', 'EUR', 'Europe', 'EU', 'MNE');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (153, 'MS', 'Montserrat', NULL, NULL, '$', NULL, NULL, NULL, 1664, 'Plymouth', 'XCD', 'North America', 'NA', 'MSR');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (154, 'MA', 'Morocco', NULL, NULL, 'DH', NULL, NULL, NULL, 212, 'Rabat', 'MAD', 'Africa', 'AF', 'MAR');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (155, 'MZ', 'Mozambique', NULL, NULL, 'MT', NULL, NULL, NULL, 258, 'Maputo', 'MZN', 'Africa', 'AF', 'MOZ');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (156, 'MM', 'Myanmar', NULL, NULL, 'K', NULL, NULL, NULL, 95, 'Nay Pyi Taw', 'MMK', 'Asia', 'AS', 'MMR');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (157, 'NA', 'Namibia', NULL, NULL, '$', NULL, NULL, NULL, 264, 'Windhoek', 'NAD', 'Africa', 'AF', 'NAM');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (158, 'NR', 'Nauru', NULL, NULL, '$', NULL, NULL, NULL, 674, 'Yaren', 'AUD', 'Oceania', 'OC', 'NRU');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (159, 'NP', 'Nepal', NULL, NULL, '₨', NULL, NULL, NULL, 977, 'Kathmandu', 'NPR', 'Asia', 'AS', 'NPL');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (160, 'NL', 'Netherlands', NULL, NULL, '€', NULL, NULL, NULL, 31, 'Amsterdam', 'EUR', 'Europe', 'EU', 'NLD');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (161, 'AN', 'Netherlands Antilles', NULL, NULL, 'NAf', NULL, NULL, NULL, 599, 'Willemstad', 'ANG', 'North America', 'NA', 'ANT');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (162, 'NC', 'New Caledonia', NULL, NULL, '₣', NULL, NULL, NULL, 687, 'Noumea', 'XPF', 'Oceania', 'OC', 'NCL');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (163, 'NZ', 'New Zealand', NULL, NULL, '$', NULL, NULL, NULL, 64, 'Wellington', 'NZD', 'Oceania', 'OC', 'NZL');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (164, 'NI', 'Nicaragua', NULL, NULL, 'C$', NULL, NULL, NULL, 505, 'Managua', 'NIO', 'North America', 'NA', 'NIC');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (165, 'NE', 'Niger', NULL, NULL, 'CFA', NULL, NULL, NULL, 227, 'Niamey', 'XOF', 'Africa', 'AF', 'NER');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (166, 'NG', 'Nigeria', NULL, NULL, '₦', NULL, NULL, NULL, 234, 'Abuja', 'NGN', 'Africa', 'AF', 'NGA');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (167, 'NU', 'Niue', NULL, NULL, '$', NULL, NULL, NULL, 683, 'Alofi', 'NZD', 'Oceania', 'OC', 'NIU');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (168, 'NF', 'Norfolk Island', NULL, NULL, '$', NULL, NULL, NULL, 672, 'Kingston', 'AUD', 'Oceania', 'OC', 'NFK');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (169, 'MP', 'Northern Mariana Islands', NULL, NULL, '$', NULL, NULL, NULL, 1670, 'Saipan', 'USD', 'Oceania', 'OC', 'MNP');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (170, 'NO', 'Norway', NULL, NULL, 'kr', NULL, NULL, NULL, 47, 'Oslo', 'NOK', 'Europe', 'EU', 'NOR');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (171, 'OM', 'Oman', NULL, NULL, '.ع.ر', NULL, NULL, NULL, 968, 'Muscat', 'OMR', 'Asia', 'AS', 'OMN');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (172, 'PK', 'Pakistan', NULL, NULL, '₨', NULL, NULL, NULL, 92, 'Islamabad', 'PKR', 'Asia', 'AS', 'PAK');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (173, 'PW', 'Palau', NULL, NULL, '$', NULL, NULL, NULL, 680, 'Melekeok', 'USD', 'Oceania', 'OC', 'PLW');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (174, 'PS', 'Palestinian Territory, Occupied', NULL, NULL, '₪', NULL, NULL, NULL, 970, 'East Jerusalem', 'ILS', 'Asia', 'AS', 'PSE');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (175, 'PA', 'Panama', NULL, NULL, 'B/.', NULL, NULL, NULL, 507, 'Panama City', 'PAB', 'North America', 'NA', 'PAN');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (176, 'PG', 'Papua New Guinea', NULL, NULL, 'K', NULL, NULL, NULL, 675, 'Port Moresby', 'PGK', 'Oceania', 'OC', 'PNG');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (177, 'PY', 'Paraguay', NULL, NULL, '₲', NULL, NULL, NULL, 595, 'Asuncion', 'PYG', 'South America', 'SA', 'PRY');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (178, 'PE', 'Peru', NULL, NULL, 'S/.', NULL, NULL, NULL, 51, 'Lima', 'PEN', 'South America', 'SA', 'PER');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (179, 'PH', 'Philippines', NULL, NULL, '₱', NULL, NULL, NULL, 63, 'Manila', 'PHP', 'Asia', 'AS', 'PHL');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (180, 'PN', 'Pitcairn', NULL, NULL, '$', NULL, NULL, NULL, 64, 'Adamstown', 'NZD', 'Oceania', 'OC', 'PCN');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (181, 'PL', 'Poland', NULL, NULL, 'zł', NULL, NULL, NULL, 48, 'Warsaw', 'PLN', 'Europe', 'EU', 'POL');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (182, 'PT', 'Portugal', NULL, NULL, '€', NULL, NULL, NULL, 351, 'Lisbon', 'EUR', 'Europe', 'EU', 'PRT');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (183, 'PR', 'Puerto Rico', NULL, NULL, '$', NULL, NULL, NULL, 1787, 'San Juan', 'USD', 'North America', 'NA', 'PRI');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (184, 'QA', 'Qatar', NULL, NULL, 'ق.ر', NULL, NULL, NULL, 974, 'Doha', 'QAR', 'Asia', 'AS', 'QAT');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (185, 'RE', 'Reunion', NULL, NULL, '€', NULL, NULL, NULL, 262, 'Saint-Denis', 'EUR', 'Africa', 'AF', 'REU');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (186, 'RO', 'Romania', NULL, NULL, 'lei', NULL, NULL, NULL, 40, 'Bucharest', 'RON', 'Europe', 'EU', 'ROM');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (187, 'RU', 'Russian Federation', NULL, NULL, '₽', NULL, NULL, NULL, 70, 'Moscow', 'RUB', 'Asia', 'AS', 'RUS');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (188, 'RW', 'Rwanda', NULL, NULL, 'FRw', NULL, NULL, NULL, 250, 'Kigali', 'RWF', 'Africa', 'AF', 'RWA');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (189, 'BL', 'Saint Barthelemy', NULL, NULL, '€', NULL, NULL, NULL, 590, 'Gustavia', 'EUR', 'North America', 'NA', 'BLM');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (190, 'SH', 'Saint Helena', NULL, NULL, '£', NULL, NULL, NULL, 290, 'Jamestown', 'SHP', 'Africa', 'AF', 'SHN');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (191, 'KN', 'Saint Kitts and Nevis', NULL, NULL, '$', NULL, NULL, NULL, 1869, 'Basseterre', 'XCD', 'North America', 'NA', 'KNA');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (192, 'LC', 'Saint Lucia', NULL, NULL, '$', NULL, NULL, NULL, 1758, 'Castries', 'XCD', 'North America', 'NA', 'LCA');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (193, 'MF', 'Saint Martin', NULL, NULL, '€', NULL, NULL, NULL, 590, 'Marigot', 'EUR', 'North America', 'NA', 'MAF');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (194, 'PM', 'Saint Pierre and Miquelon', NULL, NULL, '€', NULL, NULL, NULL, 508, 'Saint-Pierre', 'EUR', 'North America', 'NA', 'SPM');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (195, 'VC', 'Saint Vincent and the Grenadines', NULL, NULL, '$', NULL, NULL, NULL, 1784, 'Kingstown', 'XCD', 'North America', 'NA', 'VCT');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (196, 'WS', 'Samoa', NULL, NULL, 'SAT', NULL, NULL, NULL, 684, 'Apia', 'WST', 'Oceania', 'OC', 'WSM');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (197, 'SM', 'San Marino', NULL, NULL, '€', NULL, NULL, NULL, 378, 'San Marino', 'EUR', 'Europe', 'EU', 'SMR');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (198, 'ST', 'Sao Tome and Principe', NULL, NULL, 'Db', NULL, NULL, NULL, 239, 'Sao Tome', 'STD', 'Africa', 'AF', 'STP');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (199, 'SA', 'Saudi Arabia', NULL, NULL, '﷼', NULL, NULL, NULL, 966, 'Riyadh', 'SAR', 'Asia', 'AS', 'SAU');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (200, 'SN', 'Senegal', NULL, NULL, 'CFA', NULL, NULL, NULL, 221, 'Dakar', 'XOF', 'Africa', 'AF', 'SEN');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (201, 'RS', 'Serbia', NULL, NULL, 'din', NULL, NULL, NULL, 381, 'Belgrade', 'RSD', 'Europe', 'EU', 'SRB');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (202, 'CS', 'Serbia and Montenegro', NULL, NULL, 'din', NULL, NULL, NULL, 381, 'Belgrade', 'RSD', 'Europe', 'EU', 'SCG');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (203, 'SC', 'Seychelles', NULL, NULL, 'SRe', NULL, NULL, NULL, 248, 'Victoria', 'SCR', 'Africa', 'AF', 'SYC');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (204, 'SL', 'Sierra Leone', NULL, NULL, 'Le', NULL, NULL, NULL, 232, 'Freetown', 'SLL', 'Africa', 'AF', 'SLE');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (205, 'SG', 'Singapore', NULL, NULL, '$', NULL, NULL, NULL, 65, 'Singapur', 'SGD', 'Asia', 'AS', 'SGP');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (206, 'SX', 'Sint Maarten', NULL, NULL, 'ƒ', NULL, NULL, NULL, 1, 'Philipsburg', 'ANG', 'North America', 'NA', 'SXM');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (207, 'SK', 'Slovakia', NULL, NULL, '€', NULL, NULL, NULL, 421, 'Bratislava', 'EUR', 'Europe', 'EU', 'SVK');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (208, 'SI', 'Slovenia', NULL, NULL, '€', NULL, NULL, NULL, 386, 'Ljubljana', 'EUR', 'Europe', 'EU', 'SVN');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (209, 'SB', 'Solomon Islands', NULL, NULL, 'Si$', NULL, NULL, NULL, 677, 'Honiara', 'SBD', 'Oceania', 'OC', 'SLB');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (210, 'SO', 'Somalia', NULL, NULL, 'Sh.so.', NULL, NULL, NULL, 252, 'Mogadishu', 'SOS', 'Africa', 'AF', 'SOM');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (211, 'ZA', 'South Africa', NULL, NULL, 'R', NULL, NULL, NULL, 27, 'Pretoria', 'ZAR', 'Africa', 'AF', 'ZAF');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (212, 'GS', 'South Georgia and the South Sandwich Islands', NULL, NULL, '£', NULL, NULL, NULL, 500, 'Grytviken', 'GBP', 'Antarctica', 'AN', 'SGS');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (213, 'SS', 'South Sudan', NULL, NULL, '£', NULL, NULL, NULL, 211, 'Juba', 'SSP', 'Africa', 'AF', 'SSD');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (214, 'ES', 'Spain', NULL, NULL, '€', NULL, NULL, NULL, 34, 'Madrid', 'EUR', 'Europe', 'EU', 'ESP');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (215, 'LK', 'Sri Lanka', NULL, NULL, 'Rs', NULL, NULL, NULL, 94, 'Colombo', 'LKR', 'Asia', 'AS', 'LKA');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (216, 'SD', 'Sudan', NULL, NULL, '.س.ج', NULL, NULL, NULL, 249, 'Khartoum', 'SDG', 'Africa', 'AF', 'SDN');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (217, 'SR', 'Suriname', NULL, NULL, '$', NULL, NULL, NULL, 597, 'Paramaribo', 'SRD', 'South America', 'SA', 'SUR');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (218, 'SJ', 'Svalbard and Jan Mayen', NULL, NULL, 'kr', NULL, NULL, NULL, 47, 'Longyearbyen', 'NOK', 'Europe', 'EU', 'SJM');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (219, 'SZ', 'Swaziland', NULL, NULL, 'E', NULL, NULL, NULL, 268, 'Mbabane', 'SZL', 'Africa', 'AF', 'SWZ');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (220, 'SE', 'Sweden', NULL, NULL, 'kr', NULL, NULL, NULL, 46, 'Stockholm', 'SEK', 'Europe', 'EU', 'SWE');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (221, 'CH', 'Switzerland', NULL, NULL, 'CHf', NULL, NULL, NULL, 41, 'Berne', 'CHF', 'Europe', 'EU', 'CHE');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (222, 'SY', 'Syrian Arab Republic', NULL, NULL, 'LS', NULL, NULL, NULL, 963, 'Damascus', 'SYP', 'Asia', 'AS', 'SYR');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (223, 'TW', 'Taiwan, Province of China', NULL, NULL, '$', NULL, NULL, NULL, 886, 'Taipei', 'TWD', 'Asia', 'AS', 'TWN');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (224, 'TJ', 'Tajikistan', NULL, NULL, 'SM', NULL, NULL, NULL, 992, 'Dushanbe', 'TJS', 'Asia', 'AS', 'TJK');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (225, 'TZ', 'Tanzania, United Republic of', NULL, NULL, 'TSh', NULL, NULL, NULL, 255, 'Dodoma', 'TZS', 'Africa', 'AF', 'TZA');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (226, 'TH', 'Thailand', NULL, NULL, '฿', NULL, NULL, NULL, 66, 'Bangkok', 'THB', 'Asia', 'AS', 'THA');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (227, 'TL', 'Timor-Leste', NULL, NULL, '$', NULL, NULL, NULL, 670, 'Dili', 'USD', 'Asia', 'AS', 'TLS');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (228, 'TG', 'Togo', NULL, NULL, 'CFA', NULL, NULL, NULL, 228, 'Lome', 'XOF', 'Africa', 'AF', 'TGO');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (229, 'TK', 'Tokelau', NULL, NULL, '$', NULL, NULL, NULL, 690, '', 'NZD', 'Oceania', 'OC', 'TKL');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (230, 'TO', 'Tonga', NULL, NULL, '$', NULL, NULL, NULL, 676, 'Nukualofa', 'TOP', 'Oceania', 'OC', 'TON');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (231, 'TT', 'Trinidad and Tobago', NULL, NULL, '$', NULL, NULL, NULL, 1868, 'Port of Spain', 'TTD', 'North America', 'NA', 'TTO');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (232, 'TN', 'Tunisia', NULL, NULL, 'ت.د', NULL, NULL, NULL, 216, 'Tunis', 'TND', 'Africa', 'AF', 'TUN');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (233, 'TR', 'Turkey', NULL, NULL, '₺', NULL, NULL, NULL, 90, 'Ankara', 'TRY', 'Asia', 'AS', 'TUR');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (234, 'TM', 'Turkmenistan', NULL, NULL, 'T', NULL, NULL, NULL, 7370, 'Ashgabat', 'TMT', 'Asia', 'AS', 'TKM');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (235, 'TC', 'Turks and Caicos Islands', NULL, NULL, '$', NULL, NULL, NULL, 1649, 'Cockburn Town', 'USD', 'North America', 'NA', 'TCA');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (236, 'TV', 'Tuvalu', NULL, NULL, '$', NULL, NULL, NULL, 688, 'Funafuti', 'AUD', 'Oceania', 'OC', 'TUV');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (237, 'UG', 'Uganda', NULL, NULL, 'USh', NULL, NULL, NULL, 256, 'Kampala', 'UGX', 'Africa', 'AF', 'UGA');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (238, 'UA', 'Ukraine', NULL, NULL, '₴', NULL, NULL, NULL, 380, 'Kiev', 'UAH', 'Europe', 'EU', 'UKR');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (239, 'AE', 'United Arab Emirates', NULL, NULL, 'إ.د', NULL, NULL, NULL, 971, 'Abu Dhabi', 'AED', 'Asia', 'AS', 'ARE');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (240, 'GB', 'United Kingdom', NULL, NULL, '£', NULL, NULL, NULL, 44, 'London', 'GBP', 'Europe', 'EU', 'GBR');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (241, 'US', 'United States', NULL, NULL, '$', NULL, NULL, NULL, 1, 'Washington', 'USD', 'North America', 'NA', 'USA');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (242, 'UM', 'United States Minor Outlying Islands', NULL, NULL, '$', NULL, NULL, NULL, 1, '', 'USD', 'North America', 'NA', 'UMI');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (243, 'UY', 'Uruguay', NULL, NULL, '$', NULL, NULL, NULL, 598, 'Montevideo', 'UYU', 'South America', 'SA', 'URY');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (244, 'UZ', 'Uzbekistan', NULL, NULL, 'лв', NULL, NULL, NULL, 998, 'Tashkent', 'UZS', 'Asia', 'AS', 'UZB');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (245, 'VU', 'Vanuatu', NULL, NULL, 'VT', NULL, NULL, NULL, 678, 'Port Vila', 'VUV', 'Oceania', 'OC', 'VUT');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (246, 'VE', 'Venezuela', NULL, NULL, 'Bs', NULL, NULL, NULL, 58, 'Caracas', 'VEF', 'South America', 'SA', 'VEN');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (247, 'VN', 'Viet Nam', NULL, NULL, '₫', NULL, NULL, NULL, 84, 'Hanoi', 'VND', 'Asia', 'AS', 'VNM');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (248, 'VG', 'Virgin Islands, British', NULL, NULL, '$', NULL, NULL, NULL, 1284, 'Road Town', 'USD', 'North America', 'NA', 'VGB');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (249, 'VI', 'Virgin Islands, U.s.', NULL, NULL, '$', NULL, NULL, NULL, 1340, 'Charlotte Amalie', 'USD', 'North America', 'NA', 'VIR');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (250, 'WF', 'Wallis and Futuna', NULL, NULL, '₣', NULL, NULL, NULL, 681, 'Mata Utu', 'XPF', 'Oceania', 'OC', 'WLF');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (251, 'EH', 'Western Sahara', NULL, NULL, 'MAD', NULL, NULL, NULL, 212, 'El-Aaiun', 'MAD', 'Africa', 'AF', 'ESH');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (252, 'YE', 'Yemen', NULL, NULL, '﷼', NULL, NULL, NULL, 967, 'Sanaa', 'YER', 'Asia', 'AS', 'YEM');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (253, 'ZM', 'Zambia', NULL, NULL, 'ZK', NULL, NULL, NULL, 260, 'Lusaka', 'ZMW', 'Africa', 'AF', 'ZMB');
INSERT INTO public.countries (id, code, name, created_at, deleted_at, currency_symbol, currency_name, languages, country_code, phone, capital, currency_code, continent, continent_code, alpha_3) VALUES (254, 'ZW', 'Zimbabwe', NULL, NULL, '$', NULL, NULL, NULL, 263, 'Harare', 'ZWL', 'Africa', 'AF', 'ZWE');



CREATE TABLE IF NOT EXISTS public.organisations (
	id serial primary key,
	name character varying not null,
	subdomain character varying unique not null,
	email character varying null,
	website character varying null,
	phone character varying null,
	street character varying null,
	city character varying null,
	postal_code character varying null,
	country_id smallint not null,
	created_at timestamp without time zone,
	updated_at timestamp without time zone,
	deleted_at timestamp without time zone
);

CREATE TABLE IF NOT EXISTS public.organisation_settings (
	id serial primary key,
	organisation_id integer not null,
	created_at timestamp without time zone,
	updated_at timestamp without time zone,
	deleted_at timestamp without time zone
);

CREATE TABLE IF NOT EXISTS public.users (
	id serial primary key,
	first_name character varying not null,
	last_name character varying not null,
	username character varying not null,
	password character varying not null,
	administrator boolean default false,
	super_administrator boolean default false,
	last_login_at timestamp without time zone null,
	country_id smallint  null,
	active boolean default true,
	organisation_id integer,
	created_at timestamp without time zone,
	updated_at timestamp without time zone,
	deleted_at timestamp without time zone
);

CREATE TABLE IF NOT EXISTS public.roles (
	id serial primary key,
	code character varying,
	name character varying,
	organisation_id integer not null,
	created_at timestamp without time zone,
	updated_at timestamp without time zone,
	deleted_at timestamp without time zone
);

CREATE TABLE IF NOT EXISTS public.projects (
	id serial primary key,
	code character varying,
	name character varying not null,
	customer_id integer null,
	status_id smallint not null,
	description character varying null,
	organisation_id integer not null,
	created_at timestamp without time zone,
	updated_at timestamp without time zone,
	deleted_at timestamp without time zone
);

CREATE TABLE IF NOT EXISTS public.link_project_users (
	id serial primary key,
	project_id integer not null,
	user_id integer not null
);

CREATE TABLE IF NOT EXISTS public.tickets (
	id serial primary key,
	code character varying,
	name character varying,
	creator_id integer not null,
    creator_type SMALLINT  not null,
    status_id SMALLINT  not null,
    priority_id SMALLINT  not null,
    title character varying null,
    content character varying null,
	organisation_id integer not null,
	created_at timestamp without time zone,
	updated_at timestamp without time zone,
	deleted_at timestamp without time zone
);

CREATE TABLE IF NOT EXISTS public.activity_log (
	id bigserial primary key,
	creator_id integer not null,
	creator_type SMALLINT  not null,
	related_id integer not null,
    related_type SMALLINT  not null,
    log_action character varying null,
    content character varying null,
	organisation_id integer not null,
	created_at timestamp without time zone,
	updated_at timestamp without time zone,
	deleted_at timestamp without time zone
);

CREATE TABLE IF NOT EXISTS public.customers (
	id serial primary key,
	code character varying,
	name character varying,
	organisation_id integer not null,
	created_at timestamp without time zone,
	updated_at timestamp without time zone,
	deleted_at timestamp without time zone
);


CREATE TABLE IF NOT EXISTS public.lead_sources (
	id serial primary key,
	code character varying,
	name character varying,
	color character varying,
	organisation_id integer not null,
	created_at timestamp without time zone,
	updated_at timestamp without time zone,
	deleted_at timestamp without time zone
);

CREATE TABLE IF NOT EXISTS public.lead_statuses (
	id serial primary key,
	code character varying,
	name character varying,
	color character varying,
	order_number smallint not null,
	organisation_id integer not null,
	deleteable boolean default true,
	created_at timestamp without time zone,
	updated_at timestamp without time zone,
	deleted_at timestamp without time zone
);

CREATE TABLE IF NOT EXISTS public.leads (
	id serial primary key,
	first_name character varying,
	last_name character varying,
	position character varying,
	company character varying,
	email character varying,
	phone character varying,
	website character varying,
	address character varying,
	city character varying,
	postal_code character varying,
	country_id smallint not null,
	status_id smallint not null,
	source_id smallint not null,
	assigned_user_id integer not null,
	description character varying,
	is_lost boolean default false,
	is_junk boolean default false,
	organisation_id integer not null,
	last_activity_at timestamp without time zone,
	created_at timestamp without time zone,
	updated_at timestamp without time zone,
	deleted_at timestamp without time zone
);

--Insert admin user (admin/admin)
INSERT INTO public.users (first_name, last_name, username, password, active, created_at, super_administrator)
       SELECT 'Admin', 'Admin', 'admin', '$2a$10$he/WLHWq5lQ/h5VyO1/fJ.iCHVxb.dI6Ijx9JBWuUx7oegkEvWHWC', true, now(), true
       WHERE NOT EXISTS (SELECT 1 FROM public.users WHERE username = 'admin');