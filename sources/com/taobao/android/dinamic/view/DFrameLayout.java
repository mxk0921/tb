package com.taobao.android.dinamic.view;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.FrameLayout;
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
public class DFrameLayout extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(444596413);
    }

    public DFrameLayout(Context context) {
        super(context);
    }

    private int calculateSize(String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6182c394", new Object[]{this, str, str2, new Integer(i)})).intValue();
        }
        return i;
    }

    public static /* synthetic */ Object ipc$super(DFrameLayout dFrameLayout, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1665133574) {
            super.draw((Canvas) objArr[0]);
            return null;
        } else if (hashCode == 623593120) {
            super.dispatchDraw((Canvas) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/dinamic/view/DFrameLayout");
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

    public DFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout.LayoutParams) ipChange.ipc$dispatch("76fdc06b", new Object[]{this, attributeSet});
        }
        Map<String, Object> map = tl7.d("DFrameLayout").handleAttributeSet(attributeSet).b;
        int a2 = y45.a(map);
        HashMap hashMap = (HashMap) map;
        String str = (String) hashMap.get("dWidth");
        String str2 = (String) hashMap.get("dHeight");
        int[] b = y45.b(getContext(), hashMap);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(b[0], b[1]);
        layoutParams.gravity = a2;
        layoutParams.setMargins(b[2], b[3], b[4], b[5]);
        if (a2 == -1) {
            a2 = 51;
        }
        if ((3 & a2) != 0 && b[0] > 0) {
            String str3 = (String) hashMap.get("dMarginLeft");
            if (!TextUtils.isEmpty(str3) && !str.toLowerCase().contains("np") && !str3.toLowerCase().contains("np")) {
                layoutParams.width = calculateSize(str, str3, b[0]);
            }
        }
        if ((5 & a2) != 0 && b[0] > 0) {
            String str4 = (String) hashMap.get("dMarginRight");
            if (!TextUtils.isEmpty(str4) && !str.toLowerCase().contains("np") && !str4.toLowerCase().contains("np")) {
                layoutParams.width = calculateSize(str, str4, b[0]);
            }
        }
        if ((a2 & 48) != 0 && b[1] > 0) {
            String str5 = (String) hashMap.get("dMarginTop");
            if (!TextUtils.isEmpty(str5) && !str2.toLowerCase().contains("np") && !str5.toLowerCase().contains("np")) {
                layoutParams.height = calculateSize(str2, str5, b[1]);
            }
        }
        if ((a2 & 80) != 0 && b[1] > 0) {
            String str6 = (String) hashMap.get("dMarginBottom");
            if (!TextUtils.isEmpty(str6) && !str2.toLowerCase().contains("np") && !str6.toLowerCase().contains("np")) {
                layoutParams.height = calculateSize(str2, str6, b[1]);
            }
        }
        return layoutParams;
    }

    public DFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
