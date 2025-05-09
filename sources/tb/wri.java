package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.dojo.ability.log.ModuleName;
import com.taobao.homepage.messiah.model.TbHRLogModel;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class wri {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final List<pqk> f30873a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final wri f30874a = new wri();

        static {
            t2o.a(447741960);
        }

        public static /* synthetic */ wri a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (wri) ipChange.ipc$dispatch("194f2c99", new Object[0]);
            }
            return f30874a;
        }
    }

    static {
        t2o.a(447741958);
    }

    public static wri d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wri) ipChange.ipc$dispatch("f47c60f3", new Object[0]);
        }
        return b.a();
    }

    public void a(String str, String str2, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b447c2dd", new Object[]{this, str, str2, map});
        } else {
            f(str, str2, "investigate", map);
        }
    }

    public void b(String str, String str2, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea4d6487", new Object[]{this, str, str2, map});
        } else {
            f(str, str2, "monitor", map);
        }
    }

    public final String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("16ad649", new Object[]{this});
        }
        try {
            return String.valueOf(System.currentTimeMillis());
        } catch (Exception e) {
            sdh.a(ModuleName.CLIENT_TO_SERVICE_MONITOR, "parseDataException", "getCurrentTime" + e);
            return null;
        }
    }

    public final void e(String str, String str2, String str3, TbHRLogModel tbHRLogModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("585854c", new Object[]{this, str, str2, str3, tbHRLogModel});
        } else if (((CopyOnWriteArrayList) this.f30873a).isEmpty()) {
            sdh.b(ModuleName.CLIENT_TO_SERVICE_MONITOR, "notifyCommit mCommitListenerList == null");
        } else {
            Iterator it = ((CopyOnWriteArrayList) this.f30873a).iterator();
            while (it.hasNext()) {
                ((pqk) it.next()).a(str2, str, str3, tbHRLogModel);
                sdh.b(ModuleName.CLIENT_TO_SERVICE_MONITOR, "通知提交数据了");
            }
        }
    }

    public final void f(String str, String str2, String str3, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdcdd3fa", new Object[]{this, str, str2, str3, map});
            return;
        }
        String c = c();
        if (map == null) {
            map = new HashMap<>();
        }
        e(str3, str, str2, new TbHRLogModel(str3, str2, c, str, map));
    }

    public final void g(pqk pqkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbcc9f51", new Object[]{this, pqkVar});
        } else {
            this.f30873a.add(pqkVar);
        }
    }

    public wri() {
        this.f30873a = new CopyOnWriteArrayList();
        g(new vgt());
    }
}
