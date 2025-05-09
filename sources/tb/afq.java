package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class afq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final efq f15713a;
    public volatile zu2 b;
    public volatile boolean c = false;

    public afq(zu2 zu2Var, efq efqVar) {
        this.b = zu2Var;
        this.f15713a = efqVar;
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6f684d49", new Object[]{this})).booleanValue();
        }
        if (this.b != null) {
            this.b.cancel();
            this.c = true;
        }
        return true;
    }

    public void b(zu2 zu2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10f049da", new Object[]{this, zu2Var});
        } else {
            this.b = zu2Var;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "SsrApiID{ssrContext=" + this.f15713a + ", call=" + this.b + ", isCancelled=" + this.c + '}';
    }
}
