package dao;

import entity.EmplProj;

import java.sql.SQLException;
import java.util.List;

public interface EmplProjDAO {
    //create
    void add(EmplProj emplProj) throws SQLException;

    //read
    List<EmplProj> getAll() throws SQLException;

    EmplProj getByEmployeeIdAndProjectId(Long id, Long projectId) throws SQLException;

    //update
    void update(EmplProj emplProj) throws SQLException;

    //delete
    void remove(EmplProj emplProj) throws SQLException;
}
