package android.taobao.windvane.extra.storage;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.protodb.Config;
import com.taobao.android.protodb.LSDB;
import com.taobao.android.riverlogger.RVLLevel;
import tb.k3g;
import tb.lcn;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ProtoDBStorageImpl implements IStorage {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final LSDB mLSDB;

    static {
        t2o.a(989856023);
        t2o.a(989856022);
    }

    public ProtoDBStorageImpl(String str) {
        LSDB lsdb;
        Config config = new Config();
        config.walSize = 2097152;
        try {
            lsdb = LSDB.open(str, config);
        } catch (Exception e) {
            RVLLevel rVLLevel = RVLLevel.Error;
            lcn.f(rVLLevel, "WindVane/Storage", "open error: " + e.getMessage());
            lsdb = null;
        }
        this.mLSDB = lsdb;
    }

    @Override // android.taobao.windvane.extra.storage.IStorage
    public String read(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5a0eb7d9", new Object[]{this, str});
        }
        LSDB lsdb = this.mLSDB;
        if (lsdb != null) {
            return lsdb.getString(new k3g(str));
        }
        return null;
    }

    @Override // android.taobao.windvane.extra.storage.IStorage
    public boolean remove(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("39af3819", new Object[]{this, str})).booleanValue();
        }
        LSDB lsdb = this.mLSDB;
        if (lsdb != null) {
            return lsdb.delete(new k3g(str));
        }
        return false;
    }

    @Override // android.taobao.windvane.extra.storage.IStorage
    public boolean write(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1b6c0efe", new Object[]{this, str, str2})).booleanValue();
        }
        LSDB lsdb = this.mLSDB;
        if (lsdb != null) {
            return lsdb.insertString(new k3g(str), str2);
        }
        return false;
    }
}
