package tb;

import android.content.Intent;
import android.text.TextUtils;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.common.Constants;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class s4r extends m8 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SENDBROADCAST = "-2419143124621388726";

    static {
        t2o.a(786432056);
    }

    public static /* synthetic */ Object ipc$super(s4r s4rVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tbabilitykit/TAKSendBroadcastAbility");
    }

    @Override // tb.m8
    public c8 f(n8 n8Var, k8 k8Var, u8 u8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c8) ipChange.ipc$dispatch("40f5a125", new Object[]{this, n8Var, k8Var, u8Var});
        }
        if (n8Var != null) {
            String g = vwf.g(n8Var.h(), "action", "");
            if (TextUtils.isEmpty(g)) {
                return new b8(new a8(-100001, "action is null"), false);
            }
            Intent intent = new Intent(g);
            JSONObject f = vwf.f(n8Var.h(), "content", null);
            if (f != null) {
                intent.putExtra("content", f.toJSONString());
            }
            JSONObject f2 = vwf.f(n8Var.h(), Constants.KEY_USER_ID, null);
            if (f2 != null) {
                for (Map.Entry<String, Object> entry : f2.entrySet()) {
                    intent.putExtra(entry.getKey().toString(), entry.getValue().toString());
                }
            }
            LocalBroadcastManager.getInstance(k8Var.d()).sendBroadcast(intent);
        }
        return new f8();
    }
}
