package mtopsdk.mtop.protocol.converter.impl;

import anet.channel.strategy.dispatch.DispatchConstants;
import com.android.alibaba.ip.runtime.IpChange;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.common.util.HttpHeaderConstant;
import mtopsdk.common.util.StringUtils;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.common.MtopNetworkProp;
import mtopsdk.mtop.domain.EnvModeEnum;
import mtopsdk.mtop.global.MtopConfig;
import mtopsdk.mtop.global.SwitchConfig;
import mtopsdk.mtop.intf.Mtop;
import mtopsdk.mtop.protocol.converter.INetworkConverter;
import tb.t2o;
import tb.w4j;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public abstract class AbstractNetworkConverter implements INetworkConverter {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int DEFAULT_CONN_TIMEOUT = 10000;
    private static final int DEFAULT_SOCKET_TIMEOUT = 15000;
    private static final String TAG = "mtopsdk.AbstractNetworkConverter";

    /* compiled from: Taobao */
    /* renamed from: mtopsdk.mtop.protocol.converter.impl.AbstractNetworkConverter$1  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
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
        t2o.a(589299979);
        t2o.a(589299978);
    }

    public void addMtopSdkProperty(Mtop mtop, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79ff793f", new Object[]{this, mtop, map});
        } else if (SwitchConfig.getInstance().isMtopsdkPropertySwitchOpen()) {
            for (Map.Entry<String, String> entry : mtop.getMtopConfig().getMtopProperties().entrySet()) {
                try {
                    String key = entry.getKey();
                    if (StringUtils.isNotBlank(key) && key.startsWith(HttpHeaderConstant.MTOPSDK_PROPERTY_PREFIX)) {
                        map.put(key.substring(8), entry.getValue());
                    }
                } catch (Exception unused) {
                    TBSdkLog.e(TAG, "[addMtopSdkProperty]get mtopsdk properties error,key=" + entry.getKey() + ",value=" + entry.getValue());
                }
            }
        }
    }

    public String buildBaseUrl(w4j w4jVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2ae6a990", new Object[]{this, w4jVar, str, str2});
        }
        StringBuilder sb = new StringBuilder(64);
        try {
            MtopConfig mtopConfig = w4jVar.f30449a.getMtopConfig();
            MtopNetworkProp mtopNetworkProp = w4jVar.d;
            mtopNetworkProp.envMode = mtopConfig.envMode;
            sb.append(mtopNetworkProp.protocol.getProtocol());
            String customDomain = getCustomDomain(w4jVar);
            if (StringUtils.isNotBlank(customDomain)) {
                sb.append(customDomain);
            } else {
                sb.append(mtopConfig.mtopDomain.getDomain(w4jVar.d.envMode));
            }
            sb.append("/");
            sb.append(mtopConfig.entrance.getEntrance());
            sb.append("/");
            sb.append(str);
            sb.append("/");
            sb.append(str2);
            sb.append("/");
        } catch (Exception e) {
            TBSdkLog.e(TAG, w4jVar.h, "[buildBaseUrl] build mtop baseUrl error.", e);
        }
        return sb.toString();
    }

    public Map<String, String> buildRequestHeaders(Map<String, String> map, Map<String, String> map2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("fe213a1d", new Object[]{this, map, map2, new Boolean(z)});
        }
        Map<String, String> headerConversionMap = getHeaderConversionMap();
        if (headerConversionMap == null) {
            TBSdkLog.e(TAG, "[buildRequestHeaders]headerConversionMap is null,buildRequestHeaders error.");
            return map2;
        }
        HashMap hashMap = new HashMap(64);
        if (map2 != null) {
            for (Map.Entry<String, String> entry : map2.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (z) {
                    if (value != null) {
                        try {
                            value = URLEncoder.encode(value, "utf-8");
                        } catch (Exception unused) {
                            TBSdkLog.e(TAG, "[buildRequestHeaders]urlEncode " + key + "=" + value + "error");
                        }
                    } else {
                        value = null;
                    }
                }
                hashMap.put(key, value);
            }
        }
        for (Map.Entry<String, String> entry2 : headerConversionMap.entrySet()) {
            String key2 = entry2.getKey();
            String remove = map.remove(entry2.getValue());
            if (remove != null) {
                try {
                    hashMap.put(key2, URLEncoder.encode(remove, "utf-8"));
                } catch (Exception unused2) {
                    TBSdkLog.e(TAG, "[buildRequestHeaders]urlEncode " + key2 + "=" + remove + "error");
                }
            }
        }
        String remove2 = map.remove(DispatchConstants.LONGTITUDE);
        String remove3 = map.remove(DispatchConstants.LATITUDE);
        if (!(remove2 == null || remove3 == null)) {
            StringBuilder sb = new StringBuilder();
            sb.append(remove2);
            sb.append(",");
            sb.append(remove3);
            try {
                hashMap.put(HttpHeaderConstant.X_LOCATION, URLEncoder.encode(sb.toString(), "utf-8"));
            } catch (Exception unused3) {
                TBSdkLog.e(TAG, "[buildRequestHeaders]urlEncode x-location=" + sb.toString() + "error");
            }
        }
        return hashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:136:0x0325 A[Catch: all -> 0x0317, TryCatch #2 {all -> 0x0317, blocks: (B:130:0x0310, B:136:0x0325, B:138:0x032b, B:140:0x032f, B:142:0x033b, B:144:0x033f, B:146:0x0346, B:147:0x0360, B:149:0x036a, B:151:0x0379, B:153:0x037f, B:155:0x038f, B:158:0x039f, B:160:0x03ad, B:162:0x03b3, B:164:0x03b9, B:166:0x03d2, B:168:0x03da, B:171:0x03e9, B:173:0x03f7, B:175:0x03fd, B:177:0x0403, B:178:0x0419), top: B:185:0x0310 }] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0346 A[Catch: all -> 0x0317, TryCatch #2 {all -> 0x0317, blocks: (B:130:0x0310, B:136:0x0325, B:138:0x032b, B:140:0x032f, B:142:0x033b, B:144:0x033f, B:146:0x0346, B:147:0x0360, B:149:0x036a, B:151:0x0379, B:153:0x037f, B:155:0x038f, B:158:0x039f, B:160:0x03ad, B:162:0x03b3, B:164:0x03b9, B:166:0x03d2, B:168:0x03da, B:171:0x03e9, B:173:0x03f7, B:175:0x03fd, B:177:0x0403, B:178:0x0419), top: B:185:0x0310 }] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x036a A[Catch: all -> 0x0317, TryCatch #2 {all -> 0x0317, blocks: (B:130:0x0310, B:136:0x0325, B:138:0x032b, B:140:0x032f, B:142:0x033b, B:144:0x033f, B:146:0x0346, B:147:0x0360, B:149:0x036a, B:151:0x0379, B:153:0x037f, B:155:0x038f, B:158:0x039f, B:160:0x03ad, B:162:0x03b3, B:164:0x03b9, B:166:0x03d2, B:168:0x03da, B:171:0x03e9, B:173:0x03f7, B:175:0x03fd, B:177:0x0403, B:178:0x0419), top: B:185:0x0310 }] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x038f A[Catch: all -> 0x0317, TryCatch #2 {all -> 0x0317, blocks: (B:130:0x0310, B:136:0x0325, B:138:0x032b, B:140:0x032f, B:142:0x033b, B:144:0x033f, B:146:0x0346, B:147:0x0360, B:149:0x036a, B:151:0x0379, B:153:0x037f, B:155:0x038f, B:158:0x039f, B:160:0x03ad, B:162:0x03b3, B:164:0x03b9, B:166:0x03d2, B:168:0x03da, B:171:0x03e9, B:173:0x03f7, B:175:0x03fd, B:177:0x0403, B:178:0x0419), top: B:185:0x0310 }] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x03da A[Catch: all -> 0x0317, TryCatch #2 {all -> 0x0317, blocks: (B:130:0x0310, B:136:0x0325, B:138:0x032b, B:140:0x032f, B:142:0x033b, B:144:0x033f, B:146:0x0346, B:147:0x0360, B:149:0x036a, B:151:0x0379, B:153:0x037f, B:155:0x038f, B:158:0x039f, B:160:0x03ad, B:162:0x03b3, B:164:0x03b9, B:166:0x03d2, B:168:0x03da, B:171:0x03e9, B:173:0x03f7, B:175:0x03fd, B:177:0x0403, B:178:0x0419), top: B:185:0x0310 }] */
    @Override // mtopsdk.mtop.protocol.converter.INetworkConverter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public tb.h3o convert(tb.w4j r28) {
        /*
            Method dump skipped, instructions count: 1066
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: mtopsdk.mtop.protocol.converter.impl.AbstractNetworkConverter.convert(tb.w4j):tb.h3o");
    }

    public abstract Map<String, String> getHeaderConversionMap();

    private String getCustomDomain(w4j w4jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d059f9c9", new Object[]{this, w4jVar});
        }
        MtopNetworkProp mtopNetworkProp = w4jVar.d;
        if (StringUtils.isNotBlank(mtopNetworkProp.customDomain)) {
            return mtopNetworkProp.customDomain;
        }
        int i = AnonymousClass1.$SwitchMap$mtopsdk$mtop$domain$EnvModeEnum[mtopNetworkProp.envMode.ordinal()];
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
}
