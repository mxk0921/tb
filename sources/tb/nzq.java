package tb;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.alibaba.triver.triver_shop.newShop.view.BigCardWebContentRender;
import com.alibaba.triver.triver_shop.newShop.view.embed.SwipeBigCardComponent;
import com.android.alibaba.ip.runtime.IpChange;
import tb.c8c;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class nzq implements c8c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final SwipeBigCardComponent f25053a;
    public final int b;
    public final boolean c;
    public wpd d;

    static {
        t2o.a(766510136);
        t2o.a(766510108);
    }

    public nzq(SwipeBigCardComponent swipeBigCardComponent, int i, boolean z) {
        ckf.g(swipeBigCardComponent, "swipeBigCardComponent");
        this.f25053a = swipeBigCardComponent;
        this.b = i;
        this.c = z;
    }

    @Override // tb.c8c
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccb1a91f", new Object[]{this});
            return;
        }
        c8c.a.e(this);
        wpd wpdVar = this.d;
        if (wpdVar != null) {
            wpdVar.k();
        }
    }

    @Override // tb.c8c
    public View b(Context context, Fragment fragment) {
        wpd wpdVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("dab1df30", new Object[]{this, context, fragment});
        }
        ckf.g(fragment, "outerFragment");
        if (this.c) {
            wpdVar = new ea2(this.f25053a);
        } else {
            wpdVar = new BigCardWebContentRender(this.f25053a, this.b);
        }
        this.d = wpdVar;
        return wpdVar.getContentView();
    }

    @Override // tb.c8c
    public int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c0f96ed4", new Object[]{this})).intValue();
        }
        return c8c.a.a(this);
    }

    @Override // tb.c8c
    public void d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f15f3f8", new Object[]{this, new Integer(i)});
        } else {
            c8c.a.f(this, i);
        }
    }

    @Override // tb.c8c
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22cc24e6", new Object[]{this});
            return;
        }
        c8c.a.d(this);
        wpd wpdVar = this.d;
        if (wpdVar != null) {
            wpdVar.j();
        }
    }

    @Override // tb.c8c
    public void onDestroyView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b8f9ee7", new Object[]{this});
            return;
        }
        wpd wpdVar = this.d;
        if (wpdVar != null) {
            wpdVar.destroyView();
        }
    }

    @Override // tb.c8c
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
        } else {
            c8c.a.b(this);
        }
    }

    @Override // tb.c8c
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
        } else {
            c8c.a.c(this);
        }
    }
}
