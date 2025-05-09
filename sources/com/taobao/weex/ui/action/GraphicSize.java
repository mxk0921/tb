package com.taobao.weex.ui.action;

import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class GraphicSize {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private float mHeight;
    private float mWidth;

    static {
        t2o.a(985661666);
    }

    public GraphicSize(float f, float f2) {
        this.mWidth = f;
        this.mHeight = f2;
    }

    public float getHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4703e214", new Object[]{this})).floatValue();
        }
        return this.mHeight;
    }

    public float getWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fc48d087", new Object[]{this})).floatValue();
        }
        return this.mWidth;
    }

    public void setHeight(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fde3d90", new Object[]{this, new Float(f)});
        } else {
            this.mHeight = f;
        }
    }

    public void setWidth(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("baf5f815", new Object[]{this, new Float(f)});
        } else {
            this.mWidth = f;
        }
    }

    public void update(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("848e34d0", new Object[]{this, new Float(f), new Float(f2)});
            return;
        }
        this.mWidth = f;
        this.mHeight = f2;
    }
}
