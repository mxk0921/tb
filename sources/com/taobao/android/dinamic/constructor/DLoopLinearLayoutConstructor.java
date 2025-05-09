package com.taobao.android.dinamic.constructor;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.view.DLoopLinearLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import tb.bn7;
import tb.jn7;
import tb.sn7;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class DLoopLinearLayoutConstructor extends sn7 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "DLoopLinearLayoutConstructor";

    static {
        t2o.a(444596257);
    }

    public static /* synthetic */ Object ipc$super(DLoopLinearLayoutConstructor dLoopLinearLayoutConstructor, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1908967275) {
            super.applyDefaultProperty((View) objArr[0], (Map) objArr[1], (bn7) objArr[2]);
            return null;
        } else if (hashCode == -1372344534) {
            super.setAttributes((View) objArr[0], (Map) objArr[1], (ArrayList) objArr[2], (bn7) objArr[3]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/dinamic/constructor/DLoopLinearLayoutConstructor");
        }
    }

    public void bindListData(DLoopLinearLayout dLoopLinearLayout, bn7 bn7Var, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25a09759", new Object[]{this, dLoopLinearLayout, bn7Var, list});
        } else {
            dLoopLinearLayout.bindListData(bn7Var, list);
        }
    }

    @Override // tb.sn7
    public View initializeView(String str, Context context, AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("6a3fe4ae", new Object[]{this, str, context, attributeSet});
        }
        return new DLoopLinearLayout(context, attributeSet);
    }

    @Override // tb.sn7
    public void setAttributes(View view, Map<String, Object> map, ArrayList<String> arrayList, bn7 bn7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae33af2a", new Object[]{this, view, map, arrayList, bn7Var});
            return;
        }
        super.setAttributes(view, map, arrayList, bn7Var);
        DLoopLinearLayout dLoopLinearLayout = (DLoopLinearLayout) view;
        if (arrayList.contains("dOrientation")) {
            setOrientation(dLoopLinearLayout, (String) map.get("dOrientation"));
        }
        if (arrayList.contains("dListData")) {
            bindListData(dLoopLinearLayout, bn7Var, (List) map.get("dListData"));
        }
    }

    public void setOrientation(DLoopLinearLayout dLoopLinearLayout, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef70056", new Object[]{this, dLoopLinearLayout, str});
        } else if (!TextUtils.isEmpty(str)) {
            int intValue = Integer.valueOf(str).intValue();
            if (intValue == 0) {
                dLoopLinearLayout.setOrientation(1);
            } else if (intValue == 1) {
                dLoopLinearLayout.setOrientation(0);
            }
        } else {
            dLoopLinearLayout.setOrientation(0);
        }
    }

    @Override // tb.sn7
    public void applyDefaultProperty(View view, Map<String, Object> map, bn7 bn7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e377895", new Object[]{this, view, map, bn7Var});
            return;
        }
        super.applyDefaultProperty(view, map, bn7Var);
        DLoopLinearLayout dLoopLinearLayout = (DLoopLinearLayout) view;
        dLoopLinearLayout.setBaselineAligned(false);
        if (!map.containsKey("dOrientation")) {
            dLoopLinearLayout.setOrientation(1);
        }
        dLoopLinearLayout.setTag(jn7.TAG_DINAMIC_BIND_DATA_LIST, bn7Var.e().a());
    }
}
