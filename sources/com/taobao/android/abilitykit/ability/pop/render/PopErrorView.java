package com.taobao.android.abilitykit.ability.pop.render;

import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilitykit.ability.pop.presenter.AKBasePopPresenter;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.component.TBErrorView;
import tb.h9;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class PopErrorView<PARAMS extends h9> extends RelativeLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ h9 f6275a;

        public a(h9 h9Var) {
            this.f6275a = h9Var;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            h9 h9Var = this.f6275a;
            if (h9Var == null) {
                str = null;
            } else {
                str = h9Var.d;
            }
            AKBasePopPresenter.j(PopErrorView.this.getContext(), str, null);
        }
    }

    static {
        t2o.a(336593042);
    }

    public PopErrorView(Context context, PARAMS params) {
        super(context);
        init(context, params);
    }

    private void init(Context context, PARAMS params) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd35a7fc", new Object[]{this, context, params});
            return;
        }
        setBackgroundColor(-1);
        TBErrorView tBErrorView = new TBErrorView(context);
        tBErrorView.setNotShowNetworkDiagnosisView(true);
        tBErrorView.setTitle(Localization.q(R.string.taobao_app_1012_1_21180));
        tBErrorView.setSubTitle(Localization.q(R.string.taobao_app_1012_1_21179));
        tBErrorView.setButton(TBErrorView.ButtonType.BUTTON_LEFT, Localization.q(R.string.app_i_know), new a(params));
        tBErrorView.setButtonVisibility(TBErrorView.ButtonType.BUTTON_RIGHT, 8);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        addView(tBErrorView, layoutParams);
    }

    public static /* synthetic */ Object ipc$super(PopErrorView popErrorView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilitykit/ability/pop/render/PopErrorView");
    }
}
