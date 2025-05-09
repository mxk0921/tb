package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.update.instantpatch.model.InstantUpdateInfo;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import tb.tu7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class rtl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final zcf f27601a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b implements tu7 {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public CountDownLatch latch;

        static {
            t2o.a(952107027);
        }

        @Override // tb.tu7
        public void onDownloadError(String str, int i, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cc722e3b", new Object[]{this, str, new Integer(i), str2});
                return;
            }
            rtl.access$100(rtl.this).success = false;
            rtl.access$100(rtl.this).errorMsg = str2;
            rtl.access$100(rtl.this).errorCode = i;
            CountDownLatch countDownLatch = this.latch;
            if (countDownLatch != null) {
                countDownLatch.countDown();
            }
        }

        @Override // tb.tu7
        public void onDownloadFinish(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("43d7a315", new Object[]{this, str, str2});
            } else {
                rtl.access$100(rtl.this).path = str2;
            }
        }

        @Override // tb.tu7
        public void onDownloadProgress(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("49af8908", new Object[]{this, new Integer(i)});
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
            CountDownLatch countDownLatch = this.latch;
            if (countDownLatch != null) {
                countDownLatch.countDown();
            }
            rtl.access$100(rtl.this).success = z;
        }

        @Override // tb.tu7
        public void onNetworkLimit(int i, upl uplVar, tu7.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fcf51783", new Object[]{this, new Integer(i), uplVar, aVar});
            }
        }

        public b(CountDownLatch countDownLatch) {
            this.latch = countDownLatch;
        }
    }

    static {
        t2o.a(952107025);
    }

    public rtl(zcf zcfVar) {
        this.f27601a = zcfVar;
    }

    public static /* synthetic */ zcf access$100(rtl rtlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zcf) ipChange.ipc$dispatch("70d2866f", new Object[]{rtlVar});
        }
        return rtlVar.f27601a;
    }

    public void download(InstantUpdateInfo instantUpdateInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f66b21e1", new Object[]{this, instantUpdateInfo});
            return;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        zu7 zu7Var = new zu7();
        onf onfVar = new onf(instantUpdateInfo.patchUrl);
        onfVar.c = instantUpdateInfo.md5;
        onfVar.b = Long.valueOf(instantUpdateInfo.size).longValue();
        upl uplVar = new upl();
        uplVar.g = this.f27601a.getPatchPath();
        uplVar.f29547a = gjv.HOTPATCH;
        uplVar.b = 20;
        zu7Var.b = uplVar;
        ArrayList arrayList = new ArrayList();
        zu7Var.f33016a = arrayList;
        arrayList.add(onfVar);
        rv7.e().b(zu7Var, new b(countDownLatch));
        try {
            countDownLatch.await();
            zcf zcfVar = this.f27601a;
            if (zcfVar.success && !cbi.isMd5Same(instantUpdateInfo.md5, zcfVar.path)) {
                zcf zcfVar2 = this.f27601a;
                zcfVar2.success = false;
                zcfVar2.errorMsg = "download fail: md5 mismatch";
            }
        } catch (Throwable th) {
            th.printStackTrace();
            zcf zcfVar3 = this.f27601a;
            zcfVar3.success = false;
            zcfVar3.errorMsg = th.getMessage();
        }
        if (TextUtils.isEmpty(this.f27601a.path) || !new File(this.f27601a.path).exists()) {
            zcf zcfVar4 = this.f27601a;
            zcfVar4.success = false;
            zcfVar4.errorMsg = "download fail";
        }
    }
}
