package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.executor.ExecutorType;
import com.taobao.themis.kernel.executor.IExecutorService;
import com.taobao.themis.taobao.initializer.kernel.TMSInitTaskExecutorType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class xas {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "TMSInitializer:TMSInitTaskScheduler";

    /* renamed from: a  reason: collision with root package name */
    public final List<z8s> f31255a = new ArrayList();
    public final String b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ z8s f31256a;
        public final /* synthetic */ Application b;
        public final /* synthetic */ HashMap c;

        public a(z8s z8sVar, Application application, HashMap hashMap) {
            this.f31256a = z8sVar;
            this.b = application;
            this.c = hashMap;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.f31256a.c(this.b, this.c);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ z8s f31257a;
        public final /* synthetic */ Application b;
        public final /* synthetic */ HashMap c;

        public b(z8s z8sVar, Application application, HashMap hashMap) {
            this.f31257a = z8sVar;
            this.b = application;
            this.c = hashMap;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.f31257a.c(this.b, this.c);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static /* synthetic */ class c {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$themis$taobao$initializer$kernel$TMSInitTaskExecutorType;

        static {
            int[] iArr = new int[TMSInitTaskExecutorType.values().length];
            $SwitchMap$com$taobao$themis$taobao$initializer$kernel$TMSInitTaskExecutorType = iArr;
            try {
                iArr[TMSInitTaskExecutorType.SYNC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$themis$taobao$initializer$kernel$TMSInitTaskExecutorType[TMSInitTaskExecutorType.IDLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static {
        t2o.a(847249513);
    }

    public xas(String str) {
        this.b = str;
    }

    public void a(z8s z8sVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73fdd6fc", new Object[]{this, z8sVar});
        } else {
            ((ArrayList) this.f31255a).add(z8sVar);
        }
    }

    public void b(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a0a352e", new Object[]{this, application, hashMap});
            return;
        }
        TMSLogger.b(TAG, "\nInit task Scheduler start execute: " + this.b + "\n");
        no8 f = h8s.f(application.getApplicationContext(), "pauseAndRestartInitTask");
        Iterator it = ((ArrayList) this.f31255a).iterator();
        while (it.hasNext()) {
            z8s z8sVar = (z8s) it.next();
            if (!z8sVar.g() || !f.d()) {
                int i = c.$SwitchMap$com$taobao$themis$taobao$initializer$kernel$TMSInitTaskExecutorType[z8sVar.d().ordinal()];
                if (i == 1) {
                    z8sVar.c(application, hashMap);
                } else if (i != 2) {
                    ((IExecutorService) p8s.g(IExecutorService.class)).getExecutor(ExecutorType.NORMAL).execute(new b(z8sVar, application, hashMap));
                } else {
                    ((IExecutorService) p8s.g(IExecutorService.class)).getExecutor(ExecutorType.IDLE).execute(new a(z8sVar, application, hashMap));
                }
            } else {
                return;
            }
        }
    }
}
