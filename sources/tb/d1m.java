package tb;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import android.util.LruCache;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.adapter.MUSImageQuality;
import com.taobao.phenix.intf.PhenixCreator;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.tao.image.ImageStrategyConfig;
import com.taobao.tao.util.ImageStrategyDecider;
import com.taobao.tao.util.TaobaoImageUrlStrategy;
import java.lang.ref.SoftReference;
import tb.hpc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class d1m implements hpc {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Handler e = new Handler(Looper.getMainLooper());

    /* renamed from: a  reason: collision with root package name */
    public final LruCache<String, SoftReference<Drawable>> f17504a = new LruCache<>(50);
    public ImageStrategyConfig b;
    public ImageStrategyConfig c;
    public ImageStrategyConfig d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public final class a extends yio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private volatile boolean d;
        private String e;
        private MUSImageQuality f;
        private volatile hpc.a g;
        private volatile p1m h;
        private final String i;

        /* compiled from: Taobao */
        /* renamed from: tb.d1m$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class C0897a extends yio {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public final /* synthetic */ Bitmap d;

            public C0897a(Bitmap bitmap) {
                this.d = bitmap;
            }

            public static /* synthetic */ Object ipc$super(C0897a aVar, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_ability/PhenixImageAdapter$Task$1");
            }

            @Override // tb.yio
            public void e() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("4134b145", new Object[]{this});
                    return;
                }
                hpc.a h = a.h(a.this);
                if (h != null && !a.i(a.this) && a.h(a.this).getTag() == a.this) {
                    h.c(new BitmapDrawable(this.d));
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class b implements s8d<FailPhenixEvent> {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* compiled from: Taobao */
            /* renamed from: tb.d1m$a$b$a  reason: collision with other inner class name */
            /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
            public class C0898a extends yio {
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public C0898a() {
                }

                public static /* synthetic */ Object ipc$super(C0898a aVar, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_ability/PhenixImageAdapter$Task$2$1");
                }

                @Override // tb.yio
                public void e() throws Exception {
                    hpc.a h;
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("4134b145", new Object[]{this});
                    } else if (!a.i(a.this) && (h = a.h(a.this)) != null && h.getTag() == a.this) {
                        h.e();
                    }
                }
            }

            public b() {
            }

            /* renamed from: a */
            public boolean onHappen(FailPhenixEvent failPhenixEvent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("5fa0e8d0", new Object[]{this, failPhenixEvent})).booleanValue();
                }
                d1m.e().post(new C0898a());
                return true;
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class c implements s8d<SuccPhenixEvent> {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* compiled from: Taobao */
            /* renamed from: tb.d1m$a$c$a  reason: collision with other inner class name */
            /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
            public class C0899a extends yio {
                public static volatile transient /* synthetic */ IpChange $ipChange;
                public final /* synthetic */ SuccPhenixEvent d;

                public C0899a(SuccPhenixEvent succPhenixEvent) {
                    this.d = succPhenixEvent;
                }

                public static /* synthetic */ Object ipc$super(C0899a aVar, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_ability/PhenixImageAdapter$Task$3$1");
                }

                @Override // tb.yio
                public void e() {
                    hpc.a h;
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("4134b145", new Object[]{this});
                    } else if (!a.i(a.this) && (h = a.h(a.this)) != null && h.getTag() == a.this) {
                        if (!(this.d.getDrawable() instanceof cy0)) {
                            d1m.g(d1m.this).put(a.j(a.this), new SoftReference(this.d.getDrawable()));
                        }
                        h.c(this.d.getDrawable());
                        if (this.d.getDrawable() instanceof cy0) {
                            ((cy0) this.d.getDrawable()).C();
                        }
                    }
                }
            }

            public c() {
            }

            /* renamed from: a */
            public boolean onHappen(SuccPhenixEvent succPhenixEvent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
                }
                d1m.e().post(new C0899a(succPhenixEvent));
                return true;
            }
        }

        static {
            t2o.a(980418578);
        }

        public static /* synthetic */ void g(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a1736b4", new Object[]{aVar});
            } else {
                aVar.k();
            }
        }

        public static /* synthetic */ hpc.a h(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (hpc.a) ipChange.ipc$dispatch("288dad39", new Object[]{aVar});
            }
            return aVar.g;
        }

        public static /* synthetic */ boolean i(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d53a4255", new Object[]{aVar})).booleanValue();
            }
            return aVar.d;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_ability/PhenixImageAdapter$Task");
        }

        public static /* synthetic */ String j(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("bf208072", new Object[]{aVar});
            }
            return aVar.i;
        }

        private void k() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("707fe601", new Object[]{this});
            } else if (!this.d) {
                this.d = true;
                if (this.h != null) {
                    this.h.a();
                    this.h = null;
                }
                this.g = null;
            }
        }

        private void l() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d8f81bdc", new Object[]{this});
                return;
            }
            int indexOf = this.e.indexOf(nwl.BASE_64);
            if (indexOf >= 0) {
                Bitmap d = d1m.d(this.e.substring(indexOf + 7));
                if (!this.d) {
                    d1m.e().post(new C0897a(d));
                }
            }
        }

        private void m() {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b5577589", new Object[]{this});
                return;
            }
            hpc.a aVar = this.g;
            if (!this.d && aVar != null) {
                if (aVar.getWidth() <= 0 || aVar.getHeight() <= 0) {
                    str = this.e;
                } else {
                    str = d1m.f(d1m.this, aVar.getWidth(), aVar.getHeight(), this.e, this.f);
                }
                PhenixCreator failListener = s0m.B().T(str).releasableDrawable(true).scaleFromLarge(true).addLoaderExtra(nd2.BUNDLE_BIZ_CODE, String.valueOf(8900)).preloadWithSmall(false).succListener(new c()).failListener(new b());
                if (aVar.getWidth() > 0 && aVar.getHeight() > 0) {
                    failListener.limitSize(null, aVar.getWidth(), aVar.getHeight());
                }
                this.h = failListener.fetch();
            }
        }

        @Override // tb.yio
        public void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
            } else if (this.d || this.g == null) {
            } else {
                if (this.e.startsWith(nwl.BASE_64_PREFIX)) {
                    l();
                } else {
                    m();
                }
            }
        }

        private a(String str, hpc.a aVar, MUSImageQuality mUSImageQuality, String str2) {
            this.e = str;
            this.g = aVar;
            this.f = mUSImageQuality;
            this.i = str2;
            aVar.g(this);
        }
    }

    static {
        t2o.a(980418576);
        t2o.a(982516043);
    }

    public static /* synthetic */ Bitmap d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("a0fe3161", new Object[]{str});
        }
        return h(str);
    }

    public static /* synthetic */ Handler e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("1e938d8a", new Object[0]);
        }
        return e;
    }

    public static /* synthetic */ String f(d1m d1mVar, int i, int i2, String str, MUSImageQuality mUSImageQuality) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fbb17b74", new Object[]{d1mVar, new Integer(i), new Integer(i2), str, mUSImageQuality});
        }
        return d1mVar.j(i, i2, str, mUSImageQuality);
    }

    public static /* synthetic */ LruCache g(d1m d1mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LruCache) ipChange.ipc$dispatch("2aafcdcb", new Object[]{d1mVar});
        }
        return d1mVar.f17504a;
    }

    public static Bitmap h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("578c0a8", new Object[]{str});
        }
        byte[] decode = Base64.decode(str, 0);
        return BitmapFactory.decodeByteArray(decode, 0, decode.length);
    }

    @Override // tb.hpc
    public void a(String str, hpc.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1979048", new Object[]{this, str, aVar});
            return;
        }
        if (aVar.getTag() instanceof a) {
            a.g((a) aVar.getTag());
        }
        aVar.g(null);
    }

    @Override // tb.hpc
    public void b(Context context, String str, hpc.a aVar, MUSImageQuality mUSImageQuality) {
        String str2;
        String str3;
        Drawable drawable;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fe36e64", new Object[]{this, context, str, aVar, mUSImageQuality});
        } else if (!TextUtils.isEmpty(str)) {
            if (mUSImageQuality == null) {
                str2 = "auto";
            } else {
                str2 = mUSImageQuality.toString();
            }
            if (aVar != null) {
                str3 = "w" + aVar.getWidth() + "h" + aVar.getHeight();
            } else {
                str3 = "";
            }
            String str4 = str + "q" + str2 + str3;
            SoftReference<Drawable> softReference = this.f17504a.get(str4);
            if (softReference != null) {
                drawable = softReference.get();
                if (drawable == null) {
                    this.f17504a.remove(str4);
                }
            } else {
                drawable = null;
            }
            if (drawable == null) {
                AsyncTask.THREAD_POOL_EXECUTOR.execute(new a(str, aVar, mUSImageQuality, str4));
            } else {
                aVar.c(drawable);
            }
        }
    }

    @Override // tb.hpc
    public void c(Drawable drawable, hpc.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ed62d3", new Object[]{this, drawable, aVar});
        } else if (drawable instanceof cy0) {
            ((cy0) drawable).D();
        }
    }

    public final ImageStrategyConfig i(TaobaoImageUrlStrategy.ImageQuality imageQuality) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageStrategyConfig) ipChange.ipc$dispatch("df48b5e5", new Object[]{this, imageQuality});
        }
        ImageStrategyConfig.b v = ImageStrategyConfig.v("muise", 8900);
        v.i(imageQuality);
        return v.a();
    }

    public final String j(int i, int i2, String str, MUSImageQuality mUSImageQuality) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("309a704a", new Object[]{this, new Integer(i), new Integer(i2), str, mUSImageQuality});
        }
        if (mUSImageQuality == MUSImageQuality.ORIGINAL) {
            return str;
        }
        ImageStrategyConfig k = k(mUSImageQuality);
        if (k == null) {
            return str;
        }
        return ImageStrategyDecider.decideUrl(str, Integer.valueOf(i), Integer.valueOf(i2), k);
    }

    public final ImageStrategyConfig k(MUSImageQuality mUSImageQuality) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageStrategyConfig) ipChange.ipc$dispatch("6e7391da", new Object[]{this, mUSImageQuality});
        }
        if (mUSImageQuality == null || mUSImageQuality == MUSImageQuality.HIGH || mUSImageQuality == MUSImageQuality.AUTO) {
            if (this.b == null) {
                this.b = i(TaobaoImageUrlStrategy.ImageQuality.q90);
            }
            return this.b;
        } else if (mUSImageQuality == MUSImageQuality.NORMAL) {
            if (this.c == null) {
                this.c = i(TaobaoImageUrlStrategy.ImageQuality.q75);
            }
            return this.c;
        } else {
            if (this.d == null) {
                this.d = i(TaobaoImageUrlStrategy.ImageQuality.q50);
            }
            return this.d;
        }
    }
}
