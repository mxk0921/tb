package tb;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.alibaba.ability.localization.Localization;
import com.alibaba.android.ultron.vfw.core.ViewEngine;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.bundle.base.ActivityLifecycleObserver;
import com.taobao.android.order.bundle.dinamicX.module.CatapultComponent;
import com.taobao.android.order.bundle.widget.TBOrderWeexView;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import com.taobao.weex.WXSDKEngine;
import com.taobao.weex.appfram.storage.b;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class jf3 extends sz implements ActivityLifecycleObserver.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String COMPONENT_TAG = "native$catapult";
    public static final int LOAD_STATE_BEGIN = 2;
    public static final int LOAD_STATE_ERROR = 3;
    public static final int LOAD_STATE_FINISH = 4;
    public static final int LOAD_STATE_INIT = 1;
    public Context d;
    public TBOrderWeexView e;
    public ViewGroup f;
    public View g;
    public TextView h;
    public TextView i;
    public View j;
    public CatapultComponent k;
    public JSONObject l;
    public int m = 1;
    public static final String n = jf3.class.getSimpleName();
    public static final z9e CREATOR = new b();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements b.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f21965a;

        public a(jf3 jf3Var, String str) {
            this.f21965a = str;
        }

        @Override // com.taobao.weex.appfram.storage.b.a
        public void a(Map<String, Object> map) {
            Object obj;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7ef1df3e", new Object[]{this, map});
            } else if (map != null && map.containsKey(this.f21965a) && (obj = map.get(this.f21965a)) != null) {
                jf3.g();
                obj.toString();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b implements z9e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.z9e
        public sz a(ViewEngine viewEngine) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (sz) ipChange.ipc$dispatch("345e20e7", new Object[]{this, viewEngine});
            }
            return new jf3(viewEngine);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(713031911);
        }

        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else if (jf3.k(jf3.this) != null) {
                jf3 jf3Var = jf3.this;
                jf3Var.n(jf3.k(jf3Var).getUrl(), jf3.k(jf3.this).getUrl(), jf3.k(jf3.this).getMd5());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class d implements TBOrderWeexView.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(713031912);
            t2o.a(713032000);
        }

        public d() {
        }

        @Override // com.taobao.android.order.bundle.widget.TBOrderWeexView.c
        public void b(String str, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("afadd2fb", new Object[]{this, str, new Long(j)});
                return;
            }
            jf3.this.m = 4;
            lor.d("WeexOnLoadListener", "onLoadFinish", "callback", "onLoadFinish", "loadTime = " + j + "");
            jf3.i(jf3.this).setVisibility(8);
            if (jf3.h(jf3.this) != null) {
                jf3.h(jf3.this).b(str, j);
            }
        }

        @Override // com.taobao.android.order.bundle.widget.TBOrderWeexView.c
        public void d(String str, int i, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b3ed6d99", new Object[]{this, str, new Integer(i), str2});
                return;
            }
            jf3 jf3Var = jf3.this;
            jf3Var.m = 3;
            if (2 == i || 4 == i || 8 == i) {
                jf3.j(jf3Var, true, Localization.q(R.string.order_biz_load_fail));
            } else {
                jf3.j(jf3Var, false, Localization.q(R.string.order_biz_load_error));
            }
            TextUtils.isEmpty(str2);
            if (jf3.h(jf3.this) != null) {
                jf3.h(jf3.this).d(str, i, str2);
            }
        }

        public /* synthetic */ d(jf3 jf3Var, a aVar) {
            this();
        }

        @Override // com.taobao.android.order.bundle.widget.TBOrderWeexView.c
        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("81196600", new Object[]{this, str});
                return;
            }
            jf3.this.m = 2;
            lor.d("WeexOnLoadListener", "onLoadData", "callback", "onLoadData", str);
            if (jf3.h(jf3.this) != null) {
                jf3.h(jf3.this).a(str);
            }
        }

        @Override // com.taobao.android.order.bundle.widget.TBOrderWeexView.c
        public void c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("140e0fd5", new Object[]{this, str});
                return;
            }
            jf3.this.m = 2;
            lor.d("WeexOnLoadListener", "onLoadBegin", "callback", "onLoadBegin", str);
            if (jf3.h(jf3.this) != null) {
                jf3.h(jf3.this).c(str);
            }
        }
    }

    static {
        t2o.a(713031908);
        t2o.a(713031732);
    }

    public jf3(ViewEngine viewEngine) {
        super(viewEngine);
    }

    public static /* synthetic */ String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6c2478e8", new Object[0]);
        }
        return n;
    }

    public static /* synthetic */ TBOrderWeexView.c h(jf3 jf3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBOrderWeexView.c) ipChange.ipc$dispatch("d5f53784", new Object[]{jf3Var});
        }
        jf3Var.getClass();
        return null;
    }

    public static /* synthetic */ ViewGroup i(jf3 jf3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("5d9ee798", new Object[]{jf3Var});
        }
        return jf3Var.f;
    }

    public static /* synthetic */ Object ipc$super(jf3 jf3Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/bundle/ultron/view/CatapultHolder");
    }

    public static /* synthetic */ void j(jf3 jf3Var, boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f529940", new Object[]{jf3Var, new Boolean(z), str});
        } else {
            jf3Var.r(z, str);
        }
    }

    public static /* synthetic */ CatapultComponent k(jf3 jf3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CatapultComponent) ipChange.ipc$dispatch("bf936321", new Object[]{jf3Var});
        }
        return jf3Var.k;
    }

    @Override // tb.sz
    public void d(IDMComponent iDMComponent) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1fbfb67", new Object[]{this, iDMComponent});
        } else if (!ykl.a()) {
            if ((iDMComponent != null || iDMComponent.getFields() != null) && iDMComponent.getFields() != this.l) {
                this.l = iDMComponent.getFields();
                CatapultComponent catapultComponent = (CatapultComponent) JSON.toJavaObject(iDMComponent.getFields(), CatapultComponent.class);
                this.k = catapultComponent;
                if (catapultComponent != null) {
                    q(l(catapultComponent.getPageHeight()));
                    if (this.k.getData() == null) {
                        str = null;
                    } else {
                        str = this.k.getData().toJSONString();
                    }
                    o(this.k.getBusinessGroup(), str);
                    int i = this.m;
                    if (i == 1 || i == 3) {
                        n(this.k.getUrl(), this.k.getUrl(), this.k.getMd5());
                    }
                }
            }
        }
    }

    @Override // tb.sz
    public View e(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("14914f88", new Object[]{this, viewGroup});
        }
        Context context = viewGroup.getContext();
        this.d = context;
        ViewGroup viewGroup2 = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.layout_order_detail_weex_card, viewGroup, false);
        if (ykl.a()) {
            ViewGroup.LayoutParams layoutParams = viewGroup2.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new ViewGroup.LayoutParams(-1, 0);
            } else {
                layoutParams.height = 0;
            }
            viewGroup2.setLayoutParams(layoutParams);
            return viewGroup2;
        }
        TBOrderWeexView tBOrderWeexView = (TBOrderWeexView) viewGroup2.findViewById(R.id.order_detail_weex_card);
        this.e = tBOrderWeexView;
        tBOrderWeexView.setOnLoadListener(new d(this, null));
        this.f = (ViewGroup) viewGroup2.findViewById(R.id.order_detail_weex_plugin_view);
        Context context2 = this.d;
        if ((context2 instanceof AppCompatActivity) && ((AppCompatActivity) context2).getLifecycle() != null) {
            ((AppCompatActivity) this.d).getLifecycle().addObserver(new ActivityLifecycleObserver(this));
        }
        return viewGroup2;
    }

    public final int l(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("12457a8c", new Object[]{this, new Integer(i)})).intValue();
        }
        int i2 = f2u.i(this.d);
        if (i2 > 0) {
            return (int) (i * ((i2 * 1.0f) / 750.0f));
        }
        return i;
    }

    public final void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3c051ac", new Object[]{this});
        } else if (this.g == null) {
            View inflate = LayoutInflater.from(this.d).inflate(R.layout.order_detail_weex_extra_view, this.f, false);
            this.g = inflate;
            this.h = (TextView) inflate.findViewById(R.id.tv_order_detail_weex_loading);
            this.i = (TextView) this.g.findViewById(R.id.tv_order_detail_weex_fail_tip);
            this.j = this.g.findViewById(R.id.layout_order_detail_weex_fail_reload);
        }
    }

    public void n(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ddae21c", new Object[]{this, str, str2, str3});
            return;
        }
        s();
        TBOrderWeexView tBOrderWeexView = this.e;
        if (tBOrderWeexView != null) {
            try {
                tBOrderWeexView.loadCard(str, str2, str3);
            } catch (Throwable unused) {
            }
        }
    }

    public void o(String str, String str2) {
        com.taobao.weex.appfram.storage.b iWXStorageAdapter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ff9db6c", new Object[]{this, str, str2});
        } else if (!TextUtils.isEmpty(str) && (iWXStorageAdapter = WXSDKEngine.getIWXStorageAdapter()) != null) {
            iWXStorageAdapter.b(str, str2, new a(this, str));
        }
    }

    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fef57493", new Object[]{this});
        } else if (this.e != null && dbl.o()) {
            try {
                this.e.onDestroy();
            } catch (Exception unused) {
            }
        }
    }

    public void q(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("152fa416", new Object[]{this, new Integer(i)});
            return;
        }
        TBOrderWeexView tBOrderWeexView = this.e;
        if (tBOrderWeexView != null && i > 0) {
            ViewGroup.LayoutParams layoutParams = tBOrderWeexView.getLayoutParams();
            layoutParams.height = i;
            this.e.setLayoutParams(layoutParams);
        }
        ViewGroup viewGroup = this.f;
        if (viewGroup != null) {
            ViewGroup.LayoutParams layoutParams2 = viewGroup.getLayoutParams();
            layoutParams2.height = i;
            this.f.setLayoutParams(layoutParams2);
        }
    }

    public final void r(boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4273af67", new Object[]{this, new Boolean(z), str});
            return;
        }
        m();
        this.h.setVisibility(8);
        this.i.setVisibility(0);
        this.f.removeAllViews();
        this.f.addView(this.g);
        this.f.setVisibility(0);
        this.i.setText(str);
        if (z) {
            this.j.setVisibility(0);
            ViewProxy.setOnClickListener(this.j, new c());
            return;
        }
        this.j.setVisibility(8);
        ViewProxy.setOnClickListener(this.j, null);
    }

    public final void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73936486", new Object[]{this});
            return;
        }
        m();
        this.i.setVisibility(8);
        this.j.setVisibility(8);
        this.h.setVisibility(0);
        this.f.removeAllViews();
        this.f.addView(this.g);
        this.f.setVisibility(0);
    }
}
