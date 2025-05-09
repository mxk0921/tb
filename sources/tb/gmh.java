package tb;

import android.content.Context;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.view.frameanim.NewDetailMaskFrameLayout;
import com.taobao.tao.Globals;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class gmh {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "NdQuickJumpManager";
    public static volatile gmh d;
    public static volatile long e = -1;

    /* renamed from: a  reason: collision with root package name */
    public volatile FrameLayout f20088a;
    public volatile FrameLayout b;
    public volatile bew c;

    static {
        t2o.a(352321938);
    }

    public static gmh a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gmh) ipChange.ipc$dispatch("af0c5f2a", new Object[0]);
        }
        return new gmh();
    }

    public static gmh c(long j) {
        gmh gmhVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gmh) ipChange.ipc$dispatch("8b8ad487", new Object[]{new Long(j)});
        }
        if (j <= 0 || e != j) {
            gmhVar = null;
        } else {
            gmhVar = d;
        }
        d = null;
        return gmhVar;
    }

    public static void h(long j, gmh gmhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1b0f0dc", new Object[]{new Long(j), gmhVar});
            return;
        }
        d = gmhVar;
        e = j;
    }

    public FrameLayout b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("a5f2a62a", new Object[]{this});
        }
        FrameLayout frameLayout = new FrameLayout(this.c);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout.setId(R.id.root);
        return frameLayout;
    }

    public FrameLayout d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("31a2941f", new Object[]{this, new Boolean(z)});
        }
        if (z) {
            if (this.b == null) {
                txj.e(TAG, "BatterPreView: notHitAnimRootLayout");
                g();
                e();
            }
            FrameLayout frameLayout = this.b;
            this.b = null;
            return frameLayout;
        }
        if (this.f20088a == null) {
            txj.e(TAG, "BatterPreView: notHitRootLayout");
            g();
            f();
        }
        FrameLayout frameLayout2 = this.f20088a;
        this.f20088a = null;
        return frameLayout2;
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f0f1ed4", new Object[]{this});
            return;
        }
        bew bewVar = this.c;
        if (bewVar == null) {
            qyj.a("noViewContext", null);
            return;
        }
        NewDetailMaskFrameLayout newDetailMaskFrameLayout = new NewDetailMaskFrameLayout(bewVar);
        newDetailMaskFrameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        newDetailMaskFrameLayout.setId(R.id.rootAnimFrameLayout);
        FrameLayout frameLayout = new FrameLayout(bewVar);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout.setId(R.id.rootParentFrameLayout);
        FrameLayout b = b();
        frameLayout.addView(newDetailMaskFrameLayout);
        newDetailMaskFrameLayout.addView(b);
        this.b = frameLayout;
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1b21a63", new Object[]{this});
        } else {
            this.f20088a = b();
        }
    }

    public final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb7e9fa1", new Object[]{this});
        } else if (this.c == null) {
            this.c = new bew(Globals.getApplication());
        }
    }

    public void i(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("387bfe7d", new Object[]{this, new Boolean(z)});
            return;
        }
        g();
        if (z) {
            e();
        } else {
            f();
        }
        txj.e(TAG, "BatterPreView: startHelper");
    }

    public void j(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("740cd63b", new Object[]{this, context});
        } else if (this.c != null) {
            this.c.d(context);
        }
    }
}
