package com.taobao.android.address.wrapper.weex;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.address.wrapper.AddressParams;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.annotation.JSMethod;
import com.taobao.weex.bridge.JSCallback;
import com.taobao.weex.common.WXModule;
import mtopsdk.mtop.upload.domain.UploadConstants;
import tb.ef0;
import tb.gf0;
import tb.sf0;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class WXAddressModule extends WXModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PLUGIN_NAME = "addressModule";
    private String currentSelectType;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements ef0 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ JSCallback f6316a;
        public final /* synthetic */ JSCallback b;

        public a(JSCallback jSCallback, JSCallback jSCallback2) {
            this.f6316a = jSCallback;
            this.b = jSCallback2;
        }

        @Override // tb.ef0
        public void onFail(int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("efca37e9", new Object[]{this, new Integer(i), str});
            } else {
                WXAddressModule.access$000(WXAddressModule.this, this.b);
            }
        }

        @Override // tb.ef0
        public void onSuccess(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("37d948b5", new Object[]{this, str});
            } else if (this.f6316a != null) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("data", (Object) str);
                    this.f6316a.invoke(jSONObject);
                } catch (Exception e) {
                    e.printStackTrace();
                    WXAddressModule.access$000(WXAddressModule.this, this.b);
                }
            }
        }
    }

    public static /* synthetic */ void access$000(WXAddressModule wXAddressModule, JSCallback jSCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("841d2879", new Object[]{wXAddressModule, jSCallback});
        } else {
            wXAddressModule.returnErr(jSCallback);
        }
    }

    public static /* synthetic */ Object ipc$super(WXAddressModule wXAddressModule, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -17468269) {
            super.onActivityDestroy();
            return null;
        } else if (hashCode == 1257714799) {
            super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
            return null;
        } else if (hashCode == 1692842255) {
            super.onActivityPause();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/address/wrapper/weex/WXAddressModule");
        }
    }

    private void returnErr(JSCallback jSCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f59e2ec", new Object[]{this, jSCallback});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("code", (Object) (-1));
        jSONObject.put("message", (Object) "fail");
        if (jSCallback != null) {
            jSCallback.invoke(jSONObject);
        }
    }

    @JSMethod(uiThread = true)
    public void getAddressParams(JSONObject jSONObject, JSCallback jSCallback, JSCallback jSCallback2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88f3625", new Object[]{this, jSONObject, jSCallback, jSCallback2});
            return;
        }
        WXSDKInstance wXSDKInstance = this.mWXSDKInstance;
        if (wXSDKInstance == null || wXSDKInstance.getContext() == null) {
            returnErr(jSCallback2);
            return;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            AddressParams addressParams = sf0.f;
            if (addressParams != null) {
                jSONObject2.put(sf0.K_DELIVERY_ID, (Object) addressParams.deliverId);
                jSONObject2.put(gf0.K_AGENCY_RECV, (Object) sf0.f.agencyReceive);
                jSONObject2.put(gf0.K_AGENCY_RECV_H5, (Object) sf0.f.agencyReceiveH5Url);
                jSONObject2.put(gf0.K_AGENCY_RECV_HEPL, (Object) sf0.f.agencyReceiveHelpUrl);
                jSONObject2.put("abroadStation", (Object) Boolean.valueOf(sf0.f.abroadStation));
                jSONObject2.put("supportStation", (Object) Boolean.valueOf(sf0.f.supportStation));
                jSONObject2.put("needChangeKinship", (Object) Boolean.valueOf(sf0.f.needChangeKinship));
                jSONObject2.put("relationId", (Object) sf0.f.relationId);
                jSONObject2.put("source", (Object) sf0.f.source);
                jSONObject2.put(gf0.K_SITES, (Object) sf0.f.sites);
                jSONObject2.put("extMap", (Object) sf0.f.extMap);
                jSONObject2.put("sellerID", (Object) sf0.f.sellerID);
                jSONObject2.put("deliverAddrList", (Object) sf0.f.deliverAddrList);
                jSONObject2.put("accurateAddressInfo", (Object) sf0.f.accurateAddressInfo);
                jSONObject2.put(UploadConstants.BIZ_CODE, (Object) sf0.f.bizcode);
                if (sf0.f.extNativeJson != null) {
                    jSONObject2.put("extNativeJson", (Object) sf0.f.extNativeJson);
                }
                if (sf0.f.extUrlJson != null) {
                    jSONObject2.put("extUrlJson", (Object) sf0.f.extUrlJson);
                }
            }
            jSCallback.invoke(jSONObject2);
        } catch (Exception e) {
            e.printStackTrace();
            returnErr(jSCallback2);
        }
    }

    @Override // com.taobao.weex.common.WXModule
    public void onActivityDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fef57493", new Object[]{this});
            return;
        }
        WVAddressModule.destoryRecognition();
        super.onActivityDestroy();
    }

    @Override // com.taobao.weex.common.WXModule
    public void onActivityPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64e6b90f", new Object[]{this});
            return;
        }
        super.onActivityPause();
        WVAddressModule.stopRecognition();
    }

    @Override // com.taobao.weex.common.WXModule
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
        } else if (i == 1 && i2 == 1) {
            WXSDKInstance wXSDKInstance = this.mWXSDKInstance;
            if (wXSDKInstance != null && wXSDKInstance.getContext() != null) {
                WVAddressModule.executeActivityResult((Activity) this.mWXSDKInstance.getContext(), intent, false);
            }
        } else if (i == 9876 && i2 == 9876) {
            WXSDKInstance wXSDKInstance2 = this.mWXSDKInstance;
            if (wXSDKInstance2 != null && wXSDKInstance2.getContext() != null) {
                WVAddressModule.storeFinish((Activity) this.mWXSDKInstance.getContext(), intent, this.currentSelectType);
            }
        } else if (i == 2) {
            WXSDKInstance wXSDKInstance3 = this.mWXSDKInstance;
            if (wXSDKInstance3 != null && wXSDKInstance3.getContext() != null) {
                WVAddressModule.executeActivityResult((Activity) this.mWXSDKInstance.getContext(), intent, true);
            }
        } else {
            super.onActivityResult(i, i2, intent);
        }
    }

    @JSMethod(uiThread = true)
    public void openH5Page(JSONObject jSONObject, JSCallback jSCallback, JSCallback jSCallback2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa8b87e3", new Object[]{this, jSONObject, jSCallback, jSCallback2});
            return;
        }
        WXSDKInstance wXSDKInstance = this.mWXSDKInstance;
        if (wXSDKInstance != null && jSONObject != null && wXSDKInstance.getContext() != null && (this.mWXSDKInstance.getContext() instanceof Activity)) {
            String openH5Page = WVAddressModule.openH5Page((Activity) this.mWXSDKInstance.getContext(), jSONObject.toJSONString());
            if (!TextUtils.isEmpty(openH5Page)) {
                this.currentSelectType = openH5Page;
            }
        }
    }

    @JSMethod(uiThread = true)
    public void speechRecognition(JSONObject jSONObject, JSCallback jSCallback, JSCallback jSCallback2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b32386f4", new Object[]{this, jSONObject, jSCallback, jSCallback2});
            return;
        }
        WXSDKInstance wXSDKInstance = this.mWXSDKInstance;
        if (wXSDKInstance != null && wXSDKInstance.getContext() != null && (this.mWXSDKInstance.getContext() instanceof Activity)) {
            WVAddressModule.speechRecognition((Activity) this.mWXSDKInstance.getContext(), jSONObject.toJSONString(), new a(jSCallback, jSCallback2));
        }
    }

    @JSMethod(uiThread = true)
    public void userChoosedAddress(JSONObject jSONObject, JSCallback jSCallback, JSCallback jSCallback2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8e32597", new Object[]{this, jSONObject, jSCallback, jSCallback2});
            return;
        }
        WXSDKInstance wXSDKInstance = this.mWXSDKInstance;
        if (wXSDKInstance != null && jSONObject != null && wXSDKInstance.getContext() != null && (this.mWXSDKInstance.getContext() instanceof Activity)) {
            WVAddressModule.userChoosedAddress((Activity) this.mWXSDKInstance.getContext(), jSONObject.toJSONString());
        } else if (this.mWXSDKInstance.getContext() != null && (this.mWXSDKInstance.getContext() instanceof Activity)) {
            WVAddressModule.cancel((Activity) this.mWXSDKInstance.getContext());
        }
    }
}
