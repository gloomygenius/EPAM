package com.epam.homework.oop.t03;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class StationeryTest {
    ArrayList<Stationery> listOfNewStaff = new ArrayList<>();
    {
        listOfNewStaff.add(new OfficeTool(OfficeTool.typeOfOfficeToolEnum.STAPLER));
        listOfNewStaff.add(new OfficeTool(OfficeTool.typeOfOfficeToolEnum.SCISSORS));
        listOfNewStaff.add(new OfficeTool(OfficeTool.typeOfOfficeToolEnum.STAPLER));
    }
    @Test
    void te

}