package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class qbu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(961544385);
    }

    public static String a(long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bc9defc9", new Object[]{new Long(j), new Long(j2)});
        }
        return m.TRACK_PREFIX + j + "_" + j2;
    }

    public static String b(Object obj) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7012e960", new Object[]{obj});
        }
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            str = obj.getClass().getSimpleName();
        }
        int hashCode = obj.hashCode();
        return str + hashCode;
    }

    public static String[] c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("6e996f8b", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return str.split("\\.");
    }
}
