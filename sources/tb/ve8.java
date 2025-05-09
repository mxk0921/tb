package tb;

import android.graphics.Rect;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tbpoplayer.nativerender.dsl.ActionModel;
import com.taobao.tbpoplayer.nativerender.dsl.ActionsItemModel;
import com.taobao.tbpoplayer.nativerender.dsl.ComponentBaseModel;
import com.taobao.tbpoplayer.nativerender.dsl.StateModel;
import com.taobao.tbpoplayer.nativerender.dsl.StateVersionModel;
import java.util.List;
import tb.oe8;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ve8 implements oe8.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(790626383);
        t2o.a(790626381);
    }

    @Override // tb.oe8.a
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c832df14", new Object[]{this});
        }
    }

    @Override // tb.oe8.a
    public void b(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e720d97", new Object[]{this, str, str2, str3});
        }
    }

    @Override // tb.oe8.a
    public void c(ell ellVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87054ab9", new Object[]{this, ellVar});
        }
    }

    @Override // tb.oe8.a
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f5949e8", new Object[]{this});
        }
    }

    @Override // tb.oe8.a
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f250e77f", new Object[]{this});
        }
    }

    @Override // tb.oe8.a
    public void f(ComponentBaseModel componentBaseModel, String str, ActionModel actionModel, List<ActionsItemModel> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a49dffa2", new Object[]{this, componentBaseModel, str, actionModel, list});
        }
    }

    @Override // tb.oe8.a
    public void g(String str, String str2, boolean z, ell ellVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39842efd", new Object[]{this, str, str2, new Boolean(z), ellVar});
        }
    }

    @Override // tb.oe8.a
    public void h(Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4cf5cf8e", new Object[]{this, rect});
        }
    }

    @Override // tb.oe8.a
    public View i(StateModel stateModel, StateVersionModel stateVersionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("4bde8dcc", new Object[]{this, stateModel, stateVersionModel});
        }
        return null;
    }

    @Override // tb.oe8.a
    public void j(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e972d0d", new Object[]{this, str, str2});
        }
    }

    @Override // tb.oe8.a
    public String k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("91851dbe", new Object[]{this, str});
        }
        return str;
    }

    @Override // tb.oe8.a
    public boolean l(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a3d08399", new Object[]{this, str, str2})).booleanValue();
        }
        return false;
    }

    @Override // tb.oe8.a
    public boolean m(List<String> list, List<String> list2, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b5b57ab4", new Object[]{this, list, list2, new Boolean(z), new Boolean(z2)})).booleanValue();
        }
        return false;
    }

    @Override // tb.oe8.a
    public boolean n(boolean z, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dd6ba627", new Object[]{this, new Boolean(z), list})).booleanValue();
        }
        return false;
    }

    @Override // tb.oe8.a
    public void needShow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47da8fba", new Object[]{this});
        }
    }

    @Override // tb.oe8.a
    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc0b6af", new Object[]{this});
        }
    }

    public void p(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c379cc5", new Object[]{this, str});
        }
    }
}
