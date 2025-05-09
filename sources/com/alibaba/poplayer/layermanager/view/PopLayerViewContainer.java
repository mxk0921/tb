package com.alibaba.poplayer.layermanager.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.dgw;
import tb.t2o;
import tb.wdm;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class PopLayerViewContainer extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Canvas mPageCanvas;

    static {
        t2o.a(625999968);
    }

    public PopLayerViewContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        initialize(context);
    }

    private void initialize(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1dcfb91", new Object[]{this, context});
            return;
        }
        Canvas canvas = new Canvas(context);
        this.mPageCanvas = canvas;
        canvas.setImportantForAccessibility(2);
        setTag(dgw.APM_VIEW_TOKEN, dgw.APM_VIEW_IGNORE);
        addView(this.mPageCanvas, new FrameLayout.LayoutParams(-1, -1));
        wdm.d("PopLayerViewContainer.initialize.success?this=%s", this);
    }

    public static /* synthetic */ Object ipc$super(PopLayerViewContainer popLayerViewContainer, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/poplayer/layermanager/view/PopLayerViewContainer");
    }

    public Canvas getCanvas() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Canvas) ipChange.ipc$dispatch("dcb0be09", new Object[]{this});
        }
        return this.mPageCanvas;
    }

    public PopLayerViewContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        initialize(context);
    }

    public PopLayerViewContainer(Context context) {
        super(context);
        initialize(context);
    }
}
