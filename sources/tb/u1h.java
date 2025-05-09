package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.powermsg.common.PowerMessage;
import com.taobao.taolive.sdk.model.message.TLiveMsg;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class u1h implements kbd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public awd f29077a;

    static {
        t2o.a(779092343);
        t2o.a(628097219);
    }

    @Override // tb.kbd
    public void a(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ce5e2af", new Object[]{this, new Integer(i), obj});
            return;
        }
        awd awdVar = this.f29077a;
        if (awdVar != null) {
            awdVar.a(i, obj);
        }
    }

    @Override // tb.kbd
    public void b(PowerMessage powerMessage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97513d8e", new Object[]{this, powerMessage});
            return;
        }
        awd awdVar = this.f29077a;
        if (awdVar != null) {
            awdVar.b(c(powerMessage));
        }
    }

    public final TLiveMsg c(PowerMessage powerMessage) {
        Exception e;
        TLiveMsg tLiveMsg;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TLiveMsg) ipChange.ipc$dispatch("44a8b0c7", new Object[]{this, powerMessage});
        }
        TLiveMsg tLiveMsg2 = null;
        try {
            tLiveMsg = new TLiveMsg();
        } catch (Exception e2) {
            e = e2;
        }
        try {
            tLiveMsg.data = powerMessage.data;
            tLiveMsg.type = powerMessage.type;
            tLiveMsg.bizCode = powerMessage.bizCode;
            tLiveMsg.from = powerMessage.from;
            tLiveMsg.messageId = powerMessage.messageId;
            tLiveMsg.needAck = powerMessage.needAck;
            tLiveMsg.priority = powerMessage.priority;
            tLiveMsg.qosLevel = powerMessage.qosLevel;
            tLiveMsg.sendFullTags = powerMessage.sendFullTags;
            tLiveMsg.tags = powerMessage.tags;
            tLiveMsg.timestamp = powerMessage.timestamp;
            tLiveMsg.to = powerMessage.to;
            tLiveMsg.topic = powerMessage.topic;
            tLiveMsg.userId = powerMessage.userId;
            return tLiveMsg;
        } catch (Exception e3) {
            e = e3;
            tLiveMsg2 = tLiveMsg;
            e.printStackTrace();
            return tLiveMsg2;
        }
    }

    public void d(awd awdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("221e3410", new Object[]{this, awdVar});
        } else {
            this.f29077a = awdVar;
        }
    }
}
