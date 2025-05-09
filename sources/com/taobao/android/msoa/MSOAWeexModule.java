package com.taobao.android.msoa;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.msoa.annotation.MSOAServiceDefinition;
import com.taobao.android.msoa.callback.MSOAServiceListener;
import com.taobao.android.msoa.util.ClientSKUUtils;
import com.taobao.weex.WXSDKEngine;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.common.WXModule;
import com.taobao.weex.common.WXModuleAnno;
import java.util.HashMap;
import java.util.Map;
import tb.rrh;
import tb.urh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class MSOAWeexModule extends WXModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MSOA_WEEX_MODULE_NAME = "MSOA";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements MSOAServiceListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f9002a;

        public a(String str) {
            this.f9002a = str;
        }

        @Override // com.taobao.android.msoa.callback.MSOAServiceListener
        public void onFail(String str, String str2, boolean z, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("684c28e9", new Object[]{this, str, str2, new Boolean(z), map});
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("errorCode", str);
            hashMap.put("errorMsg", str2);
            hashMap.put("isMSOAFail", Boolean.valueOf(z));
            WXSDKInstance wXSDKInstance = MSOAWeexModule.this.mWXSDKInstance;
            if (wXSDKInstance != null) {
                WXSDKEngine.callback(wXSDKInstance.N(), this.f9002a, hashMap);
            }
        }

        @Override // com.taobao.android.msoa.callback.MSOAServiceListener
        public void onSuccess(Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("93e51c7a", new Object[]{this, map});
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("data", new JSONObject(map).toJSONString());
            WXSDKInstance wXSDKInstance = MSOAWeexModule.this.mWXSDKInstance;
            if (wXSDKInstance != null) {
                WXSDKEngine.callback(wXSDKInstance.N(), this.f9002a, hashMap);
            }
        }
    }

    public static /* synthetic */ Object ipc$super(MSOAWeexModule mSOAWeexModule, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/msoa/MSOAWeexModule");
    }

    @WXModuleAnno
    public void requestService(String str, String str2) {
        HashMap hashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad2de141", new Object[]{this, str, str2});
            return;
        }
        JSONObject parseObject = JSON.parseObject(str);
        if (parseObject != null) {
            String string = parseObject.getString("serviceId");
            String string2 = parseObject.getString("version");
            String string3 = parseObject.getString("sceneName");
            JSONObject parseObject2 = JSON.parseObject(parseObject.getString("params"));
            if (parseObject2 != null) {
                hashMap = new HashMap();
                for (Map.Entry<String, Object> entry : parseObject2.entrySet()) {
                    hashMap.put(entry.getKey(), entry.getValue());
                }
            } else {
                hashMap = null;
            }
            hashMap.put("MSOA_START_UPTIME", Long.valueOf(System.currentTimeMillis()));
            ClientSKUUtils.a g = ClientSKUUtils.g(string, string2, hashMap);
            String str3 = g.f9006a;
            Map<String, Object> a2 = ClientSKUUtils.a(g.b, parseObject);
            ClientSKUUtils.b(string, a2, this.mWXSDKInstance);
            rrh.e().n(new urh(string, str3, "msoa.taobao.privilege.weex", string3, a2, MSOAServiceDefinition.Platform.WEEX.value()), new a(str2));
            return;
        }
        HashMap hashMap2 = new HashMap();
        hashMap2.put("errorCode", "msoa_error_invalid_param");
        hashMap2.put("errorMsg", "invalid parameter");
        hashMap2.put("isMSOAFail", Boolean.TRUE);
        WXSDKInstance wXSDKInstance = this.mWXSDKInstance;
        if (wXSDKInstance != null) {
            WXSDKEngine.callback(wXSDKInstance.N(), str2, hashMap2);
        }
    }
}
