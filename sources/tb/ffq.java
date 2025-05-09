package tb;

import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import tb.egq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ffq implements nnf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ mnf f19257a;
        public final /* synthetic */ bgq b;
        public final /* synthetic */ egq c;

        public a(mnf mnfVar, bgq bgqVar, egq egqVar) {
            this.f19257a = mnfVar;
            this.b = bgqVar;
            this.c = egqVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            mnf mnfVar = this.f19257a;
            if (mnfVar != null) {
                mnfVar.onError(this.b, this.c);
            }
        }
    }

    @Override // tb.nnf
    public boolean cancel(bgq bgqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("801a6ac3", new Object[]{this, bgqVar})).booleanValue();
        }
        return false;
    }

    @Override // tb.nnf
    public boolean asyncSend(bgq bgqVar, mnf mnfVar, Handler handler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ac8307d5", new Object[]{this, bgqVar, mnfVar, handler})).booleanValue();
        }
        a aVar = new a(mnfVar, bgqVar, new egq.b().b(417).e("SSRE_NOT_SUPPORT").d("未集成MTOPSDK").a());
        if (handler != null) {
            handler.post(aVar);
        } else {
            new Handler(Looper.getMainLooper()).post(aVar);
        }
        return false;
    }
}
