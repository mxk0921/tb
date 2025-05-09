package androidx.constraintlayout.widget;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public abstract class ConstraintsChangedListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public void postLayoutChange(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e1ebbe1", new Object[]{this, new Integer(i), new Integer(i2)});
        }
    }

    public void preLayoutChange(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b987b24", new Object[]{this, new Integer(i), new Integer(i2)});
        }
    }
}
