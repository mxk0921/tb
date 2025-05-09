package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nanocompose.resource_loader.template.TemplateItem;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class k5z {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final TemplateItem f22425a;

    static {
        t2o.a(598737198);
    }

    public k5z(TemplateItem templateItem) {
        ckf.g(templateItem, "templateItem");
        this.f22425a = templateItem;
        if (!(templateItem.a().length() > 0)) {
            throw new IllegalArgumentException("templateItem is null or cachedPath is empty");
        }
    }

    public final String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ed7b34a0", new Object[]{this});
        }
        return this.f22425a.a();
    }

    public final TemplateItem b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TemplateItem) ipChange.ipc$dispatch("1b89f608", new Object[]{this});
        }
        return this.f22425a;
    }
}
