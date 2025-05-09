package com.taobao.mytaobao.pagev2.presenter;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.os.Handler;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.base.Versions;
import com.taobao.login4android.api.Login;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.login4android.broadcast.LoginBroadcastHelper;
import com.taobao.mytaobao.base.MtbGlobalEnv;
import com.taobao.mytaobao.basement.BasementViewController;
import com.taobao.mytaobao.basement.weex.BasementFeedDataProvider;
import com.taobao.mytaobao.pagev2.MtbBizProxyV2;
import com.taobao.mytaobao.pagev2.dataservice.MtbDataServiceFacade;
import com.taobao.mytaobao.pagev2.listener.PageDataChangeReceiver;
import com.taobao.mytaobao.pagev2.listener.RefreshMtbReceiver;
import com.taobao.mytaobao.pagev2.listener.ThemeChangeReceiver;
import com.taobao.mytaobao.ultron.MTBPresenter;
import com.taobao.tao.Globals;
import com.taobao.tao.log.TLog;
import com.ut.mini.UTAnalytics;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import tb.a3w;
import tb.c38;
import tb.ckf;
import tb.cpt;
import tb.ggj;
import tb.h3j;
import tb.ih4;
import tb.iln;
import tb.jln;
import tb.jpu;
import tb.n78;
import tb.p3j;
import tb.pl7;
import tb.q32;
import tb.q3j;
import tb.qgj;
import tb.s1c;
import tb.s3j;
import tb.sgj;
import tb.suv;
import tb.t1c;
import tb.t2o;
import tb.tib;
import tb.u3j;
import tb.uuu;
import tb.wsq;
import tb.z6t;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class MtbPresenterV2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public MtbBizProxyV2 f11302a;
    public boolean c;
    public boolean e;
    public final PageDataChangeReceiver f;
    public final RefreshMtbReceiver g;
    public final ThemeChangeReceiver h;
    public s1c i;
    public LoginAction j;
    public BroadcastReceiver k;
    public boolean l;
    public final Handler b = new Handler(uuu.f29625a);
    public boolean d = true;

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final a INSTANCE = new a();

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                MtbDataServiceFacade.y(1);
            }
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Activity f11303a;
        public final /* synthetic */ s3j b;
        public final /* synthetic */ MtbBizProxyV2 c;

        public b(Activity activity, s3j s3jVar, MtbBizProxyV2 mtbBizProxyV2) {
            this.f11303a = activity;
            this.b = s3jVar;
            this.c = mtbBizProxyV2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            c38.INSTANCE.a(this.f11303a, this.b, this.c.P().a().k());
            tib a2 = q32.Companion.a();
            if (a2 != null) {
                a2.d();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class d implements s1c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.s1c
        public void onSuccess(a3w a3wVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("68a126ba", new Object[]{this, a3wVar});
            } else {
                MtbDataServiceFacade.v();
            }
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final e INSTANCE = new e();

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                q3j.y();
            }
        }
    }

    static {
        t2o.a(745537984);
    }

    public MtbPresenterV2(MtbBizProxyV2 mtbBizProxyV2) {
        ckf.h(mtbBizProxyV2, "iView");
        this.f11302a = mtbBizProxyV2;
        this.f = new PageDataChangeReceiver(mtbBizProxyV2);
        this.g = new RefreshMtbReceiver(mtbBizProxyV2);
        this.h = new ThemeChangeReceiver(mtbBizProxyV2);
    }

    public static final /* synthetic */ MtbBizProxyV2 a(MtbPresenterV2 mtbPresenterV2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtbBizProxyV2) ipChange.ipc$dispatch("3ec0e7f0", new Object[]{mtbPresenterV2});
        }
        return mtbPresenterV2.f11302a;
    }

    public static final /* synthetic */ PageDataChangeReceiver b(MtbPresenterV2 mtbPresenterV2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PageDataChangeReceiver) ipChange.ipc$dispatch("65ab21c6", new Object[]{mtbPresenterV2});
        }
        return mtbPresenterV2.f;
    }

    public static final /* synthetic */ ThemeChangeReceiver c(MtbPresenterV2 mtbPresenterV2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThemeChangeReceiver) ipChange.ipc$dispatch("20d626ec", new Object[]{mtbPresenterV2});
        }
        return mtbPresenterV2.h;
    }

    public static final /* synthetic */ void d(MtbPresenterV2 mtbPresenterV2, Activity activity, LoginAction loginAction, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa6bdf35", new Object[]{mtbPresenterV2, activity, loginAction, new Boolean(z)});
        } else {
            mtbPresenterV2.n(activity, loginAction, z);
        }
    }

    public static final /* synthetic */ void e(MtbPresenterV2 mtbPresenterV2, h3j h3jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ca94c91", new Object[]{mtbPresenterV2, h3jVar});
        } else {
            mtbPresenterV2.p(h3jVar);
        }
    }

    public static final /* synthetic */ void f(MtbPresenterV2 mtbPresenterV2, BroadcastReceiver broadcastReceiver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd716781", new Object[]{mtbPresenterV2, broadcastReceiver});
        } else {
            mtbPresenterV2.k = broadcastReceiver;
        }
    }

    public final void A(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98ef4ed2", new Object[]{this, new Boolean(z)});
        } else {
            this.d = z;
        }
    }

    public final void g() {
        Activity i;
        s3j i2;
        JSONObject a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac0f1340", new Object[]{this});
            return;
        }
        MtbBizProxyV2 mtbBizProxyV2 = this.f11302a;
        if (mtbBizProxyV2 != null && (i = mtbBizProxyV2.i()) != null && (i2 = MtbDataServiceFacade.i()) != null && (a2 = i2.a()) != null) {
            UTAnalytics instance = UTAnalytics.getInstance();
            ckf.c(instance, "UTAnalytics.getInstance()");
            instance.getDefaultTracker().pageDisAppear(i);
            suv.a I = BasementFeedDataProvider.INSTANCE.I(a2);
            mtbBizProxyV2.m().setUTPageName(I.f28289a);
            UTAnalytics instance2 = UTAnalytics.getInstance();
            ckf.c(instance2, "UTAnalytics.getInstance()");
            instance2.getDefaultTracker().pageAppearDonotSkip(i, I.f28289a);
            UTAnalytics instance3 = UTAnalytics.getInstance();
            ckf.c(instance3, "UTAnalytics.getInstance()");
            instance3.getDefaultTracker().updatePageName(i, I.f28289a);
            HashMap hashMap = new HashMap();
            hashMap.put("isWeex", "true");
            String m = MtbGlobalEnv.m();
            String str = "";
            if (m == null) {
                m = str;
            }
            hashMap.put("mtbVersion", m);
            suv.j(BasementViewController.class.getName(), i, I.f28289a, I.b, hashMap);
            HashMap hashMap2 = new HashMap(4);
            String str2 = I.b;
            ckf.c(str2, "utParams.spm");
            hashMap2.put("spm-url", str2);
            String m2 = MtbGlobalEnv.m();
            if (m2 != null) {
                str = m2;
            }
            hashMap2.put("mtbVersion", str);
            suv.l(hashMap2);
        }
    }

    public final void h() {
        Activity i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61a750b9", new Object[]{this});
            return;
        }
        MtbBizProxyV2 mtbBizProxyV2 = this.f11302a;
        if (mtbBizProxyV2 != null && (i = mtbBizProxyV2.i()) != null) {
            UTAnalytics.getInstance().getDefaultTracker().pageDisAppear(i);
            mtbBizProxyV2.m().setUTPageName(u3j.b);
            UTAnalytics instance = UTAnalytics.getInstance();
            ckf.c(instance, "UTAnalytics.getInstance()");
            instance.getDefaultTracker().pageAppearDonotSkip(i, mtbBizProxyV2.m().getUTPageName());
            UTAnalytics instance2 = UTAnalytics.getInstance();
            ckf.c(instance2, "UTAnalytics.getInstance()");
            instance2.getDefaultTracker().updatePageName(i, u3j.b);
            HashMap hashMap = new HashMap();
            hashMap.put("scm", "20140623.1.20.2");
            hashMap.put("spm-cnt", "a2141.7631743");
            hashMap.put("isWeex", "true");
            String m = MtbGlobalEnv.m();
            String str = "";
            if (m == null) {
                m = str;
            }
            hashMap.put("mtbVersion", m);
            suv.n(i, hashMap);
            HashMap hashMap2 = new HashMap(4);
            hashMap2.put("spm-url", "a2141.7631743");
            String m2 = MtbGlobalEnv.m();
            if (m2 != null) {
                str = m2;
            }
            hashMap2.put("mtbVersion", str);
            suv.l(hashMap2);
        }
    }

    public final void i(s3j s3jVar) {
        JSONObject c2;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff858eaa", new Object[]{this, s3jVar});
        } else if (!c38.INSTANCE.c() && s3jVar != null && (c2 = s3jVar.c()) != null && (jSONObject = c2.getJSONObject("customSkin")) != null) {
            cpt.c().j("mytaobao", jSONObject);
        }
    }

    public final void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcb4cc3a", new Object[]{this});
        } else {
            this.b.postDelayed(new MtbPresenterV2$delayInit$1(this), 2000L);
        }
    }

    public final void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77bba1d6", new Object[]{this});
            return;
        }
        String userId = Login.getUserId();
        if (!TextUtils.isEmpty(userId)) {
            ckf.c(userId, "uid");
            MtbDataServiceFacade.t(userId);
            q32.Companion.b(userId);
        } else if (Versions.isDebug()) {
            throw new RuntimeException("uid为空");
        }
    }

    public final boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c23fe410", new Object[]{this})).booleanValue();
        }
        return this.l;
    }

    public final void m(Activity activity, LoginAction loginAction) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c785878c", new Object[]{this, activity, loginAction});
        } else {
            n(activity, loginAction, false);
        }
    }

    public final boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("187bf27e", new Object[]{this})).booleanValue();
        }
        return this.d;
    }

    public final void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51f7278b", new Object[]{this});
        } else {
            k();
        }
    }

    public final void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
            return;
        }
        z6t.T(this.c).g(1);
        z6t.T(this.c).b("PageInit");
        k();
        MtbDataServiceFacade.h();
        p3j.a(a.INSTANCE, 1500L);
    }

    public final void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        this.f11302a = null;
        this.b.removeCallbacksAndMessages(null);
        this.f.a();
        this.g.a();
        this.h.a();
        BroadcastReceiver broadcastReceiver = this.k;
        if (broadcastReceiver != null) {
            LoginBroadcastHelper.unregisterLoginReceiver(Globals.getApplication(), broadcastReceiver);
        }
        if (this.i != null) {
            ((t1c) n78.a(t1c.class)).removeChangeVersionListener(this.i);
        }
        if (ih4.a("fixMtbDataServiceLeak", true)) {
            MtbDataServiceFacade.u();
        }
    }

    public final void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("833b0c0a", new Object[]{this});
        } else if (MtbGlobalEnv.q() != -1) {
            boolean b2 = ckf.b("true", ih4.f("asyncPreloadOrderBasement", "true"));
            c cVar = new c();
            long d2 = ih4.d("delayPreloadOrderListMillis", 500);
            if (b2) {
                p3j.a(cVar, d2);
            } else {
                this.b.postDelayed(cVar, d2);
            }
        }
    }

    public final List<h3j> v(Map<String, h3j> map, List<h3j> list) {
        JSONObject g;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("16a9e8e1", new Object[]{this, map, list});
        }
        ckf.h(map, "changeMap");
        ckf.h(list, "oldDataList");
        ArrayList arrayList = new ArrayList(list.size());
        for (h3j h3jVar : list) {
            String f = h3jVar.f();
            if (map.containsKey(f)) {
                h3j h3jVar2 = map.get(f);
                JSONObject jSONObject = null;
                if (h3jVar2 != null) {
                    h3j h3jVar3 = h3jVar2;
                    if (ckf.b(h3jVar3.b(), h3jVar.b())) {
                        JSONObject g2 = h3jVar3.g();
                        if (g2 != null) {
                            jSONObject = g2.getJSONObject("events");
                        }
                        if (!(jSONObject == null || (g = h3jVar.g()) == null)) {
                            g.put("events", (Object) jSONObject);
                        }
                        h3jVar.q(h3jVar3.h());
                        h3jVar.l(h3jVar3.d());
                        arrayList.add(h3jVar);
                    } else {
                        arrayList.add(h3jVar3);
                    }
                } else {
                    ckf.s();
                    throw null;
                }
            } else {
                arrayList.add(h3jVar);
            }
        }
        return arrayList;
    }

    public final List<h3j> x(iln ilnVar, List<String> list, Map<String, h3j> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("e3c46482", new Object[]{this, ilnVar, list, map});
        }
        ckf.h(ilnVar, "reason");
        ckf.h(list, "moduleNameList");
        ckf.h(map, "dataMap");
        ArrayList arrayList = new ArrayList(list.size());
        for (String str : list) {
            h3j h3jVar = map.get(str);
            if (h3jVar != null) {
                arrayList.add(h3jVar);
            } else {
                h3j h3jVar2 = new h3j(jln.a(ilnVar));
                h3jVar2.o(str);
                h3jVar2.j(new pl7().b(str));
                arrayList.add(h3jVar2);
            }
        }
        return arrayList;
    }

    public final void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d654163", new Object[]{this});
            return;
        }
        this.i = new d();
        t1c t1cVar = (t1c) n78.a(t1c.class);
        if (t1cVar != null) {
            t1cVar.addChangeVersionListener(this.i);
        }
        this.g.c();
        j();
        this.b.postDelayed(e.INSTANCE, 10000L);
    }

    public final void z(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("daa9d2a6", new Object[]{this, new Boolean(z)});
        } else {
            this.c = z;
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            List<h3j> b;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            s3j i = MtbDataServiceFacade.i();
            if (i != null && (b = i.b()) != null) {
                Iterator it = new ArrayList(b).iterator();
                while (it.hasNext()) {
                    h3j h3jVar = (h3j) it.next();
                    String f = h3jVar.f();
                    if (f != null && wsq.O(f, "orderModule", false, 2, null)) {
                        MtbPresenterV2.e(MtbPresenterV2.this, h3jVar);
                    }
                }
            }
        }
    }

    public final void p(h3j h3jVar) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22d49a06", new Object[]{this, h3jVar});
            return;
        }
        JSONObject g = h3jVar.g();
        if (g != null && (jSONObject = g.getJSONObject("fields")) != null && (jSONObject2 = jSONObject.getJSONObject("orderInfo")) != null) {
            String jSONString = jSONObject2.toJSONString();
            ggj.c(JSON.parseObject(jSONString));
            qgj.b(jSONString, true);
        }
    }

    public final void w(int i, JSONObject jSONObject) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e529d6d6", new Object[]{this, new Integer(i), jSONObject});
            return;
        }
        ckf.h(jSONObject, "global");
        String string = jSONObject.getString("mytaobaoVersion");
        String string2 = jSONObject.getString("mytaobaoLayout");
        MtbGlobalEnv.C(string);
        MtbGlobalEnv.D(string2);
        MtbGlobalEnv.E(jSONObject.getIntValue("navBarStyle"));
        MtbBizProxyV2 mtbBizProxyV2 = this.f11302a;
        if (mtbBizProxyV2 != null) {
            MtbDataServiceFacade.h();
            if (MtbGlobalEnv.k) {
                str = "1";
            } else {
                str = "0";
            }
            MTBPresenter.r(mtbBizProxyV2, str, true);
            if (mtbBizProxyV2.m().isResumed()) {
                B(mtbBizProxyV2.m().getActivity());
            }
        }
    }

    public final void B(Activity activity) {
        String m;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9fdb43e", new Object[]{this, activity});
        } else if (activity != null && (m = MtbGlobalEnv.m()) != null) {
            UTAnalytics instance = UTAnalytics.getInstance();
            ckf.c(instance, "UTAnalytics.getInstance()");
            instance.getDefaultTracker().updatePageProperties(activity, kotlin.collections.a.k(jpu.a("mtbVersion", m)));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("mtbVersion", (Object) m);
            String jSONString = jSONObject.toJSONString();
            UTAnalytics instance2 = UTAnalytics.getInstance();
            ckf.c(instance2, "UTAnalytics.getInstance()");
            instance2.getDefaultTracker().updatePageUtparam(activity, jSONString);
            UTAnalytics instance3 = UTAnalytics.getInstance();
            ckf.c(instance3, "UTAnalytics.getInstance()");
            instance3.getDefaultTracker().updateNextPageUtparam(jSONString);
        }
    }

    public final void t(MtbBizProxyV2 mtbBizProxyV2, Activity activity, boolean z) {
        JSONObject a2;
        boolean z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62205a8a", new Object[]{this, mtbBizProxyV2, activity, new Boolean(z)});
            return;
        }
        ckf.h(mtbBizProxyV2, "mtbBizProxy");
        ckf.h(activity, "aty");
        this.l = true;
        k();
        s3j h = MtbDataServiceFacade.h();
        i(h);
        p3j.g(new b(activity, h, mtbBizProxyV2));
        String string = (h == null || (a2 = h.a()) == null) ? null : a2.getString("fragmentWeexUrl");
        if (z && ih4.a("filterDulpCreateWx", true)) {
            z2 = true;
        }
        if (string != null && !z2) {
            mtbBizProxyV2.n().t(true);
            mtbBizProxyV2.n().k(string, activity);
        }
    }

    public final void n(Activity activity, LoginAction loginAction, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("292c1cc8", new Object[]{this, activity, loginAction, new Boolean(z)});
        } else if (loginAction != null) {
            LoginAction loginAction2 = LoginAction.NOTIFY_LOGOUT;
            if (loginAction != loginAction2) {
                LoginAction loginAction3 = LoginAction.NOTIFY_LOGIN_SUCCESS;
                if (loginAction == loginAction3 && !sgj.b(activity)) {
                    if (this.j != loginAction3 || !z) {
                        this.j = loginAction3;
                        k();
                        TLog.loge("mtbMainLink", "收到NOTIFY_LOGIN_SUCCESS, thread=" + Thread.currentThread().getName() + " isLogout=" + this.e);
                        if (this.e) {
                            this.e = false;
                            z6t.T(this.c).g(2);
                        }
                        MtbBizProxyV2 mtbBizProxyV2 = this.f11302a;
                        if (mtbBizProxyV2 != null) {
                            mtbBizProxyV2.Y();
                        }
                        MtbDataServiceFacade.y(1);
                    }
                }
            } else if (this.j != loginAction2 || !z) {
                this.j = loginAction2;
                z6t.T(this.c).f(1);
                TLog.loge("mtbMainLink", "收到NOTIFY_LOGOUT, thread=" + Thread.currentThread().getName());
                this.e = true;
                MtbDataServiceFacade.u();
                q32.Companion.c();
            }
        }
    }
}
