package com.alibaba.triver.triver_shop.newShop;

import android.app.ActionBar;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import com.alibaba.ariver.kernel.RVConstants;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.adapter.ShopNavAdapter;
import com.alibaba.triver.triver_shop.extension.ShopCommonActivityLifeCycle;
import com.alibaba.triver.triver_shop.newShop.data.NativeShopRenderContainerType;
import com.alibaba.triver.triver_shop.newShop.data.ShopDataParser;
import com.alibaba.triver.triver_shop.newShop.data.ShopStartActivityData;
import com.alibaba.triver.triver_shop.newShop.event.broadcast.ShopBroadcastController;
import com.alibaba.triver.triver_shop.newShop.ext.ShopDXEngine;
import com.alibaba.triver.triver_shop.newShop.ext.ShopExtKt;
import com.alibaba.triver.triver_shop.newShop.view.AllItemsContentRender;
import com.alibaba.triver.triver_shop.newShop.view.ShopView;
import com.alibaba.triver.triver_shop.newShop.view.component.BaseContentComponent;
import com.alibaba.triver.triver_shop.newShop.view.component.DefaultShopV2;
import com.alibaba.triver.triver_shop.newShop.view.extend.ShopWrapWebView;
import com.alibaba.triver.triver_shop.preload.ShopIndexWebViewPreload;
import com.alibaba.triver.triver_shop.shop2023.XSDStoreWeexModeComponent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.taobao.android.autosize.TBAutoSizeConfig;
import com.taobao.android.nav.Nav;
import com.taobao.android.shop.activity.ShopRenderActivity;
import com.taobao.tao.shop.common.ShopConstants;
import com.ut.mini.UTAnalytics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Result;
import kotlin.jvm.internal.Ref$BooleanRef;
import tb.a07;
import tb.a1v;
import tb.acq;
import tb.aqp;
import tb.bop;
import tb.ckf;
import tb.cqp;
import tb.d7r;
import tb.eop;
import tb.eqp;
import tb.fee;
import tb.g1a;
import tb.hee;
import tb.i04;
import tb.iop;
import tb.jpu;
import tb.kew;
import tb.khu;
import tb.ltt;
import tb.mop;
import tb.npp;
import tb.od7;
import tb.r54;
import tb.rop;
import tb.spp;
import tb.t2o;
import tb.tsd;
import tb.ups;
import tb.wsq;
import tb.xhv;
import tb.yfb;
import tb.yz3;
import tb.z9u;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ShopActivity extends FragmentActivity implements ShopBroadcastController.b, iop, hee, fee, yfb, tsd {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String RESTORE_KEY = "shopAcRestoreKey";

    /* renamed from: a  reason: collision with root package name */
    public ShopDXEngine f3072a;
    public ShopDataParser b;
    public bop c;
    public FrameLayout d;
    public boolean e;
    public BaseContentComponent g;
    public boolean h;
    public Intent i;
    public long l;
    public Boolean m;
    public eqp n;
    public boolean o;
    public static final a Companion = new a(null);
    public static final List<String> p = yz3.l("android:fragments", "android:support:fragments", "androidx:fragments");
    public boolean f = true;
    public final Set<tsd> j = new LinkedHashSet();
    public final List<fee> k = new ArrayList();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a {
        static {
            t2o.a(766509426);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class b implements cqp.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.cqp.a
        public void a(Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8d350231", new Object[]{this, intent});
            } else {
                ckf.g(intent, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
            }
        }

        @Override // tb.cqp.a
        public void b(Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("440b0040", new Object[]{this, intent});
            } else {
                ckf.g(intent, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
            }
        }

        @Override // tb.cqp.a
        public Intent getData() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Intent) ipChange.ipc$dispatch("78f0a48c", new Object[]{this});
            }
            return ShopActivity.n3(ShopActivity.this);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Pair<Integer, Integer> b;
        public final /* synthetic */ String c;

        public c(Pair<Integer, Integer> pair, String str) {
            this.b = pair;
            this.c = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            BaseContentComponent m3 = ShopActivity.m3(ShopActivity.this);
            if (m3 != null) {
                m3.O0(this.b.getFirst().intValue(), this.b.getSecond().intValue(), this.c);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String b;
        public final /* synthetic */ JSONObject c;

        public d(String str, JSONObject jSONObject) {
            this.b = str;
            this.c = jSONObject;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            BaseContentComponent m3 = ShopActivity.m3(ShopActivity.this);
            if (m3 != null) {
                m3.f0(this.b, this.c);
            }
        }
    }

    static {
        t2o.a(766509425);
        t2o.a(766509480);
        t2o.a(766509448);
        t2o.a(779093548);
        t2o.a(336592973);
        t2o.a(779093547);
        t2o.a(336592972);
    }

    public static /* synthetic */ Object ipc$super(ShopActivity shopActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2147180915:
                super.onSaveInstanceState((Bundle) objArr[0]);
                return null;
            case -1954109976:
                return new Boolean(super.isInMultiWindowMode());
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -962742886:
                super.onTrimMemory(((Number) objArr[0]).intValue());
                return null;
            case -842839078:
                return super.getIntent();
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case -349229044:
                super.onConfigurationChanged((Configuration) objArr[0]);
                return null;
            case 143326307:
                super.onBackPressed();
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 1270686685:
                super.onLowMemory();
                return null;
            case 1918621354:
                super.onMultiWindowModeChanged(((Boolean) objArr[0]).booleanValue(), (Configuration) objArr[1]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/ShopActivity");
        }
    }

    public static final /* synthetic */ void l3(ShopActivity shopActivity, Intent intent, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53feb764", new Object[]{shopActivity, intent, new Long(j)});
        } else {
            shopActivity.v3(intent, j);
        }
    }

    public static final /* synthetic */ BaseContentComponent m3(ShopActivity shopActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseContentComponent) ipChange.ipc$dispatch("19455347", new Object[]{shopActivity});
        }
        return shopActivity.g;
    }

    public static final /* synthetic */ Intent n3(ShopActivity shopActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("1569669c", new Object[]{shopActivity});
        }
        return shopActivity.i;
    }

    public static final /* synthetic */ bop o3(ShopActivity shopActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bop) ipChange.ipc$dispatch("21700ecb", new Object[]{shopActivity});
        }
        return shopActivity.c;
    }

    public static final /* synthetic */ ShopDataParser p3(ShopActivity shopActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShopDataParser) ipChange.ipc$dispatch("e6d3254f", new Object[]{shopActivity});
        }
        return shopActivity.b;
    }

    public static final /* synthetic */ boolean q3(ShopActivity shopActivity, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("73dfcc00", new Object[]{shopActivity, intent})).booleanValue();
        }
        return shopActivity.z3(intent);
    }

    public static final /* synthetic */ void r3(ShopActivity shopActivity, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1de4042d", new Object[]{shopActivity, new Integer(i), new Boolean(z)});
        } else {
            shopActivity.A3(i, z);
        }
    }

    public static final /* synthetic */ void s3(ShopActivity shopActivity, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fda3bb6e", new Object[]{shopActivity, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else {
            shopActivity.B3(i, i2, i3, i4);
        }
    }

    public static final /* synthetic */ void t3(ShopActivity shopActivity, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab43d835", new Object[]{shopActivity, str, new Integer(i)});
        } else {
            shopActivity.C3(str, i);
        }
    }

    public static final /* synthetic */ void u3(ShopActivity shopActivity, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2eb9960", new Object[]{shopActivity, intent});
        } else {
            shopActivity.i = intent;
        }
    }

    public final void A3(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e9fd9b0", new Object[]{this, new Integer(i), new Boolean(z)});
        } else if (!z) {
            bop bopVar = this.c;
            if (bopVar != null) {
                bopVar.i(i);
            } else {
                ckf.y("shopBroadCastDelegate");
                throw null;
            }
        } else {
            bop bopVar2 = this.c;
            if (bopVar2 != null) {
                bopVar2.j(i);
            } else {
                ckf.y("shopBroadCastDelegate");
                throw null;
            }
        }
    }

    public final void B3(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8a8dd8d", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        bop bopVar = this.c;
        if (bopVar != null) {
            bopVar.a(i3, i4);
            r54.F(new ShopActivity$onPageChanged$1(this, i, i2));
            return;
        }
        ckf.y("shopBroadCastDelegate");
        throw null;
    }

    public final void C3(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac46b822", new Object[]{this, str, new Integer(i)});
            return;
        }
        npp.a aVar = npp.Companion;
        aVar.b("parseData error : " + ((Object) str) + " , code : " + i);
    }

    public final void D3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dffd538", new Object[]{this});
            return;
        }
        F3();
        E3();
    }

    @Override // com.alibaba.triver.triver_shop.newShop.event.broadcast.ShopBroadcastController.b
    public void E0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48d9b014", new Object[]{this});
        }
    }

    public final void E3() {
        Object obj;
        ShopDataParser shopDataParser;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aed8eed9", new Object[]{this});
        } else if (aqp.Companion.m()) {
            ShopDataParser shopDataParser2 = this.b;
            if (shopDataParser2 == null) {
                ckf.y("shopDataParser");
                throw null;
            } else if (!ckf.b(shopDataParser2.u0(), eop.XSD_SHOP)) {
                try {
                    shopDataParser = this.b;
                } catch (Throwable th) {
                    obj = Result.m1108constructorimpl(kotlin.b.a(th));
                }
                if (shopDataParser != null) {
                    int d0 = shopDataParser.d0();
                    ShopDataParser shopDataParser3 = this.b;
                    if (shopDataParser3 != null) {
                        ups t1 = shopDataParser.t1(d0, shopDataParser3.f0());
                        if (t1 != null) {
                            if (t1.v()) {
                                t1.F(this.n);
                                AllItemsContentRender allItemsContentRender = new AllItemsContentRender(this, t1);
                                allItemsContentRender.j();
                                ShopDataParser shopDataParser4 = this.b;
                                if (shopDataParser4 != null) {
                                    shopDataParser4.I0().b(allItemsContentRender);
                                } else {
                                    ckf.y("shopDataParser");
                                    throw null;
                                }
                            } else {
                                return;
                            }
                        }
                        obj = Result.m1108constructorimpl(xhv.INSTANCE);
                        Throwable th2 = Result.m1111exceptionOrNullimpl(obj);
                        if (th2 != null) {
                            npp.Companion.c("catching block has error", th2);
                            return;
                        }
                        return;
                    }
                    ckf.y("shopDataParser");
                    throw null;
                }
                ckf.y("shopDataParser");
                throw null;
            }
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.event.broadcast.ShopBroadcastController.b
    public void F0(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("440ac4c8", new Object[]{this, jSONObject});
            return;
        }
        ShopDataParser shopDataParser = this.b;
        if (shopDataParser == null) {
            return;
        }
        if (shopDataParser != null) {
            shopDataParser.k1().c(jSONObject);
        } else {
            ckf.y("shopDataParser");
            throw null;
        }
    }

    public final void F3() {
        Object obj;
        ShopWrapWebView c2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9f0dc3e", new Object[]{this});
            return;
        }
        try {
            if (!aqp.Companion.S()) {
                npp.Companion.b("tryTopPreloadWebShopIndex disable by orange");
            } else {
                ShopDataParser shopDataParser = this.b;
                if (shopDataParser == null) {
                    ckf.y("shopDataParser");
                    throw null;
                } else if (shopDataParser != null) {
                    int d0 = shopDataParser.d0();
                    ShopDataParser shopDataParser2 = this.b;
                    if (shopDataParser2 != null) {
                        ups t1 = shopDataParser.t1(d0, shopDataParser2.f0());
                        if (t1 != null && t1.B()) {
                            t1.F(this.n);
                            if (t1.f() == NativeShopRenderContainerType.TYPE_H5 && (c2 = ShopIndexWebViewPreload.INSTANCE.c()) != null) {
                                c2.printPreloadStatus();
                                if (!c2.getAlreadyPreloadPageFinished() || c2.getAlreadyInjectOnNShopPreloadResume()) {
                                    npp.Companion.b("try to preload shopIndex web early , but not finished");
                                } else {
                                    ShopDataParser shopDataParser3 = this.b;
                                    if (shopDataParser3 != null) {
                                        c2.setShopId(shopDataParser3.W0());
                                        ShopDataParser shopDataParser4 = this.b;
                                        if (shopDataParser4 != null) {
                                            c2.setShopData(shopDataParser4);
                                            c2.setOuterCtx(this);
                                            c2.setCurrentPageName(t1.k());
                                            c2.startRenderByRealUrl(t1.n());
                                            npp.Companion.b("try to preload shopIndex web early");
                                        } else {
                                            ckf.y("shopDataParser");
                                            throw null;
                                        }
                                    } else {
                                        ckf.y("shopDataParser");
                                        throw null;
                                    }
                                }
                                ShopDataParser shopDataParser5 = this.b;
                                if (shopDataParser5 != null) {
                                    shopDataParser5.J2(c2);
                                } else {
                                    ckf.y("shopDataParser");
                                    throw null;
                                }
                            }
                        }
                    } else {
                        ckf.y("shopDataParser");
                        throw null;
                    }
                } else {
                    ckf.y("shopDataParser");
                    throw null;
                }
            }
            obj = Result.m1108constructorimpl(xhv.INSTANCE);
        } catch (Throwable th) {
            obj = Result.m1108constructorimpl(kotlin.b.a(th));
        }
        Throwable th2 = Result.m1111exceptionOrNullimpl(obj);
        if (th2 != null) {
            npp.Companion.c("catching block has error", th2);
        }
    }

    @Override // tb.tsd
    public void G(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("147e80ea", new Object[]{this, str, jSONObject});
            return;
        }
        ckf.g(str, "state");
        for (tsd tsdVar : this.j) {
            tsdVar.G(str, jSONObject);
        }
    }

    @Override // tb.hee
    public void I1(fee feeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a387060e", new Object[]{this, feeVar});
        } else if (feeVar != null) {
            ((ArrayList) this.k).add(feeVar);
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.event.broadcast.ShopBroadcastController.b
    public void N2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d696cb8f", new Object[]{this});
        }
    }

    @Override // tb.tsd
    public void S0(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee651ff0", new Object[]{this, jSONObject});
            return;
        }
        for (tsd tsdVar : this.j) {
            tsdVar.S0(jSONObject);
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.event.broadcast.ShopBroadcastController.b
    public void T(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cbecc25", new Object[]{this, str, str2});
        } else if (str != null) {
            ShopDataParser shopDataParser = this.b;
            if (shopDataParser != null) {
                shopDataParser.f(str, str2);
                ShopDataParser shopDataParser2 = this.b;
                if (shopDataParser2 != null) {
                    runOnUiThread(new c(ShopExtKt.Q(str, shopDataParser2.u1()), str));
                } else {
                    ckf.y("shopDataParser");
                    throw null;
                }
            } else {
                ckf.y("shopDataParser");
                throw null;
            }
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.event.broadcast.ShopBroadcastController.b
    public void W0(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea6cad4c", new Object[]{this, str, jSONObject});
        } else {
            runOnUiThread(new d(str, jSONObject));
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.event.broadcast.ShopBroadcastController.b
    public ShopDataParser Y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShopDataParser) ipChange.ipc$dispatch("16b01ba5", new Object[]{this});
        }
        ShopDataParser shopDataParser = this.b;
        if (shopDataParser == null) {
            return null;
        }
        if (shopDataParser != null) {
            return shopDataParser;
        }
        ckf.y("shopDataParser");
        throw null;
    }

    @Override // com.alibaba.triver.triver_shop.newShop.event.broadcast.ShopBroadcastController.b
    public void Y1(JSONArray jSONArray) {
        Object obj;
        ShopDataParser shopDataParser;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf52def3", new Object[]{this, jSONArray});
            return;
        }
        ckf.g(jSONArray, "performanceArray");
        try {
            shopDataParser = this.b;
        } catch (Throwable th) {
            obj = Result.m1108constructorimpl(kotlin.b.a(th));
        }
        if (shopDataParser != null) {
            shopDataParser.V2(jSONArray);
            obj = Result.m1108constructorimpl(xhv.INSTANCE);
            Throwable th2 = Result.m1111exceptionOrNullimpl(obj);
            if (th2 != null) {
                npp.Companion.c("catching block has error", th2);
                return;
            }
            return;
        }
        ckf.y("shopDataParser");
        throw null;
    }

    @Override // com.alibaba.triver.triver_shop.newShop.event.broadcast.ShopBroadcastController.b
    public void a2(boolean z, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffcf8e1a", new Object[]{this, new Boolean(z), jSONObject});
            return;
        }
        BaseContentComponent baseContentComponent = this.g;
        if (baseContentComponent != null) {
            baseContentComponent.c0(z, jSONObject);
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        acq.B(context);
    }

    @Override // tb.iop
    public ShopDataParser d0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShopDataParser) ipChange.ipc$dispatch("a3670ddb", new Object[]{this});
        }
        ShopDataParser shopDataParser = this.b;
        if (shopDataParser == null) {
            return null;
        }
        if (shopDataParser != null) {
            return shopDataParser;
        }
        ckf.y("shopDataParser");
        throw null;
    }

    @Override // tb.yfb
    public void g0(tsd tsdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c530150c", new Object[]{this, tsdVar});
        } else if (tsdVar != null) {
            this.j.add(tsdVar);
        }
    }

    @Override // android.app.Activity
    public Intent getIntent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("cdc34bda", new Object[]{this});
        }
        Intent intent = this.i;
        if (intent != null) {
            return intent;
        }
        Intent intent2 = super.getIntent();
        ckf.f(intent2, "super.getIntent()");
        return intent2;
    }

    @Override // tb.fee
    public void h(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2962cd0d", new Object[]{this, str, jSONObject});
            return;
        }
        ckf.g(str, "state");
        Iterator it = ((ArrayList) this.k).iterator();
        while (it.hasNext()) {
            ((fee) it.next()).h(str, jSONObject);
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.event.broadcast.ShopBroadcastController.b
    public void h1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f6ae251", new Object[]{this});
        }
    }

    @Override // android.app.Activity
    public boolean isInMultiWindowMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8b86a5e8", new Object[]{this})).booleanValue();
        }
        if (this.m == null) {
            this.m = Boolean.valueOf(super.isInMultiWindowMode());
        }
        Boolean bool = this.m;
        ckf.d(bool);
        return bool.booleanValue();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88afc63", new Object[]{this});
            return;
        }
        BaseContentComponent baseContentComponent = this.g;
        if (baseContentComponent == null || baseContentComponent.c()) {
            super.onBackPressed();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        Object obj;
        Object obj2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        rop.INSTANCE.a().j(this);
        try {
            bop bopVar = this.c;
            if (bopVar != null) {
                bopVar.e();
            }
            Result.m1108constructorimpl(xhv.INSTANCE);
        } catch (Throwable th) {
            Result.m1108constructorimpl(kotlin.b.a(th));
        }
        try {
            BaseContentComponent baseContentComponent = this.g;
            if (baseContentComponent != null) {
                baseContentComponent.g();
            }
            obj = Result.m1108constructorimpl(xhv.INSTANCE);
        } catch (Throwable th2) {
            obj = Result.m1108constructorimpl(kotlin.b.a(th2));
        }
        Throwable th3 = Result.m1111exceptionOrNullimpl(obj);
        if (th3 != null) {
            npp.Companion.c("catching block has error", th3);
        }
        try {
            if (!this.o) {
                cqp.INSTANCE.e(this.l);
            }
            obj2 = Result.m1108constructorimpl(xhv.INSTANCE);
        } catch (Throwable th4) {
            obj2 = Result.m1108constructorimpl(kotlin.b.a(th4));
        }
        Throwable th5 = Result.m1111exceptionOrNullimpl(obj2);
        if (th5 != null) {
            npp.Companion.c("catching block has error", th5);
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        Object obj;
        ShopDataParser shopDataParser;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bbd23dd", new Object[]{this});
            return;
        }
        super.onLowMemory();
        try {
            shopDataParser = this.b;
        } catch (Throwable th) {
            obj = Result.m1108constructorimpl(kotlin.b.a(th));
        }
        if (shopDataParser != null) {
            shopDataParser.o();
            obj = Result.m1108constructorimpl(xhv.INSTANCE);
            Throwable th2 = Result.m1111exceptionOrNullimpl(obj);
            if (th2 != null) {
                npp.Companion.c("catching block has error", th2);
                return;
            }
            return;
        }
        ckf.y("shopDataParser");
        throw null;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("725bd6aa", new Object[]{this, new Boolean(z), configuration});
            return;
        }
        super.onMultiWindowModeChanged(z, configuration);
        this.m = Boolean.valueOf(z);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        Object obj;
        ShopDataParser shopDataParser;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c69db59a", new Object[]{this, new Integer(i)});
            return;
        }
        super.onTrimMemory(i);
        try {
            shopDataParser = this.b;
        } catch (Throwable th) {
            obj = Result.m1108constructorimpl(kotlin.b.a(th));
        }
        if (shopDataParser != null) {
            shopDataParser.p(i);
            obj = Result.m1108constructorimpl(xhv.INSTANCE);
            Throwable th2 = Result.m1111exceptionOrNullimpl(obj);
            if (th2 != null) {
                npp.Companion.c("catching block has error", th2);
                return;
            }
            return;
        }
        ckf.y("shopDataParser");
        throw null;
    }

    public final void v3(Intent intent, long j) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c28e0eef", new Object[]{this, intent, new Long(j)});
            return;
        }
        FrameLayout frameLayout = this.d;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
            long currentTimeMillis = System.currentTimeMillis();
            UTAnalytics.getInstance().getDefaultTracker().skipPage(this);
            rop.INSTANCE.a().a(this);
            if (ShopExtKt.i(this, intent)) {
                r54.E(new ShopActivity$continueActivityOnCreate$1(this), 500L);
            } else if (x3(intent)) {
                aqp.a aVar = aqp.Companion;
                boolean R = aVar.R();
                try {
                    this.f = aVar.n0();
                    obj = Result.m1108constructorimpl(xhv.INSTANCE);
                } catch (Throwable th) {
                    obj = Result.m1108constructorimpl(kotlin.b.a(th));
                }
                Throwable th2 = Result.m1111exceptionOrNullimpl(obj);
                if (th2 != null) {
                    npp.Companion.c("catching block has error", th2);
                }
                Lifecycle lifecycle = getLifecycle();
                ShopDataParser shopDataParser = this.b;
                if (shopDataParser != null) {
                    lifecycle.addObserver(new ShopCommonActivityLifeCycle(shopDataParser));
                    BaseContentComponent w3 = w3();
                    eqp G = w3.G();
                    if (G != null && R) {
                        this.n = G;
                        D3();
                    }
                    y3(w3);
                    FrameLayout frameLayout2 = this.d;
                    if (frameLayout2 != null) {
                        kew.a(frameLayout2, w3.K());
                        this.g = w3;
                        if (!R) {
                            D3();
                        }
                        r54.P("startPoint process", new ShopActivity$continueActivityOnCreate$4(this, currentTimeMillis, j, intent));
                        r54.Q(new ShopActivity$continueActivityOnCreate$5(this));
                        r54.E(new ShopActivity$continueActivityOnCreate$6(this), 2000L);
                        return;
                    }
                    ckf.y("containerRootView");
                    throw null;
                }
                ckf.y("shopDataParser");
                throw null;
            }
        } else {
            ckf.y("containerRootView");
            throw null;
        }
    }

    public final BaseContentComponent w3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseContentComponent) ipChange.ipc$dispatch("7be758ae", new Object[]{this});
        }
        ShopDataParser shopDataParser = this.b;
        if (shopDataParser != null) {
            String u0 = shopDataParser.u0();
            if (u0 == null) {
                npp.Companion.b("industry shop type is null , use brandFlagshipShop");
                u0 = eop.FLAG_SHIP_SHOP;
            }
            eop.a aVar = eop.Companion;
            ShopDataParser shopDataParser2 = this.b;
            if (shopDataParser2 != null) {
                BaseContentComponent a2 = aVar.a(u0, shopDataParser2);
                if (a2 == null) {
                    npp.Companion.b(ckf.p("shopComponent not found , industry shop type : ", u0));
                    a2 = new DefaultShopV2();
                }
                npp.Companion.f(ckf.p("component ", a2));
                return a2;
            }
            ckf.y("shopDataParser");
            throw null;
        }
        ckf.y("shopDataParser");
        throw null;
    }

    public final void y3(BaseContentComponent baseContentComponent) {
        Object obj;
        ShopDataParser shopDataParser;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4913d8b3", new Object[]{this, baseContentComponent});
            return;
        }
        try {
            shopDataParser = this.b;
        } catch (Throwable th) {
            obj = Result.m1108constructorimpl(kotlin.b.a(th));
        }
        if (shopDataParser != null) {
            ShopDXEngine shopDXEngine = this.f3072a;
            if (shopDXEngine != null) {
                baseContentComponent.N(this, shopDataParser, shopDXEngine);
                obj = Result.m1108constructorimpl(xhv.INSTANCE);
                Throwable th2 = Result.m1111exceptionOrNullimpl(obj);
                if (th2 != null) {
                    npp.Companion.c("catching block has error", th2);
                }
                baseContentComponent.C0(new ShopActivity$initComponent$2(this));
                baseContentComponent.B0(new ShopActivity$initComponent$3(this));
                return;
            }
            ckf.y("shopDXEngine");
            throw null;
        }
        ckf.y("shopDataParser");
        throw null;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        Object obj;
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb2f300c", new Object[]{this, configuration});
            return;
        }
        ckf.g(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        rop ropVar = rop.INSTANCE;
        Throwable th = null;
        if (!ropVar.b() || this.b == null || (!TBAutoSizeConfig.x().T(this)) == this.h) {
            BaseContentComponent baseContentComponent = this.g;
            if (baseContentComponent != null) {
                baseContentComponent.V(configuration);
            }
            if (aqp.Companion.W() && ropVar.c() && configuration.orientation == 1) {
                npp.Companion.f("ShopActivity onConfigurationChanged ORIENTATION_PORTRAIT");
                this.o = true;
                cqp cqpVar = cqp.INSTANCE;
                cqpVar.e(this.l);
                if (this.i != null) {
                    cqpVar.f(this.l, new b());
                }
                try {
                    Intent intent = (Intent) getIntent().clone();
                    intent.addFlags(65536);
                    startActivity(intent);
                    obj = Result.m1108constructorimpl(xhv.INSTANCE);
                } catch (Throwable th2) {
                    obj = Result.m1108constructorimpl(kotlin.b.a(th2));
                }
                Throwable th3 = Result.m1111exceptionOrNullimpl(obj);
                if (th3 != null) {
                    npp.Companion.c("catching block has error", th3);
                    th = th3;
                }
                if (th != null) {
                    npp.Companion.b("start activity failed on onConfigChanged , try reStart");
                    String stringExtra = getIntent().getStringExtra("originalRouteUrl");
                    if (stringExtra == null) {
                        stringExtra = getIntent().getStringExtra(mop.KEY_FIRST_IN_SHOP_URL);
                    }
                    if (stringExtra != null) {
                        Nav.from(this).toUri(stringExtra);
                    }
                }
                r54.F(new ShopActivity$onConfigurationChanged$5(this));
                return;
            }
            return;
        }
        ShopDataParser shopDataParser = this.b;
        if (shopDataParser != null) {
            khu.h(this, ShopExtKt.A(shopDataParser, z));
        } else {
            ckf.y("shopDataParser");
            throw null;
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        npp.Companion.b("shop activity onPause");
        BaseContentComponent baseContentComponent = this.g;
        if (baseContentComponent != null) {
            z = baseContentComponent.R();
        }
        if (!z) {
            try {
                G3();
                Result.m1108constructorimpl(xhv.INSTANCE);
            } catch (Throwable th) {
                Result.m1108constructorimpl(kotlin.b.a(th));
            }
        }
        super.onPause();
    }

    public final boolean z3(Intent intent) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("799c22dd", new Object[]{this, intent})).booleanValue();
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            z = extras.getBoolean(od7.e.SHOW_ERROR, false);
        }
        if (z) {
            FrameLayout frameLayout = this.d;
            if (frameLayout != null) {
                frameLayout.removeAllViews();
                FrameLayout frameLayout2 = this.d;
                if (frameLayout2 != null) {
                    kew.a(frameLayout2, ShopExtKt.u(this));
                } else {
                    ckf.y("containerRootView");
                    throw null;
                }
            } else {
                ckf.y("containerRootView");
                throw null;
            }
        }
        return z;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        boolean w = r54.w(this);
        if (r54.u(this)) {
            this.h = !TBAutoSizeConfig.x().T(this);
        }
        npp.Companion.b(ckf.p("isPad : ", Boolean.valueOf(w)));
        d7r.a(this);
        if (bundle != null) {
            for (String str : p) {
                bundle.remove(str);
            }
            Object obj = bundle.get("androidx.lifecycle.BundlableSavedStateRegistry.key");
            if (obj instanceof Bundle) {
                for (String str2 : p) {
                    ((Bundle) obj).remove(str2);
                }
            }
        }
        super.onCreate(bundle);
        if (bundle != null) {
            npp.a aVar = npp.Companion;
            aVar.b("activity recycle by system , refresh page");
            Intent intent = (Intent) getIntent().clone();
            long j = bundle.getLong(RESTORE_KEY, 0L);
            if (j == 0 || !ShopStartActivityData.INSTANCE.c().containsKey(Long.valueOf(j))) {
                aVar.b("restore data not exist, restore failed");
                finish();
                return;
            }
            intent.putExtra(RESTORE_KEY, bundle.getLong(RESTORE_KEY, 0L));
            intent.putExtra(mop.KEY_ENABLE_DIRECTLY_PUSH_AC, true);
            intent.setClass(this, ShopActivity.class);
            startActivity(intent);
            finish();
            return;
        }
        final long currentTimeMillis = System.currentTimeMillis();
        FrameLayout frameLayout = new FrameLayout(this);
        this.d = frameLayout;
        setContentView(frameLayout);
        boolean booleanExtra = getIntent().getBooleanExtra(mop.KEY_ENABLE_DIRECTLY_PUSH_AC, false);
        long longExtra = getIntent().getLongExtra(RESTORE_KEY, 0L);
        Intent remove = ShopStartActivityData.INSTANCE.c().remove(Long.valueOf(longExtra));
        if (booleanExtra) {
            long longExtra2 = getIntent().getLongExtra(RVConstants.EXTRA_START_TOKEN, longExtra);
            if (longExtra2 == 0) {
                npp.Companion.b("startToken == 0 ,finish");
                finish();
            }
            this.l = longExtra2;
            if (ShopExtKt.f0(getIntent().getStringExtra(mop.KEY_FIRST_IN_SHOP_URL)) && aqp.Companion.z0()) {
                npp.Companion.b("startPreload xsdWeex");
                XSDStoreWeexModeComponent.Companion.a(this);
            }
            cqp cqpVar = cqp.INSTANCE;
            Intent a2 = cqpVar.a(longExtra2);
            if (a2 != null || remove == null) {
                remove = a2;
            }
            npp.Companion.f(ckf.p("ShopActivity onCreate intentByStartToken ", remove));
            if (remove == null) {
                cqpVar.f(longExtra2, new cqp.a() { // from class: com.alibaba.triver.triver_shop.newShop.ShopActivity$onCreate$1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // tb.cqp.a
                    public void a(Intent intent2) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8d350231", new Object[]{this, intent2});
                            return;
                        }
                        ckf.g(intent2, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
                        Log.e(ShopView.SP_NAMESPACE, "onDataGet token data");
                        ShopActivity.u3(ShopActivity.this, intent2);
                        ShopActivity.l3(ShopActivity.this, intent2, currentTimeMillis);
                    }

                    @Override // tb.cqp.a
                    public void b(Intent intent2) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("440b0040", new Object[]{this, intent2});
                            return;
                        }
                        ckf.g(intent2, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
                        if (!ShopActivity.q3(ShopActivity.this, intent2)) {
                            r54.E(new ShopActivity$onCreate$1$onFailed$1(ShopActivity.this), 300L);
                        }
                    }

                    @Override // tb.cqp.a
                    public Intent getData() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return (Intent) ipChange2.ipc$dispatch("78f0a48c", new Object[]{this});
                        }
                        return null;
                    }
                });
                return;
            }
            Log.e(ShopView.SP_NAMESPACE, "has token data");
            this.i = remove;
            if (!z3(remove)) {
                v3(remove, currentTimeMillis);
                return;
            }
            return;
        }
        v3(getIntent(), currentTimeMillis);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        Object obj;
        Object obj2;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        npp.Companion.b("shopActivity onResume");
        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        try {
            BaseContentComponent baseContentComponent = this.g;
            if (baseContentComponent != null) {
                z = baseContentComponent.S();
            }
            ref$BooleanRef.element = z;
            if (!z) {
                UTAnalytics.getInstance().getDefaultTracker().pageAppearDonotSkip(this);
            }
            obj = Result.m1108constructorimpl(xhv.INSTANCE);
        } catch (Throwable th) {
            obj = Result.m1108constructorimpl(kotlin.b.a(th));
        }
        Throwable th2 = Result.m1111exceptionOrNullimpl(obj);
        if (th2 != null) {
            npp.Companion.c("catching block has error", th2);
        }
        try {
            if (!this.e && this.f) {
                ShopExtKt.m(getIntent(), this);
                this.e = true;
            }
            obj2 = Result.m1108constructorimpl(xhv.INSTANCE);
        } catch (Throwable th3) {
            obj2 = Result.m1108constructorimpl(kotlin.b.a(th3));
        }
        Throwable th4 = Result.m1111exceptionOrNullimpl(obj2);
        if (th4 != null) {
            npp.Companion.c("catching block has error", th4);
        }
        bop bopVar = this.c;
        if (bopVar != null) {
            bopVar.h();
            bop bopVar2 = this.c;
            if (bopVar2 != null) {
                bopVar2.f();
            } else {
                ckf.y("shopBroadCastDelegate");
                throw null;
            }
        }
        r54.F(new ShopActivity$onResume$4(this, ref$BooleanRef));
        r54.Q(new ShopActivity$onResume$5(this));
        super.onResume();
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        Object obj;
        Uri data;
        ShopDataParser shopDataParser;
        Bundle A0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80049e8d", new Object[]{this, bundle});
            return;
        }
        ckf.g(bundle, "outState");
        super.onSaveInstanceState(bundle);
        long currentTimeMillis = System.currentTimeMillis();
        bundle.putLong(RESTORE_KEY, currentTimeMillis);
        ShopStartActivityData shopStartActivityData = ShopStartActivityData.INSTANCE;
        shopStartActivityData.c().put(Long.valueOf(currentTimeMillis), getIntent());
        Intent intent = getIntent();
        Bundle extras = getIntent().getExtras();
        if (!(extras == null || !extras.containsKey("shopBundleId") || (shopDataParser = this.b) == null || (A0 = shopDataParser.A0()) == null)) {
            intent = (Intent) getIntent().clone();
            intent.putExtras(A0);
            A0.putAll(getIntent().getExtras());
            intent.putExtra(mop.KEY_ENABLE_DIRECTLY_PUSH_AC, true);
            shopStartActivityData.c().put(Long.valueOf(currentTimeMillis), intent);
        }
        if (!(!aqp.Companion.t() || this.b == null || intent == null || (data = intent.getData()) == null)) {
            Uri.Builder buildUpon = data.buildUpon();
            ckf.f(buildUpon, "builder");
            r54.z(buildUpon, ShopRenderActivity.SHOP_NAVI);
            ShopDataParser shopDataParser2 = this.b;
            if (shopDataParser2 != null) {
                buildUpon.appendQueryParameter(ShopRenderActivity.SHOP_NAVI, shopDataParser2.R());
                intent.setData(buildUpon.build());
            } else {
                ckf.y("shopDataParser");
                throw null;
            }
        }
        try {
            ShopDataParser shopDataParser3 = this.b;
            if (shopDataParser3 != null && shopDataParser3.g1().a()) {
                ShopDataParser shopDataParser4 = this.b;
                if (shopDataParser4 != null) {
                    g1a<Bundle, xhv> v = shopDataParser4.v();
                    if (v != null) {
                        v.invoke(bundle);
                    }
                    String string = bundle.getString("inshop_preload_token");
                    if (!(string == null || intent == null)) {
                        intent.putExtra("inshop_preload_token", string);
                    }
                    if (bundle.containsKey("allItems_last_index") && intent != null) {
                        intent.putExtra("allItems_last_index", bundle.getInt("allItems_last_index", 0));
                    }
                } else {
                    ckf.y("shopDataParser");
                    throw null;
                }
            }
            npp.Companion.b("shop will recycle by system");
            obj = Result.m1108constructorimpl(xhv.INSTANCE);
        } catch (Throwable th) {
            obj = Result.m1108constructorimpl(kotlin.b.a(th));
        }
        Throwable th2 = Result.m1111exceptionOrNullimpl(obj);
        if (th2 != null) {
            npp.Companion.c("catching block has error", th2);
        }
        ShopDataParser shopDataParser5 = this.b;
        if (shopDataParser5 != null) {
            ShopExtKt.M(shopDataParser5);
        }
    }

    public final boolean x3(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("793d458", new Object[]{this, intent})).booleanValue();
        }
        ActionBar actionBar = getActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }
        ltt lttVar = new ltt();
        this.f3072a = new ShopDXEngine(this);
        long a2 = lttVar.a();
        lttVar.b();
        if (intent == null) {
            intent = getIntent();
        }
        ShopDataParser S = ShopExtKt.S(this, intent, new ShopActivity$init$shopData$1(this));
        if (S == null) {
            ShopDXEngine shopDXEngine = this.f3072a;
            if (shopDXEngine != null) {
                shopDXEngine.g();
                return false;
            }
            ckf.y("shopDXEngine");
            throw null;
        }
        ShopDXEngine shopDXEngine2 = this.f3072a;
        if (shopDXEngine2 != null) {
            shopDXEngine2.m(S);
            this.b = S;
            S.Y2(mop.KEY_INIT_DX_ENGINE_COST, Long.valueOf(a2));
            S.Y2(mop.KEY_PARSE_SHOP_DATA_COST, Long.valueOf(lttVar.a()));
            if (i04.R(ShopNavAdapter.Companion.d(), S.u0())) {
                S.r2(true);
                ShopDXEngine shopDXEngine3 = this.f3072a;
                if (shopDXEngine3 != null) {
                    shopDXEngine3.k().q(true);
                } else {
                    ckf.y("shopDXEngine");
                    throw null;
                }
            } else {
                ShopDataParser shopDataParser = this.b;
                if (shopDataParser != null) {
                    shopDataParser.q2(true);
                } else {
                    ckf.y("shopDataParser");
                    throw null;
                }
            }
            ShopDataParser shopDataParser2 = this.b;
            if (shopDataParser2 != null) {
                bop bopVar = new bop(this, shopDataParser2, this);
                this.c = bopVar;
                ShopDataParser shopDataParser3 = this.b;
                if (shopDataParser3 != null) {
                    shopDataParser3.v2(bopVar);
                    ShopExtKt.o0(S);
                    return true;
                }
                ckf.y("shopDataParser");
                throw null;
            }
            ckf.y("shopDataParser");
            throw null;
        }
        ckf.y("shopDXEngine");
        throw null;
    }

    public final void G3() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27045ea1", new Object[]{this});
            return;
        }
        ShopDataParser shopDataParser = this.b;
        if (shopDataParser != null) {
            if (shopDataParser.G1()) {
                a1v.g(this, "is2022Style", "true");
            }
            ShopDataParser shopDataParser2 = this.b;
            if (shopDataParser2 != null) {
                a1v.g(this, "identityCode", shopDataParser2.s0());
                ShopDataParser shopDataParser3 = this.b;
                if (shopDataParser3 != null) {
                    a1v.g(this, "identityType", shopDataParser3.f3());
                    ShopDataParser shopDataParser4 = this.b;
                    if (shopDataParser4 != null) {
                        String R = shopDataParser4.R();
                        ShopDataParser shopDataParser5 = this.b;
                        if (shopDataParser5 != null) {
                            JSONObject c3 = shopDataParser5.c3(R);
                            String string = c3 == null ? null : c3.getString("spm");
                            if (string == null || string.length() == 0) {
                                string = null;
                            }
                            if (spp.a(R)) {
                                if (string == null) {
                                    ShopDataParser shopDataParser6 = this.b;
                                    if (shopDataParser6 == null) {
                                        ckf.y("shopDataParser");
                                        throw null;
                                    } else if (shopDataParser6.G1()) {
                                        str = "a2141.b37071050";
                                    } else {
                                        str = "a2141.7631671";
                                    }
                                } else {
                                    str = string;
                                }
                                a1v.i(this, str, "Page_Shop_All_Item");
                                ShopDataParser shopDataParser7 = this.b;
                                if (shopDataParser7 != null) {
                                    Pair a2 = jpu.a("shop_id", shopDataParser7.W0());
                                    ShopDataParser shopDataParser8 = this.b;
                                    if (shopDataParser8 != null) {
                                        a1v.k(this, kotlin.collections.a.k(a2, jpu.a("seller_id", shopDataParser8.N0())));
                                    } else {
                                        ckf.y("shopDataParser");
                                        throw null;
                                    }
                                } else {
                                    ckf.y("shopDataParser");
                                    throw null;
                                }
                            }
                            if (spp.b(R)) {
                                if (string == null) {
                                    ShopDataParser shopDataParser9 = this.b;
                                    if (shopDataParser9 == null) {
                                        ckf.y("shopDataParser");
                                        throw null;
                                    } else if (shopDataParser9.G1()) {
                                        string = z9u.SPM_TAOLIVE_WATCH_4_SHOPCARD;
                                    } else {
                                        string = "a2141.7631565";
                                    }
                                }
                                a1v.i(this, string, ShopConstants.PAGE_SHOP);
                                ShopDataParser shopDataParser10 = this.b;
                                if (shopDataParser10 != null) {
                                    Pair a3 = jpu.a("shop_id", shopDataParser10.W0());
                                    ShopDataParser shopDataParser11 = this.b;
                                    if (shopDataParser11 != null) {
                                        a1v.k(this, kotlin.collections.a.k(a3, jpu.a("seller_id", shopDataParser11.N0())));
                                    } else {
                                        ckf.y("shopDataParser");
                                        throw null;
                                    }
                                } else {
                                    ckf.y("shopDataParser");
                                    throw null;
                                }
                            }
                            ShopDataParser shopDataParser12 = this.b;
                            if (shopDataParser12 != null) {
                                a1v.j(this, shopDataParser12);
                            } else {
                                ckf.y("shopDataParser");
                                throw null;
                            }
                        } else {
                            ckf.y("shopDataParser");
                            throw null;
                        }
                    } else {
                        ckf.y("shopDataParser");
                        throw null;
                    }
                } else {
                    ckf.y("shopDataParser");
                    throw null;
                }
            } else {
                ckf.y("shopDataParser");
                throw null;
            }
        }
        UTAnalytics.getInstance().getDefaultTracker().pageDisAppear(this);
        bop bopVar = this.c;
        if (bopVar != null) {
            bopVar.g();
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.event.broadcast.ShopBroadcastController.b
    public void a1(String str) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f93a06", new Object[]{this, str});
        } else if (str != null) {
            List y0 = wsq.y0(str, new char[]{'.'}, false, 0, 6, null);
            if (y0.size() >= 3) {
                int L = r54.L((String) y0.get(0));
                if (ckf.b("0", y0.get(2))) {
                    obj = y0.get(1);
                } else {
                    obj = y0.get(2);
                }
                int L2 = r54.L((String) obj);
                npp.a aVar = npp.Companion;
                aVar.a("onPageReady : mainTab = " + L + " subTab = " + L2);
                ShopDataParser shopDataParser = this.b;
                if (shopDataParser != null) {
                    if (L == shopDataParser.C()) {
                        ShopDataParser shopDataParser2 = this.b;
                        if (shopDataParser2 == null) {
                            ckf.y("shopDataParser");
                            throw null;
                        } else if (L2 == shopDataParser2.p1()) {
                            ShopBroadcastController f = ShopBroadcastController.f(this);
                            ShopDataParser shopDataParser3 = this.b;
                            if (shopDataParser3 != null) {
                                f.q(L, L2, shopDataParser3.W0());
                                return;
                            } else {
                                ckf.y("shopDataParser");
                                throw null;
                            }
                        }
                    }
                    aVar.a("onPageRead : but mainIndex and subIndex not match");
                    return;
                }
                ckf.y("shopDataParser");
                throw null;
            }
        }
    }
}
