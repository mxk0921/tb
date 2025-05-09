package com.taobao.tao.flexbox.layoutmanager.adapter.interfaces;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.core.n;
import com.taobao.tao.flexbox.layoutmanager.core.o;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import tb.akt;
import tb.bqe;
import tb.gpe;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public abstract class ImageLoader {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ERROR_CODE_MEM_MISS = -100;
    public static final int LOAD_FAIL = 1;
    public static final int LOAD_SUCCESS = 0;
    public static final int LOAD_UNKNOWN = -1;
    public static final String TAG = "image";

    /* renamed from: a  reason: collision with root package name */
    public int f12002a = -1;
    public boolean b = false;

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public @interface Priority {
        public static final int HIGH = 3;
        public static final int LOW = 1;
        public static final int MEDIUM = 2;
    }

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public @interface Scene {
        public static final String BACKGROUND = "background";
        public static final String FIRST_FRAME = "firstframe";
        public static final String NORMAL = "normal";
        public static final String PRE_LOADE = "preload";
        public static final String RED_POINT = "redpoint";
        public static final String THEME = "theme";
        public static final String VIDEO_COVER = "videocover";
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final int f12003a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final int f;
        public final boolean g;
        public final boolean h;
        public final String i;
        public final String j;
        public final int k;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public static class a {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public boolean h;
            public String j;

            /* renamed from: a  reason: collision with root package name */
            public int f12004a = 0;
            public String b = "";
            public String c = "";
            public String d = "";
            public String e = "guangguang";
            public int f = 87;
            public boolean g = true;
            public int i = 2;
            public String k = "normal";

            static {
                t2o.a(503316614);
            }

            public static /* synthetic */ int a(a aVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Number) ipChange.ipc$dispatch("668461c0", new Object[]{aVar})).intValue();
                }
                return aVar.f12004a;
            }

            public static /* synthetic */ String b(a aVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (String) ipChange.ipc$dispatch("d9485252", new Object[]{aVar});
                }
                return aVar.b;
            }

            public static /* synthetic */ int c(a aVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Number) ipChange.ipc$dispatch("e3673bef", new Object[]{aVar})).intValue();
                }
                return aVar.i;
            }

            public static /* synthetic */ String d(a aVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (String) ipChange.ipc$dispatch("c7dade31", new Object[]{aVar});
                }
                return aVar.c;
            }

            public static /* synthetic */ String e(a aVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (String) ipChange.ipc$dispatch("b66d6a10", new Object[]{aVar});
                }
                return aVar.d;
            }

            public static /* synthetic */ String f(a aVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (String) ipChange.ipc$dispatch("a4fff5ef", new Object[]{aVar});
                }
                return aVar.e;
            }

            public static /* synthetic */ int g(a aVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Number) ipChange.ipc$dispatch("710a7905", new Object[]{aVar})).intValue();
                }
                return aVar.f;
            }

            public static /* synthetic */ boolean h(a aVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("3ff21757", new Object[]{aVar})).booleanValue();
                }
                return aVar.g;
            }

            public static /* synthetic */ boolean i(a aVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("ed9b598", new Object[]{aVar})).booleanValue();
                }
                return aVar.h;
            }

            public static /* synthetic */ String j(a aVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (String) ipChange.ipc$dispatch("5f4a256b", new Object[]{aVar});
                }
                return aVar.j;
            }

            public static /* synthetic */ String k(a aVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (String) ipChange.ipc$dispatch("4ddcb14a", new Object[]{aVar});
                }
                return aVar.k;
            }

            public b l() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (b) ipChange.ipc$dispatch("1ddcac7d", new Object[]{this});
                }
                return new b(this);
            }

            public a m(boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (a) ipChange.ipc$dispatch("21e0ae5f", new Object[]{this, new Boolean(z)});
                }
                this.g = z;
                return this;
            }

            public a n(int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (a) ipChange.ipc$dispatch("b08ddc5c", new Object[]{this, new Integer(i)});
                }
                this.f = i;
                return this;
            }

            public a o(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (a) ipChange.ipc$dispatch("8f4db93f", new Object[]{this, str});
                }
                this.e = str;
                return this;
            }

            public a p(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (a) ipChange.ipc$dispatch("b63a9c55", new Object[]{this, str});
                }
                this.b = str;
                return this;
            }

            public a q(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (a) ipChange.ipc$dispatch("461e4bc1", new Object[]{this, str});
                }
                this.c = str;
                return this;
            }

            public a r(int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (a) ipChange.ipc$dispatch("18e78db5", new Object[]{this, new Integer(i)});
                }
                this.f12004a = i;
                return this;
            }

            public a s(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (a) ipChange.ipc$dispatch("8b95147f", new Object[]{this, str});
                }
                this.j = str;
                return this;
            }

            public a t(int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (a) ipChange.ipc$dispatch("e93ef736", new Object[]{this, new Integer(i)});
                }
                this.i = i;
                return this;
            }

            public a u(boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (a) ipChange.ipc$dispatch("f30b3e87", new Object[]{this, new Boolean(z)});
                }
                this.h = z;
                return this;
            }

            public a v(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (a) ipChange.ipc$dispatch("94587631", new Object[]{this, str});
                }
                this.k = str;
                return this;
            }

            public a w(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (a) ipChange.ipc$dispatch("6c18f5ff", new Object[]{this, str});
                }
                this.d = str;
                return this;
            }
        }

        static {
            t2o.a(503316613);
        }

        public static b a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("fb0715e7", new Object[0]);
            }
            return new a().l();
        }

        public static b b(int i, String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("66a733a5", new Object[]{new Integer(i), str, str2, str3});
            }
            return new a().r(i).p(str).q(str2).v(str3).l();
        }

        public static b c(int i, String str, String str2, String str3, String str4, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("ce32c344", new Object[]{new Integer(i), str, str2, str3, str4, new Integer(i2)});
            }
            return new a().r(i).p(str).q(str2).w(str3).o(str4).n(i2).l();
        }

        public static b d(int i, String str, String str2, String str3, String str4, int i2, String str5) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("54593d0e", new Object[]{new Integer(i), str, str2, str3, str4, new Integer(i2), str5});
            }
            return new a().r(i).p(str).q(str2).w(str3).o(str4).n(i2).v(str5).l();
        }

        public static b e(String str, n nVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("7c252e4c", new Object[]{str, nVar});
            }
            return f(str, nVar, 2);
        }

        public static b f(String str, n nVar, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("82bd2fc7", new Object[]{str, nVar, new Integer(i)});
            }
            return new a().s(gpe.d(nVar)).v(str).t(i).l();
        }

        public static b g(bqe bqeVar, n nVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("c0f7b79c", new Object[]{bqeVar, nVar});
            }
            return new a().r(bqeVar.H0).p(bqeVar.I0).q(bqeVar.J0).w(bqeVar.F0).m(bqeVar.K0).u(bqeVar.L0).t(bqeVar.M0).s(gpe.d(nVar)).l();
        }

        public b(a aVar) {
            this.k = 2;
            this.f12003a = a.a(aVar);
            this.b = a.b(aVar);
            this.c = a.d(aVar);
            this.d = a.e(aVar);
            this.e = a.f(aVar);
            this.f = a.g(aVar);
            this.g = a.h(aVar);
            this.h = a.i(aVar);
            this.i = a.j(aVar);
            this.j = a.k(aVar);
            this.k = a.c(aVar);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final o f12005a;
        public final Context b;
        public final String c;
        public final String d;
        public final int e;
        public final int f;
        public final b g;
        public final boolean h;

        static {
            t2o.a(503316615);
        }

        public c(o oVar, Context context, String str, String str2, int i, int i2, b bVar, boolean z) {
            this.f12005a = oVar;
            this.b = context;
            this.c = str;
            this.d = str2;
            this.e = i;
            this.f = i2;
            this.g = bVar;
            this.h = z && (akt.X1("tnode_tracker_image_measure") || akt.P0());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface d extends e {
        void onImageLoadFailed(int i);

        void onImageLoaded(String str, BitmapDrawable bitmapDrawable);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface e {
        void onImageLoadFailed();

        void onImageLoaded(BitmapDrawable bitmapDrawable);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public abstract class f {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final int STATUS_CANCEL = 2;
        public static final int STATUS_INIT = 0;
        public static final int STATUS_RUNNING = 1;

        /* renamed from: a  reason: collision with root package name */
        public int f12006a = 0;
        public final ImageLoader b;

        static {
            t2o.a(503316620);
        }

        public f(ImageLoader imageLoader, ImageLoader imageLoader2) {
            this.b = imageLoader2;
        }

        public abstract void a();
    }

    static {
        t2o.a(503316611);
    }

    public int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8510d28f", new Object[]{this})).intValue();
        }
        return this.f12002a;
    }

    public String b(String str, int i, int i2, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8bf4bd55", new Object[]{this, str, new Integer(i), new Integer(i2), bVar});
        }
        return str;
    }

    public abstract f c(c cVar, e eVar);

    public abstract f d(c cVar, boolean z, e eVar);

    @Deprecated
    public abstract void e(Context context, String str, int i, int i2, e eVar);

    public abstract ImageLoader f();

    public abstract void g();

    public void h(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49229812", new Object[]{this, new Boolean(z)});
        } else {
            this.b = z;
        }
    }
}
