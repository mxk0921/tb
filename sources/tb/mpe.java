package tb;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.intf.PhenixCreator;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.tao.image.ImageStrategyConfig;
import com.taobao.tao.util.ImageStrategyDecider;
import com.taobao.tao.util.TaobaoImageUrlStrategy;
import com.taobao.taobao.R;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class mpe {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int BIZ_ID = 15;
    public static final String BIZ_ID_STR = "15";
    public static final String BIZ_NAME = "detail";
    public static final int INVALID_RES_ID = -1;
    public static final int MAX_SIZE = 1200;
    public static final int PRELOAD_MAX_SIZE = 480;

    /* renamed from: a  reason: collision with root package name */
    public static final int f24205a = R.id.tt_detail_element_image_url;
    public static final int b = R.id.tt_detail_element_image_original_url;
    public static final int c = R.id.tt_detail_element_image_url_success;
    public static final int d = R.id.tt_detail_element_image_load_ticket;
    public static final ConcurrentHashMap<Integer, ConcurrentHashMap<Integer, WeakReference<ImageView>>> e = new ConcurrentHashMap<>();
    public static final boolean f = vbl.e0();
    public static final boolean g = vbl.f1();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a implements s8d<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f24206a;

        public a(String str) {
            this.f24206a = str;
        }

        /* renamed from: a */
        public boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
            }
            if (TextUtils.equals(this.f24206a, succPhenixEvent.getUrl()) && !succPhenixEvent.isIntermediate()) {
                tgh.b("ImageUtils", "preloadImageUrl success with: " + this.f24206a);
            }
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b implements s8d<FailPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f24207a;
        public final /* synthetic */ String b;
        public final /* synthetic */ boolean c;

        public b(String str, String str2, boolean z) {
            this.f24207a = str;
            this.b = str2;
            this.c = z;
        }

        /* renamed from: a */
        public boolean onHappen(FailPhenixEvent failPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5fa0e8d0", new Object[]{this, failPhenixEvent})).booleanValue();
            }
            if (TextUtils.equals(this.f24207a, failPhenixEvent.getUrl())) {
                tgh.b("ImageUtils", "preloadImageUrl failure with: " + this.f24207a);
                if (!TextUtils.equals(this.f24207a, this.b)) {
                    mpe.t(this.b, this.c);
                    tgh.b("ImageUtils", "preloadImageUrl failure with: " + this.f24207a + " reload with originalUrl: " + this.b);
                }
            }
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class c implements s8d<FailPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<ImageView> f24208a;
        public final boolean b;
        public final int c;
        public final boolean d;
        public final boolean e;

        static {
            t2o.a(912262800);
            t2o.a(620757101);
        }

        public c(ImageView imageView, int i, boolean z, boolean z2, boolean z3) {
            this.b = false;
            this.d = false;
            this.e = false;
            this.c = -1;
            this.f24208a = new WeakReference<>(imageView);
            this.c = i;
            this.b = z;
            this.d = z2;
            this.e = z3;
        }

        /* renamed from: a */
        public boolean onHappen(FailPhenixEvent failPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5fa0e8d0", new Object[]{this, failPhenixEvent})).booleanValue();
            }
            ImageView imageView = this.f24208a.get();
            if (imageView == null) {
                return true;
            }
            String url = failPhenixEvent.getUrl();
            String str = (String) imageView.getTag(mpe.a());
            if (TextUtils.equals(url, str)) {
                String str2 = (String) imageView.getTag(mpe.c());
                if (!TextUtils.equals(str, str2)) {
                    mpe.w(imageView, 0, 0, str2, this.c, this.b, null, true, this.d, this.e);
                    tgh.b("ImageUtils", "loadImageWithUrl failure with: " + str + " reload with originalUrl: " + str2);
                } else {
                    int i = this.c;
                    if (i != -1) {
                        imageView.setImageResource(i);
                    } else {
                        imageView.setImageDrawable(null);
                    }
                    imageView.setTag(mpe.b(), Boolean.FALSE);
                    tgh.b("ImageUtils", "loadImageWithUrl withPhenix failure with: " + str);
                }
            }
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class d implements s8d<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<ImageView> f24209a;

        static {
            t2o.a(912262801);
            t2o.a(620757101);
        }

        public d(ImageView imageView) {
            this.f24209a = new WeakReference<>(imageView);
        }

        /* renamed from: a */
        public boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            boolean z = false;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
            }
            ImageView imageView = this.f24209a.get();
            if (imageView == null) {
                return true;
            }
            String url = succPhenixEvent.getUrl();
            String str = (String) imageView.getTag(mpe.a());
            if (TextUtils.equals(url, str)) {
                BitmapDrawable drawable = succPhenixEvent.getDrawable();
                imageView.setImageDrawable(drawable);
                int b = mpe.b();
                if (drawable != null && !succPhenixEvent.isIntermediate()) {
                    z = true;
                }
                imageView.setTag(b, Boolean.valueOf(z));
                tgh.b("ImageUtils", "loadImageWithUrl withPhenix success with: " + str);
            }
            return true;
        }
    }

    static {
        t2o.a(912262797);
    }

    public static /* synthetic */ int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bcd6076a", new Object[0])).intValue();
        }
        return f24205a;
    }

    public static /* synthetic */ int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f1bc42ab", new Object[0])).intValue();
        }
        return c;
    }

    public static /* synthetic */ int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("26a27dec", new Object[0])).intValue();
        }
        return b;
    }

    public static void d(ImageView imageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81c3dc40", new Object[]{imageView});
        } else if (f) {
            ConcurrentHashMap<Integer, WeakReference<ImageView>> concurrentHashMap = e.get(Integer.valueOf(tq4.d(imageView).hashCode()));
            int hashCode = imageView.hashCode();
            if (concurrentHashMap != null && !concurrentHashMap.containsKey(Integer.valueOf(hashCode))) {
                concurrentHashMap.put(Integer.valueOf(hashCode), new WeakReference<>(imageView));
            }
        }
    }

    public static boolean e(ImageView imageView, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f025477", new Object[]{imageView, str, new Integer(i)})).booleanValue();
        }
        if (!TextUtils.isEmpty(str)) {
            return true;
        }
        if (i != -1) {
            imageView.setImageResource(i);
        } else {
            imageView.setImageDrawable(null);
        }
        imageView.setTag(d, null);
        imageView.setTag(b, str);
        imageView.setTag(f24205a, str);
        imageView.setTag(c, Boolean.TRUE);
        return false;
    }

    public static void f(Context context) {
        ConcurrentHashMap<Integer, WeakReference<ImageView>> remove;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbf4b767", new Object[]{context});
        } else if (f && context != null && (remove = e.remove(Integer.valueOf(context.hashCode()))) != null) {
            for (WeakReference<ImageView> weakReference : remove.values()) {
                ImageView imageView = weakReference.get();
                if (imageView != null) {
                    m(imageView, null);
                }
            }
        }
    }

    public static boolean g(ImageView imageView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("766aa79e", new Object[]{imageView, str})).booleanValue();
        }
        try {
            BitmapDrawable k = s0m.B().k(str);
            if (k != null) {
                imageView.setImageDrawable(k);
                imageView.setTag(b, str);
                imageView.setTag(f24205a, str);
                imageView.setTag(d, null);
                imageView.setTag(c, Boolean.TRUE);
                tgh.b("ImageUtils", "fetchLocalDrawable success with url: " + str);
                return true;
            }
        } catch (Throwable th) {
            tgh.c("ImageUtils", "fetchLocalDrawable with url: " + str + " error: ", th);
        }
        return false;
    }

    public static ImageStrategyConfig h(TaobaoImageUrlStrategy.ImageQuality imageQuality) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageStrategyConfig) ipChange.ipc$dispatch("405d7aaf", new Object[]{imageQuality});
        }
        ImageStrategyConfig.b v = ImageStrategyConfig.v("detail", 15);
        if (imageQuality == null) {
            imageQuality = TaobaoImageUrlStrategy.ImageQuality.q90;
        }
        return v.i(imageQuality).a();
    }

    public static boolean i(ImageView imageView, String str) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1d394bed", new Object[]{imageView, str})).booleanValue();
        }
        String str2 = (String) imageView.getTag(f24205a);
        Drawable drawable = imageView.getDrawable();
        Object tag = imageView.getTag(c);
        if (tag == null || !Boolean.parseBoolean(tag.toString())) {
            z = false;
        } else {
            z = true;
        }
        if (!TextUtils.equals(str, str2) || drawable == null || !z) {
            return false;
        }
        imageView.setTag(d, null);
        return true;
    }

    public static boolean j(ImageView imageView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d13616d4", new Object[]{imageView, str})).booleanValue();
        }
        Object tag = imageView.getTag(d);
        if (tag instanceof p1m) {
            p1m p1mVar = (p1m) tag;
            if (TextUtils.isEmpty(str) || !p1mVar.f(str)) {
                p1mVar.a();
            } else if (p1mVar.c()) {
                return true;
            } else {
                if (p1mVar.b()) {
                    Object tag2 = imageView.getTag(c);
                    if (tag2 != null && Boolean.parseBoolean(tag2.toString())) {
                        return true;
                    }
                } else {
                    p1mVar.a();
                }
            }
        }
        return false;
    }

    public static void k(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{context});
        } else if (f && context != null) {
            int hashCode = context.hashCode();
            ConcurrentHashMap<Integer, ConcurrentHashMap<Integer, WeakReference<ImageView>>> concurrentHashMap = e;
            if (!concurrentHashMap.containsKey(Integer.valueOf(hashCode))) {
                concurrentHashMap.put(Integer.valueOf(hashCode), new ConcurrentHashMap<>());
            }
        }
    }

    public static void l(ImageView imageView, int i, int i2, String str, int i3, boolean z, ImageStrategyConfig imageStrategyConfig, boolean z2) {
        boolean z3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93b70bb1", new Object[]{imageView, new Integer(i), new Integer(i2), str, new Integer(i3), new Boolean(z), imageStrategyConfig, new Boolean(z2)});
            return;
        }
        if (imageStrategyConfig == null || !imageStrategyConfig.z()) {
            z3 = false;
        } else {
            z3 = true;
        }
        w(imageView, i, i2, str, i3, z, imageStrategyConfig, z2, z3, g);
    }

    public static void m(ImageView imageView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d57a29ff", new Object[]{imageView, str});
        } else {
            n(imageView, str, -1);
        }
    }

    public static void n(ImageView imageView, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9cb88e4", new Object[]{imageView, str, new Integer(i)});
        } else {
            o(imageView, str, i, true);
        }
    }

    public static void o(ImageView imageView, String str, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fa64670", new Object[]{imageView, str, new Integer(i), new Boolean(z)});
        } else {
            p(imageView, str, i, z, true);
        }
    }

    public static void p(ImageView imageView, String str, int i, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95233a64", new Object[]{imageView, str, new Integer(i), new Boolean(z), new Boolean(z2)});
        } else {
            q(imageView, str, i, z, z2, false);
        }
    }

    public static void q(ImageView imageView, String str, int i, boolean z, boolean z2, boolean z3) {
        ImageStrategyConfig imageStrategyConfig;
        int i2;
        int i3;
        int i4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f44c4f0", new Object[]{imageView, str, new Integer(i), new Boolean(z), new Boolean(z2), new Boolean(z3)});
            return;
        }
        if (z2) {
            int i5 = 1200;
            if (imageView == null) {
                i4 = 1200;
            } else {
                i4 = imageView.getWidth();
                int height = imageView.getHeight();
                if (i4 <= 0) {
                    i4 = 1200;
                }
                if (height > 0) {
                    i5 = height;
                }
            }
            ImageStrategyConfig.b i6 = ImageStrategyConfig.v("detail", 15).i(TaobaoImageUrlStrategy.ImageQuality.q90);
            if (g) {
                i6.o(true);
            }
            i2 = i5;
            imageStrategyConfig = i6.a();
            i3 = i4;
        } else {
            imageStrategyConfig = null;
            i3 = 0;
            i2 = 0;
        }
        l(imageView, i3, i2, str, i, z, imageStrategyConfig, z3);
    }

    public static void r(ImageView imageView, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9cbc8b5", new Object[]{imageView, str, new Boolean(z)});
        } else {
            o(imageView, str, -1, z);
        }
    }

    public static void s(String str, int i, int i2, boolean z, ImageStrategyConfig imageStrategyConfig) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd0c3019", new Object[]{str, new Integer(i), new Integer(i2), new Boolean(z), imageStrategyConfig});
        } else if (!TextUtils.isEmpty(str)) {
            String d2 = jov.d(str);
            if (i <= 0) {
                i = 1200;
            }
            if (i2 <= 0) {
                i2 = 1200;
            }
            if (imageStrategyConfig != null) {
                str2 = ImageStrategyDecider.decideUrl(d2, Integer.valueOf(i), Integer.valueOf(i2), imageStrategyConfig);
            } else {
                str2 = d2;
            }
            PhenixCreator scaleFromLarge = s0m.B().T(str2).schedulePriority(4).preloadWithSmall(true).scaleFromLarge(true);
            if (z) {
                scaleFromLarge.fuzzyMatchCache();
            }
            scaleFromLarge.failListener(new b(str2, d2, z)).succListener(new a(str2)).fetch();
        }
    }

    public static void t(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fc15a86", new Object[]{str, new Boolean(z)});
        } else {
            s(str, 0, 0, z, null);
        }
    }

    public static void u(ImageView imageView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63dbe5d0", new Object[]{imageView, str});
        } else {
            v(imageView, str, -1, true, true, false);
        }
    }

    public static void v(ImageView imageView, String str, int i, boolean z, boolean z2, boolean z3) {
        ImageStrategyConfig imageStrategyConfig;
        int i2;
        int i3;
        int i4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbd23041", new Object[]{imageView, str, new Integer(i), new Boolean(z), new Boolean(z2), new Boolean(z3)});
            return;
        }
        if (z2) {
            int i5 = 1200;
            if (imageView == null) {
                i4 = 1200;
            } else {
                i4 = imageView.getWidth();
                int height = imageView.getHeight();
                if (i4 <= 0) {
                    i4 = 1200;
                }
                if (height > 0) {
                    i5 = height;
                }
            }
            i2 = i5;
            imageStrategyConfig = ImageStrategyConfig.v("detail", 15).p(true).o(true).a();
            i3 = i4;
        } else {
            imageStrategyConfig = null;
            i3 = 0;
            i2 = 0;
        }
        l(imageView, i3, i2, str, i, z, imageStrategyConfig, z3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b2, code lost:
        if (android.text.TextUtils.isEmpty(r2) != false) goto L_0x00b4;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void w(android.widget.ImageView r17, int r18, int r19, java.lang.String r20, int r21, boolean r22, com.taobao.tao.image.ImageStrategyConfig r23, boolean r24, boolean r25, boolean r26) {
        /*
            Method dump skipped, instructions count: 461
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.mpe.w(android.widget.ImageView, int, int, java.lang.String, int, boolean, com.taobao.tao.image.ImageStrategyConfig, boolean, boolean, boolean):void");
    }
}
