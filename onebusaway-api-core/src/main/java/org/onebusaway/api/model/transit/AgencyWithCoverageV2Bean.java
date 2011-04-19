package org.onebusaway.api.model.transit;

import java.io.Serializable;

public class AgencyWithCoverageV2Bean implements Serializable {

  private static final long serialVersionUID = 1L;

  private String agencyId;

  private double lat;

  private double lon;
  
  private double latSpan;
  
  private double lonSpan;

  public String getAgencyId() {
    return agencyId;
  }

  public void setAgencyId(String agencyId) {
    this.agencyId = agencyId;
  }

  public double getLat() {
    return lat;
  }

  public void setLat(double lat) {
    this.lat = lat;
  }

  public double getLon() {
    return lon;
  }

  public void setLon(double lon) {
    this.lon = lon;
  }

  public double getLatSpan() {
    return latSpan;
  }

  public void setLatSpan(double latSpan) {
    this.latSpan = latSpan;
  }

  public double getLonSpan() {
    return lonSpan;
  }

  public void setLonSpan(double lonSpan) {
    this.lonSpan = lonSpan;
  }
}