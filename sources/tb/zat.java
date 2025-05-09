package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.openarchitecture.gateway.command.type.TaoliveGatewayEnum;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class zat {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public abt f32657a;
    public cbt b;

    static {
        t2o.a(779093012);
    }

    public zat a(jbt jbtVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zat) ipChange.ipc$dispatch("9f533426", new Object[]{this, jbtVar});
        }
        if (this.f32657a == null) {
            this.f32657a = new abt();
        }
        if (this.b == null) {
            this.b = new cbt();
        }
        this.b.i(jbtVar);
        this.f32657a.i(jbtVar).b(this.b);
        return this;
    }

    public Object b(TaoliveGatewayEnum taoliveGatewayEnum, jbt jbtVar, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("a0a66a31", new Object[]{this, taoliveGatewayEnum, jbtVar, objArr});
        }
        abt abtVar = this.f32657a;
        if (abtVar != null) {
            return abtVar.a(taoliveGatewayEnum, jbtVar, objArr);
        }
        return null;
    }
}
