package br.edu.utfpr.dv.siacoes.dao;

public class ListActivityUnitDAO extends ListDAO {
    ResultSet rs= sstmt.executeQuery("SELECT * FROM activityunit ORDER BY description");

    @Override
    public boolean identifica(String Identificador);

    String Identificador = "ActivituUnit";
}
