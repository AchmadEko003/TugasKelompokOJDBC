/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author Nine
 */
public class Region {
    private int regionId;
    private String regionName;

//    //constructor
//    public Region(int regionId, String regionName) {
//        this.regionId = regionId;
//        this.regionName = regionName;
//    }

    public Region() {
        
    }

    /**
     * @return the regionId
     */
    public int getRegionId() {
        return regionId;
    }

    /**
     * @param regionId the regionId to set
     */
    public void setRegionId(int regionId) {
        this.regionId = regionId;
    }

    
    /**
     * @return the regionName
     */
    public String getRegionName() {
        return regionName;
    }

    public Region(int regionId, String regionName) {
        this.regionId = regionId;
        this.regionName = regionName;
    }

    /**
     * @param regionName the regionName to set
     */
    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

}
