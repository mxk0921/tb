package tb;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.common.MtopEvent;
import mtopsdk.ssrcore.callback.SsrFinishEvent;
import tb.i7j;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class nfq extends Handler {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ON_FINISHED = 2;
    public static final int ON_RECEIVE_DATA = 1;
    public static final int ON_RESPONSE = 0;

    /* renamed from: a  reason: collision with root package name */
    public static volatile Handler f24706a;

    public nfq(Looper looper) {
        super(looper);
    }

    public static ofq a(MtopEvent mtopEvent, cfq cfqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ofq) ipChange.ipc$dispatch("e1f8f011", new Object[]{mtopEvent, cfqVar});
        }
        return new ofq(mtopEvent, cfqVar);
    }

    public static ofq b(cfq cfqVar, bgq bgqVar, int i, Map<String, List<String>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ofq) ipChange.ipc$dispatch("caf8f2b2", new Object[]{cfqVar, bgqVar, new Integer(i), map});
        }
        return new ofq(cfqVar, bgqVar, i, map);
    }

    public static ofq c(cfq cfqVar, bgq bgqVar, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ofq) ipChange.ipc$dispatch("9561d757", new Object[]{cfqVar, bgqVar, bArr});
        }
        return new ofq(cfqVar, bgqVar, bArr);
    }

    public static Handler d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("cd2acaaa", new Object[0]);
        }
        if (f24706a == null) {
            synchronized (nfq.class) {
                try {
                    if (f24706a == null) {
                        f24706a = new nfq(Looper.getMainLooper());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f24706a;
    }

    public static /* synthetic */ Object ipc$super(nfq nfqVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in mtopsdk/ssrcore/handler/SsrHandlerMgr");
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        i7j.c cVar;
        i7j i7jVar;
        long j;
        cfq cfqVar;
        cfq cfqVar2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
            return;
        }
        ofq ofqVar = (ofq) message.obj;
        String str = "";
        if (ofqVar == null) {
            TBSdkLog.e("ssr.SsrHandlerMgr", str, "SsrHandlerMgr is null");
            return;
        }
        cfq cfqVar3 = ofqVar.b;
        if (cfqVar3 != null) {
            str = cfqVar3.r();
            if (ofqVar.b.u()) {
                TBSdkLog.i("ssr.SsrHandlerMgr", str, "The request of SsrBusiness is cancelled.");
                return;
            }
        }
        int i = message.what;
        if (i == 0 && (cfqVar2 = ofqVar.b) != null) {
            cfqVar2.n(ofqVar.d, ofqVar.e, ofqVar.f);
            message.obj = null;
        } else if (i != 1 || (cfqVar = ofqVar.b) == null) {
            if (i == 2) {
                if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                    TBSdkLog.i("ssr.SsrHandlerMgr", str, "onReceive: ON_FINISHED.");
                }
                MtopEvent mtopEvent = ofqVar.f25359a;
                if (mtopEvent instanceof SsrFinishEvent) {
                    i7jVar = ((SsrFinishEvent) mtopEvent).statistics;
                    if (i7jVar != null) {
                        cVar = i7jVar.i();
                    } else {
                        cVar = null;
                    }
                } else {
                    i7jVar = null;
                    cVar = null;
                }
                if (cVar != null) {
                    j = i7jVar.d();
                    mfq.j(i7jVar);
                } else {
                    j = 0;
                }
                ofqVar.b.l(ofqVar.c);
                if (cVar != null) {
                    cVar.c = i7jVar.d() - j;
                    mfq.i(i7jVar);
                }
                if (i7jVar != null) {
                    i7jVar.c(true);
                    i7jVar.b();
                }
            }
            message.obj = null;
        } else {
            cfqVar.m(ofqVar.d, ofqVar.g);
            message.obj = null;
        }
    }
}
