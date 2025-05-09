package tb;

import android.app.Application;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import tb.c0c;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class gc9 implements c0c {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_PATH_SAVE_TYPE = "retention_type_use_parse_key_type";
    public static final String SLICE_DATA_DIR = "metrickit" + File.separator + "upload";

    /* renamed from: a  reason: collision with root package name */
    public final String f19889a;
    public final Application b;
    public final File c;
    public final boolean d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements c0c.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final Set<String> f19890a;
        public final boolean b;

        public b() {
            this.f19890a = new HashSet();
            this.b = true;
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
            return true ^ ((HashSet) this.f19890a).isEmpty();
        }

        @Override // tb.c0c.a
        public c0c.a c(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c0c.a) ipChange.ipc$dispatch("ab23e02e", new Object[]{this, str, str2});
            }
            String h = h(str);
            gc9.this.b(h);
            g("addElement", gc9.h(gc9.this) + h, str2);
            return this;
        }

        @Override // tb.c0c.a
        public void commit() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c9f3a3e", new Object[]{this});
                return;
            }
            if (!gc9.e(gc9.this).exists()) {
                gc9.i(gc9.f(gc9.this));
            }
            StringBuilder sb = new StringBuilder(200);
            Iterator it = ((HashSet) this.f19890a).iterator();
            while (it.hasNext()) {
                sb.append((String) it.next());
                sb.append("\n");
            }
            ng9.b(gc9.e(gc9.this).getPath(), sb.toString(), this.b);
            ((HashSet) this.f19890a).clear();
        }

        @Override // tb.c0c.a
        public c0c.a d(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c0c.a) ipChange.ipc$dispatch("5a3e8b33", new Object[]{this, str});
            }
            String h = h(str);
            gc9.this.b(h);
            g("incrementInt", gc9.h(gc9.this) + h, null);
            return this;
        }

        @Override // tb.c0c.a
        public c0c.a e(Map<String, ?> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c0c.a) ipChange.ipc$dispatch("a3399086", new Object[]{this, map});
            }
            if (map != null && !map.isEmpty()) {
                for (Map.Entry<String, ?> entry : map.entrySet()) {
                    if (!TextUtils.isEmpty(entry.getKey())) {
                        Object value = entry.getValue();
                        if (value instanceof String) {
                            putString(entry.getKey(), (String) value);
                        }
                        if (value instanceof Boolean) {
                            putBoolean(entry.getKey(), ((Boolean) entry.getValue()).booleanValue());
                        }
                        if (value instanceof Integer) {
                            putInt(entry.getKey(), ((Integer) entry.getValue()).intValue());
                        }
                        if (value instanceof Long) {
                            putLong(entry.getKey(), ((Long) entry.getValue()).longValue());
                        }
                        if (value instanceof Float) {
                            putFloat(entry.getKey(), ((Float) entry.getValue()).floatValue());
                        }
                    }
                }
            }
            return this;
        }

        @Override // tb.c0c.a
        public c0c.a f(String str, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c0c.a) ipChange.ipc$dispatch("17a3c93c", new Object[]{this, str, new Long(j)});
            }
            String h = h(str);
            gc9.this.b(h);
            g("incrementLong", gc9.h(gc9.this) + h, String.valueOf(j));
            return this;
        }

        public final void g(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4afc1350", new Object[]{this, str, str2, str3});
                return;
            }
            Set<String> set = this.f19890a;
            ((HashSet) set).add(str + " " + str2 + "=" + str3);
        }

        public final String h(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("7e21b1a6", new Object[]{this, str});
            }
            if (gc9.g(gc9.this)) {
                return a0c.e(str);
            }
            return a0c.d(str);
        }

        @Override // tb.c0c.a
        public c0c.a putBoolean(String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c0c.a) ipChange.ipc$dispatch("fe7facba", new Object[]{this, str, new Boolean(z)});
            }
            String h = h(str);
            gc9.this.b(h);
            g("boolean", gc9.h(gc9.this) + h, String.valueOf(z));
            return this;
        }

        @Override // tb.c0c.a
        public c0c.a putFloat(String str, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c0c.a) ipChange.ipc$dispatch("64e1c7c2", new Object[]{this, str, new Float(f)});
            }
            String h = h(str);
            gc9.this.b(h);
            g("float", gc9.h(gc9.this) + h, String.valueOf(f));
            return this;
        }

        @Override // tb.c0c.a
        public c0c.a putInt(String str, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c0c.a) ipChange.ipc$dispatch("cbf49b2", new Object[]{this, str, new Integer(i)});
            }
            String h = h(str);
            gc9.this.b(h);
            g("int", gc9.h(gc9.this) + h, String.valueOf(i));
            return this;
        }

        @Override // tb.c0c.a
        public c0c.a putLong(String str, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c0c.a) ipChange.ipc$dispatch("155380dc", new Object[]{this, str, new Long(j)});
            }
            String h = h(str);
            gc9.this.b(h);
            g("long", gc9.h(gc9.this) + h, String.valueOf(j));
            return this;
        }

        @Override // tb.c0c.a
        public c0c.a putString(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c0c.a) ipChange.ipc$dispatch("9ee922e9", new Object[]{this, str, str2});
            }
            String h = h(str);
            gc9.this.b(h);
            g(pg1.ATOM_String, gc9.h(gc9.this) + h, str2);
            return this;
        }
    }

    public gc9(Application application, String str, long j) {
        this(application, str, new File(n(application) + m(c0c.SIMPLE_DATE_FORMAT.format(new Date()), j)));
    }

    public static /* synthetic */ File e(gc9 gc9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("971e9eff", new Object[]{gc9Var});
        }
        return gc9Var.c;
    }

    public static /* synthetic */ Application f(gc9 gc9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Application) ipChange.ipc$dispatch("6b4a9d1e", new Object[]{gc9Var});
        }
        return gc9Var.b;
    }

    public static /* synthetic */ boolean g(gc9 gc9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5ae547d4", new Object[]{gc9Var})).booleanValue();
        }
        return gc9Var.d;
    }

    public static /* synthetic */ String h(gc9 gc9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("da13a76f", new Object[]{gc9Var});
        }
        return gc9Var.f19889a;
    }

    public static void i(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e03c7136", new Object[]{application});
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(application.getCacheDir().getPath());
        String str = File.separator;
        sb.append(str);
        sb.append(SLICE_DATA_DIR);
        sb.append(str);
        File[] listFiles = new File(sb.toString()).listFiles();
        if (listFiles != null && listFiles.length >= 10) {
            Arrays.sort(listFiles, new Comparator() { // from class: tb.fc9
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int l;
                    l = gc9.l((File) obj, (File) obj2);
                    return l;
                }
            });
            for (int i = 0; i < listFiles.length - 9; i++) {
                listFiles[i].delete();
            }
        }
    }

    public static /* synthetic */ int l(File file, File file2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("165ff773", new Object[]{file, file2})).intValue();
        }
        return Long.compare(file2.lastModified(), file.lastModified());
    }

    public static String m(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2483bfe2", new Object[]{str, new Long(j)});
        }
        return "metrickit_V1_" + j + "_" + str + ".txt";
    }

    public static String n(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a74eecd", new Object[]{application});
        }
        StringBuilder sb = new StringBuilder();
        sb.append(application.getCacheDir().getPath());
        String str = File.separator;
        sb.append(str);
        sb.append(SLICE_DATA_DIR);
        sb.append(str);
        return sb.toString();
    }

    @Override // tb.c0c
    public c0c a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c0c) ipChange.ipc$dispatch("b9ba8740", new Object[]{this, str});
        }
        if (!this.d) {
            j(str);
            Application application = this.b;
            return new gc9(application, this.f19889a + str, this.c);
        }
        throw new RuntimeException("KEY_PATH_SAVE_TYPE cannot getSubDomain!");
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
        return new b();
    }

    @Override // tb.c0c
    public float getFloat(String str, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("86205bd9", new Object[]{this, str, new Float(f)})).floatValue();
        }
        throw new RuntimeException("FileDomainStorage cannot be read!");
    }

    @Override // tb.c0c
    public int getInt(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("235381ac", new Object[]{this, str, new Integer(i)})).intValue();
        }
        throw new RuntimeException("FileDomainStorage cannot be read!");
    }

    @Override // tb.c0c
    public long getLong(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b7efaf15", new Object[]{this, str, new Long(j)})).longValue();
        }
        throw new RuntimeException("FileDomainStorage cannot be read!");
    }

    @Override // tb.c0c
    public String getString(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7e264abe", new Object[]{this, str, str2});
        }
        throw new RuntimeException("FileDomainStorage cannot be read!");
    }

    public /* synthetic */ void j(String str) {
        a0c.a(this, str);
    }

    @Override // tb.c0c
    public Set<String> keySet() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("8b9b42f9", new Object[]{this});
        }
        throw new RuntimeException("FileDomainStorage cannot be read!");
    }

    public gc9(Application application, String str, File file) {
        this.d = false;
        this.b = application;
        this.c = file;
        if (TextUtils.equals(KEY_PATH_SAVE_TYPE, str)) {
            this.f19889a = "";
            this.d = true;
        } else if (TextUtils.isEmpty(str)) {
            this.f19889a = "";
        } else {
            this.f19889a = str + "^";
        }
    }

    public Map<String, ?> k() {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("9b1257e5", new Object[]{this});
        }
        String a2 = ng9.a(this.c);
        if (TextUtils.isEmpty(a2)) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap();
        for (String str : a2.split("\n")) {
            if (!TextUtils.isEmpty(str)) {
                String[] split2 = str.split(" ", 2);
                if (split2.length == 2) {
                    String[] split3 = split2[1].split("=", 2);
                    if (split3.length == 2 && !TextUtils.isEmpty(split3[0])) {
                        String str2 = split2[0];
                        str2.hashCode();
                        char c = 65535;
                        switch (str2.hashCode()) {
                            case -1808118735:
                                if (str2.equals(pg1.ATOM_String)) {
                                    c = 0;
                                    break;
                                }
                                break;
                            case -713217536:
                                if (str2.equals("incrementInt")) {
                                    c = 1;
                                    break;
                                }
                                break;
                            case -634816885:
                                if (str2.equals("incrementLong")) {
                                    c = 2;
                                    break;
                                }
                                break;
                            case 104431:
                                if (str2.equals("int")) {
                                    c = 3;
                                    break;
                                }
                                break;
                            case 3327612:
                                if (str2.equals("long")) {
                                    c = 4;
                                    break;
                                }
                                break;
                            case 64711720:
                                if (str2.equals("boolean")) {
                                    c = 5;
                                    break;
                                }
                                break;
                            case 97526364:
                                if (str2.equals("float")) {
                                    c = 6;
                                    break;
                                }
                                break;
                            case 245397275:
                                if (str2.equals("addElement")) {
                                    c = 7;
                                    break;
                                }
                                break;
                        }
                        switch (c) {
                            case 0:
                                hashMap.put(split3[0], split3[1]);
                                continue;
                            case 1:
                                Object obj = hashMap.get(split3[0]);
                                int e = rrl.e(split3[1], 1);
                                if (!(obj instanceof Integer)) {
                                    hashMap.put(split3[0], Integer.valueOf(e));
                                    break;
                                } else {
                                    hashMap.put(split3[0], Integer.valueOf(((Integer) obj).intValue() + e));
                                    continue;
                                }
                            case 2:
                                Object obj2 = hashMap.get(split3[0]);
                                long f = rrl.f(split3[1], 1L);
                                if (!(obj2 instanceof Long)) {
                                    hashMap.put(split3[0], Long.valueOf(f));
                                    break;
                                } else {
                                    hashMap.put(split3[0], Long.valueOf(((Long) obj2).longValue() + f));
                                    continue;
                                }
                            case 3:
                                hashMap.put(split3[0], Integer.valueOf(Integer.parseInt(split3[1])));
                                continue;
                            case 4:
                                hashMap.put(split3[0], Long.valueOf(Long.parseLong(split3[1])));
                                continue;
                            case 5:
                                hashMap.put(split3[0], Boolean.valueOf(Boolean.parseBoolean(split3[1])));
                                continue;
                            case 6:
                                hashMap.put(split3[0], Float.valueOf(Float.parseFloat(split3[1])));
                                continue;
                            case 7:
                                Object obj3 = hashMap.get(split3[0]);
                                String str3 = split3[1];
                                if (!(obj3 instanceof String)) {
                                    hashMap.put(split3[0], str3);
                                    break;
                                } else {
                                    hashMap.put(split3[0], obj3 + "," + str3);
                                    continue;
                                }
                        }
                    }
                }
            }
        }
        return hashMap;
    }
}
