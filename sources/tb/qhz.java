package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nanocompose.base.hostingview.NCHostingView;
import com.taobao.android.nanocompose.resource_loader.template.TemplateItem;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class qhz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final NCHostingView f26767a;
    public final TemplateItem b;
    public final Map<String, Object> c;
    public shz d;

    static {
        t2o.a(598736903);
    }

    public qhz(NCHostingView nCHostingView, TemplateItem templateItem, Map<String, ? extends Object> map) {
        ckf.g(nCHostingView, "hostingView");
        ckf.g(templateItem, yg.CACHE_KEY_TEMPLATE_INFO);
        ckf.g(map, "data");
        this.f26767a = nCHostingView;
        this.b = templateItem;
        this.c = map;
    }

    public final Map<String, Object> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("516a2e9c", new Object[]{this});
        }
        return this.c;
    }

    public final NCHostingView b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NCHostingView) ipChange.ipc$dispatch("31962381", new Object[]{this});
        }
        return this.f26767a;
    }

    public final byte[] c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("904f1fb5", new Object[]{this});
        }
        return null;
    }

    public final shz d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (shz) ipChange.ipc$dispatch("d46d4995", new Object[]{this});
        }
        return this.d;
    }

    public final TemplateItem e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TemplateItem) ipChange.ipc$dispatch("f78f02cd", new Object[]{this});
        }
        return this.b;
    }

    public final void f(shz shzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd2c9feb", new Object[]{this, shzVar});
        } else {
            this.d = shzVar;
        }
    }
}
