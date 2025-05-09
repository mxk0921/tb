package tb;

import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class ow {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f25704a;
    public final jsj b;
    public final ksj c;
    public Looper d;
    public dsj e;
    public final Map<String, String> f;
    public final String g;

    static {
        t2o.a(1018167343);
    }

    public ow(String str, jsj jsjVar) {
        this.f = new HashMap();
        this.g = "NONE";
        this.f25704a = str;
        this.b = jsjVar == null ? jsj.DEFAULT_NO_RETRY : jsjVar;
        this.c = new ksj();
        UUID.randomUUID().toString().replace("-", "").toLowerCase();
    }

    public Map<String, String> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("46c4490f", new Object[]{this});
        }
        return this.f;
    }

    public dsj b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dsj) ipChange.ipc$dispatch("b00a8ece", new Object[]{this});
        }
        return this.e;
    }

    public Handler c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("ee203cf0", new Object[]{this});
        }
        Looper looper = this.d;
        if (looper == null || !looper.getThread().isAlive()) {
            return null;
        }
        return new Handler(this.d);
    }

    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("df3302d9", new Object[]{this});
        }
        return this.g;
    }

    public jsj e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jsj) ipChange.ipc$dispatch("22c98b14", new Object[]{this});
        }
        return this.b;
    }

    public ksj f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ksj) ipChange.ipc$dispatch("94c55074", new Object[]{this});
        }
        return this.c;
    }

    public String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4afdd683", new Object[]{this});
        }
        return this.f25704a;
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("180774bb", new Object[]{this})).booleanValue();
        }
        if (this.d != null) {
            return true;
        }
        return false;
    }

    public abstract boolean i(String str);

    public abstract boolean j(String str);

    public void k(dsj dsjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df2bd50e", new Object[]{this, dsjVar});
        } else {
            this.e = dsjVar;
        }
    }

    public void l(Looper looper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("369871c6", new Object[]{this, looper});
        } else {
            this.d = looper;
        }
    }

    public ow(String str, jsj jsjVar, Map<String, String> map, String str2) {
        this(str, jsjVar);
        this.f = map;
        this.g = str2;
    }
}
