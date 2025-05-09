package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class mr extends pz8 implements sy8 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String INVOKE = "invoke";
    public static final String POST_PROCESS = "postProcess";
    public static final String PRE_PROCESS = "preProcess";

    public mr(s9u s9uVar, String str, String str2, long j, Map<String, Object> map, List<utn> list) {
        this(s9uVar, str, str2, j, map, list, "Ability");
    }

    public static /* synthetic */ Object ipc$super(mr mrVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/analysis/v3/AbilitySpanImpl");
    }

    public mr(s9u s9uVar, String str, String str2, long j, Map<String, Object> map, List<utn> list, String str3) {
        super(s9uVar, str, str2, j, map, list, str3);
    }
}
