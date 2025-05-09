package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.android.taobao.safeclean.d;
import com.taobao.weex.common.Constants;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class jw4 implements dbh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(654311463);
        t2o.a(654311468);
    }

    @Override // tb.dbh
    public String a(String str, bsa bsaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("38f15b0f", new Object[]{this, str, bsaVar});
        }
        if (str.indexOf("$CPU_ARCH_l") > -1) {
            str = str.replace("$CPU_ARCH_l", b());
        }
        if (str.indexOf("$CPU_ARCH_s") > -1) {
            str = str.replace("$CPU_ARCH_s", c());
        }
        return bsaVar.a(str);
    }

    public final String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b758dfad", new Object[]{this});
        }
        if (8 == lw4.getCurrentRuntimeCpuArchValue(d.d)) {
            return kgd.ABI_ARM64;
        }
        return kgd.ABI_ARM;
    }

    public final String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c2c9581", new Object[]{this});
        }
        if (8 == lw4.getCurrentRuntimeCpuArchValue(d.d)) {
            return Constants.CodeCache.SAVE_PATH;
        }
        return "v7";
    }
}
