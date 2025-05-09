package tb;

import android.content.Context;
import com.alibaba.wireless.aliprivacyext.jsbridge.c;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* compiled from: Taobao */
@c(name = {"deviceInfo"})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class psx extends osx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(psx psxVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/wireless/aliprivacyext/jsbridge/api/a");
    }

    @Override // tb.osx
    public boolean b(Context context, String str, String str2, pwx pwxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b709cffc", new Object[]{this, context, str, str2, pwxVar})).booleanValue();
        }
        HashMap hashMap = new HashMap();
        hashMap.put("sdkVersion", "0.11.1");
        c(pwxVar, "调用成功", hashMap);
        return true;
    }
}
