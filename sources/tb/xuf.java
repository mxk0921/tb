package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.google.protobuf.nano.MessageNano;
import com.taobao.tao.powermsg.common.PowerMessage;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class xuf extends PowerMessage {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f31613a;
    public int b;
    public Map<String, String> c;
    public long d;

    static {
        t2o.a(628097221);
    }

    public xuf() {
        this.type = 103;
    }

    public static /* synthetic */ Object ipc$super(xuf xufVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/powermsg/common/JoinPowerMessage");
    }

    @Override // com.taobao.tao.powermsg.common.PowerMessage
    public void fromData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da05c0fb", new Object[]{this});
            return;
        }
        try {
            j2r c = j2r.c(this.data);
            this.f31613a = c.f21727a;
            this.b = c.b;
            this.c = c.c;
            this.d = c.d;
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
        this.type = 103;
        j2r j2rVar = new j2r();
        j2rVar.f21727a = this.f31613a;
        j2rVar.b = this.b;
        j2rVar.c = this.c;
        j2rVar.d = this.d;
        this.data = MessageNano.toByteArray(j2rVar);
    }
}
