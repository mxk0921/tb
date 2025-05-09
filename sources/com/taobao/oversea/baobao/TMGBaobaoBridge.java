package com.taobao.oversea.baobao;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.webview.IWVWebView;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import tb.kpw;
import tb.nsw;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class TMGBaobaoBridge extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String DETAIL_CODE_KEY = "detailBizCountry";
    public static final Map<String, WeakReference<IWVWebView>> mWebViewMap = new HashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a extends TypeReference<HashMap<String, String>> {
        public a(TMGBaobaoBridge tMGBaobaoBridge) {
        }
    }

    public static /* synthetic */ Object ipc$super(TMGBaobaoBridge tMGBaobaoBridge, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/oversea/baobao/TMGBaobaoBridge");
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if ("initBaobaoManager".equals(str)) {
            try {
                mWebViewMap.put(String.valueOf(wVCallBackContext.getWebview().hashCode()), new WeakReference<>(wVCallBackContext.getWebview()));
                if (BaobaoManager.getInstance().init()) {
                    HashMap<String, Object> paramsCacheAndRefreshData = BaobaoManager.getInstance().getParamsCacheAndRefreshData();
                    nsw nswVar = new nsw();
                    JSONObject jSONObject = new JSONObject();
                    for (String str3 : paramsCacheAndRefreshData.keySet()) {
                        jSONObject.put(str3, String.valueOf(paramsCacheAndRefreshData.get(str3)));
                    }
                    nswVar.h(jSONObject);
                    Map map = (Map) JSON.parseObject(str2, new a(this), new Feature[0]);
                    if (map.get(DETAIL_CODE_KEY) != null) {
                        BaobaoManager.sDetail_Edition_Code = (String) map.get(DETAIL_CODE_KEY);
                    }
                    nswVar.k();
                    wVCallBackContext.success(nswVar);
                } else {
                    wVCallBackContext.error(nsw.RET_FAIL);
                }
                return true;
            } catch (Exception unused) {
                wVCallBackContext.error(nsw.RET_FAIL);
            }
        }
        return false;
    }
}
