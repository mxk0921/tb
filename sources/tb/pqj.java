package tb;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class pqj {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_FEATURE_DISABLE_SCREEN_RECORD = "disableScreenCapture";

    /* renamed from: a  reason: collision with root package name */
    public static boolean f26237a = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f26238a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ boolean c;

        public a(Context context, boolean z, boolean z2) {
            this.f26238a = context;
            this.b = z;
            this.c = z2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                pqj.a(this.f26238a, this.b, this.c);
            }
        }
    }

    static {
        t2o.a(352321698);
    }

    public static /* synthetic */ void a(Context context, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27191a71", new Object[]{context, new Boolean(z), new Boolean(z2)});
        } else {
            c(context, z, z2);
        }
    }

    public static void b(Context context, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77a013bb", new Object[]{context, new Boolean(z), new Boolean(z2)});
            return;
        }
        d(context, z, z2);
        new Handler(Looper.getMainLooper()).postDelayed(new a(context, z, z2), 500L);
    }

    public static void c(Context context, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe4da343", new Object[]{context, new Boolean(z), new Boolean(z2)});
        } else if (context instanceof Activity) {
            Activity activity = (Activity) context;
            try {
                if (!activity.isFinishing() && !activity.isDestroyed()) {
                    if (z) {
                        if ((activity.getWindow().getAttributes().flags & 8192) != 0) {
                            d(context, true, z2);
                        } else {
                            txj.e("NdScreenRecordUtil", "changeRecordFlags 检查成功 enableScreenRecord true , 且忽略本次操作。");
                        }
                    } else if ((activity.getWindow().getAttributes().flags & 8192) == 0) {
                        d(context, false, z2);
                    } else {
                        txj.e("NdScreenRecordUtil", "changeRecordFlags 检查成功 enableScreenRecord false , 且忽略本次操作。");
                    }
                }
            } catch (Throwable th) {
                txj.f(txj.TAG_UNKNOWN_ERROR, "checkAndAppendFlags 检查时遇到不兼容的机型。忽略本次调用。" + context + " enableScreenRecord = " + z, th);
            }
        }
    }

    public static void d(Context context, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad689dc4", new Object[]{context, new Boolean(z), new Boolean(z2)});
        } else if (!(context instanceof Activity)) {
            txj.e(txj.TAG_IGNORE_ERROR, "changeRecordFlags 缺少 context 或非 Activity 。 忽略本次调用。" + context);
        } else {
            Activity activity = (Activity) context;
            try {
                if (!activity.isDestroyed()) {
                    if (z) {
                        if (!z2 && !f26237a) {
                            txj.e("NdScreenRecordUtil", "changeRecordFlags 开启录屏 - 忽略本次操作。");
                        }
                        txj.e("NdScreenRecordUtil", "changeRecordFlags 开启录屏。");
                        activity.getWindow().clearFlags(8192);
                    } else {
                        f26237a = true;
                        txj.e("NdScreenRecordUtil", "changeRecordFlags 禁止录屏。");
                        activity.getWindow().addFlags(8192);
                    }
                }
            } catch (Throwable th) {
                txj.f(txj.TAG_UNKNOWN_ERROR, "changeRecordFlags 遇到不兼容的机型 。 忽略本次调用。" + context + " enableScreenRecord = " + z, th);
            }
        }
    }

    public static void e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34f0a8f8", new Object[]{context});
        } else {
            d(context, true, false);
        }
    }

    public static void f(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85ecb05c", new Object[]{context});
        } else {
            b(context, false, false);
        }
    }

    public static void g(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d871821", new Object[]{context});
        } else {
            b(context, true, false);
        }
    }
}
