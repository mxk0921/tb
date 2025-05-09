package tb;

import anet.channel.strategy.dispatch.DispatchConstants;
import com.android.alibaba.ip.runtime.IpChange;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.common.util.HttpHeaderConstant;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.domain.EnvModeEnum;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public abstract class q30 implements zrd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

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
            try {
                $SwitchMap$mtopsdk$mtop$domain$EnvModeEnum[EnvModeEnum.TEST_SANDBOX.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public Map<String, String> a(Map<String, String> map, Map<String, String> map2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("fe213a1d", new Object[]{this, map, map2, new Boolean(z)});
        }
        Map<String, String> c = c();
        if (c == null) {
            TBSdkLog.e("ssr.AbstractSsrNetworkConverter", "[buildRequestHeaders]headerConversionMap is null,buildRequestHeaders error.");
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
                            TBSdkLog.e("ssr.AbstractSsrNetworkConverter", "[buildRequestHeaders]urlEncode " + key + "=" + value + "error");
                        }
                    } else {
                        value = null;
                    }
                }
                if ("user-agent".equalsIgnoreCase(key)) {
                    key = "user-agent";
                }
                hashMap.put(key, value);
            }
        }
        for (Map.Entry<String, String> entry2 : c.entrySet()) {
            String key2 = entry2.getKey();
            String remove = map.remove(entry2.getValue());
            if (remove != null) {
                try {
                    hashMap.put(key2, URLEncoder.encode(remove, "utf-8"));
                } catch (Exception unused2) {
                    TBSdkLog.e("ssr.AbstractSsrNetworkConverter", "[buildRequestHeaders]urlEncode " + key2 + "=" + remove + "error");
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
                TBSdkLog.e("ssr.AbstractSsrNetworkConverter", "[buildRequestHeaders]urlEncode x-location=" + sb.toString() + "error");
            }
        }
        return hashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00df A[Catch: all -> 0x0065, TryCatch #0 {all -> 0x0065, blocks: (B:7:0x0025, B:9:0x004e, B:17:0x0061, B:20:0x0068, B:21:0x006c, B:22:0x006f, B:25:0x007d, B:27:0x008d, B:30:0x009d, B:34:0x00a5, B:35:0x00ad, B:37:0x00b3, B:40:0x00c7, B:43:0x00ce, B:45:0x00d7, B:47:0x00df, B:49:0x00fa, B:50:0x0101, B:52:0x010d, B:55:0x012d, B:56:0x0130, B:57:0x0134), top: B:60:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x012d A[Catch: all -> 0x0065, TryCatch #0 {all -> 0x0065, blocks: (B:7:0x0025, B:9:0x004e, B:17:0x0061, B:20:0x0068, B:21:0x006c, B:22:0x006f, B:25:0x007d, B:27:0x008d, B:30:0x009d, B:34:0x00a5, B:35:0x00ad, B:37:0x00b3, B:40:0x00c7, B:43:0x00ce, B:45:0x00d7, B:47:0x00df, B:49:0x00fa, B:50:0x0101, B:52:0x010d, B:55:0x012d, B:56:0x0130, B:57:0x0134), top: B:60:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0130 A[Catch: all -> 0x0065, TryCatch #0 {all -> 0x0065, blocks: (B:7:0x0025, B:9:0x004e, B:17:0x0061, B:20:0x0068, B:21:0x006c, B:22:0x006f, B:25:0x007d, B:27:0x008d, B:30:0x009d, B:34:0x00a5, B:35:0x00ad, B:37:0x00b3, B:40:0x00c7, B:43:0x00ce, B:45:0x00d7, B:47:0x00df, B:49:0x00fa, B:50:0x0101, B:52:0x010d, B:55:0x012d, B:56:0x0130, B:57:0x0134), top: B:60:0x0025 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public tb.h3o b(tb.efq r13) {
        /*
            Method dump skipped, instructions count: 327
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.q30.b(tb.efq):tb.h3o");
    }

    public abstract Map<String, String> c();
}
