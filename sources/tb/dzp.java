package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class dzp implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ gwp f18181a;
    public final /* synthetic */ gzp b;

    public dzp(gzp gzpVar, gwp gwpVar) {
        this.b = gzpVar;
        this.f18181a = gwpVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
        } else if (gzp.f(this.b) == null) {
            gzp.g(this.b, this.f18181a.a(), gzp.SHOWCASE_SOURCE_STASH_POP, false);
        }
    }
}
