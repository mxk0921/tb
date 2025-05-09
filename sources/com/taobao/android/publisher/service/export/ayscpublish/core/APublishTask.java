package com.taobao.android.publisher.service.export.ayscpublish.core;

import android.os.Environment;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import tb.ded;
import tb.iyp;
import tb.k4n;
import tb.oxv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public abstract class APublishTask<T extends Serializable> implements com.taobao.android.publisher.service.export.ayscpublish.core.a<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "APublishTask";
    private static final String p = "Lifecycle：";
    public static String q = "";

    /* renamed from: a  reason: collision with root package name */
    public final List<b> f9202a;
    public volatile int b;
    public String c;
    public long d;
    public volatile boolean e;
    public int f;
    public int g;
    public PublishError h;
    private StoreData<T> i;
    public T j;
    private boolean k;
    private volatile boolean l;
    private int m;
    private b n;
    private com.taobao.android.publisher.service.export.ayscpublish.core.b o;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class StoreData<T> implements Serializable {
        private static final long serialVersionUID = -177145889678111999L;
        public int mCurrStepIndex;
        public PublishError mError;
        public int mExecuteCount;
        public T mPublishData;
        public String mTID;
        public Class<? extends APublishTask> mTaskClazz;
        public long mTimestamp;
        public int mVersion;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a extends iyp {
        public a(APublishTask aPublishTask) {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static abstract class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public boolean a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("707fe605", new Object[]{this})).booleanValue();
            }
            return false;
        }

        public abstract boolean b();

        public PublishStage c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (PublishStage) ipChange.ipc$dispatch("158e6a44", new Object[]{this});
            }
            return PublishStage.DEFAULT;
        }
    }

    static {
        if (k4n.b().c().getApplication().getExternalCacheDir() != null) {
            q = k4n.b().c().getApplication().getExternalCacheDir().getAbsolutePath() + "/publish_tasks";
            return;
        }
        q = Environment.getExternalStorageDirectory().getAbsolutePath() + "/publish_tasks";
    }

    public APublishTask(T t) {
        this(t, -1);
    }

    private synchronized void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eda54296", new Object[]{this});
        } else if (j() >= 0 && j() == this.b) {
            try {
                String simpleName = this.n.getClass().getSimpleName();
                k4n.b().c().f(TAG, String.format("encounter barrier, wait at step %d(%s), total %d steps!", Integer.valueOf(this.b + 1), simpleName, Integer.valueOf(this.f9202a.size())));
                wait();
                k4n.b().c().f(TAG, String.format("barrier removed, continue execute step %d(%s), total %d steps!", Integer.valueOf(this.b + 1), simpleName, Integer.valueOf(this.f9202a.size())));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dabca919", new Object[]{this, str})).booleanValue();
        }
        if (this.g < k4n.b().c().c()) {
            return false;
        }
        f(PublishError.CODE_EXCEED_RETRY_COUNT, str, true);
        q();
        k().i(this, this.h);
        d();
        return true;
    }

    private String n(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9778c7d3", new Object[]{this, str});
        }
        return q + "/" + str;
    }

    private void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d875d194", new Object[]{this});
        } else if (!p()) {
            s();
        }
    }

    private synchronized void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2080268a", new Object[]{this});
            return;
        }
        this.m = -1;
        if (this.l) {
            notify();
        }
    }

    public void A(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("faf811b1", new Object[]{this, new Boolean(z)});
        } else {
            this.k = z;
        }
    }

    public void B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
        } else if (this.f9202a.size() <= 0 || isFinished()) {
            k4n.b().c().d(TAG, "empty task, start failed");
        } else {
            this.l = true;
            this.g++;
            v();
            h();
            this.l = false;
        }
    }

    public int D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("34fbb28d", new Object[]{this})).intValue();
        }
        return 0;
    }

    @Override // com.taobao.android.publisher.service.export.ayscpublish.core.a
    public String E0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fbb6c340", new Object[]{this});
        }
        return this.c;
    }

    @Override // com.taobao.android.publisher.service.export.ayscpublish.core.a
    public T L0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ((Serializable) ipChange.ipc$dispatch("c886bf00", new Object[]{this}));
        }
        return this.j;
    }

    public abstract void a();

    @Override // com.taobao.android.publisher.service.export.ayscpublish.core.a
    public PublishStage c0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PublishStage) ipChange.ipc$dispatch("158e6a44", new Object[]{this});
        }
        b bVar = this.n;
        if (bVar == null) {
            return PublishStage.DEFAULT;
        }
        return bVar.c();
    }

    @Override // com.taobao.android.publisher.service.export.ayscpublish.core.a
    public boolean cancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("707fe605", new Object[]{this})).booleanValue();
        }
        if (this.e || isFinished()) {
            k4n.b().c().d(TAG, "cancel failed!");
            return false;
        }
        this.e = true;
        b bVar = this.n;
        if (bVar != null) {
            bVar.a();
        }
        z();
        return true;
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0306f9b", new Object[]{this});
            return;
        }
        k4n.b().c().a(TAG, "Lifecycle： destoryed");
        k().f(this);
    }

    public void e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("519cec8c", new Object[]{this, str, str2});
        } else {
            f(str, str2, false);
        }
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (!(obj instanceof com.taobao.android.publisher.service.export.ayscpublish.core.a)) {
            return false;
        }
        return E0().equals(((com.taobao.android.publisher.service.export.ayscpublish.core.a) obj).E0());
    }

    public void f(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e20157c8", new Object[]{this, str, str2, new Boolean(z)});
        } else {
            this.h.setError(str, str2, z);
        }
    }

    public void g(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b34a4bd2", new Object[]{this, str, new Boolean(z)});
        } else {
            f(str, "unknown", z);
        }
    }

    @Override // com.taobao.android.publisher.service.export.ayscpublish.core.a
    @Deprecated
    public T getData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ((Serializable) ipChange.ipc$dispatch("9c7e95a3", new Object[]{this}));
        }
        return this.j;
    }

    @Override // com.taobao.android.publisher.service.export.ayscpublish.core.a
    public PublishError getError() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PublishError) ipChange.ipc$dispatch("ac2ae204", new Object[]{this});
        }
        if (!TextUtils.isEmpty(this.h.errorCode) || !TextUtils.isEmpty(this.h.errorMsg)) {
            return this.h;
        }
        return null;
    }

    @Override // com.taobao.android.publisher.service.export.ayscpublish.core.a
    public long getTimestamp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3737eedb", new Object[]{this})).longValue();
        }
        return this.d;
    }

    public String i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b6964142", new Object[]{this});
        }
        return "DEFAULT";
    }

    @Override // com.taobao.android.publisher.service.export.ayscpublish.core.a
    public b i0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("e568cf0c", new Object[]{this});
        }
        return this.n;
    }

    @Override // com.taobao.android.publisher.service.export.ayscpublish.core.a
    public boolean isFinished() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9673ae47", new Object[]{this})).booleanValue();
        }
        if (this.b >= this.f9202a.size()) {
            return true;
        }
        return false;
    }

    public synchronized int j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ffa73cdf", new Object[]{this})).intValue();
        }
        return this.m;
    }

    public com.taobao.android.publisher.service.export.ayscpublish.core.b k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.publisher.service.export.ayscpublish.core.b) ipChange.ipc$dispatch("746042be", new Object[]{this});
        }
        if (p()) {
            return this.o;
        }
        return c.t();
    }

    public float l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8ba5fa9a", new Object[]{this})).floatValue();
        }
        if (this.f9202a.size() == 0) {
            return 0.0f;
        }
        return this.b / this.f9202a.size();
    }

    public int m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c28eed5d", new Object[]{this})).intValue();
        }
        return this.f9202a.size();
    }

    public synchronized boolean p() {
        boolean z = false;
        synchronized (this) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("43ff2d53", new Object[]{this})).booleanValue();
            }
            if (this.m != -1) {
                z = true;
            }
            return z;
        }
    }

    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("268aa01f", new Object[]{this});
            return;
        }
        k4n.b().c().a(TAG, "Lifecycle： canceled");
        k().h(this);
        d();
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
        } else {
            B();
        }
    }

    public void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df809aa", new Object[]{this});
        }
    }

    public void t(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9d25a5c", new Object[]{this, new Boolean(z)});
        } else if (z) {
            k4n.b().c().f(TAG, "Lifecycle： finished, result=success");
            k().e(this);
            d();
        } else {
            ded c = k4n.b().c();
            PublishError publishError = this.h;
            String str = publishError.errorCode;
            String str2 = publishError.errorMsg;
            c.d(TAG, "Lifecycle： onFinished, result=failed, errorCode=" + str + ", errorMsg=" + str2);
            k().i(this, this.h);
        }
    }

    public void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2145010", new Object[]{this});
            return;
        }
        k4n.b().c().a(TAG, "Lifecycle： retry");
        k().b(this);
    }

    public void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        k4n.b().c().f(TAG, String.format("%s started, execute count=%d", p, Integer.valueOf(this.g)));
        k().d(this);
        k().g(this, this.b / this.f9202a.size());
    }

    public int w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bca059a4", new Object[]{this})).intValue();
        }
        return this.m;
    }

    public void x(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ded386fc", new Object[]{this, bVar});
        } else {
            this.f9202a.add(bVar);
        }
    }

    public synchronized void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5f0699a", new Object[]{this});
            return;
        }
        this.m = -1;
        if (this.l) {
            k().c(this);
            k().d(this);
            k().g(this, l());
            notify();
            return;
        }
        PublishError error = getError();
        if (error != null) {
            k().c(this);
            k().d(this);
            k().g(this, l());
            k().i(this, error);
            if (error.isFatalError()) {
                q();
                k().f(this);
            }
        }
    }

    public APublishTask(T t, int i) {
        this.f9202a = new ArrayList();
        this.b = 0;
        this.e = false;
        this.f = 0;
        this.g = 0;
        this.h = new PublishError();
        this.i = new StoreData<>();
        this.k = true;
        this.l = false;
        this.m = -1;
        this.o = new a(this);
        this.c = String.format("%d_%s", Long.valueOf(System.currentTimeMillis()), k4n.b().c().getUserId());
        this.d = System.currentTimeMillis();
        this.j = t;
        this.m = i;
        a();
        this.m = w();
    }

    @Override // com.taobao.android.publisher.service.export.ayscpublish.core.a
    public void C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68db726f", new Object[]{this});
            return;
        }
        try {
            if (this.k && !p()) {
                long currentTimeMillis = System.currentTimeMillis();
                oxv.b(n(this.c));
                k4n.b().c().f(TAG, String.format("task unstore, cost %d ms", Long.valueOf(System.currentTimeMillis() - currentTimeMillis)));
            }
        } catch (Throwable th) {
            ded c = k4n.b().c();
            String th2 = th.toString();
            c.d(TAG, "task unstore failed, exception=" + th2);
        }
    }

    @Override // com.taobao.android.publisher.service.export.ayscpublish.core.a
    public void L() {
        ObjectOutputStream objectOutputStream;
        Throwable th;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64c724e8", new Object[]{this});
        } else if (this.k && !p()) {
            long currentTimeMillis = System.currentTimeMillis();
            StoreData<T> storeData = this.i;
            storeData.mTID = this.c;
            storeData.mTimestamp = this.d;
            storeData.mCurrStepIndex = this.b;
            StoreData<T> storeData2 = this.i;
            storeData2.mExecuteCount = this.g;
            storeData2.mPublishData = getData();
            StoreData<T> storeData3 = this.i;
            storeData3.mError = this.h;
            storeData3.mTaskClazz = getClass();
            this.i.mVersion = D();
            File file = new File(q);
            if (!file.exists()) {
                file.mkdir();
            }
            FileOutputStream fileOutputStream = null;
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(n(this.c));
                try {
                    objectOutputStream = new ObjectOutputStream(fileOutputStream2);
                    try {
                        objectOutputStream.writeObject(this.i);
                        objectOutputStream.flush();
                        k4n.b().c().f(TAG, String.format("task store, cost %d ms", Long.valueOf(System.currentTimeMillis() - currentTimeMillis)));
                        oxv.a(fileOutputStream2);
                    } catch (Throwable th2) {
                        th = th2;
                        fileOutputStream = fileOutputStream2;
                        try {
                            k4n.b().c().d(TAG, "task store failed, exception=" + th.toString());
                            oxv.a(fileOutputStream);
                            oxv.a(objectOutputStream);
                        } catch (Throwable th3) {
                            oxv.a(fileOutputStream);
                            oxv.a(objectOutputStream);
                            throw th3;
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    objectOutputStream = null;
                }
            } catch (Throwable th5) {
                th = th5;
                objectOutputStream = null;
            }
            oxv.a(objectOutputStream);
        }
    }

    private void o(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70310763", new Object[]{this, str});
        } else if (this.e) {
            r();
        } else if (this.h.isFatalError()) {
            q();
            k().i(this, this.h);
            d();
        } else if (this.f >= k4n.b().c().e()) {
            k4n.b().c().d(TAG, String.format("retry count(%d) >= max count(%d), stop retry", Integer.valueOf(this.f), Integer.valueOf(k4n.b().c().e())));
            if (this.h.isNetworkError()) {
                this.g--;
            }
            L();
            if (!c(str + "--" + this.h.errorMsg)) {
                t(false);
            }
        } else {
            k4n.b().c().a(TAG, String.format("retry step %d! total %d steps", Integer.valueOf(this.b + 1), Integer.valueOf(this.f9202a.size())));
            L();
            this.f++;
            u();
            h();
        }
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bf42839", new Object[]{this});
            return;
        }
        b bVar = this.f9202a.get(this.b);
        this.n = bVar;
        String simpleName = bVar.getClass().getSimpleName();
        b();
        if (this.e) {
            r();
            return;
        }
        k().a(this, this.n);
        k4n.b().c().f(TAG, String.format("execute step %d(%s), total %d steps!", Integer.valueOf(this.b + 1), simpleName, Integer.valueOf(this.f9202a.size())));
        long currentTimeMillis = System.currentTimeMillis();
        if (!this.n.b()) {
            k4n.b().c().d(TAG, String.format("step %d(%s) execute failed! total %d steps, retry count = %d", Integer.valueOf(this.b + 1), simpleName, Integer.valueOf(this.f9202a.size()), Integer.valueOf(this.f)));
            o(simpleName);
        } else if (this.e) {
            r();
        } else {
            k4n.b().c().f(TAG, String.format("step %d(%s) execute success!,cost=%d ms, total %d steps!", Integer.valueOf(this.b + 1), simpleName, Long.valueOf(System.currentTimeMillis() - currentTimeMillis), Integer.valueOf(this.f9202a.size())));
            this.b++;
            L();
            k().g(this, l());
            if (isFinished()) {
                t(true);
            } else {
                h();
            }
        }
    }
}
