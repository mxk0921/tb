package com.alipay.android.app.pay;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.alipay.android.app.pay.PayTask;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.alipay.android.msp.model.BizContext;
import com.alipay.android.msp.model.H5PayCallback;
import com.alipay.android.msp.model.H5PayResultModel;
import com.alipay.android.msp.model.H5PayUtil;
import com.alipay.android.msp.model.TaobaoModel;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class H5PayInterceptor {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final PayTask f3477a;
    public final Activity b;
    public H5PayCallback c;
    public TaobaoModel d = null;
    public final PayTask.OnPayListener e;

    public H5PayInterceptor(Activity activity) {
        PayTask.OnPayListener onPayListener = new PayTask.OnPayListener() { // from class: com.alipay.android.app.pay.H5PayInterceptor.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alipay.android.app.pay.PayTask.OnPayListener
            public void onPayFailed(Context context, String str, String str2, String str3) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("50907699", new Object[]{this, context, str, str2, str3});
                } else {
                    H5PayInterceptor.access$000(H5PayInterceptor.this, str, str2, str3);
                }
            }

            @Override // com.alipay.android.app.pay.PayTask.OnPayListener
            public void onPaySuccess(Context context, String str, String str2, String str3) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("9a71bc85", new Object[]{this, context, str, str2, str3});
                } else {
                    H5PayInterceptor.access$000(H5PayInterceptor.this, str, str2, str3);
                }
            }
        };
        this.b = activity;
        this.f3477a = new PayTask(activity, onPayListener);
    }

    public static final String a(String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a51c09c9", new Object[]{strArr});
        }
        if (strArr == null) {
            return "";
        }
        for (String str : strArr) {
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
        }
        return "";
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00b5 A[Catch: all -> 0x0040, TRY_LEAVE, TryCatch #2 {, blocks: (B:4:0x0007, B:6:0x000d, B:10:0x0023, B:12:0x0029, B:14:0x0036, B:17:0x0043, B:19:0x0055, B:22:0x0091, B:24:0x009a, B:26:0x00a3, B:28:0x00b5, B:31:0x00f1, B:33:0x00fa, B:35:0x0103, B:37:0x010b, B:39:0x0113, B:44:0x0158, B:46:0x0168, B:48:0x0176, B:50:0x0195, B:52:0x01c4, B:55:0x01d5, B:57:0x01db, B:59:0x01ea, B:62:0x01fc, B:67:0x0227, B:70:0x028f, B:72:0x0298, B:75:0x02c4, B:77:0x02d4, B:81:0x0336, B:85:0x0349, B:89:0x035c, B:91:0x039a, B:93:0x03a0, B:95:0x03a6, B:41:0x0125), top: B:103:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized java.lang.String fetchOrderInfoFromH5PayUrl(java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 1038
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.app.pay.H5PayInterceptor.fetchOrderInfoFromH5PayUrl(java.lang.String):java.lang.String");
    }

    public synchronized boolean payInterceptorWithUrl(String str, H5PayCallback h5PayCallback, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e2add0fb", new Object[]{this, str, h5PayCallback, map})).booleanValue();
        }
        this.c = h5PayCallback;
        String fetchOrderInfoFromH5PayUrl = fetchOrderInfoFromH5PayUrl(str);
        if (!TextUtils.isEmpty(fetchOrderInfoFromH5PayUrl)) {
            String format = new BizContext(this.b).format(fetchOrderInfoFromH5PayUrl);
            JSONObject jSONObject = new JSONObject();
            if (map != null && map.size() > 0) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    jSONObject.put(entry.getKey(), entry.getValue());
                }
            }
            try {
                jSONObject.put(MspGlobalDefine.INVOKE_FROM_SOURCE_KEY, MspGlobalDefine.H5_PAGE);
                jSONObject.put(MspGlobalDefine.INVOKE_FROM_API_KEY, MspGlobalDefine.H5_TO_NATIVE);
            } catch (Exception e) {
                LogUtil.printExceptionStackTrace(e);
            }
            this.f3477a.pay(format, jSONObject.toString(), "");
        }
        return !TextUtils.isEmpty(fetchOrderInfoFromH5PayUrl);
    }

    public static /* synthetic */ void access$000(H5PayInterceptor h5PayInterceptor, String str, String str2, String str3) {
        String str4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee2446b2", new Object[]{h5PayInterceptor, str, str2, str3});
            return;
        }
        LogUtil.record(1, "H5PayInterceptor", "h5Pay : " + str + " " + str2 + " " + str3);
        H5PayResultModel h5PayResultModel = new H5PayResultModel();
        try {
            String[] split = str3.split(";");
            HashMap hashMap = new HashMap();
            hashMap.put("resultStatus", str);
            hashMap.put("result", str3);
            hashMap.put("memo", str2);
            for (String str5 : split) {
                int indexOf = str5.indexOf("={");
                if (indexOf >= 0) {
                    String substring = str5.substring(0, indexOf);
                    hashMap.put(substring, H5PayUtil.getValue(str5, substring));
                }
            }
            if (hashMap.containsKey("resultStatus")) {
                h5PayResultModel.setResultCode((String) hashMap.get("resultStatus"));
            }
            boolean equals = "9000".equals(hashMap.get("resultStatus"));
            String str6 = (String) hashMap.get("result");
            TaobaoModel taobaoModel = h5PayInterceptor.d;
            String str7 = "";
            a(taobaoModel != null ? taobaoModel.getPayOrderId() : str7, taobaoModel != null ? taobaoModel.getTradeNo() : str7);
            if (hashMap.containsKey("callBackUrl")) {
                str7 = (String) hashMap.get("callBackUrl");
            } else {
                if (str6.length() > 15) {
                    String a2 = a(H5PayUtil.subString("&callBackUrl=\"", "\"", str6), H5PayUtil.subString("&call_back_url=\"", "\"", str6), H5PayUtil.subString("&return_url=\"", "\"", str6), URLDecoder.decode(H5PayUtil.subString("&return_url=", "&", str6), "utf-8"), URLDecoder.decode(H5PayUtil.subString("&callBackUrl=", "&", str6), "utf-8"), H5PayUtil.subString("call_back_url=\"", "\"", str6));
                    if (!TextUtils.isEmpty(a2)) {
                        str7 = a2;
                    }
                }
                if (taobaoModel != null) {
                    if (equals) {
                        str4 = taobaoModel.getReturnUrl();
                    } else {
                        str4 = taobaoModel.getShowUrl();
                    }
                    if (!TextUtils.isEmpty(str4)) {
                        str7 = str4;
                    }
                }
                if (taobaoModel != null) {
                    str7 = H5PayUtil.TAOBAO_BACK_URL;
                }
            }
            h5PayResultModel.setReturnUrl(str7);
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
        h5PayInterceptor.c.onPayResult(h5PayResultModel);
    }
}
