package tb;

import com.alibaba.android.aura.service.event.AURAEventIO;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class fn0 extends pt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AURAEventIO f19416a;
    public final /* synthetic */ en0 b;

    public fn0(en0 en0Var, AURAEventIO aURAEventIO) {
        this.b = en0Var;
        this.f19416a = aURAEventIO;
    }

    public static /* synthetic */ Object ipc$super(fn0 fn0Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/buy/extension/event/openUrl/AliBuyOpenUrlNativeParamsChangeAddressExtension$2");
    }

    @Override // tb.pt, tb.hbb
    public void b(mi miVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b02141a5", new Object[]{this, miVar});
        }
    }

    @Override // tb.pt
    public void c(yk ykVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a18a85df", new Object[]{this, ykVar});
        } else {
            en0.x(this.b, msg.a(this.f19416a));
        }
    }
}
