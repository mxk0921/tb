package tb;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.monitor.SceneStage;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class mug {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static int f24316a = -1;
    public static int b = -1;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            hha.b("GoodPerformanceMonitor", "endMonitor | end.");
            uvg.g().d("tbl_good_open3_p");
            mug.a();
        }
    }

    static {
        t2o.a(295699044);
    }

    public static /* synthetic */ void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcd60777", new Object[0]);
        } else {
            h();
        }
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5baf9d06", new Object[0]);
        } else {
            new Handler(Looper.getMainLooper()).postDelayed(new a(), 500L);
        }
    }

    public static void c(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb220452", new Object[]{new Long(j)});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("configInitTime", "" + j);
        uvg.g().b("tbl_good_open3_p", SceneStage.SCENE_STAGE_T0, hashMap);
    }

    public static void e() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25d72522", new Object[0]);
            return;
        }
        int i2 = f24316a;
        if (i2 >= 0 && (i = b) >= 0) {
            int i3 = i2 + 1;
            f24316a = i3;
            if (i3 == i) {
                uvg.g().a("tbl_good_open3_p", SceneStage.SCENE_STAGE_T3);
                b();
            }
        }
    }

    public static void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("317e9e53", new Object[0]);
        } else {
            uvg.g().b("tbl_good_open3_p", SceneStage.SCENE_STAGE_T1, null);
        }
    }

    public static void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[0]);
            return;
        }
        f24316a = -1;
        b = -1;
    }

    public static void f(boolean z, xea xeaVar, boolean z2) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebfd2e69", new Object[]{new Boolean(z), xeaVar, new Boolean(z2)});
            return;
        }
        hha.b("GoodPerformanceMonitor", "onShowStart | start.");
        f24316a = 0;
        HashMap hashMap = new HashMap();
        String str2 = "0";
        hashMap.put("isFirst", z ? "1" : str2);
        if (z2) {
            str2 = "1";
        }
        hashMap.put("isUnderTak", str2);
        hashMap.put("from", jga.e(xeaVar));
        if (xeaVar != null) {
            hashMap.put("session_id", xeaVar.y());
            hashMap.put("live_source", xeaVar.v());
            hashMap.put("entry_live_source", xeaVar.m());
            if (xeaVar.H() == null) {
                str = "";
            } else {
                str = xeaVar.H().roomStatus;
            }
            hashMap.put("room_status", str);
            hashMap.put("is_login", String.valueOf(gq0.i().checkSessionValid()));
            hashMap.put("timestampSystemClock", String.valueOf(SystemClock.uptimeMillis()));
        }
        hashMap.put("deviceLevel", "" + ekr.i());
        hashMap.put("gl_opt", "" + wda.E());
        uvg.g().k("tbl_good_open3_p", hashMap);
    }

    public static void d(xea xeaVar, String str, long j, long j2, long j3, int i, boolean z) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("509d84e7", new Object[]{xeaVar, str, new Long(j), new Long(j2), new Long(j3), new Integer(i), new Boolean(z)});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("process", Long.toString(j3));
        hashMap.put("request", Long.toString(j2));
        if (z) {
            str2 = "1";
        } else {
            str2 = "0";
        }
        hashMap.put("isCdn", str2);
        hashMap.put("listC", String.valueOf(i));
        hashMap.put("categoryId", str);
        hashMap.put("dataParseTime", "" + j);
        hashMap.put("glNewPage", "1");
        b = 4;
        f24316a = 0;
        if (i < 4) {
            b = i;
        }
        uvg.g().b("tbl_good_open3_p", SceneStage.SCENE_STAGE_T2, hashMap);
        if (b == 0) {
            hha.b("GoodPerformanceMonitor", "itemListRequest | report.");
            uvg.g().a("tbl_good_open3_p", SceneStage.SCENE_STAGE_T3);
            b();
        }
    }
}
