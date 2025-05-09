package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.uniinfra_kmp.common_utils.serialization.KMPJSONUtils_androidKt;
import com.taobao.uniinfra_kmp.common_utils.serialization.KMPJsonArray;
import com.taobao.uniinfra_kmp.common_utils.serialization.KMPJsonObject;
import com.taobao.uniinfra_kmp.common_utils.serialization.a;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Result;
import kotlin.b;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class xrf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(1002438741);
    }

    public static final List<Object> a(String str) {
        Object obj;
        KMPJsonArray kMPJsonArray;
        List<Object> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("fa848d94", new Object[]{str});
        }
        ckf.g(str, "<this>");
        List<Object> list2 = null;
        try {
            Object a2 = KMPJSONUtils_androidKt.a(a.Companion, str);
            if (a2 instanceof KMPJsonArray) {
                kMPJsonArray = (KMPJsonArray) a2;
            } else {
                kMPJsonArray = null;
            }
            if (kMPJsonArray != null) {
                list = kMPJsonArray.toList();
            } else {
                list = null;
            }
            obj = Result.m1108constructorimpl(list);
        } catch (Throwable th) {
            obj = Result.m1108constructorimpl(b.a(th));
        }
        if (!Result.m1114isFailureimpl(obj)) {
            list2 = obj;
        }
        return list2;
    }

    public static final Map<String, Object> b(String str) {
        Object obj;
        KMPJsonObject kMPJsonObject;
        Map<String, Object> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("1542f93e", new Object[]{str});
        }
        ckf.g(str, "<this>");
        Map<String, Object> map2 = null;
        try {
            Object a2 = KMPJSONUtils_androidKt.a(a.Companion, str);
            if (a2 instanceof KMPJsonObject) {
                kMPJsonObject = (KMPJsonObject) a2;
            } else {
                kMPJsonObject = null;
            }
            if (kMPJsonObject != null) {
                map = kMPJsonObject.toMap();
            } else {
                map = null;
            }
            obj = Result.m1108constructorimpl(map);
        } catch (Throwable th) {
            obj = Result.m1108constructorimpl(b.a(th));
        }
        if (Result.m1111exceptionOrNullimpl(obj) == null) {
            map2 = obj;
        }
        return map2;
    }

    public static final String c(Map<String, ? extends Object> map) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1858d674", new Object[]{map});
        }
        ckf.g(map, "<this>");
        String str = null;
        try {
            if (!(map instanceof Object)) {
                map = null;
            }
            obj = Result.m1108constructorimpl(new KMPJsonObject(map).toJsonString());
        } catch (Throwable th) {
            obj = Result.m1108constructorimpl(b.a(th));
        }
        if (Result.m1111exceptionOrNullimpl(obj) == null) {
            str = obj;
        }
        return str;
    }

    public static final KMPJsonArray d(KMPJsonArray kMPJsonArray, Collection<? extends Object> collection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (KMPJsonArray) ipChange.ipc$dispatch("653790dc", new Object[]{kMPJsonArray, collection});
        }
        ckf.g(kMPJsonArray, "<this>");
        ckf.g(collection, "collection");
        for (Object obj : collection) {
            kMPJsonArray.add(obj);
        }
        return kMPJsonArray;
    }

    public static final String e(List<? extends Object> list) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("56b54bba", new Object[]{list});
        }
        ckf.g(list, "<this>");
        String str = null;
        try {
            obj = Result.m1108constructorimpl(d(new KMPJsonArray(null, 1, null), list).toJsonString());
        } catch (Throwable th) {
            obj = Result.m1108constructorimpl(b.a(th));
        }
        if (Result.m1111exceptionOrNullimpl(obj) == null) {
            str = obj;
        }
        return str;
    }
}
