package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class nbm extends o22 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final WeakReference<xad> b;

    static {
        t2o.a(404750764);
    }

    public nbm(xad xadVar) {
        this.b = new WeakReference<>(xadVar);
    }

    public static /* synthetic */ Object ipc$super(nbm nbmVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/ucp/view/PopCenterViewWrapper");
    }

    @Override // tb.l3e
    public String getBizId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d09a5221", new Object[]{this});
        }
        xad xadVar = this.b.get();
        if (xadVar != null) {
            return xadVar.o();
        }
        return "";
    }

    @Override // tb.l3e
    public boolean isShowing() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d3c33646", new Object[]{this})).booleanValue();
        }
        if (this.b.get() != null) {
            return true;
        }
        return false;
    }
}
