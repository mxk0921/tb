package tb;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.messagekit.base.MsgRouter;
import com.taobao.tao.messagekit.base.monitor.MonitorManager;
import com.taobao.tao.messagekit.core.utils.MsgLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ip6 extends SQLiteOpenHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(628097169);
    }

    public ip6(Context context, String str) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 5);
    }

    public static /* synthetic */ Object ipc$super(ip6 ip6Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/messagekit/core/utils/DataBaseHelper");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6815e47b", new Object[]{this, sQLiteDatabase});
            return;
        }
        try {
            for (MonitorManager.e eVar : MsgRouter.e().f().c()) {
                fy1.d(sQLiteDatabase, eVar.sysCode());
            }
        } catch (Exception e) {
            MsgLog.f("DataBase", e, new Object[0]);
            e.printStackTrace();
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9203621d", new Object[]{this, sQLiteDatabase, new Integer(i), new Integer(i2)});
            return;
        }
        for (MonitorManager.e eVar : MsgRouter.e().f().c()) {
            fy1.y(sQLiteDatabase, eVar.sysCode(), i, i2);
        }
    }
}
