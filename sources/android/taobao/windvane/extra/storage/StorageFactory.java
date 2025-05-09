package android.taobao.windvane.extra.storage;

import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;
import tb.vpw;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class StorageFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(989856025);
    }

    private StorageFactory() {
    }

    public static IStorage createStorageInstance(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IStorage) ipChange.ipc$dispatch("cd8da0f7", new Object[]{str});
        }
        if (vpw.commonConfig.Z1) {
            return new ProtoDBStorageImpl(str);
        }
        return new WVStorageImpl(str);
    }
}
