package com.taobao.android.behavix;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavix.service.BUFS;
import com.taobao.tao.log.TLog;
import java.util.Map;
import tb.cqv;
import tb.kpw;
import tb.nsw;
import tb.om1;
import tb.oxa;
import tb.pz3;
import tb.q82;
import tb.t2o;
import tb.u6a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class UserActionBridge extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(404750454);
    }

    private static boolean a(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cebe5e73", new Object[]{str, wVCallBackContext})).booleanValue();
        }
        try {
            JSONObject parseObject = JSON.parseObject(str);
            String string = parseObject.getString("scene");
            parseObject.getString("bizId");
            JSONArray jSONArray = parseObject.getJSONArray("actionTypes");
            JSONArray jSONArray2 = parseObject.getJSONArray("actionNames");
            if (parseObject.getInteger("backwardSteps") != null) {
                parseObject.getInteger("backwardSteps").intValue();
            }
            parseObject.getString("backwardScene");
            parseObject.getString("backwardBizId");
            if (parseObject.get("limitCount") != null) {
                parseObject.getInteger("limitCount").intValue();
            }
            if (parseObject.get("startTimestamp") != null) {
                parseObject.getLongValue("startTimestamp");
            }
            if (parseObject.get("endTimestamp") != null) {
                parseObject.getLongValue("endTimestamp");
            }
            if (parseObject.get("actionLimitCount") != null) {
                parseObject.getInteger("actionLimitCount").intValue();
            }
            nsw nswVar = new nsw();
            if (TextUtils.isEmpty(string)) {
                nswVar.j("HY_PARAM_ERR");
                wVCallBackContext.error(nswVar);
                return false;
            }
            if (jSONArray != null && jSONArray.size() > 0) {
                String[] strArr = (String[]) jSONArray.toArray(new String[jSONArray.size()]);
            }
            if (jSONArray2 != null && jSONArray2.size() > 0) {
                String[] strArr2 = (String[]) jSONArray2.toArray(new String[jSONArray2.size()]);
            }
            return true;
        } catch (Exception e) {
            TLog.loge("behavix_track", "UserActionBridge", "getUserPageViewActions Exception " + e.getMessage());
            wVCallBackContext.error();
            q82.f("JSGetUserPageViewActionsException", null, null, e);
            return false;
        }
    }

    private static boolean b(String str, Object obj, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c06c0c50", new Object[]{str, obj, wVCallBackContext})).booleanValue() : a(1, str, obj, wVCallBackContext);
    }

    private static boolean d(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("69c8deb6", new Object[]{str, wVCallBackContext})).booleanValue();
        }
        return a(0, str, wVCallBackContext);
    }

    private static boolean e(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9d770977", new Object[]{str, wVCallBackContext})).booleanValue();
        }
        return a(1, str, wVCallBackContext);
    }

    private static boolean g(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4d35ef9", new Object[]{str, wVCallBackContext})).booleanValue();
        }
        return b(1, str, wVCallBackContext);
    }

    public static /* synthetic */ Object ipc$super(UserActionBridge userActionBridge, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/behavix/UserActionBridge");
    }

    private static boolean b(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("26c8934", new Object[]{str, wVCallBackContext})).booleanValue();
        }
        try {
            JSONObject parseObject = JSON.parseObject(str);
            String string = parseObject.getString("scene");
            String string2 = parseObject.getString("bizId");
            String string3 = parseObject.getString("bizArgs");
            String string4 = parseObject.getString("actionArgs");
            String string5 = parseObject.getString("actionName");
            nsw nswVar = new nsw();
            if (TextUtils.isEmpty(string)) {
                nswVar.j("HY_PARAM_ERR");
                wVCallBackContext.error(nswVar);
                return false;
            }
            cqv.u(string, string5, string4, string2, "BehaviX_Source=JS", string3);
            wVCallBackContext.success();
            return true;
        } catch (Exception e) {
            TLog.loge("behavix_track", "UserActionBridge", "commitTap Exception " + e.getMessage());
            wVCallBackContext.error();
            q82.f("JSCommitTapException", null, null, e);
            return false;
        }
    }

    private static boolean f(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d1253438", new Object[]{str, wVCallBackContext})).booleanValue();
        }
        return b(0, str, wVCallBackContext);
    }

    private static boolean i(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2fb47b", new Object[]{str, wVCallBackContext})).booleanValue();
        }
        nsw nswVar = new nsw();
        String t = u6a.t();
        JSONObject jSONObject = new JSONObject();
        if (TextUtils.isEmpty(t)) {
            t = "";
        }
        jSONObject.put("slideHands", (Object) t);
        nswVar.b("data", jSONObject.toJSONString());
        wVCallBackContext.success(nswVar);
        return true;
    }

    private static boolean j(String str, WVCallBackContext wVCallBackContext) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9fdddf3c", new Object[]{str, wVCallBackContext})).booleanValue();
        }
        nsw nswVar = new nsw();
        om1 om1Var = new om1();
        try {
            JSONObject parseObject = JSON.parseObject(str);
            if (parseObject != null) {
                if (parseObject.containsKey("x")) {
                    om1Var.f25484a = parseObject.getFloatValue("x");
                }
                if (parseObject.containsKey("y")) {
                    om1Var.b = parseObject.getFloatValue("y");
                }
                if (parseObject.containsKey("w")) {
                    om1Var.c = parseObject.getFloatValue("w");
                }
                if (parseObject.containsKey("h")) {
                    om1Var.d = parseObject.getFloatValue("h");
                }
            }
        } catch (Exception e) {
            TLog.loge("UserActionBridge", Log.getStackTraceString(e));
        }
        Map<String, String> v = u6a.v(om1Var);
        if (pz3.b(v)) {
            str2 = "";
        } else {
            str2 = JSON.toJSONString(v);
        }
        nswVar.b("data", str2);
        wVCallBackContext.success(nswVar);
        return true;
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if ("getUserPageViewActions".equals(str)) {
            return a(str2, wVCallBackContext);
        }
        if ("commitEnter".equals(str)) {
            return a(str2, this.mContext, wVCallBackContext);
        }
        if ("commitLeave".equals(str)) {
            return b(str2, this.mContext, wVCallBackContext);
        }
        if ("commitTap".equals(str)) {
            return b(str2, wVCallBackContext);
        }
        if ("commitRequest".equals(str)) {
            return c(str2, wVCallBackContext);
        }
        if ("trackScrollStart".equals(str)) {
            return d(str2, wVCallBackContext);
        }
        if ("trackScrollEnd".equals(str)) {
            return e(str2, wVCallBackContext);
        }
        if ("trackAppear".equals(str)) {
            return f(str2, wVCallBackContext);
        }
        if ("trackDisappear".equals(str)) {
            return g(str2, wVCallBackContext);
        }
        if ("uploadHighway".equals(str)) {
            return h(str2, wVCallBackContext);
        }
        if ("getFeature".equals(str)) {
            return k(str2, wVCallBackContext);
        }
        if ("getSlideGestureHands".equals(str)) {
            return i(str2, wVCallBackContext);
        }
        if ("getSlideGestureHandsInfo".equals(str)) {
            return j(str2, wVCallBackContext);
        }
        return false;
    }

    private static boolean c(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("361ab3f5", new Object[]{str, wVCallBackContext})).booleanValue();
        }
        try {
            JSONObject parseObject = JSON.parseObject(str);
            String string = parseObject.getString("scene");
            String string2 = parseObject.getString("requestId");
            String string3 = parseObject.getString("bizArgs");
            String string4 = parseObject.getString("actionName");
            nsw nswVar = new nsw();
            if (TextUtils.isEmpty(string)) {
                nswVar.j("HY_PARAM_ERR");
                wVCallBackContext.error(nswVar);
                return false;
            }
            cqv.s(string, string4, string2, "BehaviX_Source=JS", string3);
            wVCallBackContext.success();
            return true;
        } catch (Exception e) {
            TLog.loge("behavix_track", "UserActionBridge", "commitRequest Exception " + e.getMessage());
            wVCallBackContext.error();
            q82.f("JSCommitRequestException", null, null, e);
            return false;
        }
    }

    private static boolean h(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("388189ba", new Object[]{str, wVCallBackContext})).booleanValue();
        }
        try {
            JSONObject parseObject = JSON.parseObject(str);
            boolean booleanValue = parseObject.getBooleanValue("isBatch");
            nsw nswVar = new nsw();
            if (booleanValue) {
                String string = parseObject.getString("scene");
                if (TextUtils.isEmpty(string)) {
                    nswVar.j("HY_PARAM_ERR");
                    wVCallBackContext.error(nswVar);
                    return false;
                }
                oxa.a().c(string);
                wVCallBackContext.success();
            } else {
                String string2 = parseObject.getString("topic");
                JSONObject jSONObject = parseObject.getJSONObject("topicParam");
                if (!TextUtils.isEmpty(string2) && jSONObject != null) {
                    oxa.a().b(string2, new org.json.JSONObject(jSONObject));
                    wVCallBackContext.success();
                }
                nswVar.j("HY_PARAM_ERR");
                wVCallBackContext.error(nswVar);
                return false;
            }
            return true;
        } catch (Exception e) {
            TLog.loge("behavix_track", "UserActionBridge", "uploadHighway Exception " + e.getMessage());
            wVCallBackContext.error();
            q82.f("uploadHighway", null, null, e);
            return false;
        }
    }

    private static boolean k(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d38c09fd", new Object[]{str, wVCallBackContext})).booleanValue();
        }
        try {
            JSONObject parseObject = JSON.parseObject(str);
            JSONObject jSONObject = parseObject.getJSONObject("queryArgs");
            String string = parseObject.getString("invokeId");
            String string2 = parseObject.getString("bizIdentifier");
            String string3 = parseObject.getString("currentScene");
            nsw nswVar = new nsw();
            if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2) && !TextUtils.isEmpty(string3)) {
                BUFS.QueryArgs queryArgs = new BUFS.QueryArgs();
                if (jSONObject != null) {
                    for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                        queryArgs.setQueryArgsKV(entry.getKey(), entry.getValue());
                    }
                }
                String feature = BUFS.getFeature(queryArgs, string, string2, string3);
                if (feature == null) {
                    feature = "";
                }
                nswVar.b("data", feature);
                wVCallBackContext.success(nswVar);
                return true;
            }
            nswVar.j("HY_PARAM_ERR");
            wVCallBackContext.error(nswVar);
            return false;
        } catch (Throwable th) {
            wVCallBackContext.error();
            q82.f("getFeatureThrowable", null, null, th);
            return false;
        }
    }

    private static boolean b(int i, String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9ce28c5", new Object[]{new Integer(i), str, wVCallBackContext})).booleanValue();
        }
        try {
            JSONObject parseObject = JSON.parseObject(str);
            String string = parseObject.getString("scene");
            String string2 = parseObject.getString("actionName");
            String string3 = parseObject.getString("bizId");
            String string4 = parseObject.getString("bizArgs");
            nsw nswVar = new nsw();
            if (TextUtils.isEmpty(string)) {
                nswVar.j("HY_PARAM_ERR");
                wVCallBackContext.error(nswVar);
                return false;
            }
            String[] strArr = {"BehaviX_Source=JS", string4};
            if (i == 0) {
                cqv.A(string, string2, string3, null, strArr);
            } else if (1 == i) {
                cqv.C(string, string2, string3, null, strArr);
            }
            wVCallBackContext.success();
            return true;
        } catch (Exception e) {
            TLog.loge("behavix_track", "UserActionBridge", "Exception " + e.getMessage());
            wVCallBackContext.error();
            q82.f("JSTrackExposeException", null, null, e);
            return false;
        }
    }

    private static boolean a(String str, Object obj, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("dac0afcf", new Object[]{str, obj, wVCallBackContext})).booleanValue() : a(0, str, obj, wVCallBackContext);
    }

    private static boolean a(int i, String str, Object obj, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("62051602", new Object[]{new Integer(i), str, obj, wVCallBackContext})).booleanValue();
        }
        try {
            JSONObject parseObject = JSON.parseObject(str);
            String string = parseObject.getString("scene");
            String string2 = parseObject.getString("bizId");
            String string3 = parseObject.getString("bizArgs");
            String string4 = parseObject.getString("requestId");
            nsw nswVar = new nsw();
            if (TextUtils.isEmpty(string)) {
                nswVar.j("HY_PARAM_ERR");
                wVCallBackContext.error(nswVar);
                return false;
            }
            String[] strArr = {"BehaviX_Source=JS", string3};
            if (i == 0) {
                cqv.l(string, string2, obj, strArr);
            } else if (i == 1) {
                cqv.o(string, string2, string4, obj, strArr);
            }
            wVCallBackContext.success();
            return true;
        } catch (Exception e) {
            TLog.loge("behavix_track", "UserActionBridge", "Exception " + e.getMessage());
            wVCallBackContext.error();
            q82.f("JSCommitPageException" + i, null, null, e);
            return false;
        }
    }

    private static boolean a(int i, String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("97b6fb66", new Object[]{new Integer(i), str, wVCallBackContext})).booleanValue();
        }
        try {
            JSONObject parseObject = JSON.parseObject(str);
            String string = parseObject.getString("scene");
            String string2 = parseObject.getString("actionName");
            int intValue = parseObject.getInteger("currentOffsetX") == null ? 0 : parseObject.getInteger("currentOffsetX").intValue();
            int intValue2 = parseObject.getInteger("currentOffsetY") == null ? 0 : parseObject.getInteger("currentOffsetY").intValue();
            String string3 = parseObject.getString("bizArgs");
            nsw nswVar = new nsw();
            if (TextUtils.isEmpty(string)) {
                nswVar.j("HY_PARAM_ERR");
                wVCallBackContext.error(nswVar);
                return false;
            }
            String[] strArr = {"BehaviX_Source=JS", string3};
            if (i == 0) {
                cqv.K(string, string2, intValue, intValue2, strArr);
            } else if (1 == i) {
                cqv.G(string, string2, intValue, intValue2, strArr);
            }
            wVCallBackContext.success();
            return true;
        } catch (Exception e) {
            TLog.loge("behavix_track", "UserActionBridge", "Exception " + e.getMessage());
            wVCallBackContext.error();
            q82.f("JSTrackScrollException", null, null, e);
            return false;
        }
    }
}
