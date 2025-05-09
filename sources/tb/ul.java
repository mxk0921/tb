package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.riverlogger.RVLLevel;
import java.util.HashMap;
import tb.ck;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ul implements sbb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static ul f29458a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ RVLLevel f29459a;
        public final /* synthetic */ String b;
        public final /* synthetic */ ag c;

        public a(RVLLevel rVLLevel, String str, ag agVar) {
            this.f29459a = rVLLevel;
            this.b = str;
            this.c = agVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                ul.g(ul.this, this.f29459a, this.b, this.c);
            }
        }
    }

    static {
        t2o.a(81789158);
        t2o.a(79691904);
    }

    public static /* synthetic */ void g(ul ulVar, RVLLevel rVLLevel, String str, ag agVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8290c49", new Object[]{ulVar, rVLLevel, str, agVar});
        } else {
            ulVar.i(rVLLevel, str, agVar);
        }
    }

    public static ul h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ul) ipChange.ipc$dispatch("3b726b34", new Object[0]);
        }
        if (f29458a == null) {
            f29458a = new ul();
        }
        return f29458a;
    }

    private void i(RVLLevel rVLLevel, String str, ag agVar) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7ce8a80", new Object[]{this, rVLLevel, str, agVar});
            return;
        }
        try {
            if (agVar == null) {
                lcn.f(rVLLevel, "MyModule", str);
                return;
            }
            if (TextUtils.isEmpty(agVar.g())) {
                str2 = "AURA/other";
            } else {
                str2 = agVar.g();
            }
            icn l = lcn.a(rVLLevel, str2).l(RVLLevel.Error);
            String f = agVar.f("traceId");
            String f2 = agVar.f("event");
            if (!TextUtils.isEmpty(f)) {
                l.k(f2, f);
            } else {
                l.j(f2);
            }
            String f3 = agVar.f("parentId");
            if (!TextUtils.isEmpty(f3)) {
                l.m(f3);
            }
            String f4 = agVar.f("errorCode");
            String f5 = agVar.f("errorMsg");
            if (!TextUtils.isEmpty(f4) && !TextUtils.isEmpty(f5)) {
                l.i(f4, f5);
            }
            String f6 = agVar.f("timestamp");
            if (!TextUtils.isEmpty(f6)) {
                l.n(Long.parseLong(f6));
            }
            HashMap hashMap = new HashMap(agVar.e());
            hashMap.put("message", str);
            hashMap.remove(ag.ARG_KEY_DOMAIN);
            hashMap.remove("event");
            hashMap.remove("traceId");
            l.b(hashMap);
            l.f();
        } catch (Exception unused) {
        }
    }

    private void j(RVLLevel rVLLevel, String str, ag agVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb986ac9", new Object[]{this, rVLLevel, str, agVar});
        } else if (th.c() || xk.a("enableMainThreadLog", false)) {
            i(rVLLevel, str, agVar);
        } else {
            cn.d(new a(rVLLevel, str, agVar));
        }
    }

    @Override // tb.sbb
    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
        } else {
            j(RVLLevel.Debug, str, null);
        }
    }

    @Override // tb.sbb
    public void e(String str, ag agVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf9df276", new Object[]{this, str, agVar});
        } else {
            j(RVLLevel.Debug, str, agVar);
        }
    }

    @Override // tb.sbb
    public void f(String str, ag agVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d89f4415", new Object[]{this, str, agVar});
        } else {
            j(RVLLevel.Error, str, agVar);
        }
    }

    @Override // tb.sbb
    public void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c6cb136", new Object[]{this, str});
        } else {
            j(RVLLevel.Error, str, null);
        }
    }

    @Override // tb.sbb
    public void e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb83980", new Object[]{this, str, str2});
            return;
        }
        RVLLevel rVLLevel = RVLLevel.Error;
        ck.b b = ck.b.b();
        j(rVLLevel, str2, b.i("AURA/" + str).a());
    }
}
