package androidx.constraintlayout.core.motion.utils;

import androidx.constraintlayout.core.motion.MotionWidget;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ViewState {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int bottom;
    public int left;
    public int right;
    public float rotation;
    public int top;

    public void getState(MotionWidget motionWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd7f37cc", new Object[]{this, motionWidget});
            return;
        }
        this.left = motionWidget.getLeft();
        this.top = motionWidget.getTop();
        this.right = motionWidget.getRight();
        this.bottom = motionWidget.getBottom();
        this.rotation = (int) motionWidget.getRotationZ();
    }

    public int height() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("58c32a21", new Object[]{this})).intValue();
        }
        return this.bottom - this.top;
    }

    public int width() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fcdb5f40", new Object[]{this})).intValue();
        }
        return this.right - this.left;
    }
}
