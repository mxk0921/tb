package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class mqr implements wxc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final air f24238a;

    static {
        t2o.a(779093089);
        t2o.a(806355765);
    }

    public mqr(air airVar) {
        this.f24238a = airVar;
    }

    @Override // tb.wxc
    public boolean a() {
        l3h l3hVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("581643b0", new Object[]{this})).booleanValue();
        }
        air airVar = this.f24238a;
        if (!(airVar instanceof cdr) || (l3hVar = ((cdr) airVar).h0) == null) {
            return false;
        }
        return l3hVar.p();
    }

    @Override // tb.wxc
    public void i(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eefd31dc", new Object[]{this, new Boolean(z)});
            return;
        }
        air airVar = this.f24238a;
        if (airVar != null && airVar.x() != null) {
            this.f24238a.x().i(z);
        }
    }

    @Override // tb.wxc
    public boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2ce366a1", new Object[]{this})).booleanValue();
        }
        air airVar = this.f24238a;
        if (airVar == null || airVar.x() == null) {
            return false;
        }
        return this.f24238a.x().j();
    }
}
