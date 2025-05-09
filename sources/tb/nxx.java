package tb;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class nxx extends SQLiteOpenHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public nxx(Context context, String str) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 2);
    }

    public static /* synthetic */ Object ipc$super(nxx nxxVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/uploader/implement/c/b");
    }

    public final void a(SQLiteDatabase sQLiteDatabase, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbe4fab", new Object[]{this, sQLiteDatabase, str});
        } else if (!TextUtils.isEmpty(str)) {
            sQLiteDatabase.execSQL("drop table " + str);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6815e47b", new Object[]{this, sQLiteDatabase});
            return;
        }
        sQLiteDatabase.execSQL("CREATE TABLE multi_phase_resume_task (_id INTEGER PRIMARY KEY AUTOINCREMENT,fileId TEXT,bizType TEXT,filePath TEXT,fileType TEXT,metaInfo TEXT,progress INTEGER,resumeOffset LONG,fileCreateTime LONG,env INTEGER,phaseIndex INTEGER,md5 TEXT,uploadStat TEXT)");
        sQLiteDatabase.execSQL("CREATE TABLE single_phase_task (_id INTEGER PRIMARY KEY AUTOINCREMENT,fileId TEXT,bizType TEXT,filePath TEXT,fileType TEXT,metaInfo TEXT,progress INTEGER,resumeOffset LONG,fileCreateTime LONG,env INTEGER,phaseIndex INTEGER,md5 TEXT,uploadStat TEXT)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1967076", new Object[]{this, sQLiteDatabase, new Integer(i), new Integer(i2)});
            return;
        }
        a(sQLiteDatabase, "multi_phase_resume_task");
        a(sQLiteDatabase, "single_phase_task");
        onCreate(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9203621d", new Object[]{this, sQLiteDatabase, new Integer(i), new Integer(i2)});
            return;
        }
        a(sQLiteDatabase, "multi_phase_resume_task");
        a(sQLiteDatabase, "single_phase_task");
        onCreate(sQLiteDatabase);
    }
}
