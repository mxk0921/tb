package com.alibaba.triver.triver_shop.newShop;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import androidx.viewpager.widget.ViewPager;
import com.alibaba.ariver.app.api.App;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.ShopMoreUtils;
import com.alibaba.triver.triver_shop.newShop.data.NativeShopRenderContainerType;
import com.alibaba.triver.triver_shop.newShop.data.ShopDataParser;
import com.alibaba.triver.triver_shop.newShop.event.broadcast.ShopBroadcastController;
import com.alibaba.triver.triver_shop.newShop.ext.ShopExtKt;
import com.alibaba.triver.triver_shop.newShop.ext.ShopUTExposeEventKt;
import com.alibaba.triver.triver_shop.newShop.view.BigCardShopView;
import com.alibaba.triver.triver_shop.newShop.view.CarShopView;
import com.alibaba.triver.triver_shop.newShop.view.ShopStandardFragment;
import com.alibaba.triver.triver_shop.newShop.view.ShopView;
import com.alibaba.triver.triver_shop.newShop.view.VideoShopView;
import com.alibaba.triver.triver_shop.newShop.view.extend.ShopWrapWebView;
import com.alibaba.triver.triver_shop.newShop.view.provider.HomePageTabFragmentViewProvider;
import com.alibaba.triver.triver_shop.preload.ShopIndexWebViewPreload;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.taobao.android.autosize.TBAutoSizeConfig;
import com.taobao.android.dinamicx.DXEngineConfig;
import com.taobao.android.dinamicx.DXResult;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.nav.Nav;
import com.taobao.message.biz.contacts.MessageBoxService;
import com.taobao.message.biz.contacts.UnreadInfo;
import com.taobao.message.kit.core.GlobalContainer;
import com.taobao.tao.shop.common.ShopConstants;
import com.taobao.taobao.R;
import com.ut.mini.UTAnalytics;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Result;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Ref$ObjectRef;
import tb.a07;
import tb.a0g;
import tb.a1v;
import tb.acq;
import tb.aqp;
import tb.brf;
import tb.brp;
import tb.ckf;
import tb.dun;
import tb.g1a;
import tb.gbv;
import tb.glk;
import tb.gop;
import tb.gp0;
import tb.h1p;
import tb.iop;
import tb.iwb;
import tb.iy5;
import tb.jpu;
import tb.jwk;
import tb.k66;
import tb.kew;
import tb.kht;
import tb.khu;
import tb.ln9;
import tb.mjn;
import tb.mop;
import tb.njg;
import tb.npp;
import tb.ob5;
import tb.oop;
import tb.pps;
import tb.r54;
import tb.rop;
import tb.t2o;
import tb.u1a;
import tb.ups;
import tb.v4s;
import tb.w6f;
import tb.wsq;
import tb.xhv;
import tb.xz3;
import tb.yh6;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class NativeShopActivity extends FragmentActivity implements iop {
    public static final /* synthetic */ a0g<Object>[] $$delegatedProperties;
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final c Companion = new c(null);
    public int A;
    public ShopDataParser B;
    public b C;
    public JSONObject D;
    public JSONArray E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean M;
    public boolean Q;
    public ShopView d;
    public DinamicXEngine e;
    public View f;
    public View g;
    public View h;
    public View i;
    public View j;
    public View k;
    public View l;
    public FrameLayout m;
    public String y;
    public int z;

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<String, u1a<DXTemplateItem, Boolean, xhv>> f3047a = new HashMap<>();
    public final kht b = new kht();
    public final UnReadMsgReceiver c = new UnReadMsgReceiver(this);
    public final njg n = kotlin.a.b(new NativeShopActivity$topViewContainer$2(this));
    public final njg o = kotlin.a.b(new NativeShopActivity$secondViewContainer$2(this));
    public final njg p = kotlin.a.b(new NativeShopActivity$babyTopViewContainer$2(this));
    public final njg q = kotlin.a.b(new NativeShopActivity$babySecondViewContainer$2(this));
    public final njg r = kotlin.a.b(new NativeShopActivity$shopLoftEntranceContainer$2(this));
    public final njg s = kotlin.a.b(new NativeShopActivity$videoShopTabContainer$2(this));
    public final mjn t = new n(0, 0, this);
    public final mjn u = new o(0, 0, this);
    public String v = mop.KEY_SHOP_INDEX_BAR;
    public String w = mop.KEY_SHOP_INDEX;
    public String x = "";
    public boolean L = true;
    public final HashMap<String, String> N = new HashMap<>();
    public final HashMap<String, k> O = new HashMap<>();
    public final boolean P = true;
    public final boolean R = true;
    public final m S = new m();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public final class BabyPageViewPagerListener extends DefaultViewPagerListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ NativeShopActivity b;

        static {
            t2o.a(766509354);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BabyPageViewPagerListener(NativeShopActivity nativeShopActivity) {
            super(nativeShopActivity);
            ckf.g(nativeShopActivity, "this$0");
            this.b = nativeShopActivity;
        }

        public static /* synthetic */ Object ipc$super(BabyPageViewPagerListener babyPageViewPagerListener, String str, Object... objArr) {
            if (str.hashCode() == 407727923) {
                super.onPageSelected(((Number) objArr[0]).intValue());
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/NativeShopActivity$BabyPageViewPagerListener");
        }

        @Override // com.alibaba.triver.triver_shop.newShop.NativeShopActivity.DefaultViewPagerListener, androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i)});
                return;
            }
            super.onPageSelected(i);
            if (NativeShopActivity.q3(this.b) == null) {
                npp.Companion.b("onPageSelected babySecondView not init");
                return;
            }
            DinamicXEngine B3 = NativeShopActivity.B3(this.b);
            if (B3 != null) {
                View q3 = NativeShopActivity.q3(this.b);
                if (q3 != null) {
                    ShopExtKt.w0(B3, q3, mop.KEY_SELECTED_INDEX, Integer.valueOf(i));
                } else {
                    ckf.y("babySecondView");
                    throw null;
                }
            } else {
                ckf.y(gbv.PARAM_KEY_DX_ENGINE);
                throw null;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class DefaultTbShopActionListener extends kht.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ NativeShopActivity f3048a;

        static {
            t2o.a(766509359);
        }

        public DefaultTbShopActionListener(NativeShopActivity nativeShopActivity) {
            ckf.g(nativeShopActivity, "this$0");
            this.f3048a = nativeShopActivity;
        }

        public static /* synthetic */ Object ipc$super(DefaultTbShopActionListener defaultTbShopActionListener, String str, Object... objArr) {
            if (str.hashCode() == 145569215) {
                super.h(objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/NativeShopActivity$DefaultTbShopActionListener");
        }

        @Override // tb.kht.b
        public void a(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a493f194", new Object[]{this, obj});
                return;
            }
            NativeShopActivity nativeShopActivity = this.f3048a;
            try {
                if (!NativeShopActivity.F3(nativeShopActivity)) {
                    ShopDataParser I3 = NativeShopActivity.I3(nativeShopActivity);
                    if (I3 != null) {
                        brp.c(I3);
                    } else {
                        ckf.y("shopDataParser");
                        throw null;
                    }
                } else {
                    ShopDataParser I32 = NativeShopActivity.I3(nativeShopActivity);
                    if (I32 != null) {
                        brp.d(I32);
                    } else {
                        ckf.y("shopDataParser");
                        throw null;
                    }
                }
                Result.m1108constructorimpl(xhv.INSTANCE);
            } catch (Throwable th) {
                Result.m1108constructorimpl(kotlin.b.a(th));
            }
            if (NativeShopActivity.F3(this.f3048a)) {
                ShopMoreUtils shopMoreUtils = ShopMoreUtils.INSTANCE;
                NativeShopActivity nativeShopActivity2 = this.f3048a;
                ShopDataParser I33 = NativeShopActivity.I3(nativeShopActivity2);
                if (I33 != null) {
                    shopMoreUtils.q(nativeShopActivity2, I33.N0(), new NativeShopActivity$DefaultTbShopActionListener$follow$2(this.f3048a));
                } else {
                    ckf.y("shopDataParser");
                    throw null;
                }
            } else {
                NativeShopActivity.q4(this.f3048a);
                if (NativeShopActivity.R3(this.f3048a)) {
                    NativeShopActivity.m3(this.f3048a, "VideoLightShop_follow_click");
                }
            }
        }

        @Override // tb.kht.b
        public void b(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f442552", new Object[]{this, obj});
            } else {
                this.f3048a.finish();
            }
        }

        @Override // tb.kht.b
        public void c(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("74c029e6", new Object[]{this, obj});
            } else if (obj instanceof String) {
                if (NativeShopActivity.R3(this.f3048a)) {
                    ShopDataParser I3 = NativeShopActivity.I3(this.f3048a);
                    if (I3 == null) {
                        ckf.y("shopDataParser");
                        throw null;
                    } else if (I3.j2((String) obj)) {
                        NativeShopActivity.m3(this.f3048a, "VideoLightShop_wangwang_click");
                    }
                }
                ShopDataParser I32 = NativeShopActivity.I3(this.f3048a);
                if (I32 != null) {
                    if (ckf.b(I32.M0(), obj)) {
                        if (NativeShopActivity.R3(this.f3048a)) {
                            NativeShopActivity.m3(this.f3048a, "VideoLightShop_search_click");
                        } else {
                            ShopDataParser I33 = NativeShopActivity.I3(this.f3048a);
                            if (I33 != null) {
                                brp.i(I33);
                            } else {
                                ckf.y("shopDataParser");
                                throw null;
                            }
                        }
                    }
                    ShopDataParser I34 = NativeShopActivity.I3(this.f3048a);
                    if (I34 != null) {
                        if (I34.a2(obj)) {
                            if (NativeShopActivity.Y3(this.f3048a)) {
                                ShopDataParser I35 = NativeShopActivity.I3(this.f3048a);
                                if (I35 != null) {
                                    brp.a(I35);
                                } else {
                                    ckf.y("shopDataParser");
                                    throw null;
                                }
                            } else {
                                ShopDataParser I36 = NativeShopActivity.I3(this.f3048a);
                                if (I36 != null) {
                                    brp.b(I36);
                                } else {
                                    ckf.y("shopDataParser");
                                    throw null;
                                }
                            }
                        }
                        ShopDataParser I37 = NativeShopActivity.I3(this.f3048a);
                        if (I37 != null) {
                            String str = (String) obj;
                            if (I37.S1(str)) {
                                ShopDataParser I38 = NativeShopActivity.I3(this.f3048a);
                                if (I38 != null) {
                                    brp.f(I38);
                                } else {
                                    ckf.y("shopDataParser");
                                    throw null;
                                }
                            }
                            Nav.from(this.f3048a).toUri(str);
                            return;
                        }
                        ckf.y("shopDataParser");
                        throw null;
                    }
                    ckf.y("shopDataParser");
                    throw null;
                }
                ckf.y("shopDataParser");
                throw null;
            }
        }

        @Override // tb.kht.b
        public void h(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ad35bf", new Object[]{this, obj});
                return;
            }
            super.h(obj);
            NativeShopActivity.l4(this.f3048a, true);
        }

        @Override // tb.kht.b
        public void g(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9d9e8f42", new Object[]{this, obj});
            } else if (this.f3048a.getIntent() != null && this.f3048a.getIntent().getData() != null) {
                b u3 = NativeShopActivity.u3(this.f3048a);
                if (u3 != null) {
                    App s = ShopExtKt.s(u3.b(0));
                    ShopDataParser I3 = NativeShopActivity.I3(this.f3048a);
                    if (I3 != null) {
                        brp.g(I3);
                        ShopMoreUtils shopMoreUtils = ShopMoreUtils.INSTANCE;
                        NativeShopActivity nativeShopActivity = this.f3048a;
                        ShopDataParser I32 = NativeShopActivity.I3(nativeShopActivity);
                        if (I32 != null) {
                            shopMoreUtils.q(nativeShopActivity, I32.N0(), new NativeShopActivity$DefaultTbShopActionListener$share$1(this.f3048a, s));
                        } else {
                            ckf.y("shopDataParser");
                            throw null;
                        }
                    } else {
                        ckf.y("shopDataParser");
                        throw null;
                    }
                } else {
                    ckf.y("bottomBarManager");
                    throw null;
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class DefaultViewPagerListener implements ViewPager.OnPageChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ NativeShopActivity f3049a;

        static {
            t2o.a(766509365);
        }

        public DefaultViewPagerListener(NativeShopActivity nativeShopActivity) {
            ckf.g(nativeShopActivity, "this$0");
            this.f3049a = nativeShopActivity;
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6581cc1e", new Object[]{this, new Integer(i)});
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f4c13b05", new Object[]{this, new Integer(i), new Float(f), new Integer(i2)});
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i)});
                return;
            }
            NativeShopActivity.b4(this.f3049a, i);
            NativeShopActivity nativeShopActivity = this.f3049a;
            try {
                if (NativeShopActivity.Z3(nativeShopActivity)) {
                    NativeShopActivity.l4(nativeShopActivity, false);
                } else {
                    ShopDataParser I3 = NativeShopActivity.I3(nativeShopActivity);
                    if (I3 != null) {
                        NativeShopActivity.c4(nativeShopActivity, I3, NativeShopActivity.x3(nativeShopActivity), NativeShopActivity.y3(nativeShopActivity), "swipe");
                    } else {
                        ckf.y("shopDataParser");
                        throw null;
                    }
                }
                Result.m1108constructorimpl(xhv.INSTANCE);
            } catch (Throwable th) {
                Result.m1108constructorimpl(kotlin.b.a(th));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public final class HomePageViewPagerListener extends DefaultViewPagerListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ NativeShopActivity b;

        static {
            t2o.a(766509370);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HomePageViewPagerListener(NativeShopActivity nativeShopActivity) {
            super(nativeShopActivity);
            ckf.g(nativeShopActivity, "this$0");
            this.b = nativeShopActivity;
        }

        public static /* synthetic */ Object ipc$super(HomePageViewPagerListener homePageViewPagerListener, String str, Object... objArr) {
            if (str.hashCode() == 407727923) {
                super.onPageSelected(((Number) objArr[0]).intValue());
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/NativeShopActivity$HomePageViewPagerListener");
        }

        @Override // com.alibaba.triver.triver_shop.newShop.NativeShopActivity.DefaultViewPagerListener, androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i)});
                return;
            }
            super.onPageSelected(i);
            if (NativeShopActivity.O3(this.b) == null) {
                npp.Companion.b("onPageSelected topView not init");
                return;
            }
            DinamicXEngine B3 = NativeShopActivity.B3(this.b);
            if (B3 != null) {
                View O3 = NativeShopActivity.O3(this.b);
                if (O3 != null) {
                    ShopExtKt.w0(B3, O3, mop.KEY_SELECTED_INDEX, Integer.valueOf(i));
                } else {
                    ckf.y("topView");
                    throw null;
                }
            } else {
                ckf.y(gbv.PARAM_KEY_DX_ENGINE);
                throw null;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public final class UnReadMsgReceiver extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ NativeShopActivity f3055a;

        static {
            t2o.a(766509381);
        }

        public UnReadMsgReceiver(NativeShopActivity nativeShopActivity) {
            ckf.g(nativeShopActivity, "this$0");
            this.f3055a = nativeShopActivity;
        }

        public static /* synthetic */ Object ipc$super(UnReadMsgReceiver unReadMsgReceiver, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/NativeShopActivity$UnReadMsgReceiver");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else {
                NativeShopActivity.v4(this.f3055a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public final class VideoShopViewPagerListener extends DefaultViewPagerListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ NativeShopActivity b;

        static {
            t2o.a(766509382);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public VideoShopViewPagerListener(NativeShopActivity nativeShopActivity) {
            super(nativeShopActivity);
            ckf.g(nativeShopActivity, "this$0");
            this.b = nativeShopActivity;
        }

        public static /* synthetic */ Object ipc$super(VideoShopViewPagerListener videoShopViewPagerListener, String str, Object... objArr) {
            if (str.hashCode() == 407727923) {
                super.onPageSelected(((Number) objArr[0]).intValue());
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/NativeShopActivity$VideoShopViewPagerListener");
        }

        @Override // com.alibaba.triver.triver_shop.newShop.NativeShopActivity.DefaultViewPagerListener, androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i)});
                return;
            }
            super.onPageSelected(i);
            if (NativeShopActivity.T3(this.b) != null) {
                DinamicXEngine B3 = NativeShopActivity.B3(this.b);
                if (B3 != null) {
                    View T3 = NativeShopActivity.T3(this.b);
                    if (T3 != null) {
                        ShopExtKt.w0(B3, T3, mop.KEY_SELECTED_INDEX, Integer.valueOf(i));
                    } else {
                        ckf.y("videoShopTabView");
                        throw null;
                    }
                } else {
                    ckf.y(gbv.PARAM_KEY_DX_ENGINE);
                    throw null;
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public final class a extends DefaultTbShopActionListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ NativeShopActivity b;

        static {
            t2o.a(766509355);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(NativeShopActivity nativeShopActivity) {
            super(nativeShopActivity);
            ckf.g(nativeShopActivity, "this$0");
            this.b = nativeShopActivity;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == 145569215) {
                super.h(objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/NativeShopActivity$BottomBarActionListener");
        }

        @Override // com.alibaba.triver.triver_shop.newShop.NativeShopActivity.DefaultTbShopActionListener, tb.kht.b
        public void h(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ad35bf", new Object[]{this, obj});
                return;
            }
            super.h(obj);
            if (obj != null && NativeShopActivity.I3(this.b) != null) {
                int parseInt = Integer.parseInt((String) obj);
                if (parseInt != NativeShopActivity.x3(this.b) || !NativeShopActivity.C3(this.b)) {
                    DinamicXEngine B3 = NativeShopActivity.B3(this.b);
                    if (B3 != null) {
                        View w3 = NativeShopActivity.w3(this.b);
                        if (w3 != null) {
                            ShopExtKt.w0(B3, w3, mop.KEY_SELECTED_INDEX, Integer.valueOf(parseInt));
                            b u3 = NativeShopActivity.u3(this.b);
                            if (u3 != null) {
                                u3.c(parseInt);
                                ShopDataParser I3 = NativeShopActivity.I3(this.b);
                                if (I3 != null) {
                                    if (I3.e2()) {
                                        NativeShopActivity.m3(this.b, "Page_Shop_Dynamic_RedDot_Click");
                                        DinamicXEngine B32 = NativeShopActivity.B3(this.b);
                                        if (B32 != null) {
                                            View w32 = NativeShopActivity.w3(this.b);
                                            if (w32 != null) {
                                                ShopExtKt.w0(B32, w32, mop.KEY_SUBSCRIBE_SUBJECT_TYPE_RED_DOT, Boolean.FALSE);
                                            } else {
                                                ckf.y("bottomView");
                                                throw null;
                                            }
                                        } else {
                                            ckf.y(gbv.PARAM_KEY_DX_ENGINE);
                                            throw null;
                                        }
                                    }
                                    NativeShopActivity nativeShopActivity = this.b;
                                    ShopDataParser I32 = NativeShopActivity.I3(nativeShopActivity);
                                    if (I32 != null) {
                                        NativeShopActivity.t5(nativeShopActivity, I32, NativeShopActivity.x3(this.b), NativeShopActivity.y3(this.b), null, 8, null);
                                        ShopDataParser I33 = NativeShopActivity.I3(this.b);
                                        if (I33 != null) {
                                            ShopUTExposeEventKt.e(I33, parseInt);
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
                                ckf.y("bottomBarManager");
                                throw null;
                            }
                        } else {
                            ckf.y("bottomView");
                            throw null;
                        }
                    } else {
                        ckf.y(gbv.PARAM_KEY_DX_ENGINE);
                        throw null;
                    }
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class c {
        static {
            t2o.a(766509358);
        }

        public /* synthetic */ c(a07 a07Var) {
            this();
        }

        public c() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public final class d extends DefaultTbShopActionListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ NativeShopActivity b;

        static {
            t2o.a(766509366);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(NativeShopActivity nativeShopActivity) {
            super(nativeShopActivity);
            ckf.g(nativeShopActivity, "this$0");
            this.b = nativeShopActivity;
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            if (str.hashCode() == 145569215) {
                super.h(objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/NativeShopActivity$HeaderIndexNavAreaActionListener");
        }

        @Override // com.alibaba.triver.triver_shop.newShop.NativeShopActivity.DefaultTbShopActionListener, tb.kht.b
        public void h(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ad35bf", new Object[]{this, obj});
                return;
            }
            super.h(obj);
            if (obj != null && NativeShopActivity.I3(this.b) != null) {
                int parseInt = Integer.parseInt((String) obj);
                DinamicXEngine B3 = NativeShopActivity.B3(this.b);
                if (B3 != null) {
                    View O3 = NativeShopActivity.O3(this.b);
                    if (O3 != null) {
                        ShopExtKt.w0(B3, O3, mop.KEY_SELECTED_INDEX, Integer.valueOf(parseInt));
                        b u3 = NativeShopActivity.u3(this.b);
                        if (u3 != null) {
                            Fragment b = u3.b(0);
                            if (b instanceof ShopStandardFragment) {
                                ((ShopStandardFragment) b).C2(parseInt);
                            }
                            NativeShopActivity nativeShopActivity = this.b;
                            ShopDataParser I3 = NativeShopActivity.I3(nativeShopActivity);
                            if (I3 != null) {
                                NativeShopActivity.t5(nativeShopActivity, I3, NativeShopActivity.x3(this.b), NativeShopActivity.y3(this.b), null, 8, null);
                            } else {
                                ckf.y("shopDataParser");
                                throw null;
                            }
                        } else {
                            ckf.y("bottomBarManager");
                            throw null;
                        }
                    } else {
                        ckf.y("topView");
                        throw null;
                    }
                } else {
                    ckf.y(gbv.PARAM_KEY_DX_ENGINE);
                    throw null;
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public final class e extends DefaultTbShopActionListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ NativeShopActivity b;

        static {
            t2o.a(766509367);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(NativeShopActivity nativeShopActivity) {
            super(nativeShopActivity);
            ckf.g(nativeShopActivity, "this$0");
            this.b = nativeShopActivity;
        }

        public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
            if (str.hashCode() == 145569215) {
                super.h(objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/NativeShopActivity$HeaderIndexTabVideoShopActionListener");
        }

        @Override // com.alibaba.triver.triver_shop.newShop.NativeShopActivity.DefaultTbShopActionListener, tb.kht.b
        public void h(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ad35bf", new Object[]{this, obj});
                return;
            }
            super.h(obj);
            if (obj != null && NativeShopActivity.I3(this.b) != null) {
                int parseInt = Integer.parseInt((String) obj);
                DinamicXEngine B3 = NativeShopActivity.B3(this.b);
                if (B3 != null) {
                    View T3 = NativeShopActivity.T3(this.b);
                    if (T3 != null) {
                        ShopExtKt.w0(B3, T3, mop.KEY_SELECTED_INDEX, Integer.valueOf(parseInt));
                        b u3 = NativeShopActivity.u3(this.b);
                        if (u3 != null) {
                            u3.d(0, parseInt);
                            if (NativeShopActivity.V3(this.b) && NativeShopActivity.R3(this.b)) {
                                NativeShopActivity.m3(this.b, "VideoLightShop_tab_itemtab_click");
                                return;
                            }
                            return;
                        }
                        ckf.y("bottomBarManager");
                        throw null;
                    }
                    ckf.y("videoShopTabView");
                    throw null;
                }
                ckf.y(gbv.PARAM_KEY_DX_ENGINE);
                throw null;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public final class f extends DefaultTbShopActionListener {
        static {
            t2o.a(766509368);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(NativeShopActivity nativeShopActivity) {
            super(nativeShopActivity);
            ckf.g(nativeShopActivity, "this$0");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public final class g extends DefaultTbShopActionListener {
        static {
            t2o.a(766509369);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(NativeShopActivity nativeShopActivity) {
            super(nativeShopActivity);
            ckf.g(nativeShopActivity, "this$0");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public final class h extends DefaultTbShopActionListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ NativeShopActivity b;

        static {
            t2o.a(766509377);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(NativeShopActivity nativeShopActivity) {
            super(nativeShopActivity);
            ckf.g(nativeShopActivity, "this$0");
            this.b = nativeShopActivity;
        }

        public static /* synthetic */ Object ipc$super(h hVar, String str, Object... objArr) {
            if (str.hashCode() == 145569215) {
                super.h(objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/NativeShopActivity$ShopHeaderGoodsActionListener");
        }

        @Override // com.alibaba.triver.triver_shop.newShop.NativeShopActivity.DefaultTbShopActionListener, tb.kht.b
        public void h(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ad35bf", new Object[]{this, obj});
                return;
            }
            super.h(obj);
            if (obj != null && NativeShopActivity.I3(this.b) != null) {
                if (NativeShopActivity.q3(this.b) == null) {
                    npp.Companion.b("switchTabTo babySecondView not init");
                    return;
                }
                ShopDataParser I3 = NativeShopActivity.I3(this.b);
                if (I3 != null) {
                    JSONObject R2 = I3.R2();
                    int parseInt = Integer.parseInt((String) obj);
                    R2.put((JSONObject) mop.KEY_SELECTED_INDEX, (String) Integer.valueOf(parseInt));
                    DinamicXEngine B3 = NativeShopActivity.B3(this.b);
                    if (B3 != null) {
                        View q3 = NativeShopActivity.q3(this.b);
                        if (q3 != null) {
                            B3.j1((DXRootView) q3, R2);
                            b u3 = NativeShopActivity.u3(this.b);
                            if (u3 != null) {
                                u3.d(NativeShopActivity.x3(this.b), parseInt);
                                NativeShopActivity nativeShopActivity = this.b;
                                ShopDataParser I32 = NativeShopActivity.I3(nativeShopActivity);
                                if (I32 != null) {
                                    NativeShopActivity.t5(nativeShopActivity, I32, NativeShopActivity.x3(this.b), NativeShopActivity.y3(this.b), null, 8, null);
                                } else {
                                    ckf.y("shopDataParser");
                                    throw null;
                                }
                            } else {
                                ckf.y("bottomBarManager");
                                throw null;
                            }
                        } else {
                            ckf.y("babySecondView");
                            throw null;
                        }
                    } else {
                        ckf.y(gbv.PARAM_KEY_DX_ENGINE);
                        throw null;
                    }
                } else {
                    ckf.y("shopDataParser");
                    throw null;
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class i extends kht.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ NativeShopActivity f3059a;

        static {
            t2o.a(766509378);
        }

        public i(NativeShopActivity nativeShopActivity) {
            ckf.g(nativeShopActivity, "this$0");
            this.f3059a = nativeShopActivity;
        }

        public static /* synthetic */ Object ipc$super(i iVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/NativeShopActivity$ShopLoftActionListener");
        }

        @Override // tb.kht.b
        public void e(Object obj) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c552608c", new Object[]{this, obj});
                return;
            }
            JSONObject jSONObject = new JSONObject();
            if (NativeShopActivity.Y3(this.f3059a)) {
                str = "shop2F_bigcard_off";
            } else {
                str = "shop2F_other";
            }
            jSONObject.put((JSONObject) "livesource", str);
            ShopDataParser I3 = NativeShopActivity.I3(this.f3059a);
            if (I3 != null) {
                String B0 = I3.B0(jSONObject);
                npp.Companion.b(ckf.p("new loft open brandZone , ", B0));
                if (B0 != null) {
                    Nav.from(this.f3059a).toUri(B0);
                    return;
                }
                return;
            }
            ckf.y("shopDataParser");
            throw null;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public final class j extends ob5 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ NativeShopActivity f3060a;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public static final class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Object[] f3061a;
            public final /* synthetic */ NativeShopActivity b;
            public final /* synthetic */ DXRuntimeContext c;

            public a(Object[] objArr, NativeShopActivity nativeShopActivity, DXRuntimeContext dXRuntimeContext) {
                this.f3061a = objArr;
                this.b = nativeShopActivity;
                this.c = dXRuntimeContext;
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else if (this.f3061a != null) {
                    kht D3 = NativeShopActivity.D3(this.b);
                    ShopDataParser I3 = NativeShopActivity.I3(this.b);
                    if (I3 != null) {
                        D3.o(I3, this.f3061a, this.c);
                    } else {
                        ckf.y("shopDataParser");
                        throw null;
                    }
                }
            }
        }

        static {
            t2o.a(766509379);
        }

        public j(NativeShopActivity nativeShopActivity) {
            ckf.g(nativeShopActivity, "this$0");
            this.f3060a = nativeShopActivity;
        }

        public static /* synthetic */ Object ipc$super(j jVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/NativeShopActivity$TbShopTapEventHandler");
        }

        @Override // tb.ob5, tb.mvb
        public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
                return;
            }
            NativeShopActivity nativeShopActivity = this.f3060a;
            nativeShopActivity.runOnUiThread(new a(objArr, nativeShopActivity, dXRuntimeContext));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class l implements iwb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public static final class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ NativeShopActivity f3064a;
            public final /* synthetic */ DXTemplateItem b;

            public a(NativeShopActivity nativeShopActivity, DXTemplateItem dXTemplateItem) {
                this.f3064a = nativeShopActivity;
                this.b = dXTemplateItem;
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                u1a u1aVar = (u1a) NativeShopActivity.A3(this.f3064a).get(this.b.f7343a);
                if (u1aVar != null) {
                    DXTemplateItem dXTemplateItem = this.b;
                    ckf.f(dXTemplateItem, "finishedTemplateItem");
                    u1aVar.invoke(dXTemplateItem, Boolean.TRUE);
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public static final class b implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ NativeShopActivity f3065a;
            public final /* synthetic */ DXTemplateItem b;

            public b(NativeShopActivity nativeShopActivity, DXTemplateItem dXTemplateItem) {
                this.f3065a = nativeShopActivity;
                this.b = dXTemplateItem;
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                u1a u1aVar = (u1a) NativeShopActivity.A3(this.f3065a).get(this.b.f7343a);
                if (u1aVar != null) {
                    DXTemplateItem dXTemplateItem = this.b;
                    ckf.f(dXTemplateItem, "failedTemplateItem");
                    u1aVar.invoke(dXTemplateItem, Boolean.FALSE);
                }
            }
        }

        public l() {
        }

        @Override // tb.iwb
        public final void onNotificationListener(k66 k66Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2f1f5baf", new Object[]{this, k66Var});
                return;
            }
            for (DXTemplateItem dXTemplateItem : k66Var.f22428a) {
                NativeShopActivity nativeShopActivity = NativeShopActivity.this;
                nativeShopActivity.runOnUiThread(new a(nativeShopActivity, dXTemplateItem));
            }
            for (DXTemplateItem dXTemplateItem2 : k66Var.b) {
                NativeShopActivity nativeShopActivity2 = NativeShopActivity.this;
                nativeShopActivity2.runOnUiThread(new b(nativeShopActivity2, dXTemplateItem2));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class m extends oop.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public m() {
        }

        public static /* synthetic */ Object ipc$super(m mVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/NativeShopActivity$shopFollowCallback$1");
        }

        @Override // tb.oop.a
        public void a(boolean z) {
            View v3;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("630464bf", new Object[]{this, new Boolean(z)});
                return;
            }
            NativeShopActivity.s4(NativeShopActivity.this, z);
            if (z && (v3 = NativeShopActivity.v3(NativeShopActivity.this)) != null) {
                kew.B(v3);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class n extends glk<Integer> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ NativeShopActivity b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(Object obj, Object obj2, NativeShopActivity nativeShopActivity) {
            super(obj2);
            this.b = nativeShopActivity;
        }

        public static /* synthetic */ Object ipc$super(n nVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/NativeShopActivity$special$$inlined$observable$1");
        }

        @Override // tb.glk
        public void c(a0g<?> a0gVar, Integer num, Integer num2) {
            Window window;
            View decorView;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("48721c3a", new Object[]{this, a0gVar, num, num2});
                return;
            }
            ckf.g(a0gVar, "property");
            int intValue = num2.intValue();
            num.intValue();
            if (intValue == 7 && (window = this.b.getWindow()) != null && (decorView = window.getDecorView()) != null) {
                decorView.addOnLayoutChangeListener(new q());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class o extends glk<Integer> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ NativeShopActivity b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(Object obj, Object obj2, NativeShopActivity nativeShopActivity) {
            super(obj2);
            this.b = nativeShopActivity;
        }

        public static /* synthetic */ Object ipc$super(o oVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/NativeShopActivity$special$$inlined$observable$2");
        }

        @Override // tb.glk
        public void c(a0g<?> a0gVar, Integer num, Integer num2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("48721c3a", new Object[]{this, a0gVar, num, num2});
                return;
            }
            ckf.g(a0gVar, "property");
            int intValue = num2.intValue();
            num.intValue();
            if (intValue == 2) {
                ShopMoreUtils shopMoreUtils = ShopMoreUtils.INSTANCE;
                NativeShopActivity nativeShopActivity = this.b;
                ShopDataParser I3 = NativeShopActivity.I3(nativeShopActivity);
                if (I3 != null) {
                    String W0 = I3.W0();
                    ShopDataParser I32 = NativeShopActivity.I3(this.b);
                    if (I32 != null) {
                        shopMoreUtils.p(nativeShopActivity, W0, I32.N0(), new NativeShopActivity$topViewLoadCount$2$1(this.b));
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
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class p extends oop.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public p() {
        }

        public static /* synthetic */ Object ipc$super(p pVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/NativeShopActivity$startFollowActionWithToast$callback$1");
        }

        @Override // tb.oop.a
        public void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("630464bf", new Object[]{this, new Boolean(z)});
                return;
            }
            NativeShopActivity.J3(NativeShopActivity.this).a(z);
            ShopDataParser I3 = NativeShopActivity.I3(NativeShopActivity.this);
            if (I3 != null) {
                ShopExtKt.i0(I3, z);
            } else {
                ckf.y("shopDataParser");
                throw null;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class q implements View.OnLayoutChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public q() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            View decorView;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("899df952", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8)});
                return;
            }
            ShopView L3 = NativeShopActivity.L3(NativeShopActivity.this);
            if (L3 != null) {
                L3.notifyAllTemplateReady();
                Window window = NativeShopActivity.this.getWindow();
                if (window != null && (decorView = window.getDecorView()) != null) {
                    decorView.removeOnLayoutChangeListener(this);
                    return;
                }
                return;
            }
            ckf.y("shopView");
            throw null;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class r implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ boolean b;

        public r(boolean z) {
            this.b = z;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            NativeShopActivity.i4(NativeShopActivity.this, this.b);
            ShopBroadcastController.f(NativeShopActivity.this).l(NativeShopActivity.this.T4("shopId"), NativeShopActivity.F3(NativeShopActivity.this));
            NativeShopActivity.t4(NativeShopActivity.this);
        }
    }

    public NativeShopActivity() {
        new JSONObject();
    }

    public static final /* synthetic */ HashMap A3(NativeShopActivity nativeShopActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("30bcbeef", new Object[]{nativeShopActivity});
        }
        return nativeShopActivity.f3047a;
    }

    public static final /* synthetic */ DinamicXEngine B3(NativeShopActivity nativeShopActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DinamicXEngine) ipChange.ipc$dispatch("b2708642", new Object[]{nativeShopActivity});
        }
        return nativeShopActivity.e;
    }

    public static final /* synthetic */ boolean C3(NativeShopActivity nativeShopActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ba2b7e6b", new Object[]{nativeShopActivity})).booleanValue();
        }
        return nativeShopActivity.P;
    }

    public static final /* synthetic */ kht D3(NativeShopActivity nativeShopActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kht) ipChange.ipc$dispatch("fc68fec1", new Object[]{nativeShopActivity});
        }
        return nativeShopActivity.b;
    }

    public static final /* synthetic */ boolean E3(NativeShopActivity nativeShopActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("75e4c144", new Object[]{nativeShopActivity})).booleanValue();
        }
        return nativeShopActivity.G;
    }

    public static final /* synthetic */ boolean F3(NativeShopActivity nativeShopActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7042c101", new Object[]{nativeShopActivity})).booleanValue();
        }
        return nativeShopActivity.F;
    }

    public static final /* synthetic */ View G3(NativeShopActivity nativeShopActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("d73cd104", new Object[]{nativeShopActivity});
        }
        return nativeShopActivity.h;
    }

    public static final /* synthetic */ FrameLayout H3(NativeShopActivity nativeShopActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("2902a3ee", new Object[]{nativeShopActivity});
        }
        return nativeShopActivity.U4();
    }

    public static final /* synthetic */ ShopDataParser I3(NativeShopActivity nativeShopActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShopDataParser) ipChange.ipc$dispatch("605704c6", new Object[]{nativeShopActivity});
        }
        return nativeShopActivity.B;
    }

    public static final /* synthetic */ m J3(NativeShopActivity nativeShopActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m) ipChange.ipc$dispatch("beb93bd6", new Object[]{nativeShopActivity});
        }
        return nativeShopActivity.S;
    }

    public static final /* synthetic */ FrameLayout K3(NativeShopActivity nativeShopActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("bedd05aa", new Object[]{nativeShopActivity});
        }
        return nativeShopActivity.V4();
    }

    public static final /* synthetic */ ShopView L3(NativeShopActivity nativeShopActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShopView) ipChange.ipc$dispatch("d10e8c81", new Object[]{nativeShopActivity});
        }
        return nativeShopActivity.d;
    }

    public static final /* synthetic */ String M3(NativeShopActivity nativeShopActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a37ff40f", new Object[]{nativeShopActivity});
        }
        return nativeShopActivity.Y4();
    }

    public static final /* synthetic */ int N3(NativeShopActivity nativeShopActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dfb6cd77", new Object[]{nativeShopActivity})).intValue();
        }
        return nativeShopActivity.a5();
    }

    public static final /* synthetic */ View O3(NativeShopActivity nativeShopActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("c5580c2f", new Object[]{nativeShopActivity});
        }
        return nativeShopActivity.f;
    }

    public static final /* synthetic */ FrameLayout P3(NativeShopActivity nativeShopActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("33d02919", new Object[]{nativeShopActivity});
        }
        return nativeShopActivity.b5();
    }

    public static final /* synthetic */ int Q3(NativeShopActivity nativeShopActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a092cf6b", new Object[]{nativeShopActivity})).intValue();
        }
        return nativeShopActivity.c5();
    }

    public static final /* synthetic */ boolean R3(NativeShopActivity nativeShopActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b346261a", new Object[]{nativeShopActivity})).booleanValue();
        }
        return nativeShopActivity.K;
    }

    public static /* synthetic */ void R5(NativeShopActivity nativeShopActivity, boolean z, boolean z2, int i2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a272c12", new Object[]{nativeShopActivity, new Boolean(z), new Boolean(z2), new Integer(i2), obj});
            return;
        }
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        nativeShopActivity.Q5(z, z2);
    }

    public static final /* synthetic */ FrameLayout S3(NativeShopActivity nativeShopActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("83412303", new Object[]{nativeShopActivity});
        }
        return nativeShopActivity.d5();
    }

    public static final /* synthetic */ View T3(NativeShopActivity nativeShopActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("32837834", new Object[]{nativeShopActivity});
        }
        return nativeShopActivity.l;
    }

    public static final /* synthetic */ void U3(NativeShopActivity nativeShopActivity, boolean z, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95df6810", new Object[]{nativeShopActivity, new Boolean(z), new Integer(i2)});
        } else {
            nativeShopActivity.e5(z, i2);
        }
    }

    public static final /* synthetic */ boolean V3(NativeShopActivity nativeShopActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2aa58dd7", new Object[]{nativeShopActivity})).booleanValue();
        }
        return nativeShopActivity.j5();
    }

    public static final /* synthetic */ boolean W3(NativeShopActivity nativeShopActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9242d7ba", new Object[]{nativeShopActivity})).booleanValue();
        }
        return nativeShopActivity.l5();
    }

    public static final /* synthetic */ boolean X3(NativeShopActivity nativeShopActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c42649e5", new Object[]{nativeShopActivity})).booleanValue();
        }
        return nativeShopActivity.L;
    }

    public static final /* synthetic */ boolean Y3(NativeShopActivity nativeShopActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9d2f172f", new Object[]{nativeShopActivity})).booleanValue();
        }
        return nativeShopActivity.o5();
    }

    public static final /* synthetic */ boolean Z3(NativeShopActivity nativeShopActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fdd1b1f9", new Object[]{nativeShopActivity})).booleanValue();
        }
        return nativeShopActivity.M;
    }

    public static final /* synthetic */ void a4(NativeShopActivity nativeShopActivity, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f05e1466", new Object[]{nativeShopActivity, new Integer(i2)});
        } else {
            nativeShopActivity.q5(i2);
        }
    }

    public static final /* synthetic */ void b4(NativeShopActivity nativeShopActivity, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3279a74e", new Object[]{nativeShopActivity, new Integer(i2)});
        } else {
            nativeShopActivity.r5(i2);
        }
    }

    public static final /* synthetic */ void c4(NativeShopActivity nativeShopActivity, ShopDataParser shopDataParser, int i2, int i3, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30950341", new Object[]{nativeShopActivity, shopDataParser, new Integer(i2), new Integer(i3), str});
        } else {
            nativeShopActivity.s5(shopDataParser, i2, i3, str);
        }
    }

    public static final /* synthetic */ void d4(NativeShopActivity nativeShopActivity, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55a91441", new Object[]{nativeShopActivity, jSONObject});
        } else {
            nativeShopActivity.u5(jSONObject);
        }
    }

    public static final /* synthetic */ void e4(NativeShopActivity nativeShopActivity, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e81d9dd2", new Object[]{nativeShopActivity, view});
        } else {
            nativeShopActivity.j = view;
        }
    }

    public static final /* synthetic */ void f4(NativeShopActivity nativeShopActivity, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("688d7c43", new Object[]{nativeShopActivity, view});
        } else {
            nativeShopActivity.i = view;
        }
    }

    public static final /* synthetic */ void g4(NativeShopActivity nativeShopActivity, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35e73113", new Object[]{nativeShopActivity, view});
        } else {
            nativeShopActivity.g = view;
        }
    }

    public static final /* synthetic */ void h4(NativeShopActivity nativeShopActivity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc6421a0", new Object[]{nativeShopActivity, new Boolean(z)});
        } else {
            nativeShopActivity.G = z;
        }
    }

    public static final /* synthetic */ void i4(NativeShopActivity nativeShopActivity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff7ed7eb", new Object[]{nativeShopActivity, new Boolean(z)});
        } else {
            nativeShopActivity.F = z;
        }
    }

    public static /* synthetic */ Object ipc$super(NativeShopActivity nativeShopActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -962742886:
                super.onTrimMemory(((Number) objArr[0]).intValue());
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case -349229044:
                super.onConfigurationChanged((Configuration) objArr[0]);
                return null;
            case 188604040:
                super.onStop();
                return null;
            case 323739864:
                super.setRequestedOrientation(((Number) objArr[0]).intValue());
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 1246973220:
                return new Boolean(super.dispatchKeyEvent((KeyEvent) objArr[0]));
            case 1270686685:
                super.onLowMemory();
                return null;
            case 2133689546:
                super.onStart();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/NativeShopActivity");
        }
    }

    public static final /* synthetic */ void j4(NativeShopActivity nativeShopActivity, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf5e085c", new Object[]{nativeShopActivity, view});
        } else {
            nativeShopActivity.h = view;
        }
    }

    public static final /* synthetic */ void k4(NativeShopActivity nativeShopActivity, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("296fe7e5", new Object[]{nativeShopActivity, view});
        } else {
            nativeShopActivity.k = view;
        }
    }

    public static final /* synthetic */ boolean l3(NativeShopActivity nativeShopActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("37ff19d5", new Object[]{nativeShopActivity})).booleanValue();
        }
        return nativeShopActivity.x4();
    }

    public static final /* synthetic */ void l4(NativeShopActivity nativeShopActivity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf4e7437", new Object[]{nativeShopActivity, new Boolean(z)});
        } else {
            nativeShopActivity.M = z;
        }
    }

    public static final /* synthetic */ void m3(NativeShopActivity nativeShopActivity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0bdfd35", new Object[]{nativeShopActivity, str});
        } else {
            nativeShopActivity.z4(str);
        }
    }

    public static final /* synthetic */ void m4(NativeShopActivity nativeShopActivity, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("771bc273", new Object[]{nativeShopActivity, new Integer(i2)});
        } else {
            nativeShopActivity.x5(i2);
        }
    }

    public static final /* synthetic */ View n3(NativeShopActivity nativeShopActivity, DXTemplateItem dXTemplateItem, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("4bb2b581", new Object[]{nativeShopActivity, dXTemplateItem, jSONObject});
        }
        return nativeShopActivity.D4(dXTemplateItem, jSONObject);
    }

    public static final /* synthetic */ void n4(NativeShopActivity nativeShopActivity, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25162df9", new Object[]{nativeShopActivity, view});
        } else {
            nativeShopActivity.f = view;
        }
    }

    public static final /* synthetic */ void o3(NativeShopActivity nativeShopActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73c3e9ed", new Object[]{nativeShopActivity});
        } else {
            nativeShopActivity.I4();
        }
    }

    public static final /* synthetic */ void o4(NativeShopActivity nativeShopActivity, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b95c797", new Object[]{nativeShopActivity, new Integer(i2)});
        } else {
            nativeShopActivity.y5(i2);
        }
    }

    public static final /* synthetic */ void p3(NativeShopActivity nativeShopActivity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2765ecf1", new Object[]{nativeShopActivity, str});
        } else {
            nativeShopActivity.K4(str);
        }
    }

    public static final /* synthetic */ void p4(NativeShopActivity nativeShopActivity, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9230e2c", new Object[]{nativeShopActivity, view});
        } else {
            nativeShopActivity.l = view;
        }
    }

    public static final /* synthetic */ View q3(NativeShopActivity nativeShopActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("f9960ece", new Object[]{nativeShopActivity});
        }
        return nativeShopActivity.j;
    }

    public static final /* synthetic */ void q4(NativeShopActivity nativeShopActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("433f6925", new Object[]{nativeShopActivity});
        } else {
            nativeShopActivity.z5();
        }
    }

    public static final /* synthetic */ FrameLayout r3(NativeShopActivity nativeShopActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("994b0db8", new Object[]{nativeShopActivity});
        }
        return nativeShopActivity.M4();
    }

    public static final /* synthetic */ void r4(NativeShopActivity nativeShopActivity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b29d362", new Object[]{nativeShopActivity, new Boolean(z)});
        } else {
            nativeShopActivity.D5(z);
        }
    }

    public static final /* synthetic */ FrameLayout s3(NativeShopActivity nativeShopActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("7c23238f", new Object[]{nativeShopActivity});
        }
        return nativeShopActivity.N4();
    }

    public static final /* synthetic */ void s4(NativeShopActivity nativeShopActivity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51c7a483", new Object[]{nativeShopActivity, new Boolean(z)});
        } else {
            nativeShopActivity.E5(z);
        }
    }

    public static final /* synthetic */ boolean t3(NativeShopActivity nativeShopActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f8d008f8", new Object[]{nativeShopActivity})).booleanValue();
        }
        return nativeShopActivity.I;
    }

    public static final /* synthetic */ void t4(NativeShopActivity nativeShopActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9abdaa5d", new Object[]{nativeShopActivity});
        } else {
            nativeShopActivity.F5();
        }
    }

    public static /* synthetic */ void t5(NativeShopActivity nativeShopActivity, ShopDataParser shopDataParser, int i2, int i3, String str, int i4, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cd5585b", new Object[]{nativeShopActivity, shopDataParser, new Integer(i2), new Integer(i3), str, new Integer(i4), obj});
            return;
        }
        if ((i4 & 8) != 0) {
            str = "click";
        }
        nativeShopActivity.s5(shopDataParser, i2, i3, str);
    }

    public static final /* synthetic */ b u3(NativeShopActivity nativeShopActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("12964c3", new Object[]{nativeShopActivity});
        }
        return nativeShopActivity.C;
    }

    public static final /* synthetic */ void u4(NativeShopActivity nativeShopActivity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("890cb332", new Object[]{nativeShopActivity, new Boolean(z)});
        } else {
            nativeShopActivity.I5(z);
        }
    }

    public static final /* synthetic */ View v3(NativeShopActivity nativeShopActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bb2ea99c", new Object[]{nativeShopActivity});
        }
        nativeShopActivity.getClass();
        return null;
    }

    public static final /* synthetic */ void v4(NativeShopActivity nativeShopActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("684d8354", new Object[]{nativeShopActivity});
        } else {
            nativeShopActivity.S5();
        }
    }

    public static final /* synthetic */ View w3(NativeShopActivity nativeShopActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("2d20356d", new Object[]{nativeShopActivity});
        }
        return nativeShopActivity.g;
    }

    public static final /* synthetic */ void w4(NativeShopActivity nativeShopActivity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0bd553c", new Object[]{nativeShopActivity, new Boolean(z)});
        } else {
            nativeShopActivity.U5(z);
        }
    }

    public static final /* synthetic */ int x3(NativeShopActivity nativeShopActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ca33c4e0", new Object[]{nativeShopActivity})).intValue();
        }
        return nativeShopActivity.z;
    }

    public static final /* synthetic */ int y3(NativeShopActivity nativeShopActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c36dcc6a", new Object[]{nativeShopActivity})).intValue();
        }
        return nativeShopActivity.A;
    }

    public static final /* synthetic */ Uri z3(NativeShopActivity nativeShopActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("a33dc6b5", new Object[]{nativeShopActivity});
        }
        return nativeShopActivity.R4();
    }

    public final void A4(JSONObject jSONObject, g1a<? super View, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72290124", new Object[]{this, jSONObject, g1aVar});
            return;
        }
        JSONObject Z4 = Z4("tb_shop_header_goods_nav");
        if (Z4 != null) {
            L4(Z4, jSONObject, g1aVar);
        }
    }

    public final void B4(JSONObject jSONObject, g1a<? super View, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c8234c7", new Object[]{this, jSONObject, g1aVar});
            return;
        }
        JSONObject Z4 = Z4("tb_shop_header_search_goods");
        if (Z4 != null) {
            L4(Z4, jSONObject, g1aVar);
        }
    }

    public final void B5() {
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
                ups Q4 = Q4();
                if (Q4 != null && Q4.B() && Q4.f() == NativeShopRenderContainerType.TYPE_H5 && (c2 = ShopIndexWebViewPreload.INSTANCE.c()) != null) {
                    c2.printPreloadStatus();
                    if (!c2.getAlreadyPreloadPageFinished() || c2.getAlreadyInjectOnNShopPreloadResume()) {
                        npp.Companion.b("try to preload shopIndex web early , but not finished");
                    } else {
                        ShopDataParser shopDataParser = this.B;
                        if (shopDataParser != null) {
                            c2.setShopId(shopDataParser.W0());
                            ShopDataParser shopDataParser2 = this.B;
                            if (shopDataParser2 != null) {
                                c2.setShopData(shopDataParser2);
                                c2.setOuterCtx(this);
                                c2.setCurrentPageName(Q4.k());
                                c2.startRenderByRealUrl(Q4.n());
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
                    ShopDataParser shopDataParser3 = this.B;
                    if (shopDataParser3 != null) {
                        shopDataParser3.J2(c2);
                    } else {
                        ckf.y("shopDataParser");
                        throw null;
                    }
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

    public final void C4(JSONObject jSONObject, g1a<? super View, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d125703", new Object[]{this, jSONObject, g1aVar});
            return;
        }
        JSONObject Z4 = Z4("tb_shop_bottom_bar");
        if (Z4 != null) {
            L4(Z4, jSONObject, g1aVar);
        }
    }

    public final View D4(DXTemplateItem dXTemplateItem, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("12d6610d", new Object[]{this, dXTemplateItem, jSONObject});
        }
        DinamicXEngine dinamicXEngine = this.e;
        if (dinamicXEngine != null) {
            DXTemplateItem u = dinamicXEngine.u(dXTemplateItem);
            DinamicXEngine dinamicXEngine2 = this.e;
            if (dinamicXEngine2 != null) {
                DXResult<DXRootView> o2 = dinamicXEngine2.o(this, u);
                DinamicXEngine dinamicXEngine3 = this.e;
                if (dinamicXEngine3 != null) {
                    dinamicXEngine3.j1(o2.f7291a, jSONObject);
                    DXRootView dXRootView = o2.f7291a;
                    ckf.f(dXRootView, "viewResult.result");
                    kew.T(dXRootView);
                    DXRootView dXRootView2 = o2.f7291a;
                    ckf.f(dXRootView2, "viewResult.result");
                    return dXRootView2;
                }
                ckf.y(gbv.PARAM_KEY_DX_ENGINE);
                throw null;
            }
            ckf.y(gbv.PARAM_KEY_DX_ENGINE);
            throw null;
        }
        ckf.y(gbv.PARAM_KEY_DX_ENGINE);
        throw null;
    }

    public final void D5(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa7318c2", new Object[]{this, new Boolean(z)});
            return;
        }
        View view = this.g;
        if (view != null) {
            DinamicXEngine dinamicXEngine = this.e;
            if (dinamicXEngine == null) {
                ckf.y(gbv.PARAM_KEY_DX_ENGINE);
                throw null;
            } else if (view != null) {
                ShopExtKt.w0(dinamicXEngine, view, mop.KEY_IS_SHOW_LIVE_ICON, Boolean.valueOf(z));
            } else {
                ckf.y("bottomView");
                throw null;
            }
        }
    }

    public final void E4(JSONObject jSONObject, g1a<? super View, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52eaf6da", new Object[]{this, jSONObject, g1aVar});
            return;
        }
        JSONObject Z4 = Z4("tb_shop_header_info");
        if (Z4 != null) {
            L4(Z4, jSONObject, g1aVar);
        }
    }

    public final void E5(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6aae8c41", new Object[]{this, new Boolean(z)});
        } else {
            runOnUiThread(new r(z));
        }
    }

    public final void F4(JSONObject jSONObject, g1a<? super View, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1eaef1", new Object[]{this, jSONObject, g1aVar});
            return;
        }
        JSONObject Z4 = Z4("tb_shop_header_loft_entrance");
        if (Z4 != null) {
            L4(Z4, jSONObject, g1aVar);
        }
    }

    public final void F5() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f6cfa87", new Object[]{this});
            return;
        }
        J5(X4());
        N5();
    }

    public final void G4(JSONObject jSONObject, g1a<? super View, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("918c0d9", new Object[]{this, jSONObject, g1aVar});
            return;
        }
        JSONObject Z4 = Z4("tb_shop_header_tab_index");
        if (Z4 != null) {
            L4(Z4, jSONObject, g1aVar);
        }
    }

    public final void G5() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3002a764", new Object[]{this});
            return;
        }
        ShopDataParser shopDataParser = this.B;
        if (shopDataParser != null) {
            if (!this.K && !this.J) {
                return;
            }
            if (shopDataParser != null) {
                a1v.j(this, shopDataParser);
            } else {
                ckf.y("shopDataParser");
                throw null;
            }
        }
    }

    public final void H4(JSONObject jSONObject, g1a<? super View, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd0ad1", new Object[]{this, jSONObject, g1aVar});
            return;
        }
        JSONObject Z4 = Z4("tb_shop_header_index_nav");
        if (Z4 != null) {
            L4(Z4, jSONObject, g1aVar);
        }
    }

    public final void H5() {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54aafb20", new Object[]{this});
        } else if (!this.H || (view = this.k) == null) {
        } else {
            if (view != null) {
                JSONObject jSONObject = (JSONObject) ((DXRootView) view).getData().clone();
                jSONObject.put((JSONObject) mop.KEY_PROMOTION_TAB, (String) Boolean.valueOf(m5()));
                DinamicXEngine dinamicXEngine = this.e;
                if (dinamicXEngine != null) {
                    View view2 = this.k;
                    if (view2 != null) {
                        dinamicXEngine.j1((DXRootView) view2, jSONObject);
                    } else {
                        ckf.y("shopLoftEntranceView");
                        throw null;
                    }
                } else {
                    ckf.y(gbv.PARAM_KEY_DX_ENGINE);
                    throw null;
                }
            } else {
                ckf.y("shopLoftEntranceView");
                throw null;
            }
        }
    }

    public final void I4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84ac44f7", new Object[]{this});
            return;
        }
        NativeShopActivity$downgradeToMiniAppShop$block$1 nativeShopActivity$downgradeToMiniAppShop$block$1 = new NativeShopActivity$downgradeToMiniAppShop$block$1(this);
        if (r54.h()) {
            r54.C(new NativeShopActivity$downgradeToMiniAppShop$1(nativeShopActivity$downgradeToMiniAppShop$block$1));
        } else {
            nativeShopActivity$downgradeToMiniAppShop$block$1.invoke();
        }
    }

    public final void I5(boolean z) {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e395472", new Object[]{this, new Boolean(z)});
        } else if (this.I && o5() && (view = this.h) != null) {
            DinamicXEngine dinamicXEngine = this.e;
            if (dinamicXEngine == null) {
                ckf.y(gbv.PARAM_KEY_DX_ENGINE);
                throw null;
            } else if (view != null) {
                ShopExtKt.w0(dinamicXEngine, view, mop.KEY_IS_SHOW_NEW_LIVE_CARD, Boolean.valueOf(z));
            } else {
                ckf.y("secondView");
                throw null;
            }
        }
    }

    public final void J4(JSONObject jSONObject, u1a<? super DXTemplateItem, ? super Boolean, xhv> u1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb002358", new Object[]{this, jSONObject, u1aVar});
            return;
        }
        DXTemplateItem S4 = S4(jSONObject);
        HashMap<String, u1a<DXTemplateItem, Boolean, xhv>> hashMap = this.f3047a;
        String str = S4.f7343a;
        ckf.f(str, "dxTemplateItem.name");
        hashMap.put(str, u1aVar);
        DinamicXEngine dinamicXEngine = this.e;
        if (dinamicXEngine != null) {
            dinamicXEngine.p(xz3.e(S4));
        } else {
            ckf.y(gbv.PARAM_KEY_DX_ENGINE);
            throw null;
        }
    }

    public final void K5(String str, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b33fc1df", new Object[]{this, str, new Integer(i2)});
            return;
        }
        npp.a aVar = npp.Companion;
        aVar.b("update stage error : " + str + " , errorCode = " + i2);
    }

    public final void L5(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eaa22c54", new Object[]{this, str});
            return;
        }
        ckf.g(str, v4s.PARAM_UPLOAD_STAGE);
        try {
            ShopDataParser shopDataParser = this.B;
            if (shopDataParser != null) {
                shopDataParser.X2(str);
                Result.m1108constructorimpl(xhv.INSTANCE);
                return;
            }
            ckf.y("shopDataParser");
            throw null;
        } catch (Throwable th) {
            Result.m1108constructorimpl(kotlin.b.a(th));
        }
    }

    public final FrameLayout M4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("88d39a16", new Object[]{this});
        }
        return (FrameLayout) this.q.getValue();
    }

    public final void M5(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcb4ad34", new Object[]{this, str, obj});
            return;
        }
        ckf.g(str, v4s.PARAM_UPLOAD_STAGE);
        try {
            ShopDataParser shopDataParser = this.B;
            if (shopDataParser != null) {
                shopDataParser.Y2(str, obj);
                Result.m1108constructorimpl(xhv.INSTANCE);
                return;
            }
            ckf.y("shopDataParser");
            throw null;
        } catch (Throwable th) {
            Result.m1108constructorimpl(kotlin.b.a(th));
        }
    }

    public final FrameLayout N4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("ac0d041f", new Object[]{this});
        }
        return (FrameLayout) this.p.getValue();
    }

    public final void N5() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac2754bb", new Object[]{this});
            return;
        }
        View view = this.f;
        if (view == null || !this.J) {
            return;
        }
        if (view != null) {
            JSONObject jSONObject = (JSONObject) ((DXRootView) view).getData().clone();
            JSONObject jSONObject2 = jSONObject.getJSONObject("carData");
            if (jSONObject2 != null) {
                jSONObject2.put("followStatus", (Object) Boolean.valueOf(this.F));
            }
            DinamicXEngine dinamicXEngine = this.e;
            if (dinamicXEngine != null) {
                View view2 = this.f;
                if (view2 != null) {
                    dinamicXEngine.j1((DXRootView) view2, jSONObject);
                } else {
                    ckf.y("topView");
                    throw null;
                }
            } else {
                ckf.y(gbv.PARAM_KEY_DX_ENGINE);
                throw null;
            }
        } else {
            ckf.y("topView");
            throw null;
        }
    }

    public final jwk O4(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jwk) ipChange.ipc$dispatch("123cf978", new Object[]{this, str});
        }
        if (str == null) {
            return null;
        }
        k kVar = this.O.get(str);
        if (kVar != null) {
            return kVar;
        }
        k kVar2 = new k(this);
        this.O.put(str, kVar2);
        return kVar2;
    }

    public final String P4() {
        JSONObject g2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f927f6fc", new Object[]{this});
        }
        b bVar = this.C;
        if (bVar != null) {
            Fragment b2 = bVar.b(this.z);
            String str = "";
            if (b2 == null || !(b2 instanceof ShopStandardFragment)) {
                return str;
            }
            int u2 = ((ShopStandardFragment) b2).u2();
            ShopDataParser shopDataParser = this.B;
            if (shopDataParser != null) {
                JSONArray f2 = brf.f(shopDataParser.u1(), this.z);
                if (f2 == null || (g2 = brf.g(f2, u2)) == null) {
                    return str;
                }
                Object obj = g2.get("name");
                if (obj instanceof String) {
                    str = obj;
                }
                return str;
            }
            ckf.y("shopDataParser");
            throw null;
        }
        ckf.y("bottomBarManager");
        throw null;
    }

    public final void P5(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4cf3fcc", new Object[]{this, new Boolean(z)});
            return;
        }
        View view = this.f;
        if (view != null) {
            DinamicXEngine dinamicXEngine = this.e;
            if (dinamicXEngine == null) {
                ckf.y(gbv.PARAM_KEY_DX_ENGINE);
                throw null;
            } else if (view != null) {
                ShopExtKt.w0(dinamicXEngine, view, mop.KEY_IS_TRANSPARENT, Boolean.valueOf(z));
            } else {
                ckf.y("topView");
                throw null;
            }
        }
    }

    public final ups Q4() {
        JSONArray jSONArray;
        ShopDataParser shopDataParser;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ups) ipChange.ipc$dispatch("d947ba19", new Object[]{this});
        }
        ShopDataParser shopDataParser2 = this.B;
        if (shopDataParser2 != null) {
            try {
                jSONArray = shopDataParser2.u1().getJSONArray(this.z);
                shopDataParser = this.B;
            } catch (Throwable th) {
                Result.m1108constructorimpl(kotlin.b.a(th));
            }
            if (shopDataParser != null) {
                ups a2 = new pps(jSONArray, shopDataParser, this.z).a(this.A);
                if (a2 != null) {
                    return a2;
                }
                Result.m1108constructorimpl(null);
                return null;
            }
            ckf.y("shopDataParser");
            throw null;
        } else {
            ckf.y("shopDataParser");
            throw null;
        }
    }

    public final void Q5(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cfa1e5a", new Object[]{this, new Boolean(z), new Boolean(z2)});
        } else if (this.f != null) {
            if ((this.I && o5()) || z2) {
                P5(z);
                ShopView shopView = this.d;
                if (shopView != null) {
                    shopView.updateTopViewTransparentStyle(z);
                } else {
                    ckf.y("shopView");
                    throw null;
                }
            }
        }
    }

    public final DXTemplateItem S4(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXTemplateItem) ipChange.ipc$dispatch("f5fcbb47", new Object[]{this, jSONObject});
        }
        DXTemplateItem dXTemplateItem = new DXTemplateItem();
        Object obj = jSONObject.get("url");
        if (obj != null) {
            dXTemplateItem.c = (String) obj;
            dXTemplateItem.b = Long.parseLong(String.valueOf(jSONObject.get("version")));
            Object obj2 = jSONObject.get("name");
            if (obj2 != null) {
                dXTemplateItem.f7343a = (String) obj2;
                return dXTemplateItem;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
    }

    public final void S5() {
        UnreadInfo unreadInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d470e270", new Object[]{this});
        } else if (this.f == null || this.i == null) {
            npp.Companion.b("unread msg : view not init");
        } else {
            MessageBoxService messageBoxService = (MessageBoxService) GlobalContainer.getInstance().get(MessageBoxService.class);
            if (messageBoxService != null && (unreadInfo = messageBoxService.getUnreadInfo()) != null) {
                npp.Companion.b(ckf.p("unread msg : ", Integer.valueOf(unreadInfo.getTipNumber())));
                DinamicXEngine dinamicXEngine = this.e;
                if (dinamicXEngine != null) {
                    View view = this.f;
                    if (view != null) {
                        ShopExtKt.w0(dinamicXEngine, view, mop.KEY_MSG_COUNT, Integer.valueOf(unreadInfo.getTipNumber()));
                        DinamicXEngine dinamicXEngine2 = this.e;
                        if (dinamicXEngine2 != null) {
                            View view2 = this.i;
                            if (view2 != null) {
                                ShopExtKt.w0(dinamicXEngine2, view2, mop.KEY_MSG_COUNT, Integer.valueOf(unreadInfo.getTipNumber()));
                            } else {
                                ckf.y("babyTopView");
                                throw null;
                            }
                        } else {
                            ckf.y(gbv.PARAM_KEY_DX_ENGINE);
                            throw null;
                        }
                    } else {
                        ckf.y("topView");
                        throw null;
                    }
                } else {
                    ckf.y(gbv.PARAM_KEY_DX_ENGINE);
                    throw null;
                }
            }
        }
    }

    public final String T4(String str) {
        Uri data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("eca53144", new Object[]{this, str});
        }
        if (str == null || getIntent() == null || (data = getIntent().getData()) == null) {
            return null;
        }
        return data.getQueryParameter(str);
    }

    public final void T5(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e66a2ff", new Object[]{this, new Boolean(z)});
        } else if (this.K && this.l != null) {
            DinamicXEngine dinamicXEngine = this.e;
            if (dinamicXEngine != null) {
                View view = this.f;
                if (view != null) {
                    ShopExtKt.w0(dinamicXEngine, view, "showShopName", Boolean.valueOf(z));
                } else {
                    ckf.y("topView");
                    throw null;
                }
            } else {
                ckf.y(gbv.PARAM_KEY_DX_ENGINE);
                throw null;
            }
        }
    }

    public final FrameLayout U4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("1ba65a0", new Object[]{this});
        }
        return (FrameLayout) this.o.getValue();
    }

    public final void U5(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("185ef8a8", new Object[]{this, new Boolean(z)});
            return;
        }
        if (!this.K) {
            I5(z);
        }
        R5(this, z, false, 2, null);
        O5(z);
    }

    public final FrameLayout V4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("6ae36964", new Object[]{this});
        }
        return (FrameLayout) this.r.getValue();
    }

    public final String X4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8bd4aa01", new Object[]{this});
        }
        ShopDataParser shopDataParser = this.B;
        if (shopDataParser == null) {
            return this.w;
        }
        if (shopDataParser != null) {
            JSONArray f2 = brf.f(shopDataParser.u1(), this.z);
            if (f2 == null) {
                return this.w;
            }
            JSONObject g2 = brf.g(f2, this.A);
            if (g2 == null) {
                return this.w;
            }
            String str = this.w;
            Object obj = g2.get("name");
            if (obj instanceof String) {
                str = obj;
            }
            return str;
        }
        ckf.y("shopDataParser");
        throw null;
    }

    public final String Y4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1715a04d", new Object[]{this});
        }
        ShopDataParser shopDataParser = this.B;
        if (shopDataParser == null) {
            return this.v;
        }
        if (shopDataParser != null) {
            JSONObject h2 = shopDataParser.h();
            JSONArray jSONArray = new JSONArray();
            Object obj = h2.get("tabData");
            if (obj instanceof JSONArray) {
                jSONArray = obj;
            }
            JSONObject g2 = brf.g(jSONArray, this.z);
            if (g2 == null) {
                return this.v;
            }
            String str = this.v;
            Object obj2 = g2.get("name");
            if (obj2 instanceof String) {
                str = obj2;
            }
            return str;
        }
        ckf.y("shopDataParser");
        throw null;
    }

    public final int a5() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cd44ffb3", new Object[]{this})).intValue();
        }
        return ((Number) ((glk) this.t).b(this, $$delegatedProperties[6])).intValue();
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

    public final FrameLayout b5() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("ca72f4d5", new Object[]{this});
        }
        return (FrameLayout) this.n.getValue();
    }

    public final int c5() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a398ccbf", new Object[]{this})).intValue();
        }
        return ((Number) ((glk) this.u).b(this, $$delegatedProperties[7])).intValue();
    }

    @Override // tb.iop
    public ShopDataParser d0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShopDataParser) ipChange.ipc$dispatch("a3670ddb", new Object[]{this});
        }
        ShopDataParser shopDataParser = this.B;
        if (shopDataParser == null) {
            return null;
        }
        if (shopDataParser != null) {
            return shopDataParser;
        }
        ckf.y("shopDataParser");
        throw null;
    }

    public final FrameLayout d5() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("104013ab", new Object[]{this});
        }
        return (FrameLayout) this.s.getValue();
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        FrameLayout frameLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4a534d24", new Object[]{this, keyEvent})).booleanValue();
        }
        if (!(keyEvent == null || keyEvent.getKeyCode() != 4 || (frameLayout = this.m) == null)) {
            if (frameLayout == null) {
                ckf.y("authPage");
                throw null;
            } else if (frameLayout.getChildCount() != 0) {
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public final void f5() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1075fdc1", new Object[]{this});
            return;
        }
        this.b.p(new DefaultTbShopActionListener(this));
        this.b.a(kht.headerBangDan, new DefaultTbShopActionListener(this));
        this.b.a(kht.bottomBarArea, new a(this));
        this.b.a(kht.headerGoodsNavArea, new g(this));
        this.b.a(kht.headerIndexNavArea, new d(this));
        this.b.a(kht.headerSearchGoodsArea, new DefaultTbShopActionListener(this));
        this.b.a(kht.headerGoodsNavArea, new h(this));
        this.b.a(kht.headerInfoArea, new f(this));
        this.b.a(kht.headerLoftEntrance, new i(this));
        this.b.a(kht.headerIndexVideoShop, new e(this));
    }

    public final void h5() {
        CarShopView carShopView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8cb6ef2", new Object[]{this});
            return;
        }
        ShopDataParser shopDataParser = this.B;
        if (shopDataParser != null) {
            if (shopDataParser.N1()) {
                CarShopView carShopView2 = new CarShopView(this);
                ShopDataParser shopDataParser2 = this.B;
                if (shopDataParser2 != null) {
                    carShopView2.setShopHeaderNeedScrollMask(shopDataParser2.V0());
                    carShopView = carShopView2;
                } else {
                    ckf.y("shopDataParser");
                    throw null;
                }
            } else {
                ShopDataParser shopDataParser3 = this.B;
                if (shopDataParser3 == null) {
                    ckf.y("shopDataParser");
                    throw null;
                } else if (shopDataParser3.h2()) {
                    VideoShopView videoShopView = new VideoShopView(this);
                    ShopDataParser shopDataParser4 = this.B;
                    if (shopDataParser4 != null) {
                        videoShopView.setVideoShopBackgroundPicUrl(shopDataParser4.x1());
                        carShopView = videoShopView;
                    } else {
                        ckf.y("shopDataParser");
                        throw null;
                    }
                } else {
                    ShopDataParser shopDataParser5 = this.B;
                    if (shopDataParser5 == null) {
                        ckf.y("shopDataParser");
                        throw null;
                    } else if (shopDataParser5.J1()) {
                        carShopView = new BigCardShopView(this);
                    } else {
                        carShopView = new ShopView(this);
                    }
                }
            }
            this.d = carShopView;
            ShopDataParser shopDataParser6 = this.B;
            if (shopDataParser6 != null) {
                carShopView.setShopData(shopDataParser6);
                ShopDataParser shopDataParser7 = this.B;
                if (shopDataParser7 != null) {
                    ShopView shopView = this.d;
                    if (shopView != null) {
                        shopDataParser7.H2(shopView.getShopContentMaxHeightGetter());
                        ShopView shopView2 = this.d;
                        if (shopView2 != null) {
                            View findViewById = shopView2.findViewById(R.id.shop_view_auth_page_new);
                            ckf.f(findViewById, "shopView.findViewById(R.id.shop_view_auth_page_new)");
                            this.m = (FrameLayout) findViewById;
                            int W4 = W4();
                            ShopView shopView3 = this.d;
                            if (shopView3 != null) {
                                shopView3.setStatusBarHeight(W4);
                                ShopView shopView4 = this.d;
                                if (shopView4 != null) {
                                    shopView4.setHeadCollapsedCallback(new NativeShopActivity$initShopView$1(this));
                                    ShopView shopView5 = this.d;
                                    if (shopView5 != null) {
                                        shopView5.setWillHeadCollapsedCallback(new NativeShopActivity$initShopView$2(this));
                                        ShopView shopView6 = this.d;
                                        if (shopView6 != null) {
                                            shopView6.setCanSwipeDownDetector(new NativeShopActivity$initShopView$3(this));
                                        } else {
                                            ckf.y("shopView");
                                            throw null;
                                        }
                                    } else {
                                        ckf.y("shopView");
                                        throw null;
                                    }
                                } else {
                                    ckf.y("shopView");
                                    throw null;
                                }
                            } else {
                                ckf.y("shopView");
                                throw null;
                            }
                        } else {
                            ckf.y("shopView");
                            throw null;
                        }
                    } else {
                        ckf.y("shopView");
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

    public final boolean j5() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fc6e8755", new Object[]{this})).booleanValue();
        }
        return ckf.b(X4(), "allitems");
    }

    public final boolean k5() {
        jwk.a e2;
        jwk.a e3;
        jwk.a e4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("baf724a6", new Object[]{this})).booleanValue();
        }
        if (this.J) {
            k kVar = this.O.get(P4());
            if (!(kVar == null || (e4 = kVar.e()) == null)) {
                return e4.a();
            }
        } else if (o5()) {
            k kVar2 = this.O.get(P4());
            if (!(kVar2 == null || (e3 = kVar2.e()) == null)) {
                return e3.a();
            }
        } else {
            k kVar3 = this.O.get(P4());
            if (kVar3 == null || (e2 = kVar3.e()) == null) {
                return false;
            }
            return e2.a();
        }
        return true;
    }

    public final boolean l5() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7a65b4d2", new Object[]{this})).booleanValue();
        }
        return ckf.b(mop.KEY_DONG_TAI, X4());
    }

    public final boolean m5() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("39b7af6", new Object[]{this})).booleanValue();
        }
        return ckf.b("promotion", X4());
    }

    public final boolean o5() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7ccf84fd", new Object[]{this})).booleanValue();
        }
        return ckf.b(mop.KEY_SHOP_INDEX, X4());
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x01b1 A[Catch: all -> 0x01c8, TryCatch #2 {all -> 0x01c8, blocks: (B:68:0x01ad, B:70:0x01b1, B:72:0x01b8, B:74:0x01bf, B:77:0x01ca, B:78:0x01cd, B:79:0x01ce, B:80:0x01d1, B:81:0x01d2, B:82:0x01d5), top: B:92:0x01ad }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01d2 A[Catch: all -> 0x01c8, TryCatch #2 {all -> 0x01c8, blocks: (B:68:0x01ad, B:70:0x01b1, B:72:0x01b8, B:74:0x01bf, B:77:0x01ca, B:78:0x01cd, B:79:0x01ce, B:80:0x01d1, B:81:0x01d2, B:82:0x01d5), top: B:92:0x01ad }] */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(android.os.Bundle r8) {
        /*
            Method dump skipped, instructions count: 489
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.triver.triver_shop.newShop.NativeShopActivity.onCreate(android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        Object obj;
        DinamicXEngine dinamicXEngine;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        try {
            w5();
            dinamicXEngine = this.e;
        } catch (Throwable th) {
            obj = Result.m1108constructorimpl(kotlin.b.a(th));
        }
        if (dinamicXEngine != null) {
            dinamicXEngine.q0();
            this.b.m();
            rop.INSTANCE.a().j(this);
            ln9.INSTANCE.a(this);
            ShopBroadcastController.f(this).u();
            LocalBroadcastManager.getInstance(this).unregisterReceiver(this.c);
            obj = Result.m1108constructorimpl(xhv.INSTANCE);
            Throwable th2 = Result.m1111exceptionOrNullimpl(obj);
            if (th2 != null) {
                npp.Companion.c("onDestroy exp : ", th2);
            }
            npp.Companion.b("nShop destroyed");
            return;
        }
        ckf.y(gbv.PARAM_KEY_DX_ENGINE);
        throw null;
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
            shopDataParser = this.B;
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

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        C5();
        super.onPause();
        DinamicXEngine dinamicXEngine = this.e;
        if (dinamicXEngine != null) {
            dinamicXEngine.r0();
        }
        ShopView shopView = this.d;
        if (shopView != null) {
            shopView.onActivityPaused();
        }
        npp.Companion.a("native shop onPause");
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        super.onStart();
        DinamicXEngine dinamicXEngine = this.e;
        if (dinamicXEngine != null) {
            dinamicXEngine.v0();
        } else {
            ckf.y(gbv.PARAM_KEY_DX_ENGINE);
            throw null;
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        super.onStop();
        DinamicXEngine dinamicXEngine = this.e;
        if (dinamicXEngine == null) {
            return;
        }
        if (dinamicXEngine != null) {
            dinamicXEngine.w0();
        } else {
            ckf.y(gbv.PARAM_KEY_DX_ENGINE);
            throw null;
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i2) {
        Object obj;
        ShopDataParser shopDataParser;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c69db59a", new Object[]{this, new Integer(i2)});
            return;
        }
        super.onTrimMemory(i2);
        try {
            shopDataParser = this.B;
        } catch (Throwable th) {
            obj = Result.m1108constructorimpl(kotlin.b.a(th));
        }
        if (shopDataParser != null) {
            shopDataParser.p(i2);
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

    public final void r5(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aea40b54", new Object[]{this, new Integer(i2)});
        } else {
            A5(this.z, i2);
        }
    }

    public final void s5(ShopDataParser shopDataParser, int i2, int i3, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc8cf48f", new Object[]{this, shopDataParser, new Integer(i2), new Integer(i3), str});
            return;
        }
        brp.m(shopDataParser, i2, i3, str);
        if (!this.H) {
            return;
        }
        if (o5()) {
            ShopUTExposeEventKt.b(shopDataParser);
        } else {
            ShopUTExposeEventKt.c(shopDataParser);
        }
    }

    @Override // android.app.Activity
    public void setRequestedOrientation(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("134be0d8", new Object[]{this, new Integer(i2)});
        } else if (i2 == 1) {
            super.setRequestedOrientation(i2);
        }
    }

    public final void u5(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8d41b7b", new Object[]{this, jSONObject});
            return;
        }
        npp.Companion.a(jSONObject == null ? null : jSONObject.toString());
        if (jSONObject != null) {
            ShopDataParser shopDataParser = this.B;
            if (shopDataParser != null) {
                Uri.Builder buildUpon = Uri.parse(shopDataParser.M0()).buildUpon();
                ckf.f(buildUpon, "builder");
                r54.a(buildUpon, jSONObject);
                buildUpon.appendQueryParameter(h1p.KEY_SUGGEST_RN, jSONObject.getString("suggestRn"));
                String uri = buildUpon.build().toString();
                ckf.f(uri, "builder.build().toString()");
                jSONObject.put((JSONObject) "url", uri);
                DinamicXEngine dinamicXEngine = this.e;
                if (dinamicXEngine != null) {
                    View view = this.f;
                    if (view != null) {
                        ShopExtKt.w0(dinamicXEngine, view, "searchInfo", jSONObject);
                        DinamicXEngine dinamicXEngine2 = this.e;
                        if (dinamicXEngine2 != null) {
                            View view2 = this.i;
                            if (view2 != null) {
                                ShopExtKt.w0(dinamicXEngine2, view2, "searchInfo", jSONObject);
                            } else {
                                ckf.y("babyTopView");
                                throw null;
                            }
                        } else {
                            ckf.y(gbv.PARAM_KEY_DX_ENGINE);
                            throw null;
                        }
                    } else {
                        ckf.y("topView");
                        throw null;
                    }
                } else {
                    ckf.y(gbv.PARAM_KEY_DX_ENGINE);
                    throw null;
                }
            } else {
                ckf.y("shopDataParser");
                throw null;
            }
        }
    }

    public final void v5() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d41e175e", new Object[]{this});
        } else {
            r54.E(new NativeShopActivity$requestFloatData$1(this), 1000L);
        }
    }

    public final void w5() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1da37f4", new Object[]{this});
        } else if (aqp.Companion.w()) {
            ShopDataParser shopDataParser = this.B;
            if (shopDataParser != null) {
                LocalBroadcastManager.getInstance(shopDataParser.Q()).sendBroadcast(new Intent(w6f.PAGE_SHOP_PAUSE_ACTION));
            } else {
                ckf.y("shopDataParser");
                throw null;
            }
        }
    }

    public final boolean x4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6ae3397", new Object[]{this})).booleanValue();
        }
        if (this.J) {
            return k5();
        }
        if (!o5() || !this.I) {
            return true;
        }
        return k5();
    }

    public final void x5(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9f074f", new Object[]{this, new Integer(i2)});
        } else {
            ((glk) this.t).a(this, $$delegatedProperties[6], Integer.valueOf(i2));
        }
    }

    public final void y4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0cf0e29", new Object[]{this});
            return;
        }
        String T4 = T4("sellerId");
        if (T4 != null) {
            oop.a nativeShopActivity$checkHasFollowed$followCallback$1 = new oop.a() { // from class: com.alibaba.triver.triver_shop.newShop.NativeShopActivity$checkHasFollowed$followCallback$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(NativeShopActivity$checkHasFollowed$followCallback$1 nativeShopActivity$checkHasFollowed$followCallback$12, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/NativeShopActivity$checkHasFollowed$followCallback$1");
                }

                @Override // tb.oop.a
                public void a(boolean z) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("630464bf", new Object[]{this, new Boolean(z)});
                        return;
                    }
                    NativeShopActivity.J3(NativeShopActivity.this).a(z);
                    if (!z) {
                        ShopDataParser I3 = NativeShopActivity.I3(NativeShopActivity.this);
                        if (I3 != null) {
                            ShopExtKt.q0(I3, false, new NativeShopActivity$checkHasFollowed$followCallback$1$followResult$1(NativeShopActivity.this));
                        } else {
                            ckf.y("shopDataParser");
                            throw null;
                        }
                    }
                    npp.Companion.b(ckf.p("first follow status : ", Boolean.valueOf(z)));
                }
            };
            if (aqp.Companion.w0()) {
                ShopDataParser shopDataParser = this.B;
                if (shopDataParser != null) {
                    nativeShopActivity$checkHasFollowed$followCallback$1.a(shopDataParser.U1());
                } else {
                    ckf.y("shopDataParser");
                    throw null;
                }
            } else {
                oop.b(this, T4, nativeShopActivity$checkHasFollowed$followCallback$1);
            }
        }
    }

    public final void y5(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f93f22b", new Object[]{this, new Integer(i2)});
        } else {
            ((glk) this.u).a(this, $$delegatedProperties[7], Integer.valueOf(i2));
        }
    }

    public final void z5() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f68bf", new Object[]{this});
            return;
        }
        p pVar = new p();
        if (this.F) {
            oop.c(this, T4("sellerId"), pVar);
        } else {
            oop.a(this, T4("sellerId"), pVar);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final HashMap<Integer, Fragment> f3056a = new HashMap<>();
        public final /* synthetic */ NativeShopActivity b;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public static final class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ NativeShopActivity f3057a;
            public final /* synthetic */ Ref$ObjectRef<Fragment> b;

            public a(NativeShopActivity nativeShopActivity, Ref$ObjectRef<Fragment> ref$ObjectRef) {
                this.f3057a = nativeShopActivity;
                this.b = ref$ObjectRef;
            }

            @Override // java.lang.Runnable
            public final void run() {
                FragmentTransaction beginTransaction;
                FragmentTransaction show;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                FragmentManager supportFragmentManager = this.f3057a.getSupportFragmentManager();
                if (!(supportFragmentManager == null || (beginTransaction = supportFragmentManager.beginTransaction()) == null || (show = beginTransaction.show(this.b.element)) == null)) {
                    show.commitNow();
                }
                Fragment fragment = this.b.element;
                if (fragment instanceof ShopStandardFragment) {
                    ((ShopStandardFragment) fragment).z2();
                }
            }
        }

        static {
            t2o.a(766509356);
        }

        public b(NativeShopActivity nativeShopActivity) {
            ckf.g(nativeShopActivity, "this$0");
            this.b = nativeShopActivity;
        }

        public final Fragment b(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Fragment) ipChange.ipc$dispatch("9303a8c7", new Object[]{this, new Integer(i)});
            }
            return this.f3056a.get(Integer.valueOf(i));
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v16, types: [T, androidx.fragment.app.Fragment] */
        /* JADX WARN: Type inference failed for: r1v2, types: [T, java.lang.Object] */
        /* JADX WARN: Unknown variable types count: 1 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void c(int r5) {
            /*
                r4 = this;
                com.android.alibaba.ip.runtime.IpChange r0 = com.alibaba.triver.triver_shop.newShop.NativeShopActivity.b.$ipChange
                boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
                if (r1 == 0) goto L_0x001a
                java.lang.Integer r1 = new java.lang.Integer
                r1.<init>(r5)
                r5 = 2
                java.lang.Object[] r5 = new java.lang.Object[r5]
                r2 = 0
                r5[r2] = r4
                r2 = 1
                r5[r2] = r1
                java.lang.String r1 = "8bb7fa7f"
                r0.ipc$dispatch(r1, r5)
                return
            L_0x001a:
                kotlin.jvm.internal.Ref$ObjectRef r0 = new kotlin.jvm.internal.Ref$ObjectRef
                r0.<init>()
                java.util.HashMap<java.lang.Integer, androidx.fragment.app.Fragment> r1 = r4.f3056a
                java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
                java.lang.Object r1 = r1.get(r2)
                r0.element = r1
                if (r1 != 0) goto L_0x0033
                androidx.fragment.app.Fragment r1 = r4.a(r5)
                r0.element = r1
            L_0x0033:
                T r1 = r0.element
                if (r1 != 0) goto L_0x0038
                return
            L_0x0038:
                java.util.HashMap<java.lang.Integer, androidx.fragment.app.Fragment> r1 = r4.f3056a
                java.util.Collection r1 = r1.values()
                java.util.Iterator r1 = r1.iterator()
            L_0x0042:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L_0x006c
                java.lang.Object r2 = r1.next()
                androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
                if (r2 != 0) goto L_0x0051
                goto L_0x0042
            L_0x0051:
                com.alibaba.triver.triver_shop.newShop.NativeShopActivity r3 = r4.b
                androidx.fragment.app.FragmentManager r3 = r3.getSupportFragmentManager()
                if (r3 != 0) goto L_0x005a
                goto L_0x0042
            L_0x005a:
                androidx.fragment.app.FragmentTransaction r3 = r3.beginTransaction()
                if (r3 != 0) goto L_0x0061
                goto L_0x0042
            L_0x0061:
                androidx.fragment.app.FragmentTransaction r2 = r3.hide(r2)
                if (r2 != 0) goto L_0x0068
                goto L_0x0042
            L_0x0068:
                r2.commitNow()
                goto L_0x0042
            L_0x006c:
                T r1 = r0.element
                androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
                boolean r1 = r1.isAdded()
                if (r1 != 0) goto L_0x00b8
                com.alibaba.triver.triver_shop.newShop.NativeShopActivity r1 = r4.b
                androidx.fragment.app.FragmentManager r1 = r1.getSupportFragmentManager()
                if (r1 != 0) goto L_0x007f
                goto L_0x00a4
            L_0x007f:
                androidx.fragment.app.FragmentTransaction r1 = r1.beginTransaction()
                if (r1 != 0) goto L_0x0086
                goto L_0x00a4
            L_0x0086:
                com.alibaba.triver.triver_shop.newShop.NativeShopActivity r2 = r4.b
                com.alibaba.triver.triver_shop.newShop.view.ShopView r2 = com.alibaba.triver.triver_shop.newShop.NativeShopActivity.L3(r2)
                if (r2 == 0) goto L_0x00b0
                com.alibaba.triver.triver_shop.newShop.view.ShopSwipeListenerLayout r2 = r2.getCenterContainer()
                int r2 = r2.getId()
                T r3 = r0.element
                androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
                androidx.fragment.app.FragmentTransaction r1 = r1.add(r2, r3)
                if (r1 != 0) goto L_0x00a1
                goto L_0x00a4
            L_0x00a1:
                r1.commitNow()
            L_0x00a4:
                java.util.HashMap<java.lang.Integer, androidx.fragment.app.Fragment> r1 = r4.f3056a
                java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
                T r3 = r0.element
                r1.put(r2, r3)
                goto L_0x00b8
            L_0x00b0:
                java.lang.String r5 = "shopView"
                tb.ckf.y(r5)
                r5 = 0
                throw r5
            L_0x00b8:
                com.alibaba.triver.triver_shop.newShop.NativeShopActivity r1 = r4.b
                com.alibaba.triver.triver_shop.newShop.NativeShopActivity$b$a r2 = new com.alibaba.triver.triver_shop.newShop.NativeShopActivity$b$a
                r2.<init>(r1, r0)
                r1.runOnUiThread(r2)
                com.alibaba.triver.triver_shop.newShop.NativeShopActivity r0 = r4.b
                com.alibaba.triver.triver_shop.newShop.NativeShopActivity.a4(r0, r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.alibaba.triver.triver_shop.newShop.NativeShopActivity.b.c(int):void");
        }

        public final void d(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7f653eea", new Object[]{this, new Integer(i), new Integer(i2)});
                return;
            }
            Fragment b = b(i);
            if (b instanceof ShopStandardFragment) {
                ((ShopStandardFragment) b).C2(i2);
            }
        }

        public final Fragment a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Fragment) ipChange.ipc$dispatch("b2169c9e", new Object[]{this, new Integer(i)});
            }
            if (NativeShopActivity.I3(this.b) == null) {
                return null;
            }
            ShopDataParser I3 = NativeShopActivity.I3(this.b);
            if (I3 != null) {
                JSONArray u1 = I3.u1();
                if (u1.size() <= i) {
                    return null;
                }
                ShopDataParser I32 = NativeShopActivity.I3(this.b);
                if (I32 != null) {
                    JSONArray jSONArray = I32.h().getJSONArray("tabData");
                    if (jSONArray == null) {
                        return null;
                    }
                    int size = u1.size();
                    pps[] ppsVarArr = new pps[size];
                    for (int i2 = 0; i2 < size; i2++) {
                        JSONArray jSONArray2 = u1.getJSONArray(i2);
                        ShopDataParser I33 = NativeShopActivity.I3(this.b);
                        if (I33 != null) {
                            ppsVarArr[i2] = new pps(jSONArray2, I33, i2);
                        } else {
                            ckf.y("shopDataParser");
                            throw null;
                        }
                    }
                    ShopStandardFragment shopStandardFragment = new ShopStandardFragment();
                    HomePageTabFragmentViewProvider homePageTabFragmentViewProvider = new HomePageTabFragmentViewProvider(ppsVarArr[i]);
                    shopStandardFragment.B2(homePageTabFragmentViewProvider);
                    ShopView L3 = NativeShopActivity.L3(this.b);
                    if (L3 != null) {
                        homePageTabFragmentViewProvider.i(L3.getViewPageChangeListener());
                        if (NativeShopActivity.R3(this.b)) {
                            homePageTabFragmentViewProvider.i(new VideoShopViewPagerListener(this.b));
                        } else {
                            Object obj = jSONArray.getJSONObject(i).get("name");
                            if (ckf.b(obj, mop.KEY_SHOP_INDEX_BAR)) {
                                homePageTabFragmentViewProvider.i(new HomePageViewPagerListener(this.b));
                            } else if (ckf.b(obj, mop.KEY_ALL_ITEMS)) {
                                homePageTabFragmentViewProvider.i(new BabyPageViewPagerListener(this.b));
                            } else {
                                homePageTabFragmentViewProvider.i(new DefaultViewPagerListener(this.b));
                            }
                        }
                        return shopStandardFragment;
                    }
                    ckf.y("shopView");
                    throw null;
                }
                ckf.y("shopDataParser");
                throw null;
            }
            ckf.y("shopDataParser");
            throw null;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public final class k implements jwk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public boolean f3062a;
        public jwk.a b;
        public final /* synthetic */ NativeShopActivity c;

        static {
            t2o.a(766509383);
            t2o.a(766510478);
        }

        public k(NativeShopActivity nativeShopActivity) {
            ckf.g(nativeShopActivity, "this$0");
            this.c = nativeShopActivity;
        }

        @Override // tb.jwk
        public boolean a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("da2b03ee", new Object[]{this})).booleanValue();
            }
            return this.f3062a;
        }

        @Override // tb.jwk
        public void c(jwk.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fc4094a4", new Object[]{this, aVar});
            } else {
                this.b = aVar;
            }
        }

        @Override // tb.jwk
        public void d(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4b0f86ac", new Object[]{this, new Boolean(z)});
            } else {
                this.f3062a = z;
            }
        }

        public final jwk.a e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (jwk.a) ipChange.ipc$dispatch("dc2bf8e9", new Object[]{this});
            }
            return this.b;
        }

        @Override // tb.jwk
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9daca77a", new Object[]{this});
                return;
            }
            if (NativeShopActivity.X3(this.c)) {
                NativeShopActivity.R5(this.c, true, false, 2, null);
                NativeShopActivity.u4(this.c, true);
            }
            ShopView L3 = NativeShopActivity.L3(this.c);
            if (L3 != null) {
                L3.onHomePageWebViewScrollToTop();
            } else {
                ckf.y("shopView");
                throw null;
            }
        }
    }

    public final void L4(JSONObject jSONObject, JSONObject jSONObject2, g1a<? super View, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f5443c0", new Object[]{this, jSONObject, jSONObject2, g1aVar});
            return;
        }
        DinamicXEngine dinamicXEngine = this.e;
        if (dinamicXEngine != null) {
            DXTemplateItem u = dinamicXEngine.u(S4(jSONObject));
            if (u == null || !TextUtils.equals(jSONObject.getString("version"), String.valueOf(u.b))) {
                J4(jSONObject, new NativeShopActivity$fetchAndDownloadDxTemplate$1(g1aVar, this, jSONObject2, jSONObject));
                return;
            }
            g1aVar.invoke(D4(u, jSONObject2));
            x5(a5() + 1);
            L5(mop.KEY_PAGE_LOADED);
            npp.Companion.b(ckf.p("dx template fetch success : ", u.toString()));
            return;
        }
        ckf.y(gbv.PARAM_KEY_DX_ENGINE);
        throw null;
    }

    public final int W4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a1b6fc8c", new Object[]{this})).intValue();
        }
        int identifier = getApplication().getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return getApplication().getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public final void e5(boolean z, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ba2da32", new Object[]{this, new Boolean(z), new Integer(i2)});
            return;
        }
        this.L = z;
        if (!z) {
            ShopBroadcastController.f(this).m(T4("shopId"), kew.O(Integer.valueOf(i2)));
        } else {
            ShopBroadcastController.f(this).n(T4("shopId"), kew.O(Integer.valueOf(i2)));
            ShopDataParser shopDataParser = this.B;
            if (shopDataParser != null) {
                ShopUTExposeEventKt.n(shopDataParser);
            } else {
                ckf.y("shopDataParser");
                throw null;
            }
        }
        T5(!z);
    }

    public final void g5() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f42c7c2b", new Object[]{this});
            return;
        }
        gp0.a(this, new iy5.b(), true);
        DinamicXEngine dinamicXEngine = new DinamicXEngine(new DXEngineConfig.b("shop").Q(2).b0(true).F());
        this.e = dinamicXEngine;
        dinamicXEngine.W0(mop.TB_SHOP_TAP_EVENT_CODE, new j(this));
        DinamicXEngine dinamicXEngine2 = this.e;
        if (dinamicXEngine2 != null) {
            dinamicXEngine2.a1(new l());
        } else {
            ckf.y(gbv.PARAM_KEY_DX_ENGINE);
            throw null;
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb2f300c", new Object[]{this, configuration});
            return;
        }
        ckf.g(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        if (rop.INSTANCE.b() && this.B != null) {
            boolean z = !TBAutoSizeConfig.x().T(this);
            ShopDataParser shopDataParser = this.B;
            if (shopDataParser != null) {
                khu.h(this, ShopExtKt.A(shopDataParser, z));
            } else {
                ckf.y("shopDataParser");
                throw null;
            }
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        Object obj;
        ShopDataParser shopDataParser;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        DinamicXEngine dinamicXEngine = this.e;
        if (dinamicXEngine != null) {
            dinamicXEngine.s0();
            ShopView shopView = this.d;
            if (shopView != null) {
                if (shopView != null) {
                    shopView.onActivityResumed();
                } else {
                    ckf.y("shopView");
                    throw null;
                }
            }
            r54.C(new NativeShopActivity$onResume$2(this));
            UTAnalytics.getInstance().getDefaultTracker().pageAppearDonotSkip(this);
            try {
                if (!this.Q && this.R) {
                    Intent intent = getIntent();
                    ckf.f(intent, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
                    ShopExtKt.m(intent, this);
                    this.Q = true;
                }
                obj = Result.m1108constructorimpl(xhv.INSTANCE);
            } catch (Throwable th) {
                obj = Result.m1108constructorimpl(kotlin.b.a(th));
            }
            Throwable th2 = Result.m1111exceptionOrNullimpl(obj);
            if (th2 != null) {
                npp.Companion.c("catching block has error", th2);
            }
            ShopBroadcastController.f(this).p(T4("shopId"));
            ShopBroadcastController.f(this).j(T4("shopId"));
            r54.F(new NativeShopActivity$onResume$4(this));
            try {
                shopDataParser = this.B;
            } catch (Throwable th3) {
                Result.m1108constructorimpl(kotlin.b.a(th3));
            }
            if (shopDataParser != null) {
                ShopUTExposeEventKt.h(shopDataParser);
                ShopDataParser shopDataParser2 = this.B;
                if (shopDataParser2 != null) {
                    ShopUTExposeEventKt.l(shopDataParser2);
                    if (this.L) {
                        ShopDataParser shopDataParser3 = this.B;
                        if (shopDataParser3 != null) {
                            ShopUTExposeEventKt.n(shopDataParser3);
                        } else {
                            ckf.y("shopDataParser");
                            throw null;
                        }
                    }
                    Result.m1108constructorimpl(xhv.INSTANCE);
                    npp.Companion.a("native shop onResume");
                    return;
                }
                ckf.y("shopDataParser");
                throw null;
            }
            ckf.y("shopDataParser");
            throw null;
        } else {
            ckf.y(gbv.PARAM_KEY_DX_ENGINE);
            throw null;
        }
    }

    public final void q5(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3b6dd3c", new Object[]{this, new Integer(i2)});
            return;
        }
        if (i2 == 0) {
            ShopView shopView = this.d;
            if (shopView != null) {
                shopView.switchToHomePageBottomTab();
            } else {
                ckf.y("shopView");
                throw null;
            }
        } else if (i2 != 1) {
            ShopView shopView2 = this.d;
            if (shopView2 != null) {
                shopView2.switchToOtherBottomTab();
            } else {
                ckf.y("shopView");
                throw null;
            }
        } else {
            ShopView shopView3 = this.d;
            if (shopView3 != null) {
                shopView3.switchToBabyBottomTab();
            } else {
                ckf.y("shopView");
                throw null;
            }
        }
        A5(i2, this.A);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public final class OnInnerPageReadyListener implements ShopBroadcastController.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ NativeShopActivity f3050a;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public static final class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ NativeShopActivity f3051a;

            public a(NativeShopActivity nativeShopActivity) {
                this.f3051a = nativeShopActivity;
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                ShopView L3 = NativeShopActivity.L3(this.f3051a);
                if (L3 != null) {
                    L3.resetScrollContainer();
                    ShopView L32 = NativeShopActivity.L3(this.f3051a);
                    if (L32 != null) {
                        L32.liveCardExpanded(false);
                    } else {
                        ckf.y("shopView");
                        throw null;
                    }
                } else {
                    ckf.y("shopView");
                    throw null;
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public static final class b implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ NativeShopActivity f3052a;

            public b(NativeShopActivity nativeShopActivity) {
                this.f3052a = nativeShopActivity;
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                ShopView L3 = NativeShopActivity.L3(this.f3052a);
                if (L3 != null) {
                    L3.stopScrollContainer();
                    ShopView L32 = NativeShopActivity.L3(this.f3052a);
                    if (L32 != null) {
                        L32.liveCardExpanded(true);
                    } else {
                        ckf.y("shopView");
                        throw null;
                    }
                } else {
                    ckf.y("shopView");
                    throw null;
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public static final class c implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ NativeShopActivity f3053a;

            public c(NativeShopActivity nativeShopActivity) {
                this.f3053a = nativeShopActivity;
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                NativeShopActivity.R5(this.f3053a, false, false, 2, null);
                NativeShopActivity.r4(this.f3053a, false);
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public static final class d implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ NativeShopActivity f3054a;
            public final /* synthetic */ Pair<Integer, Integer> b;

            public d(NativeShopActivity nativeShopActivity, Pair<Integer, Integer> pair) {
                this.f3054a = nativeShopActivity;
                this.b = pair;
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                b u3 = NativeShopActivity.u3(this.f3054a);
                if (u3 != null) {
                    u3.c(this.b.getFirst().intValue());
                    b u32 = NativeShopActivity.u3(this.f3054a);
                    if (u32 != null) {
                        u32.d(this.b.getFirst().intValue(), this.b.getSecond().intValue());
                        DinamicXEngine B3 = NativeShopActivity.B3(this.f3054a);
                        if (B3 != null) {
                            View w3 = NativeShopActivity.w3(this.f3054a);
                            if (w3 != null) {
                                ShopExtKt.w0(B3, w3, mop.KEY_SELECTED_INDEX, this.b.getFirst());
                            } else {
                                ckf.y("bottomView");
                                throw null;
                            }
                        } else {
                            ckf.y(gbv.PARAM_KEY_DX_ENGINE);
                            throw null;
                        }
                    } else {
                        ckf.y("bottomBarManager");
                        throw null;
                    }
                } else {
                    ckf.y("bottomBarManager");
                    throw null;
                }
            }
        }

        static {
            t2o.a(766509371);
            t2o.a(766509480);
        }

        public OnInnerPageReadyListener(NativeShopActivity nativeShopActivity) {
            ckf.g(nativeShopActivity, "this$0");
            this.f3050a = nativeShopActivity;
        }

        @Override // com.alibaba.triver.triver_shop.newShop.event.broadcast.ShopBroadcastController.b
        public void E0() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("48d9b014", new Object[]{this});
                return;
            }
            NativeShopActivity nativeShopActivity = this.f3050a;
            nativeShopActivity.runOnUiThread(new c(nativeShopActivity));
        }

        @Override // com.alibaba.triver.triver_shop.newShop.event.broadcast.ShopBroadcastController.b
        public void F0(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("440ac4c8", new Object[]{this, jSONObject});
            } else if (NativeShopActivity.I3(this.f3050a) != null) {
                ShopDataParser I3 = NativeShopActivity.I3(this.f3050a);
                if (I3 != null) {
                    I3.k1().c(jSONObject);
                } else {
                    ckf.y("shopDataParser");
                    throw null;
                }
            }
        }

        @Override // com.alibaba.triver.triver_shop.newShop.event.broadcast.ShopBroadcastController.b
        public void N2() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d696cb8f", new Object[]{this});
            } else if (NativeShopActivity.L3(this.f3050a) != null) {
                NativeShopActivity nativeShopActivity = this.f3050a;
                nativeShopActivity.runOnUiThread(new a(nativeShopActivity));
            }
        }

        @Override // com.alibaba.triver.triver_shop.newShop.event.broadcast.ShopBroadcastController.b
        public void T(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3cbecc25", new Object[]{this, str, str2});
            } else if (str != null) {
                ShopDataParser I3 = NativeShopActivity.I3(this.f3050a);
                if (I3 != null) {
                    I3.f(str, str2);
                    ShopDataParser I32 = NativeShopActivity.I3(this.f3050a);
                    if (I32 != null) {
                        Pair<Integer, Integer> Q = ShopExtKt.Q(str, I32.u1());
                        NativeShopActivity nativeShopActivity = this.f3050a;
                        nativeShopActivity.runOnUiThread(new d(nativeShopActivity, Q));
                        return;
                    }
                    ckf.y("shopDataParser");
                    throw null;
                }
                ckf.y("shopDataParser");
                throw null;
            }
        }

        @Override // com.alibaba.triver.triver_shop.newShop.event.broadcast.ShopBroadcastController.b
        public void W0(String str, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ea6cad4c", new Object[]{this, str, jSONObject});
            }
        }

        @Override // com.alibaba.triver.triver_shop.newShop.event.broadcast.ShopBroadcastController.b
        public ShopDataParser Y() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ShopDataParser) ipChange.ipc$dispatch("16b01ba5", new Object[]{this});
            }
            if (NativeShopActivity.I3(this.f3050a) == null) {
                return null;
            }
            ShopDataParser I3 = NativeShopActivity.I3(this.f3050a);
            if (I3 != null) {
                return I3;
            }
            ckf.y("shopDataParser");
            throw null;
        }

        @Override // com.alibaba.triver.triver_shop.newShop.event.broadcast.ShopBroadcastController.b
        public void Y1(JSONArray jSONArray) {
            Object obj;
            ShopDataParser I3;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bf52def3", new Object[]{this, jSONArray});
                return;
            }
            try {
                I3 = NativeShopActivity.I3(this.f3050a);
            } catch (Throwable th) {
                obj = Result.m1108constructorimpl(kotlin.b.a(th));
            }
            if (I3 != null) {
                I3.V2(jSONArray);
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
            } else {
                r54.C(new NativeShopActivity$OnInnerPageReadyListener$onSubscribeStatusChanged$1(this.f3050a, z, jSONObject));
            }
        }

        @Override // com.alibaba.triver.triver_shop.newShop.event.broadcast.ShopBroadcastController.b
        public void h1() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8f6ae251", new Object[]{this});
            } else if (NativeShopActivity.L3(this.f3050a) != null) {
                NativeShopActivity nativeShopActivity = this.f3050a;
                nativeShopActivity.runOnUiThread(new b(nativeShopActivity));
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
                    if (L == NativeShopActivity.x3(this.f3050a) && L2 == NativeShopActivity.y3(this.f3050a)) {
                        ShopBroadcastController.f(this.f3050a).q(L, L2, this.f3050a.T4("shopId"));
                    } else {
                        aVar.a("onPageRead : but mainIndex and subIndex not match");
                    }
                }
            }
        }
    }

    public final void A5(int i2, int i3) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a5b5596", new Object[]{this, new Integer(i2), new Integer(i3)});
            return;
        }
        G5();
        if (i2 == this.z && i3 == this.A) {
            npp.Companion.b("same bottomIndex and subIndex, do not broadcast disappear");
        } else {
            ShopBroadcastController.f(this).s(this.z, this.A, T4("shopId"));
        }
        this.z = i2;
        this.A = i3;
        b bVar = this.C;
        if (bVar != null) {
            Fragment b2 = bVar.b(i2);
            if (b2 instanceof ShopStandardFragment) {
                this.A = ((ShopStandardFragment) b2).u2();
            }
            r54.F(new NativeShopActivity$toastCurrentTabIndex$1(this));
            ln9.INSTANCE.b(this, X4());
            ShopView shopView = this.d;
            if (shopView != null) {
                shopView.onAtmosphere(m5());
                ShopView shopView2 = this.d;
                if (shopView2 != null) {
                    shopView2.updateSubPageChanged(o5(), P4());
                    if (this.J) {
                        O5(true);
                    } else {
                        if (this.I && o5() && k5()) {
                            z = true;
                        }
                        Q5(z, true);
                    }
                    if (!this.H) {
                        kew.B(V4());
                    } else if (!this.I || !o5()) {
                        kew.g0(V4());
                    } else {
                        kew.B(V4());
                    }
                    J5(X4());
                    H5();
                    npp.a aVar = npp.Companion;
                    aVar.b("bottom index is = " + this.z + ", subIndex is = " + this.A);
                    aVar.b(ckf.p("isCurrentPage webView on Top : ", Boolean.valueOf(k5())));
                    return;
                }
                ckf.y("shopView");
                throw null;
            }
            ckf.y("shopView");
            throw null;
        }
        ckf.y("bottomBarManager");
        throw null;
    }

    public final void J5(String str) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e6dd97", new Object[]{this, str});
            return;
        }
        ShopDataParser shopDataParser = this.B;
        if (shopDataParser != null && this.h != null) {
            JSONObject D1 = shopDataParser.D1();
            D1.put((JSONObject) mop.KEY_PROMOTION_TAB, (String) Boolean.valueOf(m5()));
            D1.put((JSONObject) "followStatus", (String) Boolean.valueOf(this.F));
            D1.put((JSONObject) "currentTabName", str);
            ShopDataParser shopDataParser2 = this.B;
            if (shopDataParser2 != null) {
                JSONObject o0 = shopDataParser2.o0();
                if (o0 != null) {
                    Boolean bool = Boolean.FALSE;
                    Object obj = o0.get("hasLocalSign");
                    if (obj instanceof Boolean) {
                        bool = obj;
                    }
                    if (bool.booleanValue()) {
                        ShopDataParser shopDataParser3 = this.B;
                        if (shopDataParser3 != null) {
                            JSONObject o02 = shopDataParser3.o0();
                            Object clone = o02 == null ? null : o02.clone();
                            if (clone != null && (clone instanceof JSONObject)) {
                                ShopDataParser shopDataParser4 = this.B;
                                if (shopDataParser4 != null) {
                                    JSONArray n0 = shopDataParser4.n0(str);
                                    if (!n0.isEmpty()) {
                                        ((Map) clone).put("bizLogoList", n0);
                                    }
                                } else {
                                    ckf.y("shopDataParser");
                                    throw null;
                                }
                            }
                            D1.put((JSONObject) "headerData", (String) clone);
                        } else {
                            ckf.y("shopDataParser");
                            throw null;
                        }
                    }
                }
                if (this.K) {
                    z = this.I;
                } else if (!this.I || !o5() || !k5()) {
                    z = false;
                }
                D1.put((JSONObject) mop.KEY_IS_SHOW_NEW_LIVE_CARD, (String) Boolean.valueOf(z));
                DinamicXEngine dinamicXEngine = this.e;
                if (dinamicXEngine != null) {
                    View view = this.h;
                    if (view != null) {
                        dinamicXEngine.j1((DXRootView) view, D1);
                    } else {
                        ckf.y("secondView");
                        throw null;
                    }
                } else {
                    ckf.y(gbv.PARAM_KEY_DX_ENGINE);
                    throw null;
                }
            } else {
                ckf.y("shopDataParser");
                throw null;
            }
        }
    }

    public final void O5(boolean z) {
        boolean z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c59986e", new Object[]{this, new Boolean(z)});
            return;
        }
        View view = this.f;
        if (view != null && this.J) {
            JSONObject jSONObject = (JSONObject) ((DXRootView) view).getData().clone();
            ups Q4 = Q4();
            boolean z3 = Q4 != null && Q4.w();
            if (Q4 != null && Q4.G()) {
                if (!z) {
                    Boolean bool = Boolean.FALSE;
                    jSONObject.put((JSONObject) mop.KEY_IS_TRANSPARENT, (String) bool);
                    JSONObject jSONObject2 = jSONObject.getJSONObject("carData");
                    if (jSONObject2 != null) {
                        jSONObject2.put("isDarkBg", (Object) bool);
                    }
                    ShopView shopView = this.d;
                    if (shopView != null) {
                        shopView.updateTopViewTransparentStyle(false);
                    } else {
                        ckf.y("shopView");
                        throw null;
                    }
                } else {
                    boolean k5 = k5();
                    jSONObject.put((JSONObject) mop.KEY_IS_TRANSPARENT, (String) Boolean.valueOf(k5));
                    JSONObject jSONObject3 = jSONObject.getJSONObject("carData");
                    if (jSONObject3 != null) {
                        if (k5) {
                            z2 = z3;
                        }
                        jSONObject3.put("isDarkBg", (Object) Boolean.valueOf(z2));
                    }
                    ShopView shopView2 = this.d;
                    if (shopView2 != null) {
                        shopView2.updateTopViewTransparentStyle(k5);
                    } else {
                        ckf.y("shopView");
                        throw null;
                    }
                }
                DinamicXEngine dinamicXEngine = this.e;
                if (dinamicXEngine != null) {
                    View view2 = this.f;
                    if (view2 != null) {
                        dinamicXEngine.j1((DXRootView) view2, jSONObject);
                    } else {
                        ckf.y("topView");
                        throw null;
                    }
                } else {
                    ckf.y(gbv.PARAM_KEY_DX_ENGINE);
                    throw null;
                }
            } else {
                jSONObject.put((JSONObject) mop.KEY_IS_TRANSPARENT, (String) Boolean.TRUE);
                JSONObject jSONObject4 = jSONObject.getJSONObject("carData");
                if (jSONObject4 != null) {
                    jSONObject4.put("isDarkBg", (Object) Boolean.valueOf(z3));
                }
                DinamicXEngine dinamicXEngine2 = this.e;
                if (dinamicXEngine2 != null) {
                    View view3 = this.f;
                    if (view3 != null) {
                        dinamicXEngine2.j1((DXRootView) view3, jSONObject);
                        ShopView shopView3 = this.d;
                        if (shopView3 != null) {
                            shopView3.updateTopViewTransparentStyle(true);
                        } else {
                            ckf.y("shopView");
                            throw null;
                        }
                    } else {
                        ckf.y("topView");
                        throw null;
                    }
                } else {
                    ckf.y(gbv.PARAM_KEY_DX_ENGINE);
                    throw null;
                }
            }
        }
    }

    public final Uri R4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("1e0f4d3d", new Object[]{this});
        }
        Intent intent = getIntent();
        Intent intent2 = getIntent();
        if (!r54.f(intent, intent2 == null ? null : intent2.getData())) {
            return gop.a(getIntent().getData());
        }
        npp.Companion.b("intent or intent.data is null , downgrade failed , will finish activity");
        return null;
    }

    public final JSONObject Z4(String str) {
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("75584689", new Object[]{this, str});
        }
        JSONArray jSONArray = this.E;
        if (jSONArray == null) {
            return null;
        }
        ckf.d(jSONArray);
        int size = jSONArray.size();
        if (size > 0) {
            while (true) {
                int i3 = i2 + 1;
                JSONArray jSONArray2 = this.E;
                ckf.d(jSONArray2);
                Object obj = jSONArray2.get(i2);
                if ((obj instanceof HashMap) && ckf.b(str, ((Map) obj).get(yh6.CONFIG_KEY_TEMPLATE_NAME))) {
                    return ShopExtKt.p(new JSONObject((HashMap) obj));
                }
                if (obj instanceof JSONObject) {
                    JSONObject jSONObject = (JSONObject) obj;
                    if (ckf.b(str, jSONObject.get(yh6.CONFIG_KEY_TEMPLATE_NAME))) {
                        return ShopExtKt.p(jSONObject);
                    }
                }
                if (i3 >= size) {
                    break;
                }
                i2 = i3;
            }
        }
        return null;
    }

    public final void i5() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d39b6eb3", new Object[]{this});
            return;
        }
        ShopView shopView = this.d;
        if (shopView != null) {
            shopView.setFirstHeaderView(b5(), false);
            ShopView shopView2 = this.d;
            if (shopView2 != null) {
                shopView2.setSecondHeaderView(U4(), false);
                ShopView shopView3 = this.d;
                if (shopView3 != null) {
                    shopView3.setFirstHeaderView(N4(), true);
                    ShopView shopView4 = this.d;
                    if (shopView4 != null) {
                        shopView4.setSecondHeaderView(M4(), true);
                        ShopView shopView5 = this.d;
                        if (shopView5 != null) {
                            shopView5.setShopLoftEntrance(V4());
                            ShopView shopView6 = this.d;
                            if (shopView6 != null) {
                                shopView6.setTabViewInVideoShop(d5());
                                kew.C(b5());
                                kew.C(U4());
                                kew.C(N4());
                                kew.C(M4());
                                kew.B(V4());
                                kew.B(d5());
                                kew.R(b5(), U4(), N4(), M4(), V4(), d5());
                                return;
                            }
                            ckf.y("shopView");
                            throw null;
                        }
                        ckf.y("shopView");
                        throw null;
                    }
                    ckf.y("shopView");
                    throw null;
                }
                ckf.y("shopView");
                throw null;
            }
            ckf.y("shopView");
            throw null;
        }
        ckf.y("shopView");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00a6 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean n5() {
        /*
            Method dump skipped, instructions count: 416
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.triver.triver_shop.newShop.NativeShopActivity.n5():boolean");
    }

    static {
        t2o.a(766509353);
        t2o.a(766509448);
        a0g<Object>[] a0gVarArr = new a0g[8];
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(dun.b(NativeShopActivity.class), "templateLoadCount", "getTemplateLoadCount()I");
        dun.f(mutablePropertyReference1Impl);
        a0gVarArr[6] = mutablePropertyReference1Impl;
        MutablePropertyReference1Impl mutablePropertyReference1Impl2 = new MutablePropertyReference1Impl(dun.b(NativeShopActivity.class), "topViewLoadCount", "getTopViewLoadCount()I");
        dun.f(mutablePropertyReference1Impl2);
        a0gVarArr[7] = mutablePropertyReference1Impl2;
        $$delegatedProperties = a0gVarArr;
    }

    public final void C5() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27045ea1", new Object[]{this});
            return;
        }
        if (j5() && !this.J && !this.K) {
            a1v.f(this);
            a1v.k(this, kotlin.collections.a.k(jpu.a("shop_id", T4("shopId")), jpu.a("seller_id", T4("sellerId"))));
        }
        if (o5() && !this.J && !this.K) {
            a1v.l(this);
            a1v.k(this, kotlin.collections.a.k(jpu.a("shop_id", T4("shopId")), jpu.a("seller_id", T4("sellerId"))));
        }
        G5();
        UTAnalytics.getInstance().getDefaultTracker().pageDisAppear(this);
        ShopBroadcastController.f(this).k(T4("shopId"));
    }

    public final void K4(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0e0f747", new Object[]{this, str});
            return;
        }
        ShopDataParser shopDataParser = this.B;
        if (shopDataParser != null) {
            Pair a2 = jpu.a("shop_id", shopDataParser.W0());
            ShopDataParser shopDataParser2 = this.B;
            if (shopDataParser2 != null) {
                a1v.n(ShopConstants.PAGE_SHOP, str, kotlin.collections.a.j(a2, jpu.a("seller_id", shopDataParser2.N0())));
            } else {
                ckf.y("shopDataParser");
                throw null;
            }
        } else {
            ckf.y("shopDataParser");
            throw null;
        }
    }

    public final void z4(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97074b03", new Object[]{this, str});
            return;
        }
        ShopDataParser shopDataParser = this.B;
        if (shopDataParser != null) {
            Pair a2 = jpu.a("shop_id", shopDataParser.W0());
            ShopDataParser shopDataParser2 = this.B;
            if (shopDataParser2 != null) {
                a1v.m(ShopConstants.PAGE_SHOP, str, kotlin.collections.a.j(a2, jpu.a("seller_id", shopDataParser2.N0())));
            } else {
                ckf.y("shopDataParser");
                throw null;
            }
        } else {
            ckf.y("shopDataParser");
            throw null;
        }
    }

    public final void p5(JSONObject jSONObject) {
        int i2;
        Pair<Integer, Integer> pair;
        int i3 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73e74c8", new Object[]{this, jSONObject});
            return;
        }
        if (this.I) {
            ShopView shopView = this.d;
            if (shopView != null) {
                shopView.changeToBigCardMode();
            } else {
                ckf.y("shopView");
                throw null;
            }
        }
        ShopView shopView2 = this.d;
        if (shopView2 != null) {
            shopView2.setHasLoft(this.H);
            this.C = new b(this);
            ShopDataParser shopDataParser = this.B;
            if (shopDataParser != null) {
                JSONObject b1 = shopDataParser.b1();
                ShopDataParser shopDataParser2 = this.B;
                if (shopDataParser2 != null) {
                    JSONObject h2 = shopDataParser2.h();
                    h2.put((JSONObject) mop.KEY_IS_SHOW_LIVE_ICON, (String) Boolean.valueOf(this.I));
                    ShopDataParser shopDataParser3 = this.B;
                    if (shopDataParser3 != null) {
                        JSONObject C1 = shopDataParser3.C1();
                        ShopDataParser shopDataParser4 = this.B;
                        if (shopDataParser4 != null) {
                            JSONObject R2 = shopDataParser4.R2();
                            ShopDataParser shopDataParser5 = this.B;
                            if (shopDataParser5 != null) {
                                JSONArray jSONArray = shopDataParser5.h().getJSONArray("tabData");
                                ShopDataParser shopDataParser6 = this.B;
                                if (shopDataParser6 != null) {
                                    JSONObject E1 = shopDataParser6.E1();
                                    ShopDataParser shopDataParser7 = this.B;
                                    if (shopDataParser7 != null) {
                                        JSONArray u1 = shopDataParser7.u1();
                                        new Pair(0, 0);
                                        if (jSONArray == null) {
                                            i2 = 0;
                                        } else {
                                            if (this.x.length() == 0) {
                                                String str = this.y;
                                                if (str == null) {
                                                    str = "";
                                                }
                                                this.x = str;
                                            }
                                            if (!TextUtils.isEmpty(this.x)) {
                                                pair = ShopExtKt.Q(this.x, u1);
                                            } else {
                                                String str2 = this.v;
                                                String str3 = this.w;
                                                ShopDataParser shopDataParser8 = this.B;
                                                if (shopDataParser8 != null) {
                                                    pair = ShopExtKt.R(str2, str3, shopDataParser8);
                                                } else {
                                                    ckf.y("shopDataParser");
                                                    throw null;
                                                }
                                            }
                                            int intValue = pair.getFirst().intValue();
                                            i2 = pair.getSecond().intValue();
                                            i3 = intValue;
                                        }
                                        h2.put((JSONObject) mop.KEY_SELECTED_INDEX, (String) Integer.valueOf(i3));
                                        if (i3 == 0) {
                                            C1.put((JSONObject) mop.KEY_SELECTED_INDEX, (String) Integer.valueOf(i2));
                                        }
                                        if (i3 == 1) {
                                            R2.put((JSONObject) mop.KEY_SELECTED_INDEX, (String) Integer.valueOf(i2));
                                        }
                                        C4(h2, new NativeShopActivity$onFetchDataOk$1(this));
                                        H4(C1, new NativeShopActivity$onFetchDataOk$2(this));
                                        B4(E1, new NativeShopActivity$onFetchDataOk$3(this));
                                        ShopDataParser shopDataParser9 = this.B;
                                        if (shopDataParser9 != null) {
                                            E4(shopDataParser9.D1(), new NativeShopActivity$onFetchDataOk$4(this));
                                            A4(R2, new NativeShopActivity$onFetchDataOk$5(this));
                                            F4(b1, new NativeShopActivity$onFetchDataOk$6(this));
                                            G4(C1, new NativeShopActivity$onFetchDataOk$7(this));
                                            this.z = i3;
                                            this.A = i2;
                                            b bVar = this.C;
                                            if (bVar != null) {
                                                bVar.c(i3);
                                                b bVar2 = this.C;
                                                if (bVar2 != null) {
                                                    bVar2.d(i3, i2);
                                                    try {
                                                        M5(mop.KEY_TAB_KEY_NAME, X4());
                                                        Result.m1108constructorimpl(xhv.INSTANCE);
                                                    } catch (Throwable th) {
                                                        Result.m1108constructorimpl(kotlin.b.a(th));
                                                    }
                                                    ShopView shopView3 = this.d;
                                                    if (shopView3 != null) {
                                                        ShopDataParser shopDataParser10 = this.B;
                                                        if (shopDataParser10 != null) {
                                                            shopView3.renderAtmosphereImg(shopDataParser10.z());
                                                        } else {
                                                            ckf.y("shopDataParser");
                                                            throw null;
                                                        }
                                                    } else {
                                                        ckf.y("shopView");
                                                        throw null;
                                                    }
                                                } else {
                                                    ckf.y("bottomBarManager");
                                                    throw null;
                                                }
                                            } else {
                                                ckf.y("bottomBarManager");
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
            ckf.y("shopView");
            throw null;
        }
    }
}
