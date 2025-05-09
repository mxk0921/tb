package tb;

import android.os.Process;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.trtc.api.TrtcConstants;
import java.io.File;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class hqt {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Method b;
    public static final int[] c = {TrtcConstants.TRTC_ERROR_CODE_USER_HAS_JOINED};
    public static final int d = Process.myPid();

    /* renamed from: a  reason: collision with root package name */
    public static final File f20830a = new File("/proc/" + Process.myPid() + "/task/");

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f20831a;

        public a(int i, String str) {
            this.f20831a = str;
        }

        public String a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("136b982e", new Object[]{this});
            }
            return this.f20831a;
        }
    }

    public static String c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c4d25e8", new Object[]{str, str2});
        }
        if (str.length() > str2.length()) {
            return str;
        }
        return str2;
    }

    public static String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("14e9a0e9", new Object[0]);
        }
        try {
            List<a> i = i();
            HashMap hashMap = new HashMap();
            for (a aVar : i) {
                String b2 = b(aVar.a());
                Integer num = (Integer) hashMap.get(b2);
                if (num == null) {
                    hashMap.put(b2, 1);
                } else {
                    hashMap.put(b2, Integer.valueOf(num.intValue() + 1));
                }
            }
            ArrayList arrayList = new ArrayList(hashMap.entrySet());
            Collections.sort(arrayList, new Comparator() { // from class: tb.gqt
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int f;
                    f = hqt.f((Map.Entry) obj, (Map.Entry) obj2);
                    return f;
                }
            });
            return arrayList.toString();
        } catch (Throwable th) {
            ehh.d(th);
            return "exception";
        }
    }

    public static int e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e647331d", new Object[]{str})).intValue();
        }
        if (str == null) {
            return -1;
        }
        int lastIndexOf = str.lastIndexOf("\\.");
        if (lastIndexOf != -1) {
            str = str.substring(lastIndexOf + 1);
        }
        return Integer.valueOf(str).intValue();
    }

    public static /* synthetic */ int f(Map.Entry entry, Map.Entry entry2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9f358a19", new Object[]{entry, entry2})).intValue();
        }
        return ((Integer) entry2.getValue()).compareTo((Integer) entry.getValue());
    }

    public static String g(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("857aef62", new Object[]{new Integer(i)});
        }
        try {
            String d2 = kg9.d(new File("/proc/" + d + "/task/" + i + "/comm"));
            if (d2 != null) {
                return d2.trim();
            }
            return "";
        } catch (Throwable th) {
            ehh.d(th);
            return "";
        }
    }

    public static String h(int i) {
        String[] strArr = new String[1];
        try {
            Method method = b;
            method.invoke(null, "/proc/" + d + "/task/" + i + "/comm", c, strArr, null, null);
        } catch (Exception e) {
            ehh.d(e);
        }
        StringBuilder sb = new StringBuilder();
        String str = strArr[0];
        if (!TextUtils.isEmpty(str)) {
            sb.append(str.trim());
        }
        return sb.toString();
    }

    public static List<a> i() {
        String[] list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("c02d9165", new Object[0]);
        }
        ArrayList arrayList = new ArrayList();
        try {
            File file = f20830a;
            if (file.isDirectory() && (list = file.list()) != null) {
                for (String str : list) {
                    int e = e(str);
                    String str2 = "";
                    if (e != -1) {
                        str2 = c(h(e), g(e));
                    }
                    arrayList.add(new a(e, str2));
                }
            }
        } catch (Exception e2) {
            ehh.d(e2);
        }
        return arrayList;
    }

    public static String b(String str) {
        char[] charArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e13d4a05", new Object[]{str});
        }
        StringBuilder sb = new StringBuilder();
        if (str.toLowerCase().contains("binder:")) {
            return "binder:x";
        }
        boolean z = false;
        for (char c2 : str.toCharArray()) {
            if (c2 < '0' || c2 > '9') {
                sb.append(c2);
                z = false;
            } else {
                if (!z) {
                    sb.append("x");
                }
                z = true;
            }
        }
        return sb.toString();
    }

    static {
        try {
            Method method = Process.class.getMethod("readProcFile", String.class, int[].class, String[].class, long[].class, float[].class);
            b = method;
            method.setAccessible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
