package recommender.download.pojo_json;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class JsonAlbum implements Serializable
{
	
	private static final long serialVersionUID = -1L;

	@SerializedName("id")
	@Expose
	private Integer id;

	@SerializedName("title")
	@Expose
	private String title;

	@SerializedName("upc")
	@Expose
	private String upc;
	
	@SerializedName("link")
	@Expose
	private String link;
	
	@SerializedName("share")
	@Expose
	private String share;

	@SerializedName("cover")
	@Expose
	private String cover;

	@SerializedName("cover_small")
	@Expose
	private String coverSmall;

	@SerializedName("cover_medium")
	@Expose
	private String coverMedium;

	@SerializedName("cover_big")
	@Expose
	private String coverBig;

	@SerializedName("cover_xl")
	@Expose
	private String coverXl;
	
	@SerializedName("genre_id")
	@Expose
	private Integer genre_id;
	
	@SerializedName("genres")
	@Expose
	private JsonGenreList genres;
	
	@SerializedName("label")
	@Expose
	private String label;
	
	
	@SerializedName("nb_tracks")
	@Expose
	private Integer nb_tracks;
	
	@SerializedName("duration")
	@Expose
	private Integer duration;
	
	@SerializedName("fans")
	@Expose
	private Integer fans;
	
	@SerializedName("rating")
	@Expose
	private Integer rating;
	
	@SerializedName("release_date")
	@Expose
	private String releaseDate;
	
	@SerializedName("record_type")
	@Expose
	private String record_type;
	
	@SerializedName("available")
	@Expose
	private Boolean available;
	
	@SerializedName("tracklist")
	@Expose
	private String tracklist;
	
	@SerializedName("explicit_lyrics")
	@Expose
	private Boolean explicit_lyrics;
	
	@SerializedName("explicit_content_lyrics")
	@Expose
	private Integer explicit_content_lyrics;
	
	@SerializedName("explicit_content_cover")
	@Expose
	private Integer explicit_content_cover;

	@SerializedName("type")
	@Expose
	private String type;
	
	@SerializedName("contributors")
	@Expose
	private List<JsonContributor> contributors = new ArrayList<JsonContributor>(); //Contributor list

	@SerializedName("artist")
	@Expose
	private JsonArtist artist;
	
	@SerializedName("tracks")
	@Expose
	private JsonTrackList tracks;

	public Integer getId()
	{
		return id;
	}

	public void setId(Integer id)
	{
		this.id = id;
	}

	public String getTitle()
	{
		return title;
	}

	public void setTitle(String title)
	{
		this.title = title;
	}

	public String getUpc()
	{
		return upc;
	}

	public void setUpc(String upc)
	{
		this.upc = upc;
	}

	public String getLink()
	{
		return link;
	}

	public void setLink(String link)
	{
		this.link = link;
	}

	public String getShare()
	{
		return share;
	}

	public void setShare(String share)
	{
		this.share = share;
	}

	public String getCover()
	{
		return cover;
	}

	public void setCover(String cover)
	{
		this.cover = cover;
	}

	public String getCoverSmall()
	{
		return coverSmall;
	}

	public void setCoverSmall(String coverSmall)
	{
		this.coverSmall = coverSmall;
	}

	public String getCoverMedium()
	{
		return coverMedium;
	}

	public void setCoverMedium(String coverMedium)
	{
		this.coverMedium = coverMedium;
	}

	public String getCoverBig()
	{
		return coverBig;
	}

	public void setCoverBig(String coverBig)
	{
		this.coverBig = coverBig;
	}

	public String getCoverXl()
	{
		return coverXl;
	}

	public void setCoverXl(String coverXl)
	{
		this.coverXl = coverXl;
	}

	public Integer getGenre_id()
	{
		return genre_id;
	}

	public void setGenre_id(Integer genre_id)
	{
		this.genre_id = genre_id;
	}

	public JsonGenreList getGenres()
	{
		return genres;
	}

	public void setGenres(JsonGenreList genres)
	{
		this.genres = genres;
	}

	public String getLabel()
	{
		return label;
	}

	public void setLabel(String label)
	{
		this.label = label;
	}

	public Integer getNb_tracks()
	{
		return nb_tracks;
	}

	public void setNb_tracks(Integer nb_tracks)
	{
		this.nb_tracks = nb_tracks;
	}

	public Integer getDuration()
	{
		return duration;
	}

	public void setDuration(Integer duration)
	{
		this.duration = duration;
	}

	public Integer getFans()
	{
		return fans;
	}

	public void setFans(Integer fans)
	{
		this.fans = fans;
	}

	public Integer getRating()
	{
		return rating;
	}

	public void setRating(Integer rating)
	{
		this.rating = rating;
	}

	public String getReleaseDate()
	{
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate)
	{
		this.releaseDate = releaseDate;
	}

	public String getRecord_type()
	{
		return record_type;
	}

	public void setRecord_type(String record_type)
	{
		this.record_type = record_type;
	}

	public Boolean getAvailable()
	{
		return available;
	}

	public void setAvailable(Boolean available)
	{
		this.available = available;
	}

	public String getTracklist()
	{
		return tracklist;
	}

	public void setTracklist(String tracklist)
	{
		this.tracklist = tracklist;
	}

	public Boolean getExplicit_lyrics()
	{
		return explicit_lyrics;
	}

	public void setExplicit_lyrics(Boolean explicit_lyrics)
	{
		this.explicit_lyrics = explicit_lyrics;
	}

	public Integer getExplicit_content_lyrics()
	{
		return explicit_content_lyrics;
	}

	public void setExplicit_content_lyrics(Integer explicit_content_lyrics)
	{
		this.explicit_content_lyrics = explicit_content_lyrics;
	}

	public Integer getExplicit_content_cover()
	{
		return explicit_content_cover;
	}

	public void setExplicit_content_cover(Integer explicit_content_cover)
	{
		this.explicit_content_cover = explicit_content_cover;
	}

	public List<JsonContributor> getContributors()
	{
		return contributors;
	}

	public void setContributors(List<JsonContributor> contributors)
	{
		this.contributors = contributors;
	}

	public JsonArtist getArtist()
	{
		return artist;
	}

	public void setArtist(JsonArtist artist)
	{
		this.artist = artist;
	}

	public String getType()
	{
		return type;
	}

	public void setType(String type)
	{
		this.type = type;
	}

	public JsonTrackList getTracks()
	{
		return tracks;
	}

	public void setTracks(JsonTrackList tracks)
	{
		this.tracks = tracks;
	}
	

}
