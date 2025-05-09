package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.component.module.DataEntry;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class bkj implements uob<wua> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String NAME = "headerPic";

    /* renamed from: a  reason: collision with root package name */
    public final ReentrantLock f16447a = new ReentrantLock();
    public tua b;

    static {
        t2o.a(912261382);
        t2o.a(912261471);
    }

    /* renamed from: b */
    public oa4<wua> a(Context context, ze7 ze7Var, wua wuaVar, DataEntry... dataEntryArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (oa4) ipChange.ipc$dispatch("fd22b76", new Object[]{this, context, ze7Var, wuaVar, dataEntryArr});
        }
        this.f16447a.lock();
        try {
            if (this.b == null) {
                this.b = new tua(context, ze7Var, wuaVar, dataEntryArr);
            }
            tua tuaVar = this.b;
            this.f16447a.unlock();
            return tuaVar;
        } catch (Throwable th) {
            this.f16447a.unlock();
            throw th;
        }
    }
}
