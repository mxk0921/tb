package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_ability.page.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class e5x {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static e5x f18302a;

    static {
        t2o.a(980418606);
    }

    public static e5x b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e5x) ipChange.ipc$dispatch("d4853000", new Object[0]);
        }
        if (f18302a == null) {
            synchronized (e5x.class) {
                try {
                    if (f18302a == null) {
                        f18302a = new e5x();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f18302a;
    }

    public mpb a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mpb) ipChange.ipc$dispatch("454293", new Object[]{this});
        }
        return null;
    }

    public a c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("974fe4f0", new Object[]{this});
        }
        return null;
    }

    public lpd d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lpd) ipChange.ipc$dispatch("fce9c5c1", new Object[]{this});
        }
        return m3x.a();
    }
}
