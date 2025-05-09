package tb;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.view.DLoopLinearLayout;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class tn7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(444596238);
    }

    public static View a(Context context, View view, tfw tfwVar, bn7 bn7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("e0a0ac7e", new Object[]{context, view, tfwVar, bn7Var});
        }
        en7 c = vn7.c(view);
        sn7 d = tl7.d(c.f18692a);
        if (d == null) {
            bn7Var.e().b().a(mm7.ERROR_CODE_VIEW_NOT_FOUND, c.f18692a);
            return null;
        }
        View initializeViewWithModule = d.initializeViewWithModule(c.f18692a, context, null, bn7Var);
        if (initializeViewWithModule == null) {
            bn7Var.e().b().a(mm7.ERROR_CODE_VIEW_NOT_FOUND, c.f18692a);
            return null;
        }
        if ((initializeViewWithModule instanceof DLoopLinearLayout) && (view instanceof DLoopLinearLayout)) {
            ((DLoopLinearLayout) initializeViewWithModule).setTemplateViews(((DLoopLinearLayout) view).cloneTemplateViews());
        }
        d.applyDefaultProperty(initializeViewWithModule);
        initializeViewWithModule.setTag(jn7.PROPERTY_KEY, c);
        if (!c.c.isEmpty() || !c.d.isEmpty()) {
            tfwVar.a().add(initializeViewWithModule);
        }
        ArrayList<String> arrayList = new ArrayList<>(20);
        arrayList.addAll(((HashMap) c.b).keySet());
        d.bindDataImpl(initializeViewWithModule, c.b, arrayList, bn7Var);
        return initializeViewWithModule;
    }

    public static View b(String str, Context context, AttributeSet attributeSet, bn7 bn7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("3aaebccd", new Object[]{str, context, attributeSet, bn7Var});
        }
        sn7 d = tl7.d(str);
        if (d == null) {
            bn7Var.e().b().a(mm7.ERROR_CODE_VIEW_NOT_FOUND, str);
            return null;
        }
        View initializeViewWithModule = d.initializeViewWithModule(str, context, attributeSet, bn7Var);
        if (initializeViewWithModule == null) {
            bn7Var.e().b().a(mm7.ERROR_CODE_VIEW_NOT_FOUND, str);
            return null;
        }
        en7 handleAttributeSet = d.handleAttributeSet(attributeSet);
        d.applyDefaultProperty(initializeViewWithModule, handleAttributeSet.b, bn7Var);
        if (!handleAttributeSet.c.isEmpty() || !handleAttributeSet.d.isEmpty()) {
            bn7Var.e().a().add(initializeViewWithModule);
        }
        handleAttributeSet.f18692a = str;
        initializeViewWithModule.setTag(jn7.PROPERTY_KEY, handleAttributeSet);
        ArrayList<String> arrayList = new ArrayList<>(20);
        arrayList.addAll(((HashMap) handleAttributeSet.b).keySet());
        d.bindDataImpl(initializeViewWithModule, handleAttributeSet.b, arrayList, bn7Var);
        return initializeViewWithModule;
    }
}
