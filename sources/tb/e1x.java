package tb;

import android.taobao.windvane.extra.uc.WVUCWebView;
import android.taobao.windvane.standardmodal.WVStandardEventCenter;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class e1x implements d3d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final fmo f18218a;

    static {
        t2o.a(815793717);
        t2o.a(815793697);
    }

    public e1x(fmo fmoVar) {
        this.f18218a = fmoVar;
    }

    @Override // tb.d3d
    public void C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc762f42", new Object[]{this});
        } else {
            b("TBSearch.Event.onrequeststart");
        }
    }

    @Override // tb.d3d
    public void D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c46f5fee", new Object[]{this});
        } else {
            d(true);
        }
    }

    @Override // tb.d3d
    public void E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82f09118", new Object[]{this});
        } else {
            d(false);
        }
    }

    @Override // tb.d3d
    public void F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b77c5fb", new Object[]{this});
        } else {
            c(false);
        }
    }

    @Override // tb.d3d
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24c202c9", new Object[]{this});
        } else {
            c(true);
        }
    }

    public final void b(String str) {
        WVUCWebView t2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b32c451a", new Object[]{this, str});
            return;
        }
        fmo fmoVar = this.f18218a;
        if (fmoVar != null && (t2 = fmoVar.t2()) != null) {
            WVStandardEventCenter.postNotificationToJS(t2, str, "{}");
        }
    }

    public final void c(boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dfb79b1", new Object[]{this, new Boolean(z)});
            return;
        }
        if (z) {
            str = "TBSearch.Event.onviewappear";
        } else {
            str = "TBSearch.Event.ondisappear";
        }
        b(str);
    }

    public final void d(boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1dfd191", new Object[]{this, new Boolean(z)});
            return;
        }
        if (z) {
            str = "TBSearch.Event.onhalfappear";
        } else {
            str = "TBSearch.Event.onhalfdisappear";
        }
        b(str);
    }
}
