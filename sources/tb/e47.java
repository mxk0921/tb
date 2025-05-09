package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class e47 implements bfe {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f18254a;

    static {
        t2o.a(996147277);
        t2o.a(996147207);
        f18254a = false;
        try {
            f18254a = true;
        } catch (NoClassDefFoundError unused) {
        }
    }

    public dtj a(cuj cujVar) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dtj) ipChange.ipc$dispatch("480c6f32", new Object[]{this, cujVar});
        }
        if (f18254a) {
            return new ub(cujVar);
        }
        return new ihq(cujVar);
    }
}
