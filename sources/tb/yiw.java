package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.jsbridge.AliFestivalWVPlugin;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class yiw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final j1r f32122a;

    static {
        t2o.a(970981394);
    }

    public yiw(j1r j1rVar) {
        this.f32122a = j1rVar;
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f6acd750", new Object[]{this})).booleanValue();
        }
        return this.f32122a.c(AliFestivalWVPlugin.PARAMS_DEFAULT_VALUE, false);
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1f5a40f3", new Object[]{this});
        }
        return this.f32122a.b("work_thread_pool", "");
    }
}
