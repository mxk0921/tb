package tb;

import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.update.result.BundleUpdateStep;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import tb.yjv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class vet {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static vet d;
    public boolean b;

    /* renamed from: a  reason: collision with root package name */
    public final BlockingQueue<zct> f29973a = new PriorityBlockingQueue(5);
    public final gdh c = fih.getLog(vet.class, (gdh) null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String val$msg;

        public a(String str) {
            this.val$msg = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                Toast.makeText(kjv.sContext, this.val$msg, 1).show();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b implements yjv.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.yjv.a
        public void hasPatched(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d4820c60", new Object[]{this, new Boolean(z)});
            }
        }

        @Override // tb.yjv.a
        public void patchFailed(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("839bcb76", new Object[]{this, str});
                return;
            }
            gdh access$000 = vet.access$000(vet.this);
            access$000.w("Apk update:" + str);
        }

        @Override // tb.yjv.a
        public void patchStart() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("77e91881", new Object[]{this});
            }
        }

        @Override // tb.yjv.a
        public void patchSuccess() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("890915a2", new Object[]{this});
            } else {
                vet.access$100(vet.this).clear();
            }
        }

        @Override // tb.yjv.a
        public void patching(BundleUpdateStep bundleUpdateStep) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2d52632a", new Object[]{this, bundleUpdateStep});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class c implements yjv.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // tb.yjv.a
        public void hasPatched(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d4820c60", new Object[]{this, new Boolean(z)});
            }
        }

        @Override // tb.yjv.a
        public void patchFailed(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("839bcb76", new Object[]{this, str});
                return;
            }
            gdh access$000 = vet.access$000(vet.this);
            access$000.w("dynamic feature update:" + str);
        }

        @Override // tb.yjv.a
        public void patchStart() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("77e91881", new Object[]{this});
            }
        }

        @Override // tb.yjv.a
        public void patchSuccess() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("890915a2", new Object[]{this});
                return;
            }
            vet.access$202(vet.this, true);
            vet.access$100(vet.this).clear();
        }

        @Override // tb.yjv.a
        public void patching(BundleUpdateStep bundleUpdateStep) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2d52632a", new Object[]{this, bundleUpdateStep});
            }
        }
    }

    static {
        t2o.a(950009870);
    }

    public static /* synthetic */ gdh access$000(vet vetVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gdh) ipChange.ipc$dispatch("36f73c6a", new Object[]{vetVar});
        }
        return vetVar.c;
    }

    public static /* synthetic */ BlockingQueue access$100(vet vetVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BlockingQueue) ipChange.ipc$dispatch("9e6474cb", new Object[]{vetVar});
        }
        return vetVar.f29973a;
    }

    public static /* synthetic */ boolean access$202(vet vetVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("32530c9f", new Object[]{vetVar, new Boolean(z)})).booleanValue();
        }
        vetVar.b = z;
        return z;
    }

    public static vet instance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vet) ipChange.ipc$dispatch("24c7fdd8", new Object[0]);
        }
        if (d == null) {
            synchronized (vet.class) {
                try {
                    if (d == null) {
                        d = new vet();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return d;
    }

    public final void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("864ba978", new Object[]{this, str});
        } else {
            new Handler(Looper.getMainLooper()).post(new a(str));
        }
    }

    public void add(zct zctVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a17af07d", new Object[]{this, zctVar});
            return;
        }
        boolean z = this.b;
        if (z) {
            bjv bjvVar = kjv.sUpdateAdapter;
            if (z) {
                str = "update_dynamic_success";
            } else {
                str = "update_dexpatch_success";
            }
            bjvVar.commitSuccess("update_center_all", str, "");
            gxm gxmVar = (gxm) zctVar;
            if (gxmVar.getPatchType().getPriority() == 3) {
                if (gxmVar.from().equals(gjv.SCAN)) {
                    a("存在其他已成功的动态部署，请杀进程重启后再次扫码，扫码后杀进程重启，当前动态部署生效");
                    return;
                }
                gdh gdhVar = this.c;
                gdhVar.w("dynamic update has finished " + this.b);
                return;
            }
        }
        if (!((PriorityBlockingQueue) this.f29973a).contains(zctVar)) {
            ((PriorityBlockingQueue) this.f29973a).add(zctVar);
            return;
        }
        gdh gdhVar2 = this.c;
        gdhVar2.w(zctVar + " update is in progress....");
    }

    public void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
        } else {
            ((PriorityBlockingQueue) this.f29973a).clear();
        }
    }

    public boolean contains(zct zctVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f0b8e143", new Object[]{this, zctVar})).booleanValue();
        }
        return ((PriorityBlockingQueue) this.f29973a).contains(zctVar);
    }

    public int size() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("32697bfb", new Object[]{this})).intValue();
        }
        return ((PriorityBlockingQueue) this.f29973a).size();
    }

    public void run() throws InterruptedException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        while (true) {
            zct zctVar = (zct) ((PriorityBlockingQueue) this.f29973a).poll(1000L, TimeUnit.MILLISECONDS);
            if (zctVar == null) {
                return;
            }
            if (zctVar instanceof gxm) {
                gxm gxmVar = (gxm) zctVar;
                int priority = gxmVar.getPatchType().getPriority();
                if (priority != 0) {
                    if (priority != 1) {
                        if (priority == 2) {
                            if (gxmVar.getRunnable().getUpdateListener() != null) {
                                gxmVar.getRunnable().getUpdateListener().patchProcessListener(new b());
                            }
                            gxmVar.syncRun();
                        } else if (priority == 3) {
                            kjv.sUpdateAdapter.commitSuccess("update_center_all", "update_dispatch_dynamic", "");
                            if (gxmVar.getRunnable().getUpdateListener() != null) {
                                gxmVar.getRunnable().getUpdateListener().patchProcessListener(new c());
                            }
                            gxmVar.syncRun();
                        } else if (!(priority == 4 || priority == 5)) {
                        }
                    }
                    gxmVar.asyncRun();
                } else {
                    gxmVar.syncRun();
                }
            }
        }
    }
}
