package tb;

import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class wul {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile wul i;

    /* renamed from: a  reason: collision with root package name */
    public final Path f30936a;
    public final Path b;
    public final Path c;
    public final Path d;
    public final Path e;
    public final Path f;
    public final Path g;
    public final Path h;

    static {
        t2o.a(737149075);
    }

    public wul() {
        Path path;
        Path path2;
        Path path3;
        Path path4;
        Path path5;
        Path path6;
        Path path7;
        Path path8;
        if (Build.VERSION.SDK_INT >= 26) {
            path = Globals.getApplication().getCacheDir().getParentFile().toPath();
            this.f30936a = path;
            path2 = Globals.getApplication().getCacheDir().toPath();
            this.b = path2;
            path3 = Globals.getApplication().getFilesDir().toPath();
            this.c = path3;
            File externalCacheDir = Globals.getApplication().getExternalCacheDir();
            if (externalCacheDir != null) {
                path8 = externalCacheDir.toPath();
                this.d = path8;
            }
            File externalFilesDir = Globals.getApplication().getExternalFilesDir(null);
            if (externalFilesDir != null) {
                path7 = externalFilesDir.toPath();
                this.e = path7;
            }
            path4 = Paths.get(vs3.INNER_ROOT_DIR, new String[0]);
            this.f = path4;
            path5 = Paths.get(vs3.EXTERNAL_CACHE_ROOT_DIR, new String[0]);
            this.g = path5;
            path6 = Paths.get(vs3.EXTERNAL_FILES_ROOT_DIR, new String[0]);
            this.h = path6;
        }
    }

    public static wul a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wul) ipChange.ipc$dispatch("95993c9f", new Object[0]);
        }
        if (i == null) {
            synchronized (wul.class) {
                try {
                    if (i == null) {
                        i = new wul();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return i;
    }

    public Path b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ge9.a(ipChange.ipc$dispatch("4ab745d6", new Object[]{this}));
        }
        return this.d;
    }

    public Path c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ge9.a(ipChange.ipc$dispatch("52a1d88b", new Object[]{this}));
        }
        return this.e;
    }

    public Path d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ge9.a(ipChange.ipc$dispatch("e0b8be01", new Object[]{this}));
        }
        return this.b;
    }

    public Path e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ge9.a(ipChange.ipc$dispatch("e4e21423", new Object[]{this}));
        }
        return this.f30936a;
    }

    public Path f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ge9.a(ipChange.ipc$dispatch("e8a350b6", new Object[]{this}));
        }
        return this.c;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005f A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.nio.file.Path g(java.nio.file.Path r5) {
        /*
            r4 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.wul.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x001a
            java.lang.String r1 = "d19fdaca"
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r4
            r3 = 1
            r2[r3] = r5
            java.lang.Object r5 = r0.ipc$dispatch(r1, r2)
            java.nio.file.Path r5 = tb.ge9.a(r5)
            return r5
        L_0x001a:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            r2 = 0
            if (r0 >= r1) goto L_0x0022
            return r2
        L_0x0022:
            java.nio.file.Path r0 = r4.e()
            java.nio.file.Path r0 = tb.bd9.a(r0)
            if (r0 == 0) goto L_0x0035
            boolean r1 = tb.sul.a(r5, r0)
            if (r1 == 0) goto L_0x0035
            java.nio.file.Path r1 = r4.f
            goto L_0x005d
        L_0x0035:
            java.nio.file.Path r0 = r4.b()
            java.nio.file.Path r0 = tb.bd9.a(r0)
            if (r0 == 0) goto L_0x0048
            boolean r1 = tb.sul.a(r5, r0)
            if (r1 == 0) goto L_0x0048
            java.nio.file.Path r1 = r4.g
            goto L_0x005d
        L_0x0048:
            java.nio.file.Path r0 = r4.c()
            java.nio.file.Path r0 = tb.bd9.a(r0)
            if (r0 == 0) goto L_0x005b
            boolean r1 = tb.sul.a(r5, r0)
            if (r1 == 0) goto L_0x005b
            java.nio.file.Path r1 = r4.h
            goto L_0x005d
        L_0x005b:
            r0 = r2
            r1 = r0
        L_0x005d:
            if (r0 == 0) goto L_0x006a
            if (r1 == 0) goto L_0x006a
            java.nio.file.Path r5 = tb.tul.a(r0, r5)
            java.nio.file.Path r5 = tb.uul.a(r1, r5)
            return r5
        L_0x006a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.wul.g(java.nio.file.Path):java.nio.file.Path");
    }
}
