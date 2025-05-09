package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.messagekit.base.MsgRouter;
import com.taobao.tao.messagekit.core.utils.MsgLog;
import com.taobao.tao.messagekit.core.utils.MsgMonitor;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import tb.a0j;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class e2o extends zzi implements a0j.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final Queue<svc> c = new LinkedList();
    public boolean d;
    public final int e;

    static {
        t2o.a(628097120);
        t2o.a(628097116);
    }

    public e2o(int i) {
        this.e = i;
    }

    public static /* synthetic */ int i(e2o e2oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a0431e7e", new Object[]{e2oVar})).intValue();
        }
        return e2oVar.e;
    }

    public static /* synthetic */ Object ipc$super(e2o e2oVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/messagekit/base/monitor/monitorthread/tasks/ReportAckTask");
    }

    public static /* synthetic */ Queue j(e2o e2oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Queue) ipChange.ipc$dispatch("7799542c", new Object[]{e2oVar});
        }
        return e2oVar.c;
    }

    @Override // tb.a0j.a
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8a09373f", new Object[]{this})).booleanValue();
        }
        return this.d;
    }

    @Override // tb.a0j.a
    public void b(a0j.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("328ff05b", new Object[]{this, aVar});
        } else if (aVar == this) {
            l();
        } else if (aVar instanceof e2o) {
            ((e2o) aVar).k();
        }
    }

    @Override // tb.zzi
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e48bb97c", new Object[]{this});
            return;
        }
        k();
        l();
    }

    @Override // tb.zzi
    public int h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d79de6b4", new Object[]{this})).intValue();
        }
        return 3;
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7feb93fc", new Object[]{this});
        } else {
            ((LinkedList) this.c).addAll(d(this.e).i(-1));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements lkd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final List<svc> f18230a;

        static {
            t2o.a(628097121);
            t2o.a(628097161);
        }

        public a(List<svc> list) {
            this.f18230a = list;
        }

        @Override // tb.lkd
        public void onResult(int i, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("170ed185", new Object[]{this, new Integer(i), map});
                return;
            }
            String str = map != null ? (String) map.get("re_msg") : null;
            if (i == 1000) {
                MsgRouter.e().f().h(e2o.i(e2o.this), this.f18230a);
                MsgMonitor.f("MKT", "upload");
                MsgMonitor.a("MKT", "aac", this.f18230a.size());
                Integer valueOf = Integer.valueOf(e2o.i(e2o.this));
                List<svc> list = this.f18230a;
                MsgLog.g("MonitorManager", valueOf, "uploadAck success", Integer.valueOf(list != null ? list.size() : 0), Integer.valueOf(e2o.j(e2o.this).size()));
            } else {
                MsgRouter.e().f().j(e2o.i(e2o.this), this.f18230a);
                MsgMonitor.c("MKT", "upload", "" + i, str);
                Integer valueOf2 = Integer.valueOf(e2o.i(e2o.this));
                Integer valueOf3 = Integer.valueOf(i);
                List<svc> list2 = this.f18230a;
                MsgLog.g("MonitorManager", valueOf2, "uploadAck failed: ", valueOf3, str, Integer.valueOf(list2 != null ? list2.size() : 0), Integer.valueOf(e2o.j(e2o.this).size()));
            }
            com.taobao.tao.messagekit.base.monitor.monitorthread.a.a().d(e2o.this, false, false);
        }
    }

    public void l() {
        svc svcVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("730c1fbb", new Object[]{this});
        } else if (((LinkedList) this.c).size() < 1) {
            this.d = true;
        } else {
            try {
                ArrayList arrayList = new ArrayList();
                JSONArray jSONArray = new JSONArray();
                long currentTimeMillis = System.currentTimeMillis();
                for (int i = 0; i < 100 && (svcVar = (svc) ((LinkedList) this.c).poll()) != null; i++) {
                    arrayList.add(svcVar);
                    JSONObject json = svcVar.toJson();
                    json.put(upx.UPLOAD_TIME, (Object) Long.valueOf(currentTimeMillis));
                    jSONArray.add(json);
                }
                MsgLog.g("MonitorManager", Integer.valueOf(this.e), "uploadAck", Integer.valueOf(arrayList.size()));
                String json2 = jSONArray.toString();
                d(this.e).v(json2, arrayList, new a(arrayList));
                MsgLog.e("MonitorManager", Integer.valueOf(this.e), "reportAck data: ", json2);
            } catch (Exception e) {
                MsgLog.g("MonitorManager", Integer.valueOf(this.e), e);
                this.d = true;
            }
            this.d = false;
        }
    }
}
