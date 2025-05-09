package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.messagekit.base.MsgRouter;
import com.taobao.tao.messagekit.core.model.Monitor;
import com.taobao.tao.messagekit.core.utils.MsgLog;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class dzi extends fy1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements vxx<sxx> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Monitor f18177a;
        public final /* synthetic */ lkd b;

        public a(dzi dziVar, Monitor monitor, lkd lkdVar) {
            this.f18177a = monitor;
            this.b = lkdVar;
        }

        /* renamed from: a */
        public void accept(sxx sxxVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2712411b", new Object[]{this, sxxVar});
            } else {
                MsgRouter.e().a().c(this.f18177a.header.f, this.b);
            }
        }
    }

    static {
        t2o.a(628097261);
    }

    public static /* synthetic */ Object ipc$super(dzi dziVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/powermsg/managers/MonitorDAOIMPL");
    }

    @Override // tb.fy1
    public svc g(long j, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (svc) ipChange.ipc$dispatch("80c1fb1e", new Object[]{this, new Long(j), str, str2});
        }
        JSONObject parseObject = JSON.parseObject(str2);
        if (parseObject == null) {
            return null;
        }
        l2o l2oVar = new l2o(str, parseObject.getIntValue("type"), parseObject.getIntValue("bizCode"), parseObject.getString("topic"), parseObject.getString(l2o.COL_BTAG), parseObject.getIntValue("code"), parseObject.getIntValue("mode"));
        l2oVar.f = parseObject.getIntValue("source");
        l2oVar.h = parseObject.getString(l2o.COL_TASK);
        l2oVar.j = parseObject.getLong("time").longValue();
        l2oVar.k = parseObject.getLong(l2o.COL_M_TIME).longValue();
        l2oVar.l = parseObject.getLong(l2o.COL_S_TIME).longValue();
        l2oVar.m = parseObject.getIntValue(l2o.COL_MARK);
        l2oVar.n = j;
        return l2oVar;
    }

    @Override // tb.fy1
    public int m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("323dd7de", new Object[]{this})).intValue();
        }
        return 5000;
    }

    @Override // tb.fy1
    public String n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6c7df93b", new Object[]{this});
        }
        return l2o.COL_TASK;
    }

    @Override // tb.lzc
    public int sysCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c43c79d4", new Object[]{this})).intValue();
        }
        return 2;
    }

    @Override // tb.fy1
    public void v(String str, List<svc> list, lkd lkdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9e69530", new Object[]{this, str, list, lkdVar});
        } else if (TextUtils.isEmpty(str)) {
            MsgLog.g("MonitorManager", "reportAckByMtop data is empty");
        } else {
            Monitor create = Monitor.create();
            create.setData(str);
            l5y.m(new ikl(create)).F(new a(this, create, lkdVar)).a(MsgRouter.e().j());
        }
    }
}
