package com.alibaba.triver.triver_shop.newShop.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.ckf;
import tb.kew;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class MarginSupportFrameLayout extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(766509642);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarginSupportFrameLayout(Context context) {
        super(context);
        ckf.g(context, "context");
    }

    public static /* synthetic */ Object ipc$super(MarginSupportFrameLayout marginSupportFrameLayout, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/MarginSupportFrameLayout");
    }

    public final void setMarginBottom(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41af79fe", new Object[]{this, new Float(f)});
        } else {
            kew.U(this, (int) f);
        }
    }

    public final void setMarginTop(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45b9d0b4", new Object[]{this, new Float(f)});
        } else {
            kew.d0(this, (int) f);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarginSupportFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ckf.g(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarginSupportFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ckf.g(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarginSupportFrameLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        ckf.g(context, "context");
    }
}
