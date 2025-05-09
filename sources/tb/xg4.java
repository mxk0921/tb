package tb;

import android.app.Application;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.preference.PreferenceManager;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class xg4 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DEFAULT_MAX_AGE = 21600000;
    public static final long DEFAULT_SMALL_MAX_AGE = 1800000;
    public static final String KEY_DATA = "wv-data";
    public static final String KEY_TIME = "wv-time";
    public static final String ROOT_WINDVANE_CONFIG_DIR = "windvane/config";

    /* renamed from: a  reason: collision with root package name */
    public static final String f31371a = "ConfigStorage";
    public static final ReentrantReadWriteLock b = new ReentrantReadWriteLock();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f31372a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;

        public a(String str, String str2, String str3) {
            this.f31372a = str;
            this.b = str2;
            this.c = str3;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            String a2 = xg4.a(this.f31372a, this.b);
            try {
                sb9.h(xg4.b(a2), ByteBuffer.wrap(this.c.getBytes()));
            } catch (Exception unused) {
                String c = xg4.c();
                v7t.d(c, "can not sava file : " + a2 + " value : " + this.c);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f31373a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;

        public b(String str, String str2, String str3) {
            this.f31373a = str;
            this.b = str2;
            this.c = str3;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            xg4.d().writeLock().lock();
            String a2 = xg4.a(this.f31373a, this.b);
            try {
                sb9.h(xg4.b(a2), ByteBuffer.wrap(this.c.getBytes()));
                String c = xg4.c();
                v7t.d(c, "putStringValByLock: " + a2 + " value : " + this.c);
            } catch (Exception unused) {
                String c2 = xg4.c();
                v7t.d(c2, "can not sava file : " + a2 + " value : " + this.c);
            }
            xg4.d().writeLock().unlock();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f31374a;
        public final /* synthetic */ String b;
        public final /* synthetic */ long c;

        public c(String str, String str2, long j) {
            this.f31374a = str;
            this.b = str2;
            this.c = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            String a2 = xg4.a(this.f31374a, this.b);
            String b = xg4.b(a2);
            try {
                ByteBuffer allocate = ByteBuffer.allocate(8);
                allocate.putLong(this.c);
                sb9.h(b, allocate);
            } catch (Exception unused) {
                String c = xg4.c();
                v7t.d(c, "can not sava file : " + a2 + " value : " + this.c);
            }
        }
    }

    static {
        t2o.a(989856422);
    }

    public static /* synthetic */ String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7a953ef5", new Object[]{str, str2});
        }
        return e(str, str2);
    }

    public static /* synthetic */ String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("30255a5e", new Object[]{str});
        }
        return f(str);
    }

    public static /* synthetic */ String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("682607c7", new Object[0]);
        }
        return f31371a;
    }

    public static /* synthetic */ ReentrantReadWriteLock d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ReentrantReadWriteLock) ipChange.ipc$dispatch("608e8e05", new Object[0]);
        }
        return b;
    }

    public static String e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("554cd8be", new Object[]{str, str2});
        }
        return "WindVane_" + str + str2;
    }

    public static String f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2555a921", new Object[]{str});
        }
        String str2 = "";
        if (yaa.n == null) {
            return str2;
        }
        StringBuilder sb = new StringBuilder(128);
        sb.append(yaa.n.getFilesDir().getAbsolutePath());
        String str3 = File.separator;
        sb.append(str3);
        sb.append(ROOT_WINDVANE_CONFIG_DIR);
        if (str != null) {
            str2 = str3 + str;
        }
        sb.append(str2);
        return sb.toString();
    }

    public static long g(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1b1669de", new Object[]{str, str2})).longValue();
        }
        String e = e(str, str2);
        long j = 0;
        try {
            File file = new File(f(e));
            if (file.exists()) {
                byte[] e2 = sb9.e(file);
                ByteBuffer allocate = ByteBuffer.allocate(8);
                allocate.put(e2);
                allocate.flip();
                j = allocate.getLong();
                String str3 = f31371a;
                v7t.a(str3, "read " + e + " by file : " + j);
            } else {
                SharedPreferences h = h();
                if (h == null) {
                    return 0L;
                }
                j = h.getLong(e, 0L);
                l(str, str2, j);
                SharedPreferences.Editor edit = h.edit();
                edit.remove(e);
                edit.commit();
                String str4 = f31371a;
                v7t.i(str4, "read " + e + " by sp : " + j);
            }
        } catch (Exception unused) {
            String str5 = f31371a;
            v7t.d(str5, "can not read file : " + e);
        }
        return j;
    }

    public static SharedPreferences h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("586de5b1", new Object[0]);
        }
        Application application = yaa.n;
        if (application == null) {
            return null;
        }
        return PreferenceManager.getDefaultSharedPreferences(application);
    }

    public static synchronized String i(String str, String str2) {
        synchronized (xg4.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("db5da8b", new Object[]{str, str2});
            }
            String str3 = f31371a;
            v7t.d(str3, "file read start ");
            String e = e(str, str2);
            String str4 = "";
            if (new File(f(e)).exists()) {
                str4 = new String(sb9.e(new File(f(e))));
                try {
                    v7t.a(str3, "read " + e + " by file : " + str4);
                } catch (Exception unused) {
                    str4 = str4;
                    String str5 = f31371a;
                    v7t.d(str5, "can not read file : " + e);
                    v7t.d(f31371a, "file read end ");
                    return str4;
                }
                v7t.d(f31371a, "file read end ");
                return str4;
            }
            SharedPreferences h = h();
            if (h == null) {
                return "";
            }
            str4 = h.getString(e, "");
            m(str, str2, str4);
            SharedPreferences.Editor edit = h.edit();
            edit.remove(e);
            edit.commit();
            v7t.i(str3, "read " + e + " by sp : " + str4);
            v7t.d(f31371a, "file read end ");
            return str4;
        }
    }

    public static String j(String str, String str2) {
        String str3 = "";
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7bb84e09", new Object[]{str, str2});
        }
        b.readLock().lock();
        String e = e(str, str2);
        if (new File(f(e)).exists()) {
            str3 = new String(sb9.e(new File(f(e))));
            try {
                String str4 = f31371a;
                v7t.d(str4, "read " + e + " by file : " + str3);
            } catch (Exception unused) {
                str3 = str3;
                String str5 = f31371a;
                v7t.d(str5, "can not read file : " + e);
                b.readLock().unlock();
                return str3;
            }
            b.readLock().unlock();
            return str3;
        }
        SharedPreferences h = h();
        if (h == null) {
            return str3;
        }
        str3 = h.getString(e, str3);
        m(str, str2, str3);
        SharedPreferences.Editor edit = h.edit();
        edit.remove(e);
        edit.commit();
        String str6 = f31371a;
        v7t.d(str6, "read " + e + " by sp : " + str3);
        b.readLock().unlock();
        return str3;
    }

    public static synchronized boolean k() {
        synchronized (xg4.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("96741841", new Object[0])).booleanValue();
            }
            Application application = yaa.n;
            if (application == null) {
                return false;
            }
            File e = vc9.e(application, ROOT_WINDVANE_CONFIG_DIR);
            String str = f31371a;
            v7t.d(str, "createDir: dir[" + e.getAbsolutePath() + "]:" + e.exists());
            return e.exists();
        }
    }

    public static synchronized void l(String str, String str2, long j) {
        synchronized (xg4.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c235b7d3", new Object[]{str, str2, new Long(j)});
            } else if (str != null && str2 != null) {
                AsyncTask.execute(new c(str, str2, j));
            }
        }
    }

    public static synchronized void m(String str, String str2, String str3) {
        synchronized (xg4.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("62c25ee6", new Object[]{str, str2, str3});
            } else if (str != null && str2 != null) {
                AsyncTask.execute(new a(str, str2, str3));
            }
        }
    }

    public static void n(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2dc541e8", new Object[]{str, str2, str3});
        } else if (str != null && str2 != null) {
            rqw.b().a(new b(str, str2, str3));
        }
    }
}
