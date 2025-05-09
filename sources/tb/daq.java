package tb;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import tb.c0c;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class daq implements c0c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile SharedPreferences d;
    public static volatile boolean e;

    /* renamed from: a  reason: collision with root package name */
    public final String f17688a;
    public final Application b;
    public final ss7 c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements c0c.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.c0c.a
        public /* synthetic */ c0c.a a(String str, String str2) {
            b0c.b(this, str, str2);
            return this;
        }

        @Override // tb.c0c.a
        public boolean b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("977ebe45", new Object[]{this})).booleanValue();
            }
            return daq.d(daq.this).b();
        }

        @Override // tb.c0c.a
        public c0c.a c(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c0c.a) ipChange.ipc$dispatch("ab23e02e", new Object[]{this, str, str2});
            }
            daq.this.h(str);
            ss7 d = daq.d(daq.this);
            d.c(daq.e(daq.this) + str, str2);
            return this;
        }

        @Override // tb.c0c.a
        public void commit() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c9f3a3e", new Object[]{this});
            } else {
                daq.d(daq.this).commit();
            }
        }

        @Override // tb.c0c.a
        public c0c.a d(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c0c.a) ipChange.ipc$dispatch("5a3e8b33", new Object[]{this, str});
            }
            putInt(str, daq.this.getInt(str, 0) + 1);
            return this;
        }

        @Override // tb.c0c.a
        public /* synthetic */ c0c.a e(Map map) {
            b0c.a(this, map);
            throw null;
        }

        @Override // tb.c0c.a
        public c0c.a f(String str, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c0c.a) ipChange.ipc$dispatch("17a3c93c", new Object[]{this, str, new Long(j)});
            }
            putLong(str, daq.this.getLong(str, 0L) + j);
            return this;
        }

        @Override // tb.c0c.a
        public c0c.a putBoolean(String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c0c.a) ipChange.ipc$dispatch("fe7facba", new Object[]{this, str, new Boolean(z)});
            }
            daq.this.h(str);
            ss7 d = daq.d(daq.this);
            d.putBoolean(daq.e(daq.this) + str, z);
            return this;
        }

        @Override // tb.c0c.a
        public c0c.a putFloat(String str, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c0c.a) ipChange.ipc$dispatch("64e1c7c2", new Object[]{this, str, new Float(f)});
            }
            daq.this.h(str);
            ss7 d = daq.d(daq.this);
            d.putFloat(daq.e(daq.this) + str, f);
            return this;
        }

        @Override // tb.c0c.a
        public c0c.a putInt(String str, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c0c.a) ipChange.ipc$dispatch("cbf49b2", new Object[]{this, str, new Integer(i)});
            }
            daq.this.h(str);
            ss7 d = daq.d(daq.this);
            d.putInt(daq.e(daq.this) + str, i);
            return this;
        }

        @Override // tb.c0c.a
        public c0c.a putLong(String str, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c0c.a) ipChange.ipc$dispatch("155380dc", new Object[]{this, str, new Long(j)});
            }
            daq.this.h(str);
            ss7 d = daq.d(daq.this);
            d.putLong(daq.e(daq.this) + str, j);
            return this;
        }

        @Override // tb.c0c.a
        public c0c.a putString(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c0c.a) ipChange.ipc$dispatch("9ee922e9", new Object[]{this, str, str2});
            }
            daq.this.h(str);
            ss7 d = daq.d(daq.this);
            d.putString(daq.e(daq.this) + str, str2);
            return this;
        }
    }

    public daq(Application application, String str) {
        this(application, str, new ss7(application));
    }

    public static /* synthetic */ ss7 d(daq daqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ss7) ipChange.ipc$dispatch("a739da3e", new Object[]{daqVar});
        }
        return daqVar.c;
    }

    public static /* synthetic */ String e(daq daqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("18ea1091", new Object[]{daqVar});
        }
        return daqVar.f17688a;
    }

    public static long f(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d16f426b", new Object[]{application})).longValue();
        }
        return i(application).getLong(c0c.VALID_STORAGE_LAUNCH_SESSION, -1L);
    }

    public static SharedPreferences i(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("684fc578", new Object[]{context});
        }
        if (d == null) {
            synchronized (daq.class) {
                try {
                    if (d == null) {
                        d = m7l.a(context, "MetricKitDomainStorage", 0);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return d;
    }

    @Override // tb.c0c
    public c0c a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c0c) ipChange.ipc$dispatch("b9ba8740", new Object[]{this, str});
        }
        h(str);
        Application application = this.b;
        return new daq(application, this.f17688a + str, this.c);
    }

    @Override // tb.c0c
    public /* synthetic */ void b(String str) {
        a0c.b(this, str);
    }

    @Override // tb.c0c
    public c0c.a c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c0c.a) ipChange.ipc$dispatch("6f1aa17a", new Object[]{this});
        }
        return new a();
    }

    @Override // tb.c0c
    public float getFloat(String str, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("86205bd9", new Object[]{this, str, new Float(f)})).floatValue();
        }
        h(str);
        SharedPreferences i = i(this.b);
        return i.getFloat(this.f17688a + str, f);
    }

    @Override // tb.c0c
    public int getInt(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("235381ac", new Object[]{this, str, new Integer(i)})).intValue();
        }
        h(str);
        SharedPreferences i2 = i(this.b);
        return i2.getInt(this.f17688a + str, i);
    }

    @Override // tb.c0c
    public long getLong(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b7efaf15", new Object[]{this, str, new Long(j)})).longValue();
        }
        h(str);
        SharedPreferences i = i(this.b);
        return i.getLong(this.f17688a + str, j);
    }

    @Override // tb.c0c
    public String getString(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7e264abe", new Object[]{this, str, str2});
        }
        h(str);
        SharedPreferences i = i(this.b);
        return i.getString(this.f17688a + str, str2);
    }

    public /* synthetic */ void h(String str) {
        a0c.a(this, str);
    }

    @Override // tb.c0c
    public Set<String> keySet() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("8b9b42f9", new Object[]{this});
        }
        Map<String, ?> all = i(this.b).getAll();
        if (all == null || all.size() == 0) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet();
        for (String str : all.keySet()) {
            if (!TextUtils.isEmpty(str) && str.startsWith(this.f17688a)) {
                String[] split = str.substring(this.f17688a.length()).split(c0c.UNESCAPED_SEPARATOR);
                if (split.length >= 1) {
                    hashSet.add(split[0]);
                }
            }
        }
        return hashSet;
    }

    public daq(Application application, String str, ss7 ss7Var) {
        this.f17688a = str + "^";
        this.b = application;
        this.c = ss7Var;
        if (!e) {
            synchronized (daq.class) {
                try {
                    if (!e) {
                        i(application).edit().clear().putLong(c0c.VALID_STORAGE_LAUNCH_SESSION, c0c.LAUNCH_SESSION).putString(c0c.VALID_STORAGE_DATE, c0c.SIMPLE_DATE_FORMAT.format(new Date())).putInt(c0c.VALID_STORAGE_PID, kw4.pid).apply();
                        e = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static int g(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b231c3c2", new Object[]{application})).intValue();
        }
        return i(application).getInt(c0c.VALID_STORAGE_PID, 0);
    }
}
