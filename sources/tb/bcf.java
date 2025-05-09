package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.riverlogger.inspector.MessagePriority;
import com.taobao.android.riverlogger.inspector.a;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class bcf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f16315a;
    public final int b;

    static {
        t2o.a(649068579);
    }

    public bcf(String str, int i, String str2, JSONObject jSONObject) {
        this.b = i;
        this.f16315a = str2;
    }

    public void finalize() throws Throwable {
        a c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a35321a5", new Object[]{this});
            return;
        }
        if (this.b >= 0 && (c = ti3.c()) != null) {
            c.h(this.b, this.f16315a, null, MessagePriority.Normal);
        }
        super.finalize();
    }
}
