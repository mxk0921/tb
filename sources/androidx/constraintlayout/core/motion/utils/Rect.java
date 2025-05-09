package androidx.constraintlayout.core.motion.utils;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class Rect {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int bottom;
    public int left;
    public int right;
    public int top;

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
