package tb;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.data.common.SimpleEntry;
import com.taobao.android.detail.ttdetail.utils.TTDAsyncTask;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.taobao.R;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class cg2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final int f17039a = R.id.tt_detail_element_image_url;
    public static final int b = R.id.tt_detail_element_image_original_url;
    public static final int c = R.id.tt_detail_element_image_url_success;
    public static final int d = R.id.tt_detail_element_image_load_ticket;
    public static final ConcurrentHashMap<Integer, ConcurrentHashMap<String, List<SimpleEntry<s8d<SuccPhenixEvent>, s8d<FailPhenixEvent>>>>> e = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<Integer, ConcurrentHashMap<String, Integer>> f = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<Integer, ConcurrentHashMap<String, BitmapDrawable>> g = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<Integer, ConcurrentHashMap<Integer, WeakReference<ImageView>>> h = new ConcurrentHashMap<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a implements s8d<FailPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f17040a;
        public final WeakReference<ImageView> b;
        public final int c;
        public final int d;
        public final int e;
        public final boolean f;

        static {
            t2o.a(912262746);
            t2o.a(620757101);
        }

        public a(String str, ImageView imageView, int i, int i2, int i3, boolean z) {
            this.f17040a = str;
            this.b = new WeakReference<>(imageView);
            this.c = i;
            this.d = i2;
            this.e = i3;
            this.f = z;
        }

        /* renamed from: a */
        public boolean onHappen(FailPhenixEvent failPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5fa0e8d0", new Object[]{this, failPhenixEvent})).booleanValue();
            }
            String url = failPhenixEvent.getUrl();
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) cg2.d().get(Integer.valueOf(this.f17040a.hashCode()));
            if (concurrentHashMap != null) {
                concurrentHashMap.put(url, 0);
            }
            ImageView imageView = this.b.get();
            List<SimpleEntry> list = null;
            if (imageView != null) {
                String str = (String) imageView.getTag(cg2.e());
                if (TextUtils.equals(url, str)) {
                    String str2 = (String) imageView.getTag(cg2.h());
                    if (!TextUtils.equals(str, str2)) {
                        cg2.c(this.f17040a, imageView, str2, false, this.c, true, this.d, this.e, this.f);
                        tgh.b("BlurImageUtils", "loadImageWithUrl failure url: " + str + " and reload with originalUrl: " + str2);
                    } else {
                        int i = this.c;
                        if (i != -1) {
                            imageView.setImageResource(i);
                        } else {
                            imageView.setImageDrawable(null);
                        }
                        imageView.setTag(cg2.f(), Boolean.FALSE);
                        tgh.b("BlurImageUtils", "loadImageWithUrl failureCallback failure url: " + str);
                    }
                }
            }
            ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) cg2.g().get(Integer.valueOf(this.f17040a.hashCode()));
            if (concurrentHashMap2 != null) {
                list = (List) concurrentHashMap2.remove(url);
            }
            if (list == null) {
                return true;
            }
            for (SimpleEntry simpleEntry : list) {
                ((s8d) simpleEntry.getValue()).onHappen(failPhenixEvent);
                tgh.b("BlurImageUtils", "loadImageWithUrl call failListener: " + simpleEntry.getValue() + " url: " + url);
            }
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b implements s8d<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f17041a;
        public final WeakReference<ImageView> b;
        public final int c;
        public final int d;
        public final boolean e;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class a extends TTDAsyncTask<BitmapDrawable, Void, BitmapDrawable> {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public final /* synthetic */ String h;
            public final /* synthetic */ boolean i;
            public final /* synthetic */ SuccPhenixEvent j;

            public a(String str, boolean z, SuccPhenixEvent succPhenixEvent) {
                this.h = str;
                this.i = z;
                this.j = succPhenixEvent;
            }

            public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
                if (str.hashCode() == -1325021319) {
                    super.n(objArr[0]);
                    return null;
                }
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/utils/BlurImageUtils$TTSuccessPhenixListener$1");
            }

            /* renamed from: s */
            public BitmapDrawable f(BitmapDrawable... bitmapDrawableArr) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (BitmapDrawable) ipChange.ipc$dispatch("b3d444e6", new Object[]{this, bitmapDrawableArr});
                }
                return b.a(b.this, bitmapDrawableArr[0], this.h, this.i);
            }

            /* renamed from: t */
            public void n(BitmapDrawable bitmapDrawable) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("bf59f392", new Object[]{this, bitmapDrawable});
                    return;
                }
                super.n(bitmapDrawable);
                b bVar = b.this;
                b.c(bVar, this.j, (ImageView) b.b(bVar).get(), bitmapDrawable, this.h, this.i);
            }
        }

        static {
            t2o.a(912262747);
            t2o.a(620757101);
        }

        public b(String str, ImageView imageView, int i, int i2, boolean z) {
            this.f17041a = str;
            this.b = new WeakReference<>(imageView);
            this.c = i;
            this.d = i2;
            this.e = z;
        }

        public static /* synthetic */ BitmapDrawable a(b bVar, BitmapDrawable bitmapDrawable, String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (BitmapDrawable) ipChange.ipc$dispatch("fc9030c9", new Object[]{bVar, bitmapDrawable, str, new Boolean(z)});
            }
            return bVar.f(bitmapDrawable, str, z);
        }

        public static /* synthetic */ WeakReference b(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (WeakReference) ipChange.ipc$dispatch("f73e19c0", new Object[]{bVar});
            }
            return bVar.b;
        }

        public static /* synthetic */ void c(b bVar, SuccPhenixEvent succPhenixEvent, ImageView imageView, Drawable drawable, String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9152f2b3", new Object[]{bVar, succPhenixEvent, imageView, drawable, str, new Boolean(z)});
            } else {
                bVar.d(succPhenixEvent, imageView, drawable, str, z);
            }
        }

        public final void d(SuccPhenixEvent succPhenixEvent, ImageView imageView, Drawable drawable, String str, boolean z) {
            List<SimpleEntry> list;
            boolean z2 = true;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("109eb8b5", new Object[]{this, succPhenixEvent, imageView, drawable, str, new Boolean(z)});
                return;
            }
            if (imageView != null && TextUtils.equals(str, (String) imageView.getTag(cg2.e()))) {
                imageView.setImageDrawable(drawable);
                int f = cg2.f();
                if (drawable == null || z) {
                    z2 = false;
                }
                imageView.setTag(f, Boolean.valueOf(z2));
                tgh.b("BlurImageUtils", "loadImageWithUrl successCallback with post final drawable intermediate: " + z + " url: " + str);
            }
            if (!z) {
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) cg2.g().get(Integer.valueOf(this.f17041a.hashCode()));
                if (concurrentHashMap != null) {
                    list = (List) concurrentHashMap.remove(str);
                } else {
                    list = null;
                }
                if (list != null) {
                    for (SimpleEntry simpleEntry : list) {
                        ((s8d) simpleEntry.getKey()).onHappen(succPhenixEvent);
                        tgh.b("BlurImageUtils", "loadImageWithUrl call succListener: " + simpleEntry.getKey() + " url: " + str);
                    }
                }
            }
        }

        public final void e(SuccPhenixEvent succPhenixEvent, String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fd6c48a8", new Object[]{this, succPhenixEvent, str, new Boolean(z)});
            } else {
                new a(str, z, succPhenixEvent).g(TTDAsyncTask.THREAD_POOL_EXECUTOR, succPhenixEvent.getDrawable());
            }
        }

        public final BitmapDrawable f(BitmapDrawable bitmapDrawable, String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (BitmapDrawable) ipChange.ipc$dispatch("e6db60b4", new Object[]{this, bitmapDrawable, str, new Boolean(z)});
            }
            BitmapDrawable a2 = cg2.a(bitmapDrawable.getBitmap(), this.c, this.d, str, z);
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) cg2.b().get(Integer.valueOf(this.f17041a.hashCode()));
            if (!(concurrentHashMap == null || a2 == null)) {
                concurrentHashMap.put(str, a2);
            }
            ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) cg2.d().get(Integer.valueOf(this.f17041a.hashCode()));
            if (!(concurrentHashMap2 == null || a2 == null || z)) {
                concurrentHashMap2.put(str, 2);
            }
            tgh.b("BlurImageUtils", "loadImageWithUrl doBlurTask blurBitmap success intermediate: " + z + " url: " + str);
            return a2;
        }

        /* renamed from: g */
        public boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            BitmapDrawable bitmapDrawable;
            Integer num;
            ConcurrentHashMap concurrentHashMap;
            boolean z = false;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
            }
            String url = succPhenixEvent.getUrl();
            boolean isIntermediate = succPhenixEvent.isIntermediate();
            ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) cg2.d().get(Integer.valueOf(this.f17041a.hashCode()));
            if (concurrentHashMap2 == null || (num = (Integer) concurrentHashMap2.get(url)) == null || num.intValue() != 2 || (concurrentHashMap = (ConcurrentHashMap) cg2.b().get(Integer.valueOf(this.f17041a.hashCode()))) == null) {
                bitmapDrawable = null;
            } else {
                bitmapDrawable = (BitmapDrawable) concurrentHashMap.get(url);
                if (bitmapDrawable != null) {
                    z = true;
                }
            }
            ImageView imageView = this.b.get();
            if (z) {
                if (imageView != null && TextUtils.equals(url, (String) imageView.getTag(cg2.e()))) {
                    imageView.setImageDrawable(bitmapDrawable);
                    imageView.setTag(cg2.f(), Boolean.TRUE);
                    tgh.b("BlurImageUtils", "loadImageWithUrl successCallback with cache final drawable url: " + url);
                }
                return true;
            }
            if (this.e) {
                d(succPhenixEvent, this.b.get(), f(succPhenixEvent.getDrawable(), url, isIntermediate), url, isIntermediate);
            } else {
                e(succPhenixEvent, url, isIntermediate);
            }
            return true;
        }
    }

    static {
        t2o.a(912262745);
    }

    public static /* synthetic */ BitmapDrawable a(Bitmap bitmap, int i, int i2, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BitmapDrawable) ipChange.ipc$dispatch("a766c538", new Object[]{bitmap, new Integer(i), new Integer(i2), str, new Boolean(z)});
        }
        return s(bitmap, i, i2, str, z);
    }

    public static /* synthetic */ ConcurrentHashMap b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConcurrentHashMap) ipChange.ipc$dispatch("21008e2e", new Object[0]);
        }
        return g;
    }

    public static /* synthetic */ void c(String str, ImageView imageView, String str2, boolean z, int i, boolean z2, int i2, int i3, boolean z3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1660343", new Object[]{str, imageView, str2, new Boolean(z), new Integer(i), new Boolean(z2), new Integer(i2), new Integer(i3), new Boolean(z3)});
        } else {
            q(str, imageView, str2, z, i, z2, i2, i3, z3);
        }
    }

    public static /* synthetic */ ConcurrentHashMap d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConcurrentHashMap) ipChange.ipc$dispatch("da781bcd", new Object[0]);
        }
        return f;
    }

    public static /* synthetic */ int e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5b88b92d", new Object[0])).intValue();
        }
        return f17039a;
    }

    public static /* synthetic */ int f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("906ef46e", new Object[0])).intValue();
        }
        return c;
    }

    public static /* synthetic */ ConcurrentHashMap g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConcurrentHashMap) ipChange.ipc$dispatch("6dec4aa", new Object[0]);
        }
        return e;
    }

    public static /* synthetic */ int h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("98ee1cb3", new Object[0])).intValue();
        }
        return b;
    }

    public static void i(String str, ImageView imageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5aa280a", new Object[]{str, imageView});
        } else if (imageView != null && str != null) {
            ConcurrentHashMap<Integer, WeakReference<ImageView>> concurrentHashMap = h.get(Integer.valueOf(str.hashCode()));
            int hashCode = imageView.hashCode();
            if (concurrentHashMap != null && !concurrentHashMap.containsKey(Integer.valueOf(hashCode))) {
                concurrentHashMap.put(Integer.valueOf(hashCode), new WeakReference<>(imageView));
            }
        }
    }

    public static boolean j(ImageView imageView, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f025477", new Object[]{imageView, str, new Integer(i)})).booleanValue();
        }
        if (!TextUtils.isEmpty(str)) {
            return true;
        }
        if (imageView != null) {
            if (i != -1) {
                imageView.setImageResource(i);
            } else {
                imageView.setImageDrawable(null);
            }
            imageView.setTag(b, str);
            imageView.setTag(f17039a, str);
            imageView.setTag(d, null);
            imageView.setTag(c, Boolean.TRUE);
        }
        tgh.b("BlurImageUtils", "loadImageWithUrl checkUrl isInvalid url: " + str);
        return false;
    }

    public static void k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c60d430b", new Object[]{str});
        } else if (str != null) {
            int hashCode = str.hashCode();
            ConcurrentHashMap<Integer, WeakReference<ImageView>> remove = h.remove(Integer.valueOf(hashCode));
            if (remove != null) {
                for (WeakReference<ImageView> weakReference : remove.values()) {
                    ImageView imageView = weakReference.get();
                    if (imageView != null) {
                        p(str, imageView, null, 0, 0, false);
                    }
                }
            }
            e.remove(Integer.valueOf(hashCode));
            f.remove(Integer.valueOf(hashCode));
            g.remove(Integer.valueOf(hashCode));
        }
    }

    public static boolean l(Object obj, ImageView imageView, String str) {
        BitmapDrawable bitmapDrawable;
        Integer num;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9dad83fa", new Object[]{obj, imageView, str})).booleanValue();
        }
        Integer num2 = null;
        if (imageView == null) {
            ConcurrentHashMap<String, Integer> concurrentHashMap = f.get(Integer.valueOf(obj.hashCode()));
            if (concurrentHashMap != null) {
                num2 = concurrentHashMap.get(str);
            }
            String str2 = "NONE???";
            if (num2 != null) {
                if (num2.intValue() == 1) {
                    str2 = "ING...";
                } else if (num2.intValue() == 2) {
                    str2 = "DONE!!!";
                }
            }
            if (num2 == null || !(num2.intValue() == 1 || num2.intValue() == 2)) {
                z = false;
            }
            if (z) {
                tgh.b("BlurImageUtils", "loadImageWithUrl fetchLocalDrawable with " + str2 + " task url: " + str);
            }
            return z;
        }
        ConcurrentHashMap<String, BitmapDrawable> concurrentHashMap2 = g.get(Integer.valueOf(obj.hashCode()));
        if (concurrentHashMap2 != null) {
            bitmapDrawable = concurrentHashMap2.get(str);
        } else {
            bitmapDrawable = null;
        }
        if (bitmapDrawable != null) {
            imageView.setImageDrawable(bitmapDrawable);
            tgh.b("BlurImageUtils", "loadImageWithUrl fetchLocalDrawable has temporary drawable in imageView url: " + str);
            ConcurrentHashMap<String, Integer> concurrentHashMap3 = f.get(Integer.valueOf(obj.hashCode()));
            if (concurrentHashMap3 != null) {
                num = concurrentHashMap3.get(str);
            } else {
                num = null;
            }
            int i = c;
            Object tag = imageView.getTag(i);
            if ((tag != null && Boolean.parseBoolean(tag.toString())) || (num != null && num.intValue() == 2)) {
                imageView.setTag(b, str);
                imageView.setTag(f17039a, str);
                imageView.setTag(d, null);
                imageView.setTag(i, Boolean.TRUE);
                tgh.b("BlurImageUtils", "loadImageWithUrl fetchLocalDrawable has final drawable in imageView url: " + str);
                return true;
            }
        }
        return false;
    }

    public static boolean m(ImageView imageView, String str) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1d394bed", new Object[]{imageView, str})).booleanValue();
        }
        if (imageView != null) {
            String str2 = (String) imageView.getTag(f17039a);
            Drawable drawable = imageView.getDrawable();
            Object tag = imageView.getTag(c);
            if (tag == null || !Boolean.parseBoolean(tag.toString())) {
                z = false;
            } else {
                z = true;
            }
            if (TextUtils.equals(str, str2) && drawable != null && z) {
                imageView.setTag(d, null);
                tgh.b("BlurImageUtils", "loadImageWithUrl hasSameDoneDrawable url: " + str);
                return true;
            }
        }
        return false;
    }

    public static boolean n(ImageView imageView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d13616d4", new Object[]{imageView, str})).booleanValue();
        }
        if (imageView != null) {
            Object tag = imageView.getTag(d);
            if (tag instanceof p1m) {
                p1m p1mVar = (p1m) tag;
                if (TextUtils.isEmpty(str) || !p1mVar.f(str)) {
                    p1mVar.a();
                } else if (p1mVar.c()) {
                    tgh.b("BlurImageUtils", "loadImageWithUrl hasSameTask running url: " + str);
                    return true;
                } else if (p1mVar.b()) {
                    Object tag2 = imageView.getTag(c);
                    if (tag2 != null && Boolean.parseBoolean(tag2.toString())) {
                        tgh.b("BlurImageUtils", "loadImageWithUrl hasSameTask done url: " + str);
                        return true;
                    }
                } else {
                    p1mVar.a();
                }
            }
        }
        return false;
    }

    public static void o(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60dc73a1", new Object[]{str});
        } else if (str != null) {
            int hashCode = str.hashCode();
            ConcurrentHashMap<Integer, ConcurrentHashMap<Integer, WeakReference<ImageView>>> concurrentHashMap = h;
            if (!concurrentHashMap.containsKey(Integer.valueOf(hashCode))) {
                concurrentHashMap.put(Integer.valueOf(hashCode), new ConcurrentHashMap<>());
            }
            ConcurrentHashMap<Integer, ConcurrentHashMap<String, List<SimpleEntry<s8d<SuccPhenixEvent>, s8d<FailPhenixEvent>>>>> concurrentHashMap2 = e;
            if (!concurrentHashMap2.containsKey(Integer.valueOf(hashCode))) {
                concurrentHashMap2.put(Integer.valueOf(hashCode), new ConcurrentHashMap<>());
            }
            ConcurrentHashMap<Integer, ConcurrentHashMap<String, Integer>> concurrentHashMap3 = f;
            if (!concurrentHashMap3.containsKey(Integer.valueOf(hashCode))) {
                concurrentHashMap3.put(Integer.valueOf(hashCode), new ConcurrentHashMap<>());
            }
            ConcurrentHashMap<Integer, ConcurrentHashMap<String, BitmapDrawable>> concurrentHashMap4 = g;
            if (!concurrentHashMap4.containsKey(Integer.valueOf(hashCode))) {
                concurrentHashMap4.put(Integer.valueOf(hashCode), new ConcurrentHashMap<>());
            }
        }
    }

    public static void p(String str, ImageView imageView, String str2, int i, int i2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d9251cb", new Object[]{str, imageView, str2, new Integer(i), new Integer(i2), new Boolean(z)});
        } else {
            q(str, imageView, str2, true, -1, false, i, i2, z);
        }
    }

    public static void r(String str, String str2, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3245f892", new Object[]{str, str2, new Integer(i), new Integer(i2)});
        } else {
            q(str, null, str2, true, -1, false, i, i2, false);
        }
    }

    public static BitmapDrawable s(Bitmap bitmap, int i, int i2, String str, boolean z) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BitmapDrawable) ipChange.ipc$dispatch("5d930c2a", new Object[]{bitmap, new Integer(i), new Integer(i2), str, new Boolean(z)});
        }
        if (i2 <= 0 || i <= 0 || bitmap == null) {
            StringBuilder sb = new StringBuilder("loadImageWithUrl scaleLastVerticalPx error extraHeight: ");
            sb.append(i2);
            sb.append(" viewWidth: ");
            sb.append(i);
            sb.append(" source: ");
            if (bitmap != null) {
                str2 = "not null";
            } else {
                str2 = "is null";
            }
            sb.append(str2);
            sb.append(" intermediate: ");
            sb.append(z);
            sb.append(" url: ");
            sb.append(str);
            tgh.b("BlurImageUtils", sb.toString());
            return null;
        }
        int width = bitmap.getWidth();
        int i3 = (int) (((width * 1.0f) / i) * i2);
        if (width <= 0 || i3 <= 0) {
            tgh.b("BlurImageUtils", "loadImageWithUrl scaleLastVerticalPx error, can not create zero bitmap with url: " + str);
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(width, i3, Bitmap.Config.ARGB_8888);
        int height = bitmap.getHeight() - 1;
        for (int i4 = 0; i4 < width; i4++) {
            int pixel = bitmap.getPixel(i4, height);
            for (int i5 = 0; i5 < i3; i5++) {
                createBitmap.setPixel(i4, i5, pixel);
            }
        }
        try {
            Bitmap process = new yf2(o91.a(), 100).process(str, cd2.b(), createBitmap);
            if (process != null) {
                return new BitmapDrawable(o91.a().getResources(), process);
            }
            tgh.b("BlurImageUtils", "BlurBitmapProcessor return a null bitmap");
            return null;
        } catch (Throwable th) {
            tgh.c("BlurImageUtils", "BlurBitmapProcessor error", th);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0099, code lost:
        if (android.text.TextUtils.isEmpty(r2) != false) goto L_0x009f;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void q(java.lang.String r16, android.widget.ImageView r17, java.lang.String r18, boolean r19, int r20, boolean r21, int r22, int r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 523
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.cg2.q(java.lang.String, android.widget.ImageView, java.lang.String, boolean, int, boolean, int, int, boolean):void");
    }
}
