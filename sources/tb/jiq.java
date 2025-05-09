package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.AlgoGoodsCardConfigData;
import com.taobao.taolive.sdk.model.common.LiveItem;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class jiq implements isd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f22014a;
    public final boolean b;
    public gwp c;
    public gwp d;
    public final long e;

    static {
        t2o.a(295699125);
        t2o.a(295699053);
    }

    public jiq(List<LiveItem> list, long j, boolean z, boolean z2) {
        this.f22014a = z;
        this.b = z2;
        this.e = j;
        g(list);
    }

    @Override // tb.isd
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53a13601", new Object[]{this});
        }
    }

    @Override // tb.isd
    public AlgoGoodsCardConfigData b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AlgoGoodsCardConfigData) ipChange.ipc$dispatch("4d49c5c", new Object[]{this});
        }
        return null;
    }

    @Override // tb.isd
    public gwp c() {
        long j;
        LiveItem.Ext ext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gwp) ipChange.ipc$dispatch("a7f6f1b5", new Object[]{this});
        }
        if (!this.f22014a) {
            return null;
        }
        gwp gwpVar = this.c;
        if (gwpVar != null) {
            LiveItem liveItem = gwpVar.c;
            if (liveItem == null || (ext = liveItem.extendVal) == null) {
                j = -1;
            } else {
                j = zqq.h(ext.timepoint);
            }
            if (j > 0 && pfa.m() - j > this.e * 1000) {
                this.c = null;
            }
        }
        gwp gwpVar2 = this.c;
        if (gwpVar2 == null) {
            return this.d;
        }
        return gwpVar2;
    }

    @Override // tb.isd
    public void d(LiveItem liveItem, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7061949", new Object[]{this, liveItem, new Boolean(z)});
            return;
        }
        if (!z) {
            this.d = null;
        }
        if (pfa.M(liveItem)) {
            this.c = new gwp(liveItem);
        }
    }

    @Override // tb.isd
    public void e(LiveItem liveItem) {
        gwp gwpVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36c4633d", new Object[]{this, liveItem});
        } else if (liveItem != null && (gwpVar = this.c) != null && gwpVar.f20272a == liveItem.itemId) {
            this.c = null;
        }
    }

    @Override // tb.isd
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6500b479", new Object[]{this});
        } else {
            this.c = null;
        }
    }

    public final void g(List<LiveItem> list) {
        LiveItem liveItem;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("212c6088", new Object[]{this, list});
        } else if (list != null && !list.isEmpty() && this.b && (liveItem = list.get(0)) != null) {
            if (pfa.M(liveItem)) {
                this.c = new gwp(liveItem);
            } else {
                this.d = new gwp(liveItem);
            }
        }
    }
}
