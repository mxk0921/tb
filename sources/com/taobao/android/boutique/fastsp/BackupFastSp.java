package com.taobao.android.boutique.fastsp;

import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.boutique.fastsp.BackupFastSp;
import com.taobao.android.virtual_thread.face.VExecutors;
import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import tb.qqt;
import tb.t2o;
import tb.tb9;
import tb.uhh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class BackupFastSp implements SharedPreferences {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final Object CONTENT = new Object();
    private static final String TAG = "FastSp";
    private final tb9 mAction;
    private final File mBackupFile;
    private long mCurrentMemoryStateGeneration;
    private long mDiskStateGeneration;
    private final File mKvFile;
    private Future<?> mLastTask;
    private Map<String, Object> mMap;
    private final File mXmlFile;
    private final Object mLock = new Object();
    private final WeakHashMap<SharedPreferences.OnSharedPreferenceChangeListener, Object> mListeners = new WeakHashMap<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c f6464a;

        public a(c cVar) {
            this.f6464a = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                BackupFastSp.access$100(BackupFastSp.this, this.f6464a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final long f6466a;
        public final boolean b;
        public final List<String> c;
        public final Set<SharedPreferences.OnSharedPreferenceChangeListener> d;
        public final Map<String, Object> e;

        static {
            t2o.a(407896068);
        }

        public /* synthetic */ c(long j, boolean z, List list, Set set, Map map, a aVar) {
            this(j, z, list, set, map);
        }

        public c(long j, boolean z, List<String> list, Set<SharedPreferences.OnSharedPreferenceChangeListener> set, Map<String, Object> map) {
            this.f6466a = j;
            this.b = z;
            this.c = list;
            this.d = set;
            this.e = map;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final ScheduledExecutorService f6467a;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public static class a implements qqt {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.qqt
            public String newThreadName() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (String) ipChange.ipc$dispatch("57dab4a4", new Object[]{this});
                }
                return "fast_sp";
            }
        }

        static {
            t2o.a(407896069);
            ScheduledExecutorService newScheduledThreadPool = VExecutors.newScheduledThreadPool(1, new a());
            f6467a = newScheduledThreadPool;
            if (newScheduledThreadPool instanceof ThreadPoolExecutor) {
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) newScheduledThreadPool;
                threadPoolExecutor.setKeepAliveTime(1L, TimeUnit.SECONDS);
                threadPoolExecutor.allowCoreThreadTimeOut(true);
            }
        }

        public static void a(Runnable runnable, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d83709fe", new Object[]{runnable, new Boolean(z)});
            } else if (z) {
                f6467a.execute(runnable);
            } else {
                f6467a.schedule(runnable, 100L, TimeUnit.MILLISECONDS);
            }
        }
    }

    static {
        t2o.a(407896065);
    }

    public BackupFastSp(File file, File file2, int i, tb9 tb9Var) {
        this.mKvFile = file;
        this.mXmlFile = file2;
        this.mBackupFile = makeBackupFile(file);
        this.mAction = tb9Var;
        loadFromDisk();
    }

    public static /* synthetic */ void access$100(BackupFastSp backupFastSp, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5e52c1f", new Object[]{backupFastSp, cVar});
        } else {
            backupFastSp.writeToFile(cVar);
        }
    }

    public static /* synthetic */ void access$200(BackupFastSp backupFastSp, c cVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51b22316", new Object[]{backupFastSp, cVar, new Boolean(z)});
        } else {
            backupFastSp.enqueueDiskWrite(cVar, z);
        }
    }

    public static /* synthetic */ Object access$300(BackupFastSp backupFastSp) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("6b453be4", new Object[]{backupFastSp});
        }
        return backupFastSp.mLock;
    }

    public static /* synthetic */ Map access$400(BackupFastSp backupFastSp) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("26abdb62", new Object[]{backupFastSp});
        }
        return backupFastSp.mMap;
    }

    public static /* synthetic */ Map access$402(BackupFastSp backupFastSp, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("49ddabaf", new Object[]{backupFastSp, map});
        }
        backupFastSp.mMap = map;
        return map;
    }

    public static /* synthetic */ WeakHashMap access$500(BackupFastSp backupFastSp) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeakHashMap) ipChange.ipc$dispatch("db8b83c7", new Object[]{backupFastSp});
        }
        return backupFastSp.mListeners;
    }

    public static /* synthetic */ long access$600(BackupFastSp backupFastSp) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("558c519f", new Object[]{backupFastSp})).longValue();
        }
        return backupFastSp.mCurrentMemoryStateGeneration;
    }

    public static /* synthetic */ long access$608(BackupFastSp backupFastSp) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("26684697", new Object[]{backupFastSp})).longValue();
        }
        long j = backupFastSp.mCurrentMemoryStateGeneration;
        backupFastSp.mCurrentMemoryStateGeneration = 1 + j;
        return j;
    }

    private void enqueueDiskWrite(c cVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("535899e4", new Object[]{this, cVar, new Boolean(z)});
        } else {
            d.a(new a(cVar), z);
        }
    }

    private void loadFromDisk() {
        Map<String, ?> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69bf9d74", new Object[]{this});
            return;
        }
        if (this.mBackupFile.exists()) {
            this.mKvFile.delete();
            this.mBackupFile.renameTo(this.mKvFile);
        }
        if (this.mKvFile.exists() && !this.mKvFile.canRead()) {
            uhh.g(TAG, "Attempt to read preferences file " + this.mKvFile + " without permission");
        }
        Throwable th = null;
        try {
            try {
                map = this.mAction.b(this.mXmlFile, this.mKvFile);
            } catch (Exception e) {
                uhh.d(e);
                uhh.g(TAG, "Cannot read " + this.mKvFile.getAbsolutePath(), e);
                map = null;
            }
        } catch (Throwable th2) {
            uhh.d(th2);
            th = th2;
            map = null;
        }
        if (th != null) {
            return;
        }
        if (map != null) {
            this.mMap = map;
        } else {
            this.mMap = new HashMap();
        }
    }

    public static File makeBackupFile(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("a29e17a3", new Object[]{file});
        }
        return new File(file.getPath() + ".bak");
    }

    @Override // android.content.SharedPreferences
    public boolean contains(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fdedbf74", new Object[]{this, str})).booleanValue();
        }
        return this.mMap.containsKey(str);
    }

    @Override // android.content.SharedPreferences
    public SharedPreferences.Editor edit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences.Editor) ipChange.ipc$dispatch("ccfbee80", new Object[]{this});
        }
        return new b(this, null);
    }

    @Override // android.content.SharedPreferences
    public Map<String, ?> getAll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("4e2427", new Object[]{this});
        }
        return new HashMap(this.mMap);
    }

    @Override // android.content.SharedPreferences
    public boolean getBoolean(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a3915235", new Object[]{this, str, new Boolean(z)})).booleanValue();
        }
        Boolean bool = (Boolean) this.mMap.get(str);
        if (bool != null) {
            return bool.booleanValue();
        }
        return z;
    }

    @Override // android.content.SharedPreferences
    public float getFloat(String str, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("86205bd9", new Object[]{this, str, new Float(f)})).floatValue();
        }
        Float f2 = (Float) this.mMap.get(str);
        if (f2 != null) {
            return f2.floatValue();
        }
        return f;
    }

    @Override // android.content.SharedPreferences
    public int getInt(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("235381ac", new Object[]{this, str, new Integer(i)})).intValue();
        }
        Integer num = (Integer) this.mMap.get(str);
        if (num != null) {
            return num.intValue();
        }
        return i;
    }

    @Override // android.content.SharedPreferences
    public long getLong(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b7efaf15", new Object[]{this, str, new Long(j)})).longValue();
        }
        Long l = (Long) this.mMap.get(str);
        if (l != null) {
            return l.longValue();
        }
        return j;
    }

    @Override // android.content.SharedPreferences
    public String getString(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7e264abe", new Object[]{this, str, str2});
        }
        String str3 = (String) this.mMap.get(str);
        if (str3 != null) {
            return str3;
        }
        return str2;
    }

    @Override // android.content.SharedPreferences
    public Set<String> getStringSet(String str, Set<String> set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("66ac9bc2", new Object[]{this, str, set});
        }
        Set<String> set2 = (Set) this.mMap.get(str);
        if (set2 != null) {
            return set2;
        }
        return set;
    }

    @Override // android.content.SharedPreferences
    public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40f04e52", new Object[]{this, onSharedPreferenceChangeListener});
            return;
        }
        synchronized (this.mLock) {
            this.mListeners.put(onSharedPreferenceChangeListener, CONTENT);
        }
    }

    @Override // android.content.SharedPreferences
    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23481eeb", new Object[]{this, onSharedPreferenceChangeListener});
            return;
        }
        synchronized (this.mLock) {
            this.mListeners.remove(onSharedPreferenceChangeListener);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements SharedPreferences.Editor {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final Object f6465a;
        public boolean b;
        public final Map<String, Object> c;

        static {
            t2o.a(407896067);
        }

        public b() {
            this.f6465a = new Object();
            this.b = false;
            this.c = new HashMap();
        }

        @Override // android.content.SharedPreferences.Editor
        public void apply() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8435a0f5", new Object[]{this});
            } else {
                b(false);
            }
        }

        public final void b(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("27f307f", new Object[]{this, new Boolean(z)});
                return;
            }
            c c = c();
            BackupFastSp.access$200(BackupFastSp.this, c, z);
            e(c);
        }

        /* JADX WARN: Removed duplicated region for block: B:47:0x00bb A[Catch: all -> 0x0067, TryCatch #1 {all -> 0x004f, blocks: (B:8:0x001c, B:13:0x0038, B:17:0x0055, B:18:0x0057, B:54:0x00da, B:19:0x0058, B:21:0x005c, B:23:0x0062, B:25:0x006b, B:27:0x0071, B:28:0x007d, B:30:0x0083, B:34:0x0098, B:36:0x009e, B:38:0x00a4, B:41:0x00ab, B:42:0x00af, B:45:0x00b6, B:47:0x00bb, B:49:0x00c0, B:51:0x00c9, B:52:0x00ce, B:53:0x00d9), top: B:59:0x001c }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final com.taobao.android.boutique.fastsp.BackupFastSp.c c() {
            /*
                Method dump skipped, instructions count: 237
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.boutique.fastsp.BackupFastSp.b.c():com.taobao.android.boutique.fastsp.BackupFastSp$c");
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor clear() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SharedPreferences.Editor) ipChange.ipc$dispatch("5964b71d", new Object[]{this});
            }
            synchronized (this.f6465a) {
                this.b = true;
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public boolean commit() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("3c9f3a42", new Object[]{this})).booleanValue();
            }
            b(true);
            return true;
        }

        public final /* synthetic */ void d(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b847ed3b", new Object[]{this, cVar});
            } else {
                e(cVar);
            }
        }

        public final void e(final c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8d0c8cc", new Object[]{this, cVar});
            } else if (cVar.d != null) {
                if (cVar.c == null && !cVar.b) {
                    return;
                }
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    for (int size = cVar.c.size() - 1; size >= 0; size--) {
                        String str = cVar.c.get(size);
                        for (SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener : cVar.d) {
                            if (onSharedPreferenceChangeListener != null) {
                                onSharedPreferenceChangeListener.onSharedPreferenceChanged(BackupFastSp.this, str);
                            }
                        }
                    }
                    return;
                }
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: tb.lo1
                    @Override // java.lang.Runnable
                    public final void run() {
                        BackupFastSp.b.this.d(cVar);
                    }
                });
            }
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putBoolean(String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SharedPreferences.Editor) ipChange.ipc$dispatch("c5a06007", new Object[]{this, str, new Boolean(z)});
            }
            synchronized (this.f6465a) {
                ((HashMap) this.c).put(str, Boolean.valueOf(z));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putFloat(String str, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SharedPreferences.Editor) ipChange.ipc$dispatch("1832030f", new Object[]{this, str, new Float(f)});
            }
            synchronized (this.f6465a) {
                ((HashMap) this.c).put(str, Float.valueOf(f));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putInt(String str, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SharedPreferences.Editor) ipChange.ipc$dispatch("a0e874ff", new Object[]{this, str, new Integer(i)});
            }
            synchronized (this.f6465a) {
                ((HashMap) this.c).put(str, Integer.valueOf(i));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putLong(String str, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SharedPreferences.Editor) ipChange.ipc$dispatch("2cd37629", new Object[]{this, str, new Long(j)});
            }
            synchronized (this.f6465a) {
                ((HashMap) this.c).put(str, Long.valueOf(j));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putString(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SharedPreferences.Editor) ipChange.ipc$dispatch("2e5e7536", new Object[]{this, str, str2});
            }
            synchronized (this.f6465a) {
                ((HashMap) this.c).put(str, str2);
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putStringSet(String str, Set<String> set) {
            HashSet hashSet;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SharedPreferences.Editor) ipChange.ipc$dispatch("e35d0d65", new Object[]{this, str, set});
            }
            synchronized (this.f6465a) {
                Map<String, Object> map = this.c;
                if (set == null) {
                    hashSet = null;
                } else {
                    hashSet = new HashSet(set);
                }
                ((HashMap) map).put(str, hashSet);
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor remove(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SharedPreferences.Editor) ipChange.ipc$dispatch("b414387c", new Object[]{this, str});
            }
            synchronized (this.f6465a) {
                ((HashMap) this.c).put(str, this);
            }
            return this;
        }

        public /* synthetic */ b(BackupFastSp backupFastSp, a aVar) {
            this();
        }
    }

    private void writeToFile(c cVar) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8074f2c", new Object[]{this, cVar});
            return;
        }
        if (this.mKvFile.exists()) {
            if (this.mDiskStateGeneration < cVar.f6466a) {
                synchronized (this.mLock) {
                    z = this.mCurrentMemoryStateGeneration == cVar.f6466a;
                }
            } else {
                z = false;
            }
            if (z) {
                if (this.mBackupFile.exists()) {
                    this.mKvFile.delete();
                } else if (!this.mKvFile.renameTo(this.mBackupFile)) {
                    uhh.b(TAG, "Couldn't rename file " + this.mKvFile + " to backup file " + this.mBackupFile);
                    return;
                }
            } else {
                return;
            }
        }
        try {
            this.mAction.a(this.mMap, this.mXmlFile, this.mKvFile);
            this.mDiskStateGeneration = cVar.f6466a;
            this.mBackupFile.delete();
        } catch (Exception e) {
            uhh.g(TAG, "writeToFile: Got exception:", e);
            if (this.mKvFile.exists() && !this.mKvFile.delete()) {
                uhh.b(TAG, "Couldn't clean up partially-written file " + this.mKvFile);
            }
        }
    }
}
