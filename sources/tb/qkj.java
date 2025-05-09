package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.component.module.DataEntry;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class qkj implements uob {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String NAME = "navBar";

    /* renamed from: a  reason: collision with root package name */
    public final ReentrantLock f26798a = new ReentrantLock();
    public jos b;

    static {
        t2o.a(912261387);
        t2o.a(912261471);
    }

    @Override // tb.uob
    public oa4 a(Context context, ze7 ze7Var, nb4 nb4Var, DataEntry... dataEntryArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (oa4) ipChange.ipc$dispatch("b77b1e89", new Object[]{this, context, ze7Var, nb4Var, dataEntryArr});
        }
        this.f26798a.lock();
        try {
            if (this.b == null) {
                this.b = new jos(context, ze7Var, nb4Var, dataEntryArr);
            }
            jos josVar = this.b;
            this.f26798a.unlock();
            return josVar;
        } catch (Throwable th) {
            this.f26798a.unlock();
            throw th;
        }
    }
}
