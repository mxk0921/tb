package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.framework.data.datamodel.a;
import java.util.Iterator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class iz3 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(468713675);
    }

    public static final String a(w9q<a> w9qVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("114939a8", new Object[]{w9qVar});
        }
        StringBuilder sb = new StringBuilder();
        if (w9qVar != null) {
            Iterator<a> it = w9qVar.iterator();
            while (it.hasNext()) {
                sb.append(nz3.e(it.next()));
                sb.append(",");
            }
        }
        return sb.toString();
    }
}
