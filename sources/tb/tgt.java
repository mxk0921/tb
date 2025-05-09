package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.dojo.ability.log.ModuleName;
import com.taobao.homepage.messiah.model.TbHRLogModel;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class tgt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final List<TbHRLogModel> f28713a = new CopyOnWriteArrayList();
    public final List<TbHRLogModel> b = new CopyOnWriteArrayList();

    static {
        t2o.a(447741966);
    }

    public List<TbHRLogModel> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("fc43b347", new Object[]{this});
        }
        return this.f28713a;
    }

    public List<TbHRLogModel> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("7dd7b5d", new Object[]{this});
        }
        return this.b;
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10d10884", new Object[]{this});
            return;
        }
        if (!((CopyOnWriteArrayList) this.f28713a).isEmpty()) {
            ((CopyOnWriteArrayList) this.f28713a).clear();
        }
        if (!((CopyOnWriteArrayList) this.b).isEmpty()) {
            ((CopyOnWriteArrayList) this.b).clear();
        }
    }

    public void d(List<TbHRLogModel> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("685d5156", new Object[]{this, list});
        } else if (((CopyOnWriteArrayList) this.f28713a).isEmpty()) {
            sdh.b(ModuleName.CLIENT_TO_SERVICE_MONITOR, "TbHRLogDataPool,日志存储里为空");
        } else if (list == null || list.isEmpty()) {
            sdh.b(ModuleName.CLIENT_TO_SERVICE_MONITOR, "TbHRLogDataPool,removeLogList 需要移除的数据是空");
        } else {
            ((CopyOnWriteArrayList) this.f28713a).removeAll(list);
            sdh.b(ModuleName.CLIENT_TO_SERVICE_MONITOR, "TbHRLogDataPoolremoveLogList,当前的list的条数是：" + ((CopyOnWriteArrayList) this.f28713a).size());
        }
    }

    public void e(List<TbHRLogModel> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6e33b6c", new Object[]{this, list});
        } else if (!((CopyOnWriteArrayList) this.b).isEmpty()) {
            if (list == null || list.isEmpty()) {
                sdh.b(ModuleName.CLIENT_TO_SERVICE_MONITOR, "TbHRLogDataPoolremoveMonitorList 需要移除的数据是空");
                return;
            }
            ((CopyOnWriteArrayList) this.b).removeAll(list);
            sdh.b(ModuleName.CLIENT_TO_SERVICE_MONITOR, "TbHRLogDataPoolremoveMonitorList,当前的list的条数是：" + ((CopyOnWriteArrayList) this.b).size());
        }
    }

    public void f(TbHRLogModel tbHRLogModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70e5ffd5", new Object[]{this, tbHRLogModel});
            return;
        }
        if (((CopyOnWriteArrayList) this.f28713a).size() >= 1000) {
            List<TbHRLogModel> list = this.f28713a;
            ((CopyOnWriteArrayList) list).removeAll(((CopyOnWriteArrayList) list).subList(0, 100));
        }
        ((CopyOnWriteArrayList) this.f28713a).add(tbHRLogModel);
    }

    public void g(List<TbHRLogModel> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1745b4bd", new Object[]{this, list});
            return;
        }
        if (((CopyOnWriteArrayList) this.f28713a).size() >= 1000) {
            List<TbHRLogModel> list2 = this.f28713a;
            ((CopyOnWriteArrayList) list2).removeAll(((CopyOnWriteArrayList) list2).subList(0, 100));
        }
        ((CopyOnWriteArrayList) this.f28713a).addAll(list);
    }

    public void h(TbHRLogModel tbHRLogModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0a4c16b", new Object[]{this, tbHRLogModel});
            return;
        }
        if (((CopyOnWriteArrayList) this.b).size() >= 1000) {
            List<TbHRLogModel> list = this.b;
            ((CopyOnWriteArrayList) list).removeAll(((CopyOnWriteArrayList) list).subList(0, 100));
        }
        ((CopyOnWriteArrayList) this.b).add(tbHRLogModel);
    }

    public void i(List<TbHRLogModel> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a8d9353", new Object[]{this, list});
            return;
        }
        if (((CopyOnWriteArrayList) this.b).size() >= 1000) {
            List<TbHRLogModel> list2 = this.b;
            ((CopyOnWriteArrayList) list2).removeAll(((CopyOnWriteArrayList) list2).subList(0, 100));
        }
        ((CopyOnWriteArrayList) this.b).addAll(list);
    }
}
