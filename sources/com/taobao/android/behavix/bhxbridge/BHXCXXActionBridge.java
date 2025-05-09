package com.taobao.android.behavix.bhxbridge;

import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.util.b;
import com.taobao.android.external.BHXVisualCenterItem;
import com.taobao.android.testutils.JsBridgeBehaviXConfig;
import com.taobao.android.ucp.bridge.NativeDelegate;
import com.taobao.tao.log.TLog;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.bp8;
import tb.cp8;
import tb.cqv;
import tb.eqv;
import tb.fzo;
import tb.gwv;
import tb.hqv;
import tb.i5k;
import tb.iaa;
import tb.ip8;
import tb.ld2;
import tb.ly1;
import tb.nm1;
import tb.pz3;
import tb.rm1;
import tb.s82;
import tb.t2o;
import tb.u6a;
import tb.u82;
import tb.v82;
import tb.vw4;
import tb.y82;
import tb.yj4;
import tb.z45;
import tb.zia;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class BHXCXXActionBridge extends BHXCXXBaseBridge {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "BHXCXXActionBridge";
    public static String[] lowUcpEvent = {"pv", "leave", "request", "exposeStart", "tap", "appIn", "appOut", "internal", "custom"};
    private static final AtomicBoolean sAttachedFlag = new AtomicBoolean();
    private static final boolean sAttachedSwitch = v82.c.B();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a extends b.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/behavix/bhxbridge/BHXCXXActionBridge$1");
        }

        @Override // tb.m02
        public void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
                return;
            }
            int d = u82.d();
            int nativeThreadTidByName = BHXCXXInnerBridge.getNativeThreadTidByName("bhx_bufs");
            TLog.loge(BHXCXXActionBridge.TAG, "BHXTID::bhx cpu monitor", String.valueOf(d), ";", String.valueOf(nativeThreadTidByName));
            vw4.a("bhx_action", d);
            vw4.a("bhx_bufs", nativeThreadTidByName);
        }
    }

    private static synchronized void attachThreadMonitor() {
        synchronized (BHXCXXActionBridge.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4ce958b2", new Object[0]);
                return;
            }
            if (sAttachedSwitch && sAttachedFlag.compareAndSet(false, true)) {
                b.b(new a());
            }
        }
    }

    private static ly1 commitAction(String str, String str2, String str3, String str4, String str5, String str6, String str7, String[] strArr, Map<String, String> map, int i, int i2, boolean z, String str8) {
        ly1 ly1Var;
        String str9;
        String str10;
        ly1 ly1Var2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ly1) ipChange.ipc$dispatch("9bc5820", new Object[]{str, str2, str3, str4, str5, str6, str7, strArr, map, new Integer(i), new Integer(i2), new Boolean(z), str8});
        }
        BHXCXXBaseBridge.setupBHXCpp();
        JSONObject jSONObject = null;
        if (!BHXCXXBaseBridge.isNativeLibraryLoaded || gwv.u()) {
            return null;
        }
        if (gwv.a() && !isHitLowUcpEvent(str2) && !JsBridgeBehaviXConfig.isEnableRealTimeMTopDebug() && needPreFilter(str3, str2, str4)) {
            return null;
        }
        String b = s82.a().b();
        ly1 b2 = nm1.b(str2);
        if (b2 == null) {
            return null;
        }
        markCommitAction(str3, str2, str4);
        b2.d = str3;
        b2.h = str2;
        b2.e = System.currentTimeMillis();
        b2.i = str4;
        b2.c = str5;
        b2.g = iaa.f21189a;
        b2.b = str6;
        b2.q = b;
        if ("exposeStart".equals(b2.h) || "exposeEnd".equals(b2.h)) {
            b2.k = str8;
        }
        if (map != null) {
            ld2.j().h(map, b2);
        } else if (strArr != null) {
            b2.l = hqv.f(strArr);
            ld2.j().i(b2.l, b2);
        }
        String nativeCommitAction = nativeCommitAction(iaa.f21189a, str, str2, str3, str4, str5, str6, str7, b2.l, b2.b(), b, z, i, i2, str8);
        if (TextUtils.isEmpty(nativeCommitAction)) {
            v82.c.G(true);
            str10 = str2;
            str9 = "exposeStart";
            if (str9.equals(str10) || "exposeEnd".equals(str10)) {
                ly1Var2 = b2;
                ly1Var2.h = "expose";
            } else {
                ly1Var2 = b2;
            }
            ly1Var2.a();
            ly1Var = ly1Var2;
        } else {
            str10 = str2;
            str9 = "exposeStart";
            v82.c.G(false);
            try {
                jSONObject = JSON.parseObject(nativeCommitAction);
            } catch (Exception e) {
                e.printStackTrace();
            }
            ly1Var = nm1.a(b2, jSONObject, b2.u);
        }
        if (str9.equals(str10) || "leave".equals(str10) || "tap".equals(str10)) {
            triggerTask(ly1Var);
        }
        attachThreadMonitor();
        return ly1Var;
    }

    public static ly1 commitAppIn(String str, String str2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ly1) ipChange.ipc$dispatch("a6db9ac4", new Object[]{str, str2, new Long(j)});
        }
        ly1 commitAction = commitAction(NativeDelegate.SETTING_BIZ, "appIn", str, "", "", str2, "", null, null, 0, 0, false, null);
        if (commitAction == null) {
            return null;
        }
        return commitAction;
    }

    public static ly1 commitAppOut(String str, String str2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ly1) ipChange.ipc$dispatch("3174a4d9", new Object[]{str, str2, new Long(j)});
        }
        ly1 commitAction = commitAction(NativeDelegate.SETTING_BIZ, "appOut", str, "", "", str2, "", null, null, 0, 0, false, null);
        if (commitAction == null) {
            return null;
        }
        return commitAction;
    }

    public static ly1 commitCustom(String str, String str2, String str3, String str4, Map<String, String> map, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ly1) ipChange.ipc$dispatch("318dbc6d", new Object[]{str, str2, str3, str4, map, strArr});
        }
        return commitAction(str, "custom", str2, str3, str4, "", "", strArr, map, 0, 0, false, null);
    }

    public static ly1 commitRequest(String str, String str2, String str3, String str4, long j, Map<String, String> map, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ly1) ipChange.ipc$dispatch("168d5547", new Object[]{str, str2, str3, str4, new Long(j), map, strArr});
        }
        ly1 commitAction = commitAction(str, "request", str2, str3, "", "", str4, strArr, map, 0, 0, false, null);
        if (commitAction == null) {
            return null;
        }
        return commitAction;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static ly1 commitScroll(String str, String str2, String str3, String str4, int i, int i2, int i3, int i4, String str5, List<rm1> list, long j, Map<String, String> map, String... strArr) {
        char c;
        boolean z;
        String str6 = fzo.SCROLLING;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ly1) ipChange.ipc$dispatch("d774bf8e", new Object[]{str, str2, str3, str4, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), str5, list, new Long(j), map, strArr});
        }
        int i5 = i - i3;
        int i6 = i2 - i4;
        String q = (str6.equals(str3) || "scrollEnd".equals(str3)) ? u6a.q(i, i2, i3, i4) : "";
        str3.hashCode();
        switch (str3.hashCode()) {
            case 417766094:
                if (str3.equals("scrollEnd")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 417800693:
                if (str3.equals(str6)) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 2054366613:
                if (str3.equals("scrollStart")) {
                    c = 2;
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
                str6 = "end";
                z = false;
                break;
            case 1:
                z = u6a.p();
                break;
            case 2:
                str6 = "start";
                z = true;
                break;
            default:
                str6 = "";
                z = false;
                break;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long nanoTime = System.nanoTime();
        JSONObject jSONObject = new JSONObject();
        if (!pz3.a(list)) {
            JSONArray jSONArray = new JSONArray();
            for (rm1 rm1Var : list) {
                if (!TextUtils.isEmpty(rm1Var.f27464a) && rm1Var.d >= 0) {
                    jSONArray.add(rm1Var.e(currentTimeMillis, str6, i5, i6, str5, nanoTime, z));
                    i5 = i5;
                }
            }
            jSONObject.put("visualItems", (Object) jSONArray);
            jSONObject.put("scrollDirection", (Object) q);
            if (map != null && map.containsKey("bxBatchCallTime")) {
                jSONObject.put("bxBatchCallTime", (Object) map.get("bxBatchCallTime"));
            }
        }
        ly1 commitAction = commitAction(str, str3, str2, str4, "", "", "", strArr, map, i, i2, false, jSONObject.size() > 0 ? JSON.toJSONString(jSONObject, SerializerFeature.DisableCircularReferenceDetect) : null);
        if (commitAction == null) {
            return null;
        }
        eqv.triggerExposeCurrentStatus(str2, commitAction.f23634a + "", str3);
        return commitAction;
    }

    public static ly1 commitTap(String str, String str2, String str3, String str4, String str5, long j, Map<String, String> map, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ly1) ipChange.ipc$dispatch("1cbc7ce5", new Object[]{str, str2, str3, str4, str5, new Long(j), map, strArr});
        }
        ly1 commitAction = commitAction(str, "tap", str2, str3, str5, "", "", strArr, map, 0, 0, false, null);
        if (commitAction == null) {
            return null;
        }
        return commitAction;
    }

    public static /* synthetic */ Object ipc$super(BHXCXXActionBridge bHXCXXActionBridge, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/behavix/bhxbridge/BHXCXXActionBridge");
    }

    private static boolean isHitLowUcpEvent(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("34481018", new Object[]{str})).booleanValue();
        }
        if (!v82.c.h()) {
            return false;
        }
        for (String str2 : lowUcpEvent) {
            if (TextUtils.equals(str2, str)) {
                return true;
            }
        }
        return false;
    }

    private static void markCommitAction(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14d9dc5f", new Object[]{str, str2, str3});
        } else if (gwv.w(0.03d)) {
            TLog.loge(TAG, str, str3, str2);
        }
    }

    private static native String nativeCommitAction(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, boolean z, int i, int i2, String str12);

    private static boolean needPreFilter(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("89d1beee", new Object[]{str, str2, str3})).booleanValue();
        }
        if (zia.c().d(str, str2, str3) || z45.b().c(str, str2, str3)) {
            return false;
        }
        return true;
    }

    private static void triggerTask(ly1 ly1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49905d4c", new Object[]{ly1Var});
        } else if (ly1Var != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("baseNode", ly1Var);
            y82.e().f(ly1Var.d, ly1Var.h, ly1Var.i, hashMap);
        }
    }

    public static ly1 updateEnterEvent(String str, String str2, Map<String, String> map, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ly1) ipChange.ipc$dispatch("66941ade", new Object[]{str, str2, map, strArr});
        }
        return commitAction("", "pvUpdate", str, "", "", str2, "", strArr, map, 0, 0, false, null);
    }

    public static ly1 commitEnter(String str, String str2, String str3, String str4, long j, Map<String, String> map, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ly1) ipChange.ipc$dispatch("81e32cd0", new Object[]{str, str2, str3, str4, new Long(j), map, strArr});
        }
        ly1 commitAction = commitAction(str, "pv", str2, "", str3, str4, "", strArr, map, 0, 0, false, null);
        if (commitAction == null) {
            return null;
        }
        eqv.triggerExposeCurrentStatus(str2, commitAction.f23634a + "", commitAction.h);
        i5k.c(i5k.LAST_ENTER_NODE, commitAction);
        return commitAction;
    }

    public static ly1 commitLeave(String str, String str2, String str3, String str4, long j, String str5, boolean z, Map<String, String> map, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ly1) ipChange.ipc$dispatch("e930f9ef", new Object[]{str, str2, str3, str4, new Long(j), str5, new Boolean(z), map, strArr});
        }
        ly1 commitAction = commitAction(str, "leave", str2, "", str3, str5, str4, strArr, map, 0, 0, z, null);
        if (commitAction == null) {
            return null;
        }
        eqv.triggerExposeCurrentStatus(str2, commitAction.f23634a + "", commitAction.h);
        return commitAction;
    }

    private static String getActionArgsOfExposeNode(String str, String str2, String str3, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("35ddcc19", new Object[]{str, str2, str3, view});
        }
        bp8 x = cqv.x(str, gwv.n(str, str2, str3, view));
        if (x == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = x.f16524a;
        if (jSONObject2 != null) {
            if (!v82.h("enableExpSeries", false)) {
                jSONObject2.put("exposeSeries", (Object) new JSONArray());
            }
            jSONObject.put("actionArgs", (Object) jSONObject2.toString());
            JSONArray jSONArray = jSONObject2.getJSONArray("exposeSeries");
            if (jSONArray != null) {
                jSONObject.put("exposeSeries", (Object) jSONArray.toString());
            }
        }
        x.b.getClass();
        x.b.getClass();
        if (view != null && v82.c.q()) {
            jSONObject.put("exposeFocusDur", (Object) Double.valueOf(x.j));
        }
        return jSONObject.toJSONString();
    }

    static {
        t2o.a(404750505);
    }

    public static ly1 commitExposeEnd(String str, String str2, String str3, View view, long j, String str4, Map<String, String> map, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ly1) ipChange.ipc$dispatch("574ec783", new Object[]{str, str2, str3, view, new Long(j), str4, map, strArr});
        }
        String n = gwv.n(str, str2, str3, view);
        cp8.f(cqv.x(str, n), "exposeEnd", j);
        ly1 commitAction = commitAction("", "exposeEnd", str, str2, str3, "", "", strArr, map, 0, 0, false, getActionArgsOfExposeNode(str, str2, str3, view));
        if (commitAction == null) {
            return null;
        }
        cqv.y(str, n);
        return commitAction;
    }

    public static ly1 commitVisualCenter(String str, List<BHXVisualCenterItem> list, boolean z, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ly1) ipChange.ipc$dispatch("360da3df", new Object[]{str, list, new Boolean(z), map});
        }
        Map<String, String> u = u6a.u();
        JSONArray jSONArray = new JSONArray();
        long currentTimeMillis = System.currentTimeMillis();
        long nanoTime = System.nanoTime();
        if (!pz3.a(list)) {
            for (BHXVisualCenterItem bHXVisualCenterItem : list) {
                if (!TextUtils.isEmpty(bHXVisualCenterItem.f27464a) && bHXVisualCenterItem.d >= 0) {
                    jSONArray.add(bHXVisualCenterItem.f(currentTimeMillis, u, z, nanoTime));
                }
            }
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("visualCenterItems", (Object) jSONArray);
        if (map != null && map.containsKey("bxBatchCallTime")) {
            jSONObject.put("bxBatchCallTime", (Object) map.get("bxBatchCallTime"));
        }
        ly1 commitAction = commitAction(NativeDelegate.SETTING_BIZ, "visualCenterExpose", str, "", "", "", "", null, map, 0, 0, false, JSON.toJSONString(jSONObject, SerializerFeature.DisableCircularReferenceDetect));
        if (commitAction == null) {
            return null;
        }
        return commitAction;
    }

    public static ly1 commitExposeStart(String str, String str2, String str3, String str4, View view, long j, Map<String, String> map, String... strArr) {
        String m;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ly1) ipChange.ipc$dispatch("dc79b5c", new Object[]{str, str2, str3, str4, view, new Long(j), map, strArr});
        }
        if (map != null) {
            m = map.get(yj4.PARAM_PVID);
        } else {
            m = hqv.m(yj4.PARAM_PVID, strArr);
        }
        ly1 commitAction = commitAction(str, "exposeStart", str2, str3, str4, "", m, strArr, map, 0, 0, false, null);
        if (commitAction == null) {
            return null;
        }
        if (gwv.C()) {
            Map<String, Object> map2 = commitAction.u;
            if (map2 != null && TextUtils.equals(String.valueOf(map2.get("BXUTEventType")), "1")) {
                return commitAction;
            }
        } else {
            Map<String, String> map3 = commitAction.t;
            if (map3 != null && TextUtils.equals(map3.get("BXUTEventType"), "1")) {
                return commitAction;
            }
        }
        String n = gwv.n(str2, str3, str4, view);
        bp8 bp8Var = new bp8();
        bp8Var.c = new WeakReference<>(view);
        bp8Var.b = (ip8) commitAction;
        cp8.f(bp8Var, "exposeStart", j);
        cqv.N(str2, n, bp8Var);
        return commitAction;
    }
}
