package androidx.core.content.pm;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public abstract class ShortcutInfoChangeListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public void onAllShortcutsRemoved() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5949341c", new Object[]{this});
        }
    }

    public void onShortcutAdded(List<ShortcutInfoCompat> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37622cb3", new Object[]{this, list});
        }
    }

    public void onShortcutRemoved(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f01d153", new Object[]{this, list});
        }
    }

    public void onShortcutUpdated(List<ShortcutInfoCompat> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d1fde2e", new Object[]{this, list});
        }
    }

    public void onShortcutUsageReported(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca4f6447", new Object[]{this, list});
        }
    }
}
