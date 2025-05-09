package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.framework.statisticsv2.model.StWindow;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.response.AwesomeGetContainerData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class xli {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public xs6 f31456a;
    public String b;
    public List<SectionModel> c;
    public List<SectionModel> d;
    public List<SectionModel> e;
    public StringBuilder f;
    public AwesomeGetContainerData g;
    public Map<String, List<SectionModel>> h;
    public List<SectionModel> i;
    public boolean j;

    static {
        t2o.a(487587864);
    }

    public static boolean k(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5e97db6", new Object[]{str, str2})).booleanValue();
        }
        if (TextUtils.equals(str, str2)) {
            return true;
        }
        if (TextUtils.equals(str + "_delta", str2)) {
            return true;
        }
        if (TextUtils.equals(str, str2 + "_delta")) {
            return true;
        }
        return false;
    }

    public final void b(Map<String, List<SectionModel>> map, List<SectionModel> list, List<SectionModel> list2, int i) {
        List<SectionModel> list3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6fd03ea", new Object[]{this, map, list, list2, new Integer(i)});
            return;
        }
        for (String str : map.keySet()) {
            if (d(str, list2) <= i && (list3 = map.get(str)) != null && list3.size() > 0) {
                for (int size = list3.size() - 1; size >= 0; size--) {
                    SectionModel sectionModel = list3.get(size);
                    int indexOf = list.indexOf(sectionModel);
                    int indexOf2 = list2.indexOf(sectionModel);
                    if (indexOf != indexOf2) {
                        list.remove(indexOf);
                        list.add(indexOf2, sectionModel);
                    }
                }
                list3.clear();
            }
        }
    }

    public final void c(SectionModel sectionModel, List<SectionModel> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ba30128", new Object[]{this, sectionModel, list});
            return;
        }
        JSONArray jSONArray = sectionModel.getJSONArray("updateRules");
        if (jSONArray == null || jSONArray.size() <= 0) {
            this.f.append("0");
            return;
        }
        Iterator<Object> it = jSONArray.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof JSONObject) {
                o((JSONObject) next, sectionModel, list);
            }
        }
    }

    public final float f(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("582e20b9", new Object[]{this, jSONObject})).floatValue();
        }
        return g(jSONObject, "windvaneDisplay", 0.2f);
    }

    public final float g(JSONObject jSONObject, String str, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1bcfa7bd", new Object[]{this, jSONObject, str, new Float(f)})).floatValue();
        }
        try {
            JSONObject i = i(jSONObject, str);
            if (i != null && !i.isEmpty()) {
                return i.getFloat("exposeRatio").floatValue();
            }
            return f;
        } catch (Throwable th) {
            i65.c("RealRecommendUtils", "getExposeRatioValue exception : " + th.getMessage());
            return f;
        }
    }

    public final int h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b131bfe3", new Object[]{this, str})).intValue();
        }
        try {
            return Integer.parseInt(str);
        } catch (Throwable unused) {
            return -1;
        }
    }

    public final JSONObject i(JSONObject jSONObject, String str) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("facf2c5d", new Object[]{this, jSONObject, str});
        }
        if (jSONObject == null || jSONObject.isEmpty() || TextUtils.isEmpty(str) || (jSONObject2 = jSONObject.getJSONObject("edgeComputeConfig")) == null) {
            return null;
        }
        return jSONObject2.getJSONObject(str);
    }

    public final boolean j(xs6 xs6Var, String str, AwesomeGetContainerData awesomeGetContainerData, AwesomeGetContainerData awesomeGetContainerData2) {
        List<SectionModel> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4bdeae6a", new Object[]{this, xs6Var, str, awesomeGetContainerData, awesomeGetContainerData2})).booleanValue();
        }
        if (awesomeGetContainerData == null) {
            return false;
        }
        this.f31456a = xs6Var;
        this.b = str;
        this.g = awesomeGetContainerData;
        this.c = awesomeGetContainerData.getBaseData();
        this.d = awesomeGetContainerData.getDeltaData();
        if (awesomeGetContainerData2 == null) {
            list = null;
        } else {
            list = awesomeGetContainerData2.getTotalData();
        }
        this.e = list;
        List<SectionModel> list2 = this.c;
        if (list2 == null || list2.isEmpty()) {
            return false;
        }
        this.f = new StringBuilder();
        return true;
    }

    public List<SectionModel> l(xs6 xs6Var, String str, AwesomeGetContainerData awesomeGetContainerData, AwesomeGetContainerData awesomeGetContainerData2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("e1d9f60c", new Object[]{this, xs6Var, str, awesomeGetContainerData, awesomeGetContainerData2});
        }
        if (!j(xs6Var, str, awesomeGetContainerData, awesomeGetContainerData2)) {
            return null;
        }
        ArrayList arrayList = new ArrayList(this.c);
        List<SectionModel> list = this.d;
        if (list != null && !list.isEmpty()) {
            this.h = new HashMap(this.d.size());
            this.i = new ArrayList();
            for (SectionModel sectionModel : this.d) {
                c(sectionModel, arrayList);
            }
            b(this.h, arrayList, this.e, arrayList.size());
            if (!((ArrayList) this.i).isEmpty()) {
                this.d.removeAll(this.i);
            }
        }
        m();
        n();
        return arrayList;
    }

    public final void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = false;
    }

    public final void o(JSONObject jSONObject, SectionModel sectionModel, List<SectionModel> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c8ca9c8", new Object[]{this, jSONObject, sectionModel, list});
            return;
        }
        String string = jSONObject.getString(StWindow.UPDATE_TYPE);
        String string2 = jSONObject.getString("updateTarget");
        String string3 = jSONObject.getString("updatePosition");
        if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2) || TextUtils.isEmpty(string3)) {
            this.f.append("1");
            return;
        }
        int e = e(string2, string3, jSONObject, sectionModel, list);
        if (e > list.size()) {
            ((ArrayList) this.i).add(sectionModel);
            ugh.c("MergeDataCoreUtils", "targetPosition is bigger than list size");
            this.f.append("8");
        } else if (e < 0) {
            this.f.append("9");
        } else if (TextUtils.equals(string, "insert")) {
            list.add(e, sectionModel);
        } else if (TextUtils.equals(string, "update")) {
            list.remove(e);
            list.add(e, sectionModel);
        } else if (TextUtils.equals(string, "remove")) {
            list.remove(e);
        }
    }

    public final int a(SectionModel sectionModel, String str, int i, String str2, JSONObject jSONObject, List<SectionModel> list) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("df551ced", new Object[]{this, sectionModel, str, new Integer(i), str2, jSONObject, list})).intValue();
        }
        List<SectionModel> list2 = this.e;
        int i3 = -1;
        int indexOf = list2 == null ? -1 : list2.indexOf(sectionModel);
        if (indexOf >= 0) {
            List list3 = (List) ((HashMap) this.h).get(str);
            if (list3 == null) {
                list3 = new ArrayList();
                ((HashMap) this.h).put(str, list3);
            }
            list3.add(sectionModel);
            return indexOf;
        }
        this.j = true;
        List list4 = (List) ((HashMap) this.h).get(str);
        b(this.h, list, this.e, i);
        eee m = (this.f31456a == null || TextUtils.isEmpty(this.b)) ? null : this.f31456a.m(this.b);
        if (m != null) {
            JSONObject deltaExt = this.g.getDeltaExt();
            if (TextUtils.equals("bottom", str2)) {
                String string = jSONObject.getString("bottomInsertFree");
                if (TextUtils.isEmpty(string) && deltaExt != null) {
                    string = deltaExt.getString("bottomInsertFree");
                }
                i2 = m.a(this.b, i, TextUtils.equals("true", string));
            } else if (TextUtils.equals("top", str2)) {
                i2 = m.c(this.b, i);
            } else {
                this.f.append("4");
                i2 = -1;
            }
            String string2 = jSONObject.getString("exposeRatioFree");
            if (TextUtils.isEmpty(string2) && deltaExt != null) {
                string2 = deltaExt.getString("exposeRatioFree");
            }
            boolean equals = TextUtils.equals("true", string2);
            if (i2 < 0 || equals) {
                this.f.append("6");
            } else {
                double b = m.b(this.b, i2);
                float f = f(this.g.getDeltaExt());
                if (f > 0.0f && b <= f) {
                    this.f.append("5");
                }
            }
            i3 = i2;
        } else {
            this.f.append("7");
        }
        if (i3 < 0) {
            ((ArrayList) this.i).add(sectionModel);
        } else {
            dwe.l(this.b, str, sectionModel);
        }
        return i3;
    }

    public final void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3232ba48", new Object[]{this});
            return;
        }
        try {
            if (this.f.length() > 0) {
                String sb = this.f.toString();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("finalReason", (Object) sb);
                jSONObject.put("isCurrentDelta", (Object) Boolean.valueOf(this.j));
                List<SectionModel> list = this.d;
                if (list == null || list.size() <= 0) {
                    jSONObject.put("deltaSize", (Object) 0);
                } else {
                    jSONObject.put("deltaSize", (Object) Integer.valueOf(this.d.size()));
                }
                i65.c("MergeDataCoreUtils", "delta notReplaceReason ", sb);
                we2.a(we2.f30653a, 19999, "Page_Home_Delta_Lose", jSONObject);
            }
        } catch (Throwable th) {
            i65.b("MergeDataCoreUtils", "notReplaceReason error", th);
        }
    }

    public static int d(String str, List<SectionModel> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("68315fc9", new Object[]{str, list})).intValue();
        }
        if (TextUtils.isEmpty(str) || list == null || list.isEmpty()) {
            return -1;
        }
        for (int i = 0; i < list.size(); i++) {
            if (k(list.get(i).getString("sectionBizCode"), str)) {
                return i;
            }
        }
        return -1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0063, code lost:
        if (r10.equals("replace") == false) goto L_0x005a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int e(java.lang.String r9, java.lang.String r10, com.alibaba.fastjson.JSONObject r11, com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel r12, java.util.List<com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel> r13) {
        /*
            r8 = this;
            r0 = -1
            r1 = 4
            r2 = 3
            r3 = 2
            r4 = 0
            r5 = 1
            com.android.alibaba.ip.runtime.IpChange r6 = tb.xli.$ipChange
            boolean r7 = r6 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r7 == 0) goto L_0x0029
            java.lang.String r0 = "f1cff7ef"
            r7 = 6
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r7[r4] = r8
            r7[r5] = r9
            r7[r3] = r10
            r7[r2] = r11
            r7[r1] = r12
            r9 = 5
            r7[r9] = r13
            java.lang.Object r9 = r6.ipc$dispatch(r0, r7)
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            return r9
        L_0x0029:
            java.lang.String r6 = "position"
            boolean r6 = android.text.TextUtils.equals(r6, r10)
            if (r6 == 0) goto L_0x0042
            int r9 = r8.h(r9)
            if (r9 != r0) goto L_0x003f
            java.lang.StringBuilder r10 = r8.f
            java.lang.String r11 = "2"
            r10.append(r11)
        L_0x003f:
            r0 = r9
            goto L_0x00a9
        L_0x0042:
            int r6 = d(r9, r13)
            if (r6 >= 0) goto L_0x0050
            java.lang.StringBuilder r9 = r8.f
            java.lang.String r10 = "3"
            r9.append(r10)
            return r0
        L_0x0050:
            r10.hashCode()
            int r7 = r10.hashCode()
            switch(r7) {
                case -1392885889: goto L_0x0088;
                case -1383228885: goto L_0x007d;
                case 115029: goto L_0x0071;
                case 92734940: goto L_0x0066;
                case 1094496948: goto L_0x005c;
                default: goto L_0x005a;
            }
        L_0x005a:
            r1 = -1
            goto L_0x0092
        L_0x005c:
            java.lang.String r2 = "replace"
            boolean r2 = r10.equals(r2)
            if (r2 != 0) goto L_0x0092
            goto L_0x005a
        L_0x0066:
            java.lang.String r1 = "after"
            boolean r1 = r10.equals(r1)
            if (r1 != 0) goto L_0x006f
            goto L_0x005a
        L_0x006f:
            r1 = 3
            goto L_0x0092
        L_0x0071:
            java.lang.String r1 = "top"
            boolean r1 = r10.equals(r1)
            if (r1 != 0) goto L_0x007b
            goto L_0x005a
        L_0x007b:
            r1 = 2
            goto L_0x0092
        L_0x007d:
            java.lang.String r1 = "bottom"
            boolean r1 = r10.equals(r1)
            if (r1 != 0) goto L_0x0086
            goto L_0x005a
        L_0x0086:
            r1 = 1
            goto L_0x0092
        L_0x0088:
            java.lang.String r1 = "before"
            boolean r1 = r10.equals(r1)
            if (r1 != 0) goto L_0x0091
            goto L_0x005a
        L_0x0091:
            r1 = 0
        L_0x0092:
            switch(r1) {
                case 0: goto L_0x00a7;
                case 1: goto L_0x009b;
                case 2: goto L_0x009b;
                case 3: goto L_0x0098;
                case 4: goto L_0x0096;
                default: goto L_0x0095;
            }
        L_0x0095:
            goto L_0x00a9
        L_0x0096:
            r0 = r6
            goto L_0x00a9
        L_0x0098:
            int r0 = r6 + 1
            goto L_0x00a9
        L_0x009b:
            r0 = r8
            r1 = r12
            r2 = r9
            r3 = r6
            r4 = r10
            r5 = r11
            r6 = r13
            int r0 = r0.a(r1, r2, r3, r4, r5, r6)
            goto L_0x00a9
        L_0x00a7:
            int r0 = r6 + (-1)
        L_0x00a9:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.xli.e(java.lang.String, java.lang.String, com.alibaba.fastjson.JSONObject, com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel, java.util.List):int");
    }
}
