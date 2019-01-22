package com.stackroute.lombokDemo.service;

import com.stackroute.lombokDemo.domain.Track;
import com.stackroute.lombokDemo.exceptions.NullValuesPassed;
import com.stackroute.lombokDemo.exceptions.TrackAlreadyExists;
import com.stackroute.lombokDemo.exceptions.TrackDoesNotExists;


import java.util.List;

public interface TrackService {

    public Track saveTrack(Track track) throws TrackAlreadyExists, NullValuesPassed;

    public List<Track> getAllTracks();

    public Track getTrackById(int trackId) throws TrackDoesNotExists;

    public Track updateTrack(Track track) throws TrackDoesNotExists;

    public Track deleteTrack(int id)throws TrackDoesNotExists;
}

