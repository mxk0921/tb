package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import tb.tu7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class lh9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final lh9 f23338a = new lh9();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class b implements tu7 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final CountDownLatch f23339a;
        public final hc9 b;

        static {
            t2o.a(654311445);
        }

        @Override // tb.tu7
        public void onDownloadError(String str, int i, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cc722e3b", new Object[]{this, str, new Integer(i), str2});
                return;
            }
            hc9 hc9Var = this.b;
            hc9Var.d = false;
            hc9Var.f = str2;
            hc9Var.e = i;
            CountDownLatch countDownLatch = this.f23339a;
            if (countDownLatch != null) {
                countDownLatch.countDown();
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
            Log.e("SimpleAdditioner", "download finish:" + z);
            this.b.d = z;
            CountDownLatch countDownLatch = this.f23339a;
            if (countDownLatch != null) {
                countDownLatch.countDown();
            }
        }

        @Override // tb.tu7
        public void onNetworkLimit(int i, upl uplVar, tu7.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fcf51783", new Object[]{this, new Integer(i), uplVar, aVar});
            }
        }

        public b(lh9 lh9Var, CountDownLatch countDownLatch, hc9 hc9Var) {
            this.f23339a = countDownLatch;
            this.b = hc9Var;
        }

        @Override // tb.tu7
        public void onDownloadFinish(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("43d7a315", new Object[]{this, str, str2});
                return;
            }
            hc9 hc9Var = this.b;
            if (!new File(hc9Var.g, hc9Var.h).exists()) {
                Log.e("SimpleAdditioner", "download finish:" + str2);
                if (new File(str2).exists()) {
                    File file = new File(str2);
                    hc9 hc9Var2 = this.b;
                    file.renameTo(new File(hc9Var2.g, hc9Var2.h));
                    StringBuilder sb = new StringBuilder("renameTo sucess:");
                    hc9 hc9Var3 = this.b;
                    sb.append(new File(hc9Var3.g, hc9Var3.h).getPath());
                    Log.e("SimpleAdditioner", sb.toString());
                }
            }
            hc9 hc9Var4 = this.b;
            if (!new File(hc9Var4.g, hc9Var4.h).exists()) {
                hc9 hc9Var5 = this.b;
                hc9Var5.d = false;
                hc9Var5.f = "download fail";
            }
        }
    }

    static {
        t2o.a(654311443);
    }

    public static lh9 b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lh9) ipChange.ipc$dispatch("1c3ba6d", new Object[0]);
        }
        return f23338a;
    }

    public void a(List<hc9> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6395800", new Object[]{this, list});
            return;
        }
        CountDownLatch countDownLatch = new CountDownLatch(list.size());
        zu7 zu7Var = new zu7();
        for (hc9 hc9Var : list) {
            onf onfVar = new onf(hc9Var.f20538a);
            onfVar.c = hc9Var.c;
            onfVar.b = Long.valueOf(hc9Var.b).longValue();
            upl uplVar = new upl();
            uplVar.g = hc9Var.g;
            uplVar.f29547a = "AdditionFile";
            uplVar.b = 10;
            zu7Var.b = uplVar;
            ArrayList arrayList = new ArrayList();
            zu7Var.f33016a = arrayList;
            arrayList.add(onfVar);
            rv7.e().b(zu7Var, new b(countDownLatch, hc9Var));
        }
        try {
            countDownLatch.await();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
