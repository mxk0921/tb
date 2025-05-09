package tb;

import android.os.Handler;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.common.util.HeaderHandlerUtil;
import mtopsdk.common.util.HttpHeaderConstant;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.util.ErrorConstant;
import mtopsdk.mtop.util.MtopSDKThreadPoolExecutorFactory;
import mtopsdk.ssrcore.callback.SsrCallbackImpl;
import mtopsdk.ssrcore.callback.SsrFinishEvent;
import tb.egq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class lfq {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int MAX_REDIRECT_TIMES = 10;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ efq f23316a;
        public final /* synthetic */ egq b;
        public final /* synthetic */ SsrFinishEvent c;

        public a(efq efqVar, egq egqVar, SsrFinishEvent ssrFinishEvent) {
            this.f23316a = efqVar;
            this.b = egqVar;
            this.c = ssrFinishEvent;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            efq efqVar = this.f23316a;
            efqVar.d.P = HeaderHandlerUtil.getSingleHeaderFieldByKey(efqVar.f.d, HttpHeaderConstant.SERVER_TRACE_ID);
            efq efqVar2 = this.f23316a;
            efqVar2.d.Q = HeaderHandlerUtil.getSingleHeaderFieldByKey(efqVar2.f.d, "eagleeye-traceid");
            i7j i7jVar = this.f23316a.d;
            egq egqVar = this.b;
            i7jVar.u = egqVar.f18565a;
            if (TextUtils.isEmpty(egqVar.b)) {
                String singleHeaderFieldByKey = HeaderHandlerUtil.getSingleHeaderFieldByKey(this.b.d, "x-sec-reason");
                if (!TextUtils.isEmpty(singleHeaderFieldByKey)) {
                    this.f23316a.d.v = singleHeaderFieldByKey;
                }
            } else {
                this.f23316a.d.v = this.b.b;
            }
            mfq.h(this.f23316a.d);
            efq efqVar3 = this.f23316a;
            efqVar3.d.x = 1;
            ((SsrCallbackImpl) efqVar3.k).onFinish(this.c);
            String str = this.f23316a.b;
            TBSdkLog.e("ssr.SsrFilterUtils", str, "[handleExceptionCallBack].code=" + this.b.f18565a + ", retCode = " + this.b.b + ", msg = " + this.b.c);
            this.f23316a.d.j();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ mnf f23317a;
        public final /* synthetic */ bgq b;
        public final /* synthetic */ egq c;

        public b(mnf mnfVar, bgq bgqVar, egq egqVar) {
            this.f23317a = mnfVar;
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
            mnf mnfVar = this.f23317a;
            if (mnfVar != null) {
                mnfVar.onError(this.b, this.c);
            }
        }
    }

    public static void a(a7c a7cVar, efq efqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22826bbe", new Object[]{a7cVar, efqVar});
        } else if (a7cVar == null) {
            efqVar.f = new egq.b().b(417).e("SSRE_MTOPSDK_INIT_ERROR").d(ErrorConstant.ERRMSG_MTOPSDK_INIT_ERROR).a();
            d(efqVar);
        }
    }

    public static boolean b(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4428c52f", new Object[]{new Integer(i), new Integer(i2)})).booleanValue();
        }
        if (i2 < 300 || i2 >= 400 || i2 == 304 || i >= 10) {
            return false;
        }
        return true;
    }

    public static void c(bgq bgqVar, mnf mnfVar, Handler handler, egq egqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9af18c29", new Object[]{bgqVar, mnfVar, handler, egqVar});
            return;
        }
        b bVar = new b(mnfVar, bgqVar, egqVar);
        if (handler != null) {
            handler.post(bVar);
        } else {
            nfq.d().post(bVar);
        }
    }

    public static void d(efq efqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec0df88a", new Object[]{efqVar});
            return;
        }
        try {
            egq egqVar = efqVar.f;
            if (egqVar != null && (efqVar.k instanceof SsrCallbackImpl)) {
                SsrFinishEvent ssrFinishEvent = new SsrFinishEvent(egqVar);
                ssrFinishEvent.statistics = efqVar.d;
                e(efqVar.f18534a.handler, new a(efqVar, egqVar, ssrFinishEvent), efqVar.b.hashCode());
            }
        } catch (Throwable th) {
            TBSdkLog.e("ssr.SsrFilterUtils", efqVar.b, "[handleExceptionCallBack]", th);
        }
    }

    public static void e(Handler handler, Runnable runnable, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d3c0d8a", new Object[]{handler, runnable, new Integer(i)});
        } else if (handler != null) {
            handler.post(runnable);
        } else {
            MtopSDKThreadPoolExecutorFactory.submitSsrCallbackTask(i, runnable);
        }
    }
}
