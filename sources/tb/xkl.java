package tb;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatDelegate;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class xkl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(295699890);
        t2o.a(295699891);
    }

    public void a(AppCompatDelegate appCompatDelegate, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5bf9e38", new Object[]{this, appCompatDelegate, context});
            return;
        }
        int max = Math.max(iw0.h(context) / 2, iw0.a(context, 375.0f));
        FrameLayout frameLayout = (FrameLayout) appCompatDelegate.findViewById(R.id.container);
        if (frameLayout != null) {
            ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            layoutParams.width = max;
            if (layoutParams instanceof FrameLayout.LayoutParams) {
                ((FrameLayout.LayoutParams) layoutParams).gravity = 85;
            }
        }
    }
}
