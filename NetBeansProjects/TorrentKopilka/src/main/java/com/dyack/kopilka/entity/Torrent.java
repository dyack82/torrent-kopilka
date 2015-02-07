package com.dyack.kopilka.entity;

import java.io.Serializable;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;

@Entity
@Table(name = "torrent")
public class Torrent implements Serializable{

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "id", length = 6, nullable = false)
    private int id;
    
    @Column(name = "sizeFile")
    private String sizeFile;
    
    @Column(name = "quality")
    private String quality;
    
    @Column(name = "format")
    private String format;
    
    @Column(name = "video")
    private String video;
    
    @Column(name = "audio")
    private String audio;

    @Column(name = "video_codec")
    private String videoCodec;
    
    @Column(name = "audio_codec")
    private String audioCodec;
    
    @Column(name = "audio_transfer")
    private String audioTransfer;
    
    @Column(name = "subtitles")
    private String subtitles;
    
    @Column(name = "torrent_link")
    private String torrentLink;
    
    @ManyToOne
    @JoinColumn(name = "film_id")
    private Film filmTorrent;

    public Torrent() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSizeFile() {
        return sizeFile;
    }

    public void setSizeFile(String sizeFile) {
        this.sizeFile = sizeFile;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }


    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public String getAudio() {
        return audio;
    }

    public void setAudio(String audio) {
        this.audio = audio;
    }

    public String getVideoCodec() {
        return videoCodec;
    }

    public void setVideoCodec(String videoCodec) {
        this.videoCodec = videoCodec;
    }

    public String getAudioCodec() {
        return audioCodec;
    }

    public void setAudioCodec(String audioCodec) {
        this.audioCodec = audioCodec;
    }

    public String getAudioTransfer() {
        return audioTransfer;
    }

    public void setAudioTransfer(String audioTransfer) {
        this.audioTransfer = audioTransfer;
    }

    public String getTorrentLink() {
        return torrentLink;
    }

    public void setTorrentLink(String torrentLink) {
        this.torrentLink = torrentLink;
    }

//    public Film getFilmTorrent() {
//        return filmTorrent;
//    }

    public void setFilmTorrent(Film filmTorrent) {
        this.filmTorrent = filmTorrent;
    }

    public String getSubtitles() {
        return subtitles;
    }

    public void setSubtitles(String subtitles) {
        this.subtitles = subtitles;
    }

    @Override
    public String toString() {
        return '{' + "format=" + format + ", video=" + video + ", audio=" + audio + ", videoCodec=" + videoCodec + ", audioCodec=" + audioCodec + ", audioTransfer=" + audioTransfer + ", torrentLink=" + torrentLink + '}';
    }
    
    

}
