package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.android.searchbaseframe.nx3.bean.TemplateBean;
import com.taobao.android.searchbaseframe.util.ListStyle;
import java.util.List;
import tb.rpc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class s3 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public List<? extends BaseCellBean> f27771a;
    public rpc.c b;
    public TemplateBean c;
    public View d;
    public boolean e;
    public ListStyle f;

    static {
        t2o.a(815792147);
    }

    public final View a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("ade2b4e3", new Object[]{this});
        }
        return this.d;
    }

    public final List<BaseCellBean> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("c2c777b9", new Object[]{this});
        }
        return this.f27771a;
    }

    public final ListStyle c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ListStyle) ipChange.ipc$dispatch("fbfbe301", new Object[]{this});
        }
        ListStyle listStyle = this.f;
        if (listStyle != null) {
            return listStyle;
        }
        ckf.y("listStyle");
        throw null;
    }

    public final boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b02bd2b8", new Object[]{this})).booleanValue();
        }
        return this.e;
    }

    public final TemplateBean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TemplateBean) ipChange.ipc$dispatch("20fa3ee9", new Object[]{this});
        }
        return this.c;
    }

    public final rpc.c f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rpc.c) ipChange.ipc$dispatch("c49ae6bd", new Object[]{this});
        }
        return this.b;
    }

    public final void g(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fce9c75d", new Object[]{this, view});
        } else {
            this.d = view;
        }
    }

    public final void h(List<? extends BaseCellBean> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bcaf8cb", new Object[]{this, list});
        } else {
            this.f27771a = list;
        }
    }

    public final void i(ListStyle listStyle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3ee5655", new Object[]{this, listStyle});
            return;
        }
        ckf.g(listStyle, "<set-?>");
        this.f = listStyle;
    }

    public final void j(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f94bcbac", new Object[]{this, new Boolean(z)});
        } else {
            this.e = z;
        }
    }

    public final void k(TemplateBean templateBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1271310d", new Object[]{this, templateBean});
        } else {
            this.c = templateBean;
        }
    }

    public final void l(rpc.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("342de0fb", new Object[]{this, cVar});
        } else {
            this.b = cVar;
        }
    }
}
