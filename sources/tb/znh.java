package tb;

import android.app.Activity;
import android.content.Context;
import com.alibaba.wireless.aliprivacy.AuthStatus;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class znh implements m8d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // tb.m8d
    public AuthStatus a(Context context, String str) {
        int checkSelfPermission;
        boolean shouldShowRequestPermissionRationale;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AuthStatus) ipChange.ipc$dispatch("1b695882", new Object[]{this, context, str});
        }
        g01.a("MChecker", "checkPermission:" + str);
        AuthStatus authStatus = AuthStatus.UNKNOWN;
        checkSelfPermission = context.checkSelfPermission(str);
        if (checkSelfPermission == 0) {
            return AuthStatus.GRANTED;
        }
        if (checkSelfPermission != -1) {
            return authStatus;
        }
        if (context instanceof Activity) {
            shouldShowRequestPermissionRationale = ((Activity) context).shouldShowRequestPermissionRationale(str);
            if (shouldShowRequestPermissionRationale) {
                return AuthStatus.SHOULD_SHOW_RATIONALE;
            }
        }
        return AuthStatus.FIRST_TIME_OR_NEVER_AGAIN;
    }
}
