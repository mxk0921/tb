package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class y76 extends oh5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DX_EVENT_PIPELINE_SCHEDULE = "DX_EVENT_PIPELINE_SCHEDULE";
    public int d;
    public int e;
    public boolean f;

    static {
        t2o.a(444597504);
    }

    public y76() {
        this.b = DX_EVENT_PIPELINE_SCHEDULE;
    }

    public static /* synthetic */ Object ipc$super(y76 y76Var, String str, Object... objArr) {
        if (str.hashCode() == 778694849) {
            return new Boolean(super.a((oh5) objArr[0]));
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/widget/event/DXPipelineScheduleEvent");
    }

    @Override // tb.oh5
    public boolean a(oh5 oh5Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2e69f0c1", new Object[]{this, oh5Var})).booleanValue();
        }
        if (oh5Var != null && (oh5Var instanceof y76) && this.d == ((y76) oh5Var).d) {
            return super.a(oh5Var);
        }
        return false;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "DXPipelineScheduleEvent{stage=" + this.d + ", sender=" + this.f25390a + ", eventName='" + this.b + "', args=" + this.c + '}';
    }
}
