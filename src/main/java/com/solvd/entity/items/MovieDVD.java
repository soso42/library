package com.solvd.entity.items;

import com.solvd.entity.Borrowable;
import com.solvd.entity.Playable;
import com.solvd.entity.common.BaseEntity;

public class MovieDVD extends BaseEntity implements Playable, Borrowable {

    private String name;
    private String resolution;
    private Long duration;

    public MovieDVD(long id, String name, String resolution, Long duration) {
        super(id);
        this.name = name;
        this.resolution = resolution;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public Long getDuration() {
        return duration;
    }

    public void setDuration(Long duration) {
        this.duration = duration;
    }

    @Override
    public void play() {
        System.out.println("Movie " + this.name + " is playing with loud voice ...");
    }
}
