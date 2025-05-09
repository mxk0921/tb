package com.taobao.weex.ui.animation;

import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class HeightProperty extends LayoutParamsProperty {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(985661670);
    }

    public static /* synthetic */ Object ipc$super(HeightProperty heightProperty, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1368668786) {
            super.set((View) objArr[0], (Integer) objArr[1]);
            return null;
        } else if (hashCode == -177257284) {
            return super.get((View) objArr[0]);
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/weex/ui/animation/HeightProperty");
        }
    }

    @Override // com.taobao.weex.ui.animation.LayoutParamsProperty
    public /* bridge */ /* synthetic */ Integer get(View view) {
        return super.get(view);
    }

    @Override // com.taobao.weex.ui.animation.LayoutParamsProperty
    public Integer getProperty(ViewGroup.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("91061df2", new Object[]{this, layoutParams});
        }
        return Integer.valueOf(layoutParams.height);
    }

    @Override // com.taobao.weex.ui.animation.LayoutParamsProperty
    public /* bridge */ /* synthetic */ void set(View view, Integer num) {
        super.set(view, num);
    }

    @Override // com.taobao.weex.ui.animation.LayoutParamsProperty
    public void setProperty(ViewGroup.LayoutParams layoutParams, Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec335c18", new Object[]{this, layoutParams, num});
        } else {
            layoutParams.height = num.intValue();
        }
    }
}
