package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class v8j implements ifo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final List<IDMComponent> f29854a;

    static {
        t2o.a(155189347);
        t2o.a(155189348);
    }

    public v8j(List<IDMComponent> list) {
        this.f29854a = list;
    }

    @Override // tb.ifo
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1678716b", new Object[]{this});
        } else {
            c(this.f29854a);
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("592c7ea2", new Object[]{this});
            return;
        }
        List<IDMComponent> list = this.f29854a;
        if (list != null) {
            for (IDMComponent iDMComponent : list) {
                if (iDMComponent != null) {
                    iDMComponent.record();
                }
            }
        }
    }

    public final void c(List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14c25126", new Object[]{this, list});
        } else if (list != null) {
            for (IDMComponent iDMComponent : list) {
                if (iDMComponent != null) {
                    iDMComponent.rollBack();
                }
            }
        }
    }
}
