package tb;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.container.ui.splash.ISplashView;
import com.taobao.themis.kernel.entity.InstanceStartParams;
import com.taobao.themis.kernel.solution.TMSBaseSolution;
import com.taobao.themis.kernel.solution.TMSSolutionType;
import com.taobao.themis.kernel.utils.CommonExtKt;
import com.taobao.themis.kernel.utils.TMSInstanceExtKt;
import java.util.List;
import java.util.Map;
import java.util.Set;
import tb.bbs;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public abstract class t9s implements mqb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Activity f28583a;
    public final ViewGroup b;
    public bbs c;
    public bbs.c d;
    public TMSSolutionType e;
    public bbs.d f;
    public boolean g;

    static {
        t2o.a(835715076);
        t2o.a(835715074);
    }

    public t9s(Activity activity, ViewGroup viewGroup) {
        ckf.g(activity, "mActivity");
        this.f28583a = activity;
        this.b = viewGroup;
    }

    @Override // tb.mqb
    public void a(TMSSolutionType tMSSolutionType, bbs.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64113861", new Object[]{this, tMSSolutionType, dVar});
            return;
        }
        bbs bbsVar = this.c;
        if (bbsVar != null) {
            this.e = tMSSolutionType;
            this.f = dVar;
            if (TMSInstanceExtKt.e(bbsVar)) {
                bbsVar.n0(dVar);
                if (this.b != null) {
                    bbsVar.Z().createSplashView(this.b);
                }
                ISplashView splashView = bbsVar.Z().getSplashView();
                if (splashView != null) {
                    splashView.a();
                }
            } else {
                bbsVar.t0(c(bbsVar));
                bbsVar.n0(dVar);
                TMSBaseSolution a2 = cds.a(bbsVar, tMSSolutionType);
                if (a2 != null) {
                    ViewGroup viewGroup = this.b;
                    if (viewGroup != null) {
                        a2.createSplashView(viewGroup);
                    }
                    bbsVar.u0(a2);
                    ISplashView splashView2 = a2.getSplashView();
                    if (splashView2 != null) {
                        splashView2.a();
                    }
                    bbs.c launchListener = a2.getLaunchListener();
                    this.d = launchListener;
                    if (launchListener != null) {
                        launchListener.d();
                    }
                    bbsVar.z0(this.d);
                } else {
                    return;
                }
            }
            gld m = CommonExtKt.m(bbsVar);
            if (m != null) {
                m.C("pageCreateEnd");
            }
            f8d X = bbsVar.X();
            Activity I = bbsVar.I();
            ckf.f(I, "instance.activity");
            Uri g = ies.g(bbsVar.e0());
            ckf.f(g, "parseUrl(instance.url)");
            X.onProperty("getUseHomeFragmentAB", mas.d(I, g).b());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009c  */
    @Override // tb.mqb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public tb.bbs b(java.lang.String r5, com.alibaba.fastjson.JSONObject r6) {
        /*
            r4 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.t9s.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x001b
            java.lang.String r1 = "326357e3"
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r4
            r3 = 1
            r2[r3] = r5
            r5 = 2
            r2[r5] = r6
            java.lang.Object r5 = r0.ipc$dispatch(r1, r2)
            tb.bbs r5 = (tb.bbs) r5
            return r5
        L_0x001b:
            java.lang.String r0 = "url"
            tb.ckf.g(r5, r0)
            long r0 = java.lang.System.currentTimeMillis()
            com.taobao.themis.kernel.entity.InstanceStartParams r5 = r4.n(r5, r6)
            r4.m(r5)
            android.app.Activity r2 = r4.f28583a
            tb.no8 r2 = tb.h8s.e(r2)
            boolean r2 = r2.d()
            if (r2 == 0) goto L_0x0060
            java.lang.String r2 = "tms_instance_id"
            if (r6 != 0) goto L_0x003f
            r3 = 0
            goto L_0x0043
        L_0x003f:
            java.lang.Object r3 = r6.get(r2)
        L_0x0043:
            if (r3 == 0) goto L_0x0060
            com.android.alibaba.ip.runtime.IpChange r5 = com.taobao.themis.kernel.utils.TMSAssertUtils.$ipChange
            java.lang.String r5 = r6.getString(r2)
            tb.bbs r5 = com.taobao.themis.kernel.manager.TMSInstanceManager.e(r5)
            tb.ckf.d(r5)
            tb.mgg r6 = r5.S()
            java.lang.String r2 = "isLauncherNG"
            java.lang.String r3 = "true"
            r6.a(r2, r3)
            goto L_0x006a
        L_0x0060:
            android.app.Activity r6 = r4.f28583a
            com.taobao.themis.kernel.TMSContainerType r2 = r4.getContainerType()
            tb.bbs r5 = com.taobao.themis.kernel.manager.TMSInstanceManager.a(r6, r5, r2)
        L_0x006a:
            r4.c = r5
            boolean r6 = com.taobao.themis.kernel.utils.TMSInstanceExtKt.e(r5)
            if (r6 == 0) goto L_0x0084
            tb.swd r6 = r4.c(r5)
            r5.t0(r6)
            android.app.Activity r6 = r5.K()
            if (r6 != 0) goto L_0x0084
            android.app.Activity r6 = r4.f28583a
            r5.H(r6)
        L_0x0084:
            java.lang.Class<tb.t9s> r6 = tb.t9s.class
            r5.k(r6, r4)
            tb.gld r6 = com.taobao.themis.kernel.utils.CommonExtKt.m(r5)
            if (r6 != 0) goto L_0x0090
            goto L_0x0095
        L_0x0090:
            java.lang.String r2 = "instanceInitStart"
            r6.f(r2, r0)
        L_0x0095:
            tb.gld r6 = com.taobao.themis.kernel.utils.CommonExtKt.m(r5)
            if (r6 != 0) goto L_0x009c
            goto L_0x00a1
        L_0x009c:
            java.lang.String r0 = "instanceInitEnd"
            r6.C(r0)
        L_0x00a1:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.t9s.b(java.lang.String, com.alibaba.fastjson.JSONObject):tb.bbs");
    }

    public abstract swd c(bbs bbsVar);

    public final boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("80ccaa5f", new Object[]{this})).booleanValue();
        }
        return this.g;
    }

    public final Activity e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("3806435b", new Object[]{this});
        }
        return this.f28583a;
    }

    public final bbs f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bbs) ipChange.ipc$dispatch("f3197ddf", new Object[]{this});
        }
        return this.c;
    }

    public final bbs.d g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bbs.d) ipChange.ipc$dispatch("ec07165b", new Object[]{this});
        }
        return this.f;
    }

    public final TMSSolutionType h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TMSSolutionType) ipChange.ipc$dispatch("382b666f", new Object[]{this});
        }
        return this.e;
    }

    public final bbs i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bbs) ipChange.ipc$dispatch("6141df52", new Object[]{this});
        }
        return this.c;
    }

    public void j(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        bbs bbsVar = this.c;
        if (bbsVar != null) {
            bbsVar.onActivityResult(i, i2, intent);
        }
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        bbs bbsVar = this.c;
        if (bbsVar != null) {
            bbsVar.destroy();
        }
    }

    public final void m(InstanceStartParams instanceStartParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2d565a", new Object[]{this, instanceStartParams});
        }
    }

    public final void o(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba1cd1ff", new Object[]{this, map});
            return;
        }
        ckf.g(map, "monitorData");
        bbs bbsVar = this.c;
        if (bbsVar != null) {
            if (map.containsKey(mop.KEY_CONTAINER_START)) {
                bbsVar.S().c(mop.KEY_CONTAINER_START, String.valueOf(map.get(mop.KEY_CONTAINER_START)));
                gld m = CommonExtKt.m(bbsVar);
                if (m != null) {
                    m.D(mop.KEY_CONTAINER_START, String.valueOf(map.get(mop.KEY_CONTAINER_START)));
                }
                vxm.b.e().j("TMS_appStart", o9s.d(String.valueOf(map.get(mop.KEY_CONTAINER_START))));
            }
            if (map.containsKey("recycledActivity")) {
                bbsVar.S().a("recycledActivity", String.valueOf(map.get("recycledActivity")));
            }
            if (map.containsKey("containerOnCreate")) {
                bbsVar.S().c("containerOnCreate", String.valueOf(map.get("containerOnCreate")));
                gld m2 = CommonExtKt.m(bbsVar);
                if (m2 != null) {
                    m2.D("containerOnCreate", String.valueOf(map.get("containerOnCreate")));
                }
                vxm.b.e().j("containerOnCreate", o9s.d(String.valueOf(map.get("containerOnCreate"))));
            }
        }
    }

    public void l(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36503cc6", new Object[]{this, str, jSONObject});
            return;
        }
        ckf.g(str, "url");
        this.g = true;
        bbs bbsVar = this.c;
        if (bbsVar != null) {
            bbsVar.destroy();
        }
        this.g = false;
        b(str, jSONObject);
        a(this.e, this.f);
    }

    public final InstanceStartParams n(String str, JSONObject jSONObject) {
        String queryParameter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InstanceStartParams) ipChange.ipc$dispatch("4f059f2a", new Object[]{this, str, jSONObject});
        }
        Uri g = ies.g(str);
        Bundle bundle = new Bundle();
        Set<String> queryParameterNames = g.getQueryParameterNames();
        ckf.f(queryParameterNames, "uri.queryParameterNames");
        for (String str2 : queryParameterNames) {
            if (!ckf.b(str2, "query") && (queryParameter = g.getQueryParameter(str2)) != null) {
                bundle.putString(str2, queryParameter);
            }
        }
        Bundle bundle2 = new Bundle();
        String queryParameter2 = g.getQueryParameter("query");
        if (queryParameter2 != null) {
            for (String str3 : wsq.z0(queryParameter2, new String[]{"&"}, false, 0, 6, null)) {
                List z0 = wsq.z0(str3, new String[]{"="}, false, 0, 6, null);
                if (z0.size() >= 2) {
                    bundle2.putString((String) z0.get(0), (String) z0.get(1));
                }
            }
        }
        if (jSONObject == null) {
            return new InstanceStartParams(str, bundle, bundle2);
        }
        return new InstanceStartParams(str, bundle, bundle2, jSONObject);
    }
}
