package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mrt.task.desc.MRTPythonLibDescription;
import com.taobao.mrt.task.desc.MRTResourceDescription;
import java.io.File;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import tb.dv7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class rqh {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static rqh c;

    /* renamed from: a  reason: collision with root package name */
    public final long f27556a = 30;
    public final ConcurrentHashMap<String, MRTPythonLibDescription> b = new ConcurrentHashMap<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements dv7.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ MRTPythonLibDescription f27557a;
        public final /* synthetic */ int[] b;
        public final /* synthetic */ CountDownLatch c;

        public a(MRTPythonLibDescription mRTPythonLibDescription, int[] iArr, CountDownLatch countDownLatch) {
            this.f27557a = mRTPythonLibDescription;
            this.b = iArr;
            this.c = countDownLatch;
        }

        @Override // tb.dv7.a
        public void a(boolean z, Exception exc, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("aff9c19e", new Object[]{this, new Boolean(z), exc, str});
                return;
            }
            kgh.j("MRTPythonLibSyncer", "download pythonlib completion: " + z + " : " + str);
            if (z && rqh.a(rqh.this, str, this.f27557a)) {
                int[] iArr = this.b;
                iArr[0] = iArr[0] + 1;
            }
            this.c.countDown();
        }
    }

    static {
        t2o.a(577765397);
    }

    public static /* synthetic */ boolean a(rqh rqhVar, String str, MRTResourceDescription mRTResourceDescription) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("70aaafa6", new Object[]{rqhVar, str, mRTResourceDescription})).booleanValue();
        }
        return rqhVar.d(str, mRTResourceDescription);
    }

    public static synchronized rqh b() {
        synchronized (rqh.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (rqh) ipChange.ipc$dispatch("ee049188", new Object[0]);
            }
            if (c == null) {
                c = new rqh();
            }
            return c;
        }
    }

    public boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("54fa19ed", new Object[]{this, str})).booleanValue();
        }
        return this.b.contains(str);
    }

    public void e(MRTPythonLibDescription mRTPythonLibDescription) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f90d3a01", new Object[]{this, mRTPythonLibDescription});
        } else if (mRTPythonLibDescription == null || TextUtils.isEmpty(mRTPythonLibDescription.resourceName)) {
            kgh.s("MRTPythonLibSyncer", "registerPythonLib error!!!, description or name null!");
        } else {
            kgh.j("MRTPythonLibSyncer", "registerPythonLib: " + mRTPythonLibDescription.resourceName + " success!!!");
            this.b.put(mRTPythonLibDescription.resourceName, mRTPythonLibDescription);
        }
    }

    public final boolean d(String str, MRTResourceDescription mRTResourceDescription) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("15e5bfa3", new Object[]{this, str, mRTResourceDescription})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            kgh.s("MRTPythonLibSyncer", "zipFilePath is null");
            return false;
        } else if (TextUtils.isEmpty(mRTResourceDescription.resourceRootDirectory)) {
            kgh.s("MRTPythonLibSyncer", "resourceRootDirectory is null");
            return false;
        } else {
            File file = new File(str);
            File file2 = new File(mRTResourceDescription.resourceRootDirectory, mRTResourceDescription.resourceName);
            if (file2.exists()) {
                file2.delete();
            }
            vqh vqhVar = mRTResourceDescription.resourceOperation;
            if (vqhVar == null) {
                kgh.s("MRTPythonLibSyncer", "operation is null");
                return false;
            } else if (!vqhVar.b(str)) {
                kgh.s("MRTPythonLibSyncer", "zipRet is error");
                return false;
            } else {
                try {
                    z = vqhVar.c();
                    if (z) {
                        wqh.a().c(mRTResourceDescription);
                        mqh.s(mRTResourceDescription);
                    }
                    vqhVar.a(file2.getAbsolutePath());
                } catch (Exception e) {
                    kgh.t("MRTPythonLibSyncer", "validate file failed", e);
                }
                file.delete();
                kgh.j("MRTPythonLibSyncer", "zip python lib success");
                return z;
            }
        }
    }

    public synchronized boolean f() {
        boolean z = false;
        synchronized (this) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("83dcbb54", new Object[]{this})).booleanValue();
            }
            Set<String> keySet = this.b.keySet();
            HashSet hashSet = new HashSet();
            hashSet.addAll(keySet);
            Iterator it = hashSet.iterator();
            int size = hashSet.size();
            int[] iArr = {0};
            while (it.hasNext()) {
                MRTPythonLibDescription mRTPythonLibDescription = this.b.get((String) it.next());
                if (wqh.a().b(mRTPythonLibDescription)) {
                    iArr[0] = iArr[0] + 1;
                } else if (mqh.l(mRTPythonLibDescription) == 0) {
                    wqh.a().c(mRTPythonLibDescription);
                    iArr[0] = iArr[0] + 1;
                    ((sqh) mRTPythonLibDescription.resourceOperation).e();
                } else {
                    CountDownLatch countDownLatch = new CountDownLatch(1);
                    kgh.j("MRTPythonLibSyncer", "=============DownloadLib: " + mRTPythonLibDescription.resourceName);
                    iqh.b().a(mRTPythonLibDescription, new a(mRTPythonLibDescription, iArr, countDownLatch));
                    try {
                        countDownLatch.await(this.f27556a, TimeUnit.SECONDS);
                    } catch (InterruptedException e) {
                        kgh.t("MRTPythonLibSyncer", "timeout", e);
                    }
                }
            }
            if (iArr[0] == size) {
                z = true;
            }
            return z;
        }
    }
}
