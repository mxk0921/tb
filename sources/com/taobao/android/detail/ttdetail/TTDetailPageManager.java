package com.taobao.android.detail.ttdetail;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Looper;
import android.os.MessageQueue;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.ariver.kernel.RVStartParams;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.animation.addCartAnimation.AdvAddCartAnimController;
import com.taobao.android.detail.ttdetail.behavior.UserBehaviorTracker;
import com.taobao.android.detail.ttdetail.bridge.TTDetailPacketWVPlugin;
import com.taobao.android.detail.ttdetail.bridge.TTWXModule;
import com.taobao.android.detail.ttdetail.broadcast.DetailSKURefreshReceiver;
import com.taobao.android.detail.ttdetail.broadcast.DetailUpdateDataReceiver;
import com.taobao.android.detail.ttdetail.broadcast.SkuActionCallback;
import com.taobao.android.detail.ttdetail.component.ComponentViewMeta;
import com.taobao.android.detail.ttdetail.component.module.DataEntry;
import com.taobao.android.detail.ttdetail.constant.Constants$WVActionData;
import com.taobao.android.detail.ttdetail.container.MainScreenCore;
import com.taobao.android.detail.ttdetail.content.HorizontalPageController;
import com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter;
import com.taobao.android.detail.ttdetail.data.converter.TTDataDealException;
import com.taobao.android.detail.ttdetail.data.meta.DetailClientData;
import com.taobao.android.detail.ttdetail.data.meta.Fatigue;
import com.taobao.android.detail.ttdetail.data.meta.Feature;
import com.taobao.android.detail.ttdetail.data.meta.Item;
import com.taobao.android.detail.ttdetail.data.meta.Params;
import com.taobao.android.detail.ttdetail.data.meta.Resource;
import com.taobao.android.detail.ttdetail.data.meta.Seller;
import com.taobao.android.detail.ttdetail.feature.DevFeature;
import com.taobao.android.detail.ttdetail.floatview.TTDFloatController;
import com.taobao.android.detail.ttdetail.floatview.globalbarrage.BarrageFloatingView;
import com.taobao.android.detail.ttdetail.handler.bizhandlers.OpenSkuImplementor;
import com.taobao.android.detail.ttdetail.handler.bizhandlers.UpdateItemImplementor;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import com.taobao.android.detail.ttdetail.inside.InsideLinearLayout;
import com.taobao.android.detail.ttdetail.inside.TTDInsideController;
import com.taobao.android.detail.ttdetail.performance.PreRenderManager;
import com.taobao.android.detail.ttdetail.request.MtopInfo;
import com.taobao.android.detail.ttdetail.request.preload.PreloadDetailWVPlugin;
import com.taobao.android.detail.ttdetail.runtime.RuntimeParam;
import com.taobao.android.detail.ttdetail.skeleton.TTDetailScrollerLayoutComponent;
import com.taobao.android.detail.ttdetail.skeleton.navbar.CartBarViewHolder;
import com.taobao.android.detail.ttdetail.utils.DataUtils;
import com.taobao.android.detail.ttdetail.utils.DynamicMergeUtils;
import com.taobao.android.detail.ttdetail.utils.IpvUtils;
import com.taobao.android.detail.ttdetail.utils.MockUtils;
import com.taobao.android.detail.ttdetail.utils.PerformanceUtils;
import com.taobao.android.detail.ttdetail.utils.RuntimeUtils;
import com.taobao.android.detail.ttdetail.utils.TeMaiUtils;
import com.taobao.android.detail.ttdetail.utils.UtUtils;
import com.taobao.android.detail.ttdetail.widget.BottomBarContainer;
import com.taobao.android.purchase.preload.TBBuyPreloadScene;
import com.taobao.android.tbsku.TBXSkuCore;
import com.taobao.schedule.ViewProxy;
import com.taobao.tao.util.SystemBarDecorator;
import com.taobao.taobao.R;
import com.taobao.uikit.actionbar.ITBPublicMenu;
import com.taobao.uikit.extend.component.TBErrorView;
import com.taobao.uikit.extend.component.error.Error;
import com.ut.mini.UTAnalytics;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.a4o;
import tb.a58;
import tb.af7;
import tb.am2;
import tb.atz;
import tb.b1i;
import tb.b4o;
import tb.b5m;
import tb.bos;
import tb.btz;
import tb.bw7;
import tb.cqz;
import tb.crm;
import tb.ctd;
import tb.d1a;
import tb.ens;
import tb.epq;
import tb.f7l;
import tb.fsw;
import tb.fxl;
import tb.gkv;
import tb.h8n;
import tb.hi8;
import tb.hjh;
import tb.hkv;
import tb.i1i;
import tb.il1;
import tb.ir;
import tb.iwb;
import tb.jns;
import tb.jos;
import tb.jov;
import tb.jtm;
import tb.k66;
import tb.k7z;
import tb.kns;
import tb.kos;
import tb.lba;
import tb.lf7;
import tb.los;
import tb.mff;
import tb.mg1;
import tb.mng;
import tb.mr7;
import tb.nj7;
import tb.npw;
import tb.o3l;
import tb.o6x;
import tb.oa4;
import tb.og7;
import tb.owc;
import tb.pos;
import tb.pq4;
import tb.q2q;
import tb.q84;
import tb.r3q;
import tb.rc7;
import tb.rql;
import tb.snj;
import tb.t2o;
import tb.tgh;
import tb.tq4;
import tb.txl;
import tb.u4o;
import tb.u5m;
import tb.u5o;
import tb.uug;
import tb.vbl;
import tb.viq;
import tb.vkb;
import tb.vt2;
import tb.w7j;
import tb.w9e;
import tb.wb4;
import tb.wi2;
import tb.xbn;
import tb.xe7;
import tb.xns;
import tb.xt3;
import tb.y0i;
import tb.ygw;
import tb.ym9;
import tb.ywk;
import tb.yzc;
import tb.z1x;
import tb.z4k;
import tb.ze7;
import tb.zh6;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class TTDetailPageManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DOWNGRADE_DATA_ID = "ttDetailDowngradeDataId";
    public static final Map<String, JSONObject> sDowngradeData = new ConcurrentHashMap(1);
    public static final Map<String, Drawable> sDowngradeSnapshotData = new ConcurrentHashMap(0);
    public TTMainScreenContainer A;
    public kos B;
    public String C;
    public HorizontalPageController D;
    public TTDFloatController E;
    public com.taobao.android.detail.ttdetail.floatview.globalbarrage.a F;
    public il1 G;
    public ViewGroup H;
    public ITBPublicMenu I;
    public jos J;
    public MessageQueue K;
    public i1i L;
    public wi2 M;
    public bos N;
    public volatile MessageQueue.IdleHandler O;
    public volatile MessageQueue.IdleHandler Q;
    public String T;
    public Map<String, String> U;
    public ens V;
    public Looper W;
    public mng X;

    /* renamed from: a  reason: collision with root package name */
    public ze7 f6625a;
    public AdvAddCartAnimController a0;
    public final Context b;
    public boolean c;
    public final Intent d;
    public u4o e;
    public h8n f;
    public DetailUpdateDataReceiver g;
    public cqz g0;
    public DetailSKURefreshReceiver h;
    public BroadcastReceiver i;
    public BroadcastReceiver j;
    public BroadcastReceiver k;
    public View m;
    public View n;
    public BottomBarContainer o;
    public View p;
    public TBErrorView q;
    public volatile boolean r;
    public volatile boolean s;
    public volatile boolean t;
    public TBSkuWrapper v;
    public fxl w;
    public volatile boolean x;
    public TTDetailScrollerLayoutComponent y;
    public TTDInsideController z;
    public final b4o l = new b4o();
    public String u = "item.taobao.com";
    public final Runnable h0 = new a();
    public final r3q.c P = new k();
    public final r3q.c R = new x();
    public final iwb S = new b0();
    public final Map<String, Object> Y = new HashMap(0);
    public final String Z = URLEncoder.encode(hjh.b() + UUID.randomUUID().toString() + System.currentTimeMillis());
    public volatile ctd b0 = new c0();
    public final TTDetailScrollerLayoutComponent.d c0 = new d0();
    public final MainScreenCore.c d0 = new e0();
    public final ctd e0 = new f0();
    public final DetailUpdateDataReceiver.a f0 = new g0();

    /* compiled from: Taobao */
    /* renamed from: com.taobao.android.detail.ttdetail.TTDetailPageManager$17  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class AnonymousClass17 implements UpdateItemImplementor.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public AnonymousClass17() {
        }

        public Map<String, String> a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("fb00077e", new Object[]{this});
            }
            return TTDetailPageManager.m(TTDetailPageManager.this);
        }

        public String b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("707fddc9", new Object[]{this});
            }
            return TTDetailPageManager.l(TTDetailPageManager.this);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class BottomBarCartUpdateReceiver extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(912261210);
        }

        public BottomBarCartUpdateReceiver() {
        }

        public static /* synthetic */ Object ipc$super(BottomBarCartUpdateReceiver bottomBarCartUpdateReceiver, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/TTDetailPageManager$BottomBarCartUpdateReceiver");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            oa4 d;
            JSONObject f;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (vbl.i() && intent != null && (d = TTDetailPageManager.K(TTDetailPageManager.this).h().d("bottomBar")) != null && d.getComponentData() != null && (f = d.getComponentData().f()) != null) {
                f.put("cartCount", (Object) String.valueOf(intent.getIntExtra("itemCount", 0)));
                d.updateComponent();
            }
        }

        public /* synthetic */ BottomBarCartUpdateReceiver(TTDetailPageManager tTDetailPageManager, a aVar) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class TmCartUpdateReceiver extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(912261212);
        }

        public TmCartUpdateReceiver() {
        }

        public static /* synthetic */ Object ipc$super(TmCartUpdateReceiver tmCartUpdateReceiver, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/TTDetailPageManager$TmCartUpdateReceiver");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (intent != null && TTDetailPageManager.s(TTDetailPageManager.this).h()) {
                TeMaiUtils.b(TTDetailPageManager.K(TTDetailPageManager.this).h().d("bottomBar"), intent.getStringExtra(Constants$WVActionData.INTENT_EXTRA_DATA));
            }
        }

        public /* synthetic */ TmCartUpdateReceiver(TTDetailPageManager tTDetailPageManager, a aVar) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class TmCloseDetailPageReceiver extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(912261213);
        }

        public TmCloseDetailPageReceiver() {
        }

        public static /* synthetic */ Object ipc$super(TmCloseDetailPageReceiver tmCloseDetailPageReceiver, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/TTDetailPageManager$TmCloseDetailPageReceiver");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (intent != null && TTDetailPageManager.s(TTDetailPageManager.this).h()) {
                tq4.a(TTDetailPageManager.c(TTDetailPageManager.this));
            }
        }

        public /* synthetic */ TmCloseDetailPageReceiver(TTDetailPageManager tTDetailPageManager, a aVar) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (TTDetailPageManager.a(TTDetailPageManager.this) != null && TTDetailPageManager.a(TTDetailPageManager.this).isShowing()) {
                try {
                    TTDetailPageManager.a(TTDetailPageManager.this).dismiss();
                } catch (Throwable th) {
                    tgh.c("TTDetailPageManager", "pending dismiss loading dialog exception", th);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a0 implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ JSONObject b;
        public final /* synthetic */ int c;

        public a0(JSONObject jSONObject, int i) {
            this.b = jSONObject;
            this.c = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                TTDetailPageManager.M(TTDetailPageManager.this, this.b, this.c);
            } catch (Throwable th) {
                if (vbl.T0()) {
                    String d = TTDetailPageManager.s(TTDetailPageManager.this).d();
                    String v = TTDetailPageManager.v(TTDetailPageManager.this, d);
                    TTDetailPageManager.w(TTDetailPageManager.this, this.b, v, d);
                    tgh.c("TTDetailPageManager", "main thread refreshLayout() exception to h5", th);
                    String str = (String) TTDetailPageManager.K(TTDetailPageManager.this).i().c("traceId");
                    if (TextUtils.isEmpty(str)) {
                        str = "";
                    }
                    TTDetailPageManager tTDetailPageManager = TTDetailPageManager.this;
                    lf7.h(v, d, str, TTDetailPageManager.x(tTDetailPageManager, TTDetailPageManager.c(tTDetailPageManager)), "main thread refreshLayout() exception", new HashMap<String, String>(1, th) { // from class: com.taobao.android.detail.ttdetail.TTDetailPageManager$45$1
                        public final /* synthetic */ Throwable val$e;

                        {
                            this.val$e = th;
                            put("exception", Log.getStackTraceString(th));
                        }
                    });
                    return;
                }
                throw new TTDataDealException("main thread refreshLayout() exception: ", th);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements HorizontalPageController.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // com.taobao.android.detail.ttdetail.content.HorizontalPageController.b
        public View a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("d528c77d", new Object[]{this});
            }
            return TTDetailPageManager.h(TTDetailPageManager.this);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b0 implements iwb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b0() {
        }

        @Override // tb.iwb
        public void onNotificationListener(k66 k66Var) {
            List<zh6> list;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2f1f5baf", new Object[]{this, k66Var});
            } else if (k66Var != null && (list = k66Var.c) != null && list.size() > 0) {
                for (zh6 zh6Var : k66Var.c) {
                    if (zh6Var.f32770a != null && zh6Var.c == 1000) {
                        tgh.b("TTDetailPageManager", "mDXRenderErrorListener" + zh6Var.f32770a);
                        TTDetailPageManager.P(TTDetailPageManager.this, zh6Var.f32770a.f7343a);
                    }
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c implements vkb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // tb.vkb
        public void a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2df2da85", new Object[]{this, jSONObject});
            } else if (r3q.p(jSONObject, TTDetailPageManager.K(TTDetailPageManager.this))) {
                TTDetailPageManager.this.Q0(null, null, true, new RuntimeParam[0]);
            } else {
                tgh.b("TTDetailPageManager", "SKU confirm callback 调用成功，但更新当前商品sku信息失败。skuReturnData= ");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c0 implements ctd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c0() {
        }

        @Override // tb.ctd
        public void onFailure(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cccc2dc6", new Object[]{this, str, str2});
                return;
            }
            TTDetailPageManager tTDetailPageManager = TTDetailPageManager.this;
            TTDetailPageManager.n1(tTDetailPageManager, TTDetailPageManager.m1(tTDetailPageManager), null);
        }

        @Override // tb.ctd
        public void onSuccess(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("980108a5", new Object[]{this, jSONObject});
                return;
            }
            TTDetailPageManager tTDetailPageManager = TTDetailPageManager.this;
            TTDetailPageManager.n1(tTDetailPageManager, TTDetailPageManager.m1(tTDetailPageManager), jSONObject);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class d implements xt3.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        public void a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b478c735", new Object[]{this, str, str2});
            } else {
                TTDetailPageManager.i(TTDetailPageManager.this).n(str, str2);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class d0 implements TTDetailScrollerLayoutComponent.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d0() {
        }

        public void a(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("824a8768", new Object[]{this, new Integer(i), new Integer(i2)});
                return;
            }
            if (i == 0 && i2 > 0) {
                am2.c(TTDetailPageManager.c(TTDetailPageManager.this), TTDetailPageManager.K(TTDetailPageManager.this));
            }
            if (i > 0 && i2 == 0) {
                am2.b(TTDetailPageManager.c(TTDetailPageManager.this), TTDetailPageManager.K(TTDetailPageManager.this));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class e implements OpenSkuImplementor.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // com.taobao.android.detail.ttdetail.handler.bizhandlers.OpenSkuImplementor.c
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("81df5dc3", new Object[]{this});
            } else {
                TTDetailPageManager.this.Q0(null, null, true, new RuntimeParam[0]);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class e0 implements MainScreenCore.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e0() {
        }

        @Override // com.taobao.android.detail.ttdetail.container.MainScreenCore.c
        public void e(int i, int i2) {
            boolean z = true;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("10077d90", new Object[]{this, new Integer(i), new Integer(i2)});
                return;
            }
            if (TTDetailPageManager.o1(TTDetailPageManager.this) != null) {
                TTDetailPageManager.o1(TTDetailPageManager.this).e(i, i2);
            }
            if (i + i2 > 0) {
                z = false;
            }
            if (TTDetailPageManager.d(TTDetailPageManager.this) != null) {
                TTDetailPageManager.d(TTDetailPageManager.this).f(z);
            }
            if (TTDetailPageManager.e(TTDetailPageManager.this) != null) {
                TTDetailPageManager.e(TTDetailPageManager.this).j(z);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class f implements o3l.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        public String a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("3ffec482", new Object[]{this});
            }
            return TTDetailPageManager.j(TTDetailPageManager.this);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class f0 implements ctd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f0() {
        }

        @Override // tb.ctd
        public void onFailure(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cccc2dc6", new Object[]{this, str, str2});
            }
        }

        @Override // tb.ctd
        public void onSuccess(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("980108a5", new Object[]{this, jSONObject});
            } else {
                TTDetailPageManager.f(TTDetailPageManager.this, jSONObject);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class g implements hkv.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public g() {
        }

        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d682c560", new Object[]{this, str});
            } else {
                TTDetailPageManager.k(TTDetailPageManager.this).p(str);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class g0 implements DetailUpdateDataReceiver.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public g0() {
        }

        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("859fb64f", new Object[]{this, str});
            } else {
                TTDetailPageManager.g(TTDetailPageManager.this, str);
            }
        }

        public void b(Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("187ed85", new Object[]{this, map});
            } else {
                TTDetailPageManager.this.Q0(map, null, true, new RuntimeParam[0]);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class h implements UpdateItemImplementor.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public h() {
        }

        public void a(Map<String, String> map, yzc yzcVar, RuntimeParam... runtimeParamArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("47cabb70", new Object[]{this, map, yzcVar, runtimeParamArr});
            } else {
                TTDetailPageManager.this.Q0(map, yzcVar, true, runtimeParamArr);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class h0 implements InsideLinearLayout.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final com.taobao.android.detail.ttdetail.floatview.globalbarrage.a f6655a;

        static {
            t2o.a(912261211);
            t2o.a(912262034);
        }

        public h0(com.taobao.android.detail.ttdetail.floatview.globalbarrage.a aVar) {
            this.f6655a = aVar;
        }

        @Override // com.taobao.android.detail.ttdetail.inside.InsideLinearLayout.d
        public void changeInsideDetailState(InsideLinearLayout.InsideDetailState insideDetailState) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("44063edf", new Object[]{this, insideDetailState});
            } else if (InsideLinearLayout.InsideDetailState.FULL_SCREEN.equals(insideDetailState)) {
                com.taobao.android.detail.ttdetail.floatview.globalbarrage.a aVar = this.f6655a;
                if (aVar == null) {
                    tgh.b("TTDetailPageManager", "mBarrageController为空，渲染全局弹幕失败");
                } else {
                    aVar.i();
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class i implements gkv.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public i() {
        }

        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8531b4a3", new Object[]{this, str});
            } else {
                TTDetailPageManager.k(TTDetailPageManager.this).R(str);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class i0 implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public i0() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                wb4.ComponentFatigueContainer.i((Fatigue) TTDetailPageManager.K(TTDetailPageManager.this).e().f(Fatigue.class));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class j implements btz.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public j() {
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4e76e899", new Object[]{this});
            } else {
                TTDetailPageManager.this.Q0(null, null, true, new RuntimeParam[0]);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class j0 implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public j0() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ArrayList<ir> abilityParamList;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Resource resource = (Resource) TTDetailPageManager.K(TTDetailPageManager.this).e().f(Resource.class);
            if (!(resource == null || (abilityParamList = resource.getAbilityParamList()) == null || abilityParamList.isEmpty())) {
                for (ir irVar : abilityParamList) {
                    TTDetailPageManager.K(TTDetailPageManager.this).b().h(irVar, new RuntimeAbilityParam[0]);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class k implements r3q.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class a implements MessageQueue.IdleHandler {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String f6661a;
            public final /* synthetic */ JSONObject b;

            public a(String str, JSONObject jSONObject) {
                this.f6661a = str;
                this.b = jSONObject;
            }

            @Override // android.os.MessageQueue.IdleHandler
            public boolean queueIdle() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("b5e69690", new Object[]{this})).booleanValue();
                }
                if (!pq4.a(TTDetailPageManager.c(TTDetailPageManager.this)) && !tq4.e(TTDetailPageManager.c(TTDetailPageManager.this)) && TTDetailPageManager.K(TTDetailPageManager.this) != null) {
                    o6x.j(TTDetailPageManager.c(TTDetailPageManager.this), this.f6661a, TTDetailPageManager.K(TTDetailPageManager.this).i().b(), this.b);
                }
                return false;
            }
        }

        public k() {
        }

        @Override // tb.r3q.c
        public void a(String str, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("38fb6e39", new Object[]{this, str, jSONObject});
            } else if (!Boolean.TRUE.equals(DevFeature.mFeature.get(DevFeature.sDisableAllPreload)) && !pq4.a(TTDetailPageManager.c(TTDetailPageManager.this)) && !tq4.e(TTDetailPageManager.c(TTDetailPageManager.this)) && TTDetailPageManager.n(TTDetailPageManager.this) != null && TTDetailPageManager.y(TTDetailPageManager.this) == null) {
                TTDetailPageManager.A(TTDetailPageManager.this, new a(str, jSONObject));
                TTDetailPageManager.n(TTDetailPageManager.this).addIdleHandler(TTDetailPageManager.y(TTDetailPageManager.this));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class l implements atz.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public l() {
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("35b57124", new Object[]{this});
            } else {
                TTDetailPageManager.this.Q0(null, null, true, new RuntimeParam[0]);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class m implements w9e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public m() {
        }

        @Override // tb.w9e
        public <T extends View> T findViewById(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (T) ((View) ipChange.ipc$dispatch("6fb8a9ae", new Object[]{this, new Integer(i)}));
            }
            T t = (T) TTDetailPageManager.this.i0().findViewById(i);
            if (t == null) {
                return (T) TTDetailPageManager.h(TTDetailPageManager.this).findViewById(i);
            }
            return t;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class o implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public o() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            TTDetailPageManager.q(TTDetailPageManager.this);
            TTDetailPageManager.r(TTDetailPageManager.this).a();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class p implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ owc f6664a;
        public final /* synthetic */ Map c;
        public final /* synthetic */ RuntimeParam[] d;

        public p(owc owcVar, Map map, RuntimeParam[] runtimeParamArr) {
            this.f6664a = owcVar;
            this.c = map;
            this.d = runtimeParamArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                TTDetailPageManager.D(TTDetailPageManager.this).g(TTDetailPageManager.s(TTDetailPageManager.this), this.f6664a, this.c, this.d);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class r implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public r() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            if (TTDetailPageManager.a(TTDetailPageManager.this) != null && TTDetailPageManager.a(TTDetailPageManager.this).isShowing()) {
                try {
                    TTDetailPageManager.a(TTDetailPageManager.this).dismiss();
                } catch (Throwable th) {
                    tgh.c("TTDetailPageManager", "new dialog and dismiss last loading dialog exception", th);
                }
            }
            if (!tq4.e(TTDetailPageManager.c(TTDetailPageManager.this))) {
                TTDetailPageManager.b(TTDetailPageManager.this, new cqz(TTDetailPageManager.c(TTDetailPageManager.this), R.style.TTDetail_LoadingDialog));
                try {
                    TTDetailPageManager.a(TTDetailPageManager.this).b(R.layout.tt_detail_update_loading, -1, -1, 80, 0, 0, 0);
                } catch (Throwable th2) {
                    tgh.c("TTDetailPageManager", "show loading dialog exception", th2);
                }
                TTDetailPageManager.K(TTDetailPageManager.this).h().h(TTDetailPageManager.z(TTDetailPageManager.this), 3000L);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class t implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TTDataDealException f6665a;

        public t(TTDataDealException tTDataDealException) {
            this.f6665a = tTDataDealException;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            throw this.f6665a;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class u implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ MtopInfo b;
        public final /* synthetic */ MtopResponse c;
        public final /* synthetic */ String d;

        public u(MtopInfo mtopInfo, MtopResponse mtopResponse, String str) {
            this.b = mtopInfo;
            this.c = mtopResponse;
            this.d = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            String a2 = epq.a(this.b.a());
            TTDetailPageManager.E(TTDetailPageManager.this, this.c);
            lf7.k(this.d, "服务端降级degradeToErrorPage", true, TTDetailPageManager.s(TTDetailPageManager.this).d(), a2);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class v implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String b;

        public v(String str) {
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (TTDetailPageManager.k(TTDetailPageManager.this).B()) {
                TTDetailPageManager.k(TTDetailPageManager.this).Q(this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class w implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ MtopInfo b;
        public final /* synthetic */ MtopResponse c;
        public final /* synthetic */ String d;
        public final /* synthetic */ String e;

        public w(MtopInfo mtopInfo, MtopResponse mtopResponse, String str, String str2) {
            this.b = mtopInfo;
            this.c = mtopResponse;
            this.d = str;
            this.e = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (!TTDetailPageManager.F(TTDetailPageManager.this)) {
                String a2 = epq.a(this.b.a());
                TTDetailPageManager.E(TTDetailPageManager.this, this.c);
                lf7.k(this.d, this.e, false, TTDetailPageManager.s(TTDetailPageManager.this).d(), a2);
            } else {
                if (TTDetailPageManager.k(TTDetailPageManager.this).B()) {
                    TTDetailPageManager.k(TTDetailPageManager.this).P(this.e);
                }
                hi8.a(TTDetailPageManager.c(TTDetailPageManager.this), this.c);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class x implements r3q.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class a implements MessageQueue.IdleHandler {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String f6670a;
            public final /* synthetic */ JSONObject b;

            public a(String str, JSONObject jSONObject) {
                this.f6670a = str;
                this.b = jSONObject;
            }

            @Override // android.os.MessageQueue.IdleHandler
            public boolean queueIdle() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("b5e69690", new Object[]{this})).booleanValue();
                }
                if (!pq4.a(TTDetailPageManager.c(TTDetailPageManager.this)) && !tq4.e(TTDetailPageManager.c(TTDetailPageManager.this)) && TTDetailPageManager.K(TTDetailPageManager.this) != null) {
                    o6x.j(TTDetailPageManager.c(TTDetailPageManager.this), this.f6670a, TTDetailPageManager.K(TTDetailPageManager.this).i().b(), this.b);
                }
                return false;
            }
        }

        public x() {
        }

        @Override // tb.r3q.c
        public void a(String str, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("38fb6e39", new Object[]{this, str, jSONObject});
            } else if (!Boolean.TRUE.equals(DevFeature.mFeature.get(DevFeature.sDisableAllPreload)) && !pq4.a(TTDetailPageManager.c(TTDetailPageManager.this)) && !tq4.e(TTDetailPageManager.c(TTDetailPageManager.this)) && TTDetailPageManager.n(TTDetailPageManager.this) != null && TTDetailPageManager.N(TTDetailPageManager.this) == null) {
                TTDetailPageManager.O(TTDetailPageManager.this, new a(str, jSONObject));
                TTDetailPageManager.n(TTDetailPageManager.this).addIdleHandler(TTDetailPageManager.N(TTDetailPageManager.this));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class y implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public y() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (!TTDetailPageManager.K(TTDetailPageManager.this).e().n(TTDetailPageManager.J(TTDetailPageManager.this))) {
                TTDetailPageManager.K(TTDetailPageManager.this).e().i(TTDetailPageManager.J(TTDetailPageManager.this));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class z implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ JSONObject b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;

        public z(JSONObject jSONObject, String str, String str2) {
            this.b = jSONObject;
            this.c = str;
            this.d = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                IpvUtils.j(this.b, TTDetailPageManager.m1(TTDetailPageManager.this).getData());
            } catch (Throwable th) {
                tgh.c("TTDetailPageManager", "IpvUtils.sendDuJuanInfo() exception", th);
            }
            TTDetailPageManager.L(TTDetailPageManager.this);
            final String string = TTDetailPageManager.s(TTDetailPageManager.this).f().getString("spm");
            lf7.b(TTDetailPageManager.c(TTDetailPageManager.this), this.c, this.d, new HashMap<String, Object>(string) { // from class: com.taobao.android.detail.ttdetail.TTDetailPageManager$44$1
                public final /* synthetic */ String val$spm;

                {
                    this.val$spm = string;
                    put("spm", string == null ? "" : string);
                }
            });
            tgh.b("TTDetailPageManager", "redirectUrl: " + this.d);
        }
    }

    static {
        t2o.a(912261149);
    }

    public TTDetailPageManager(Context context, Intent intent) {
        if (context instanceof Activity) {
            this.b = context;
            this.d = intent;
            return;
        }
        throw new IllegalArgumentException("context must be Activity");
    }

    public static /* synthetic */ MessageQueue.IdleHandler A(TTDetailPageManager tTDetailPageManager, MessageQueue.IdleHandler idleHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MessageQueue.IdleHandler) ipChange.ipc$dispatch("28df493", new Object[]{tTDetailPageManager, idleHandler});
        }
        tTDetailPageManager.O = idleHandler;
        return idleHandler;
    }

    public static /* synthetic */ void B(TTDetailPageManager tTDetailPageManager, Map map, MtopInfo mtopInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19049b8d", new Object[]{tTDetailPageManager, map, mtopInfo});
        } else {
            tTDetailPageManager.n0(map, mtopInfo);
        }
    }

    public static /* synthetic */ void C(TTDetailPageManager tTDetailPageManager, String str, MtopInfo mtopInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8363d93", new Object[]{tTDetailPageManager, str, mtopInfo});
        } else {
            tTDetailPageManager.i1(str, mtopInfo);
        }
    }

    public static boolean C0(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("93c80222", new Object[]{context, intent})).booleanValue();
        }
        return snj.b(intent);
    }

    public static /* synthetic */ u4o D(TTDetailPageManager tTDetailPageManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (u4o) ipChange.ipc$dispatch("c79bf95c", new Object[]{tTDetailPageManager});
        }
        return tTDetailPageManager.e;
    }

    public static /* synthetic */ void E(TTDetailPageManager tTDetailPageManager, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcf87be2", new Object[]{tTDetailPageManager, mtopResponse});
        } else {
            tTDetailPageManager.e1(mtopResponse);
        }
    }

    public static /* synthetic */ boolean F(TTDetailPageManager tTDetailPageManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5bb39ba2", new Object[]{tTDetailPageManager})).booleanValue();
        }
        return tTDetailPageManager.r;
    }

    public static /* synthetic */ void G(TTDetailPageManager tTDetailPageManager, Map map, yzc yzcVar, boolean z2, Map map2, RuntimeParam[] runtimeParamArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266141be", new Object[]{tTDetailPageManager, map, yzcVar, new Boolean(z2), map2, runtimeParamArr});
        } else {
            tTDetailPageManager.P0(map, yzcVar, z2, map2, runtimeParamArr);
        }
    }

    public static /* synthetic */ View H(TTDetailPageManager tTDetailPageManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("76bc7462", new Object[]{tTDetailPageManager});
        }
        return tTDetailPageManager.p;
    }

    public static /* synthetic */ View I(TTDetailPageManager tTDetailPageManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("5735ca63", new Object[]{tTDetailPageManager});
        }
        return tTDetailPageManager.n;
    }

    public static /* synthetic */ ctd J(TTDetailPageManager tTDetailPageManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ctd) ipChange.ipc$dispatch("36c82828", new Object[]{tTDetailPageManager});
        }
        return tTDetailPageManager.b0;
    }

    public static /* synthetic */ ze7 K(TTDetailPageManager tTDetailPageManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ze7) ipChange.ipc$dispatch("85cc3b8a", new Object[]{tTDetailPageManager});
        }
        return tTDetailPageManager.f6625a;
    }

    public static /* synthetic */ void L(TTDetailPageManager tTDetailPageManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18470a38", new Object[]{tTDetailPageManager});
        } else {
            tTDetailPageManager.V();
        }
    }

    public static /* synthetic */ void M(TTDetailPageManager tTDetailPageManager, JSONObject jSONObject, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d43f464c", new Object[]{tTDetailPageManager, jSONObject, new Integer(i2)});
        } else {
            tTDetailPageManager.K0(jSONObject, i2);
        }
    }

    public static /* synthetic */ MessageQueue.IdleHandler N(TTDetailPageManager tTDetailPageManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MessageQueue.IdleHandler) ipChange.ipc$dispatch("18536e9b", new Object[]{tTDetailPageManager});
        }
        return tTDetailPageManager.Q;
    }

    public static /* synthetic */ MessageQueue.IdleHandler O(TTDetailPageManager tTDetailPageManager, MessageQueue.IdleHandler idleHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MessageQueue.IdleHandler) ipChange.ipc$dispatch("1b766e51", new Object[]{tTDetailPageManager, idleHandler});
        }
        tTDetailPageManager.Q = idleHandler;
        return idleHandler;
    }

    public static /* synthetic */ void P(TTDetailPageManager tTDetailPageManager, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b884553c", new Object[]{tTDetailPageManager, str});
        } else {
            tTDetailPageManager.S(str);
        }
    }

    public static /* synthetic */ cqz a(TTDetailPageManager tTDetailPageManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cqz) ipChange.ipc$dispatch("b966a9bd", new Object[]{tTDetailPageManager});
        }
        return tTDetailPageManager.g0;
    }

    public static /* synthetic */ cqz b(TTDetailPageManager tTDetailPageManager, cqz cqzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cqz) ipChange.ipc$dispatch("ed870484", new Object[]{tTDetailPageManager, cqzVar});
        }
        tTDetailPageManager.g0 = cqzVar;
        return cqzVar;
    }

    public static /* synthetic */ Context c(TTDetailPageManager tTDetailPageManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("9c6256a5", new Object[]{tTDetailPageManager});
        }
        return tTDetailPageManager.b;
    }

    public static /* synthetic */ TTDFloatController d(TTDetailPageManager tTDetailPageManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TTDFloatController) ipChange.ipc$dispatch("107c1957", new Object[]{tTDetailPageManager});
        }
        return tTDetailPageManager.E;
    }

    public static /* synthetic */ com.taobao.android.detail.ttdetail.floatview.globalbarrage.a e(TTDetailPageManager tTDetailPageManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.detail.ttdetail.floatview.globalbarrage.a) ipChange.ipc$dispatch("2e6814c0", new Object[]{tTDetailPageManager});
        }
        return tTDetailPageManager.F;
    }

    public static /* synthetic */ void f(TTDetailPageManager tTDetailPageManager, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c14b73", new Object[]{tTDetailPageManager, jSONObject});
        } else {
            tTDetailPageManager.I0(jSONObject);
        }
    }

    public static /* synthetic */ String g(TTDetailPageManager tTDetailPageManager, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ac2c2fb6", new Object[]{tTDetailPageManager, str});
        }
        tTDetailPageManager.C = str;
        return str;
    }

    public static /* synthetic */ View h(TTDetailPageManager tTDetailPageManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("77ed9e21", new Object[]{tTDetailPageManager});
        }
        return tTDetailPageManager.m;
    }

    public static /* synthetic */ HorizontalPageController i(TTDetailPageManager tTDetailPageManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HorizontalPageController) ipChange.ipc$dispatch("56ee2e39", new Object[]{tTDetailPageManager});
        }
        return tTDetailPageManager.D;
    }

    public static /* synthetic */ String j(TTDetailPageManager tTDetailPageManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2cda029f", new Object[]{tTDetailPageManager});
        }
        return tTDetailPageManager.c0();
    }

    public static /* synthetic */ TBSkuWrapper k(TTDetailPageManager tTDetailPageManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBSkuWrapper) ipChange.ipc$dispatch("b5a3321c", new Object[]{tTDetailPageManager});
        }
        return tTDetailPageManager.v;
    }

    public static /* synthetic */ String l(TTDetailPageManager tTDetailPageManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e8c0ce5d", new Object[]{tTDetailPageManager});
        }
        return tTDetailPageManager.b0();
    }

    public static String[] l1(Map<String, ? extends Object> map) {
        String str;
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("e2c5a455", new Object[]{map});
        }
        if (map == null || map.size() == 0) {
            return null;
        }
        String[] strArr = new String[map.size()];
        for (String str2 : map.keySet()) {
            Object obj = map.get(str2);
            if (obj == null) {
                str = "";
            } else {
                str = obj.toString();
            }
            strArr[i2] = str2 + "=" + str;
            i2++;
        }
        return strArr;
    }

    public static /* synthetic */ Map m(TTDetailPageManager tTDetailPageManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("fc1d5819", new Object[]{tTDetailPageManager});
        }
        return tTDetailPageManager.U;
    }

    public static /* synthetic */ Intent m1(TTDetailPageManager tTDetailPageManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("45ea2b80", new Object[]{tTDetailPageManager});
        }
        return tTDetailPageManager.d;
    }

    public static /* synthetic */ MessageQueue n(TTDetailPageManager tTDetailPageManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MessageQueue) ipChange.ipc$dispatch("5c6c15aa", new Object[]{tTDetailPageManager});
        }
        return tTDetailPageManager.K;
    }

    public static /* synthetic */ void n1(TTDetailPageManager tTDetailPageManager, Intent intent, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb7eccdf", new Object[]{tTDetailPageManager, intent, jSONObject});
        } else {
            tTDetailPageManager.N0(intent, jSONObject);
        }
    }

    public static /* synthetic */ TTDetailScrollerLayoutComponent o(TTDetailPageManager tTDetailPageManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TTDetailScrollerLayoutComponent) ipChange.ipc$dispatch("32871752", new Object[]{tTDetailPageManager});
        }
        return tTDetailPageManager.y;
    }

    public static /* synthetic */ jos o1(TTDetailPageManager tTDetailPageManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jos) ipChange.ipc$dispatch("f43f0e08", new Object[]{tTDetailPageManager});
        }
        return tTDetailPageManager.J;
    }

    public static /* synthetic */ String p(TTDetailPageManager tTDetailPageManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b7925b45", new Object[]{tTDetailPageManager});
        }
        return tTDetailPageManager.Z;
    }

    public static /* synthetic */ void q(TTDetailPageManager tTDetailPageManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a40afc", new Object[]{tTDetailPageManager});
        } else {
            tTDetailPageManager.J0();
        }
    }

    public static /* synthetic */ fxl r(TTDetailPageManager tTDetailPageManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fxl) ipChange.ipc$dispatch("1b198ea4", new Object[]{tTDetailPageManager});
        }
        return tTDetailPageManager.w;
    }

    public static /* synthetic */ h8n s(TTDetailPageManager tTDetailPageManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h8n) ipChange.ipc$dispatch("d205b897", new Object[]{tTDetailPageManager});
        }
        return tTDetailPageManager.f;
    }

    public static /* synthetic */ boolean t(TTDetailPageManager tTDetailPageManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dd5297c3", new Object[]{tTDetailPageManager})).booleanValue();
        }
        return tTDetailPageManager.q0();
    }

    public static /* synthetic */ String u(TTDetailPageManager tTDetailPageManager, Map map, MtopInfo mtopInfo, Map map2, boolean z2, boolean z3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3b9a2bae", new Object[]{tTDetailPageManager, map, mtopInfo, map2, new Boolean(z2), new Boolean(z3)});
        }
        return tTDetailPageManager.V0(map, mtopInfo, map2, z2, z3);
    }

    public static /* synthetic */ String v(TTDetailPageManager tTDetailPageManager, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("26a00835", new Object[]{tTDetailPageManager, str});
        }
        return tTDetailPageManager.d0(str);
    }

    public static /* synthetic */ boolean w(TTDetailPageManager tTDetailPageManager, JSONObject jSONObject, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b7924c6", new Object[]{tTDetailPageManager, jSONObject, str, str2})).booleanValue();
        }
        return tTDetailPageManager.Y(jSONObject, str, str2);
    }

    public static void w0(final Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("372d092c", new Object[]{application, hashMap});
            return;
        }
        fsw.h(PreloadDetailWVPlugin.PLUGIN_NAME, PreloadDetailWVPlugin.class);
        tgh.b("TTDetailPageManager", "WVPluginManager.registerPlugin");
        if (vbl.r()) {
            pos.a(new Runnable() { // from class: com.taobao.android.detail.ttdetail.TTDetailPageManager.22
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        wb4.ComponentFatigueContainer.g(application.getFilesDir());
                    }
                }
            });
        } else {
            wb4.ComponentFatigueContainer.m(false);
        }
    }

    public static /* synthetic */ Uri x(TTDetailPageManager tTDetailPageManager, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("93939c", new Object[]{tTDetailPageManager, context});
        }
        return tTDetailPageManager.k0(context);
    }

    public static /* synthetic */ MessageQueue.IdleHandler y(TTDetailPageManager tTDetailPageManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MessageQueue.IdleHandler) ipChange.ipc$dispatch("dadeff19", new Object[]{tTDetailPageManager});
        }
        return tTDetailPageManager.O;
    }

    public static /* synthetic */ Runnable z(TTDetailPageManager tTDetailPageManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("9d06669b", new Object[]{tTDetailPageManager});
        }
        return tTDetailPageManager.h0;
    }

    public boolean A0(int i2, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb4cc7a6", new Object[]{this, new Integer(i2), keyEvent})).booleanValue();
        }
        if (this.w.e(i2, keyEvent)) {
            return true;
        }
        return false;
    }

    public boolean B0(int i2, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ed33fa1f", new Object[]{this, new Integer(i2), keyEvent})).booleanValue();
        }
        return false;
    }

    public void D0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        UserBehaviorTracker.h(this.b);
        if (this.t) {
            IpvUtils.g(this.b);
        }
        com.taobao.android.detail.ttdetail.floatview.globalbarrage.a aVar = this.F;
        if (aVar != null) {
            aVar.m();
        }
        am2.d(this.b, this.f6625a);
        TTDInsideController tTDInsideController = this.z;
        if (tTDInsideController != null) {
            tTDInsideController.R();
        }
        this.y.R();
        T(8, new Object[0]);
    }

    public void E0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c630bb7", new Object[]{this});
        } else {
            IpvUtils.m(this.b, this.f);
        }
    }

    public void F0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        UserBehaviorTracker.g(this.b);
        if (this.t) {
            IpvUtils.f(this.b, b0());
            IpvUtils.e(new HashMap<String, String>() { // from class: com.taobao.android.detail.ttdetail.TTDetailPageManager.26
                {
                    put("pre_tt_detail_na_unique_id", TTDetailPageManager.p(TTDetailPageManager.this));
                }
            });
            IpvUtils.h(this.b, this.f.f());
            IpvUtils.i(this.b, this.U);
            IpvUtils.m(this.b, this.f);
            j1();
        }
        com.taobao.android.detail.ttdetail.floatview.globalbarrage.a aVar = this.F;
        if (aVar != null) {
            aVar.l();
        }
        am2.e(this.b, this.f6625a);
        TTDInsideController tTDInsideController = this.z;
        if (tTDInsideController != null) {
            tTDInsideController.S();
        }
        this.y.S();
        T(3, new Object[0]);
    }

    public void G0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        this.D.w();
        TTDInsideController tTDInsideController = this.z;
        if (tTDInsideController != null) {
            tTDInsideController.T();
        }
    }

    public void H0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        this.D.x();
        TTDInsideController tTDInsideController = this.z;
        if (tTDInsideController != null) {
            tTDInsideController.U();
        }
    }

    public final void J0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8538794", new Object[]{this});
            return;
        }
        Map<String, Long> k2 = PerformanceUtils.k(this.f6625a);
        Map<String, Long> j2 = PerformanceUtils.j(this.f6625a);
        tgh.b("Performance", "itemId=" + f0() + ", 从点击到二刷上屏时间: " + (h0(k2, "renderHeaderEnd") - h0(k2, "userClick")));
        StringBuilder sb = new StringBuilder("1. 从点击到进入nav拦截器: ");
        sb.append(h0(k2, TBBuyPreloadScene.NAV) - h0(k2, "userClick"));
        tgh.b("Performance", sb.toString());
        tgh.b("Performance", "2. 从进入nav拦截器到发起主接口请求: " + (h0(k2, "request") - h0(k2, TBBuyPreloadScene.NAV)));
        tgh.b("Performance", "3. 从发起主接口请求到onSuccess回调: " + (h0(k2, "response") - h0(k2, "request")));
        tgh.b("Performance", "4. 从主接口onSuccess回调到数据解析结束: " + (h0(k2, "dispatch") - h0(k2, "response")));
        tgh.b("Performance", "5. 主接口线程切换: " + (h0(k2, "refreshLayout") - h0(k2, "dispatch")));
        tgh.b("Performance", "6. 从主接口refreshLayout开始到二刷头图上屏: " + (h0(k2, "renderHeaderEnd") - h0(k2, "refreshLayout")));
        tgh.b("Performance", "其他子阶段耗时：从进入nav拦截器到系统创建activity: " + (h0(k2, RVStartParams.START_SCENE_START_PAGE) - h0(k2, TBBuyPreloadScene.NAV)) + ", pageManager布局初始化: " + (h0(k2, "containerInitEnd") - h0(k2, "containerInit")) + ", 主接口serverRT: " + h0(j2, "SRT") + ", 二刷数据头图渲染: " + (h0(k2, "renderHeaderEnd") - h0(k2, "renderHeader")));
        tgh.b("Performance", "预加载子阶段耗时：从点击到一刷上屏: " + (h0(k2, "preRenderHeaderEnd") - h0(k2, "userClick")) + ", nav预加载请求mtop耗时: " + (h0(k2, "preResponse") - h0(k2, z1x.PRE_REQUEST)) + ", 预加载数据解析: " + (h0(k2, "preParseEnd") - h0(k2, "preParse")) + ", 预加载线程切换: " + (h0(k2, "preRefreshLayout") - h0(k2, "preDispatch")) + ", 预加载serverRT: " + h0(j2, "preSRT") + ", 预加载数据头图渲染: " + (h0(k2, "preRenderHeaderEnd") - h0(k2, "preRenderHeader")));
        if (this.f != null) {
            tgh.b("Performance", "detailabtestdetail=" + this.f.f().getString("detailabtestdetail"));
        }
    }

    public final void L0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b22c8539", new Object[]{this});
            return;
        }
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.taobao.sku.intent.action.updateData");
            intentFilter.addCategory("android.intent.category.DEFAULT");
            this.g = new DetailUpdateDataReceiver(this.f6625a, this.v, this.f0);
            LocalBroadcastManager.getInstance(this.b).registerReceiver(this.g, intentFilter);
        } catch (Throwable th) {
            tgh.c("TTDetailPageManager", "registerSkuUpdateReceiver error", th);
        }
        try {
            IntentFilter intentFilter2 = new IntentFilter();
            intentFilter2.addAction(Constants$WVActionData.INTENT_ACTION_99_CART_UPDATE);
            intentFilter2.addCategory("android.intent.category.DEFAULT");
            this.i = new TmCartUpdateReceiver(this, null);
            LocalBroadcastManager.getInstance(this.b).registerReceiver(this.i, intentFilter2);
        } catch (Throwable unused) {
        }
        try {
            IntentFilter intentFilter3 = new IntentFilter();
            intentFilter3.addAction(Constants$WVActionData.INTENT_ACTION_CLOSE_99_TM_ACTIVITY);
            intentFilter3.addCategory("android.intent.category.DEFAULT");
            this.j = new TmCloseDetailPageReceiver(this, null);
            LocalBroadcastManager.getInstance(this.b).registerReceiver(this.j, intentFilter3);
        } catch (Throwable unused2) {
        }
        try {
            IntentFilter intentFilter4 = new IntentFilter();
            intentFilter4.addAction(CartBarViewHolder.ACTION_CART_COUNT_CHANGE);
            this.k = new BottomBarCartUpdateReceiver(this, null);
            LocalBroadcastManager.getInstance(this.b).registerReceiver(this.k, intentFilter4);
        } catch (Throwable unused3) {
        }
        try {
            IntentFilter intentFilter5 = new IntentFilter();
            intentFilter5.addAction("com.taobao.sku.intent.action.syncData");
            intentFilter5.addCategory("android.intent.category.DEFAULT");
            this.h = new DetailSKURefreshReceiver(this.f6625a);
            LocalBroadcastManager.getInstance(this.b).registerReceiver(this.h, intentFilter5);
        } catch (Throwable th2) {
            tgh.c("TTDetailPageManager", "registerSkuRefreshReceiver error", th2);
        }
        if (vbl.s()) {
            this.f6625a.g().E(this.S);
        }
    }

    public final void M0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6e7b1ad", new Object[]{this});
            return;
        }
        Map<String, Long> k2 = PerformanceUtils.k(this.f6625a);
        JSONObject jSONObject = new JSONObject();
        if (k2 != null && !k2.isEmpty()) {
            jSONObject.putAll(k2);
        }
        Map<String, Long> j2 = PerformanceUtils.j(this.f6625a);
        if (j2 != null && !j2.isEmpty()) {
            jSONObject.putAll(j2);
        }
        jSONObject.putAll(UtUtils.c(this.f6625a.e()));
        jSONObject.putAll(this.f.f());
        if (!jSONObject.isEmpty()) {
            UtUtils.f(19999, "Page_Detail_Performance", jSONObject);
        }
    }

    public final void O0(String str, String str2, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f44c79", new Object[]{this, str, str2, uri});
            return;
        }
        try {
            UtUtils.f(19999, "Page_Detail_FliggyData", null);
            lf7.n(-100027, str, str2, uri, true);
        } catch (Exception unused) {
        }
    }

    public final void Q(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("740c90eb", new Object[]{this, str});
        } else if (!this.c) {
            throw new IllegalStateException("must invoke setupEvn() before call " + str + " method");
        }
    }

    public void Q0(Map<String, String> map, yzc yzcVar, boolean z2, RuntimeParam... runtimeParamArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("112a514b", new Object[]{this, map, yzcVar, new Boolean(z2), runtimeParamArr});
        } else {
            P0(map, yzcVar, z2, null, runtimeParamArr);
        }
    }

    public final void R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfcfcfe8", new Object[]{this});
        } else {
            this.f6625a.h().g(new j0());
        }
    }

    public final void R0(JSONObject jSONObject, String str, String str2, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f4951b2", new Object[]{this, jSONObject, str, str2, uri});
            return;
        }
        try {
            if (!DataUtils.f0(DynamicMergeUtils.f(jSONObject))) {
                UtUtils.f(19999, "Page_Detail_TcloudData", null);
                lf7.n(-100026, str, str2, uri, false);
            }
        } catch (Exception unused) {
        }
    }

    public final void S(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3234ca07", new Object[]{this, str});
            return;
        }
        oa4 d2 = this.f6625a.h().d("bottomBar");
        if (d2 != null && TextUtils.equals(d2.getRenderName(), str) && !TextUtils.equals(d2.getRenderVersion(), "1")) {
            ComponentViewMeta componentViewMeta = new ComponentViewMeta(new JSONObject(d2) { // from class: com.taobao.android.detail.ttdetail.TTDetailPageManager.50
                public final /* synthetic */ oa4 val$bottomComponent;

                {
                    this.val$bottomComponent = d2;
                    put("type", "dinamicx");
                    put("name", (Object) d2.getRenderName());
                    put("url", (Object) d2.getRenderUrl());
                    put("version", "1");
                }
            });
            String uuid = UUID.randomUUID().toString();
            this.f6625a.d().h(uuid, componentViewMeta);
            d2.updateRenderType(uuid);
            View k2 = this.A.k();
            if (k2 != null) {
                this.o.removeAllViews();
                this.o.addView(k2, new ViewGroup.LayoutParams(-1, -2));
            }
            tgh.b("TTDetailPageManager", "bottomBarDXRenderError: " + uuid);
        }
    }

    public final void S0(JSONObject jSONObject, String str, String str2, Uri uri, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8025fad5", new Object[]{this, jSONObject, str, str2, uri, new Boolean(z2)});
            return;
        }
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("feature");
            if (jSONObject2 != null && !jSONObject2.isEmpty()) {
                if (jSONObject2.getBooleanValue("finalUltron")) {
                    UtUtils.f(19999, "Page_Detail_FinalUltronData", null);
                    lf7.n(-100028, str, str2, uri, z2);
                } else {
                    UtUtils.f(19999, "Page_Detail_Ultron2Data", null);
                    lf7.n(-100029, str, str2, uri, z2);
                }
            }
        } catch (Exception unused) {
        }
    }

    public final boolean T(int i2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a5264905", new Object[]{this, new Integer(i2), objArr})).booleanValue();
        }
        mng mngVar = this.X;
        if (mngVar == null) {
            return false;
        }
        switch (i2) {
            case 1:
                mngVar.e((ze7) objArr[0], (Context) objArr[1], (Intent) objArr[2]);
                break;
            case 2:
                mngVar.a((w9e) objArr[0]);
                break;
            case 3:
                mngVar.h();
                break;
            case 4:
                return mngVar.i((Map) objArr[0], (yzc) objArr[1], ((Boolean) objArr[2]).booleanValue());
            case 5:
                return mngVar.f((Map) objArr[0], (MtopResponse) objArr[1], ((Integer) objArr[2]).intValue());
            case 6:
                mngVar.b(((Boolean) objArr[0]).booleanValue());
                break;
            case 7:
                return mngVar.d((JSONObject) objArr[0]);
            case 8:
                mngVar.g();
                break;
            case 9:
                mngVar.c();
                break;
            default:
                tgh.b("TTDetailPageManager", "callLifecycle with invalid state: " + i2);
                break;
        }
        return false;
    }

    public void T0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbb9d14c", new Object[]{this, str});
        } else {
            this.T = str;
        }
    }

    public final synchronized void U() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10d94b9", new Object[]{this});
        } else if (this.W == null) {
            this.W = Looper.myLooper();
        } else if (Looper.myLooper() != this.W) {
            throw new RuntimeException(new Throwable("setMtopData(MtopResponse, int) was called on thread '" + Thread.currentThread().getName() + "'. setMtopData(MtopResponse, int) be called must on the same thread any time. (Expected Looper " + this.W + " called on " + Looper.myLooper() + f7l.BRACKET_END_STR));
        }
    }

    public final void V() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46ac2324", new Object[]{this});
            return;
        }
        if (!this.t) {
            IpvUtils.h(this.b, this.f.f());
            IpvUtils.i(this.b, this.U);
            IpvUtils.m(this.b, this.f);
            IpvUtils.f(this.b, b0());
            IpvUtils.e(new HashMap<String, String>() { // from class: com.taobao.android.detail.ttdetail.TTDetailPageManager.46
                {
                    put("pre_tt_detail_na_unique_id", TTDetailPageManager.p(TTDetailPageManager.this));
                }
            });
        }
        this.t = true;
    }

    public final void W() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e59f489f", new Object[]{this});
            return;
        }
        Feature feature = (Feature) this.f6625a.e().f(Feature.class);
        if (feature != null && feature.isCustomItem()) {
            Seller seller = (Seller) this.f6625a.e().f(Seller.class);
            String str = "";
            String sellerNick = seller == null ? str : seller.getSellerNick();
            String str2 = (String) this.f6625a.i().c("lastPageSetSkuId");
            StringBuilder sb = new StringBuilder("itemId=");
            sb.append(this.f.c());
            sb.append("&sellerNick=");
            sb.append(sellerNick);
            sb.append("&skuId=");
            if (!TextUtils.isEmpty(str2)) {
                str = str2;
            }
            sb.append(str);
            String sb2 = sb.toString();
            Intent intent = new Intent("com.alibaba.poplayer.PopLayer.action.POP");
            intent.putExtra("event", "poplayer://dingzhishangpin");
            intent.putExtra("param", sb2);
            LocalBroadcastManager.getInstance(this.b).sendBroadcast(intent);
        }
    }

    public final void X() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a40ff7e", new Object[]{this});
        } else if (this.r) {
            String c2 = RuntimeUtils.c(this.A.j());
            if (!TextUtils.isEmpty(c2)) {
                UserBehaviorTracker.j(this.b, c2, 2);
            }
            jos josVar = this.J;
            if (josVar != null) {
                UserBehaviorTracker.j(this.b, RuntimeUtils.c(josVar), 2);
            }
        }
    }

    public final boolean Y(JSONObject jSONObject, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("69fa1f17", new Object[]{this, jSONObject, str, str2})).booleanValue();
        }
        if (q0()) {
            return true;
        }
        this.s = true;
        af7.a(this.f6625a, new z(jSONObject, str2, str));
        return true;
    }

    public void Y0(TTDInsideController.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edcee050", new Object[]{this, eVar});
            return;
        }
        TTDInsideController tTDInsideController = this.z;
        if (tTDInsideController != null) {
            tTDInsideController.b0(eVar);
        }
    }

    public boolean Z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("44908f9e", new Object[]{this})).booleanValue();
        }
        TTDInsideController tTDInsideController = this.z;
        if (tTDInsideController == null || !tTDInsideController.y()) {
            return false;
        }
        return true;
    }

    public void Z0(mng mngVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2880432", new Object[]{this, mngVar});
        } else {
            this.X = mngVar;
        }
    }

    public final void a0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94289666", new Object[]{this});
            return;
        }
        ens ensVar = this.V;
        if (ensVar != null && ensVar.f() && this.D != null) {
            View i02 = i0();
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) i02.findViewById(R.id.ll_tt_detail_bottom_bar).getLayoutParams();
            marginLayoutParams.leftMargin = this.V.d();
            marginLayoutParams.rightMargin = this.V.e();
            marginLayoutParams.bottomMargin = this.V.c();
            ((RelativeLayout.LayoutParams) i02.findViewById(R.id.fl_tt_detail_fragment_container).getLayoutParams()).addRule(2, 0);
            ((RelativeLayout.LayoutParams) i02.findViewById(R.id.vp_hscroll_container).getLayoutParams()).addRule(2, 0);
            i02.requestLayout();
        }
    }

    public void a1(ITBPublicMenu iTBPublicMenu) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20c9a053", new Object[]{this, iTBPublicMenu});
        } else {
            this.I = iTBPublicMenu;
        }
    }

    public final String b0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4c3ab06a", new Object[]{this});
        }
        if (!TextUtils.isEmpty(this.T)) {
            return this.T;
        }
        return "Page_Detail";
    }

    public void b1(ens ensVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6f1fea8", new Object[]{this, ensVar});
            return;
        }
        this.V = ensVar;
        a0();
    }

    public final String c0() {
        Map<String, String> e2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("79ee1b20", new Object[]{this});
        }
        String str = this.C;
        if (str != null) {
            return str;
        }
        h8n h8nVar = this.f;
        if (h8nVar == null || (e2 = h8nVar.e()) == null) {
            return null;
        }
        String str2 = e2.get("addressId");
        this.C = str2;
        return str2;
    }

    public void c1(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1a22443", new Object[]{this, map});
        } else {
            this.U = map;
        }
    }

    public final String d0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e27bf047", new Object[]{this, str});
        }
        return "https://pages-g.m.taobao.com/wow/z/app/detail-next/item/index?x-ssr=true&hybrid=true&id=" + str;
    }

    public ze7 e0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ze7) ipChange.ipc$dispatch("ee649aeb", new Object[]{this});
        }
        return this.f6625a;
    }

    public final void e1(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("607c70dc", new Object[]{this, mtopResponse});
            return;
        }
        View view = this.p;
        if (view != null) {
            view.setVisibility(0);
            return;
        }
        try {
            this.p = ((ViewStub) i0().findViewById(R.id.fl_error_view_container)).inflate();
        } catch (Exception unused) {
            this.p = i0().findViewById(R.id.error_view_container);
        }
        TBErrorView tBErrorView = (TBErrorView) this.p.findViewById(R.id.error_view);
        this.q = tBErrorView;
        tBErrorView.setButton(TBErrorView.ButtonType.BUTTON_LEFT, b5m.H().localizedString(R.string.tt_refresh), new View.OnClickListener() { // from class: com.taobao.android.detail.ttdetail.TTDetailPageManager.40
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view2});
                    return;
                }
                if (vbl.W()) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("x-nw-retry", "true");
                    TTDetailPageManager.G(TTDetailPageManager.this, null, null, true, hashMap, new RuntimeParam[0]);
                } else {
                    TTDetailPageManager.this.Q0(null, null, true, new RuntimeParam[0]);
                }
                TTDetailPageManager.H(TTDetailPageManager.this).setVisibility(8);
                TTDetailPageManager.I(TTDetailPageManager.this).setVisibility(0);
            }
        });
        this.q.setTopic("TTDetail");
        if (vbl.D()) {
            mtopResponse.setRetCode("ANDROID_SYS_NETWORK_ERROR");
        }
        if (mtopResponse != null) {
            this.q.setError(Error.Factory.fromMtopResponse(mtopResponse.getResponseCode(), mtopResponse.getMappingCode(), mtopResponse.getRetCode(), mtopResponse.getRetMsg()));
        }
        View findViewById = this.p.findViewById(R.id.back_button);
        ViewProxy.setOnClickListener(findViewById, new View.OnClickListener() { // from class: com.taobao.android.detail.ttdetail.TTDetailPageManager.41
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view2});
                } else {
                    tq4.a(TTDetailPageManager.c(TTDetailPageManager.this));
                }
            }
        });
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) findViewById.getLayoutParams();
        layoutParams.topMargin = SystemBarDecorator.SystemBarConfig.getStatusBarHeight(mr7.d());
        findViewById.setLayoutParams(layoutParams);
        this.p.setVisibility(0);
    }

    public String f0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("beb1faf5", new Object[]{this});
        }
        ze7 ze7Var = this.f6625a;
        if (ze7Var == null || ze7Var.i() == null) {
            return null;
        }
        return (String) this.f6625a.i().c("requestItemId");
    }

    public final void f1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97044d52", new Object[]{this});
            return;
        }
        try {
            if (this.g != null) {
                LocalBroadcastManager.getInstance(this.b).unregisterReceiver(this.g);
            }
        } catch (Throwable th) {
            tgh.c("TTDetailPageManager", "unregisterSkuUpdateReceiver error", th);
        }
        try {
            if (this.i != null) {
                LocalBroadcastManager.getInstance(this.b).unregisterReceiver(this.i);
            }
        } catch (Throwable unused) {
        }
        try {
            if (this.j != null) {
                LocalBroadcastManager.getInstance(this.b).unregisterReceiver(this.j);
            }
        } catch (Throwable unused2) {
        }
        try {
            if (this.k != null) {
                LocalBroadcastManager.getInstance(this.b).unregisterReceiver(this.k);
            }
        } catch (Throwable unused3) {
        }
        try {
            if (this.h != null) {
                LocalBroadcastManager.getInstance(this.b).unregisterReceiver(this.h);
            }
        } catch (Throwable th2) {
            tgh.c("TTDetailPageManager", "unregisterSkuRefreshReceiver error", th2);
        }
        if (vbl.s()) {
            this.f6625a.g().M(this.S);
        }
    }

    public final String g0() {
        Uri data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f1c10c0a", new Object[]{this});
        }
        Intent intent = this.d;
        if (intent == null || (data = intent.getData()) == null) {
            return null;
        }
        return data.getQueryParameter("miniAppId");
    }

    public final void g1(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70e3f6f", new Object[]{this, intent});
        } else if (intent != null) {
            String stringExtra = this.d.getStringExtra("originalHost");
            if (!TextUtils.isEmpty(stringExtra)) {
                this.u = stringExtra;
            }
            this.d.removeExtra("originalHost");
        }
    }

    public final long h0(Map<String, Long> map, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f350225", new Object[]{this, map, str})).longValue();
        }
        if (map == null || TextUtils.isEmpty(str) || map.get(str) == null) {
            return 0L;
        }
        return map.get(str).longValue();
    }

    public final void h1(final JSONObject jSONObject, final Map<String, String> map, final boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7746624", new Object[]{this, jSONObject, map, new Boolean(z2)});
            return;
        }
        tgh.a("onUpdateDetail TTDetailPageManager.updateSKU keepAlive:" + z2);
        af7.a(this.f6625a, new Runnable() { // from class: com.taobao.android.detail.ttdetail.TTDetailPageManager.38
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                JSONObject jSONObject2;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (TTDetailPageManager.k(TTDetailPageManager.this).B()) {
                    Map map2 = map;
                    if (map2 != null && "true".equals(map2.get("clearSkuStorage"))) {
                        TTDetailPageManager.k(TTDetailPageManager.this).r();
                    }
                    TTDetailPageManager.k(TTDetailPageManager.this).q();
                    txl.h().p("showToUpdate", null);
                    txl.h().q("beforeWeexInitInUpdate", "afterMtop");
                    if (vbl.u0()) {
                        long currentTimeMillis = System.currentTimeMillis();
                        if (Boolean.TRUE.equals(DevFeature.mFeature.get(DevFeature.sDisableCopySkuData))) {
                            jSONObject2 = DynamicMergeUtils.j(jSONObject);
                        } else {
                            jSONObject2 = a58.e(jSONObject);
                        }
                        txl.h().d("transJsonInUpdateSku", "beforeWeexInitInUpdate", currentTimeMillis, System.currentTimeMillis(), null);
                        TTDetailPageManager.k(TTDetailPageManager.this).N(jSONObject2, z2);
                        return;
                    }
                    TTDetailPageManager.k(TTDetailPageManager.this).O(jSONObject.toJSONString(), z2);
                }
            }
        });
    }

    public View i0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("17b33166", new Object[]{this});
        }
        return this.D.i();
    }

    public Map<String, String> j0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("3a58ff0c", new Object[]{this});
        }
        jos josVar = this.J;
        if (josVar != null) {
            return josVar.D();
        }
        return null;
    }

    public final void j1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29d4348c", new Object[]{this});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        String g02 = g0();
        if (!TextUtils.isEmpty(g02)) {
            jSONObject.put("contain_miniapp", (Object) "1");
            jSONObject.put("miniappid", (Object) g02);
            HashMap hashMap = new HashMap();
            hashMap.put("miniapp_id", g02);
            hashMap.put("miniapp_object_type", "item");
            hashMap.put("miniapp_object_id", this.f.c());
            UTAnalytics.getInstance().getDefaultTracker().updatePageUtparam(this.b, JSON.toJSONString(hashMap));
            UTAnalytics.getInstance().getDefaultTracker().updateNextPageUtparam(JSON.toJSONString(hashMap));
        } else {
            jSONObject.put("contain_miniapp", (Object) "0");
        }
        jSONObject.putAll(this.f.f());
        Item item = (Item) this.f6625a.e().f(Item.class);
        if (item != null) {
            String categoryId = item.getCategoryId();
            String rootCategoryId = item.getRootCategoryId();
            if (TextUtils.isEmpty(categoryId)) {
                categoryId = "";
            }
            jSONObject.put("categoryId", (Object) categoryId);
            if (TextUtils.isEmpty(rootCategoryId)) {
                rootCategoryId = "";
            }
            jSONObject.put("rootCategoryId", (Object) rootCategoryId);
        }
        jSONObject.put("new_arch_unique_id", (Object) this.Z);
        IpvUtils.h(this.b, jSONObject);
        IpvUtils.i(this.b, this.U);
    }

    public final Uri k0(Context context) {
        Intent intent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("b074ede2", new Object[]{this, context});
        }
        if ((context instanceof Activity) && (intent = ((Activity) context).getIntent()) != null) {
            return intent.getData();
        }
        return null;
    }

    public final void k1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3be9c083", new Object[]{this});
            return;
        }
        try {
            fsw.h(TTDetailPacketWVPlugin.PLUGIN_NAME, TTDetailPacketWVPlugin.class);
        } catch (Throwable th) {
            tgh.c("TTDetailPageManager", "initDetailPocketPlugin error", th);
        }
    }

    public final String l0(Map<String, String> map, MtopInfo mtopInfo, Map<String, Object> map2) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("602f1ef7", new Object[]{this, map, mtopInfo, map2});
        }
        if (mtopInfo == null) {
            return "mtopInfo is null with ERROR state";
        }
        if (a4o.i(mtopInfo)) {
            this.f6625a.e().s(mtopInfo);
            str = null;
        } else {
            str = "mtopInfo has invalid state: " + mtopInfo.c() + " with call onFailure callback";
        }
        MtopResponse a2 = mtopInfo.a();
        String str2 = "";
        String retCode = a2 != null ? a2.getRetCode() : str2;
        if (a2 != null) {
            str2 = a2.getRetMsg();
        }
        tgh.b("TTDetailPageManager", "onFailure回调， retCode=" + retCode + "retMsg=" + str2);
        af7.a(this.f6625a, new w(mtopInfo, a2, retCode, str2));
        return str;
    }

    public final void n0(Map<String, String> map, MtopInfo mtopInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3016408", new Object[]{this, map, mtopInfo});
            return;
        }
        JSONObject a2 = w7j.a(mtopInfo);
        if (a2 == null || a2.isEmpty()) {
            i1("MtopDataEmpty", mtopInfo);
        } else if (hi8.b(mtopInfo.a())) {
            i1("NetExceptionToErrorPage", mtopInfo);
        } else if (lf7.g(a2)) {
            i1("Degrade2ErrorPage", mtopInfo);
        } else {
            JSONObject j2 = DynamicMergeUtils.j(a2);
            if (j2 == null || j2.isEmpty()) {
                i1("MergeMtopEmpty", mtopInfo);
            } else if (DataUtils.N(j2)) {
                i1("DegradeToOldMtop", mtopInfo);
            } else if (ywk.h(j2)) {
                i1("OneProductMMDegrade", mtopInfo);
            } else if (DataUtils.c0(j2)) {
                i1("SkuDataInvalid", mtopInfo);
            } else {
                boolean k2 = a4o.k(mtopInfo);
                if (a4o.j(mtopInfo)) {
                    h1(a2, map, true);
                    tgh.b("TTDetailPageManager", "handleSuccessStreamCustomApi isRequestStreaming true updateSKU thread=" + Thread.currentThread().getName());
                }
                if (k2) {
                    if (vbl.v0() || Boolean.TRUE.equals(DevFeature.mFeature.get(DevFeature.sDisableCopySkuData))) {
                        W0(a2, mtopInfo);
                    } else {
                        W0(JSON.parseObject(JSON.toJSONString(a2, SerializerFeature.DisableCircularReferenceDetect)), mtopInfo);
                    }
                    this.f6625a.e().s(mtopInfo);
                    h1(a2, map, false);
                    tgh.b("TTDetailPageManager", "handleSuccessStreamCustomApi isRequestSuccess true updateSKU thread=" + Thread.currentThread().getName());
                }
            }
        }
    }

    public final void o0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbdd68c0", new Object[]{this});
            return;
        }
        if (this.f.h()) {
            npw.a();
        }
        TTWXModule.initBridge();
        TBXSkuCore.E();
        k1();
    }

    public final void p0(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2cb7b5c2", new Object[]{this, intent});
            return;
        }
        String c2 = this.f.c();
        if (c2 != null) {
            this.f6625a.i().f("requestItemId", c2);
        }
        String c3 = r3q.c(intent);
        if (!TextUtils.isEmpty(c3)) {
            this.f6625a.i().f("lastPageSetSkuId", c3);
        }
        String b2 = r3q.b(intent);
        if (!TextUtils.isEmpty(b2)) {
            this.f6625a.i().f("detailFrom", b2);
        }
        this.f6625a.i().f("is99tm", Boolean.valueOf(this.f.h()));
        this.f6625a.i().f("startDetailTimeStamp", String.valueOf(System.currentTimeMillis()));
    }

    public final boolean q0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("872135fd", new Object[]{this})).booleanValue();
        }
        if (this.s || tq4.e(this.b)) {
            return true;
        }
        return false;
    }

    public final void s0(JSONObject jSONObject, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66affff", new Object[]{this, jSONObject, new Integer(i2)});
        } else {
            af7.a(this.f6625a, new a0(jSONObject, i2));
        }
    }

    public void u0(int i2, int i3, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i2), new Integer(i3), intent});
        } else {
            this.D.p(i2, i3, intent);
        }
    }

    public void v0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("182299d5", new Object[]{this});
            return;
        }
        IpvUtils.e(new HashMap<String, String>() { // from class: com.taobao.android.detail.ttdetail.TTDetailPageManager.25
            {
                put("pre_tt_detail_na_unique_id", TTDetailPageManager.p(TTDetailPageManager.this));
            }
        });
        IpvUtils.h(this.b, this.f.f());
        IpvUtils.i(this.b, this.U);
        IpvUtils.m(this.b, this.f);
        j1();
    }

    public boolean x0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88afc67", new Object[]{this})).booleanValue();
        }
        if (this.D.q()) {
            return true;
        }
        return false;
    }

    public final void I0(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c716dcb9", new Object[]{this, jSONObject});
        } else if (!tq4.e(this.b) && !this.x) {
            this.x = true;
            int b1 = vbl.b1();
            int e2 = r3q.e(jSONObject);
            if (e2 < b1) {
                r3q.l(this.b, this.f6625a, jSONObject, this.R);
            }
            int c1 = vbl.c1();
            tgh.b("TTDetailPageManager", "preFetchSkuData skuCountLimit:" + b1 + " skuV3CountLimit:" + c1 + " skuCountInV3Data:" + e2);
            if (e2 < c1 && vbl.I0()) {
                r3q.m(this.b, this.f6625a, jSONObject, this.P);
            }
            vt2.a();
        }
    }

    public final void i1(String str, MtopInfo mtopInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9eb1e55", new Object[]{this, str, mtopInfo});
            return;
        }
        tgh.a("onUpdateDetail TTDetailPageManager.updateSKUFail errorMsg:" + str);
        if (mtopInfo != null) {
            mtopInfo.f(3);
        }
        af7.a(this.f6625a, new v(str));
    }

    public final void t0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5447c6c7", new Object[]{this});
            return;
        }
        Item item = (Item) this.f6625a.e().f(Item.class);
        String w2 = DataUtils.w(item, "");
        String x2 = DataUtils.x(item, "");
        ArrayList<String> arrayList = new ArrayList<String>(1, DataUtils.t(item, "")) { // from class: com.taobao.android.detail.ttdetail.TTDetailPageManager.51
            public final /* synthetic */ String val$firstPicUrl;

            {
                this.val$firstPicUrl = r3;
                add(r3);
            }
        };
        Intent intent = new Intent();
        intent.setAction("TBDidEnterDetailNotification");
        intent.putExtra("itemId", w2);
        intent.putExtra("title", x2);
        intent.putStringArrayListExtra("images", arrayList);
        LocalBroadcastManager.getInstance(this.b).sendBroadcast(intent);
    }

    public final void N0(Intent intent, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a31b4e28", new Object[]{this, intent, jSONObject});
            return;
        }
        UtUtils.f(19999, "Page_Detail_Downgrade_Wrapper", null);
        if ((this.b instanceof Activity) && intent != null) {
            Uri data = intent.getData();
            if (data == null) {
                tgh.b("TTDetailPageManager", "uri is null");
            } else if (q0()) {
                tgh.b("TTDetailPageManager", "详情新架构 activity is destroying");
            } else {
                this.s = true;
                HashMap hashMap = new HashMap();
                hashMap.put("itemId", this.f.d());
                ze7 ze7Var = this.f6625a;
                if (!(ze7Var == null || ze7Var.i() == null)) {
                    hashMap.put("traceId", this.f6625a.i().c("traceId"));
                    hashMap.put("sellerId", this.f6625a.i().c("sellerId"));
                }
                bw7.b(hashMap, -100015, "新详情架构降级老详情");
                if (!T(7, jSONObject)) {
                    String valueOf = String.valueOf(UUID.randomUUID().hashCode());
                    if (jSONObject != null) {
                        sDowngradeData.put(valueOf, jSONObject);
                    }
                    lf7.a(this.b, jov.l(data, this.u), valueOf);
                }
            }
        }
    }

    public final boolean W0(final JSONObject jSONObject, MtopInfo mtopInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aaf739fb", new Object[]{this, jSONObject, mtopInfo})).booleanValue();
        }
        try {
            return X0(jSONObject, mtopInfo);
        } catch (Throwable th) {
            if (!DataUtils.Z(jSONObject)) {
                final TTDataDealException tTDataDealException = new TTDataDealException("setMtopRawData() exception: ", th);
                this.s = true;
                this.f6625a.h().g(new Runnable() { // from class: com.taobao.android.detail.ttdetail.TTDetailPageManager.42
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        JSONObject jSONObject2;
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else if (vbl.T0()) {
                            String d2 = TTDetailPageManager.s(TTDetailPageManager.this).d();
                            try {
                                jSONObject2 = DynamicMergeUtils.j(jSONObject);
                            } catch (Throwable th2) {
                                tgh.c("TTDetailPageManager", "setMtopRawData() get mergedData exception", th2);
                                jSONObject2 = null;
                            }
                            String v2 = TTDetailPageManager.v(TTDetailPageManager.this, d2);
                            TTDetailPageManager.w(TTDetailPageManager.this, jSONObject2, v2, d2);
                            tgh.c("TTDetailPageManager", "setMtopRawData() exception to h5", th);
                            String str = (String) TTDetailPageManager.K(TTDetailPageManager.this).i().c("traceId");
                            if (TextUtils.isEmpty(str)) {
                                str = "";
                            }
                            TTDetailPageManager tTDetailPageManager = TTDetailPageManager.this;
                            lf7.h(v2, d2, str, TTDetailPageManager.x(tTDetailPageManager, TTDetailPageManager.c(tTDetailPageManager)), "setMtopRawData() exception", new HashMap<String, String>(1) { // from class: com.taobao.android.detail.ttdetail.TTDetailPageManager.42.1
                                {
                                    put("exception", Log.getStackTraceString(th));
                                }
                            });
                        } else {
                            throw tTDataDealException;
                        }
                    }
                });
            }
            return false;
        }
    }

    public final void d1() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ba6dea7", new Object[]{this});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        this.K = Looper.myQueue();
        this.f = new h8n(this.d);
        StringBuilder sb = new StringBuilder("setupEvn itemId=");
        sb.append(this.f.c());
        sb.append(", uri=");
        Intent intent = this.d;
        if (intent != null) {
            str = intent.getDataString();
        } else {
            str = "";
        }
        sb.append(str);
        tgh.b("TTDetailPageManager", sb.toString());
        UserBehaviorTracker.a(this.b, this.Z);
        UserBehaviorTracker.g(this.b);
        UserBehaviorTracker.i(this.b, "unique_id", this.Z);
        UserBehaviorTracker.i(this.b, "init_item_id", this.f.c());
        mff.a(this.d, this.f.c());
        TTMainScreenContainer tTMainScreenContainer = new TTMainScreenContainer(this.b, this.f.b());
        this.A = tTMainScreenContainer;
        ze7 h2 = tTMainScreenContainer.h();
        this.f6625a = h2;
        h2.e().u("new_arch_unique_id", this.Z);
        PerformanceUtils.f(this.f6625a);
        PreRenderManager.d(this.f6625a);
        ze7.j(this.f.b(), this.f6625a);
        this.m = PreRenderManager.g(this.b).j(this.b, R.layout.tt_detail_page_manager, null, true);
        this.D = new HorizontalPageController(this.b, this.f6625a, new b());
        boolean i2 = nj7.i(this.b);
        if (i2) {
            this.B = new kos(this.f6625a, i0(), this.m);
        }
        boolean c2 = b5m.G().c(this.b);
        ((ImageView) i0().findViewById(R.id.iv_skeleton_holder)).setImageDrawable(u5m.g(i2, c2));
        ((ImageView) i0().findViewById(R.id.iv_bottom_skeleton_holder)).setImageDrawable(u5m.a(i2, c2));
        this.n = i0().findViewById(R.id.fl_mask_container);
        this.o = (BottomBarContainer) i0().findViewById(R.id.ll_tt_detail_bottom_bar);
        this.H = (ViewGroup) i0().findViewById(R.id.actionbar_layout);
        a0();
        long longExtra = this.d.getLongExtra("NAV_START_ACTIVITY_TIME", 0L);
        if (longExtra >= 0) {
            PerformanceUtils.q(this.f6625a, RVStartParams.START_SCENE_START_PAGE, longExtra);
        }
        PerformanceUtils.q(this.f6625a, "containerInit", currentTimeMillis);
        TTDetailScrollerLayoutComponent tTDetailScrollerLayoutComponent = new TTDetailScrollerLayoutComponent(this.m, this.b, this.f6625a, new rql(new JSONObject()), new DataEntry[0]);
        this.y = tTDetailScrollerLayoutComponent;
        tTDetailScrollerLayoutComponent.V(this.c0);
        Context context = this.b;
        TBSkuWrapper tBSkuWrapper = new TBSkuWrapper(context, this.f6625a, this.Z, UserBehaviorTracker.e(context), UserBehaviorTracker.f(this.b));
        this.v = tBSkuWrapper;
        tBSkuWrapper.L(this.V);
        this.v.I(new SkuActionCallback(this.f6625a));
        this.L = new i1i(this.b, this.f6625a);
        new og7(this.b, this.f6625a);
        this.M = new wi2(this.b, this.f6625a);
        Context context2 = this.b;
        this.w = new fxl(context2, this.f6625a, this.m);
        k7z.c(context2.getApplicationContext());
        xbn.b(this.f.b());
        xbn.b("default");
        this.v.V(new c());
        los.a(this.f6625a, this.b, this.v, new d(), new e(), new f(), new g(), new h(), new AnonymousClass17(), new i(), new j(), new l());
        FrameLayout frameLayout = (FrameLayout) this.m.findViewById(R.id.float_view_layout);
        if (vbl.K()) {
            com.taobao.android.detail.ttdetail.floatview.globalbarrage.a aVar = new com.taobao.android.detail.ttdetail.floatview.globalbarrage.a(this.f6625a, frameLayout);
            this.F = aVar;
            aVar.k(BarrageFloatingView.BARRAGE_TYPE.GLOBAL);
        }
        if (Boolean.FALSE.equals(DevFeature.mFeature.get(DevFeature.sDisableGlobalFloatView))) {
            TTDFloatController tTDFloatController = new TTDFloatController(this.b, this.f6625a, frameLayout);
            this.E = tTDFloatController;
            tTDFloatController.j(new View.OnClickListener() { // from class: com.taobao.android.detail.ttdetail.TTDetailPageManager.21
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    TTDetailPageManager.o(TTDetailPageManager.this).k(0);
                    q84.f(TTDetailPageManager.c(TTDetailPageManager.this), new rc7("userTrack", new JSONObject() { // from class: com.taobao.android.detail.ttdetail.TTDetailPageManager.21.1
                        {
                            put("eventId", "2101");
                            put("arg1", "Page_Detail_Button-BackToTop");
                        }
                    }, new RuntimeAbilityParam[0]));
                }
            });
        }
        this.c = true;
    }

    public final String m0(Map<String, String> map, MtopInfo mtopInfo, Map<String, Object> map2) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("52ae3870", new Object[]{this, map, mtopInfo, map2});
        }
        if (mtopInfo == null) {
            return "mtopInfo is null with SUCCESS state";
        }
        JSONObject a2 = w7j.a(mtopInfo);
        if (a2 == null) {
            HashMap hashMap = new HashMap();
            hashMap.put("itemId", this.f.d());
            bw7.b(hashMap, -300016, "pageManager拿到的主接口数据为空");
            return "mtopInfo has no response with " + mtopInfo.c() + " state";
        } else if (!this.l.a(a2)) {
            tgh.b("TTDetailPageManager", "abort preloadData");
            return "must set preload data firstly";
        } else {
            boolean Z = DataUtils.Z(a2);
            if (Z && Boolean.FALSE.equals(DevFeature.mFeature.get(DevFeature.sInvokePreloadRender))) {
                return "user setting not display preload data";
            }
            if (lf7.g(a2)) {
                MtopResponse mtopResponse = new MtopResponse();
                mtopResponse.setRetCode("SYSTEM_ERROR");
                af7.a(this.f6625a, new u(mtopInfo, mtopResponse, "SYSTEM_ERROR"));
                return "server force degradeToErrorPage with " + mtopInfo.c() + " state";
            }
            boolean k2 = a4o.k(mtopInfo);
            boolean j2 = a4o.j(mtopInfo);
            tgh.b("TTDetailPageManager", "handleSuccess, 流式一段：" + j2 + ", 成功：" + k2);
            if (j2 || k2) {
                tgh.b("TTDetailPageManager", "setMtopRawData 刷新主屏，当前线程=" + Thread.currentThread().getName());
                str = null;
                this.f6625a.e().s(null);
                if (!r0(mtopInfo, map2) || !k2 || !Boolean.FALSE.equals(DevFeature.mFeature.get(DevFeature.sInvokeStreamingFinish))) {
                    if (!W0((!Boolean.TRUE.equals(DevFeature.mFeature.get(DevFeature.sDisableCopySkuData)) && !Z && k2) ? JSON.parseObject(JSON.toJSONString(a2, SerializerFeature.DisableCircularReferenceDetect)) : a2, mtopInfo)) {
                        str = "downgrade to redirect Url or DetailWrapperActivity";
                    }
                }
                this.f6625a.e().s(mtopInfo);
            } else {
                str = "mtopInfo has invalid state: " + mtopInfo.c() + " with call onSuccess callback";
            }
            map2.put("useStreamApi", Boolean.valueOf(j2));
            if (k2) {
                h1(a2, map, false);
            }
            return str;
        }
    }

    public final boolean r0(MtopInfo mtopInfo, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("46a5e5a8", new Object[]{this, mtopInfo, map})).booleanValue();
        }
        return Boolean.parseBoolean(String.valueOf(map.get("useStreamApi"))) && epq.d(mtopInfo);
    }

    public void z0() {
        h8n h8nVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        AdvAddCartAnimController advAddCartAnimController = this.a0;
        if (advAddCartAnimController != null) {
            advAddCartAnimController.d();
        }
        this.s = true;
        this.f6625a.e().r(this.b0);
        try {
            X();
        } catch (Throwable th) {
            tgh.c("TTDetailPageManager", "onDestroy() disappearGlobalComponent exception", th);
        }
        this.y.destroy();
        f1();
        PreRenderManager.e(this.b);
        ze7.k(this.f.b());
        com.taobao.android.detail.ttdetail.floatview.globalbarrage.a aVar = this.F;
        if (aVar != null) {
            aVar.h();
        }
        TTDFloatController tTDFloatController = this.E;
        if (tTDFloatController != null) {
            tTDFloatController.e();
        }
        wi2 wi2Var = this.M;
        if (wi2Var != null) {
            wi2Var.b();
        }
        this.v.s();
        this.A.g();
        this.D.t();
        TTDInsideController tTDInsideController = this.z;
        if (tTDInsideController != null) {
            tTDInsideController.P();
        }
        jos josVar = this.J;
        if (josVar != null) {
            josVar.destroy();
        }
        wb4.ComponentFatigueContainer.d(this.b.getFilesDir(), this.f.b());
        UserBehaviorTracker.b(this.b, this.r);
        T(9, new Object[0]);
        try {
            M0();
        } catch (Throwable th2) {
            tgh.c("TTDetailPageManager", "onDestroy() reportPerformanceData exception", th2);
        }
        pos.a(new o());
        MessageQueue messageQueue = this.K;
        if (messageQueue != null) {
            try {
                messageQueue.removeIdleHandler(this.Q);
                this.K.removeIdleHandler(this.O);
            } catch (Throwable th3) {
                tgh.c("TTDetailPageManager", "onDestroy() removeIdleHandler exception", th3);
            }
        }
        a4o.c(this.f6625a.i().b());
        crm.e(this.f6625a);
        this.e.b();
        xbn.c(this.f6625a.i().b());
        xbn.c("default");
        bos bosVar = this.N;
        if (bosVar != null) {
            bosVar.c();
        }
        try {
            if (vbl.n1()) {
                String f02 = f0();
                if (jtm.a().c(f02) != null && (h8nVar = this.f) != null && h8nVar.e() != null && "true".equals(this.f.e().get("singleUseCache"))) {
                    jtm.a().g(f02);
                    tgh.b("TTDetailPageManager", "singleUseCache 退出页面removePreloadCacheData");
                }
            }
        } catch (Exception e2) {
            tgh.c("TTDetailPageManager", "singleUseCache exception", e2);
        }
    }

    public void y0(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc4de452", new Object[]{this, new Boolean(z2)});
            return;
        }
        Q("onCreate(boolean)");
        UtUtils.f(19999, "Page_Detail_EnterNewStructure", null);
        tgh.b("TTDetailPageManager", "enter TTDetailPageManager onCreate()");
        g1(this.d);
        p0(this.d);
        if (z2) {
            TTDInsideController tTDInsideController = new TTDInsideController(this.f6625a);
            this.z = tTDInsideController;
            tTDInsideController.O();
            this.z.d0(this.y);
            if (vbl.P()) {
                this.z.c0(new h0(this.F));
            }
        }
        this.e = new u4o();
        this.y.create();
        L0();
        o0();
        if (this.t) {
            IpvUtils.h(this.b, this.f.f());
            IpvUtils.i(this.b, this.U);
            IpvUtils.m(this.b, this.f);
        }
        b5m.w(this.b, this.f6625a);
        T(1, this.f6625a, this.b, new Intent(this.d).putExtra("originalHost", this.u));
        T(2, new m());
        Intent intent = this.d;
        if (intent != null && !TextUtils.isEmpty(intent.getDataString())) {
            UserBehaviorTracker.n(this.b, "url", URLEncoder.encode(this.d.getDataString()), false);
        }
        Context context = this.b;
        UserBehaviorTracker.n(context, "device_width_px", String.valueOf(context.getResources().getDisplayMetrics().widthPixels), false);
        Context context2 = this.b;
        UserBehaviorTracker.n(context2, "device_height_px", String.valueOf(context2.getResources().getDisplayMetrics().heightPixels), false);
        Q0(null, null, false, new RuntimeParam[0]);
        PerformanceUtils.q(this.f6625a, "containerInitEnd", System.currentTimeMillis());
        bos bosVar = new bos(vbl.F0(), new d1a<Map<String, String>>() { // from class: com.taobao.android.detail.ttdetail.TTDetailPageManager.24
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a */
            public Map<String, String> invoke() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (Map) ipChange2.ipc$dispatch("5d4cb4f4", new Object[]{this});
                }
                HashMap hashMap = new HashMap();
                if (TTDetailPageManager.K(TTDetailPageManager.this) == null) {
                    return hashMap;
                }
                String str = (String) TTDetailPageManager.K(TTDetailPageManager.this).i().c("traceId");
                if (TextUtils.isEmpty(str)) {
                    return hashMap;
                }
                hashMap.put("traceId", str);
                String f02 = TTDetailPageManager.this.f0();
                if (!TextUtils.isEmpty(f02)) {
                    hashMap.put("itemId", f02);
                }
                return hashMap;
            }
        });
        this.N = bosVar;
        bosVar.b();
    }

    public String U0(Map<String, String> map, MtopResponse mtopResponse, int i2) {
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("52bb970c", new Object[]{this, map, mtopResponse, new Integer(i2)});
        }
        if (q0()) {
            return "container is destroying";
        }
        if (i2 == 0) {
            return "INVALID status not allowed";
        }
        if (i2 == 1 || i2 == 2) {
            z2 = true;
        } else if (i2 != 3) {
            return "UNKNOWN status value: " + i2;
        } else {
            z2 = false;
        }
        U();
        try {
            String V0 = V0(map, new MtopInfo().e(mtopResponse).f(i2), this.Y, z2, false);
            if (TextUtils.isEmpty(V0)) {
                return V0;
            }
            tgh.b("TTDetailPageManager", "开放化业务设置数据 setMtopDataInternal errorMsg: " + V0);
            return V0;
        } catch (Throwable th) {
            try {
                if (vbl.T0()) {
                    String d2 = this.f.d();
                    JSONObject j2 = DynamicMergeUtils.j(w7j.b(mtopResponse));
                    String d02 = d0(d2);
                    Y(j2, d02, d2);
                    tgh.c("TTDetailPageManager", "setMtopData() exception to h5", th);
                    String str = (String) this.f6625a.i().c("traceId");
                    if (TextUtils.isEmpty(str)) {
                        str = "";
                    }
                    lf7.h(d02, d2, str, k0(this.b), "setMtopData() exception", new HashMap<String, String>(1, th) { // from class: com.taobao.android.detail.ttdetail.TTDetailPageManager.34
                        public final /* synthetic */ Throwable val$e;

                        {
                            this.val$e = th;
                            put("exception", Log.getStackTraceString(th));
                        }
                    });
                } else {
                    TTDataDealException tTDataDealException = new TTDataDealException("setMtopData() exception: ", th);
                    if (Looper.myLooper() != Looper.getMainLooper()) {
                        this.f6625a.h().g(new t(tTDataDealException));
                    } else {
                        throw tTDataDealException;
                    }
                }
                if (!TextUtils.isEmpty(null)) {
                    tgh.b("TTDetailPageManager", "开放化业务设置数据 setMtopDataInternal errorMsg: null");
                }
                return null;
            } catch (Throwable th2) {
                if (!TextUtils.isEmpty(null)) {
                    tgh.b("TTDetailPageManager", "开放化业务设置数据 setMtopDataInternal errorMsg: null");
                }
                throw th2;
            }
        }
    }

    public final boolean X0(JSONObject jSONObject, MtopInfo mtopInfo) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("15b4f46d", new Object[]{this, jSONObject, mtopInfo})).booleanValue();
        }
        if (DataUtils.Z(jSONObject)) {
            tgh.b("TTDetailPageManager", "preload setMtopRawDataSafety");
            PerformanceUtils.q(this.f6625a, "preDispatch", System.currentTimeMillis());
            s0(jSONObject.getJSONObject("data"), mtopInfo.b());
            return true;
        }
        ze7 ze7Var = this.f6625a;
        String str2 = "";
        String str3 = (ze7Var == null || ze7Var.i() == null) ? str2 : (String) this.f6625a.i().c("traceId");
        PerformanceUtils.q(this.f6625a, "parse", System.currentTimeMillis());
        String d2 = this.f.d();
        JSONObject j2 = DynamicMergeUtils.j(jSONObject);
        ze7 ze7Var2 = this.f6625a;
        if (ze7Var2 == null || ze7Var2.e() == null) {
            str = str2;
        } else {
            String E = DataUtils.E((Seller) lba.a(j2, Seller.class), str2);
            viq i2 = this.f6625a.i();
            if (!TextUtils.isEmpty(E)) {
                str2 = E;
            }
            i2.f("sellerId", str2);
            str = E;
        }
        Uri k0 = k0(this.b);
        R0(j2, d2, str3, k0);
        boolean b2 = ym9.b((Item) lba.a(j2, Item.class));
        if (b2) {
            O0(d2, str3, k0);
        }
        if (!b2) {
            String c2 = lf7.c(this.b, jSONObject, d2);
            if (TextUtils.isEmpty(c2) || !Y(j2, c2, d2)) {
                String B = DataUtils.B(d2, j2);
                if (!TextUtils.isEmpty(B) && Y(j2, B, d2)) {
                    lf7.m(B, false, d2, str3, str);
                    return false;
                }
            } else {
                lf7.j(c2, d2, str3, str);
                return false;
            }
        }
        if (!DetailV3Converter.B(j2) || !vbl.V0(j2)) {
            S0(j2, d2, str3, k0, b2);
            String d02 = d0(d2);
            if (!vbl.m0() || !Y(j2, d02, d2)) {
                af7.a(this.f6625a, new y());
                return false;
            }
            UtUtils.f(19999, "Page_Detail_DefaultRenderH5", null);
            lf7.l(d02, d2, str3, k0, b2, str);
            return false;
        }
        JSONObject g2 = DetailV3Converter.g(j2);
        if (mtopInfo.b() == 1 && Boolean.TRUE.equals(DevFeature.mFeature.get(DevFeature.sClipStreamingData))) {
            g2 = DataUtils.b(g2);
        }
        if (!this.r) {
            this.r = true;
        }
        PerformanceUtils.q(this.f6625a, "parseEnd", System.currentTimeMillis());
        PerformanceUtils.q(this.f6625a, "dispatch", System.currentTimeMillis());
        tgh.b("TTDetailPageManager", "main setMtopRawDataSafety");
        s0(g2, mtopInfo.b());
        mg1.Companion.b(d2, g2);
        return true;
    }

    public final String V0(Map<String, String> map, MtopInfo mtopInfo, Map<String, Object> map2, boolean z2, boolean z3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c375fca6", new Object[]{this, map, mtopInfo, map2, new Boolean(z2), new Boolean(z3)});
        }
        if (mtopInfo == null) {
            map2.clear();
            return "setMtopDataInternal mtopInfo is null";
        }
        ze7 ze7Var = this.f6625a;
        if (!(ze7Var == null || ze7Var.i() == null)) {
            this.f6625a.i().f("traceId", epq.a(mtopInfo.a()));
        }
        if (z3) {
            if (T(5, map != null ? new HashMap(map) : null, mtopInfo.a(), Integer.valueOf(mtopInfo.b()))) {
                return "setMtopDataInternal was intercepted by lifecycle";
            }
        }
        if (z2) {
            String m0 = m0(map, mtopInfo, map2);
            if (!TextUtils.isEmpty(m0) || a4o.k(mtopInfo)) {
                map2.clear();
            }
            return m0;
        }
        String l0 = l0(map, mtopInfo, map2);
        if (!TextUtils.isEmpty(l0) || a4o.i(mtopInfo)) {
            map2.clear();
        }
        return l0;
    }

    public final void K0(final JSONObject jSONObject, int i2) {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aea34eff", new Object[]{this, jSONObject, new Integer(i2)});
        } else if (!q0()) {
            boolean a02 = DataUtils.a0(jSONObject);
            if (a02) {
                str = "preRefreshLayout";
            } else {
                str = "refreshLayout";
            }
            PerformanceUtils.q(this.f6625a, str, System.currentTimeMillis());
            String u2 = DataUtils.u(jSONObject);
            if (!TextUtils.isEmpty(u2) && !TextUtils.equals(u2, this.f.d())) {
                this.f.o(u2);
            }
            this.f.n();
            this.f6625a.i().f("requestItemId", this.f.d());
            this.A.o(jSONObject);
            this.f.p(this.f6625a.e());
            this.n.setVisibility(8);
            View view = this.p;
            if (view != null) {
                view.setVisibility(8);
            }
            long currentTimeMillis = System.currentTimeMillis();
            View k2 = this.A.k();
            if (k2 != null && !ygw.b(this.o, k2)) {
                this.o.removeAllViews();
                this.o.addView(k2, new ViewGroup.LayoutParams(-1, -2));
            }
            if (!a02 && vbl.T0()) {
                this.o.setOnCheckListener(new BottomBarContainer.b() { // from class: com.taobao.android.detail.ttdetail.TTDetailPageManager.47
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.android.detail.ttdetail.widget.BottomBarContainer.b
                    public void a() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("a974d835", new Object[]{this});
                            return;
                        }
                        if (vbl.k()) {
                            oa4 d2 = TTDetailPageManager.K(TTDetailPageManager.this).h().d("bottomBar");
                            TTDetailPageManager.P(TTDetailPageManager.this, d2 != null ? d2.getRenderName() : null);
                        }
                        if (vbl.T0()) {
                            String d3 = TTDetailPageManager.s(TTDetailPageManager.this).d();
                            String v2 = TTDetailPageManager.v(TTDetailPageManager.this, d3);
                            TTDetailPageManager.w(TTDetailPageManager.this, jSONObject, v2, d3);
                            tgh.b("TTDetailPageManager", "bottomBar container is empty to h5");
                            String str3 = (String) TTDetailPageManager.K(TTDetailPageManager.this).i().c("traceId");
                            if (TextUtils.isEmpty(str3)) {
                                str3 = "";
                            }
                            TTDetailPageManager tTDetailPageManager = TTDetailPageManager.this;
                            lf7.h(v2, d3, str3, TTDetailPageManager.x(tTDetailPageManager, TTDetailPageManager.c(tTDetailPageManager)), "bottomBar container is empty", null);
                        }
                    }
                });
                this.o.startEmptyCheck();
            }
            this.M.a(this.f6625a.h().d("bottomBar"));
            if (!a02) {
                String c2 = RuntimeUtils.c(this.A.j());
                if (!TextUtils.isEmpty(c2)) {
                    UserBehaviorTracker.j(this.b, c2, 2);
                    UserBehaviorTracker.j(this.b, c2, 1);
                }
            }
            long currentTimeMillis2 = System.currentTimeMillis();
            if (this.f.h()) {
                npw.b(Constants$WVActionData.WV_ACTION_REQUEST_99_CART_UPDATE, Constants$WVActionData.WV_DATA_REQUEST_99_CART_UPDATE);
            }
            jns jnsVar = (jns) this.f6625a.e().e(kns.PARSER_ID);
            long currentTimeMillis3 = System.currentTimeMillis();
            z4k r2 = (jnsVar == null || jnsVar.s() == null) ? null : jnsVar.s().r();
            jos josVar = (jos) (r2 != null ? r2.f(e0().d()) : null);
            jos josVar2 = this.J;
            if (!(josVar2 == null || josVar2 == josVar)) {
                josVar2.destroy();
            }
            if (josVar != null) {
                if (this.J != josVar) {
                    josVar.N(this.I);
                    this.y.U(josVar);
                    TTDInsideController tTDInsideController = this.z;
                    if (tTDInsideController != null) {
                        tTDInsideController.a0(josVar);
                    }
                }
                josVar.Q(r2.e());
                josVar.x(this.H);
                if (!a02) {
                    String c3 = RuntimeUtils.c(josVar);
                    UserBehaviorTracker.j(this.b, c3, 2);
                    UserBehaviorTracker.j(this.b, c3, 1);
                }
            }
            this.J = josVar;
            long currentTimeMillis4 = System.currentTimeMillis();
            if (jnsVar != null) {
                this.y.H(jnsVar);
            }
            long currentTimeMillis5 = System.currentTimeMillis();
            b1i b1iVar = (b1i) this.f6625a.h().d("mainScreen");
            if (b1iVar != null) {
                b1iVar.F(this.d0);
            }
            this.D.z();
            TTDInsideController tTDInsideController2 = this.z;
            boolean z2 = tTDInsideController2 != null && !InsideLinearLayout.InsideDetailState.FULL_SCREEN.equals(tTDInsideController2.A());
            if (!vbl.P() || !z2) {
                com.taobao.android.detail.ttdetail.floatview.globalbarrage.a aVar = this.F;
                if (aVar == null) {
                    tgh.b("TTDetailPageManager", "mBarrageController为空");
                } else {
                    aVar.i();
                }
            }
            long currentTimeMillis6 = System.currentTimeMillis();
            TTDFloatController tTDFloatController = this.E;
            if (tTDFloatController != null) {
                tTDFloatController.i();
                if (!a02) {
                    this.E.q(this.y);
                }
            }
            long currentTimeMillis7 = System.currentTimeMillis();
            TTDInsideController tTDInsideController3 = this.z;
            if (tTDInsideController3 != null) {
                tTDInsideController3.X();
            }
            kos kosVar = this.B;
            if (kosVar != null) {
                kosVar.a();
            }
            if (!a02) {
                if (this.G == null) {
                    this.G = new il1();
                }
                if (!this.f.i() || !vbl.f() || nj7.h()) {
                    this.G.a(this.f6625a);
                    R();
                }
            }
            this.L.c();
            if (!Boolean.TRUE.equals(DevFeature.mFeature.get(DevFeature.sInvokeStreamingFinish)) ? i2 == 1 : i2 == 2) {
                if (!a02) {
                    this.f6625a.e().i(this.e0);
                    if (this.a0 == null) {
                        this.a0 = AdvAddCartAnimController.Companion.a(this.b, this.f, josVar, this.A.j(), i0(), b1iVar);
                    }
                }
            }
            T(6, Boolean.valueOf(a02));
            DetailClientData detailClientData = (DetailClientData) this.f6625a.e().f(DetailClientData.class);
            if (detailClientData != null) {
                xns.e(detailClientData.getInstanceCount());
            }
            V();
            if (!DataUtils.a0(jSONObject)) {
                IpvUtils.l(this.f6625a.e(), this.d.getData());
            }
            j1();
            IpvUtils.a(DataUtils.k((Params) this.f6625a.e().f(Params.class)), this.b);
            if (this.r) {
                t0();
                W();
                am2.f(this.b, this.f6625a);
            }
            if (!a02) {
                PerformanceUtils.n(this.f6625a, "refreshBB", currentTimeMillis2 - currentTimeMillis);
                PerformanceUtils.n(this.f6625a, "refreshMS", currentTimeMillis5 - currentTimeMillis4);
                PerformanceUtils.n(this.f6625a, "refreshNav", currentTimeMillis4 - currentTimeMillis3);
                PerformanceUtils.n(this.f6625a, "refreshFloat", currentTimeMillis7 - currentTimeMillis6);
                if (wb4.ComponentFatigueContainer.h()) {
                    pos.a(new i0());
                }
                xe7.d(detailClientData);
            }
            if (a02) {
                str2 = "preRefreshLayoutEnd";
            } else {
                str2 = "refreshLayoutEnd";
            }
            PerformanceUtils.q(this.f6625a, str2, System.currentTimeMillis());
            if (!a02) {
                try {
                    Params params = (Params) this.f6625a.e().f(Params.class);
                    if (params != null) {
                        JSONObject xsRedPocketParams = params.getXsRedPocketParams();
                        if (xsRedPocketParams == null) {
                            xsRedPocketParams = new JSONObject();
                        }
                        JSONObject trackParams = params.getTrackParams();
                        if (trackParams != null) {
                            xsRedPocketParams.putAll(trackParams);
                            b5m.A().b("Page_Detail", "ttDetailPacket", null, l1(xsRedPocketParams));
                        }
                    }
                } catch (Exception e2) {
                    tgh.c("TTDetailPageManager", "ucp bx params error", e2);
                }
            }
        }
    }

    public final void P0(Map<String, String> map, final yzc yzcVar, boolean z2, Map<String, String> map2, RuntimeParam... runtimeParamArr) {
        List list;
        boolean z3;
        final Map<String, String> map3 = map;
        RuntimeParam[] runtimeParamArr2 = runtimeParamArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bedc5ad4", new Object[]{this, map3, yzcVar, new Boolean(z2), map2, runtimeParamArr2});
            return;
        }
        if (z2) {
            if (runtimeParamArr2 != null) {
                list = uug.a(runtimeParamArr);
            } else {
                list = new ArrayList();
            }
            if (DataUtils.k0((Feature) this.f6625a.e().f(Feature.class))) {
                list.add(new RuntimeParam("useMtopPost", Boolean.TRUE));
                z3 = true;
            } else {
                z3 = false;
            }
            if (DataUtils.j0((Feature) this.f6625a.e().f(Feature.class)) && !RuntimeUtils.h("useBundleAdjust", runtimeParamArr2)) {
                list.add(new RuntimeParam("useBundleAdjust", Boolean.TRUE));
                z3 = true;
            }
            if (z3) {
                runtimeParamArr2 = (RuntimeParam[]) list.toArray(new RuntimeParam[0]);
            }
        }
        if (z2 && this.x && vbl.o()) {
            o6x.b(this.f6625a.i().b());
            this.f6625a.i().f("skuClearPreloadWeexOnUpdate", "true");
        }
        HashMap hashMap = null;
        if (this.f6625a.e().h() != 2) {
            this.f6625a.e().s(null);
        }
        if (map3 != null) {
            String str = map3.get("detail_item_id");
            String str2 = map3.get("targetItemId");
            if (!TextUtils.isEmpty(str)) {
                this.f.o(str);
            } else if (!TextUtils.isEmpty(str2) && !TextUtils.equals(this.f.c(), str2)) {
                this.f.o(str2);
            }
        }
        if (this.r) {
            UserBehaviorTracker.l(this.b, RuntimeUtils.c(RuntimeUtils.e(runtimeParamArr2)), UpdateItemImplementor.EVENT_TYPE, new HashMap<String, String>() { // from class: com.taobao.android.detail.ttdetail.TTDetailPageManager.28
                {
                    put("update_item_id", TTDetailPageManager.s(TTDetailPageManager.this).d());
                }
            });
        }
        owc owcVar = new owc() { // from class: com.taobao.android.detail.ttdetail.TTDetailPageManager.29
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final Map<String, Object> f6630a = new HashMap(0);

            /* compiled from: Taobao */
            /* renamed from: com.taobao.android.detail.ttdetail.TTDetailPageManager$29$a */
            /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
            public class a implements Runnable {
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ TTDataDealException f6631a;

                public a(TTDataDealException tTDataDealException) {
                    this.f6631a = tTDataDealException;
                }

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    throw this.f6631a;
                }
            }

            /* compiled from: Taobao */
            /* renamed from: com.taobao.android.detail.ttdetail.TTDetailPageManager$29$b */
            /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
            public class b implements Runnable {
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public b() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (TTDetailPageManager.a(TTDetailPageManager.this) != null && TTDetailPageManager.a(TTDetailPageManager.this).isShowing()) {
                        TTDetailPageManager.K(TTDetailPageManager.this).h().i(TTDetailPageManager.z(TTDetailPageManager.this));
                        try {
                            TTDetailPageManager.a(TTDetailPageManager.this).dismiss();
                        } catch (Throwable th) {
                            tgh.c("TTDetailPageManager", "mtop finish and dismiss loading dialog exception", th);
                        }
                    }
                }
            }

            @Override // tb.owc
            public void a(MtopInfo mtopInfo, int i2, BaseOutDo baseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d223f4a0", new Object[]{this, mtopInfo, new Integer(i2), baseOutDo, obj});
                    return;
                }
                c(obj);
                e(mtopInfo, true);
            }

            public final void c(Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("41c4d45d", new Object[]{this, obj});
                } else if (!d(obj)) {
                    af7.a(TTDetailPageManager.K(TTDetailPageManager.this), new b());
                }
            }

            public final boolean d(Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("429e45fe", new Object[]{this, obj})).booleanValue();
                }
                if (!(obj instanceof Integer) || ((Integer) obj).intValue() != R.id.tt_detail_is_page_key_cache_id) {
                    return false;
                }
                return true;
            }

            @Override // tb.owc
            public void b(MtopInfo mtopInfo, int i2, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8e6c9079", new Object[]{this, mtopInfo, new Integer(i2), obj});
                    return;
                }
                c(obj);
                if (!y0i.API_NAME_BUNDLE_ADJUST.equalsIgnoreCase(w7j.f(mtopInfo)) || "SUCCESS".equalsIgnoreCase(w7j.g(mtopInfo))) {
                    e(mtopInfo, false);
                    return;
                }
                String h2 = w7j.h(mtopInfo);
                if (TextUtils.isEmpty(h2)) {
                    h2 = "小二很忙，系统很累，请稍后重试！";
                }
                Toast.makeText(TTDetailPageManager.c(TTDetailPageManager.this).getApplicationContext(), h2, 0).show();
            }

            public final boolean e(MtopInfo mtopInfo, boolean z4) {
                MtopInfo a2;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("29307f99", new Object[]{this, mtopInfo, new Boolean(z4)})).booleanValue();
                }
                if (TTDetailPageManager.t(TTDetailPageManager.this)) {
                    return false;
                }
                if (Boolean.TRUE.equals(DevFeature.mFeature.get(DevFeature.sMockTBLiveTinyShop)) && (a2 = MockUtils.a(TTDetailPageManager.c(TTDetailPageManager.this))) != null) {
                    mtopInfo = a2;
                    z4 = true;
                }
                try {
                    String u2 = TTDetailPageManager.u(TTDetailPageManager.this, map3, mtopInfo, this.f6630a, z4, true);
                    if (!TextUtils.isEmpty(u2)) {
                        tgh.b("TTDetailPageManager", "onFinish setMtopDataInternal errorMsg: " + u2);
                        yzc yzcVar2 = yzcVar;
                        if (yzcVar2 != null) {
                            if (z4) {
                                yzcVar2.onSuccess();
                            } else {
                                yzcVar2.a();
                            }
                        }
                        return false;
                    }
                    yzc yzcVar3 = yzcVar;
                    if (yzcVar3 != null) {
                        if (z4) {
                            yzcVar3.onSuccess();
                        } else {
                            yzcVar3.a();
                        }
                    }
                    return true;
                } catch (Throwable th) {
                    try {
                        if (vbl.T0()) {
                            String d2 = TTDetailPageManager.s(TTDetailPageManager.this).d();
                            JSONObject j2 = DynamicMergeUtils.j(w7j.a(mtopInfo));
                            String v2 = TTDetailPageManager.v(TTDetailPageManager.this, d2);
                            TTDetailPageManager.w(TTDetailPageManager.this, j2, v2, d2);
                            tgh.c("TTDetailPageManager", "mtop callback onFinish() exception to h5", th);
                            String str3 = (String) TTDetailPageManager.K(TTDetailPageManager.this).i().c("traceId");
                            if (TextUtils.isEmpty(str3)) {
                                str3 = "";
                            }
                            TTDetailPageManager tTDetailPageManager = TTDetailPageManager.this;
                            lf7.h(v2, d2, str3, TTDetailPageManager.x(tTDetailPageManager, TTDetailPageManager.c(tTDetailPageManager)), "mtop callback onFinish() exception", new HashMap<String, String>(1, th) { // from class: com.taobao.android.detail.ttdetail.TTDetailPageManager.29.1
                                public final /* synthetic */ Throwable val$e;

                                {
                                    this.val$e = th;
                                    put("exception", Log.getStackTraceString(th));
                                }
                            });
                        } else {
                            TTDetailPageManager.K(TTDetailPageManager.this).h().g(new a(new TTDataDealException("mtop callback onFinish() exception: ", th)));
                        }
                        yzc yzcVar4 = yzcVar;
                        if (yzcVar4 != null) {
                            if (z4) {
                                yzcVar4.onSuccess();
                            } else {
                                yzcVar4.a();
                            }
                        }
                        return false;
                    } catch (Throwable th2) {
                        yzc yzcVar5 = yzcVar;
                        if (yzcVar5 != null) {
                            if (z4) {
                                yzcVar5.onSuccess();
                            } else {
                                yzcVar5.a();
                            }
                        }
                        throw th2;
                    }
                }
            }
        };
        owc owcVar2 = new owc() { // from class: com.taobao.android.detail.ttdetail.TTDetailPageManager.30
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public MtopInfo f6633a;

            @Override // tb.owc
            public void a(MtopInfo mtopInfo, int i2, BaseOutDo baseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d223f4a0", new Object[]{this, mtopInfo, new Integer(i2), baseOutDo, obj});
                } else {
                    c(mtopInfo, true);
                }
            }

            @Override // tb.owc
            public void b(MtopInfo mtopInfo, int i2, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8e6c9079", new Object[]{this, mtopInfo, new Integer(i2), obj});
                } else {
                    c(mtopInfo, false);
                }
            }

            public final void c(MtopInfo mtopInfo, boolean z4) {
                String str3;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("29307f95", new Object[]{this, mtopInfo, new Boolean(z4)});
                } else if (!TTDetailPageManager.t(TTDetailPageManager.this)) {
                    MtopInfo mtopInfo2 = this.f6633a;
                    if (mtopInfo2 == null || mtopInfo2.b() != 3) {
                        if (z4) {
                            TTDetailPageManager.B(TTDetailPageManager.this, map3, mtopInfo);
                        } else {
                            MtopResponse a2 = mtopInfo.a();
                            if (a2 == null) {
                                str3 = "ResponseEmpty";
                            } else {
                                str3 = a2.getRetMsg();
                            }
                            TTDetailPageManager.C(TTDetailPageManager.this, str3, mtopInfo);
                        }
                        this.f6633a = mtopInfo;
                        return;
                    }
                    tgh.b("TTDetailPageManager", "handleSuccessStreamCustomApi first stream mtopInfo status ERROR");
                }
            }
        };
        if (map3 != null) {
            hashMap = new HashMap(map3);
        }
        boolean z4 = !z2;
        if (T(4, hashMap, yzcVar, Boolean.valueOf(z4))) {
            return;
        }
        if (epq.b(map)) {
            u5o.a(new p(owcVar2, map3, runtimeParamArr2));
            return;
        }
        Resource resource = (Resource) this.f6625a.e().f(Resource.class);
        Map<String, String> map4 = map3;
        if (resource != null) {
            JSONObject resident = resource.getResident();
            HashMap hashMap2 = map3;
            map4 = map3;
            if (resident != null) {
                if (map3 == null) {
                    hashMap2 = new HashMap();
                }
                String str3 = hashMap2.get("params");
                if (!TextUtils.isEmpty(str3)) {
                    try {
                        JSONObject parseObject = JSON.parseObject(str3);
                        JSONObject jSONObject = parseObject.getJSONObject("resident");
                        if (jSONObject != null) {
                            resident = JSON.parseObject(resident.toJSONString());
                            resident.putAll(jSONObject);
                        }
                        parseObject.put("resident", (Object) resident);
                        hashMap2.put("params", parseObject.toString());
                    } catch (Throwable th) {
                        tgh.c("TTDetailPageManager", "parse exParams.params error", th);
                    }
                } else {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("resident", (Object) resident);
                    hashMap2.put("params", jSONObject2.toString());
                }
                map4 = hashMap2;
            }
        }
        HashMap hashMap3 = map4;
        if (vbl.l()) {
            Map<? extends String, ? extends String> map5 = (Map) this.f6625a.i().c("addressBundle");
            hashMap3 = map4;
            if (map4 != null) {
                String str4 = map4.get("addressId");
                String str5 = map4.get(q2q.KEY_AREA_ID);
                if (TextUtils.isEmpty(str4)) {
                    hashMap3 = map4;
                    if (TextUtils.isEmpty(str5)) {
                        if (map5 != null) {
                            hashMap3 = map4;
                            if (!map5.isEmpty()) {
                                map4.putAll(map5);
                                hashMap3 = map4;
                            }
                        }
                    }
                }
                this.f6625a.i().f("addressBundle", new HashMap<String, String>(str4, str5) { // from class: com.taobao.android.detail.ttdetail.TTDetailPageManager.32
                    public final /* synthetic */ String val$addressId;
                    public final /* synthetic */ String val$areaId;

                    {
                        this.val$addressId = str4;
                        this.val$areaId = str5;
                        if (!TextUtils.isEmpty(str4)) {
                            put("addressId", str4);
                        }
                        if (!TextUtils.isEmpty(str5)) {
                            put(q2q.KEY_AREA_ID, str5);
                        }
                    }
                });
                hashMap3 = map4;
            } else if (map5 != null) {
                hashMap3 = map4;
                if (!map5.isEmpty()) {
                    HashMap hashMap4 = new HashMap();
                    hashMap4.putAll(map5);
                    hashMap3 = hashMap4;
                }
            }
        }
        if (z2 && !RuntimeUtils.i(runtimeParamArr2) && DataUtils.i0((Feature) this.f6625a.e().f(Feature.class))) {
            af7.a(this.f6625a, new r());
        }
        this.e.h(this.f, owcVar, hashMap3, z4, map2, runtimeParamArr2);
    }
}
