package com.taobao.android.nanocompose.resource_loader.download;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nanocompose.resource_loader.template.TemplateItem;
import com.taobao.homepage.pop.utils.PopConst;
import java.io.File;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import tb.a07;
import tb.ckf;
import tb.eoz;
import tb.iiz;
import tb.k5z;
import tb.o0z;
import tb.t2o;
import tb.v6z;
import tb.w6z;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class SingleDownloadTask extends DownloadTask {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final k5z d;
    public final eoz e;

    static {
        t2o.a(598737209);
    }

    public /* synthetic */ SingleDownloadTask(String str, long j, k5z k5zVar, eoz eozVar, boolean z, int i, a07 a07Var) {
        this(str, j, k5zVar, eozVar, (i & 16) != 0 ? true : z);
    }

    public static /* synthetic */ void h(SingleDownloadTask singleDownloadTask, boolean z, String str, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("690f446b", new Object[]{singleDownloadTask, new Boolean(z), str, new Integer(i), obj});
            return;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        singleDownloadTask.g(z, str);
    }

    public static /* synthetic */ Object ipc$super(SingleDownloadTask singleDownloadTask, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 900703939) {
            singleDownloadTask.e();
            return null;
        } else if (hashCode == 1887430145) {
            singleDownloadTask.a();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/nanocompose/resource_loader/download/SingleDownloadTask");
        }
    }

    public final k5z f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (k5z) ipChange.ipc$dispatch("7e37455a", new Object[]{this});
        }
        return this.d;
    }

    public final void g(boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c06690b3", new Object[]{this, new Boolean(z), str});
        } else {
            this.e.a(this.d.b(), z, str);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleDownloadTask(String str, long j, k5z k5zVar, eoz eozVar, boolean z) {
        super(str, j, z);
        ckf.g(str, PopConst.BRIDGE_KEY_BUSINESS_ID);
        ckf.g(k5zVar, "downloadRequest");
        ckf.g(eozVar, "completionCallback");
        this.d = k5zVar;
        this.e = eozVar;
        if (k5zVar.b() == null) {
            throw new IllegalArgumentException("download templateItem is null");
        }
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("deb96e34", new Object[]{this});
            return;
        }
        TemplateItem b = this.d.b();
        if (this.d.a().length() == 0 || b.d().length() == 0) {
            g(false, "cachedFilePath is invalid or templateItem.url is empty");
            return;
        }
        ReentrantReadWriteLock.WriteLock writeLock = o0z.INSTANCE.a(c()).writeLock();
        ckf.f(writeLock, "CacheFileLockManager.getLock(businessID = businessID).writeLock()");
        writeLock.lock();
        try {
            String e = w6z.Companion.a().e(b.d());
            if (new File(e).exists()) {
                boolean h = v6z.h(v6z.INSTANCE, new File(e), new File(f().a()), 0, 4, null);
                if (iiz.c()) {
                    iiz.a aVar = iiz.Companion;
                    aVar.j("文件解压的结果为 " + h + " 解压的路径为 " + f().a());
                }
                if (h) {
                    f().b().i(ckf.p(f().a(), "/nano.dx"));
                    g(true, null);
                } else {
                    g(false, "文件解压失败");
                }
                h(this, true, null, 2, null);
                writeLock.unlock();
                return;
            }
            b(b, f().a(), new SingleDownloadTask$resume$1$2(this));
            xhv xhvVar = xhv.INSTANCE;
            writeLock.unlock();
        } catch (Throwable th) {
            writeLock.unlock();
            throw th;
        }
    }
}
