package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.dojo.ability.log.ModuleName;
import com.taobao.homepage.messiah.model.TbHRLogModel;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class vgt implements pqk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final tgt f30010a = new tgt();
    public final ugt b = new ugt();
    public Boolean c;
    public Boolean d;

    static {
        t2o.a(447741965);
        t2o.a(447741993);
    }

    @Override // tb.pqk
    public void a(String str, String str2, String str3, TbHRLogModel tbHRLogModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9908794", new Object[]{this, str, str2, str3, tbHRLogModel});
        } else if (!c()) {
            sdh.b(ModuleName.CLIENT_TO_SERVICE_MONITOR, "TbHRLogSubscribe,不允许上传数据");
        } else {
            b(tbHRLogModel);
            this.b.p(str, str2, str3, this.f30010a);
        }
    }

    public final void b(TbHRLogModel tbHRLogModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40dd1c45", new Object[]{this, tbHRLogModel});
            return;
        }
        String logType = tbHRLogModel.getLogType();
        if (logType.equals("investigate") && d()) {
            this.f30010a.f(tbHRLogModel);
        }
        if (logType.equals("monitor") && e()) {
            this.f30010a.h(tbHRLogModel);
        }
    }

    public final boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e878bc3c", new Object[]{this})).booleanValue();
        }
        if ((d() || e()) && !this.b.l()) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("94915490", new Object[]{this})).booleanValue();
        }
        if (this.d == null) {
            this.d = Boolean.valueOf(Boolean.parseBoolean(ebl.b("isOpenRealTimeLog", "false")));
        }
        return this.d.booleanValue();
    }

    public final boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4c922b26", new Object[]{this})).booleanValue();
        }
        if (this.c == null) {
            this.c = Boolean.valueOf(Boolean.parseBoolean(ebl.b("isOpenRealTimeMonitor", "true")));
        }
        return this.c.booleanValue();
    }
}
