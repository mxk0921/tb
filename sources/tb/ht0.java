package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ht0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6f5e6f", new Object[0]);
        } else {
            b(null, null, null, null, null);
        }
    }

    public static void b(Integer num, Integer num2, Integer num3, Integer num4, Integer num5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("994ac8e8", new Object[]{num, num2, num3, num4, num5});
            return;
        }
        jt0 jt0Var = new jt0();
        jt0Var.b();
        try {
            aq7 c = s0m.B().h().c(jt0Var);
            if (num != null) {
                c.b(17, num.intValue());
            }
            if (num2 != null) {
                c.b(34, num2.intValue());
            }
            if (num3 != null) {
                c.b(51, num3.intValue());
            }
            if (num4 != null) {
                c.b(68, num4.intValue());
            }
            if (num5 != null) {
                c.b(85, num5.intValue());
            }
            fiv.f("Alivfs4Phenix", "disk cache setup, top1=%s top2=%s top3=%s top4=%s top5=%s", num, num2, num3, num4, num5);
        } catch (RuntimeException e) {
            fiv.c("Alivfs4Phenix", "disk cache setup error=%s", e);
        }
    }
}
