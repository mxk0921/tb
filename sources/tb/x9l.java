package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class x9l {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Boolean f31235a = null;
    public static Boolean b = null;
    public static Boolean c = null;

    static {
        t2o.a(779093098);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3f0d11a5", new Object[0])).booleanValue();
        }
        if (c == null) {
            c = Boolean.valueOf(Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("tblive", "enableLivePreLoad", "true")));
        }
        return c.booleanValue();
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88979d68", new Object[0])).booleanValue();
        }
        if (b == null) {
            b = Boolean.valueOf(Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("tblive", "enablePreCreateJSB", "true")));
        }
        return b.booleanValue();
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dbb9ef62", new Object[0])).booleanValue();
        }
        if (f31235a == null) {
            f31235a = Boolean.valueOf(Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("tblive", "enablePreCreateRecRoom", "true")));
        }
        return f31235a.booleanValue();
    }
}
