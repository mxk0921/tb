package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.openarchitecture.gateway.command.type.TaoliveGatewayEnum;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public abstract class bbt implements zyd {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int interrupt = -1;

    /* renamed from: a  reason: collision with root package name */
    public zyd f16307a;

    static {
        t2o.a(779093029);
        t2o.a(779093025);
    }

    @Override // tb.zyd
    public Object a(TaoliveGatewayEnum taoliveGatewayEnum, jbt jbtVar, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("7841b7e1", new Object[]{this, taoliveGatewayEnum, jbtVar, objArr});
        }
        Object c = c(taoliveGatewayEnum, jbtVar, objArr);
        if (c == null) {
            zyd zydVar = this.f16307a;
            if (zydVar != null) {
                return zydVar.a(taoliveGatewayEnum, jbtVar, objArr);
            }
            return null;
        } else if (c instanceof Integer) {
            return null;
        } else {
            return c;
        }
    }

    @Override // tb.zyd
    public zyd b(zyd zydVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zyd) ipChange.ipc$dispatch("3d91c280", new Object[]{this, zydVar});
        }
        this.f16307a = zydVar;
        return this;
    }

    public abstract Object c(TaoliveGatewayEnum taoliveGatewayEnum, jbt jbtVar, Object... objArr);
}
