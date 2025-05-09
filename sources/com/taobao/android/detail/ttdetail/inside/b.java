package com.taobao.android.detail.ttdetail.inside;

import android.view.animation.Animation;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilitykit.ability.pop.render.IAKPopRender;
import com.taobao.android.detail.ttdetail.inside.InsideLinearLayout;
import tb.zq1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class b extends zq1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ TTDInsideController f6853a;

    public b(TTDInsideController tTDInsideController) {
        this.f6853a = tTDInsideController;
    }

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/inside/TTDInsideController$3");
    }

    @Override // tb.zq1, android.view.animation.Animation.AnimationListener
    public void onAnimationStart(Animation animation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2d146c4", new Object[]{this, animation});
        } else {
            TTDInsideController.b(this.f6853a, IAKPopRender.LifecycleType.IN_ANIMATION_START);
        }
    }

    @Override // tb.zq1, android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(Animation animation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("724c33d", new Object[]{this, animation});
            return;
        }
        TTDInsideController.b(this.f6853a, IAKPopRender.LifecycleType.IN_ANIMATION_END);
        TTDInsideController.m(this.f6853a).notifyInsideDetailState(InsideLinearLayout.InsideDetailState.HALF_SCREEN, true);
    }
}
