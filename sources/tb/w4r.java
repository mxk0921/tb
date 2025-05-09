package tb;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilitykit.ability.pop.render.ActivityLifeCycleCbRender;
import com.taobao.android.abilitykit.ability.pop.render.IAKPopRender;
import com.taobao.android.abilitykit.ability.pop.render.PopErrorView;
import com.taobao.taobao.R;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.WXSDKManager;
import com.taobao.weex.common.WXErrorCode;
import com.taobao.weex.common.WXRenderStrategy;
import tb.h9;
import tb.n9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class w4r<PARAMS extends h9, CONTEXT extends n9> extends ActivityLifeCycleCbRender<PARAMS, CONTEXT> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public CONTEXT f;
    public WXSDKInstance g;
    public x2x h;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements gbe {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ y7 f30457a;
        public final /* synthetic */ iab b;
        public final /* synthetic */ Context c;

        public a(y7 y7Var, iab iabVar, Context context) {
            this.f30457a = y7Var;
            this.b = iabVar;
            this.c = context;
        }

        @Override // tb.gbe
        public void onException(WXSDKInstance wXSDKInstance, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("88f82eeb", new Object[]{this, wXSDKInstance, str, str2});
            } else if (!TextUtils.isEmpty(str)) {
                if (str.equals(WXErrorCode.WX_DEGRAD_ERR.getErrorCode()) || str.equals(WXErrorCode.WX_DEGRAD_ERR_INSTANCE_CREATE_FAILED.getErrorCode()) || str.equals(WXErrorCode.WX_DEGRAD_ERR_NETWORK_BUNDLE_DOWNLOAD_FAILED.getErrorCode()) || str.equals(WXErrorCode.WX_DEGRAD_ERR_BUNDLE_CONTENTTYPE_ERROR.getErrorCode()) || str.equals(WXErrorCode.WX_DEGRAD_ERR_NETWORK_CHECK_CONTENT_LENGTH_FAILED.getErrorCode())) {
                    this.b.a(new a8(10000, "weex error:".concat(str)), new PopErrorView(this.c, w4r.f(w4r.this)));
                }
            }
        }

        @Override // tb.gbe
        public void onRefreshSuccess(WXSDKInstance wXSDKInstance, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d57f8320", new Object[]{this, wXSDKInstance, new Integer(i), new Integer(i2)});
            }
        }

        @Override // tb.gbe
        public void onRenderSuccess(WXSDKInstance wXSDKInstance, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c414a5f9", new Object[]{this, wXSDKInstance, new Integer(i), new Integer(i2)});
            }
        }

        @Override // tb.gbe
        public void onViewCreated(WXSDKInstance wXSDKInstance, View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9eab5f0f", new Object[]{this, wXSDKInstance, view});
            } else if (view != null) {
                view.setTag(R.id.tak_pop_ability_engine_tag, this.f30457a);
                view.setClickable(true);
                this.b.onRenderSuccess(view);
            } else {
                this.b.a(new a8(10000, "weex view create failed"), null);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements WXSDKManager.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ iab f30458a;
        public final /* synthetic */ Context b;

        public b(iab iabVar, Context context) {
            this.f30458a = iabVar;
            this.b = context;
        }

        @Override // com.taobao.weex.WXSDKManager.a
        public void a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c4e0fc68", new Object[]{this, str, str2});
                return;
            }
            iab iabVar = this.f30458a;
            iabVar.a(new a8(10000, "weex error:" + str), new PopErrorView(this.b, w4r.q(w4r.this)));
        }

        @Override // com.taobao.weex.WXSDKManager.a
        public void onInitSuccess() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb2dd3fb", new Object[]{this});
                return;
            }
            w4r.o(w4r.this).c1(w4r.g(w4r.this));
            w4r.o(w4r.this).X0("TAKWeexPopRender", w4r.p(w4r.this).e, null, null, WXRenderStrategy.APPEND_ASYNC);
        }
    }

    static {
        t2o.a(786432151);
    }

    public static /* synthetic */ h9 f(w4r w4rVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h9) ipChange.ipc$dispatch("b6ee2281", new Object[]{w4rVar});
        }
        return w4rVar.c;
    }

    public static /* synthetic */ x2x g(w4r w4rVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x2x) ipChange.ipc$dispatch("35ad1387", new Object[]{w4rVar});
        }
        return w4rVar.h;
    }

    public static /* synthetic */ Object ipc$super(w4r w4rVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1314487601) {
            super.n((String) objArr[0], (JSONObject) objArr[1]);
            return null;
        } else if (hashCode == 1885737845) {
            super.k((View) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/tbabilitykit/weex/pop/render/TAKWeexRender");
        }
    }

    public static /* synthetic */ WXSDKInstance o(w4r w4rVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WXSDKInstance) ipChange.ipc$dispatch("375d38c0", new Object[]{w4rVar});
        }
        return w4rVar.g;
    }

    public static /* synthetic */ h9 p(w4r w4rVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h9) ipChange.ipc$dispatch("734b52de", new Object[]{w4rVar});
        }
        return w4rVar.c;
    }

    public static /* synthetic */ h9 q(w4r w4rVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h9) ipChange.ipc$dispatch("76a62fd", new Object[]{w4rVar});
        }
        return w4rVar.c;
    }

    @Override // com.taobao.android.abilitykit.ability.pop.render.ActivityLifeCycleCbRender
    public void c(CONTEXT context, PARAMS params, View view, iab iabVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0561e42", new Object[]{this, context, params, view, iabVar});
            return;
        }
        this.f = context;
        h9 h9Var = this.c;
        if (h9Var == null || TextUtils.isEmpty(h9Var.e)) {
            iabVar.a(new a8(10015, "url is empty"), null);
            return;
        }
        Context d = context.d();
        if (d == null) {
            iabVar.a(new a8(10015, "context is null"), null);
            return;
        }
        boolean h = abl.h();
        if (this.g == null) {
            this.g = new WXSDKInstance(d);
            this.g.registerRenderListener(new a(context.a(), iabVar, d));
            this.h = new x2x();
            if (!h) {
                this.g.r1(this.c.e);
                this.g.i1(new b(iabVar, d));
            }
        }
        if (h) {
            this.g.c1(this.h);
            this.g.X0("TAKWeexPopRender", this.c.e, null, null, WXRenderStrategy.APPEND_ASYNC);
        }
    }

    @Override // com.taobao.android.abilitykit.ability.pop.render.IAKPopRender
    public String i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f8e8363f", new Object[]{this, str});
        }
        return "weex1";
    }

    @Override // com.taobao.android.abilitykit.ability.pop.render.ActivityLifeCycleCbRender, com.taobao.android.abilitykit.ability.pop.render.IAKPopRender
    public void k(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70661375", new Object[]{this, view});
            return;
        }
        super.k(view);
        WXSDKInstance wXSDKInstance = this.g;
        if (wXSDKInstance != null && !wXSDKInstance.i0()) {
            this.g.destroy();
        }
    }

    @Override // com.taobao.android.abilitykit.ability.pop.render.IAKPopRender
    public boolean l(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("21f6b89a", new Object[]{this, view, new Integer(i)})).booleanValue();
        }
        return false;
    }

    @Override // tb.zz1, com.taobao.android.abilitykit.ability.pop.render.IAKPopRender
    public void n(String str, JSONObject jSONObject) {
        WXSDKInstance wXSDKInstance;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1a682cf", new Object[]{this, str, jSONObject});
            return;
        }
        super.n(str, jSONObject);
        if (!IAKPopRender.LifecycleType.ANIMATION_POSITION_CHANGE.equals(str) && (wXSDKInstance = this.g) != null) {
            wXSDKInstance.B(str, jSONObject);
        }
    }

    @Override // com.taobao.android.abilitykit.ability.pop.render.IAKPopRender
    public void onSizeChanged(int i, int i2) {
        x2x x2xVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb57503b", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (this.g != null && this.f != null && this.c != null && i > 0 && i2 > 0 && (x2xVar = this.h) != null) {
            x2xVar.f31106a = new Rect(0, 0, i, i2);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0055, code lost:
        if (r7.equals("onStopped") == false) goto L_0x0028;
     */
    @Override // com.taobao.android.abilitykit.ability.pop.render.ActivityLifeCycleCbRender
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void e(java.lang.String r7, android.os.Bundle r8) {
        /*
            r6 = this;
            r0 = 2
            r1 = 1
            r2 = 0
            r3 = 3
            com.android.alibaba.ip.runtime.IpChange r4 = tb.w4r.$ipChange
            boolean r5 = r4 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r5 == 0) goto L_0x0018
            java.lang.String r5 = "59cc3545"
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r2] = r6
            r3[r1] = r7
            r3[r0] = r8
            r4.ipc$dispatch(r5, r3)
            return
        L_0x0018:
            com.taobao.weex.WXSDKInstance r8 = r6.g
            if (r8 != 0) goto L_0x001d
            return
        L_0x001d:
            r7.hashCode()
            r8 = -1
            int r4 = r7.hashCode()
            switch(r4) {
                case -1930133495: goto L_0x0064;
                case -560905822: goto L_0x0058;
                case -548039954: goto L_0x004e;
                case 1403088877: goto L_0x0042;
                case 1463983852: goto L_0x0036;
                case 1955975930: goto L_0x002a;
                default: goto L_0x0028;
            }
        L_0x0028:
            r0 = -1
            goto L_0x006f
        L_0x002a:
            java.lang.String r0 = "onDestroyed"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x0034
            goto L_0x0028
        L_0x0034:
            r0 = 5
            goto L_0x006f
        L_0x0036:
            java.lang.String r0 = "onResume"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x0040
            goto L_0x0028
        L_0x0040:
            r0 = 4
            goto L_0x006f
        L_0x0042:
            java.lang.String r0 = "onPaused"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x004c
            goto L_0x0028
        L_0x004c:
            r0 = 3
            goto L_0x006f
        L_0x004e:
            java.lang.String r1 = "onStopped"
            boolean r7 = r7.equals(r1)
            if (r7 != 0) goto L_0x006f
            goto L_0x0028
        L_0x0058:
            java.lang.String r0 = "onStarted"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x0062
            goto L_0x0028
        L_0x0062:
            r0 = 1
            goto L_0x006f
        L_0x0064:
            java.lang.String r0 = "onCreated"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x006e
            goto L_0x0028
        L_0x006e:
            r0 = 0
        L_0x006f:
            switch(r0) {
                case 0: goto L_0x0091;
                case 1: goto L_0x008b;
                case 2: goto L_0x0085;
                case 3: goto L_0x007f;
                case 4: goto L_0x0079;
                case 5: goto L_0x0073;
                default: goto L_0x0072;
            }
        L_0x0072:
            goto L_0x0096
        L_0x0073:
            com.taobao.weex.WXSDKInstance r7 = r6.g
            r7.onActivityDestroy()
            goto L_0x0096
        L_0x0079:
            com.taobao.weex.WXSDKInstance r7 = r6.g
            r7.onActivityResume()
            goto L_0x0096
        L_0x007f:
            com.taobao.weex.WXSDKInstance r7 = r6.g
            r7.onActivityPause()
            goto L_0x0096
        L_0x0085:
            com.taobao.weex.WXSDKInstance r7 = r6.g
            r7.onActivityStop()
            goto L_0x0096
        L_0x008b:
            com.taobao.weex.WXSDKInstance r7 = r6.g
            r7.onActivityStart()
            goto L_0x0096
        L_0x0091:
            com.taobao.weex.WXSDKInstance r7 = r6.g
            r7.onActivityCreate()
        L_0x0096:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.w4r.e(java.lang.String, android.os.Bundle):void");
    }
}
