package tb;

import android.os.Handler;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.tu7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class cvg implements set {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final zu7 f17349a;
    public final tu7 b;
    public long c;
    public long d;
    public final int e;
    public final HashMap<String, Long> f = new HashMap<>();
    public final hw2 g;
    public final Handler h;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ zzp f17350a;

        public a(zzp zzpVar) {
            this.f17350a = zzpVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                cvg.c(cvg.this).b(this.f17350a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ zzp f17351a;

        public b(zzp zzpVar) {
            this.f17351a = zzpVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                cvg.c(cvg.this).b(this.f17351a);
            }
        }
    }

    public cvg(zu7 zu7Var, tu7 tu7Var, Handler handler) {
        this.f17349a = zu7Var;
        this.b = tu7Var;
        this.g = new hw2(zu7Var.b.f29547a, zu7Var, tu7Var);
        this.h = handler;
        this.e = zu7Var.f33016a.size();
    }

    public static /* synthetic */ hw2 c(cvg cvgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hw2) ipChange.ipc$dispatch("380f08f4", new Object[]{cvgVar});
        }
        return cvgVar.g;
    }

    @Override // tb.qkc
    public synchronized void a(zzp zzpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fa86c4e", new Object[]{this, zzpVar});
            return;
        }
        this.d += zzpVar.e.b;
        if (this.b != null) {
            Handler handler = this.h;
            if (handler != null) {
                handler.post(new a(zzpVar));
            } else {
                srt.a(new b(zzpVar), true);
            }
        }
    }

    @Override // tb.qkc
    public synchronized void b(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40d708fb", new Object[]{this, new Long(j), str});
            return;
        }
        d();
        if (0 != this.c) {
            long e = e(j, str);
            tu7 tu7Var = this.b;
            if (tu7Var != null) {
                int i = (int) ((e * 100) / this.c);
                if (i > 100) {
                    i = 100;
                }
                tu7Var.onDownloadProgress(i);
            }
        }
    }

    public final long d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c2a1571a", new Object[]{this})).longValue();
        }
        long j = this.c;
        if (0 != j) {
            return j;
        }
        long j2 = 0;
        for (onf onfVar : this.f17349a.f33016a) {
            long j3 = onfVar.b;
            if (j3 <= 0) {
                return 0L;
            }
            j2 += j3;
            this.f.put(onfVar.f25507a, 0L);
        }
        this.c = j2;
        return j2;
    }

    public final long e(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1e59b10b", new Object[]{this, new Long(j), str})).longValue();
        }
        if (this.e == 1) {
            return j + this.d;
        }
        HashMap<String, Long> hashMap = this.f;
        long j2 = 0;
        if (hashMap != null && hashMap.size() > 0) {
            for (Map.Entry<String, Long> entry : this.f.entrySet()) {
                if (TextUtils.equals(str, entry.getKey())) {
                    entry.setValue(Long.valueOf(j));
                }
                j2 += entry.getValue().longValue();
            }
        }
        return j2;
    }

    public void f(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98fdb789", new Object[]{this, str, new Boolean(z)});
        } else {
            this.b.onDownloadStateChange(str, z);
        }
    }

    public void g(int i, upl uplVar, tu7.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcf51783", new Object[]{this, new Integer(i), uplVar, aVar});
        } else {
            this.b.onNetworkLimit(i, uplVar, aVar);
        }
    }
}
