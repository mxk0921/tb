package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nanocompose.resource_loader.template.TemplateItem;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class irz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final TemplateItem f21541a;
    public final boolean b;

    static {
        t2o.a(598737230);
    }

    public irz(TemplateItem templateItem, boolean z) {
        this.f21541a = templateItem;
        this.b = z;
    }

    public final TemplateItem a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TemplateItem) ipChange.ipc$dispatch("e36c5377", new Object[]{this});
        }
        return this.f21541a;
    }

    public final TemplateItem b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TemplateItem) ipChange.ipc$dispatch("1b89f608", new Object[]{this});
        }
        return this.f21541a;
    }

    public final boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3469d0f", new Object[]{this})).booleanValue();
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
        if (!(obj instanceof irz)) {
            return false;
        }
        irz irzVar = (irz) obj;
        if (ckf.b(this.f21541a, irzVar.f21541a) && this.b == irzVar.b) {
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
        TemplateItem templateItem = this.f21541a;
        if (templateItem != null) {
            i = templateItem.hashCode();
        }
        int i3 = i * 31;
        boolean z = this.b;
        if (!z) {
            i2 = z ? 1 : 0;
        }
        return i3 + i2;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "TemplateFetchResult(templateItem=" + this.f21541a + ", triggerFallback=" + this.b + ')';
    }
}
