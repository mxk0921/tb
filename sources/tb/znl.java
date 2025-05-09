package tb;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Debug;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Display;
import android.view.KeyEvent;
import android.view.Window;
import android.view.WindowManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.TBDeviceUtils;
import com.taobao.orange.OConstant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class znl extends vy1 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static String i0 = "";
    public static String j0;
    public static final List<String> k0 = new ArrayList(4);
    public static final List<String> l0;
    public static final List<String> m0;
    @Deprecated
    public long L;
    public long M;
    public long[] P;
    public long N = 0;
    public final JSONObject O = new JSONObject();
    public final long[] Q = new long[2];
    public long R = 0;
    public long S = 0;
    public long T = 0;
    public long U = 0;
    public final ysg V = new ysg(w9a.g().a().getPackageName());
    public jft W = null;
    public long X = 0;
    public boolean Y = true;
    public final Map<String, Long> Z = new HashMap();
    public boolean a0 = true;
    public boolean b0 = true;
    public boolean c0 = true;
    public boolean d0 = true;
    public boolean e0 = true;
    public boolean f0 = true;
    public int g0 = 1;
    public boolean h0 = true;

    static {
        ArrayList arrayList = new ArrayList();
        l0 = arrayList;
        ArrayList arrayList2 = new ArrayList();
        m0 = arrayList2;
        arrayList.add(hx9.KEY_FRAGMENT_IS_FRAGMENT_MODEL);
        arrayList.add("lastJumpPageSchemaUrl");
        arrayList.add("fullPageName");
        arrayList.add("activityName");
        arrayList2.add("constructPageTime");
        arrayList2.add("navStartTime");
        arrayList2.add("navStartActivityTime");
        arrayList2.add("navStartPageTime");
        arrayList2.add("jumpTime");
    }

    public znl(cll cllVar) {
        super(cllVar);
    }

    public static /* synthetic */ Object ipc$super(znl znlVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -410389705) {
            super.R();
            return null;
        } else if (hashCode == 1096318669) {
            super.Q(((Number) objArr[0]).longValue());
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/monitor/impl/processor/custom/PageProcessor");
        }
    }

    @Override // com.taobao.monitor.impl.trace.c.AbstractC0626c
    public void F(float f, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d77c72", new Object[]{this, new Float(f), new Integer(i), new Integer(i2)});
            return;
        }
        yi7.b = i;
        if (i > 0) {
            this.d.a("plugged", Integer.valueOf(i));
        }
    }

    @Override // com.taobao.monitor.impl.trace.c.AbstractC0626c
    public void J(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbfef539", new Object[]{this, str});
        }
    }

    @Override // tb.vy1
    public void c0(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88e43e3a", new Object[]{this, new Long(j)});
        } else {
            this.d.j("customFirstScreenPaint", j);
        }
    }

    @Override // com.taobao.monitor.impl.trace.c.AbstractC0626c
    public void i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50fe35c7", new Object[]{this, str});
        }
    }

    @Override // tb.vy1
    public void k0(cll cllVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("362a79ae", new Object[]{this, cllVar, new Long(j)});
        } else if (this.d0) {
            this.d.j("customDisplayedTime", j);
            this.d0 = false;
        }
    }

    @Override // com.taobao.monitor.impl.trace.l.c
    public void o(Activity activity, int i, float f, float f2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("747a3d9a", new Object[]{this, activity, new Integer(i), new Float(f), new Float(f2), new Long(j)});
        } else if (qgw.c(activity, this.c.w())) {
            if (this.h0) {
                this.d.j("firstInteractiveTime", j);
                this.d.a("firstInteractiveDuration", Long.valueOf(j - this.L));
                this.h0 = false;
            }
            List<String> list = k0;
            ((ArrayList) list).clear();
            ((ArrayList) list).add(xol.c(activity));
            nca.r = xol.c(activity);
            nca.p = j;
        }
    }

    public final void p0(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14506db7", new Object[]{this, map});
        } else if (map != null) {
            try {
                for (Map.Entry<String, Object> entry : map.entrySet()) {
                    if (!TextUtils.isEmpty(entry.getKey()) && ((ArrayList) l0).contains(entry.getKey()) && entry.getValue() != null) {
                        this.d.a(entry.getKey(), entry.getValue());
                    }
                    if (!TextUtils.isEmpty(entry.getKey()) && ((ArrayList) m0).contains(entry.getKey()) && entry.getValue() != null) {
                        this.d.j(entry.getKey(), rrl.f(entry.getValue(), -1L));
                    }
                }
                this.c.X(rrl.f(map.get("navStartTime"), -1L));
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public final JSONObject q0(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("e2aeb53c", new Object[]{this, map});
        }
        if (map == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            for (Object obj : map.keySet()) {
                jSONObject.put(String.valueOf(obj), map.get(obj));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    public final void r0(Activity activity) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1efad888", new Object[]{this, activity});
        } else if (activity != null) {
            Intent intent = activity.getIntent();
            if (intent != null) {
                String stringExtra = intent.getStringExtra("referrer");
                if (!TextUtils.isEmpty(stringExtra)) {
                    try {
                        Uri parse = Uri.parse(stringExtra);
                        str = parse.getHost() + parse.getPath();
                    } catch (Exception e) {
                        str = e.getMessage();
                    }
                    this.d.a("referer", str);
                }
            }
            str = "null";
            this.d.a("referer", str);
        }
    }

    @Override // com.taobao.monitor.impl.trace.c.AbstractC0626c
    public void s(String str, int i, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d2363ef", new Object[]{this, str, new Integer(i), new Long(j)});
        }
    }

    @Override // com.taobao.monitor.impl.trace.MemoryDispatcher.b
    public void y(long j, long j2, long j3, long j4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97b34dc7", new Object[]{this, new Long(j), new Long(j2), new Long(j3), new Long(j4)});
            return;
        }
        Long l = (Long) ((HashMap) this.Z).get("peakJavaMemoryUsage");
        if (l == null || l.longValue() < j) {
            ((HashMap) this.Z).put("peakJavaMemoryUsage", Long.valueOf(j));
        }
        Long l2 = (Long) ((HashMap) this.Z).get("peakNativeHeapSize");
        if (l2 == null || l2.longValue() < j2) {
            ((HashMap) this.Z).put("peakNativeHeapSize", Long.valueOf(j2));
        }
        Long l3 = (Long) ((HashMap) this.Z).get("peakNativeHeapAllocated");
        if (l3 == null || l3.longValue() < j3) {
            ((HashMap) this.Z).put("peakNativeHeapAllocated", Long.valueOf(j3));
        }
        Long l4 = (Long) ((HashMap) this.Z).get("peakPss");
        if (j4 <= 0) {
            return;
        }
        if (l4 == null || l4.longValue() < j4) {
            ((HashMap) this.Z).put("peakPss", Long.valueOf(j4));
        }
    }

    @Override // tb.vy1
    public void Z(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39024f3b", new Object[]{this, str, new Long(j)});
        } else if (this.a0) {
            this.a0 = false;
            this.d.a("leaveType", str);
            this.d.j("leaveTime", j);
        }
    }

    public final void o0(String str, String str2, long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1955211", new Object[]{this, str, str2, new Long(j), new Long(j2)});
            return;
        }
        this.d.a("isFirstLoad", Boolean.valueOf(nca.s.a(this.c.o())));
        this.d.a("pageName", str);
        this.d.a("isFirstInstall", Boolean.valueOf(nca.b));
        this.d.a("isFirstLaunch", Boolean.valueOf(nca.d));
        this.d.a("lastValidTime", Long.valueOf(nca.p));
        this.d.a("lastValidLinksPage", k0.toString());
        this.d.a("lastValidPage", nca.r);
        this.d.a(pl4.KEY_LOAD_TYPE, "push");
        yxm.b(this.d, "fromPageName", i0);
        yxm.b(this.d, "lastJumpPage", j0);
        yxm.b(this.d, "schemaUrl", str2);
        yxm.b(this.d, k7m.KEY_DEVICE_TYPE, nca.a());
        this.d.j(OConstant.DIMEN_PROCESS_START_TIME, nca.i);
        this.d.j("launchStartTime", nca.l);
        this.d.j("pageStartTime", j2);
        this.d.j("loadStartTime", j);
        HashMap hashMap = new HashMap(1);
        hashMap.put("timestamp", Long.valueOf(j2));
        this.d.d("onPageCreate", hashMap);
    }

    @Override // com.taobao.monitor.impl.trace.b.AbstractC0625b
    public void onLowMemory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bbd23dd", new Object[]{this});
            return;
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put("timestamp", Long.valueOf(out.a()));
        this.d.d("onLowMemory", hashMap);
    }

    @Override // tb.px
    public void Q(long j) {
        WindowManager windowManager;
        Display defaultDisplay;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41587ecd", new Object[]{this, new Long(j)});
            return;
        }
        super.Q(j);
        this.d.j("procedureStartTime", j);
        this.d.a("errorCode", 1);
        this.d.a("installType", nca.g);
        this.d.a("timestampInterval", Long.valueOf(System.currentTimeMillis() - SystemClock.uptimeMillis()));
        this.d.a("leaveType", "other");
        this.d.a("saveMode", Boolean.valueOf(e81.b().getBoolean("saveMode", false)));
        yxm.a(this.d, "groupRelatedId", this.c.p());
        if (TBDeviceUtils.p(w9a.g().a())) {
            this.d.a("foldStatus", Integer.valueOf(TBDeviceUtils.a(w9a.g().a())));
        }
        Window C = this.c.C();
        if (C != null && (windowManager = C.getWindowManager()) != null && (defaultDisplay = windowManager.getDefaultDisplay()) != null) {
            this.d.a("pageRefreshRate", Integer.valueOf((int) defaultDisplay.getRefreshRate()));
        }
    }

    @Override // tb.vy1, tb.px
    public void R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e789f337", new Object[]{this});
            return;
        }
        super.R();
        if (this.d.isAlive()) {
            if (this.Y) {
                this.d.a("utSession", y2v.b().a());
            }
            if (this.c.u() != null) {
                this.d.a("pageCalculateType", "view_manual_calculate");
            }
            chb g = c21.g();
            zq6.a("PageProcessor", "errorCode", Integer.valueOf(this.g0));
            this.d.a("totalProcessCpuJiffy", Long.valueOf(this.X));
            this.d.a("totalVisibleDuration", Long.valueOf(this.N));
            this.d.a("deviceLevel", Integer.valueOf(g.getInt("deviceLevel", -1)));
            this.d.a("totalScrollTime", Long.valueOf(this.c.A()));
            yxm.c(this.d, "firstFrameTime", this.c.i());
            this.d.u("fps", this.z.toString());
            this.d.u("blockFps", this.B.toString());
            this.d.u("scrollHitchRate", this.I.toString());
            this.d.u("scrollFps", this.A.toString());
            this.d.u("frozenFrameCount", Integer.valueOf(this.C));
            this.d.u("slowFrameCount", Integer.valueOf(this.D));
            this.d.u("jankCount", Integer.valueOf(this.E));
            this.d.u("movieJankCount", Integer.valueOf(this.F));
            this.d.u("movieBigJankCount", Integer.valueOf(this.G));
            this.d.u("image", Integer.valueOf(this.r));
            this.d.u("imageOnRequest", Integer.valueOf(this.r));
            this.d.u("imageSuccessCount", Integer.valueOf(this.s));
            this.d.u("imageFailedCount", Integer.valueOf(this.t));
            this.d.u("imageCanceledCount", Integer.valueOf(this.u));
            this.d.u("network", Integer.valueOf(this.v));
            this.d.u("networkOnRequest", Integer.valueOf(this.v));
            this.d.u("networkSuccessCount", Integer.valueOf(this.w));
            this.d.u("networkFailedCount", Integer.valueOf(this.x));
            this.d.u("networkCanceledCount", Integer.valueOf(this.y));
            this.d.u("renderFrameCount", Integer.valueOf(this.c.k()));
            this.d.u("dropRenderFrameCount", Integer.valueOf(this.c.l()));
            this.d.u("scrollRenderFrameCount", Integer.valueOf(this.c.z()));
            this.d.u("blockRenderFrameCount", Integer.valueOf(this.c.g()));
            this.d.u("frozenRenderFrameCount", Integer.valueOf(this.c.m()));
            this.d.u("mainBlockFrameCauses", q0(this.c.t()));
            this.d.u("importantBlockFrameCauses", q0(this.c.r()));
            this.d.u("mainThreadBlock", Integer.valueOf(this.n0));
            this.d.u("totalTrafficRxBytes", Long.valueOf(this.Q[0]));
            this.d.u("totalTrafficTxBytes", Long.valueOf(this.Q[1]));
            this.d.u("blocking-gc-count", Long.valueOf(this.R));
            this.d.u("blocking-gc-time", Long.valueOf(this.S));
            if (o48.l) {
                try {
                    for (Map.Entry entry : ((HashMap) this.Z).entrySet()) {
                        this.O.put((String) entry.getKey(), entry.getValue());
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                this.d.a("runtimeInfo", this.O);
            }
            this.d.j("procedureEndTime", out.a());
            this.d.end();
        }
        l0();
    }

    @Override // com.taobao.monitor.impl.trace.l.c
    public void A(Activity activity, KeyEvent keyEvent, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b5c8321", new Object[]{this, activity, keyEvent, new Long(j)});
        } else if (qgw.c(activity, this.c.w())) {
            int action = keyEvent.getAction();
            int keyCode = keyEvent.getKeyCode();
            if (action != 0) {
                return;
            }
            if (keyCode == 4 || keyCode == 3) {
                HashMap hashMap = new HashMap(2);
                hashMap.put("timestamp", Long.valueOf(j));
                hashMap.put("key", Integer.valueOf(keyEvent.getKeyCode()));
                this.d.d("keyEvent", hashMap);
            }
        }
    }

    @Override // com.taobao.monitor.procedure.IPage.b
    public void K(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb5b476", new Object[]{this, new Long(j)});
            return;
        }
        zq6.a("PageProcessor", "onPageClickTime", Long.valueOf(j));
        this.d.j(s0j.MTS_TAG_CLICK_TIME, j);
    }

    @Override // tb.vy1
    public void a0(long j) {
        Map runtimeStats;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ed55e2a", new Object[]{this, new Long(j)});
            return;
        }
        zq6.a("PageProcessor", "onPageAppear", this.c.getPageName());
        long a2 = out.a();
        this.M = a2;
        this.W = this.V.e();
        HashMap hashMap = new HashMap(1);
        hashMap.put("timestamp", Long.valueOf(j));
        this.d.d("onPageAppear", hashMap);
        i0 = this.c.getPageName();
        if (this.c.J()) {
            j0 = this.c.getPageName();
        }
        if (this.b0 && this.P != null) {
            this.b0 = false;
            long[] a3 = ldu.a();
            long[] jArr = this.Q;
            long j2 = jArr[0];
            long j3 = a3[0];
            long[] jArr2 = this.P;
            jArr[0] = j2 + (j3 - jArr2[0]);
            jArr[1] = jArr[1] + (a3[1] - jArr2[1]);
        }
        this.P = ldu.a();
        nca.r = this.c.getPageName();
        nca.p = a2;
        if (o48.l) {
            try {
                this.O.put(h9z.EVENT_ON_APPEAR, yi7.a(true, j));
                this.d.a("plugged", Integer.valueOf(yi7.b));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        if (Build.VERSION.SDK_INT >= 23) {
            runtimeStats = Debug.getRuntimeStats();
            if (runtimeStats != null) {
                this.T = rrl.f(runtimeStats.get("art.gc.blocking-gc-count"), 0L);
                this.U = rrl.f(runtimeStats.get("art.gc.blocking-gc-time"), 0L);
                return;
            }
            this.T = -1L;
            this.U = -1L;
        }
    }

    @Override // tb.vy1
    public void d0(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5178cc21", new Object[]{this, new Long(j)});
            return;
        }
        zq6.a("PageProcessor", "onPageDestroy", this.c.getPageName());
        HashMap hashMap = new HashMap(1);
        hashMap.put("timestamp", Long.valueOf(j));
        this.d.d("onPageDestroy", hashMap);
        if (this.P != null) {
            long[] a2 = ldu.a();
            long[] jArr = this.Q;
            long j2 = jArr[0];
            long j3 = a2[0];
            long[] jArr2 = this.P;
            jArr[0] = j2 + (j3 - jArr2[0]);
            jArr[1] = jArr[1] + (a2[1] - jArr2[1]);
        }
        if (o48.l) {
            try {
                this.O.put("onDestroy", yi7.a(false, j));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b7, code lost:
        r12 = android.os.Debug.getRuntimeStats();
     */
    @Override // tb.vy1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void e0(long r12) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.znl.e0(long):void");
    }

    @Override // tb.vy1
    public void f0(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ceaa1f39", new Object[]{this, new Long(j)});
            return;
        }
        zq6.a("PageProcessor", "onPageInteractive", Long.valueOf(j));
        if (this.f0) {
            this.f0 = false;
            this.g0 = 0;
            this.d.a("interactiveDuration", Long.valueOf(j - this.L));
            this.d.a("loadDuration", Long.valueOf(j - this.L));
            this.d.j("interactiveTime", j);
            this.d.a("errorCode", 0);
            this.d.u("totalRx", Long.valueOf(this.Q[0]));
            this.d.u("totalTx", Long.valueOf(this.Q[1]));
        }
    }

    @Override // tb.vy1
    public void g0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3da6b118", new Object[]{this, new Integer(i)});
            return;
        }
        zq6.a("PageProcessor", "onPageLoadError", Integer.valueOf(i));
        if (this.g0 == 1) {
            this.d.a("errorCode", Integer.valueOf(i));
            this.g0 = i;
        }
    }

    @Override // tb.vy1
    public void i0(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9be833ef", new Object[]{this, new Long(j)});
            return;
        }
        zq6.a("PageProcessor", "onPageRenderStart", Long.valueOf(j));
        if (this.c0) {
            this.d.a("pageInitDuration", Long.valueOf(j - this.L));
            this.d.j("renderStartTime", j);
            this.c0 = false;
        }
    }

    @Override // tb.vy1
    public void j0(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91b206a9", new Object[]{this, new Long(j)});
            return;
        }
        zq6.a("PageProcessor", "onPageVisible", Long.valueOf(j));
        if (this.e0) {
            this.e0 = false;
            this.d.a("displayDuration", Long.valueOf(j - this.L));
            this.d.j("displayedTime", j);
            this.d.j("firstScreenPaint", j);
            if (this.Y && !TextUtils.isEmpty(y2v.b().a())) {
                this.d.a("utSession", y2v.b().a());
                this.Y = false;
            }
        }
    }

    @Override // tb.vy1
    public void h0(float f, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("336a65dc", new Object[]{this, new Float(f), new Long(j)});
            return;
        }
        zq6.a("PageProcessor", "onPageRenderPercent", Float.valueOf(f), Long.valueOf(j));
        if (this.e0) {
            this.d.a("onRenderPercent", Float.valueOf(f));
            this.d.a("drawPercentTime", Long.valueOf(j));
        }
    }

    @Override // com.taobao.monitor.impl.trace.ApplicationBackgroundChangedDispatcher.b
    public void r(int i, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("903f52fd", new Object[]{this, new Integer(i), new Long(j)});
            return;
        }
        zq6.a("PageProcessor", "onChanged", Integer.valueOf(i), Long.valueOf(j));
        if (i == 1) {
            HashMap hashMap = new HashMap(1);
            hashMap.put("timestamp", Long.valueOf(j));
            this.d.d("foreground2Background", hashMap);
            return;
        }
        HashMap hashMap2 = new HashMap(1);
        hashMap2.put("timestamp", Long.valueOf(j));
        this.d.d("background2Foreground", hashMap2);
    }

    @Override // tb.vy1
    public void b0(String str, String str2, Map<String, Object> map, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a494634", new Object[]{this, str, str2, map, new Long(j)});
            return;
        }
        zq6.a("PageProcessor", "onPageCreate", str, str2, map);
        this.L = out.a();
        long[] jArr = this.Q;
        jArr[0] = 0;
        jArr[1] = 0;
        this.P = ldu.a();
        ArrayList arrayList = (ArrayList) k0;
        if (arrayList.size() < 10) {
            arrayList.add(str);
        }
        p0(map);
        o0(str, str2, this.L, j);
        if (o48.l) {
            r0(this.c.f());
            try {
                this.O.put("onCreate", yi7.a(false, j));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }
}
