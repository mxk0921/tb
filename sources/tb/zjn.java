package tb;

import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import com.taobao.phenix.compat.stat.TBImageFlowMonitor;
import com.taobao.statistic.TBS;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerData;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerInnerData;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetData;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetPageData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class zjn {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String IS_FIRST_APPEAR = "isFirstAppear";
    public static final String IS_USER_ACTION_TRACKED = "isUserActionTracked";

    /* renamed from: a  reason: collision with root package name */
    public static final String f32807a = "RealRecommendUtils";

    static {
        t2o.a(729809228);
    }

    public static JSONObject a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("37844c34", new Object[]{jSONObject});
        }
        if (jSONObject == null || jSONObject.getJSONObject("edgeComputeConfig") == null || jSONObject.getJSONObject("edgeComputeConfig").getJSONObject("edgeComputeRequest") == null || jSONObject.getJSONObject("edgeComputeConfig").getJSONObject("edgeComputeRequest").getJSONObject("config") == null) {
            return null;
        }
        return jSONObject.getJSONObject("edgeComputeConfig").getJSONObject("edgeComputeRequest").getJSONObject("config");
    }

    public static JSONObject b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("a7a16088", new Object[0]);
        }
        JSONObject A = zza.c().A();
        if (A == null || A.isEmpty()) {
            return null;
        }
        return A.getJSONObject("edgeRtFeature");
    }

    public static float c(JSONObject jSONObject, String str, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1bcfa7bd", new Object[]{jSONObject, str, new Float(f)})).floatValue();
        }
        try {
            JSONObject g = g(jSONObject, str);
            if (g != null && !g.isEmpty()) {
                return g.getFloat("exposeRatio").floatValue();
            }
            return f;
        } catch (Throwable th) {
            bqa.d("RealRecommendUtils", "getExposeRatioValue exception : " + th.getMessage());
            return f;
        }
    }

    public static String d(String str) {
        z4a c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("44afa8ff", new Object[]{str});
        }
        if (!k(str) && (c = z4a.c(str)) != null) {
            return c.c;
        }
        return "Page_Home";
    }

    public static int e(JSONObject jSONObject, String str) {
        AwesomeGetData awesomeGetData;
        AwesomeGetContainerData awesomeGetContainerData;
        AwesomeGetContainerInnerData awesomeGetContainerInnerData;
        AwesomeGetPageData pageParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f2256965", new Object[]{jSONObject, str})).intValue();
        }
        if (TextUtils.isEmpty(str) || (awesomeGetData = (AwesomeGetData) jSONObject.get("dataModel")) == null || (awesomeGetContainerData = awesomeGetData.containers.get(str)) == null || (awesomeGetContainerInnerData = awesomeGetContainerData.base) == null || (pageParams = awesomeGetContainerInnerData.getPageParams()) == null) {
            return 0;
        }
        return pageParams.getPageNum();
    }

    public static long f(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ef0fa637", new Object[]{jSONObject})).longValue();
        }
        if (jSONObject == null || jSONObject.isEmpty()) {
            return -1L;
        }
        return jSONObject.getLongValue("requestEndTime") - jSONObject.getLongValue(TBImageFlowMonitor.REQUEST_START_TIME);
    }

    public static JSONObject g(JSONObject jSONObject, String str) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("facf2c5d", new Object[]{jSONObject, str});
        }
        if (jSONObject == null || jSONObject.isEmpty() || TextUtils.isEmpty(str) || (jSONObject2 = jSONObject.getJSONObject("edgeComputeConfig")) == null) {
            return null;
        }
        return jSONObject2.getJSONObject(str);
    }

    public static JSONObject h(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("5b4e9fd8", new Object[]{jSONObject, str});
        }
        if (jSONObject == null || jSONObject.getJSONObject("edgeComputeConfig") == null || jSONObject.getJSONObject("edgeComputeConfig").getJSONObject(str) == null || jSONObject.getJSONObject("edgeComputeConfig").getJSONObject(str).getJSONObject("config") == null) {
            return null;
        }
        return jSONObject.getJSONObject("edgeComputeConfig").getJSONObject(str).getJSONObject("config");
    }

    public static boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fc003941", new Object[0])).booleanValue();
        }
        if (TextUtils.equals("l", m0b.d())) {
            return true;
        }
        return false;
    }

    public static boolean k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("abd093ed", new Object[]{str})).booleanValue();
        }
        if (yyj.p(str)) {
            return true;
        }
        if (str == null || !str.startsWith(z4a.REC_MAIN.f32522a)) {
            return false;
        }
        return true;
    }

    public static void l(String str, List<SectionModel> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80d3e073", new Object[]{str, list});
        } else if (cw6.b()) {
            Coordinator.execute(new a(list, str));
        }
    }

    public static void m(JSONObject jSONObject, View view, int i) {
        AwesomeGetContainerInnerData q;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff68ca7a", new Object[]{jSONObject, view, new Integer(i)});
        } else if (jSONObject != null) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("args");
            JSONObject jSONObject3 = new JSONObject(10);
            if (jSONObject2 != null) {
                jSONObject3.put("spm", (Object) jSONObject2.getString("spm"));
                jSONObject3.put("scm", (Object) jSONObject2.getString("scm"));
                jSONObject3.put("guess_buckets", (Object) jSONObject2.getString("guess_buckets"));
            }
            imn d = zza.d(null);
            if (!(d == null || (q = d.q(yyj.e().k())) == null)) {
                jSONObject3.put("infoFlowIndex", (Object) Integer.valueOf(i - q.infoFlowCardStartOffset));
            }
            jSONObject3.put("isFirstAppear", (Object) Boolean.valueOf(jSONObject.getBooleanValue("isFirstAppear")));
            JSONObject jSONObject4 = jSONObject.getJSONObject(i2b.TRACK_EXPOSURE_PARAM);
            if (jSONObject4 != null) {
                cqv.A(jSONObject4.getString("page"), jSONObject4.getString("arg1"), "", view, gqv.b(jSONObject3));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void o(com.alibaba.fastjson.JSONObject r10, android.view.View r11, int r12) {
        /*
            java.lang.String r0 = "spm"
            java.lang.String r1 = "isFirstAppear"
            java.lang.String r2 = ""
            com.android.alibaba.ip.runtime.IpChange r3 = tb.zjn.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x0024
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r12)
            r12 = 3
            java.lang.Object[] r12 = new java.lang.Object[r12]
            r1 = 0
            r12[r1] = r10
            r10 = 1
            r12[r10] = r11
            r10 = 2
            r12[r10] = r0
            java.lang.String r10 = "2de0861d"
            r3.ipc$dispatch(r10, r12)
            return
        L_0x0024:
            if (r10 != 0) goto L_0x0027
            return
        L_0x0027:
            java.lang.String r3 = "args"
            com.alibaba.fastjson.JSONObject r3 = r10.getJSONObject(r3)
            if (r3 != 0) goto L_0x0030
            return
        L_0x0030:
            java.lang.String r4 = "utLogMapEdge"
            com.alibaba.fastjson.JSONObject r4 = r3.getJSONObject(r4)
            if (r4 != 0) goto L_0x003a
            return
        L_0x003a:
            com.alibaba.fastjson.JSONObject r5 = new com.alibaba.fastjson.JSONObject
            r5.<init>()
            java.lang.String r6 = "x_item_ids"
            java.lang.String r6 = r4.getString(r6)     // Catch: all -> 0x00b2
            boolean r7 = android.text.TextUtils.isEmpty(r6)     // Catch: all -> 0x00b3
            if (r7 == 0) goto L_0x0053
            java.lang.String r7 = "x_object_id"
            java.lang.String r6 = r4.getString(r7)     // Catch: all -> 0x00b3
        L_0x0053:
            tb.dk9 r7 = new tb.dk9     // Catch: all -> 0x00b3
            r7.<init>(r11, r6)     // Catch: all -> 0x00b3
            r11.post(r7)     // Catch: all -> 0x00b3
            java.lang.String r7 = "itemId"
            r5.put(r7, r6)     // Catch: all -> 0x00b3
            java.lang.String r7 = "realExposeIndex"
            java.lang.Integer r8 = java.lang.Integer.valueOf(r12)     // Catch: all -> 0x00b3
            r5.put(r7, r8)     // Catch: all -> 0x00b3
            r7 = 0
            tb.imn r7 = tb.zza.d(r7)     // Catch: all -> 0x00b3
            if (r7 == 0) goto L_0x008c
            tb.yyj r8 = tb.yyj.e()     // Catch: all -> 0x00b3
            java.lang.String r8 = r8.k()     // Catch: all -> 0x00b3
            com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerInnerData r7 = r7.q(r8)     // Catch: all -> 0x00b3
            if (r7 == 0) goto L_0x008c
            java.lang.String r8 = "infoFlowIndex"
            int r7 = r7.infoFlowCardStartOffset     // Catch: all -> 0x00b3
            int r12 = r12 - r7
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch: all -> 0x00b3
            r5.put(r8, r12)     // Catch: all -> 0x00b3
        L_0x008c:
            boolean r12 = r10.getBooleanValue(r1)     // Catch: all -> 0x00b3
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)     // Catch: all -> 0x00b3
            r5.put(r1, r12)     // Catch: all -> 0x00b3
            java.lang.String r12 = "itemType"
            java.lang.String r1 = "x_object_type"
            java.lang.String r1 = r4.getString(r1)     // Catch: all -> 0x00b3
            r5.put(r12, r1)     // Catch: all -> 0x00b3
            java.lang.String r12 = "utLogMap"
            r5.put(r12, r4)     // Catch: all -> 0x00b3
            java.lang.String r12 = r3.getString(r0)     // Catch: all -> 0x00b3
            r5.put(r0, r12)     // Catch: all -> 0x00b3
            goto L_0x00bb
        L_0x00b2:
            r6 = r2
        L_0x00b3:
            java.lang.String r12 = tb.zjn.f32807a
            java.lang.String r0 = "trackRecyclerViewScroll utLogMap"
            tb.sfh.d(r12, r0)
        L_0x00bb:
            java.lang.String r12 = "exposureParam"
            com.alibaba.fastjson.JSONObject r10 = r10.getJSONObject(r12)
            if (r10 == 0) goto L_0x00d4
            java.lang.String r12 = "arg1"
            java.lang.String r2 = r10.getString(r12)
            java.lang.String r12 = "page"
            java.lang.String r10 = r10.getString(r12)
            r9 = r2
            r2 = r10
            r10 = r9
            goto L_0x00d5
        L_0x00d4:
            r10 = r2
        L_0x00d5:
            java.lang.String[] r12 = tb.gqv.b(r5)
            tb.cqv.A(r2, r10, r6, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.zjn.o(com.alibaba.fastjson.JSONObject, android.view.View, int):void");
    }

    public static void p(String str, JSONObject jSONObject) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1367fbc5", new Object[]{str, jSONObject});
            return;
        }
        z4a c = z4a.c(str);
        if (c != null) {
            str2 = c.c;
        } else if (str == null || !str.startsWith(z4a.REC_MAIN.f32522a)) {
            str2 = "";
        } else {
            str2 = r5a.f27121a;
        }
        if (!TextUtils.isEmpty(str2)) {
            HashMap hashMap = new HashMap();
            long f = f(jSONObject);
            if (f > 0) {
                hashMap.put("requestCost", f + "");
            }
            JSONObject b = b();
            if (b != null && !b.isEmpty()) {
                hashMap.put("edgeRtFeature", b.toJSONString());
            }
            hashMap.put("containerId", str);
            hashMap.put("action", "requestEndLoadNext");
            if (jSONObject != null) {
                hashMap.put("requestType", jSONObject.getString("requestType"));
                hashMap.put("pageNum", e(jSONObject, str) + "");
            }
            wyh.c(str2, str, null, hqv.d(hashMap));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ List f32808a;
        public final /* synthetic */ String b;

        public a(List list, String str) {
            this.f32808a = list;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            ArrayList arrayList;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                if (this.f32808a == null) {
                    arrayList = new ArrayList();
                } else {
                    arrayList = new ArrayList(this.f32808a);
                }
                ArrayList arrayList2 = new ArrayList();
                if (arrayList.size() > 0) {
                    for (int i = 0; i < arrayList.size(); i++) {
                        arrayList2.add(((SectionModel) arrayList.get(i)).getString("sectionBizCode"));
                        if (TextUtils.equals(((SectionModel) arrayList.get(i)).getJSONObject("args") != null ? ((SectionModel) arrayList.get(i)).getJSONObject("args").getString("isFixPos") : null, "true")) {
                            arrayList2.set(arrayList2.size() - 1, ((String) arrayList2.get(arrayList2.size() - 1)) + ":**fixPos**");
                        }
                    }
                }
                String jSONString = JSON.toJSONString(arrayList2);
                if (cw6.b()) {
                    String str = r5a.f27121a;
                    TBS.Ext.commitEvent(str, 19999, "rerank_sectionBizCode_list", null, null, this.b + " = " + jSONString);
                }
                sfh.c("real_time_rec", this.b + " = " + jSONString);
            } catch (Exception unused) {
            }
        }
    }

    public static List<SectionModel> i(List<SectionModel> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("7e0c0a9", new Object[]{list});
        }
        if (list == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            SectionModel sectionModel = new SectionModel();
            SectionModel sectionModel2 = list.get(i);
            if (sectionModel2 != null && !sectionModel2.getBooleanValue(IS_USER_ACTION_TRACKED)) {
                sectionModel.put("sectionBizCode", (Object) sectionModel2.getString("sectionBizCode"));
                JSONObject jSONObject = sectionModel2.getJSONObject("args");
                if (jSONObject != null) {
                    if (jSONObject.getJSONObject("utLogMapEdge") != null) {
                        sectionModel.put("utLogMapEdge", (Object) jSONObject.getJSONObject("utLogMapEdge"));
                    }
                    if (jSONObject.getString("spm") != null) {
                        sectionModel.put("spm", (Object) jSONObject.getString("spm"));
                    }
                }
                arrayList.add(sectionModel);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0160  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void n(com.alibaba.fastjson.JSONObject r22, android.view.View r23, int r24) {
        /*
            Method dump skipped, instructions count: 363
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.zjn.n(com.alibaba.fastjson.JSONObject, android.view.View, int):void");
    }
}
