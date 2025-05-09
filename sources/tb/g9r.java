package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.ck;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class g9r {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            ef1.h().b();
            rbb g = ck.g();
            g.e("预加载布局文件完成，耗时 = " + (System.currentTimeMillis() - currentTimeMillis), ck.b.b().i("AURA/performance").a());
        }
    }

    static {
        t2o.a(708837594);
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ca41b3a", new Object[]{context});
            return;
        }
        ck.g().e("预加载布局文件", ck.b.b().i("AURA/performance").a());
        ef1.h().j(context.getApplicationContext());
        ef1.h().a(R.layout.activity_purchase_v2);
        dn.h(new a());
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[0]);
        } else {
            ef1.h().f();
        }
    }
}
