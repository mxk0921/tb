package com.taobao.themis.kernel.container;

import com.alibaba.ariver.app.api.ui.darkmode.ThemeUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.metaInfo.TMSMetaInfoWrapper;
import com.taobao.weex.common.Constants;
import java.util.Arrays;
import tb.a07;
import tb.ckf;
import tb.o9s;
import tb.t2o;
import tb.tbj;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class Window {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final b Companion = new b(null);

    /* renamed from: a  reason: collision with root package name */
    public String f13566a;
    public String b;
    public Integer c;
    public final Boolean d;
    public Integer e;
    public Boolean f;
    public Theme g;
    public Boolean h;
    public Boolean i;
    public final Integer j;
    public Orientation k;
    public final Boolean l;
    public final Boolean m;
    public final WindowRatioConfig n;
    public Boolean o;
    public final Boolean p;
    public final c q;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class Orientation extends Enum<Orientation> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final String orientation;
        public static final Orientation PORTRAIT = new Orientation("PORTRAIT", 0, "portrait");
        public static final Orientation LANDSCAPE = new Orientation("LANDSCAPE", 1, "landscape");
        public static final Orientation UNSPECIFIED = new Orientation("UNSPECIFIED", 2, "unspecified");
        private static final /* synthetic */ Orientation[] $VALUES = $values();

        private static final /* synthetic */ Orientation[] $values() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Orientation[]) ipChange.ipc$dispatch("144d8f0f", new Object[0]) : new Orientation[]{PORTRAIT, LANDSCAPE, UNSPECIFIED};
        }

        private Orientation(String str, int i, String str2) {
            this.orientation = str2;
        }

        public static /* synthetic */ Object ipc$super(Orientation orientation, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/kernel/container/Window$Orientation");
        }

        public static Orientation valueOf(String str) {
            Object valueOf;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                valueOf = ipChange.ipc$dispatch("f9967e44", new Object[]{str});
            } else {
                valueOf = Enum.valueOf(Orientation.class, str);
            }
            return (Orientation) valueOf;
        }

        public static Orientation[] values() {
            Object clone;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                clone = ipChange.ipc$dispatch("259e6ab3", new Object[0]);
            } else {
                clone = $VALUES.clone();
            }
            return (Orientation[]) clone;
        }

        public final String getOrientation() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8711b69f", new Object[]{this});
            }
            return this.orientation;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class Theme extends Enum<Theme> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final String theme;
        public static final Theme AUTO = new Theme("AUTO", 0, "auto");
        public static final Theme LIGHT = new Theme("LIGHT", 1, "light");
        public static final Theme DARK = new Theme("DARK", 2, ThemeUtils.COLOR_SCHEME_DARK);
        private static final /* synthetic */ Theme[] $VALUES = $values();

        private static final /* synthetic */ Theme[] $values() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Theme[]) ipChange.ipc$dispatch("4942d936", new Object[0]) : new Theme[]{AUTO, LIGHT, DARK};
        }

        private Theme(String str, int i, String str2) {
            this.theme = str2;
        }

        public static /* synthetic */ Object ipc$super(Theme theme, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/kernel/container/Window$Theme");
        }

        public static Theme valueOf(String str) {
            Object valueOf;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                valueOf = ipChange.ipc$dispatch("d6e8942b", new Object[]{str});
            } else {
                valueOf = Enum.valueOf(Theme.class, str);
            }
            return (Theme) valueOf;
        }

        public static Theme[] values() {
            Object clone;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                clone = ipChange.ipc$dispatch("70ba3fda", new Object[0]);
            } else {
                clone = $VALUES.clone();
            }
            return (Theme[]) clone;
        }

        public final String getTheme() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("b7106cc6", new Object[]{this});
            }
            return this.theme;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class WindowRatioConfig extends Enum<WindowRatioConfig> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final String config;
        public static final WindowRatioConfig ALL = new WindowRatioConfig("ALL", 0, "all");
        public static final WindowRatioConfig PORTRAIT = new WindowRatioConfig("PORTRAIT", 1, "portrait");
        public static final WindowRatioConfig LANDSCAPE = new WindowRatioConfig("LANDSCAPE", 2, "landscape");
        public static final WindowRatioConfig NONE = new WindowRatioConfig("NONE", 3, "none");
        private static final /* synthetic */ WindowRatioConfig[] $VALUES = $values();

        private static final /* synthetic */ WindowRatioConfig[] $values() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (WindowRatioConfig[]) ipChange.ipc$dispatch("fd052262", new Object[0]) : new WindowRatioConfig[]{ALL, PORTRAIT, LANDSCAPE, NONE};
        }

        private WindowRatioConfig(String str, int i, String str2) {
            this.config = str2;
        }

        public static /* synthetic */ Object ipc$super(WindowRatioConfig windowRatioConfig, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/kernel/container/Window$WindowRatioConfig");
        }

        public static WindowRatioConfig valueOf(String str) {
            Object valueOf;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                valueOf = ipChange.ipc$dispatch("b14915d7", new Object[]{str});
            } else {
                valueOf = Enum.valueOf(WindowRatioConfig.class, str);
            }
            return (WindowRatioConfig) valueOf;
        }

        public static WindowRatioConfig[] values() {
            Object clone;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                clone = ipChange.ipc$dispatch("aa83b306", new Object[0]);
            } else {
                clone = $VALUES.clone();
            }
            return (WindowRatioConfig[]) clone;
        }

        public final String getConfig() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("f8f91bc1", new Object[]{this});
            }
            return this.config;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(839909504);
        }

        public /* synthetic */ b(a07 a07Var) {
            this();
        }

        public b() {
        }

        public final Window a(Window window, Window window2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Window) ipChange.ipc$dispatch("d30dfd36", new Object[]{this, window, window2});
            }
            ckf.g(window, Constants.Value.ORIGINAL);
            ckf.g(window2, tbj.REQUEST_UPDATES);
            String o = window2.o();
            if (o == null) {
                o = window.o();
            }
            String q = window2.q();
            if (q == null) {
                q = window.q();
            }
            Integer p = window2.p();
            if (p == null) {
                p = window.p();
            }
            Boolean d = window2.d();
            if (d == null) {
                d = window.d();
            }
            Integer f = window2.f();
            if (f == null) {
                f = window.f();
            }
            Boolean h = window2.h();
            if (h == null) {
                h = window.h();
            }
            Theme i = window2.i();
            if (i == null) {
                i = window.i();
            }
            Boolean g = window2.g();
            if (g == null) {
                g = window.g();
            }
            Boolean m = window2.m();
            if (m == null) {
                m = window.m();
            }
            Integer k = window2.k();
            if (k == null) {
                k = window.k();
            }
            Orientation j = window2.j();
            if (j == null) {
                j = window.j();
            }
            Boolean b = window2.b();
            if (b == null) {
                b = window.b();
            }
            Boolean c = window2.c();
            if (c == null) {
                c = window.c();
            }
            WindowRatioConfig r = window2.r();
            if (r == null) {
                r = window.r();
            }
            Boolean l = window2.l();
            if (l == null) {
                l = window.l();
            }
            Boolean n = window2.n();
            if (n == null) {
                n = window.n();
            }
            c e = window2.e();
            if (e == null) {
                e = window.e();
            }
            return window.a(o, q, p, d, f, h, i, g, m, k, j, b, c, r, l, n, e);
        }
    }

    static {
        t2o.a(839909501);
    }

    public Window() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131071, null);
    }

    public final void A(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d62fee03", new Object[]{this, num});
        } else {
            this.c = num;
        }
    }

    public final void B(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("116164b6", new Object[]{this, str});
        } else {
            this.b = str;
        }
    }

    public final Window a(String str, String str2, Integer num, Boolean bool, Integer num2, Boolean bool2, Theme theme, Boolean bool3, Boolean bool4, Integer num3, Orientation orientation, Boolean bool5, Boolean bool6, WindowRatioConfig windowRatioConfig, Boolean bool7, Boolean bool8, c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Window) ipChange.ipc$dispatch("e2f2cce1", new Object[]{this, str, str2, num, bool, num2, bool2, theme, bool3, bool4, num3, orientation, bool5, bool6, windowRatioConfig, bool7, bool8, cVar}) : new Window(str, str2, num, bool, num2, bool2, theme, bool3, bool4, num3, orientation, bool5, bool6, windowRatioConfig, bool7, bool8, cVar);
    }

    public final Boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("244da95c", new Object[]{this});
        }
        return this.l;
    }

    public final Boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("d81ca9d2", new Object[]{this});
        }
        return this.m;
    }

    public final Boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("5dbdcd7c", new Object[]{this});
        }
        return this.d;
    }

    public final c e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("f735080", new Object[]{this});
        }
        return this.q;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Window)) {
            return false;
        }
        Window window = (Window) obj;
        if (ckf.b(this.f13566a, window.f13566a) && ckf.b(this.b, window.b) && ckf.b(this.c, window.c) && ckf.b(this.d, window.d) && ckf.b(this.e, window.e) && ckf.b(this.f, window.f) && this.g == window.g && ckf.b(this.h, window.h) && ckf.b(this.i, window.i) && ckf.b(this.j, window.j) && this.k == window.k && ckf.b(this.l, window.l) && ckf.b(this.m, window.m) && this.n == window.n && ckf.b(this.o, window.o) && ckf.b(this.p, window.p) && ckf.b(this.q, window.q)) {
            return true;
        }
        return false;
    }

    public final Integer f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("c086d646", new Object[]{this});
        }
        return this.e;
    }

    public final Boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("5caeb18c", new Object[]{this});
        }
        return this.h;
    }

    public final Boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("142b12f9", new Object[]{this});
        }
        return this.f;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        String str = this.f13566a;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i18 = i * 31;
        String str2 = this.b;
        if (str2 == null) {
            i2 = 0;
        } else {
            i2 = str2.hashCode();
        }
        int i19 = (i18 + i2) * 31;
        Integer num = this.c;
        if (num == null) {
            i3 = 0;
        } else {
            i3 = num.hashCode();
        }
        int i20 = (i19 + i3) * 31;
        Boolean bool = this.d;
        if (bool == null) {
            i4 = 0;
        } else {
            i4 = bool.hashCode();
        }
        int i21 = (i20 + i4) * 31;
        Integer num2 = this.e;
        if (num2 == null) {
            i5 = 0;
        } else {
            i5 = num2.hashCode();
        }
        int i22 = (i21 + i5) * 31;
        Boolean bool2 = this.f;
        if (bool2 == null) {
            i6 = 0;
        } else {
            i6 = bool2.hashCode();
        }
        int i23 = (i22 + i6) * 31;
        Theme theme = this.g;
        if (theme == null) {
            i7 = 0;
        } else {
            i7 = theme.hashCode();
        }
        int i24 = (i23 + i7) * 31;
        Boolean bool3 = this.h;
        if (bool3 == null) {
            i8 = 0;
        } else {
            i8 = bool3.hashCode();
        }
        int i25 = (i24 + i8) * 31;
        Boolean bool4 = this.i;
        if (bool4 == null) {
            i9 = 0;
        } else {
            i9 = bool4.hashCode();
        }
        int i26 = (i25 + i9) * 31;
        Integer num3 = this.j;
        if (num3 == null) {
            i10 = 0;
        } else {
            i10 = num3.hashCode();
        }
        int i27 = (i26 + i10) * 31;
        Orientation orientation = this.k;
        if (orientation == null) {
            i11 = 0;
        } else {
            i11 = orientation.hashCode();
        }
        int i28 = (i27 + i11) * 31;
        Boolean bool5 = this.l;
        if (bool5 == null) {
            i12 = 0;
        } else {
            i12 = bool5.hashCode();
        }
        int i29 = (i28 + i12) * 31;
        Boolean bool6 = this.m;
        if (bool6 == null) {
            i13 = 0;
        } else {
            i13 = bool6.hashCode();
        }
        int i30 = (i29 + i13) * 31;
        WindowRatioConfig windowRatioConfig = this.n;
        if (windowRatioConfig == null) {
            i14 = 0;
        } else {
            i14 = windowRatioConfig.hashCode();
        }
        int i31 = (i30 + i14) * 31;
        Boolean bool7 = this.o;
        if (bool7 == null) {
            i15 = 0;
        } else {
            i15 = bool7.hashCode();
        }
        int i32 = (i31 + i15) * 31;
        Boolean bool8 = this.p;
        if (bool8 == null) {
            i16 = 0;
        } else {
            i16 = bool8.hashCode();
        }
        int i33 = (i32 + i16) * 31;
        c cVar = this.q;
        if (cVar != null) {
            i17 = cVar.hashCode();
        }
        return i33 + i17;
    }

    public final Theme i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Theme) ipChange.ipc$dispatch("b97e07fc", new Object[]{this});
        }
        return this.g;
    }

    public final Orientation j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Orientation) ipChange.ipc$dispatch("f24014ac", new Object[]{this});
        }
        return this.k;
    }

    public final Integer k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("fb341a87", new Object[]{this});
        }
        return this.j;
    }

    public final Boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("9e6afc10", new Object[]{this});
        }
        return this.o;
    }

    public final Boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("ff055e71", new Object[]{this});
        }
        return this.i;
    }

    public final Boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("98ececd2", new Object[]{this});
        }
        return this.p;
    }

    public final String o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5267f97", new Object[]{this});
        }
        return this.f13566a;
    }

    public final Integer p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("4fe5ad0f", new Object[]{this});
        }
        return this.c;
    }

    public final String q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f4777ac0", new Object[]{this});
        }
        return this.b;
    }

    public final WindowRatioConfig r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WindowRatioConfig) ipChange.ipc$dispatch("101be20c", new Object[]{this});
        }
        return this.n;
    }

    public final void s(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72c8de44", new Object[]{this, num});
        } else {
            this.e = num;
        }
    }

    public final void t(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52b4d592", new Object[]{this, bool});
        } else {
            this.h = bool;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "Window(title=" + ((Object) this.f13566a) + ", titleImage=" + ((Object) this.b) + ", titleColor=" + this.c + ", inheritDocumentTitle=" + this.d + ", navBarBgColor=" + this.e + ", navBarImmersive=" + this.f + ", navBarTheme=" + this.g + ", navBarHide=" + this.h + ", statusBarHide=" + this.i + ", pageBgColor=" + this.j + ", orientation=" + this.k + ", hideHomeIndicator=" + this.l + ", hideHomeTitleArea=" + this.m + ", windowRatioConfig=" + this.n + ", showBackButton=" + this.o + ", tabBarSafeArea=" + this.p + ", menu=" + this.q + ')';
    }

    public final void u(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af50015d", new Object[]{this, bool});
        } else {
            this.f = bool;
        }
    }

    public final void v(Theme theme) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e02dc884", new Object[]{this, theme});
        } else {
            this.g = theme;
        }
    }

    public final void w(Orientation orientation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39236ee6", new Object[]{this, orientation});
        } else {
            this.k = orientation;
        }
    }

    public final void x(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eaf2818e", new Object[]{this, bool});
        } else {
            this.o = bool;
        }
    }

    public final void y(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f448b7e5", new Object[]{this, bool});
        } else {
            this.i = bool;
        }
    }

    public final void z(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c820927", new Object[]{this, str});
        } else {
            this.f13566a = str;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final boolean f13568a;
        public final String[] b;

        static {
            t2o.a(839909505);
        }

        public c(boolean z, String[] strArr) {
            this.f13568a = z;
            this.b = strArr;
        }

        public final String[] a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String[]) ipChange.ipc$dispatch("e2f74b7e", new Object[]{this});
            }
            return this.b;
        }

        public final boolean b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("642476fa", new Object[]{this})).booleanValue();
            }
            return this.f13568a;
        }

        public int hashCode() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
            }
            return (Boolean.valueOf(this.f13568a).hashCode() * 31) + Arrays.hashCode(this.b);
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "Menu(hideMoreBtn=" + this.f13568a + ", hideItems=" + Arrays.toString(this.b) + ')';
        }

        public boolean equals(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            if (!ckf.b(c.class, obj == null ? null : obj.getClass())) {
                return false;
            }
            if (obj != null) {
                c cVar = (c) obj;
                return this.f13568a == cVar.f13568a && Arrays.equals(this.b, cVar.b);
            }
            throw new NullPointerException("null cannot be cast to non-null type com.taobao.themis.kernel.container.Window.Menu");
        }
    }

    public Window(String str, String str2, Integer num, Boolean bool, Integer num2, Boolean bool2, Theme theme, Boolean bool3, Boolean bool4, Integer num3, Orientation orientation, Boolean bool5, Boolean bool6, WindowRatioConfig windowRatioConfig, Boolean bool7, Boolean bool8, c cVar) {
        this.f13566a = str;
        this.b = str2;
        this.c = num;
        this.d = bool;
        this.e = num2;
        this.f = bool2;
        this.g = theme;
        this.h = bool3;
        this.i = bool4;
        this.j = num3;
        this.k = orientation;
        this.l = bool5;
        this.m = bool6;
        this.n = windowRatioConfig;
        this.o = bool7;
        this.p = bool8;
        this.q = cVar;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public Boolean f13567a;
        public Boolean b;
        public Theme c;
        public Boolean d;
        public String e;

        /* compiled from: Taobao */
        /* renamed from: com.taobao.themis.kernel.container.Window$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public /* synthetic */ class C0772a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                t2o.a(839909503);
                int[] iArr = new int[TMSMetaInfoWrapper.Type.values().length];
                iArr[TMSMetaInfoWrapper.Type.AppInfo.ordinal()] = 1;
                iArr[TMSMetaInfoWrapper.Type.Manifest.ordinal()] = 2;
                $EnumSwitchMapping$0 = iArr;
            }
        }

        static {
            t2o.a(839909502);
        }

        public final Window a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Window) ipChange.ipc$dispatch("583dc8c", new Object[]{this});
            }
            return new Window(null, null, o9s.m(null), this.f13567a, o9s.m(null), this.b, this.c, this.d, null, o9s.m(this.e), null, null, null, null, null, null, null, 114688, null);
        }

        public final void c(Boolean bool) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b22d36a2", new Object[]{this, bool});
            } else {
                this.f13567a = bool;
            }
        }

        public final void d(Boolean bool) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("52b4d592", new Object[]{this, bool});
            } else {
                this.d = bool;
            }
        }

        public final void e(Boolean bool) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("af50015d", new Object[]{this, bool});
            } else {
                this.b = bool;
            }
        }

        public final void f(Theme theme) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e02dc884", new Object[]{this, theme});
            } else {
                this.c = theme;
            }
        }

        public final void g(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5bee499e", new Object[]{this, str});
            } else {
                this.e = str;
            }
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:101:0x0249, code lost:
            if (r1.equals(tb.pg1.ATOM_EXT_black) == false) goto L_0x0260;
         */
        /* JADX WARN: Code restructure failed: missing block: B:103:0x0250, code lost:
            if (r1.equals(com.alibaba.ariver.app.api.ui.darkmode.ThemeUtils.COLOR_SCHEME_DARK) == false) goto L_0x0260;
         */
        /* JADX WARN: Code restructure failed: missing block: B:104:0x0253, code lost:
            r1 = com.taobao.themis.kernel.container.Window.Theme.DARK;
         */
        /* JADX WARN: Code restructure failed: missing block: B:95:0x0234, code lost:
            if (r1.equals(tb.pg1.ATOM_EXT_white) == false) goto L_0x0260;
         */
        /* JADX WARN: Code restructure failed: missing block: B:97:0x023b, code lost:
            if (r1.equals("light") == false) goto L_0x0260;
         */
        /* JADX WARN: Code restructure failed: missing block: B:98:0x023e, code lost:
            r1 = com.taobao.themis.kernel.container.Window.Theme.LIGHT;
         */
        /* JADX WARN: Removed duplicated region for block: B:111:0x026b  */
        /* JADX WARN: Removed duplicated region for block: B:112:0x026e  */
        /* JADX WARN: Removed duplicated region for block: B:115:0x028e  */
        /* JADX WARN: Removed duplicated region for block: B:116:0x0291  */
        /* JADX WARN: Removed duplicated region for block: B:119:0x02a3  */
        /* JADX WARN: Removed duplicated region for block: B:121:0x02a8  */
        /* JADX WARN: Removed duplicated region for block: B:127:0x02b9  */
        /* JADX WARN: Removed duplicated region for block: B:128:0x02bc  */
        /* JADX WARN: Removed duplicated region for block: B:130:0x02ca  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00fa  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00fd  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x010f  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0114  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x0125  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x0128  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x0136  */
        /* JADX WARN: Removed duplicated region for block: B:68:0x0187  */
        /* JADX WARN: Removed duplicated region for block: B:69:0x018a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final com.taobao.themis.kernel.container.Window b(com.alibaba.fastjson.JSONObject r41, com.taobao.themis.kernel.metaInfo.TMSMetaInfoWrapper.Type r42) {
            /*
                Method dump skipped, instructions count: 826
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.themis.kernel.container.Window.a.b(com.alibaba.fastjson.JSONObject, com.taobao.themis.kernel.metaInfo.TMSMetaInfoWrapper$Type):com.taobao.themis.kernel.container.Window");
        }
    }

    public /* synthetic */ Window(String str, String str2, Integer num, Boolean bool, Integer num2, Boolean bool2, Theme theme, Boolean bool3, Boolean bool4, Integer num3, Orientation orientation, Boolean bool5, Boolean bool6, WindowRatioConfig windowRatioConfig, Boolean bool7, Boolean bool8, c cVar, int i, a07 a07Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? null : num2, (i & 32) != 0 ? null : bool2, (i & 64) != 0 ? null : theme, (i & 128) != 0 ? null : bool3, (i & 256) != 0 ? null : bool4, (i & 512) != 0 ? null : num3, (i & 1024) != 0 ? null : orientation, (i & 2048) != 0 ? null : bool5, (i & 4096) != 0 ? null : bool6, (i & 8192) != 0 ? null : windowRatioConfig, (i & 16384) != 0 ? null : bool7, (i & 32768) != 0 ? null : bool8, (i & 65536) != 0 ? null : cVar);
    }
}
