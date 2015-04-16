package myp.app.fabus;

import android.provider.BaseColumns;

/**
 * Created by DELL on 16-Apr-15.
 */
public class Table {

    public Table(){

    }

    public static abstract class TableCol implements BaseColumns {
        public static final String dbName = "fab_us";
        public static final String tbName = "que_status";
        public static final String friend = "friend_name";
        public static final String que = "que_no";
        public static final String trial = "user_trial";
        public static final String output = "user_ans";
    }

}
