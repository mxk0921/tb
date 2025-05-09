package com.taobao.android.detail.alittdetail;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import com.ali.adapt.api.AliAdaptServiceManager;
import com.alibaba.ability.impl.performance.PerformanceAbility;
import com.alibaba.ability.localization.Localization;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.ut.abtest.UTABTest;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.bundleInfo.BundleInfoManager;
import com.taobao.android.AliLoginInterface;
import com.taobao.android.autosize.TBAutoSizeConfig;
import com.taobao.android.autosize.TBDeviceUtils;
import com.taobao.android.behavir.BehaviR;
import com.taobao.android.detail.alittdetail.collect.TaobaoCollectionHelper;
import com.taobao.android.detail.alittdetail.implementor.OpenPopDialogImplementor;
import com.taobao.android.detail.alittdetail.rate.DetailRatePrefetchAbility;
import com.taobao.android.detail.ttdetail.animation.addCartAnimation.AdvAddCartAnimController;
import com.taobao.android.detail.ttdetail.container.GalleryCore;
import com.taobao.android.detail.ttdetail.data.common.SimpleEntry;
import com.taobao.android.detail.ttdetail.data.meta.Item;
import com.taobao.android.detail.ttdetail.handler.bizhandlers.CollectorImplementor;
import com.taobao.android.detail.ttdetail.handler.bizhandlers.OpenSkuImplementor;
import com.taobao.android.detail.ttdetail.platformization.business.BizLifecycle;
import com.taobao.android.detail.ttdetail.utils.DataUtils;
import com.taobao.android.editionswitcher.PositionInfo;
import com.taobao.android.festival.FestivalMgr;
import com.taobao.android.msoa.callback.MSOAServiceListener;
import com.taobao.android.turbo.core.component.BaseOuterComponent;
import com.taobao.browser.jsbridge.CommonJsApiManager;
import com.taobao.calendar.aidl.business.CalendarAidlAdapter;
import com.taobao.calendar.aidl.listener.CalendarListener;
import com.taobao.calendar.aidl.model.ScheduleDTO;
import com.taobao.oversea.baobao.view.DXProgress;
import com.taobao.tao.Globals;
import com.taobao.tao.TaoApplication;
import com.taobao.tao.TaoPackageInfo;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Map;
import tb.a2c;
import tb.b5m;
import tb.bw7;
import tb.byj;
import tb.c21;
import tb.c5l;
import tb.chb;
import tb.cqv;
import tb.d2c;
import tb.dxt;
import tb.f9t;
import tb.fsm;
import tb.gx5;
import tb.gyb;
import tb.i17;
import tb.ia8;
import tb.j9t;
import tb.jm9;
import tb.kq0;
import tb.mqv;
import tb.mr7;
import tb.mvd;
import tb.n4l;
import tb.nch;
import tb.o78;
import tb.pa8;
import tb.qg7;
import tb.qi7;
import tb.r8c;
import tb.rrh;
import tb.t2o;
import tb.tgh;
import tb.tio;
import tb.vb3;
import tb.vbl;
import tb.vo2;
import tb.vrh;
import tb.wb3;
import tb.y4u;
import tb.yox;
import tb.ze7;

/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class TaobaoEvnInitializer {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "TaobaoEvnInitializer";

    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a implements b5m.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.b5m.c
        public void a(String str, String str2, String str3, View view, String... strArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1573a10a", new Object[]{this, str, str2, str3, view, strArr});
            } else {
                BehaviR.getInstance().trackDisAppear(str, str2, str3, view, strArr);
            }
        }

        @Override // tb.b5m.c
        public void b(String str, String str2, String str3, String... strArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d7d22102", new Object[]{this, str, str2, str3, strArr});
            } else {
                BehaviR.getInstance().commitNewTap(str, str2, str3, strArr);
            }
        }

        @Override // tb.b5m.c
        public void c(String str, String str2, String str3, View view, String... strArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("761a6532", new Object[]{this, str, str2, str3, view, strArr});
            } else {
                BehaviR.getInstance().trackAppear(str, str2, str3, view, strArr);
            }
        }

        @Override // tb.b5m.c
        public void commitEnter(String str, String str2, Object obj, String... strArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c564b847", new Object[]{this, str, str2, obj, strArr});
            } else {
                cqv.l(str, str2, obj, strArr);
            }
        }

        @Override // tb.b5m.c
        public void commitLeave(String str, String str2, Object obj, String... strArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e38feac8", new Object[]{this, str, str2, obj, strArr});
            } else {
                cqv.m(str, str2, obj, strArr);
            }
        }

        @Override // tb.b5m.c
        public void d(String str, Object obj, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a2c3823", new Object[]{this, str, obj, map});
            } else {
                cqv.O(str, obj, map);
            }
        }
    }

    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b implements b5m.l {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.b5m.l
        public String getLocation() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("d853caae", new Object[]{this});
            }
            return Localization.j();
        }

        @Override // tb.b5m.l
        public boolean isI18nEdition() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a6a02bc1", new Object[]{this})).booleanValue();
            }
            return Localization.o();
        }

        @Override // tb.b5m.l
        public String localizedString(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("9f754730", new Object[]{this, new Integer(i)});
            }
            return Localization.q(i);
        }
    }

    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class d implements b5m.t {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.b5m.t
        public void a(String... strArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2c6a8561", new Object[]{this, strArr});
            } else if (strArr != null) {
                yox.n(Arrays.asList(strArr));
            }
        }

        @Override // tb.b5m.t
        public void b(SimpleEntry<String, String> simpleEntry) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("913b60bf", new Object[]{this, simpleEntry});
            } else if (simpleEntry != null) {
                String key = simpleEntry.getKey();
                String value = simpleEntry.getValue();
                if (!TextUtils.isEmpty(key) && !TextUtils.isEmpty(value)) {
                    yox.n(Arrays.asList(key, value));
                }
            }
        }
    }

    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class f implements b5m.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.b5m.a
        public void a(String str, Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c36e54c0", new Object[]{this, str, context});
            } else if (!TextUtils.isEmpty(str) && context != null) {
                UTABTest.activateServer(str, context);
            }
        }
    }

    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class g implements b5m.r {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.b5m.r
        public String a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("1d39781e", new Object[]{this});
            }
            return TaoPackageInfo.getTTIDPackage();
        }

        @Override // tb.b5m.r
        public String b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("19cb53a8", new Object[]{this});
            }
            return TaoApplication.getTTID();
        }

        @Override // tb.b5m.r
        public String getAppVersion() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("65f009ac", new Object[]{this});
            }
            return TaoApplication.getVersion();
        }
    }

    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class h implements b5m.m {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.b5m.m
        public String a(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("dd0aec4c", new Object[]{this, context});
            }
            try {
                PositionInfo i = o78.i(context);
                if (i != null) {
                    return i.countryCode;
                }
                return null;
            } catch (Throwable th) {
                tgh.c(TaobaoEvnInitializer.TAG, "get CountryInfo failed.", th);
                return null;
            }
        }

        @Override // tb.b5m.m
        public String b(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("ef648cd8", new Object[]{this, context});
            }
            return nch.g().f24643a;
        }

        @Override // tb.b5m.m
        public String c(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("80694c01", new Object[]{this, context});
            }
            return nch.g().b;
        }
    }

    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class j implements b5m.z {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class a implements MSOAServiceListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ b5m.a0 f6548a;

            public a(j jVar, b5m.a0 a0Var) {
                this.f6548a = a0Var;
            }

            @Override // com.taobao.android.msoa.callback.MSOAServiceListener
            public void onFail(String str, String str2, boolean z, Map<String, Object> map) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("684c28e9", new Object[]{this, str, str2, new Boolean(z), map});
                    return;
                }
                b5m.a0 a0Var = this.f6548a;
                if (a0Var != null) {
                    ((OpenSkuImplementor.a) a0Var).a(str, str2, z, map);
                }
            }

            @Override // com.taobao.android.msoa.callback.MSOAServiceListener
            public void onSuccess(Map<String, Object> map) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("93e51c7a", new Object[]{this, map});
                    return;
                }
                b5m.a0 a0Var = this.f6548a;
                if (a0Var != null) {
                    ((OpenSkuImplementor.a) a0Var).b(map);
                }
            }
        }

        @Override // tb.b5m.z
        public void a(String str, String str2, String str3, String str4, Map<String, Object> map, b5m.a0 a0Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("60b20ef7", new Object[]{this, str, str2, str3, str4, map, a0Var});
            } else {
                rrh.e().o(new vrh(str, str2, str3, str4, map), new a(this, a0Var));
            }
        }
    }

    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class k implements b5m.w {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class a implements gyb {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a(k kVar) {
            }

            @Override // tb.gyb
            public void onFailed(int i, String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("6c2003aa", new Object[]{this, new Integer(i), str});
                    return;
                }
                tgh.b(TaobaoEvnInitializer.TAG, "readMuteSetting failed with code: " + i + " msg: " + str);
            }

            @Override // tb.gyb
            public void onSuccess(Object obj) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("ea580ec7", new Object[]{this, obj});
                    return;
                }
                tgh.b(TaobaoEvnInitializer.TAG, "readMuteSetting success with value: " + obj);
            }
        }

        @Override // tb.b5m.w
        public boolean a(Context context) {
            mvd mvdVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("3a2f3523", new Object[]{this, context})).booleanValue();
            }
            try {
                AliAdaptServiceManager instance = AliAdaptServiceManager.getInstance();
                if (!(instance == null || (mvdVar = (mvd) instance.findAliAdaptService(mvd.class)) == null)) {
                    return mvdVar.isAutoPlayVideoUnderCurrentNetwork(context);
                }
            } catch (Throwable th) {
                tgh.c(TaobaoEvnInitializer.TAG, "canAutoPlayInCurrentNetwork error: ", th);
            }
            return false;
        }

        @Override // tb.b5m.w
        public boolean b(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("c558b467", new Object[]{this, context})).booleanValue();
            }
            try {
                return Boolean.parseBoolean((String) j9t.e(context.getApplicationContext(), "TTDetail").b().d("TTDetail", "mute", "true", new a(this)));
            } catch (Throwable th) {
                tgh.c(TaobaoEvnInitializer.TAG, "isVideoMutePlay() exception", th);
                return true;
            }
        }
    }

    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class l implements b5m.v {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.b5m.v
        public String a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("fad2fc8f", new Object[]{this});
            }
            return mqv.n().k();
        }

        @Override // tb.b5m.v
        public void b(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5262327d", new Object[]{this, str, str2});
            } else {
                mqv.n().g(str, str2);
            }
        }

        @Override // tb.b5m.v
        public void c(String str, String str2, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4046ff56", new Object[]{this, str, str2, map});
            } else {
                mqv.n().s(str, str2, map);
            }
        }

        @Override // tb.b5m.v
        public void d(String str, String str2, String str3, String str4, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a58222c4", new Object[]{this, str, str2, str3, str4, map});
            } else {
                mqv.n().p(str, str2, str3, str4, map);
            }
        }

        @Override // tb.b5m.v
        public void e(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("33fd5cf3", new Object[]{this, str, str2});
            } else {
                mqv.n().d(str, str2);
            }
        }

        @Override // tb.b5m.v
        public void f(String str, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5d7084dc", new Object[]{this, str, map});
            } else {
                mqv.n().t(str, map);
            }
        }

        @Override // tb.b5m.v
        public void g(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("590d1caf", new Object[]{this, str});
            } else {
                mqv.n().j(str);
            }
        }

        @Override // tb.b5m.v
        public void h(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cc3c5c79", new Object[]{this, str, str2, str3});
            } else {
                mqv.n().c(str, str2, str3);
            }
        }

        @Override // tb.b5m.v
        public void i(String str, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dceb94e4", new Object[]{this, str, map});
            } else {
                mqv.n().u(str, map);
            }
        }

        @Override // tb.b5m.v
        public void j(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5545311b", new Object[]{this, str});
            } else {
                mqv.n().h(str);
            }
        }

        @Override // tb.b5m.v
        public String k(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("f918a63d", new Object[]{this, activity});
            }
            return mqv.n().l(activity);
        }

        @Override // tb.b5m.v
        public void l(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5086942b", new Object[]{this, str, str2});
            } else {
                mqv.n().e(str, str2);
            }
        }

        @Override // tb.b5m.v
        public b5m.v m() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b5m.v) ipChange.ipc$dispatch("77de5278", new Object[]{this});
            }
            try {
                mqv.n();
                return this;
            } catch (Throwable th) {
                tgh.c(TaobaoEvnInitializer.TAG, "UBF selfValidCheck() error", th);
                return null;
            }
        }
    }

    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class m implements b5m.h {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.b5m.h
        public String a() {
            a2c d;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("bfccac73", new Object[]{this});
            }
            d2c c = pa8.c();
            if (c == null || (d = c.d()) == null) {
                return "";
            }
            return ((ia8) d).b("detail");
        }
    }

    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class n implements b5m.e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.b5m.e
        public void a(Activity activity, Float f, String str, String str2, String str3, Point point) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d724c091", new Object[]{this, activity, f, str, str2, str3, point});
                return;
            }
            wb3 wb3Var = new wb3();
            wb3Var.i(f.floatValue());
            wb3Var.h(str);
            wb3Var.f(str2);
            wb3Var.j(str3);
            wb3Var.g(point);
            vb3.INSTANCE.b(activity, wb3Var);
            tgh.b(AdvAddCartAnimController.TAG, wb3Var.toString());
        }
    }

    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class p implements b5m.o {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.b5m.o
        public String a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("649a4eaf", new Object[]{this});
            }
            return "pagedetail";
        }

        @Override // tb.b5m.o
        public String b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("df3f1dca", new Object[]{this});
            }
            return "a2141.7631564";
        }
    }

    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class q implements b5m.x {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.b5m.x
        public Drawable a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Drawable) ipChange.ipc$dispatch("90f4026f", new Object[]{this});
            }
            return null;
        }

        @Override // tb.b5m.x
        public void b(Context context, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ea528cb", new Object[]{this, context, str});
                return;
            }
            try {
                fsm.a().d(context, str);
            } catch (Throwable th) {
                tgh.c(TaobaoEvnInitializer.TAG, "preloadTaoLiveRoom() exception", th);
            }
        }

        @Override // tb.b5m.x
        public Drawable c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Drawable) ipChange.ipc$dispatch("c1d05e48", new Object[]{this});
            }
            return null;
        }

        @Override // tb.b5m.x
        public Drawable d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Drawable) ipChange.ipc$dispatch("d7fd5f6", new Object[]{this});
            }
            return null;
        }

        @Override // tb.b5m.x
        public Drawable e(boolean z, boolean z2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Drawable) ipChange.ipc$dispatch("67964054", new Object[]{this, new Boolean(z), new Boolean(z2)});
            }
            return null;
        }

        @Override // tb.b5m.x
        public r8c f(Context context, ze7 ze7Var, GalleryCore galleryCore) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (r8c) ipChange.ipc$dispatch("9562ab61", new Object[]{this, context, ze7Var, galleryCore});
            }
            return new i17(context, ze7Var, galleryCore);
        }

        @Override // tb.b5m.x
        public Drawable g() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Drawable) ipChange.ipc$dispatch("78b49f8f", new Object[]{this});
            }
            return null;
        }

        @Override // tb.b5m.x
        public int h() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("52c9c892", new Object[]{this})).intValue();
            }
            return mr7.a(8.0f);
        }

        @Override // tb.b5m.x
        public Drawable i(boolean z, boolean z2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Drawable) ipChange.ipc$dispatch("127fe6f7", new Object[]{this, new Boolean(z), new Boolean(z2)});
            }
            return null;
        }
    }

    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class r implements b5m.g {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.b5m.g
        public String a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("3e990d94", new Object[]{this});
            }
            return byj.DETAIL_TAOBAO_GROUP_NAME;
        }
    }

    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class s implements b5m.n {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.b5m.n
        public String getNick() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("9d48c0c0", new Object[]{this});
            }
            AliLoginInterface c = kq0.c();
            if (c == null) {
                return null;
            }
            return c.getNick();
        }

        @Override // tb.b5m.n
        public String getUserId() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("58ad3b3d", new Object[]{this});
            }
            AliLoginInterface c = kq0.c();
            if (c == null) {
                return null;
            }
            return c.getUserId();
        }

        @Override // tb.b5m.n
        public boolean isSessionValid() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f14699db", new Object[]{this})).booleanValue();
            }
            AliLoginInterface c = kq0.c();
            if (c == null) {
                return false;
            }
            return c.checkSessionValid();
        }

        @Override // tb.b5m.n
        public void login(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("95000964", new Object[]{this, new Boolean(z)});
                return;
            }
            AliLoginInterface c = kq0.c();
            if (c != null) {
                c.login(z);
            }
        }
    }

    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class t implements b5m.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.b5m.b
        public Application a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Application) ipChange.ipc$dispatch("efa8582d", new Object[]{this});
            }
            return Globals.getApplication();
        }
    }

    static {
        t2o.a(354418694);
    }

    public static void initialize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b110817", new Object[0]);
        } else if (!b5m.S()) {
            new b5m.j().d(new t()).u(new k()).k(new i()).m(new h()).q(new g()).c(new f()).p(new e()).s(new b5m.u() { // from class: com.taobao.android.detail.alittdetail.TaobaoEvnInitializer.14
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.b5m.u
                public String a(String str, String str2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (String) ipChange2.ipc$dispatch("aaf277a2", new Object[]{this, str, str2});
                    }
                    if (!b()) {
                        return null;
                    }
                    try {
                        return FestivalMgr.i().l(str, str2);
                    } catch (Throwable unused) {
                        return null;
                    }
                }

                @Override // tb.b5m.u
                public boolean b() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("5b281615", new Object[]{this})).booleanValue();
                    }
                    try {
                        return FestivalMgr.i().u();
                    } catch (Throwable unused) {
                        return false;
                    }
                }

                @Override // tb.b5m.u
                public int c(String str, String str2, int i2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Number) ipChange2.ipc$dispatch("dd35252e", new Object[]{this, str, str2, new Integer(i2)})).intValue();
                    }
                    if (b()) {
                        try {
                            return FestivalMgr.i().e(str, str2, i2);
                        } catch (Throwable unused) {
                        }
                    }
                    return i2;
                }
            }).r(new d()).h(new c()).l(new b()).e(new a()).n(new s()).i(new r()).v(new q()).o(new p()).f(new o()).g(new n()).j(new m()).t(new l()).w(new j()).b();
        }
    }

    public static void overrideOrImplementDefaultBehaviors(Context context, ze7 ze7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de14e7b1", new Object[]{context, ze7Var});
            return;
        }
        CommonJsApiManager.initCommonJsbridge();
        com.taobao.android.detail.alittdetail.share.a aVar = new com.taobao.android.detail.alittdetail.share.a(context, ze7Var);
        ze7Var.b().i("openShare", aVar);
        ze7Var.b().i("share", aVar);
        c5l c5lVar = new c5l(context, ze7Var);
        ze7Var.b().i(n4l.EVENT_TYPE, c5lVar);
        ze7Var.b().i(n4l.EVENT_TYPE_ALTERNATIVE, c5lVar);
        ze7Var.b().i(tio.EVENT_TYPE, new tio(context, ze7Var));
        ze7Var.b().i(OpenPopDialogImplementor.EVENT_TYPE, new OpenPopDialogImplementor(context, ze7Var));
        ze7Var.g().F(gx5.DXFLICKINGSHAREBUTTON_FLICKINGSHAREBUTTON, new gx5.a());
        ze7Var.d().i("native", qg7.NAME, new qg7());
        ze7Var.g().A(y4u.DX_ABILITY_ID, new y4u.b());
        ze7Var.g().B("abilityHub", y4u.NAME, new y4u.b());
        ze7Var.g().A(vo2.DX_ABILITY_ID, new vo2.a());
        ze7Var.g().B("abilityHub", vo2.NAME, new vo2.a());
        ze7Var.g().A(DetailRatePrefetchAbility.DX_ABILITY_ID, new DetailRatePrefetchAbility.a(context, ze7Var));
        ze7Var.g().F(DXProgress.DXTMGBAOBAOPROGRESS_TMGBAOBAOPROGRESS, new DXProgress());
    }

    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class e implements b5m.q {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.b5m.q
        public boolean a(Context context, ze7 ze7Var, JSONObject jSONObject, final b5m.k kVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("b3c4ffee", new Object[]{this, context, ze7Var, jSONObject, kVar})).booleanValue();
            }
            String string = jSONObject.getString(BaseOuterComponent.b.SOURCE_COMPONENT_ID);
            String v = DataUtils.v((Item) ze7Var.e().f(Item.class));
            if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(v)) {
                CalendarAidlAdapter instance = CalendarAidlAdapter.getInstance();
                instance.registerListener(new CalendarListener.Stub() { // from class: com.taobao.android.detail.alittdetail.TaobaoEvnInitializer$15$2
                    @Override // com.taobao.calendar.aidl.listener.CalendarListener
                    public void onError(String str, String str2) throws RemoteException {
                        String str3;
                        StringBuilder sb = new StringBuilder("checkCalendarRemind return error: errorCode: ");
                        String str4 = "";
                        if (TextUtils.isEmpty(str)) {
                            str3 = str4;
                        } else {
                            str3 = str;
                        }
                        sb.append(str3);
                        sb.append(", eventId: ");
                        if (!TextUtils.isEmpty(str2)) {
                            str4 = str2;
                        }
                        sb.append(str4);
                        tgh.b("TaobaoEvnInitializer", sb.toString());
                        b5m.k kVar2 = kVar;
                        if (kVar2 != null) {
                            kVar2.onFailure(str, "failed with eventId: " + str2);
                        }
                    }

                    @Override // com.taobao.calendar.aidl.listener.CalendarListener
                    public void onSuccess(boolean z, String str, String[] strArr) throws RemoteException {
                        tgh.b("TaobaoEvnInitializer", "checkCalendarRemind onSuccess flag=" + z + ", eventId=" + str);
                        b5m.k kVar2 = kVar;
                        if (kVar2 == null) {
                            return;
                        }
                        if (z) {
                            kVar2.onSuccess();
                        } else {
                            kVar2.onFailure("calender biz error", "calender onSuccess with flag is false");
                        }
                    }
                });
                try {
                    instance.checkReminderExist(Integer.parseInt(string), v);
                    return true;
                } catch (Throwable th) {
                    tgh.c(TaobaoEvnInitializer.TAG, "checkCalendarRemind exception", th);
                }
            }
            return false;
        }

        @Override // tb.b5m.q
        public boolean b(Context context, ze7 ze7Var, JSONObject jSONObject, final b5m.k kVar) {
            int i;
            Throwable th;
            Uri uri;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("fc167f54", new Object[]{this, context, ze7Var, jSONObject, kVar})).booleanValue();
            }
            String w = DataUtils.w((Item) ze7Var.e().f(Item.class), "");
            String string = jSONObject.getString("title");
            String string2 = jSONObject.getString("link");
            long longValue = jSONObject.getLongValue("startTime");
            long longValue2 = jSONObject.getLongValue("endTime");
            try {
                i = jSONObject.getIntValue(BaseOuterComponent.b.SOURCE_COMPONENT_ID);
            } catch (Throwable th2) {
                tgh.c(TaobaoEvnInitializer.TAG, "setRemind error with sourceId", th2);
                i = 0;
            }
            if (TextUtils.isEmpty(w)) {
                return false;
            }
            tgh.b(TaobaoEvnInitializer.TAG, "setReminder");
            ScheduleDTO scheduleDTO = new ScheduleDTO();
            scheduleDTO.setEventId(w);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
            scheduleDTO.setSourceId(i);
            if (string != null) {
                scheduleDTO.setTitle(string);
                scheduleDTO.setDescription(string);
            }
            try {
                scheduleDTO.setStartTime(simpleDateFormat.format(Long.valueOf(longValue)));
                scheduleDTO.setEndTime(simpleDateFormat.format(Long.valueOf(longValue2)));
            } catch (Throwable th3) {
                tgh.c(TaobaoEvnInitializer.TAG, "setReminder error with time", th3);
            }
            scheduleDTO.setRemind(180);
            scheduleDTO.setIsallday(0);
            try {
                if (!TextUtils.isEmpty(string2)) {
                    uri = Uri.parse(string2);
                } else {
                    uri = Uri.parse("https://h5.m.taobao.com/awp/core/detail.htm?id=" + w);
                }
                scheduleDTO.setLink(uri.buildUpon().appendQueryParameter("reminded", "1").appendQueryParameter("fromCalendar", "1").appendQueryParameter("backurl", "index").build().toString());
                CalendarAidlAdapter.getInstance().init(context);
                try {
                    CalendarAidlAdapter.getInstance().registerListener(new CalendarListener.Stub() { // from class: com.taobao.android.detail.alittdetail.TaobaoEvnInitializer$15$1
                        @Override // com.taobao.calendar.aidl.listener.CalendarListener
                        public void onError(String str, String str2) {
                            tgh.b("TaobaoEvnInitializer", "setReminder onError errCode=" + str + ", eventId=" + str2);
                            b5m.k kVar2 = kVar;
                            if (kVar2 != null) {
                                kVar2.onFailure(str, "failed with eventId: " + str2);
                            }
                        }

                        @Override // com.taobao.calendar.aidl.listener.CalendarListener
                        public void onSuccess(boolean z, String str, String[] strArr) {
                            tgh.b("TaobaoEvnInitializer", "setReminder onSuccess flag=" + z + ", eventId=" + str);
                            b5m.k kVar2 = kVar;
                            if (kVar2 != null) {
                                kVar2.onSuccess();
                            }
                        }
                    });
                    CalendarAidlAdapter.getInstance().setReminder(scheduleDTO);
                    tgh.b(TaobaoEvnInitializer.TAG, "setReminder Done");
                    return true;
                } catch (Throwable th4) {
                    th = th4;
                    tgh.c(TaobaoEvnInitializer.TAG, "setReminder exception", th);
                    return false;
                }
            } catch (Throwable th5) {
                th = th5;
            }
        }
    }

    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class i implements b5m.i {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.b5m.i
        public boolean a(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("bc1a5af5", new Object[]{this, context})).booleanValue();
            }
            return TBDeviceUtils.P(context);
        }

        @Override // tb.b5m.i
        public boolean b(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("afe54a44", new Object[]{this, context})).booleanValue();
            }
            return TBDeviceUtils.p(context);
        }

        @Override // tb.b5m.i
        public boolean c(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("802a3d16", new Object[]{this, context})).booleanValue();
            }
            return TBAutoSizeConfig.x().T(context);
        }

        @Override // tb.b5m.i
        public qi7 getDeviceLevel() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (qi7) ipChange.ipc$dispatch("3fbb041d", new Object[]{this});
            }
            try {
                chb g = c21.g();
                if (g != null) {
                    int i = g.getInt("deviceLevel", -1);
                    if (i == 2) {
                        return new qi7(1, "low");
                    }
                    if (i == 1) {
                        return new qi7(2, "middle");
                    }
                    if (i == 0) {
                        return new qi7(3, "high");
                    }
                    return new qi7(0, "unknown");
                }
            } catch (Exception e) {
                tgh.c(TaobaoEvnInitializer.TAG, PerformanceAbility.API_GET_DEVICE_LEVEL, e);
            }
            return new qi7(0, "unknown");
        }
    }

    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class o implements b5m.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.b5m.d
        public boolean a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("98c491c6", new Object[]{this, str})).booleanValue();
            }
            if (BizLifecycle.BIZ_TYPE_FLIGGY.equals(str)) {
                if (BundleInfoManager.instance().getDynamicFeatureInfo(jm9.ARTIFACT_ID) == null || jm9.c()) {
                    return true;
                }
                jm9.d();
                bw7.a(-500005, "飞猪远程化安装失败");
                return false;
            } else if (!BizLifecycle.BIZ_TYPE_TINY_SHOP.equals(str) || BundleInfoManager.instance().getDynamicFeatureInfo(dxt.ARTIFACT_ID) == null || dxt.c()) {
                return true;
            } else {
                dxt.d();
                bw7.a(-500006, "直播小店远程化安装失败");
                return false;
            }
        }
    }

    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class c implements b5m.f {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.b5m.f
        public void a(boolean z, b5m.y yVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("69824120", new Object[]{this, new Boolean(z), yVar});
            } else if (vbl.W0()) {
                f9t.l(z, yVar);
            } else {
                ((CollectorImplementor.a) yVar).b(false);
            }
        }

        @Override // tb.b5m.f
        public boolean b(String str, int i, int i2, b5m.s sVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("eb0b7dfb", new Object[]{this, str, new Integer(i), new Integer(i2), sVar})).booleanValue();
            }
            TaobaoCollectionHelper.z(str, i, i2, sVar);
            return true;
        }

        @Override // tb.b5m.f
        public boolean c(String str, b5m.k kVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7e794265", new Object[]{this, str, kVar})).booleanValue();
            }
            if (vbl.Y()) {
                f9t.d(str, kVar);
            } else {
                TaobaoCollectionHelper.g(str, kVar);
            }
            return true;
        }

        @Override // tb.b5m.f
        public boolean d(String str, Map<String, String> map, b5m.k kVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("1b31945b", new Object[]{this, str, map, kVar})).booleanValue();
            }
            if (vbl.Y()) {
                f9t.c(str, map, kVar);
            } else {
                TaobaoCollectionHelper.c(str, map, kVar);
            }
            return true;
        }

        @Override // tb.b5m.f
        public boolean e(String str, b5m.p pVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("af37d11", new Object[]{this, str, pVar})).booleanValue();
            }
            if (vbl.Y()) {
                f9t.k(str, pVar);
            } else {
                TaobaoCollectionHelper.u(str, pVar);
            }
            return true;
        }

        @Override // tb.b5m.f
        public String a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("14131568", new Object[]{this, str, str2});
            }
            if (vbl.Y()) {
                return f9t.f(str, str2);
            }
            return null;
        }
    }
}
