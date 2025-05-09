package com.taobao.android.detail2.core.framework.base.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.o0i;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class MaskImageView extends ImageView {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(352321760);
    }

    public MaskImageView(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(MaskImageView maskImageView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail2/core/framework/base/widget/MaskImageView");
    }

    public void bindMask(o0i o0iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("653fcbf9", new Object[]{this, o0iVar});
        } else if (o0iVar != null) {
            if (o0iVar.i) {
                setVisibility(0);
                setBackgroundColor(o0iVar.h);
                float f = o0iVar.j;
                if (f >= 0.0f) {
                    setAlpha(f);
                    return;
                }
                return;
            }
            setVisibility(8);
        }
    }

    public MaskImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MaskImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
