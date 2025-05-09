package tb;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.tao.image.ImageStrategyConfig;
import com.taobao.tao.util.ImageStrategyDecider;
import com.taobao.tao.util.TaobaoImageUrlStrategy;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import tb.ad2;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class c1m implements wdc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public ImageStrategyConfig f16774a = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class a implements s8d<FailPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ cme f16775a;
        public final /* synthetic */ CountDownLatch b;

        public a(c1m c1mVar, cme cmeVar, CountDownLatch countDownLatch) {
            this.f16775a = cmeVar;
            this.b = countDownLatch;
        }

        /* renamed from: a */
        public boolean onHappen(FailPhenixEvent failPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5fa0e8d0", new Object[]{this, failPhenixEvent})).booleanValue();
            }
            if (failPhenixEvent != null) {
                this.f16775a.e(String.valueOf(failPhenixEvent.getResultCode()));
                cme cmeVar = this.f16775a;
                cmeVar.f("DownLoad Error:" + failPhenixEvent.getUrl());
            }
            this.b.countDown();
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class b implements s8d<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ cme f16776a;
        public final /* synthetic */ CountDownLatch b;

        public b(c1m c1mVar, cme cmeVar, CountDownLatch countDownLatch) {
            this.f16776a = cmeVar;
            this.b = countDownLatch;
        }

        /* renamed from: a */
        public boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
            }
            this.f16776a.d(succPhenixEvent.getDrawable().getBitmap());
            this.b.countDown();
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class c implements ad2 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f16777a;
        public final /* synthetic */ int b;
        public final /* synthetic */ int c;

        public c(c1m c1mVar, int i, int i2, int i3) {
            this.f16777a = i;
            this.b = i2;
            this.c = i3;
        }

        @Override // tb.ad2
        public String getId() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("81e05888", new Object[]{this});
            }
            return c1m.class.getName();
        }

        @Override // tb.ad2
        public Bitmap process(String str, ad2.a aVar, Bitmap bitmap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Bitmap) ipChange.ipc$dispatch("59b6dc7b", new Object[]{this, str, aVar, bitmap});
            }
            int max = Math.max(bitmap.getWidth(), bitmap.getHeight());
            int min = Math.min(bitmap.getWidth(), bitmap.getHeight());
            int i = this.f16777a;
            if (max <= i && min <= this.b) {
                return gd2.p(bitmap, this.c);
            }
            float min2 = Math.min((i * 1.0f) / max, (this.b * 1.0f) / min);
            Matrix matrix = new Matrix();
            matrix.setScale(min2, min2);
            return gd2.p(Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, false), 0);
        }
    }

    static {
        t2o.a(481296402);
        t2o.a(481296423);
    }

    public final ImageStrategyConfig a(TaobaoImageUrlStrategy.ImageQuality imageQuality) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageStrategyConfig) ipChange.ipc$dispatch("df48b5e5", new Object[]{this, imageQuality});
        }
        ImageStrategyConfig.b v = ImageStrategyConfig.v(ImageStrategyConfig.WEAPP, 70);
        v.i(imageQuality);
        return v.a();
    }

    public final String c(String str, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("68157237", new Object[]{this, str, new Integer(i), new Integer(i2)});
        }
        if (!str.startsWith("http") || Pattern.compile("\\.(\\d+)x(\\d+)").matcher(str).find()) {
            return str;
        }
        ImageStrategyConfig imageStrategyConfig = this.f16774a;
        if (imageStrategyConfig == null) {
            imageStrategyConfig = a(TaobaoImageUrlStrategy.ImageQuality.q90);
        }
        this.f16774a = imageStrategyConfig;
        return ImageStrategyDecider.decideUrl(str, Integer.valueOf(i), Integer.valueOf(i2), imageStrategyConfig);
    }

    public cme b(String str, int i, int i2, int i3, int i4, int i5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cme) ipChange.ipc$dispatch("d58b68a3", new Object[]{this, str, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5)});
        }
        cme cmeVar = new cme();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        if (i2 == 0 || i3 == 0) {
            i2 = caa.l();
            i3 = caa.j();
        }
        if (i4 == 0 || i5 == 0 || lg4.x4()) {
            i4 = i2;
            i5 = i3;
        }
        s0m.B().T(c(str, i2, i3)).addLoaderExtra(nd2.BUNDLE_BIZ_CODE, "8930").releasableDrawable(false).scaleFromLarge(true).preloadWithSmall(false).limitSize(null, i4, i5).bitmapProcessors(new c(this, i5, i4, i)).succListener(new b(this, cmeVar, countDownLatch)).failListener(new a(this, cmeVar, countDownLatch)).fetch();
        try {
            countDownLatch.await(10L, TimeUnit.SECONDS);
            if (cmeVar.a() == null && !TextUtils.isEmpty(cmeVar.b()) && !TextUtils.isEmpty(cmeVar.c())) {
                cmeVar.e("-10086");
                cmeVar.g(true);
                cmeVar.f("Download Timeout");
            }
        } catch (Exception unused) {
        }
        try {
            if (cmeVar.a() == null) {
                jzu.e("getRemoteImageError", new String[0]);
            } else {
                jzu.e("getRemoteImageSuccess", new String[0]);
            }
        } catch (Exception unused2) {
        }
        return cmeVar;
    }
}
