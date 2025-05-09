package com.taobao.android.detail.ttdetail.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.widget.desc.image.DetailImageView;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class FilterImageView extends DetailImageView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int color = 134217728;

    static {
        t2o.a(912262898);
    }

    public FilterImageView(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(FilterImageView filterImageView, String str, Object... objArr) {
        if (str.hashCode() == -1117127205) {
            super.onDraw((Canvas) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/widget/FilterImageView");
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        super.onDraw(canvas);
        canvas.drawColor(this.color);
    }

    public void setColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("666e7bdb", new Object[]{this, new Integer(i)});
        } else {
            this.color = i;
        }
    }

    public FilterImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
