package tb;

import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.jsbridge.AliFestivalWVPlugin;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ck implements rbb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String AURA_LOGGER = "AURA_LOGGER";

    /* renamed from: a  reason: collision with root package name */
    public static final dk f17108a = new dk();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final ag f17109a = new ag();

        static {
            t2o.a(79691900);
            t2o.a(79691906);
        }

        public static b b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("927daae4", new Object[0]);
            }
            return new b();
        }

        public ag a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ag) ipChange.ipc$dispatch("ef86f370", new Object[]{this});
            }
            return this.f17109a;
        }

        public b c(String str, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("19c7a05a", new Object[]{this, str, new Integer(i)});
            }
            this.f17109a.b(str, String.valueOf(i));
            return this;
        }

        public b d(String str, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("ae060ff9", new Object[]{this, str, new Long(j)});
            }
            this.f17109a.b(str, String.valueOf(j));
            return this;
        }

        public b e(String str, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("33a3684d", new Object[]{this, str, jSONObject});
            }
            this.f17109a.b(str, jSONObject);
            return this;
        }

        public b f(String str, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("5474b0b5", new Object[]{this, str, obj});
            }
            if (!(obj instanceof View) || !th.c()) {
                this.f17109a.b(str, obj);
                return this;
            }
            throw new IllegalArgumentException("请不要传入View，以免发生死循环");
        }

        public b g(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("d222ea07", new Object[]{this, str, str2});
            }
            this.f17109a.b(str, str2);
            return this;
        }

        public b h(String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("f1ed09e9", new Object[]{this, str, new Boolean(z)});
            }
            this.f17109a.b(str, String.valueOf(z));
            return this;
        }

        public b i(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("2091e2d2", new Object[]{this, str});
            }
            this.f17109a.c(str);
            return this;
        }

        public b j(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("3e75103b", new Object[]{this, str});
            }
            this.f17109a.d(str);
            return this;
        }

        public b k(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("4a908d14", new Object[]{this, str});
            }
            this.f17109a.h(str);
            return this;
        }

        public b l(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("4873eebc", new Object[]{this, str});
            }
            this.f17109a.i(str);
            return this;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final ck f17110a = new ck();

        static {
            t2o.a(79691901);
        }

        public static /* synthetic */ ck a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ck) ipChange.ipc$dispatch("7432afa6", new Object[0]);
            }
            return f17110a;
        }
    }

    static {
        t2o.a(79691898);
        t2o.a(79691902);
    }

    public static rbb g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rbb) ipChange.ipc$dispatch("9434fa66", new Object[0]);
        }
        return c.a();
    }

    public static void j(sbb sbbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9852990", new Object[]{sbbVar});
        } else {
            f17108a.h(sbbVar);
        }
    }

    @Override // tb.rbb
    @Deprecated
    public void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23a68dc", new Object[]{this, str, str2, str3});
        } else {
            f17108a.e(str3, h(str, str2, str3));
        }
    }

    @Override // tb.rbb
    @Deprecated
    public void b(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d572034a", new Object[]{this, str, str2, str3});
        } else {
            f17108a.f(str3, h(str, str2, str3));
        }
    }

    @Override // tb.rbb
    @Deprecated
    public void c(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4bc3689", new Object[]{this, str, str2, str3});
        } else {
            f17108a.e(str3, h(str, str2, str3));
        }
    }

    @Override // tb.sbb
    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
        } else {
            f17108a.d(str);
        }
    }

    @Override // tb.sbb
    public void e(String str, ag agVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf9df276", new Object[]{this, str, agVar});
        } else if (th.c()) {
            f17108a.e(str, agVar);
        } else {
            f17108a.f(str, agVar);
        }
    }

    @Override // tb.sbb
    public void f(String str, ag agVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d89f4415", new Object[]{this, str, agVar});
        } else {
            f17108a.f(str, agVar);
        }
    }

    public final ag h(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ag) ipChange.ipc$dispatch("38bb95f3", new Object[]{this, str, str2, str3});
        }
        return b.b().i("AURA/other").g(AliFestivalWVPlugin.PARAMS_MODULE_NAME, str).g("functionName", str2).g("message", str3).a();
    }

    public final void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c06ee10", new Object[]{this});
        }
    }

    public ck() {
        i();
    }

    @Override // tb.sbb
    public void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c6cb136", new Object[]{this, str});
        } else {
            f17108a.e(str);
        }
    }

    @Override // tb.sbb
    public void e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb83980", new Object[]{this, str, str2});
        } else {
            f17108a.e(str, str2);
        }
    }
}
