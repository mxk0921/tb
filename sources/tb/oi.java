package tb;

import android.text.TextUtils;
import com.alibaba.android.aura.service.event.AURAEventIO;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class oi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final yi f25401a;
    public final Map<String, List<ibb>> b = new ConcurrentHashMap();

    static {
        t2o.a(80740425);
    }

    public oi(lo loVar, yi yiVar) {
        this.f25401a = yiVar;
    }

    public final boolean c(AURAEventIO aURAEventIO) {
        List f;
        jbb jbbVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2b9fd078", new Object[]{this, aURAEventIO})).booleanValue();
        }
        yi yiVar = this.f25401a;
        if (yiVar == null || (f = yiVar.f(jbb.class)) == null || f.isEmpty()) {
            return false;
        }
        boolean z = false;
        for (int i = 0; i < f.size() && ((jbbVar = (jbb) f.get(i)) == null || !(z = jbbVar.o0(aURAEventIO))); i++) {
        }
        return z;
    }

    public void e(String str, ibb ibbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38e862f5", new Object[]{this, str, ibbVar});
            return;
        }
        List list = (List) ((ConcurrentHashMap) this.b).get(str);
        if (list == null) {
            list = new CopyOnWriteArrayList();
            ((ConcurrentHashMap) this.b).put(str, list);
        } else if (list.contains(ibbVar)) {
            return;
        }
        list.add(ibbVar);
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1f3a5b5", new Object[]{this});
            return;
        }
        yi yiVar = this.f25401a;
        if (yiVar == null) {
            ck.g().e("AURAEventCenter.registerEventAtRuntime:mAURAExtensionManager is null");
            return;
        }
        for (ibb ibbVar : yiVar.f(ibb.class)) {
            e(ibbVar.t0(), ibbVar);
        }
    }

    public void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41e8b9cd", new Object[]{this, str});
        } else {
            ((ConcurrentHashMap) this.b).remove(str);
        }
    }

    public final void a(AURAEventIO aURAEventIO, pt<AURAEventIO> ptVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("586c2b3e", new Object[]{this, aURAEventIO, ptVar});
            return;
        }
        String eventType = aURAEventIO.getEventType();
        HashMap hashMap = new HashMap();
        hashMap.put("eventType", eventType);
        hashMap.put("event", aURAEventIO);
        mi miVar = new mi(1, "AURAEventServiceDomain", "-1001_NOT_REGISTER", "没有注册事件:" + eventType);
        miVar.i(hashMap);
        ptVar.b(miVar);
    }

    public final void b(List<ibb> list, AURAEventIO aURAEventIO, pt<AURAEventIO> ptVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6fa8016", new Object[]{this, list, aURAEventIO, ptVar});
            return;
        }
        for (ibb ibbVar : list) {
            if (ibbVar != null) {
                try {
                    ibbVar.I0(aURAEventIO);
                } catch (Throwable th) {
                    String eventType = aURAEventIO.getEventType();
                    HashMap hashMap = new HashMap();
                    hashMap.put("eventType", eventType);
                    mi miVar = new mi(1, "AURAEventServiceDomain", "-1002_EXECUTE_EXCEPTION", "执行事件【" + eventType + "】出错，errorMessage=" + th.getMessage());
                    miVar.i(hashMap);
                    ptVar.b(miVar);
                    if (th.c()) {
                        th.printStackTrace(new PrintStream(new ByteArrayOutputStream()));
                        th.d(th);
                    }
                }
            }
        }
    }

    public void d(AURAEventIO aURAEventIO, pt<AURAEventIO> ptVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1af7847", new Object[]{this, aURAEventIO, ptVar});
            return;
        }
        f();
        String eventType = aURAEventIO.getEventType();
        if (TextUtils.isEmpty(eventType)) {
            ptVar.b(new mi(1, "AURAEventServiceDomain", "-1000_EMPTY_TYPE", "执行事件失败, eventType 为空"));
            return;
        }
        List<ibb> list = (List) ((ConcurrentHashMap) this.b).get(eventType);
        if (list != null && !list.isEmpty()) {
            b(list, aURAEventIO, ptVar);
        } else if (!c(aURAEventIO)) {
            a(aURAEventIO, ptVar);
        }
    }
}
