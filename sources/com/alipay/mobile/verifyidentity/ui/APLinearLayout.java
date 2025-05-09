package com.alipay.mobile.verifyidentity.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class APLinearLayout extends LinearLayout implements APViewGroupInterface {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public APLinearLayout(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(APLinearLayout aPLinearLayout, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2079798281:
                super.setOnClickListener((View.OnClickListener) objArr[0]);
                return null;
            case -1556944264:
                super.addView((View) objArr[0], (ViewGroup.LayoutParams) objArr[1]);
                return null;
            case 192404354:
                return new Integer(super.getVisibility());
            case 1992612095:
                super.addView((View) objArr[0], ((Number) objArr[1]).intValue(), (ViewGroup.LayoutParams) objArr[2]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/verifyidentity/ui/APLinearLayout");
        }
    }

    public void addView(View view, int i, LinearLayout.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46874dd3", new Object[]{this, view, new Integer(i), layoutParams});
        } else {
            super.addView(view, i, (ViewGroup.LayoutParams) layoutParams);
        }
    }

    @Override // com.alipay.mobile.verifyidentity.ui.APViewGroupInterface
    public View getView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        return this;
    }

    @Override // android.view.View, com.alipay.mobile.verifyidentity.ui.APViewGroupInterface
    public int getVisibility() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b77db82", new Object[]{this})).intValue();
        }
        return super.getVisibility();
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8408cbf7", new Object[]{this, onClickListener});
        } else {
            super.setOnClickListener(APViewEventHelper.wrapClickListener(onClickListener));
        }
    }

    public APLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void addView(View view, LinearLayout.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fb63ffa", new Object[]{this, view, layoutParams});
        } else {
            super.addView(view, (ViewGroup.LayoutParams) layoutParams);
        }
    }
}
