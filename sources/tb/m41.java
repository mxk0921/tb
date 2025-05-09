package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.alicom.model.network.PreholdingPhoneNumberData;
import java.net.URLDecoder;
import java.text.DecimalFormat;
import java.util.List;
import java.util.Map;
import mtopsdk.common.util.HeaderHandlerUtil;
import mtopsdk.common.util.HttpHeaderConstant;
import mtopsdk.common.util.StringUtils;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.common.MtopNetworkProp;
import mtopsdk.mtop.domain.EnvModeEnum;
import mtopsdk.mtop.global.MtopConfig;
import mtopsdk.mtop.global.SwitchConfig;
import mtopsdk.mtop.intf.Mtop;
import mtopsdk.mtop.intf.MtopUnitStrategy;
import mtopsdk.mtop.util.MtopSDKThreadPoolExecutorFactory;
import mtopsdk.mtop.util.MtopStatistics;
import mtopsdk.mtop.xcommand.XcmdEventMgr;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class m41 implements yib, reb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ MtopConfig f23764a;
        public final /* synthetic */ long b;
        public final /* synthetic */ w4j c;

        public a(MtopConfig mtopConfig, long j, w4j w4jVar) {
            this.f23764a = mtopConfig;
            this.b = j;
            this.c = w4jVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:45:0x00a6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() {
            /*
                Method dump skipped, instructions count: 275
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: tb.m41.a.run():void");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static /* synthetic */ class b {
        public static final /* synthetic */ int[] $SwitchMap$mtopsdk$mtop$domain$EnvModeEnum;

        static {
            int[] iArr = new int[EnvModeEnum.values().length];
            $SwitchMap$mtopsdk$mtop$domain$EnvModeEnum = iArr;
            try {
                iArr[EnvModeEnum.ONLINE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$mtopsdk$mtop$domain$EnvModeEnum[EnvModeEnum.PREPARE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$mtopsdk$mtop$domain$EnvModeEnum[EnvModeEnum.TEST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$mtopsdk$mtop$domain$EnvModeEnum[EnvModeEnum.TEST_SANDBOX.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        t2o.a(589299826);
        t2o.a(589299813);
        t2o.a(589299812);
    }

    @Override // tb.yib
    public String a(w4j w4jVar) {
        EnvModeEnum envModeEnum;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8127648a", new Object[]{this, w4jVar});
        }
        Mtop mtop = w4jVar.f30449a;
        MtopStatistics mtopStatistics = w4jVar.g;
        MtopNetworkProp mtopNetworkProp = w4jVar.d;
        try {
            if (!StringUtils.isNotBlank(mtopStatistics.falcoId) || !SwitchConfig.getInstance().getEnableFullTraceId()) {
                StringBuilder sb = new StringBuilder(64);
                sb.append(mtop.getMtopConfig().utdid);
                sb.append(System.currentTimeMillis());
                sb.append(new DecimalFormat(PreholdingPhoneNumberData.PRE_SUCCESS).format(mtopStatistics.intSeqNo % 10000));
                sb.append("1");
                sb.append(mtop.getMtopConfig().processId);
                String sb2 = sb.toString();
                mtopNetworkProp.clientTraceId = sb2;
                mtopStatistics.clientTraceId = sb2;
            } else {
                String str = mtopStatistics.falcoId;
                mtopNetworkProp.clientTraceId = str;
                mtopStatistics.clientTraceId = str;
            }
        } catch (Exception e) {
            TBSdkLog.e("mtopsdk.AppConfigDuplexFilter", w4jVar.h, "generate client-trace-id failed.", e);
        }
        mtopNetworkProp.falcoId = mtopStatistics.falcoId;
        try {
            if (n41.e().f(w4jVar.b.getKey()) && (envModeEnum = mtop.getMtopConfig().envMode) != null) {
                int i = b.$SwitchMap$mtopsdk$mtop$domain$EnvModeEnum[envModeEnum.ordinal()];
                if (i == 1) {
                    mtopNetworkProp.customOnlineDomain = MtopUnitStrategy.TRADE_ONLINE_DOMAIN;
                } else if (i == 2) {
                    mtopNetworkProp.customPreDomain = MtopUnitStrategy.TRADE_PRE_DOMAIN;
                } else if (i == 3 || i == 4) {
                    mtopNetworkProp.customDailyDomain = MtopUnitStrategy.TRADE_DAILY_DOMAIN;
                }
            }
            return "CONTINUE";
        } catch (Exception e2) {
            TBSdkLog.e("mtopsdk.AppConfigDuplexFilter", w4jVar.h, "setCustomDomain for trade unit api error", e2);
            return "CONTINUE";
        }
    }

    @Override // tb.reb
    public String c(w4j w4jVar) {
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b9fc1c03", new Object[]{this, w4jVar});
        }
        Map<String, List<String>> headerFields = w4jVar.c.getHeaderFields();
        MtopConfig mtopConfig = w4jVar.f30449a.getMtopConfig();
        String singleHeaderFieldByKey = HeaderHandlerUtil.getSingleHeaderFieldByKey(headerFields, HttpHeaderConstant.X_COMMAND_ORANGE);
        if (StringUtils.isNotBlank(singleHeaderFieldByKey) && StringUtils.isNotBlank(singleHeaderFieldByKey)) {
            try {
                XcmdEventMgr.getInstance().onOrangeEvent(URLDecoder.decode(singleHeaderFieldByKey, "utf-8"));
            } catch (Exception e) {
                String str = w4jVar.h;
                TBSdkLog.w("mtopsdk.AppConfigDuplexFilter", str, "parse XCommand header field x-orange-p error,xcmdOrange=" + singleHeaderFieldByKey, e);
            }
        }
        String singleHeaderFieldByKey2 = HeaderHandlerUtil.getSingleHeaderFieldByKey(headerFields, HttpHeaderConstant.X_APP_CONF_V);
        if (StringUtils.isBlank(singleHeaderFieldByKey2)) {
            return "CONTINUE";
        }
        try {
            j = Long.parseLong(singleHeaderFieldByKey2);
        } catch (NumberFormatException e2) {
            String str2 = w4jVar.h;
            TBSdkLog.e("mtopsdk.AppConfigDuplexFilter", str2, "parse remoteAppConfigVersion error.appConfigVersion=" + singleHeaderFieldByKey2, e2);
            j = 0;
        }
        if (j > mtopConfig.xAppConfigVersion) {
            e(j, w4jVar);
        }
        return "CONTINUE";
    }

    public final void e(long j, w4j w4jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d16c426", new Object[]{this, new Long(j), w4jVar});
        } else {
            MtopSDKThreadPoolExecutorFactory.submit(new a(w4jVar.f30449a.getMtopConfig(), j, w4jVar));
        }
    }

    @Override // tb.fwc
    public String getName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return "mtopsdk.AppConfigDuplexFilter";
    }
}
