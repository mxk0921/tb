package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class gvr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final long f20259a = System.currentTimeMillis();
    public long b = 0;
    public long c = 0;
    public long d = 0;
    public long e = 0;
    public String f = "";
    public String g = "";
    public String h = "";
    public String i = "";
    public String j = "";
    public String k = "";
    public long l = 0;

    static {
        t2o.a(824180784);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return String.format("[%s][%d/%d][%dKB/%dKB/%d][%dKB][%s/%sms/%s/%sms][%s/%s]", y74.g(this.f20259a), Long.valueOf(this.b), Long.valueOf(this.c), Long.valueOf(this.d), Long.valueOf(this.e), Long.valueOf((this.d * 100) / this.e), Long.valueOf(this.l), this.f, this.g, this.h, this.i, this.j, this.k);
    }
}
