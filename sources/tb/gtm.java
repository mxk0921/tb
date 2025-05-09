package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class gtm implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ boolean f20223a;
    public final /* synthetic */ String b;
    public final /* synthetic */ ddt c;
    public final /* synthetic */ ftm d;

    public gtm(ftm ftmVar, boolean z, String str, ddt ddtVar) {
        this.d = ftmVar;
        this.f20223a = z;
        this.b = str;
        this.c = ddtVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        if (this.f20223a) {
            ftm.a(this.d);
        }
        ftm.b(this.d, this.b, this.c);
    }
}
