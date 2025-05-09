package com.alibaba.triver.triver_shop.shop2023;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import com.alibaba.triver.triver_shop.newShop.data.ShopDataParser;
import com.alibaba.triver.triver_shop.newShop.ext.ShopExtKt;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexErrorType;
import com.taobao.android.weex.WeexInstance;
import com.taobao.android.weex.WeexInstanceMode;
import com.taobao.android.weex.WeexRenderType;
import com.taobao.android.weex.WeexValueImpl;
import com.taobao.android.weex_framework.performance.WMInstanceApm;
import java.util.Map;
import kotlin.Result;
import tb.a07;
import tb.ade;
import tb.brf;
import tb.ckf;
import tb.j6x;
import tb.jpu;
import tb.mop;
import tb.npp;
import tb.r54;
import tb.t2o;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class XSDStoreWeexModeComponent extends Shop2023BaseComponent implements j6x {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    public static WeexInstance N;
    public WeexInstance L;
    public final XSDStoreWeexModeComponent$currentObserver$1 M = new LifecycleObserver() { // from class: com.alibaba.triver.triver_shop.shop2023.XSDStoreWeexModeComponent$currentObserver$1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
        public final void onPaused() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c47335f4", new Object[]{this});
            } else {
                XSDStoreWeexModeComponent.this.T();
            }
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
        public final void onResumed() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("17fe877f", new Object[]{this});
                return;
            }
            XSDStoreWeexModeComponent.d1(XSDStoreWeexModeComponent.this);
            XSDStoreWeexModeComponent.this.U();
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_START)
        public final void onStart() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
                return;
            }
            WeexInstance f1 = XSDStoreWeexModeComponent.f1(XSDStoreWeexModeComponent.this);
            if (f1 != null) {
                f1.onActivityStart();
            }
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
        public final void onStop() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b3dde88", new Object[]{this});
                return;
            }
            WeexInstance f1 = XSDStoreWeexModeComponent.f1(XSDStoreWeexModeComponent.this);
            if (f1 != null) {
                f1.onActivityStop();
            }
        }
    };

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(766510303);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }

        public final void a(Activity activity) {
            Object obj;
            Bundle extras;
            String string;
            Uri N;
            Uri N2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("23fe6158", new Object[]{this, activity});
                return;
            }
            ckf.g(activity, "context");
            if (XSDStoreWeexModeComponent.e1() == null) {
                try {
                    Intent intent = activity.getIntent();
                    String str = "https://web.m.taobao.com/app/tb-store/same-hour-delivery-shop/shop-frame?wh_weex=true&weex_mode=dom&wx_navbar_hidden=true&wx_navbar_transparent=true&_wx_statusbar_hidden=true&is_loading=0&disableNav=YES&wx_use_layoutng=true";
                    if (!(intent == null || (extras = intent.getExtras()) == null || (string = extras.getString(mop.KEY_FIRST_IN_SHOP_URL)) == null || (N = r54.N(string)) == null || (N2 = r54.N(str)) == null)) {
                        Uri.Builder buildUpon = N2.buildUpon();
                        for (Map.Entry<String, String> entry : r54.o(N).entrySet()) {
                            buildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
                        }
                        str = buildUpon.toString();
                        ckf.f(str, "builder.toString()");
                    }
                    IpChange ipChange2 = XSDStoreWeexModeComponent.$ipChange;
                    WeexInstance a2 = com.taobao.android.weex.b.a(activity, str, WeexInstanceMode.DOM, WeexRenderType.UNICORN, null, null);
                    a2.initWithURL(str);
                    a2.setInstanceData(WeexValueImpl.ofJSON(brf.a(jpu.a("shop", brf.a(jpu.a("xsdCategory", null), jpu.a("routeProcess", null))))));
                    a2.render(null);
                    XSDStoreWeexModeComponent.g1(a2);
                    obj = Result.m1108constructorimpl(xhv.INSTANCE);
                } catch (Throwable th) {
                    obj = Result.m1108constructorimpl(kotlin.b.a(th));
                }
                Throwable th2 = Result.m1111exceptionOrNullimpl(obj);
                if (th2 != null) {
                    npp.Companion.c("catching block has error", th2);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class b implements ade {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ShopDataParser f3298a;

        public b(ShopDataParser shopDataParser) {
            this.f3298a = shopDataParser;
        }

        @Override // tb.ade
        public final void a(Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("569d90dc", new Object[]{this, map});
                return;
            }
            Object obj = map.get(WMInstanceApm.KEY_PAGE_STAGES_RASTER_INTERACTION_OPT);
            Object obj2 = map.get(WMInstanceApm.KEY_PAGE_STAGES_INTERACTION_OPT);
            ShopDataParser shopDataParser = this.f3298a;
            if (obj == null) {
                obj = obj2;
            }
            shopDataParser.Y2(mop.KEY_XSD_PAGE_FINISH, obj);
            npp.a aVar = npp.Companion;
            aVar.b("weex report data");
            aVar.b(r54.X(map));
            ShopExtKt.t0(this.f3298a);
        }
    }

    static {
        t2o.a(766510302);
        t2o.a(982515791);
    }

    public static final /* synthetic */ void d1(XSDStoreWeexModeComponent xSDStoreWeexModeComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c10df8c2", new Object[]{xSDStoreWeexModeComponent});
        } else {
            xSDStoreWeexModeComponent.f();
        }
    }

    public static final /* synthetic */ WeexInstance e1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexInstance) ipChange.ipc$dispatch("a1e44334", new Object[0]);
        }
        return N;
    }

    public static final /* synthetic */ WeexInstance f1(XSDStoreWeexModeComponent xSDStoreWeexModeComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexInstance) ipChange.ipc$dispatch("70009905", new Object[]{xSDStoreWeexModeComponent});
        }
        return xSDStoreWeexModeComponent.L;
    }

    public static final /* synthetic */ void g1(WeexInstance weexInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b22636a", new Object[]{weexInstance});
        } else {
            N = weexInstance;
        }
    }

    public static /* synthetic */ Object ipc$super(XSDStoreWeexModeComponent xSDStoreWeexModeComponent, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1983604863) {
            super.g();
            return null;
        } else if (hashCode == 474982114) {
            super.U();
            return null;
        } else if (hashCode == 988548963) {
            super.T();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alibaba/triver/triver_shop/shop2023/XSDStoreWeexModeComponent");
        }
    }

    @Override // tb.j6x
    public void E1(WeexInstance weexInstance, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f794a71b", new Object[]{this, weexInstance, new Boolean(z)});
        }
    }

    @Override // tb.j6x
    public void H0(WeexInstance weexInstance, boolean z, WeexErrorType weexErrorType, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99cc9148", new Object[]{this, weexInstance, new Boolean(z), weexErrorType, str});
        }
    }

    @Override // tb.j6x
    public void I1(WeexInstance weexInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68c948df", new Object[]{this, weexInstance});
        }
    }

    @Override // tb.j6x
    public void K0(WeexInstance weexInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad8178b2", new Object[]{this, weexInstance});
        }
    }

    @Override // tb.j6x
    public void K1(WeexInstance weexInstance, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a414e261", new Object[]{this, weexInstance, new Boolean(z)});
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.BaseContentComponent
    public boolean R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("46691468", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.BaseContentComponent
    public void T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3aec0f63", new Object[]{this});
            return;
        }
        super.T();
        WeexInstance weexInstance = this.L;
        if (weexInstance != null) {
            weexInstance.onActivityPause();
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.BaseContentComponent
    public void U() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c4fa6e2", new Object[]{this});
            return;
        }
        super.U();
        WeexInstance weexInstance = this.L;
        if (weexInstance != null) {
            weexInstance.onActivityResume();
        }
    }

    @Override // tb.j6x
    public void d2(WeexInstance weexInstance, WeexErrorType weexErrorType, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a7821b2", new Object[]{this, weexInstance, weexErrorType, str});
        }
    }

    @Override // tb.j6x
    public void e2(WeexInstance weexInstance, WeexErrorType weexErrorType, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52b846bb", new Object[]{this, weexInstance, weexErrorType, str});
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.BaseContentComponent
    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        super.g();
        WeexInstance weexInstance = this.L;
        if (weexInstance != null) {
            weexInstance.destroy();
        }
    }

    @Override // tb.j6x
    public void l2(WeexInstance weexInstance, WeexErrorType weexErrorType, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55726f6d", new Object[]{this, weexInstance, weexErrorType, str});
        }
    }

    @Override // tb.j6x
    public void z1(WeexInstance weexInstance, boolean z, WeexErrorType weexErrorType, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bee002", new Object[]{this, weexInstance, new Boolean(z), weexErrorType, str});
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0142  */
    @Override // com.alibaba.triver.triver_shop.shop2023.Shop2023BaseComponent, com.alibaba.triver.triver_shop.newShop.view.component.BaseContentComponent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void N(androidx.fragment.app.FragmentActivity r23, com.alibaba.triver.triver_shop.newShop.data.ShopDataParser r24, com.alibaba.triver.triver_shop.newShop.ext.ShopDXEngine r25) {
        /*
            Method dump skipped, instructions count: 349
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.triver.triver_shop.shop2023.XSDStoreWeexModeComponent.N(androidx.fragment.app.FragmentActivity, com.alibaba.triver.triver_shop.newShop.data.ShopDataParser, com.alibaba.triver.triver_shop.newShop.ext.ShopDXEngine):void");
    }
}
