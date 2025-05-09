package anet.channel.detect;

import anet.channel.statist.RequestStatistic;
import anet.channel.util.ALog;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class NetworkDetector {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "awcn.NetworkDetector";
    private static HorseRaceDetector horseRaceDetector = new HorseRaceDetector();
    private static ExceptionDetector exceptionDetector = new ExceptionDetector();
    private static MTUDetector mtuDetector = new MTUDetector();
    private static AtomicBoolean isInit = new AtomicBoolean(false);
    private static RTTDetector rttDetector = new RTTDetector();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface INetworkDiagnosisCallback {
        void onNetworkDiagnosisFinished(JSONObject jSONObject);
    }

    static {
        t2o.a(607125610);
    }

    public static void commitDetect(RequestStatistic requestStatistic) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22f95087", new Object[]{requestStatistic});
        } else if (isInit.get()) {
            exceptionDetector.commitDetect(requestStatistic);
        }
    }

    public static int getAvailableMTU() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("27ce1195", new Object[0])).intValue();
        }
        int availableMTU = mtuDetector.getAvailableMTU();
        int availableMTU2 = exceptionDetector.getAvailableMTU();
        if (availableMTU > 0 && availableMTU2 > 0) {
            return Math.min(availableMTU, availableMTU2);
        }
        if (availableMTU > 0) {
            return availableMTU;
        }
        return availableMTU2;
    }

    public static IRTTDetector getRTTDetector() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IRTTDetector) ipChange.ipc$dispatch("fe9c3dc0", new Object[0]);
        }
        return rttDetector;
    }

    public static void registerListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8578757e", new Object[0]);
            return;
        }
        try {
            if (isInit.compareAndSet(false, true)) {
                ALog.i(TAG, "registerListener", null, new Object[0]);
                horseRaceDetector.register();
                exceptionDetector.register();
                mtuDetector.register();
                rttDetector.register();
            }
        } catch (Exception e) {
            ALog.e(TAG, "[registerListener]error", null, e, new Object[0]);
        }
    }

    public static void startNetworkDiagnosis(INetworkDiagnosisCallback iNetworkDiagnosisCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d8af661", new Object[]{iNetworkDiagnosisCallback});
        } else {
            exceptionDetector.startNetworkDiagnosis(iNetworkDiagnosisCallback);
        }
    }
}
