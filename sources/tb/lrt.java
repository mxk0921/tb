package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class lrt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(1007681546);
    }

    public static final void b(pzf pzfVar, final wio wioVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2375953e", new Object[]{pzfVar, wioVar});
            return;
        }
        ckf.g(pzfVar, "<this>");
        ckf.g(wioVar, "runnable");
        pzfVar.d(new d1a() { // from class: tb.krt
            @Override // tb.d1a
            public final Object invoke() {
                xhv c;
                c = lrt.c(wio.this);
                return c;
            }
        });
    }

    public static final xhv c(wio wioVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("2df9cd6c", new Object[]{wioVar});
        }
        wioVar.run();
        return xhv.INSTANCE;
    }
}
