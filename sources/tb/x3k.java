package tb;

import android.content.Context;
import com.alibaba.wireless.aliprivacy.AuthStatus;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class x3k implements m8d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // tb.m8d
    public AuthStatus a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AuthStatus) ipChange.ipc$dispatch("1b695882", new Object[]{this, context, str});
        }
        return AuthStatus.GRANTED;
    }
}
