package com.taobao.mytaobao.ultron;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Handler;
import android.text.TextUtils;
import android.widget.LinearLayout;
import androidx.collection.ArrayMap;
import androidx.fragment.app.Fragment;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.ability.localization.Localization;
import com.alibaba.ability.localization.constants.Language;
import com.alibaba.android.ultron.vfw.core.ViewEngine;
import com.alibaba.android.ultron.vfw.instance.UltronInstanceConfig;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.security.realidentity.v2;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.taobao.analysis.v3.FalcoGlobalTracer;
import com.taobao.android.autosize.OnScreenChangedListener;
import com.taobao.android.autosize.TBAutoSizeConfig;
import com.taobao.android.autosize.TBDeviceUtils;
import com.taobao.android.behavir.BehaviR;
import com.taobao.android.dinamicx.DXEngineConfig;
import com.taobao.android.dinamicx.s;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.revisionswitch.TBRevisionSwitchManager;
import com.taobao.android.task.Coordinator;
import com.taobao.android.tbelder.TBElder;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.datamodel.imp.DMComponent;
import com.taobao.aranger.annotation.method.UIThread;
import com.taobao.falco.m;
import com.taobao.login4android.api.Login;
import com.taobao.mytaobao.base.MtbGlobalEnv;
import com.taobao.mytaobao.basement.BasementViewController;
import com.taobao.mytaobao.homepage.plugin.TBMyTaobaoWVPlugin;
import com.taobao.mytaobao.message.UnreadWangWangMessageManager;
import com.taobao.mytaobao.ultron.model.SecScreenBean;
import com.taobao.mytaobao.view.MTPtrRecyclerView;
import com.taobao.oversea.mytaobao.SecScreenLoadMoreManager;
import com.taobao.tao.log.TLog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import mtopsdk.mtop.domain.MtopResponse;
import tb.a4j;
import tb.b8v;
import tb.bp2;
import tb.bud;
import tb.cgj;
import tb.cph;
import tb.d6o;
import tb.dgj;
import tb.e7p;
import tb.epb;
import tb.ew;
import tb.f3j;
import tb.fsb;
import tb.g3j;
import tb.gsh;
import tb.h8v;
import tb.hsh;
import tb.i8v;
import tb.ih4;
import tb.ish;
import tb.j8v;
import tb.kgj;
import tb.ko5;
import tb.l3j;
import tb.mh8;
import tb.n46;
import tb.n9v;
import tb.nqr;
import tb.nsh;
import tb.o32;
import tb.o46;
import tb.ojd;
import tb.oqr;
import tb.osh;
import tb.p46;
import tb.pgj;
import tb.pqr;
import tb.pyh;
import tb.q3g;
import tb.q46;
import tb.q66;
import tb.qd6;
import tb.r46;
import tb.r4v;
import tb.rhx;
import tb.rjc;
import tb.s0j;
import tb.s32;
import tb.s46;
import tb.s66;
import tb.s7l;
import tb.sb7;
import tb.sc;
import tb.t2o;
import tb.t46;
import tb.tsv;
import tb.tz8;
import tb.u36;
import tb.u3j;
import tb.u46;
import tb.u66;
import tb.usv;
import tb.uuu;
import tb.uv6;
import tb.v46;
import tb.vsv;
import tb.vz3;
import tb.w3j;
import tb.w55;
import tb.xrl;
import tb.z6t;
import tb.z7v;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class MTBPresenter implements epb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "MTBPresenter";

    /* renamed from: a  reason: collision with root package name */
    public com.alibaba.android.ultron.vfw.instance.a f11329a;
    public j b;
    public hsh c;
    public v46 f;
    public SecScreenBean h;
    public e7p i;
    public com.taobao.mytaobao.basement.a j;
    public BasementViewController k;
    public h8v l;
    public j8v m;
    public UnreadWangWangMessageManager n;
    public gsh o;
    public boolean p;
    public OnScreenChangedListener q;
    public MTBOrderDataProvider r;
    public MtbBizProxy v;
    public Localization.a w;
    public BroadcastReceiver x;
    public final Handler d = new Handler(uuu.f29625a);
    public int e = 0;
    public final q46 g = new q46(false);
    public boolean s = false;
    public final AtomicInteger t = new AtomicInteger(0);
    public boolean u = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements OnScreenChangedListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Activity f11330a;
        public final /* synthetic */ MtbBizProxy b;

        public a(Activity activity, MtbBizProxy mtbBizProxy) {
            this.f11330a = activity;
            this.b = mtbBizProxy;
        }

        @Override // com.taobao.android.autosize.OnScreenChangedListener
        public void onActivityChanged(Activity activity, int i, Configuration configuration) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("994f466c", new Object[]{this, activity, new Integer(i), configuration});
            }
        }

        @Override // com.taobao.android.autosize.OnScreenChangedListener
        public void onScreenChanged(int i, Configuration configuration) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cfdcd1d", new Object[]{this, new Integer(i), configuration});
                return;
            }
            Rect a2 = rhx.a(this.f11330a);
            int c = DXWidgetNode.DXMeasureSpec.c(a2.width(), 1073741824);
            int c2 = DXWidgetNode.DXMeasureSpec.c(a2.height(), 1073741824);
            MTBPresenter.a(MTBPresenter.this).G().h1(c);
            MTBPresenter.a(MTBPresenter.this).G().g1(c2);
            MTBPresenter.a(MTBPresenter.this).G().H0(127);
            TLog.loge("mtbMainLink", "onScreenChanged windowRect.width()=" + a2.width() + " windowRect.height()=" + a2.height());
            this.b.M();
            this.b.c0(a2.width());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b extends z7v.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ew f11331a;

        public b(MTBPresenter mTBPresenter, ew ewVar) {
            this.f11331a = ewVar;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mytaobao/ultron/MTBPresenter$2");
        }

        @Override // tb.z7v.c
        public void b(Context context, s sVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c0a5ce96", new Object[]{this, context, sVar});
            } else {
                sVar.k().l1(this.f11331a.i());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class c implements o32<JSONObject> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ JSONObject f11333a;
            public final /* synthetic */ JSONObject b;

            public a(JSONObject jSONObject, JSONObject jSONObject2) {
                this.f11333a = jSONObject;
                this.b = jSONObject2;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                MTBPresenter.l(MTBPresenter.this, MtbGlobalEnv.m());
                MTBPresenter.m(MTBPresenter.this);
                if (MTBPresenter.k(MTBPresenter.this) != null) {
                    MTBPresenter.k(MTBPresenter.this).Q(this.f11333a, true);
                    MTBPresenter.n(MTBPresenter.this).j(MTBPresenter.this, this.b, "action_cache_invalid");
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public class b implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                MTBPresenter.m(MTBPresenter.this);
                if (MTBPresenter.k(MTBPresenter.this) != null) {
                    MTBPresenter.k(MTBPresenter.this).P();
                }
            }
        }

        public c() {
        }

        /* renamed from: b */
        public void a(boolean z, String str, JSONObject jSONObject) {
            BasementViewController basementViewController;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9bd050f5", new Object[]{this, new Boolean(z), str, jSONObject});
            } else if (z) {
                JSONObject b2 = MTBPresenter.b(MTBPresenter.this, jSONObject);
                JSONObject k = ish.g().k();
                ish.g().q(b2, ish.CACHE_KEY_ULTRON_MTB);
                JSONObject j = MTBPresenter.j(MTBPresenter.this, jSONObject, k);
                JSONObject jSONObject2 = j.getJSONObject("data");
                jSONObject2.getJSONObject("global");
                MtbGlobalEnv.B(jSONObject2);
                if (MTBPresenter.k(MTBPresenter.this) != null) {
                    MTBPresenter.k(MTBPresenter.this).j.g(jSONObject2);
                }
                a aVar = new a(j, jSONObject2);
                if (l3j.INSTANCE.m() == 1) {
                    uuu.a(aVar);
                } else {
                    MTBPresenter.this.d.postDelayed(aVar, 1000L);
                }
                MTBPresenter.o(MTBPresenter.this);
                MTBPresenter.p(MTBPresenter.this, jSONObject2);
                MTBPresenter.q(MTBPresenter.this, jSONObject2);
                MTBPresenter.this.T(jSONObject2);
                MTBPresenter.this.f0();
                DMComponent dMComponent = (DMComponent) MTBPresenter.this.G("headerModule");
                if (dMComponent != null) {
                    MTBPresenter.c(MTBPresenter.this, dMComponent);
                }
                MTBPresenter.d(MTBPresenter.this, jSONObject2);
                if (TextUtils.equals("action_pull_refresh", "action_cache_invalid") && (basementViewController = MTBPresenter.this.k) != null) {
                    basementViewController.W();
                }
                sc.c("processQueryData");
            } else {
                f3j.f("mtbMainLink", "loadMtopMainData failed: " + str);
                uuu.a(new b());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ JSONObject f11335a;
        public final /* synthetic */ String b;
        public final /* synthetic */ int c;
        public final /* synthetic */ MtopResponse d;
        public final /* synthetic */ fsb e;

        public d(JSONObject jSONObject, String str, int i, MtopResponse mtopResponse, fsb fsbVar) {
            this.f11335a = jSONObject;
            this.b = str;
            this.c = i;
            this.d = mtopResponse;
            this.e = fsbVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            MTBPresenter mTBPresenter = MTBPresenter.this;
            if (!mTBPresenter.s) {
                MTBPresenter.m(mTBPresenter);
                sc.b(sc.renderMainApiData);
                MTBPresenter.a(MTBPresenter.this).getEventHandler().h(MTBPresenter.a(MTBPresenter.this).w().getComponents(), null);
                MTBPresenter.a(MTBPresenter.this).D().q(this.f11335a);
                MTBPresenter.a(MTBPresenter.this).T(MTBPresenter.this.c);
                MTBPresenter.a(MTBPresenter.this).V(127);
                sc.c(sc.renderMainApiData);
                MTBPresenter.e(MTBPresenter.this, this.b, this.c, this.d, this.e, this.f11335a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            n9v.b();
            n9v.a(n9v.NEW_CONTENT_GROUP, n9v.NEW_CONTENT_KEY, Boolean.valueOf(TBRevisionSwitchManager.c().d(bud.KEY_NEW_CONTENT_ENABLE)));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class g implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ JSONObject f11338a;

        public g(JSONObject jSONObject) {
            this.f11338a = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                pgj.a(TBMyTaobaoWVPlugin.TAG, this.f11338a.toJSONString());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class h implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("mytaobaoVersion", (Object) MtbGlobalEnv.m());
            jSONObject.put("bizType", (Object) MtbGlobalEnv.a());
            jSONObject.put("pageType", (Object) MtbGlobalEnv.b());
            jSONObject.put("version", (Object) MtbGlobalEnv.d());
            String jSONString = jSONObject.toJSONString();
            r4v.a(s32.MODULE_NAME, 19997, "tbMytaobaoVersion", null, null, jSONObject);
            AppMonitor.Counter.commit(s32.MODULE_NAME, "TBLoadPerformance", jSONString, 1.0d);
            TLog.loge("mtbMainLink", "mtbVersion=" + jSONString);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class i implements Localization.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public i(MTBPresenter mTBPresenter) {
        }

        @Override // com.alibaba.ability.localization.Localization.a
        public void onChange(Language language, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6c58b74d", new Object[]{this, language, str});
            } else {
                kgj.b(true, kgj.ACTION_REFRESH_PAGE, new String[0]);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface j {
        void a();

        void b(int i, int i2, int i3, JSONObject jSONObject);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class k implements m.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f11340a;

        public k(String str) {
            this.f11340a = str;
        }

        @Override // com.taobao.falco.m.a
        public void a(m mVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fd090d9d", new Object[]{this, mVar});
            } else if (mVar != null) {
                mVar.N(this.f11340a);
            }
        }
    }

    static {
        t2o.a(745538047);
        t2o.a(745538143);
    }

    public static IDMComponent F(com.alibaba.android.ultron.vfw.instance.a aVar, String str) {
        List<IDMComponent> components;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDMComponent) ipChange.ipc$dispatch("e915423f", new Object[]{aVar, str});
        }
        if (!(aVar == null || TextUtils.isEmpty(str) || aVar.b() == null || (components = aVar.b().getComponents()) == null || components.size() <= 0)) {
            for (IDMComponent iDMComponent : components) {
                if (iDMComponent != null && TextUtils.equals(str, iDMComponent.getTag())) {
                    return iDMComponent;
                }
            }
        }
        return null;
    }

    public static JSONObject H(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("20346b7d", new Object[]{jSONObject});
        }
        if (jSONObject == null || !jSONObject.containsKey("global") || (jSONObject2 = jSONObject.getJSONObject("global")) == null) {
            return null;
        }
        return jSONObject2.getJSONObject("customSkin");
    }

    public static /* synthetic */ com.alibaba.android.ultron.vfw.instance.a a(MTBPresenter mTBPresenter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.android.ultron.vfw.instance.a) ipChange.ipc$dispatch("e7a29440", new Object[]{mTBPresenter});
        }
        return mTBPresenter.f11329a;
    }

    public static /* synthetic */ JSONObject b(MTBPresenter mTBPresenter, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("29fd30cd", new Object[]{mTBPresenter, jSONObject});
        }
        return mTBPresenter.c0(jSONObject);
    }

    public static /* synthetic */ void c(MTBPresenter mTBPresenter, DMComponent dMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc9e7973", new Object[]{mTBPresenter, dMComponent});
        } else {
            mTBPresenter.O(dMComponent);
        }
    }

    public static /* synthetic */ void d(MTBPresenter mTBPresenter, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9bb001c", new Object[]{mTBPresenter, jSONObject});
        } else {
            mTBPresenter.r0(jSONObject);
        }
    }

    public static /* synthetic */ void e(MTBPresenter mTBPresenter, String str, int i2, MtopResponse mtopResponse, fsb fsbVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe5863eb", new Object[]{mTBPresenter, str, new Integer(i2), mtopResponse, fsbVar, jSONObject});
        } else {
            mTBPresenter.C(str, i2, mtopResponse, fsbVar, jSONObject);
        }
    }

    public static /* synthetic */ int f(MTBPresenter mTBPresenter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c9cf7905", new Object[]{mTBPresenter})).intValue();
        }
        return mTBPresenter.e;
    }

    public static /* synthetic */ int g(MTBPresenter mTBPresenter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3f499f46", new Object[]{mTBPresenter})).intValue();
        }
        int i2 = mTBPresenter.e;
        mTBPresenter.e = i2 - 1;
        return i2;
    }

    public static /* synthetic */ j h(MTBPresenter mTBPresenter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j) ipChange.ipc$dispatch("5fa37aae", new Object[]{mTBPresenter});
        }
        return mTBPresenter.b;
    }

    public static /* synthetic */ void i(MTBPresenter mTBPresenter, MtopResponse mtopResponse, fsb fsbVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5fb8999", new Object[]{mTBPresenter, mtopResponse, fsbVar, str});
        } else {
            mTBPresenter.m0(mtopResponse, fsbVar, str);
        }
    }

    public static /* synthetic */ JSONObject j(MTBPresenter mTBPresenter, JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("2fb3bc22", new Object[]{mTBPresenter, jSONObject, jSONObject2});
        }
        return mTBPresenter.b0(jSONObject, jSONObject2);
    }

    public static /* synthetic */ MtbBizProxy k(MTBPresenter mTBPresenter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtbBizProxy) ipChange.ipc$dispatch("a491b247", new Object[]{mTBPresenter});
        }
        return mTBPresenter.v;
    }

    public static /* synthetic */ void l(MTBPresenter mTBPresenter, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cd810a", new Object[]{mTBPresenter, str});
        } else {
            mTBPresenter.x(str);
        }
    }

    public static /* synthetic */ void m(MTBPresenter mTBPresenter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7236491f", new Object[]{mTBPresenter});
        } else {
            mTBPresenter.z();
        }
    }

    public static /* synthetic */ com.taobao.mytaobao.basement.a n(MTBPresenter mTBPresenter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.mytaobao.basement.a) ipChange.ipc$dispatch("781089c0", new Object[]{mTBPresenter});
        }
        return mTBPresenter.j;
    }

    public static /* synthetic */ void o(MTBPresenter mTBPresenter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5cb8cdd", new Object[]{mTBPresenter});
        } else {
            mTBPresenter.p0();
        }
    }

    public static /* synthetic */ void p(MTBPresenter mTBPresenter, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b269d3b4", new Object[]{mTBPresenter, jSONObject});
        } else {
            mTBPresenter.W(jSONObject);
        }
    }

    public static /* synthetic */ void q(MTBPresenter mTBPresenter, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92e329b5", new Object[]{mTBPresenter, jSONObject});
        } else {
            mTBPresenter.X(jSONObject);
        }
    }

    public static void r(ew ewVar, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c3b0dc2", new Object[]{ewVar, str, new Boolean(z)});
            return;
        }
        String m = MtbGlobalEnv.m();
        if (TextUtils.equals(m, "stark_s_mytaobao_24") || TextUtils.equals(m, "mtb2024") || TextUtils.equals(m, "mtb2025Epoch")) {
            m = "v24";
        }
        if (ewVar != null) {
            ewVar.g("preloadOrderAB", String.valueOf(MtbGlobalEnv.q()));
            ewVar.g("mtbVersion", m);
            ewVar.g("mtbVersionOrg", MtbGlobalEnv.m());
            ewVar.g("mtbLayout", MtbGlobalEnv.n());
            ewVar.g("mtb_preloadDataHit", str);
            ewVar.g("enableWeexApm", String.valueOf(MtbGlobalEnv.j()));
            ewVar.g("enableMTS", String.valueOf(MtbGlobalEnv.i()));
            if (z) {
                String str2 = "1";
                ewVar.g("mtbPageV2", str2);
                ewVar.g("bizStage", v2.d);
                if (!MtbGlobalEnv.l()) {
                    str2 = "0";
                }
                ewVar.g("mtbRvFixedSize", str2);
                ewVar.g("defaultType", String.valueOf(MtbGlobalEnv.e()));
                ewVar.g("enableDiffRefresh", String.valueOf(MtbGlobalEnv.h()));
                t0(m);
            }
        }
    }

    public static void t0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("481d8f1e", new Object[]{str});
            return;
        }
        tz8 tz8Var = FalcoGlobalTracer.get();
        if (tz8Var != null) {
            tz8Var.j(new k(str));
        }
    }

    public void A(MtbBizProxy mtbBizProxy, boolean z, com.alibaba.android.ultron.vfw.instance.a aVar, ko5 ko5Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b3ca852", new Object[]{this, mtbBizProxy, new Boolean(z), aVar, ko5Var});
            return;
        }
        uv6.l("beforeInitData 1.0");
        this.p = z;
        this.v = mtbBizProxy;
        if (aVar == null) {
            com.alibaba.android.ultron.vfw.instance.a y = y(mtbBizProxy);
            this.f11329a = y;
            a4j.h(y, ko5Var);
        } else {
            this.f11329a = aVar;
        }
        uv6.l("beforeInitData 1.011111");
        l0();
        uv6.l("beforeInitData 1.022222");
        k0(ko5Var);
        uv6.l("beforeInitData 1.0333333");
        this.f11329a.j0("userTrack", new s7l());
        this.f11329a.j0("openUrl", new w3j());
        this.f11329a.j0("asyncRefresh", new g3j());
        this.l = new h8v(this.f11329a);
        uv6.l("beforeInitData 1.0444444");
        this.c = new hsh(this);
        this.m = this.l.f("pageback", new i8v());
        uv6.l("beforeInitData 1.05555");
        this.j = mtbBizProxy.k();
        this.k = mtbBizProxy.R();
        this.f = new v46();
        uv6.l("beforeInitData 1.066666");
        if (Localization.o()) {
            UnreadWangWangMessageManager unreadWangWangMessageManager = new UnreadWangWangMessageManager(aVar, this.v.i(), "headerModule");
            this.n = unreadWangWangMessageManager;
            unreadWangWangMessageManager.c();
            j0();
        }
        this.o = new gsh(this);
        uv6.l("beforeInitData 1.5");
        this.f11329a.Y("default", this.o);
        Activity i2 = mtbBizProxy.i();
        if (TBDeviceUtils.p(i2) || TBDeviceUtils.P(i2)) {
            this.q = new a(i2, mtbBizProxy);
            TBAutoSizeConfig.x().d0(this.q);
        }
        uv6.l("beforeInitData 1.55");
        BasementViewController basementViewController = this.k;
        this.r = new MTBOrderDataProvider(basementViewController == null ? null : basementViewController.r);
        uv6.l("beforeInitData 1.6");
    }

    public IDMComponent D(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDMComponent) ipChange.ipc$dispatch("2b070bc8", new Object[]{this, str});
        }
        return this.f11329a.b().getComponentByName(str);
    }

    public final void E(HashMap<String, String> hashMap) {
        JSONObject jSONObject;
        e7p e7pVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73e4d04a", new Object[]{this, hashMap});
            return;
        }
        String str = hashMap.get(PushConstants.PARAMS);
        if (!TextUtils.isEmpty(str)) {
            try {
                jSONObject = JSON.parseObject(str);
            } catch (Throwable th) {
                cph.a("parse_json", "generateSecParams", "二楼配置解析异常 " + th.getMessage());
                jSONObject = null;
            }
            if (jSONObject != null && (e7pVar = this.i) != null) {
                jSONObject.put(e7p.KEY_SHOW_SEC_SCREEN_LIVE_MODE, (Object) String.valueOf(e7pVar.f()));
                jSONObject.put(e7p.KEY_SHOW_SEC_SCREEN_SHOP_MODE, (Object) String.valueOf(this.i.g()));
                hashMap.put(PushConstants.PARAMS, jSONObject.toString());
            }
        }
    }

    public IDMComponent G(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDMComponent) ipChange.ipc$dispatch("ada9e2d1", new Object[]{this, str});
        }
        return F(this.f11329a, str);
    }

    public IDMComponent I(String str) {
        com.alibaba.android.ultron.vfw.instance.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDMComponent) ipChange.ipc$dispatch("26e973d8", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str) || (aVar = this.f11329a) == null || aVar.b() == null) {
            return null;
        }
        return this.f11329a.b().getComponentByName(str);
    }

    public final SecScreenBean J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SecScreenBean) ipChange.ipc$dispatch("4335f73c", new Object[]{this});
        }
        SecScreenBean secScreenBean = this.h;
        if (secScreenBean == null || secScreenBean.apiName == null || secScreenBean.apiVersion == null) {
            return null;
        }
        HashMap<String, String> hashMap = secScreenBean.data;
        if (hashMap != null) {
            E(hashMap);
        }
        return secScreenBean;
    }

    public final w55 K(SecScreenBean secScreenBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w55) ipChange.ipc$dispatch("d45766bb", new Object[]{this, secScreenBean});
        }
        if (secScreenBean == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        HashMap<String, String> hashMap2 = secScreenBean.data;
        if (hashMap2 != null) {
            hashMap.putAll(hashMap2);
            JSONObject jSONObject = new JSONObject();
            String str = "true";
            if (!str.equals(secScreenBean.data.get("canLoadMore"))) {
                str = "false";
            }
            jSONObject.put("canLoadMore", (Object) str);
            hashMap.put("bizParams", jSONObject.toJSONString());
        }
        return d6o.b(this.f11329a.getContext(), secScreenBean.apiName, secScreenBean.apiVersion, hashMap, secScreenBean.unitTrade);
    }

    public com.alibaba.android.ultron.vfw.instance.a L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.android.ultron.vfw.instance.a) ipChange.ipc$dispatch("53dc8f1e", new Object[]{this});
        }
        return this.f11329a;
    }

    public boolean P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("da7332ca", new Object[]{this})).booleanValue();
        }
        if (this.h == null) {
            return false;
        }
        e7p d2 = e7p.d();
        boolean e2 = true ^ d2.e(this.i);
        this.i = d2;
        d2.h();
        return e2;
    }

    public void R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7157237", new Object[]{this});
            return;
        }
        Q();
        g0("action_cache_invalid");
    }

    public void S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc99e2f8", new Object[]{this});
        } else {
            l3j.INSTANCE.j(new c());
        }
    }

    public void T(JSONObject jSONObject) {
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3e2cf0e", new Object[]{this, jSONObject});
        } else if (jSONObject != null && jSONObject.containsKey("global")) {
            try {
                JSONObject jSONObject2 = jSONObject.getJSONObject("global");
                String[] strArr = null;
                if (jSONObject2 != null) {
                    jSONArray = jSONObject2.getJSONArray("deliveryConditionKey");
                } else {
                    jSONArray = null;
                }
                if (jSONArray != null) {
                    strArr = (String[]) jSONArray.toArray(new String[0]);
                }
                this.r.m(strArr);
            } catch (Exception unused) {
            }
        }
    }

    public void V() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
        }
    }

    public final void X(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e2b3c3d", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
            this.i = null;
            this.h = null;
        } else {
            this.h = SecScreenBean.readGlobalSecScreenBean(jSONObject);
            e7p.i(jSONObject);
            if (this.i == null) {
                this.i = e7p.c();
            }
        }
    }

    public void Y(String str, String str2, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6af6b730", new Object[]{this, str, str2, map});
            return;
        }
        if (map == null) {
            map = new HashMap<>();
        }
        IDMComponent D = D(str);
        if (D != null) {
            map.put("targetComponent", D(str));
            b8v t = this.f11329a.getEventHandler().e().t(str2);
            t.p(D);
            t.A(str2);
            t.r(map);
            this.f11329a.getEventHandler().k(t);
        }
    }

    public final JSONObject b0(JSONObject jSONObject, JSONObject jSONObject2) {
        boolean z;
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("8c40df92", new Object[]{this, jSONObject, jSONObject2});
        }
        if (MtbGlobalEnv.v()) {
            this.t.incrementAndGet();
            return jSONObject;
        }
        try {
            mh8 mh8Var = new mh8();
            if (this.t.getAndIncrement() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (l3j.INSTANCE.m() != 1) {
                z2 = false;
            }
            return mh8Var.p(jSONObject, jSONObject2, z, z2);
        } catch (Throwable unused) {
            return jSONObject;
        }
    }

    public final JSONObject c0(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("1994f9f7", new Object[]{this, jSONObject});
        }
        return jSONObject;
    }

    public void d0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3eac706", new Object[]{this, str});
            return;
        }
        if (TextUtils.equals(str, "action_cache_invalid")) {
            z6t.T(this.p).b("MainInterface");
        }
        sc.b(sc.beforeMainApi);
        SecScreenBean J = J();
        e0(str, J);
        sc.c(sc.beforeMainApi);
        if (com.taobao.mytaobao.basement.a.i() && !this.u) {
            sc.b(sc.beforeOverSeaApi);
            h0(J);
            sc.c(sc.beforeOverSeaApi);
        }
    }

    public void f0() {
        IDMComponent G;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd43bbb", new Object[]{this});
            return;
        }
        com.alibaba.android.ultron.vfw.instance.a aVar = this.f11329a;
        if (aVar != null && aVar.b() != null && (G = G("orderModule")) != null) {
            b8v e2 = this.f11329a.getEventHandler().e();
            e2.p(G);
            this.r.i(e2);
        }
    }

    public void g0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55da82c8", new Object[]{this, str});
        } else {
            d0(str);
        }
    }

    public final void h0(SecScreenBean secScreenBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a9a724c", new Object[]{this, secScreenBean});
        } else if (secScreenBean != null) {
            w55 K = K(secScreenBean);
            this.e++;
            com.alibaba.android.ultron.vfw.instance.a aVar = this.f11329a;
            aVar.g0(K.h(aVar.b()), null, new e(secScreenBean), this.c);
        }
    }

    public void i0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("838df391", new Object[]{this});
            return;
        }
        com.alibaba.android.ultron.vfw.instance.a aVar = this.f11329a;
        if (aVar != null) {
            aVar.X(2);
        }
    }

    public final void j0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50ee09b2", new Object[]{this});
            return;
        }
        i iVar = new i(this);
        this.w = iVar;
        Localization.a(iVar);
        LocalBroadcastManager instance = LocalBroadcastManager.getInstance(this.v.i());
        IntentFilter intentFilter = new IntentFilter("CURRENCY_CHANGE");
        BroadcastReceiver broadcastReceiver = new BroadcastReceiver(this) { // from class: com.taobao.mytaobao.ultron.MTBPresenter.10
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass10 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mytaobao/ultron/MTBPresenter$10");
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                } else {
                    kgj.b(true, kgj.ACTION_REFRESH_PAGE, new String[0]);
                }
            }
        };
        this.x = broadcastReceiver;
        instance.registerReceiver(broadcastReceiver, intentFilter);
    }

    public final void k0(ko5 ko5Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a8ce840", new Object[]{this, ko5Var});
            return;
        }
        this.f11329a.A0(nsh.DX_EVENT_MTB_ONTAP, new nsh(this));
        this.f11329a.A0(v46.DX_EVENT_MTBVIPSLIDERLAYOUTHANDLER, this.f);
        this.f11329a.A0(p46.DX_EVENT_MTB_SCROLL_EXPOSE, new p46());
        this.f11329a.A0(t46.DX_EVENT_MTB_TOOLSSCROLLEXPOSE, new t46());
        this.f11329a.A0(u36.DX_EVENT_MTBORDERSLIDEREVENTHANDLE, new u36(false));
        this.f11329a.A0(q66.DX_EVENT_ONMTBEQUITYSLIDERFINISH, new q66(ko5Var));
        q46.b();
        this.f11329a.A0(q46.DX_EVENT_MTBSLIDEREXPOSEUT, this.g);
        this.f11329a.A0(qd6.DX_EVENT_SWITCHACCOUNT, new qd6());
        this.f11329a.A0(u66.DX_EVENT_OPENURL, new u66());
        this.f11329a.A0(s66.DX_EVENT_OPENRECSKU, new s66());
        this.f11329a.A0(18619468269105L, new u46());
        this.f11329a.A0(-9059485389533098272L, new s46());
        this.f11329a.A0(com.taobao.oversea.mytaobao.a.DX_EVENT_RECYCLERVIEWLOADMORE, new com.taobao.oversea.mytaobao.a());
        this.f11329a.A0(4706731952712964941L, new o46());
        this.f11329a.A0(9715203841581550L, new r46());
        this.f11329a.A0(-3356328757096570660L, new n46());
    }

    public final void l0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a575c26e", new Object[]{this});
            return;
        }
        this.f11329a.getEventHandler().d("BehaviX", new bp2());
        this.f11329a.getEventHandler().d(nqr.EVENT_TYPE, new nqr());
        vsv vsvVar = new vsv();
        this.f11329a.getEventHandler().d(usv.EVENT_TYPE, new usv(vsvVar));
        this.f11329a.getEventHandler().d(tsv.EVENT_TYPE, new tsv(vsvVar));
        this.f11329a.getEventHandler().d(pqr.EVENT_TYPE, new pqr());
        try {
            this.f11329a.G().Q().b().k().J0(oqr.AKMTBEventChainForUltonEventAbilityAbilityHashType, new oqr(this));
        } catch (Throwable unused) {
        }
    }

    public final void m0(MtopResponse mtopResponse, fsb fsbVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fb390ae", new Object[]{this, mtopResponse, fsbVar, str});
        } else {
            ish.g().r(mtopResponse, fsbVar, str);
        }
    }

    public void n0(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b3b048c", new Object[]{this, str, str2});
            return;
        }
        IDMComponent I = I(str);
        if (I == null && !TextUtils.isEmpty(str2)) {
            I = G(str2);
        }
        this.f11329a.m0(I);
    }

    public void o0(j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80459e54", new Object[]{this, jVar});
        } else {
            this.b = jVar;
        }
    }

    public final void p0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b01d769", new Object[]{this});
        } else {
            Coordinator.execute(new h());
        }
    }

    public void s(List<IDMComponent> list) {
        j jVar;
        v46 v46Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7efc76fd", new Object[]{this, list});
            return;
        }
        q46.b();
        for (IDMComponent iDMComponent : list) {
            if ("vipModule".equals(iDMComponent.getTag()) && (v46Var = this.f) != null) {
                v46Var.d((DMComponent) iDMComponent);
            }
            ArrayMap<String, Object> extMap = iDMComponent.getExtMap();
            if (extMap != null) {
                extMap.remove("key_mytaobao_exposed_mark");
            }
        }
        if (!(vz3.a(list) || (jVar = this.b) == null)) {
            jVar.a();
        }
    }

    public final void s0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("605447bd", new Object[]{this});
        } else {
            Coordinator.execute(new f());
        }
    }

    public boolean t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f60a8b9b", new Object[]{this})).booleanValue();
        }
        return ish.g().n();
    }

    public void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1d3df86", new Object[]{this});
            return;
        }
        this.f11329a.l0();
        this.f11329a.p0(1);
        this.f11329a.y0();
        ish.g().a();
    }

    public final void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac073790", new Object[]{this});
        } else if (this.f11329a.w() != null) {
            this.f11329a.w().k();
        }
    }

    public void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24718bdc", new Object[]{this});
        } else if (!this.u && com.taobao.mytaobao.basement.a.i()) {
            sc.b(sc.beforeOverSeaApi);
            h0(J());
            sc.c(sc.beforeOverSeaApi);
        }
    }

    public final void x(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b984697b", new Object[]{this, str});
            return;
        }
        MtbBizProxy mtbBizProxy = this.v;
        if (l3j.INSTANCE.n() == 0) {
            str2 = "1";
        } else {
            str2 = "0";
        }
        r(mtbBizProxy, str2, false);
    }

    public final void z() {
        ViewEngine G;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e06eda", new Object[]{this});
            return;
        }
        com.alibaba.android.ultron.vfw.instance.a aVar = this.f11329a;
        if (aVar != null && (G = aVar.G()) != null) {
            G.j1(false);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class e implements ojd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ SecScreenBean f11336a;

        public e(SecScreenBean secScreenBean) {
            this.f11336a = secScreenBean;
        }

        @Override // tb.ojd
        public void a(int i, MtopResponse mtopResponse, Object obj, boolean z, Map<String, ?> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ddd7a0a5", new Object[]{this, new Integer(i), mtopResponse, obj, new Boolean(z), map});
                return;
            }
            MTBPresenter.g(MTBPresenter.this);
            if (MTBPresenter.h(MTBPresenter.this) != null && MTBPresenter.f(MTBPresenter.this) == 0) {
                MTBPresenter.h(MTBPresenter.this).b(3, 0, 2, null);
            }
            if (MTBPresenter.k(MTBPresenter.this) != null) {
                MTBPresenter.k(MTBPresenter.this).T();
            }
            SecScreenLoadMoreManager.e().d();
        }

        @Override // tb.ojd
        public void b(int i, MtopResponse mtopResponse, Object obj, fsb fsbVar, Map<String, ?> map) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e4ca5d12", new Object[]{this, new Integer(i), mtopResponse, obj, fsbVar, map});
                return;
            }
            MTBPresenter.g(MTBPresenter.this);
            if (MTBPresenter.k(MTBPresenter.this) != null) {
                MTBPresenter.k(MTBPresenter.this).T();
            }
            MTBPresenter.i(MTBPresenter.this, mtopResponse, fsbVar, ish.CACHE_KEY_ULTRON_SEC_SCREEN);
            if ("true".equals(this.f11336a.data.get("canLoadMore"))) {
                try {
                    org.json.JSONObject jSONObject = mtopResponse.getDataJsonObject().getJSONObject("global");
                    if (jSONObject != null) {
                        str = jSONObject.getJSONObject(xrl.ECHO).toString();
                    } else {
                        str = "{\"itemLastCount\":0,\"pageNo\":0,\"pageTotal\":0}";
                    }
                    SecScreenLoadMoreManager.e().f(this.f11336a, str);
                } catch (Exception unused) {
                }
            } else {
                SecScreenLoadMoreManager.e().d();
            }
            if (MTBPresenter.h(MTBPresenter.this) != null && MTBPresenter.f(MTBPresenter.this) == 0) {
                MTBPresenter.h(MTBPresenter.this).b(3, 0, 0, null);
            }
        }
    }

    public final void O(DMComponent dMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ad652ad", new Object[]{this, dMComponent});
            return;
        }
        JSONObject events = dMComponent.getEvents();
        if (events != null) {
            JSONArray jSONArray = events.getJSONArray("openSetting");
            if (jSONArray != null) {
                pqr.b(jSONArray, "settingButton.hasRedDot");
            }
            JSONArray jSONArray2 = events.getJSONArray("openUserLogo");
            if (jSONArray2 != null) {
                pqr.b(jSONArray2, "userInfo.bubbleText");
            }
            dMComponent.writeBackDataAndReloadEvent(dMComponent.getData(), false);
        }
    }

    public final void Z(Map<String, String> map, SecScreenBean secScreenBean) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dea15c4c", new Object[]{this, map, secScreenBean});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("useUpp", (Object) Boolean.toString(false));
        jSONObject.put("new2021UIEnable", (Object) Boolean.valueOf(TBRevisionSwitchManager.c().d("new2021UIEnable")));
        if (!(secScreenBean == null || (str = secScreenBean.apiName) == null)) {
            jSONObject.put("useSecScreenApi", (Object) str);
        }
        String jSONString = JSON.toJSONString(sb7.b(Login.getUserId()).c());
        if (!TextUtils.isEmpty(jSONString)) {
            jSONObject.put("orderFatigue", (Object) jSONString);
        }
        if (TBElder.b()) {
            jSONObject.put("elderFont", (Object) "true");
        }
        Float k2 = MtbGlobalEnv.k();
        if (k2 != null) {
            jSONObject.put("aspectRatio", (Object) k2);
        }
        map.put(PushConstants.PARAMS, JSON.toJSONString(jSONObject));
    }

    public void q0() {
        j8v j8vVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da1887d3", new Object[]{this});
            return;
        }
        BasementViewController basementViewController = this.k;
        if ((basementViewController == null || !basementViewController.a()) && (j8vVar = this.m) != null) {
            j8vVar.a("pageback", null);
        }
        if (Localization.o()) {
            this.f11329a.G().j1(false);
            ArrayList arrayList = new ArrayList();
            arrayList.add((DMComponent) G("headerModule"));
            this.f11329a.e(arrayList);
        }
    }

    public final void r0(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2110b87f", new Object[]{this, jSONObject});
            return;
        }
        try {
            jSONObject2 = jSONObject.getJSONObject("global").getJSONObject("passParams");
        } catch (Exception unused) {
            jSONObject2 = new JSONObject(0);
        }
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject(0);
        }
        Coordinator.execute(new g(jSONObject2));
    }

    public void M(String str, Intent intent) {
        MtbBizProxy mtbBizProxy;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("211a6fc5", new Object[]{this, str, intent});
        } else if (kgj.ACTION_REFRESH_PAGE.equals(str) || kgj.ACTION_REFRESH_PAGE_WHEN_SHOW.equals(str)) {
            g0("action_cache_invalid");
        } else if ("MyTaobao_Order_Refresh".equals(str)) {
            f0();
        } else if ("EDITON_SWITCHER_EDITTION_CODE_CHANGED".equals(str)) {
            if (MtbGlobalEnv.x() || !ih4.a("hotSwitchNewProxyV2", true) || (mtbBizProxy = this.v) == null) {
                s0();
                u();
                Q();
                TLog.loge("mtbMainLink", "收到广播，清数据， actionName=" + str);
                return;
            }
            mtbBizProxy.m().c();
        } else if ("AVATAR_CHANGED_SUCCESS".equals(str)) {
            s0();
            u();
            Q();
            TLog.loge("mtbMainLink", "收到广播，清数据， actionName=" + str);
        } else if (kgj.ACTION_SCROLL_TO_CARD.equals(str)) {
            s32.c().i("bctScrollToCard");
            TLog.loge("mtbMainLink", "收到广播，滚动， actionName=" + str);
            String stringExtra = intent.getStringExtra("cardId");
            String stringExtra2 = intent.getStringExtra("cardTag");
            if (TextUtils.isEmpty(stringExtra)) {
                stringExtra = intent.getStringExtra("arg1");
            }
            n0(stringExtra, stringExtra2);
        } else if ("taobao.action.ACTION_REVISION_SWITCH_CHANGE".equals(str)) {
            s0();
            if (!intent.getBooleanExtra("isLazy", false)) {
                u();
                Q();
                TLog.loge("mtbMainLink", "收到广播，清数据， actionName=" + str);
            }
        }
    }

    public void N(Fragment fragment, LinearLayout linearLayout, MTPtrRecyclerView mTPtrRecyclerView, LinearLayout linearLayout2) {
        rjc rjcVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("995e4128", new Object[]{this, fragment, linearLayout, mTPtrRecyclerView, linearLayout2});
        } else if (this.f11329a != null) {
            if (!MtbGlobalEnv.x()) {
                this.u = true;
                rjcVar = new dgj(mTPtrRecyclerView, fragment);
            } else {
                this.u = false;
                rjcVar = new cgj();
            }
            this.f11329a.t0(rjcVar);
            uv6.l("sdsdsdsdsd");
            this.f11329a.O(linearLayout, mTPtrRecyclerView, linearLayout2);
            uv6.l("cccccc");
            this.f11329a.p0(1);
            this.f11329a.y0();
        }
    }

    public void Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32fb118d", new Object[]{this});
            return;
        }
        sc.b(s0j.MTS_SUB_STAGE_LOAD_CACHE);
        JSONObject k2 = ish.g().k();
        JSONObject jSONObject = k2 != null ? k2.getJSONObject(q3g.f26483a) : null;
        MtbBizProxy mtbBizProxy = this.v;
        if (mtbBizProxy != null) {
            mtbBizProxy.j.g(jSONObject);
        }
        MtbBizProxy mtbBizProxy2 = this.v;
        if (mtbBizProxy2 != null) {
            mtbBizProxy2.N(true, H(jSONObject));
        }
        MtbGlobalEnv.B(jSONObject);
        x(MtbGlobalEnv.m());
        X(jSONObject);
        sc.c(s0j.MTS_SUB_STAGE_LOAD_CACHE);
        sc.b("cacheRender");
        uv6.l("before render Cache");
        if (k2 != null) {
            this.f11329a.e0(k2, null);
        }
        uv6.l("after render Cache");
        sc.c("cacheRender");
        JSONObject m = ish.g().m();
        if (m != null) {
            this.f11329a.e0(m, null);
        }
        uv6.l("zzz1");
        this.j.c(this, jSONObject);
        uv6.l("zzz2");
        j jVar = this.b;
        if (jVar != null) {
            jVar.b(0, 0, 0, jSONObject);
        }
        uv6.l("zzz2");
        if (k2 != null) {
            r0(k2.getJSONObject("data"));
            T(jSONObject);
        }
        uv6.l("zzz4");
    }

    public void U() {
        MtbBizProxy mtbBizProxy;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        this.t.set(0);
        this.d.removeCallbacksAndMessages(null);
        Localization.a aVar = this.w;
        if (aVar != null) {
            Localization.s(aVar);
        }
        if (!(this.x == null || (mtbBizProxy = this.v) == null)) {
            LocalBroadcastManager.getInstance(mtbBizProxy.i()).unregisterReceiver(this.x);
        }
        this.v = null;
        this.s = true;
        if (this.q != null) {
            TBAutoSizeConfig.x().h0(this.q);
        }
        com.alibaba.android.ultron.vfw.instance.a aVar2 = this.f11329a;
        if (aVar2 != null) {
            aVar2.r();
        }
        hsh hshVar = this.c;
        if (hshVar != null) {
            hshVar.b();
        }
        gsh gshVar = this.o;
        if (gshVar != null) {
            gshVar.c();
        }
        this.b = null;
        h8v h8vVar = this.l;
        if (h8vVar != null) {
            h8vVar.g("pageback");
        }
        UnreadWangWangMessageManager unreadWangWangMessageManager = this.n;
        if (unreadWangWangMessageManager != null) {
            unreadWangWangMessageManager.d();
        }
        ish.g().o();
    }

    public final void W(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52c070d", new Object[]{this, jSONObject});
            return;
        }
        JSONArray d2 = ish.d(jSONObject);
        if (d2 == null || d2.size() <= 0) {
            IpChange ipChange2 = MtbGlobalEnv.$ipChange;
            return;
        }
        IpChange ipChange3 = MtbGlobalEnv.$ipChange;
        ArrayList arrayList = new ArrayList(d2.size());
        for (int i2 = 0; i2 < d2.size(); i2++) {
            arrayList.add(d2.getJSONObject(i2).getString("orderId"));
        }
        sb7.b(Login.getUserId()).h(arrayList);
        sb7.b(Login.getUserId()).f();
    }

    public void a0(String str, MtopResponse mtopResponse, int i2, fsb fsbVar) {
        JSONObject p;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79f9475c", new Object[]{this, str, mtopResponse, new Integer(i2), fsbVar});
            return;
        }
        try {
            JSONObject jSONObject = (JSONObject) JSON.parseObject(mtopResponse.getBytedata(), JSONObject.class, new Feature[0]);
            JSONObject k2 = ish.g().k();
            m0(mtopResponse, fsbVar, ish.CACHE_KEY_ULTRON_MTB);
            try {
                mh8 mh8Var = new mh8();
                boolean z2 = this.t.getAndIncrement() == 0;
                if (l3j.INSTANCE.m() != 1) {
                    z = false;
                }
                p = mh8Var.p(jSONObject, k2, z2, z);
            } catch (Throwable unused) {
            }
            uuu.a(new d(p, str, i2, mtopResponse, fsbVar));
        } catch (Throwable unused2) {
        }
    }

    public final void e0(String str, SecScreenBean secScreenBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c3a0ed0", new Object[]{this, str, secScreenBean});
            return;
        }
        sc.b("queryAndRender");
        HashMap hashMap = new HashMap();
        Z(hashMap, secScreenBean);
        hashMap.put("deviceLevel", String.valueOf(MtbGlobalEnv.f()));
        this.e = 0;
        w55 b2 = d6o.b(this.f11329a.getContext(), "mtop.taobao.reborn.mclaren", "2.0", hashMap, true);
        this.e++;
        TLog.loge("mtbMainLink", "调用主接口");
        b2.h(this.f11329a.b()).a(null, new pyh(str, this));
    }

    public final com.alibaba.android.ultron.vfw.instance.a y(ew ewVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.android.ultron.vfw.instance.a) ipChange.ipc$dispatch("3c9be88f", new Object[]{this, ewVar});
        }
        UltronInstanceConfig K = new UltronInstanceConfig().z("mytaobao").K(false);
        K.a(true);
        K.G(new z7v.b().p(10086).q("mytaobao").l(new DXEngineConfig.b("mytaobao").H(true, true)).n(new b(this, ewVar)).i());
        return com.alibaba.android.ultron.vfw.instance.a.q(K, ewVar.i());
    }

    public void B(String str, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("568314ef", new Object[]{this, str, mtopResponse});
        } else if (!this.s) {
            z();
            TLog.loge("mtbMainLink", "主接口onError retCode=" + mtopResponse.getRetCode() + " retMsg=" + mtopResponse.getRetMsg());
            if (TextUtils.equals(str, "action_cache_invalid")) {
                z6t.T(this.p).e("MainInterface", z6t.Q());
            }
            mtopResponse.getRetCode();
            this.e--;
            MtbBizProxy mtbBizProxy = this.v;
            if (mtbBizProxy != null) {
                mtbBizProxy.T();
            }
            j jVar = this.b;
            if (jVar != null && this.e == 0) {
                jVar.b(2, 0, 2, null);
            }
            BehaviR.getInstance().commitRequest(u3j.b, str, null, "success=false");
        }
    }

    @UIThread
    public final void C(String str, int i2, MtopResponse mtopResponse, fsb fsbVar, JSONObject jSONObject) {
        JSONObject jSONObject2;
        BasementViewController basementViewController;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("616c0366", new Object[]{this, str, new Integer(i2), mtopResponse, fsbVar, jSONObject});
        } else if (!this.s) {
            if (TextUtils.equals(str, "action_cache_invalid")) {
                z6t.T(this.p).e("MainInterface", null);
            }
            sc.c("queryAndRender");
            sc.b("processQueryData");
            this.e--;
            MtbBizProxy mtbBizProxy = this.v;
            if (mtbBizProxy != null) {
                mtbBizProxy.T();
            }
            if (jSONObject != null) {
                jSONObject2 = jSONObject.getJSONObject("data");
            } else {
                mtopResponse.parseJsonByte();
                jSONObject2 = ((JSONObject) JSON.parseObject(mtopResponse.getBytedata(), JSONObject.class, new Feature[0])).getJSONObject("data");
            }
            this.j.j(this, jSONObject2, str);
            MtbGlobalEnv.B(jSONObject2);
            MtbBizProxy mtbBizProxy2 = this.v;
            if (mtbBizProxy2 != null) {
                mtbBizProxy2.j.g(jSONObject2);
                this.v.j.l(true);
            }
            p0();
            W(jSONObject2);
            if (osh.c()) {
                if (this.h != null) {
                    z = false;
                }
                X(jSONObject2);
                if (z) {
                    w();
                }
            } else {
                X(jSONObject2);
            }
            T(jSONObject2);
            f0();
            s0();
            sc.b("UPPdata");
            DMComponent dMComponent = (DMComponent) G("headerModule");
            if (dMComponent != null) {
                O(dMComponent);
            }
            j jVar = this.b;
            if (jVar != null && this.e == 0) {
                jVar.b(2, 0, 0, jSONObject2);
            }
            r0(jSONObject2);
            sc.c("UPPdata");
            MtbBizProxy mtbBizProxy3 = this.v;
            if (mtbBizProxy3 != null) {
                mtbBizProxy3.N(false, H(jSONObject2));
            }
            BehaviR.getInstance().commitRequest(u3j.b, str, null, "success=true");
            v();
            if (TextUtils.equals("action_pull_refresh", str) && (basementViewController = this.k) != null) {
                basementViewController.W();
            }
            sc.c("processQueryData");
        }
    }
}
