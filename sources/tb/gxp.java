package tb;

import android.net.ParseException;
import android.util.Log;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeSet;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class gxp {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static gxp c;
    public static final String[] d;
    public static final e e = new e(null);

    /* renamed from: a  reason: collision with root package name */
    public Map<String, ArrayList<d>> f20297a = new LinkedHashMap(200, 0.75f, true);
    public boolean b = true;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            synchronized (gxp.this) {
                try {
                    for (ArrayList arrayList : gxp.b(gxp.this).values()) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            if (((d) it.next()).e == -1) {
                                it.remove();
                            }
                        }
                    }
                    lt4.m().j();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            synchronized (gxp.this) {
                gxp.c(gxp.this, new LinkedHashMap(200, 0.75f, true));
                lt4.m().h();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            synchronized (gxp.this) {
                try {
                    long currentTimeMillis = System.currentTimeMillis();
                    for (ArrayList arrayList : gxp.b(gxp.this).values()) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            long j = ((d) it.next()).e;
                            if (j > 0 && j < currentTimeMillis) {
                                it.remove();
                            }
                        }
                    }
                    lt4.m().i(currentTimeMillis);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class d {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final byte MODE_DELETED = 2;
        public static final byte MODE_NEW = 0;
        public static final byte MODE_NORMAL = 1;
        public static final byte MODE_REPLACED = 3;

        /* renamed from: a  reason: collision with root package name */
        public String f20301a;
        public String b;
        public String c;
        public String d;
        public long e;
        public long f;
        public long g;
        public boolean h;
        public byte i;

        public d() {
        }

        public boolean a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f8a7b36", new Object[]{this, str})).booleanValue();
            }
            if (!this.f20301a.startsWith(".")) {
                return str.equals(this.f20301a);
            }
            if (!str.endsWith(this.f20301a.substring(1))) {
                return false;
            }
            int length = this.f20301a.length();
            int length2 = str.length();
            if (length2 <= length - 1 || str.charAt(length2 - length) == '.') {
                return true;
            }
            return false;
        }

        public boolean b(d dVar) {
            boolean z;
            boolean z2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("69af0738", new Object[]{this, dVar})).booleanValue();
            }
            if (this.d == null) {
                z = true;
            } else {
                z = false;
            }
            if (dVar.d == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean z3 = z ^ z2;
            if (!this.f20301a.equals(dVar.f20301a) || !this.b.equals(dVar.b) || !this.c.equals(dVar.c) || z3) {
                return false;
            }
            return true;
        }

        public boolean c(String str) {
            int length;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("3a9c5735", new Object[]{this, str})).booleanValue();
            }
            if (!str.startsWith(this.b) || (length = this.b.length()) == 0) {
                return false;
            }
            int length2 = str.length();
            if (this.b.charAt(length - 1) == '/' || length2 <= length || str.charAt(length) == '/') {
                return true;
            }
            return false;
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "domain: " + this.f20301a + "; path: " + this.b + "; name: " + this.c + "; value: " + this.d;
        }

        public d(String str, String str2) {
            this.f20301a = str;
            this.b = str2;
            this.e = -1L;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class e implements Comparator<d> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        /* renamed from: a */
        public int compare(d dVar, d dVar2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("93850e6d", new Object[]{this, dVar, dVar2})).intValue();
            }
            int length = dVar2.b.length() - dVar.b.length();
            if (length != 0) {
                return length;
            }
            int length2 = dVar2.f20301a.length() - dVar.f20301a.length();
            if (length2 != 0) {
                return length2;
            }
            if (dVar2.d == null) {
                if (dVar.d != null) {
                    return -1;
                }
            } else if (dVar.d == null) {
                return 1;
            }
            return dVar.c.compareTo(dVar2.c);
        }

        public /* synthetic */ e(a aVar) {
            this();
        }
    }

    static {
        String[] strArr = {"ac", "co", "com", "ed", "edu", "go", "gouv", "gov", "info", "lg", ErrorType.NETWORK, "net", "or", "org"};
        d = strArr;
        Arrays.sort(strArr);
    }

    public static /* synthetic */ Map b(gxp gxpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("82acf21e", new Object[]{gxpVar});
        }
        return gxpVar.f20297a;
    }

    public static /* synthetic */ Map c(gxp gxpVar, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("8c6379f3", new Object[]{gxpVar, map});
        }
        gxpVar.f20297a = map;
        return map;
    }

    public static synchronized gxp k() {
        synchronized (gxp.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (gxp) ipChange.ipc$dispatch("a84caa3", new Object[0]);
            }
            if (c == null) {
                c = new gxp();
            }
            return c;
        }
    }

    public synchronized boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9882a417", new Object[]{this})).booleanValue();
        }
        return this.b;
    }

    public Object clone() throws CloneNotSupportedException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("78b3604e", new Object[]{this});
        }
        throw new CloneNotSupportedException("doesn't implement Cloneable");
    }

    public synchronized void d(d dVar) {
        String g;
        ArrayList<d> arrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3b03628", new Object[]{this, dVar});
            return;
        }
        if (dVar.i == 2 && (arrayList = this.f20297a.get((g = g(dVar.f20301a)))) != null) {
            arrayList.remove(dVar);
            if (arrayList.isEmpty()) {
                this.f20297a.remove(g);
            }
        }
    }

    public synchronized ArrayList<d> e() {
        int i = 0;
        synchronized (this) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ArrayList) ipChange.ipc$dispatch("321e12c9", new Object[]{this});
            }
            int size = this.f20297a.size();
            if (size < 15) {
                Iterator<ArrayList<d>> it = this.f20297a.values().iterator();
                while (it.hasNext() && i < 1000) {
                    i += it.next().size();
                }
            }
            ArrayList<d> arrayList = new ArrayList<>();
            if (size >= 15 || i >= 1000) {
                Object[] array = this.f20297a.keySet().toArray();
                int i2 = (size / 10) + 1;
                while (true) {
                    int i3 = i2 - 1;
                    if (i2 <= 0) {
                        break;
                    }
                    String obj = array[i3].toString();
                    arrayList.addAll(this.f20297a.get(obj));
                    this.f20297a.remove(obj);
                    i2 = i3;
                }
            }
            return arrayList;
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd889d8b", new Object[]{this});
        } else {
            lt4.m().f();
        }
    }

    public final String g(String str) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("77c80ce4", new Object[]{this, str});
        }
        int indexOf = str.indexOf(46);
        int lastIndexOf = str.lastIndexOf(46);
        while (indexOf < lastIndexOf) {
            i = indexOf + 1;
            indexOf = str.indexOf(46, i);
        }
        if (i > 0) {
            return str.substring(i);
        }
        return str;
    }

    public String h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3341ef95", new Object[]{this, str});
        }
        try {
            return i(new tyw(str));
        } catch (ParseException unused) {
            Log.e("webkit", "Bad address: " + str);
            return null;
        }
    }

    public synchronized String i(tyw tywVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9fb942e7", new Object[]{this, tywVar});
        }
        if (this.b && tywVar != null) {
            String[] j = j(tywVar);
            if (j == null) {
                return null;
            }
            String g = g(j[0]);
            ArrayList<d> arrayList = this.f20297a.get(g);
            if (arrayList == null) {
                arrayList = lt4.m().l(g);
                this.f20297a.put(g, arrayList);
            }
            long currentTimeMillis = System.currentTimeMillis();
            boolean equals = "https".equals(tywVar.f29036a);
            Iterator<d> it = arrayList.iterator();
            TreeSet treeSet = new TreeSet(e);
            while (it.hasNext()) {
                d next = it.next();
                if (next.a(j[0]) && next.c(j[1])) {
                    long j2 = next.e;
                    if (j2 < 0 || j2 > currentTimeMillis) {
                        if (!next.h || equals) {
                            if (next.i != 2) {
                                next.f = currentTimeMillis;
                                treeSet.add(next);
                            }
                        }
                    }
                }
            }
            StringBuilder sb = new StringBuilder(256);
            Iterator it2 = treeSet.iterator();
            while (it2.hasNext()) {
                d dVar = (d) it2.next();
                if (sb.length() > 0) {
                    sb.append(';');
                    sb.append(' ');
                }
                sb.append(dVar.c);
                if (dVar.d != null) {
                    sb.append('=');
                    sb.append(dVar.d);
                }
            }
            if (sb.length() <= 0) {
                return null;
            }
            return sb.toString();
        }
        return null;
    }

    public final String[] j(tyw tywVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("b37f85ac", new Object[]{this, tywVar});
        }
        String str = tywVar.b;
        if (str == null || tywVar.d == null) {
            return null;
        }
        String lowerCase = str.toLowerCase();
        String[] strArr = {lowerCase, tywVar.d};
        int indexOf = lowerCase.indexOf(46);
        if (indexOf == -1) {
            if (tywVar.f29036a.equalsIgnoreCase("file")) {
                strArr[0] = "localhost";
            }
        } else if (indexOf == strArr[0].lastIndexOf(46)) {
            strArr[0] = "." + strArr[0];
        }
        if (strArr[1].charAt(0) != '/') {
            return null;
        }
        int indexOf2 = strArr[1].indexOf(63);
        if (indexOf2 != -1) {
            strArr[1] = strArr[1].substring(0, indexOf2);
        }
        return strArr;
    }

    public synchronized ArrayList<d> l(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("bc0b7567", new Object[]{this, new Long(j)});
        }
        ArrayList<d> arrayList = new ArrayList<>();
        for (ArrayList<d> arrayList2 : this.f20297a.values()) {
            Iterator<d> it = arrayList2.iterator();
            while (it.hasNext()) {
                d next = it.next();
                if (next.g > j) {
                    arrayList.add(next);
                }
            }
        }
        return arrayList;
    }

    public synchronized boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("943b38a0", new Object[]{this})).booleanValue();
        }
        return lt4.m().n();
    }

    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88e96b48", new Object[]{this});
        } else {
            new Thread(new b(), "clearCache").start();
        }
    }

    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32b435cc", new Object[]{this});
        } else {
            new Thread(new c(), "removeExpiredCookie").start();
        }
    }

    public void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79ab37fd", new Object[]{this});
        } else {
            new Thread(new a(), "PatronsClearCache").start();
        }
    }

    public synchronized void r(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a69d24df", new Object[]{this, new Boolean(z)});
        } else {
            this.b = z;
        }
    }

    public void s(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d42fc581", new Object[]{this, str, str2});
            return;
        }
        try {
            t(new tyw(str), str2);
        } catch (ParseException unused) {
            Log.e("webkit", "Bad address: " + str);
        }
    }

    public synchronized void u(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f1a5f39", new Object[]{this, dVar});
        } else {
            dVar.i = (byte) 1;
        }
    }

    public final ArrayList<d> n(String str, String str2, String str3) {
        int indexOf;
        int indexOf2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("de3de536", new Object[]{this, str, str2, str3});
        }
        ArrayList<d> arrayList = new ArrayList<>();
        int length = str3.length();
        int i = 0;
        while (i >= 0 && i < length) {
            char c2 = ' ';
            if (str3.charAt(i) == ' ') {
                i++;
            } else {
                i = str3.indexOf(59, i);
                int indexOf3 = str3.indexOf(61, i);
                d dVar = new d(str, str2);
                int i2 = -1;
                if ((i == -1 || i >= indexOf3) && indexOf3 != -1) {
                    dVar.c = str3.substring(i, indexOf3);
                    if (indexOf3 < length - 1 && str3.charAt(indexOf3 + 1) == '\"' && (i = str3.indexOf(34, indexOf3 + 2)) == -1) {
                        break;
                    }
                    int indexOf4 = str3.indexOf(59, i);
                    i = indexOf4 == -1 ? length : indexOf4;
                    if (i - indexOf3 > 4096) {
                        dVar.d = str3.substring(indexOf3 + 1, indexOf3 + 4097);
                    } else {
                        int i3 = indexOf3 + 1;
                        if (i3 == i || i < indexOf3) {
                            dVar.d = "";
                        } else {
                            dVar.d = str3.substring(i3, i);
                        }
                    }
                } else {
                    if (i == -1) {
                        i = length;
                    }
                    dVar.c = str3.substring(i, i);
                    dVar.d = null;
                }
                while (true) {
                    if (i < 0 || i >= length) {
                        break;
                    }
                    if (str3.charAt(i) == c2 || str3.charAt(i) == ';') {
                        i++;
                    } else if (str3.charAt(i) == ',') {
                        i++;
                        break;
                    } else {
                        int i4 = length - i;
                        if (i4 >= 6) {
                            int i5 = i + 6;
                            if (str3.substring(i, i5).equalsIgnoreCase("secure")) {
                                dVar.h = true;
                                if (i5 == length) {
                                    i = i5;
                                    break;
                                }
                                i = str3.charAt(i5) == '=' ? i + 7 : i5;
                                c2 = ' ';
                            }
                        }
                        if (i4 >= 8) {
                            int i6 = i + 8;
                            if (str3.substring(i, i6).equalsIgnoreCase("httponly")) {
                                if (i6 == length) {
                                    i = i6;
                                    break;
                                }
                                i = str3.charAt(i6) == '=' ? i + 9 : i6;
                                c2 = ' ';
                            }
                        }
                        int indexOf5 = str3.indexOf(61, i);
                        if (indexOf5 > 0) {
                            String lowerCase = str3.substring(i, indexOf5).toLowerCase();
                            if (lowerCase.equals("expires") && (indexOf2 = str3.indexOf(44, indexOf5)) != i2 && indexOf2 - indexOf5 <= 10) {
                                i = indexOf2 + 1;
                            }
                            i = str3.indexOf(59, i);
                            int indexOf6 = str3.indexOf(44, i);
                            if (i == -1 && indexOf6 == -1) {
                                i = length;
                            } else if (i == -1) {
                                i = indexOf6;
                            } else if (indexOf6 != -1) {
                                i = Math.min(i, indexOf6);
                            }
                            String substring = str3.substring(indexOf5 + 1, i);
                            if (substring.length() > 2 && substring.charAt(0) == '\"' && (indexOf = substring.indexOf(34, 1)) > 0) {
                                substring = substring.substring(1, indexOf);
                            }
                            if (lowerCase.equals("expires")) {
                                try {
                                    dVar.e = wv0.e(substring);
                                } catch (IllegalArgumentException unused) {
                                    Log.e("webkit", "illegal format for expires: " + substring);
                                }
                            } else if (lowerCase.equals("max-age")) {
                                try {
                                    dVar.e = System.currentTimeMillis() + (Long.parseLong(substring) * 1000);
                                } catch (NumberFormatException unused2) {
                                    Log.e("webkit", "illegal format for max-age: " + substring);
                                }
                            } else if (lowerCase.equals("path")) {
                                if (substring.length() > 0) {
                                    dVar.b = substring;
                                }
                            } else if (lowerCase.equals("domain")) {
                                int lastIndexOf = substring.lastIndexOf(46);
                                if (lastIndexOf == 0) {
                                    dVar.f20301a = null;
                                } else {
                                    int i7 = lastIndexOf + 1;
                                    try {
                                        Integer.parseInt(substring.substring(i7));
                                        if (!substring.equals(str)) {
                                            dVar.f20301a = null;
                                        }
                                    } catch (NumberFormatException unused3) {
                                        String lowerCase2 = substring.toLowerCase();
                                        if (lowerCase2.charAt(0) != '.') {
                                            lowerCase2 = ".".concat(lowerCase2);
                                            lastIndexOf = i7;
                                        }
                                        if (str.endsWith(lowerCase2.substring(1))) {
                                            int length2 = lowerCase2.length();
                                            int length3 = str.length();
                                            if (length3 <= length2 - 1 || str.charAt(length3 - length2) == '.') {
                                                if (length2 == lastIndexOf + 3 && length2 >= 6) {
                                                    if (length2 > 8 || Arrays.binarySearch(d, lowerCase2.substring(1, lastIndexOf)) < 0) {
                                                        dVar.f20301a = lowerCase2;
                                                    } else {
                                                        dVar.f20301a = null;
                                                    }
                                                }
                                                dVar.f20301a = lowerCase2;
                                            } else {
                                                dVar.f20301a = null;
                                            }
                                        } else {
                                            dVar.f20301a = null;
                                        }
                                    }
                                }
                            }
                        } else {
                            i = length;
                            c2 = ' ';
                        }
                    }
                    i2 = -1;
                    c2 = ' ';
                }
                if (dVar.f20301a != null) {
                    arrayList.add(dVar);
                }
            }
        }
        return arrayList;
    }

    public synchronized void t(tyw tywVar, String str) {
        ArrayList<d> arrayList;
        byte b2 = 0;
        byte b3 = 3;
        synchronized (this) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9b44c66f", new Object[]{this, tywVar, str});
            } else if (str == null || str.length() <= 4096) {
                if (this.b && tywVar != null) {
                    String[] j = j(tywVar);
                    if (j != null) {
                        if (j[1].length() > 1) {
                            int lastIndexOf = j[1].lastIndexOf(47);
                            String str2 = j[1];
                            if (lastIndexOf <= 0) {
                                lastIndexOf++;
                            }
                            j[1] = str2.substring(0, lastIndexOf);
                        }
                        try {
                            arrayList = n(j[0], j[1], str);
                        } catch (RuntimeException unused) {
                            Log.e("webkit", "parse cookie failed for: " + str);
                            arrayList = null;
                        }
                        if (!(arrayList == null || arrayList.size() == 0)) {
                            String g = g(j[0]);
                            ArrayList<d> arrayList2 = this.f20297a.get(g);
                            if (arrayList2 == null) {
                                arrayList2 = lt4.m().l(g);
                                this.f20297a.put(g, arrayList2);
                            }
                            long currentTimeMillis = System.currentTimeMillis();
                            int size = arrayList.size();
                            int i = 0;
                            while (i < size) {
                                d dVar = arrayList.get(i);
                                Iterator<d> it = arrayList2.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        d next = it.next();
                                        if (dVar.b(next)) {
                                            size = size;
                                            long j2 = dVar.e;
                                            if (j2 >= 0 && j2 <= currentTimeMillis) {
                                                next.g = currentTimeMillis;
                                                next.i = (byte) 2;
                                            }
                                            if (!next.h || "https".equals(tywVar.f29036a)) {
                                                next.d = dVar.d;
                                                next.e = dVar.e;
                                                next.h = dVar.h;
                                                next.f = currentTimeMillis;
                                                next.g = currentTimeMillis;
                                                next.i = b3;
                                            }
                                        }
                                    } else {
                                        size = size;
                                        long j3 = dVar.e;
                                        if (j3 < 0 || j3 > currentTimeMillis) {
                                            dVar.f = currentTimeMillis;
                                            dVar.g = currentTimeMillis;
                                            dVar.i = b2;
                                            if (arrayList2.size() > 50) {
                                                d dVar2 = new d();
                                                dVar2.f = currentTimeMillis;
                                                Iterator<d> it2 = arrayList2.iterator();
                                                while (it2.hasNext()) {
                                                    d next2 = it2.next();
                                                    if (next2.f < dVar2.f && next2.i != 2) {
                                                        dVar2 = next2;
                                                    }
                                                }
                                                dVar2.i = (byte) 2;
                                            }
                                            arrayList2.add(dVar);
                                        }
                                    }
                                }
                                i++;
                                b2 = 0;
                                b3 = 3;
                            }
                        }
                    }
                }
            }
        }
    }
}
