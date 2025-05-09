package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alivfssdk.cache.AVFSCacheManager;
import com.taobao.orange.OrangeConfig;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class h7h extends rp {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CACHE_MODULE_NAME = "MyTaobao";
    public static h7h e;

    public h7h() {
        this.f27521a = AVFSCacheManager.getInstance().cacheForModule("MyTaobao").Z(h7h.class.getClassLoader()).L(new op()).F(true);
    }

    public static h7h g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h7h) ipChange.ipc$dispatch("f5f95f8a", new Object[0]);
        }
        if (e == null) {
            synchronized (h7h.class) {
                try {
                    if (e == null) {
                        e = new h7h();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return e;
    }

    public static /* synthetic */ Object ipc$super(h7h h7hVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/global/setting/data/LocalCacheManager");
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5dc478cf", new Object[]{this})).booleanValue();
        }
        try {
            return Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("mytaobao_setting_sdk", "enableCacheUserProfile", "true"));
        } catch (Exception unused) {
            return false;
        }
    }
}
