package android.taobao.windvane.extra.storage;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alivfssdk.cache.AVFSCacheManager;
import tb.fdb;
import tb.np;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class WVStorageImpl implements IStorage {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private fdb mAvfsCache;
    private String mNamespace;

    static {
        t2o.a(989856026);
        t2o.a(989856022);
    }

    public WVStorageImpl(String str) {
        np cacheForModule;
        this.mNamespace = str;
        AVFSCacheManager instance = AVFSCacheManager.getInstance();
        if (instance != null && (cacheForModule = instance.cacheForModule(str)) != null) {
            this.mAvfsCache = cacheForModule.C();
        }
    }

    @Override // android.taobao.windvane.extra.storage.IStorage
    public String read(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5a0eb7d9", new Object[]{this, str});
        }
        fdb fdbVar = this.mAvfsCache;
        if (fdbVar != null) {
            return (String) fdbVar.d0(str);
        }
        return null;
    }

    @Override // android.taobao.windvane.extra.storage.IStorage
    public boolean remove(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("39af3819", new Object[]{this, str})).booleanValue();
        }
        fdb fdbVar = this.mAvfsCache;
        if (fdbVar != null) {
            return fdbVar.A0(str);
        }
        return false;
    }

    @Override // android.taobao.windvane.extra.storage.IStorage
    public boolean write(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1b6c0efe", new Object[]{this, str, str2})).booleanValue();
        }
        fdb fdbVar = this.mAvfsCache;
        if (fdbVar != null) {
            return fdbVar.N(str, str2);
        }
        return false;
    }
}
