package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.pop.protocol.model.pop.IPopData;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class scm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final e3b f27952a;
    public final IPopData b;

    public scm(e3b e3bVar, IPopData iPopData) {
        this.f27952a = e3bVar;
        this.b = iPopData;
    }

    public e3b a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e3b) ipChange.ipc$dispatch("89e90828", new Object[]{this});
        }
        return this.f27952a;
    }

    public IPopData b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IPopData) ipChange.ipc$dispatch("5b306b5c", new Object[]{this});
        }
        return this.b;
    }
}
