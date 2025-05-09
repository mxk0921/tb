package androidx.constraintlayout.motion.utils;

import android.view.View;
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

    public void getState(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90c04fb0", new Object[]{this, view});
            return;
        }
        this.left = view.getLeft();
        this.top = view.getTop();
        this.right = view.getRight();
        this.bottom = view.getBottom();
        this.rotation = view.getRotation();
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
