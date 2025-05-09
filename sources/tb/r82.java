package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseTypedBean;
import com.taobao.search.musie.NSMuiseViewHolder;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class r82 extends dgu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(995098644);
    }

    public static /* synthetic */ Object ipc$super(r82 r82Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/xsearchplugin/jarvis/plugin/BehaviXPlugin");
    }

    @Override // tb.dgu, tb.a3e
    public void a(otf otfVar, v91 v91Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9725972a", new Object[]{this, otfVar, v91Var});
        } else if (h(otfVar).b()) {
            i(otfVar, v91Var.f29864a, v91Var.c, v91Var.b);
        }
    }

    @Override // tb.dgu, tb.a3e
    public void e(otf otfVar, rt3 rt3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afcd6d77", new Object[]{this, otfVar, rt3Var});
        } else if (h(otfVar).a()) {
            cqv.u(otfVar.y2(), "itemClick", "", rt3Var.f27591a, ntf.a(rt3Var.b));
        }
    }

    public final etf h(otf otfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (etf) ipChange.ipc$dispatch("4f0226a0", new Object[]{this, otfVar});
        }
        return (etf) otfVar.getCore().f().f();
    }

    public final void i(otf otfVar, BaseTypedBean baseTypedBean, Map<String, String> map, int i) {
        Map<String, Object> b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56967da8", new Object[]{this, otfVar, baseTypedBean, map, new Integer(i)});
            return;
        }
        String c = ntf.c(baseTypedBean, otfVar.getCore());
        if (!TextUtils.isEmpty(c) && (b = ntf.b(baseTypedBean, otfVar.getCore())) != null) {
            if (map != null) {
                b.putAll(map);
            }
            b.put("jarvisIndex", String.valueOf(i));
            cqv.A(otfVar.y2(), "itemExpose", c, null, ntf.a(b));
        }
    }

    @Override // tb.dgu, tb.a3e
    public void c(otf otfVar, oxo oxoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e101f3a", new Object[]{this, otfVar, oxoVar});
        } else if (h(otfVar).c()) {
            cqv.G(otfVar.y2(), NSMuiseViewHolder.ACTION_LIST_SCROLL, 0, oxoVar.f25734a, new String[0]);
        }
    }

    @Override // tb.dgu, tb.a3e
    public void d(otf otfVar, op7 op7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56dc7366", new Object[]{this, otfVar, op7Var});
        } else if (h(otfVar).b()) {
            String c = ntf.c(op7Var.f25544a, otfVar.getCore());
            if (!TextUtils.isEmpty(c)) {
                cqv.C(otfVar.y2(), "itemExpose", c, null, new String[0]);
            }
        }
    }

    @Override // tb.dgu, tb.a3e
    public void g(otf otfVar, oxo oxoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbd0b9c2", new Object[]{this, otfVar, oxoVar});
        } else if (h(otfVar).c()) {
            cqv.K(otfVar.y2(), NSMuiseViewHolder.ACTION_LIST_SCROLL, 0, oxoVar.f25734a, new String[0]);
        }
    }
}
