package com.alibaba.wireless.aliprivacyext.recommendation;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import anet.channel.request.Request;
import anetwork.channel.interceptor.Callback;
import anetwork.channel.interceptor.Interceptor;
import anetwork.channel.interceptor.InterceptorManager;
import com.alibaba.ariver.kernel.common.service.RVEnvironmentService;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.security.ccrc.service.build.vb;
import com.alibaba.wireless.aliprivacy.AliPrivacyCore;
import com.alibaba.wireless.aliprivacyext.http.MTopHelper;
import com.alibaba.wireless.aliprivacyext.track.model.TrackLog;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.Login;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.login4android.broadcast.LoginBroadcastHelper;
import com.taobao.orange.OrangeConfig;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTTracker;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;
import tb.g01;
import tb.g7b;
import tb.hwx;
import tb.hxm;
import tb.kuz;
import tb.muz;
import tb.mwx;
import tb.obk;
import tb.osx;
import tb.p4y;
import tb.rsx;
import tb.u9l;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String f = "RecommendModuleCore";

    /* renamed from: a  reason: collision with root package name */
    public Context f3388a;
    public Interceptor b;
    public String c;
    public muz d;
    public kuz e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f3389a;

        static {
            int[] iArr = new int[LoginAction.values().length];
            f3389a = iArr;
            try {
                iArr[LoginAction.NOTIFY_LOGIN_SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3389a[LoginAction.NOTIFY_LOGOUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: Taobao */
    /* renamed from: com.alibaba.wireless.aliprivacyext.recommendation.c$c  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class C0106c implements p4y {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ p4y f3391a;
        public final /* synthetic */ boolean b;

        public C0106c(p4y p4yVar, boolean z) {
            this.f3391a = p4yVar;
            this.b = z;
        }

        @Override // tb.p4y
        public void onFail(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("239cc86e", new Object[]{this, str});
                return;
            }
            p4y p4yVar = this.f3391a;
            if (p4yVar != null) {
                p4yVar.onFail(str);
            }
        }

        @Override // tb.p4y
        public void onSuccess() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d0e393ab", new Object[]{this});
            } else if (this.f3391a != null) {
                c.m(c.this, this.b);
                c.this.c();
                this.f3391a.onSuccess();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class d implements g7b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f3392a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ p4y c;

        public d(String str, boolean z, p4y p4yVar) {
            this.f3392a = str;
            this.b = z;
            this.c = p4yVar;
        }

        @Override // tb.g7b
        public void a(com.alibaba.wireless.aliprivacyext.http.model.response.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("17e6aa22", new Object[]{this, aVar});
                return;
            }
            hxm.w(c.D(c.this), this.f3392a, this.b);
            c.k(c.this, this.c);
        }

        @Override // tb.g7b
        public void b(com.alibaba.wireless.aliprivacyext.http.model.response.a aVar) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c33635a7", new Object[]{this, aVar});
                return;
            }
            c cVar = c.this;
            p4y p4yVar = this.c;
            if (aVar != null) {
                str = aVar.getRetMsg();
            } else {
                str = osx.d;
            }
            c.l(cVar, p4yVar, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class e implements g7b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // tb.g7b
        public void a(com.alibaba.wireless.aliprivacyext.http.model.response.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("17e6aa22", new Object[]{this, aVar});
                return;
            }
            c.F(c.this);
            c.J(c.this);
            c.this.c();
        }

        @Override // tb.g7b
        public void b(com.alibaba.wireless.aliprivacyext.http.model.response.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c33635a7", new Object[]{this, aVar});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class f implements g7b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        @Override // tb.g7b
        public void b(com.alibaba.wireless.aliprivacyext.http.model.response.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c33635a7", new Object[]{this, aVar});
            }
        }

        @Override // tb.g7b
        public void a(com.alibaba.wireless.aliprivacyext.http.model.response.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("17e6aa22", new Object[]{this, aVar});
                return;
            }
            JSONObject h = mwx.h(aVar.getData());
            if (h != null) {
                boolean B = c.B(c.this, h.getBoolean("result").booleanValue());
                c.m(c.this, B);
                c.n(c.this, B, false, null);
                c.this.c();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class h implements obk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f3396a;

        public h(Context context) {
            this.f3396a = context;
        }

        @Override // tb.obk
        public void onConfigUpdate(String str, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
                return;
            }
            g01.a(c.f, "onConfigUpdate:namespace:" + str);
            c.j(c.this, this.f3396a, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class i implements g7b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f3397a;
        public final /* synthetic */ g7b b;

        public i(c cVar, Context context, g7b g7bVar) {
            this.f3397a = context;
            this.b = g7bVar;
        }

        @Override // tb.g7b
        public void a(com.alibaba.wireless.aliprivacyext.http.model.response.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("17e6aa22", new Object[]{this, aVar});
                return;
            }
            TrackLog.trackGetRecommendStatusFromServerEnd(this.f3397a, true, mwx.e(aVar));
            g7b g7bVar = this.b;
            if (g7bVar != null) {
                g7bVar.a(aVar);
            }
        }

        @Override // tb.g7b
        public void b(com.alibaba.wireless.aliprivacyext.http.model.response.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c33635a7", new Object[]{this, aVar});
                return;
            }
            TrackLog.trackGetRecommendStatusFromServerEnd(this.f3397a, false, mwx.e(aVar));
            g7b g7bVar = this.b;
            if (g7bVar != null) {
                g7bVar.b(aVar);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class j implements g7b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f3398a;
        public final /* synthetic */ String b;
        public final /* synthetic */ g7b c;

        public j(c cVar, Context context, String str, g7b g7bVar) {
            this.f3398a = context;
            this.b = str;
            this.c = g7bVar;
        }

        @Override // tb.g7b
        public void a(com.alibaba.wireless.aliprivacyext.http.model.response.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("17e6aa22", new Object[]{this, aVar});
                return;
            }
            TrackLog.trackUpdateRecommendStatusEnd(this.f3398a, true, mwx.e(aVar), this.b);
            g7b g7bVar = this.c;
            if (g7bVar != null) {
                g7bVar.a(aVar);
            }
        }

        @Override // tb.g7b
        public void b(com.alibaba.wireless.aliprivacyext.http.model.response.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c33635a7", new Object[]{this, aVar});
                return;
            }
            TrackLog.trackUpdateRecommendStatusEnd(this.f3398a, false, mwx.e(aVar), this.b);
            g7b g7bVar = this.c;
            if (g7bVar != null) {
                g7bVar.b(aVar);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class k {

        /* renamed from: a  reason: collision with root package name */
        public static final c f3399a = new c(null);
    }

    public /* synthetic */ c(b bVar) {
        this();
    }

    public static /* synthetic */ boolean B(c cVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fe493795", new Object[]{cVar, new Boolean(z)})).booleanValue();
        }
        return cVar.C(z);
    }

    public static /* synthetic */ Context D(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("2b95d59b", new Object[]{cVar});
        }
        return cVar.f3388a;
    }

    public static /* synthetic */ void F(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b5286c2", new Object[]{cVar});
        } else {
            cVar.X();
        }
    }

    public static /* synthetic */ void J(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e83f9de1", new Object[]{cVar});
        } else {
            cVar.G();
        }
    }

    public static Context K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("1ad3a564", new Object[0]);
        }
        return R().f3388a;
    }

    public static c R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("c1f0510a", new Object[0]);
        }
        return k.f3399a;
    }

    public static /* synthetic */ void i(c cVar, Context context, com.alibaba.wireless.aliprivacyext.recommendation.e eVar, com.alibaba.wireless.aliprivacyext.model.a aVar, long j2, long[] jArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1336a7f1", new Object[]{cVar, context, eVar, aVar, new Long(j2), jArr});
        } else {
            cVar.e(context, eVar, aVar, j2, jArr);
        }
    }

    public static /* synthetic */ void j(c cVar, Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fca508e", new Object[]{cVar, context, str});
        } else {
            cVar.w(context, str);
        }
    }

    public static /* synthetic */ void k(c cVar, p4y p4yVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a0a3a47", new Object[]{cVar, p4yVar});
        } else {
            cVar.p(p4yVar);
        }
    }

    public static /* synthetic */ void l(c cVar, p4y p4yVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2b60051", new Object[]{cVar, p4yVar, str});
        } else {
            cVar.q(p4yVar, str);
        }
    }

    public static /* synthetic */ void m(c cVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed936ad0", new Object[]{cVar, new Boolean(z)});
        } else {
            cVar.r(z);
        }
    }

    public static /* synthetic */ void n(c cVar, boolean z, boolean z2, p4y p4yVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4c2e0c7", new Object[]{cVar, new Boolean(z), new Boolean(z2), p4yVar});
        } else {
            cVar.A(z, z2, p4yVar);
        }
    }

    public static /* synthetic */ void x(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41785884", new Object[]{cVar});
        } else {
            cVar.Y();
        }
    }

    public final void A(boolean z, boolean z2, p4y p4yVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0db07c2", new Object[]{this, new Boolean(z), new Boolean(z2), p4yVar});
            return;
        }
        String I = I();
        if (!z2 || M()) {
            hxm.w(this.f3388a, I, z);
            p(p4yVar);
            return;
        }
        g(this.f3388a, I, z, new d(I, z, p4yVar), "0");
    }

    public final boolean C(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9d6ac0f", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        return !z;
    }

    public final void E(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f76bb9e", new Object[]{this, context});
            return;
        }
        try {
            String customConfig = OrangeConfig.getInstance().getCustomConfig("aliprivacy_config_mtop_api", null);
            hxm.C(context, customConfig);
            if (!S(context)) {
                d(context);
            }
            o("aliprivacy_config_mtop_api", customConfig);
        } catch (Throwable unused) {
        }
    }

    public final void G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            hxm.b(this.f3388a);
        }
    }

    public final void H(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a023673d", new Object[]{this, context});
            return;
        }
        try {
            Map<String, String> configs = OrangeConfig.getInstance().getConfigs("aliprivacy_config_switch");
            if (configs != null && !configs.isEmpty()) {
                a(context, configs);
                V(context);
                o("aliprivacy_config_switch", mwx.e(configs));
            }
            o("aliprivacy_config_switch", "");
        } catch (Throwable unused) {
        }
    }

    public final String I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("43881515", new Object[]{this});
        }
        try {
            if (!TextUtils.isEmpty(this.c)) {
                return this.c;
            }
            if (Login.checkSessionValid()) {
                String userId = Login.getUserId();
                z(userId, "loginSdk");
                return userId;
            }
            String l = hxm.l(this.f3388a);
            z(l, "cache");
            return l;
        } catch (Throwable th) {
            g01.d(f, "getCurrentLoginUserId error", th);
            return null;
        }
    }

    public final void L(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0d012dc", new Object[]{this, context});
            return;
        }
        try {
            String customConfig = OrangeConfig.getInstance().getCustomConfig("aliprivacy_config_scene_auth_api_v1", null);
            AliPrivacyCore.h(context, customConfig);
            o("aliprivacy_config_scene_auth_api_v1", mwx.e(customConfig));
        } catch (Throwable unused) {
        }
    }

    public final boolean M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[]{this})).booleanValue();
        }
        String j2 = u9l.j(this.f3388a);
        if (TextUtils.isEmpty(j2) || !"0".equals(j2)) {
            return false;
        }
        return true;
    }

    public final com.alibaba.wireless.aliprivacyext.recommendation.e N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.wireless.aliprivacyext.recommendation.e) ipChange.ipc$dispatch("9c5c4847", new Object[]{this});
        }
        String I = I();
        if (TextUtils.isEmpty(I)) {
            return com.alibaba.wireless.aliprivacyext.recommendation.e.NO_UID;
        }
        if (!hxm.c(this.f3388a, I)) {
            return com.alibaba.wireless.aliprivacyext.recommendation.e.INVALID;
        }
        if (hxm.e(this.f3388a, I)) {
            return com.alibaba.wireless.aliprivacyext.recommendation.e.OPEN;
        }
        return com.alibaba.wireless.aliprivacyext.recommendation.e.CLOSE;
    }

    public final void O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        try {
            LoginBroadcastHelper.registerLoginReceiver(this.f3388a, new b());
        } catch (Throwable th) {
            g01.d(f, "registerLoginListener", th);
        }
    }

    public void P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
            return;
        }
        try {
            O();
            if (Login.checkSessionValid()) {
                z(Login.getUserId(), RVEnvironmentService.PLATFORM_TB);
            } else {
                v();
                Y();
            }
        } catch (Throwable th) {
            g01.d(f, "syncAndRegisterLoginReceiverForTB error", th);
        }
    }

    public final void Q(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a17cbe7b", new Object[]{this, context});
            return;
        }
        OrangeConfig.getInstance().registerListener(new String[]{"aliprivacy_config_switch", "aliprivacy_config_mtop_api", "aliprivacy_config_scene_auth_api_v1"}, new h(context), false);
        OrangeConfig.getInstance().getCustomConfig("aliprivacy_config_scene_auth_api_v1", null);
    }

    public final boolean S(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a2296a1e", new Object[]{this, context})).booleanValue();
        }
        if (context != null && u9l.p(context)) {
            return mwx.n(context, u9l.o(context));
        }
        return false;
    }

    public final com.alibaba.wireless.aliprivacyext.recommendation.e T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.wireless.aliprivacyext.recommendation.e) ipChange.ipc$dispatch("e7845a49", new Object[]{this});
        }
        if (!W()) {
            return com.alibaba.wireless.aliprivacyext.recommendation.e.INVALID;
        }
        if (hxm.s(this.f3388a)) {
            return com.alibaba.wireless.aliprivacyext.recommendation.e.OPEN;
        }
        return com.alibaba.wireless.aliprivacyext.recommendation.e.CLOSE;
    }

    public final void U(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2d615b9", new Object[]{this, context});
        } else if (context == null) {
            Log.e(f, "processPrivacyProfile context is null ");
        } else {
            new hwx().b(context);
        }
    }

    public final void V(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a382c158", new Object[]{this, context});
            return;
        }
        if (this.d == null) {
            this.d = new muz(context);
        }
        if (this.e == null) {
            this.e = new kuz(this.d);
        }
        if (S(context)) {
            this.e.b(System.currentTimeMillis());
            if (rsx.b(context)) {
                rsx.g(rsx.d(this.f3388a));
            } else {
                rsx.h(context);
            }
        } else {
            d(context);
        }
    }

    public final boolean W() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[]{this})).booleanValue();
        }
        return hxm.d(this.f3388a);
    }

    public final void X() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
        } else {
            hxm.K(this.f3388a, I());
        }
    }

    public final void Y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
        } else if (S(this.f3388a)) {
            this.e.a();
            this.e.b(System.currentTimeMillis());
            if (rsx.b(this.f3388a)) {
                rsx.g(rsx.d(this.f3388a));
            } else {
                rsx.h(this.f3388a);
            }
        }
    }

    public final void a(Context context, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8df32b25", new Object[]{this, context, map});
            return;
        }
        hxm.G(context, map.get("sync_switch"));
        hxm.F(context, map.get("downgrade_without_uid"));
        hxm.A(context, map.get("log_timeInterval"));
        hxm.z(context, map.get(vb.m));
        hxm.Q(context, map.get("log_gray_scope"));
        hxm.P(context, map.get("log_cache_count_global_header"));
        hxm.y(context, map.get("log_cache_count"));
        hxm.x(context, map.get("recommend_entrance_name"));
        hxm.D(context, map.get("recommend_linked_h5_url"));
        hxm.I(context, map.get("recommend_ttid_list"));
        hxm.v(context, map.get("recommend_gray_scope"));
        hxm.S(context, map.get("recommend_global_header_switch"));
        hxm.R(context, map.get("recommend_global_header_gray_scope"));
    }

    public com.alibaba.wireless.aliprivacyext.recommendation.e b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.wireless.aliprivacyext.recommendation.e) ipChange.ipc$dispatch("e5208a0c", new Object[]{this, str});
        }
        if (this.f3388a == null) {
            g01.c(f, "mContext is null");
            return com.alibaba.wireless.aliprivacyext.recommendation.e.INVALID;
        } else if (W()) {
            return T();
        } else {
            return N();
        }
    }

    public void c() {
        kuz kuzVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (S(this.f3388a) && (kuzVar = this.e) != null) {
            kuzVar.b(System.currentTimeMillis());
        }
    }

    public final void d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        kuz kuzVar = this.e;
        if (kuzVar != null) {
            kuzVar.e();
        }
        Interceptor interceptor = this.b;
        if (interceptor != null) {
            InterceptorManager.removeInterceptor(interceptor);
        }
        g gVar = new g(u(context), context);
        this.b = gVar;
        InterceptorManager.addInterceptor(gVar);
    }

    public void f(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b6362a", new Object[]{this, context, str});
        } else if (context == null) {
            g01.c(f, "recommend module init fail,context is null");
        } else {
            this.f3388a = context;
            U(context);
            Q(context);
            V(context);
            O();
            z(str, "init");
            g01.a(f, "recommend module init success");
        }
    }

    public final void g(Context context, String str, boolean z, g7b g7bVar, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dca10c37", new Object[]{this, context, str, new Boolean(z), g7bVar, str2});
            return;
        }
        boolean C = C(z);
        if (M()) {
            g7bVar.b(null);
        } else if (TextUtils.isEmpty(str)) {
            g7bVar.b(null);
        } else {
            TrackLog.trackUpdateRecommendStatusStart(context, M(), z, str2);
            j jVar = new j(this, context, str2, g7bVar);
            com.alibaba.wireless.aliprivacyext.http.model.request.c cVar = new com.alibaba.wireless.aliprivacyext.http.model.request.c();
            cVar.value = C;
            cVar.code = "CLOSE_PERSONALIZED_RECOMMENDATION";
            MTopHelper.b(context, cVar, jVar);
        }
    }

    public final void h(Context context, g7b g7bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a95481a3", new Object[]{this, context, g7bVar});
        } else if (M()) {
            g7bVar.b(null);
        } else {
            TrackLog.trackGetRecommendStatusFromServerStart(context, M());
            i iVar = new i(this, context, g7bVar);
            com.alibaba.wireless.aliprivacyext.http.model.request.b bVar = new com.alibaba.wireless.aliprivacyext.http.model.request.b();
            bVar.source = "AliPrivacySDK";
            bVar.code = "CLOSE_PERSONALIZED_RECOMMENDATION";
            MTopHelper.b(context, bVar, iVar);
        }
    }

    public final void o(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else {
            TrackLog.trackOrangeConfigUpdate(str, str2);
        }
    }

    public final void p(p4y p4yVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4178cce3", new Object[]{this, p4yVar});
        } else if (p4yVar != null) {
            p4yVar.onSuccess();
        }
    }

    public final void q(p4y p4yVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a37a3ed", new Object[]{this, p4yVar, str});
        } else if (p4yVar != null) {
            p4yVar.onFail(str);
        }
    }

    public final void r(boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        try {
            UTTracker defaultTracker = UTAnalytics.getInstance().getDefaultTracker();
            if (z) {
                str = "1";
            } else {
                str = "0";
            }
            defaultTracker.setGlobalProperty("_ut_ps_rec", str);
        } catch (Throwable unused) {
        }
    }

    public final void s(boolean z, p4y p4yVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de43c05f", new Object[]{this, new Boolean(z), p4yVar});
            return;
        }
        hxm.H(this.f3388a, z);
        p(p4yVar);
    }

    public void t(boolean z, boolean z2, p4y p4yVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dad73c63", new Object[]{this, new Boolean(z), new Boolean(z2), p4yVar});
            return;
        }
        C0106c cVar = new C0106c(p4yVar, z);
        if (W()) {
            s(z, cVar);
        } else {
            A(z, z2, cVar);
        }
    }

    public void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.c = null;
        hxm.a(this.f3388a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x002b, code lost:
        if (r8.equals("aliprivacy_config_mtop_api") == false) goto L_0x0023;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void w(android.content.Context r7, java.lang.String r8) {
        /*
            r6 = this;
            r0 = 2
            r1 = 1
            r2 = 0
            com.android.alibaba.ip.runtime.IpChange r3 = com.alibaba.wireless.aliprivacyext.recommendation.c.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x0018
            java.lang.String r4 = "9b80d809"
            r5 = 3
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r2] = r6
            r5[r1] = r7
            r5[r0] = r8
            r3.ipc$dispatch(r4, r5)
            return
        L_0x0018:
            r8.hashCode()
            r3 = -1
            int r4 = r8.hashCode()
            switch(r4) {
                case -1785471108: goto L_0x0039;
                case -1083253572: goto L_0x002e;
                case 2082670955: goto L_0x0025;
                default: goto L_0x0023;
            }
        L_0x0023:
            r0 = -1
            goto L_0x0043
        L_0x0025:
            java.lang.String r1 = "aliprivacy_config_mtop_api"
            boolean r8 = r8.equals(r1)
            if (r8 != 0) goto L_0x0043
            goto L_0x0023
        L_0x002e:
            java.lang.String r0 = "aliprivacy_config_scene_auth_api_v1"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x0037
            goto L_0x0023
        L_0x0037:
            r0 = 1
            goto L_0x0043
        L_0x0039:
            java.lang.String r0 = "aliprivacy_config_switch"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x0042
            goto L_0x0023
        L_0x0042:
            r0 = 0
        L_0x0043:
            switch(r0) {
                case 0: goto L_0x004f;
                case 1: goto L_0x004b;
                case 2: goto L_0x0047;
                default: goto L_0x0046;
            }
        L_0x0046:
            goto L_0x0052
        L_0x0047:
            r6.E(r7)
            goto L_0x0052
        L_0x004b:
            r6.L(r7)
            goto L_0x0052
        L_0x004f:
            r6.H(r7)
        L_0x0052:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.wireless.aliprivacyext.recommendation.c.w(android.content.Context, java.lang.String):void");
    }

    public void y(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        this.c = str;
        hxm.B(this.f3388a, str);
        kuz kuzVar = this.e;
        if (kuzVar != null) {
            kuzVar.f(this.c);
        }
    }

    public void z(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{this, str, str2});
        } else if (TextUtils.isEmpty(str)) {
            if (rsx.b(this.f3388a)) {
                boolean d2 = rsx.d(this.f3388a);
                r(d2);
                if (S(this.f3388a)) {
                    rsx.g(d2);
                }
            }
            g01.a(f, "userId is null");
        } else {
            rsx.h(this.f3388a);
            if (str.equals(this.c)) {
                g01.a(f, "userId is not changed");
                return;
            }
            y(str);
            if (W()) {
                boolean recommendSwitchBooleanStatus = T().getRecommendSwitchBooleanStatus();
                r(recommendSwitchBooleanStatus);
                g(this.f3388a, str, recommendSwitchBooleanStatus, new e(), "1");
                return;
            }
            h(this.f3388a, new f());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class b extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/wireless/aliprivacyext/recommendation/c$b");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            LoginAction valueOf;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (intent != null && (valueOf = LoginAction.valueOf(intent.getAction())) != null) {
                int i = a.f3389a[valueOf.ordinal()];
                if (i == 1) {
                    c.this.z(Login.getUserId(), "loginSucces");
                } else if (i == 2) {
                    c.this.v();
                    c.x(c.this);
                }
            }
        }
    }

    public c() {
    }

    public final List<com.alibaba.wireless.aliprivacyext.model.a> u(Context context) {
        JSONArray l;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("30c7e468", new Object[]{this, context});
        }
        try {
            String g2 = u9l.g(context);
            if (g2 == null || (l = mwx.l(g2)) == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(l.size());
            for (int i2 = 0; i2 < l.size(); i2++) {
                JSONObject jSONObject = l.getJSONObject(i2);
                String string = jSONObject.getString("api");
                if (!TextUtils.isEmpty(string)) {
                    String string2 = jSONObject.getString("fromSource");
                    if (!TextUtils.isEmpty(string2)) {
                        com.alibaba.wireless.aliprivacyext.model.a aVar = new com.alibaba.wireless.aliprivacyext.model.a();
                        aVar.api = string;
                        aVar.fromSource = string2;
                        arrayList.add(aVar);
                    }
                }
            }
            return arrayList;
        } catch (Throwable th) {
            g01.d(f, "getMTopApiList error", th);
            return null;
        }
    }

    public final void e(Context context, com.alibaba.wireless.aliprivacyext.recommendation.e eVar, com.alibaba.wireless.aliprivacyext.model.a aVar, long j2, long... jArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81a3fe8d", new Object[]{this, context, eVar, aVar, new Long(j2), jArr});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("apiName", aVar.api);
        hashMap.put("step1Rt", String.valueOf(jArr[0]));
        hashMap.put("step2Rt", String.valueOf(jArr[1]));
        hashMap.put("step3Rt", String.valueOf(jArr[2]));
        TrackLog.trackQueryRecommendStatusLog(context, eVar.getStatus(), "MTop", aVar.fromSource, mwx.e(hashMap), j2);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class g implements Interceptor {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ List f3395a;
        public final /* synthetic */ Context b;

        public g(List list, Context context) {
            this.f3395a = list;
            this.b = context;
        }

        @Override // anetwork.channel.interceptor.Interceptor
        public Future<?> intercept(Interceptor.Chain chain) {
            List list;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Future) ipChange.ipc$dispatch("793d1164", new Object[]{this, chain});
            }
            long nanoTime = System.nanoTime();
            Request request = chain.request();
            Callback callback = chain.callback();
            try {
                URL url = request.getUrl();
                if (!(url == null || (list = this.f3395a) == null || list.size() == 0)) {
                    String path = url.getPath();
                    if (path != null && !path.contains("mtop.dsm.compliance.external.privacy.log.put")) {
                        String replace = path.replace("/", ".");
                        long nanoTime2 = System.nanoTime() - nanoTime;
                        long nanoTime3 = System.nanoTime();
                        Iterator it = this.f3395a.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            com.alibaba.wireless.aliprivacyext.model.a aVar = (com.alibaba.wireless.aliprivacyext.model.a) it.next();
                            if (replace.contains(aVar.api)) {
                                com.alibaba.wireless.aliprivacyext.recommendation.e b = c.this.b("AliPrivacySDK");
                                Request.Builder newBuilder = chain.request().newBuilder();
                                if (!b.getRecommendSwitchBooleanStatus()) {
                                    newBuilder = newBuilder.addHeader("x-recommend-content-close", "true");
                                }
                                long nanoTime4 = System.nanoTime() - nanoTime3;
                                long nanoTime5 = System.nanoTime();
                                if (rsx.b(this.b)) {
                                    newBuilder = newBuilder.addHeader("cro-privacy-recommend-switch-without-uid", String.valueOf(rsx.d(this.b)));
                                }
                                long nanoTime6 = System.nanoTime() - nanoTime5;
                                request = newBuilder.addHeader("cro-privacy-recommend-switch", b.getStatus()).build();
                                g01.a(c.f, "InterceptorManager add headers: " + b.getStatus());
                                c.i(c.this, this.b, b, aVar, System.nanoTime() - nanoTime, new long[]{nanoTime2, nanoTime4, nanoTime6});
                            }
                        }
                        return chain.proceed(request, callback);
                    }
                    return chain.proceed(request, callback);
                }
                return chain.proceed(request, callback);
            } catch (Throwable th) {
                g01.d(c.f, "init error", th);
                return chain.proceed(request, callback);
            }
        }
    }
}
