package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class spp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(766509549);
    }

    public static final boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4189764a", new Object[]{str})).booleanValue();
        }
        return ckf.b("allitems", str);
    }

    public static final boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eeeb45f2", new Object[]{str})).booleanValue();
        }
        return ckf.b(mop.KEY_SHOP_INDEX, str);
    }

    public static final boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5cb6d69", new Object[]{str})).booleanValue();
        }
        return ckf.b("live", str);
    }
}
