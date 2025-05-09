package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class mq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final List<gdb> f24226a = new CopyOnWriteArrayList();

    static {
        t2o.a(729809755);
    }

    public mq a(gdb gdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mq) ipChange.ipc$dispatch("d7ad608c", new Object[]{this, gdbVar});
        }
        if (!((CopyOnWriteArrayList) this.f24226a).contains(gdbVar)) {
            ((CopyOnWriteArrayList) this.f24226a).add(gdbVar);
        }
        return this;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2eb27344", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        Iterator it = ((CopyOnWriteArrayList) this.f24226a).iterator();
        while (it.hasNext()) {
            gdb gdbVar = (gdb) it.next();
            if (!TextUtils.isEmpty(gdbVar.b())) {
                jSONObject.put(gdbVar.a(), (Object) gdbVar.b());
            }
        }
        return jSONObject.toJSONString();
    }
}
