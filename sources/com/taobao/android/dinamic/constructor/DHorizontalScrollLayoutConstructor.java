package com.taobao.android.dinamic.constructor;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.view.DHorizontalScrollLayout;
import java.util.ArrayList;
import java.util.Map;
import tb.bn7;
import tb.sn7;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class DHorizontalScrollLayoutConstructor extends sn7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(444596251);
    }

    public static /* synthetic */ Object ipc$super(DHorizontalScrollLayoutConstructor dHorizontalScrollLayoutConstructor, String str, Object... objArr) {
        if (str.hashCode() == -1372344534) {
            super.setAttributes((View) objArr[0], (Map) objArr[1], (ArrayList) objArr[2], (bn7) objArr[3]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamic/constructor/DHorizontalScrollLayoutConstructor");
    }

    @Override // tb.sn7
    public View initializeViewWithModule(String str, Context context, AttributeSet attributeSet, bn7 bn7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("65343113", new Object[]{this, str, context, attributeSet, bn7Var});
        }
        return new DHorizontalScrollLayout(context, attributeSet, bn7Var);
    }

    @Override // tb.sn7
    public void setAttributes(View view, Map<String, Object> map, ArrayList<String> arrayList, bn7 bn7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae33af2a", new Object[]{this, view, map, arrayList, bn7Var});
        } else {
            super.setAttributes(view, map, arrayList, bn7Var);
        }
    }
}
