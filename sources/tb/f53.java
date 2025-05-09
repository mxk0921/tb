package tb;

import android.os.Handler;
import android.os.Looper;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.util.ImageSearchMtopUtil;
import java.util.LinkedHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class f53 extends mz1<h53> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public volatile boolean c;
    public final Handler d = new Handler(Looper.getMainLooper());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* renamed from: tb.f53$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public static final class RunnableC0919a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ f53 f19013a;

            public RunnableC0919a(f53 f53Var) {
                this.f19013a = f53Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    ((h53) f53.C(this.f19013a)).W(null);
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public static final class b implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ f53 f19014a;

            public b(f53 f53Var) {
                this.f19014a = f53Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    ((h53) f53.C(this.f19014a)).W(null);
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public static final class c implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ f53 f19015a;

            public c(f53 f53Var) {
                this.f19015a = f53Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    ((h53) f53.C(this.f19015a)).W(null);
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public static final class d implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ f53 f19016a;

            public d(f53 f53Var) {
                this.f19016a = f53Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    ((h53) f53.C(this.f19016a)).W(null);
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public static final class e implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ f53 f19017a;
            public final /* synthetic */ o4j b;

            public e(f53 f53Var, o4j o4jVar) {
                this.f19017a = f53Var;
                this.b = o4jVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    ((h53) f53.C(this.f19017a)).W(this.b.f());
                }
            }
        }

        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("component", "plt_browsed_tab_api");
            linkedHashMap.put("sversion", caa.i());
            f53.D(f53.this, false);
            o4j t = ImageSearchMtopUtil.t("37747", lg4.F1(), lg4.G1(), null, linkedHashMap, false, 32, null);
            if (!t.g()) {
                f53.y(f53.this).post(new RunnableC0919a(f53.this));
            } else if (t.f() == null) {
                f53.y(f53.this).post(new b(f53.this));
            } else {
                JSONObject d2 = h19.d(t.f(), "data");
                if (d2 == null) {
                    f53.y(f53.this).post(new c(f53.this));
                    return;
                }
                JSONArray c2 = h19.c(d2, "browsedRecordResult");
                if (c2 == null || c2.isEmpty()) {
                    f53.y(f53.this).post(new d(f53.this));
                    return;
                }
                long h = h19.h(c2.getJSONObject(0), "timestamp", -1L);
                if (h > 0) {
                    uu6.INSTANCE.a(h * 1000);
                }
                f53.y(f53.this).post(new e(f53.this, t));
            }
        }
    }

    static {
        t2o.a(481296576);
    }

    public f53() {
        E();
    }

    public static final /* synthetic */ d32 C(f53 f53Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d32) ipChange.ipc$dispatch("88bcf405", new Object[]{f53Var});
        }
        return f53Var.f24401a;
    }

    public static final /* synthetic */ void D(f53 f53Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19f7bb43", new Object[]{f53Var, new Boolean(z)});
        } else {
            f53Var.c = z;
        }
    }

    public static /* synthetic */ Object ipc$super(f53 f53Var, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1512649357) {
            super.v();
            return null;
        } else if (hashCode == -1504501726) {
            super.q();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/etao/feimagesearch/capture/dynamic/bottom/browsed/CaptureBrowsedPresenter");
        }
    }

    public static final /* synthetic */ Handler y(f53 f53Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("9cd2500f", new Object[]{f53Var});
        }
        return f53Var.d;
    }

    public final void E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70f2ea5", new Object[]{this});
        } else if (!this.c) {
            this.c = true;
            z7m.c(new a());
        }
    }

    @Override // tb.mz1
    public void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.q();
        this.d.removeCallbacksAndMessages(null);
    }

    @Override // tb.mz1
    public void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.v();
        E();
    }
}
