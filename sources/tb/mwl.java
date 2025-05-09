package tb;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.LruCache;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.virtual_thread.face.VExecutors;
import com.taobao.android.weex_framework.adapter.MUSImageQuality;
import com.taobao.downgrade.Downgrade;
import com.taobao.tao.image.ImageStrategyConfig;
import com.taobao.tao.util.ImageStrategyDecider;
import com.taobao.tao.util.TaobaoImageUrlStrategy;
import java.lang.ref.SoftReference;
import java.util.concurrent.ExecutorService;
import tb.hpc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class mwl implements hpc {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static ImageStrategyConfig d;
    public static ImageStrategyConfig e;
    public static ImageStrategyConfig f;

    /* renamed from: a  reason: collision with root package name */
    public final ExecutorService f24346a;
    public final boolean b = ckf.b("degrade", Downgrade.getInstance().getDowngradeStrategy("search").getTacticsPerformance());
    public static final a Companion = new a(null);
    public static final Handler c = new Handler(Looper.getMainLooper());
    public static final ore g = new ore();
    public static final LruCache<String, SoftReference<Drawable>> h = new LruCache<>(6);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* renamed from: tb.mwl$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public /* synthetic */ class C1000a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                t2o.a(815792661);
                int[] iArr = new int[MUSImageQuality.values().length];
                try {
                    iArr[MUSImageQuality.HIGH.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[MUSImageQuality.AUTO.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[MUSImageQuality.NORMAL.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        static {
            t2o.a(815792660);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final String a(int i, int i2, String str, MUSImageQuality mUSImageQuality) {
            ImageStrategyConfig b;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("309a704a", new Object[]{this, new Integer(i), new Integer(i2), str, mUSImageQuality});
            }
            ckf.g(str, "url");
            return (mUSImageQuality == MUSImageQuality.ORIGINAL || (b = b(mUSImageQuality)) == null) ? str : ImageStrategyDecider.decideUrl(str, Integer.valueOf(i), Integer.valueOf(i2), b);
        }

        public final ImageStrategyConfig b(MUSImageQuality mUSImageQuality) {
            int i;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ImageStrategyConfig) ipChange.ipc$dispatch("6e7391da", new Object[]{this, mUSImageQuality});
            }
            if (mUSImageQuality == null) {
                i = -1;
            } else {
                i = C1000a.$EnumSwitchMapping$0[mUSImageQuality.ordinal()];
            }
            if (i == -1 || i == 1 || i == 2) {
                if (mwl.e() == null) {
                    mwl.j(nwl.a(TaobaoImageUrlStrategy.ImageQuality.q90));
                }
                return mwl.e();
            } else if (i != 3) {
                if (mwl.g() == null) {
                    mwl.k(nwl.a(TaobaoImageUrlStrategy.ImageQuality.q50));
                }
                return mwl.g();
            } else {
                if (mwl.h() == null) {
                    mwl.l(nwl.a(TaobaoImageUrlStrategy.ImageQuality.q75));
                }
                return mwl.h();
            }
        }

        public final Handler c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Handler) ipChange.ipc$dispatch("e690ed4b", new Object[]{this});
            }
            return mwl.d();
        }

        public final LruCache<String, SoftReference<Drawable>> d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (LruCache) ipChange.ipc$dispatch("ab37a779", new Object[]{this});
            }
            return mwl.f();
        }

        public final ore e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ore) ipChange.ipc$dispatch("359474cb", new Object[]{this});
            }
            return mwl.i();
        }

        public a() {
        }
    }

    static {
        t2o.a(815792659);
        t2o.a(982516043);
    }

    public mwl() {
        ExecutorService newFixedThreadPool = VExecutors.newFixedThreadPool(6, new qqt() { // from class: tb.ojz
            @Override // tb.qqt
            public final String newThreadName() {
                String r;
                r = mwl.r();
                return r;
            }
        });
        ckf.f(newFixedThreadPool, "newFixedThreadPool(...)");
        this.f24346a = newFixedThreadPool;
    }

    public static final /* synthetic */ Handler d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("574c2982", new Object[0]);
        }
        return c;
    }

    public static final /* synthetic */ ImageStrategyConfig e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageStrategyConfig) ipChange.ipc$dispatch("f040c1ab", new Object[0]);
        }
        return d;
    }

    public static final /* synthetic */ LruCache f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LruCache) ipChange.ipc$dispatch("8ddd4c68", new Object[0]);
        }
        return h;
    }

    public static final /* synthetic */ ImageStrategyConfig g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageStrategyConfig) ipChange.ipc$dispatch("debe95b1", new Object[0]);
        }
        return f;
    }

    public static final /* synthetic */ ImageStrategyConfig h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageStrategyConfig) ipChange.ipc$dispatch("ca2605b0", new Object[0]);
        }
        return e;
    }

    public static final /* synthetic */ ore i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ore) ipChange.ipc$dispatch("9034159e", new Object[0]);
        }
        return g;
    }

    public static final /* synthetic */ void j(ImageStrategyConfig imageStrategyConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b797205", new Object[]{imageStrategyConfig});
        } else {
            d = imageStrategyConfig;
        }
    }

    public static final /* synthetic */ void k(ImageStrategyConfig imageStrategyConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e74c6957", new Object[]{imageStrategyConfig});
        } else {
            f = imageStrategyConfig;
        }
    }

    public static final /* synthetic */ void l(ImageStrategyConfig imageStrategyConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97dba1a0", new Object[]{imageStrategyConfig});
        } else {
            e = imageStrategyConfig;
        }
    }

    public static final String r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("932e1497", new Object[0]);
        }
        return "PerfImageAdapter";
    }

    @Override // tb.hpc
    public void a(String str, hpc.a aVar) {
        Object obj;
        rct rctVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1979048", new Object[]{this, str, aVar});
            return;
        }
        if (aVar != null) {
            obj = aVar.getTag();
        } else {
            obj = null;
        }
        if (obj instanceof rct) {
            rctVar = (rct) obj;
        } else {
            rctVar = null;
        }
        if (rctVar != null) {
            rctVar.h();
            rctVar.f(null);
        }
    }

    @Override // tb.hpc
    public void b(Context context, String str, hpc.a aVar, MUSImageQuality mUSImageQuality) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fe36e64", new Object[]{this, context, str, aVar, mUSImageQuality});
        } else {
            o(context, str, aVar, mUSImageQuality, false);
        }
    }

    @Override // tb.hpc
    public void c(Drawable drawable, hpc.a aVar) {
        nx7 nx7Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ed62d3", new Object[]{this, drawable, aVar});
        } else if (!m(aVar) || !(drawable instanceof nx7)) {
            if (drawable instanceof nx7) {
                nx7Var = (nx7) drawable;
            } else {
                nx7Var = null;
            }
            if (nx7Var != null) {
                nx7Var.a();
            }
        } else {
            g.c((nx7) drawable);
        }
    }

    public final boolean m(hpc.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("960ad063", new Object[]{this, aVar})).booleanValue();
        }
        if (aVar instanceof nre) {
            return true;
        }
        if (!(aVar instanceof ufe) || !n()) {
            return false;
        }
        return true;
    }

    public boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("881925d4", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public final void o(Context context, String str, hpc.a aVar, MUSImageQuality mUSImageQuality, boolean z) {
        String str2;
        Drawable drawable;
        nx7 a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d32433b1", new Object[]{this, context, str, aVar, mUSImageQuality, new Boolean(z)});
        } else if (!TextUtils.isEmpty(str) && aVar != null) {
            if (mUSImageQuality == null || (str2 = mUSImageQuality.toString()) == null) {
                str2 = "auto";
            }
            String str3 = str + 'q' + str2 + 'w' + aVar.getWidth() + 'h' + aVar.getHeight();
            String str4 = str + 'q' + str2 + 'w' + aVar.getWidth();
            if (!m(aVar) || (a2 = g.a(str3)) == null) {
                ckf.d(str);
                rct rctVar = new rct(str, aVar, mUSImageQuality, str3, str4, z, m(aVar));
                if (rctVar.n()) {
                    this.f24346a.execute(rctVar);
                    return;
                }
                if (!z) {
                    SoftReference<Drawable> remove = h.remove(str4);
                    if (remove != null) {
                        drawable = remove.get();
                    } else {
                        drawable = null;
                    }
                    if (drawable != null) {
                        aVar.c(drawable);
                        return;
                    }
                }
                if (!this.b || z) {
                    rctVar.run();
                } else {
                    this.f24346a.execute(rctVar);
                }
            } else {
                aVar.c(a2);
            }
        }
    }

    public final void p(Context context, String str, hpc.a aVar, MUSImageQuality mUSImageQuality) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f84e5f", new Object[]{this, context, str, aVar, mUSImageQuality});
        } else {
            o(context, str, aVar, mUSImageQuality, true);
        }
    }
}
