package tb;

import android.content.Context;
import com.alibaba.wireless.aliprivacy.AliPrivacyCore;
import com.alibaba.wireless.aliprivacyext.jsbridge.c;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* compiled from: Taobao */
@c(name = {"pasteboardAuthStatus"})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class o4y extends osx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(o4y o4yVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/wireless/aliprivacyext/jsbridge/api/d");
    }

    @Override // tb.osx
    public boolean b(Context context, String str, String str2, pwx pwxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b709cffc", new Object[]{this, context, str, str2, pwxVar})).booleanValue();
        }
        boolean n = AliPrivacyCore.n(context);
        HashMap hashMap = new HashMap();
        hashMap.put("status", Integer.valueOf(n ? 1 : 0));
        c(pwxVar, "调用成功", hashMap);
        return true;
    }
}
