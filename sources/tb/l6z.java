package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nanocompose.resource_loader.template.TemplateItem;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class l6z {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f23144a;
    public final TemplateItem b;

    static {
        t2o.a(598737215);
    }

    public l6z(boolean z, TemplateItem templateItem) {
        this.f23144a = z;
        this.b = templateItem;
    }

    public final boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4f047d5f", new Object[]{this})).booleanValue();
        }
        return this.f23144a;
    }

    public final TemplateItem b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TemplateItem) ipChange.ipc$dispatch("fddd4c96", new Object[]{this});
        }
        return this.b;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l6z)) {
            return false;
        }
        l6z l6zVar = (l6z) obj;
        if (this.f23144a == l6zVar.f23144a && ckf.b(this.b, l6zVar.b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = 0;
        int i2 = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        boolean z = this.f23144a;
        if (!z) {
            i2 = z ? 1 : 0;
        }
        int i3 = i2 * 31;
        TemplateItem templateItem = this.b;
        if (templateItem != null) {
            i = templateItem.hashCode();
        }
        return i3 + i;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "FallbackResult(success=" + this.f23144a + ", templateItem=" + this.b + ')';
    }
}
