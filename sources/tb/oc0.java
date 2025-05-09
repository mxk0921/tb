package tb;

import android.content.Context;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class oc0 implements fab {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private c9 f25294a = new c9();

    static {
        t2o.a(336592990);
        t2o.a(336592976);
    }

    @Override // tb.fab
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f82717df", new Object[]{this})).booleanValue();
        }
        return this.f25294a.a();
    }

    @Override // tb.fab
    public void b(View view, View view2, gab gabVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f153b413", new Object[]{this, view, view2, gabVar, new Integer(i)});
            return;
        }
        ckf.g(view, f8v.KEY_TARGET_VIEW);
        if (gabVar != null) {
            gabVar.d(null);
        }
        if (view.getContext() instanceof keb) {
            Context context = view.getContext();
            if (context != null) {
                ((keb) context).b(view, view2, gabVar, i);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type com.taobao.android.abilitykit.ability.pop.animation.IActivityTransition");
            }
        }
        if (gabVar != null) {
            gabVar.b(null);
        }
    }

    @Override // tb.fab
    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e7424843", new Object[]{this});
        }
        return null;
    }

    @Override // tb.fab
    public void d(View view, gab gabVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c44401b3", new Object[]{this, view, gabVar});
            return;
        }
        ckf.g(view, f8v.KEY_TARGET_VIEW);
        this.f25294a.d(view, gabVar);
    }

    public String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5938859e", new Object[]{this});
        }
        return "actTransBottomInOut";
    }

    public long f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("40b6680f", new Object[]{this})).longValue();
        }
        return xbm.c();
    }

    public void g(View view, View view2, gab gabVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5b85cf0", new Object[]{this, view, view2, gabVar});
            return;
        }
        ckf.g(view, f8v.KEY_TARGET_VIEW);
        b(view, view2, gabVar, (int) h());
    }

    public long h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("be168cbc", new Object[]{this})).longValue();
        }
        return xbm.e();
    }
}
