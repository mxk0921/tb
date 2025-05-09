package tb;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class tdw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(632291362);
        }

        public static void a(View view, Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("db044f24", new Object[]{view, runnable});
            } else if (view != null && runnable != null) {
                view.postOnAnimation(runnable);
            }
        }

        public static void b(View view, Drawable drawable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("142cf15f", new Object[]{view, drawable});
            } else if (view != null && drawable != null) {
                view.setBackground(drawable);
            }
        }
    }

    static {
        t2o.a(632291360);
    }

    public static void a(View view, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db044f24", new Object[]{view, runnable});
        } else {
            a.a(view, runnable);
        }
    }

    public static void b(View view, Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("142cf15f", new Object[]{view, drawable});
        } else {
            a.b(view, drawable);
        }
    }
}
