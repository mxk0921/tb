package com.taobao.monitor.impl.trace;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.impl.trace.a;
import java.util.Map;
import tb.cll;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class d extends com.taobao.monitor.impl.trace.a<e> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements a.d<e> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ cll f11097a;
        public final /* synthetic */ Map b;
        public final /* synthetic */ long c;

        public a(d dVar, cll cllVar, Map map, long j) {
            this.f11097a = cllVar;
            this.b = map;
            this.c = j;
        }

        /* renamed from: b */
        public void a(e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("aa3a2c22", new Object[]{this, eVar});
            } else {
                eVar.v(this.f11097a, this.b, this.c);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements a.d<e> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ cll f11098a;
        public final /* synthetic */ long b;

        public b(d dVar, cll cllVar, long j) {
            this.f11098a = cllVar;
            this.b = j;
        }

        /* renamed from: b */
        public void a(e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("aa3a2c22", new Object[]{this, eVar});
            } else {
                eVar.x(this.f11098a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class c implements a.d<e> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ cll f11099a;
        public final /* synthetic */ long b;

        public c(d dVar, cll cllVar, long j) {
            this.f11099a = cllVar;
            this.b = j;
        }

        /* renamed from: b */
        public void a(e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("aa3a2c22", new Object[]{this, eVar});
            } else {
                eVar.p(this.f11099a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* renamed from: com.taobao.monitor.impl.trace.d$d  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class C0627d implements a.d<e> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ cll f11100a;
        public final /* synthetic */ long b;

        public C0627d(d dVar, cll cllVar, long j) {
            this.f11100a = cllVar;
            this.b = j;
        }

        /* renamed from: b */
        public void a(e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("aa3a2c22", new Object[]{this, eVar});
            } else {
                eVar.H(this.f11100a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface e {
        void H(cll cllVar, long j);

        void p(cll cllVar, long j);

        void v(cll cllVar, Map<String, Object> map, long j);

        void x(cll cllVar, long j);
    }

    public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/monitor/impl/trace/CustomPageLifecycleDispatcher");
    }

    public void e(cll cllVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f8786d6", new Object[]{this, cllVar, new Long(j)});
        } else {
            d(new b(this, cllVar, j));
        }
    }

    public void f(cll cllVar, Map<String, Object> map, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81656cc6", new Object[]{this, cllVar, map, new Long(j)});
        } else {
            d(new a(this, cllVar, map, j));
        }
    }

    public void g(cll cllVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa1aff1f", new Object[]{this, cllVar, new Long(j)});
        } else {
            d(new C0627d(this, cllVar, j));
        }
    }

    public void h(cll cllVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fdaffc8", new Object[]{this, cllVar, new Long(j)});
        } else {
            d(new c(this, cllVar, j));
        }
    }
}
