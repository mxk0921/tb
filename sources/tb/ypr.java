package tb;

import com.android.alibaba.ip.runtime.IpChange;
import tb.xpr;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ypr implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f32269a;
    public final /* synthetic */ String b;
    public final /* synthetic */ xpr.j c;

    public ypr(xpr.j jVar, int i, String str) {
        this.c = jVar;
        this.f32269a = i;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
        } else {
            this.c.b(this.f32269a, this.b);
        }
    }
}
