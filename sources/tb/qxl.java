package tb;

import android.os.Handler;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.downgrade.rule.DefaultRule;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class qxl implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int d = 60;

    /* renamed from: a  reason: collision with root package name */
    private final Handler f26984a;
    private final vnq b;
    private DefaultRule c;

    public qxl(Handler handler, vnq vnqVar) {
        this.f26984a = handler;
        this.b = vnqVar;
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a02127e2", new Object[]{this});
        } else {
            this.f26984a.removeCallbacks(this);
        }
    }

    private DefaultRule b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DefaultRule) ipChange.ipc$dispatch("32e0fc8", new Object[]{this});
        }
        if (this.c == null) {
            this.c = this.b.b("default");
        }
        return this.c;
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
        } else {
            this.f26984a.postDelayed(this, 60000L);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        DefaultRule b = b();
        if (b != null) {
            i = tvn.e(b.dataPickRate, 60);
            if (i <= 0) {
                a();
                return;
            }
            xxl.a(b);
        }
        this.f26984a.postDelayed(this, Math.max(i, 60) * 1000);
    }
}
