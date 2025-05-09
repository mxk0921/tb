package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import java.util.Map;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class d5s {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f17600a;

    static {
        try {
            IpChange ipChange = TLog.$ipChange;
            f17600a = true;
        } catch (ClassNotFoundException unused) {
            f17600a = false;
        }
    }

    @Deprecated
    public static void a(Context context, String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36c7f0cf", new Object[]{context, str, str2, map});
        } else if (f17600a) {
            hf9.f(str, str2, map, null);
        }
    }
}
