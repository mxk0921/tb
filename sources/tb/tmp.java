package tb;

import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.Set;
import tb.je4;
import tb.tmp;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class tmp implements SharedPreferences {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final je4 f28806a;
    public final SharedPreferences b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements SharedPreferences.Editor {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final SharedPreferences.Editor f28807a;

        static {
            t2o.a(408944648);
        }

        public a(SharedPreferences.Editor editor) {
            this.f28807a = editor;
        }

        @Override // android.content.SharedPreferences.Editor
        public void apply() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8435a0f5", new Object[]{this});
            } else {
                tmp.this.f28806a.c(new je4.a() { // from class: tb.smp
                    @Override // tb.je4.a
                    public final Object call() {
                        Boolean c;
                        c = tmp.a.this.c();
                        return c;
                    }
                }, pg1.ATOM_apply);
            }
        }

        public final /* synthetic */ Boolean c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Boolean) ipChange.ipc$dispatch("a8570862", new Object[]{this});
            }
            this.f28807a.apply();
            return Boolean.TRUE;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor clear() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SharedPreferences.Editor) ipChange.ipc$dispatch("5964b71d", new Object[]{this});
            }
            this.f28807a.clear();
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public boolean commit() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("3c9f3a42", new Object[]{this})).booleanValue();
            }
            return ((Boolean) tmp.this.f28806a.c(new je4.a() { // from class: tb.rmp
                @Override // tb.je4.a
                public final Object call() {
                    Boolean d;
                    d = tmp.a.this.d();
                    return d;
                }
            }, "commit")).booleanValue();
        }

        public final /* synthetic */ Boolean d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Boolean) ipChange.ipc$dispatch("97a6c684", new Object[]{this});
            }
            return Boolean.valueOf(this.f28807a.commit());
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putBoolean(String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SharedPreferences.Editor) ipChange.ipc$dispatch("c5a06007", new Object[]{this, str, new Boolean(z)});
            }
            this.f28807a.putBoolean(str, z);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putFloat(String str, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SharedPreferences.Editor) ipChange.ipc$dispatch("1832030f", new Object[]{this, str, new Float(f)});
            }
            this.f28807a.putFloat(str, f);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putInt(String str, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SharedPreferences.Editor) ipChange.ipc$dispatch("a0e874ff", new Object[]{this, str, new Integer(i)});
            }
            this.f28807a.putInt(str, i);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putLong(String str, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SharedPreferences.Editor) ipChange.ipc$dispatch("2cd37629", new Object[]{this, str, new Long(j)});
            }
            this.f28807a.putLong(str, j);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putString(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SharedPreferences.Editor) ipChange.ipc$dispatch("2e5e7536", new Object[]{this, str, str2});
            }
            this.f28807a.putString(str, str2);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putStringSet(String str, Set<String> set) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SharedPreferences.Editor) ipChange.ipc$dispatch("e35d0d65", new Object[]{this, str, set});
            }
            this.f28807a.putStringSet(str, set);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor remove(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SharedPreferences.Editor) ipChange.ipc$dispatch("b414387c", new Object[]{this, str});
            }
            this.f28807a.remove(str);
            return this;
        }
    }

    static {
        t2o.a(408944647);
    }

    public tmp(SharedPreferences sharedPreferences, je4 je4Var) {
        this.b = sharedPreferences;
        this.f28806a = je4Var;
    }

    @Override // android.content.SharedPreferences
    public boolean contains(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fdedbf74", new Object[]{this, str})).booleanValue();
        }
        return ((Boolean) this.f28806a.a(new je4.a() { // from class: tb.kmp
            @Override // tb.je4.a
            public final Object call() {
                Boolean j;
                j = tmp.this.j(str);
                return j;
            }
        }, "contains")).booleanValue();
    }

    @Override // android.content.SharedPreferences
    public SharedPreferences.Editor edit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences.Editor) ipChange.ipc$dispatch("ccfbee80", new Object[]{this});
        }
        return new a((SharedPreferences.Editor) this.f28806a.a(new je4.a() { // from class: tb.hmp
            @Override // tb.je4.a
            public final Object call() {
                SharedPreferences.Editor k;
                k = tmp.this.k();
                return k;
            }
        }, "edit"));
    }

    @Override // android.content.SharedPreferences
    public Map<String, ?> getAll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("4e2427", new Object[]{this});
        }
        return (Map) this.f28806a.a(new je4.a() { // from class: tb.lmp
            @Override // tb.je4.a
            public final Object call() {
                Map l;
                l = tmp.this.l();
                return l;
            }
        }, "getAll");
    }

    @Override // android.content.SharedPreferences
    public boolean getBoolean(final String str, final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a3915235", new Object[]{this, str, new Boolean(z)})).booleanValue();
        }
        return ((Boolean) this.f28806a.a(new je4.a() { // from class: tb.omp
            @Override // tb.je4.a
            public final Object call() {
                Boolean m;
                m = tmp.this.m(str, z);
                return m;
            }
        }, "getBoolean")).booleanValue();
    }

    @Override // android.content.SharedPreferences
    public float getFloat(final String str, final float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("86205bd9", new Object[]{this, str, new Float(f)})).floatValue();
        }
        return ((Float) this.f28806a.a(new je4.a() { // from class: tb.nmp
            @Override // tb.je4.a
            public final Object call() {
                Float n;
                n = tmp.this.n(str, f);
                return n;
            }
        }, "getFloat")).floatValue();
    }

    @Override // android.content.SharedPreferences
    public int getInt(final String str, final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("235381ac", new Object[]{this, str, new Integer(i)})).intValue();
        }
        return ((Integer) this.f28806a.a(new je4.a() { // from class: tb.mmp
            @Override // tb.je4.a
            public final Object call() {
                Integer o;
                o = tmp.this.o(str, i);
                return o;
            }
        }, "getInt")).intValue();
    }

    @Override // android.content.SharedPreferences
    public long getLong(final String str, final long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b7efaf15", new Object[]{this, str, new Long(j)})).longValue();
        }
        return ((Long) this.f28806a.a(new je4.a() { // from class: tb.pmp
            @Override // tb.je4.a
            public final Object call() {
                Long p;
                p = tmp.this.p(str, j);
                return p;
            }
        }, "getLong")).longValue();
    }

    @Override // android.content.SharedPreferences
    public String getString(final String str, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7e264abe", new Object[]{this, str, str2});
        }
        return (String) this.f28806a.a(new je4.a() { // from class: tb.jmp
            @Override // tb.je4.a
            public final Object call() {
                String q;
                q = tmp.this.q(str, str2);
                return q;
            }
        }, "getString");
    }

    @Override // android.content.SharedPreferences
    public Set<String> getStringSet(final String str, final Set<String> set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("66ac9bc2", new Object[]{this, str, set});
        }
        return (Set) this.f28806a.a(new je4.a() { // from class: tb.imp
            @Override // tb.je4.a
            public final Object call() {
                Set r;
                r = tmp.this.r(str, set);
                return r;
            }
        }, "getStringSet");
    }

    public final /* synthetic */ Boolean j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("ebee3abd", new Object[]{this, str});
        }
        return Boolean.valueOf(this.b.contains(str));
    }

    public final /* synthetic */ SharedPreferences.Editor k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences.Editor) ipChange.ipc$dispatch("81fa188f", new Object[]{this});
        }
        return this.b.edit();
    }

    public final /* synthetic */ Map l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("1f49c1f0", new Object[]{this});
        }
        return this.b.getAll();
    }

    public final /* synthetic */ Boolean m(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("fc6dac7f", new Object[]{this, str, new Boolean(z)});
        }
        return Boolean.valueOf(this.b.getBoolean(str, z));
    }

    public final /* synthetic */ Float n(String str, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Float) ipChange.ipc$dispatch("9f2da64", new Object[]{this, str, new Float(f)});
        }
        return Float.valueOf(this.b.getFloat(str, f));
    }

    public final /* synthetic */ Integer o(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("3ef57f94", new Object[]{this, str, new Integer(i)});
        }
        return Integer.valueOf(this.b.getInt(str, i));
    }

    public final /* synthetic */ Long p(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Long) ipChange.ipc$dispatch("635c5507", new Object[]{this, str, new Long(j)});
        }
        return Long.valueOf(this.b.getLong(str, j));
    }

    public final /* synthetic */ String q(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5676074e", new Object[]{this, str, str2});
        }
        return this.b.getString(str, str2);
    }

    public final /* synthetic */ Set r(String str, Set set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("2edfa597", new Object[]{this, str, set});
        }
        return this.b.getStringSet(str, set);
    }

    @Override // android.content.SharedPreferences
    public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40f04e52", new Object[]{this, onSharedPreferenceChangeListener});
        } else {
            this.b.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
        }
    }

    @Override // android.content.SharedPreferences
    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23481eeb", new Object[]{this, onSharedPreferenceChangeListener});
        } else {
            this.b.unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
        }
    }
}
