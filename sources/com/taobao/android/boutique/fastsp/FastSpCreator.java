package com.taobao.android.boutique.fastsp;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import tb.c6g;
import tb.g6g;
import tb.t2o;
import tb.uhh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class FastSpCreator {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Map<String, SharedPreferences> d = new ConcurrentHashMap();
    public static final FastSpCreator e = new FastSpCreator();
    public File b;

    /* renamed from: a  reason: collision with root package name */
    public final Object f6468a = new Object();
    public Set<String> c = new HashSet();

    static {
        t2o.a(407896072);
    }

    public static void a(Set<String> set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c618ad06", new Object[]{set});
        } else {
            e.h(set);
        }
    }

    public static SharedPreferences create(Context context, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("11676488", new Object[]{context, str, new Integer(i)});
        }
        Map<String, SharedPreferences> map = d;
        SharedPreferences sharedPreferences = (SharedPreferences) ((ConcurrentHashMap) map).get(str);
        if (sharedPreferences == null) {
            synchronized (map) {
                try {
                    sharedPreferences = (SharedPreferences) ((ConcurrentHashMap) map).get(str);
                    if (sharedPreferences == null) {
                        SharedPreferences f = e.f(context, str, i);
                        ((ConcurrentHashMap) map).put(str, f);
                        sharedPreferences = f;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return sharedPreferences;
    }

    public final File b(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("4c4f9e2b", new Object[]{this, file});
        }
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public final File c(Context context) {
        File b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("ddd317b9", new Object[]{this, context});
        }
        synchronized (this.f6468a) {
            try {
                if (this.b == null) {
                    this.b = new File(context.getFilesDir(), "fast_kv");
                }
                b = b(this.b);
            } catch (Throwable th) {
                throw th;
            }
        }
        return b;
    }

    public final File d(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("f5688f07", new Object[]{this, context, str});
        }
        File c = c(context);
        return g(c, str + ".kv");
    }

    public File e(Context context, String str) {
        File dataDir;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("4b8065a4", new Object[]{this, context, str});
        }
        if (Build.VERSION.SDK_INT >= 24) {
            dataDir = context.getDataDir();
            File file = new File(dataDir, "shared_prefs");
            return g(file, str + ".xml");
        }
        File file2 = new File(context.getFilesDir().getParent(), "shared_prefs");
        return g(file2, str + ".xml");
    }

    public final SharedPreferences f(Context context, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("7517a0fa", new Object[]{this, context, str, new Integer(i)});
        }
        File d2 = d(context, str);
        File e2 = e(context, str);
        if (this.c.contains(str)) {
            uhh.b("FastSpCreator", str, "BackupFastSp");
            return new BackupFastSp(d2, e2, i, new c6g());
        }
        uhh.b("FastSpCreator", str, d2.getAbsolutePath(), e2.getAbsolutePath());
        return new BackupFastSp(d2, e2, i, new g6g());
    }

    public final File g(File file, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("9d6ef890", new Object[]{this, file, str});
        }
        if (str.indexOf(File.separatorChar) < 0) {
            return new File(file, str);
        }
        throw new IllegalArgumentException("File " + str + " contains a path separator");
    }

    public void h(Set<String> set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b256e14", new Object[]{this, set});
        } else if (set != null) {
            this.c = set;
        }
    }
}
