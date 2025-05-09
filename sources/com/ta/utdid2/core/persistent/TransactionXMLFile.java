package com.ta.utdid2.core.persistent;

import com.android.alibaba.ip.runtime.IpChange;
import com.ta.utdid2.core.persistent.MySharedPreferences;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.WeakHashMap;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class TransactionXMLFile {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final Object GLOBAL_COMMIT_LOCK = new Object();
    public static final int MODE_PRIVATE = 0;
    private File mPreferencesDir;
    private final Object mSync = new Object();
    private HashMap<File, MySharedPreferencesImpl> sSharedPrefs = new HashMap<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static final class MySharedPreferencesImpl implements MySharedPreferences {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private static final Object mContent = new Object();
        private boolean hasChange = false;
        private final File mBackupFile;
        private final File mFile;
        private WeakHashMap<MySharedPreferences.OnSharedPreferenceChangeListener, Object> mListeners;
        private Map mMap;
        private final int mMode;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
        public final class EditorImpl implements MySharedPreferences.MyEditor {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            private final Map<String, Object> mModified = new HashMap();
            private boolean mClear = false;

            static {
                t2o.a(966787118);
                t2o.a(966787113);
            }

            public EditorImpl() {
            }

            @Override // com.ta.utdid2.core.persistent.MySharedPreferences.MyEditor
            public MySharedPreferences.MyEditor clear() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (MySharedPreferences.MyEditor) ipChange.ipc$dispatch("58b1912a", new Object[]{this});
                }
                synchronized (this) {
                    this.mClear = true;
                }
                return this;
            }

            @Override // com.ta.utdid2.core.persistent.MySharedPreferences.MyEditor
            public boolean commit() {
                boolean z;
                HashSet<MySharedPreferences.OnSharedPreferenceChangeListener> hashSet;
                ArrayList arrayList;
                boolean access$400;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("3c9f3a42", new Object[]{this})).booleanValue();
                }
                synchronized (TransactionXMLFile.access$100()) {
                    try {
                        if (MySharedPreferencesImpl.access$200(MySharedPreferencesImpl.this).size() > 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            arrayList = new ArrayList();
                            hashSet = new HashSet(MySharedPreferencesImpl.access$200(MySharedPreferencesImpl.this).keySet());
                        } else {
                            arrayList = null;
                            hashSet = null;
                        }
                        synchronized (this) {
                            if (this.mClear) {
                                MySharedPreferencesImpl.access$300(MySharedPreferencesImpl.this).clear();
                                this.mClear = false;
                            }
                            for (Map.Entry<String, Object> entry : this.mModified.entrySet()) {
                                String key = entry.getKey();
                                Object value = entry.getValue();
                                if (value == this) {
                                    MySharedPreferencesImpl.access$300(MySharedPreferencesImpl.this).remove(key);
                                } else {
                                    MySharedPreferencesImpl.access$300(MySharedPreferencesImpl.this).put(key, value);
                                }
                                if (z) {
                                    arrayList.add(key);
                                }
                            }
                            this.mModified.clear();
                        }
                        access$400 = MySharedPreferencesImpl.access$400(MySharedPreferencesImpl.this);
                        if (access$400) {
                            MySharedPreferencesImpl.this.setHasChange(true);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (z) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        String str = (String) arrayList.get(size);
                        for (MySharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener : hashSet) {
                            if (onSharedPreferenceChangeListener != null) {
                                onSharedPreferenceChangeListener.onSharedPreferenceChanged(MySharedPreferencesImpl.this, str);
                            }
                        }
                    }
                }
                return access$400;
            }

            @Override // com.ta.utdid2.core.persistent.MySharedPreferences.MyEditor
            public MySharedPreferences.MyEditor putBoolean(String str, boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (MySharedPreferences.MyEditor) ipChange.ipc$dispatch("1a109394", new Object[]{this, str, new Boolean(z)});
                }
                synchronized (this) {
                    this.mModified.put(str, Boolean.valueOf(z));
                }
                return this;
            }

            @Override // com.ta.utdid2.core.persistent.MySharedPreferences.MyEditor
            public MySharedPreferences.MyEditor putFloat(String str, float f) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (MySharedPreferences.MyEditor) ipChange.ipc$dispatch("33f2849c", new Object[]{this, str, new Float(f)});
                }
                synchronized (this) {
                    this.mModified.put(str, Float.valueOf(f));
                }
                return this;
            }

            @Override // com.ta.utdid2.core.persistent.MySharedPreferences.MyEditor
            public MySharedPreferences.MyEditor putInt(String str, int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (MySharedPreferences.MyEditor) ipChange.ipc$dispatch("400a5a8c", new Object[]{this, str, new Integer(i)});
                }
                synchronized (this) {
                    this.mModified.put(str, Integer.valueOf(i));
                }
                return this;
            }

            @Override // com.ta.utdid2.core.persistent.MySharedPreferences.MyEditor
            public MySharedPreferences.MyEditor putLong(String str, long j) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (MySharedPreferences.MyEditor) ipChange.ipc$dispatch("2f8b2536", new Object[]{this, str, new Long(j)});
                }
                synchronized (this) {
                    this.mModified.put(str, Long.valueOf(j));
                }
                return this;
            }

            @Override // com.ta.utdid2.core.persistent.MySharedPreferences.MyEditor
            public MySharedPreferences.MyEditor putString(String str, String str2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (MySharedPreferences.MyEditor) ipChange.ipc$dispatch("cb9b5b03", new Object[]{this, str, str2});
                }
                synchronized (this) {
                    this.mModified.put(str, str2);
                }
                return this;
            }

            @Override // com.ta.utdid2.core.persistent.MySharedPreferences.MyEditor
            public MySharedPreferences.MyEditor remove(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (MySharedPreferences.MyEditor) ipChange.ipc$dispatch("331d18c9", new Object[]{this, str});
                }
                synchronized (this) {
                    this.mModified.put(str, this);
                }
                return this;
            }
        }

        static {
            t2o.a(966787117);
            t2o.a(966787112);
        }

        public MySharedPreferencesImpl(File file, int i, Map map) {
            this.mFile = file;
            this.mBackupFile = TransactionXMLFile.access$000(file);
            this.mMode = i;
            this.mMap = map == null ? new HashMap() : map;
            this.mListeners = new WeakHashMap<>();
        }

        public static /* synthetic */ WeakHashMap access$200(MySharedPreferencesImpl mySharedPreferencesImpl) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (WeakHashMap) ipChange.ipc$dispatch("2d15d4fa", new Object[]{mySharedPreferencesImpl});
            }
            return mySharedPreferencesImpl.mListeners;
        }

        public static /* synthetic */ Map access$300(MySharedPreferencesImpl mySharedPreferencesImpl) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("852eb075", new Object[]{mySharedPreferencesImpl});
            }
            return mySharedPreferencesImpl.mMap;
        }

        public static /* synthetic */ boolean access$400(MySharedPreferencesImpl mySharedPreferencesImpl) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("43abe445", new Object[]{mySharedPreferencesImpl})).booleanValue();
            }
            return mySharedPreferencesImpl.writeFileLocked();
        }

        private FileOutputStream createFileOutputStream(File file) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (FileOutputStream) ipChange.ipc$dispatch("9a9d7ff5", new Object[]{this, file});
            }
            try {
                return new FileOutputStream(file);
            } catch (FileNotFoundException unused) {
                if (!file.getParentFile().mkdir()) {
                    return null;
                }
                try {
                    return new FileOutputStream(file);
                } catch (FileNotFoundException unused2) {
                    return null;
                }
            }
        }

        private boolean writeFileLocked() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("3fc7baf0", new Object[]{this})).booleanValue();
            }
            if (this.mFile.exists()) {
                if (this.mBackupFile.exists()) {
                    this.mFile.delete();
                } else if (!this.mFile.renameTo(this.mBackupFile)) {
                    return false;
                }
            }
            try {
                FileOutputStream createFileOutputStream = createFileOutputStream(this.mFile);
                if (createFileOutputStream == null) {
                    return false;
                }
                XmlUtils.writeMapXml(this.mMap, createFileOutputStream);
                createFileOutputStream.close();
                this.mBackupFile.delete();
                return true;
            } catch (Exception unused) {
                if (this.mFile.exists()) {
                    this.mFile.delete();
                }
                return false;
            }
        }

        @Override // com.ta.utdid2.core.persistent.MySharedPreferences
        public boolean checkFile() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("64031d2f", new Object[]{this})).booleanValue();
            }
            if (this.mFile == null || !new File(this.mFile.getAbsolutePath()).exists()) {
                return false;
            }
            return true;
        }

        @Override // com.ta.utdid2.core.persistent.MySharedPreferences
        public boolean contains(String str) {
            boolean containsKey;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("fdedbf74", new Object[]{this, str})).booleanValue();
            }
            synchronized (this) {
                containsKey = this.mMap.containsKey(str);
            }
            return containsKey;
        }

        @Override // com.ta.utdid2.core.persistent.MySharedPreferences
        public MySharedPreferences.MyEditor edit() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (MySharedPreferences.MyEditor) ipChange.ipc$dispatch("d86cd5cd", new Object[]{this});
            }
            return new EditorImpl();
        }

        @Override // com.ta.utdid2.core.persistent.MySharedPreferences
        public Map<String, ?> getAll() {
            HashMap hashMap;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("4e2427", new Object[]{this});
            }
            synchronized (this) {
                hashMap = new HashMap(this.mMap);
            }
            return hashMap;
        }

        @Override // com.ta.utdid2.core.persistent.MySharedPreferences
        public boolean getBoolean(String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a3915235", new Object[]{this, str, new Boolean(z)})).booleanValue();
            }
            synchronized (this) {
                try {
                    Boolean bool = (Boolean) this.mMap.get(str);
                    if (bool != null) {
                        z = bool.booleanValue();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return z;
        }

        @Override // com.ta.utdid2.core.persistent.MySharedPreferences
        public float getFloat(String str, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("86205bd9", new Object[]{this, str, new Float(f)})).floatValue();
            }
            synchronized (this) {
                try {
                    Float f2 = (Float) this.mMap.get(str);
                    if (f2 != null) {
                        f = f2.floatValue();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return f;
        }

        @Override // com.ta.utdid2.core.persistent.MySharedPreferences
        public int getInt(String str, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("235381ac", new Object[]{this, str, new Integer(i)})).intValue();
            }
            synchronized (this) {
                try {
                    Integer num = (Integer) this.mMap.get(str);
                    if (num != null) {
                        i = num.intValue();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return i;
        }

        @Override // com.ta.utdid2.core.persistent.MySharedPreferences
        public long getLong(String str, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("b7efaf15", new Object[]{this, str, new Long(j)})).longValue();
            }
            synchronized (this) {
                try {
                    Long l = (Long) this.mMap.get(str);
                    if (l != null) {
                        j = l.longValue();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return j;
        }

        @Override // com.ta.utdid2.core.persistent.MySharedPreferences
        public String getString(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("7e264abe", new Object[]{this, str, str2});
            }
            synchronized (this) {
                String str3 = (String) this.mMap.get(str);
                if (str3 != null) {
                    str2 = str3;
                }
            }
            return str2;
        }

        public boolean hasFileChanged() {
            boolean z;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("9f6d7829", new Object[]{this})).booleanValue();
            }
            synchronized (this) {
                z = this.hasChange;
            }
            return z;
        }

        @Override // com.ta.utdid2.core.persistent.MySharedPreferences
        public void registerOnSharedPreferenceChangeListener(MySharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9ec12e2b", new Object[]{this, onSharedPreferenceChangeListener});
                return;
            }
            synchronized (this) {
                this.mListeners.put(onSharedPreferenceChangeListener, mContent);
            }
        }

        public void replace(Map map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("580ca0ea", new Object[]{this, map});
            } else if (map != null) {
                synchronized (this) {
                    this.mMap = map;
                }
            }
        }

        public void setHasChange(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4b11ff85", new Object[]{this, new Boolean(z)});
                return;
            }
            synchronized (this) {
                this.hasChange = z;
            }
        }

        @Override // com.ta.utdid2.core.persistent.MySharedPreferences
        public void unregisterOnSharedPreferenceChangeListener(MySharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2cfeacc4", new Object[]{this, onSharedPreferenceChangeListener});
                return;
            }
            synchronized (this) {
                this.mListeners.remove(onSharedPreferenceChangeListener);
            }
        }
    }

    static {
        t2o.a(966787116);
    }

    public TransactionXMLFile(String str) {
        if (str == null || str.length() <= 0) {
            throw new RuntimeException("Directory can not be empty");
        }
        this.mPreferencesDir = new File(str);
    }

    public static /* synthetic */ File access$000(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("e1061b1f", new Object[]{file});
        }
        return makeBackupFile(file);
    }

    public static /* synthetic */ Object access$100() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("79619b7a", new Object[0]);
        }
        return GLOBAL_COMMIT_LOCK;
    }

    private File getPreferencesDir() {
        File file;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("e5467fdb", new Object[]{this});
        }
        synchronized (this.mSync) {
            file = this.mPreferencesDir;
        }
        return file;
    }

    private File getSharedPrefsFile(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("4cb74d4b", new Object[]{this, str});
        }
        File preferencesDir = getPreferencesDir();
        return makeFilename(preferencesDir, str + ".xml");
    }

    private static File makeBackupFile(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("a29e17a3", new Object[]{file});
        }
        return new File(file.getPath() + ".bak");
    }

    private File makeFilename(File file, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("9d6ef890", new Object[]{this, file, str});
        }
        if (str.indexOf(File.separatorChar) < 0) {
            return new File(file, str);
        }
        throw new IllegalArgumentException("File " + str + " contains a path separator");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b9 A[Catch: all -> 0x0083, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0083, blocks: (B:35:0x0080, B:57:0x00b9), top: B:78:0x0058 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00c0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.ta.utdid2.core.persistent.MySharedPreferences getMySharedPreferences(java.lang.String r6, int r7) {
        /*
            Method dump skipped, instructions count: 227
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ta.utdid2.core.persistent.TransactionXMLFile.getMySharedPreferences(java.lang.String, int):com.ta.utdid2.core.persistent.MySharedPreferences");
    }
}
