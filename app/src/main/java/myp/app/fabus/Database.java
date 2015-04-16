package myp.app.fabus;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by DELL on 16-Apr-15.
 */
public class Database extends SQLiteOpenHelper {

    public static final int DatabaseVersion = 1;

    public static final String DatabaseCreateQuery = "CREATE TABLE "
            + Table.TableCol.tbName + "("
            + Table.TableCol.friend + " VARCHAR(10),"
            + Table.TableCol.que + " INT,"
            + Table.TableCol.trial + " INT,"
            + Table.TableCol.output +" INT"
            + ");";


    public Database(Context context)  {
        super(context, Table.TableCol.dbName, null, DatabaseVersion);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(DatabaseCreateQuery);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {


    }

    public void putInfo(Database dop,String friend,Integer que,Integer trial,Integer output) {
        SQLiteDatabase sqdb = dop.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(Table.TableCol.friend,friend);
        cv.put(Table.TableCol.que,que);
        cv.put(Table.TableCol.trial,trial);
        cv.put(Table.TableCol.output,output);
        long k = sqdb.insert(Table.TableCol.tbName,null,cv);
    }

    public Cursor getInfo(Database dop) {
        SQLiteDatabase sqdb = dop.getReadableDatabase();
        String[] columns ={Table.TableCol.friend,Table.TableCol.que,Table.TableCol.trial,Table.TableCol.output};
        Cursor cr = sqdb.query(Table.TableCol.tbName,columns,null,null,null,null,null);
        return cr;
    }

}
