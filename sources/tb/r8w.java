package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.kirinvideoengine.model.EngineModel;
import com.taobao.kirinvideoengine.model.MediaModel;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class r8w {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final List<MediaModel> f27199a = new ArrayList();
    public final boolean b;

    static {
        t2o.a(352321658);
    }

    public r8w(boolean z) {
        this.b = z;
    }

    public List<MediaModel> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("4ee41b74", new Object[]{this});
        }
        return this.f27199a;
    }

    public void b(List<? extends x3w> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8255b61", new Object[]{this, list});
            return;
        }
        ((ArrayList) this.f27199a).clear();
        if (list != null) {
            for (x3w x3wVar : list) {
                if (x3wVar instanceof ue7) {
                    g9e A0 = ((ue7) x3wVar).A0();
                    if (A0 instanceof g5g) {
                        EngineModel m = ((g5g) A0).m();
                        if (m != null) {
                            ((ArrayList) this.f27199a).add(m.mediaModel);
                        } else if (this.b) {
                            ((ArrayList) this.f27199a).add(null);
                        }
                    } else if (this.b) {
                        ((ArrayList) this.f27199a).add(null);
                    }
                }
            }
        }
    }
}
