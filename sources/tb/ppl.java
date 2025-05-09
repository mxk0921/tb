package tb;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.provider.Settings;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class ppl {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final ppl INSTANCE = new ppl();
    public static final int SPEECH_MAX_END_SILENCE = 60000;
    public static final String SPEECH_RECOGNITION_POP_ID = "mega_speech_recognition_panel";

    static {
        t2o.a(133169192);
    }

    public final int a(Context context, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1a48ebe0", new Object[]{this, context, new Float(f)})).intValue();
        }
        ckf.g(context, "context");
        Resources resources = context.getResources();
        ckf.f(resources, "context.resources");
        return (int) ((f * resources.getDisplayMetrics().density) + 0.5f);
    }

    public final boolean b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bc4ba5d2", new Object[]{this, context})).booleanValue();
        }
        ckf.g(context, "context");
        if (Build.VERSION.SDK_INT >= 29) {
            return c(context);
        }
        return d(context);
    }

    public final void e(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec6b7f2d", new Object[]{this, runnable});
            return;
        }
        ckf.g(runnable, "runnable");
        new Handler(Looper.getMainLooper()).post(runnable);
    }

    public final void f(Context context, long j) {
        VibrationEffect createOneShot;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e92b3d53", new Object[]{this, context, new Long(j)});
            return;
        }
        ckf.g(context, "context");
        Object systemService = context.getSystemService("vibrator");
        if (!(systemService instanceof Vibrator)) {
            systemService = null;
        }
        Vibrator vibrator = (Vibrator) systemService;
        if (vibrator != null && vibrator.hasVibrator()) {
            if (Build.VERSION.SDK_INT >= 26) {
                createOneShot = VibrationEffect.createOneShot(j, -1);
                vibrator.vibrate(createOneShot);
                return;
            }
            vibrator.vibrate(j);
        }
    }

    public final boolean c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8c6569a7", new Object[]{this, context})).booleanValue();
        }
        try {
            return Settings.Global.getInt(context.getContentResolver(), "navigation_mode") == 2;
        } catch (Settings.SettingNotFoundException unused) {
            return d(context);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0040, code lost:
        if (r3.getInteger(r4) == 2) goto L_0x0042;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d(android.content.Context r8) {
        /*
            r7 = this;
            r0 = 1
            r1 = 0
            r2 = 2
            com.android.alibaba.ip.runtime.IpChange r3 = tb.ppl.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x001c
            java.lang.String r4 = "4247f127"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r7
            r2[r0] = r8
            java.lang.Object r8 = r3.ipc$dispatch(r4, r2)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            return r8
        L_0x001c:
            android.content.res.Resources r3 = r8.getResources()     // Catch: Exception -> 0x003a
            java.lang.String r4 = "config_navBarInteractionMode"
            java.lang.String r5 = "integer"
            java.lang.String r6 = "android"
            int r4 = r3.getIdentifier(r4, r5, r6)     // Catch: Exception -> 0x003a
            if (r4 != 0) goto L_0x003c
            android.view.ViewConfiguration r8 = android.view.ViewConfiguration.get(r8)     // Catch: Exception -> 0x003a
            boolean r8 = r8.hasPermanentMenuKey()     // Catch: Exception -> 0x003a
            if (r8 != 0) goto L_0x0038
            goto L_0x0042
        L_0x0038:
            r0 = 0
            goto L_0x0042
        L_0x003a:
            r8 = move-exception
            goto L_0x0044
        L_0x003c:
            int r8 = r3.getInteger(r4)     // Catch: Exception -> 0x003a
            if (r8 != r2) goto L_0x0038
        L_0x0042:
            r1 = r0
            goto L_0x004c
        L_0x0044:
            java.lang.String r0 = "NavigationUtils"
            java.lang.String r2 = "检测导航方式失败"
            android.util.Log.e(r0, r2, r8)
        L_0x004c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.ppl.d(android.content.Context):boolean");
    }
}
