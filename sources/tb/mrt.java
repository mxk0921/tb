package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class mrt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final xae f24263a = new vsw(5, "wv-vthread-");
    public static final wae b = new osw(5, "u4sdk-pool-");

    public static xae a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xae) ipChange.ipc$dispatch("eed17bf5", new Object[0]);
        }
        return f24263a;
    }

    public static wae b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wae) ipChange.ipc$dispatch("5130a296", new Object[0]);
        }
        return b;
    }

    static {
        t2o.a(989856405);
    }
}
