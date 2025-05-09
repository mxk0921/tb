package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.model.message.TLiveMsg;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class i1h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final c1h f21038a;
    public final List<awd> b = new ArrayList();

    public i1h(c1h c1hVar) {
        this.f21038a = c1hVar;
    }

    public void b(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bd43530", new Object[]{this, new Integer(i), obj});
        } else if (!this.f21038a.a()) {
            k6s.a("i1h", "error[" + this.f21038a.f16771a + "]:" + i + " " + obj);
        } else if (((ArrayList) this.b).isEmpty()) {
            k6s.a("i1h", "error[业务方没有订阅回调]:" + i + " " + obj);
        } else {
            Iterator it = ((ArrayList) this.b).iterator();
            while (it.hasNext()) {
                ((awd) it.next()).a(i, obj);
            }
        }
    }

    public void c(awd awdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44c54680", new Object[]{this, awdVar});
            return;
        }
        ((ArrayList) this.b).remove(awdVar);
        ((ArrayList) this.b).add(awdVar);
    }

    public void d(zqi zqiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("417a7ade", new Object[]{this, zqiVar});
        }
    }

    public void e(awd awdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d85b4f9", new Object[]{this, awdVar});
        } else {
            ((ArrayList) this.b).remove(awdVar);
        }
    }

    public void f(zqi zqiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94e2fc97", new Object[]{this, zqiVar});
        } else {
            ((ArrayList) this.b).clear();
        }
    }

    public boolean a(String str, TLiveMsg tLiveMsg) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a7a5ace2", new Object[]{this, str, tLiveMsg})).booleanValue();
        }
        if (!this.f21038a.a()) {
            String str2 = "dispatch[" + this.f21038a.f16771a + f7l.BRACKET_START_STR + str + ")]:" + tLiveMsg;
            w71.a(w71.MODULE_POINT_PROVIDER, w71.ERROR_CODE_NO_RUNNING, str2);
            k6s.a("i1h", str2);
            return false;
        } else if (((ArrayList) this.b).isEmpty()) {
            String str3 = "dispatch[业务方没有订阅回调(" + str + ")]:" + tLiveMsg;
            w71.a(w71.MODULE_POINT_PROVIDER, w71.ERROR_CODE_LISTENER_IS_NULL, str3);
            k6s.a("i1h", str3);
            return false;
        } else {
            w71.c(w71.MODULE_POINT_PROVIDER, "source:" + str + ";subtype:" + tLiveMsg.type);
            Iterator it = ((ArrayList) this.b).iterator();
            while (it.hasNext()) {
                ((awd) it.next()).b(tLiveMsg);
            }
            return true;
        }
    }
}
