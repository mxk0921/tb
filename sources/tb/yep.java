package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class yep {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final yep INSTANCE = new yep();

    /* renamed from: a  reason: collision with root package name */
    public static final String f32023a = "";

    static {
        t2o.a(758120580);
    }

    public final String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f8ede3e", new Object[]{this});
        }
        return f32023a;
    }
}
