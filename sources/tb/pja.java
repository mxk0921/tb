package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.jsbridge.AliFestivalWVPlugin;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class pja extends yiw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(970981393);
    }

    public pja(j1r j1rVar) {
        super(j1rVar);
    }

    public static /* synthetic */ Object ipc$super(pja pjaVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/virtual_thread/adapter/strategy/GrayScaleExperimentVirtualThreadStrategy");
    }

    @Override // tb.yiw
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f6acd750", new Object[]{this})).booleanValue();
        }
        return this.f32122a.c(AliFestivalWVPlugin.PARAMS_DEFAULT_VALUE, true);
    }

    @Override // tb.yiw
    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1f5a40f3", new Object[]{this});
        }
        return this.f32122a.b("work_thread_pool", yhs.DEFAULT_PLAN_B_PASSWORD_REGEX);
    }
}
