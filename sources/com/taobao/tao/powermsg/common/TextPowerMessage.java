package com.taobao.tao.powermsg.common;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.google.protobuf.nano.MessageNano;
import java.util.Map;
import tb.l2r;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class TextPowerMessage extends PowerMessage {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public byte[] data;
    public String text;
    public int type;
    public Map<String, String> value;

    static {
        t2o.a(628097227);
    }

    public TextPowerMessage() {
        super.type = 101;
    }

    public static /* synthetic */ Object ipc$super(TextPowerMessage textPowerMessage, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/powermsg/common/TextPowerMessage");
    }

    @Override // com.taobao.tao.powermsg.common.PowerMessage
    public void fromData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da05c0fb", new Object[]{this});
            return;
        }
        try {
            l2r c = l2r.c(super.data);
            this.text = c.f23072a;
            this.value = c.b;
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
        super.type = 101;
        l2r l2rVar = new l2r();
        l2rVar.f23072a = this.text;
        Map<String, String> map = this.value;
        if (map != null) {
            l2rVar.b = map;
        }
        super.data = MessageNano.toByteArray(l2rVar);
    }
}
