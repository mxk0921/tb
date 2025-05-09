package com.taobao.themis.pub_kit.favor;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.network.RequestParams;
import com.taobao.themis.kernel.network.a;
import java.util.HashMap;
import java.util.Map;
import tb.t2o;
import tb.z54;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class AddFavorClient extends a<AddFavorParam, Boolean, Boolean> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class AddFavorParam extends RequestParams {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private boolean onlyOperateNotifyAccount;
        private String spm;

        static {
            t2o.a(845152265);
        }

        public AddFavorParam(String str, String str2, boolean z) {
            super(str);
            this.version = "1.0";
            this.api = "mtop.taobao.miniapp.user.add.favorite";
            this.needLogin = true;
            this.spm = str2;
            this.onlyOperateNotifyAccount = z;
        }

        public static /* synthetic */ Object ipc$super(AddFavorParam addFavorParam, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/pub_kit/favor/AddFavorClient$AddFavorParam");
        }

        @Override // com.taobao.themis.kernel.network.RequestParams
        public Map<String, Object> toMap() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("2dd9d11d", new Object[]{this});
            }
            HashMap hashMap = new HashMap();
            hashMap.put("miniapp_id", getAppId());
            hashMap.put("page_name", "miniapp_client_container");
            hashMap.put("app_name", "miniapp_client_container");
            if (!TextUtils.isEmpty(this.spm)) {
                hashMap.put("pre_spm_id", this.spm);
            }
            hashMap.put("spm_id", "miniapp_page");
            if (this.onlyOperateNotifyAccount) {
                hashMap.put("only_operate_notify_account", Boolean.TRUE);
            }
            hashMap.put("isSubscription", Boolean.TRUE);
            hashMap.put("relationType", "add");
            return hashMap;
        }
    }

    static {
        t2o.a(845152264);
    }

    public AddFavorClient(AddFavorParam addFavorParam, z54<Boolean, Boolean> z54Var) {
        super(addFavorParam, z54Var);
    }

    public static /* synthetic */ Object ipc$super(AddFavorClient addFavorClient, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/pub_kit/favor/AddFavorClient");
    }

    /* renamed from: d */
    public Boolean configFailureResponse(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("a2f7fad4", new Object[]{this, bArr});
        }
        return Boolean.FALSE;
    }

    /* renamed from: e */
    public Boolean configSuccessResponse(byte[] bArr) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("97b0e54d", new Object[]{this, bArr});
        }
        if (bArr == null || bArr.length == 0 || (jSONObject = JSON.parseObject(new String(bArr)).getJSONObject("data")) == null || jSONObject.isEmpty()) {
            return null;
        }
        return Boolean.valueOf(jSONObject.getBooleanValue("result"));
    }
}
