package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.update.apk.ApkUpdateContext;
import com.taobao.update.apk.MainUpdateData;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import tb.tu7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class j11 implements czm<ApkUpdateContext> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public kvu f21697a;
    public int id = 0;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements tu7 {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public int lastProgress = -1;
        public final /* synthetic */ ApkUpdateContext val$apkUpdateContext;
        public final /* synthetic */ CountDownLatch val$countDownLatch;
        public final /* synthetic */ boolean val$needUi;

        public a(boolean z, ApkUpdateContext apkUpdateContext, CountDownLatch countDownLatch) {
            this.val$needUi = z;
            this.val$apkUpdateContext = apkUpdateContext;
            this.val$countDownLatch = countDownLatch;
        }

        @Override // tb.tu7
        public void onDownloadError(String str, int i, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cc722e3b", new Object[]{this, str, new Integer(i), str2});
                return;
            }
            if (this.val$needUi) {
                j11.access$100(j11.this, str2, this.val$apkUpdateContext.isForceUpdate());
            }
            StringBuilder sb = new StringBuilder("onDownloadError ");
            sb.append(i);
            sb.append(">");
            sb.append(str2);
        }

        @Override // tb.tu7
        public void onDownloadFinish(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("43d7a315", new Object[]{this, str, str2});
                return;
            }
            if (this.val$needUi) {
                j11.access$200(j11.this, str2, this.val$apkUpdateContext.isForceUpdate());
            }
            this.val$apkUpdateContext.apkPath = str2;
            new StringBuilder("onDownloadFinish ").append(str2);
        }

        @Override // tb.tu7
        public void onDownloadProgress(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("49af8908", new Object[]{this, new Integer(i)});
                return;
            }
            new StringBuilder("on process ").append(i);
            if (this.val$needUi && this.lastProgress != i) {
                this.lastProgress = i;
                j11.access$000(j11.this, i, this.val$apkUpdateContext.isForceUpdate());
            }
        }

        @Override // tb.tu7
        public void onDownloadStateChange(String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("98fdb789", new Object[]{this, str, new Boolean(z)});
            }
        }

        @Override // tb.tu7
        public void onFinish(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6a109f1b", new Object[]{this, new Boolean(z)});
                return;
            }
            new StringBuilder("onFinish ").append(z);
            this.val$apkUpdateContext.success = z;
            this.val$countDownLatch.countDown();
        }

        @Override // tb.tu7
        public void onNetworkLimit(int i, upl uplVar, tu7.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fcf51783", new Object[]{this, new Integer(i), uplVar, aVar});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ boolean val$isForce;
        public final /* synthetic */ int val$progress;

        public b(boolean z, int i) {
            this.val$isForce = z;
            this.val$progress = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                j11.access$300(j11.this, this.val$isForce).notifyDownloadProgress(this.val$progress);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ boolean val$isForce;
        public final /* synthetic */ String val$msg;

        public c(boolean z, String str) {
            this.val$isForce = z;
            this.val$msg = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            kvu access$300 = j11.access$300(j11.this, this.val$isForce);
            if (TextUtils.isEmpty(this.val$msg)) {
                str = "下载失败";
            } else {
                str = this.val$msg;
            }
            access$300.notifyDownloadError(str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String val$data;
        public final /* synthetic */ boolean val$isForce;

        public d(boolean z, String str) {
            this.val$isForce = z;
            this.val$data = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                j11.access$300(j11.this, this.val$isForce).notifyDownloadFinish(this.val$data);
            }
        }
    }

    static {
        t2o.a(953155598);
        t2o.a(947912754);
    }

    public static /* synthetic */ void access$000(j11 j11Var, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("799710c6", new Object[]{j11Var, new Integer(i), new Boolean(z)});
        } else {
            j11Var.c(i, z);
        }
    }

    public static /* synthetic */ void access$100(j11 j11Var, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7225434", new Object[]{j11Var, str, new Boolean(z)});
        } else {
            j11Var.a(str, z);
        }
    }

    public static /* synthetic */ void access$200(j11 j11Var, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9515ba13", new Object[]{j11Var, str, new Boolean(z)});
        } else {
            j11Var.b(str, z);
        }
    }

    public static /* synthetic */ kvu access$300(j11 j11Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kvu) ipChange.ipc$dispatch("2fce37d9", new Object[]{j11Var, new Boolean(z)});
        }
        return j11Var.d(z);
    }

    public final void a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("144c2f5a", new Object[]{this, str, new Boolean(z)});
        } else {
            x1i.execute(new c(z, str));
        }
    }

    public final void b(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59b8333f", new Object[]{this, str, new Boolean(z)});
        } else {
            x1i.execute(new d(z, str));
        }
    }

    public final void c(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d43bab8d", new Object[]{this, new Integer(i), new Boolean(z)});
        } else {
            x1i.execute(new b(z, i));
        }
    }

    public final kvu d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kvu) ipChange.ipc$dispatch("44ffecc7", new Object[]{this, new Boolean(z)});
        }
        kvu kvuVar = this.f21697a;
        if (kvuVar != null) {
            return kvuVar;
        }
        if (z) {
            this.f21697a = (kvu) c62.getInstance("notify", kvu.class);
        } else {
            this.f21697a = (kvu) c62.getInstance("sysnotify", kvu.class);
        }
        return this.f21697a;
    }

    public final boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("17cacd8e", new Object[]{this})).booleanValue();
        }
        return nkv.isNotificationPermissioned();
    }

    public tu7 getListener(CountDownLatch countDownLatch, ApkUpdateContext apkUpdateContext, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tu7) ipChange.ipc$dispatch("e61e4b52", new Object[]{this, countDownLatch, apkUpdateContext, new Boolean(z)});
        }
        return new a(z, apkUpdateContext, countDownLatch);
    }

    public void execute(ApkUpdateContext apkUpdateContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aeed841b", new Object[]{this, apkUpdateContext});
        } else if (TextUtils.isEmpty(apkUpdateContext.apkPath)) {
            MainUpdateData mainUpdateData = apkUpdateContext.mainUpdate;
            String str = nkv.getStorePath(apkUpdateContext.context) + "/apkupdate/";
            String str2 = str + mainUpdateData.version;
            try {
                Runtime.getRuntime().exec("chmod 775 " + str);
            } catch (Throwable th) {
                th.printStackTrace();
            }
            try {
                Runtime.getRuntime().exec("chmod 775 " + str2);
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
            ArrayList arrayList = new ArrayList(1);
            onf onfVar = new onf();
            arrayList.add(onfVar);
            onfVar.f25507a = mainUpdateData.getDownloadUrl();
            onfVar.b = mainUpdateData.size;
            upl uplVar = new upl();
            zu7 zu7Var = new zu7();
            zu7Var.f33016a = arrayList;
            zu7Var.b = uplVar;
            uplVar.c = 7;
            uplVar.g = str2;
            uplVar.d = 0;
            uplVar.f29547a = "apkupdate";
            uplVar.b = 20;
            CountDownLatch countDownLatch = new CountDownLatch(1);
            if (!e()) {
                apkUpdateContext.hasNotified = false;
            }
            this.id = rv7.e().b(zu7Var, getListener(countDownLatch, apkUpdateContext, apkUpdateContext.hasNotified));
            try {
                countDownLatch.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
