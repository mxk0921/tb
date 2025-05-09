package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class f0z implements xpz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public h0z f18929a;
    public g0z b;
    public final View c;

    static {
        t2o.a(352321993);
        t2o.a(352322029);
    }

    public f0z(View view) {
        this.c = view;
    }

    @Override // tb.xpz
    public View a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("fbbbe0d7", new Object[]{this});
        }
        h0z h0zVar = this.f18929a;
        if (h0zVar != null) {
            return h0zVar.a();
        }
        return this.c;
    }

    public void b(g0z g0zVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d2735c", new Object[]{this, g0zVar});
        } else {
            this.b = g0zVar;
        }
    }

    public void c(h0z h0zVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bbac9a2", new Object[]{this, h0zVar});
        } else {
            this.f18929a = h0zVar;
        }
    }

    @Override // tb.xpz
    public boolean onBackPressed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88afc67", new Object[]{this})).booleanValue();
        }
        g0z g0zVar = this.b;
        if (g0zVar != null) {
            return g0zVar.a();
        }
        return false;
    }

    @Override // tb.xpz
    public boolean onFinishContainer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cc8eea5a", new Object[]{this})).booleanValue();
        }
        return onBackPressed();
    }
}
