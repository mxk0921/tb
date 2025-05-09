package com.taobao.tao.powermsg.common;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.google.protobuf.nano.MessageNano;
import java.util.Map;
import tb.i2r;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class CountPowerMessage extends PowerMessage {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public byte[] data;
    public int type;
    public Map<String, Long> value;

    static {
        t2o.a(628097217);
    }

    public CountPowerMessage() {
        super.type = 102;
    }

    public static /* synthetic */ Object ipc$super(CountPowerMessage countPowerMessage, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/powermsg/common/CountPowerMessage");
    }

    @Override // com.taobao.tao.powermsg.common.PowerMessage
    public void fromData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da05c0fb", new Object[]{this});
            return;
        }
        try {
            this.value = i2r.c(super.data).f21061a;
        } catch (InvalidProtocolBufferNanoException e) {
            e.printStackTrace();
        }
    }

    @Override // com.taobao.tao.powermsg.common.PowerMessage
    public void toData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("695e56cc", new Object[]{this});
            return;
        }
        super.type = 102;
        i2r i2rVar = new i2r();
        i2rVar.f21061a = this.value;
        super.data = MessageNano.toByteArray(i2rVar);
    }
}
