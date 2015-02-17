package br.com.ufpb.dispositivosmoveis.manualdofera;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Raphael on 17/02/2015.
 */
public class ManualDoAlunoDBCode extends SQLiteOpenHelper{

    private BDCode bdCode;
    private static final String DB_NAME = "db_manualDoAluno";
    private static final int DB_VERSION = 10;

    public ManualDoAlunoDBCode(Context context){
        super(context, DB_NAME, null, DB_VERSION);
        bdCode = new BDCode();
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        String[] tables = bdCode.getCreateTables();
        for (String s : tables){
            db.execSQL("CREATE TABLE " + s);
        }
        for (String s : bdCode.getInserts()){
            db.execSQL("INSERT INTO " + s);
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        for (String s : bdCode.getUpgradTables()){
            db.execSQL("DROP TABLE " + s);
        }
        onCreate(db);
    }
}
