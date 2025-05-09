package tb;

import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.MtopBusiness;
import com.taobao.tao.remotebusiness.handler.HandlerParam;
import mtopsdk.mtop.common.MtopEvent;
import mtopsdk.mtop.common.MtopListener;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class osa extends Handler {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ON_CACHED = 4;
    public static final int ON_DATA_RECEIVED = 1;
    public static final int ON_FINISHED = 3;
    public static final int ON_HEADER = 2;
    public static final int ON_STREAM_FINISH = 11;
    public static final int ON_STREAM_RECEIVE_DATA = 10;

    /* renamed from: a  reason: collision with root package name */
    public static volatile Handler f25613a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ HandlerParam f25614a;

        public a(HandlerParam handlerParam) {
            this.f25614a = handlerParam;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            HandlerParam handlerParam = this.f25614a;
            handlerParam.mtopBusiness.doFinish(handlerParam.mtopResponse, handlerParam.pojo);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ HandlerParam f25615a;

        public b(HandlerParam handlerParam) {
            this.f25615a = handlerParam;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            HandlerParam handlerParam = this.f25615a;
            handlerParam.mtopBusiness.doStreamReceiveData(handlerParam.mtopResponse, handlerParam.pojo);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ HandlerParam f25616a;

        public c(HandlerParam handlerParam) {
            this.f25616a = handlerParam;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            HandlerParam handlerParam = this.f25616a;
            handlerParam.mtopBusiness.doStreamFinish(handlerParam.mtopResponse, handlerParam.pojo);
        }
    }

    static {
        t2o.a(589299742);
    }

    public osa(Looper looper) {
        super(looper);
    }

    public static HandlerParam a(MtopListener mtopListener, MtopEvent mtopEvent, MtopBusiness mtopBusiness) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HandlerParam) ipChange.ipc$dispatch("ccd7f87a", new Object[]{mtopListener, mtopEvent, mtopBusiness});
        }
        return new HandlerParam(mtopListener, mtopEvent, mtopBusiness);
    }

    public static Handler b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("cd2acaaa", new Object[0]);
        }
        if (f25613a == null) {
            synchronized (osa.class) {
                try {
                    if (f25613a == null) {
                        f25613a = new osa(Looper.getMainLooper());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f25613a;
    }

    public static /* synthetic */ Object ipc$super(osa osaVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/remotebusiness/handler/HandlerMgr");
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02c6  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:99:0x01fb -> B:150:0x005f). Please submit an issue!!! */
    @Override // android.os.Handler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void handleMessage(android.os.Message r21) {
        /*
            Method dump skipped, instructions count: 799
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.osa.handleMessage(android.os.Message):void");
    }
}
