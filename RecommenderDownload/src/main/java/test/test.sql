create table Track (id integer not null auto_increment, artist_id integer, disk_number integer, duration integer, explicit_content_cover integer, explicit_content_lyrics integer, explicit_lyrics bit, preview BLOB, rank integer, title VARCHAR(255), title_short VARCHAR(100), track_position integer, primary key (id)) engine=InnoDB;