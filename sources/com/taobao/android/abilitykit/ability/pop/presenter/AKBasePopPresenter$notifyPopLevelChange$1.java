package com.taobao.android.abilitykit.ability.pop.presenter;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.taobao.android.abilitykit.ability.pop.render.a;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$IntRef;
import tb.ckf;
import tb.g1a;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class AKBasePopPresenter$notifyPopLevelChange$1 extends Lambda implements g1a<AKBasePopPresenter<?, ?>, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ Ref$BooleanRef $findTopInDim;
    public final /* synthetic */ Ref$IntRef $index;
    public final /* synthetic */ boolean $upper;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AKBasePopPresenter$notifyPopLevelChange$1(Ref$IntRef ref$IntRef, boolean z, Ref$BooleanRef ref$BooleanRef) {
        super(1);
        this.$index = ref$IntRef;
        this.$upper = z;
        this.$findTopInDim = ref$BooleanRef;
    }

    public static /* synthetic */ Object ipc$super(AKBasePopPresenter$notifyPopLevelChange$1 aKBasePopPresenter$notifyPopLevelChange$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilitykit/ability/pop/presenter/AKBasePopPresenter$notifyPopLevelChange$1");
    }

    @Override // tb.g1a
    public /* bridge */ /* synthetic */ xhv invoke(AKBasePopPresenter<?, ?> aKBasePopPresenter) {
        invoke2(aKBasePopPresenter);
        return xhv.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(AKBasePopPresenter<?, ?> aKBasePopPresenter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("869b0382", new Object[]{this, aKBasePopPresenter});
            return;
        }
        ckf.g(aKBasePopPresenter, AdvanceSetting.NETWORK_TYPE);
        a h = AKBasePopPresenter.h(aKBasePopPresenter);
        if (h != null && !h.shouldIgnoreNotifyLevelChange()) {
            int i = this.$index.element;
            if (i == 0) {
                boolean z = this.$upper;
                if (z) {
                    h.onLevelChanged(z, !this.$findTopInDim.element, i);
                    if (!h.isBgTransparent()) {
                        this.$findTopInDim.element = true;
                    }
                }
                this.$index.element++;
                return;
            }
            h.onLevelChanged(this.$upper, !this.$findTopInDim.element, i);
            if (!h.isBgTransparent()) {
                this.$findTopInDim.element = true;
            }
            this.$index.element++;
        }
    }
}
