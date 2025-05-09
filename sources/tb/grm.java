package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class grm {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TBVIDESDK_RED_POINT_PRELOAD_CONFIG = "TBVIDESDK_RED_POINT_PRELOAD_CONFIG";
    public static final String VIDEO_INTERNAL_BG_SAVE_EXPOSED = "VIDEO_INTERNAL_BG_SAVE_EXPOSED";
    public static final String VIDEO_INTERNAL_BG_SAVE_UNEXPOSED_OR_EXPOSED = "VIDEO_INTERNAL_BG_SAVE_UNEXPOSED_OR_EXPOSED";

    /* renamed from: a  reason: collision with root package name */
    public boolean f20182a;
    public long e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean m;
    public long b = -1;
    public long c = -1;
    public long d = -1;
    public long[] k = null;
    public boolean l = true;

    static {
        t2o.a(468714650);
    }

    public grm(JSONObject jSONObject) {
        a(jSONObject);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0047 A[Catch: all -> 0x003e, TryCatch #0 {all -> 0x003e, blocks: (B:6:0x0017, B:8:0x001d, B:10:0x0028, B:12:0x0031, B:16:0x0041, B:18:0x0047, B:19:0x0050, B:22:0x0057), top: B:25:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0056 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0057 A[Catch: all -> 0x003e, TRY_LEAVE, TryCatch #0 {all -> 0x003e, blocks: (B:6:0x0017, B:8:0x001d, B:10:0x0028, B:12:0x0031, B:16:0x0041, B:18:0x0047, B:19:0x0050, B:22:0x0057), top: B:25:0x0017 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(com.alibaba.fastjson.JSONObject r5) {
        /*
            r4 = this;
            java.lang.String r0 = "PickPreloadController_PreloadABConfig_PreloadVideoModule"
            com.android.alibaba.ip.runtime.IpChange r1 = tb.grm.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L_0x0017
            java.lang.String r0 = "42e10a16"
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r4
            r3 = 1
            r2[r3] = r5
            r1.ipc$dispatch(r0, r2)
            return
        L_0x0017:
            boolean r1 = tb.sz3.b(r5)     // Catch: all -> 0x003e
            if (r1 != 0) goto L_0x0040
            java.lang.String r1 = "prefetchConfig"
            java.lang.Object r5 = r5.get(r1)     // Catch: all -> 0x003e
            boolean r1 = r5 instanceof java.util.Map     // Catch: all -> 0x003e
            if (r1 == 0) goto L_0x0040
            r1 = r5
            java.util.Map r1 = (java.util.Map) r1     // Catch: all -> 0x003e
            boolean r1 = tb.sz3.b(r1)     // Catch: all -> 0x003e
            if (r1 != 0) goto L_0x0040
            com.alibaba.fastjson.JSONObject r1 = new com.alibaba.fastjson.JSONObject     // Catch: all -> 0x003e
            java.util.Map r5 = (java.util.Map) r5     // Catch: all -> 0x003e
            r1.<init>(r5)     // Catch: all -> 0x003e
            java.lang.String r5 = "PickPreloadControllerNew,initABConfig,优先从preloadArgs读取"
            tb.ir9.b(r0, r5)     // Catch: all -> 0x003e
            goto L_0x0041
        L_0x003e:
            r5 = move-exception
            goto L_0x005e
        L_0x0040:
            r1 = 0
        L_0x0041:
            boolean r5 = tb.sz3.b(r1)     // Catch: all -> 0x003e
            if (r5 == 0) goto L_0x0050
            java.lang.String r5 = "TBVIDESDK_RED_POINT_PRELOAD_CONFIG"
            java.lang.Object r5 = tb.ggs.a(r5)     // Catch: all -> 0x003e
            r1 = r5
            com.alibaba.fastjson.JSONObject r1 = (com.alibaba.fastjson.JSONObject) r1     // Catch: all -> 0x003e
        L_0x0050:
            boolean r5 = tb.sz3.b(r1)     // Catch: all -> 0x003e
            if (r5 == 0) goto L_0x0057
            return
        L_0x0057:
            r4.e(r1)     // Catch: all -> 0x003e
            r4.c(r1)     // Catch: all -> 0x003e
            goto L_0x0065
        L_0x005e:
            java.lang.String r1 = r5.getMessage()
            tb.ir9.c(r0, r1, r5)
        L_0x0065:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.grm.a(com.alibaba.fastjson.JSONObject):void");
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("31faedb", new Object[]{this})).booleanValue();
        }
        return this.m;
    }

    public final void c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91f074b9", new Object[]{this, jSONObject});
            return;
        }
        try {
            if (!sz3.b(jSONObject)) {
                Object obj = jSONObject.get("abConfig");
                if (obj instanceof Map) {
                    Map map = (Map) obj;
                    if (!sz3.b(map)) {
                        d(map);
                    }
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
            ir9.c("PickPreloadController_PreloadABConfig_PreloadVideoModule", th.getMessage(), th);
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "PreloadABConfig{enable=" + this.f20182a + ", predownloadSize=" + this.b + ", timeoutDura=" + this.c + ", requestTimeoutDura=" + this.d + ", autoScrollDelay=" + this.e + ", enableNetState=" + this.f + ", disableExposed=" + this.g + ", enableWeexDelay=" + this.h + ", disableBgDownload=" + this.i + ", enableLoadFirstFrame=" + this.j + ", cacheExpireTimestamp=" + this.k + ", enableRequestAfterExpire=" + this.l + '}';
    }

    public final void d(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a43bf85b", new Object[]{this, map});
            return;
        }
        Map z = nwv.z(map.get("tab2FrameworkRefactor"), null);
        if (!sz3.b(z) && z.containsKey("feConfig")) {
            this.m = true;
        }
        ir9.b("PickPreloadController_PreloadABConfig_PreloadVideoModule", "是否是导购版？" + this.m);
    }

    public final void e(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60dc67f", new Object[]{this, jSONObject});
        } else if (!sz3.b(jSONObject)) {
            this.f20182a = jSONObject.getBooleanValue("enable");
            this.b = nwv.y(jSONObject.get("pdl_size"), 819200L);
            this.c = jSONObject.getLongValue("e_dura") * 1000;
            this.d = jSONObject.getLongValue("re_dura") * 1000;
            this.f = jSONObject.getBooleanValue("enable_net_state");
            this.g = jSONObject.getBooleanValue("disable_exposed");
            this.h = nwv.o(jSONObject.get("enable_weex_delay"), true);
            this.j = nwv.o(jSONObject.get("enable_load_first_frame_v2"), false);
            this.i = jSONObject.getBooleanValue("disable_bg_download");
            this.e = nwv.y(jSONObject.get("auto_scroll_delay"), 1500L);
            Object obj = jSONObject.get("cache_expire_timestamp");
            if (obj != null) {
                String obj2 = obj.toString();
                if (!TextUtils.isEmpty(obj2)) {
                    String[] split = obj2.split(",");
                    this.k = new long[split.length];
                    for (int i = 0; i < split.length; i++) {
                        this.k[i] = nwv.y(split[i], Long.MAX_VALUE);
                    }
                }
            }
            this.l = nwv.o(jSONObject.get("enable_request_after_expire"), true);
            ir9.b("PickPreloadController_PreloadABConfig_PreloadVideoModule", "ABTest:" + this);
        }
    }
}
