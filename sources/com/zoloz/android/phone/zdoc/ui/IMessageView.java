package com.zoloz.android.phone.zdoc.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public abstract class IMessageView extends RelativeLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(245366972);
    }

    public IMessageView(Context context) {
        super(context);
        init(context, null);
    }

    public static /* synthetic */ Object ipc$super(IMessageView iMessageView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/zoloz/android/phone/zdoc/ui/IMessageView");
    }

    public abstract void clearClickListener();

    public void init(Context context, AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16013b5d", new Object[]{this, context, attributeSet});
        }
    }

    public abstract void setOnConfirmListener(View.OnClickListener onClickListener);

    public abstract void setOnReTakePhotoListener(View.OnClickListener onClickListener);

    public abstract void setOnTakePhotoListener(View.OnClickListener onClickListener);

    public abstract void setUiLocation(int i, String str, int i2, int i3, int i4, int i5);

    public abstract void updateMaskAlpha(float f);

    public abstract void updateMessage(int i);

    public abstract void updateUI(UIState uIState, int i, int i2);

    public IMessageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context, attributeSet);
    }

    public IMessageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context, attributeSet);
    }
}
