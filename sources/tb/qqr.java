package tb;

import androidx.core.graphics.drawable.IconCompat;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.api.Login;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class qqr implements jqw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(745538012);
        t2o.a(989856388);
    }

    @Override // tb.jqw
    public kqw onEvent(int i, iqw iqwVar, Object... objArr) {
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kqw) ipChange.ipc$dispatch("75ee5a2a", new Object[]{this, new Integer(i), iqwVar, objArr});
        }
        ckf.h(objArr, IconCompat.EXTRA_OBJ);
        if (i != 3005) {
            return null;
        }
        Object L = ic1.L(objArr, 0);
        if (!(L instanceof String)) {
            L = null;
        }
        String str = (String) L;
        if (str != null) {
            try {
                JSONObject parseObject = JSON.parseObject(str);
                if (!(parseObject == null || (string = parseObject.getString("event")) == null || !ckf.b("AVATAR_CHANGED_SUCCESS", string))) {
                    h7h.g().b("Global_User_Profile" + Login.getUserId());
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }
}
