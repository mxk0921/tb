package tb;

import android.view.View;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.f;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import java.util.List;
import tb.c36;
import tb.ua6;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class ug5 extends m54 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final b Companion = new b(null);
    public static final String TAG = "DXComponent";
    public final FrameLayout c;
    public DXRootView d;
    public final jfr<?> e;
    public final cv5 f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class b {
        static {
            t2o.a(804257815);
        }

        public b() {
        }

        public /* synthetic */ b(a07 a07Var) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class c implements c36 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // tb.c36
        public void a(DXRootView dXRootView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a9b5822c", new Object[]{this, dXRootView});
                return;
            }
            ckf.g(dXRootView, "dxView");
            ug5.k(ug5.this, dXRootView);
            ug5.j(ug5.this).removeAllViews();
            ug5.j(ug5.this).addView(ug5.h(ug5.this), new FrameLayout.LayoutParams(-1, -1));
            ug5.g(ug5.this).e().a("eventDxRender", new xa6(true, dXRootView));
        }

        @Override // tb.c36
        public void b(DXTemplateItem dXTemplateItem) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9c6fe96c", new Object[]{this, dXTemplateItem});
                return;
            }
            ckf.g(dXTemplateItem, "item");
            c36.a.a(this, dXTemplateItem);
        }

        @Override // tb.c36
        public void c(DXTemplateItem dXTemplateItem, f fVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("68f4b8d3", new Object[]{this, dXTemplateItem, fVar});
                return;
            }
            ckf.g(dXTemplateItem, "template");
            ckf.g(fVar, "error");
            wfr wfrVar = wfr.INSTANCE;
            wfrVar.b(ug5.TAG, "load dx " + dXTemplateItem.f7343a + " error:  " + fVar.a() + ' ' + ug5.i(ug5.this, fVar));
            ug5.g(ug5.this).e().a("eventDxRender", new xa6(false, null));
        }
    }

    static {
        t2o.a(804257814);
    }

    public ug5(jfr<?> jfrVar, cv5 cv5Var) {
        ckf.g(jfrVar, "context");
        ckf.g(cv5Var, "engineWrapper");
        this.e = jfrVar;
        this.f = cv5Var;
        this.c = new FrameLayout(jfrVar.c());
    }

    public static final /* synthetic */ DXRootView h(ug5 ug5Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRootView) ipChange.ipc$dispatch("93f4dc4c", new Object[]{ug5Var});
        }
        return ug5Var.d;
    }

    public static final /* synthetic */ String i(ug5 ug5Var, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4dc09c26", new Object[]{ug5Var, fVar});
        }
        return ug5Var.l(fVar);
    }

    public static /* synthetic */ Object ipc$super(ug5 ug5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/industry/tbiunicontainer/core/component/DXComponent");
    }

    public static final /* synthetic */ FrameLayout j(ug5 ug5Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("a6c5782", new Object[]{ug5Var});
        }
        return ug5Var.c;
    }

    public static final /* synthetic */ void k(ug5 ug5Var, DXRootView dXRootView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bdfc6b8", new Object[]{ug5Var, dXRootView});
        } else {
            ug5Var.d = dXRootView;
        }
    }

    @Override // tb.na4
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e328d7b", new Object[]{this});
        } else {
            this.f.a().t0(this.d);
        }
    }

    @Override // tb.na4
    public View d() {
        JSONObject jSONObject;
        JSONObject a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        if (this.d == null) {
            ua6.a aVar = new ua6.a(this.e.c(), this.f.a());
            mb4<JSONObject> b2 = b();
            if (b2 != null) {
                jSONObject = b2.a();
            } else {
                jSONObject = null;
            }
            ua6.a b3 = aVar.b(jSONObject);
            mb4<JSONObject> b4 = b();
            if (!(b4 == null || (a2 = b4.a()) == null)) {
                Integer integer = a2.getInteger("expectedWidth");
                Integer integer2 = a2.getInteger("expectedHeight");
                if (integer != null) {
                    b3.d(View.MeasureSpec.makeMeasureSpec(integer.intValue(), 1073741824));
                    ckf.f(integer2, "height");
                    b3.c(View.MeasureSpec.makeMeasureSpec(integer2.intValue(), 1073741824));
                }
            }
            ua6 a3 = b3.a();
            DXTemplateItem dXTemplateItem = new DXTemplateItem();
            dXTemplateItem.f7343a = c().a();
            dXTemplateItem.c = c().c();
            dXTemplateItem.b = c().d();
            this.f.b(a3, dXTemplateItem, new c());
        }
        return this.c;
    }

    @Override // tb.na4
    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        }
    }

    public final String l(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3909561f", new Object[]{this, fVar});
        }
        StringBuilder sb = new StringBuilder();
        List<f.a> list = fVar.c;
        if (list != null) {
            ckf.f(list, "error.dxErrorInfoList");
            if (!list.isEmpty()) {
                for (f.a aVar : fVar.c) {
                    sb.append(aVar.e);
                    sb.append(" ");
                }
            }
        }
        String sb2 = sb.toString();
        ckf.f(sb2, "builder.toString()");
        return sb2;
    }

    public final void m(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5df50e80", new Object[]{this, str, jSONObject});
            return;
        }
        ckf.g(str, "action");
        this.f.a().v().l(str, jSONObject);
    }

    public final void n(DXEvent dXEvent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("461c2c5a", new Object[]{this, dXEvent, str});
            return;
        }
        ckf.g(dXEvent, "event");
        ckf.g(str, "userId");
        DXRootView dXRootView = this.d;
        if (dXRootView != null) {
            ckf.d(dXRootView);
            dXRootView.getExpandWidgetNode().queryWidgetNodeByUserId(str).postEvent(dXEvent);
        }
    }

    public static final /* synthetic */ jfr g(ug5 ug5Var) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jfr) ipChange.ipc$dispatch("6d22ca76", new Object[]{ug5Var}) : ug5Var.e;
    }
}
