package tb;

import android.taobao.windvane.extra.core.WVCore;
import android.taobao.windvane.extra.uc.WVUCWebView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.executor.ExecutorType;
import com.taobao.themis.kernel.executor.IExecutorService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class uds {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (!uds.a()) {
                WVUCWebView.initUCCore();
            }
        }
    }

    static {
        t2o.a(850395202);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a404b864", new Object[0])).booleanValue();
        }
        return WVCore.getInstance().isUCSupport();
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb18841d", new Object[0]);
            return;
        }
        IExecutorService iExecutorService = (IExecutorService) p8s.b(IExecutorService.class);
        if (iExecutorService != null) {
            iExecutorService.getExecutor(ExecutorType.URGENT).execute(new a());
        }
    }
}
