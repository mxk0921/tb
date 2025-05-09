package tb;

import android.app.Activity;
import android.util.Pair;
import com.alibaba.android.aura.datamodel.nextrpc.AURANextRPCEndpoint;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class rn0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final g4o f27480a;
    public final Pair<Integer, g4o> b;

    static {
        t2o.a(301989910);
    }

    public rn0(Activity activity) {
        this(activity, false);
    }

    public final void a(AURANextRPCEndpoint aURANextRPCEndpoint) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eeecea79", new Object[]{this, aURANextRPCEndpoint});
            return;
        }
        Map<String, String> f = f();
        if (f != null) {
            aURANextRPCEndpoint.appendParams(f);
        }
        Map<String, String> e = e();
        if (f != null) {
            aURANextRPCEndpoint.appendHeaders(e);
        }
    }

    public AURANextRPCEndpoint b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURANextRPCEndpoint) ipChange.ipc$dispatch("63122f5d", new Object[]{this});
        }
        AURANextRPCEndpoint a2 = this.f27480a.c().a();
        a(a2);
        return a2;
    }

    public AURANextRPCEndpoint c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURANextRPCEndpoint) ipChange.ipc$dispatch("8a7750", new Object[]{this});
        }
        AURANextRPCEndpoint a2 = this.f27480a.d().a();
        a(a2);
        return a2;
    }

    public AURANextRPCEndpoint d(rk rkVar, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURANextRPCEndpoint) ipChange.ipc$dispatch("f4bb733d", new Object[]{this, rkVar, new Boolean(z), new Boolean(z2)});
        }
        AURANextRPCEndpoint c = this.f27480a.d().c(rkVar, z, z2);
        a(c);
        return c;
    }

    public Map<String, String> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("7a812bd7", new Object[]{this});
        }
        return null;
    }

    public Map<String, String> f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("2812908d", new Object[]{this});
        }
        return null;
    }

    public g4o g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g4o) ipChange.ipc$dispatch("b8ba5a18", new Object[]{this});
        }
        return this.f27480a;
    }

    public AURANextRPCEndpoint h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURANextRPCEndpoint) ipChange.ipc$dispatch("54722526", new Object[]{this});
        }
        AURANextRPCEndpoint a2 = this.f27480a.e().a();
        a(a2);
        return a2;
    }

    public rn0(Activity activity, boolean z) {
        if (!z) {
            this.f27480a = new g4o(activity);
        } else if (this.b == null) {
            this.b = new Pair<>(Integer.valueOf(System.identityHashCode(activity)), new g4o(activity));
        }
    }
}
