package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class fzp implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ long f19648a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ gzp d;

    public fzp(gzp gzpVar, long j, int i, int i2) {
        this.d = gzpVar;
        this.f19648a = j;
        this.b = i;
        this.c = i2;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
        } else if (gzp.l(this.d) != null && this.d.f19548a.getHeight() > 0) {
            gzp.l(this.d).a(this.f19648a, this.b, this.c);
        }
    }
}
