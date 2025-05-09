package com.taobao.weex.layout;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.common.Destroyable;
import com.taobao.weex.ui.component.WXComponent;
import java.io.Serializable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public abstract class ContentBoxMeasurement implements Serializable, Destroyable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public WXComponent mComponent;
    public float mMeasureHeight;
    public float mMeasureWidth;

    static {
        t2o.a(985661623);
        t2o.a(985661561);
    }

    public ContentBoxMeasurement() {
        this.mComponent = null;
    }

    @Override // com.taobao.weex.common.Destroyable
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            this.mComponent = null;
        }
    }

    public float getHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4703e214", new Object[]{this})).floatValue();
        }
        return this.mMeasureHeight;
    }

    public float getWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fc48d087", new Object[]{this})).floatValue();
        }
        return this.mMeasureWidth;
    }

    public abstract void layoutAfter(float f, float f2);

    public abstract void layoutBefore();

    public final void measure(float f, float f2, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f178a8c5", new Object[]{this, new Float(f), new Float(f2), new Integer(i), new Integer(i2)});
        } else {
            measureInternal(f, f2, i, i2);
        }
    }

    public abstract void measureInternal(float f, float f2, int i, int i2);

    public ContentBoxMeasurement(WXComponent wXComponent) {
        this.mComponent = wXComponent;
    }
}
