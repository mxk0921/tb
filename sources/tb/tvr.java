package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.uniinfra_kmp.common_utils.serialization.KMPJsonArray;
import com.taobao.uniinfra_kmp.common_utils.serialization.KMPJsonObject;
import java.util.Collection;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class tvr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(1002438739);
    }

    public static final <T> boolean a(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ff7f5dc1", new Object[]{t})).booleanValue();
        }
        return !c(t);
    }

    public static final <T> boolean b(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a6e52f5c", new Object[]{t})).booleanValue();
        }
        return !d(t);
    }

    public static final <T> boolean c(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2ec1ae00", new Object[]{t})).booleanValue();
        }
        if (t == null || (((t instanceof CharSequence) && ((CharSequence) t).length() == 0) || ((t instanceof Collection) && ((Collection) t).isEmpty()))) {
            return true;
        }
        return false;
    }

    public static final <R> R f(String str, g1a<? super String, ? extends R> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (R) ipChange.ipc$dispatch("86a7f4c3", new Object[]{str, g1aVar});
        }
        ckf.g(str, "<this>");
        ckf.g(g1aVar, pg1.ATOM_EXT_block);
        if (str.length() <= 0) {
            return null;
        }
        g1aVar.invoke(str);
        return null;
    }

    public static final String g(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fc8854c9", new Object[]{obj});
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        if ((obj instanceof Boolean) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Double) || (obj instanceof Float)) {
            return obj.toString();
        }
        if (obj instanceof KMPJsonObject) {
            return ((KMPJsonObject) obj).toJsonString();
        }
        if (obj instanceof KMPJsonArray) {
            return ((KMPJsonArray) obj).toJsonString();
        }
        return null;
    }

    public static final <T> boolean d(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a76e191b", new Object[]{t})).booleanValue();
        }
        return t == null || ((t instanceof CharSequence) && (((CharSequence) t).length() == 0 || ckf.b(t, "null"))) || ((t instanceof Collection) && ((Collection) t).isEmpty());
    }

    public static final boolean e(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c9b32eca", new Object[]{str})).booleanValue();
        }
        if (str == null) {
            return false;
        }
        int hashCode = str.hashCode();
        if (hashCode != 48) {
            if (hashCode != 49) {
                if (hashCode != 3569038) {
                    if (hashCode != 97196323) {
                        return false;
                    }
                    str2 = "false";
                } else if (!str.equals("true")) {
                    return false;
                }
            } else if (!str.equals("1")) {
                return false;
            }
            return true;
        }
        str2 = "0";
        str.equals(str2);
        return false;
    }
}
