package tb;

import android.util.Log;
import com.ali.alidatabasees.CallableStatement;
import com.ali.alidatabasees.DBConfig;
import com.ali.alidatabasees.Database;
import com.ali.alidatabasees.PreparedStatement;
import com.ali.alidatabasees.Result;
import com.ali.alidatabasees.ResultSet;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ep0 extends up {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Database f18735a;

    public ep0(String str, int i) {
        super(str, i);
        DBConfig dBConfig = new DBConfig(str);
        if (ABGlobal.isFeatureOpened(null, "journal_mode_truncate")) {
            dBConfig.setJournalMode("TRUNCATE");
        }
        this.f18735a = Database.d(dBConfig);
    }

    public static /* synthetic */ Object ipc$super(ep0 ep0Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/alivfsadapter/database/alidatabase/AliDatabaseESImpl");
    }

    @Override // tb.up
    public int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e32ba672", new Object[]{this})).intValue();
        }
        return 0;
    }

    @Override // tb.up
    public boolean d(String str) throws Exception {
        Result d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eb5dffcf", new Object[]{this, str})).booleanValue();
        }
        Database database = this.f18735a;
        if (database == null) {
            Log.e("AliDatabaseES", "database is null, this may not happen");
            return false;
        }
        CallableStatement c = database.c(str);
        if (c == null || (d = c.d()) == null) {
            return false;
        }
        d.b();
        c.b();
        return true;
    }

    @Override // tb.up
    public boolean e(String str, Object[] objArr) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("24ea98a", new Object[]{this, str, objArr})).booleanValue();
        }
        Database database = this.f18735a;
        if (database == null) {
            Log.e("AliDatabaseES", "database is null, this may not happen");
            return false;
        }
        PreparedStatement e = database.e(str);
        if (e == null) {
            return false;
        }
        if (objArr != null && objArr.length != e.e()) {
            throw new RuntimeException("arguments count does not match");
        } else if (objArr == null) {
            return false;
        } else {
            int i = 0;
            for (Object obj : objArr) {
                i++;
                if (obj instanceof Integer) {
                    e.h(i, ((Integer) obj).intValue());
                } else if ((obj instanceof Float) || (obj instanceof Double)) {
                    e.g(i, ((Double) obj).doubleValue());
                } else if (obj instanceof String) {
                    e.i(i, (String) obj);
                } else if (obj instanceof byte[]) {
                    e.f(i, (byte[]) obj);
                }
            }
            Result d = e.d();
            if (d != null) {
                d.b();
                e.b();
            }
            if (d != null) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: f */
    public dp0 b(String str) throws Exception {
        ResultSet c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dp0) ipChange.ipc$dispatch("8e14750e", new Object[]{this, str});
        }
        Database database = this.f18735a;
        if (database == null) {
            Log.e("AliDatabaseES", "database is null, this may not happen");
            return null;
        }
        CallableStatement c2 = database.c(str);
        if (c2 == null || (c = c2.c()) == null) {
            return null;
        }
        return new dp0(c2, c);
    }

    /* renamed from: g */
    public dp0 c(String str, Object[] objArr) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dp0) ipChange.ipc$dispatch("fbeeba6f", new Object[]{this, str, objArr});
        }
        Database database = this.f18735a;
        if (database == null) {
            Log.e("AliDatabaseES", "database is null, this may not happen");
            return null;
        }
        PreparedStatement e = database.e(str);
        if (e != null) {
            if (objArr != null && objArr.length != e.e()) {
                throw new RuntimeException("arguments count does not match");
            } else if (objArr != null) {
                int i = 0;
                for (Object obj : objArr) {
                    i++;
                    if (obj instanceof Integer) {
                        e.h(i, ((Integer) obj).intValue());
                    } else if ((obj instanceof Float) || (obj instanceof Double)) {
                        e.g(i, ((Double) obj).doubleValue());
                    } else if (obj instanceof String) {
                        e.i(i, (String) obj);
                    } else if (obj instanceof byte[]) {
                        e.f(i, (byte[]) obj);
                    }
                }
                return new dp0(e, e.c());
            }
        }
        return null;
    }

    public ep0(String str, String str2, int i) {
        super(str, str2, i);
        DBConfig dBConfig = new DBConfig(str);
        dBConfig.setKey(str2);
        if (ABGlobal.isFeatureOpened(null, "journal_mode_truncate")) {
            dBConfig.setJournalMode("TRUNCATE");
        }
        this.f18735a = Database.d(dBConfig);
    }
}
