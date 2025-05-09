package com.etao.feimagesearch.newresult.base;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import anetwork.channel.monitor.NetworkQualityMonitor;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.model.PhotoFrom;
import com.etao.feimagesearch.newresult.base.IrpDatasource;
import com.taobao.android.abilityidl.ability.BroadcastAddListenerEventResult;
import com.taobao.android.abilityidl.ability.BroadcastEventResult;
import com.taobao.search.searchdoor.activate.data.ActivateBean;
import com.taobao.search.sf.util.tlog.TLogTracker;
import com.ut.mini.UTAnalytics;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.JvmStatic;
import tb.a07;
import tb.a8m;
import tb.bw1;
import tb.ckf;
import tb.cnf;
import tb.cql;
import tb.cw1;
import tb.d2m;
import tb.dii;
import tb.dwo;
import tb.el2;
import tb.hre;
import tb.l53;
import tb.l5b;
import tb.lg4;
import tb.mdd;
import tb.mzu;
import tb.pmf;
import tb.qrl;
import tb.qsc;
import tb.ri7;
import tb.smf;
import tb.t2o;
import tb.ta0;
import tb.v7m;
import tb.vlf;
import tb.vxm;
import tb.wlf;
import tb.wsq;
import tb.wxi;
import tb.xfw;
import tb.yj4;
import tb.zno;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class IrpV2Controller extends bw1 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final String IRP_PAGE_NAME = "Page_PhotoSearchResult";
    public final Map<String, String> b;
    public IrpWidget c;
    public cnf d;
    public IrpDatasource e;
    public v7m f;
    public dii g;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(481297122);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        @JvmStatic
        public final Map<String, String> a(Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("75bfd98", new Object[]{this, intent});
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (intent == null || c(intent, linkedHashMap) || b(intent, linkedHashMap)) {
                return linkedHashMap;
            }
            Map<String, String> b = cql.b(intent);
            ckf.f(b, "parseParamsFromIntent(intent)");
            return b;
        }

        public a() {
        }

        public final boolean b(Intent intent, Map<String, String> map) {
            Bundle bundle;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("c3e27c4", new Object[]{this, intent, map})).booleanValue();
            }
            Bundle extras = intent.getExtras();
            if (extras == null || (bundle = extras.getBundle(wxi.EXTRA_KEY_BUNDLE_PARAM)) == null) {
                return false;
            }
            String string = bundle.getString(wxi.EXTRA_KEY_PIC_URI);
            map.put("pssource", bundle.getString("pssource"));
            map.put(wxi.KEY_PIC_URL, string);
            String string2 = bundle.getString(wxi.KEY_PHOTO_FROM);
            if (TextUtils.isEmpty(string2)) {
                map.put(wxi.KEY_PHOTO_FROM, PhotoFrom.Values.PREVIEW.getValue());
            } else {
                map.put(wxi.KEY_PHOTO_FROM, string2);
            }
            return true;
        }

        public final boolean c(Intent intent, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("40311cab", new Object[]{this, intent, map})).booleanValue();
            }
            Bundle extras = intent.getExtras();
            if (extras == null) {
                return false;
            }
            Parcelable parcelable = extras.getParcelable("android.intent.extra.STREAM");
            if (!(parcelable instanceof Uri)) {
                return false;
            }
            String uri = ((Uri) parcelable).toString();
            map.put("pssource", wxi.PSSOURCE_SYSTEM_ALBUM);
            map.put(wxi.KEY_PIC_URL, uri);
            map.put(wxi.KEY_PHOTO_FROM, PhotoFrom.Values.SYSTEM_ALBUM.getValue());
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class b implements xfw {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.xfw
        public ViewGroup a(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ViewGroup) ipChange.ipc$dispatch("24c47c91", new Object[]{this, view});
            }
            ckf.g(view, "widgetView");
            IrpV2Controller.this.b().getActivity().setContentView(view);
            return null;
        }

        @Override // tb.xfw
        public ViewGroup b(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ViewGroup) ipChange.ipc$dispatch("ee7ef752", new Object[]{this, view});
            }
            ckf.g(view, "widgetView");
            return null;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class c implements qsc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public static final class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ IrpV2Controller f4789a;
            public final /* synthetic */ Pair<String, String> b;
            public final /* synthetic */ Pair<String, String> c;

            public a(IrpV2Controller irpV2Controller, Pair<String, String> pair, Pair<String, String> pair2) {
                this.f4789a = irpV2Controller;
                this.b = pair;
                this.c = pair2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                IrpWidget o = IrpV2Controller.o(this.f4789a);
                if (o != null) {
                    ((IrpV2Presenter) o.i0()).Z(this.b, this.c);
                } else {
                    ckf.y("mIrpWidget");
                    throw null;
                }
            }
        }

        public c() {
        }

        @Override // tb.jdb
        public void O(ErrorResult errorResult) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("14182866", new Object[]{this, errorResult});
                return;
            }
            ckf.g(errorResult, "result");
            TLogTracker.f("ThemisPageLoad", "onError", ckf.p("onError: ", JSON.toJSONString(errorResult)));
        }

        @Override // tb.ekb
        public void n1(BroadcastAddListenerEventResult broadcastAddListenerEventResult) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("70116a6f", new Object[]{this, broadcastAddListenerEventResult});
                return;
            }
            ckf.g(broadcastAddListenerEventResult, "result");
            TLogTracker.f("ThemisPageLoad", "userChangeTranslateLangSetting", ckf.p("onAdd: ", broadcastAddListenerEventResult.listenerId));
        }

        @Override // tb.qsc, tb.ekb
        public void onEvent(BroadcastEventResult broadcastEventResult) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("560ff2e1", new Object[]{this, broadcastEventResult});
                return;
            }
            ckf.g(broadcastEventResult, "result");
            TLogTracker.f("ThemisPageLoad", "userChangeTranslateLangSetting", ckf.p("detail=", JSON.toJSONString(broadcastEventResult.detail)));
            Map<String, ? extends Object> map = broadcastEventResult.detail;
            if (map != null) {
                IrpV2Controller irpV2Controller = IrpV2Controller.this;
                Object obj = map.get("userChooseOriginLang");
                Object obj2 = map.get("userChooseTargetLang");
                if ((obj instanceof JSONObject) && (obj2 instanceof JSONObject)) {
                    Pair p = IrpV2Controller.p(irpV2Controller, (JSONObject) obj);
                    Pair p2 = IrpV2Controller.p(irpV2Controller, (JSONObject) obj2);
                    if (p != null && p2 != null) {
                        IrpWidget o = IrpV2Controller.o(irpV2Controller);
                        if (o != null) {
                            o.e0(new a(irpV2Controller, p, p2));
                        } else {
                            ckf.y("mIrpWidget");
                            throw null;
                        }
                    }
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class d implements qsc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public static final class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ IrpV2Controller f4791a;

            public a(IrpV2Controller irpV2Controller) {
                this.f4791a = irpV2Controller;
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                IrpWidget o = IrpV2Controller.o(this.f4791a);
                if (o != null) {
                    o.v1(false);
                } else {
                    ckf.y("mIrpWidget");
                    throw null;
                }
            }
        }

        public d() {
        }

        @Override // tb.jdb
        public void O(ErrorResult errorResult) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("14182866", new Object[]{this, errorResult});
                return;
            }
            ckf.g(errorResult, "result");
            TLogTracker.f("ThemisPageLoad", "onError", ckf.p("hideChangeTranslateLangView onError: ", JSON.toJSONString(errorResult)));
        }

        @Override // tb.ekb
        public void n1(BroadcastAddListenerEventResult broadcastAddListenerEventResult) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("70116a6f", new Object[]{this, broadcastAddListenerEventResult});
                return;
            }
            ckf.g(broadcastAddListenerEventResult, "result");
            TLogTracker.f("ThemisPageLoad", "hideChangeTranslateLangView", ckf.p("onAdd: ", broadcastAddListenerEventResult.listenerId));
        }

        @Override // tb.qsc, tb.ekb
        public void onEvent(BroadcastEventResult broadcastEventResult) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("560ff2e1", new Object[]{this, broadcastEventResult});
                return;
            }
            ckf.g(broadcastEventResult, "result");
            TLogTracker.f("ThemisPageLoad", "hideChangeTranslateLangView", ckf.p("detail=", JSON.toJSONString(broadcastEventResult.detail)));
            IrpWidget o = IrpV2Controller.o(IrpV2Controller.this);
            if (o != null) {
                o.e0(new a(IrpV2Controller.this));
            } else {
                ckf.y("mIrpWidget");
                throw null;
            }
        }
    }

    static {
        t2o.a(481297121);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IrpV2Controller(ta0 ta0Var, Map<String, String> map) {
        super(ta0Var);
        ckf.g(ta0Var, "activityAdapter");
        ckf.g(map, "intentParams");
        this.b = map;
    }

    public static /* synthetic */ Object ipc$super(IrpV2Controller irpV2Controller, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/newresult/base/IrpV2Controller");
    }

    public static final /* synthetic */ IrpDatasource n(IrpV2Controller irpV2Controller) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IrpDatasource) ipChange.ipc$dispatch("2b1ec2f8", new Object[]{irpV2Controller});
        }
        return irpV2Controller.e;
    }

    public static final /* synthetic */ IrpWidget o(IrpV2Controller irpV2Controller) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IrpWidget) ipChange.ipc$dispatch("e833a1db", new Object[]{irpV2Controller});
        }
        return irpV2Controller.c;
    }

    public static final /* synthetic */ Pair p(IrpV2Controller irpV2Controller, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("23b306f2", new Object[]{irpV2Controller, jSONObject});
        }
        return irpV2Controller.y(jSONObject);
    }

    @JvmStatic
    public static final Map<String, String> x(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("75bfd98", new Object[]{intent});
        }
        return Companion.a(intent);
    }

    @Override // tb.bw1
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
            return;
        }
        IrpWidget irpWidget = this.c;
        if (irpWidget == null) {
            ckf.y("mIrpWidget");
            throw null;
        } else if (irpWidget.p1()) {
            IrpWidget irpWidget2 = this.c;
            if (irpWidget2 != null) {
                irpWidget2.N0(new IrpV2Controller$finish$1(this));
                smf.Companion.c(String.valueOf(b().getActivity().hashCode()));
                return;
            }
            ckf.y("mIrpWidget");
            throw null;
        }
    }

    @Override // tb.bw1
    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d6bfa225", new Object[]{this});
        }
        IrpWidget irpWidget = this.c;
        if (irpWidget != null) {
            return irpWidget.W().y();
        }
        ckf.y("mIrpWidget");
        throw null;
    }

    @Override // tb.bw1
    public cw1 d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cw1) ipChange.ipc$dispatch("b6eec51d", new Object[]{this});
        }
        IrpWidget irpWidget = this.c;
        if (irpWidget != null) {
            return (IrpV2Presenter) irpWidget.i0();
        }
        ckf.y("mIrpWidget");
        throw null;
    }

    @Override // tb.bw1
    public boolean g(int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb4cc7a6", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        return b().c(i, keyEvent);
    }

    @Override // tb.bw1
    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        IrpWidget irpWidget = this.c;
        if (irpWidget != null) {
            irpWidget.L();
        } else {
            ckf.y("mIrpWidget");
            throw null;
        }
    }

    @Override // tb.bw1
    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        cnf cnfVar = this.d;
        if (cnfVar != null) {
            cnfVar.c();
            IrpWidget irpWidget = this.c;
            if (irpWidget != null) {
                irpWidget.M();
            } else {
                ckf.y("mIrpWidget");
                throw null;
            }
        } else {
            ckf.y("mTracker");
            throw null;
        }
    }

    @Override // tb.bw1
    public void j(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80049e8d", new Object[]{this, bundle});
        } else if (lg4.u0()) {
            IrpWidget irpWidget = this.c;
            if (irpWidget == null) {
                ckf.y("mIrpWidget");
                throw null;
            } else if (irpWidget.c1()) {
                IrpWidget irpWidget2 = this.c;
                if (irpWidget2 == null) {
                    ckf.y("mIrpWidget");
                    throw null;
                } else if (((IrpV2Presenter) irpWidget2.i0()).f0()) {
                    String valueOf = String.valueOf(b().getActivity().hashCode());
                    if (bundle != null) {
                        bundle.putString(smf.EXTRA_IRP_REBUILD_TOKEN, valueOf);
                    }
                    smf.a aVar = smf.Companion;
                    IrpWidget irpWidget3 = this.c;
                    if (irpWidget3 != null) {
                        aVar.d(valueOf, aVar.b(irpWidget3.W()));
                    } else {
                        ckf.y("mIrpWidget");
                        throw null;
                    }
                }
            }
        }
    }

    @Override // tb.bw1
    public void k(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c4537c1", new Object[]{this, num});
            return;
        }
        IrpWidget irpWidget = this.c;
        if (irpWidget != null) {
            irpWidget.r1(num);
        } else {
            ckf.y("mIrpWidget");
            throw null;
        }
    }

    @Override // tb.bw1
    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
        } else {
            TLogTracker.p();
        }
    }

    @Override // tb.bw1
    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        TLogTracker.q();
        IrpWidget irpWidget = this.c;
        if (irpWidget != null) {
            irpWidget.O();
        } else {
            ckf.y("mIrpWidget");
            throw null;
        }
    }

    public void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca249742", new Object[]{this});
            return;
        }
        IrpWidget irpWidget = this.c;
        if (irpWidget != null) {
            IrpV2Presenter irpV2Presenter = (IrpV2Presenter) irpWidget.i0();
            v7m v7mVar = this.f;
            if (v7mVar != null) {
                irpV2Presenter.D0(v7mVar);
            } else {
                ckf.y("irpPipLine");
                throw null;
            }
        } else {
            ckf.y("mIrpWidget");
            throw null;
        }
    }

    public final Long r(Bundle bundle) {
        String string;
        smf a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Long) ipChange.ipc$dispatch("fa6ef2cc", new Object[]{this, bundle});
        }
        if (bundle == null || !lg4.u0() || (string = bundle.getString(smf.EXTRA_IRP_REBUILD_TOKEN, "")) == null || string.length() == 0 || (a2 = smf.Companion.a(string)) == null) {
            return null;
        }
        return Long.valueOf(a8m.i(a2));
    }

    public final void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ece0162", new Object[]{this});
            return;
        }
        Activity activity = b().getActivity();
        ckf.f(activity, "activityAdapter.activity");
        cnf cnfVar = this.d;
        if (cnfVar != null) {
            IrpDatasource irpDatasource = this.e;
            if (irpDatasource != null) {
                this.c = new IrpWidget(activity, cnfVar, this, irpDatasource, new b());
            } else {
                ckf.y("irpDatasource");
                throw null;
            }
        } else {
            ckf.y("mTracker");
            throw null;
        }
    }

    public final void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("539788f", new Object[]{this});
            return;
        }
        IrpDatasource irpDatasource = this.e;
        if (irpDatasource != null) {
            String str = irpDatasource.A().get("spm-cnt");
            if (str == null) {
                str = "";
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (TextUtils.isEmpty(str)) {
                str = "a2141.7690630";
            }
            linkedHashMap.put("spm-cnt", str);
            UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(b().getActivity(), linkedHashMap);
            ta0 b2 = b();
            IrpDatasource irpDatasource2 = this.e;
            if (irpDatasource2 != null) {
                this.d = new cnf(b2, irpDatasource2);
                if (lg4.s0()) {
                    A();
                }
                IrpDatasource irpDatasource3 = this.e;
                if (irpDatasource3 != null) {
                    String y = irpDatasource3.y();
                    IrpDatasource irpDatasource4 = this.e;
                    if (irpDatasource4 != null) {
                        String value = irpDatasource4.B().getValue();
                        if (TextUtils.isEmpty(y)) {
                            String str2 = "unknown";
                            if (ckf.b(str2, value)) {
                                wlf wlfVar = new wlf();
                                String dataString = b().getIntent().getDataString();
                                if (dataString != null) {
                                    str2 = dataString;
                                }
                                wlfVar.h("Illegal_Source", str2, "");
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    ckf.y("irpDatasource");
                    throw null;
                }
                ckf.y("irpDatasource");
                throw null;
            }
            ckf.y("irpDatasource");
            throw null;
        }
        ckf.y("irpDatasource");
        throw null;
    }

    public void v(Bundle bundle, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e8c9a42", new Object[]{this, bundle, new Boolean(z)});
            return;
        }
        l5b.g(b().getActivity());
        TLogTracker.l("Default", this.b);
        s(bundle, this.b);
        u();
        t();
        q();
        w(true);
        z();
    }

    public final Pair<String, String> y(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("54b8be01", new Object[]{this, jSONObject});
        }
        for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (!(key == null || TextUtils.isEmpty(key) || !(value instanceof String) || TextUtils.isEmpty((CharSequence) value))) {
                return new Pair<>(key, value);
            }
        }
        return null;
    }

    @Override // tb.bw1
    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1d690745", new Object[]{this})).booleanValue();
        }
        IrpDatasource irpDatasource = this.e;
        if (irpDatasource != null) {
            return qrl.a(irpDatasource.A().get(dwo.FOREGROUND_KEY), false);
        }
        ckf.y("irpDatasource");
        throw null;
    }

    @Override // tb.bw1
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        TLogTracker.o();
        cnf cnfVar = this.d;
        if (cnfVar != null) {
            cnfVar.e();
            w(false);
            IrpWidget irpWidget = this.c;
            if (irpWidget != null) {
                irpWidget.K();
                v7m v7mVar = this.f;
                if (v7mVar != null) {
                    v7mVar.d();
                    IrpDatasource irpDatasource = this.e;
                    if (irpDatasource != null) {
                        if (irpDatasource.b0()) {
                            d2m.Companion.b();
                        }
                        hre.INSTANCE.d(String.valueOf(b().getActivity().hashCode()));
                        IrpRainbowManager.Companion.a().c();
                        return;
                    }
                    ckf.y("irpDatasource");
                    throw null;
                }
                ckf.y("irpPipLine");
                throw null;
            }
            ckf.y("mIrpWidget");
            throw null;
        }
        ckf.y("mTracker");
        throw null;
    }

    public final void w(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ca344c2", new Object[]{this, new Boolean(z)});
        } else if (!z) {
            dii diiVar = this.g;
            if (diiVar != null) {
                diiVar.e("userChangeTranslateLangSetting", null);
            }
            dii diiVar2 = this.g;
            if (diiVar2 != null) {
                diiVar2.e("hideChangeTranslateLangView", null);
            }
        } else {
            IrpDatasource irpDatasource = this.e;
            if (irpDatasource == null) {
                ckf.y("irpDatasource");
                throw null;
            } else if (irpDatasource.X()) {
                dii c2 = dii.c();
                el2 a2 = el2.a("userChangeTranslateLangSetting");
                if (a2 != null) {
                    a2.f18656a = "plt_translate";
                    a2.c = false;
                    c2.b(a2, new c());
                }
                el2 a3 = el2.a("hideChangeTranslateLangView");
                if (a3 != null) {
                    a3.f18656a = "plt_translate";
                    a3.c = false;
                    c2.b(a3, new d());
                }
                this.g = c2;
            }
        }
    }

    public final void A() {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67ec550a", new Object[]{this});
            return;
        }
        HashMap hashMap = new HashMap();
        IrpDatasource irpDatasource = this.e;
        if (irpDatasource != null) {
            hashMap.put(wxi.KEY_PHOTO_FROM, irpDatasource.B().getValue());
            IrpDatasource irpDatasource2 = this.e;
            if (irpDatasource2 != null) {
                hashMap.put("pssource", irpDatasource2.y());
                String[] y2 = lg4.y2();
                ckf.f(y2, "noPicValidKeys");
                if (y2.length != 0) {
                    int length = y2.length;
                    while (i < length) {
                        String str = y2[i];
                        i++;
                        if (!TextUtils.isEmpty(str)) {
                            IrpDatasource irpDatasource3 = this.e;
                            if (irpDatasource3 != null) {
                                String str2 = irpDatasource3.A().get(str);
                                if (str2 == null) {
                                    str2 = "";
                                }
                                if (!TextUtils.isEmpty(str2)) {
                                    hashMap.put(str, str2);
                                }
                            } else {
                                ckf.y("irpDatasource");
                                throw null;
                            }
                        }
                    }
                }
                cnf cnfVar = this.d;
                if (cnfVar != null) {
                    cnfVar.g(hashMap);
                } else {
                    ckf.y("mTracker");
                    throw null;
                }
            } else {
                ckf.y("irpDatasource");
                throw null;
            }
        } else {
            ckf.y("irpDatasource");
            throw null;
        }
    }

    public final void s(Bundle bundle, Map<String, String> map) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49206cec", new Object[]{this, bundle, map});
            return;
        }
        Long r = r(bundle);
        String str = "";
        if (r == null) {
            long g = qrl.g(map.get("sessionId"), -1L);
            r = Long.valueOf(g);
            if (g < 0) {
                if (IrpRainbowManager.Companion.a().g()) {
                    List<ActivateBean> t = new com.taobao.search.searchdoor.sf.widgets.activate.a(null).t();
                    map.put("queryFromMainSearch", t.isEmpty() ? str : t.get(0).keyword);
                }
                r = Long.valueOf(a8m.h(map));
            }
        } else {
            TLogTracker.h("PageRebuild", "trigger");
            z = true;
        }
        IrpDatasource p = a8m.p(r);
        if (p == null) {
            p = IrpDatasource.Companion.f(map);
        }
        this.e = p;
        v7m q = a8m.q(r);
        if (q == null) {
            q = a8m.q(Long.valueOf(a8m.h(map)));
            ckf.d(q);
        }
        this.f = q;
        IrpDatasource irpDatasource = this.e;
        if (irpDatasource != null) {
            if (!irpDatasource.T()) {
                hre.INSTANCE.g(String.valueOf(b().getActivity().hashCode()));
            }
            IrpDatasource irpDatasource2 = this.e;
            if (irpDatasource2 != null) {
                String y = irpDatasource2.y();
                IrpDatasource irpDatasource3 = this.e;
                if (irpDatasource3 != null) {
                    String value = irpDatasource3.B().getValue();
                    IrpDatasource irpDatasource4 = this.e;
                    if (irpDatasource4 != null) {
                        String str2 = irpDatasource4.A().get("autotaksid");
                        if (str2 != null) {
                            str = str2;
                        }
                        pmf.c0(y, value, str, zno.h(b().getActivity()), z);
                        if (b().getActivity() instanceof vlf) {
                            Activity activity = b().getActivity();
                            if (activity != null) {
                                wlf p1 = ((vlf) activity).p1();
                                IrpDatasource irpDatasource5 = this.e;
                                if (irpDatasource5 != null) {
                                    String y2 = irpDatasource5.y();
                                    IrpDatasource irpDatasource6 = this.e;
                                    if (irpDatasource6 != null) {
                                        String value2 = irpDatasource6.B().getValue();
                                        IrpDatasource irpDatasource7 = this.e;
                                        if (irpDatasource7 != null) {
                                            p1.g(y2, value2, String.valueOf(irpDatasource7.V()));
                                        } else {
                                            ckf.y("irpDatasource");
                                            throw null;
                                        }
                                    } else {
                                        ckf.y("irpDatasource");
                                        throw null;
                                    }
                                } else {
                                    ckf.y("irpDatasource");
                                    throw null;
                                }
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type com.etao.feimagesearch.result.IrpActivityInterface");
                            }
                        }
                        IrpDatasource irpDatasource8 = this.e;
                        if (irpDatasource8 != null) {
                            Map<String, String> A = irpDatasource8.A();
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            String str3 = A.get(yj4.PARAM_ENTRY_UT_PARAM);
                            if (!TextUtils.isEmpty(str3)) {
                                linkedHashMap.put(yj4.PARAM_ENTRY_UT_PARAM, str3);
                            }
                            String str4 = A.get("entryScm");
                            if (!TextUtils.isEmpty(str4)) {
                                linkedHashMap.put("entryScm", str4);
                            }
                            String str5 = A.get("entrySpm");
                            if (!TextUtils.isEmpty(str5)) {
                                linkedHashMap.put("entrySpm", str5);
                            }
                            if (!linkedHashMap.isEmpty()) {
                                UTAnalytics.getInstance().getDefaultTracker().updatePageUtparam(b().getActivity(), JSON.toJSONString(linkedHashMap));
                                UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(b().getActivity(), linkedHashMap);
                            }
                            IrpDatasource.a aVar = IrpDatasource.Companion;
                            aVar.l(aVar.h() + 1);
                            return;
                        }
                        ckf.y("irpDatasource");
                        throw null;
                    }
                    ckf.y("irpDatasource");
                    throw null;
                }
                ckf.y("irpDatasource");
                throw null;
            }
            ckf.y("irpDatasource");
            throw null;
        }
        ckf.y("irpDatasource");
        throw null;
    }

    public final void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4195631", new Object[]{this});
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        IrpDatasource irpDatasource = this.e;
        if (irpDatasource != null) {
            String y = irpDatasource.y();
            if (y != null) {
                linkedHashMap.put("pssource", y);
            }
            IrpDatasource irpDatasource2 = this.e;
            if (irpDatasource2 != null) {
                String value = irpDatasource2.B().getValue();
                ckf.f(value, "irpDatasource.photoFrom.value");
                linkedHashMap.put(wxi.KEY_PHOTO_FROM, value);
                IrpDatasource irpDatasource3 = this.e;
                if (irpDatasource3 != null) {
                    String str = irpDatasource3.A().get(l53.KEY_EXTRA_VERIFY);
                    if (str != null) {
                        linkedHashMap.put(l53.KEY_EXTRA_VERIFY, str);
                    }
                    String pageSpmUrl = UTAnalytics.getInstance().getDefaultTracker().getPageSpmUrl(b().getActivity());
                    if (TextUtils.isEmpty(pageSpmUrl)) {
                        linkedHashMap.put("prePage", "unknown");
                    } else {
                        ckf.f(pageSpmUrl, "prePageSpm");
                        List z0 = wsq.z0(pageSpmUrl, new String[]{"."}, false, 0, 6, null);
                        if (z0.size() >= 4) {
                            linkedHashMap.put("prePage", ((String) z0.get(0)) + '.' + ((String) z0.get(1)) + '.' + ((String) z0.get(2)));
                        } else {
                            linkedHashMap.put("prePage", pageSpmUrl);
                        }
                    }
                    linkedHashMap.put("networkQualityLevel", String.valueOf(NetworkQualityMonitor.getGlobalNetworkQuality()));
                    linkedHashMap.put("deviceLevel", String.valueOf(ri7.b()));
                    mzu.p("Page_PhotoSearchResult", "IrpInit", linkedHashMap);
                    mdd a2 = vxm.b.a(b().getActivity());
                    IrpDatasource irpDatasource4 = this.e;
                    if (irpDatasource4 != null) {
                        a2.a(wxi.KEY_PHOTO_FROM, irpDatasource4.B().getValue());
                    } else {
                        ckf.y("irpDatasource");
                        throw null;
                    }
                } else {
                    ckf.y("irpDatasource");
                    throw null;
                }
            } else {
                ckf.y("irpDatasource");
                throw null;
            }
        } else {
            ckf.y("irpDatasource");
            throw null;
        }
    }
}
