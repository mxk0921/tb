package tb;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.subservice.biz.ICardOverlayService;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class hue {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String IS_FIRST_APPEAR = "isFirstAppear";
    public static final String UT_LOG_MAP = "utLogMap";

    static {
        t2o.a(486539726);
    }

    public static void a(String str, String str2, String str3, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7ffa5ff", new Object[]{str, str2, str3, jSONObject});
        } else {
            gue.f(str, str2, str3, jSONObject);
        }
    }

    public static void b(JSONObject jSONObject, JSONObject jSONObject2) {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc4697e3", new Object[]{jSONObject, jSONObject2});
            return;
        }
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = jSONObject2.getJSONObject("ext");
        String str3 = null;
        String string = jSONObject4 != null ? jSONObject4.getString("slotBizCode") : null;
        if (TextUtils.isEmpty(string)) {
            string = jSONObject.getString("sectionBizCode");
        }
        jSONObject3.put("clickBizCode", (Object) string);
        JSONObject jSONObject5 = jSONObject.getJSONObject("args");
        if (jSONObject5 != null) {
            jSONObject3.put(yj4.PARAM_PVID, (Object) jSONObject5.getString(yj4.PARAM_PVID));
            jSONObject3.put("spm", (Object) jSONObject5.getString("spm"));
            JSONObject jSONObject6 = jSONObject5.getJSONObject("utLogMapEdge");
            if (jSONObject6 != null) {
                jSONObject3.put("x_object_id", (Object) jSONObject6.getString("x_object_id"));
            } else {
                String string2 = jSONObject5.getString("utLogMap");
                try {
                    if (!TextUtils.isEmpty(string2)) {
                        jSONObject3.put("x_object_id", (Object) JSON.parseObject(URLDecoder.decode(string2, "utf-8")).getString("x_object_id"));
                    }
                } catch (UnsupportedEncodingException e) {
                    fve.c("BxUserTrack", "utLogMap catch decode error", e);
                } catch (NullPointerException e2) {
                    fve.c("BxUserTrack", "utLogMap catch npe error", e2);
                }
            }
        }
        JSONObject jSONObject7 = jSONObject2.getJSONObject("clickParam");
        if (jSONObject7 != null) {
            str3 = jSONObject7.getString("itemId");
            str = jSONObject7.getString("arg1");
            str2 = jSONObject7.getString("page");
        } else {
            str = "click_recommend_item";
            str2 = "Page_Home";
        }
        gue.f(str2, str, str3, jSONObject3);
    }

    public static void c(JSONObject jSONObject) {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7907205", new Object[]{jSONObject});
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = jSONObject.getJSONObject("args");
        if (jSONObject3 != null) {
            jSONObject2.put(yj4.PARAM_PVID, (Object) jSONObject3.getString(yj4.PARAM_PVID));
        }
        Object b = kr8.b("item.0.clickParam.itemId", jSONObject);
        String str3 = b instanceof String ? (String) b : null;
        Object b2 = kr8.b("subSection.overlay.exposureParam", jSONObject);
        if (b2 instanceof JSONObject) {
            JSONObject jSONObject4 = (JSONObject) b2;
            str2 = jSONObject4.getString("arg1");
            str = jSONObject4.getString("page");
        } else {
            str2 = "click_recommend_item_overlay";
            str = "";
        }
        gue.f(str, str2, str3, jSONObject2);
    }

    public static void d(cfc cfcVar, BaseSectionModel<?> baseSectionModel, JSONObject jSONObject) {
        String str;
        String str2;
        JSONObject jSONObject2;
        BaseSectionModel<?> j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aed6f4fe", new Object[]{cfcVar, baseSectionModel, jSONObject});
            return;
        }
        JSONObject jSONObject3 = new JSONObject();
        if (baseSectionModel.getJSONObject("args") != null) {
            jSONObject3.put(yj4.PARAM_PVID, (Object) baseSectionModel.getJSONObject("args").getString(yj4.PARAM_PVID));
        }
        String i = i(baseSectionModel);
        if (TextUtils.isEmpty(i) && (j = j(cfcVar, baseSectionModel)) != null) {
            i = i(j);
        }
        if (jSONObject == null || (jSONObject2 = jSONObject.getJSONObject("clickParam")) == null) {
            str2 = "click_recommend_item_delete";
            str = "";
        } else {
            str2 = jSONObject2.getString("arg1");
            str = jSONObject2.getString("page");
            JSONObject jSONObject4 = jSONObject2.getJSONObject("args");
            if (jSONObject4 != null) {
                jSONObject3.put("reasonArgs", (Object) jSONObject4.getString("reasonArgs"));
            }
        }
        gue.f(str, str2, i, jSONObject3);
    }

    public static void e(cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edb531e", new Object[]{cfcVar});
        } else {
            gue.f(cfcVar.getContainerType().a(), "Button-Top", null, null);
        }
    }

    public static void f(JSONObject jSONObject, JSONObject jSONObject2) {
        String str;
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("116636e6", new Object[]{jSONObject, jSONObject2});
            return;
        }
        JSONObject jSONObject4 = new JSONObject();
        JSONObject jSONObject5 = jSONObject.getJSONObject("args");
        if (jSONObject5 != null) {
            jSONObject4.put(yj4.PARAM_PVID, (Object) jSONObject5.getString(yj4.PARAM_PVID));
        }
        Object b = kr8.b("item.0.clickParam.itemId", jSONObject);
        String str2 = "";
        String str3 = b instanceof String ? (String) b : str2;
        if (jSONObject2 == null || (jSONObject3 = jSONObject2.getJSONObject("clickParam")) == null) {
            str = "click_recommend_item_similar";
        } else {
            str = jSONObject3.getString("arg1");
            str2 = jSONObject3.getString("page");
        }
        gue.f(str2, str, str3, jSONObject4);
    }

    public static om1 g(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (om1) ipChange.ipc$dispatch("a4bd4693", new Object[]{view});
        }
        if (view == null) {
            return null;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        om1 om1Var = new om1();
        om1Var.f25484a = iArr[0];
        om1Var.b = iArr[1];
        om1Var.c = view.getMeasuredWidth();
        om1Var.d = view.getMeasuredHeight();
        return om1Var;
    }

    public static om1 h(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (om1) ipChange.ipc$dispatch("5ee41e6e", new Object[]{view});
        }
        if (view == null) {
            return null;
        }
        Rect rect = new Rect();
        if (!view.getGlobalVisibleRect(rect)) {
            return null;
        }
        om1 om1Var = new om1();
        om1Var.f25484a = rect.left;
        om1Var.b = rect.top;
        om1Var.c = rect.width();
        om1Var.d = rect.height();
        return om1Var;
    }

    public static String i(BaseSectionModel<?> baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9216055c", new Object[]{baseSectionModel});
        }
        Object b = kr8.b("item.0.clickParam.itemId", baseSectionModel);
        if (b instanceof String) {
            return (String) b;
        }
        return "";
    }

    public static BaseSectionModel<?> j(cfc cfcVar, BaseSectionModel<?> baseSectionModel) {
        ICardOverlayService iCardOverlayService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseSectionModel) ipChange.ipc$dispatch("4e3f872c", new Object[]{cfcVar, baseSectionModel});
        }
        if (cfcVar == null || (iCardOverlayService = (ICardOverlayService) cfcVar.a(ICardOverlayService.class)) == null) {
            return null;
        }
        return iCardOverlayService.findHostCard(baseSectionModel);
    }

    public static boolean k(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bc4ba509", new Object[]{jSONObject})).booleanValue();
        }
        if (!(jSONObject == null || (jSONObject2 = jSONObject.getJSONObject("ext")) == null)) {
            if (TextUtils.equals(jSONObject2.getString("kSectionHasBxAppeared"), "1")) {
                return false;
            }
            jSONObject2.put("kSectionHasBxAppeared", "1");
        }
        return true;
    }

    public static void l(JSONObject jSONObject, View view, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edb0f7c9", new Object[]{jSONObject, view, new Integer(i), new Integer(i2)});
        } else if (jSONObject != null) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("args");
            JSONObject jSONObject3 = new JSONObject(10);
            if (k(jSONObject)) {
                if (jSONObject2 != null) {
                    jSONObject3.put("spm", (Object) jSONObject2.getString("spm"));
                    jSONObject3.put("scm", (Object) jSONObject2.getString("scm"));
                    jSONObject3.put("guess_buckets", (Object) jSONObject2.getString("guess_buckets"));
                    jSONObject3.put("index", jSONObject2.get("index"));
                    jSONObject3.put("realExposeIndex", jSONObject2.get("realExposeIndex"));
                    jSONObject3.put("recIndex", jSONObject2.get("recIndex"));
                }
                jSONObject3.put("infoFlowIndex", (Object) Integer.valueOf(i - i2));
                jSONObject3.put("isFirstAppear", (Object) Boolean.valueOf(jSONObject.getBooleanValue("isFirstAppear")));
                JSONObject jSONObject4 = jSONObject.getJSONObject(i2b.TRACK_EXPOSURE_PARAM);
                if (jSONObject4 != null) {
                    gue.a(jSONObject4.getString("page"), jSONObject4.getString("arg1"), "", view, jSONObject3);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void n(com.alibaba.fastjson.JSONObject r10, android.view.View r11, int r12, int r13) {
        /*
            java.lang.String r0 = "spm"
            java.lang.String r1 = "realExposeIndex"
            java.lang.String r2 = ""
            com.android.alibaba.ip.runtime.IpChange r3 = tb.hue.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x002d
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r12)
            java.lang.Integer r12 = new java.lang.Integer
            r12.<init>(r13)
            r13 = 4
            java.lang.Object[] r13 = new java.lang.Object[r13]
            r1 = 0
            r13[r1] = r10
            r10 = 1
            r13[r10] = r11
            r10 = 2
            r13[r10] = r0
            r10 = 3
            r13[r10] = r12
            java.lang.String r10 = "8e30b086"
            r3.ipc$dispatch(r10, r13)
            return
        L_0x002d:
            if (r10 != 0) goto L_0x0030
            return
        L_0x0030:
            java.lang.String r3 = "args"
            com.alibaba.fastjson.JSONObject r3 = r10.getJSONObject(r3)
            if (r3 != 0) goto L_0x0039
            return
        L_0x0039:
            boolean r4 = k(r10)
            if (r4 != 0) goto L_0x0040
            return
        L_0x0040:
            java.lang.String r4 = "utLogMapEdge"
            com.alibaba.fastjson.JSONObject r4 = r3.getJSONObject(r4)
            if (r4 != 0) goto L_0x004a
            return
        L_0x004a:
            com.alibaba.fastjson.JSONObject r5 = new com.alibaba.fastjson.JSONObject
            r5.<init>()
            java.lang.String r6 = "x_item_ids"
            java.lang.String r6 = r4.getString(r6)     // Catch: all -> 0x0093
            boolean r7 = android.text.TextUtils.isEmpty(r6)     // Catch: all -> 0x0094
            if (r7 == 0) goto L_0x0063
            java.lang.String r7 = "x_object_id"
            java.lang.String r6 = r4.getString(r7)     // Catch: all -> 0x0094
        L_0x0063:
            tb.ek9 r7 = new tb.ek9     // Catch: all -> 0x0094
            r7.<init>(r11, r6)     // Catch: all -> 0x0094
            r11.post(r7)     // Catch: all -> 0x0094
            java.lang.String r7 = "itemId"
            r5.put(r7, r6)     // Catch: all -> 0x0094
            java.lang.Integer r7 = java.lang.Integer.valueOf(r12)     // Catch: all -> 0x0094
            r5.put(r1, r7)     // Catch: all -> 0x0094
            java.lang.String r7 = "itemType"
            java.lang.String r8 = "x_object_type"
            java.lang.String r8 = r4.getString(r8)     // Catch: all -> 0x0094
            r5.put(r7, r8)     // Catch: all -> 0x0094
            java.lang.String r7 = "utLogMap"
            r5.put(r7, r4)     // Catch: all -> 0x0094
            java.lang.String r4 = r3.getString(r0)     // Catch: all -> 0x0094
            r5.put(r0, r4)     // Catch: all -> 0x0094
            goto L_0x00a0
        L_0x0093:
            r6 = r2
        L_0x0094:
            java.lang.String r0 = "trackRecyclerViewScroll utLogMap"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            java.lang.String r4 = "BxUserTrack"
            tb.fve.e(r4, r0)
        L_0x00a0:
            int r12 = r12 - r13
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            java.lang.String r13 = "infoFlowIndex"
            r5.put(r13, r12)
            java.lang.String r12 = "isFirstAppear"
            boolean r13 = r10.getBooleanValue(r12)
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r13)
            r5.put(r12, r13)
            java.lang.String r12 = "index"
            java.lang.Object r13 = r3.get(r12)
            r5.put(r12, r13)
            java.lang.Object r12 = r3.get(r1)
            r5.put(r1, r12)
            java.lang.String r12 = "recIndex"
            java.lang.Object r13 = r3.get(r12)
            r5.put(r12, r13)
            java.lang.String r12 = "exposureParam"
            com.alibaba.fastjson.JSONObject r10 = r10.getJSONObject(r12)
            if (r10 == 0) goto L_0x00eb
            java.lang.String r12 = "arg1"
            java.lang.String r2 = r10.getString(r12)
            java.lang.String r12 = "page"
            java.lang.String r10 = r10.getString(r12)
            r9 = r2
            r2 = r10
            r10 = r9
            goto L_0x00ec
        L_0x00eb:
            r10 = r2
        L_0x00ec:
            tb.gue.a(r2, r10, r6, r11, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.hue.n(com.alibaba.fastjson.JSONObject, android.view.View, int, int):void");
    }

    public static void o(arb arbVar, int i, int i2, List<rm1> list, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4a014a6", new Object[]{arbVar, new Integer(i), new Integer(i2), list, map});
        } else {
            gue.c(arbVar.a(), arbVar.getContainerId(), i, i2, list, map);
        }
    }

    public static void p(arb arbVar, int i, int i2, List<rm1> list, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("421d4a6d", new Object[]{arbVar, new Integer(i), new Integer(i2), list, map});
        } else {
            gue.d(arbVar.a(), arbVar.getContainerId(), i, i2, list, map);
        }
    }

    public static void q(arb arbVar, int i, int i2, List<rm1> list, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b853080d", new Object[]{arbVar, new Integer(i), new Integer(i2), list, map});
        } else {
            gue.e(arbVar.a(), arbVar.getContainerId(), i, i2, list, map);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x014e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m(com.alibaba.fastjson.JSONObject r21, android.view.View r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 393
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.hue.m(com.alibaba.fastjson.JSONObject, android.view.View, int, int):void");
    }
}
