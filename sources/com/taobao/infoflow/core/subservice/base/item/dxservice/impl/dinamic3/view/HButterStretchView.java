package com.taobao.infoflow.core.subservice.base.item.dxservice.impl.dinamic3.view;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class HButterStretchView extends HStretchView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String imgUrl;
    private BitmapDrawable localDrawable;
    private boolean flag = false;
    private float stretchPercentX = 1.0f;

    static {
        t2o.a(486539400);
    }

    public HButterStretchView(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(HButterStretchView hButterStretchView, String str, Object... objArr) {
        if (str.hashCode() == -244855388) {
            super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/core/subservice/base/item/dxservice/impl/dinamic3/view/HButterStretchView");
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        if (getWidth() > 0 && !this.flag) {
            setImageUrl(this.imgUrl, this.stretchPercentX, getHeight() / getWidth(), this.localDrawable);
            this.flag = true;
        }
    }

    public void setImageUrl(String str, float f, BitmapDrawable bitmapDrawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e4091ae", new Object[]{this, str, new Float(f), bitmapDrawable});
            return;
        }
        this.flag = false;
        this.imgUrl = str;
        this.stretchPercentX = f;
        this.localDrawable = bitmapDrawable;
    }

    public HButterStretchView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public HButterStretchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
