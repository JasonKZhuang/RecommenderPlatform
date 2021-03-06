package recommender.core.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="album")
@NamedQuery(name="Album.findAll", query="SELECT a FROM Album a")
public class Album implements Serializable 
{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private long id;

	@Column(name="album_id", unique=true, nullable=false)
	private int albumId;
	
	@Column(nullable=false, length=255)
	private String title;
	
	@Column(length=255)
	private String label;
	
	@Column(length=50)
	private String upc;

	@Column(name="image_small", length=500)
	private String imageSmall;
	
	@Column(name="image_medium", length=500)
	private String imageMedium;
	
	@Column(name="image_big", length=500)
	private String imageBig;
	
	@Column(name="image_xl", length=500)
	private String imageXl;
	
	@Column(name="genre_id", nullable=false)
	private int genreId;
	
	@Column(name="nb_tracks")
	private int nbTracks;
	
	@Column(name="duration")
	private int duration;
	
	@Column(name="fans")
	private int fans;

	@Column(name="rating")
	private int rating;
	
	@Temporal(TemporalType.DATE)
	@Column(name="release_date", nullable=false)
	private Date releaseDate;
	
	@Column(nullable=false)
	private Boolean available;
	
	@Column(length=50)
	private String type;

	/*
	@OneToMany(fetch = FetchType.EAGER, mappedBy="album")
	private List<AlbumArtist> albumArtists;

	@OneToMany(fetch = FetchType.EAGER, mappedBy="album")
	private List<AlbumTrack> albumTracks;
	*/
	
	
	public Album()
	{
		
	}

	public long getId()
	{
		return id;
	}

	public void setId(long id)
	{
		this.id = id;
	}

	public int getAlbumId()
	{
		return albumId;
	}

	public void setAlbumId(int albumId)
	{
		this.albumId = albumId;
	}

	public String getTitle()
	{
		return title;
	}

	public void setTitle(String title)
	{
		this.title = title;
	}

	public String getLabel()
	{
		return label;
	}

	public void setLabel(String label)
	{
		this.label = label;
	}

	public String getUpc()
	{
		return upc;
	}

	public void setUpc(String upc)
	{
		this.upc = upc;
	}

	public String getImageSmall()
	{
		return imageSmall;
	}

	public void setImageSmall(String imageSmall)
	{
		this.imageSmall = imageSmall;
	}

	public String getImageMedium()
	{
		return imageMedium;
	}

	public void setImageMedium(String imageMedium)
	{
		this.imageMedium = imageMedium;
	}

	public String getImageBig()
	{
		return imageBig;
	}

	public void setImageBig(String imageBig)
	{
		this.imageBig = imageBig;
	}

	public String getImageXl()
	{
		return imageXl;
	}

	public void setImageXl(String imageXl)
	{
		this.imageXl = imageXl;
	}

	public int getGenreId()
	{
		return genreId;
	}

	public void setGenreId(int genreId)
	{
		this.genreId = genreId;
	}

	public int getNbTracks()
	{
		return nbTracks;
	}

	public void setNbTracks(int nbTracks)
	{
		this.nbTracks = nbTracks;
	}

	public int getDuration()
	{
		return duration;
	}

	public void setDuration(int duration)
	{
		this.duration = duration;
	}

	public int getFans()
	{
		return fans;
	}

	public void setFans(int fans)
	{
		this.fans = fans;
	}

	public int getRating()
	{
		return rating;
	}

	public void setRating(int rating)
	{
		this.rating = rating;
	}

	public Date getReleaseDate()
	{
		return releaseDate;
	}

	public void setReleaseDate(Date releaseDate)
	{
		this.releaseDate = releaseDate;
	}

	public Boolean getAvailable()
	{
		return available;
	}

	public void setAvailable(Boolean available)
	{
		this.available = available;
	}

	public String getType()
	{
		return type;
	}

	public void setType(String type)
	{
		this.type = type;
	}
	
}
