package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.ultron.config.ConfigSource;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.UltronInstanceViewModel;
import com.taobao.android.task.Coordinator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ac9 extends c7v {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ a7v f15654a;

        public a(a7v a7vVar) {
            this.f15654a = a7vVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                Application application = v2s.o().f().getApplication();
                if (application != null) {
                    String path = application.getCacheDir().getPath();
                    ac9.this.getClass();
                    ((UltronInstanceViewModel.c) this.f15654a).c(rg9.a(path, "taolivegoodspage2.json"), ConfigSource.FILE);
                }
            } catch (Throwable th) {
                try {
                    hha.b("UltronFileTask", "错误 :" + th.toString());
                } finally {
                    ac9.this.f16905a.countDown();
                }
            }
        }
    }

    static {
        t2o.a(295699176);
    }

    public ac9(CountDownLatch countDownLatch, ExecutorService executorService) {
        super(countDownLatch, executorService);
    }

    public static /* synthetic */ Object ipc$super(ac9 ac9Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/good/ultron/config/FileCacheUltronConfigModel");
    }

    public void a(a7v a7vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1edd66e0", new Object[]{this, a7vVar});
            return;
        }
        a aVar = new a(a7vVar);
        ExecutorService executorService = this.b;
        if (executorService != null) {
            executorService.execute(aVar);
        } else {
            Coordinator.execute(aVar, 30);
        }
    }
}
