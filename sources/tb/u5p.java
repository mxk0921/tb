package tb;

import android.app.Activity;
import android.os.Build;
import android.view.Window;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.BaseActivity;
import com.taobao.tao.util.SystemBarDecorator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class u5p {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a extends xpo {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ Activity d;

        public a(boolean z, Activity activity) {
            this.c = z;
            this.d = activity;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/sf/util/SearchStatusBarUtil$1");
        }

        @Override // tb.xpo
        public void c() {
            SystemBarDecorator systemBarDecorator;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15c1193f", new Object[]{this});
            } else if (Build.MANUFACTURER.equalsIgnoreCase("OPPO")) {
                u5p.a(this.c, this.d);
            } else {
                Activity activity = this.d;
                if (activity instanceof BaseActivity) {
                    systemBarDecorator = ((BaseActivity) activity).getSystemBarDecorator();
                } else {
                    systemBarDecorator = null;
                }
                if (systemBarDecorator != null) {
                    systemBarDecorator.enableImmersiveStatusBar(this.c);
                }
            }
        }
    }

    static {
        t2o.a(815793502);
    }

    public static /* synthetic */ void a(boolean z, Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58fe15cf", new Object[]{new Boolean(z), activity});
        } else {
            b(z, activity);
        }
    }

    public static void b(boolean z, Activity activity) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a640e7d", new Object[]{new Boolean(z), activity});
            return;
        }
        int i2 = Build.VERSION.SDK_INT;
        Window window = activity.getWindow();
        window.addFlags(Integer.MIN_VALUE);
        int systemUiVisibility = window.getDecorView().getSystemUiVisibility();
        if (i2 >= 23) {
            if (z) {
                i = systemUiVisibility | 8192;
            } else {
                i = systemUiVisibility & (-8193);
            }
        } else if (z) {
            i = systemUiVisibility | 16;
        } else {
            i = systemUiVisibility & (-17);
        }
        window.getDecorView().setSystemUiVisibility(i);
    }

    public static void c(boolean z, Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("231e821b", new Object[]{new Boolean(z), activity});
        } else {
            activity.runOnUiThread(new a(z, activity));
        }
    }
}
