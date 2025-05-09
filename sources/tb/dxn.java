package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.api.RSoException;
import com.taobao.android.remoteso.component.c;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class dxn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c f18137a;
        public final /* synthetic */ cxn b;

        public a(c cVar, cxn cxnVar) {
            this.f18137a = cVar;
            this.b = cxnVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("mode", this.f18137a.m());
            hashMap.put("module", this.f18137a.i());
            hashMap.put("showUI", Boolean.valueOf(this.f18137a.w()));
            hashMap.put("duration", Long.valueOf(this.f18137a.s()));
            if (this.b.a()) {
                rbn.j("remo_result", hashMap);
            } else {
                rbn.h("remo_result", hashMap, RSoException.error(this.b.d(), this.b.e()));
            }
        }
    }

    public static void a(c cVar, cxn cxnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12388f6", new Object[]{cVar, cxnVar});
        } else {
            rbn.i("RemoTrack.track", new a(cVar, cxnVar));
        }
    }
}
