package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.utils.TMSAssertUtils;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.JvmStatic;
import tb.jjc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class ibs {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final ibs INSTANCE = new ibs();

    /* renamed from: a  reason: collision with root package name */
    public static final ConcurrentHashMap<jjc.a, Class<? extends jjc>> f21217a = new ConcurrentHashMap<>();

    static {
        t2o.a(839909729);
    }

    @JvmStatic
    public static final jjc a(int i) {
        IpChange ipChange = TMSAssertUtils.$ipChange;
        Class<? extends jjc> cls = f21217a.get(jjc.a.b(i));
        if (cls == null) {
            return null;
        }
        return (jjc) cls.newInstance();
    }
}
