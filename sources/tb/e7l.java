package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class e7l {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, j68> f18340a;

    public static j68 a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j68) ipChange.ipc$dispatch("6a3994e8", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (j68) ((HashMap) f18340a).get(str.trim().toLowerCase());
    }

    static {
        t2o.a(157286411);
        HashMap hashMap = new HashMap(4);
        f18340a = hashMap;
        hashMap.put("empty", new uc8());
        hashMap.put("not", new d8k());
        hashMap.put("and", new qv0());
        hashMap.put("or", new g8l());
        hashMap.put("deleteifnull", new jb7());
    }
}
