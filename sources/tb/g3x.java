package tb;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.alibaba.android.ultron.vfw.core.ViewEngine;
import com.alibaba.android.ultron.vfw.weex2.WVWeex2JSBridgePlugin;
import com.alibaba.android.ultron.vfw.weex2.Weex2ContainerFrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.MUSInstanceConfig;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import com.taobao.weex.common.Constants;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class g3x extends sz implements epk {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public FrameLayout d;
    public com.taobao.android.weex_framework.a e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements kpc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.kpc
        public void a(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1414cfeb", new Object[]{this, view});
            } else if (view == null) {
                UnifyLog.e("Weex2ViewHolder.createWeex2Instance", "weex2View is null");
            } else if (g3x.g(g3x.this) == null) {
                UnifyLog.e("Weex2ViewHolder.createWeex2Instance", "mRootView is null");
            } else {
                if (view.getParent() != null) {
                    ((ViewGroup) view.getParent()).removeView(view);
                }
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams == null) {
                    layoutParams = new FrameLayout.LayoutParams(-1, -1);
                } else {
                    layoutParams.width = -1;
                    layoutParams.height = -1;
                }
                view.setLayoutParams(layoutParams);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
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
                return;
            }
            if (("errorType:" + i + ",errorMsg:" + str) == null) {
                str = "";
            }
            UnifyLog.e("Weex2ViewHolder.onJSException", str);
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
            String str2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cc0861e4", new Object[]{this, aVar, new Integer(i), str, new Boolean(z)});
                return;
            }
            if (g3x.h(g3x.this) != null) {
                g3x.h(g3x.this).a(aVar, i, str, z);
            } else {
                i3x.a(g3x.g(g3x.this), g3x.k(g3x.this));
            }
            if (("errorType:" + i + ",errorMsg:" + str) == null) {
                str2 = "";
            } else {
                str2 = str + ",isFatal:" + z;
            }
            UnifyLog.e("Weex2ViewHolder.onRefreshFailed", str2);
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
            String str2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cc0cbe2b", new Object[]{this, aVar, new Integer(i), str, new Boolean(z)});
                return;
            }
            if (g3x.h(g3x.this) != null) {
                g3x.h(g3x.this).a(aVar, i, str, z);
            } else {
                i3x.a(g3x.g(g3x.this), g3x.j(g3x.this));
            }
            if (("errorType:" + i + ",errorMsg:" + str) == null) {
                str2 = "";
            } else {
                str2 = str + ",isFatal:" + z;
            }
            UnifyLog.e("Weex2ViewHolder.onRenderFailed", str2);
        }

        @Override // tb.npc
        public void onRenderSuccess(com.taobao.android.weex_framework.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2b2aeb48", new Object[]{this, aVar});
                return;
            }
            if (g3x.h(g3x.this) != null) {
                g3x.h(g3x.this).b(aVar.getRenderView());
            }
            if (g3x.g(g3x.this) != null && g3x.i(g3x.this) != null) {
                g3x.g(g3x.this).addView(aVar.getRenderRoot());
            }
        }
    }

    static {
        t2o.a(157286801);
        t2o.a(157286546);
    }

    public g3x(ViewEngine viewEngine) {
        super(viewEngine);
    }

    public static /* synthetic */ FrameLayout g(g3x g3xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("33baa515", new Object[]{g3xVar});
        }
        return g3xVar.d;
    }

    public static /* synthetic */ i25 h(g3x g3xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i25) ipChange.ipc$dispatch("e85ba5", new Object[]{g3xVar});
        }
        g3xVar.getClass();
        return null;
    }

    public static /* synthetic */ IDMComponent i(g3x g3xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDMComponent) ipChange.ipc$dispatch("ed11df4a", new Object[]{g3xVar});
        }
        return g3xVar.c;
    }

    public static /* synthetic */ Object ipc$super(g3x g3xVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/vfw/weex2/Weex2ViewHolder");
    }

    public static /* synthetic */ IDMComponent j(g3x g3xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDMComponent) ipChange.ipc$dispatch("a08af14b", new Object[]{g3xVar});
        }
        return g3xVar.c;
    }

    public static /* synthetic */ IDMComponent k(g3x g3xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDMComponent) ipChange.ipc$dispatch("5404034c", new Object[]{g3xVar});
        }
        return g3xVar.c;
    }

    public static int m(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ad70657", new Object[]{context, new Integer(i)})).intValue();
        }
        return (i * context.getResources().getDisplayMetrics().widthPixels) / 375;
    }

    @Override // tb.sz
    public View e(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("14914f88", new Object[]{this, viewGroup});
        }
        this.d = new Weex2ContainerFrameLayout(this.f28365a.K());
        this.d.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        return this.d;
    }

    @Override // tb.sz
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else if (this.e == null) {
            UnifyLog.e("Weex2ViewHolder.onDestroy", "mMUSInstance is null");
        } else {
            fsw.p("weex2component");
            this.e.destroy();
        }
    }

    public final com.taobao.android.weex_framework.a n(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.weex_framework.a) ipChange.ipc$dispatch("e381394e", new Object[]{this, context, str});
        }
        MUSInstanceConfig mUSInstanceConfig = new MUSInstanceConfig();
        mUSInstanceConfig.B(true);
        mUSInstanceConfig.t(MUSInstanceConfig.MUSRenderType.MUSRenderTypeUnicorn);
        mUSInstanceConfig.y(MUSInstanceConfig.RenderMode.texture);
        mUSInstanceConfig.v(false);
        mUSInstanceConfig.p(str);
        mUSInstanceConfig.u(new a());
        return com.taobao.android.weex_framework.b.f().c(context, mUSInstanceConfig);
    }

    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
        } else if (this.e != null) {
            hav.d("weex2lifecycle", "onPause");
            this.e.onActivityPause();
        }
    }

    public void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
        } else if (this.e != null) {
            hav.d("weex2lifecycle", "onResume");
            this.e.onActivityResume();
        }
    }

    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
        } else if (this.e != null) {
            hav.d("weex2lifecycle", "onStart");
            this.e.onActivityStart();
        }
    }

    public void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
        } else if (this.e != null) {
            hav.d("weex2lifecycle", "onStop");
            this.e.onActivityStop();
        }
    }

    public void t(fce fceVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97b343ef", new Object[]{this, fceVar});
            return;
        }
        FrameLayout frameLayout = this.d;
        if (frameLayout instanceof Weex2ContainerFrameLayout) {
            ((Weex2ContainerFrameLayout) frameLayout).setWeex2EventDispatch(fceVar);
        }
    }

    public final void u(com.taobao.android.weex_framework.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1a3ae05", new Object[]{this, aVar});
        } else {
            aVar.registerRenderListener(new b());
        }
    }

    @Override // tb.sz
    public void d(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1fbfb67", new Object[]{this, iDMComponent});
            return;
        }
        this.c = iDMComponent;
        String b2 = i3x.b(iDMComponent);
        if (TextUtils.isEmpty(b2)) {
            i3x.a(this.d, this.c);
            UnifyLog.e("Weex2ViewHolder.onBindData", "url is empty");
            return;
        }
        if (this.e == null) {
            com.taobao.android.weex_framework.a n = n(this.f28365a.K(), b2);
            this.e = n;
            ((Weex2ContainerFrameLayout) this.d).initWeex2Instance(n);
            u(this.e);
        }
        FrameLayout frameLayout = this.d;
        if (frameLayout instanceof Weex2ContainerFrameLayout) {
            ((Weex2ContainerFrameLayout) frameLayout).setDispatchEventState(iDMComponent);
        }
        JSONObject fields = this.c.getFields();
        if ((this.d instanceof Weex2ContainerFrameLayout) && fields != null && fields.getString("enableNestedScroll") != null && "true".equalsIgnoreCase(fields.getString("enableNestedScroll"))) {
            ((Weex2ContainerFrameLayout) this.d).setEnableNestedScroll(true);
        }
        if (this.e.isRenderCalled()) {
            this.e.refresh(fields, null);
            return;
        }
        if (fields != null) {
            o(fields);
        }
        this.e.initWithURL(Uri.parse(b2));
        this.e.render(fields, null);
    }

    public final void o(JSONObject jSONObject) {
        int l;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d16c34cb", new Object[]{this, jSONObject});
            return;
        }
        fsw.k("weex2component", new WVWeex2JSBridgePlugin(this.d, this.c));
        if (jSONObject.containsKey("style")) {
            try {
                JSONObject jSONObject2 = jSONObject.getJSONObject("style");
                ViewGroup.LayoutParams layoutParams = this.d.getLayoutParams();
                boolean containsKey = jSONObject2.containsKey("height");
                if (containsKey) {
                    int m = m(this.f28365a.K(), jSONObject2.getInteger("height").intValue());
                    if (layoutParams == null) {
                        layoutParams = new FrameLayout.LayoutParams(-1, m);
                    } else {
                        layoutParams.height = m;
                    }
                }
                boolean containsKey2 = jSONObject2.containsKey("gravity");
                if (containsKey2 && (l = l(jSONObject2.getString("gravity"))) != 0 && (layoutParams instanceof FrameLayout.LayoutParams)) {
                    ((FrameLayout.LayoutParams) layoutParams).gravity = l;
                }
                if (containsKey || containsKey2) {
                    this.d.setLayoutParams(layoutParams);
                }
                if (jSONObject2.containsKey(Constants.Name.PLACE_HOLDER)) {
                    String string = jSONObject2.getString(Constants.Name.PLACE_HOLDER);
                    TUrlImageView tUrlImageView = new TUrlImageView(this.f28365a.K());
                    tUrlImageView.setImageUrl(string);
                    tUrlImageView.setVisibility(0);
                    tUrlImageView.setScaleType(ImageView.ScaleType.FIT_START);
                    this.d.addView(tUrlImageView, new ViewGroup.LayoutParams(-1, -1));
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0058, code lost:
        if (r5.equals("center") == false) goto L_0x002c;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int l(java.lang.String r5) {
        /*
            r0 = 3
            r1 = 1
            r2 = 0
            com.android.alibaba.ip.runtime.IpChange r3 = tb.g3x.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x001a
            java.lang.String r0 = "e2f26f5a"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r5
            java.lang.Object r5 = r3.ipc$dispatch(r0, r1)
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            return r5
        L_0x001a:
            boolean r3 = android.text.TextUtils.isEmpty(r5)
            if (r3 == 0) goto L_0x0021
            return r2
        L_0x0021:
            r5.hashCode()
            r3 = -1
            int r4 = r5.hashCode()
            switch(r4) {
                case -1383228885: goto L_0x005b;
                case -1364013995: goto L_0x0052;
                case 115029: goto L_0x0046;
                case 3317767: goto L_0x003a;
                case 108511772: goto L_0x002e;
                default: goto L_0x002c;
            }
        L_0x002c:
            r1 = -1
            goto L_0x0065
        L_0x002e:
            java.lang.String r1 = "right"
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto L_0x0038
            goto L_0x002c
        L_0x0038:
            r1 = 4
            goto L_0x0065
        L_0x003a:
            java.lang.String r1 = "left"
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto L_0x0044
            goto L_0x002c
        L_0x0044:
            r1 = 3
            goto L_0x0065
        L_0x0046:
            java.lang.String r1 = "top"
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto L_0x0050
            goto L_0x002c
        L_0x0050:
            r1 = 2
            goto L_0x0065
        L_0x0052:
            java.lang.String r4 = "center"
            boolean r5 = r5.equals(r4)
            if (r5 != 0) goto L_0x0065
            goto L_0x002c
        L_0x005b:
            java.lang.String r1 = "bottom"
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto L_0x0064
            goto L_0x002c
        L_0x0064:
            r1 = 0
        L_0x0065:
            switch(r1) {
                case 0: goto L_0x0072;
                case 1: goto L_0x006f;
                case 2: goto L_0x006c;
                case 3: goto L_0x0074;
                case 4: goto L_0x006a;
                default: goto L_0x0068;
            }
        L_0x0068:
            r0 = 0
            goto L_0x0074
        L_0x006a:
            r0 = 5
            goto L_0x0074
        L_0x006c:
            r0 = 48
            goto L_0x0074
        L_0x006f:
            r0 = 17
            goto L_0x0074
        L_0x0072:
            r0 = 80
        L_0x0074:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.g3x.l(java.lang.String):int");
    }
}
