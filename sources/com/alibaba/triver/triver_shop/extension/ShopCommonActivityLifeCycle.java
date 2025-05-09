package com.alibaba.triver.triver_shop.extension;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.cannal_engine.scene.TRWidgetJsPlugin;
import com.alibaba.triver.cannal_engine.scene.TRWidgetWVEmbedView;
import com.alibaba.triver.triver_shop.extension.accs.ShopAccsUpStreamData;
import com.alibaba.triver.triver_shop.jsapi.WVShopApiBridge;
import com.alibaba.triver.triver_shop.newShop.data.ShopDataParser;
import com.alibaba.triver.triver_shop.newShop.event.broadcast.ShopBroadcastController;
import com.alibaba.triver.triver_shop.newShop.event.broadcast.a;
import com.alibaba.triver.triver_shop.newShop.ext.ShopExtKt;
import com.alibaba.triver.triver_shop.preload.ShopIndexWebViewPreload;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.taobao.android.external.UCPManager;
import com.taobao.tao.Globals;
import kotlin.Result;
import kotlin.b;
import tb.arp;
import tb.brf;
import tb.ckf;
import tb.fqw;
import tb.fsw;
import tb.jpu;
import tb.khu;
import tb.npp;
import tb.nt0;
import tb.r54;
import tb.t2o;
import tb.tnp;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ShopCommonActivityLifeCycle implements LifecycleObserver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ShopDataParser f3029a;
    public boolean b;
    public final boolean c;
    public final boolean d;
    public final ShopBXBroadcastReceiver e;

    static {
        t2o.a(766509294);
    }

    public ShopCommonActivityLifeCycle(ShopDataParser shopDataParser) {
        ckf.g(shopDataParser, "shopDataParser");
        this.f3029a = shopDataParser;
        this.c = shopDataParser.H1() || shopDataParser.G1();
        this.d = shopDataParser.q();
        this.e = new ShopBXBroadcastReceiver(shopDataParser);
    }

    public static final /* synthetic */ boolean a(ShopCommonActivityLifeCycle shopCommonActivityLifeCycle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3b898f7d", new Object[]{shopCommonActivityLifeCycle})).booleanValue();
        }
        return shopCommonActivityLifeCycle.b;
    }

    public static final /* synthetic */ boolean b(ShopCommonActivityLifeCycle shopCommonActivityLifeCycle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aa1e4eee", new Object[]{shopCommonActivityLifeCycle})).booleanValue();
        }
        return shopCommonActivityLifeCycle.d;
    }

    public static final /* synthetic */ boolean c(ShopCommonActivityLifeCycle shopCommonActivityLifeCycle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2ad61177", new Object[]{shopCommonActivityLifeCycle})).booleanValue();
        }
        return shopCommonActivityLifeCycle.c;
    }

    public static final /* synthetic */ ShopDataParser d(ShopCommonActivityLifeCycle shopCommonActivityLifeCycle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShopDataParser) ipChange.ipc$dispatch("d97b508d", new Object[]{shopCommonActivityLifeCycle});
        }
        return shopCommonActivityLifeCycle.f3029a;
    }

    public static final /* synthetic */ void e(ShopCommonActivityLifeCycle shopCommonActivityLifeCycle, ShopDataParser shopDataParser) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b0a9cd1", new Object[]{shopCommonActivityLifeCycle, shopDataParser});
        } else {
            shopCommonActivityLifeCycle.g(shopDataParser);
        }
    }

    public static final /* synthetic */ void f(ShopCommonActivityLifeCycle shopCommonActivityLifeCycle, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2682bcef", new Object[]{shopCommonActivityLifeCycle, new Boolean(z)});
        } else {
            shopCommonActivityLifeCycle.b = z;
        }
    }

    public final void g(ShopDataParser shopDataParser) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46b41c04", new Object[]{this, shopDataParser});
        } else {
            LocalBroadcastManager.getInstance(shopDataParser.Q()).registerReceiver(this.e, new IntentFilter("BehaviX_shopBXInfo"));
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroyed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf354a81", new Object[]{this});
            return;
        }
        try {
            npp.Companion.b("start preload shop index webView on ac destroyed");
            ShopIndexWebViewPreload shopIndexWebViewPreload = ShopIndexWebViewPreload.INSTANCE;
            Application application = Globals.getApplication();
            ckf.f(application, "getApplication()");
            shopIndexWebViewPreload.e(application);
            r54.F(new ShopCommonActivityLifeCycle$onDestroyed$1$1(this));
            if (this.f3029a.b0()) {
                this.f3029a.k1().b();
                UCPManager.s(arp.GROUP_NAME);
            }
            if (this.c && this.f3029a.t() != null) {
                tnp tnpVar = tnp.INSTANCE;
                tnp.b t = this.f3029a.t();
                ckf.d(t);
                tnpVar.e(t);
            }
            LocalBroadcastManager.getInstance(this.f3029a.Q()).unregisterReceiver(this.e);
            Result.m1108constructorimpl(xhv.INSTANCE);
        } catch (Throwable th) {
            Result.m1108constructorimpl(b.a(th));
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public final void onPaused() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c47335f4", new Object[]{this});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (this.c && this.d) {
            tnp tnpVar = tnp.INSTANCE;
            ShopAccsUpStreamData.ChannelCode channelCode = ShopAccsUpStreamData.ChannelCode.onShopExit;
            Context Q = this.f3029a.Q();
            String str2 = "";
            if (Q == null || (str = khu.c(Q)) == null) {
                str = str2;
            }
            String N0 = this.f3029a.N0();
            if (N0 == null) {
                N0 = str2;
            }
            String W0 = this.f3029a.W0();
            if (W0 != null) {
                str2 = W0;
            }
            tnpVar.c(new ShopAccsUpStreamData(channelCode, str, N0, str2));
        }
        nt0.INSTANCE.b(null, null);
        r54.E(new ShopCommonActivityLifeCycle$onPaused$1(this, currentTimeMillis), 500L);
        if (this.f3029a.x()) {
            ShopExtKt.F(this.f3029a);
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
        } else {
            r54.P("accsTask", new ShopCommonActivityLifeCycle$onResume$1(this));
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public final void onCreated() {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff48d810", new Object[]{this});
            return;
        }
        try {
            fsw.h("NShop", WVShopApiBridge.class);
            fqw.g("widget", TRWidgetWVEmbedView.class, true);
            fsw.h("triver-widget", TRWidgetJsPlugin.class);
            r54.P("logShopEnterUri", new ShopCommonActivityLifeCycle$onCreated$1$1(this));
            r54.P("shopExtraTask", new ShopCommonActivityLifeCycle$onCreated$1$2(this));
            obj = Result.m1108constructorimpl(xhv.INSTANCE);
        } catch (Throwable th) {
            obj = Result.m1108constructorimpl(b.a(th));
        }
        Throwable th2 = Result.m1111exceptionOrNullimpl(obj);
        if (th2 != null) {
            npp.Companion.c("catching block has error", th2);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class ShopBXBroadcastReceiver extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final ShopDataParser f3030a;

        static {
            t2o.a(766509295);
        }

        public ShopBXBroadcastReceiver(ShopDataParser shopDataParser) {
            ckf.g(shopDataParser, "shopData");
            this.f3030a = shopDataParser;
        }

        public static /* synthetic */ Object ipc$super(ShopBXBroadcastReceiver shopBXBroadcastReceiver, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/extension/ShopCommonActivityLifeCycle$ShopBXBroadcastReceiver");
        }

        public final ShopDataParser a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ShopDataParser) ipChange.ipc$dispatch("16b01ba5", new Object[]{this});
            }
            return this.f3030a;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Object obj;
            JSONObject jSONObject;
            JSONObject jSONObject2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                return;
            }
            ckf.g(context, "context");
            ckf.g(intent, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
            try {
                jSONObject = (JSONObject) intent.getSerializableExtra("feature");
                jSONObject2 = (JSONObject) intent.getSerializableExtra("event");
            } catch (Throwable th) {
                obj = Result.m1108constructorimpl(b.a(th));
            }
            if (!(jSONObject == null || jSONObject2 == null)) {
                JSONObject a2 = brf.a(jpu.a("_msg_name", a.BX_TO_SHOP), jpu.a("_msg_type", a.BX_TO_SHOP), jpu.a("_msg_token", a().W0()), jpu.a("_msg_source", a.MSG_SOURCE_PARENT), jpu.a("_msg_target", "*"), jpu.a("data", brf.a(jpu.a("feature", jSONObject), jpu.a("event", jSONObject2))));
                ShopBroadcastController f = ShopBroadcastController.f(a().Q());
                if (f != null) {
                    f.i(a2);
                }
                obj = Result.m1108constructorimpl(xhv.INSTANCE);
                Throwable th2 = Result.m1111exceptionOrNullimpl(obj);
                if (th2 != null) {
                    npp.Companion.c("catching block has error", th2);
                }
            }
        }
    }
}
