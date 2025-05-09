package tb;

import android.os.Bundle;
import android.os.Handler;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.tao.shop.TBShopPageType;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class soj implements ovd {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static final String f28172a = "com.taobao.intent.category.HYBRID_UI";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Bundle f28173a;
        public final /* synthetic */ String b;

        public a(Bundle bundle, String str) {
            this.f28173a = bundle;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                Nav.from(lvr.b).withExtras(this.f28173a).withCategory("com.taobao.intent.category.HYBRID_UI").toUri(this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static /* synthetic */ class b {
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
        }
    }

    static {
        t2o.a(668991492);
        t2o.a(668991491);
    }

    @Override // tb.ovd
    public void a(TBShopPageType tBShopPageType, String str, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d325cf8", new Object[]{this, tBShopPageType, str, bundle});
            return;
        }
        int i = b.$SwitchMap$com$taobao$tao$shop$TBShopPageType[tBShopPageType.ordinal()];
        if (i == 1 || i == 2) {
            new Handler(lvr.b.getMainLooper()).postDelayed(new a(bundle, str), 50L);
        } else {
            Nav.from(lvr.b).withExtras(bundle).toUri(str);
        }
    }
}
