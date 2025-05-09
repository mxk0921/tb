package com.alipay.android.app.pay;

import com.alipay.android.msp.framework.constraints.IChannelInfo;
import com.alipay.android.msp.pay.channel.AliChannelInfo;
import com.alipay.android.msp.pay.service.MspInitAssistService;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class MspInitAssistServiceImpl extends MspInitAssistService {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public IChannelInfo f3479a;

    public static /* synthetic */ Object ipc$super(MspInitAssistServiceImpl mspInitAssistServiceImpl, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/app/pay/MspInitAssistServiceImpl");
    }

    @Override // com.alipay.android.msp.pay.service.MspInitAssistService
    public IChannelInfo getChannelInfo() {
        if (this.f3479a == null) {
            try {
                this.f3479a = (IChannelInfo) AliChannelInfo.class.newInstance();
            } catch (Exception unused) {
                return null;
            }
        }
        return this.f3479a;
    }
}
