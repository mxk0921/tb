package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class us7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<String, gtt> f29586a = new HashMap<>();

    static {
        t2o.a(815792933);
    }

    public static final void g(us7 us7Var, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5df49b0c", new Object[]{us7Var, str, new Long(j)});
            return;
        }
        ckf.g(us7Var, "this$0");
        ckf.g(str, "$stage");
        gtt gttVar = us7Var.f29586a.get(str);
        if (gttVar != null) {
            gttVar.c(j);
        }
    }

    public static final void h(us7 us7Var, mdd mddVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28aec75c", new Object[]{us7Var, mddVar});
            return;
        }
        ckf.g(us7Var, "this$0");
        ckf.g(mddVar, "$procedure");
        for (Map.Entry<String, gtt> entry : us7Var.f29586a.entrySet()) {
            if (entry.getValue().b()) {
                mddVar.a(entry.getKey(), String.valueOf(entry.getValue().a()));
            }
        }
    }

    public static final void i(long j, us7 us7Var, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd30081c", new Object[]{new Long(j), us7Var, str});
            return;
        }
        ckf.g(us7Var, "this$0");
        ckf.g(str, "$stage");
        gtt gttVar = new gtt();
        gttVar.d(j);
        us7Var.f29586a.put(str, gttVar);
    }

    public final void b(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41f4dd2c", new Object[]{this, str});
            return;
        }
        ckf.g(str, v4s.PARAM_UPLOAD_STAGE);
        final long currentTimeMillis = System.currentTimeMillis();
        le1.b().post(new Runnable() { // from class: tb.g5z
            @Override // java.lang.Runnable
            public final void run() {
                us7.g(us7.this, str, currentTimeMillis);
            }
        });
    }

    public final void c(final mdd mddVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f136018", new Object[]{this, mddVar});
            return;
        }
        ckf.g(mddVar, "procedure");
        le1.b().post(new Runnable() { // from class: tb.h5z
            @Override // java.lang.Runnable
            public final void run() {
                us7.h(us7.this, mddVar);
            }
        });
    }

    public final void d(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a37a973", new Object[]{this, str});
            return;
        }
        ckf.g(str, v4s.PARAM_UPLOAD_STAGE);
        final long currentTimeMillis = System.currentTimeMillis();
        le1.b().post(new Runnable() { // from class: tb.f5z
            @Override // java.lang.Runnable
            public final void run() {
                us7.i(currentTimeMillis, this, str);
            }
        });
    }
}
