package tb;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.widget.Toast;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SubSectionModel;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.UpdateRuleModel;
import com.taobao.tao.Globals;
import com.taobao.tao.homepage.revision.Revision;
import com.taobao.tao.log.TLog;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerData;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerInnerData;
import com.taobao.tao.recommend3.gateway.msgcenter.RecmdGatewayMsg;
import com.taobao.tao.topmultitab.protocol.IHomeSubTabController;
import com.taobao.tao.topmultitab.service.controller.IHomeControllerService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class kmn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final String f22763a = "preloadOptimize";
    public static x4a b = new x4a(h());
    public static x4a c = new x4a(h() + ".*.overlay");
    public static x4a d = new x4a(h() + ".*.dinamicX");

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f22764a;

        public a(String str) {
            this.f22764a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Application application = Globals.getApplication();
            Toast.makeText(application, "Error:" + this.f22764a, 0).show();
        }
    }

    public static void a(Map<String, List<SectionModel>> map, List<SectionModel> list, List<SectionModel> list2, int i) {
        List<SectionModel> list3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6fd03ea", new Object[]{map, list, list2, new Integer(i)});
            return;
        }
        for (String str : map.keySet()) {
            if (f(str, list2) <= i && (list3 = map.get(str)) != null && list3.size() > 0) {
                for (int size = list3.size() - 1; size >= 0; size--) {
                    SectionModel sectionModel = list3.get(size);
                    int indexOf = list.indexOf(sectionModel);
                    int indexOf2 = list2.indexOf(sectionModel);
                    if (indexOf != indexOf2) {
                        if (indexOf >= 0) {
                            list.remove(indexOf);
                        }
                        if (indexOf2 >= 0 && indexOf2 <= list.size()) {
                            list.add(indexOf2, sectionModel);
                        }
                    }
                }
                list3.clear();
            }
        }
    }

    public static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6909f25", new Object[]{str});
        } else if (cw6.b()) {
            new Handler(Globals.getApplication().getMainLooper()).post(new a(str));
        }
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("562c88eb", new Object[0])).booleanValue();
        }
        return f4b.b("enableUpdateDataByRefreshPaths", true);
    }

    public static AwesomeGetContainerInnerData d(AwesomeGetContainerData awesomeGetContainerData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AwesomeGetContainerInnerData) ipChange.ipc$dispatch("72dd048f", new Object[]{awesomeGetContainerData});
        }
        if (awesomeGetContainerData == null || awesomeGetContainerData.getDeltaData() == null) {
            return null;
        }
        AwesomeGetContainerInnerData clone = awesomeGetContainerData.delta.clone();
        for (SectionModel sectionModel : awesomeGetContainerData.getDeltaData()) {
            if (!TextUtils.equals(sectionModel.getString("invalidType"), "never")) {
                clone.sections.remove(sectionModel);
            }
        }
        return clone;
    }

    public static int e(SectionModel sectionModel, List<SectionModel> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e9416c16", new Object[]{sectionModel, list})).intValue();
        }
        if (sectionModel == null || list == null || list.isEmpty()) {
            return -1;
        }
        int indexOf = list.indexOf(sectionModel);
        return indexOf >= 0 ? indexOf : f(sectionModel.getString("sectionBizCode"), list);
    }

    public static void g(List<SectionModel> list, List<JSONObject> list2, SectionModel sectionModel, int i) {
        SectionModel sectionModel2;
        SubSectionModel subSectionModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bafe36ee", new Object[]{list, list2, sectionModel, new Integer(i)});
        } else if (i >= 0 && (sectionModel2 = list.get(i)) != null) {
            if (sectionModel2.getSubSection() != null) {
                subSectionModel = sectionModel2.getSubSection();
            } else {
                subSectionModel = new SubSectionModel(JSON.parseObject("{}"));
            }
            SectionModel sectionModel3 = new SectionModel(sectionModel);
            JSONObject args = sectionModel2.getArgs();
            if (args != null && args.containsKey("realExposeIndex")) {
                int intValue = args.getIntValue("realExposeIndex");
                JSONObject args2 = sectionModel3.getArgs();
                if (args2 != null) {
                    args2.put("realExposeIndex", (Object) Integer.valueOf(intValue));
                }
            }
            subSectionModel.setWindVaneOverlay(sectionModel3);
            sectionModel2.setCustomSubSection(subSectionModel);
            list.set(i, sectionModel2);
            list2.add(sectionModel);
            fve.e("gw2.GatewayUtils", "has Add Layer");
        }
    }

    public static String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("edcc83ca", new Object[0]);
        }
        String c2 = b3b.c();
        if (c2.equalsIgnoreCase("main")) {
            return "recommend_home_main";
        }
        if (c2.equalsIgnoreCase(i2b.HOMEPAGE_CTAO)) {
            return "recommend_home_cun";
        }
        if (c2.equalsIgnoreCase("old")) {
            return "recommend_home_old";
        }
        return "recommend_home_intl";
    }

    public static String i(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6029076e", new Object[]{new Boolean(z)});
        }
        if (z) {
            return "baseRefresh";
        }
        return "deltaRefresh";
    }

    public static Map<String, String> j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("6b422378", new Object[]{str});
        }
        IHomeControllerService iHomeControllerService = (IHomeControllerService) c4b.i().h(IHomeControllerService.class);
        if (iHomeControllerService == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        IHomeSubTabController currentSubTabController = iHomeControllerService.getCurrentSubTabController();
        if (currentSubTabController == null) {
            return null;
        }
        String subControllerType = iHomeControllerService.getSubControllerType(currentSubTabController);
        if (!TextUtils.isEmpty(subControllerType)) {
            hashMap.put(nuo.MSG_SELECT_TAB, subControllerType);
            TLog.loge("gw2.GatewayUtils", "获取当前的上行参数，currentTab：" + subControllerType);
        }
        Map<String, String> requestUpstreamBizParam = currentSubTabController.getRequestUpstreamBizParam(str);
        if (requestUpstreamBizParam != null) {
            hashMap.putAll(requestUpstreamBizParam);
        }
        return hashMap;
    }

    public static String k(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e9b27e82", new Object[]{jSONObject});
        }
        if (jSONObject == null) {
            return h();
        }
        return jSONObject.getString("containerId");
    }

    public static boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("83ffd3f8", new Object[0])).booleanValue();
        }
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            return true;
        }
        return false;
    }

    public static boolean m(String str, String str2) {
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

    public static long s(Context context, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6a672a93", new Object[]{context, new Long(j)})).longValue();
        }
        return j;
    }

    public static void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b8933e9", new Object[0]);
            return;
        }
        b = new x4a(h());
        StringBuilder sb = new StringBuilder();
        sb.append(h());
        sb.append(yhs.DEFAULT_PLAN_B_PASSWORD_REGEX);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(h());
        sb2.append(".error");
        StringBuilder sb3 = new StringBuilder();
        sb3.append(h());
        sb3.append(".loading");
        c = new x4a(h() + ".*.overlay");
        d = new x4a(h() + ".*.dinamicX");
    }

    public static JSONObject x(String str, x4a x4aVar, JSONObject jSONObject) {
        imi a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("eeeb2273", new Object[]{str, x4aVar, jSONObject});
        }
        vqa.k().i("GatewayEvents").j("triggerSimpleEventByNewFace").e("gw2.GatewayUtils.triggerSimpleEventByNewFace;").e("触发网关事件;").g("requestType", str).a();
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        b5a b5aVar = new b5a(str, x4aVar, jSONObject);
        ArrayList arrayList = new ArrayList();
        arrayList.add(b5aVar);
        RecmdGatewayMsg message = RecmdGatewayMsg.getMessage(arrayList);
        if (!(message == null || (a2 = zza.a(yyj.e().k())) == null)) {
            a2.c(message);
        }
        return jSONObject;
    }

    public static JSONObject v(String str, x4a x4aVar, JSONObject jSONObject, int i, JSONObject jSONObject2) {
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("13def94c", new Object[]{str, x4aVar, jSONObject, new Integer(i), jSONObject2});
        }
        vqa g = vqa.k().i("MTopRequest").j(r78.TRIGGER_REQUEST).e("gw2.GatewayUtils.triggerEvent").e("非newFace或非首页发起网络请求").g("requestType", str);
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        String k = k(jSONObject);
        jSONObject2.put("containerId", (Object) k);
        g.g("containerId", k).a();
        if (jSONObject2.getJSONObject("bizParam") != null) {
            jSONObject3 = jSONObject2.getJSONObject("bizParam");
        } else {
            JSONObject jSONObject4 = new JSONObject();
            jSONObject2.put("bizParam", (Object) jSONObject4);
            jSONObject3 = jSONObject4;
        }
        String str2 = f22763a;
        if (jSONObject2.getString(str2) != null) {
            jSONObject3.put(str2, (Object) jSONObject2.getString(str2));
        }
        if (i >= 0) {
            jSONObject3.put("tabIndex", (Object) Integer.valueOf(i + 1));
        }
        if (jSONObject != null) {
            jSONObject3.put("appId", (Object) jSONObject.getString("appId"));
        }
        jSONObject3.put("new2021UIEnable", (Object) Boolean.valueOf(Revision.b().g()));
        jSONObject3.put(q92.IS_COMPLEX_TEXTURE, (Object) Boolean.valueOf(q92.a()));
        bqa.a("xingze", "triggerEvent=" + str);
        if (TextUtils.equals(str, "PageBack")) {
            von.z(k);
            JSONObject w = von.w(k);
            if (w != null) {
                for (String str3 : w.keySet()) {
                    String string = w.getString(str3);
                    jSONObject3.put(str3, (Object) w.getString(str3));
                    if (TextUtils.equals("itemId", str3)) {
                        von.E(k, string);
                    }
                }
            }
        } else {
            String a2 = vma.a(k);
            if (!TextUtils.isEmpty(a2)) {
                jSONObject3.put("guessModelVersion", (Object) a2);
            }
        }
        if (TextUtils.equals(str, "modelCompute")) {
            return jSONObject2;
        }
        b5a b5aVar = new b5a(str, x4aVar, jSONObject2);
        ArrayList arrayList = new ArrayList();
        arrayList.add(b5aVar);
        RecmdGatewayMsg message = RecmdGatewayMsg.getMessage(arrayList);
        if (message != null) {
            zza.a(k).c(message);
        }
        return jSONObject2;
    }

    public static int f(String str, List<SectionModel> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("68315fc9", new Object[]{str, list})).intValue();
        }
        if (TextUtils.isEmpty(str) || list == null || list.isEmpty()) {
            return -1;
        }
        for (int i = 0; i < list.size(); i++) {
            if (m(list.get(i).getString("sectionBizCode"), str)) {
                return i;
            }
        }
        return -1;
    }

    public static void o(String str, List<SectionModel> list, List<SectionModel> list2) {
        JSONObject ext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc07fe36", new Object[]{str, list, list2});
        } else if (list != 0 && list2 != null && TextUtils.equals(str, yyj.l().f32522a)) {
            ArrayList arrayList = new ArrayList();
            Iterator<SectionModel> it = list2.iterator();
            while (it.hasNext()) {
                SectionModel next = it.next();
                List<UpdateRuleModel> updateRules = next.getUpdateRules();
                if (updateRules != null && !updateRules.isEmpty()) {
                    for (UpdateRuleModel updateRuleModel : updateRules) {
                        if (TextUtils.equals(updateRuleModel.getUpdatePosition(), "unfixed") && TextUtils.equals(updateRuleModel.getUpdateType(), "mixMerge")) {
                            arrayList.add(next);
                            it.remove();
                        }
                    }
                }
            }
            if (arrayList.size() > 0) {
                int size = list.size();
                int i = size;
                for (int i2 = 0; i2 < size; i2++) {
                    SectionModel sectionModel = list.get(i2);
                    if (TextUtils.equals(sectionModel.getSectionBizCode(), "mainAndSubSeparator")) {
                        i = i2;
                    } else if (i2 > i && ((ext = sectionModel.getExt()) == null || !ext.getBooleanValue("stark_fixed"))) {
                        if (arrayList.size() <= 0) {
                            break;
                        }
                        list.set(i2, arrayList.remove(0));
                    }
                }
                if (arrayList.size() > 0) {
                    list.addAll(arrayList);
                }
            }
        }
    }

    public static void p(JSONArray jSONArray, List<SectionModel> list, SectionModel sectionModel, int i) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69144f2", new Object[]{jSONArray, list, sectionModel, new Integer(i)});
        } else if (!c()) {
            bqa.d("gw2.GatewayUtils", "enableUpdateDataByRefreshPaths is false");
        } else if (jSONArray == null || jSONArray.isEmpty() || i < 0) {
            bqa.d("gw2.GatewayUtils", "refreshPaths is null or empty");
        } else {
            SectionModel sectionModel2 = new SectionModel(list.get(i));
            Iterator<Object> it = jSONArray.iterator();
            boolean z = false;
            while (it.hasNext()) {
                Object next = it.next();
                if (!(next instanceof JSONObject)) {
                    bqa.d("gw2.GatewayUtils", "refreshPath is not JSONObject");
                } else {
                    String string = ((JSONObject) next).getString("path");
                    if (TextUtils.isEmpty(string)) {
                        bqa.d("gw2.GatewayUtils", "path is empty");
                    } else {
                        int lastIndexOf = string.lastIndexOf(".");
                        if (lastIndexOf > 0) {
                            str = string.substring(0, lastIndexOf);
                        } else {
                            str = "";
                        }
                        String substring = string.substring(lastIndexOf + 1);
                        Object k = a3b.k(sectionModel2, str);
                        Object k2 = a3b.k(sectionModel, string);
                        if (TextUtils.isEmpty(substring) || k == null || k2 == null) {
                            bqa.d("gw2.GatewayUtils", "replaceKey or parentObj or targetObj is null or empty");
                        } else if (k instanceof JSONObject) {
                            ((JSONObject) k).put(substring, k2);
                            bqa.d("gw2.GatewayUtils", "refresh path success: ".concat(string));
                        }
                    }
                }
                z = true;
            }
            if (z) {
                gve.b("merge_path_data_error", "Page_Home", null);
                return;
            }
            list.remove(i);
            list.add(i, sectionModel2);
        }
    }

    public static void q(JSONArray jSONArray, List<SectionModel> list, SectionModel sectionModel, int i) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58e2d9eb", new Object[]{jSONArray, list, sectionModel, new Integer(i)});
        } else if (!c()) {
            bqa.d("gw2.GatewayUtils", "enableUpdateDataByRefreshPaths is false");
        } else if (jSONArray == null || jSONArray.isEmpty() || i < 0) {
            bqa.d("gw2.GatewayUtils", "refreshPaths is null or empty");
        } else {
            SectionModel sectionModel2 = new SectionModel(list.get(i));
            Iterator<Object> it = jSONArray.iterator();
            boolean z = false;
            while (it.hasNext()) {
                Object next = it.next();
                if (!(next instanceof JSONObject)) {
                    bqa.d("gw2.GatewayUtils", "refreshPath is not JSONObject");
                } else {
                    String string = ((JSONObject) next).getString("path");
                    if (TextUtils.isEmpty(string)) {
                        bqa.d("gw2.GatewayUtils", "path is empty");
                    } else {
                        int lastIndexOf = string.lastIndexOf(".");
                        if (lastIndexOf > 0) {
                            str = string.substring(0, lastIndexOf);
                        } else {
                            str = "";
                        }
                        String substring = string.substring(lastIndexOf + 1);
                        Object k = a3b.k(sectionModel, str);
                        Object k2 = a3b.k(sectionModel2, string);
                        if (TextUtils.isEmpty(substring) || k == null || k2 == null) {
                            bqa.d("gw2.GatewayUtils", "replaceKey or parentObj or targetObj is null or empty");
                        } else if (k instanceof JSONObject) {
                            ((JSONObject) k).put(substring, k2);
                            bqa.d("gw2.GatewayUtils", "unRefresh path success: ".concat(string));
                        }
                    }
                }
                z = true;
            }
            if (z) {
                gve.b("merge_path_data_error", "Page_Home", null);
                return;
            }
            list.remove(i);
            list.add(i, sectionModel);
        }
    }

    public static void r(AwesomeGetContainerData awesomeGetContainerData, AwesomeGetContainerData awesomeGetContainerData2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5af2468", new Object[]{awesomeGetContainerData, awesomeGetContainerData2});
        } else if (awesomeGetContainerData != null && awesomeGetContainerData2 != null) {
            AwesomeGetContainerInnerData awesomeGetContainerInnerData = awesomeGetContainerData2.base;
            String i = i(awesomeGetContainerInnerData != null && awesomeGetContainerInnerData.dataChange && awesomeGetContainerData2.getPageNum() == 0);
            List<SectionModel> deltaData = awesomeGetContainerData.getDeltaData();
            List<SectionModel> deltaData2 = awesomeGetContainerData2.getDeltaData();
            ArrayList arrayList = new ArrayList();
            if (TextUtils.equals(i, "deltaRefresh")) {
                arrayList.add("baseRefresh");
                arrayList.add("pageExit");
                arrayList.add("appExit");
                arrayList.add("never");
            } else if (TextUtils.equals(i, "baseRefresh")) {
                arrayList.add("pageExit");
                arrayList.add("appExit");
                arrayList.add("never");
            } else if (TextUtils.equals(i, "pageExit")) {
                arrayList.add("appExit");
                arrayList.add("never");
            } else if (TextUtils.equals(i, "appExit")) {
                arrayList.add("never");
            } else {
                TextUtils.equals(i, "never");
            }
            ArrayList arrayList2 = new ArrayList();
            if (!arrayList.isEmpty() && deltaData != null) {
                for (SectionModel sectionModel : deltaData) {
                    if (arrayList.contains(sectionModel.getString("invalidType"))) {
                        arrayList2.add(sectionModel);
                    }
                }
            }
            if (deltaData2 != null) {
                for (int i2 = 0; i2 < deltaData2.size(); i2++) {
                    SectionModel sectionModel2 = deltaData2.get(i2);
                    if (u(sectionModel2.getString("keep"))) {
                        int e = e(sectionModel2, deltaData);
                        if (e >= 0) {
                            SectionModel sectionModel3 = deltaData.get(e);
                            if (e(sectionModel3, arrayList2) < 0) {
                                arrayList2.add(sectionModel3);
                            }
                        }
                    } else {
                        int e2 = e(sectionModel2, arrayList2);
                        if (e2 >= 0) {
                            arrayList2.remove(e2);
                        }
                        arrayList2.add(sectionModel2);
                    }
                }
            }
            if (arrayList2.isEmpty()) {
                awesomeGetContainerData2.delta = null;
                return;
            }
            if (awesomeGetContainerData2.delta == null) {
                awesomeGetContainerData2.delta = awesomeGetContainerData.delta.clone();
            }
            awesomeGetContainerData2.delta.sections = arrayList2;
        }
    }

    public static boolean u(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d33a3002", new Object[]{str})).booleanValue();
        }
        if (str == "true") {
            return true;
        }
        if (str == null) {
            return false;
        }
        int length = str.length();
        if (length == 1) {
            char charAt = str.charAt(0);
            return charAt == 'Y' || charAt == 'y';
        } else if (length != 2) {
            if (length == 3) {
                char charAt2 = str.charAt(0);
                if (charAt2 == 'y') {
                    if (str.charAt(1) == 'e' || str.charAt(1) == 'E') {
                        return str.charAt(2) == 's' || str.charAt(2) == 'S';
                    }
                    return false;
                } else if (charAt2 == 'Y') {
                    if (str.charAt(1) == 'E' || str.charAt(1) == 'e') {
                        return str.charAt(2) == 'S' || str.charAt(2) == 's';
                    }
                    return false;
                }
            } else if (length != 4) {
                return false;
            }
            char charAt3 = str.charAt(0);
            if (charAt3 == 't') {
                if (str.charAt(1) != 'r' && str.charAt(1) != 'R') {
                    return false;
                }
                if (str.charAt(2) == 'u' || str.charAt(2) == 'U') {
                    return str.charAt(3) == 'e' || str.charAt(3) == 'E';
                }
                return false;
            } else if (charAt3 != 'T') {
                return false;
            } else {
                if (str.charAt(1) != 'R' && str.charAt(1) != 'r') {
                    return false;
                }
                if (str.charAt(2) == 'U' || str.charAt(2) == 'u') {
                    return str.charAt(3) == 'E' || str.charAt(3) == 'e';
                }
                return false;
            }
        } else {
            char charAt4 = str.charAt(0);
            char charAt5 = str.charAt(1);
            if (charAt4 == 'o' || charAt4 == 'O') {
                return charAt5 == 'n' || charAt5 == 'N';
            }
            return false;
        }
    }

    static {
        t2o.a(729809685);
        StringBuilder sb = new StringBuilder();
        sb.append(h());
        sb.append(yhs.DEFAULT_PLAN_B_PASSWORD_REGEX);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(h());
        sb2.append(".error");
        StringBuilder sb3 = new StringBuilder();
        sb3.append(h());
        sb3.append(".loading");
        StringBuilder sb4 = new StringBuilder();
        sb4.append(h());
        sb4.append(".*.video");
        new ConcurrentHashMap(16);
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0142, code lost:
        if (android.text.TextUtils.equals("cover", r2) != false) goto L_0x0144;
     */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0213  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.List<com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel> n(java.lang.String r20, com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerData r21, com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerData r22) {
        /*
            Method dump skipped, instructions count: 841
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.kmn.n(java.lang.String, com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerData, com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerData):java.util.List");
    }

    public static JSONObject w(String str, x4a x4aVar, String[] strArr, JSONObject jSONObject) {
        JSONObject jSONObject2;
        imi a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b68778a0", new Object[]{str, x4aVar, strArr, jSONObject});
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        if (!TextUtils.equals("ViewAppear", str)) {
            vqa.k().i("MTopRequest").j("triggerNewFaceRequest").e("gw2.GatewayUtils.triggerEventByNewFace;").e("触发newFace网络请求;").g("requestType", str).a();
        }
        JSONObject jSONObject3 = jSONObject == null ? new JSONObject() : jSONObject;
        if (strArr == null) {
            return jSONObject3;
        }
        jSONObject3.put("containers", (Object) strArr);
        if (jSONObject3.getJSONObject("bizParam") != null) {
            jSONObject2 = jSONObject3.getJSONObject("bizParam");
        } else {
            JSONObject jSONObject4 = new JSONObject();
            jSONObject3.put("bizParam", (Object) jSONObject4);
            jSONObject2 = jSONObject4;
        }
        String str2 = f22763a;
        if (jSONObject3.getString(str2) != null) {
            jSONObject2.put(str2, (Object) jSONObject3.getString(str2));
        }
        Map<String, String> j = j(str);
        if (j != null && !j.isEmpty()) {
            jSONObject2.putAll(j);
        }
        phg.i("guessModelVersion");
        for (String str3 : strArr) {
            if (!TextUtils.equals(str, "PageBack") || !yyj.e().q(str3)) {
                String a3 = vma.a(str3);
                if (!TextUtils.isEmpty(a3)) {
                    jSONObject2.put("guessModelVersion", (Object) a3);
                }
            } else {
                von.z(str3);
                JSONObject w = von.w(str3);
                boolean L = von.L();
                if (w != null && L) {
                    for (String str4 : w.keySet()) {
                        String string = w.getString(str4);
                        jSONObject2.put(str4, (Object) w.getString(str4));
                        if (TextUtils.equals("itemId", str4)) {
                            von.E(str3, string);
                        }
                    }
                }
            }
        }
        phg.h("guessModelVersion");
        if (TextUtils.equals(str, "modelCompute")) {
            return jSONObject3;
        }
        jSONObject3.put(p6j.MTOP_STAGE_ASSEMBLEPARAMS_STARTTIME, (Object) Long.valueOf(uptimeMillis));
        b5a b5aVar = new b5a(str, x4aVar, jSONObject3);
        ArrayList arrayList = new ArrayList();
        arrayList.add(b5aVar);
        RecmdGatewayMsg message = RecmdGatewayMsg.getMessage(arrayList);
        if (!(message == null || (a2 = zza.a(yyj.e().k())) == null)) {
            a2.c(message);
        }
        if (TextUtils.equals(str, "LoadCache")) {
            p6j.c("gateWay", str, String.valueOf(SystemClock.uptimeMillis() - uptimeMillis), null);
        }
        return jSONObject3;
    }
}
