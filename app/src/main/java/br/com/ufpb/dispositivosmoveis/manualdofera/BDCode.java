package br.com.ufpb.dispositivosmoveis.manualdofera;


import java.util.ArrayList;
import java.util.List;


public class BDCode{

    public String[] getCreateTables(){
        String[] tables = new String[3];
        tables[0] = "disciplinas(id integer primary key not null, nome varchar not null,"+
                "credito integer not null, cargaHoraria integer, obrigatoria char" +
                "curso integer, FOREIGN KEY(curso) REFERENCES curso(id))";
        tables[1] = "curso(id integer primary key not null, nome varchar not null" +
                "descricao varchar, disciplina integer," +
                "FOREIGN KEY(disciplina) REFERENCES disciplinas(id))";
        tables[2] = "firstOpen(id integer primary key not null, first char not null)";
        return tables;
    }

    public List<String> getInserts(){
        List<String> inserts = new ArrayList<>();

        inserts.add("curso VALUES (1110,'Lic. em Ciência da Computação','teste',3106)");
        inserts.add("disciplinas VALUES (3106, 'Introdução ao Computador',4,60,'t',1110)");
        inserts.add("firstOpen VALUES (001, F)");

        return inserts;
    }

    public String[] getUpgradTables(){
        String[] upgradeTables = new String[3];
        upgradeTables[0] = "DROP TABLE disciplinas";
        upgradeTables[1] = "DROP TABLE curso";
        upgradeTables[2] = "DROP TABLE firstOpen";
        return upgradeTables;
    }

}
