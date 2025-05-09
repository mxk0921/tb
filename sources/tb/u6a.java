package tb;

import android.app.Activity;
import android.graphics.Point;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.WindowManager;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.util.ActivityMonitor;
import com.taobao.android.behavir.util.UtUtils;
import com.taobao.android.behavix.postureCenter.services.info.DevicesDelegate;
import com.taobao.android.testutils.log.LogUtils;
import com.taobao.detail.rate.vivid.presenter.PreRequestPresenter;
import com.taobao.phenix.compat.stat.TBImageFlowMonitor;
import com.taobao.statistic.TBS;
import com.taobao.tao.log.TLog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import tb.v82;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class u6a extends GestureDetector.SimpleOnGestureListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static String d = "unknown";
    public static int e = -1;
    public static final Map<String, String> f = new HashMap();
    public static long g = 0;
    public static boolean h = false;
    public static float i = -1.0f;
    public static float j = -1.0f;
    public static long k = 0;
    public static boolean l = false;
    public static boolean m = false;
    public static boolean n = false;

    /* renamed from: a  reason: collision with root package name */
    public final List<String> f29177a = new ArrayList();
    public Map<String, String> b = null;
    public Map<String, String> c = null;

    public static /* synthetic */ String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[0]);
        }
        return d;
    }

    public static String b(float f2, float f3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e0ff2738", new Object[]{new Float(f2), new Float(f3)});
        }
        return c(f2, f3, false);
    }

    public static String c(float f2, float f3, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e223e4b4", new Object[]{new Float(f2), new Float(f3), new Boolean(z)});
        }
        float y = gwv.y(gwv.s() * 1.0f);
        float y2 = gwv.y(gwv.r() * 1.0f);
        float f4 = y / 4.0f;
        float f5 = y2 / 9.0f;
        if (f2 < 0.0f) {
            if (z) {
                return "-3";
            }
            f2 = 0.0f;
        }
        if (f2 <= y) {
            y = f2;
        } else if (z) {
            return "-4";
        }
        if (f3 < 0.0f) {
            if (z) {
                return "-1";
            }
            f3 = 0.0f;
        }
        if (f3 <= y2) {
            y2 = f3;
        } else if (z) {
            return PreRequestPresenter.SOURCE_RATE_HISTORY;
        }
        int ceil = (int) Math.ceil(y / f4);
        int ceil2 = (int) Math.ceil(y2 / f5);
        if (ceil <= 0) {
            ceil = 1;
        }
        if (ceil2 <= 0) {
            ceil2 = 1;
        }
        return String.valueOf(((ceil2 - 1) * 4) + ceil);
    }

    public static /* synthetic */ String d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        d = str;
        return str;
    }

    public static String e(String str, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e49249dd", new Object[]{str, list});
        }
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < list.size(); i2++) {
            sb.append(list.get(i2));
            if (i2 < list.size() - 1) {
                sb.append(str);
            }
        }
        return sb.toString();
    }

    public static /* synthetic */ Map h(u6a u6aVar, float f2, float f3, float f4, float f5, String str, float f6, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c4d173e3", new Object[]{u6aVar, new Float(f2), new Float(f3), new Float(f4), new Float(f5), str, new Float(f6), new Long(j2)});
        }
        return u6aVar.g(f2, f3, f4, f5, str, f6, j2);
    }

    public static /* synthetic */ Object ipc$super(u6a u6aVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 307521857) {
            return new Boolean(super.onScroll((MotionEvent) objArr[0], (MotionEvent) objArr[1], ((Number) objArr[2]).floatValue(), ((Number) objArr[3]).floatValue()));
        }
        if (hashCode == 587072321) {
            return new Boolean(super.onDown((MotionEvent) objArr[0]));
        }
        if (hashCode == 1575121015) {
            return new Boolean(super.onSingleTapUp((MotionEvent) objArr[0]));
        }
        int hashCode2 = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/behavix/status/GestureObserve");
    }

    public static /* synthetic */ Map j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("6dbf0a5e", new Object[0]);
        }
        return f;
    }

    public static /* synthetic */ boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue();
        }
        return l;
    }

    public static /* synthetic */ boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue();
        }
        return m;
    }

    public static void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[0]);
        } else if (!n) {
            n = true;
            HashMap hashMap = new HashMap();
            hashMap.put("screenW", String.valueOf(gwv.y(gwv.s())));
            hashMap.put("screenH", String.valueOf(gwv.y(gwv.r())));
            DisplayMetrics displayMetrics = new DisplayMetrics();
            WindowManager windowManager = (WindowManager) f82.d().getApplicationContext().getSystemService(pg1.ATOM_EXT_window);
            if (!(windowManager == null || windowManager.getDefaultDisplay() == null)) {
                windowManager.getDefaultDisplay().getMetrics(displayMetrics);
                Point point = new Point();
                windowManager.getDefaultDisplay().getRealSize(point);
                hashMap.put("useReal", "true");
                int i2 = point.x;
                int i3 = point.y;
                float f2 = displayMetrics.xdpi;
                float f3 = displayMetrics.ydpi;
                if (!(f2 == 0.0f || f3 == 0.0f)) {
                    float f4 = i2 / f2;
                    float f5 = i3 / f3;
                    hashMap.put("xdpi", String.valueOf(f2));
                    hashMap.put("ydpi", String.valueOf(f3));
                    hashMap.put("widthInches", String.valueOf(f4));
                    hashMap.put("heightInches", String.valueOf(f5));
                    hashMap.put("diagonalInches", String.valueOf(Math.sqrt((f4 * f4) + (f5 * f5))));
                }
            }
            hashMap.put("dpi", String.valueOf(f82.d().getResources().getDisplayMetrics().densityDpi));
            UtUtils.e("UCP", UtUtils.CHANGED_UPP_EVENT_ID, "bhxDeviceInfo", null, null, hqv.c(hashMap));
        }
    }

    public static float[] n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (float[]) ipChange.ipc$dispatch("3f1e1f55", new Object[0]) : new float[]{i, j};
    }

    public static void o(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d26fb362", new Object[]{activity});
            return;
        }
        xko.h().i();
        m();
        y();
    }

    public static boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("46229a63", new Object[0])).booleanValue();
        }
        return h;
    }

    public static String q(float f2, float f3, float f4, float f5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("327485e", new Object[]{new Float(f2), new Float(f3), new Float(f4), new Float(f5)});
        }
        if (Math.abs(f4 - f2) > Math.abs(f5 - f3)) {
            if (f4 > f2) {
                return "right";
            }
            return "left";
        } else if (f5 > f3) {
            return "up";
        } else {
            return "down";
        }
    }

    public static float r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("94e1efec", new Object[0])).floatValue();
        }
        return gwv.y(gwv.s() * 1.0f) / 4.0f;
    }

    public static float s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8364f66d", new Object[0])).floatValue();
        }
        return gwv.y(gwv.r() * 1.0f) / 9.0f;
    }

    public static String t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1023340d", new Object[0]);
        }
        int i2 = e;
        if (i2 == 0 || i2 == 2) {
            return "left";
        }
        if (i2 == 1 || i2 == 3) {
            return "right";
        }
        return d;
    }

    public static synchronized Map<String, String> u() {
        synchronized (u6a.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("b1e5bd36", new Object[0]);
            }
            return v(null);
        }
    }

    public static synchronized Map<String, String> v(om1 om1Var) {
        synchronized (u6a.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("cdf1479e", new Object[]{om1Var});
            }
            HashMap hashMap = new HashMap(f);
            if (om1Var != null) {
                hashMap.put("cardX", String.valueOf((int) om1Var.c()));
                hashMap.put("cardY", String.valueOf((int) om1Var.d()));
                hashMap.put("cardW", String.valueOf((int) om1Var.b()));
                hashMap.put("cardH", String.valueOf((int) om1Var.a()));
                hashMap.put("cardPosition", x(om1Var.f25484a + (om1Var.c / 2.0f), om1Var.b + (om1Var.d / 2.0f), false));
            }
            return hashMap;
        }
    }

    public static synchronized String w() {
        synchronized (u6a.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("57f1d106", new Object[0]);
            }
            return (String) ((HashMap) f).get("time");
        }
    }

    public static String x(float f2, float f3, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("deb01085", new Object[]{new Float(f2), new Float(f3), new Boolean(z)});
        }
        return c(gwv.y(f2), gwv.y(f3), z);
    }

    public final String f(List<String> list, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d92c6d16", new Object[]{this, list, new Integer(i2)});
        }
        int size = list.size();
        if (i2 >= size) {
            return e("_", list);
        }
        int i3 = size / i2;
        ArrayList arrayList = new ArrayList();
        int i4 = 0;
        for (int i5 = 0; i5 < i2 && i4 < size; i5++) {
            arrayList.add(list.get(i4));
            i4 += i3;
        }
        return e("_", arrayList);
    }

    public final void i(Map<String, String> map, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7b3cea7", new Object[]{this, map, str});
            return;
        }
        String str2 = "";
        map.put("preSpeed", str2);
        map.put("prePreSpeed", str2);
        Map<String, String> map2 = this.c;
        String str3 = map2 == null ? str2 : map2.get("pageName");
        if (!TextUtils.isEmpty(str3) && TextUtils.equals(str3, str)) {
            map.put("preSpeed", this.c.get(TBImageFlowMonitor.SPEED_MEASURE) == null ? str2 : this.c.get(TBImageFlowMonitor.SPEED_MEASURE));
            Map<String, String> map3 = this.b;
            String str4 = map3 == null ? str2 : map3.get("pageName");
            if (!TextUtils.isEmpty(str4) && TextUtils.equals(str4, str)) {
                if (this.b.get(TBImageFlowMonitor.SPEED_MEASURE) != null) {
                    str2 = this.b.get(TBImageFlowMonitor.SPEED_MEASURE);
                }
                map.put("prePreSpeed", str2);
            }
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("22fe0341", new Object[]{this, motionEvent})).booleanValue();
        }
        ((ArrayList) this.f29177a).clear();
        h = true;
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        i = gwv.y(rawX);
        j = gwv.y(rawY);
        return super.onDown(motionEvent);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2b37f32", new Object[]{this, motionEvent, motionEvent2, new Float(f2), new Float(f3)})).booleanValue();
        }
        if (!(motionEvent == null || motionEvent2 == null)) {
            h = false;
            long eventTime = motionEvent2.getEventTime() - motionEvent2.getDownTime();
            if (eventTime > 0 && motionEvent.getPointerCount() > 0 && motionEvent2.getPointerCount() > 0) {
                u82.g(new a("GestureObserve", motionEvent.getRawX(), motionEvent2.getRawX(), motionEvent.getRawY(), motionEvent2.getRawY(), eventTime));
            }
        }
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("12546941", new Object[]{this, motionEvent, motionEvent2, new Float(f2), new Float(f3)})).booleanValue();
        }
        ((ArrayList) this.f29177a).add(String.format(Locale.CHINA, "%d,%d,%.2f,%.2f", Integer.valueOf((int) gwv.y(motionEvent2.getRawX())), Integer.valueOf((int) gwv.y(motionEvent2.getRawY())), Float.valueOf(motionEvent2.getTouchMajor()), Float.valueOf(motionEvent2.getTouchMinor())));
        i = gwv.y(motionEvent2.getRawX());
        j = gwv.y(motionEvent2.getRawY());
        k = System.currentTimeMillis();
        return super.onScroll(motionEvent, motionEvent2, f2, f3);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5de27077", new Object[]{this, motionEvent})).booleanValue();
        }
        if (motionEvent == null) {
            return false;
        }
        g = System.currentTimeMillis();
        h = false;
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        float y = gwv.y(rawX);
        float y2 = gwv.y(rawY);
        synchronized (u6a.class) {
            try {
                Map<String, String> map = f;
                ((HashMap) map).put("lastTapX", String.valueOf((int) y));
                ((HashMap) map).put("lastTapY", String.valueOf((int) y2));
                ((HashMap) map).put("lastTapPosition", b(y, y2));
                long j2 = g;
                if (j2 > 0) {
                    ((HashMap) map).put("lastTapTime", String.valueOf(j2));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return super.onSingleTapUp(motionEvent);
    }

    public static void y() {
        double d2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("107a1b8b", new Object[0]);
        } else if (v82.c.i()) {
            JSONObject jSONObject = v82.c.v().getJSONObject(ActivityMonitor.p());
            if (jSONObject == null) {
                l = false;
                m = false;
                return;
            }
            double d3 = vu3.b.GEO_NOT_SUPPORT;
            try {
                String str = "0.0";
                d2 = Double.parseDouble(jSONObject.containsKey("bxSample") ? jSONObject.getString("bxSample") : str);
                try {
                    if (jSONObject.containsKey("utSample")) {
                        str = jSONObject.getString("utSample");
                    }
                    d3 = Double.parseDouble(str);
                } catch (Throwable unused) {
                    LogUtils.f("GestureObserve", "updateSlideGestureUploadConfig", "解析滑动手势上报配置失败");
                    l = gwv.w(d2);
                    m = gwv.w(d3);
                }
            } catch (Throwable unused2) {
                d2 = 0.0d;
            }
            l = gwv.w(d2);
            m = gwv.w(d3);
        } else {
            l = true;
            m = true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a extends m02 {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ float b;
        public final /* synthetic */ float c;
        public final /* synthetic */ float d;
        public final /* synthetic */ float e;
        public final /* synthetic */ long f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, float f, float f2, float f3, float f4, long j) {
            super(str);
            this.b = f;
            this.c = f2;
            this.d = f3;
            this.e = f4;
            this.f = j;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/behavix/status/GestureObserve$1");
        }

        @Override // tb.m02
        public void e() {
            Map map;
            String str;
            String str2;
            String str3;
            String str4;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
                return;
            }
            float abs = Math.abs(this.b - this.c);
            float abs2 = Math.abs(this.d - this.e);
            if (abs < abs2) {
                if (this.e < this.d) {
                    if (this.c - this.b > 0.0f) {
                        str4 = "right";
                    } else {
                        str4 = "left";
                    }
                    u6a.d(str4);
                } else {
                    if (this.c - this.b > 0.0f) {
                        str3 = "left";
                    } else {
                        str3 = "right";
                    }
                    u6a.d(str3);
                }
            }
            float y = gwv.y(abs) / ((float) this.f);
            float y2 = gwv.y(abs2) / ((float) this.f);
            if (Math.abs(this.c - this.b) > Math.abs(this.e - this.d)) {
                float f = this.c;
                float f2 = this.b;
                if (f > f2) {
                    str2 = "right";
                } else {
                    str2 = "left";
                }
                map = u6a.h(u6a.this, f2, f, this.d, this.e, str2, y, this.f);
            } else {
                float f3 = this.e;
                float f4 = this.d;
                if (f3 > f4) {
                    str = "up";
                } else {
                    str = "down";
                }
                map = u6a.h(u6a.this, this.b, this.c, f4, f3, str, y2, this.f);
            }
            TLog.logd("Behavix", "GestureObserve", "onFling args: " + u6a.a());
            synchronized (u6a.class) {
                u6a.j().putAll(map);
            }
            LogUtils.e("Behavix", "GestureObserve", "BehaviXStore.getCurrentSceneName() 参数日志：shouldUploadBx: " + u6a.k() + ", shouldUploadUt: " + u6a.l());
            if (u6a.k()) {
                cqv.p(t82.b(), "bx_page_slide", null, map, new String[0]);
            }
            if (u6a.l()) {
                TBS.Ext.commitEvent("BehaviX", UtUtils.CHANGED_UPP_EVENT_ID, "bx_page_slide", t82.b(), null, hqv.c(map));
            }
        }
    }

    static {
        t2o.a(404750626);
    }

    public final Map<String, String> g(float f2, float f3, float f4, float f5, String str, float f6, long j2) {
        int[] e2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("9090a66b", new Object[]{this, new Float(f2), new Float(f3), new Float(f4), new Float(f5), str, new Float(f6), new Long(j2)});
        }
        float y = gwv.y(f2);
        float y2 = gwv.y(f3);
        float y3 = gwv.y(f4);
        float y4 = gwv.y(f5);
        HashMap hashMap = new HashMap();
        String b = t82.b();
        hashMap.put("pageName", b);
        hashMap.put("pageUrl", ActivityMonitor.q());
        hashMap.put("slideDirection", str);
        hashMap.put(TBImageFlowMonitor.SPEED_MEASURE, String.valueOf(f6));
        hashMap.put("slideHands", d);
        hashMap.put("x1", String.valueOf((int) y));
        hashMap.put("y1", String.valueOf((int) y3));
        hashMap.put("x2", String.valueOf((int) y2));
        hashMap.put("y2", String.valueOf((int) y4));
        hashMap.put("startTouchPosition", b(y, y3));
        hashMap.put("endTouchPosition", b(y2, y4));
        hashMap.put("path", f(this.f29177a, 8));
        hashMap.put("duration", String.valueOf(j2));
        hashMap.put("screenW", String.valueOf((int) gwv.y(gwv.s() * 1.0f)));
        hashMap.put("screenH", String.valueOf((int) gwv.y(gwv.r() * 1.0f)));
        hashMap.put("time", String.valueOf(k));
        i(hashMap, b);
        DevicesDelegate a2 = uim.a();
        p6a b2 = uim.b();
        hashMap.put("angle", String.valueOf(Math.atan2(f2 - f3, f4 - f5)));
        if (a2 != null) {
            Integer[] i2 = DevicesDelegate.j().i();
            if (i2 != null && i2.length > 1) {
                hashMap.put("devicePosture", String.valueOf(i2[0]));
                hashMap.put("devicePostureStable", String.valueOf(i2[1]));
            }
            Integer[] k2 = DevicesDelegate.j().k();
            if (k2 != null && k2.length > 0) {
                hashMap.put("movePosture", String.valueOf(k2[0]));
            }
        }
        if (!(b2 == null || (e2 = p6a.f().e(hashMap)) == null || e2.length <= 0)) {
            int i3 = e2[0];
            e = i3;
            hashMap.put("slidePosture", String.valueOf(i3));
        }
        this.b = this.c;
        this.c = hashMap;
        return hashMap;
    }
}
