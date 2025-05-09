package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class yuf {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final yuf INSTANCE = new yuf();

    static {
        t2o.a(815792213);
    }

    public final String a(Collection<String> collection, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e4402534", new Object[]{this, collection, str});
        }
        ckf.g(collection, "collection");
        ckf.g(str, "delimiter");
        StringBuilder sb = new StringBuilder();
        Iterator<String> it = collection.iterator();
        if (it.hasNext()) {
            sb.append(it.next());
            while (it.hasNext()) {
                sb.append(str);
                sb.append(it.next());
            }
        }
        String sb2 = sb.toString();
        ckf.f(sb2, "toString(...)");
        return sb2;
    }
}
