package br.edu.utfpr.dv.siacoes.dao;

import br.edu.utfpr.dv.siacoes.model.BugReport;

public abstract class ListDAO {
    public abstract boolean identifica(String Identificador);

    public List<Identificador> listAll() throws SQLException{
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try{
            conn = ConnectionDAO.getInstance().getConnection();
            stmt = conn.createStatement();

            List<Identificador> list = new ArrayList<Identificador>();

            while(rs.next()){
                list.add(this.loadObject(rs));
            }


            return list;
        }finally{
            if((rs != null) && !rs.isClosed())
                rs.close();
            if((stmt != null) && !stmt.isClosed())
                stmt.close();
            if((conn != null) && !conn.isClosed())
                conn.close();
        }
    }
}


