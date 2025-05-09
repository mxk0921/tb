package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class f3w {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String NOT_WEEX_CHANNEL_VERSION = "1";
    public static final String NOT_WEEX_FRIEND_VERSION = "1";
    public static final String WEEX_CHANNEL_VERSION = "2";
    public static final String WEEX_FRIEND_VERSION = "2";

    /* renamed from: a  reason: collision with root package name */
    public static String f18986a = "2";

    static {
        t2o.a(665845773);
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("94909b89", new Object[0]);
        }
        return f18986a;
    }

    public static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6822c4", new Object[]{str});
        }
    }

    public static void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39c5640d", new Object[]{str});
        } else {
            f18986a = str;
        }
    }
}
