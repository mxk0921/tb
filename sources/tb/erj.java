package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.common.LauncherRuntime;
import com.taobao.tao.log.TLog;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class erj {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int HISTORY_MAXIMUM_COUNT = 15;
    public static final String MODULE = "next_launch";
    public static final String TAG = "statistic";

    /* renamed from: a  reason: collision with root package name */
    public static final String f18777a = String.valueOf(LauncherRuntime.f8166a);
    public static final AtomicBoolean b = new AtomicBoolean(false);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a implements v11 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.application.common.IAppLaunchListener
        public void d(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("60cba989", new Object[]{this, new Integer(i), new Integer(i2)});
            } else if (i == 0 && i2 == 2) {
                erj.d();
            }
        }
    }

    public static void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3d03401", new Object[]{runnable});
        } else {
            ojg.EXECUTOR.submit(runnable);
        }
    }

    public static void b(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{application, hashMap});
        } else {
            a(new s2o(f18777a, "negative_feedback", 15));
        }
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("168a7d30", new Object[0])).booleanValue();
        }
        return b.get();
    }

    public static void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e3b41b3", new Object[0]);
            return;
        }
        TLog.loge(MODULE, TAG, "[stage] startup, onCompleted");
        f("launchComplete");
        e("launchComplete");
    }

    public static void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47b7b594", new Object[]{str});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        int h = h(str);
        if (h != -1) {
            if (h == 0) {
                g();
            }
            a(new ygq(f18777a, "negative_feedback", h, currentTimeMillis));
        }
    }

    public static void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6ffc925", new Object[0]);
            return;
        }
        String str = f18777a;
        t5r.b("diagnoseSession", str);
        fxp j = fxp.j();
        TLog.loge(MODULE, TAG, "[stage] startup, " + j);
        c21.d(new a());
        a(new giq(j, str, "negative_feedback"));
    }

    public static void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be9b7d8d", new Object[]{str});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        int h = h(str);
        if (h != -1) {
            if (h == 3) {
                b.compareAndSet(false, true);
            }
            a(new vgq(f18777a, "negative_feedback", h, currentTimeMillis));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int h(String str) {
        char c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("761e1d76", new Object[]{str})).intValue();
        }
        str.hashCode();
        switch (str.hashCode()) {
            case -1610222413:
                if (str.equals("usingRsoExtractedKernel")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1140894196:
                if (str.equals("launchComplete")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -980202207:
                if (str.equals("launchCompleteTimeout6")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -527490869:
                if (str.equals("preExtractedUC")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -321497452:
                if (str.equals("launchCompleteTimeout10")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -1605823:
                if (str.equals("launchBackgroundDeepIdle")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 102099095:
                if (str.equals("m-a-c")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 102103898:
                if (str.equals("m-f-a")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 102116413:
                if (str.equals("m-s-w")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 797542700:
                if (str.equals("m-a-head")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 797896604:
                if (str.equals("m-a-tail")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 1160882451:
                if (str.equals("m-launch")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 1358200101:
                if (str.equals("scheduleBackgroundDeepIdle")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                return 11;
            case 1:
                return 6;
            case 2:
                return 7;
            case 3:
                return 10;
            case 4:
                return 8;
            case 5:
            case '\f':
                return 9;
            case 6:
                return 3;
            case 7:
                return 5;
            case '\b':
                return 4;
            case '\t':
                return 1;
            case '\n':
                return 2;
            case 11:
                return 0;
            default:
                return -1;
        }
    }
}
