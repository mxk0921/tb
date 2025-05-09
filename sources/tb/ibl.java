package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.serializer.SimplePropertyPreFilter;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.upp.d;
import com.taobao.orange.OConstant;
import com.taobao.orange.model.IndexDO;
import com.taobao.orange.model.NameSpaceDO;
import com.taobao.orange.sync.IndexUpdateHandler;
import com.taobao.orange.util.OLog;
import java.io.Closeable;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TreeMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ibl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Boolean f21209a = null;
    public static Boolean b = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a implements Comparator<String> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f21210a;

        public a(boolean z) {
            this.f21210a = z;
        }

        /* renamed from: a */
        public int compare(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("2b88f5f3", new Object[]{this, str, str2})).intValue();
            }
            if (this.f21210a) {
                return str.compareTo(str2);
            }
            return str2.compareTo(str);
        }
    }

    static {
        t2o.a(613417124);
    }

    public static void a(Closeable closeable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10f5fa8c", new Object[]{closeable});
        } else if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static boolean b() {
        Context context;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9b9f4b1e", new Object[0])).booleanValue();
        }
        if (!com.taobao.orange.a.b || (context = com.taobao.orange.a.g) == null || !((Boolean) jno.a(context, OConstant.SYSKEY_ENABLE_LAUNCH_OPTIMIZE, Boolean.TRUE)).booleanValue()) {
            return false;
        }
        if (j()) {
            return true;
        }
        if (b == null) {
            b = Boolean.valueOf(y0.a(OConstant.AB_LAUNCH_OPTIMIZE_ENABLE));
        }
        return b.booleanValue();
    }

    public static String c(Map<String, String> map, String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("39fc39b0", new Object[]{map, str});
        }
        if (map == null || map.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder(64);
        try {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (entry.getKey() != null) {
                    sb.append(URLEncoder.encode(entry.getKey(), str));
                    sb.append("=");
                    if (entry.getValue() == null) {
                        str2 = "";
                    } else {
                        str2 = entry.getValue();
                    }
                    sb.append(URLEncoder.encode(str2, str).replace(f7l.PLUS, "%20"));
                    sb.append("&");
                }
            }
            sb.deleteCharAt(sb.length() - 1);
        } catch (UnsupportedEncodingException unused) {
        }
        return sb.toString();
    }

    public static String g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("677072a2", new Object[]{str});
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                return URLDecoder.decode(str, "utf-8");
            } catch (UnsupportedEncodingException unused) {
            }
        }
        return null;
    }

    public static String h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("54f082ca", new Object[]{str});
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                return URLEncoder.encode(str, "utf-8");
            } catch (UnsupportedEncodingException unused) {
            }
        }
        return null;
    }

    public static long i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("64b9d13", new Object[]{str})).longValue();
        }
        long j = 0;
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        int length = str.length();
        char[] charArray = str.toCharArray();
        for (int i = 0; i < length; i++) {
            j = (j * 31) + charArray[i];
        }
        return Long.MAX_VALUE & j;
    }

    public static boolean j() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("79d7b876", new Object[0])).booleanValue();
        }
        Boolean bool = f21209a;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (com.taobao.orange.a.j.split("\\.").length > 3) {
            z = true;
        }
        Boolean valueOf = Boolean.valueOf(z);
        f21209a = valueOf;
        return valueOf.booleanValue();
    }

    public static List<String> l(Set<String> set) {
        int nextInt;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("9d667f46", new Object[]{set});
        }
        ArrayList arrayList = new ArrayList();
        int size = set.size();
        if (size > 2) {
            Random random = new Random();
            int nextInt2 = random.nextInt(size);
            do {
                nextInt = random.nextInt(size);
            } while (nextInt == nextInt2);
            for (String str : set) {
                if (i == nextInt2 || i == nextInt) {
                    arrayList.add(str);
                    if (arrayList.size() == 2) {
                        break;
                    }
                }
                i++;
            }
        } else {
            arrayList.addAll(set);
        }
        return arrayList;
    }

    public static <T> Map<String, T> m(Map<String, T> map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("982fbdf5", new Object[]{map, new Boolean(z)});
        }
        if (map == null || map.isEmpty()) {
            return null;
        }
        TreeMap treeMap = new TreeMap(new a(z));
        treeMap.putAll(map);
        return treeMap;
    }

    public static long k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6eaba914", new Object[]{str})).longValue();
        }
        try {
            if (TextUtils.isEmpty(str)) {
                return 0L;
            }
            return Long.parseLong(str);
        } catch (Exception e) {
            OLog.e("OrangeUtils", "parseLong", e, new Object[0]);
            return 0L;
        }
    }

    public static String d(IndexDO indexDO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ef4f3e15", new Object[]{indexDO});
        }
        if (indexDO == null) {
            return null;
        }
        SimplePropertyPreFilter simplePropertyPreFilter = new SimplePropertyPreFilter(IndexDO.class, new String[0]);
        simplePropertyPreFilter.getExcludes().add("mergedNamespaces");
        return JSON.toJSONString(indexDO, simplePropertyPreFilter, SerializerFeature.PrettyFormat);
    }

    public static String e(NameSpaceDO nameSpaceDO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("28c76a47", new Object[]{nameSpaceDO});
        }
        if (nameSpaceDO == null) {
            return null;
        }
        return JSON.toJSONString(nameSpaceDO, new SimplePropertyPreFilter(NameSpaceDO.class, "name", "version", IndexUpdateHandler.IndexUpdateInfo.SYNC_KEY_RESOURCEID, d.KEY_UPP_SCHEME_PARAMS_BIZ_DATA), SerializerFeature.PrettyFormat);
    }

    public static String f(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("71af995a", new Object[]{list});
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            if (i == 0) {
                sb.append(list.get(i));
            } else {
                sb.append("|");
                sb.append(list.get(i));
            }
        }
        return sb.toString();
    }
}
