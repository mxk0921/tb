package tb;

import android.os.SystemClock;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.response.AwesomeGetContainerData;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.response.AwesomeGetData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class irs {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final xs6 f21532a;

    static {
        t2o.a(487587922);
    }

    public irs(xs6 xs6Var) {
        this.f21532a = xs6Var;
    }

    public static String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("289ee0ae", new Object[]{str});
        }
        return str + "_001";
    }

    public final int d(List<SectionModel> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6f8d51b7", new Object[]{this, list})).intValue();
        }
        if (list != null && !list.isEmpty()) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (e(list.get(i))) {
                    return i;
                }
            }
        }
        return -1;
    }

    public final boolean e(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9dc6133", new Object[]{this, jSONObject})).booleanValue();
        }
        return TextUtils.equals(jSONObject.getString("sectionBizCode"), "sub_tab");
    }

    public void g(AwesomeGetData awesomeGetData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2dc93424", new Object[]{this, awesomeGetData});
        } else if (awesomeGetData.getContainers() != null && !awesomeGetData.getContainers().isEmpty()) {
            HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<String, AwesomeGetContainerData> entry : awesomeGetData.getContainers().entrySet()) {
                b(entry.getKey(), entry.getValue(), hashMap, arrayList);
            }
            awesomeGetData.getContainers().putAll(hashMap);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                awesomeGetData.getContainers().remove((String) it.next());
            }
        }
    }

    public final String f(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ddb306d4", new Object[]{this, str, jSONObject});
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("item");
        if (jSONObject2 == null) {
            i65.c("TabProtocolProcess", "服务端数据异常，非常严重 item = null ！！！");
        } else {
            JSONObject jSONObject3 = jSONObject2.getJSONObject(String.valueOf(0));
            if (jSONObject3 == null) {
                i65.c("TabProtocolProcess", "服务端数据异常，非常严重 item0 = null ！！！");
            } else {
                JSONObject jSONObject4 = jSONObject3.getJSONObject("content");
                if (jSONObject4 == null) {
                    i65.c("TabProtocolProcess", "服务端数据异常，非常严重 content = null ！！！");
                } else {
                    String string = jSONObject4.getString(vaj.KEY_TAB_ID);
                    if (!TextUtils.isEmpty(string)) {
                        return string;
                    }
                    i65.c("TabProtocolProcess", "服务端数据异常，非常严重 tabId = null ！！！");
                }
            }
        }
        return c(str);
    }

    /* JADX WARN: Type inference failed for: r14v1, types: [com.taobao.informationflowdataservice.dataservice.core.datasource.model.response.AwesomeGetContainerInnerData] */
    /* JADX WARN: Type inference failed for: r14v2, types: [com.taobao.informationflowdataservice.dataservice.core.datasource.model.response.AwesomeGetContainerInnerData] */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(java.lang.String r13, com.taobao.informationflowdataservice.dataservice.core.datasource.model.response.AwesomeGetContainerData r14, java.util.Map<java.lang.String, com.taobao.informationflowdataservice.dataservice.core.datasource.model.response.AwesomeGetContainerData> r15) {
        /*
            r12 = this;
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = tb.irs.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x001b
            java.lang.String r3 = "f6a8262a"
            r4 = 4
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r12
            r4[r0] = r13
            r13 = 2
            r4[r13] = r14
            r13 = 3
            r4[r13] = r15
            r2.ipc$dispatch(r3, r4)
            return
        L_0x001b:
            com.taobao.informationflowdataservice.dataservice.core.datasource.model.response.AwesomeGetContainerInnerData r2 = r14.getBase()
            java.util.List r2 = r2.getSections()
            long r3 = android.os.SystemClock.uptimeMillis()
            int r5 = r12.d(r2)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "findTabCard use time : "
            r6.<init>(r7)
            long r7 = android.os.SystemClock.uptimeMillis()
            long r7 = r7 - r3
            r6.append(r7)
            java.lang.String r3 = r6.toString()
            java.lang.String[] r3 = new java.lang.String[]{r3}
            java.lang.String r4 = "TabProtocolProcess"
            tb.i65.c(r4, r3)
            r3 = -1
            if (r5 != r3) goto L_0x004b
            return
        L_0x004b:
            java.lang.Object r3 = r2.get(r5)
            com.alibaba.fastjson.JSONObject r3 = (com.alibaba.fastjson.JSONObject) r3
            java.lang.String r3 = r12.f(r13, r3)
            long r6 = android.os.SystemClock.uptimeMillis()
            com.taobao.informationflowdataservice.dataservice.core.datasource.model.response.AwesomeGetContainerData r8 = r14.clone()
            com.taobao.informationflowdataservice.dataservice.core.datasource.model.response.AwesomeGetContainerInnerData r9 = r14.getBase()
            com.taobao.informationflowdataservice.dataservice.core.datasource.model.response.AwesomeGetPageData r9 = r9.getPageParams()
            java.lang.String r10 = "y"
            r9.setIsLastPage(r10)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "containerData.clone() use time : "
            r9.<init>(r10)
            long r10 = android.os.SystemClock.uptimeMillis()
            long r10 = r10 - r6
            r9.append(r10)
            java.lang.String r6 = r9.toString()
            java.lang.String[] r6 = new java.lang.String[]{r6}
            tb.i65.c(r4, r6)
            int r5 = r5 + r0
            java.util.List r1 = r2.subList(r1, r5)
            com.taobao.informationflowdataservice.dataservice.core.datasource.model.response.AwesomeGetContainerInnerData r14 = r14.getBase()
            r14.setSections(r1)
            com.taobao.informationflowdataservice.dataservice.core.datasource.model.response.AwesomeGetContainerInnerData r14 = r8.getBase()
            java.util.List r2 = r14.getSections()
            r2.remove(r1)
            r1 = 0
            r14.setRemindSection(r1)
            r14.setFloatLayerSection(r1)
            r15.put(r3, r8)
            tb.xs6 r14 = r12.f21532a
            tb.at6 r14 = r14.e()
            com.taobao.informationflowdataservice.dataservice.core.datasource.model.response.AwesomeGetContainerData r13 = r14.l(r13)
            r13.setContainsTab(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.irs.a(java.lang.String, com.taobao.informationflowdataservice.dataservice.core.datasource.model.response.AwesomeGetContainerData, java.util.Map):void");
    }

    public final void b(String str, AwesomeGetContainerData awesomeGetContainerData, Map<String, AwesomeGetContainerData> map, List<String> list) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dafe6194", new Object[]{this, str, awesomeGetContainerData, map, list});
        } else if (awesomeGetContainerData == null || awesomeGetContainerData.getBase() == null || awesomeGetContainerData.getBase().getSections() == null) {
            i65.c("TabProtocolProcess", "containerTabProcess containerData.base == null");
        } else {
            boolean z2 = awesomeGetContainerData.getBase() != null && awesomeGetContainerData.getBase().isDataChange();
            boolean z3 = awesomeGetContainerData.getDelta() != null && awesomeGetContainerData.getDelta().isDataChange();
            AwesomeGetContainerData l = this.f21532a.e().l(str);
            if (z2) {
                int pageNum = awesomeGetContainerData.getPageNum();
                if (pageNum == 0) {
                    i65.c("TabProtocolProcess", "containerTabProcess containerData.base == null");
                    l.setContainsTab(false);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    a(str, awesomeGetContainerData, map);
                    i65.c("TabProtocolProcess", "baseDataProcess use time : " + (SystemClock.uptimeMillis() - uptimeMillis));
                } else if (l.isContainsTab()) {
                    i65.c("TabProtocolProcess", "非第 0 页，前面已经存在tab，不虚拟化处理");
                } else {
                    StringBuilder sb = new StringBuilder("非第 0 页，不存在tab， pageNum : ");
                    sb.append(pageNum);
                    sb.append(", 是否虚拟化处理：");
                    if (pageNum > 0) {
                        z = false;
                    }
                    sb.append(z);
                    i65.c("TabProtocolProcess", sb.toString());
                    if (pageNum <= 0) {
                        a(str, awesomeGetContainerData, map);
                    }
                }
            } else if (z3) {
                i65.c("TabProtocolProcess", "差量不虚拟化处理 isDeltaRefresh isContainsTab" + l.isContainsTab());
            }
        }
    }
}
