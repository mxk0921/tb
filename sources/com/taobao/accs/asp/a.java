package com.taobao.accs.asp;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import tb.kf;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class a implements SharedPreferences {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int TYPE_CORE = 0;
    public static final int TYPE_EDGE = 1;
    public static final Handler i = new Handler(Looper.getMainLooper());
    public static final Object j = new Object();
    public final int b;
    public final String d;
    public final File e;
    public final SharedPreferences f;

    /* renamed from: a  reason: collision with root package name */
    public final WeakHashMap<SharedPreferences.OnSharedPreferenceChangeListener, Object> f6008a = new WeakHashMap<>();
    public final Object c = new Object();
    public final Map<String, f> g = new HashMap();
    public boolean h = false;

    /* compiled from: Taobao */
    /* renamed from: com.taobao.accs.asp.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class RunnableC0308a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public RunnableC0308a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            synchronized (a.a(a.this)) {
                a.this.g();
                a.a(a.this).notifyAll();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d f6010a;
        public final /* synthetic */ e b;

        public b(d dVar, e eVar) {
            this.f6010a = dVar;
            this.b = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.f6010a.d(this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ SharedPreferences.OnSharedPreferenceChangeListener f6011a;
        public final /* synthetic */ String b;

        public c(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener, String str) {
            this.f6011a = onSharedPreferenceChangeListener;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.f6011a.onSharedPreferenceChanged(a.this, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public abstract class d implements SharedPreferences.Editor {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final Object f6012a = new Object();
        public Bundle b = new Bundle();
        public boolean c = false;

        /* compiled from: Taobao */
        /* renamed from: com.taobao.accs.asp.a$d$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class RunnableC0309a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ e f6013a;

            public RunnableC0309a(e eVar) {
                this.f6013a = eVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    d.this.d(this.f6013a);
                }
            }
        }

        static {
            t2o.a(343932971);
        }

        public d() {
        }

        public static /* synthetic */ Bundle a(d dVar, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Bundle) ipChange.ipc$dispatch("c93a69a7", new Object[]{dVar, bundle});
            }
            dVar.b = bundle;
            return bundle;
        }

        public static /* synthetic */ boolean b(d dVar, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a4d4b306", new Object[]{dVar, new Boolean(z)})).booleanValue();
            }
            dVar.c = z;
            return z;
        }

        public static /* synthetic */ e c(d dVar, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e) ipChange.ipc$dispatch("3fc56c60", new Object[]{dVar, new Long(j)});
            }
            return dVar.e(j);
        }

        @Override // android.content.SharedPreferences.Editor
        public void apply() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8435a0f5", new Object[]{this});
            } else {
                f();
            }
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor clear() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SharedPreferences.Editor) ipChange.ipc$dispatch("5964b71d", new Object[]{this});
            }
            synchronized (this.f6012a) {
                this.c = true;
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public boolean commit() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("3c9f3a42", new Object[]{this})).booleanValue();
            }
            f();
            return true;
        }

        public abstract void d(e eVar);

        /* JADX WARN: Removed duplicated region for block: B:57:0x010e A[Catch: all -> 0x00ba, TryCatch #3 {all -> 0x00ba, blocks: (B:37:0x00b3, B:44:0x00c0, B:47:0x00cd, B:48:0x00d7, B:50:0x00e3, B:52:0x00f3, B:55:0x00fc, B:57:0x010e, B:59:0x0116, B:61:0x0125, B:62:0x013f, B:63:0x0147, B:67:0x014c), top: B:76:0x00b3 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final com.taobao.accs.asp.a.e e(long r17) {
            /*
                Method dump skipped, instructions count: 336
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.accs.asp.a.d.e(long):com.taobao.accs.asp.a$e");
        }

        public final void f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a5eccd1", new Object[]{this});
                return;
            }
            e e = e(SystemClock.elapsedRealtimeNanos());
            if (e.c) {
                kf.g(new RunnableC0309a(e));
            }
            a.b(a.this, e);
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putBoolean(String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SharedPreferences.Editor) ipChange.ipc$dispatch("c5a06007", new Object[]{this, str, new Boolean(z)});
            }
            synchronized (this.f6012a) {
                this.b.putBoolean(str, z);
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putFloat(String str, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SharedPreferences.Editor) ipChange.ipc$dispatch("1832030f", new Object[]{this, str, new Float(f)});
            }
            synchronized (this.f6012a) {
                this.b.putFloat(str, f);
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putInt(String str, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SharedPreferences.Editor) ipChange.ipc$dispatch("a0e874ff", new Object[]{this, str, new Integer(i)});
            }
            synchronized (this.f6012a) {
                this.b.putInt(str, i);
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putLong(String str, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SharedPreferences.Editor) ipChange.ipc$dispatch("2cd37629", new Object[]{this, str, new Long(j)});
            }
            synchronized (this.f6012a) {
                this.b.putLong(str, j);
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putString(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SharedPreferences.Editor) ipChange.ipc$dispatch("2e5e7536", new Object[]{this, str, str2});
            }
            synchronized (this.f6012a) {
                this.b.putString(str, str2);
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putStringSet(String str, Set<String> set) {
            ArrayList<String> arrayList;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SharedPreferences.Editor) ipChange.ipc$dispatch("e35d0d65", new Object[]{this, str, set});
            }
            synchronized (this.f6012a) {
                Bundle bundle = this.b;
                if (set == null) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList<>(set);
                }
                bundle.putStringArrayList(str, arrayList);
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor remove(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SharedPreferences.Editor) ipChange.ipc$dispatch("b414387c", new Object[]{this, str});
            }
            synchronized (this.f6012a) {
                this.b.putParcelable(str, null);
            }
            return this;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class e {

        /* renamed from: a  reason: collision with root package name */
        public final List<String> f6014a;
        public final Set<SharedPreferences.OnSharedPreferenceChangeListener> b;
        public boolean c;
        public ModifiedRecord d;

        static {
            t2o.a(343932973);
        }

        public /* synthetic */ e(a aVar, boolean z, List list, Set set, RunnableC0308a aVar2) {
            this(aVar, z, list, set);
        }

        public e(a aVar, boolean z, List<String> list, Set<SharedPreferences.OnSharedPreferenceChangeListener> set) {
            this.c = z;
            this.f6014a = list;
            this.b = set;
        }
    }

    static {
        t2o.a(343932967);
    }

    public a(Context context, String str, SharedPreferences sharedPreferences, int i2) {
        this.d = str;
        this.e = f(context, str);
        this.f = sharedPreferences;
        this.b = i2;
        kf.e(new RunnableC0308a());
    }

    public static /* synthetic */ Object a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("5c13d70f", new Object[]{aVar});
        }
        return aVar.c;
    }

    public static /* synthetic */ void b(a aVar, e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1605255f", new Object[]{aVar, eVar});
        } else {
            aVar.h(eVar);
        }
    }

    public static /* synthetic */ WeakHashMap c(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeakHashMap) ipChange.ipc$dispatch("d698f1fc", new Object[]{aVar});
        }
        return aVar.f6008a;
    }

    @Override // android.content.SharedPreferences
    public boolean contains(String str) {
        boolean containsKey;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fdedbf74", new Object[]{this, str})).booleanValue();
        }
        synchronized (this.c) {
            d();
            containsKey = ((HashMap) this.g).containsKey(str);
        }
        return containsKey;
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("365afdec", new Object[]{this});
            return;
        }
        while (!this.h) {
            try {
                this.c.wait();
            } catch (InterruptedException unused) {
            }
        }
    }

    public abstract d e();

    @Override // android.content.SharedPreferences
    public SharedPreferences.Editor edit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences.Editor) ipChange.ipc$dispatch("ccfbee80", new Object[]{this});
        }
        synchronized (this.c) {
            d();
        }
        return e();
    }

    public final File f(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("f1aeef7f", new Object[]{this, context, str});
        }
        File file = new File(context.getFilesDir(), "shared_prefs");
        if (!file.exists()) {
            file.mkdir();
        }
        return new File(file, str + ".lock");
    }

    public abstract void g();

    @Override // android.content.SharedPreferences
    public Map<String, ?> getAll() {
        HashMap hashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("4e2427", new Object[]{this});
        }
        synchronized (this.c) {
            try {
                d();
                hashMap = new HashMap();
                for (Map.Entry entry : ((HashMap) this.g).entrySet()) {
                    hashMap.put(entry.getKey(), ((f) entry.getValue()).f6015a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return hashMap;
    }

    @Override // android.content.SharedPreferences
    public boolean getBoolean(String str, boolean z) {
        Boolean bool;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a3915235", new Object[]{this, str, new Boolean(z)})).booleanValue();
        }
        synchronized (this.c) {
            try {
                d();
                f fVar = (f) ((HashMap) this.g).get(str);
                if (fVar != null) {
                    bool = (Boolean) fVar.f6015a;
                } else {
                    bool = null;
                }
                if (bool != null) {
                    z = bool.booleanValue();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // android.content.SharedPreferences
    public float getFloat(String str, float f2) {
        Float f3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("86205bd9", new Object[]{this, str, new Float(f2)})).floatValue();
        }
        synchronized (this.c) {
            try {
                d();
                f fVar = (f) ((HashMap) this.g).get(str);
                if (fVar != null) {
                    f3 = (Float) fVar.f6015a;
                } else {
                    f3 = null;
                }
                if (f3 != null) {
                    f2 = f3.floatValue();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f2;
    }

    @Override // android.content.SharedPreferences
    public int getInt(String str, int i2) {
        Integer num;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("235381ac", new Object[]{this, str, new Integer(i2)})).intValue();
        }
        synchronized (this.c) {
            try {
                d();
                f fVar = (f) ((HashMap) this.g).get(str);
                if (fVar != null) {
                    num = (Integer) fVar.f6015a;
                } else {
                    num = null;
                }
                if (num != null) {
                    i2 = num.intValue();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i2;
    }

    @Override // android.content.SharedPreferences
    public long getLong(String str, long j2) {
        Long l;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b7efaf15", new Object[]{this, str, new Long(j2)})).longValue();
        }
        synchronized (this.c) {
            try {
                d();
                f fVar = (f) ((HashMap) this.g).get(str);
                if (fVar != null) {
                    l = (Long) fVar.f6015a;
                } else {
                    l = null;
                }
                if (l != null) {
                    j2 = l.longValue();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return j2;
    }

    @Override // android.content.SharedPreferences
    public String getString(String str, String str2) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7e264abe", new Object[]{this, str, str2});
        }
        synchronized (this.c) {
            try {
                d();
                f fVar = (f) ((HashMap) this.g).get(str);
                if (fVar != null) {
                    str3 = (String) fVar.f6015a;
                } else {
                    str3 = null;
                }
                if (str3 != null) {
                    str2 = str3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    @Override // android.content.SharedPreferences
    public Set<String> getStringSet(String str, Set<String> set) {
        Set<String> set2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("66ac9bc2", new Object[]{this, str, set});
        }
        synchronized (this.c) {
            try {
                d();
                f fVar = (f) ((HashMap) this.g).get(str);
                if (fVar != null) {
                    set2 = (Set) fVar.f6015a;
                } else {
                    set2 = null;
                }
                if (set2 != null) {
                    set = set2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return set;
    }

    public final void h(e eVar) {
        List<String> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a65ac1fa", new Object[]{this, eVar});
        } else if (eVar.b != null && eVar.c && (list = eVar.f6014a) != null && list.size() != 0) {
            for (int size = eVar.f6014a.size() - 1; size >= 0; size--) {
                String str = eVar.f6014a.get(size);
                for (SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener : eVar.b) {
                    if (onSharedPreferenceChangeListener != null) {
                        if (Looper.myLooper() == Looper.getMainLooper()) {
                            onSharedPreferenceChangeListener.onSharedPreferenceChanged(this, str);
                        } else {
                            i.post(new c(onSharedPreferenceChangeListener, str));
                        }
                    }
                }
            }
        }
    }

    public void i(ModifiedRecord modifiedRecord) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e02a9dc", new Object[]{this, modifiedRecord});
            return;
        }
        synchronized (this.c) {
            d();
        }
        d e2 = e();
        d.a(e2, modifiedRecord.modified);
        d.b(e2, modifiedRecord.isClear);
        e c2 = d.c(e2, modifiedRecord.timestampVersion);
        if (c2.c && this.b == 0) {
            kf.g(new b(e2, c2));
        }
        h(c2);
    }

    @Override // android.content.SharedPreferences
    public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40f04e52", new Object[]{this, onSharedPreferenceChangeListener});
            return;
        }
        synchronized (this.c) {
            this.f6008a.put(onSharedPreferenceChangeListener, j);
        }
    }

    @Override // android.content.SharedPreferences
    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23481eeb", new Object[]{this, onSharedPreferenceChangeListener});
            return;
        }
        synchronized (this.c) {
            this.f6008a.remove(onSharedPreferenceChangeListener);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class f {

        /* renamed from: a  reason: collision with root package name */
        public final Object f6015a;
        public final long b;

        static {
            t2o.a(343932974);
        }

        public f(a aVar, Object obj) {
            this.f6015a = obj;
        }

        public f(a aVar, Object obj, long j) {
            this.f6015a = obj;
            this.b = j;
        }
    }
}
