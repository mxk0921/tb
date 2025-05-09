package com.taobao.taobao.scancode.gateway.OpenlinkBizQrCodeMapping;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import java.util.regex.Pattern;
import mtopsdk.mtop.common.MtopListener;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.IMTOPDataObject;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopResponse;
import org.json.JSONArray;
import org.json.JSONObject;
import tb.e9;
import tb.ey3;
import tb.h1p;
import tb.t2o;
import tb.y7t;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class UrlRouter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface a {
        void onFailed(String str);

        void onSuccess(String str);
    }

    static {
        t2o.a(760217681);
    }

    public static void b(final String str, final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a331bed5", new Object[]{str, aVar});
            return;
        }
        ey3.g().h("Open_link_biz_intercepted_url");
        MtopTaobaoOpenlinkBizQrCodeMappingRequest mtopTaobaoOpenlinkBizQrCodeMappingRequest = new MtopTaobaoOpenlinkBizQrCodeMappingRequest();
        mtopTaobaoOpenlinkBizQrCodeMappingRequest.setOriginUrl(str);
        RemoteBusiness build = RemoteBusiness.build((IMTOPDataObject) mtopTaobaoOpenlinkBizQrCodeMappingRequest);
        build.reqMethod(MethodEnum.POST);
        build.addListener((MtopListener) new IRemoteBaseListener() { // from class: com.taobao.taobao.scancode.gateway.OpenlinkBizQrCodeMapping.UrlRouter.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                y7t.a("UrlRouter", "onError");
                a aVar2 = a.this;
                if (aVar2 != null) {
                    try {
                        aVar2.onFailed(str);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                    return;
                }
                y7t.a("UrlRouter", "onSuccess");
                if (mtopResponse != null) {
                    try {
                        String string = mtopResponse.getDataJsonObject().getString("result");
                        if (!TextUtils.isEmpty(string) && a.this != null) {
                            try {
                                y7t.a("UrlRouter", "onSuccess result url:" + string);
                                a.this.onSuccess(string);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    } catch (Exception e2) {
                        e2.printStackTrace();
                        a aVar2 = a.this;
                        if (aVar2 != null) {
                            try {
                                aVar2.onFailed(str);
                            } catch (Exception e3) {
                                e3.printStackTrace();
                            }
                        }
                    }
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                y7t.a("UrlRouter", "onSystemError");
                a aVar2 = a.this;
                if (aVar2 != null) {
                    try {
                        aVar2.onFailed(str);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        build.startRequest();
    }

    public static boolean a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7304b825", new Object[]{str, str2, str3})).booleanValue();
        }
        try {
            y7t.a("UrlRouter", "calculateIntercept origin url：" + str3 + "\nmatchPattern:" + str + "  matchContent:" + str2);
            String lowerCase = str3.toLowerCase();
            if (lowerCase.startsWith(h1p.HTTP_PREFIX)) {
                str3 = str3.substring(7);
            }
            if (lowerCase.startsWith(h1p.HTTPS_PREFIX)) {
                str3 = str3.substring(8);
            }
            y7t.a("UrlRouter", "calculateIntercept http/https removed: " + str3);
            if (str.equalsIgnoreCase("prefix")) {
                if (str3.startsWith(str2)) {
                    return true;
                }
            } else if (str.equalsIgnoreCase("regex")) {
                return Pattern.compile(str2).matcher(str3).find();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public static boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3d155a61", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        y7t.a("UrlRouter", "needIntercept origin url:" + str);
        String customConfig = OrangeConfig.getInstance().getCustomConfig("scan_qr_code_android", "");
        if (!TextUtils.isEmpty(customConfig)) {
            try {
                y7t.a("UrlRouter", "needIntercept orange config:" + customConfig);
                JSONObject jSONObject = new JSONObject(customConfig.trim());
                if (jSONObject.has("InterceptUrls")) {
                    JSONArray jSONArray = jSONObject.getJSONArray("InterceptUrls");
                    y7t.a("UrlRouter", "needIntercept orange config InterceptUrls:" + jSONArray.toString());
                    for (int i = 0; i < jSONArray.length(); i++) {
                        JSONObject jSONObject2 = new JSONObject(jSONArray.getString(i));
                        String string = jSONObject2.getString("matchPattern");
                        String string2 = jSONObject2.getString(e9.TAK_ABILITY_MATCH_CONTENT);
                        if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
                            boolean a2 = a(string, string2, str);
                            y7t.a("UrlRouter", "--- needIntercept:--- " + a2);
                            if (a2) {
                                return true;
                            }
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }
}
