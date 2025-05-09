package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class uh extends os {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(81789035);
    }

    public static /* synthetic */ Object ipc$super(uh uhVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/aura/taobao/adapter/extension/condition/AURADebuggableCondition");
    }

    @Override // tb.zab
    public boolean a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("63f7f74c", new Object[]{this, map})).booleanValue();
        }
        return th.c();
    }
}
