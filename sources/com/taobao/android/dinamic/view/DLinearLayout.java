package com.taobao.android.dinamic.view;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.t2o;
import tb.tl7;
import tb.vn7;
import tb.y45;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class DLinearLayout extends LinearLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(444596416);
    }

    public DLinearLayout(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(DLinearLayout dLinearLayout, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1665133574) {
            super.draw((Canvas) objArr[0]);
            return null;
        } else if (hashCode == 623593120) {
            super.dispatchDraw((Canvas) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/dinamic/view/DLinearLayout");
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("252b46a0", new Object[]{this, canvas});
            return;
        }
        vn7.a(this, canvas);
        super.dispatchDraw(canvas);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cc013fa", new Object[]{this, canvas});
            return;
        }
        vn7.a(this, canvas);
        super.draw(canvas);
    }

    public DLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public LinearLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        LinearLayout.LayoutParams layoutParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinearLayout.LayoutParams) ipChange.ipc$dispatch("9893bea9", new Object[]{this, attributeSet});
        }
        Map<String, Object> map = tl7.d("DLinearLayout").handleAttributeSet(attributeSet).b;
        int[] b = y45.b(getContext(), map);
        HashMap hashMap = (HashMap) map;
        if (hashMap.containsKey("dWeight")) {
            try {
                float parseFloat = Float.parseFloat((String) hashMap.get("dWeight"));
                if (parseFloat <= 0.0f) {
                    parseFloat = 0.0f;
                }
                if (getOrientation() == 0) {
                    layoutParams = new LinearLayout.LayoutParams(0, b[1], parseFloat);
                } else {
                    layoutParams = new LinearLayout.LayoutParams(b[0], 0, parseFloat);
                }
            } catch (NumberFormatException unused) {
                layoutParams = new LinearLayout.LayoutParams(b[0], b[1]);
            }
        } else {
            layoutParams = new LinearLayout.LayoutParams(b[0], b[1]);
        }
        layoutParams.setMargins(b[2], b[3], b[4], b[5]);
        layoutParams.gravity = y45.a(hashMap);
        return layoutParams;
    }

    public DLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
