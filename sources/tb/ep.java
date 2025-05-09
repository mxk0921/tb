package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ep extends tp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(ep epVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/alivfsadapter/database/alidb/AVFSAliDBFactory");
    }

    @Override // tb.tp
    public up a(String str, int i) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (up) ipChange.ipc$dispatch("72578877", new Object[]{this, str, new Integer(i)});
        }
        return new ep0(str, i);
    }

    @Override // tb.tp
    public up b(String str, String str2, int i) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (up) ipChange.ipc$dispatch("529016d", new Object[]{this, str, str2, new Integer(i)});
        }
        return new ep0(str, str2, i);
    }
}
