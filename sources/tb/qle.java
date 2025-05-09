package tb;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.framework.adapter.image.ImageAdapter;
import com.taobao.tao.image.ImageStrategyConfig;
import com.taobao.tao.util.ImageStrategyDecider;
import com.taobao.tao.util.TaobaoImageUrlStrategy;
import com.taobao.weex.common.Constants;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class qle {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final int MODE_ENABLE_LEVEL_MODEL = 16;
    public static final int MODE_ENABLE_SHARPEN = 8;
    public static final int MODE_ORIGINAL = 1;
    public static final int MODE_SHORTSIDE = 2;
    public static final int MODE_WEBP = 4;

    /* renamed from: a  reason: collision with root package name */
    public final Context f26809a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final int f;
    public final String g;
    public boolean h;
    public boolean i;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        static {
            t2o.a(919601176);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final Context e;
        public final String f;

        /* renamed from: a  reason: collision with root package name */
        public String f26810a = "";
        public int b = -1;
        public int c = -1;
        public String d = "guangguang";
        public String g = "87";

        static {
            t2o.a(919601177);
        }

        public b(Context context, String str) {
            ckf.g(context, "context");
            ckf.g(str, "url");
            this.e = context;
            this.f = str;
        }

        public final qle a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (qle) ipChange.ipc$dispatch("37a2a42b", new Object[]{this});
            }
            return new qle(this, null);
        }

        public final Context b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
            }
            return this.e;
        }

        public final String c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("d09a5221", new Object[]{this});
            }
            return this.g;
        }

        public final int d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("4703e217", new Object[]{this})).intValue();
            }
            return this.c;
        }

        public final String e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8c207d9f", new Object[]{this});
            }
            return this.f26810a;
        }

        public final String f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("612a690b", new Object[]{this});
            }
            return "";
        }

        public final String g() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("42bddf1", new Object[]{this});
            }
            return this.d;
        }

        public final int h() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("56d77213", new Object[]{this})).intValue();
            }
            return 0;
        }

        public final String i() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("de8f0660", new Object[]{this});
            }
            return this.f;
        }

        public final int j() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("fc48d08a", new Object[]{this})).intValue();
            }
            return this.b;
        }

        public final int k() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("49b31e94", new Object[]{this})).intValue();
            }
            return 2;
        }

        public final b l(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("6cd1e5f3", new Object[]{this, new Integer(i)});
            }
            this.c = i;
            return this;
        }

        public final b m(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("1f94b9d7", new Object[]{this, str});
            }
            ckf.g(str, Constants.Name.IMAGE_QUALITY);
            this.f26810a = str;
            return this;
        }

        public final b n(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("392302f8", new Object[]{this, new Integer(i)});
            }
            this.b = i;
            return this;
        }

        public final b o(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("cb99c8b7", new Object[]{this, str, str2});
            }
            ckf.g(str, "bizName");
            ckf.g(str2, "bizId");
            this.d = str;
            this.g = str2;
            return this;
        }
    }

    static {
        t2o.a(919601175);
    }

    public qle(b bVar) {
        this.f26809a = bVar.b();
        this.b = bVar.i();
        this.f = 2;
        this.d = bVar.j();
        this.e = bVar.d();
        bVar.h();
        bVar.e();
        bVar.f();
        this.f = bVar.k();
        bVar.g();
        this.g = bVar.c();
        this.c = e(bVar);
    }

    public final void a(int i, ImageStrategyConfig.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e16a848", new Object[]{this, new Integer(i), bVar});
        } else if (i > 0) {
            if ((2 & i) != 0) {
                bVar.e(true);
            }
            if ((i & 4) != 0) {
                bVar.g(true);
                bVar.f(true);
            }
            if ((i & 8) != 0) {
                bVar.d(true);
            }
            if ((i & 16) != 0) {
                bVar.b(true);
            }
        }
    }

    public final Context c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        return this.f26809a;
    }

    public final int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4703e217", new Object[]{this})).intValue();
        }
        return this.e;
    }

    public final String e(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6e625f13", new Object[]{this, bVar});
        }
        if (j(bVar.i())) {
            return bVar.i();
        }
        ImageStrategyConfig.b w = ImageStrategyConfig.w(bVar.g(), bVar.c());
        ckf.f(w, "ImageStrategyConfig.newB…info.bizName, info.bizId)");
        a(bVar.h(), w);
        b(bVar.e(), bVar.j(), bVar.d(), w);
        String decideUrl = ImageStrategyDecider.decideUrl(bVar.i(), Integer.valueOf(this.d), Integer.valueOf(this.e), w.a());
        ckf.f(decideUrl, "ImageStrategyDecider.dec… height, builder.build())");
        return decideUrl;
    }

    public final String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3bbd726", new Object[]{this});
        }
        return this.b;
    }

    public final int g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("49b31e94", new Object[]{this})).intValue();
        }
        return this.f;
    }

    public final String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("de8f0660", new Object[]{this});
        }
        return this.c;
    }

    public final int i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fc48d08a", new Object[]{this})).intValue();
        }
        return this.d;
    }

    public final boolean j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("30d5c6b5", new Object[]{this, str})).booleanValue();
        }
        if (str == null || (!tsq.w(str, ".gif", false, 2, null) && !tsq.w(str, ".apng", false, 2, null) && !tsq.w(str, "apng.png", false, 2, null) && !tsq.w(str, "9.png", false, 2, null))) {
            return false;
        }
        return true;
    }

    public final String k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d09a5221", new Object[]{this});
        }
        return this.g;
    }

    public final boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("20e55513", new Object[]{this})).booleanValue();
        }
        return this.h;
    }

    public final boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a3dd9538", new Object[]{this})).booleanValue();
        }
        return this.i;
    }

    public final void b(String str, int i, int i2, ImageStrategyConfig.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa8f75f", new Object[]{this, str, new Integer(i), new Integer(i2), bVar});
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            switch (str.hashCode()) {
                case 110222:
                    if (str.equals("q30")) {
                        bVar.i(TaobaoImageUrlStrategy.ImageQuality.q30);
                        break;
                    }
                    break;
                case 110284:
                    if (str.equals("q50")) {
                        bVar.i(TaobaoImageUrlStrategy.ImageQuality.q50);
                        break;
                    }
                    break;
                case 110315:
                    if (str.equals("q60")) {
                        bVar.i(TaobaoImageUrlStrategy.ImageQuality.q60);
                        break;
                    }
                    break;
                case 110351:
                    if (str.equals("q75")) {
                        bVar.i(TaobaoImageUrlStrategy.ImageQuality.q75);
                        break;
                    }
                    break;
                case 110408:
                    if (str.equals(ImageAdapter.IMAGE_QUALITY_Q90)) {
                        bVar.i(TaobaoImageUrlStrategy.ImageQuality.q90);
                        break;
                    }
                    break;
                case 3415008:
                    if (str.equals("q100")) {
                        if (i == -1 || i2 == -1) {
                            bVar.p(true);
                            this.h = true;
                        }
                        bVar.i(TaobaoImageUrlStrategy.ImageQuality.q99);
                        break;
                    }
                    break;
            }
        }
        if (i > 0 || i2 > 0) {
            bVar.o(true);
            this.i = true;
        }
    }

    public /* synthetic */ qle(b bVar, a07 a07Var) {
        this(bVar);
    }
}
