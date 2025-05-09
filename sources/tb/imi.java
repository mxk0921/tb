package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.gateway.msgcenter.Message;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class imi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, etc> f21427a = new HashMap();

    static {
        t2o.a(475005027);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71a64eb0", new Object[]{this});
            return;
        }
        synchronized (imi.class) {
            ((HashMap) this.f21427a).clear();
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            a();
        }
    }

    public boolean c(Message message) {
        etc etcVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bee004d1", new Object[]{this, message})).booleanValue();
        }
        if (message == null || TextUtils.isEmpty(message.getChannelId()) || (etcVar = (etc) ((HashMap) this.f21427a).get(message.getChannelId())) == null) {
            return false;
        }
        etcVar.a(message);
        return true;
    }

    public void d(String str, etc etcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e61d051", new Object[]{this, str, etcVar});
            return;
        }
        synchronized (imi.class) {
            ((HashMap) this.f21427a).put(str, etcVar);
        }
    }
}
