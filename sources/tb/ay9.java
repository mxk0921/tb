package tb;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ay9 extends xr9 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TASK_TAG = "FrameInstallTask_";

    /* renamed from: a  reason: collision with root package name */
    public final BaseFrame f16073a;
    public final BaseFrame b;
    public final ViewStub c;
    public final ViewGroup d;
    public BaseFrame.b e;

    static {
        t2o.a(295698824);
    }

    public ay9(BaseFrame baseFrame, BaseFrame baseFrame2, View view) {
        if (view instanceof ViewStub) {
            this.c = (ViewStub) view;
        } else if (view instanceof ViewGroup) {
            this.d = (ViewGroup) view;
        }
        this.b = baseFrame2;
        this.f16073a = baseFrame;
    }

    public static /* synthetic */ Object ipc$super(ay9 ay9Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/fullscreen/schedule/tasks/FrameInstallTask");
    }

    @Override // tb.fzd
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9425d337", new Object[]{this});
            return;
        }
        BaseFrame baseFrame = this.f16073a;
        if (baseFrame != null) {
            baseFrame.onInstall(this.b, this.c, this.d, this.e);
        }
    }

    @Override // tb.fzd
    public String getTaskName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d0a42b93", new Object[]{this});
        }
        return TASK_TAG + this.f16073a.getComponentName();
    }

    public void h(BaseFrame.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3973b7e9", new Object[]{this, bVar});
        } else {
            this.e = bVar;
        }
    }
}
