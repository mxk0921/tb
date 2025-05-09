package tb;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.application.common.IScrollListener;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class jyo implements IScrollListener, skc<IScrollListener> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final List<IScrollListener> f22294a = new CopyOnWriteArrayList();

    /* renamed from: a */
    public void b(IScrollListener iScrollListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c24a96cd", new Object[]{this, iScrollListener});
        } else {
            ((CopyOnWriteArrayList) this.f22294a).add(iScrollListener);
        }
    }

    /* renamed from: c */
    public void d(IScrollListener iScrollListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fa30d0a", new Object[]{this, iScrollListener});
        } else {
            ((CopyOnWriteArrayList) this.f22294a).remove(iScrollListener);
        }
    }

    @Override // com.taobao.application.common.IScrollListener
    public void onDoFrame(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69ad383a", new Object[]{this, new Long(j)});
            return;
        }
        Iterator it = ((CopyOnWriteArrayList) this.f22294a).iterator();
        while (it.hasNext()) {
            ((IScrollListener) it.next()).onDoFrame(j);
        }
    }

    @Override // com.taobao.application.common.IScrollListener
    public void onScrollEnd(Activity activity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a820af52", new Object[]{this, activity, str});
            return;
        }
        Iterator it = ((CopyOnWriteArrayList) this.f22294a).iterator();
        while (it.hasNext()) {
            ((IScrollListener) it.next()).onScrollEnd(activity, str);
        }
    }

    @Override // com.taobao.application.common.IScrollListener
    public void onScrollStart(Activity activity, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b005994", new Object[]{this, activity, new Integer(i)});
            return;
        }
        Iterator it = ((CopyOnWriteArrayList) this.f22294a).iterator();
        while (it.hasNext()) {
            ((IScrollListener) it.next()).onScrollStart(activity, i);
        }
    }

    @Override // com.taobao.application.common.IScrollListener
    public void onStopMonitorDoFrame() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4729dd0", new Object[]{this});
            return;
        }
        Iterator it = ((CopyOnWriteArrayList) this.f22294a).iterator();
        while (it.hasNext()) {
            ((IScrollListener) it.next()).onStopMonitorDoFrame();
        }
    }

    @Override // com.taobao.application.common.IScrollListener
    public void onScrollEnd(Activity activity, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbc32d85", new Object[]{this, activity, new Integer(i), str});
            return;
        }
        Iterator it = ((CopyOnWriteArrayList) this.f22294a).iterator();
        while (it.hasNext()) {
            ((IScrollListener) it.next()).onScrollEnd(activity, i, str);
        }
    }
}
