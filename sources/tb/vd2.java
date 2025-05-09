package tb;

import android.content.Context;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class vd2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final wd2 f29933a;
    public final Long b;
    public String c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final vd2 f29934a = new vd2();

        public static /* synthetic */ vd2 a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (vd2) ipChange.ipc$dispatch("a3848c73", new Object[0]);
            }
            return f29934a;
        }
    }

    public static synchronized vd2 a() {
        synchronized (vd2.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (vd2) ipChange.ipc$dispatch("d7c39d59", new Object[0]);
            }
            return b.a();
        }
    }

    public String b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7512d303", new Object[]{this, context});
        }
        String str = this.c;
        if (str != null) {
            return str;
        }
        String f = s91.f();
        if (asq.d(f)) {
            f = s91.e(context);
        }
        this.c = f;
        return f;
    }

    public void c(Context context, ud2 ud2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d252c968", new Object[]{this, context, ud2Var});
            return;
        }
        try {
            if (!(zap.b().f32654a == null || zap.b().c == null)) {
                if (ud2Var != null) {
                    this.f29933a.a(new dbp(context, ud2Var));
                    return;
                }
                return;
            }
            Log.e(td2.LOGTAG, "you need init rest send service");
        } catch (Exception e) {
            Log.e(td2.LOGTAG, "adapter err", e);
        }
    }

    public vd2() {
        this.f29933a = new wd2();
        this.b = Long.valueOf(System.currentTimeMillis());
        this.c = null;
    }
}
