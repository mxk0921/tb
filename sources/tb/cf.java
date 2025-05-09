package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public abstract class cf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public bf f17022a;
    public df b;
    public String c;

    static {
        t2o.a(806355754);
    }

    public bf a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bf) ipChange.ipc$dispatch("75dfce34", new Object[]{this});
        }
        return this.f17022a;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1948dab8", new Object[]{this});
        }
        return this.c;
    }

    public df c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (df) ipChange.ipc$dispatch("82b519c6", new Object[]{this});
        }
        return this.b;
    }

    public void d(bf bfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87a591ae", new Object[]{this, bfVar});
        } else {
            this.f17022a = bfVar;
        }
    }

    public void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44725e26", new Object[]{this, str});
        } else {
            this.c = str;
        }
    }

    public void f(df dfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b3045d8", new Object[]{this, dfVar});
        } else {
            this.b = dfVar;
        }
    }
}
