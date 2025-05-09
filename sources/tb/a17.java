package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class a17 implements u5c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(676331699);
        t2o.a(676331704);
    }

    public long a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9f220374", new Object[]{this, str})).longValue();
        }
        h49.a().b(str);
        return 0L;
    }

    public String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d8625b05", new Object[]{this, str});
        }
        if (!h49.a().b(str)) {
            return "";
        }
        try {
            if (((cad) bcq.a()).i().i(str) != null) {
                return ((cad) bcq.a()).i().i(str).d();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }
}
