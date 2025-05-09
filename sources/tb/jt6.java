package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class jt6 extends vjv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final df4 f22197a;

    static {
        t2o.a(954204180);
    }

    public jt6(df4 df4Var) {
        this.f22197a = df4Var;
    }

    public static /* synthetic */ Object ipc$super(jt6 jt6Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/update/lifecycle/DataSourceLifeCycle");
    }

    @Override // tb.vjv
    public void onForeground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7f3c09", new Object[]{this});
        } else if (this.f22197a.foregroundRequest) {
            kjv.getInstance().startUpdate(true, true);
        }
    }
}
