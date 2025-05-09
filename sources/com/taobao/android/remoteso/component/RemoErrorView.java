package com.taobao.android.remoteso.component;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.uikit.extend.component.TBErrorView;
import tb.adw;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class RemoErrorView extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ adw f9244a;

        public a(RemoErrorView remoErrorView, adw adwVar) {
            this.f9244a = adwVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            this.f9244a.t0("retry");
            view.setEnabled(false);
        }
    }

    public RemoErrorView(Context context) {
        super(context);
        init(context);
    }

    public static /* synthetic */ Object ipc$super(RemoErrorView remoErrorView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/remoteso/component/RemoErrorView");
    }

    private void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
            return;
        }
        TBErrorView tBErrorView = new TBErrorView(context);
        tBErrorView.setTitle("加载失败，请重试");
        tBErrorView.setNotShowNetworkDiagnosisView(false);
        tBErrorView.setButton(TBErrorView.ButtonType.BUTTON_LEFT, "重试", new a(this, (adw) context));
        tBErrorView.setButtonVisibility(TBErrorView.ButtonType.BUTTON_RIGHT, 8);
        addView(tBErrorView);
    }

    public RemoErrorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context);
    }

    public RemoErrorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context);
    }

    public RemoErrorView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        init(context);
    }
}
