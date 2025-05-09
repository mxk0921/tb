package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.gld;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class rio implements gld {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentHashMap<String, String> f27408a = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, Long> b = new ConcurrentHashMap<>();

    static {
        t2o.a(839909843);
        t2o.a(839909839);
    }

    public rio(bbs bbsVar) {
        ckf.g(bbsVar, "instance");
    }

    @Override // tb.gld
    public void C(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22a916c0", new Object[]{this, str});
            return;
        }
        ckf.g(str, v4s.PARAM_UPLOAD_STAGE);
        if (!this.b.containsKey(str)) {
            this.b.put(str, Long.valueOf(System.currentTimeMillis()));
        }
    }

    @Override // tb.gld
    public void D(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("915e108a", new Object[]{this, str, str2});
            return;
        }
        ckf.g(str, v4s.PARAM_UPLOAD_STAGE);
        ckf.g(str2, "value");
        if (!this.f27408a.containsKey(str)) {
            this.f27408a.put(str, str2);
        }
    }

    @Override // tb.t4c
    public void N(bbs bbsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dc73485", new Object[]{this, bbsVar});
        } else {
            gld.a.a(this, bbsVar);
        }
    }

    @Override // tb.gld
    public String Q(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("de70807", new Object[]{this, str});
        }
        ckf.g(str, v4s.PARAM_UPLOAD_STAGE);
        String str2 = this.f27408a.get(str);
        return str2 == null ? "" : str2;
    }

    @Override // tb.gld
    public boolean R(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6a6979a4", new Object[]{this, str})).booleanValue();
        }
        ckf.g(str, v4s.PARAM_UPLOAD_STAGE);
        return this.b.containsKey(str);
    }

    @Override // tb.gld
    public void a(u1a<? super String, ? super Long, xhv> u1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11ff6f50", new Object[]{this, u1aVar});
            return;
        }
        ckf.g(u1aVar, "callback");
        for (Map.Entry<String, Long> entry : this.b.entrySet()) {
            u1aVar.invoke(entry.getKey(), entry.getValue());
        }
    }

    @Override // tb.t4c
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("896696a2", new Object[]{this});
        } else {
            gld.a.b(this);
        }
    }

    @Override // tb.gld
    public void d(u1a<? super String, Object, xhv> u1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a09ecf9b", new Object[]{this, u1aVar});
            return;
        }
        ckf.g(u1aVar, "callback");
        for (Map.Entry<String, String> entry : this.f27408a.entrySet()) {
            u1aVar.invoke(entry.getKey(), entry.getValue());
        }
    }

    @Override // tb.gld
    public void f(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("327a3804", new Object[]{this, str, new Long(j)});
            return;
        }
        ckf.g(str, v4s.PARAM_UPLOAD_STAGE);
        if (!this.b.containsKey(str)) {
            this.b.put(str, Long.valueOf(j));
        }
    }

    @Override // tb.gld
    public long g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5cd23ed2", new Object[]{this, str})).longValue();
        }
        ckf.g(str, v4s.PARAM_UPLOAD_STAGE);
        Long l = this.b.get(str);
        if (l == null) {
            return -1L;
        }
        return l.longValue();
    }

    @Override // tb.gld
    public boolean w(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a58133b", new Object[]{this, str})).booleanValue();
        }
        ckf.g(str, v4s.PARAM_UPLOAD_STAGE);
        return this.f27408a.containsKey(str);
    }
}
