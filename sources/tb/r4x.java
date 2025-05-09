package tb;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.viewpager.widget.ViewPager;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.layoutmanager.container.WeexFrameLayout;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.MUSInstanceConfig;
import com.taobao.android.weex_framework.common.MUSEventTarget;
import com.taobao.tao.flexbox.layoutmanager.ac.d;
import com.taobao.tao.flexbox.layoutmanager.core.Component;
import com.taobao.tao.flexbox.layoutmanager.core.b;
import com.taobao.tao.flexbox.layoutmanager.core.j;
import com.taobao.tao.flexbox.layoutmanager.core.n;
import java.util.HashMap;
import java.util.Map;
import tb.ni8;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class r4x extends Component<WeexFrameLayout, g> implements j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f27101a;
    public int b;
    public WeexFrameLayout c;
    public View d;
    public String e;
    public com.taobao.android.weex_framework.a g;
    public boolean f = false;
    public boolean h = false;
    public JSONObject i = new JSONObject();
    public final Map<String, Object> j = new HashMap();
    public final com.taobao.tao.flexbox.layoutmanager.core.b k = new f();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements kpc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.kpc
        public void a(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1414cfeb", new Object[]{this, view});
            } else if (r4x.B(r4x.this) != null) {
                r4x.B(r4x.this).addView(view);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements npc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.npc
        public void onDestroyed(MUSDKInstance mUSDKInstance) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("32f7f995", new Object[]{this, mUSDKInstance});
            }
        }

        @Override // tb.npc
        public void onJSException(com.taobao.android.weex_framework.a aVar, int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8c41b6de", new Object[]{this, aVar, new Integer(i), str});
            }
        }

        @Override // tb.npc
        public void onRefreshFailed(com.taobao.android.weex_framework.a aVar, int i, String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cc0861e4", new Object[]{this, aVar, new Integer(i), str, new Boolean(z)});
            }
        }

        @Override // tb.npc
        public void onRefreshSuccess(com.taobao.android.weex_framework.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("963c382f", new Object[]{this, aVar});
            }
        }

        @Override // tb.npc
        public void onPrepareSuccess(com.taobao.android.weex_framework.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("27a2635b", new Object[]{this, aVar});
                return;
            }
            tfs.i("WeexComponent", "weex onPrepareSuccess url: " + r4x.z(r4x.this));
            r4x r4xVar = r4x.this;
            r4x.A(r4xVar, 1, r4x.y(r4xVar), r4x.z(r4x.this), "");
        }

        @Override // tb.npc
        public void onRenderFailed(com.taobao.android.weex_framework.a aVar, int i, String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cc0cbe2b", new Object[]{this, aVar, new Integer(i), str, new Boolean(z)});
                return;
            }
            tfs.e("WeexComponent", "weex onRenderFailed error: " + str);
            r4x r4xVar = r4x.this;
            r4x.A(r4xVar, 3, r4x.y(r4xVar), r4x.z(r4x.this), str);
            if (!r4x.v(r4x.this)) {
                r4x.k(r4x.this, i, str);
            }
        }

        @Override // tb.npc
        public void onRenderSuccess(com.taobao.android.weex_framework.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2b2aeb48", new Object[]{this, aVar});
                return;
            }
            tfs.i("WeexComponent", "weex onRenderSuccess url: " + r4x.z(r4x.this));
            r4x r4xVar = r4x.this;
            r4x.A(r4xVar, 2, r4x.y(r4xVar), r4x.z(r4x.this), "");
            if (r4x.y(r4x.this)) {
                r4x.C(r4x.this, "onwillappear", null);
                r4x.j(r4x.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements w6a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // tb.w6a
        public void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4aeceb46", new Object[]{this, new Boolean(z)});
                return;
            }
            tfs.c("WeexComponent", "onGestureState beeConsume:" + z);
            if (z) {
                r4x.m(r4x.this, true);
                ((WeexFrameLayout) r4x.n(r4x.this)).setWeexConsume(WeexFrameLayout.WEEX_STATE_CONSUME);
                return;
            }
            tfs.c("WeexComponent", "onGestureState setWeexConsume WEEX_STATE_NOT_CONSUME");
            ((WeexFrameLayout) r4x.o(r4x.this)).setWeexConsume(WeexFrameLayout.WEEX_STATE_NOT_CONSUME);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class d implements dde {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // tb.dde
        public void a(Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4568a0fc", new Object[]{this, map});
            } else if (r4x.l(r4x.this)) {
                r4x.m(r4x.this, false);
                r4x r4xVar = r4x.this;
                ViewParent q = r4x.q(r4xVar, r4x.p(r4xVar));
                if (q instanceof ViewPager) {
                    q.requestDisallowInterceptTouchEvent(false);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class e implements ni8.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // tb.ni8.c
        public void onRetry() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c2145010", new Object[]{this});
            } else if (r4x.r(r4x.this) != null && !TextUtils.isEmpty(r4x.z(r4x.this))) {
                r4x.x(r4x.this);
                r4x.r(r4x.this).refresh(r4x.s(r4x.this), r4x.t(r4x.this));
                tfs.i("WeexComponent", "onClick errorView refresh load url: " + r4x.z(r4x.this));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class f extends b.b0<WeexFrameLayout, g> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/component/WeexComponent$1");
        }

        /* renamed from: m */
        public void c(com.taobao.tao.flexbox.layoutmanager.core.e eVar, WeexFrameLayout weexFrameLayout, g gVar, n.f fVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d27ff9d0", new Object[]{this, eVar, weexFrameLayout, gVar, fVar});
            } else if (r4x.h(r4x.this) != null && gVar != null) {
                if (gVar.z0) {
                    tfs.i("WeexComponent", "setBackgroundColor TRANSPARENT");
                    ((WeexFrameLayout) r4x.i(r4x.this)).setBackgroundColor(0);
                } else {
                    tfs.i("WeexComponent", "setBackgroundColor WHITE");
                    ((WeexFrameLayout) r4x.u(r4x.this)).setBackgroundColor(-1);
                }
                r4x.w(r4x.this, gVar.A0);
                tfs.i("WeexComponent", "hideDefaultErrorView: " + r4x.v(r4x.this));
                if (!TextUtils.isEmpty(gVar.w0)) {
                    r4x.x(r4x.this);
                    r4x.this.G(gVar);
                    r4x r4xVar = r4x.this;
                    r4x.A(r4xVar, 0, r4x.y(r4xVar), r4x.z(r4x.this), "");
                    return;
                }
                tfs.e("WeexComponent", "attr.src is empty");
            }
        }
    }

    static {
        t2o.a(502268230);
        t2o.a(503317092);
    }

    public static /* synthetic */ void A(r4x r4xVar, int i, boolean z, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b056f971", new Object[]{r4xVar, new Integer(i), new Boolean(z), str, str2});
        } else {
            r4xVar.M(i, z, str, str2);
        }
    }

    public static /* synthetic */ WeexFrameLayout B(r4x r4xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexFrameLayout) ipChange.ipc$dispatch("535117cf", new Object[]{r4xVar});
        }
        return r4xVar.c;
    }

    public static /* synthetic */ void C(r4x r4xVar, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c176f8", new Object[]{r4xVar, str, jSONObject});
        } else {
            r4xVar.O(str, jSONObject);
        }
    }

    public static /* synthetic */ View h(r4x r4xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("3e94d627", new Object[]{r4xVar});
        }
        return r4xVar.view;
    }

    public static /* synthetic */ View i(r4x r4xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("ad1be768", new Object[]{r4xVar});
        }
        return r4xVar.view;
    }

    public static /* synthetic */ Object ipc$super(r4x r4xVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1619485803) {
            return new Boolean(super.invoke((d.j) objArr[0], (String) objArr[1], (JSONObject) objArr[2], (d.k) objArr[3]));
        }
        if (hashCode == 2043760425) {
            super.onInitAttrs((com.taobao.tao.flexbox.layoutmanager.core.e) objArr[0], (View) objArr[1], (jfw) objArr[2], (n.f) objArr[3]);
            return null;
        } else if (hashCode == 2127624665) {
            super.onDetach();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/tao/flexbox/layoutmanager/component/WeexComponent");
        }
    }

    public static /* synthetic */ void j(r4x r4xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9090d214", new Object[]{r4xVar});
        } else {
            r4xVar.H();
        }
    }

    public static /* synthetic */ void k(r4x r4xVar, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7f7c658", new Object[]{r4xVar, new Integer(i), str});
        } else {
            r4xVar.P(i, str);
        }
    }

    public static /* synthetic */ boolean l(r4x r4xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7333f11a", new Object[]{r4xVar})).booleanValue();
        }
        return r4xVar.h;
    }

    public static /* synthetic */ boolean m(r4x r4xVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2c26dd40", new Object[]{r4xVar, new Boolean(z)})).booleanValue();
        }
        r4xVar.h = z;
        return z;
    }

    public static /* synthetic */ View n(r4x r4xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("5623c119", new Object[]{r4xVar});
        }
        return r4xVar.view;
    }

    public static /* synthetic */ View o(r4x r4xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("c4aad25a", new Object[]{r4xVar});
        }
        return r4xVar.view;
    }

    public static /* synthetic */ View p(r4x r4xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("3331e39b", new Object[]{r4xVar});
        }
        return r4xVar.view;
    }

    public static /* synthetic */ ViewParent q(r4x r4xVar, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewParent) ipChange.ipc$dispatch("94bde2f0", new Object[]{r4xVar, view});
        }
        return r4xVar.D(view);
    }

    public static /* synthetic */ com.taobao.android.weex_framework.a r(r4x r4xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.weex_framework.a) ipChange.ipc$dispatch("d7a65368", new Object[]{r4xVar});
        }
        return r4xVar.g;
    }

    public static /* synthetic */ JSONObject s(r4x r4xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("de3c893c", new Object[]{r4xVar});
        }
        return r4xVar.i;
    }

    public static /* synthetic */ Map t(r4x r4xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("afea5912", new Object[]{r4xVar});
        }
        return r4xVar.j;
    }

    public static /* synthetic */ View u(r4x r4xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("1ba2f8a9", new Object[]{r4xVar});
        }
        return r4xVar.view;
    }

    public static /* synthetic */ boolean v(r4x r4xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b1a80bac", new Object[]{r4xVar})).booleanValue();
        }
        return r4xVar.f;
    }

    public static /* synthetic */ boolean w(r4x r4xVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bc3614ee", new Object[]{r4xVar, new Boolean(z)})).booleanValue();
        }
        r4xVar.f = z;
        return z;
    }

    public static /* synthetic */ void x(r4x r4xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2f99b29", new Object[]{r4xVar});
        } else {
            r4xVar.F();
        }
    }

    public static /* synthetic */ boolean y(r4x r4xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("944b2aae", new Object[]{r4xVar})).booleanValue();
        }
        return r4xVar.f27101a;
    }

    public static /* synthetic */ String z(r4x r4xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("31e975d5", new Object[]{r4xVar});
        }
        return r4xVar.e;
    }

    public final ViewParent D(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewParent) ipChange.ipc$dispatch("307f684b", new Object[]{this, view});
        }
        if (view == null) {
            return null;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ViewPager) {
            return parent;
        }
        if (parent instanceof View) {
            return D((View) parent);
        }
        return parent;
    }

    /* renamed from: E */
    public g generateViewParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("91d2d82e", new Object[]{this});
        }
        return new g();
    }

    public final void F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ba1ba75", new Object[]{this});
            return;
        }
        View view = this.d;
        if (view != null && view.getVisibility() == 0) {
            this.d.setVisibility(8);
        }
    }

    public void G(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("421c6a0a", new Object[]{this, gVar});
        } else if (gVar != null) {
            this.i = gVar.y0;
            String str = gVar.w0;
            this.e = str;
            ((HashMap) this.j).put("bundleUrl", str);
            com.taobao.android.weex_framework.a aVar = this.g;
            if (aVar == null) {
                MUSInstanceConfig mUSInstanceConfig = new MUSInstanceConfig();
                mUSInstanceConfig.B(true);
                mUSInstanceConfig.t(MUSInstanceConfig.MUSRenderType.MUSRenderTypeUnicorn);
                mUSInstanceConfig.u(new a());
                mUSInstanceConfig.y(MUSInstanceConfig.RenderMode.texture);
                com.taobao.android.weex_framework.a c2 = com.taobao.android.weex_framework.b.f().c(((WeexFrameLayout) this.view).getContext(), mUSInstanceConfig);
                this.g = c2;
                c2.registerRenderListener(new b());
                this.g.initWithURL(Uri.parse(this.e));
                this.g.setTag("WeexComponent", this);
                this.g.render(this.i, this.j);
                this.g.setGestureStateListener(new c());
                this.g.setWeexScrollListener(new d());
                return;
            }
            aVar.initWithURL(Uri.parse(this.e));
            this.g.render(this.i, this.j);
        }
    }

    public final void H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7311e26", new Object[]{this});
            return;
        }
        com.taobao.android.weex_framework.a aVar = this.g;
        if (aVar != null) {
            aVar.onActivityStart();
            this.g.onActivityResume();
        }
    }

    public final void I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("530787e0", new Object[]{this});
            return;
        }
        com.taobao.android.weex_framework.a aVar = this.g;
        if (aVar != null) {
            aVar.onActivityPause();
            this.g.onActivityStop();
        }
    }

    /* renamed from: J */
    public WeexFrameLayout onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexFrameLayout) ipChange.ipc$dispatch("18205c5b", new Object[]{this, context});
        }
        WeexFrameLayout weexFrameLayout = new WeexFrameLayout(context);
        this.c = weexFrameLayout;
        return weexFrameLayout;
    }

    /* renamed from: K */
    public void onInitAttrs(com.taobao.tao.flexbox.layoutmanager.core.e eVar, WeexFrameLayout weexFrameLayout, g gVar, n.f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6232e0b", new Object[]{this, eVar, weexFrameLayout, gVar, fVar});
            return;
        }
        super.onInitAttrs(eVar, weexFrameLayout, gVar, fVar);
        this.k.c(eVar, weexFrameLayout, gVar, fVar);
    }

    public void L(String str, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("261b0311", new Object[]{this, str, map});
            return;
        }
        tfs.i("WeexComponent", "sendMessage2TNode name: " + str + " args: " + map);
        sendMessage(getNode(), str, null, map, null);
    }

    public final void M(int i, boolean z, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50924cb1", new Object[]{this, new Integer(i), new Boolean(z), str, str2});
            return;
        }
        this.b = i;
        HashMap hashMap = new HashMap();
        hashMap.put("state", Integer.valueOf(i));
        hashMap.put("appear", Boolean.valueOf(z));
        hashMap.put("url", str);
        hashMap.put("error", str2);
        L("onstatechanged", hashMap);
    }

    public final void N(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40980c86", new Object[]{this, jSONObject});
            return;
        }
        tfs.i("WeexComponent", "sendToWeexMessage eventName: onTNodeMessage params: " + jSONObject);
        this.g.dispatchEvent(MUSEventTarget.MUS_BODY_TARGET, "onTNodeMessage", jSONObject);
    }

    public final void O(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f4fca7c", new Object[]{this, str, jSONObject});
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("type", (Object) str);
        jSONObject2.put("args", (Object) jSONObject);
        N(jSONObject2);
    }

    public final void P(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c8c575d", new Object[]{this, new Integer(i), str});
        } else if (this.g != null) {
            if (this.d != null) {
                getView().removeView(this.d);
            }
            this.d = ni8.b(getNode().N(), this.e, String.valueOf(i), str, ((g) this.viewParams).x0, new e());
            getView().addView(this.d, new FrameLayout.LayoutParams(-1, -1));
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void onDetach() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ed0f9d9", new Object[]{this});
            return;
        }
        super.onDetach();
        com.taobao.android.weex_framework.a aVar = this.g;
        if (aVar != null) {
            aVar.destroy();
            this.g = null;
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.j
    public boolean onHandleTNodeMessage(n nVar, n nVar2, String str, String str2, Map map, hk8 hk8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("abab8f80", new Object[]{this, nVar, nVar2, str, str2, map, hk8Var})).booleanValue();
        }
        return false;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class g extends jfw {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final String KEY_HIDE_DEFAULT_ERROR_VIEW = "hideDefaultErrorView";
        public static final String KEY_OPAQUE = "opaque";
        public boolean A0;
        public String w0;
        public String x0;
        public JSONObject y0;
        public boolean z0;

        static {
            t2o.a(502268237);
        }

        public static /* synthetic */ Object ipc$super(g gVar, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -998046064) {
                super.B((Context) objArr[0], (HashMap) objArr[1]);
                return null;
            } else if (hashCode == -407167169) {
                super.v((Context) objArr[0], (String) objArr[1], objArr[2]);
                return null;
            } else {
                int hashCode2 = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/tao/flexbox/layoutmanager/component/WeexComponent$WeexParams");
            }
        }

        @Override // tb.jfw
        public void B(Context context, HashMap hashMap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c4830690", new Object[]{this, context, hashMap});
                return;
            }
            super.B(context, hashMap);
            this.w0 = nwv.E0(hashMap.get("src"));
            this.y0 = I(hashMap);
        }

        public final JSONObject I(HashMap hashMap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("695a370b", new Object[]{this, hashMap});
            }
            JSONObject jSONObject = new JSONObject();
            if (hashMap != null) {
                for (Map.Entry entry : hashMap.entrySet()) {
                    jSONObject.put((String) entry.getKey(), entry.getValue());
                }
            }
            return jSONObject;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:10:0x004d, code lost:
            if (r8.equals("error-page") == false) goto L_0x0045;
         */
        @Override // tb.jfw
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void v(android.content.Context r7, java.lang.String r8, java.lang.Object r9) {
            /*
                r6 = this;
                r0 = 2
                r1 = 1
                r2 = 0
                com.android.alibaba.ip.runtime.IpChange r3 = tb.r4x.g.$ipChange
                boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
                if (r4 == 0) goto L_0x001b
                java.lang.String r4 = "e7bb1f3f"
                r5 = 4
                java.lang.Object[] r5 = new java.lang.Object[r5]
                r5[r2] = r6
                r5[r1] = r7
                r5[r0] = r8
                r7 = 3
                r5[r7] = r9
                r3.ipc$dispatch(r4, r5)
                return
            L_0x001b:
                super.v(r7, r8, r9)
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                java.lang.String r3 = "parseExtraViewParams key: "
                r7.<init>(r3)
                r7.append(r8)
                java.lang.String r3 = " value: "
                r7.append(r3)
                r7.append(r9)
                java.lang.String r7 = r7.toString()
                java.lang.String r3 = "WeexParams"
                tb.tfs.i(r3, r7)
                r8.hashCode()
                r7 = -1
                int r3 = r8.hashCode()
                switch(r3) {
                    case -1010695135: goto L_0x005c;
                    case 1577082094: goto L_0x0050;
                    case 1589884724: goto L_0x0047;
                    default: goto L_0x0045;
                }
            L_0x0045:
                r0 = -1
                goto L_0x0067
            L_0x0047:
                java.lang.String r3 = "error-page"
                boolean r8 = r8.equals(r3)
                if (r8 != 0) goto L_0x0067
                goto L_0x0045
            L_0x0050:
                java.lang.String r0 = "hideDefaultErrorView"
                boolean r8 = r8.equals(r0)
                if (r8 != 0) goto L_0x005a
                goto L_0x0045
            L_0x005a:
                r0 = 1
                goto L_0x0067
            L_0x005c:
                java.lang.String r0 = "opaque"
                boolean r8 = r8.equals(r0)
                if (r8 != 0) goto L_0x0066
                goto L_0x0045
            L_0x0066:
                r0 = 0
            L_0x0067:
                switch(r0) {
                    case 0: goto L_0x007b;
                    case 1: goto L_0x0074;
                    case 2: goto L_0x006b;
                    default: goto L_0x006a;
                }
            L_0x006a:
                goto L_0x0081
            L_0x006b:
                java.lang.String r7 = ""
                java.lang.String r7 = tb.nwv.I(r9, r7)
                r6.x0 = r7
                goto L_0x0081
            L_0x0074:
                boolean r7 = tb.nwv.o(r9, r2)
                r6.A0 = r7
                goto L_0x0081
            L_0x007b:
                boolean r7 = tb.nwv.o(r9, r1)
                r6.z0 = r7
            L_0x0081:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: tb.r4x.g.v(android.content.Context, java.lang.String, java.lang.Object):void");
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0055, code lost:
        if (r8.equals("postMessage") == false) goto L_0x004c;
     */
    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean invoke(com.taobao.tao.flexbox.layoutmanager.ac.d.j r7, java.lang.String r8, com.alibaba.fastjson.JSONObject r9, com.taobao.tao.flexbox.layoutmanager.ac.d.k r10) {
        /*
            r6 = this;
            r0 = 2
            r1 = 1
            r2 = 0
            com.android.alibaba.ip.runtime.IpChange r3 = tb.r4x.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x0025
            java.lang.String r4 = "9f789b95"
            r5 = 5
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r2] = r6
            r5[r1] = r7
            r5[r0] = r8
            r7 = 3
            r5[r7] = r9
            r7 = 4
            r5[r7] = r10
            java.lang.Object r7 = r3.ipc$dispatch(r4, r5)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            return r7
        L_0x0025:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "invoke name: "
            r3.<init>(r4)
            r3.append(r8)
            java.lang.String r4 = " params: "
            r3.append(r4)
            r3.append(r9)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "WeexComponent"
            tb.tfs.i(r4, r3)
            r8.hashCode()
            r3 = -1
            int r4 = r8.hashCode()
            switch(r4) {
                case -1240638001: goto L_0x0064;
                case -934641255: goto L_0x0058;
                case 1490029383: goto L_0x004e;
                default: goto L_0x004c;
            }
        L_0x004c:
            r0 = -1
            goto L_0x006f
        L_0x004e:
            java.lang.String r4 = "postMessage"
            boolean r4 = r8.equals(r4)
            if (r4 != 0) goto L_0x006f
            goto L_0x004c
        L_0x0058:
            java.lang.String r0 = "reload"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x0062
            goto L_0x004c
        L_0x0062:
            r0 = 1
            goto L_0x006f
        L_0x0064:
            java.lang.String r0 = "goback"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x006e
            goto L_0x004c
        L_0x006e:
            r0 = 0
        L_0x006f:
            switch(r0) {
                case 0: goto L_0x0089;
                case 1: goto L_0x0078;
                case 2: goto L_0x0074;
                default: goto L_0x0072;
            }
        L_0x0072:
            r1 = 0
            goto L_0x0090
        L_0x0074:
            r6.N(r9)
            goto L_0x0090
        L_0x0078:
            com.taobao.android.weex_framework.a r0 = r6.g
            if (r0 == 0) goto L_0x0090
            r6.F()
            com.taobao.android.weex_framework.a r0 = r6.g
            com.alibaba.fastjson.JSONObject r2 = r6.i
            java.util.Map<java.lang.String, java.lang.Object> r3 = r6.j
            r0.refresh(r2, r3)
            goto L_0x0090
        L_0x0089:
            com.taobao.android.weex_framework.a r0 = r6.g
            if (r0 == 0) goto L_0x0090
            r0.goBack()
        L_0x0090:
            if (r1 != 0) goto L_0x0096
            boolean r1 = super.invoke(r7, r8, r9, r10)
        L_0x0096:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.r4x.invoke(com.taobao.tao.flexbox.layoutmanager.ac.d$j, java.lang.String, com.alibaba.fastjson.JSONObject, com.taobao.tao.flexbox.layoutmanager.ac.d$k):boolean");
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.j
    public boolean onHandleMessage(n.g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1e782cf4", new Object[]{this, gVar})).booleanValue();
        }
        String str = gVar.d;
        tfs.i("WeexComponent", "onHandleMessage name: " + str + " args: " + gVar.e);
        str.hashCode();
        char c2 = 65535;
        switch (str.hashCode()) {
            case -552345454:
                if (str.equals("onwilldisappear")) {
                    c2 = 0;
                    break;
                }
                break;
            case 1729966319:
                if (str.equals("onforcerefresh")) {
                    c2 = 1;
                    break;
                }
                break;
            case 2122668806:
                if (str.equals("onwillappear")) {
                    c2 = 2;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                this.f27101a = false;
                if (2 == this.b) {
                    O(str, JSON.parseObject(JSON.toJSONString(gVar.e)));
                    I();
                    break;
                }
                break;
            case 1:
                O(str, JSON.parseObject(JSON.toJSONString(gVar.e)));
                break;
            case 2:
                this.f27101a = true;
                int i = this.b;
                if (2 != i) {
                    if (3 == i && this.g != null && !TextUtils.isEmpty(this.e)) {
                        tfs.e("WeexComponent", "onHandleMessage  try reload");
                        this.g.initWithURL(Uri.parse(this.e));
                        break;
                    }
                } else {
                    O(str, JSON.parseObject(JSON.toJSONString(gVar.e)));
                    H();
                    break;
                }
                break;
        }
        return false;
    }
}
