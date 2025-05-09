package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class emr {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Object b = new Object();
    public static emr c;

    /* renamed from: a  reason: collision with root package name */
    public avd f18680a;

    static {
        t2o.a(806355877);
    }

    public static emr b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (emr) ipChange.ipc$dispatch("29fd026b", new Object[0]);
        }
        if (c == null) {
            synchronized (b) {
                try {
                    if (c == null) {
                        c = new emr();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return c;
    }

    public avd a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (avd) ipChange.ipc$dispatch("a02428c5", new Object[]{this});
        }
        return this.f18680a;
    }

    public void c(avd avdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fb292e1", new Object[]{this, avdVar});
        } else {
            this.f18680a = avdVar;
        }
    }
}
