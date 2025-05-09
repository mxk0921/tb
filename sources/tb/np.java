package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alivfssdk.fresco.cache.common.b;
import com.taobao.alivfssdk.fresco.cache.disk.DefaultDiskStorage;
import com.taobao.alivfssdk.fresco.cache.disk.b;
import com.taobao.android.launcher.common.LauncherRuntime;
import com.taobao.tao.log.TLog;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class np implements Closeable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Integer h = 259200;
    public static final Map<String, Integer> i = new HashMap();
    public static Integer j = 259200;
    public static int k = 4194304;
    public static boolean l = false;
    public static boolean m = false;

    /* renamed from: a  reason: collision with root package name */
    public final String f24876a;
    public fdb b;
    public fdb c;
    public fdb d;
    public final op e = op.a();
    public final File f;
    public ClassLoader g;

    static {
        t2o.a(374341649);
    }

    public np(String str, File file) {
        this.f24876a = str;
        this.f = file;
        if (file == null) {
            c4k w = c4k.w();
            this.d = w;
            this.c = w;
            this.b = w;
        }
    }

    public String A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c8cdd20c", new Object[]{this});
        }
        return this.f24876a;
    }

    public fdb C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fdb) ipChange.ipc$dispatch("78cb08c7", new Object[]{this});
        }
        return F(false);
    }

    public fdb F(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fdb) ipChange.ipc$dispatch("42ec7ad", new Object[]{this, new Boolean(z)});
        }
        if (z) {
            if (this.d == null) {
                this.d = a(z);
            }
            return this.d;
        }
        if (this.c == null) {
            this.c = a(z);
        }
        return this.c;
    }

    public np L(op opVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (np) ipChange.ipc$dispatch("292ba523", new Object[]{this, opVar});
        }
        this.e.b(opVar);
        return this;
    }

    public np Z(ClassLoader classLoader) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (np) ipChange.ipc$dispatch("949b1225", new Object[]{this, classLoader});
        }
        this.g = classLoader;
        return this;
    }

    public void clearAll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c823e69b", new Object[]{this});
            return;
        }
        try {
            close();
        } catch (IOException e) {
            pp.d("AVFSCache", e, new Object[0]);
        }
        File file = this.f;
        if (file != null) {
            de9.a(file);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
            return;
        }
        fdb fdbVar = this.b;
        if (fdbVar != null) {
            fdbVar.close();
            this.b = null;
        }
        fdb fdbVar2 = this.c;
        if (fdbVar2 != null) {
            fdbVar2.close();
            this.c = null;
        }
        fdb fdbVar3 = this.d;
        if (fdbVar3 != null) {
            fdbVar3.close();
            this.d = null;
        }
    }

    public ClassLoader e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ClassLoader) ipChange.ipc$dispatch("8d8cecd6", new Object[]{this});
        }
        return this.g;
    }

    public void finalize() throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a35321a5", new Object[]{this});
        } else {
            super.finalize();
        }
    }

    public File g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("31f6576f", new Object[]{this});
        }
        return this.f;
    }

    public final fdb a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fdb) ipChange.ipc$dispatch("26eb60d3", new Object[]{this, new Boolean(z)});
        }
        return new vp(this, azi.CACHE_SQL, new uno(this.f, 1, z, b.b()), new b.c(0, 0L, this.e.f25538a.longValue()), (int) this.e.c);
    }

    public fdb w() {
        String str;
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fdb) ipChange.ipc$dispatch("fb72b3d7", new Object[]{this});
        }
        if (this.b == null) {
            if (!m) {
                synchronized (np.class) {
                    if (!m) {
                        if (gp.a() != null) {
                            k7h d = k7h.d();
                            d.g(gp.a().getFilesDir().getAbsolutePath());
                            String b = d.b("ali_database_es", "ttl_seconds");
                            if (b != null) {
                                try {
                                    int parseInt = Integer.parseInt(b);
                                    if (parseInt <= 0) {
                                        parseInt = h.intValue();
                                    }
                                    j = Integer.valueOf(parseInt);
                                } catch (Exception unused) {
                                }
                            }
                            String b2 = d.b("ali_database_es", "lsm_white_list");
                            if (b2 != null) {
                                try {
                                    for (String str2 : b2.split(",")) {
                                        String b3 = d.b("ali_database_es", str2 + "_ttl");
                                        if (!TextUtils.isEmpty(b3)) {
                                            ((HashMap) i).put(str2, Integer.valueOf(Integer.parseInt(b3)));
                                        } else {
                                            ((HashMap) i).put(str2, j);
                                        }
                                    }
                                } catch (Exception unused2) {
                                }
                            } else {
                                Map<String, Integer> map = i;
                                ((HashMap) map).put("phximgs_top1", j);
                                ((HashMap) map).put("phximgs_top2", j);
                                ((HashMap) map).put("phximgs_top3", j);
                                ((HashMap) map).put("phximgs_top4", j);
                            }
                            String b4 = d.b("ali_database_es", "wal_size");
                            if (b4 != null) {
                                try {
                                    int parseInt2 = Integer.parseInt(b4);
                                    if (parseInt2 <= 0) {
                                        parseInt2 = 4194304;
                                    }
                                    k = parseInt2;
                                } catch (Exception unused3) {
                                }
                            }
                            String b5 = d.b("ali_database_es", "ignore_ttl_before_compact");
                            if (b5 != null && "true".equals(b5)) {
                                l = true;
                            }
                        }
                        m = true;
                    }
                }
            }
            HashMap hashMap = (HashMap) i;
            if (!hashMap.containsKey(this.f24876a) || !TextUtils.equals(LauncherRuntime.c, LauncherRuntime.b)) {
                this.b = new vp(this, "file", new DefaultDiskStorage(new File(this.f, vs3.FILES_DIR_NAME), 1, com.taobao.alivfssdk.fresco.cache.common.b.b()), new b.c(0, 0L, this.e.f25538a.longValue()), (int) this.e.b);
            } else {
                Integer num = (Integer) hashMap.get(this.f24876a);
                if (num != null) {
                    this.b = sdg.D0(this.f24876a, k, num.intValue(), l);
                    StringBuilder sb = new StringBuilder("lsm_module=");
                    sb.append(this.f24876a);
                    sb.append(", ttl=");
                    sb.append(j);
                    sb.append(", wal_size=");
                    sb.append(k);
                    sb.append(", ignoreTTL=");
                    if (l) {
                        str = "true";
                    } else {
                        str = "false";
                    }
                    sb.append(str);
                    TLog.loge("AVFSCache", "ALI_VFS", sb.toString());
                }
            }
        }
        return this.b;
    }
}
