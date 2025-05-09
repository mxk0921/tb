package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class w84 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a(View view, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db044f24", new Object[]{view, runnable});
        } else {
            b(view, runnable);
        }
    }

    public static void b(View view, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d93b55c0", new Object[]{view, runnable});
        } else {
            view.postOnAnimation(runnable);
        }
    }
}
