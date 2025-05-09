package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.bundleInfo.BundleInfoManager;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class h49 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final h49 f20403a = new h49();

        static {
            t2o.a(676331527);
        }

        public static /* synthetic */ h49 a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (h49) ipChange.ipc$dispatch("987d4041", new Object[0]);
            }
            return f20403a;
        }
    }

    static {
        t2o.a(676331525);
    }

    public static h49 a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h49) ipChange.ipc$dispatch("5cc13906", new Object[0]);
        }
        return b.a();
    }

    public boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9d66f956", new Object[]{this, str})).booleanValue();
        }
        return BundleInfoManager.instance().getDynamicFeatures().contains(str);
    }

    public h49() {
    }
}
