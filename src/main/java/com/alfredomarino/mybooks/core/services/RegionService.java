package com.alfredomarino.mybooks.core.services;

import com.alfredomarino.mybooks.core.model.Region;

import java.util.List;

public interface RegionService {

    List<Region> getRegionsByCountryId(Long countryId);
}
