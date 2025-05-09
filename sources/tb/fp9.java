package tb;

import android.os.Messenger;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class fp9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(435159121);
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9419ce89", new Object[]{this, str});
            return;
        }
        ep9.h().e(str);
        yv8.e("FloatWindowTrigger.close.bizCode=%s", str);
    }

    public int b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6d280d4c", new Object[]{this, str})).intValue();
        }
        boolean d = ep9.h().d(str);
        yv8.e("FloatWindowTrigger.checkWindowStatus.bizCode=%s.isWindowOn=%s", str, Boolean.valueOf(d));
        return d ? 1 : 0;
    }

    public void c(String str, String str2, JSONObject jSONObject, Messenger messenger, y2e y2eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7d98d4e", new Object[]{this, str, str2, jSONObject, messenger, y2eVar});
        } else if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            agu aguVar = new agu(3);
            aguVar.b = str;
            aguVar.c = str2;
            aguVar.d = jSONObject;
            aguVar.f = y2eVar;
            aguVar.e = messenger;
            yv8.e("FloatWindowTrigger.triggerActiveTask.triggerEventId=%s.bizCode=%s.", str, str2);
            new ra0().o(aguVar);
        }
    }
}
