package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class j7j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f21820a;
    public final int b;
    public final boolean c;
    public final int d;

    static {
        t2o.a(919601223);
    }

    public j7j(String str, int i, boolean z, int i2) {
        ckf.g(str, "traceId");
        this.f21820a = str;
        this.b = i;
        this.c = z;
        this.d = i2;
    }

    public final String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9afc202f", new Object[]{this});
        }
        return this.f21820a;
    }

    public final boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9555254c", new Object[]{this})).booleanValue();
        }
        return this.c;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "MtopStatistics(traceId='" + this.f21820a + "', responseCode=" + this.b + ", isPrefetch=" + this.c + ", isCache=" + this.d + ')';
    }
}
