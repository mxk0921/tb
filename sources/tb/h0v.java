package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class h0v extends y1v {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(962592828);
    }

    public static /* synthetic */ Object ipc$super(h0v h0vVar, String str, Object... objArr) {
        if (str.hashCode() == 1219635554) {
            super.b((String) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/analytics/core/config/UTBussinessConfBiz");
    }

    @Override // tb.y1v
    public String[] a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("f1114543", new Object[]{this});
        }
        return new String[]{"ut_bussiness"};
    }

    @Override // tb.y1v
    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48b22962", new Object[]{this, str});
        } else {
            super.b(str);
        }
    }

    @Override // tb.y1v
    public void c(String str, Map<String, String> map) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5217cb94", new Object[]{this, str, map});
        } else if (map.containsKey("tpk") && (str2 = map.get("tpk")) != null) {
            o2w.k().Z(str2);
            m0v.b("tpk_string", str2);
            m0v.b("tpk_md5", o2w.k().u());
        }
    }
}
