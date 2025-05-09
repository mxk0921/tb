package com.taobao.weex.ui.animation;

import android.graphics.drawable.ColorDrawable;
import android.util.Property;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.ui.view.border.BorderDrawable;
import com.taobao.weex.utils.WXLogUtils;
import com.taobao.weex.utils.WXViewInnerUtils;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class BackgroundColorProperty extends Property<View, Integer> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "BackgroundColorAnimation";

    static {
        t2o.a(985661668);
    }

    public BackgroundColorProperty() {
        super(Integer.class, "backgroundColor");
    }

    public static /* synthetic */ Object ipc$super(BackgroundColorProperty backgroundColorProperty, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/weex/ui/animation/BackgroundColorProperty");
    }

    public Integer get(View view) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("f56f44bc", new Object[]{this, view});
        }
        BorderDrawable borderDrawable = WXViewInnerUtils.getBorderDrawable(view);
        if (borderDrawable != null) {
            i = borderDrawable.getColor();
        } else if (view.getBackground() instanceof ColorDrawable) {
            i = ((ColorDrawable) view.getBackground()).getColor();
        } else {
            WXLogUtils.e(TAG, "Unsupported background type");
        }
        return Integer.valueOf(i);
    }

    public void set(View view, Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae6bc58e", new Object[]{this, view, num});
            return;
        }
        BorderDrawable borderDrawable = WXViewInnerUtils.getBorderDrawable(view);
        if (borderDrawable != null) {
            borderDrawable.setColor(num.intValue());
        } else if (view.getBackground() instanceof ColorDrawable) {
            ((ColorDrawable) view.getBackground()).setColor(num.intValue());
        } else {
            WXLogUtils.e(TAG, "Unsupported background type");
        }
    }
}
