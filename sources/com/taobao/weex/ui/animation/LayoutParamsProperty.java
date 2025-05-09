package com.taobao.weex.ui.animation;

import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.ui.component.WXComponent;
import com.taobao.weex.ui.view.IRenderResult;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public abstract class LayoutParamsProperty extends Property<View, Integer> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(985661671);
    }

    public LayoutParamsProperty() {
        super(Integer.class, "layoutParams");
    }

    public static /* synthetic */ Object ipc$super(LayoutParamsProperty layoutParamsProperty, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/weex/ui/animation/LayoutParamsProperty");
    }

    public abstract Integer getProperty(ViewGroup.LayoutParams layoutParams);

    public abstract void setProperty(ViewGroup.LayoutParams layoutParams, Integer num);

    /* JADX WARN: Can't rename method to resolve collision */
    public Integer get(View view) {
        ViewGroup.LayoutParams layoutParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("f56f44bc", new Object[]{this, view});
        }
        if (view == null || (layoutParams = view.getLayoutParams()) == null) {
            return 0;
        }
        return getProperty(layoutParams);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    public void set(View view, Integer num) {
        ViewGroup.LayoutParams layoutParams;
        WXComponent component;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae6bc58e", new Object[]{this, view, num});
        } else if (view != null && (layoutParams = view.getLayoutParams()) != null) {
            setProperty(layoutParams, num);
            if ((view instanceof IRenderResult) && (component = ((IRenderResult) view).getComponent()) != null) {
                component.notifyNativeSizeChanged(layoutParams.width, layoutParams.height);
            }
            view.requestLayout();
        }
    }
}
