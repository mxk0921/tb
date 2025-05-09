package com.taobao.weex.ui.action;

import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class GraphicPosition {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private float mBottom;
    private float mLeft;
    private float mRight;
    private float mTop;

    static {
        t2o.a(985661665);
    }

    public GraphicPosition(float f, float f2, float f3, float f4) {
        this.mLeft = f;
        this.mTop = f2;
        this.mRight = f3;
        this.mBottom = f4;
    }

    public float getBottom() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("89e4c918", new Object[]{this})).floatValue();
        }
        return this.mBottom;
    }

    public float getLeft() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e2350674", new Object[]{this})).floatValue();
        }
        return this.mLeft;
    }

    public float getRight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a1d449dd", new Object[]{this})).floatValue();
        }
        return this.mRight;
    }

    public float getTop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f9c9cf16", new Object[]{this})).floatValue();
        }
        return this.mTop;
    }

    public void setBottom(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("491a370c", new Object[]{this, new Float(f)});
        } else {
            this.mBottom = f;
        }
    }

    public void setLeft(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0bff230", new Object[]{this, new Float(f)});
        } else {
            this.mLeft = f;
        }
    }

    public void setRight(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6d9a97f", new Object[]{this, new Float(f)});
        } else {
            this.mRight = f;
        }
    }

    public void setTop(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a28de66", new Object[]{this, new Float(f)});
        } else {
            this.mTop = f;
        }
    }

    public void update(float f, float f2, float f3, float f4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99e138d0", new Object[]{this, new Float(f), new Float(f2), new Float(f3), new Float(f4)});
            return;
        }
        this.mTop = f;
        this.mBottom = f2;
        this.mLeft = f3;
        this.mRight = f4;
    }
}
