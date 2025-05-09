package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class bsw {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static bsw b;

    /* renamed from: a  reason: collision with root package name */
    public asw f16609a;

    static {
        t2o.a(989855748);
    }

    public static bsw b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bsw) ipChange.ipc$dispatch("d491b3d3", new Object[0]);
        }
        if (b == null) {
            synchronized (bsw.class) {
                try {
                    if (b == null) {
                        b = new bsw();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return b;
    }

    public asw a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (asw) ipChange.ipc$dispatch("2e233521", new Object[]{this});
        }
        if (this.f16609a == null) {
            this.f16609a = new asw();
        }
        return this.f16609a;
    }
}
