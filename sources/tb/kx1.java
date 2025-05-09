package tb;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.mnncv.MNNCVExecutor;
import com.taobao.mrt.task.MRTRuntimeException;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public abstract class kx1<IN, OUT> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public MNNCVExecutor f22979a;
    public volatile boolean b = false;
    public volatile boolean c = false;
    public volatile boolean d = true;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements MNNCVExecutor.g {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ MRTRuntimeException[] f22980a;
        public final /* synthetic */ long b;
        public final /* synthetic */ CountDownLatch c;

        public a(MRTRuntimeException[] mRTRuntimeExceptionArr, long j, CountDownLatch countDownLatch) {
            this.f22980a = mRTRuntimeExceptionArr;
            this.b = j;
            this.c = countDownLatch;
        }

        @Override // com.taobao.android.mnncv.MNNCVExecutor.g
        public void onResult(MRTRuntimeException mRTRuntimeException) {
            boolean z = false;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3b72e6cf", new Object[]{this, mRTRuntimeException});
                return;
            }
            this.f22980a[0] = mRTRuntimeException;
            kx1 kx1Var = kx1.this;
            if (mRTRuntimeException == null) {
                z = true;
            }
            kx1Var.c = z;
            kx1.this.b = true;
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.b;
            boolean z2 = kx1.this.c;
            kx1 kx1Var2 = kx1.this;
            dkg.a(kx1.this.c() + "_prepare", elapsedRealtime, z2, kx1.a(kx1Var2, kx1Var2.c));
            this.c.countDown();
        }
    }

    static {
        t2o.a(511705202);
        t2o.a(511705204);
    }

    public static /* synthetic */ HashMap a(kx1 kx1Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("e844e202", new Object[]{kx1Var, new Boolean(z)});
        }
        return kx1Var.d(z);
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("89c49785", new Object[]{this})).booleanValue();
        }
        try {
            MNNCVExecutor mNNCVExecutor = this.f22979a;
            if (mNNCVExecutor != null) {
                mNNCVExecutor.e();
                this.f22979a = null;
                odg.b("LCMNN.MNNCVExecutor", "mExecutor.destroy() " + c());
            }
            return true;
        } catch (Throwable th) {
            th.printStackTrace();
            odg.c("LCMNN.MNNCVExecutor", "mExecutor.destroy fail " + c());
            return false;
        }
    }

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return g();
    }

    public final HashMap<String, Object> d(boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("56396bdd", new Object[]{this, new Boolean(z)});
        }
        HashMap<String, Object> hashMap = new HashMap<>();
        if (z) {
            str = "1";
        } else {
            str = "0";
        }
        hashMap.put("mnn_suc", str);
        return hashMap;
    }

    public boolean e(Context context) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("609fd215", new Object[]{this, context})).booleanValue();
        }
        if (!f()) {
            odg.c("LCMNN.MNNCVExecutor", "mExecutor.init not enable " + c());
            return false;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            this.f22979a = new MNNCVExecutor(c());
        } catch (Exception e) {
            e.printStackTrace();
            odg.c("LCMNN.MNNCVExecutor", "mExecutor.init fail " + c());
            z = false;
        }
        dkg.a(c() + "_init", SystemClock.elapsedRealtime() - elapsedRealtime, z, d(z));
        return i();
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2312d58", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public abstract String g();

    public abstract OUT h(IN in);

    public OUT j(IN in) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OUT) ipChange.ipc$dispatch("fb48a3a0", new Object[]{this, in});
        }
        if (TextUtils.isEmpty(c())) {
            odg.c("LCMNN.MNNCVExecutor", "!!!getName() should be config first");
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        OUT h = h(in);
        dkg.a(c() + "_process", SystemClock.elapsedRealtime() - elapsedRealtime, this.d, d(this.d));
        return h;
    }

    public void k(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ad3e343", new Object[]{this, new Boolean(z)});
        } else {
            this.d = z;
        }
    }

    public boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b1afb612", new Object[]{this})).booleanValue();
        }
        if (this.f22979a == null) {
            return false;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        MRTRuntimeException[] mRTRuntimeExceptionArr = new MRTRuntimeException[1];
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.f22979a.g(new a(mRTRuntimeExceptionArr, elapsedRealtime, countDownLatch));
        long s = eag.s();
        try {
            countDownLatch.await(s, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            odg.c("LCMNN.MNNCVExecutor", "prepare fail: await prepareTimeoutMS=" + s + " msg=" + e.getMessage());
            e.printStackTrace();
        }
        if (mRTRuntimeExceptionArr[0] == null && this.b) {
            return true;
        }
        odg.c("LCMNN.MNNCVExecutor", " MNN Prepare fail, name=" + c() + this.b + this.c);
        return false;
    }
}
