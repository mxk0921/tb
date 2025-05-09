package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.uikit.api.TBLiveBaseComponentView;
import java.lang.ref.WeakReference;
import java.util.LinkedList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class djr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final LinkedList<WeakReference<twg>> f17873a = new LinkedList<>();
    public final LinkedList<WeakReference<TBLiveBaseComponentView>> b = new LinkedList<>();

    static {
        t2o.a(779093681);
    }

    public void a(TBLiveBaseComponentView tBLiveBaseComponentView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1be6f7ae", new Object[]{this, tBLiveBaseComponentView});
        } else {
            this.b.addLast(new WeakReference<>(tBLiveBaseComponentView));
        }
    }

    public void b(twg twgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93e6d426", new Object[]{this, twgVar});
            return;
        }
        c();
        this.f17873a.addLast(new WeakReference<>(twgVar));
    }

    public final void c() {
        WeakReference<twg> removeFirst;
        twg twgVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18dc5d19", new Object[]{this});
        } else if (this.f17873a.size() > ejr.q() && (removeFirst = this.f17873a.removeFirst()) != null && (twgVar = removeFirst.get()) != null) {
            twgVar.r();
        }
    }

    public void d(boolean z) {
        TBLiveBaseComponentView tBLiveBaseComponentView;
        twg twgVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0294725", new Object[]{this, new Boolean(z)});
            return;
        }
        LinkedList<WeakReference<twg>> linkedList = this.f17873a;
        if (linkedList != null && linkedList.size() > 0) {
            LinkedList linkedList2 = (LinkedList) this.f17873a.clone();
            for (int i = 0; i < linkedList2.size(); i++) {
                WeakReference weakReference = (WeakReference) linkedList2.get(i);
                if (!(weakReference == null || (twgVar = (twg) weakReference.get()) == null)) {
                    twgVar.g(z);
                }
            }
            this.f17873a.clear();
        }
        LinkedList<WeakReference<TBLiveBaseComponentView>> linkedList3 = this.b;
        if (linkedList3 != null && linkedList3.size() > 0) {
            LinkedList linkedList4 = (LinkedList) this.b.clone();
            for (int i2 = 0; i2 < this.b.size(); i2++) {
                WeakReference weakReference2 = (WeakReference) linkedList4.get(i2);
                if (!(weakReference2 == null || (tBLiveBaseComponentView = (TBLiveBaseComponentView) weakReference2.get()) == null)) {
                    tBLiveBaseComponentView.destroy();
                }
            }
            this.b.clear();
        }
    }

    public void e(TBLiveBaseComponentView tBLiveBaseComponentView) {
        TBLiveBaseComponentView tBLiveBaseComponentView2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c54e7c51", new Object[]{this, tBLiveBaseComponentView});
            return;
        }
        LinkedList<WeakReference<TBLiveBaseComponentView>> linkedList = this.b;
        if (linkedList != null && linkedList.size() > 0) {
            for (int i = 0; i < this.b.size(); i++) {
                WeakReference<TBLiveBaseComponentView> weakReference = this.b.get(i);
                if (!(weakReference == null || (tBLiveBaseComponentView2 = weakReference.get()) == null || tBLiveBaseComponentView2 != tBLiveBaseComponentView)) {
                    this.b.remove(weakReference);
                }
            }
        }
    }

    public void f(twg twgVar) {
        twg twgVar2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f871b5a3", new Object[]{this, twgVar});
            return;
        }
        for (int i = 0; i < this.f17873a.size(); i++) {
            WeakReference<twg> weakReference = this.f17873a.get(i);
            if (!(weakReference == null || (twgVar2 = weakReference.get()) == null || twgVar2 != twgVar)) {
                this.f17873a.remove(weakReference);
            }
        }
    }
}
