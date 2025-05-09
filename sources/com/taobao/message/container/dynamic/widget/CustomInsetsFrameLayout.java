package com.taobao.message.container.dynamic.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class CustomInsetsFrameLayout extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int[] mInsets;

    static {
        t2o.a(537919498);
    }

    public CustomInsetsFrameLayout(Context context) {
        super(context);
        this.mInsets = new int[4];
    }

    public static /* synthetic */ Object ipc$super(CustomInsetsFrameLayout customInsetsFrameLayout, String str, Object... objArr) {
        if (str.hashCode() == -857843821) {
            return new Boolean(super.fitSystemWindows((Rect) objArr[0]));
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/message/container/dynamic/widget/CustomInsetsFrameLayout");
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ccde5793", new Object[]{this, rect})).booleanValue();
        }
        int[] iArr = this.mInsets;
        iArr[0] = rect.left;
        iArr[1] = rect.top;
        iArr[2] = rect.right;
        iArr[3] = rect.bottom;
        rect.left = 0;
        rect.top = 0;
        rect.right = 0;
        return super.fitSystemWindows(rect);
    }

    public final int[] getInsets() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("38f1fad1", new Object[]{this});
        }
        return this.mInsets;
    }

    public CustomInsetsFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mInsets = new int[4];
    }

    public CustomInsetsFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mInsets = new int[4];
    }
}
