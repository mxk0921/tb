package com.taobao.android.abilitykit.ability.pop.presenter;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.taobao.android.abilitykit.ability.pop.render.IAKPopRender;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.g1a;
import tb.iih;
import tb.pr;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class AKBasePopPresenter$notifyPopWindowStateChanged$1 extends Lambda implements g1a<AKBasePopPresenter<?, ?>, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ JSONObject $data;
    public final /* synthetic */ String $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AKBasePopPresenter$notifyPopWindowStateChanged$1(String str, JSONObject jSONObject) {
        super(1);
        this.$state = str;
        this.$data = jSONObject;
    }

    public static /* synthetic */ Object ipc$super(AKBasePopPresenter$notifyPopWindowStateChanged$1 aKBasePopPresenter$notifyPopWindowStateChanged$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilitykit/ability/pop/presenter/AKBasePopPresenter$notifyPopWindowStateChanged$1");
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
        try {
            IAKPopRender<?, ?> p = aKBasePopPresenter.p();
            if (p != null) {
                p.h(this.$state, this.$data);
            }
        } catch (Throwable th) {
            iih iihVar = iih.INSTANCE;
            iihVar.a("stdPopTag", "notifyPopWindowStateChanged error = " + pr.d(th));
        }
    }
}
