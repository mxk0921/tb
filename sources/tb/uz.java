package tb;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import com.alibaba.ability.localization.Localization;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.nx3.bean.TemplateBean;
import com.taobao.android.searchbaseframe.nx3.bean.WeexBean;
import com.taobao.android.searchbaseframe.track.XSWeexRenderTrackEvent;
import com.taobao.taobao.R;
import com.taobao.weex.RenderContainer;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.common.WXRenderStrategy;
import com.taobao.weex.ui.component.WXComponent;
import com.taobao.weex.ui.component.WXVContainer;
import com.taobao.weex.ui.component.list.WXCell;
import java.util.HashMap;
import java.util.Map;
import tb.cbk;
import tb.rpc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public abstract class uz implements rc4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static boolean j = false;

    /* renamed from: a  reason: collision with root package name */
    public final yko f29688a;
    public cbk b;
    public final Activity c;
    public final d d;
    public final cbk.a e;
    public int f;
    public cnx g;
    public long h;
    public String i;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements gbe {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f29689a;
        public final /* synthetic */ TemplateBean b;

        public a(String str, TemplateBean templateBean) {
            this.f29689a = str;
            this.b = templateBean;
        }

        @Override // tb.gbe
        public void onException(WXSDKInstance wXSDKInstance, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("88f82eeb", new Object[]{this, wXSDKInstance, str, str2});
            } else if (wXSDKInstance.V() != WXRenderStrategy.DATA_RENDER_BINARY || str2 == null || (!str2.startsWith("jsc reboot") && !str2.startsWith("jsc Crashed"))) {
                uz.g(uz.this, this.b, str, str2);
                c4p l = uz.b(uz.this).l();
                l.d("AbsWeexRender", "Weex render error: " + this.f29689a);
                if (uz.d(uz.this) != null) {
                    uz.d(uz.this).H((cbk) wXSDKInstance, str, str2);
                }
                uz.b(uz.this).i().k(XSWeexRenderTrackEvent.a(uz.c(uz.this), this.b, str, str2));
            }
        }

        @Override // tb.gbe
        public void onRefreshSuccess(WXSDKInstance wXSDKInstance, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d57f8320", new Object[]{this, wXSDKInstance, new Integer(i), new Integer(i2)});
                return;
            }
            long currentTimeMillis = System.currentTimeMillis() - uz.a(uz.this);
            uz.b(uz.this).l().c("AbsWeexRender", "Weex Refresh time: %d, fileName: %s", Long.valueOf(currentTimeMillis), this.f29689a);
            uz.b(uz.this).i().k(XSWeexRenderTrackEvent.b(uz.c(uz.this), this.b, currentTimeMillis));
            uz.f(uz.this, wXSDKInstance);
            if (uz.d(uz.this) != null) {
                uz.d(uz.this).Y1((cbk) wXSDKInstance);
            }
        }

        @Override // tb.gbe
        public void onRenderSuccess(WXSDKInstance wXSDKInstance, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c414a5f9", new Object[]{this, wXSDKInstance, new Integer(i), new Integer(i2)});
                return;
            }
            long currentTimeMillis = System.currentTimeMillis() - uz.a(uz.this);
            uz.b(uz.this).l().c("AbsWeexRender", "Weex render time: %d, fileName: %s", Long.valueOf(currentTimeMillis), this.f29689a);
            uz.b(uz.this).i().k(XSWeexRenderTrackEvent.c(uz.c(uz.this), this.b, currentTimeMillis));
            if (uz.d(uz.this) != null) {
                uz.d(uz.this).K1((cbk) wXSDKInstance);
            }
            if (this.b.cellBinary) {
                uz.e(uz.this, wXSDKInstance);
            }
        }

        @Override // tb.gbe
        public void onViewCreated(WXSDKInstance wXSDKInstance, View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9eab5f0f", new Object[]{this, wXSDKInstance, view});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements DialogInterface.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f29690a;
        public final /* synthetic */ String b;

        public b(String str, String str2) {
            this.f29690a = str;
            this.b = str2;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
            } else if (!this.f29690a.endsWith(".wlasm")) {
                Toast.makeText(uz.c(uz.this), "只支持Eagle", 0).show();
            } else {
                dr3.s2(uz.this.k(), uz.c(uz.this), this.b, this.f29690a, "weex");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c implements gbe {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f29691a;

        public c(String str) {
            this.f29691a = str;
        }

        @Override // tb.gbe
        public void onException(WXSDKInstance wXSDKInstance, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("88f82eeb", new Object[]{this, wXSDKInstance, str, str2});
            } else if (wXSDKInstance.V() != WXRenderStrategy.DATA_RENDER_BINARY || str2 == null || (!str2.startsWith("jsc reboot") && !str2.startsWith("jsc Crashed"))) {
                uz.h(uz.this, this.f29691a, str, str2);
                c4p l = uz.b(uz.this).l();
                l.d("AbsWeexRender", "Weex render error: " + this.f29691a);
                if (uz.d(uz.this) != null) {
                    uz.d(uz.this).H((cbk) wXSDKInstance, str, str2);
                }
            }
        }

        @Override // tb.gbe
        public void onRefreshSuccess(WXSDKInstance wXSDKInstance, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d57f8320", new Object[]{this, wXSDKInstance, new Integer(i), new Integer(i2)});
                return;
            }
            uz.f(uz.this, wXSDKInstance);
            if (uz.d(uz.this) != null) {
                uz.d(uz.this).Y1((cbk) wXSDKInstance);
            }
        }

        @Override // tb.gbe
        public void onRenderSuccess(WXSDKInstance wXSDKInstance, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c414a5f9", new Object[]{this, wXSDKInstance, new Integer(i), new Integer(i2)});
                return;
            }
            if (uz.d(uz.this) != null) {
                uz.d(uz.this).K1((cbk) wXSDKInstance);
            }
            uz.e(uz.this, wXSDKInstance);
        }

        @Override // tb.gbe
        public void onViewCreated(WXSDKInstance wXSDKInstance, View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9eab5f0f", new Object[]{this, wXSDKInstance, view});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface d {
        void H(cbk cbkVar, String str, String str2);

        void K1(cbk cbkVar);

        void Y1(cbk cbkVar);
    }

    static {
        t2o.a(993002189);
        t2o.a(985661441);
    }

    public uz(Activity activity, yko ykoVar, d dVar, cbk.a aVar) {
        this.c = activity;
        this.f29688a = ykoVar;
        this.d = dVar;
        this.e = aVar;
    }

    public static /* synthetic */ long a(uz uzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("843b6de0", new Object[]{uzVar})).longValue();
        }
        return uzVar.h;
    }

    public static /* synthetic */ yko b(uz uzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yko) ipChange.ipc$dispatch("e86759d4", new Object[]{uzVar});
        }
        return uzVar.f29688a;
    }

    public static /* synthetic */ Activity c(uz uzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("b7e51d7a", new Object[]{uzVar});
        }
        return uzVar.c;
    }

    public static /* synthetic */ d d(uz uzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("381e2dac", new Object[]{uzVar});
        }
        return uzVar.d;
    }

    public static /* synthetic */ void e(uz uzVar, WXSDKInstance wXSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94947dfe", new Object[]{uzVar, wXSDKInstance});
        } else {
            uzVar.m(wXSDKInstance);
        }
    }

    public static /* synthetic */ void f(uz uzVar, WXSDKInstance wXSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("751645dd", new Object[]{uzVar, wXSDKInstance});
        } else {
            uzVar.t(wXSDKInstance);
        }
    }

    public static /* synthetic */ void g(uz uzVar, TemplateBean templateBean, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a3cf600", new Object[]{uzVar, templateBean, str, str2});
        } else {
            uzVar.z(templateBean, str, str2);
        }
    }

    public static /* synthetic */ void h(uz uzVar, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("187fa391", new Object[]{uzVar, str, str2, str3});
        } else {
            uzVar.A(str, str2, str3);
        }
    }

    public final void A(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6133a89f", new Object[]{this, str, str2, str3});
            return;
        }
        B("LocalDev: \n  " + str, str2, str3, str);
    }

    public final void B(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7024e06", new Object[]{this, str, str2, str3, str4});
        } else if (k().g().isDebug()) {
            k().f().h().getClass();
            AlertDialog.Builder title = new AlertDialog.Builder(this.c).setPositiveButton("查看源码", new b(str4, str3)).setNegativeButton(Localization.q(R.string.app_sure), (DialogInterface.OnClickListener) null).setTitle("WeexError");
            title.setMessage(str + "\n------------\n\n" + str2 + "\n\n" + str3).show();
        }
    }

    public boolean G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("49ed62c0", new Object[]{this})).booleanValue();
        }
        if (this.b != null) {
            return true;
        }
        return false;
    }

    public void H() {
        WXComponent rootComponent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9cf6144", new Object[]{this});
            return;
        }
        cbk cbkVar = this.b;
        if (cbkVar != null && (rootComponent = cbkVar.getRootComponent()) != null) {
            this.b.z(rootComponent.getRef(), "appear", null, null);
        }
    }

    public void I() {
        WXComponent rootComponent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e22c0802", new Object[]{this});
            return;
        }
        cbk cbkVar = this.b;
        if (cbkVar != null && (rootComponent = cbkVar.getRootComponent()) != null) {
            this.b.z(rootComponent.getRef(), "disappear", null, null);
        }
    }

    public void J(cnx cnxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e61f287d", new Object[]{this, cnxVar});
        } else {
            this.g = cnxVar;
        }
    }

    public void K(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fff43f93", new Object[]{this, new Integer(i)});
        } else {
            this.f = i;
        }
    }

    public final void L(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4005eeb6", new Object[]{this, str});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("tItemType", (Object) str);
        yko g = j3p.g();
        if (g != null) {
            jSONObject.put("sversion", (Object) g.g().a());
        }
        AppMonitor.Counter.commit("tbsearch", "weex_card_usage", jSONObject.toString(), 1.0d);
    }

    public void i(ViewGroup viewGroup, WXSDKInstance wXSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("549f2180", new Object[]{this, viewGroup, wXSDKInstance});
        } else {
            j(viewGroup, wXSDKInstance, true);
        }
    }

    public void j(ViewGroup viewGroup, WXSDKInstance wXSDKInstance, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f45c154", new Object[]{this, viewGroup, wXSDKInstance, new Boolean(z)});
            return;
        }
        c4p l = k().l();
        l.b("AbsWeexRender", "Weex Render success: " + this.i);
        if (viewGroup == null) {
            k().l().d("AbsWeexRender", "frameContainer is null");
        } else if (wXSDKInstance == null) {
            k().l().d("AbsWeexRender", "wxInstance is null");
        } else {
            View containerView = wXSDKInstance.getContainerView();
            if (containerView == null) {
                k().l().d("AbsWeexRender", "renderContainer is null");
                return;
            }
            ViewGroup viewGroup2 = (ViewGroup) containerView.getParent();
            if (viewGroup2 != null) {
                viewGroup2.removeView(containerView);
            }
            if (z) {
                viewGroup.removeAllViews();
            }
            viewGroup.addView(containerView);
            k().f().h().getClass();
        }
    }

    public final yko k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yko) ipChange.ipc$dispatch("827434f7", new Object[]{this});
        }
        return this.f29688a;
    }

    public final void m(WXSDKInstance wXSDKInstance) {
        WXVContainer wXVContainer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1bb852e", new Object[]{this, wXSDKInstance});
        } else if (wXSDKInstance != null && (wXVContainer = (WXVContainer) wXSDKInstance.getRootComponent()) != null && wXVContainer.getChildCount() > 0) {
            WXCell child = wXVContainer.getChild(0);
            if (child instanceof WXCell) {
                WXCell wXCell = child;
                if (wXCell.getRealView() == null) {
                    wXCell.lazy(false);
                    wXCell.createView();
                    wXCell.applyLayoutAndEvent(wXCell);
                    wXCell.bindData(wXCell);
                }
                wXVContainer.addSubView(wXCell.getHostView(), 0);
            }
        }
    }

    public RenderContainer n(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RenderContainer) ipChange.ipc$dispatch("9f0866b3", new Object[]{this, context});
        }
        RenderContainer renderContainer = new RenderContainer(context);
        renderContainer.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        if (this.f > 0) {
            renderContainer.getLayoutParams().height = this.f;
        }
        return renderContainer;
    }

    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        cbk cbkVar = this.b;
        if (cbkVar != null) {
            if (!cbkVar.i0()) {
                this.b.destroy();
            }
            y(this.b);
            this.b = null;
        }
    }

    @Override // tb.rc4
    public void onCreate(WXComponent wXComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcbed927", new Object[]{this, wXComponent});
        }
    }

    @Override // tb.rc4
    public void onPreDestory(WXComponent wXComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebb808dc", new Object[]{this, wXComponent});
        }
    }

    @Override // tb.rc4
    public void onViewCreated(WXComponent wXComponent, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9884402", new Object[]{this, wXComponent, view});
        }
    }

    public int p() {
        WXVContainer wXVContainer;
        WXComponent child;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("564573a4", new Object[]{this})).intValue();
        }
        cbk cbkVar = this.b;
        if (cbkVar == null || (wXVContainer = (WXVContainer) cbkVar.getRootComponent()) == null || wXVContainer.getChildCount() <= 0 || (child = wXVContainer.getChild(0)) == null) {
            return -1;
        }
        return (int) child.getLayoutHeight();
    }

    public abstract TemplateBean q(WeexBean weexBean);

    public final WXSDKInstance r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WXSDKInstance) ipChange.ipc$dispatch("592eda51", new Object[]{this});
        }
        return this.b;
    }

    public final void s(WXVContainer wXVContainer) {
        WXComponent child;
        View hostView;
        ViewGroup.LayoutParams layoutParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2383147", new Object[]{this, wXVContainer});
        } else if (wXVContainer.getChildCount() > 0 && (child = wXVContainer.getChild(0)) != null && (hostView = child.getHostView()) != null && (layoutParams = hostView.getLayoutParams()) != null) {
            layoutParams.height = -2;
        }
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [android.view.View] */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void t(com.taobao.weex.WXSDKInstance r5) {
        /*
            r4 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.uz.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0015
            java.lang.String r1 = "614ac686"
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r4
            r3 = 1
            r2[r3] = r5
            r0.ipc$dispatch(r1, r2)
            return
        L_0x0015:
            if (r5 != 0) goto L_0x0018
            return
        L_0x0018:
            com.taobao.weex.ui.component.WXComponent r5 = r5.getRootComponent()
            com.taobao.weex.ui.component.WXVContainer r5 = (com.taobao.weex.ui.component.WXVContainer) r5
            if (r5 != 0) goto L_0x0021
            return
        L_0x0021:
            r4.s(r5)
            android.view.View r5 = r5.getHostView()
            if (r5 != 0) goto L_0x002b
            return
        L_0x002b:
            android.view.ViewGroup$LayoutParams r0 = r5.getLayoutParams()
            if (r0 != 0) goto L_0x0032
            return
        L_0x0032:
            r1 = -2
            r0.height = r1
            r5.requestLayout()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.uz.t(com.taobao.weex.WXSDKInstance):void");
    }

    public void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        cbk cbkVar = this.b;
        if (cbkVar != null) {
            cbkVar.onActivityPause();
        }
    }

    public abstract rpc.c v(String str);

    public void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        cbk cbkVar = this.b;
        if (cbkVar != null) {
            cbkVar.onActivityResume();
        }
    }

    public abstract void x(cbk cbkVar);

    public abstract void y(WXSDKInstance wXSDKInstance);

    public final void z(TemplateBean templateBean, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("346e0d4f", new Object[]{this, templateBean, str, str2});
        } else {
            B(templateBean.toPrintString(), str, str2, templateBean.url);
        }
    }

    public boolean D(WeexBean weexBean, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e878ea19", new Object[]{this, weexBean, map})).booleanValue();
        }
        if (weexBean == null) {
            this.f29688a.l().d("AbsWeexRender", "bean is null");
            return false;
        } else if (!l()) {
            this.f29688a.l().d("AbsWeexRender", "state not legal");
            return false;
        } else {
            L(weexBean.type);
            if (vit.b(this.f29688a)) {
                String a2 = vit.a(weexBean.type);
                if (!TextUtils.isEmpty(a2) && a2.startsWith("http")) {
                    k().l().A("AbsWeexRender", "使用测试模板进行");
                    return E(weexBean, map, a2);
                }
            }
            return F(weexBean, map);
        }
    }

    public boolean C(WeexBean weexBean, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8b37de74", new Object[]{this, weexBean, map})).booleanValue();
        }
        if (!l()) {
            this.f29688a.l().d("AbsWeexRender", "weex refresh check failed");
            return false;
        } else if (this.b == null) {
            this.f29688a.l().d("AbsWeexRender", "weexInstance is null，can't refresh");
            return false;
        } else {
            String a2 = this.f29688a.t().a(map);
            c4p.m("AbsWeexRender", "initData: " + a2);
            this.h = System.currentTimeMillis();
            this.b.refreshInstance(a2);
            return true;
        }
    }

    public final boolean E(WeexBean weexBean, Map<String, Object> map, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ee8f3e90", new Object[]{this, weexBean, map, str})).booleanValue();
        }
        if (weexBean == null) {
            this.f29688a.l().d("AbsWeexRender", "render while WeexBean is null");
            return false;
        }
        this.b = new cbk(this.c);
        this.b.setRenderContainer(n(this.c));
        this.b.H1(this.d);
        this.b.G1(this.e);
        this.b.F1(this.g);
        x(this.b);
        this.b.registerRenderListener(new c(str));
        HashMap hashMap = new HashMap();
        hashMap.put("bundleUrl", "/search_dev_test");
        hashMap.put("bundleName", weexBean.type);
        String a2 = this.f29688a.t().a(map);
        c4p.m("AbsWeexRender", "initData: " + a2);
        WXRenderStrategy wXRenderStrategy = WXRenderStrategy.APPEND_ONCE;
        this.i = str;
        cbk cbkVar = this.b;
        if (a2 == null) {
            a2 = "";
        }
        cbkVar.X0("/search_dev_test", str, hashMap, a2, wXRenderStrategy);
        return true;
    }

    public boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8eb83aac", new Object[]{this})).booleanValue();
        }
        if (this.c == null) {
            this.f29688a.l().d("AbsWeexRender", "activity is null");
            return false;
        } else if (this.d != null) {
            return true;
        } else {
            this.f29688a.l().d("AbsWeexRender", "renderListener is null");
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean F(com.taobao.android.searchbaseframe.nx3.bean.WeexBean r11, java.util.Map<java.lang.String, java.lang.Object> r12) {
        /*
            Method dump skipped, instructions count: 339
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.uz.F(com.taobao.android.searchbaseframe.nx3.bean.WeexBean, java.util.Map):boolean");
    }
}
