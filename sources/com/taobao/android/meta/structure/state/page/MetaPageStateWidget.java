package com.taobao.android.meta.structure.state.page;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.meta.data.MetaResult;
import com.taobao.android.meta.data.a;
import com.taobao.android.meta.structure.state.MetaState;
import com.taobao.android.meta.structure.state.page.MetaPageStateWidget;
import tb.acx;
import tb.asi;
import tb.ay4;
import tb.bsi;
import tb.ckf;
import tb.jsi;
import tb.luc;
import tb.muc;
import tb.nuc;
import tb.t2o;
import tb.ude;
import tb.usi;
import tb.vfw;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class MetaPageStateWidget extends usi<FrameLayout, nuc, muc, acx<? extends a<asi, MetaResult<asi>>>, bsi> implements luc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(993001560);
        t2o.a(993001550);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MetaPageStateWidget(Activity activity, ude udeVar, acx<? extends a<asi, MetaResult<asi>>> acxVar, ViewGroup viewGroup, vfw vfwVar) {
        super(activity, udeVar, acxVar, viewGroup, vfwVar);
        ckf.g(activity, "activity");
        ckf.g(udeVar, com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_SOURCE_PARENT);
        ckf.g(acxVar, "model");
    }

    public static final WindowInsetsCompat b(View view, WindowInsetsCompat windowInsetsCompat) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WindowInsetsCompat) ipChange.ipc$dispatch("396a9b96", new Object[]{view, windowInsetsCompat});
        }
        return ViewCompat.onApplyWindowInsets(view, windowInsetsCompat);
    }

    public static /* synthetic */ Object ipc$super(MetaPageStateWidget metaPageStateWidget, String str, Object... objArr) {
        if (str.hashCode() == -336807415) {
            return super.onCreateView();
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/meta/structure/state/page/MetaPageStateWidget");
    }

    public void A2(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45b9dbf7", new Object[]{this, new Integer(i)});
        } else {
            ((nuc) t2()).getView().setPadding(0, i, 0, 0);
        }
    }

    @Override // tb.luc
    public void G1(MetaState metaState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d3cb697", new Object[]{this, metaState});
            return;
        }
        ckf.g(metaState, "state");
        ((nuc) t2()).G1(metaState);
    }

    public void L(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ac51d95", new Object[]{this, new Boolean(z)});
        } else {
            ((nuc) t2()).L(z);
        }
    }

    @Override // tb.abx
    public String getLogTag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("55d7c1cd", new Object[]{this});
        }
        return "MetaPageStateWidget";
    }

    /* renamed from: x2 */
    public muc q2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (muc) ipChange.ipc$dispatch("532b00bf", new Object[]{this});
        }
        return new jsi();
    }

    /* renamed from: y2 */
    public nuc s2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nuc) ipChange.ipc$dispatch("af001d73", new Object[]{this});
        }
        ay4<bsi, ? extends nuc> e0 = w2().e0();
        ckf.d(e0);
        Object a2 = e0.a(w2());
        ckf.f(a2, "create(...)");
        return (nuc) a2;
    }

    /* renamed from: z2 */
    public FrameLayout onCreateView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("6075f6f2", new Object[]{this});
        }
        FrameLayout frameLayout = (FrameLayout) super.onCreateView();
        ViewCompat.setOnApplyWindowInsetsListener(frameLayout, new OnApplyWindowInsetsListener() { // from class: tb.hfz
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                WindowInsetsCompat b;
                b = MetaPageStateWidget.b(view, windowInsetsCompat);
                return b;
            }
        });
        ckf.f(frameLayout, "let(...)");
        return frameLayout;
    }
}
