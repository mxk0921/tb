package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mrt.task.desc.MRTResourceDescription;
import java.util.HashSet;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class wqh {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final wqh b = new wqh();

    /* renamed from: a  reason: collision with root package name */
    public final Set<MRTResourceDescription> f30859a = new HashSet();

    static {
        t2o.a(577765427);
    }

    public static wqh a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wqh) ipChange.ipc$dispatch("58b089e", new Object[0]);
        }
        return b;
    }

    public boolean b(MRTResourceDescription mRTResourceDescription) {
        boolean contains;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5fb97442", new Object[]{this, mRTResourceDescription})).booleanValue();
        }
        if (mRTResourceDescription == null) {
            return false;
        }
        synchronized (this.f30859a) {
            contains = ((HashSet) this.f30859a).contains(mRTResourceDescription);
        }
        return contains;
    }

    public void c(MRTResourceDescription mRTResourceDescription) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d095031", new Object[]{this, mRTResourceDescription});
            return;
        }
        synchronized (this.f30859a) {
            ((HashSet) this.f30859a).add(mRTResourceDescription);
        }
    }
}
