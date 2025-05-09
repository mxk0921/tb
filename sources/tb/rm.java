package tb;

import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kn;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class rm extends nt {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final kn g = new kn(new a());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements kn.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.kn.d
        public String a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("dc2c144a", new Object[]{this, str, str2});
            }
            return rm.x(rm.this, str, str2);
        }
    }

    static {
        t2o.a(80740596);
    }

    public rm(AURARenderComponent aURARenderComponent) {
        super(aURARenderComponent);
    }

    public static /* synthetic */ Object ipc$super(rm rmVar, String str, Object... objArr) {
        if (str.hashCode() == -1272099756) {
            super.clear();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/aura/service/render/layout/renderhelper/aura/impl/AURARenderStickyLayoutDelegate");
    }

    public static /* synthetic */ String x(rm rmVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("eae8d134", new Object[]{rmVar, str, str2});
        }
        return rmVar.p(str, str2);
    }

    @Override // tb.qcb
    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c9e3aff5", new Object[]{this});
        }
        return "sticky";
    }

    @Override // tb.nt, tb.qcb
    public void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
            return;
        }
        super.clear();
        this.g.g();
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
    public com.alibaba.android.ultron.ext.vlayout.a f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.android.ultron.ext.vlayout.a) ipChange.ipc$dispatch("5a762bd4", new Object[]{this});
        }
        return this.g.k();
    }
}
