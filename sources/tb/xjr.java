package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class xjr extends iq0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final Map<String, Boolean> b;

    static {
        t2o.a(779092271);
    }

    public xjr() {
        HashMap hashMap = new HashMap();
        this.b = hashMap;
        Boolean bool = Boolean.FALSE;
        hashMap.put("isNotTaobaoAPP", bool);
        hashMap.put("isTBLiveAPP", bool);
        hashMap.put("DisableCommitAddPV", bool);
        hashMap.put("closeBgVideoPlay", bool);
    }

    public static /* synthetic */ Object ipc$super(xjr xjrVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/adapterimpl/TBLiveFunctionSwitch");
    }

    @Override // tb.iq0, tb.hfb
    public Map<String, Boolean> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("83a2402a", new Object[]{this});
        }
        return this.b;
    }
}
