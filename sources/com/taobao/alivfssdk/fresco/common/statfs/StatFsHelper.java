package com.taobao.alivfssdk.fresco.common.statfs;

import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class StatFsHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static StatFsHelper f;
    public static final long g = TimeUnit.MINUTES.toMillis(2);
    public volatile File b;
    public long c;

    /* renamed from: a  reason: collision with root package name */
    public volatile StatFs f6203a = null;
    public volatile boolean e = false;
    public final Lock d = new ReentrantLock();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public enum StorageType {
        INTERNAL,
        EXTERNAL;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(StorageType storageType, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/alivfssdk/fresco/common/statfs/StatFsHelper$StorageType");
        }

        public static StorageType valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (StorageType) ipChange.ipc$dispatch("6294ec06", new Object[]{str});
            }
            return (StorageType) Enum.valueOf(StorageType.class, str);
        }
    }

    static {
        t2o.a(374341761);
    }

    public static StatFs a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StatFs) ipChange.ipc$dispatch("93a95c93", new Object[]{str});
        }
        return new StatFs(str);
    }

    public static synchronized StatFsHelper d() {
        synchronized (StatFsHelper.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (StatFsHelper) ipChange.ipc$dispatch("526a73fe", new Object[0]);
            }
            if (f == null) {
                f = new StatFsHelper();
            }
            return f;
        }
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52e8f93d", new Object[]{this});
        } else if (!this.e) {
            ((ReentrantLock) this.d).lock();
            try {
                if (!this.e) {
                    this.b = Environment.getDataDirectory();
                    g();
                    this.e = true;
                }
            } finally {
                ((ReentrantLock) this.d).unlock();
            }
        }
    }

    public long c(StorageType storageType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e212cc82", new Object[]{this, storageType})).longValue();
        }
        b();
        e();
        StatFs statFs = this.f6203a;
        if (statFs != null) {
            return statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong();
        }
        return 0L;
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6cb0955", new Object[]{this});
        } else if (((ReentrantLock) this.d).tryLock()) {
            try {
                if (SystemClock.uptimeMillis() - this.c > g) {
                    g();
                }
            } finally {
                ((ReentrantLock) this.d).unlock();
            }
        }
    }

    public boolean f(StorageType storageType, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ba8faaf1", new Object[]{this, storageType, new Long(j)})).booleanValue();
        }
        b();
        long c = c(storageType);
        if (c <= 0 || c < j) {
            return true;
        }
        return false;
    }

    public final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc399add", new Object[]{this});
            return;
        }
        this.f6203a = h(this.f6203a, this.b);
        this.c = SystemClock.uptimeMillis();
    }

    public final StatFs h(StatFs statFs, File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StatFs) ipChange.ipc$dispatch("4bdd4646", new Object[]{this, statFs, file});
        }
        StatFs statFs2 = null;
        if (file == null || !file.exists()) {
            return null;
        }
        try {
            if (statFs == null) {
                statFs = a(file.getAbsolutePath());
            } else {
                statFs.restat(file.getAbsolutePath());
            }
            statFs2 = statFs;
            return statFs2;
        } catch (IllegalArgumentException unused) {
            return statFs2;
        } catch (Throwable th) {
            throw new RuntimeException(th);
        }
    }
}
