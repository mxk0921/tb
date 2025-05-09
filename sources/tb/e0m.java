package tb;

import android.text.TextUtils;
import com.alibaba.ariver.resource.api.models.PermissionModel;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.metaInfo.TMSMetaInfoWrapper;
import com.taobao.themis.open.permission.check.PermissionResult;
import com.taobao.themis.open.permission.check.TMSPermissionManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class e0m {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final e0m INSTANCE = new e0m();
    public static final String TAG = "PermissionUtils";

    static {
        t2o.a(843055378);
    }

    public final h11 a(PermissionModel permissionModel) {
        JSONArray jSONArray;
        Set<String> keySet;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h11) ipChange.ipc$dispatch("e79d4190", new Object[]{this, permissionModel});
        }
        ckf.g(permissionModel, "permissionModel");
        h11 h11Var = new h11();
        h11Var.b().put(h11.ENABLE_PROXY, permissionModel.getEnableProxy());
        h11Var.b().put(h11.FORCE_USE_SSL, permissionModel.getForceUseSsl());
        Map<String, List<String>> a2 = h11Var.a();
        Set<String> jsapiList = permissionModel.getJsapiList();
        List<String> list = null;
        a2.put(h11.JS_API_LIST, jsapiList == null ? null : i04.E0(jsapiList));
        Map<String, List<String>> a3 = h11Var.a();
        Set<String> eventList = permissionModel.getEventList();
        a3.put(h11.EVENT_LIST, eventList == null ? null : i04.E0(eventList));
        Map<String, List<String>> a4 = h11Var.a();
        Set<String> validDomains = permissionModel.getValidDomains();
        a4.put(h11.VALID_DOMAIN, validDomains == null ? null : i04.E0(validDomains));
        Map<String, List<String>> a5 = h11Var.a();
        Set<String> validSubResMimeList = permissionModel.getValidSubResMimeList();
        a5.put(h11.VALID_SUB_RES_MIME_LIST, validSubResMimeList == null ? null : i04.E0(validSubResMimeList));
        Map<String, List<String>> a6 = h11Var.a();
        Set<String> httpLinkSubResMimeList = permissionModel.getHttpLinkSubResMimeList();
        if (httpLinkSubResMimeList != null) {
            list = i04.E0(httpLinkSubResMimeList);
        }
        a6.put(h11.HTTP_LINK_SUB_RES_MIME_LIST, list);
        JSONObject specialConfigs = permissionModel.getSpecialConfigs();
        if (!(specialConfigs == null || (keySet = specialConfigs.keySet()) == null)) {
            for (String str : keySet) {
                JSONObject jSONObject = permissionModel.getSpecialConfigs().getJSONObject(str);
                if (jSONObject != null) {
                    ArrayList arrayList = new ArrayList();
                    Set<String> keySet2 = jSONObject.keySet();
                    ckf.f(keySet2, "spValue.keys");
                    for (String str2 : keySet2) {
                        arrayList.add(str2);
                        ArrayList arrayList2 = new ArrayList();
                        JSONArray jSONArray2 = jSONObject.getJSONArray(str2);
                        if (jSONArray2 != null) {
                            for (Object obj : jSONArray2) {
                                if (obj != null) {
                                    arrayList2.add((String) obj);
                                } else {
                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                                }
                            }
                            continue;
                        }
                        Map<String, List<String>> a7 = h11Var.a();
                        a7.put("JSAPI_SP_Config_" + ((Object) str) + '_' + ((Object) str2), arrayList2);
                    }
                    h11Var.a().put(ckf.p("JSAPI_SP_Config_", str), arrayList);
                }
            }
        }
        JSONObject webviewConfigs = permissionModel.getWebviewConfigs();
        if (!(webviewConfigs == null || (jSONArray = webviewConfigs.getJSONArray(h11.ALLOWED_DOMAIN)) == null)) {
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : jSONArray) {
                if (obj2 != null) {
                    arrayList3.add((String) obj2);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
            }
            h11Var.a().put("Webview_Config_allowedDomain", arrayList3);
        }
        return h11Var;
    }

    public final boolean c(bbs bbsVar) {
        TMSMetaInfoWrapper U;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5cc0b0f9", new Object[]{this, bbsVar})).booleanValue();
        }
        Boolean bool = null;
        if (!(bbsVar == null || (U = bbsVar.U()) == null)) {
            bool = Boolean.valueOf(U.u());
        }
        if (bool == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public final PermissionResult b(bbs bbsVar, h11 h11Var, String str, String str2) {
        Matcher matcher;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PermissionResult) ipChange.ipc$dispatch("656ef917", new Object[]{this, bbsVar, h11Var, str, str2});
        }
        ckf.g(h11Var, "apiPermissionInfo");
        ckf.g(str, "checkKey");
        ckf.g(str2, "checkValue");
        TMSLogger.a(TMSPermissionManager.TAG, "checkPermission, key: " + str + ", value: " + str2);
        if (bbsVar != null && r8s.C(bbsVar)) {
            return PermissionResult.IGNORE;
        }
        if (TextUtils.equals(str, h11.VALID_SUB_RES_MIME_LIST) || tsq.I(str, h11.JS_API_SP_CONFIG, false, 2, null) || TextUtils.equals(str, h11.EVENT_LIST) || TextUtils.equals(str, h11.HTTP_LINK_SUB_RES_MIME_LIST) || tsq.I(str, h11.WEB_VIEW_CONFIG, false, 2, null) || TextUtils.equals(str, h11.VALID_DOMAIN)) {
            List<String> list = h11Var.a().get(str);
            if (list != null) {
                for (String str3 : list) {
                    try {
                        Pattern a2 = kvl.INSTANCE.a(str3 == null ? null : wsq.Q0(str3).toString());
                        if (!(a2 == null || (matcher = a2.matcher(str2)) == null || !matcher.find())) {
                            TMSLogger.a(TMSPermissionManager.TAG, "checkPermission match regex, ignore");
                            return PermissionResult.IGNORE;
                        }
                    } catch (Throwable th) {
                        TMSLogger.c(TAG, "", th);
                    }
                }
            }
            TMSLogger.a(TAG, ckf.p(str, " not have permssion ,not match regex"));
            if (TextUtils.equals(str, h11.VALID_SUB_RES_MIME_LIST)) {
                return PermissionResult.DENY_N22105;
            }
            if (tsq.I(str, h11.JS_API_SP_CONFIG, false, 2, null)) {
                return PermissionResult.DENY_N22106;
            }
            if (TextUtils.equals(str, h11.EVENT_LIST)) {
                return PermissionResult.DENY_N22107;
            }
            if (TextUtils.equals(str, h11.HTTP_LINK_SUB_RES_MIME_LIST)) {
                return PermissionResult.DENY_N22108;
            }
            if (tsq.I(str, h11.WEB_VIEW_CONFIG, false, 2, null)) {
                return PermissionResult.DENY_N22109;
            }
            if (TextUtils.equals(str, h11.VALID_DOMAIN)) {
                return PermissionResult.DENY_N22110;
            }
            return PermissionResult.DENY;
        }
        List<String> list2 = h11Var.a().get(str);
        if (list2 != null && list2.contains(str2)) {
            return PermissionResult.IGNORE;
        }
        TMSLogger.a(TAG, ckf.p(str, " not have permssion"));
        return PermissionResult.DENY_N22104;
    }
}
