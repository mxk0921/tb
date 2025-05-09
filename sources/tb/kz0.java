package tb;

import android.view.View;
import android.view.animation.ScaleAnimation;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class kz0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(310378900);
    }

    public static void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f726047", new Object[]{view});
            return;
        }
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.5f, 1.0f, 0.5f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(100L);
        view.startAnimation(scaleAnimation);
    }
}
