package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class w6s {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile w6s b;

    /* renamed from: a  reason: collision with root package name */
    public s6s f30488a;

    static {
        t2o.a(860880905);
    }

    public static w6s b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w6s) ipChange.ipc$dispatch("d5da8493", new Object[0]);
        }
        if (b == null) {
            synchronized (w6s.class) {
                try {
                    if (b == null) {
                        b = new w6s();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return b;
    }

    public s6s a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (s6s) ipChange.ipc$dispatch("6ba3a9b3", new Object[]{this});
        }
        return this.f30488a;
    }

    public s6s c(s6s s6sVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (s6s) ipChange.ipc$dispatch("905af3f9", new Object[]{this, s6sVar});
        }
        if (s6sVar != null) {
            this.f30488a = s6sVar;
        }
        return this.f30488a;
    }
}
