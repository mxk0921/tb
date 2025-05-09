package com.taobao.android.dinamic.constructor;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.view.DFrameLayout;
import java.util.ArrayList;
import java.util.Map;
import tb.bn7;
import tb.jn7;
import tb.owo;
import tb.sn7;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class DFrameLayoutConstructor extends sn7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(444596250);
    }

    public static /* synthetic */ Object ipc$super(DFrameLayoutConstructor dFrameLayoutConstructor, String str, Object... objArr) {
        if (str.hashCode() == -1372344534) {
            super.setAttributes((View) objArr[0], (Map) objArr[1], (ArrayList) objArr[2], (bn7) objArr[3]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamic/constructor/DFrameLayoutConstructor");
    }

    @Override // tb.sn7
    public View initializeView(String str, Context context, AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("6a3fe4ae", new Object[]{this, str, context, attributeSet});
        }
        return new DFrameLayout(context, attributeSet);
    }

    @Override // tb.sn7
    public void setAttributes(View view, Map<String, Object> map, ArrayList<String> arrayList, bn7 bn7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae33af2a", new Object[]{this, view, map, arrayList, bn7Var});
            return;
        }
        super.setAttributes(view, map, arrayList, bn7Var);
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
