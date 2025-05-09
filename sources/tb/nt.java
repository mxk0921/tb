package tb;

import android.text.TextUtils;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentData;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentLayout;
import com.alibaba.android.ultron.ext.vlayout.a;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class nt implements qcb {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final AURARenderComponent c;

    /* renamed from: a  reason: collision with root package name */
    public int f24933a = 0;
    public int b = 0;
    public int e = 0;
    public int f = 1;
    public final List<AURARenderComponent> d = new ArrayList();

    static {
        t2o.a(80740590);
        t2o.a(80740591);
    }

    public nt(AURARenderComponent aURARenderComponent) {
        this.c = aURARenderComponent;
    }

    @Override // tb.qcb
    public void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
            return;
        }
        ((ArrayList) this.d).clear();
        this.f24933a = 0;
        this.b = 0;
        this.e = 0;
        this.f = 1;
    }

    public final void d(AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("585b7652", new Object[]{this, aURARenderComponent});
        } else if (!((ArrayList) this.d).contains(aURARenderComponent)) {
            ((ArrayList) this.d).add(aURARenderComponent);
        }
    }

    public abstract boolean e(nt ntVar);

    public abstract a f();

    public final AURARenderComponent g(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURARenderComponent) ipChange.ipc$dispatch("8e7a4630", new Object[]{this, new Integer(i)});
        }
        if (i >= ((ArrayList) this.d).size() || i < 0) {
            return null;
        }
        return (AURARenderComponent) ((ArrayList) this.d).get(i);
    }

    public final int h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ee44cd52", new Object[]{this})).intValue();
        }
        return ((ArrayList) this.d).size();
    }

    public final AURARenderComponent i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURARenderComponent) ipChange.ipc$dispatch("5e16c9cd", new Object[]{this});
        }
        if (h() == 0) {
            return null;
        }
        return (AURARenderComponent) ((ArrayList) this.d).get(0);
    }

    public int j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8f18c983", new Object[]{this})).intValue();
        }
        return this.e;
    }

    public int k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6a21a3e4", new Object[]{this})).intValue();
        }
        return this.f;
    }

    public int l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
        }
        return this.b;
    }

    public final AURARenderComponent m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURARenderComponent) ipChange.ipc$dispatch("596057df", new Object[]{this});
        }
        int h = h();
        if (h == 0) {
            return null;
        }
        return (AURARenderComponent) ((ArrayList) this.d).get(h - 1);
    }

    public final Map<String, Object> n(AURARenderComponent aURARenderComponent) {
        AURARenderComponentLayout aURARenderComponentLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("70cda7b8", new Object[]{this, aURARenderComponent});
        }
        AURARenderComponentData aURARenderComponentData = aURARenderComponent.data;
        if (aURARenderComponentData == null || (aURARenderComponentLayout = aURARenderComponentData.layout) == null) {
            return null;
        }
        return aURARenderComponentLayout.style;
    }

    public int o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a944eb00", new Object[]{this})).intValue();
        }
        return this.f24933a;
    }

    public final String p(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dc2c144a", new Object[]{this, str, str2});
        }
        Map<String, Object> n = n(this.c);
        if (n == null) {
            return str2;
        }
        Object obj = n.get(str);
        if (!(obj instanceof String)) {
            return String.valueOf(obj);
        }
        String str3 = (String) obj;
        if (TextUtils.isEmpty(str3)) {
            return str2;
        }
        return str3;
    }

    public final AURARenderComponent q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURARenderComponent) ipChange.ipc$dispatch("9a960868", new Object[]{this});
        }
        return this.c;
    }

    public final boolean r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bb429e55", new Object[]{this})).booleanValue();
        }
        if (this.b > 0) {
            return true;
        }
        return false;
    }

    public void s(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d686f8f", new Object[]{this, new Integer(i)});
        } else {
            this.b += i;
        }
    }

    public void t(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ad774e7", new Object[]{this, new Integer(i)});
            return;
        }
        if (i < 0) {
            i = 0;
        }
        this.e = i;
    }

    public void u(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a209b53e", new Object[]{this, new Integer(i)});
            return;
        }
        if (i < 0) {
            i = 0;
        }
        this.f = i;
    }

    public void v(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12a49022", new Object[]{this, new Integer(i)});
            return;
        }
        if (i < 0) {
            i = 0;
        }
        this.b = i;
    }

    public void w(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b62f830a", new Object[]{this, new Integer(i)});
            return;
        }
        if (i < 0) {
            i = 0;
        }
        this.f24933a = i;
    }
}
