package tb;

import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.pop.protocol.event.IPopMessageListener;
import com.taobao.homepage.pop.protocol.event.IPopViewEventListener;
import com.taobao.homepage.pop.protocol.model.pop.IPopData;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class tfm implements IPopViewEventListener, IPopMessageListener, ebd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Set<IPopViewEventListener> f28690a = new CopyOnWriteArraySet();
    public final Set<IPopMessageListener> b = new CopyOnWriteArraySet();
    public final Set<ebd> c = new CopyOnWriteArraySet();

    @Override // tb.ebd
    public void a(View view, IPopData<?> iPopData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62ee8b5e", new Object[]{this, view, iPopData});
            return;
        }
        Iterator it = ((CopyOnWriteArraySet) this.c).iterator();
        while (it.hasNext()) {
            try {
                ((ebd) it.next()).a(view, iPopData);
            } catch (Throwable th) {
                vfm.d("onPopViewUpdate error", th);
            }
        }
    }

    @Override // tb.ebd
    public void b(View view, IPopData<?> iPopData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ff2023e", new Object[]{this, view, iPopData});
            return;
        }
        Iterator it = ((CopyOnWriteArraySet) this.c).iterator();
        while (it.hasNext()) {
            try {
                ((ebd) it.next()).b(view, iPopData);
            } catch (Throwable th) {
                vfm.d("onPopViewUpdate error", th);
            }
        }
    }

    public void c(IPopViewEventListener iPopViewEventListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70f4f713", new Object[]{this, iPopViewEventListener});
        } else if (iPopViewEventListener != null) {
            ((CopyOnWriteArraySet) this.f28690a).add(iPopViewEventListener);
        }
    }

    public void d(IPopMessageListener iPopMessageListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6472282e", new Object[]{this, iPopMessageListener});
        } else if (iPopMessageListener != null) {
            ((CopyOnWriteArraySet) this.b).add(iPopMessageListener);
        }
    }

    public void e(ebd ebdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5094bde", new Object[]{this, ebdVar});
        } else if (ebdVar != null) {
            ((CopyOnWriteArraySet) this.c).add(ebdVar);
        }
    }

    public void f(IPopViewEventListener iPopViewEventListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44d6cc36", new Object[]{this, iPopViewEventListener});
        } else if (iPopViewEventListener != null) {
            ((CopyOnWriteArraySet) this.f28690a).remove(iPopViewEventListener);
        }
    }

    public void g(IPopMessageListener iPopMessageListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3853fd51", new Object[]{this, iPopMessageListener});
        } else if (iPopMessageListener != null) {
            ((CopyOnWriteArraySet) this.b).remove(iPopMessageListener);
        }
    }

    public void h(ebd ebdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36f17ac1", new Object[]{this, ebdVar});
        } else if (ebdVar != null) {
            ((CopyOnWriteArraySet) this.c).remove(ebdVar);
        }
    }

    @Override // com.taobao.homepage.pop.protocol.event.IPopViewEventListener
    public void onEvent(int i, IPopData iPopData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b090649f", new Object[]{this, new Integer(i), iPopData});
            return;
        }
        Iterator it = ((CopyOnWriteArraySet) this.f28690a).iterator();
        while (it.hasNext()) {
            try {
                ((IPopViewEventListener) it.next()).onEvent(i, iPopData);
            } catch (Throwable th) {
                vfm.d("trigger onEvent error", th);
            }
        }
    }

    @Override // com.taobao.homepage.pop.protocol.event.IPopMessageListener
    public void onMessage(String str, IPopData iPopData, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9b3eda9", new Object[]{this, str, iPopData, jSONObject});
            return;
        }
        Iterator it = ((CopyOnWriteArraySet) this.b).iterator();
        while (it.hasNext()) {
            try {
                ((IPopMessageListener) it.next()).onMessage(str, iPopData, jSONObject);
            } catch (Throwable th) {
                vfm.d("trigger onMessage error", th);
            }
        }
    }
}
