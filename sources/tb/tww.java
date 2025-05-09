package tb;

import android.os.SystemClock;
import com.alibaba.poplayer.layermanager.PopRequest;
import com.alibaba.poplayer.layermanager.c;
import com.alibaba.poplayer.track.module.OnePopModule;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class tww {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final List<PopRequest> f29010a = new ArrayList();

    static {
        t2o.a(625999958);
    }

    public boolean a(PopRequest popRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dfe3f6b8", new Object[]{this, popRequest})).booleanValue();
        }
        if (((ArrayList) this.f29010a).contains(popRequest)) {
            return false;
        }
        ((ArrayList) this.f29010a).add(popRequest);
        return true;
    }

    public List<PopRequest> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("5b5cbb60", new Object[]{this});
        }
        return this.f29010a;
    }

    public PopRequest c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PopRequest) ipChange.ipc$dispatch("41c30ddc", new Object[]{this});
        }
        if (((ArrayList) this.f29010a).isEmpty()) {
            return null;
        }
        PopRequest e = c.e(this.f29010a);
        d(e);
        return e;
    }

    public final boolean d(PopRequest popRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c0b17db", new Object[]{this, popRequest})).booleanValue();
        }
        if (popRequest != null) {
            try {
                OnePopModule k = popRequest.k();
                k.I = (SystemClock.elapsedRealtime() - popRequest.k().o0) + "";
            } catch (Throwable th) {
                wdm.h("WaitingList.remove.error.", th);
            }
        }
        return ((ArrayList) this.f29010a).remove(popRequest);
    }

    public boolean e(Collection<PopRequest> collection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d09ebe80", new Object[]{this, collection})).booleanValue();
        }
        for (PopRequest popRequest : collection) {
            if (popRequest != null && ((ArrayList) this.f29010a).contains(popRequest)) {
                OnePopModule k = popRequest.k();
                k.I = (SystemClock.elapsedRealtime() - popRequest.k().o0) + "";
            }
        }
        return ((ArrayList) this.f29010a).removeAll(collection);
    }
}
