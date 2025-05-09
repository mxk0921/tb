package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx_v4.loader.DXLoaderException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class gg5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final a16 f19968a;
    public final hh5 b;
    public final List<a> c = new ArrayList();
    public Map<String, DXWidgetNode> d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f19969a;
        public final long b;

        static {
            t2o.a(444597857);
        }

        public a(String str, long j) {
            this.f19969a = str;
            this.b = j;
        }

        public static /* synthetic */ String a(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("ebcd660a", new Object[]{aVar});
            }
            return aVar.f19969a;
        }

        public static /* synthetic */ long b(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("3603658b", new Object[]{aVar})).longValue();
            }
            return aVar.b;
        }
    }

    static {
        t2o.a(444597856);
        t2o.a(444597873);
    }

    public gg5(a16 a16Var, hh5 hh5Var) {
        this.f19968a = a16Var;
        this.b = hh5Var;
    }

    public String a(DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e8b13ee7", new Object[]{this, dXTemplateItem});
        }
        return dXTemplateItem.f7343a + ":" + dXTemplateItem.b;
    }

    public boolean c(lg5 lg5Var, DXRuntimeContext dXRuntimeContext) {
        a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a2df0ee7", new Object[]{this, lg5Var, dXRuntimeContext})).booleanValue();
        }
        lg5Var.k(this.f19968a.a());
        int h = lg5Var.h();
        if (h > 0) {
            for (int i = 0; i < h; i++) {
                if (lg5Var.e() != 1) {
                    aVar = null;
                } else {
                    aVar = new a(this.b.b(lg5Var.h()), lg5Var.i());
                }
                if (aVar != null) {
                    ((ArrayList) this.c).add(aVar);
                }
            }
        }
        return true;
    }

    public void b(DXRuntimeContext dXRuntimeContext, Context context) {
        String[] split;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e30e7798", new Object[]{this, dXRuntimeContext, context});
            return;
        }
        List<a> list = this.c;
        if (list != null && ((ArrayList) list).size() != 0) {
            this.d = new HashMap();
            if (dXRuntimeContext.p().k.f31396a.split("/subTemplates/").length > 1) {
                str = split[0] + "/subTemplates/";
            } else {
                str = dXRuntimeContext.p().k.f31396a.substring(0, dXRuntimeContext.p().k.f31396a.length() - 7) + "subTemplates/";
            }
            Iterator it = ((ArrayList) this.c).iterator();
            while (it.hasNext()) {
                a aVar = (a) it.next();
                DXTemplateItem dXTemplateItem = new DXTemplateItem();
                dXTemplateItem.f7343a = a.a(aVar);
                dXTemplateItem.b = a.b(aVar);
                xh6 xh6Var = new xh6();
                xh6Var.f31396a = str + dXTemplateItem.f7343a + "/" + dXTemplateItem.b + "/main.dx";
                xh6Var.b();
                xh6Var.b.put("logic", str + dXTemplateItem.f7343a + "/" + dXTemplateItem.b + "/logic");
                dXTemplateItem.k = xh6Var;
                DXRuntimeContext b = dXRuntimeContext.b(null);
                b.i0(dXTemplateItem);
                DXWidgetNode b2 = new k76(dXRuntimeContext.f().D()).b(dXTemplateItem, b, context);
                if (b2 != null) {
                    ((HashMap) this.d).put(a(dXTemplateItem), b2);
                } else {
                    la6.b("load 子模版失败" + a(dXTemplateItem));
                    if (DinamicXEngine.j0()) {
                        throw new DXLoaderException("load 子模版失败" + a(dXTemplateItem));
                    }
                }
            }
        }
    }
}
