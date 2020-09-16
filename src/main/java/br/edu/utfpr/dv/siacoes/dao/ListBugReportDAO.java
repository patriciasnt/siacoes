package br.edu.utfpr.dv.siacoes.dao;

import br.edu.utfpr.dv.siacoes.model.BugReport;

public class ListBugReportDAO extends ListDAO {
    ResultSet rs= stmt.executeQuery("SELECT bugreport.*, \"user\".name " +
            "FROM bugreport INNER JOIN \"user\" ON \"user\".idUser=bugreport.idUser " +
            "ORDER BY status, reportdate");

    @java.lang.Override
    public boolean identifica(String Identificador);

    String Identificador = "BugReport";

    }

