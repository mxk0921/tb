package mtopsdk.mtop.global;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.codetrack.sdk.assets.AssetsDelegate;
import java.io.InputStream;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import mtopsdk.common.log.LogAdapter;
import mtopsdk.common.util.StringUtils;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.antiattack.AntiAttackHandler;
import mtopsdk.mtop.common.MtopRequestStListener;
import mtopsdk.mtop.common.MtopStatsListener;
import mtopsdk.mtop.domain.EntranceEnum;
import mtopsdk.mtop.domain.EnvModeEnum;
import mtopsdk.mtop.intf.Mtop;
import mtopsdk.mtop.intf.MtopUnitStrategy;
import mtopsdk.mtop.network.NetworkPropertyService;
import mtopsdk.mtop.stat.IUploadStats;
import tb.a7c;
import tb.hi9;
import tb.kqd;
import tb.nr2;
import tb.t2o;
import tb.zu2;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class MtopConfig {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "mtopsdk.MtopConfig";
    public static LogAdapter logAdapterImpl;
    public AntiAttackHandler antiAttackHandler;
    public String appKey;
    public int appKeyIndex;
    public String appVersion;
    public String authCode;
    public nr2 cacheImpl;
    public Context context;
    public String deviceId;
    public final String instanceId;
    public Mtop mtopInstance;
    public MtopStatsListener mtopStatsListener;
    public volatile NetworkPropertyService networkPropertyService;
    public String placeId;
    public int processId;
    public MtopRequestStListener requestStListener;
    public String routerId;
    public volatile kqd sign;
    public String ttid;
    public IUploadStats uploadStats;
    public String utdid;
    public String wuaAuthCode;
    public volatile long xAppConfigVersion;
    public String xOrangeQ;
    public EnvModeEnum envMode = EnvModeEnum.ONLINE;
    public EntranceEnum entrance = EntranceEnum.GW_INNER;
    public int onlineAppKeyIndex = 0;
    public int dailyAppkeyIndex = 0;
    public final byte[] lock = new byte[0];
    public AtomicBoolean isAllowSwitchEnv = new AtomicBoolean(true);
    public volatile boolean notifySessionResult = false;
    public volatile boolean enableNewDeviceId = true;
    public volatile boolean enableHeaderUrlEncode = false;
    public final Set<Integer> mtopFeatures = new CopyOnWriteArraySet();
    public final Map<String, String> mtopProperties = new ConcurrentHashMap();
    public final Map<String, String> mtopGlobalHeaders = new ConcurrentHashMap();
    public final Map<String, String> mtopGlobalQuerys = new ConcurrentHashMap();
    public final Map<String, String> mtopGlobalABTestParams = new ConcurrentHashMap();
    public AtomicBoolean loadPropertyFlag = new AtomicBoolean(false);
    public zu2.a callFactory = null;
    public hi9 filterManager = null;
    public a7c mFilterManager = null;
    public final MtopDomain mtopDomain = new MtopDomain();

    /* compiled from: Taobao */
    /* renamed from: mtopsdk.mtop.global.MtopConfig$1  reason: invalid class name */
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

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class MtopDomain {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final int FOR_DAILY = 2;
        public static final int FOR_DAILY_2ND = 3;
        public static final int FOR_ONLINE = 0;
        public static final int FOR_PREPARED = 1;
        public final String[] defaultDomains;

        static {
            t2o.a(589299922);
        }

        public MtopDomain() {
            this.defaultDomains = r0;
            String[] strArr = {MtopUnitStrategy.CENTER_ONLINE_DOMAIN, MtopUnitStrategy.CENTER_PRE_DOMAIN, MtopUnitStrategy.CENTER_DAILY_DOMAIN, "api.waptest2nd.taobao.com"};
        }

        public String getDomain(EnvModeEnum envModeEnum) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("30b75670", new Object[]{this, envModeEnum});
            }
            int i = AnonymousClass1.$SwitchMap$mtopsdk$mtop$domain$EnvModeEnum[envModeEnum.ordinal()];
            if (i == 1) {
                return this.defaultDomains[0];
            }
            if (i == 2) {
                return this.defaultDomains[1];
            }
            if (i == 3) {
                return this.defaultDomains[2];
            }
            if (i != 4) {
                return this.defaultDomains[0];
            }
            return this.defaultDomains[3];
        }

        public void updateDomain(EnvModeEnum envModeEnum, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6d721d67", new Object[]{this, envModeEnum, str});
                return;
            }
            int i = AnonymousClass1.$SwitchMap$mtopsdk$mtop$domain$EnvModeEnum[envModeEnum.ordinal()];
            if (i == 1) {
                this.defaultDomains[0] = str;
            } else if (i == 2) {
                this.defaultDomains[1] = str;
            } else if (i == 3) {
                this.defaultDomains[2] = str;
            } else if (i == 4) {
                this.defaultDomains[3] = str;
            }
        }
    }

    static {
        t2o.a(589299920);
    }

    public MtopConfig(String str) {
        this.instanceId = str;
    }

    public void registerMtopSdkProperty(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a46eee3f", new Object[]{this, str, str2});
        } else if (StringUtils.isNotBlank(str) && StringUtils.isNotBlank(str2)) {
            getMtopProperties().put(str, str2);
            if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.DebugEnable)) {
                TBSdkLog.d(TAG, "[registerMtopSdkProperty]register MtopSdk Property succeed,key=" + str + ",value=" + str2);
            }
        }
    }

    public Map<String, String> getMtopProperties() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("cb09864d", new Object[]{this});
        }
        if (this.loadPropertyFlag.compareAndSet(false, true)) {
            try {
                InputStream proxy_open = AssetsDelegate.proxy_open(this.context.getAssets(), "mtopsdk.property");
                Properties properties = new Properties();
                properties.load(proxy_open);
                if (!properties.isEmpty()) {
                    for (Map.Entry entry : properties.entrySet()) {
                        try {
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            if (key == null || value == null) {
                                TBSdkLog.e(TAG, "invalid mtopsdk property,key=" + key + ",value=" + value);
                            } else {
                                this.mtopProperties.put(key.toString(), value.toString());
                            }
                        } catch (Exception e) {
                            TBSdkLog.e(TAG, "load mtopsdk.property in android assets directory error.", e);
                        }
                    }
                }
                if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                    TBSdkLog.i(TAG, " load mtopsdk.property file in android assets directory succeed");
                }
            } catch (Exception unused) {
                TBSdkLog.e(TAG, "load mtopsdk.property in android assets directory failed!");
            }
        }
        return this.mtopProperties;
    }
}
