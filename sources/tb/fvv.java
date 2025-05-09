package tb;

import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.config.BHRTaskConfigBase;
import com.taobao.android.testutils.log.LogUtils;
import com.taobao.tao.log.TLog;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.v82;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class fvv extends n3v {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final fvv g = new fvv();
    public final Map<String, ly1> e = new ConcurrentHashMap();
    public boolean f = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (fvv.a(fvv.this).size() >= 4) {
                fvv.g(fvv.this, true);
            }
        }
    }

    static {
        t2o.a(404750651);
    }

    public static /* synthetic */ Map a(fvv fvvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("71c1ba5a", new Object[]{fvvVar});
        }
        return fvvVar.e;
    }

    public static /* synthetic */ boolean g(fvv fvvVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("11c9b293", new Object[]{fvvVar, new Boolean(z)})).booleanValue();
        }
        fvvVar.f = z;
        return z;
    }

    public static /* synthetic */ Object ipc$super(fvv fvvVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1811525386:
                super.endEvent((v0v) objArr[0]);
                return null;
            case -489493404:
                super.updateEvent((v0v) objArr[0]);
                return null;
            case 878584900:
                super.beginEvent((v0v) objArr[0]);
                return null;
            case 1613428460:
                super.sendEvent((Map) objArr[0]);
                return null;
            case 2136228042:
                super.updateEventPageName((v0v) objArr[0]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/behavix/utcollect/UtEventListener");
        }
    }

    public static fvv k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fvv) ipChange.ipc$dispatch("b1c3a2c1", new Object[0]);
        }
        return g;
    }

    public static void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a503d97", new Object[0]);
        } else {
            p3v.getInstance().unregisterListener(g);
        }
    }

    public final void c(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6251244", new Object[]{this, obj});
        } else if (obj != null) {
            ((ConcurrentHashMap) this.e).remove(obj.hashCode() + "");
        }
    }

    public final void d(Object obj, ly1 ly1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65a662c", new Object[]{this, obj, ly1Var});
        } else if (obj != null && ly1Var != null) {
            if ("1".equals(v82.e.l("delayClearPV", "1", true))) {
                if (this.f) {
                    ((ConcurrentHashMap) this.e).clear();
                    this.f = false;
                }
                ((ConcurrentHashMap) this.e).put(obj.hashCode() + "", ly1Var);
                cet.d().f(new a());
                return;
            }
            if (((ConcurrentHashMap) this.e).size() >= 5) {
                ((ConcurrentHashMap) this.e).clear();
            }
            ((ConcurrentHashMap) this.e).put(obj.hashCode() + "", ly1Var);
        }
    }

    public final void e(Map<String, String> map, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38873cb1", new Object[]{this, map, str, str2});
        } else if (map != null && str != null && str2 != null) {
            map.put(str, str2);
        }
    }

    public final boolean f(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("20f12ca9", new Object[]{this, new Integer(i), str})).booleanValue();
        }
        JSONObject y = v82.c.y();
        if (y.getJSONArray(str) != null) {
            return y.getJSONArray(str).contains(Integer.valueOf(i));
        }
        return false;
    }

    @Override // tb.n3v
    public int[] getAttentionEventIdsForSendEvent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("ec81ea0e", new Object[]{this});
        }
        return v82.c.l();
    }

    public final String[] h(Map<String, String> map, f6i f6iVar, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("b5145272", new Object[]{this, map, f6iVar, new Integer(i), new Integer(i2)});
        }
        if (map == null || f6iVar == null) {
            return null;
        }
        String[] strArr = new String[6];
        strArr[0] = map.get(oeh.ARGS);
        strArr[1] = hqv.j(f6iVar.e(), "=", ",");
        strArr[2] = "BXUtListener=true";
        strArr[3] = "bx_eventId=" + i;
        strArr[4] = "BXUTEventType=" + i2;
        return strArr;
    }

    public final Map<String, String> i(Map<String, String> map, f6i f6iVar, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c919c7d9", new Object[]{this, map, f6iVar, new Integer(i), new Integer(i2)});
        }
        if (map == null || f6iVar == null) {
            return null;
        }
        HashMap hashMap = new HashMap(f6iVar.e());
        hashMap.put("BXUtListener", "true");
        hashMap.put("bx_eventId", String.valueOf(i));
        hashMap.put("BXUTEventType", String.valueOf(i2));
        return hashMap;
    }

    public final ly1 j(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ly1) ipChange.ipc$dispatch("65b2f859", new Object[]{this, obj});
        }
        if (obj == null) {
            return null;
        }
        return (ly1) ((ConcurrentHashMap) this.e).get(obj.hashCode() + "");
    }

    @Override // tb.n3v
    public String trackerListenerName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1d8246a2", new Object[]{this});
        }
        return "BehaviX";
    }

    @Override // tb.n3v
    public void updateEvent(v0v v0vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2d2ec64", new Object[]{this, v0vVar});
            return;
        }
        super.updateEvent(v0vVar);
        if (v82.c.s() && v82.c.n() && v0vVar != null) {
            if (v0vVar.getEventId() == 2001) {
                pm1.l().m(v0vVar.getPageName(), v0vVar.getKey(), v0vVar.getProperties());
            }
            if (!gwv.u()) {
                try {
                    if (c5k.e(b(v0vVar.getPageName(), v0vVar.getEventId(), v0vVar.getArg1(), v0vVar.getArg2(), v0vVar.getArg3(), v0vVar.getProperties()))) {
                        if (v0vVar.getEventId() == 2001 && v0vVar.getContext() != null && !TextUtils.isEmpty(v0vVar.getPageName())) {
                            Map<String, String> properties = v0vVar.getProperties();
                            HashMap hashMap = new HashMap();
                            e(hashMap, "spm-cnt", properties.get("spm-cnt"));
                            e(hashMap, "spm-url", properties.get("spm-url"));
                            e(hashMap, "spm-pre", properties.get("spm-pre"));
                            if (hashMap.size() > 0) {
                                cqv.O(v0vVar.getPageName(), v0vVar.getContext(), hashMap);
                            }
                        }
                    } else if (f(v0vVar.getEventId(), "pv") && v0vVar.getContext() != null && !TextUtils.isEmpty(v0vVar.getPageName())) {
                        cqv.O(v0vVar.getPageName(), v0vVar.getContext(), v0vVar.getProperties());
                    }
                } catch (Throwable th) {
                    q82.f("UtEventListener_updateEvent", null, null, th);
                }
            }
        }
    }

    public final f6i b(String str, int i, String str2, String str3, String str4, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f6i) ipChange.ipc$dispatch("24b21be6", new Object[]{this, str, new Integer(i), str2, str3, str4, map});
        }
        f6i f6iVar = new f6i();
        f6iVar.i = BHRTaskConfigBase.TYPE_CONFIG_UT;
        f6iVar.h = true;
        f6iVar.f19049a = str;
        f6iVar.b = gwv.g(i + "");
        f6iVar.c = str2;
        f6iVar.d = str3;
        f6iVar.e = str4;
        if (map != null) {
            f6iVar.f = new HashMap(map);
        }
        return f6iVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00b4 A[Catch: all -> 0x00a4, TryCatch #0 {all -> 0x00a4, blocks: (B:14:0x002e, B:15:0x0042, B:18:0x007d, B:21:0x008d, B:23:0x0093, B:26:0x009d, B:29:0x00a6, B:30:0x00ac, B:32:0x00b4, B:33:0x00bc, B:35:0x00c5, B:36:0x00c9, B:38:0x00d1), top: B:42:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bc A[Catch: all -> 0x00a4, TryCatch #0 {all -> 0x00a4, blocks: (B:14:0x002e, B:15:0x0042, B:18:0x007d, B:21:0x008d, B:23:0x0093, B:26:0x009d, B:29:0x00a6, B:30:0x00ac, B:32:0x00b4, B:33:0x00bc, B:35:0x00c5, B:36:0x00c9, B:38:0x00d1), top: B:42:0x002e }] */
    @Override // tb.n3v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void sendEvent(java.util.Map<java.lang.String, java.lang.String> r13) {
        /*
            r12 = this;
            r0 = 1
            com.android.alibaba.ip.runtime.IpChange r1 = tb.fvv.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L_0x0015
            java.lang.String r2 = "602af6ec"
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r12
            r3[r0] = r13
            r1.ipc$dispatch(r2, r3)
            return
        L_0x0015:
            super.sendEvent(r13)
            boolean r1 = tb.v82.c.s()
            if (r1 == 0) goto L_0x00da
            boolean r1 = tb.v82.c.n()
            if (r1 != 0) goto L_0x0026
            goto L_0x00da
        L_0x0026:
            boolean r1 = tb.gwv.u()
            if (r1 == 0) goto L_0x002d
            return
        L_0x002d:
            r1 = 0
            com.alibaba.analytics.core.model.LogField r2 = com.alibaba.analytics.core.model.LogField.EVENTID     // Catch: all -> 0x00a4, Exception -> 0x00da
            java.lang.String r2 = r2.toString()     // Catch: all -> 0x00a4, Exception -> 0x00da
            java.lang.Object r2 = r13.get(r2)     // Catch: all -> 0x00a4, Exception -> 0x00da
            java.lang.String r2 = (java.lang.String) r2     // Catch: all -> 0x00a4, Exception -> 0x00da
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: all -> 0x00a4, Exception -> 0x00da
            int r2 = r2.intValue()     // Catch: all -> 0x00a4, Exception -> 0x00da
            com.alibaba.analytics.core.model.LogField r3 = com.alibaba.analytics.core.model.LogField.PAGE     // Catch: all -> 0x00a4
            java.lang.String r3 = r3.toString()     // Catch: all -> 0x00a4
            java.lang.Object r3 = r13.get(r3)     // Catch: all -> 0x00a4
            r10 = r3
            java.lang.String r10 = (java.lang.String) r10     // Catch: all -> 0x00a4
            com.alibaba.analytics.core.model.LogField r3 = com.alibaba.analytics.core.model.LogField.ARG1     // Catch: all -> 0x00a4
            java.lang.String r3 = r3.toString()     // Catch: all -> 0x00a4
            java.lang.Object r3 = r13.get(r3)     // Catch: all -> 0x00a4
            r11 = r3
            java.lang.String r11 = (java.lang.String) r11     // Catch: all -> 0x00a4
            com.alibaba.analytics.core.model.LogField r3 = com.alibaba.analytics.core.model.LogField.ARG2     // Catch: all -> 0x00a4
            java.lang.String r3 = r3.toString()     // Catch: all -> 0x00a4
            java.lang.Object r3 = r13.get(r3)     // Catch: all -> 0x00a4
            r7 = r3
            java.lang.String r7 = (java.lang.String) r7     // Catch: all -> 0x00a4
            com.alibaba.analytics.core.model.LogField r3 = com.alibaba.analytics.core.model.LogField.ARG3     // Catch: all -> 0x00a4
            java.lang.String r3 = r3.toString()     // Catch: all -> 0x00a4
            java.lang.Object r3 = r13.get(r3)     // Catch: all -> 0x00a4
            r8 = r3
            java.lang.String r8 = (java.lang.String) r8     // Catch: all -> 0x00a4
            boolean r3 = r12.l(r10, r2, r11)     // Catch: all -> 0x00a4
            if (r3 == 0) goto L_0x007d
            return
        L_0x007d:
            r3 = r12
            r4 = r10
            r5 = r2
            r6 = r11
            r9 = r13
            tb.f6i r3 = r3.b(r4, r5, r6, r7, r8, r9)     // Catch: all -> 0x00a4
            boolean r4 = tb.c5k.e(r3)     // Catch: all -> 0x00a4
            if (r4 == 0) goto L_0x008d
            return
        L_0x008d:
            boolean r4 = tb.v82.c.E()     // Catch: all -> 0x00a4
            if (r4 == 0) goto L_0x00a6
            java.lang.String r4 = "ut_tbs"
            boolean r4 = r13.containsKey(r4)     // Catch: all -> 0x00a4
            if (r4 == 0) goto L_0x009d
            goto L_0x00a6
        L_0x009d:
            java.util.Map r13 = r12.i(r13, r3, r2, r0)     // Catch: all -> 0x00a4
            r8 = r13
            r9 = r1
            goto L_0x00ac
        L_0x00a4:
            r13 = move-exception
            goto L_0x00d5
        L_0x00a6:
            java.lang.String[] r13 = r12.h(r13, r3, r2, r0)     // Catch: all -> 0x00a4
            r9 = r13
            r8 = r1
        L_0x00ac:
            java.lang.String r13 = "expose"
            boolean r13 = r12.f(r2, r13)     // Catch: all -> 0x00a4
            if (r13 == 0) goto L_0x00bc
            r6 = 0
            r7 = 0
            r4 = r10
            r5 = r11
            tb.cqv.z(r4, r5, r6, r7, r8, r9)     // Catch: all -> 0x00a4
            goto L_0x00da
        L_0x00bc:
            java.lang.String r13 = "tap"
            boolean r13 = r12.f(r2, r13)     // Catch: all -> 0x00a4
            if (r13 == 0) goto L_0x00c9
            tb.cqv.p(r10, r11, r1, r8, r9)     // Catch: all -> 0x00a4
            goto L_0x00da
        L_0x00c9:
            java.lang.String r13 = "custom"
            boolean r13 = r12.f(r2, r13)     // Catch: all -> 0x00a4
            if (r13 == 0) goto L_0x00da
            tb.cqv.i(r10, r11, r1, r8, r9)     // Catch: all -> 0x00a4
            goto L_0x00da
        L_0x00d5:
            java.lang.String r0 = "UtEventListener_sendEvent"
            tb.q82.f(r0, r1, r1, r13)
        L_0x00da:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.fvv.sendEvent(java.util.Map):void");
    }

    public boolean l(String str, int i, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6a91e271", new Object[]{this, str, new Integer(i), str2})).booleanValue();
        }
        JSONObject m = gg4.l().m();
        if (!(m == null || m.size() == 0)) {
            if (TextUtils.isEmpty(str2)) {
                return true;
            }
            JSONArray jSONArray = m.getJSONArray(i + "|" + str);
            if (jSONArray == null) {
                return false;
            }
            if (jSONArray.size() == 0) {
                return true;
            }
            for (int i2 = 0; i2 < jSONArray.size(); i2++) {
                if (TextUtils.equals(str2, (String) jSONArray.get(i2))) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // tb.n3v
    public void updateEventPageName(v0v v0vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f5440ca", new Object[]{this, v0vVar});
            return;
        }
        super.updateEventPageName(v0vVar);
        if (v82.c.s() && v82.c.n() && v0vVar != null && v0vVar.getContext() != null) {
            if (v0vVar.getEventId() == 2001) {
                pm1.l().n(v0vVar.getPageName(), v0vVar.getKey());
                pm1.l().m(v0vVar.getPageName(), v0vVar.getKey(), v0vVar.getProperties());
            }
            if (!gwv.u()) {
                try {
                    ly1 j = j(v0vVar.getContext());
                    if (j != null) {
                        if (!TextUtils.isEmpty(j.d) && TextUtils.equals(j.d, v0vVar.getPageName())) {
                            if (!TextUtils.isEmpty(v0vVar.getPageName()) && !TextUtils.equals(j.d, v0vVar.getPageName())) {
                                LogUtils.f(LogUtils.BX_BIZ_NAME, "updateEventPageName_not_equal", v0vVar.getPageName());
                            }
                        }
                        f6i b = b(v0vVar.getPageName(), v0vVar.getEventId(), v0vVar.getArg1(), v0vVar.getArg2(), v0vVar.getArg3(), v0vVar.getProperties());
                        if (!c5k.e(b)) {
                            j.d = v0vVar.getPageName();
                            Map<String, String> properties = v0vVar.getProperties();
                            if (properties != null) {
                                cqv.l(v0vVar.getPageName(), v0vVar.getBizId(), v0vVar.getContext(), h(properties, b, v0vVar.getEventId(), 0));
                            }
                        }
                    }
                } catch (Throwable th) {
                    q82.f("UtEventListener_updateEventPageName", null, null, th);
                }
            }
        }
    }

    @Override // tb.n3v
    public void beginEvent(v0v v0vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("345e2444", new Object[]{this, v0vVar});
            return;
        }
        super.beginEvent(v0vVar);
        if (v82.c.s() && v82.c.n() && v0vVar != null) {
            if (v0vVar.getEventId() == 2001) {
                pm1.l().d(v0vVar.getPageName(), v0vVar.getKey(), v0vVar.getContext());
            }
            if (!gwv.u()) {
                try {
                    f6i b = b(v0vVar.getPageName(), v0vVar.getEventId(), v0vVar.getArg1(), v0vVar.getArg2(), v0vVar.getArg3(), v0vVar.getProperties());
                    if (!c5k.e(b)) {
                        String[] h = h(v0vVar.getProperties(), b, v0vVar.getEventId(), 0);
                        if (f(v0vVar.getEventId(), "pv")) {
                            Object context = v0vVar.getContext();
                            if (context != null) {
                                dkl dklVar = new dkl();
                                dklVar.b = context.hashCode() + "";
                                if (!TextUtils.isEmpty(v0vVar.getPageName())) {
                                    cqv.l(v0vVar.getPageName(), v0vVar.getBizId(), context, h);
                                    dklVar.d = v0vVar.getPageName();
                                }
                                d(context, dklVar);
                            }
                        } else if (f(v0vVar.getEventId(), "expose")) {
                            Object context2 = v0vVar.getContext();
                            if (context2 == null || (context2 instanceof View)) {
                                cqv.A(v0vVar.getPageName(), v0vVar.getArg1(), v0vVar.getBizId(), (View) context2, h);
                            }
                        } else if (f(v0vVar.getEventId(), "scroll")) {
                            String arg2 = v0vVar.getArg2();
                            if (!TextUtils.isEmpty(arg2)) {
                                String[] split = arg2.split(",");
                                if (split.length == 2) {
                                    try {
                                        cqv.K(v0vVar.getPageName(), v0vVar.getArg1(), Integer.parseInt(split[0]), Integer.parseInt(split[1]), h);
                                    } catch (Exception e) {
                                        q82.f("UtEventScroll", null, null, e);
                                    }
                                }
                            }
                        }
                    }
                } catch (Throwable th) {
                    q82.f("UtEventListener_beginEvent", null, null, th);
                }
            }
        }
    }

    @Override // tb.n3v
    public void endEvent(v0v v0vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("940650f6", new Object[]{this, v0vVar});
            return;
        }
        super.endEvent(v0vVar);
        if (v82.c.s() && v82.c.n() && !gwv.u()) {
            if (v0vVar.getEventId() == 2001) {
                TLog.loge(LogUtils.BX_BIZ_NAME, "UtEventListener_endEvent", "2001");
            }
            try {
                if (f(v0vVar.getEventId(), "pv")) {
                    if (v0vVar.getContext() != null) {
                        c(v0vVar.getContext());
                    } else {
                        return;
                    }
                }
                f6i b = b(v0vVar.getPageName(), v0vVar.getEventId(), v0vVar.getArg1(), v0vVar.getArg2(), v0vVar.getArg3(), v0vVar.getProperties());
                if (!c5k.e(b)) {
                    String[] h = h(v0vVar.getProperties(), b, v0vVar.getEventId(), 0);
                    if (f(v0vVar.getEventId(), "pv")) {
                        cqv.m(v0vVar.getPageName(), v0vVar.getBizId(), v0vVar.getContext(), h);
                    } else if (f(v0vVar.getEventId(), "expose")) {
                        Object context = v0vVar.getContext();
                        if (context == null || (context instanceof View)) {
                            cqv.C(v0vVar.getPageName(), v0vVar.getArg1(), v0vVar.getBizId(), (View) context, h);
                        }
                    } else if (f(v0vVar.getEventId(), "scroll")) {
                        String arg2 = v0vVar.getArg2();
                        if (!TextUtils.isEmpty(arg2)) {
                            String[] split = arg2.split(",");
                            if (split.length == 2) {
                                try {
                                    cqv.G(v0vVar.getPageName(), v0vVar.getArg1(), Integer.parseInt(split[0]), Integer.parseInt(split[1]), h);
                                } catch (Exception e) {
                                    q82.f("UtEventScroll", null, null, e);
                                }
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                q82.f("UtEventListener_endEvent", null, null, th);
            }
        }
    }
}
