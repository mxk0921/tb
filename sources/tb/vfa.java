package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.model.common.LiveItem;
import tb.fvc;
import tb.r9e;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public abstract class vfa<T extends r9e, M extends fvc> implements bdd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public T f29980a;
    public M b;
    public final jq6 c;
    public final xea d;

    static {
        t2o.a(295698849);
        t2o.a(295698846);
    }

    public vfa(xea xeaVar) {
        jq6 jq6Var = new jq6();
        this.c = jq6Var;
        this.d = xeaVar;
        if (xeaVar != null) {
            wda wdaVar = xeaVar.l;
            jq6Var.d(wdaVar.e, wdaVar.f);
        }
    }

    @Override // tb.bdd
    public void I(r9e r9eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("306ff79c", new Object[]{this, r9eVar});
            return;
        }
        this.f29980a = r9eVar;
        M N = N();
        this.b = N;
        N.h(this);
    }

    public int J(LiveItem liveItem, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7859132e", new Object[]{this, liveItem, new Integer(i)})).intValue();
        }
        if (this.d.c()) {
            return 7;
        }
        return i;
    }

    public th5 K(LiveItem liveItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (th5) ipChange.ipc$dispatch("90e6be85", new Object[]{this, liveItem});
        }
        return L(liveItem, null);
    }

    public th5 L(LiveItem liveItem, String str) {
        String str2;
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (th5) ipChange.ipc$dispatch("5faf53b", new Object[]{this, liveItem, str});
        }
        if (liveItem == null) {
            return null;
        }
        if (liveItem.liveItemStatusData == null) {
            liveItem.liveItemStatusData = new JSONObject();
        }
        xea xeaVar = this.d;
        if (xeaVar == null || xeaVar.j() == null) {
            str2 = "";
        } else {
            str2 = this.d.j().B();
        }
        xea xeaVar2 = this.d;
        if (xeaVar2 != null) {
            this.c.l(xeaVar2, liveItem, xeaVar2.H(), str2, str);
        }
        LiveItem.Ext ext = liveItem.extendVal;
        if (ext != null) {
            j = ext.timeVersion;
        } else {
            j = 0;
        }
        th5 th5Var = new th5(String.valueOf(liveItem.itemId), J(liveItem, 4), liveItem.parseJsonObject(), liveItem.goodsIndex, j);
        th5Var.b(liveItem, zha.e(this.d, liveItem));
        return th5Var;
    }

    public xea M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xea) ipChange.ipc$dispatch("49e815e3", new Object[]{this});
        }
        return this.d;
    }

    public abstract M N();

    @Override // tb.bdd
    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3abe1d5f", new Object[]{this});
        } else {
            this.b.c();
        }
    }
}
