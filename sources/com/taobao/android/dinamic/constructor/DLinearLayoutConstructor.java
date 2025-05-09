package com.taobao.android.dinamic.constructor;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.view.DLinearLayout;
import java.util.ArrayList;
import java.util.Map;
import tb.bn7;
import tb.jn7;
import tb.owo;
import tb.sn7;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class DLinearLayoutConstructor extends sn7 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "DLinearLayoutConstructor";

    static {
        t2o.a(444596256);
    }

    public static /* synthetic */ Object ipc$super(DLinearLayoutConstructor dLinearLayoutConstructor, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1908967275) {
            super.applyDefaultProperty((View) objArr[0], (Map) objArr[1], (bn7) objArr[2]);
            return null;
        } else if (hashCode == -1372344534) {
            super.setAttributes((View) objArr[0], (Map) objArr[1], (ArrayList) objArr[2], (bn7) objArr[3]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/dinamic/constructor/DLinearLayoutConstructor");
        }
    }

    @Override // tb.sn7
    public View initializeView(String str, Context context, AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("6a3fe4ae", new Object[]{this, str, context, attributeSet});
        }
        return new DLinearLayout(context);
    }

    @Override // tb.sn7
    public void applyDefaultProperty(View view, Map<String, Object> map, bn7 bn7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e377895", new Object[]{this, view, map, bn7Var});
            return;
        }
        super.applyDefaultProperty(view, map, bn7Var);
        LinearLayout linearLayout = (LinearLayout) view;
        linearLayout.setBaselineAligned(false);
        if (!map.containsKey("dOrientation")) {
            linearLayout.setOrientation(0);
        }
    }

    public void setOrientation(LinearLayout linearLayout, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0c900bc", new Object[]{this, linearLayout, str});
        } else if (!TextUtils.isEmpty(str)) {
            int intValue = Integer.valueOf(str).intValue();
            if (intValue == 0) {
                linearLayout.setOrientation(1);
            } else if (intValue == 1) {
                linearLayout.setOrientation(0);
            }
        } else {
            linearLayout.setOrientation(0);
        }
    }

    @Override // tb.sn7
    public void setAttributes(View view, Map<String, Object> map, ArrayList<String> arrayList, bn7 bn7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae33af2a", new Object[]{this, view, map, arrayList, bn7Var});
            return;
        }
        super.setAttributes(view, map, arrayList, bn7Var);
        DLinearLayout dLinearLayout = (DLinearLayout) view;
        if (arrayList.contains("dOrientation")) {
            setOrientation(dLinearLayout, (String) map.get("dOrientation"));
        }
        if (arrayList.contains("dClipTopLeftRadius") || arrayList.contains("dClipTopRightRadius") || arrayList.contains("dClipBottomLeftRadius") || arrayList.contains("dClipBottomRightRadius")) {
            int e = owo.e(view.getContext(), map.get("dClipTopLeftRadius"), 0);
            int e2 = owo.e(view.getContext(), map.get("dClipTopRightRadius"), 0);
            int e3 = owo.e(view.getContext(), map.get("dClipBottomLeftRadius"), 0);
            float f = e;
            float f2 = e2;
            float e4 = owo.e(view.getContext(), map.get("dClipBottomRightRadius"), 0);
            float f3 = e3;
            view.setTag(jn7.LAYOUT_RADII, new float[]{f, f, f2, f2, e4, e4, f3, f3});
        }
    }
}
