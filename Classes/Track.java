package Classes;

public class Track {

    private String title;
    private int duration;
    private int rating;
    private boolean explicit;

    public Track(String title, int duration, int rating, boolean explicit){
        this.title = title;
        this.duration = duration;
        this.rating = rating;
        this.explicit = explicit;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void setExplicit(boolean explicit) {
        this.explicit = explicit;
    }

    public String getTitle() {
        return this.title;
    }

    public int getDuration() {
        return this.duration;
    }

    public int getRating() {
        return this.rating;
    }

    public boolean isExplicit() {
        return this.explicit;
    }

    public String toString() {
        String str = this.title;
        if (this.explicit) {
            str += " [E]";
        }
        str += " (" + this.duration + " secs)";
        for(int i = 0; i < this.rating; i++) {
            str += "★";
        }
        for(int i = 0; i < 5 - this.rating; i++) {
            str += "☆";
        }
        return str;
    }

    public boolean equals(Track otherTrack) {
        boolean sameTitle = this.title.equals(otherTrack.getTitle());
        boolean sameDuration = this.duration == otherTrack.getDuration();
        boolean sameRating = this.rating == otherTrack.getRating();
        boolean sameExplicit = this.explicit == otherTrack.isExplicit();
        return sameTitle && sameDuration && sameRating && sameExplicit;
    }
    
}
