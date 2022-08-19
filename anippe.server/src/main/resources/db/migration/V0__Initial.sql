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

CREATE TABLE IF NOT EXISTS roles (
	id serial primary key,
	code character varying,
	name character varying,
	organisation_id integer not null,
	created_at timestamp without time zone,
	updated_at timestamp without time zone,
	deleted_at timestamp without time zone
);

CREATE TABLE IF NOT EXISTS projects (
	id serial primary key,
	code character varying,
	name character varying not null,
	organisation_id integer not null,
	created_at timestamp without time zone,
	updated_at timestamp without time zone,
	deleted_at timestamp without time zone
);

CREATE TABLE IF NOT EXISTS tickets (
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

CREATE TABLE IF NOT EXISTS activity_log (
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

CREATE TABLE IF NOT EXISTS customers (
	id serial primary key,
	code character varying,
	name character varying,
	organisation_id integer not null,
	created_at timestamp without time zone,
	updated_at timestamp without time zone,
	deleted_at timestamp without time zone
);

