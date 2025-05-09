package tb;

import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.ultron.ext.vlayout.a;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class nm extends nt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(80740595);
    }

    public nm(AURARenderComponent aURARenderComponent) {
        super(aURARenderComponent);
    }

    public static /* synthetic */ Object ipc$super(nm nmVar, String str, Object... objArr) {
        if (str.hashCode() == -1272099756) {
            super.clear();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/aura/service/render/layout/renderhelper/aura/impl/AURARenderOverlayLayoutDelegate");
    }

    @Override // tb.qcb
    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c9e3aff5", new Object[]{this});
        }
        return "overlay";
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
    public a f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("5a762bd4", new Object[]{this});
        }
        return new zk(l());
    }

    @Override // tb.nt
    public boolean e(nt ntVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bce4b8f2", new Object[]{this, ntVar})).booleanValue();
        }
        if ("overlay".equalsIgnoreCase(ntVar.a())) {
            return true;
        }
        rbb g = ck.g();
        g.b("AURAReverseRenderOverlayLayoutHelper", "supportContainByParentLayout", ntVar + " not support parent layoutType:" + ntVar);
        return false;
    }
}
