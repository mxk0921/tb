package tb;

import com.alibaba.android.ultron.vfw.core.ViewEngine;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ujt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<String, xzd> f29421a = new HashMap<>();

    static {
        t2o.a(157286722);
    }

    public ujt(ViewEngine viewEngine) {
        wo7 wo7Var = new wo7(viewEngine);
        e("dinamicx", wo7Var);
        e("dinamic", wo7Var);
    }

    public void a(String str, List<o58> list, xit xitVar, vcv vcvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee2b8508", new Object[]{this, str, list, xitVar, vcvVar});
            return;
        }
        xzd xzdVar = this.f29421a.get(str);
        if (xzdVar instanceof wo7) {
            ((wo7) xzdVar).h(list, xitVar, vcvVar);
        } else if (xzdVar != null) {
            xzdVar.a(list, xitVar);
        }
    }

    public xzd b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xzd) ipChange.ipc$dispatch("4f5193e2", new Object[]{this, str});
        }
        return this.f29421a.get(str);
    }

    public boolean c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a079f60f", new Object[]{this, str, str2})).booleanValue();
        }
        if (!(str == null || str2 == null)) {
            xzd xzdVar = this.f29421a.get("dinamicx");
            if (xzdVar instanceof vy) {
                return ((vy) xzdVar).b(str, str2);
            }
        }
        return false;
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        xzd b = b("dinamicx");
        if (b instanceof wo7) {
            ((wo7) b).l();
        }
    }

    public void e(String str, xzd xzdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d410672c", new Object[]{this, str, xzdVar});
        } else {
            this.f29421a.put(str, xzdVar);
        }
    }
}
