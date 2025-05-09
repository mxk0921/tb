package tb;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.component.module.DataEntry;
import com.taobao.android.detail.ttdetail.performance.PreRenderManager;
import com.taobao.android.detail.ttdetail.weex.AliDetailGalleryWVPlugin;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.MUSInstanceConfig;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class v9x extends oa4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public volatile boolean b;
    public final com.taobao.android.weex_framework.a c;
    public FrameLayout d;
    public View e;

    /* renamed from: a  reason: collision with root package name */
    public final zy9 f29880a = new zy9(-1, -1, 17);
    public final npc f = new b(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements kpc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.kpc
        public void a(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1414cfeb", new Object[]{this, view});
                return;
            }
            v9x.u(v9x.this, view);
            if (v9x.v(v9x.this) != null) {
                if (!(v9x.v(v9x.this).getChildCount() == 1 && v9x.v(v9x.this).getChildAt(0) == view)) {
                    v9x.v(v9x.this).removeAllViews();
                }
                v9x.v(v9x.this).addView(view, new FrameLayout.LayoutParams(-1, -1, 17));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b implements npc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(912261464);
            t2o.a(982515990);
        }

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
        public void onPrepareSuccess(com.taobao.android.weex_framework.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("27a2635b", new Object[]{this, aVar});
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
        public void onRenderFailed(com.taobao.android.weex_framework.a aVar, int i, String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cc0cbe2b", new Object[]{this, aVar, new Integer(i), str, new Boolean(z)});
            }
        }

        @Override // tb.npc
        public void onRenderSuccess(com.taobao.android.weex_framework.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2b2aeb48", new Object[]{this, aVar});
            }
        }

        public /* synthetic */ b(a aVar) {
            this();
        }
    }

    static {
        t2o.a(912261462);
    }

    public v9x(Context context, ze7 ze7Var, nb4 nb4Var, DataEntry... dataEntryArr) {
        super(context, ze7Var, nb4Var, dataEntryArr);
        MUSInstanceConfig mUSInstanceConfig = new MUSInstanceConfig();
        try {
            String y = y();
            if (TextUtils.isEmpty(y)) {
                y = "https://ttdetail.taobao.com/default";
            }
            mUSInstanceConfig.p(y);
        } catch (Throwable th) {
            tgh.c("WeexVersion2Component", "config.setBundleUrl()", th);
        }
        mUSInstanceConfig.B(true);
        mUSInstanceConfig.t(MUSInstanceConfig.MUSRenderType.MUSRenderTypeUnicorn);
        mUSInstanceConfig.y(MUSInstanceConfig.RenderMode.texture);
        mUSInstanceConfig.v(false);
        mUSInstanceConfig.u(new a());
        com.taobao.android.weex_framework.a c = com.taobao.android.weex_framework.b.f().c(this.mContext, mUSInstanceConfig);
        this.c = c;
        c.registerRenderListener(this.f);
    }

    public static /* synthetic */ Object ipc$super(v9x v9xVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1857981988) {
            super.onDidAppear();
            return null;
        } else if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/detail/ttdetail/component/module/WeexVersion2Component");
        }
    }

    public static /* synthetic */ View u(v9x v9xVar, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("5fd84251", new Object[]{v9xVar, view});
        }
        v9xVar.e = view;
        return view;
    }

    public static /* synthetic */ FrameLayout v(v9x v9xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("72d9cfd5", new Object[]{v9xVar});
        }
        return v9xVar.d;
    }

    @Override // tb.oa4
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        this.c.registerRenderListener(null);
        this.c.destroy();
    }

    @Override // tb.oa4
    public void onDidAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("914171dc", new Object[]{this});
            return;
        }
        super.onDidAppear();
        z();
    }

    @Override // tb.oa4
    public View onGetComponentView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("f631742", new Object[]{this, view});
        }
        return w(view);
    }

    @Override // tb.oa4
    public zy9 onGetFrameSize(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zy9) ipChange.ipc$dispatch("5fd8d0bf", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        return this.f29880a;
    }

    public View w(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("9a22db9a", new Object[]{this, view});
        }
        if (view == null || view.getId() != R.id.ll_weex2_container) {
            PreRenderManager g = PreRenderManager.g(this.mContext);
            if (g != null) {
                view = g.j(this.mContext, R.layout.tt_detail_weex2_component, null, true);
            } else {
                view = LayoutInflater.from(this.mContext).inflate(R.layout.tt_detail_weex2_component, (ViewGroup) null);
            }
        }
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.ll_weex2_container);
        this.d = frameLayout;
        if (!(frameLayout.getChildCount() == 1 && this.d.getChildAt(0) == this.e)) {
            this.d.removeAllViews();
            View view2 = this.e;
            if (view2 != null) {
                ygw.a(view2);
                this.d.addView(this.e, new FrameLayout.LayoutParams(-1, -1, 17));
            }
        }
        return view;
    }

    public final JSONObject x() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("448fed2d", new Object[]{this});
        }
        JSONObject f = this.mComponentData.f();
        if (f == null || (jSONObject = f.getJSONObject("params")) == null) {
            return null;
        }
        return jSONObject.getJSONObject(AliDetailGalleryWVPlugin.KEY_PARAMS_BRIDGE_DATA);
    }

    public final String y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b9b36c81", new Object[]{this});
        }
        JSONObject f = this.mComponentData.f();
        if (f != null) {
            return f.getString("url");
        }
        return null;
    }

    public final void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0ab7c00", new Object[]{this});
        } else if (!this.b) {
            String y = y();
            if (!TextUtils.isEmpty(y)) {
                this.c.initWithURL(Uri.parse(y));
                this.c.render(x(), null);
                this.b = true;
            }
        }
    }
}
