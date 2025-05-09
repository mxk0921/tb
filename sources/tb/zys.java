package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class zys {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final zys INSTANCE = new zys();
    public static final String TAO_LIVE_WATCH = "Page_TaobaoLiveWatch";

    static {
        t2o.a(1003487278);
    }

    public final String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f9b11adb", new Object[]{this});
        }
        String appKey = mhr.t().getAppKey();
        if (appKey == null) {
            return "";
        }
        return appKey;
    }

    public final boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2e1dad06", new Object[]{this})).booleanValue();
        }
        boolean b = ckf.b(a(), "25332598");
        boolean b2 = ckf.b(a(), "25443018");
        if (b || b2) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("756ac034", new Object[]{this})).booleanValue();
        }
        boolean b = ckf.b(a(), "21380790");
        boolean b2 = ckf.b(a(), "21646297");
        if (b || b2) {
            return true;
        }
        return false;
    }
}
