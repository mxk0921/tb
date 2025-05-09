package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.openarchitecture.entity.ATaoLiveOpenEntity;
import com.taobao.taolive.room.openarchitecture.opencompontent.ability.OpenAbilityCompontentTypeEnum;
import com.taobao.taolive.room.player.standard.manager.a;
import com.taobao.taolive.room.player.standard.window.NormalLiveRoomWindowImpl;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class z3h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ux9 f32511a;
    public final Context b;
    public cmc c;

    static {
        t2o.a(779093205);
    }

    public z3h(ux9 ux9Var, Context context) {
        this.f32511a = ux9Var;
        this.b = context;
        a();
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("806add02", new Object[]{this});
        } else if (c(this.f32511a)) {
            this.c = new ebq(this.f32511a, this.b);
        } else {
            this.c = new NormalLiveRoomWindowImpl(this.f32511a, this.b);
        }
    }

    public cmc b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cmc) ipChange.ipc$dispatch("f752e138", new Object[]{this});
        }
        return this.c;
    }

    public final boolean c(ux9 ux9Var) {
        ATaoLiveOpenEntity A;
        azd azdVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f5f65adb", new Object[]{this, ux9Var})).booleanValue();
        }
        if (ux9Var == null || (A = ux9Var.A()) == null || (azdVar = A.abilityCompontent) == null) {
            return false;
        }
        return ((ibt) azdVar).d(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_SpecialSmallWindow);
    }

    public void d(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a457841", new Object[]{this, aVar});
            return;
        }
        cmc cmcVar = this.c;
        if (cmcVar != null) {
            ((NormalLiveRoomWindowImpl) cmcVar).t(aVar);
        }
    }
}
