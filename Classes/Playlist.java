package Classes;

public class Playlist {
    private String title;
    private String description;
    private int numTracks;
    private Track[] tracklist;
    
    public Playlist(String title, String description, int numTracks) {
        this.title = title;
        this.description = description;
        this.numTracks = numTracks;
        this.tracklist = new Track[numTracks];
    }

    public Playlist(String title, String description, Track[] tracklist) {
        this.title = title;
        this.description = description;
        this.tracklist = tracklist;
        this.numTracks = tracklist.length;
    }
    
    // Getters and setters for Title and description only
    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    // Instance method: replaces the current tracklist with t
    public void updateTracks(Track[] t) {
        this.tracklist = t;
        this.numTracks = t.length;
    }
    
    // Instance method: adds a track at a specific index
    public void addSong(Track t, int index) {
        if (index >= 0 && index < tracklist.length) {
            tracklist[index] = t;
        }
    }
    
    // Instance method: retrieves a track at a specific index
    public Track getSong(int index) {
        if (index >= 0 && index < tracklist.length) {
            return tracklist[index];
        }
        return null;
    }
    
    // Instance method: returns total playlist length
    public int getDuration() {
        int totalDuration = 0;
        for (int i = 0; i < tracklist.length; i++) {
            if (tracklist[i] != null) {
                totalDuration += tracklist[i].getDuration();
            }
        }
        return totalDuration;
    }
    
    // Instance method: returns true if any Track is explicit
    public boolean parentAdvisory() {
        for (int i = 0; i < tracklist.length; i++) {
            if (tracklist[i] != null && tracklist[i].isExplicit()) {
                return true;
            }
        }
        return false;
    }
    
    // Instance method: checks if two playlists are equal
    public boolean equals(Playlist other) {
        if (other == null) {
            return false;
        }
        
        // Check basic fields
        boolean sameTitle = this.title.equals(other.getTitle());
        boolean sameDescription = this.description.equals(other.getDescription());
        boolean sameNumTracks = this.numTracks == other.numTracks;
        
        if (!sameTitle || !sameDescription || !sameNumTracks) {
            return false;
        }
        
        // Check tracklist
        if (this.tracklist.length != other.tracklist.length) {
            return false;
        }
        
        for (int i = 0; i < this.tracklist.length; i++) {
            // Handle null tracks in comparison
            if (this.tracklist[i] == null && other.tracklist[i] == null) {
                continue;
            }
            if (this.tracklist[i] == null || other.tracklist[i] == null) {
                return false;
            }
            if (!this.tracklist[i].equals(other.tracklist[i])) {
                return false;
            }
        }
        
        return true;
    }
    
     // Instance method: returns string representation of the playlist
    public String toString() {
        String result = "Playlist: " + title + "\n" + description + "\n";
        result += "Tracks: " + numTracks + "\n";
        result += "Duration: " + getDuration() + " seconds\n";
        if (parentAdvisory()) {
            result += "[Parental Advisory]\n";
        }
        result += "Tracklist:\n";
        for (int i = 0; i < tracklist.length; i++) {
            if (tracklist[i] != null) {
                result += "  " + (i + 1) + ". " + tracklist[i].toString() + "\n";
            }
        }
        return result;
    }
}