package com.alipay.vi.android.phone.mrpc.core;

import android.text.TextUtils;
import com.alipay.vi.android.phone.mrpc.core.gwprotocol.JsonSerializer;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.media.MediaConstant;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class SimpleRpcJsonSerializer extends JsonSerializer {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public SimpleRpcJsonSerializer(int i, String str, Object obj) {
        super(i, str, obj);
    }

    public static /* synthetic */ Object ipc$super(SimpleRpcJsonSerializer simpleRpcJsonSerializer, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/vi/android/phone/mrpc/core/SimpleRpcJsonSerializer");
    }

    @Override // com.alipay.vi.android.phone.mrpc.core.gwprotocol.JsonSerializer
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
