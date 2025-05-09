package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class wd3 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f30628a;
    public String b = "";
    public String c = "";
    public List<IDMComponent> d;

    static {
        t2o.a(479199324);
    }

    public final String a(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("88b9d524", new Object[]{this, iDMComponent});
        }
        if (iDMComponent == null || iDMComponent.getFields() == null) {
            return "";
        }
        return iDMComponent.getFields().getString("cartId");
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("da41a0f7", new Object[]{this});
        }
        return this.b;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e9dbfe13", new Object[]{this});
        }
        return null;
    }

    public final String d(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7dc6dd72", new Object[]{this, iDMComponent});
        }
        if (iDMComponent == null || iDMComponent.getFields() == null) {
            return "";
        }
        return iDMComponent.getFields().getString("settlement");
    }

    public String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("24b01445", new Object[]{this});
        }
        return this.c;
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("14b85c89", new Object[]{this})).booleanValue();
        }
        return this.f30628a;
    }

    public void g(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c91dca27", new Object[]{this, new Boolean(z)});
        } else {
            this.f30628a = z;
        }
    }

    public void h(List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b1dcdc7", new Object[]{this, list});
            return;
        }
        this.d = list;
        for (IDMComponent iDMComponent : list) {
            this.c += d(iDMComponent) + ",";
            this.b += a(iDMComponent) + ",";
        }
        String str = this.c;
        this.c = str.substring(0, str.length() - 1);
        String str2 = this.b;
        this.b = str2.substring(0, str2.length() - 1);
    }
}
