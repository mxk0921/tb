package tb;

import android.text.TextUtils;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.service.event.AURAEventIO;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
@AURAExtensionImpl(code = "aura.impl.event.toast")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class co extends ws {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements x3e<String> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        /* renamed from: b */
        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("39bbfc46", new Object[]{this, str});
            } else {
                co.O0(co.this, "toast", str);
            }
        }
    }

    static {
        t2o.a(81789054);
    }

    public static /* synthetic */ void O0(co coVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15b98629", new Object[]{coVar, str, str2});
        } else {
            coVar.M0(str, str2);
        }
    }

    public static /* synthetic */ Object ipc$super(co coVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/aura/taobao/adapter/extension/event/AURAToastEvent");
    }

    @Override // tb.ws
    public void K0(AURAEventIO aURAEventIO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53a1928f", new Object[]{this, aURAEventIO});
            return;
        }
        JSONObject c = aURAEventIO.getEventModel().c();
        if (c == null) {
            M0("toast", "eventsFields is null!");
            ck.g().b("AURAToastEvent", "innerHandleEvent", "eventFields 为空");
            return;
        }
        String string = c.getString("message");
        if (!TextUtils.isEmpty(string)) {
            ck.g().b("AURAToastEvent", "innerHandleEvent", "message 为空");
            c.put("content", (Object) string);
        }
        eo.a(c, new a());
    }

    @Override // tb.ibb
    public String t0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("45cb977b", new Object[]{this});
        }
        return "toast";
    }
}
