package tb;

import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class tfr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public qjc f28691a;

    static {
        t2o.a(803209256);
    }

    public final ViewGroup a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("26a69771", new Object[]{this});
        }
        qjc qjcVar = this.f28691a;
        if (qjcVar != null) {
            return qjcVar.getRootView();
        }
        ckf.y("layout");
        throw null;
    }

    public final void b(List<? extends na4<?>> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57b7e5a2", new Object[]{this, list});
            return;
        }
        ckf.g(list, "components");
        qjc qjcVar = this.f28691a;
        if (qjcVar != null) {
            qjcVar.a(list);
        } else {
            ckf.y("layout");
            throw null;
        }
    }

    public final void c(qjc qjcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c1d1443", new Object[]{this, qjcVar});
            return;
        }
        ckf.g(qjcVar, "<set-?>");
        this.f28691a = qjcVar;
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        }
    }
}
