package com.taobao.android.autosize.orientation;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.TBDeviceUtils;
import com.taobao.android.virtual_thread.face.VExecutors;
import com.taobao.tao.log.TLog;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.concurrent.Executor;
import tb.qqt;
import tb.xxa;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class FoldPosture {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int FLAT_STATUS = 0;
    public static final int FULL_FOLDED_STATUS = 2;
    public static final int HALF_OPENED_STATUS = 1;
    public static final int UNKNOWN_STATUS = -1;

    /* compiled from: Taobao */
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public @interface FoldStatus {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a implements qqt {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.qqt
        public String newThreadName() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("57dab4a4", new Object[]{this});
            }
            return "AutoSizeFoldPostureThread";
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b implements xxa.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public float f6433a = -1.0f;
        public final /* synthetic */ d b;

        public b(d dVar) {
            this.b = dVar;
        }

        @Override // tb.xxa.b
        public void a(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4d1f5f95", new Object[]{this, new Float(f)});
                return;
            }
            if (this.f6433a < 90.0f && f > 90.0f) {
                this.b.onChange();
            }
            if (this.f6433a > 5.0f && f < 5.0f) {
                this.b.onChange();
            }
            this.f6433a = f;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class c extends ContentObserver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d f6434a;
        public final /* synthetic */ Context b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Handler handler, d dVar, Context context) {
            super(handler);
            this.f6434a = dVar;
            this.b = context;
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            if (str.hashCode() == -1222901218) {
                super.onChange(((Boolean) objArr[0]).booleanValue());
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/autosize/orientation/FoldPosture$3");
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b71c021e", new Object[]{this, new Boolean(z)});
                return;
            }
            super.onChange(z);
            TLog.loge("TBAutoSize.FoldPosture", "onChange=" + z);
            this.f6434a.onChange();
            this.f6434a.a(FoldPosture.f(TBDeviceUtils.a(this.b)));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface d {
        void a(String str);

        void onChange();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class e implements InvocationHandler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final Context f6435a;
        public final d b;

        public e(Context context, d dVar) {
            this.f6435a = context;
            this.b = dVar;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("8a05e524", new Object[]{this, obj, method, objArr});
            }
            if (method.getName().equals("onStateChanged")) {
                TLog.loge("TBAutoSize.FoldPosture", "onStateChanged");
                this.b.onChange();
                this.b.a(FoldPosture.f(TBDeviceUtils.a(this.f6435a)));
                return null;
            } else if (!method.getName().equals("onBaseStateChanged")) {
                return null;
            } else {
                TLog.loge("TBAutoSize.FoldPosture", "onBaseStateChanged");
                this.b.onChange();
                this.b.a(FoldPosture.f(TBDeviceUtils.a(this.f6435a)));
                return null;
            }
        }
    }

    public static void b(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6742c5e4", new Object[]{dVar});
        } else {
            xxa.g().e(new b(dVar));
        }
    }

    public static void c(Context context, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("427fde24", new Object[]{context, dVar});
            return;
        }
        b(dVar);
        if (TextUtils.equals(Build.MANUFACTURER.toLowerCase(), "oppo")) {
            e(VExecutors.newSingleThreadExecutor(new a()), context, dVar);
        } else {
            d(context, dVar);
        }
    }

    public static String f(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("709e9963", new Object[]{new Integer(i)});
        }
        if (i == 0) {
            return "FLAT_STATUS";
        }
        if (i == 1) {
            return "HALF_OPENED_STATUS";
        }
        if (i != 2) {
            return "UNKNOWN_STATUS";
        }
        return "FULL_FOLDED_STATUS";
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0068, code lost:
        if (r1.equals("huawei") == false) goto L_0x0023;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String a() {
        /*
            r0 = 0
            com.android.alibaba.ip.runtime.IpChange r1 = com.taobao.android.autosize.orientation.FoldPosture.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L_0x0012
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = "c81a7bb8"
            java.lang.Object r0 = r1.ipc$dispatch(r2, r0)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L_0x0012:
            java.lang.String r1 = android.os.Build.MANUFACTURER
            java.lang.String r1 = r1.toLowerCase()
            r1.hashCode()
            r2 = -1
            int r3 = r1.hashCode()
            switch(r3) {
                case -1206476313: goto L_0x0061;
                case -759499589: goto L_0x0055;
                case 3620012: goto L_0x0049;
                case 99462250: goto L_0x003d;
                case 108389869: goto L_0x0031;
                case 1864941562: goto L_0x0025;
                default: goto L_0x0023;
            }
        L_0x0023:
            r0 = -1
            goto L_0x006b
        L_0x0025:
            java.lang.String r0 = "samsung"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x002f
            goto L_0x0023
        L_0x002f:
            r0 = 5
            goto L_0x006b
        L_0x0031:
            java.lang.String r0 = "redmi"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x003b
            goto L_0x0023
        L_0x003b:
            r0 = 4
            goto L_0x006b
        L_0x003d:
            java.lang.String r0 = "honor"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0047
            goto L_0x0023
        L_0x0047:
            r0 = 3
            goto L_0x006b
        L_0x0049:
            java.lang.String r0 = "vivo"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0053
            goto L_0x0023
        L_0x0053:
            r0 = 2
            goto L_0x006b
        L_0x0055:
            java.lang.String r0 = "xiaomi"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x005f
            goto L_0x0023
        L_0x005f:
            r0 = 1
            goto L_0x006b
        L_0x0061:
            java.lang.String r3 = "huawei"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x006b
            goto L_0x0023
        L_0x006b:
            switch(r0) {
                case 0: goto L_0x007b;
                case 1: goto L_0x0078;
                case 2: goto L_0x0078;
                case 3: goto L_0x0074;
                case 4: goto L_0x0078;
                case 5: goto L_0x0070;
                default: goto L_0x006e;
            }
        L_0x006e:
            r0 = 0
            return r0
        L_0x0070:
            java.lang.String r0 = "semDisplayDeviceType"
            return r0
        L_0x0074:
            java.lang.String r0 = "hn_fold_screen_state"
            return r0
        L_0x0078:
            java.lang.String r0 = "device_posture"
            return r0
        L_0x007b:
            java.lang.String r0 = "hw_fold_display_mode_prepare"
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.autosize.orientation.FoldPosture.a():java.lang.String");
    }

    public static void d(Context context, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44ca89ab", new Object[]{context, dVar});
            return;
        }
        ContentResolver contentResolver = context.getContentResolver();
        if (contentResolver != null) {
            String a2 = a();
            if (!TextUtils.isEmpty(a2)) {
                try {
                    contentResolver.registerContentObserver(Settings.Global.getUriFor(a2), false, new c(new Handler(Looper.getMainLooper()), dVar, context));
                } catch (RuntimeException e2) {
                    TLog.loge("TBAutoSize.FoldPosture", "registerObserverBySetting: ", e2);
                }
            }
        }
    }

    public static void e(Executor executor, Context context, d dVar) {
        try {
            Object newInstance = Class.forName("android.hardware.devicestate.DeviceStateManager").newInstance();
            Class<?> cls = Class.forName("android.hardware.devicestate.DeviceStateManager");
            Class<?> cls2 = Class.forName("android.hardware.devicestate.DeviceStateManager$DeviceStateCallback");
            cls.getMethod("registerCallback", Executor.class, cls2).invoke(newInstance, executor, Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls2}, new e(context, dVar)));
        } catch (Exception e2) {
            TLog.loge("TBAutoSize.FoldPosture", "registerOppoObserver: ", e2);
        }
    }
}
