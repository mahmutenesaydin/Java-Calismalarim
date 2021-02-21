/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author abc
 */
public class City
{
    private int _id;
    private String _name;
    private String _countryCode;
    private String _district;
    private int _population;

    public City(int _id, String _name, String _countryCode, String _district, int _population)
    {
        this._id = _id;
        this._name = _name;
        this._countryCode = _countryCode;
        this._district = _district;
        this._population = _population;
    }

    public int getId() {
        return _id;
    }

    public void setId(int id) {
        _id = id;
    }

    public String getName() {
        return _name;
    }

    public void setName(String name) {
        _name = name;
    }

    public String getCountryCode() {
        return _countryCode;
    }

    public void setCountryCode(String countryCode) {
        _countryCode = countryCode;
    }

    public String getDistrict() {
        return _district;
    }

    public void setDistrict(String district) {
        _district = district;
    }

    public int getPopulation() {
        return _population;
    }

    public void setPopulation(int population) {
        _population = population;
    }
    
    
    
}
