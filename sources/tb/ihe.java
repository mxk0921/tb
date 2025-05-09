package tb;

import android.view.View;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexInstance;
import tb.b6x;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ihe implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ghe f21310a;
    public final /* synthetic */ b6x.a b;

    public ihe(ghe gheVar, b6x.a aVar) {
        this.f21310a = gheVar;
        this.b = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        ghe gheVar = this.f21310a;
        WeexInstance b = this.b.b(gheVar.E());
        ghe gheVar2 = this.f21310a;
        View rootView = b.getRootView();
        ckf.f(rootView, "this.rootView");
        ghe.k0(gheVar2, rootView);
        FrameLayout X = gheVar2.X();
        if (X != null) {
            View h0 = ghe.h0(gheVar2);
            if (h0 != null) {
                X.addView(h0, 0, new FrameLayout.LayoutParams(-1, -1));
            } else {
                ckf.y("containerView");
                throw null;
            }
        }
        View h02 = ghe.h0(gheVar2);
        if (h02 != null) {
            h02.setTranslationY(caa.g(caa.c()) - ghe.Companion.a());
            JSONObject j0 = ghe.j0(gheVar2);
            if (j0 != null) {
                ghe.n0(gheVar2, j0);
                ghe.l0(gheVar2, null);
            }
            ghe.m0(gheVar, b);
            return;
        }
        ckf.y("containerView");
        throw null;
    }
}
