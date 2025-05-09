package tb;

import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.MUSInstanceConfig;
import com.taobao.homepage.pop.protocol.model.pop.IPopData;
import com.taobao.uikit.extend.component.unify.Toast.TBToast;
import java.lang.ref.WeakReference;
import java.util.List;
import tb.dbd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class s7x implements dbd {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BUSINESS_ID_KEY = "mus_key_business_id";
    public static final String HOME_POP_ENGINE_KEY = "mus_weak_ref_key_home_pop_engine";

    /* renamed from: a  reason: collision with root package name */
    public FrameLayout f27859a;
    public com.taobao.android.weex_framework.a b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements kpc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ViewGroup f27860a;
        public final /* synthetic */ IPopData b;

        public a(s7x s7xVar, ViewGroup viewGroup, IPopData iPopData) {
            this.f27860a = viewGroup;
            this.b = iPopData;
        }

        @Override // tb.kpc
        public void a(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1414cfeb", new Object[]{this, view});
                return;
            }
            this.f27860a.addView(view, new FrameLayout.LayoutParams(-1, -1));
            vhm.f(this.b.fetchPopSection(), null);
            bgm.b("PopViewFirstVisible", this.b);
            vfm.f("WeexPopViewProvider ", "weex onCreateView callback");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements npc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public boolean f27861a = false;
        public final /* synthetic */ ViewGroup b;
        public final /* synthetic */ com.taobao.android.weex_framework.a c;
        public final /* synthetic */ IPopData d;

        public b(s7x s7xVar, ViewGroup viewGroup, com.taobao.android.weex_framework.a aVar, IPopData iPopData) {
            this.b = viewGroup;
            this.c = aVar;
            this.d = iPopData;
        }

        public final void a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("687ff52", new Object[]{this, str, str2});
            } else if (!this.f27861a) {
                bgm.a("PopViewFirstVisible", this.d, str, str2);
                this.f27861a = true;
            }
        }

        @Override // tb.npc
        public void onDestroyed(MUSDKInstance mUSDKInstance) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("32f7f995", new Object[]{this, mUSDKInstance});
                return;
            }
            vfm.f("WeexPopViewProvider ", "weex callback onDestroyed");
            this.b.removeView(mUSDKInstance.getRenderRoot());
        }

        @Override // tb.npc
        public void onJSException(com.taobao.android.weex_framework.a aVar, int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8c41b6de", new Object[]{this, aVar, new Integer(i), str});
            } else {
                vfm.f("WeexPopViewProvider ", "weex callback onJSException");
            }
        }

        @Override // tb.npc
        public void onPrepareSuccess(com.taobao.android.weex_framework.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("27a2635b", new Object[]{this, aVar});
            } else {
                vfm.f("WeexPopViewProvider ", "weex callback onPrepareSuccess");
            }
        }

        @Override // tb.npc
        public void onRefreshFailed(com.taobao.android.weex_framework.a aVar, int i, String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cc0861e4", new Object[]{this, aVar, new Integer(i), str, new Boolean(z)});
            } else {
                vfm.f("WeexPopViewProvider ", "weex callback onRefreshFailed");
            }
        }

        @Override // tb.npc
        public void onRefreshSuccess(com.taobao.android.weex_framework.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("963c382f", new Object[]{this, aVar});
            } else {
                vfm.f("WeexPopViewProvider ", "weex callback onRefreshSuccess");
            }
        }

        @Override // tb.npc
        public void onRenderFailed(com.taobao.android.weex_framework.a aVar, int i, String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cc0cbe2b", new Object[]{this, aVar, new Integer(i), str, new Boolean(z)});
                return;
            }
            a(String.valueOf(i), str);
            this.b.removeView(aVar.getRenderRoot());
            this.c.destroy();
            vfm.f("WeexPopViewProvider ", "weex callback onRenderFailed");
            TBToast.makeText(this.b.getContext(), "加载失败，请稍后再试").show();
        }

        @Override // tb.npc
        public void onRenderSuccess(com.taobao.android.weex_framework.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2b2aeb48", new Object[]{this, aVar});
            } else {
                vfm.f("WeexPopViewProvider ", "weex callback onRenderSuccess");
            }
        }
    }

    static {
        t2o.a(491782615);
    }

    @Override // tb.dbd
    public void a(ViewGroup viewGroup, View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fcdf1ac", new Object[]{this, viewGroup, view, new Integer(i)});
        }
    }

    @Override // tb.dbd
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c3baf87", new Object[]{this});
            return;
        }
        com.taobao.android.weex_framework.a aVar = this.b;
        if (aVar != null && !aVar.isDestroyed()) {
            this.b.onActivityResume();
        }
    }

    @Override // tb.dbd
    public View c(View view, int i, IPopData iPopData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("46e16d14", new Object[]{this, view, new Integer(i), iPopData});
        }
        if (this.b == null) {
            return view;
        }
        if (yhm.d(i)) {
            this.b.destroy();
            this.b = null;
            this.f27859a = null;
        }
        return view;
    }

    @Override // tb.dbd
    public View d(ViewGroup viewGroup, IPopData iPopData, e3b e3bVar) {
        Context context;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("b2cfb7b", new Object[]{this, viewGroup, iPopData, e3bVar});
        }
        if (viewGroup == null || iPopData == null || !iPopData.valid() || !iPopData.isAllowShow() || (context = viewGroup.getContext()) == null) {
            return null;
        }
        String weexUrl = iPopData.getPopConfig().getWeexUrl();
        vfm.f("WeexPopViewProvider ", "create weex pop, url=" + weexUrl);
        if (TextUtils.isEmpty(weexUrl)) {
            return null;
        }
        if (this.b != null) {
            vfm.f("WeexPopViewProvider ", "destroy old weex instance, hashCode=" + this.b.hashCode());
            this.b.destroy();
            this.b = null;
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.f27859a = frameLayout;
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        if (vfm.a()) {
            this.f27859a.setBackgroundColor(Color.parseColor("#33ff00ff"));
        }
        com.taobao.android.weex_framework.a j = j(this.f27859a, iPopData, e3bVar);
        this.b = j;
        if (j == null) {
            return null;
        }
        vfm.f("WeexPopViewProvider ", "create new weex instance, hashCode=" + this.b.hashCode() + ", data=" + iPopData.hashCode());
        this.b.initWithURL(Uri.parse(weexUrl));
        JSONObject ext = iPopData.getExt();
        this.b.render(ext == null ? null : ext.getJSONObject("renderPassParams"), null);
        iPopData.recordShow();
        return this.f27859a;
    }

    @Override // tb.dbd
    public View e(View view, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("9ffa72dc", new Object[]{this, view, new Long(j)});
        }
        return view;
    }

    @Override // tb.dbd
    public View f(View view, String str, IPopData iPopData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("22a43b90", new Object[]{this, view, str, iPopData});
        }
        if (this.b != null && "removePop".equals(str)) {
            this.b.destroy();
            this.b = null;
            this.f27859a = null;
        }
        return view;
    }

    @Override // tb.dbd
    public boolean g(View view, IPopData iPopData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7fecc78a", new Object[]{this, view, iPopData})).booleanValue();
        }
        return false;
    }

    @Override // tb.dbd
    public void h(e3b e3bVar, List<IPopData> list, dbd.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7f314c1", new Object[]{this, e3bVar, list, aVar});
        }
    }

    public final npc i(ViewGroup viewGroup, com.taobao.android.weex_framework.a aVar, IPopData iPopData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (npc) ipChange.ipc$dispatch("8a043a03", new Object[]{this, viewGroup, aVar, iPopData});
        }
        return new b(this, viewGroup, aVar, iPopData);
    }

    @Override // tb.dbd
    public void onAppToBackground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("938dadf2", new Object[]{this});
            return;
        }
        com.taobao.android.weex_framework.a aVar = this.b;
        if (aVar != null && !aVar.isDestroyed()) {
            this.b.onActivityPause();
        }
    }

    public final com.taobao.android.weex_framework.a j(ViewGroup viewGroup, IPopData iPopData, e3b e3bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.weex_framework.a) ipChange.ipc$dispatch("b78d32fa", new Object[]{this, viewGroup, iPopData, e3bVar});
        }
        try {
            MUSInstanceConfig mUSInstanceConfig = new MUSInstanceConfig();
            mUSInstanceConfig.B(true);
            mUSInstanceConfig.t(MUSInstanceConfig.MUSRenderType.MUSRenderTypeUnicorn);
            mUSInstanceConfig.v(false);
            mUSInstanceConfig.y(MUSInstanceConfig.RenderMode.texture);
            mUSInstanceConfig.u(new a(this, viewGroup, iPopData));
            com.taobao.android.weex_framework.a c = com.taobao.android.weex_framework.b.f().c(viewGroup.getContext(), mUSInstanceConfig);
            if (!iPopData.getPopConfig().isInterceptClick()) {
                c.setGestureConsumptionView(viewGroup);
            }
            c.registerRenderListener(i(viewGroup, c, iPopData));
            c.setTag(HOME_POP_ENGINE_KEY, new WeakReference(e3bVar));
            c.setTag(BUSINESS_ID_KEY, iPopData.getBusinessID());
            return c;
        } catch (Throwable th) {
            vfm.d("create weex instance error", th);
            return null;
        }
    }
}
