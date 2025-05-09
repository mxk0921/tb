package tb;

import android.app.Application;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alimama.AlimamaAdvertising;
import com.taobao.android.nav.Nav;
import com.taobao.tao.shop.TBSRCtx;
import com.taobao.tao.shop.TBShopPageType;
import com.ut.mini.UTAnalytics;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class jts {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile jts c = new jts();

    /* renamed from: a  reason: collision with root package name */
    public final ovd f22210a = new b();
    public final nvd b = new c(this);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements ovd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ bho f22211a;

        public a(bho bhoVar) {
            this.f22211a = bhoVar;
        }

        @Override // tb.ovd
        public void a(TBShopPageType tBShopPageType, String str, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d325cf8", new Object[]{this, tBShopPageType, str, bundle});
                return;
            }
            jts.a(jts.this).a(tBShopPageType, str, bundle);
            bho bhoVar = this.f22211a;
            if (bhoVar != null) {
                bhoVar.routerFinished();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements nvd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c(jts jtsVar) {
        }

        public void a(String str, String str2, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("92f09f0", new Object[]{this, str, str2, new Boolean(z)});
            } else if (!TextUtils.isEmpty(str)) {
                try {
                    long parseLong = Long.parseLong(str2);
                    String globalProperty = UTAnalytics.getInstance().getDefaultTracker().getGlobalProperty("_afc_id");
                    HashMap hashMap = new HashMap();
                    hashMap.put(ah0.AFC_ID, globalProperty);
                    if (jvr.p().f()) {
                        AlimamaAdvertising.instance().commitTaokeInfo(str, parseLong, 0L, z, hashMap);
                    } else {
                        AlimamaAdvertising.instance().commitTaokeInfo(str, parseLong, 0L, z);
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static /* synthetic */ class d {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$tao$shop$TBShopPageType;

        static {
            int[] iArr = new int[TBShopPageType.values().length];
            $SwitchMap$com$taobao$tao$shop$TBShopPageType = iArr;
            try {
                iArr[TBShopPageType.SHOP_PAGE_FORCE_H5_BROWSER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$tao$shop$TBShopPageType[TBShopPageType.SHOP_PAGE_SUPERMARKET_OLD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$taobao$tao$shop$TBShopPageType[TBShopPageType.SHOP_PAGE_NEW_HOME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        t2o.a(668991511);
    }

    public static /* synthetic */ ovd a(jts jtsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ovd) ipChange.ipc$dispatch("561c0353", new Object[]{jtsVar});
        }
        return jtsVar.f22210a;
    }

    public static jts b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jts) ipChange.ipc$dispatch("4d667658", new Object[0]);
        }
        return c;
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6ec5ff65", new Object[]{this})).booleanValue();
        }
        return lvr.f23598a;
    }

    public void d(Application application, String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a3a9c47", new Object[]{this, application, str, str2, new Integer(i)});
            return;
        }
        o7r.d();
        lvr.b(application, str2, i, o7r.b());
        kvr.j(application).x(this.b);
        TBSRCtx.INSTANCE.setRouterMonitor(new com.taobao.tao.shop.track.b().b(new com.taobao.tao.shop.track.c(), new com.taobao.tao.shop.track.d()));
    }

    public boolean e(String str, String str2, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9ca54ec", new Object[]{this, str, str2, context})).booleanValue();
        }
        kvr j = kvr.j(context);
        j.y(this.f22210a);
        return j.o(str, str2, context);
    }

    public boolean f(String str, String str2, Context context, bho bhoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fd8b98f1", new Object[]{this, str, str2, context, bhoVar})).booleanValue();
        }
        kvr j = kvr.j(context);
        j.y(new a(bhoVar));
        return j.o(str, str2, context);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements ovd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String f22213a;
            public final /* synthetic */ Bundle b;

            public a(String str, Bundle bundle) {
                this.f22213a = str;
                this.b = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else if (jvr.p().i()) {
                    Nav.from(lvr.b).withExtras(this.b).withCategory("com.taobao.intent.category.HYBRID_UI").toUri(Uri.parse(this.f22213a).buildUpon().appendQueryParameter(kvr.SHOP_RULE_PROCESSED, "true").build().toString());
                } else {
                    Nav.from(lvr.b).withExtras(this.b).withCategory("com.taobao.intent.category.HYBRID_UI").toUri(this.f22213a);
                }
            }
        }

        public b() {
        }

        @Override // tb.ovd
        public void a(TBShopPageType tBShopPageType, String str, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d325cf8", new Object[]{this, tBShopPageType, str, bundle});
                return;
            }
            int i = d.$SwitchMap$com$taobao$tao$shop$TBShopPageType[tBShopPageType.ordinal()];
            if (i == 1 || i == 2) {
                new Handler(lvr.b.getMainLooper()).postDelayed(new a(str, bundle), 50L);
            } else if (i == 3) {
                if (iio.m(str)) {
                    str = jyr.a(str);
                    mvr.c("weex shop processed url is " + str);
                }
                Nav.from(lvr.b).withExtras(bundle).toUri(str);
            } else if (jvr.p().i()) {
                Nav.from(lvr.b).withExtras(bundle).toUri(Uri.parse(str).buildUpon().appendQueryParameter(kvr.SHOP_RULE_PROCESSED, "true").build().toString());
            } else {
                Nav.from(lvr.b).withExtras(bundle).toUri(str);
            }
        }
    }
}
