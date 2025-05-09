package tb;

import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.basic.TMSLogger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Result;
import kotlin.b;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class hds {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final hds INSTANCE = new hds();

    /* renamed from: a  reason: collision with root package name */
    public static final ArrayList<vwd> f20565a = yz3.g(new ov9(), new lyu(), new g8s());

    static {
        t2o.a(847249439);
    }

    @JvmStatic
    public static final boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2b77beef", new Object[0])).booleanValue();
        }
        return q9s.b3("themis_common_config", "enablePreDomainCheck", Boolean.TRUE);
    }

    public final boolean b(mpj mpjVar) {
        Object obj;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e4350870", new Object[]{this, mpjVar})).booleanValue();
        }
        ckf.g(mpjVar, "navigationInfo");
        long uptimeMillis = SystemClock.uptimeMillis();
        boolean a2 = a();
        if (a2 && !v9s.INSTANCE.a(mpjVar)) {
            return false;
        }
        mpjVar.e(!a2);
        ArrayList<vwd> arrayList = f20565a;
        if (!(arrayList instanceof Collection) || !arrayList.isEmpty()) {
            Iterator<T> it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                try {
                    obj = Result.m1108constructorimpl(Boolean.valueOf(((vwd) it.next()).a(mpjVar)));
                } catch (Throwable th) {
                    obj = Result.m1108constructorimpl(b.a(th));
                }
                if (Result.m1111exceptionOrNullimpl(obj) != null) {
                    obj = Boolean.FALSE;
                }
                if (((Boolean) obj).booleanValue()) {
                    z = true;
                    break;
                }
            }
        }
        TMSLogger.f("TMSSwitchChecker", "shouldSwitchToTMS cost:" + (SystemClock.uptimeMillis() - uptimeMillis) + ", res:" + z + ", enablePreDomainCheck:" + a2);
        return z;
    }
}
