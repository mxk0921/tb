package com.taobao.android.live.plugin.atype.flexalocal.topbar;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.taobao.R;
import com.taobao.taolive.room.openarchitecture.entity.ATaoLiveOpenEntity;
import tb.czd;
import tb.giv;
import tb.rbt;
import tb.t2o;
import tb.ux9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class TopFakeBarFrame extends BaseFrame {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(295700016);
    }

    public TopFakeBarFrame(Context context, ux9 ux9Var) {
        super(context, ux9Var);
    }

    public static /* synthetic */ Object ipc$super(TopFakeBarFrame topFakeBarFrame, String str, Object... objArr) {
        if (str.hashCode() == 91531079) {
            super.onViewCreated((View) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/topbar/TopFakeBarFrame");
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public int getLayoutResId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f1151e95", new Object[]{this})).intValue();
        }
        return R.layout.taolive_top_fake_bar_layout_flexalocal;
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onViewCreated(View view) {
        ux9 ux9Var;
        ATaoLiveOpenEntity A;
        czd czdVar;
        Float f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("574a747", new Object[]{this, view});
            return;
        }
        super.onViewCreated(view);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getComponentView().getLayoutParams();
        marginLayoutParams.topMargin = 0;
        float f2 = 0.0f;
        if (!(giv.c().b() || (ux9Var = this.mFrameContext) == null || (A = ux9Var.A()) == null || (czdVar = A.uiCompontent) == null || ((rbt) czdVar).b() == null || (f = ((rbt) A.uiCompontent).b().f()) == null || f.floatValue() <= 0.0f || f.floatValue() > 500.0f)) {
            f2 = f.floatValue();
        }
        marginLayoutParams.topMargin += (int) f2;
        getComponentView().setLayoutParams(marginLayoutParams);
    }
}
