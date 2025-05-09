package com.alibaba.triver.triver_shop.newShop.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.ckf;
import tb.t2o;
import tb.zfw;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class PerceptionSizeFrameLayout extends MarginSupportFrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private zfw viewSizeChangedListener;

    static {
        t2o.a(766509685);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PerceptionSizeFrameLayout(Context context) {
        super(context);
        ckf.g(context, "context");
    }

    public static /* synthetic */ Object ipc$super(PerceptionSizeFrameLayout perceptionSizeFrameLayout, String str, Object... objArr) {
        if (str.hashCode() == 348684699) {
            super.onVisibilityChanged((View) objArr[0], ((Number) objArr[1]).intValue());
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/PerceptionSizeFrameLayout");
    }

    public final zfw getViewSizeChangedListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zfw) ipChange.ipc$dispatch("e6ff350b", new Object[]{this});
        }
        return this.viewSizeChangedListener;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52d28ddb", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        zfw zfwVar = this.viewSizeChangedListener;
        if (zfwVar != null) {
            zfwVar.a(this, i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14c8819b", new Object[]{this, view, new Integer(i)});
            return;
        }
        ckf.g(view, "changedView");
        super.onVisibilityChanged(view, i);
    }

    public final void setViewSizeChangedListener(zfw zfwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae430e61", new Object[]{this, zfwVar});
        } else {
            this.viewSizeChangedListener = zfwVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PerceptionSizeFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ckf.g(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PerceptionSizeFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ckf.g(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PerceptionSizeFrameLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        ckf.g(context, "context");
    }
}
