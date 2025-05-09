package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.common.util.HeaderHandlerUtil;
import mtopsdk.common.util.HttpHeaderConstant;
import mtopsdk.common.util.StringUtils;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.common.MtopNetworkProp;
import mtopsdk.mtop.domain.EnvModeEnum;
import mtopsdk.mtop.global.SwitchConfig;
import mtopsdk.mtop.intf.MtopUnitStrategy;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class zhv implements yib, reb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, String> f32782a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static /* synthetic */ class a {
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
        }
    }

    static {
        t2o.a(589299837);
        t2o.a(589299813);
        t2o.a(589299812);
    }

    public zhv() {
        HashMap hashMap = new HashMap();
        this.f32782a = hashMap;
        hashMap.put("GUIDE", "UNIT_GUIDE");
        hashMap.put("TRADE", "UNIT_TRADE");
        hashMap.put("CENTER", MtopUnitStrategy.UNIT_CENTER);
    }

    @Override // tb.yib
    public String a(w4j w4jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8127648a", new Object[]{this, w4jVar});
        }
        if (!SwitchConfig.getInstance().isUnitCalibrationEnable() || StringUtils.isNotBlank(e(w4jVar))) {
            return "CONTINUE";
        }
        String key = w4jVar.b.getKey();
        String b = biv.a().b(key);
        if (StringUtils.isNotBlank(b)) {
            String str = w4jVar.h;
            TBSdkLog.e("mtopsdk.UnitCorrectionDuplexFilter", str, "change unit to " + b + ", api=" + key);
            w4jVar.o.setUnitStrategy(b);
            w4jVar.g.unitCalibration = true;
        }
        return "CONTINUE";
    }

    @Override // tb.reb
    public String c(w4j w4jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b9fc1c03", new Object[]{this, w4jVar});
        }
        if (!SwitchConfig.getInstance().isUnitCalibrationEnable()) {
            return "CONTINUE";
        }
        String singleHeaderFieldByKey = HeaderHandlerUtil.getSingleHeaderFieldByKey(w4jVar.c.getHeaderFields(), HttpHeaderConstant.X_UNIT);
        if (StringUtils.isNotBlank(singleHeaderFieldByKey)) {
            String str = (String) ((HashMap) this.f32782a).get(singleHeaderFieldByKey);
            if (!TextUtils.isEmpty(str)) {
                String key = w4jVar.b.getKey();
                String str2 = w4jVar.h;
                TBSdkLog.e("mtopsdk.UnitCorrectionDuplexFilter", str2, "[unit store]api=" + key + ", unit=" + str);
                biv.a().d(key, str);
            }
        }
        return "CONTINUE";
    }

    public final String e(w4j w4jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d059f9c9", new Object[]{this, w4jVar});
        }
        MtopNetworkProp mtopNetworkProp = w4jVar.d;
        if (StringUtils.isNotBlank(mtopNetworkProp.customDomain)) {
            return mtopNetworkProp.customDomain;
        }
        int i = a.$SwitchMap$mtopsdk$mtop$domain$EnvModeEnum[mtopNetworkProp.envMode.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3 && StringUtils.isNotBlank(mtopNetworkProp.customDailyDomain)) {
                    return mtopNetworkProp.customDailyDomain;
                }
                return null;
            } else if (StringUtils.isNotBlank(mtopNetworkProp.customPreDomain)) {
                return mtopNetworkProp.customPreDomain;
            } else {
                return null;
            }
        } else if (StringUtils.isNotBlank(mtopNetworkProp.customOnlineDomain)) {
            return mtopNetworkProp.customOnlineDomain;
        } else {
            return null;
        }
    }

    @Override // tb.fwc
    public String getName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return "mtopsdk.UnitCorrectionDuplexFilter";
    }
}
