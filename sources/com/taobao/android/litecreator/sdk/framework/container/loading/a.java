package com.taobao.android.litecreator.sdk.framework.container.loading;

import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a g = new b().i(false).k(0.5f).l(Localization.q(R.string.gg_pub_please_wait_1)).h();

    /* renamed from: a  reason: collision with root package name */
    public final String f8315a;
    public final float b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final int f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f8316a;
        public float b;
        public boolean c;
        public boolean d;
        public boolean e;
        public int f;

        static {
            t2o.a(511705501);
        }

        public static /* synthetic */ String a(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("c30bf9c4", new Object[]{bVar});
            }
            return bVar.f8316a;
        }

        public static /* synthetic */ float b(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("f1625acd", new Object[]{bVar})).floatValue();
            }
            return bVar.b;
        }

        public static /* synthetic */ boolean c(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d70db762", new Object[]{bVar})).booleanValue();
            }
            return bVar.c;
        }

        public static /* synthetic */ boolean d(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("bcb913e3", new Object[]{bVar})).booleanValue();
            }
            return bVar.d;
        }

        public static /* synthetic */ int e(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("a2647053", new Object[]{bVar})).intValue();
            }
            return bVar.f;
        }

        public static /* synthetic */ boolean f(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("880fcce5", new Object[]{bVar})).booleanValue();
            }
            return bVar.e;
        }

        public b g(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("d033100d", new Object[]{this, new Integer(i)});
            }
            this.f = i;
            return this;
        }

        public a h() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("76ed135d", new Object[]{this});
            }
            return new a(this);
        }

        public b i(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("cf14a302", new Object[]{this, new Boolean(z)});
            }
            this.c = z;
            return this;
        }

        public b j(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("897fb200", new Object[]{this, new Boolean(z)});
            }
            this.d = z;
            return this;
        }

        public b k(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("affe9ec2", new Object[]{this, new Float(f)});
            }
            this.b = f;
            return this;
        }

        public b l(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("a9e1eef2", new Object[]{this, str});
            }
            this.f8316a = str;
            return this;
        }

        public b m(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("d472cb0d", new Object[]{this, new Boolean(z)});
            }
            this.e = z;
            return this;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface c {
        void onDismiss();
    }

    static {
        t2o.a(511705499);
    }

    public int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("439b5f9e", new Object[]{this})).intValue();
        }
        return this.f;
    }

    public float b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("979cfbc1", new Object[]{this})).floatValue();
        }
        return this.b;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5267f97", new Object[]{this});
        }
        return this.f8315a;
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8a197929", new Object[]{this})).booleanValue();
        }
        return this.c;
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("226899d3", new Object[]{this})).booleanValue();
        }
        return this.d;
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("53c81e74", new Object[]{this})).booleanValue();
        }
        return this.e;
    }

    public a(b bVar) {
        this.f8315a = b.a(bVar);
        this.b = b.b(bVar);
        this.c = b.c(bVar);
        this.d = b.d(bVar);
        this.f = b.e(bVar);
        this.e = b.f(bVar);
    }
}
