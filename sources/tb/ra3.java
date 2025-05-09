package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.android.icart.core.view.ViewManager;
import com.alibaba.android.ultron.vfw.core.ViewEngine;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRenderOptions;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.s;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class ra3 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final ra3 INSTANCE = new ra3();

    /* renamed from: a  reason: collision with root package name */
    public static boolean f27222a;

    static {
        t2o.a(479199511);
    }

    public static final /* synthetic */ void a(ra3 ra3Var, Context context, s sVar, IDMComponent iDMComponent, DXTemplateItem dXTemplateItem, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eff970bc", new Object[]{ra3Var, context, sVar, iDMComponent, dXTemplateItem, new Integer(i)});
        } else {
            ra3Var.b(context, sVar, iDMComponent, dXTemplateItem, i);
        }
    }

    @Deprecated(message = "老逻辑，如果验证DX Butter有效，则后面可以下线")
    public final void d(kmb kmbVar, IDMComponent iDMComponent, boolean z) {
        ViewEngine t;
        Map<String, Object> O;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90da88ac", new Object[]{this, kmbVar, iDMComponent, new Boolean(z)});
        } else if (iDMComponent != null && iDMComponent.getContainerInfo() != null && iDMComponent.getData() != null) {
            ViewManager Z = kmbVar.e();
            ckf.f(Z, "cartPresenter.viewManager");
            ViewEngine t2 = Z.t();
            ckf.f(t2, "cartPresenter.viewManager.viewEngine");
            String string = iDMComponent.getContainerInfo().getString("name");
            xzd b = ((ujt) t2.a0(ujt.class)).b(iDMComponent.getContainerType());
            if (b != null) {
                DXTemplateItem i = ((wo7) b).i(string);
                jo7 Q = t2.Q();
                ckf.f(Q, "viewEngine.dinamicXEngineManager");
                s b2 = Q.b();
                ckf.f(b2, "viewEngine.dinamicXEngineManager.dxEngine");
                HashMap hashMap = new HashMap();
                hashMap.put(xo7.TAG_DINAMICX_VIEW_COMPONENT, iDMComponent);
                ViewManager Z2 = kmbVar.e();
                if (Z2 != null && (t = Z2.t()) != null && (O = t.O()) != null) {
                    hashMap.putAll(O);
                    DXRenderOptions q = new DXRenderOptions.b().y(hashMap).q();
                    if (!z) {
                        b2.k().E0(kmbVar.getContext(), iDMComponent.getData(), i, -1, q);
                    } else if (i != null) {
                        b2.p(kmbVar.getContext(), i, iDMComponent.getData(), -1, q);
                    }
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type com.alibaba.android.ultron.vfw.template.DinamicXTemplateProvider");
            }
        }
    }

    public final boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("11a932b1", new Object[]{this})).booleanValue();
        }
        if (l9v.a("disableDXPrerender")) {
            return true;
        }
        boolean b = oa3.INSTANCE.b();
        if (f27222a || !b) {
            return true;
        }
        return false;
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f27223a;
        public final /* synthetic */ kmb b;
        public final /* synthetic */ List c;
        public final /* synthetic */ int d;

        public a(String str, kmb kmbVar, List list, int i) {
            this.f27223a = str;
            this.b = kmbVar;
            this.c = list;
            this.d = i;
        }

        /* JADX WARN: Code restructure failed: missing block: B:43:0x00c6, code lost:
            if (tb.ckf.b("header", r7) == false) goto L_0x00c9;
         */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void run() {
            /*
                Method dump skipped, instructions count: 253
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: tb.ra3.a.run():void");
        }
    }

    @JvmStatic
    public static final void c(kmb kmbVar, List<? extends IDMComponent> list, String str) {
        int e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84439b4", new Object[]{kmbVar, list, str});
            return;
        }
        ckf.g(kmbVar, "cartPresenter");
        ckf.g(str, "from");
        if (list != null && !INSTANCE.f() && (e = v9v.e(c9x.CART_BIZ_NAME, "preRenderBodyCount", 8)) > 0) {
            f27222a = true;
            pav.m(true, new a(str, kmbVar, list, e));
        }
    }

    @Deprecated(message = "老逻辑，如果验证DX Butter有效，则后面可以下线")
    @JvmStatic
    public static final void e(kmb kmbVar, List<? extends IDMComponent> list) {
        int e;
        JSONObject data;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a942796", new Object[]{kmbVar, list});
            return;
        }
        ckf.g(kmbVar, "cartPresenter");
        if (list != null && !oa3.INSTANCE.b() && (e = v9v.e(c9x.CART_BIZ_NAME, "preRenderBodyCount", 10)) > 0) {
            hav.d("CartDXPreRender", "prefetchComponents");
            HashMap hashMap = new HashMap();
            for (IDMComponent iDMComponent : list) {
                if (!(iDMComponent == null || (data = iDMComponent.getData()) == null || !iDMComponent.isNormalComponent())) {
                    String string = data.getString("position");
                    if (ckf.b("footer", string) || ckf.b("header", string) || ckf.b("tabCard", data.getString("tag"))) {
                        INSTANCE.d(kmbVar, iDMComponent, true);
                    } else if (e > 0) {
                        if (iDMComponent.getContainerInfo() != null) {
                            str = iDMComponent.getContainerInfo().getString("name");
                        } else {
                            str = "";
                        }
                        if (!TextUtils.isEmpty(str)) {
                            INSTANCE.d(kmbVar, iDMComponent, hashMap.get(str) == null);
                            ckf.f(str, yh6.CONFIG_KEY_TEMPLATE_NAME);
                            hashMap.put(str, Boolean.TRUE);
                            e--;
                        }
                    }
                }
            }
        }
    }

    public final void b(Context context, s sVar, IDMComponent iDMComponent, DXTemplateItem dXTemplateItem, int i) {
        DinamicXEngine k;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ceae40e1", new Object[]{this, context, sVar, iDMComponent, dXTemplateItem, new Integer(i)});
            return;
        }
        String e = dXTemplateItem.e();
        String c = oa3.INSTANCE.c();
        ckf.f(e, "name");
        if (wsq.O(c, e, false, 2, null)) {
            DXTemplateItem i2 = sVar.i(dXTemplateItem);
            DXTemplateItem dXTemplateItem2 = i2 != null ? i2 : dXTemplateItem;
            JSONObject data = iDMComponent.getData();
            if (data != null && (k = sVar.k()) != null) {
                k.C0(context, dXTemplateItem2, data, i, new DXRenderOptions.b().y(new LinkedHashMap()).q());
            }
        }
    }
}
