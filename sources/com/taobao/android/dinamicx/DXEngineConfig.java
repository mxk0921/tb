package com.taobao.android.dinamicx;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.videoc.DXVideoControlConfig;
import com.taobao.android.fluid.framework.adapter.image.ImageAdapter;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import tb.cb5;
import tb.cvb;
import tb.eb5;
import tb.iew;
import tb.ih5;
import tb.j18;
import tb.lc6;
import tb.lvb;
import tb.nb6;
import tb.t2o;
import tb.vu5;
import tb.wu5;
import tb.x7q;
import tb.y7;
import tb.zg5;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class DXEngineConfig {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DEFAULT_MAX_CACHE_COUNT = 100;
    public static final int DEFAULT_PERIOD_TIME = lc6.g * 20;
    public static final int DOWN_GRADE_ONCE = 2;
    public static final int DOWN_GRADE_TO_PRESET = 1;
    public static final String DX_DEFAULT_BIZTYPE = "default_bizType";
    public static final String DX_DEFAULT_SUB_BIZTYPE = "default_sub_bizType";
    public static final int IMAGE_RENDER_STRATEGY_ASYNC = 2;
    public static final int IMAGE_RENDER_STRATEGY_NORMAL = 0;
    public static final int IMAGE_RENDER_STRATEGY_POST_RUNNABLE = 1;
    public static final int NOTIFICATION_TYPE_EVERY_ONE = 1;
    public static final int NOTIFICATION_TYPE_ONLY_ONE = 2;
    public static final int VIEW_RECYCLE_STRATEGY_ALL = 2;
    public static final int VIEW_RECYCLE_STRATEGY_DEFINE_NODE = 1;
    public static final int VIEW_RECYCLE_STRATEGY_NO = 0;
    public final nb6 A;
    public final int B;
    public String C;
    public final ImageQuality D;
    public final boolean E;
    public final x7q F;
    public final int G;
    public final boolean H;

    /* renamed from: a  reason: collision with root package name */
    public final String f7286a;
    public final int b;
    public final long c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final int g;
    public final boolean h;
    public final long i;
    public final String j;
    public final int k;
    public final String l;
    public final ih5 m;
    public final boolean n;
    public final y7 o;
    public final boolean p;
    public final wu5 q;
    public final boolean r;
    public final DXVideoControlConfig<iew> s;
    public final boolean t;
    public final int u;
    public final boolean v;
    public final boolean w;
    public final boolean x;
    public final boolean y;
    public final boolean z;

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public @interface DXImageRenderStrategy {
    }

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public @interface DXViewRecycleStrategy {
    }

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public @interface DownGradeType {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public enum ImageQuality {
        q90(ImageAdapter.IMAGE_QUALITY_Q90, "90q"),
        q75("q75", "75q"),
        q60("q60", "60q"),
        q50("q50", "50q"),
        q30("q30", "30q"),
        non("", "");
        
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public String ossQ;
        public String tfsQ;

        ImageQuality(String str, String str2) {
            this.tfsQ = str;
            this.ossQ = str2;
        }

        public static /* synthetic */ Object ipc$super(ImageQuality imageQuality, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/DXEngineConfig$ImageQuality");
        }

        public static ImageQuality valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ImageQuality) ipChange.ipc$dispatch("2c34d0ad", new Object[]{str});
            }
            return (ImageQuality) Enum.valueOf(ImageQuality.class, str);
        }

        public String getImageQuality() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8c207d9f", new Object[]{this});
            }
            return this.tfsQ;
        }

        public String getOssQuality() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("6792f7d3", new Object[]{this});
            }
            return this.ossQ;
        }
    }

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public @interface RemoteTemplateDownloadNotificationType {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public x7q D;

        /* renamed from: a  reason: collision with root package name */
        public String f7287a;
        public boolean b;
        public final String c;
        public int d;
        public int e;
        public final long f;
        public boolean g;
        public int h;
        public boolean i;
        public boolean j;
        public final long k;
        public String l;
        public int m;
        public y7 n;
        public ih5 o;
        public boolean p;
        public boolean q;
        public ImageQuality r;
        public DXVideoControlConfig<iew> t;
        public int v;
        public boolean x;
        public boolean y;
        public int z;
        public boolean s = true;
        public boolean u = false;
        public boolean w = true;
        public String A = DXEngineConfig.DX_DEFAULT_SUB_BIZTYPE;
        public final nb6 B = new nb6();
        public boolean C = false;
        public int E = 0;

        static {
            t2o.a(444596485);
        }

        public b(String str) {
            this.z = 0;
            this.c = str;
            if (!TextUtils.isEmpty(str)) {
                this.c = str;
            } else {
                this.c = DXEngineConfig.DX_DEFAULT_BIZTYPE;
            }
            this.f = System.currentTimeMillis();
            this.e = 1;
            this.h = 100;
            this.i = true;
            this.d = DXEngineConfig.DEFAULT_PERIOD_TIME;
            this.g = false;
            this.k = 100L;
            this.m = -1;
            this.l = "";
            this.o = null;
            this.v = 1;
            this.x = false;
            this.z = 0;
            this.r = null;
            this.y = false;
            this.f7287a = "";
            this.D = new x7q();
            this.b = false;
        }

        public static /* synthetic */ boolean A(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5bdc1a6d", new Object[]{bVar})).booleanValue();
            }
            return bVar.i;
        }

        public static /* synthetic */ long B(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("6c91e71e", new Object[]{bVar})).longValue();
            }
            return bVar.k;
        }

        public static /* synthetic */ int C(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("7d47b3de", new Object[]{bVar})).intValue();
            }
            return bVar.m;
        }

        public static /* synthetic */ String D(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("d7f06174", new Object[]{bVar});
            }
            return bVar.l;
        }

        public static /* synthetic */ int E(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("503b81c5", new Object[]{bVar})).intValue();
            }
            return bVar.E;
        }

        public static /* synthetic */ int a(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("84f1a97", new Object[]{bVar})).intValue();
            }
            return bVar.d;
        }

        public static /* synthetic */ long b(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("1904e759", new Object[]{bVar})).longValue();
            }
            return bVar.f;
        }

        public static /* synthetic */ String c(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("9547e6ad", new Object[]{bVar});
            }
            bVar.getClass();
            return null;
        }

        public static /* synthetic */ y7 d(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (y7) ipChange.ipc$dispatch("59a68d93", new Object[]{bVar});
            }
            return bVar.n;
        }

        public static /* synthetic */ ih5 e(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ih5) ipChange.ipc$dispatch("2bf35739", new Object[]{bVar});
            }
            return bVar.o;
        }

        public static /* synthetic */ boolean f(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("659f849a", new Object[]{bVar})).booleanValue();
            }
            return bVar.p;
        }

        public static /* synthetic */ lvb g(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (lvb) ipChange.ipc$dispatch("21b2f26d", new Object[]{bVar});
            }
            bVar.getClass();
            return null;
        }

        public static /* synthetic */ boolean h(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("870b1e1c", new Object[]{bVar})).booleanValue();
            }
            return bVar.q;
        }

        public static /* synthetic */ boolean i(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("97c0eadd", new Object[]{bVar})).booleanValue();
            }
            return bVar.s;
        }

        public static /* synthetic */ DXVideoControlConfig j(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXVideoControlConfig) ipChange.ipc$dispatch("7ac59a9f", new Object[]{bVar});
            }
            return bVar.t;
        }

        public static /* synthetic */ boolean k(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("b92c845f", new Object[]{bVar})).booleanValue();
            }
            return bVar.u;
        }

        public static /* synthetic */ boolean k0(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("9eb34d71", new Object[]{bVar})).booleanValue();
            }
            bVar.getClass();
            return false;
        }

        public static /* synthetic */ int l(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("c9e2510f", new Object[]{bVar})).intValue();
            }
            return bVar.v;
        }

        public static /* synthetic */ int m(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("29bab419", new Object[]{bVar})).intValue();
            }
            return bVar.e;
        }

        public static /* synthetic */ boolean n(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("3981e9b6", new Object[]{bVar})).booleanValue();
            }
            return bVar.w;
        }

        public static /* synthetic */ boolean o(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("4a37b677", new Object[]{bVar})).booleanValue();
            }
            bVar.getClass();
            return false;
        }

        public static /* synthetic */ boolean p(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5aed8338", new Object[]{bVar})).booleanValue();
            }
            return bVar.x;
        }

        public static /* synthetic */ int q(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("6ba34fe8", new Object[]{bVar})).intValue();
            }
            return bVar.z;
        }

        public static /* synthetic */ String r(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("9e731aaa", new Object[]{bVar});
            }
            return bVar.A;
        }

        public static /* synthetic */ ImageQuality s(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ImageQuality) ipChange.ipc$dispatch("182e786b", new Object[]{bVar});
            }
            return bVar.r;
        }

        public static /* synthetic */ nb6 t(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (nb6) ipChange.ipc$dispatch("b1bf39b2", new Object[]{bVar});
            }
            return bVar.B;
        }

        public static /* synthetic */ boolean u(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("ae7a82fd", new Object[]{bVar})).booleanValue();
            }
            return bVar.j;
        }

        public static /* synthetic */ boolean v(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("bf304fbe", new Object[]{bVar})).booleanValue();
            }
            return bVar.C;
        }

        public static /* synthetic */ boolean w(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("cfe61c7f", new Object[]{bVar})).booleanValue();
            }
            return bVar.y;
        }

        public static /* synthetic */ boolean x(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("3a7080eb", new Object[]{bVar})).booleanValue();
            }
            bVar.getClass();
            return false;
        }

        public static /* synthetic */ x7q y(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (x7q) ipChange.ipc$dispatch("4a27c8df", new Object[]{bVar});
            }
            return bVar.D;
        }

        public static /* synthetic */ int z(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("4b264d9b", new Object[]{bVar})).intValue();
            }
            return bVar.h;
        }

        public DXEngineConfig F() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXEngineConfig) ipChange.ipc$dispatch("445d7f65", new Object[]{this});
            }
            return new DXEngineConfig(this.c, this);
        }

        public b G(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("f30415bc", new Object[]{this, new Boolean(z)});
            }
            H(z, false);
            return this;
        }

        public b H(boolean z, boolean z2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("e2811516", new Object[]{this, new Boolean(z), new Boolean(z2)});
            }
            this.B.m(z);
            this.B.n(z2);
            return this;
        }

        public b I(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("5c590844", new Object[]{this, new Boolean(z)});
            }
            this.j = z;
            return this;
        }

        public b J(y7 y7Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("83168e01", new Object[]{this, y7Var});
            }
            this.n = y7Var;
            return this;
        }

        public b K(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("9e8ad982", new Object[]{this, str});
            }
            this.f7287a = str;
            return this;
        }

        public b L(x7q x7qVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("e8f9800c", new Object[]{this, x7qVar});
            }
            this.D = x7qVar;
            return this;
        }

        public b M(cvb cvbVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("f2603db6", new Object[]{this, cvbVar});
            }
            this.B.l(cvbVar);
            return this;
        }

        public b N(ih5 ih5Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("78da0db0", new Object[]{this, ih5Var});
            }
            this.o = ih5Var;
            return this;
        }

        public b O(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("33b2af0c", new Object[]{this, new Boolean(z)});
            }
            this.C = z;
            return this;
        }

        public b P(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("d0817378", new Object[]{this, new Boolean(z)});
            }
            this.g = z;
            return this;
        }

        public b Q(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("544cadd0", new Object[]{this, new Integer(i)});
            }
            this.e = i;
            return this;
        }

        public b R(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("1704f843", new Object[]{this, new Boolean(z)});
            }
            this.w = z;
            return this;
        }

        public b S(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("1feb783c", new Object[]{this, new Boolean(z)});
            }
            this.s = z;
            return this;
        }

        public b T(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("9643c575", new Object[]{this, new Boolean(z)});
            }
            this.x = z;
            return this;
        }

        public b U(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("14e9340d", new Object[]{this, new Boolean(z)});
            }
            this.y = z;
            return this;
        }

        public b V(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("d45a79a0", new Object[]{this, new Boolean(z)});
            }
            this.q = z;
            return this;
        }

        public b W(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("aa25d321", new Object[]{this, new Boolean(z)});
            }
            this.u = z;
            return this;
        }

        public b X(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("a3185e00", new Object[]{this, new Integer(i)});
            }
            this.m = i;
            return this;
        }

        public b Y(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("e25d7f5a", new Object[]{this, str});
            }
            this.l = str;
            return this;
        }

        public b Z(ImageQuality imageQuality) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("3c160050", new Object[]{this, imageQuality});
            }
            this.r = imageQuality;
            return this;
        }

        public b a0(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("fd683b65", new Object[]{this, new Integer(i)});
            }
            this.E = i;
            return this;
        }

        public b b0(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("d77ad5d8", new Object[]{this, new Boolean(z)});
            }
            this.p = z;
            return this;
        }

        public b c0(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("5292503b", new Object[]{this, new Integer(i)});
            }
            this.d = i;
            return this;
        }

        public b d0(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("3bca46ac", new Object[]{this, new Integer(i)});
            }
            this.h = i;
            return this;
        }

        public b e0(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("afcdc07a", new Object[]{this, new Integer(i)});
            }
            this.v = i;
            return this;
        }

        public b f0(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("9d670bf", new Object[]{this, str});
            }
            this.A = str;
            return this;
        }

        public b g0(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("31dfcad5", new Object[]{this, new Boolean(z)});
            }
            this.i = z;
            return this;
        }

        public b h0(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("d8c32ea3", new Object[]{this, new Boolean(z)});
            }
            this.b = z;
            return this;
        }

        public b i0(DXVideoControlConfig<iew> dXVideoControlConfig) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("c684be7f", new Object[]{this, dXVideoControlConfig});
            }
            this.t = dXVideoControlConfig;
            return this;
        }

        public b j0(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("bfa928c2", new Object[]{this, new Integer(i)});
            }
            this.z = i;
            return this;
        }
    }

    static {
        t2o.a(444596483);
    }

    public boolean A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4b57d734", new Object[]{this})).booleanValue();
        }
        if (eb5.q()) {
            return false;
        }
        return this.v;
    }

    public boolean B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("df3777f5", new Object[]{this})).booleanValue();
        }
        return this.r;
    }

    public boolean C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7aeb6ae", new Object[]{this})).booleanValue();
        }
        return this.x;
    }

    public boolean D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d02b5c46", new Object[]{this})).booleanValue();
        }
        return this.y;
    }

    public boolean E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9368a359", new Object[]{this})).booleanValue();
        }
        return this.p;
    }

    public boolean F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e6409d5a", new Object[]{this})).booleanValue();
        }
        return this.t;
    }

    public boolean G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d7e62b91", new Object[]{this})).booleanValue();
        }
        return this.n;
    }

    public boolean H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4e8f500e", new Object[]{this})).booleanValue();
        }
        return this.h;
    }

    public boolean I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3e06a694", new Object[]{this})).booleanValue();
        }
        return this.z;
    }

    public void J(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbd585e8", new Object[]{this, new Integer(i)});
        } else {
            this.A.o(i);
        }
    }

    public boolean K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7ebe3380", new Object[]{this})).booleanValue();
        }
        return this.H;
    }

    public void b(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd6f94d", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        this.A.m(z);
        this.A.n(z2);
    }

    public y7 c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (y7) ipChange.ipc$dispatch("d543e49c", new Object[]{this});
        }
        return this.o;
    }

    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9c07dca2", new Object[]{this});
        }
        return this.f7286a;
    }

    public ih5 e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ih5) ipChange.ipc$dispatch("5e638dd5", new Object[]{this});
        }
        return this.m;
    }

    public wu5 f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wu5) ipChange.ipc$dispatch("83f263f5", new Object[]{this});
        }
        return this.q;
    }

    public long g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("81aacb6e", new Object[]{this})).longValue();
        }
        return this.c;
    }

    public int h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e08734e3", new Object[]{this})).intValue();
        }
        return this.k;
    }

    public String i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9ea62071", new Object[]{this});
        }
        return this.j;
    }

    public ImageQuality j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageQuality) ipChange.ipc$dispatch("6e41c615", new Object[]{this});
        }
        return this.D;
    }

    public int k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("58ca67a8", new Object[]{this})).intValue();
        }
        return this.G;
    }

    public int l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b6c3fe9e", new Object[]{this})).intValue();
        }
        return this.b;
    }

    public int m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("425c6f", new Object[]{this})).intValue();
        }
        return this.g;
    }

    public String n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a4f8b1c8", new Object[]{this});
        }
        return this.l;
    }

    public int o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fd0d085d", new Object[]{this})).intValue();
        }
        return this.u;
    }

    public nb6 p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nb6) ipChange.ipc$dispatch("f0cf07f", new Object[]{this});
        }
        return this.A;
    }

    public x7q q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x7q) ipChange.ipc$dispatch("54bb6407", new Object[]{this});
        }
        return this.F;
    }

    public String r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("10c6e656", new Object[]{this});
        }
        if (TextUtils.isEmpty(this.C)) {
            this.C = DX_DEFAULT_SUB_BIZTYPE;
        }
        return this.C;
    }

    public long s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6e9f0873", new Object[]{this})).longValue();
        }
        return this.i;
    }

    public DXVideoControlConfig<iew> t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXVideoControlConfig) ipChange.ipc$dispatch("4dba91c6", new Object[]{this});
        }
        return this.s;
    }

    public int u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c9669985", new Object[]{this})).intValue();
        }
        return this.B;
    }

    public boolean v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("635a5bca", new Object[]{this})).booleanValue();
        }
        return this.A.f();
    }

    public boolean w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("67c75d06", new Object[]{this})).booleanValue();
        }
        return this.w;
    }

    public boolean x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c73ea67d", new Object[]{this})).booleanValue();
        }
        return this.E;
    }

    public boolean y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c97a723a", new Object[]{this})).booleanValue();
        }
        return this.e;
    }

    public boolean z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a90c52e9", new Object[]{this})).booleanValue();
        }
        return this.f;
    }

    public DXEngineConfig(String str) {
        this(str, new b(str));
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df7a8667", new Object[]{this, new Boolean(z)});
        } else {
            b(z, false);
        }
    }

    public DXEngineConfig(String str, b bVar) {
        this.d = 1;
        this.r = true;
        this.u = 1;
        this.v = true;
        this.B = 0;
        this.C = DX_DEFAULT_SUB_BIZTYPE;
        this.E = false;
        this.G = 0;
        this.f7286a = str;
        this.b = b.a(bVar);
        this.c = b.b(bVar);
        this.d = b.m(bVar);
        this.e = b.x(bVar);
        this.g = b.z(bVar);
        this.h = b.A(bVar);
        this.f = bVar.g;
        this.i = Math.max(b.B(bVar), 100L);
        if (TextUtils.isEmpty(str)) {
            this.f7286a = DX_DEFAULT_BIZTYPE;
        }
        this.k = b.C(bVar);
        this.j = b.D(bVar);
        boolean k0 = b.k0(bVar);
        this.H = k0;
        if (!k0) {
            this.H = zg5.z5(str);
        }
        this.l = b.c(bVar);
        this.o = b.d(bVar);
        this.m = b.e(bVar);
        this.n = b.f(bVar);
        if (b.g(bVar) != null) {
            this.q = new wu5(b.g(bVar));
        } else {
            this.q = vu5.b;
        }
        this.p = b.h(bVar);
        this.r = b.i(bVar);
        this.s = b.j(bVar);
        this.t = b.k(bVar);
        this.u = b.l(bVar);
        this.v = b.n(bVar);
        this.w = b.o(bVar);
        this.x = b.p(bVar);
        if (!eb5.j() || b.q(bVar) != 0) {
            this.B = b.q(bVar);
        } else {
            this.B = 1;
        }
        this.C = b.r(bVar);
        this.D = b.s(bVar);
        this.A = b.t(bVar);
        b.u(bVar);
        this.E = b.v(bVar);
        if (!zg5.I3()) {
            this.y = false;
        } else {
            boolean w = b.w(bVar);
            this.y = w;
            if (!w) {
                this.y = cb5.b(str);
            } else if (eb5.G() && j18.HOMEPAGE_DX_MODULE.equals(str) && TextUtils.isEmpty(bVar.f7287a)) {
                cb5.d(str, zg5.DEFAULT_INFORMATIONFLOW_WHITE_LIST);
            } else if (!TextUtils.isEmpty(bVar.f7287a)) {
                cb5.d(str, bVar.f7287a);
            }
        }
        this.F = b.y(bVar);
        this.G = b.E(bVar);
        this.z = bVar.b;
    }
}
