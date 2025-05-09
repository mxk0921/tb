package com.taobao.tao.image;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.util.TaobaoImageUrlStrategy;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ImageStrategyConfig {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BALA = "bala";
    public static final String DEFAULT = "default";
    public static final String DETAIL = "detail";
    public static final String GUANGGUANG = "guangguang";
    public static final String HOME = "home";
    public static final String SEARCH = "search";
    public static final String SHOP = "shop";
    public static final String TBCHANNEL = "tbchannel";
    public static final String WEAPP = "weapp";
    public static final String WEAPPSHARPEN = "weappsharpen";
    public static final String WEITAO = "weitao";
    public static boolean q;
    public static boolean r;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f12428a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final int f;
    public final boolean g;
    public boolean h;
    public final Boolean i;
    public final Boolean j;
    public final Boolean k;
    public final Boolean l;
    public final TaobaoImageUrlStrategy.ImageQuality m;
    public final TaobaoImageUrlStrategy.ImageBlur n;
    public final Boolean o;
    public final SizeLimitType p;
    public final boolean s;
    public final boolean t;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public enum SizeLimitType {
        WIDTH_LIMIT,
        HEIGHT_LIMIT,
        ALL_LIMIT;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(SizeLimitType sizeLimitType, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/image/ImageStrategyConfig$SizeLimitType");
        }

        public static SizeLimitType valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SizeLimitType) ipChange.ipc$dispatch("7834fee0", new Object[]{str});
            }
            return (SizeLimitType) Enum.valueOf(SizeLimitType.class, str);
        }
    }

    public static b u(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("c5dcb8b5", new Object[]{str});
        }
        return new b(str, 0);
    }

    public static b v(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("3a27f32c", new Object[]{str, new Integer(i)});
        }
        return new b(str, i);
    }

    public static b w(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("4bbd016b", new Object[]{str, str2});
        }
        return new b(str, str2);
    }

    public boolean A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ee4134e4", new Object[]{this})).booleanValue();
        }
        return this.t;
    }

    public int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("14dc0c52", new Object[]{this})).intValue();
        }
        return this.d;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("321f3960", new Object[]{this});
        }
        return this.c;
    }

    public TaobaoImageUrlStrategy.CutType c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaobaoImageUrlStrategy.CutType) ipChange.ipc$dispatch("8481649e", new Object[]{this});
        }
        return null;
    }

    public int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c72be01", new Object[]{this})).intValue();
        }
        return this.f;
    }

    public TaobaoImageUrlStrategy.ImageQuality e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaobaoImageUrlStrategy.ImageQuality) ipChange.ipc$dispatch("b0e7f116", new Object[]{this});
        }
        return this.m;
    }

    public int f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fcf9cf60", new Object[]{this})).intValue();
        }
        return this.e;
    }

    public TaobaoImageUrlStrategy.ImageBlur g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaobaoImageUrlStrategy.ImageBlur) ipChange.ipc$dispatch("ada18f52", new Object[]{this});
        }
        return this.n;
    }

    public String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return this.b;
    }

    public Map<String, String> i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("e79d2786", new Object[]{this});
        }
        return null;
    }

    public String j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("91971a73", new Object[]{this});
        }
        return null;
    }

    public SizeLimitType k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SizeLimitType) ipChange.ipc$dispatch("f70cd0b4", new Object[]{this});
        }
        return this.p;
    }

    public Boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("f319dd60", new Object[]{this});
        }
        return this.l;
    }

    public Boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("97cf2069", new Object[]{this});
        }
        return null;
    }

    public Boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("ec92168c", new Object[]{this});
        }
        return this.j;
    }

    public Boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("b8c598a0", new Object[]{this});
        }
        return this.k;
    }

    public Boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("c4e2a4d7", new Object[]{this});
        }
        return this.i;
    }

    public boolean q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e112fa89", new Object[]{this})).booleanValue();
        }
        return this.g;
    }

    public Boolean r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("b6549576", new Object[]{this});
        }
        return this.o;
    }

    public boolean s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e3e5886", new Object[]{this})).booleanValue();
        }
        return this.h;
    }

    public boolean t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c2a27031", new Object[]{this})).booleanValue();
        }
        return this.f12428a;
    }

    public final String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return String.valueOf(this.d);
    }

    public void y(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8884365a", new Object[]{this, new Boolean(z)});
        } else {
            this.h = z;
        }
    }

    public boolean z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("517f2b6b", new Object[]{this})).booleanValue();
        }
        return this.s;
    }

    public ImageStrategyConfig(b bVar) {
        this.b = bVar.d;
        this.c = bVar.c;
        this.d = bVar.e;
        this.f12428a = bVar.f12429a;
        this.e = bVar.f;
        this.f = bVar.g;
        this.i = bVar.h;
        this.h = bVar.m;
        this.j = bVar.i;
        this.k = bVar.j;
        this.l = bVar.k;
        this.m = bVar.n;
        this.o = Boolean.valueOf(bVar.b);
        this.t = bVar.q;
        this.s = bVar.r;
        Boolean bool = bVar.l;
        if (bool != null) {
            this.g = bool.booleanValue();
        }
        SizeLimitType sizeLimitType = bVar.p;
        this.p = sizeLimitType;
        if (sizeLimitType == null) {
            this.p = SizeLimitType.ALL_LIMIT;
        } else if (sizeLimitType == SizeLimitType.WIDTH_LIMIT) {
            this.f = 10000;
            this.e = 0;
        } else if (sizeLimitType == SizeLimitType.HEIGHT_LIMIT) {
            this.f = 0;
            this.e = 10000;
        }
        this.n = bVar.o;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public boolean f12429a;
        public boolean b;
        public final String c;
        public final String d;
        public final int e;
        public int f;
        public int g;
        public Boolean h;
        public Boolean i;
        public Boolean j;
        public Boolean k;
        public Boolean l;
        public boolean m;
        public TaobaoImageUrlStrategy.ImageQuality n;
        public TaobaoImageUrlStrategy.ImageBlur o;
        public SizeLimitType p;
        public boolean q;
        public boolean r;

        public b(String str, int i) {
            this.f = -1;
            this.g = -1;
            this.d = str;
            this.c = "";
            this.e = i;
        }

        public ImageStrategyConfig a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ImageStrategyConfig) ipChange.ipc$dispatch("525499b4", new Object[]{this});
            }
            return new ImageStrategyConfig(this);
        }

        public b b(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("1a81ae6d", new Object[]{this, new Boolean(z)});
            }
            this.k = Boolean.valueOf(z);
            return this;
        }

        public b c(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("c4c02581", new Object[]{this, new Boolean(z)});
            }
            this.i = Boolean.valueOf(z);
            return this;
        }

        public b d(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("67465795", new Object[]{this, new Boolean(z)});
            }
            this.j = Boolean.valueOf(z);
            return this;
        }

        public b e(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("ac883a59", new Object[]{this, new Boolean(z)});
            }
            this.b = z;
            return this;
        }

        public b f(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("a127e2e4", new Object[]{this, new Boolean(z)});
            }
            this.h = Boolean.valueOf(z);
            return this;
        }

        public b g(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("eced154b", new Object[]{this, new Boolean(z)});
            }
            this.l = Boolean.valueOf(z);
            return this;
        }

        public b h(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("62f1ae71", new Object[]{this, new Integer(i)});
            }
            this.g = i;
            return this;
        }

        public b i(TaobaoImageUrlStrategy.ImageQuality imageQuality) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("b622aa16", new Object[]{this, imageQuality});
            }
            this.n = imageQuality;
            return this;
        }

        public b j(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("f93c82a8", new Object[]{this, new Integer(i)});
            }
            this.f = i;
            return this;
        }

        public b k(TaobaoImageUrlStrategy.ImageBlur imageBlur) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("6d23a85c", new Object[]{this, imageBlur});
            }
            this.o = imageBlur;
            return this;
        }

        public b l(SizeLimitType sizeLimitType) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("c78111d6", new Object[]{this, sizeLimitType});
            }
            this.p = sizeLimitType;
            return this;
        }

        public b m(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("eda0e0c4", new Object[]{this, new Boolean(z)});
            }
            this.f12429a = z;
            return this;
        }

        public b n(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("b5b1a3f6", new Object[]{this, new Boolean(z)});
            }
            this.m = z;
            return this;
        }

        public b o(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("aa3b365", new Object[]{this, new Boolean(z)});
            }
            this.q = z;
            return this;
        }

        public b p(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("8ed8fd1b", new Object[]{this, new Boolean(z)});
            }
            this.r = z;
            return this;
        }

        public b(String str, String str2) {
            this.f = -1;
            this.g = -1;
            this.d = str;
            this.c = str2;
            this.e = 0;
        }
    }
}
