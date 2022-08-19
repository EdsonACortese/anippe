CREATE TABLE IF NOT EXISTS organisations (
	id serial primary key,
	name character varying not null,
	subdomain character varying unique not null,
	created_at timestamp without time zone,
	updated_at timestamp without time zone,
	deleted_at timestamp without time zone
);

CREATE TABLE IF NOT EXISTS organisation_settings (
	id serial primary key,
	organisation_id integer not null,
	created_at timestamp without time zone,
	updated_at timestamp without time zone,
	deleted_at timestamp without time zone
);

CREATE TABLE IF NOT EXISTS users (
	id serial primary key,
	first_name character varying not null,
	last_name character varying not null,
	username character varying not null,
	password character varying not null,
	administrator boolean default false,
	organisation_id integer,
	created_at timestamp without time zone,
	updated_at timestamp without time zone,
	deleted_at timestamp without time zone
);

CREATE TABLE IF NOT EXISTS clients (
	id serial primary key,
	code character varying,
	first_name character varying,
	last_name character varying,
	organisation_id integer not null,
	created_at timestamp without time zone,
	updated_at timestamp without time zone,
	deleted_at timestamp without time zone
);

