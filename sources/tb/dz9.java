package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class dz9 extends xr9 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TASK_TAG = "FrameUnInstallTask_";

    /* renamed from: a  reason: collision with root package name */
    public final BaseFrame f18171a;

    static {
        t2o.a(295698825);
    }

    public dz9(BaseFrame baseFrame) {
        this.f18171a = baseFrame;
    }

    public static /* synthetic */ Object ipc$super(dz9 dz9Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/fullscreen/schedule/tasks/FrameUnInstallTask");
    }

    @Override // tb.fzd
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9425d337", new Object[]{this});
        } else if (this.f18171a != null) {
            h4s.d("ComponentLifeCycle/" + this.f18171a.getComponentName(), this.f18171a.hashCode());
            this.f18171a.onUnInstall();
        }
    }

    @Override // tb.fzd
    public String getTaskName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d0a42b93", new Object[]{this});
        }
        return TASK_TAG + this.f18171a.getComponentName();
    }
}
