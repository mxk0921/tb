package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mrt.task.MRTRuntimeException;
import com.taobao.mrt.task.desc.MRTCodeDescription;
import com.taobao.mrt.task.desc.MRTFilesDescription;
import com.taobao.mrt.task.desc.MRTResourceDescription;
import com.taobao.mrt.task.desc.MRTTaskDescription;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import tb.dv7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class hqh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final MRTTaskDescription f20820a;
    public final ArrayList b = new ArrayList();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements dv7.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ MRTResourceDescription f20821a;
        public final /* synthetic */ int b;
        public final /* synthetic */ CountDownLatch c;

        public a(MRTResourceDescription mRTResourceDescription, int i, CountDownLatch countDownLatch) {
            this.f20821a = mRTResourceDescription;
            this.b = i;
            this.c = countDownLatch;
        }

        @Override // tb.dv7.a
        public void a(boolean z, Exception exc, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("aff9c19e", new Object[]{this, new Boolean(z), exc, str});
                return;
            }
            if (z && hqh.a(hqh.this, str, this.f20821a)) {
                hqh.b(hqh.this).set(this.b, null);
            }
            this.c.countDown();
        }
    }

    static {
        t2o.a(577765412);
    }

    public hqh(MRTTaskDescription mRTTaskDescription) {
        this.f20820a = mRTTaskDescription;
    }

    public static /* synthetic */ boolean a(hqh hqhVar, String str, MRTResourceDescription mRTResourceDescription) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3db5570", new Object[]{hqhVar, str, mRTResourceDescription})).booleanValue();
        }
        return hqhVar.c(str, mRTResourceDescription);
    }

    public static /* synthetic */ ArrayList b(hqh hqhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("8422f0de", new Object[]{hqhVar});
        }
        return hqhVar.b;
    }

    public final void d(MRTResourceDescription mRTResourceDescription) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5a860ca", new Object[]{this, mRTResourceDescription});
            return;
        }
        vqh vqhVar = mRTResourceDescription.resourceOperation;
        if (vqhVar != null) {
            vqhVar.a(mRTResourceDescription.resourceRootDirectory + File.separator + mRTResourceDescription.resourceName);
        }
    }

    public final boolean c(String str, MRTResourceDescription mRTResourceDescription) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("15e5bfa3", new Object[]{this, str, mRTResourceDescription})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            kgh.s("MRTDownloadTask", "zipFilePath is null");
            return false;
        } else if (TextUtils.isEmpty(mRTResourceDescription.resourceRootDirectory)) {
            kgh.s("MRTDownloadTask", "resourceRootDirectory is null");
            return false;
        } else {
            File file = new File(str);
            File file2 = new File(mRTResourceDescription.resourceRootDirectory, mRTResourceDescription.resourceName);
            if (file2.exists()) {
                file2.delete();
            }
            vqh vqhVar = mRTResourceDescription.resourceOperation;
            if (vqhVar == null || !vqhVar.b(str)) {
                return false;
            }
            try {
                z = vqhVar.c();
                if (z) {
                    wqh.a().c(mRTResourceDescription);
                    mqh.s(mRTResourceDescription);
                }
                vqhVar.a(file2.getAbsolutePath());
            } catch (Exception e) {
                kgh.d("MRTDownloadTask", "validate file failed", e);
            }
            file.delete();
            return z;
        }
    }

    public int e(List list) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8af8cd95", new Object[]{this, list})).intValue();
        }
        ArrayList arrayList = new ArrayList();
        MRTCodeDescription mRTCodeDescription = this.f20820a.model;
        if (mRTCodeDescription != null) {
            arrayList.add(mRTCodeDescription);
            this.b.add(this.f20820a.model);
        }
        MRTFilesDescription mRTFilesDescription = this.f20820a.resource;
        if (mRTFilesDescription != null) {
            arrayList.add(mRTFilesDescription);
            this.b.add(this.f20820a.resource);
        }
        if (!rqh.b().f()) {
            list.add(new MRTRuntimeException(57, "basic libs check failed"));
            return MRTResourceDescription.MRTResourceNone;
        }
        arrayList.size();
        int i2 = MRTResourceDescription.MRTResourceNone;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            MRTResourceDescription mRTResourceDescription = (MRTResourceDescription) arrayList.get(i3);
            if (oqh.d().g(this.f20820a.name) || !wqh.a().b(mRTResourceDescription)) {
                synchronized (mRTResourceDescription) {
                    try {
                        if (mqh.l(mRTResourceDescription) == 0) {
                            wqh.a().c(mRTResourceDescription);
                            d(mRTResourceDescription);
                            this.b.set(i3, null);
                        } else {
                            i2 |= mRTResourceDescription.resourceMask;
                            CountDownLatch countDownLatch = new CountDownLatch(1);
                            iqh.b().a(mRTResourceDescription, new a(mRTResourceDescription, i3, countDownLatch));
                            try {
                                countDownLatch.await(45L, TimeUnit.SECONDS);
                            } catch (InterruptedException e) {
                                kgh.t("MRTDownloadTask", "timeout", e);
                                list.add(new MRTRuntimeException(127, ""));
                                return 0;
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } else {
                this.b.set(i3, null);
            }
        }
        int size = this.b.size();
        if (size > 0) {
            while (true) {
                if (i >= size) {
                    break;
                } else if (this.b.get(i) == null) {
                    i++;
                } else if (list.size() == 0) {
                    list.add(new MRTRuntimeException(127, "download failed"));
                }
            }
        }
        if (list.size() == 0) {
            oqh.d().m(this.f20820a.name);
        }
        return i2;
    }
}
