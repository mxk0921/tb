package com.etao.feimagesearch.ui.coordinatorcard;

import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.g1a;
import tb.l83;
import tb.t83;
import tb.xhv;
import tb.zr1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class CoordinatorCardView$attachCard$1 extends Lambda implements g1a<zr1, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ t83 $action;
    public final /* synthetic */ CoordinatorCardView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoordinatorCardView$attachCard$1(t83 t83Var, CoordinatorCardView coordinatorCardView) {
        super(1);
        this.$action = t83Var;
        this.this$0 = coordinatorCardView;
    }

    public static /* synthetic */ Object ipc$super(CoordinatorCardView$attachCard$1 coordinatorCardView$attachCard$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/ui/coordinatorcard/CoordinatorCardView$attachCard$1");
    }

    @Override // tb.g1a
    public /* bridge */ /* synthetic */ xhv invoke(zr1 zr1Var) {
        invoke2(zr1Var);
        return xhv.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(zr1 zr1Var) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e77db8d", new Object[]{this, zr1Var});
            return;
        }
        ckf.g(zr1Var, AdvanceSetting.NETWORK_TYPE);
        String e = this.$action.e();
        CoordinatorCardView.access$getCardRecords$p(this.this$0).put(e, zr1Var);
        l83 c = this.$action.c();
        if (c != null && !c.e()) {
            i = 4;
        }
        zr1Var.y(i);
        CoordinatorCardView.access$getCardLayoutStrategies$p(this.this$0).put(e, this.$action.c());
        View g = zr1Var.g();
        g.setTag(e);
        if (this.$action.a() < 0 || zr1Var.b() != 0) {
            this.this$0.addView(g);
        } else {
            CoordinatorCardView.access$addViewWithAnim(this.this$0, this.$action.a(), zr1Var);
        }
    }
}
