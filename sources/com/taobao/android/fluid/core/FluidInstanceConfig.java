package com.taobao.android.fluid.core;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.core.Component;
import tb.anl;
import tb.i0v;
import tb.rv4;
import tb.t2o;
import tb.yod;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class FluidInstanceConfig {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CONTAINER_NAME_DEFAULT = "default";
    public static final String CONTAINER_NAME_GG_TAG3 = "ggtab3";
    public static final String CONTAINER_NAME_SHOP_LOFT = "shopLoft";
    public static final String GG_TYPE_NAME_COMMUNITY = "gg_community";
    public static final String GG_TYPE_NAME_VIDEO = "gg_video";
    private static final String SEPARTOR = "@";
    public static final String TAB_TYPE_FOLLOW = "newFollow";
    public static final String TAB_TYPE_LIVE = "live";
    public static final String TAB_TYPE_VIDEO = "video";
    private Integer actionbarHeight;
    private String bizGroupName;
    private String bizName;
    private String bizType;
    private Context context;
    private rv4 coverObject;
    private Boolean dynamicProfileMode;
    private String fluidOriginUrl;
    private yod fluidServiceRegistry;
    private Uri fluidUrl;
    private Boolean fragmentMode;
    private Boolean fullscreenDisplay;
    private String ggType;
    private Boolean hideTopLayout;
    private anl hostPageIntegererface;
    private Component hostTNodeComponent;
    private Integer muteTipCount;
    private Boolean needTransferAnimation;
    private Boolean onCreateToRequest;
    private String playScenes;
    private String preCoverKey;
    private Boolean preloadInstance;
    private String spm;
    private String tab2PageUrl;
    private String tab3ComponentSource;
    private Boolean tab3DisableCache;
    private Boolean tab3FromIconStream;
    private Boolean tab3FromLauncher;
    private Boolean tab3Fullscreen;
    private String tabId;
    private Boolean tabInstance;
    private Integer topBarHeight;
    private Integer topBarY;
    private Integer transferAnimationHeight;
    private Integer transferAnimationWidth;
    private i0v utCallback;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public String A;
        public Integer B;
        public String C;
        public Integer D;
        public Integer E;
        public Boolean F;

        /* renamed from: a  reason: collision with root package name */
        public Context f7753a;
        public anl b;
        public i0v c;
        public yod d;
        public String e;
        public String f;
        public String g;
        public Boolean h;
        public Boolean i;
        public String j;
        public String k;
        public String l;
        public String m;
        public Uri n;
        public Boolean o;
        public String p;
        public Boolean q;
        public Integer r;
        public Integer s;
        public Boolean t;
        public Boolean u;
        public Boolean v;
        public Boolean w;
        public Boolean x;
        public String y;
        public Boolean z;

        static {
            t2o.a(469762054);
        }

        public static a p() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("764e92f3", new Object[0]);
            }
            return new a();
        }

        public a A(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("9e763372", new Object[]{this, str});
            }
            this.C = str;
            return this;
        }

        public a B(Boolean bool) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("463d4e6d", new Object[]{this, bool});
            }
            this.i = bool;
            return this;
        }

        public a C(Integer num) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("faad047c", new Object[]{this, num});
            }
            this.D = num;
            return this;
        }

        public a D(Integer num) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("5f000ee6", new Object[]{this, num});
            }
            this.E = num;
            return this;
        }

        public a E(Integer num) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("6e790c1", new Object[]{this, num});
            }
            this.s = num;
            return this;
        }

        public a F(Integer num) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("3e8e0554", new Object[]{this, num});
            }
            this.r = num;
            return this;
        }

        public a G(i0v i0vVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("8c226f0f", new Object[]{this, i0vVar});
            }
            this.c = i0vVar;
            return this;
        }

        public a a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("faba0bb9", new Object[]{this, str});
            }
            this.j = str;
            return this;
        }

        public a b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("3ed61a20", new Object[]{this, str});
            }
            this.f = str;
            return this;
        }

        public a c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("2e82f8cf", new Object[]{this, str});
            }
            this.e = str;
            return this;
        }

        public FluidInstanceConfig d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (FluidInstanceConfig) ipChange.ipc$dispatch("f40c9e3d", new Object[]{this});
            }
            FluidInstanceConfig fluidInstanceConfig = new FluidInstanceConfig();
            FluidInstanceConfig.access$002(fluidInstanceConfig, this.b);
            FluidInstanceConfig.access$102(fluidInstanceConfig, null);
            FluidInstanceConfig.access$202(fluidInstanceConfig, this.r);
            FluidInstanceConfig.access$302(fluidInstanceConfig, this.A);
            FluidInstanceConfig.access$402(fluidInstanceConfig, this.c);
            FluidInstanceConfig.access$502(fluidInstanceConfig, this.E);
            FluidInstanceConfig.access$602(fluidInstanceConfig, this.v);
            FluidInstanceConfig.access$702(fluidInstanceConfig, this.t);
            FluidInstanceConfig.access$802(fluidInstanceConfig, null);
            FluidInstanceConfig.access$902(fluidInstanceConfig, null);
            FluidInstanceConfig.access$1002(fluidInstanceConfig, this.q);
            FluidInstanceConfig.access$1102(fluidInstanceConfig, this.F);
            FluidInstanceConfig.access$1202(fluidInstanceConfig, this.o);
            FluidInstanceConfig.access$1302(fluidInstanceConfig, this.u);
            FluidInstanceConfig.access$1402(fluidInstanceConfig, this.w);
            FluidInstanceConfig.access$1502(fluidInstanceConfig, this.x);
            FluidInstanceConfig.access$1602(fluidInstanceConfig, this.n);
            FluidInstanceConfig.access$1702(fluidInstanceConfig, this.g);
            FluidInstanceConfig.access$1802(fluidInstanceConfig, this.m);
            FluidInstanceConfig.access$1902(fluidInstanceConfig, this.D);
            FluidInstanceConfig.access$2002(fluidInstanceConfig, null);
            FluidInstanceConfig.access$2102(fluidInstanceConfig, this.l);
            FluidInstanceConfig.access$2202(fluidInstanceConfig, this.y);
            FluidInstanceConfig.access$2302(fluidInstanceConfig, this.d);
            FluidInstanceConfig.access$2402(fluidInstanceConfig, this.j);
            FluidInstanceConfig.access$2502(fluidInstanceConfig, this.f7753a);
            FluidInstanceConfig.access$2602(fluidInstanceConfig, this.B);
            FluidInstanceConfig.access$2702(fluidInstanceConfig, this.C);
            FluidInstanceConfig.access$2802(fluidInstanceConfig, this.e);
            FluidInstanceConfig.access$2902(fluidInstanceConfig, this.f);
            FluidInstanceConfig.access$3002(fluidInstanceConfig, this.h);
            FluidInstanceConfig.access$3102(fluidInstanceConfig, this.i);
            FluidInstanceConfig.access$3202(fluidInstanceConfig, this.k);
            FluidInstanceConfig.access$3302(fluidInstanceConfig, this.p);
            FluidInstanceConfig.access$3402(fluidInstanceConfig, this.z);
            FluidInstanceConfig.access$3502(fluidInstanceConfig, this.s);
            return fluidInstanceConfig;
        }

        public a e(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("489f37e3", new Object[]{this, context});
            }
            this.f7753a = context;
            return this;
        }

        public a f(Boolean bool) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("3ad8a6ea", new Object[]{this, bool});
            }
            this.u = bool;
            return this;
        }

        public a g(yod yodVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("fe5ebb0e", new Object[]{this, yodVar});
            }
            this.d = yodVar;
            return this;
        }

        public a h(String str, Uri uri) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("acc45d42", new Object[]{this, str, uri});
            }
            this.m = str;
            this.n = uri;
            return this;
        }

        public a i(Boolean bool) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("9a2e8cc4", new Object[]{this, bool});
            }
            this.t = bool;
            return this;
        }

        public a j(Boolean bool) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("8f056ed0", new Object[]{this, bool});
            }
            this.v = bool;
            return this;
        }

        public a k(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("edd0769c", new Object[]{this, str});
            }
            this.y = str;
            return this;
        }

        public a l(Boolean bool) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("5a466c5a", new Object[]{this, bool});
            }
            this.w = bool;
            return this;
        }

        public a m(anl anlVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("40c30610", new Object[]{this, anlVar});
            }
            this.b = anlVar;
            return this;
        }

        public a n(Integer num) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("53fcd054", new Object[]{this, num});
            }
            this.B = num;
            return this;
        }

        public a o(Boolean bool) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("dcd45cf4", new Object[]{this, bool});
            }
            this.q = bool;
            return this;
        }

        public a q(Boolean bool) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("df833b7e", new Object[]{this, bool});
            }
            this.o = bool;
            return this;
        }

        public a r(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("825ca79d", new Object[]{this, str});
            }
            this.l = str;
            return this;
        }

        public a s(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("677674cd", new Object[]{this, str});
            }
            this.p = str;
            return this;
        }

        public a t(Boolean bool) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("bd8daa79", new Object[]{this, bool});
            }
            this.h = bool;
            return this;
        }

        public a u(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("8113ce83", new Object[]{this, str});
            }
            this.g = str;
            return this;
        }

        public a v(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("20167992", new Object[]{this, str});
            }
            this.k = str;
            return this;
        }

        public a w(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("fb7fb83c", new Object[]{this, str});
            }
            this.A = str;
            return this;
        }

        public a x(Boolean bool) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("51c3379f", new Object[]{this, bool});
            }
            this.z = bool;
            return this;
        }

        public a y(Boolean bool) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("366c01af", new Object[]{this, bool});
            }
            this.F = bool;
            return this;
        }

        public a z(Boolean bool) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("baaa8bfe", new Object[]{this, bool});
            }
            this.x = bool;
            return this;
        }
    }

    static {
        t2o.a(469762053);
    }

    public static /* synthetic */ anl access$002(FluidInstanceConfig fluidInstanceConfig, anl anlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (anl) ipChange.ipc$dispatch("4a27ef77", new Object[]{fluidInstanceConfig, anlVar});
        }
        fluidInstanceConfig.hostPageIntegererface = anlVar;
        return anlVar;
    }

    public static /* synthetic */ Boolean access$1002(FluidInstanceConfig fluidInstanceConfig, Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("e6e1d59a", new Object[]{fluidInstanceConfig, bool});
        }
        fluidInstanceConfig.needTransferAnimation = bool;
        return bool;
    }

    public static /* synthetic */ Component access$102(FluidInstanceConfig fluidInstanceConfig, Component component) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Component) ipChange.ipc$dispatch("6a653b28", new Object[]{fluidInstanceConfig, component});
        }
        fluidInstanceConfig.hostTNodeComponent = component;
        return component;
    }

    public static /* synthetic */ Boolean access$1102(FluidInstanceConfig fluidInstanceConfig, Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("f2815db", new Object[]{fluidInstanceConfig, bool});
        }
        fluidInstanceConfig.tab3FromLauncher = bool;
        return bool;
    }

    public static /* synthetic */ Boolean access$1202(FluidInstanceConfig fluidInstanceConfig, Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("376e561c", new Object[]{fluidInstanceConfig, bool});
        }
        fluidInstanceConfig.onCreateToRequest = bool;
        return bool;
    }

    public static /* synthetic */ Boolean access$1302(FluidInstanceConfig fluidInstanceConfig, Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("5fb4965d", new Object[]{fluidInstanceConfig, bool});
        }
        fluidInstanceConfig.dynamicProfileMode = bool;
        return bool;
    }

    public static /* synthetic */ Boolean access$1402(FluidInstanceConfig fluidInstanceConfig, Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("87fad69e", new Object[]{fluidInstanceConfig, bool});
        }
        fluidInstanceConfig.hideTopLayout = bool;
        return bool;
    }

    public static /* synthetic */ Boolean access$1502(FluidInstanceConfig fluidInstanceConfig, Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("b04116df", new Object[]{fluidInstanceConfig, bool});
        }
        fluidInstanceConfig.tab3Fullscreen = bool;
        return bool;
    }

    public static /* synthetic */ Uri access$1602(FluidInstanceConfig fluidInstanceConfig, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("3291fb14", new Object[]{fluidInstanceConfig, uri});
        }
        fluidInstanceConfig.fluidUrl = uri;
        return uri;
    }

    public static /* synthetic */ String access$1702(FluidInstanceConfig fluidInstanceConfig, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f5371ad", new Object[]{fluidInstanceConfig, str});
        }
        fluidInstanceConfig.tab2PageUrl = str;
        return str;
    }

    public static /* synthetic */ String access$1802(FluidInstanceConfig fluidInstanceConfig, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("84fece2e", new Object[]{fluidInstanceConfig, str});
        }
        fluidInstanceConfig.fluidOriginUrl = str;
        return str;
    }

    public static /* synthetic */ Integer access$1902(FluidInstanceConfig fluidInstanceConfig, Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("fef5ba37", new Object[]{fluidInstanceConfig, num});
        }
        fluidInstanceConfig.topBarHeight = num;
        return num;
    }

    public static /* synthetic */ rv4 access$2002(FluidInstanceConfig fluidInstanceConfig, rv4 rv4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rv4) ipChange.ipc$dispatch("9e3966c5", new Object[]{fluidInstanceConfig, rv4Var});
        }
        fluidInstanceConfig.coverObject = rv4Var;
        return rv4Var;
    }

    public static /* synthetic */ Integer access$202(FluidInstanceConfig fluidInstanceConfig, Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("fe26e041", new Object[]{fluidInstanceConfig, num});
        }
        fluidInstanceConfig.transferAnimationWidth = num;
        return num;
    }

    public static /* synthetic */ String access$2102(FluidInstanceConfig fluidInstanceConfig, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d0f7a46", new Object[]{fluidInstanceConfig, str});
        }
        fluidInstanceConfig.playScenes = str;
        return str;
    }

    public static /* synthetic */ String access$2202(FluidInstanceConfig fluidInstanceConfig, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f2bad6c7", new Object[]{fluidInstanceConfig, str});
        }
        fluidInstanceConfig.ggType = str;
        return str;
    }

    public static /* synthetic */ yod access$2302(FluidInstanceConfig fluidInstanceConfig, yod yodVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yod) ipChange.ipc$dispatch("cf749308", new Object[]{fluidInstanceConfig, yodVar});
        }
        fluidInstanceConfig.fluidServiceRegistry = yodVar;
        return yodVar;
    }

    public static /* synthetic */ String access$2402(FluidInstanceConfig fluidInstanceConfig, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("be118fc9", new Object[]{fluidInstanceConfig, str});
        }
        fluidInstanceConfig.bizGroupName = str;
        return str;
    }

    public static /* synthetic */ Context access$2502(FluidInstanceConfig fluidInstanceConfig, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("d1993bf4", new Object[]{fluidInstanceConfig, context});
        }
        fluidInstanceConfig.context = context;
        return context;
    }

    public static /* synthetic */ Integer access$2602(FluidInstanceConfig fluidInstanceConfig, Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("66a4c153", new Object[]{fluidInstanceConfig, num});
        }
        fluidInstanceConfig.muteTipCount = num;
        return num;
    }

    public static /* synthetic */ String access$2702(FluidInstanceConfig fluidInstanceConfig, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6f13a54c", new Object[]{fluidInstanceConfig, str});
        }
        fluidInstanceConfig.tabId = str;
        return str;
    }

    public static /* synthetic */ String access$2802(FluidInstanceConfig fluidInstanceConfig, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("54bf01cd", new Object[]{fluidInstanceConfig, str});
        }
        fluidInstanceConfig.bizType = str;
        return str;
    }

    public static /* synthetic */ String access$2902(FluidInstanceConfig fluidInstanceConfig, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3a6a5e4e", new Object[]{fluidInstanceConfig, str});
        }
        fluidInstanceConfig.bizName = str;
        return str;
    }

    public static /* synthetic */ Boolean access$3002(FluidInstanceConfig fluidInstanceConfig, Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("a7e56558", new Object[]{fluidInstanceConfig, bool});
        }
        fluidInstanceConfig.preloadInstance = bool;
        return bool;
    }

    public static /* synthetic */ String access$302(FluidInstanceConfig fluidInstanceConfig, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("90cca7ba", new Object[]{fluidInstanceConfig, str});
        }
        fluidInstanceConfig.tab3ComponentSource = str;
        return str;
    }

    public static /* synthetic */ Boolean access$3102(FluidInstanceConfig fluidInstanceConfig, Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("d02ba599", new Object[]{fluidInstanceConfig, bool});
        }
        fluidInstanceConfig.tabInstance = bool;
        return bool;
    }

    public static /* synthetic */ String access$3202(FluidInstanceConfig fluidInstanceConfig, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c27b0a66", new Object[]{fluidInstanceConfig, str});
        }
        fluidInstanceConfig.spm = str;
        return str;
    }

    public static /* synthetic */ String access$3302(FluidInstanceConfig fluidInstanceConfig, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a82666e7", new Object[]{fluidInstanceConfig, str});
        }
        fluidInstanceConfig.preCoverKey = str;
        return str;
    }

    public static /* synthetic */ Boolean access$3402(FluidInstanceConfig fluidInstanceConfig, Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("48fe665c", new Object[]{fluidInstanceConfig, bool});
        }
        fluidInstanceConfig.tab3DisableCache = bool;
        return bool;
    }

    public static /* synthetic */ Integer access$3502(FluidInstanceConfig fluidInstanceConfig, Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("1ee048f1", new Object[]{fluidInstanceConfig, num});
        }
        fluidInstanceConfig.transferAnimationHeight = num;
        return num;
    }

    public static /* synthetic */ i0v access$402(FluidInstanceConfig fluidInstanceConfig, i0v i0vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i0v) ipChange.ipc$dispatch("c2c5bb9b", new Object[]{fluidInstanceConfig, i0vVar});
        }
        fluidInstanceConfig.utCallback = i0vVar;
        return i0vVar;
    }

    public static /* synthetic */ Integer access$502(FluidInstanceConfig fluidInstanceConfig, Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("76f9a104", new Object[]{fluidInstanceConfig, num});
        }
        fluidInstanceConfig.topBarY = num;
        return num;
    }

    public static /* synthetic */ Boolean access$602(FluidInstanceConfig fluidInstanceConfig, Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("f1a43ef1", new Object[]{fluidInstanceConfig, bool});
        }
        fluidInstanceConfig.fullscreenDisplay = bool;
        return bool;
    }

    public static /* synthetic */ Boolean access$702(FluidInstanceConfig fluidInstanceConfig, Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("19ea7f32", new Object[]{fluidInstanceConfig, bool});
        }
        fluidInstanceConfig.fragmentMode = bool;
        return bool;
    }

    public static /* synthetic */ Boolean access$802(FluidInstanceConfig fluidInstanceConfig, Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("4230bf73", new Object[]{fluidInstanceConfig, bool});
        }
        fluidInstanceConfig.tab3FromIconStream = bool;
        return bool;
    }

    public static /* synthetic */ Integer access$902(FluidInstanceConfig fluidInstanceConfig, Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("1812a208", new Object[]{fluidInstanceConfig, num});
        }
        fluidInstanceConfig.actionbarHeight = num;
        return num;
    }

    public static String appendBizName(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3f8d37eb", new Object[]{str}) : appendBizName(str, null);
    }

    private boolean getBooleanValue(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b5973eb", new Object[]{this, bool})).booleanValue();
        }
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    private int getIntValue(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("191f7f4b", new Object[]{this, num})).intValue();
        }
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public static String getPreloadBizName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6b5236e4", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int indexOf = str.indexOf("@");
        if (indexOf == -1) {
            return str;
        }
        return str.substring(0, indexOf);
    }

    private String getSpm() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d8ae70bf", new Object[]{this});
        }
        return this.spm;
    }

    public void append(FluidInstanceConfig fluidInstanceConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c6ebc57", new Object[]{this, fluidInstanceConfig});
        } else if (fluidInstanceConfig != null) {
            anl anlVar = fluidInstanceConfig.hostPageIntegererface;
            if (anlVar != null) {
                this.hostPageIntegererface = anlVar;
            }
            Component component = fluidInstanceConfig.hostTNodeComponent;
            if (component != null) {
                this.hostTNodeComponent = component;
            }
            Integer num = fluidInstanceConfig.transferAnimationWidth;
            if (num != null) {
                this.transferAnimationWidth = num;
            }
            String str = fluidInstanceConfig.tab3ComponentSource;
            if (str != null) {
                this.tab3ComponentSource = str;
            }
            i0v i0vVar = fluidInstanceConfig.utCallback;
            if (i0vVar != null) {
                this.utCallback = i0vVar;
            }
            Integer num2 = fluidInstanceConfig.topBarY;
            if (num2 != null) {
                this.topBarY = num2;
            }
            Boolean bool = fluidInstanceConfig.fullscreenDisplay;
            if (bool != null) {
                this.fullscreenDisplay = bool;
            }
            Boolean bool2 = fluidInstanceConfig.fragmentMode;
            if (bool2 != null) {
                this.fragmentMode = bool2;
            }
            Boolean bool3 = fluidInstanceConfig.tab3FromIconStream;
            if (bool3 != null) {
                this.tab3FromIconStream = bool3;
            }
            Integer num3 = fluidInstanceConfig.actionbarHeight;
            if (num3 != null) {
                this.actionbarHeight = num3;
            }
            Boolean bool4 = fluidInstanceConfig.needTransferAnimation;
            if (bool4 != null) {
                this.needTransferAnimation = bool4;
            }
            Boolean bool5 = fluidInstanceConfig.tab3FromLauncher;
            if (bool5 != null) {
                this.tab3FromLauncher = bool5;
            }
            Boolean bool6 = fluidInstanceConfig.onCreateToRequest;
            if (bool6 != null) {
                this.onCreateToRequest = bool6;
            }
            Boolean bool7 = fluidInstanceConfig.dynamicProfileMode;
            if (bool7 != null) {
                this.dynamicProfileMode = bool7;
            }
            Boolean bool8 = fluidInstanceConfig.hideTopLayout;
            if (bool8 != null) {
                this.hideTopLayout = bool8;
            }
            Boolean bool9 = fluidInstanceConfig.tab3Fullscreen;
            if (bool9 != null) {
                this.tab3Fullscreen = bool9;
            }
            Uri uri = fluidInstanceConfig.fluidUrl;
            if (uri != null) {
                this.fluidUrl = uri;
            }
            String str2 = fluidInstanceConfig.fluidOriginUrl;
            if (str2 != null) {
                this.fluidOriginUrl = str2;
            }
            Integer num4 = fluidInstanceConfig.topBarHeight;
            if (num4 != null) {
                this.topBarHeight = num4;
            }
            rv4 rv4Var = fluidInstanceConfig.coverObject;
            if (rv4Var != null) {
                this.coverObject = rv4Var;
            }
            String str3 = fluidInstanceConfig.playScenes;
            if (str3 != null) {
                this.playScenes = str3;
            }
            String str4 = fluidInstanceConfig.ggType;
            if (str4 != null) {
                this.ggType = str4;
            }
            yod yodVar = fluidInstanceConfig.fluidServiceRegistry;
            if (yodVar != null) {
                this.fluidServiceRegistry = yodVar;
            }
            String str5 = fluidInstanceConfig.bizGroupName;
            if (str5 != null) {
                this.bizGroupName = str5;
            }
            Context context = fluidInstanceConfig.context;
            if (context != null) {
                this.context = context;
            }
            Integer num5 = fluidInstanceConfig.muteTipCount;
            if (num5 != null) {
                this.muteTipCount = num5;
            }
            String str6 = fluidInstanceConfig.tabId;
            if (str6 != null) {
                this.tabId = str6;
            }
            String str7 = fluidInstanceConfig.bizType;
            if (str7 != null) {
                this.bizType = str7;
            }
            String str8 = fluidInstanceConfig.bizName;
            if (str8 != null) {
                this.bizName = str8;
            }
            Boolean bool10 = fluidInstanceConfig.preloadInstance;
            if (bool10 != null) {
                this.preloadInstance = bool10;
            }
            Boolean bool11 = fluidInstanceConfig.tabInstance;
            if (bool11 != null) {
                this.tabInstance = bool11;
            }
            String str9 = fluidInstanceConfig.preCoverKey;
            if (str9 != null) {
                this.preCoverKey = str9;
            }
            Boolean bool12 = fluidInstanceConfig.tab3DisableCache;
            if (bool12 != null) {
                this.tab3DisableCache = bool12;
            }
            Integer num6 = fluidInstanceConfig.transferAnimationHeight;
            if (num6 != null) {
                this.transferAnimationHeight = num6;
            }
        }
    }

    public String getBizGroupName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("756588cc", new Object[]{this});
        }
        return this.bizGroupName;
    }

    public String getBizName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("42bddf1", new Object[]{this});
        }
        return this.bizName;
    }

    public String getBizType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9c07dca2", new Object[]{this});
        }
        return this.bizType;
    }

    public Context getContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        return this.context;
    }

    public rv4 getCoverObject() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rv4) ipChange.ipc$dispatch("bbf33991", new Object[]{this});
        }
        return this.coverObject;
    }

    public String getFluidOriginUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3680c764", new Object[]{this});
        }
        return this.fluidOriginUrl;
    }

    public yod getFluidServiceRegistry() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yod) ipChange.ipc$dispatch("f2d9dc5f", new Object[]{this});
        }
        return this.fluidServiceRegistry;
    }

    public Uri getFluidUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("d50538f9", new Object[]{this});
        }
        return this.fluidUrl;
    }

    public String getGgType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("10f849c9", new Object[]{this});
        }
        return this.ggType;
    }

    public anl getHostPageInterface() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (anl) ipChange.ipc$dispatch("a09837ff", new Object[]{this});
        }
        return this.hostPageIntegererface;
    }

    public Component getHostTNodeComponent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Component) ipChange.ipc$dispatch("cf2b1ec7", new Object[]{this});
        }
        return this.hostTNodeComponent;
    }

    public int getMuteTipCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("769743dd", new Object[]{this})).intValue();
        }
        return getIntValue(this.muteTipCount);
    }

    public String getPlayScenes() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6667e5e8", new Object[]{this});
        }
        return this.playScenes;
    }

    public String getPreCoverKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4c0b1464", new Object[]{this});
        }
        return this.preCoverKey;
    }

    public String getTab2PageUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8114f3ec", new Object[]{this});
        }
        return this.tab2PageUrl;
    }

    public String getTab3ComponentSource() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9225d055", new Object[]{this});
        }
        return this.tab3ComponentSource;
    }

    public String getTabId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("303a5d5f", new Object[]{this});
        }
        return this.tabId;
    }

    public int getTopBarHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2aa02eb5", new Object[]{this})).intValue();
        }
        return getIntValue(this.topBarHeight);
    }

    public int getTopBarY() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b60e0f5f", new Object[]{this})).intValue();
        }
        return getIntValue(this.topBarY);
    }

    public int getTransferAnimationHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e50379a4", new Object[]{this})).intValue();
        }
        return getIntValue(this.transferAnimationHeight);
    }

    public int getTransferAnimationWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("161935d", new Object[]{this})).intValue();
        }
        return getIntValue(this.transferAnimationWidth);
    }

    public i0v getUtCallback() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i0v) ipChange.ipc$dispatch("de9860e8", new Object[]{this});
        }
        return this.utCallback;
    }

    public boolean isDynamicProfileMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7c957902", new Object[]{this})).booleanValue();
        }
        return getBooleanValue(this.dynamicProfileMode);
    }

    public boolean isFollowTab() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("58d5cba5", new Object[]{this})).booleanValue();
        }
        return "newFollow".equalsIgnoreCase(getTabId());
    }

    public boolean isFragmentMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("23c3e868", new Object[]{this})).booleanValue();
        }
        return getBooleanValue(this.fragmentMode);
    }

    public boolean isFullscreenDisplay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a61b8688", new Object[]{this})).booleanValue();
        }
        return getBooleanValue(this.fullscreenDisplay);
    }

    public boolean isHideTopLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b6aebbe", new Object[]{this})).booleanValue();
        }
        return getBooleanValue(this.hideTopLayout);
    }

    public boolean isNeedTransferAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("55e3e2e4", new Object[]{this})).booleanValue();
        }
        return getBooleanValue(this.needTransferAnimation);
    }

    public boolean isOnCreateToRequest() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3d6471a", new Object[]{this})).booleanValue();
        }
        return getBooleanValue(this.onCreateToRequest);
    }

    public boolean isPreloadInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("974f89bf", new Object[]{this})).booleanValue();
        }
        return getBooleanValue(this.preloadInstance);
    }

    public boolean isTab3DisableCache() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2bc4a8ad", new Object[]{this})).booleanValue();
        }
        return getBooleanValue(this.tab3DisableCache);
    }

    public boolean isTab3FromIconStream() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2099d556", new Object[]{this})).booleanValue();
        }
        return getBooleanValue(this.tab3FromIconStream);
    }

    public boolean isTab3FromLauncher() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("af24449d", new Object[]{this})).booleanValue();
        }
        return getBooleanValue(this.tab3FromLauncher);
    }

    public boolean isTab3Fullscreen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("70b4b86e", new Object[]{this})).booleanValue();
        }
        return getBooleanValue(this.tab3Fullscreen);
    }

    public boolean isTabInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a724944b", new Object[]{this})).booleanValue();
        }
        return getBooleanValue(this.tabInstance);
    }

    public boolean isVideoTab() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6d2cf6ef", new Object[]{this})).booleanValue();
        }
        return "video".equalsIgnoreCase(getTabId());
    }

    public void setFluidServiceRegistry(yod yodVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecf2373f", new Object[]{this, yodVar});
        } else {
            this.fluidServiceRegistry = yodVar;
        }
    }

    public void setOnCreateToRequest(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32d143b6", new Object[]{this, new Boolean(z)});
        } else {
            this.onCreateToRequest = Boolean.valueOf(z);
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "FluidInstanceConfig{, bizName='" + this.bizName + "', bizGroupName='" + this.bizGroupName + "', bizType='" + this.bizType + "', playScenes='" + this.playScenes + "', tabId='" + this.tabId + "', tab3FromLauncher=" + this.tab3FromLauncher + ", tab3FromIconStream=" + this.tab3FromIconStream + ", tab3Fullscreen=" + this.tab3Fullscreen + ", ggType='" + this.ggType + "', tab3DisableCache=" + this.tab3DisableCache + ", tab3ComponentSource='" + this.tab3ComponentSource + "', fluidOriginUrl='" + this.fluidOriginUrl + "', fluidUrl=" + this.fluidUrl + ", tab2PageUrl='" + this.tab2PageUrl + "', context=" + this.context + ", spm='" + this.spm + "', onCreateToRequest=" + this.onCreateToRequest + ", fragmentMode=" + this.fragmentMode + ", dynamicProfileMode=" + this.dynamicProfileMode + ", fullscreenDisplay=" + this.fullscreenDisplay + ", hideTopLayout=" + this.hideTopLayout + ", muteTipCount=" + this.muteTipCount + ", actionbarHeight=" + this.actionbarHeight + ", topBarHeight=" + this.topBarHeight + ", topBarY=" + this.topBarY + '}';
    }

    public static String appendBizName(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("817b7ea1", new Object[]{str, str2}) : appendBizName(str, str2, null);
    }

    public static String appendBizName(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("31c5c3d7", new Object[]{str, str2, str3});
        }
        if (TextUtils.isEmpty(str2)) {
            return str;
        }
        if (TextUtils.isEmpty(str3)) {
            return str + "_" + str2;
        }
        return str + "_" + str2 + "@" + str3;
    }
}
