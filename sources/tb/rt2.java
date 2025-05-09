package tb;

import android.os.Build;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.cachecleaner.monitor.fileswalker.FileTreeWalkerNew;
import com.taobao.android.cachecleaner.monitor.info.CacheOverviewInfo;
import com.taobao.tao.log.TLog;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.EnumSet;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class rt2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public ce9 f27589a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a implements hh9<Path> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final ce9 f27590a;
        public final boolean b;
        public final long[] c;

        static {
            t2o.a(737149054);
            t2o.a(737149047);
        }

        public a(ce9 ce9Var, long[] jArr, boolean z) {
            this.b = z;
            this.f27590a = ce9Var;
            this.c = jArr;
        }

        public /* bridge */ /* synthetic */ int a(Object obj, BasicFileAttributes basicFileAttributes, long j, IOException iOException) throws IOException {
            return b(ge9.a(obj), basicFileAttributes, j, iOException);
        }

        public int b(Path path, BasicFileAttributes basicFileAttributes, long j, IOException iOException) throws IOException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("84244239", new Object[]{this, path, basicFileAttributes, new Long(j), iOException})).intValue();
            }
            if (this.b) {
                this.f27590a.d(path, basicFileAttributes, j);
            } else {
                this.f27590a.b(path, basicFileAttributes, j);
            }
            return 0;
        }

        public /* bridge */ /* synthetic */ int c(Object obj, BasicFileAttributes basicFileAttributes) throws IOException {
            return d(ge9.a(obj), basicFileAttributes);
        }

        public int d(Path path, BasicFileAttributes basicFileAttributes) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("e934bbe6", new Object[]{this, path, basicFileAttributes})).intValue();
            }
            return 0;
        }

        public /* bridge */ /* synthetic */ int e(Object obj, BasicFileAttributes basicFileAttributes) throws IOException {
            return f(ge9.a(obj), basicFileAttributes);
        }

        public int f(Path path, BasicFileAttributes basicFileAttributes) {
            long size;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("b982cea4", new Object[]{this, path, basicFileAttributes})).intValue();
            }
            try {
                size = basicFileAttributes.size();
                long[] jArr = this.c;
                jArr[0] = jArr[0] + size;
                this.f27590a.c(path, basicFileAttributes);
            } catch (Throwable th) {
                th.printStackTrace();
            }
            return 0;
        }

        public /* bridge */ /* synthetic */ int g(Object obj, IOException iOException) throws IOException {
            return h(ge9.a(obj), iOException);
        }

        public int h(Path path, IOException iOException) throws IOException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("4acc0d3d", new Object[]{this, path, iOException})).intValue();
            }
            return 0;
        }
    }

    static {
        t2o.a(737149053);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c48a5579", new Object[]{this});
        } else {
            this.f27589a = null;
        }
    }

    public Map<String, Long> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("ba770548", new Object[]{this});
        }
        return this.f27589a.a();
    }

    public void d(CacheOverviewInfo cacheOverviewInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a69dff9c", new Object[]{this, cacheOverviewInfo});
        } else {
            this.f27589a.f(cacheOverviewInfo);
        }
    }

    public long b(File file, boolean z) {
        Path path;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5de76b9c", new Object[]{this, file, new Boolean(z)})).longValue();
        }
        if (file == null) {
            Log.e(yr2.MODULE, "visit: rootFile is empty!");
            return 0L;
        }
        if (this.f27589a == null) {
            this.f27589a = new ce9();
        }
        long[] jArr = {0};
        if (Build.VERSION.SDK_INT < 26) {
            return 0L;
        }
        try {
            TLog.loge(yr2.MODULE, yr2.MODULE, "walkFileTreeNew.start.rootFile=" + file.getAbsolutePath());
            path = file.toPath();
            FileTreeWalkerNew.c0(path, EnumSet.noneOf(qt2.a()), hg4.j().i().getMaxDeepLevel(), new a(this.f27589a, jArr, z));
            TLog.loge(yr2.MODULE, yr2.MODULE, "walkFileTreeNew.end.rootFile=" + file.getAbsolutePath() + ".totalSize=" + jArr[0]);
            return jArr[0];
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
