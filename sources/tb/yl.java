package tb;

import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentData;
import com.alibaba.android.ultron.ext.vlayout.a;
import com.alipay.android.phone.iifaa.did.rpc.model.CredentialRpcData;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class yl extends nt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(80740592);
    }

    public yl(AURARenderComponent aURARenderComponent) {
        super(aURARenderComponent);
    }

    public static /* synthetic */ Object ipc$super(yl ylVar, String str, Object... objArr) {
        if (str.hashCode() == -1272099756) {
            super.clear();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/aura/service/render/layout/renderhelper/aura/impl/AURARenderCardLayoutDelegate");
    }

    @Override // tb.qcb
    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c9e3aff5", new Object[]{this});
        }
        return "card";
    }

    @Override // tb.nt, tb.qcb
    public void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
        } else {
            super.clear();
        }
    }

    @Override // tb.nt
    public boolean e(nt ntVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bce4b8f2", new Object[]{this, ntVar})).booleanValue();
        }
        return false;
    }

    @Override // tb.nt
    public a f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("5a762bd4", new Object[]{this});
        }
        zg zgVar = new zg(l());
        int max = Math.max(0, j());
        int max2 = Math.max(1, k());
        y(zgVar, max, max2);
        x(max, max2);
        return zgVar;
    }

    public final void y(zg zgVar, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d489aeb2", new Object[]{this, zgVar, new Integer(i), new Integer(i2)});
        } else if (zgVar instanceof cdb) {
            zgVar.d(i);
            zgVar.c(i2);
        }
    }

    public final void z(AURARenderComponent aURARenderComponent, String str) {
        AURARenderComponentData aURARenderComponentData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64d3e0ca", new Object[]{this, aURARenderComponent, str});
        } else if (aURARenderComponent != null && (aURARenderComponentData = aURARenderComponent.data) != null) {
            if (aURARenderComponentData.fields == null) {
                aURARenderComponentData.fields = new HashMap();
            }
            aURARenderComponentData.fields.put("cornerType", str);
        }
    }

    public final void x(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6815c9", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        int l = l();
        AURARenderComponent i3 = i();
        if (i3 != null) {
            if (1 == i2 && 1 == l) {
                z(i3, CredentialRpcData.ACTION_BOTH);
                return;
            }
            AURARenderComponent m = m();
            if (m != null) {
                if (1 == i2) {
                    z(i3, "top");
                    z(m, "bottom");
                } else if (i == 0) {
                    z(i3, "top");
                } else if (i == i2 - 1) {
                    z(m, "bottom");
                }
            }
        }
    }
}
