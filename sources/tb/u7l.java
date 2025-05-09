package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class u7l {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f29209a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public u7l(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.f29209a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "Option{ dumpEnabled=" + this.f29209a + ", arrangeEnabled=" + this.b + ", replyOnlyEnabled=" + this.c + ", receiverEnabled=" + this.d + ", qosScheduleEnabled=" + this.e + " }";
    }
}
