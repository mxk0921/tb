package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.AliImageCreatorInterface;
import com.taobao.android.AliImageTicketInterface;
import com.taobao.phenix.intf.PhenixCreator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class a1m implements AliImageCreatorInterface {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final PhenixCreator f15488a;

    public a1m(PhenixCreator phenixCreator) {
        this.f15488a = phenixCreator;
    }

    @Override // com.taobao.android.AliImageCreatorInterface
    public AliImageTicketInterface a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AliImageTicketInterface) ipChange.ipc$dispatch("e9d70627", new Object[]{this});
        }
        return new q1m(this.f15488a.fetch());
    }

    @Override // com.taobao.android.AliImageCreatorInterface
    public AliImageCreatorInterface c(xp0<vp0> xp0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AliImageCreatorInterface) ipChange.ipc$dispatch("d169f7b8", new Object[]{this, xp0Var});
        }
        this.f15488a.failListener(new wp0(xp0Var));
        return this;
    }

    @Override // com.taobao.android.AliImageCreatorInterface
    public AliImageCreatorInterface succListener(xp0<aq0> xp0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AliImageCreatorInterface) ipChange.ipc$dispatch("8873e714", new Object[]{this, xp0Var});
        }
        this.f15488a.succListener(new bq0(xp0Var));
        return this;
    }
}
