package tb;

import android.content.Context;
import android.os.AsyncTask;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRenderOptions;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.detail.rate.vivid.ability.RegisterReceiverAbility;
import com.taobao.detail.rate.vivid.utils.WeexUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Ref$BooleanRef;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ltb/lnm;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "tb_rate_display_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class lnm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f23444a;
    public DinamicXEngine b;
    public final y7 c = new y7(new zq(d1g.INSTANCE.c(), "DX"), null);
    public final RegisterReceiverAbility.a d = new RegisterReceiverAbility.a();
    public boolean e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a implements iwb {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Ref$BooleanRef b;
        public final /* synthetic */ JSONObject c;
        public final /* synthetic */ DXRenderOptions.b d;

        public a(Ref$BooleanRef ref$BooleanRef, JSONObject jSONObject, DXRenderOptions.b bVar) {
            this.b = ref$BooleanRef;
            this.c = jSONObject;
            this.d = bVar;
        }

        @Override // tb.iwb
        public final void onNotificationListener(k66 k66Var) {
            DXTemplateItem dXTemplateItem;
            Object obj;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2f1f5baf", new Object[]{this, k66Var});
                return;
            }
            List<DXTemplateItem> list = k66Var.f22428a;
            if (list != null && !list.isEmpty()) {
                List<DXTemplateItem> list2 = k66Var.f22428a;
                ckf.f(list2, "result.finishedTemplateItems");
                Iterator<T> it = list2.iterator();
                while (true) {
                    dXTemplateItem = null;
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((DXTemplateItem) obj).f7343a.equals("tb_rate_list_layout_outline")) {
                        break;
                    }
                }
                DXTemplateItem dXTemplateItem2 = (DXTemplateItem) obj;
                if (dXTemplateItem2 != null) {
                    Ref$BooleanRef ref$BooleanRef = this.b;
                    if (!ref$BooleanRef.element) {
                        ref$BooleanRef.element = true;
                        DinamicXEngine d = lnm.d(lnm.this);
                        if (d != null) {
                            dXTemplateItem = d.u(dXTemplateItem2);
                        }
                        DinamicXEngine d2 = lnm.d(lnm.this);
                        if (d2 != null) {
                            d2.B0(lnm.c(lnm.this), dXTemplateItem, this.c, 0, this.d.q());
                        }
                    }
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class b implements iwb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Ref$BooleanRef f23446a;
        public final /* synthetic */ JSONObject b;
        public final /* synthetic */ DXRenderOptions.b c;
        public final /* synthetic */ lnm d;

        public b(Ref$BooleanRef ref$BooleanRef, JSONObject jSONObject, DXRenderOptions.b bVar, lnm lnmVar, JSONObject jSONObject2) {
            this.f23446a = ref$BooleanRef;
            this.b = jSONObject;
            this.c = bVar;
            this.d = lnmVar;
        }

        @Override // tb.iwb
        public final void onNotificationListener(k66 k66Var) {
            DXRenderOptions dXRenderOptions;
            Object obj;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2f1f5baf", new Object[]{this, k66Var});
                return;
            }
            List<DXTemplateItem> list = k66Var.f22428a;
            if (list != null && !list.isEmpty()) {
                List<DXTemplateItem> list2 = k66Var.f22428a;
                ckf.f(list2, "result.finishedTemplateItems");
                Iterator<T> it = list2.iterator();
                while (true) {
                    dXRenderOptions = null;
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((DXTemplateItem) obj).f7343a.equals(n9l.INSTANCE.m())) {
                        break;
                    }
                }
                DXTemplateItem dXTemplateItem = (DXTemplateItem) obj;
                if (dXTemplateItem != null && !this.f23446a.element) {
                    DinamicXEngine d = lnm.d(this.d);
                    DXTemplateItem u = d != null ? d.u(dXTemplateItem) : null;
                    this.f23446a.element = true;
                    DinamicXEngine d2 = lnm.d(this.d);
                    if (d2 != null) {
                        Context c = lnm.c(this.d);
                        JSONObject jSONObject = this.b;
                        DXRenderOptions.b bVar = this.c;
                        if (bVar != null) {
                            dXRenderOptions = bVar.q();
                        }
                        d2.B0(c, u, jSONObject, 0, dXRenderOptions);
                    }
                    v7t.d(d1g.INSTANCE.a(), "结束预渲染：无历史渲染");
                }
                u38.INSTANCE.d(k66Var);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class c extends AsyncTask<Void, Void, JSONObject> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/detail/rate/vivid/utils/PreRenderContext$initializeASync$initializeTask$1");
        }

        /* renamed from: a */
        public JSONObject doInBackground(Void... voidArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("d2643697", new Object[]{this, voidArr});
            }
            ckf.g(voidArr, "params");
            JSONObject parseObject = JSON.parseObject(zhn.C(lnm.c(lnm.this), "rate_list_prerender_data.json"));
            v7t.d(d1g.INSTANCE.a(), "预渲染JSON解析完毕.");
            ckf.f(parseObject, "paramsInfo");
            return parseObject;
        }

        /* renamed from: b */
        public void onPostExecute(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b09895b3", new Object[]{this, jSONObject});
            } else if (lnm.e(lnm.this)) {
                lnm.b(lnm.this, jSONObject);
                lnm.a(lnm.this);
            }
        }
    }

    public lnm(Context context) {
        ckf.g(context, "context");
        this.f23444a = context;
    }

    public static final /* synthetic */ void a(lnm lnmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a01b88a", new Object[]{lnmVar});
        } else {
            lnmVar.f();
        }
    }

    public static final /* synthetic */ void b(lnm lnmVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6313ac1a", new Object[]{lnmVar, jSONObject});
        } else {
            lnmVar.g(jSONObject);
        }
    }

    public static final /* synthetic */ Context c(lnm lnmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("ef2f3244", new Object[]{lnmVar});
        }
        return lnmVar.f23444a;
    }

    public static final /* synthetic */ DinamicXEngine d(lnm lnmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DinamicXEngine) ipChange.ipc$dispatch("5652c46e", new Object[]{lnmVar});
        }
        return lnmVar.b;
    }

    public static final /* synthetic */ boolean e(lnm lnmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("859a000b", new Object[]{lnmVar})).booleanValue();
        }
        return lnmVar.e;
    }

    public final y7 h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (y7) ipChange.ipc$dispatch("d543e49c", new Object[]{this});
        }
        return this.c;
    }

    public final DinamicXEngine i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DinamicXEngine) ipChange.ipc$dispatch("183ff254", new Object[]{this});
        }
        return this.b;
    }

    public final RegisterReceiverAbility.a j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RegisterReceiverAbility.a) ipChange.ipc$dispatch("c8ba043d", new Object[]{this});
        }
        return this.d;
    }

    public final void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b110817", new Object[]{this});
        } else {
            l(false);
        }
    }

    public final void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfe9a373", new Object[]{this});
        } else {
            new c().execute(new Void[0]);
        }
    }

    public final void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33807952", new Object[]{this});
            return;
        }
        JSONObject parseObject = JSON.parseObject(zhn.C(this.f23444a, "rate_list_prerender_data.json"));
        v7t.d(d1g.INSTANCE.a(), "预渲染JSON解析完毕.");
        g(parseObject);
        f();
    }

    public final void g(JSONObject jSONObject) {
        DinamicXEngine dinamicXEngine;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71061ae", new Object[]{this, jSONObject});
            return;
        }
        if (WeexUtils.INSTANCE.e()) {
            yxr.b(10);
        }
        JSONObject r = n9l.INSTANCE.r();
        if (r != null) {
            this.b = u38.INSTANCE.b(this.c, this.d, this.f23444a);
            DXRenderOptions.b bVar = new DXRenderOptions.b();
            DXTemplateItem dXTemplateItem = new DXTemplateItem();
            JSONObject jSONObject2 = new JSONObject();
            Long l = r.getLong("version");
            ckf.f(l, "it.getLong(\"version\")");
            dXTemplateItem.b = l.longValue();
            dXTemplateItem.f7343a = r.getString("name");
            dXTemplateItem.c = r.getString("url");
            jSONObject2.put((JSONObject) "params", (String) jSONObject);
            DinamicXEngine dinamicXEngine2 = this.b;
            DXTemplateItem u = dinamicXEngine2 != null ? dinamicXEngine2.u(dXTemplateItem) : null;
            Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
            ref$BooleanRef.element = false;
            if (u == null || u.b != dXTemplateItem.b) {
                v7t.d(d1g.INSTANCE.a(), "有新版本，下载新版本");
                ArrayList arrayList = new ArrayList();
                arrayList.add(dXTemplateItem);
                DinamicXEngine dinamicXEngine3 = this.b;
                if (dinamicXEngine3 != null) {
                    dinamicXEngine3.p(arrayList);
                }
                if (u == null && (dinamicXEngine = this.b) != null) {
                    dinamicXEngine.a1(new b(ref$BooleanRef, jSONObject2, bVar, this, jSONObject));
                }
            }
            if (u != null) {
                DinamicXEngine dinamicXEngine4 = this.b;
                if (dinamicXEngine4 != null) {
                    dinamicXEngine4.B0(this.f23444a, u, jSONObject2, 0, bVar.q());
                }
                v7t.d(d1g.INSTANCE.a(), "结束预渲染：有历史渲染");
            }
        }
    }

    public final void l(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e710ad9d", new Object[]{this, new Boolean(z)});
        } else if (!this.e && onm.INSTANCE.b()) {
            this.e = true;
            v7t.d(d1g.INSTANCE.a(), "开始预渲染.");
            if (z) {
                n();
            } else {
                m();
            }
        }
    }

    public final void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
            return;
        }
        v7t.d(d1g.INSTANCE.a(), "预渲染销毁.");
        DinamicXEngine dinamicXEngine = this.b;
        if (dinamicXEngine != null) {
            dinamicXEngine.m();
        }
        qbv j = qbv.j();
        ckf.f(j, "UltronTradeHybridManager.getInstance()");
        j.p().b("");
        if (n9l.INSTANCE.b0()) {
            DinamicXEngine dinamicXEngine2 = this.b;
            if (dinamicXEngine2 != null) {
                dinamicXEngine2.q0();
            }
            this.b = null;
        }
        this.e = false;
    }

    public final void f() {
        Long l;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ba1b88e", new Object[]{this});
            return;
        }
        DXRenderOptions.b bVar = new DXRenderOptions.b();
        JSONObject parseObject = JSON.parseObject(zhn.C(this.f23444a, "rate_list_outline_prerender_data.json"));
        DXTemplateItem dXTemplateItem = new DXTemplateItem();
        JSONObject s = n9l.INSTANCE.s();
        dXTemplateItem.b = (s == null || (l = s.getLong("version")) == null) ? 0L : l.longValue();
        dXTemplateItem.f7343a = s != null ? s.getString("name") : null;
        dXTemplateItem.c = s != null ? s.getString("url") : null;
        DinamicXEngine dinamicXEngine = this.b;
        DXTemplateItem u = dinamicXEngine != null ? dinamicXEngine.u(dXTemplateItem) : null;
        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        ref$BooleanRef.element = false;
        if (u == null || u.b != dXTemplateItem.b) {
            v7t.d(d1g.INSTANCE.a(), "骨架图有新版本，下载新版本");
            List<DXTemplateItem> m = yz3.m(dXTemplateItem);
            DinamicXEngine dinamicXEngine2 = this.b;
            if (dinamicXEngine2 != null) {
                dinamicXEngine2.p(m);
            }
            DinamicXEngine dinamicXEngine3 = this.b;
            if (dinamicXEngine3 != null) {
                dinamicXEngine3.a1(new a(ref$BooleanRef, parseObject, bVar));
                return;
            }
            return;
        }
        DinamicXEngine dinamicXEngine4 = this.b;
        if (dinamicXEngine4 != null) {
            dinamicXEngine4.B0(this.f23444a, u, parseObject, 0, bVar.q());
        }
        v7t.d(d1g.INSTANCE.a(), "骨架图结束预渲染：有历史渲染");
    }
}
