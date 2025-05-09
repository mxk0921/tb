package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.kn;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class sm extends ot<sw1> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final kn f28141a = new kn(new a());
    public Map<String, Object> b;

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
            sm smVar = sm.this;
            return smVar.d(sm.e(smVar), str, str2);
        }
    }

    static {
        t2o.a(80740605);
    }

    public static /* synthetic */ Map e(sm smVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("db2827f1", new Object[]{smVar});
        }
        return smVar.b;
    }

    public static /* synthetic */ Object ipc$super(sm smVar, String str, Object... objArr) {
        if (str.hashCode() == -1272099756) {
            super.clear();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/aura/service/render/layout/renderhelper/umf/impl/AURARenderStickyLayoutHelper");
    }

    @Override // tb.qcb
    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c9e3aff5", new Object[]{this});
        }
        return "sticky";
    }

    @Override // tb.h4e
    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bdfad53", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // tb.ot, tb.qcb
    public void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
            return;
        }
        super.clear();
        this.f28141a.g();
    }

    /* renamed from: f */
    public sw1 b(int i, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sw1) ipChange.ipc$dispatch("4684fd7a", new Object[]{this, new Integer(i), map});
        }
        this.b = map;
        return this.f28141a.k();
    }
}
