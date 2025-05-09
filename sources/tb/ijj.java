package tb;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ijj extends yr1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(481297565);
    }

    public static /* synthetic */ Object ipc$super(ijj ijjVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/ui/coordinatorcard/factory/NativeCardFactory");
    }

    @Override // tb.yr1
    public void a(Context context, y73 y73Var, g1a<? super zr1, xhv> g1aVar, u1a<? super Integer, ? super String, xhv> u1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f765deda", new Object[]{this, context, y73Var, g1aVar, u1aVar});
            return;
        }
        ckf.g(context, "context");
        ckf.g(y73Var, "cardBean");
        ckf.g(g1aVar, "successListener");
        ckf.g(u1aVar, "failureListener");
        String c = y73Var.c();
        if (TextUtils.isEmpty(c)) {
            u1aVar.invoke(-1, "Invalid Card Type");
        } else if (c != null) {
            switch (c.hashCode()) {
                case 225691318:
                    if (c.equals("nt_region_digest")) {
                        g1aVar.invoke(b(context, y73Var));
                        return;
                    }
                    return;
                case 355547527:
                    if (c.equals("nt_translate_result")) {
                        g1aVar.invoke(e(context, y73Var));
                        return;
                    }
                    return;
                case 863140336:
                    if (c.equals("nt_scan_code_hint")) {
                        g1aVar.invoke(d(context, y73Var));
                        return;
                    }
                    return;
                case 1511876001:
                    if (c.equals("nt_identify_region_card")) {
                        g1aVar.invoke(c(context, y73Var));
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    public final gh1 b(Context context, y73 y73Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gh1) ipChange.ipc$dispatch("c9cf4b28", new Object[]{this, context, y73Var});
        }
        gh1 gh1Var = new gh1();
        gh1Var.Q(context, y73Var.b(), y73Var.a());
        return gh1Var;
    }

    public final fhe c(Context context, y73 y73Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fhe) ipChange.ipc$dispatch("3a7f836", new Object[]{this, context, y73Var});
        }
        fhe fheVar = new fhe();
        fheVar.Q(context, y73Var.b(), y73Var.a());
        return fheVar;
    }

    public final xro d(Context context, y73 y73Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xro) ipChange.ipc$dispatch("7e7f3d01", new Object[]{this, context, y73Var});
        }
        xro xroVar = new xro();
        xroVar.D(context, y73Var.b(), y73Var.a());
        return xroVar;
    }

    public final zeu e(Context context, y73 y73Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zeu) ipChange.ipc$dispatch("55eb7da8", new Object[]{this, context, y73Var});
        }
        zeu zeuVar = new zeu();
        zeuVar.F(context, y73Var.b(), y73Var.a());
        return zeuVar;
    }
}
