package com.alilive.adapter.business;

import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.taobao.android.nav.Nav;
import com.taobao.tao.content.business.ContentBusinessModel;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.xiaomi.mipush.sdk.Constants;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import org.json.JSONException;
import org.json.JSONObject;
import tb.eir;
import tb.gat;
import tb.hjr;
import tb.jbt;
import tb.sjr;
import tb.t2o;
import tb.up6;
import tb.ux9;
import tb.v2s;
import tb.vx9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class BusinessUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DETAIL_REQUEST_CODE = 20000;

    static {
        t2o.a(806354953);
    }

    public static Fragment a(ux9 ux9Var) {
        jbt jbtVar;
        Map<String, Object> map;
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Fragment) ipChange.ipc$dispatch("d6b191eb", new Object[]{ux9Var});
        }
        if (ux9Var.A() == null || (jbtVar = ux9Var.A().taoliveOpenContext) == null || (map = jbtVar.f) == null || (obj = map.get("getJumpFragment")) == null) {
            return null;
        }
        return (Fragment) obj;
    }

    public static Map<String, String> b(String str, Map<String, String> map, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("fc0536bf", new Object[]{str, map, str2});
        }
        if (map == null) {
            map = new HashMap<>();
        }
        JSONObject jSONObject = new JSONObject();
        d(str, jSONObject, str2);
        Iterator<String> keys = jSONObject.keys();
        if (keys != null) {
            while (keys.hasNext()) {
                try {
                    String next = keys.next();
                    map.put(next, jSONObject.getString(next));
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
        return map;
    }

    public static Map<String, String> c(ux9 ux9Var, Map<String, String> map, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("993e69e1", new Object[]{ux9Var, map, str});
        }
        return b(up6.a0(ux9Var), map, str);
    }

    public static JSONObject e(ux9 ux9Var, JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("cf4b7153", new Object[]{ux9Var, jSONObject, str});
        }
        return d(up6.a0(ux9Var), jSONObject, str);
    }

    public static JSONObject f(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b2eda7d1", new Object[]{jSONObject, str});
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (hjr.s() && !TextUtils.isEmpty(str)) {
            try {
                Uri parse = Uri.parse(str);
                List<String> L = hjr.L();
                if (parse != null) {
                    for (String str2 : L) {
                        if (!TextUtils.isEmpty(str2)) {
                            String queryParameter = parse.getQueryParameter(str2);
                            if (!TextUtils.isEmpty(queryParameter)) {
                                jSONObject.put(str2, queryParameter);
                            }
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return jSONObject;
    }

    public static void g(Activity activity, ux9 ux9Var, String str) {
        Fragment fragment;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("472ecfee", new Object[]{activity, ux9Var, str});
        } else if (hjr.x()) {
            if (ux9Var != null) {
                fragment = a(ux9Var);
            } else {
                fragment = null;
            }
            if (fragment != null) {
                Nav.from(activity).withFragment(fragment).forResult(20000).toUri(str);
            } else {
                Nav.from(activity).forResult(20000).toUri(str);
            }
        } else {
            Nav.from(activity).forResult(20000).toUri(str);
        }
    }

    public static void h(Activity activity, BusinessInfo businessInfo) {
        FissionTcpParam fissionTcpParam;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90c5d7db", new Object[]{activity, businessInfo});
        } else if (activity == null || businessInfo == null || (fissionTcpParam = businessInfo.tcp) == null || fissionTcpParam.context == null) {
            eir.a("BusinessUtil", "sampleSkipToGoodsDetail activity = " + activity + " businessInfo = " + businessInfo);
        } else {
            eir.a("BusinessUtil", "sampleSkipToGoodsDetail businessInfo = " + businessInfo);
            String str = businessInfo.mJumpUrl;
            ContentBusinessModel contentBusinessModel = new ContentBusinessModel();
            FissionTcpParam fissionTcpParam2 = businessInfo.tcp;
            contentBusinessModel.itemId = fissionTcpParam2.itemId;
            contentBusinessModel.contentId = fissionTcpParam2.contentId;
            contentBusinessModel.adUserId = fissionTcpParam2.adUserId;
            contentBusinessModel.tcpBid = fissionTcpParam2.tcpBid;
            contentBusinessModel.ct = fissionTcpParam2.ct;
            contentBusinessModel.pageName = fissionTcpParam2.pageName;
            contentBusinessModel.sourceType = fissionTcpParam2.sourceType;
            contentBusinessModel.scenceId = fissionTcpParam2.scenceId;
            contentBusinessModel.actionSource = businessInfo.actionSource;
            JSONObject jSONObject = new JSONObject();
            contentBusinessModel.context = jSONObject;
            try {
                jSONObject.put("actionSource", businessInfo.actionSource);
                if (businessInfo.tcp.context.size() > 0) {
                    for (String str2 : businessInfo.tcp.context.keySet()) {
                        String valueOf = String.valueOf(str2);
                        contentBusinessModel.context.put(valueOf, businessInfo.tcp.context.get(valueOf));
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            contentBusinessModel.dataAttributes = new JSONObject();
            try {
                if (businessInfo.tcp.dataAttributes.size() > 0) {
                    for (String str3 : businessInfo.tcp.dataAttributes.keySet()) {
                        String valueOf2 = String.valueOf(str3);
                        contentBusinessModel.dataAttributes.put(valueOf2, businessInfo.tcp.dataAttributes.get(valueOf2));
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            new gat().e(contentBusinessModel, new IRemoteBaseListener() { // from class: com.alilive.adapter.business.BusinessUtil.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                    }
                }
            });
            sjr.g().e("com.taobao.taolive.room.good_click", contentBusinessModel.itemId);
            HashMap hashMap = new HashMap();
            hashMap.put("url", str);
            hashMap.put("itemId", contentBusinessModel.itemId);
            hashMap.put("contentId", contentBusinessModel.contentId);
            hashMap.put(gat.ACCOUNT_ID, contentBusinessModel.adUserId);
            hashMap.put(gat.TCP_BID, contentBusinessModel.tcpBid);
            hashMap.put(gat.CT, contentBusinessModel.ct);
            hashMap.put("context", contentBusinessModel.context.toString());
            hashMap.put("dataAttributes", contentBusinessModel.dataAttributes.toString());
            hashMap.put("pageName", contentBusinessModel.pageName);
            hashMap.put("sourceType", contentBusinessModel.sourceType);
            hashMap.put("scenceId", contentBusinessModel.scenceId);
            hashMap.put(PushConstants.CLICK_TYPE, businessInfo.clickType);
            hashMap.put("isAD", businessInfo.isAD);
            hashMap.put("channel", businessInfo.channel);
            String str4 = contentBusinessModel.sourceType;
            if (str4 != null) {
                hashMap.put("sourceType", str4);
            }
            v2s.o().E().track4Click("Page_TaobaoLiveWatch", "LiveCpsMonitor", hashMap);
            if (businessInfo.mIsJumpGoodsDetail && !TextUtils.isEmpty(businessInfo.mJumpUrl)) {
                g(activity, vx9.d(), str);
            }
        }
    }

    public static JSONObject d(String str, JSONObject jSONObject, String str2) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("77dfe131", new Object[]{str, jSONObject, str2});
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (hjr.w()) {
            com.alibaba.fastjson.JSONObject jSONObject2 = new com.alibaba.fastjson.JSONObject();
            if (!TextUtils.isEmpty(str) && (split = str.split("&")) != null) {
                int length = split.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    String str3 = split[i];
                    if (str3 != null && str3.startsWith("liveAlgoParams:")) {
                        String replace = str3.replace("liveAlgoParams:", "");
                        if (!TextUtils.isEmpty(replace)) {
                            for (String str4 : replace.split("#")) {
                                String[] split2 = str4.split(Constants.WAVE_SEPARATOR);
                                if (split2 != null && split2.length >= 2) {
                                    jSONObject2.put(split2[0], (Object) split2[1]);
                                }
                            }
                        }
                    }
                    i++;
                }
            }
            for (String str5 : hjr.N()) {
                if (jSONObject2.get(str5) != null) {
                    try {
                        jSONObject.put(str5, jSONObject2.getString(str5));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return !TextUtils.isEmpty(str2) ? f(jSONObject, str2) : jSONObject;
    }
}
