package com.alipay.mobile.common.rpc.protocol.json;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.media.MediaConstant;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class SimpleRpcJsonSerializerV2 extends JsonSerializerV2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public SimpleRpcJsonSerializerV2(int i, String str, Object obj) {
        super(i, str, obj);
    }

    public static /* synthetic */ Object ipc$super(SimpleRpcJsonSerializerV2 simpleRpcJsonSerializerV2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/common/rpc/protocol/json/SimpleRpcJsonSerializerV2");
    }

    @Override // com.alipay.mobile.common.rpc.protocol.json.JsonSerializer
    public String getRequestDataJson() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e8af12ae", new Object[]{this});
        }
        String valueOf = String.valueOf(((Object[]) this.mParams)[1]);
        if (TextUtils.isEmpty(valueOf)) {
            return MediaConstant.DEFALUT_H265_HW_BLACK_LIST_FOR_DEGRADE_H264;
        }
        return valueOf;
    }
}
