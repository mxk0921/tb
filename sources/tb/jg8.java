package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class jg8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static jg8 f21985a;

    static {
        t2o.a(455082033);
    }

    public static jg8 a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jg8) ipChange.ipc$dispatch("4bc91003", new Object[0]);
        }
        if (f21985a == null) {
            f21985a = new jg8();
        }
        return f21985a;
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a59fb54", new Object[]{this})).booleanValue();
        }
        return false;
    }
}
