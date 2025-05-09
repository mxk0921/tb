package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class jls extends tls {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PREFIX = "@ifEmpty(";
    public static final int SUB_INDEX = 9;

    static {
        t2o.a(329252947);
    }

    public static /* synthetic */ Object ipc$super(jls jlsVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tschedule/parser/operator/TSIfEmptyOperator");
    }

    @Override // tb.tls
    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ada0f062", new Object[]{this})).intValue();
        }
        return 9;
    }

    @Override // tb.tls
    public Object c(wp8 wp8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("f75136", new Object[]{this, wp8Var});
        }
        List<Object> list = this.f28789a;
        Object obj = null;
        if (list != null && !list.isEmpty()) {
            Iterator<Object> it = this.f28789a.iterator();
            while (it.hasNext() && (obj = wp8Var.l(it.next())) == null) {
            }
        }
        return obj;
    }
}
