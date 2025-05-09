package com.taobao.themis.ability_taobao.share;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.network.RequestParams;
import java.util.HashMap;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class GetShareInfoParam extends RequestParams {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(832569380);
    }

    public GetShareInfoParam(String str) {
        super(str);
        this.api = "mtop.taobao.miniapp.shareinfo.get";
        this.version = "1.0";
    }

    public static /* synthetic */ Object ipc$super(GetShareInfoParam getShareInfoParam, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/ability_taobao/share/GetShareInfoParam");
    }

    @Override // com.taobao.themis.kernel.network.RequestParams
    public Map<String, Object> toMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("2dd9d11d", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("appId", getAppId());
        return hashMap;
    }
}
