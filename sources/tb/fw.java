package tb;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.ability.localization.Localization;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.nx3.bean.MuiseBean;
import com.taobao.android.searchbaseframe.nx3.bean.TemplateBean;
import com.taobao.android.searchbaseframe.track.XSWeexRenderTrackEvent;
import com.taobao.android.searchbaseframe.uikit.screentype.ScreenType;
import com.taobao.android.weex_framework.MUSAppMonitor;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.MUSInstanceConfig;
import com.taobao.android.xsearchplugin.muise.SFMuiseSDK;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.Map;
import tb.f8b;
import tb.rpc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public abstract class fw implements tzd {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_WIDGET_CONTEXT = "widgetContext";

    /* renamed from: a  reason: collision with root package name */
    public final yko f19561a;
    public com.taobao.android.weex_framework.a b;
    public final Activity c;
    public Context d;
    public final npc e;
    public dxc f;
    public cnx g;
    public vde h;
    public long i;
    public String j;
    public boolean k;
    public boolean m;
    public String n;
    public String o;
    public String p;
    public String q;
    public Float r;
    public ree s;
    public final aod t;
    public Runnable w;
    public String x;
    public int l = -1;
    public boolean u = true;
    public boolean v = true;
    public boolean y = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ MuiseBean f19563a;
        public final /* synthetic */ Map b;

        public b(MuiseBean muiseBean, Map map) {
            this.f19563a = muiseBean;
            this.b = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                fw.k(fw.this, this.f19563a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class d implements DialogInterface.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f19565a;
        public final /* synthetic */ String b;

        public d(String str, String str2) {
            this.f19565a = str;
            this.b = str2;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
            } else {
                dr3.s2(fw.this.s(), fw.n(fw.this), this.f19565a, this.b, "muise");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class e extends f8b.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f19566a;
        public final /* synthetic */ MuiseBean b;
        public final /* synthetic */ Map c;
        public final /* synthetic */ int d;

        public e(String str, MuiseBean muiseBean, Map map, int i) {
            this.f19566a = str;
            this.b = muiseBean;
            this.c = map;
            this.d = i;
        }

        public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/xsearchplugin/muise/AbsMuiseRender$5");
        }

        @Override // tb.f8b.b
        public void b(nsj nsjVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dfadf5c0", new Object[]{this, nsjVar});
            } else if (nsjVar.h()) {
                fw fwVar = fw.this;
                String str = this.f19566a;
                fw.e(fwVar, str, "" + nsjVar.b().getCode(), nsjVar.b().getMsg());
            } else {
                TemplateBean templateBean = new TemplateBean();
                templateBean.binary = true;
                templateBean.url = this.f19566a;
                templateBean.version = "0";
                templateBean.templateName = this.b.type;
                rit ritVar = new rit(nsjVar.a());
                fw.i(fw.this, this.b.type);
                fw fwVar2 = fw.this;
                Map map = this.c;
                fw.f(fwVar2, map, templateBean, templateBean.getFileName() + "_local", ritVar, this.b.type, templateBean.version, this.d);
            }
        }
    }

    static {
        t2o.a(993002123);
        t2o.a(993001762);
    }

    public fw(Activity activity, yko ykoVar, npc npcVar, cnx cnxVar) {
        this.c = activity;
        this.f19561a = ykoVar;
        this.e = npcVar;
        this.g = cnxVar;
        if (activity instanceof aod) {
            this.t = (aod) activity;
        }
    }

    public static /* synthetic */ npc b(fw fwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (npc) ipChange.ipc$dispatch("76cd9fb5", new Object[]{fwVar});
        }
        return fwVar.e;
    }

    public static /* synthetic */ long d(fw fwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fe5e515b", new Object[]{fwVar})).longValue();
        }
        return fwVar.i;
    }

    public static /* synthetic */ void e(fw fwVar, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2eada8d7", new Object[]{fwVar, str, str2, str3});
        } else {
            fwVar.D(str, str2, str3);
        }
    }

    public static /* synthetic */ boolean f(fw fwVar, Map map, TemplateBean templateBean, String str, rit ritVar, String str2, String str3, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("772e3781", new Object[]{fwVar, map, templateBean, str, ritVar, str2, str3, new Integer(i)})).booleanValue();
        }
        return fwVar.M(map, templateBean, str, ritVar, str2, str3, i);
    }

    public static /* synthetic */ aod g(fw fwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (aod) ipChange.ipc$dispatch("64de8e2f", new Object[]{fwVar});
        }
        return fwVar.t;
    }

    public static /* synthetic */ String h(fw fwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("602b829b", new Object[]{fwVar});
        }
        return fwVar.n;
    }

    public static /* synthetic */ String i(fw fwVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ec8afdd3", new Object[]{fwVar, str});
        }
        fwVar.n = str;
        return str;
    }

    public static /* synthetic */ int j(fw fwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bb19a037", new Object[]{fwVar})).intValue();
        }
        return fwVar.l;
    }

    public static /* synthetic */ boolean k(fw fwVar, MuiseBean muiseBean, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fa8b8103", new Object[]{fwVar, muiseBean, map})).booleanValue();
        }
        return fwVar.O(muiseBean, map);
    }

    public static /* synthetic */ yko l(fw fwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yko) ipChange.ipc$dispatch("ebd3cbdf", new Object[]{fwVar});
        }
        return fwVar.f19561a;
    }

    public static /* synthetic */ boolean m(fw fwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("77d4ef25", new Object[]{fwVar})).booleanValue();
        }
        return fwVar.u;
    }

    public static /* synthetic */ Activity n(fw fwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("86df33e8", new Object[]{fwVar});
        }
        return fwVar.c;
    }

    public static /* synthetic */ void o(fw fwVar, TemplateBean templateBean, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e423e1ad", new Object[]{fwVar, templateBean, str, str2});
        } else {
            fwVar.C(templateBean, str, str2);
        }
    }

    public abstract void A(com.taobao.android.weex_framework.a aVar);

    public abstract void B(com.taobao.android.weex_framework.a aVar);

    public final void C(TemplateBean templateBean, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe267d83", new Object[]{this, templateBean, str, str2});
        } else {
            E(templateBean.toPrintString(), str, str2, templateBean.url);
        }
    }

    public final void D(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b275cd3", new Object[]{this, str, str2, str3});
            return;
        }
        E("LocalDev: \n  " + str, str2, str3, str);
    }

    public final void E(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b74693a", new Object[]{this, str, str2, str3, str4});
        } else if (s().g().isDebug()) {
            s().f().h().getClass();
            if (vvh.m()) {
                AlertDialog.Builder title = new AlertDialog.Builder(this.c).setPositiveButton("查看源码", new d(str3, str4)).setNegativeButton(Localization.q(R.string.app_sure), (DialogInterface.OnClickListener) null).setTitle("MuiseError(Debug包)");
                title.setMessage(str + "\n------------\n\n" + str2 + "\n\n" + str3).show();
            }
        }
    }

    public void F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        com.taobao.android.weex_framework.a aVar = this.b;
        if (aVar != null) {
            aVar.onActivityPause();
            this.b.onActivityStop();
        }
    }

    public abstract void G();

    public abstract rpc.c H(String str);

    public void I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        com.taobao.android.weex_framework.a aVar = this.b;
        if (aVar != null) {
            aVar.onActivityStart();
            this.b.onActivityResume();
        }
    }

    public void J(com.taobao.android.weex_framework.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b7d1e41", new Object[]{this, aVar});
            return;
        }
        this.b = aVar;
        if (aVar != null) {
            aVar.setTag(SFMuiseSDK.MUISE_EVENT_LISTENER, this.g);
            dxc dxcVar = this.f;
            if (dxcVar != null) {
                dxcVar.P(this.b);
            }
            A(this.b);
            ree reeVar = this.s;
            if (reeVar != null) {
                this.b.setTag(KEY_WIDGET_CONTEXT, reeVar);
            }
            this.b.registerRenderListener(new a());
        }
    }

    public boolean P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("49ed62c0", new Object[]{this})).booleanValue();
        }
        if (this.b != null) {
            return true;
        }
        return false;
    }

    public void Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9cf6144", new Object[]{this});
            return;
        }
        com.taobao.android.weex_framework.a aVar = this.b;
        if (aVar != null) {
            aVar.sendInstanceMessage("appear", null);
        }
    }

    public void R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e22c0802", new Object[]{this});
            return;
        }
        com.taobao.android.weex_framework.a aVar = this.b;
        if (aVar != null) {
            aVar.sendInstanceMessage("disappear", null);
        }
    }

    public void S(cnx cnxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e61f287d", new Object[]{this, cnxVar});
            return;
        }
        this.g = cnxVar;
        com.taobao.android.weex_framework.a aVar = this.b;
        if (aVar != null) {
            aVar.setTag(SFMuiseSDK.MUISE_EVENT_LISTENER, cnxVar);
        }
    }

    public void T(Float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e3bb1af", new Object[]{this, f});
        } else {
            this.r = f;
        }
    }

    public void U(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f9c479c", new Object[]{this, str});
        } else {
            this.p = str;
        }
    }

    public void V(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1c25acf", new Object[]{this, context});
        } else {
            this.d = context;
        }
    }

    public void W(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d881fe16", new Object[]{this, new Integer(i)});
        } else {
            this.l = i;
        }
    }

    public void X(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14cebf3f", new Object[]{this, new Boolean(z)});
        } else {
            this.v = z;
        }
    }

    public void Y(vde vdeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30ecda56", new Object[]{this, vdeVar});
        } else {
            this.h = vdeVar;
        }
    }

    public void Z(dxc dxcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34a9ebba", new Object[]{this, dxcVar});
        } else {
            this.f = dxcVar;
        }
    }

    public void a0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a5935cd", new Object[]{this, str});
        } else {
            this.q = str;
        }
    }

    public void b0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b97d805", new Object[]{this, new Boolean(z)});
        } else {
            this.u = z;
        }
    }

    public void c0(ree reeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dde63adb", new Object[]{this, reeVar});
        } else {
            this.s = reeVar;
        }
    }

    public boolean d0(com.taobao.android.weex_framework.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("412b0be7", new Object[]{this, aVar})).booleanValue();
        }
        if (!this.f19561a.f().h().f || aVar == null) {
            return false;
        }
        if (aVar.isDestroyed() || this.c.isFinishing()) {
            return true;
        }
        return false;
    }

    public void p(ViewGroup viewGroup, com.taobao.android.weex_framework.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("830b06ef", new Object[]{this, viewGroup, aVar});
        } else {
            q(viewGroup, aVar, true);
        }
    }

    public void q(ViewGroup viewGroup, com.taobao.android.weex_framework.a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de5689c5", new Object[]{this, viewGroup, aVar, new Boolean(z)});
        } else {
            r(viewGroup, aVar, z, -1, -2);
        }
    }

    public void r(ViewGroup viewGroup, com.taobao.android.weex_framework.a aVar, boolean z, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2e98ce5", new Object[]{this, viewGroup, aVar, new Boolean(z), new Integer(i), new Integer(i2)});
            return;
        }
        c4p l = s().l();
        l.b("AbsMuiseRender", "Muise Render success: " + this.j);
        if (viewGroup == null) {
            s().l().d("AbsMuiseRender", "frameContainer is null");
        } else if (aVar == null) {
            s().l().d("AbsMuiseRender", "MUSInstance is null");
        } else if (!aVar.isDestroyed()) {
            View renderRoot = aVar.getRenderRoot();
            igw.a(renderRoot);
            if (z) {
                viewGroup.removeAllViews();
            }
            viewGroup.addView(renderRoot, i, i2);
            s().f().h().getClass();
        }
    }

    public final yko s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yko) ipChange.ipc$dispatch("827434f7", new Object[]{this});
        }
        return this.f19561a;
    }

    public void u() {
        vde vdeVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        com.taobao.android.weex_framework.a aVar = this.b;
        if (aVar != null) {
            aVar.destroy();
            B(this.b);
            this.b = null;
        }
        this.w = null;
        if (this.y && (vdeVar = this.h) != null) {
            ((j4p) vdeVar).q3(this.x, this);
        }
    }

    public Activity v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("81223f9c", new Object[]{this});
        }
        return this.c;
    }

    public int w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("564573a4", new Object[]{this})).intValue();
        }
        com.taobao.android.weex_framework.a aVar = this.b;
        if (aVar != null) {
            return aVar.getRootHeight();
        }
        return 0;
    }

    public final com.taobao.android.weex_framework.a x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.weex_framework.a) ipChange.ipc$dispatch("8de11e1e", new Object[]{this});
        }
        return this.b;
    }

    public abstract TemplateBean y(MuiseBean muiseBean);

    public boolean z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a4e3d96", new Object[]{this})).booleanValue();
        }
        return this.k;
    }

    @Override // tb.tzd
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38126c45", new Object[]{this});
            return;
        }
        npc npcVar = this.e;
        if (npcVar != null) {
            npcVar.onRenderFailed(null, 16, "template download failed", true);
        }
    }

    @Override // tb.tzd
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c779129", new Object[]{this});
            return;
        }
        c4p.a("template", this.n + " 模板下载成功", new Object[0]);
        Runnable runnable = this.w;
        if (runnable != null) {
            runnable.run();
            this.w = null;
            c4p.a("template", this.n + " 触发重新渲染", new Object[0]);
        }
    }

    public boolean L(MuiseBean muiseBean, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2633d8bd", new Object[]{this, muiseBean, map})).booleanValue();
        }
        this.w = null;
        if (muiseBean == null) {
            this.f19561a.l().d("AbsMuiseRender", "bean is null");
            return false;
        } else if (!t()) {
            this.f19561a.l().d("AbsMuiseRender", "state not legal");
            return false;
        } else {
            if (!this.m) {
                G();
                this.m = true;
            }
            if (vit.b(this.f19561a)) {
                String a2 = vit.a(muiseBean.type);
                if (!TextUtils.isEmpty(a2) && a2.startsWith("http")) {
                    s().l().A("AbsMuiseRender", "使用测试模板进行");
                    return N(muiseBean, map, a2);
                }
            }
            return O(muiseBean, map);
        }
    }

    public boolean t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8eb83aac", new Object[]{this})).booleanValue();
        }
        if (this.c == null) {
            this.f19561a.l().d("AbsMuiseRender", "activity is null");
            return false;
        } else if (this.e != null) {
            return true;
        } else {
            this.f19561a.l().d("AbsMuiseRender", "renderListener is null");
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements npc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.npc
        public void onDestroyed(MUSDKInstance mUSDKInstance) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("32f7f995", new Object[]{this, mUSDKInstance});
            } else if (fw.b(fw.this) != null) {
                fw.b(fw.this).onDestroyed(mUSDKInstance);
            }
        }

        @Override // tb.npc
        public void onJSException(com.taobao.android.weex_framework.a aVar, int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8c41b6de", new Object[]{this, aVar, new Integer(i), str});
                return;
            }
            a(aVar, String.valueOf(i), str);
            if (fw.b(fw.this) != null) {
                fw.b(fw.this).onJSException(aVar, i, str);
            }
            if (fw.g(fw.this) != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("tItemType", fw.h(fw.this));
                hashMap.put("index", String.valueOf(fw.j(fw.this)));
                hashMap.put("errMsg", str);
                fw.g(fw.this).D2("JSException", hashMap);
            }
        }

        @Override // tb.npc
        public void onPrepareSuccess(com.taobao.android.weex_framework.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("27a2635b", new Object[]{this, aVar});
            } else if (fw.b(fw.this) != null) {
                fw.b(fw.this).onPrepareSuccess(aVar);
            }
        }

        @Override // tb.npc
        public void onRefreshSuccess(com.taobao.android.weex_framework.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("963c382f", new Object[]{this, aVar});
                return;
            }
            System.currentTimeMillis();
            fw.d(fw.this);
            c4p.D("[XS.render]", "[Muise refresh] Success, tItemType: %s, to index: %d", fw.h(fw.this), Integer.valueOf(fw.j(fw.this)));
            if (fw.b(fw.this) != null) {
                fw.b(fw.this).onRefreshSuccess(aVar);
            }
        }

        @Override // tb.npc
        public void onRenderFailed(com.taobao.android.weex_framework.a aVar, int i, String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cc0cbe2b", new Object[]{this, aVar, new Integer(i), str, new Boolean(z)});
                return;
            }
            a(aVar, String.valueOf(i), str);
            if (fw.b(fw.this) != null) {
                fw.b(fw.this).onRenderFailed(aVar, i, str, z);
            }
            if (fw.g(fw.this) != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("tItemType", fw.h(fw.this));
                hashMap.put("index", String.valueOf(fw.j(fw.this)));
                hashMap.put("errMsg", str);
                fw.g(fw.this).D2("MuiseRender", hashMap);
            }
        }

        @Override // tb.npc
        public void onRenderSuccess(com.taobao.android.weex_framework.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2b2aeb48", new Object[]{this, aVar});
                return;
            }
            System.currentTimeMillis();
            fw.d(fw.this);
            if (fw.b(fw.this) != null) {
                fw.b(fw.this).onRenderSuccess(aVar);
            }
        }

        @Override // tb.npc
        public void onRefreshFailed(com.taobao.android.weex_framework.a aVar, int i, String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cc0861e4", new Object[]{this, aVar, new Integer(i), str, new Boolean(z)});
                return;
            }
            a(aVar, String.valueOf(i), str);
            c4p.C("[XS.render]", "[Muise refresh] Failed, tItemType: %s, to index: %d, error: %s", fw.h(fw.this), Integer.valueOf(fw.j(fw.this)), str);
            if (fw.b(fw.this) != null) {
                fw.b(fw.this).onRefreshFailed(aVar, i, str, z);
            }
            if (fw.g(fw.this) != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("tItemType", fw.h(fw.this));
                hashMap.put("index", String.valueOf(fw.j(fw.this)));
                hashMap.put("errMsg", str);
                fw.g(fw.this).D2("MuiseRefresh", hashMap);
            }
        }

        public void a(com.taobao.android.weex_framework.a aVar, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7964bada", new Object[]{this, aVar, str, str2});
                return;
            }
            c4p.C("[XS.render]", "[Muise error] tItemType: %s, index: %d, errorCode: %s, error: %s", fw.h(fw.this), Integer.valueOf(fw.j(fw.this)), str, str2);
            if (fw.g(fw.this) != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("tItemType", fw.h(fw.this));
                hashMap.put("index", String.valueOf(fw.j(fw.this)));
                hashMap.put("errMsg", str2);
                hashMap.put("errCode", str);
                fw.g(fw.this).D2("RenderException", hashMap);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c implements npc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f19564a;
        public final /* synthetic */ int b;
        public final /* synthetic */ TemplateBean c;

        public c(String str, int i, TemplateBean templateBean) {
            this.f19564a = str;
            this.b = i;
            this.c = templateBean;
        }

        @Override // tb.npc
        public void onDestroyed(MUSDKInstance mUSDKInstance) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("32f7f995", new Object[]{this, mUSDKInstance});
            } else if (fw.b(fw.this) != null) {
                fw.b(fw.this).onDestroyed(mUSDKInstance);
            }
        }

        @Override // tb.npc
        public void onJSException(com.taobao.android.weex_framework.a aVar, int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8c41b6de", new Object[]{this, aVar, new Integer(i), str});
                return;
            }
            a(aVar, String.valueOf(i), str);
            if (fw.b(fw.this) != null) {
                fw.b(fw.this).onJSException(aVar, i, str);
            }
            if (fw.g(fw.this) != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("tItemType", fw.h(fw.this));
                hashMap.put("index", String.valueOf(fw.j(fw.this)));
                hashMap.put("errMsg", str);
                fw.g(fw.this).D2("JSException", hashMap);
            }
        }

        @Override // tb.npc
        public void onPrepareSuccess(com.taobao.android.weex_framework.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("27a2635b", new Object[]{this, aVar});
            } else if (fw.b(fw.this) != null) {
                fw.b(fw.this).onPrepareSuccess(aVar);
            }
        }

        @Override // tb.npc
        public void onRefreshSuccess(com.taobao.android.weex_framework.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("963c382f", new Object[]{this, aVar});
                return;
            }
            long currentTimeMillis = System.currentTimeMillis() - fw.d(fw.this);
            fw.l(fw.this).l().c("AbsMuiseRender", "Muise Refresh time: %d, fileName: %s", Long.valueOf(currentTimeMillis), this.f19564a);
            c4p.D("[XS.render]", "[Muise refresh] Success, tItemType: %s, to index: %d", fw.h(fw.this), Integer.valueOf(fw.j(fw.this)));
            if (fw.m(fw.this)) {
                fw.l(fw.this).i().k(XSWeexRenderTrackEvent.b(fw.n(fw.this), this.c, currentTimeMillis));
            }
            if (fw.b(fw.this) != null) {
                fw.b(fw.this).onRefreshSuccess(aVar);
            }
        }

        @Override // tb.npc
        public void onRenderSuccess(com.taobao.android.weex_framework.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2b2aeb48", new Object[]{this, aVar});
                return;
            }
            long currentTimeMillis = System.currentTimeMillis() - fw.d(fw.this);
            fw.l(fw.this).l().c("AbsMuiseRender", "Muise render time: %d, fileName: %s", Long.valueOf(currentTimeMillis), this.f19564a);
            c4p.D("[XS.render]", "[Muise render] Success, tItemType: %s, index: %d", fw.h(fw.this), Integer.valueOf(this.b));
            if (fw.m(fw.this)) {
                fw.l(fw.this).i().k(XSWeexRenderTrackEvent.c(fw.n(fw.this), this.c, currentTimeMillis));
            }
            if (fw.b(fw.this) != null) {
                fw.b(fw.this).onRenderSuccess(aVar);
            }
        }

        @Override // tb.npc
        public void onRefreshFailed(com.taobao.android.weex_framework.a aVar, int i, String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cc0861e4", new Object[]{this, aVar, new Integer(i), str, new Boolean(z)});
                return;
            }
            a(aVar, String.valueOf(i), str);
            c4p.C("[XS.render]", "[Muise refresh] Failed, tItemType: %s, to index: %d, error: %s", fw.h(fw.this), Integer.valueOf(fw.j(fw.this)), str);
            if (fw.b(fw.this) != null) {
                fw.b(fw.this).onRefreshFailed(aVar, i, str, z);
            }
            if (fw.g(fw.this) != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("tItemType", fw.h(fw.this));
                hashMap.put("index", String.valueOf(fw.j(fw.this)));
                hashMap.put("errMsg", str);
                fw.g(fw.this).D2("MuiseRefresh", hashMap);
            }
        }

        @Override // tb.npc
        public void onRenderFailed(com.taobao.android.weex_framework.a aVar, int i, String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cc0cbe2b", new Object[]{this, aVar, new Integer(i), str, new Boolean(z)});
                return;
            }
            a(aVar, String.valueOf(i), str);
            c4p.C("[XS.render]", "[Muise render] Failed, tItemType: %s, index: %d, error: %s", fw.h(fw.this), Integer.valueOf(this.b), str);
            if (fw.b(fw.this) != null) {
                fw.b(fw.this).onRenderFailed(aVar, i, str, z);
            }
            if (fw.g(fw.this) != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("tItemType", fw.h(fw.this));
                hashMap.put("index", String.valueOf(fw.j(fw.this)));
                hashMap.put("errMsg", str);
                fw.g(fw.this).D2("MuiseRender", hashMap);
            }
        }

        public void a(com.taobao.android.weex_framework.a aVar, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7964bada", new Object[]{this, aVar, str, str2});
                return;
            }
            fw.o(fw.this, this.c, str, str2);
            c4p.C("[XS.render]", "[Muise error] tItemType: %s, index: %d, errorCode: %s, error: %s", fw.h(fw.this), Integer.valueOf(fw.j(fw.this)), str, str2);
            fw.l(fw.this).i().k(XSWeexRenderTrackEvent.a(fw.n(fw.this), this.c, str, str2));
            if (fw.g(fw.this) != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("tItemType", fw.h(fw.this));
                hashMap.put("index", String.valueOf(fw.j(fw.this)));
                hashMap.put("errMsg", str2);
                hashMap.put("errCode", str);
                fw.g(fw.this).D2("RenderException", hashMap);
            }
        }
    }

    public final boolean M(Map<String, Object> map, TemplateBean templateBean, String str, rit ritVar, String str2, String str3, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fbeff6c7", new Object[]{this, map, templateBean, str, ritVar, str2, str3, new Integer(i)})).booleanValue();
        }
        if (ritVar.f27415a == null) {
            this.f19561a.l().g("AbsMuiseRender", "Muise template null", new Object[0]);
            return false;
        }
        String str4 = this.p;
        if (str4 == null) {
            str4 = templateBean.url;
        }
        MUSInstanceConfig mUSInstanceConfig = new MUSInstanceConfig();
        String str5 = templateBean.url;
        if (TextUtils.isEmpty(str5)) {
            str5 = str4;
        }
        mUSInstanceConfig.p(str5);
        mUSInstanceConfig.x(this.f19561a.f().h().b);
        Float f = this.r;
        if (f != null) {
            mUSInstanceConfig.z(f.floatValue());
        }
        Context context = this.d;
        if (context != null) {
            this.b = anx.a(context, this.g, mUSInstanceConfig);
        } else {
            this.b = anx.a(this.c, this.g, mUSInstanceConfig);
        }
        dxc dxcVar = this.f;
        if (dxcVar != null) {
            dxcVar.P(this.b);
        }
        A(this.b);
        this.b.setTag(SFMuiseSDK.MUISE_BUNDLE_TYPE, templateBean.getFileName());
        ree reeVar = this.s;
        if (reeVar != null) {
            this.b.setTag(KEY_WIDGET_CONTEXT, reeVar);
        }
        this.b.registerRenderListener(this.e);
        this.b.addInstanceEnv("bundleUrl", str4);
        com.taobao.android.weex_framework.c monitorInfo = this.b.getMonitorInfo();
        monitorInfo.q(this.p);
        monitorInfo.u(this.n);
        monitorInfo.r(this.q);
        monitorInfo.t(templateBean.url);
        monitorInfo.s(ritVar.c);
        this.b.registerRenderListener(new c(str, i, templateBean));
        JSONObject b2 = this.f19561a.t().b(map);
        this.f19561a.l().c("AbsMuiseRender", "Muise type:%s, initData:%s", str, map);
        if (this.f19561a.g().isDebug()) {
            this.b.setTag("renderData", b2);
        }
        this.i = System.currentTimeMillis();
        this.j = str;
        this.b.prepare(ritVar.f27415a, null);
        Float f2 = this.r;
        if (f2 != null) {
            this.b.updateBaseFontSize(f2.floatValue());
        }
        this.b.render(b2, null);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("url", (Object) templateBean.url);
        jSONObject.put("bundleUrl", (Object) str4);
        this.b.addInstanceEnv("instanceInfo", jSONObject.toJSONString());
        return true;
    }

    public boolean K(MuiseBean muiseBean, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("db536fc2", new Object[]{this, muiseBean, map})).booleanValue();
        }
        if (!t()) {
            this.f19561a.l().d("AbsMuiseRender", "muise refresh check failed");
            return false;
        } else if (this.b == null) {
            this.f19561a.l().d("AbsMuiseRender", "muiseInstance is null，can't refresh");
            return false;
        } else {
            if (this.f19561a.f().h().f21078a && this.v) {
                igw.a(this.b.getRenderRoot());
            }
            JSONObject b2 = this.f19561a.t().b(map);
            if (this.k) {
                c4p.D("[XS.render]", "[Muise refresh] Refresh called, tItemType: %s, to index: %d, localUrl: %s", muiseBean.type, Integer.valueOf(this.l), this.j);
            } else {
                c4p.D("[XS.render]", "[Muise refresh] Refresh called, tItemType: %s, to index: %d, version: %s", muiseBean.type, Integer.valueOf(this.l), this.o);
            }
            this.i = System.currentTimeMillis();
            ScreenType.k(this.b);
            this.b.refresh(b2, null);
            return true;
        }
    }

    public final boolean N(MuiseBean muiseBean, Map<String, Object> map, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f0b68e7b", new Object[]{this, muiseBean, map, str})).booleanValue();
        }
        if (muiseBean == null) {
            this.f19561a.l().d("AbsMuiseRender", "render while MuiseBean is null");
            return false;
        }
        this.k = true;
        c4p.D("[XS.render]", "[Muise render] Render called, tItemType: %s index: %d, localUrl: %s", muiseBean.type, Integer.valueOf(this.l), str);
        f8b.c(this.f19561a, new r7b(str), new e(str, muiseBean, map, this.l));
        return true;
    }

    public final boolean O(MuiseBean muiseBean, Map<String, Object> map) {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9c4397a5", new Object[]{this, muiseBean, map})).booleanValue();
        }
        if (muiseBean == null) {
            this.f19561a.l().d("AbsMuiseRender", "render while MuiseBean is null");
            return false;
        }
        TemplateBean y = y(muiseBean);
        if (this.f19561a.t().e(y)) {
            c4p l = this.f19561a.l();
            l.d("AbsMuiseRender", "illegal template：" + muiseBean.type);
            this.f19561a.i().k(XSWeexRenderTrackEvent.f(this.c, muiseBean.type));
            c4p.C("[XS.render]", "[Muise render] Error before render called: tItemType: %s, index: %d, error: template miss, server did not return template data or template data format invalid", muiseBean.type, Integer.valueOf(this.l));
            com.taobao.android.weex_framework.c cVar = new com.taobao.android.weex_framework.c();
            cVar.q(this.p);
            cVar.u(muiseBean.type);
            cVar.r(this.q);
            if (y == null) {
                str = "null";
            } else {
                str = y.url;
            }
            cVar.t(str);
            if (y == null) {
                str2 = "no template from server";
            } else {
                str2 = "template invalid";
            }
            MUSAppMonitor.f(cVar, str2);
            return false;
        }
        this.n = y.templateName;
        this.o = y.version;
        String fileName = y.getFileName();
        rpc.c H = H(y.url);
        if (H == null) {
            if (H("prebuild://" + y.templateName) != null) {
                c4p.E("[XS.render]", "[Muise render] Using preBuild template, tItemType: %s index: %d, version: %s", muiseBean.type, Integer.valueOf(this.l), this.o);
            }
            this.x = y.templateName;
            c4p.a("template", this.n + " 模板未下载，注册监听", new Object[0]);
            vde vdeVar = this.h;
            if (vdeVar != null && this.y) {
                ((j4p) vdeVar).i3(y.templateName);
                ((j4p) this.h).l3(y.templateName, this);
            }
            this.w = new b(muiseBean, map);
            return true;
        }
        rit ritVar = new rit(H.d());
        ritVar.c = H.i();
        c4p.D("[XS.render]", "[Muise render] Render called, tItemType: %s index: %d, version: %s", muiseBean.type, Integer.valueOf(this.l), this.o);
        return M(map, y, fileName, ritVar, muiseBean.type, y.version, this.l);
    }
}
