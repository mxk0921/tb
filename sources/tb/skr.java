package tb;

import android.content.Context;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.proxy.tbliveinteractive.IInteractiveProxy;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class skr implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ViewGroup f28117a;
    public final /* synthetic */ String b;
    public final /* synthetic */ IInteractiveProxy.a c;
    public final /* synthetic */ ukr d;

    public skr(ukr ukrVar, ViewGroup viewGroup, String str, IInteractiveProxy.a aVar) {
        this.d = ukrVar;
        this.f28117a = viewGroup;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        ukr ukrVar = this.d;
        Context D = ukr.D(this.d);
        ukr ukrVar2 = this.d;
        ViewGroup viewGroup = this.f28117a;
        bce E = ukr.E(ukrVar2);
        String str = this.b;
        khf F = ukr.F(this.d);
        if (ukr.G(this.d) == null || !ukr.G(this.d).t()) {
            z = false;
        } else {
            z = true;
        }
        ukr.C(ukrVar, new qoa(D, ukrVar2, viewGroup, E, str, F, z));
        ukr.B(this.d).t(ukr.H(this.d));
        qoa B = ukr.B(this.d);
        String I = ukr.I(this.d);
        ukr ukrVar3 = this.d;
        B.f(I, ukrVar3, ukr.J(ukrVar3));
        if (ukr.K(this.d) != null) {
            ukr.K(this.d).I(ukr.B(this.d));
        }
        this.d.o("TBLiveWVPlugin.Event.nativeEnvReady", "");
    }
}
