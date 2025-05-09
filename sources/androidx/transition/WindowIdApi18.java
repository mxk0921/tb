package androidx.transition;

import android.view.View;
import android.view.WindowId;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class WindowIdApi18 implements WindowIdImpl {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final WindowId mWindowId;

    public WindowIdApi18(View view) {
        this.mWindowId = view.getWindowId();
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (!(obj instanceof WindowIdApi18) || !((WindowIdApi18) obj).mWindowId.equals(this.mWindowId)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        return this.mWindowId.hashCode();
    }
}
