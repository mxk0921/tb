package androidx.transition;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class GhostViewUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    private GhostViewUtils() {
    }

    public static GhostView addGhost(View view, ViewGroup viewGroup, Matrix matrix) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (GhostView) ipChange.ipc$dispatch("a30d5fb1", new Object[]{view, viewGroup, matrix});
        }
        if (Build.VERSION.SDK_INT == 28) {
            return GhostViewPlatform.addGhost(view, viewGroup, matrix);
        }
        return GhostViewPort.addGhost(view, viewGroup, matrix);
    }

    public static void removeGhost(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12cdc420", new Object[]{view});
        } else if (Build.VERSION.SDK_INT == 28) {
            GhostViewPlatform.removeGhost(view);
        } else {
            GhostViewPort.removeGhost(view);
        }
    }
}
