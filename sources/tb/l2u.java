package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class l2u extends ex1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final l2u instance = new l2u();

    static {
        t2o.a(398458904);
    }

    public static /* synthetic */ Object ipc$super(l2u l2uVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/atools/ToolsLog");
    }

    @Override // tb.ex1
    public String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b1b3f162", new Object[]{this});
        }
        return "atools.";
    }
}
