package com.esgi.agnoscere.xmlparser;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;
import java.util.ArrayList;


public class Anecdote extends Post implements Serializable{
	private final String title;
	private final String category;
	private int ididntknowvote = 0;
	private int iknewvote = 0;
	private String videoid = "";
	private String imagelink = "";
	private ArrayList<String> sources = new ArrayList<String>();
	private ArrayList<Comment> comments = new ArrayList<Comment>();

	public Anecdote(String id, String autor,String title, String category, String contents,String date,
			int ididntknowvote, int iknewvote, String videoid,String imagelink,
			ArrayList<String> sources,ArrayList<Comment> comments) {

		super(id,autor,contents,date);
		this.title = title;
		this.category = category;
		this.ididntknowvote = ididntknowvote;
		this.iknewvote = iknewvote;
		this.videoid = videoid;
		this.imagelink = imagelink;
		this.sources = sources;
		this.comments = comments;
	}

    public ArrayList<Comment> getcomments() {
		return comments;
	}


	public void setcomments(ArrayList<Comment> comments) {
		this.comments = comments;
	}


	public String getContents() {
		return contents;
	}


	public void setContents(String contents) {
		this.contents = contents;
	}


	public String getVideoid() {
		return videoid;
	}


	public void setVideoid(String videoid) {
		this.videoid = videoid;
	}


	public String getImagelink() {
		return imagelink;
	}


	public void setImagelink(String imagelink) {
		this.imagelink = imagelink;
	}


	public String getAutor() {
		return autor;
	}


	public String getcontents() {
		return contents;
	}

	public void setcontents(String contents) {
		this.contents = contents;
	}

	public int getIdidntknowvote() {
		return ididntknowvote;
	}

	public void setIdidntknowvote(int ididntknowvote) {
		this.ididntknowvote = ididntknowvote;
	}

	public int getIknewvote() {
		return iknewvote;
	}

	public void setIknewvote(int iknewvote) {
		this.iknewvote = iknewvote;
	}

	public String getvideoid() {
		return videoid;
	}

	public void setvideoid(String videoid) {
		this.videoid = videoid;
	}

	public ArrayList<String> getSources() {
		return sources;
	}

	public void setSources(ArrayList<String> sources) {
		this.sources = sources;
	}

	public String getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getCategory() {
		return category;
	}

	@Override
	public String toString() {
		String sourcesString="";
		int i =1;
		for(String s : sources){
			sourcesString+=" source "+i+" : "+s;
			i++;
		}
		i=1;
		String commentsString="";
		for(Comment com : comments){
			commentsString+=" \tcomments "+i+" : "+com.toString()+"\n";
			i++;
		}
		return "Annecdote id : " + id +" Autor : "+autor+" Title : " + title + " Category : "
				+ category +" Contents : "+contents+" Date : "+date+" I didn't know it : " + ididntknowvote
				+ " I knew it : " + iknewvote + " Video Id : " + videoid + " Image Link : "+imagelink
				+ " Sources :" + sourcesString+"\nComments : "+commentsString;
	}

  /*  @Override
    public int describeContents() {
        return 0;
    }


    public static final Parcelable.Creator<Anecdote> CREATOR = new Parcelable.Creator<Anecdote>() {
        @Override
        public Anecdote createFromParcel(Parcel in) {
            return new Anecdote(in);
        }

        @Override
        public Anecdote[] newArray(int size) {
            return new Anecdote[size];
        }
    };


    @Override
	public int describeContents() {
		return 0;
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {

		dest.writeString(title);
		dest.writeString(category);
		dest.writeInt(ididntknowvote);
		dest.writeInt(iknewvote);
		dest.writeString(videoid);
		dest.writeString(imagelink);
		dest.writeStringList(sources);
		dest.writeList(comments);
    }

    public Anecdote(Parcel in) {

        super(in.readString(),in.readString(),in.readString(),in.readString());

        title = in.readString();
        category = in.readString();
        ididntknowvote = in.readInt();
        iknewvote = in.readInt();
        videoid = in.readString();
        imagelink = in.readString();
        in.readStringList(sources);
        in.readList(comments,Comment.class.getClassLoader());
    }
    */
}
