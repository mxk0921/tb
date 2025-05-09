package mtopsdk.mtop.intf;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.common.log.LogAdapter;
import mtopsdk.common.util.StringUtils;
import mtopsdk.common.util.SwitchConfigUtil;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.antiattack.AntiAttackHandler;
import mtopsdk.mtop.common.MtopRequestStListener;
import mtopsdk.mtop.common.MtopStatsListener;
import mtopsdk.mtop.domain.EnvModeEnum;
import mtopsdk.mtop.features.MtopFeatureManager;
import mtopsdk.mtop.global.MtopConfig;
import mtopsdk.mtop.global.SwitchConfig;
import mtopsdk.mtop.intf.Mtop;
import mtopsdk.mtop.stat.IUploadStats;
import mtopsdk.mtop.util.MtopSDKThreadPoolExecutorFactory;
import tb.kqd;
import tb.nr2;
import tb.t2o;
import tb.u4j;
import tb.zu2;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class MtopSetting {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "mtopsdk.MtopSetting";
    public static final Map<String, MtopConfig> mtopConfigMap = new HashMap();
    public static volatile IWVRequestInterceptor sWVRequestInterceptor;

    static {
        t2o.a(589299960);
    }

    private MtopSetting() {
    }

    public static void addMtopStatisListener(String str, MtopStatsListener mtopStatsListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f783b904", new Object[]{str, mtopStatsListener});
            return;
        }
        MtopConfig mtopConfigByID = getMtopConfigByID(str);
        mtopConfigByID.mtopStatsListener = mtopStatsListener;
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            TBSdkLog.i(TAG, mtopConfigByID.instanceId + " [addMtopStatisListener] set MtopStatsListener succeed.");
        }
    }

    public static MtopConfig getMtopConfigByID(String str) {
        MtopConfig mtopConfig;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopConfig) ipChange.ipc$dispatch("660e70b6", new Object[]{str});
        }
        if (!StringUtils.isNotBlank(str)) {
            str = Mtop.Id.INNER;
        }
        Map<String, Mtop> map = Mtop.instanceMap;
        Mtop mtop = map.get(str);
        if (mtop == null) {
            synchronized (Mtop.class) {
                try {
                    mtop = map.get(str);
                    if (mtop == null) {
                        Map<String, MtopConfig> map2 = mtopConfigMap;
                        MtopConfig mtopConfig2 = map2.get(str);
                        if (mtopConfig2 == null) {
                            synchronized (MtopSetting.class) {
                                mtopConfig = map2.get(str);
                                if (mtopConfig == null) {
                                    mtopConfig = new MtopConfig(str);
                                    map2.put(str, mtopConfig);
                                }
                            }
                            mtopConfig2 = mtopConfig;
                        }
                        return mtopConfig2;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return mtop.getMtopConfig();
    }

    public static void registerWVRequestInterceptor(IWVRequestInterceptor iWVRequestInterceptor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5140f532", new Object[]{iWVRequestInterceptor});
        } else {
            sWVRequestInterceptor = iWVRequestInterceptor;
        }
    }

    public static void setAntiAttackHandler(String str, AntiAttackHandler antiAttackHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40c65d2d", new Object[]{str, antiAttackHandler});
            return;
        }
        MtopConfig mtopConfigByID = getMtopConfigByID(str);
        mtopConfigByID.antiAttackHandler = antiAttackHandler;
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            TBSdkLog.i(TAG, mtopConfigByID.instanceId + " [setAntiAttackHandler] set antiAttackHandler succeed.");
        }
    }

    public static void setAppKey(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f58e859b", new Object[]{str, str2});
            return;
        }
        MtopConfig mtopConfigByID = getMtopConfigByID(str);
        mtopConfigByID.appKey = str2;
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            TBSdkLog.i(TAG, mtopConfigByID.instanceId + " [setAppKey] appKey=" + str2);
        }
    }

    public static void setAppKeyIndex(String str, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a8ae9e3", new Object[]{str, new Integer(i), new Integer(i2)});
            return;
        }
        MtopConfig mtopConfigByID = getMtopConfigByID(str);
        mtopConfigByID.onlineAppKeyIndex = i;
        mtopConfigByID.dailyAppkeyIndex = i2;
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            TBSdkLog.i(TAG, mtopConfigByID.instanceId + " [setAppKeyIndex] onlineAppKeyIndex=" + i + ",dailyAppkeyIndex=" + i2);
        }
    }

    public static void setAppVersion(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcd95e94", new Object[]{str, str2});
            return;
        }
        MtopConfig mtopConfigByID = getMtopConfigByID(str);
        mtopConfigByID.appVersion = str2;
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            TBSdkLog.i(TAG, mtopConfigByID.instanceId + " [setAppVersion] appVersion=" + str2);
        }
    }

    public static void setAuthCode(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d080952", new Object[]{str, str2});
            return;
        }
        MtopConfig mtopConfigByID = getMtopConfigByID(str);
        mtopConfigByID.authCode = str2;
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            TBSdkLog.i(TAG, mtopConfigByID.instanceId + " [setAuthCode] authCode=" + str2);
        }
    }

    @Deprecated
    public static void setCacheImpl(nr2 nr2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2f24a24", new Object[]{nr2Var});
        } else {
            setCacheImpl(null, nr2Var);
        }
    }

    public static void setCallFactoryImpl(String str, zu2.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11ae7bc8", new Object[]{str, aVar});
        } else if (aVar != null) {
            MtopConfig mtopConfigByID = getMtopConfigByID(str);
            mtopConfigByID.callFactory = aVar;
            if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                TBSdkLog.i(TAG, mtopConfigByID.instanceId + "[setCallFactoryImpl] set CallFactoryImpl succeed.callFactory=" + aVar);
            }
        }
    }

    public static void setISignImpl(String str, kqd kqdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b141430", new Object[]{str, kqdVar});
            return;
        }
        MtopConfig mtopConfigByID = getMtopConfigByID(str);
        mtopConfigByID.sign = kqdVar;
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            TBSdkLog.i(TAG, mtopConfigByID.instanceId + "[setISignImpl] set ISign succeed.signImpl=" + kqdVar);
        }
    }

    public static void setLogAdapterImpl(LogAdapter logAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58993c30", new Object[]{logAdapter});
        } else if (logAdapter != null) {
            MtopConfig.logAdapterImpl = logAdapter;
            if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                TBSdkLog.i(TAG, "[setLogAdapterImpl] set logAdapter succeed.logAdapterImpl=" + logAdapter);
            }
        }
    }

    public static void setMtopConfigListener(final u4j u4jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28cc4d52", new Object[]{u4jVar});
            return;
        }
        SwitchConfig.getInstance().setMtopConfigListener(u4jVar);
        SwitchConfigUtil.setMtopConfigListener(u4jVar);
        TBSdkLog.i(TAG, "[setMtopConfigListener] set MtopConfigListener succeed.");
        MtopSDKThreadPoolExecutorFactory.submit(new Runnable() { // from class: mtopsdk.mtop.intf.MtopSetting.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                Context context;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (u4j.this != null && (context = MtopSetting.getMtopConfigByID(null).context) != null) {
                    u4j.this.a(context);
                }
            }
        });
    }

    public static void setMtopDomain(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5f35f5d", new Object[]{str, str2, str3, str4});
            return;
        }
        MtopConfig mtopConfigByID = getMtopConfigByID(str);
        if (StringUtils.isNotBlank(str2)) {
            mtopConfigByID.mtopDomain.updateDomain(EnvModeEnum.ONLINE, str2);
        }
        if (StringUtils.isNotBlank(str3)) {
            mtopConfigByID.mtopDomain.updateDomain(EnvModeEnum.PREPARE, str3);
        }
        if (StringUtils.isNotBlank(str4)) {
            mtopConfigByID.mtopDomain.updateDomain(EnvModeEnum.TEST, str4);
        }
    }

    @Deprecated
    public static void setMtopFeatureFlag(MtopFeatureManager.MtopFeatureEnum mtopFeatureEnum, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96aeeb98", new Object[]{mtopFeatureEnum, new Boolean(z)});
        } else {
            setMtopFeatureFlag(null, MtopFeatureManager.getMtopFeatureByFeatureEnum(mtopFeatureEnum), z);
        }
    }

    public static void setMtopRequestStListener(String str, MtopRequestStListener mtopRequestStListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f915d4", new Object[]{str, mtopRequestStListener});
            return;
        }
        MtopConfig mtopConfigByID = getMtopConfigByID(str);
        mtopConfigByID.requestStListener = mtopRequestStListener;
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            TBSdkLog.i(TAG, mtopConfigByID.instanceId + " [setMtopRequestStListener] set request security track listener succeed");
        }
    }

    public static void setPlaceId(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b07c7db", new Object[]{str, str2});
        } else if (!StringUtils.isEmpty(str2)) {
            MtopConfig mtopConfigByID = getMtopConfigByID(str);
            mtopConfigByID.placeId = str2;
            if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                TBSdkLog.i(TAG, mtopConfigByID.instanceId + "[setPlaceId] set placeId succeed.placeId=" + str2);
            }
        }
    }

    public static void setRouterId(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a7e14e1", new Object[]{str, str2});
        } else if (!StringUtils.isEmpty(str2)) {
            MtopConfig mtopConfigByID = getMtopConfigByID(str);
            mtopConfigByID.routerId = str2;
            if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                TBSdkLog.i(TAG, mtopConfigByID.instanceId + "[setRouterId] set routerId succeed.routerId=" + str2);
            }
        }
    }

    @Deprecated
    public static void setSecurityAppKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("289de771", new Object[]{str});
        }
    }

    public static void setUploadStats(String str, IUploadStats iUploadStats) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67e83836", new Object[]{str, iUploadStats});
            return;
        }
        MtopConfig mtopConfigByID = getMtopConfigByID(str);
        mtopConfigByID.uploadStats = iUploadStats;
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            TBSdkLog.i(TAG, mtopConfigByID.instanceId + "[setUploadStats] set IUploadStats succeed.uploadStats=" + iUploadStats);
        }
    }

    public static void setWuaAuthCode(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dc9871", new Object[]{str, str2});
            return;
        }
        MtopConfig mtopConfigByID = getMtopConfigByID(str);
        mtopConfigByID.wuaAuthCode = str2;
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            TBSdkLog.i(TAG, mtopConfigByID.instanceId + " [setWuaAuthCode] wuaAuthCode=" + str2);
        }
    }

    @Deprecated
    public static void setXOrangeQ(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6437519e", new Object[]{str});
        } else {
            setXOrangeQ(null, str);
        }
    }

    public static void setCacheImpl(String str, nr2 nr2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4808b2ae", new Object[]{str, nr2Var});
        } else if (nr2Var != null) {
            MtopConfig mtopConfigByID = getMtopConfigByID(str);
            mtopConfigByID.cacheImpl = nr2Var;
            if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                TBSdkLog.i(TAG, mtopConfigByID.instanceId + " [setCacheImpl] set CacheImpl succeed.cacheImpl=" + nr2Var);
            }
        }
    }

    public static void setXOrangeQ(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf528fe8", new Object[]{str, str2});
        } else if (StringUtils.isNotBlank(str2)) {
            MtopConfig mtopConfigByID = getMtopConfigByID(str);
            mtopConfigByID.xOrangeQ = str2;
            if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                TBSdkLog.i(TAG, mtopConfigByID.instanceId + " [setXOrangeQ] set xOrangeQ succeed.xOrangeQ=" + str2);
            }
        }
    }

    public static void setMtopFeatureFlag(String str, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77bcce5a", new Object[]{str, new Integer(i), new Boolean(z)});
        } else if (i >= 1) {
            MtopConfig mtopConfigByID = getMtopConfigByID(str);
            if (z) {
                mtopConfigByID.mtopFeatures.add(Integer.valueOf(i));
            } else {
                mtopConfigByID.mtopFeatures.remove(Integer.valueOf(i));
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005f, code lost:
        if (r7.equals(mtopsdk.mtop.intf.MtopParamType.HEADER) == false) goto L_0x0057;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void removeParam(java.lang.String r6, java.lang.String r7, java.lang.String r8) {
        /*
            r0 = 2
            r1 = 1
            r2 = 0
            com.android.alibaba.ip.runtime.IpChange r3 = mtopsdk.mtop.intf.MtopSetting.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x0018
            java.lang.String r4 = "6faf984e"
            r5 = 3
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r2] = r6
            r5[r1] = r7
            r5[r0] = r8
            r3.ipc$dispatch(r4, r5)
            return
        L_0x0018:
            if (r7 == 0) goto L_0x008c
            if (r8 == 0) goto L_0x008c
            mtopsdk.mtop.global.MtopConfig r6 = getMtopConfigByID(r6)
            mtopsdk.common.util.TBSdkLog$LogEnable r3 = mtopsdk.common.util.TBSdkLog.LogEnable.InfoEnable
            boolean r3 = mtopsdk.common.util.TBSdkLog.isLogEnable(r3)
            if (r3 == 0) goto L_0x004c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r6.instanceId
            r3.append(r4)
            java.lang.String r4 = "[removeParam] remove Param succeed.mtopParamType="
            r3.append(r4)
            r3.append(r7)
            java.lang.String r4 = ",key="
            r3.append(r4)
            r3.append(r8)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "mtopsdk.MtopSetting"
            mtopsdk.common.util.TBSdkLog.i(r4, r3)
        L_0x004c:
            r7.hashCode()
            r3 = -1
            int r4 = r7.hashCode()
            switch(r4) {
                case 77406376: goto L_0x006d;
                case 1924418611: goto L_0x0062;
                case 2127025805: goto L_0x0059;
                default: goto L_0x0057;
            }
        L_0x0057:
            r0 = -1
            goto L_0x0077
        L_0x0059:
            java.lang.String r1 = "HEADER"
            boolean r7 = r7.equals(r1)
            if (r7 != 0) goto L_0x0077
            goto L_0x0057
        L_0x0062:
            java.lang.String r0 = "ABTEST"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x006b
            goto L_0x0057
        L_0x006b:
            r0 = 1
            goto L_0x0077
        L_0x006d:
            java.lang.String r0 = "QUERY"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x0076
            goto L_0x0057
        L_0x0076:
            r0 = 0
        L_0x0077:
            switch(r0) {
                case 0: goto L_0x0087;
                case 1: goto L_0x0081;
                case 2: goto L_0x007b;
                default: goto L_0x007a;
            }
        L_0x007a:
            goto L_0x008c
        L_0x007b:
            java.util.Map<java.lang.String, java.lang.String> r6 = r6.mtopGlobalHeaders
            r6.remove(r8)
            goto L_0x008c
        L_0x0081:
            java.util.Map<java.lang.String, java.lang.String> r6 = r6.mtopGlobalABTestParams
            r6.remove(r8)
            goto L_0x008c
        L_0x0087:
            java.util.Map<java.lang.String, java.lang.String> r6 = r6.mtopGlobalQuerys
            r6.remove(r8)
        L_0x008c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mtopsdk.mtop.intf.MtopSetting.removeParam(java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0062, code lost:
        if (r6.equals(mtopsdk.mtop.intf.MtopEnablePropertyType.ENABLE_NEW_DEVICE_ID) == false) goto L_0x005a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void setEnableProperty(java.lang.String r5, java.lang.String r6, boolean r7) {
        /*
            r0 = 2
            r1 = 1
            r2 = 0
            com.android.alibaba.ip.runtime.IpChange r3 = mtopsdk.mtop.intf.MtopSetting.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x001d
            java.lang.Boolean r4 = new java.lang.Boolean
            r4.<init>(r7)
            r7 = 3
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r7[r2] = r5
            r7[r1] = r6
            r7[r0] = r4
            java.lang.String r5 = "4bebbbdf"
            r3.ipc$dispatch(r5, r7)
            return
        L_0x001d:
            if (r6 == 0) goto L_0x0086
            mtopsdk.mtop.global.MtopConfig r5 = getMtopConfigByID(r5)
            mtopsdk.common.util.TBSdkLog$LogEnable r3 = mtopsdk.common.util.TBSdkLog.LogEnable.InfoEnable
            boolean r3 = mtopsdk.common.util.TBSdkLog.isLogEnable(r3)
            if (r3 == 0) goto L_0x004f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r5.instanceId
            r3.append(r4)
            java.lang.String r4 = "[setEnableProperty] set enableProperty succeed.property="
            r3.append(r4)
            r3.append(r6)
            java.lang.String r4 = ",enable="
            r3.append(r4)
            r3.append(r7)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "mtopsdk.MtopSetting"
            mtopsdk.common.util.TBSdkLog.i(r4, r3)
        L_0x004f:
            r6.hashCode()
            r3 = -1
            int r4 = r6.hashCode()
            switch(r4) {
                case -514993282: goto L_0x0070;
                case -309052356: goto L_0x0065;
                case 1971193321: goto L_0x005c;
                default: goto L_0x005a;
            }
        L_0x005a:
            r0 = -1
            goto L_0x007a
        L_0x005c:
            java.lang.String r1 = "ENABLE_NEW_DEVICE_ID"
            boolean r6 = r6.equals(r1)
            if (r6 != 0) goto L_0x007a
            goto L_0x005a
        L_0x0065:
            java.lang.String r0 = "ENABLE_HEADER_URL_ENCODE"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x006e
            goto L_0x005a
        L_0x006e:
            r0 = 1
            goto L_0x007a
        L_0x0070:
            java.lang.String r0 = "ENABLE_NOTIFY_SESSION_RET"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0079
            goto L_0x005a
        L_0x0079:
            r0 = 0
        L_0x007a:
            switch(r0) {
                case 0: goto L_0x0084;
                case 1: goto L_0x0081;
                case 2: goto L_0x007e;
                default: goto L_0x007d;
            }
        L_0x007d:
            goto L_0x0086
        L_0x007e:
            r5.enableNewDeviceId = r7
            goto L_0x0086
        L_0x0081:
            r5.enableHeaderUrlEncode = r7
            goto L_0x0086
        L_0x0084:
            r5.notifySessionResult = r7
        L_0x0086:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mtopsdk.mtop.intf.MtopSetting.setEnableProperty(java.lang.String, java.lang.String, boolean):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006c, code lost:
        if (r7.equals(mtopsdk.mtop.intf.MtopParamType.HEADER) == false) goto L_0x0064;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void setParam(java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9) {
        /*
            r0 = 2
            r1 = 1
            r2 = 0
            com.android.alibaba.ip.runtime.IpChange r3 = mtopsdk.mtop.intf.MtopSetting.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x001b
            java.lang.String r4 = "95622e7a"
            r5 = 4
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r2] = r6
            r5[r1] = r7
            r5[r0] = r8
            r6 = 3
            r5[r6] = r9
            r3.ipc$dispatch(r4, r5)
            return
        L_0x001b:
            if (r7 == 0) goto L_0x0099
            if (r8 == 0) goto L_0x0099
            if (r9 == 0) goto L_0x0099
            mtopsdk.mtop.global.MtopConfig r6 = getMtopConfigByID(r6)
            mtopsdk.common.util.TBSdkLog$LogEnable r3 = mtopsdk.common.util.TBSdkLog.LogEnable.InfoEnable
            boolean r3 = mtopsdk.common.util.TBSdkLog.isLogEnable(r3)
            if (r3 == 0) goto L_0x0059
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r6.instanceId
            r3.append(r4)
            java.lang.String r4 = "[setParam] set Param succeed.mtopParamType="
            r3.append(r4)
            r3.append(r7)
            java.lang.String r4 = ",key="
            r3.append(r4)
            r3.append(r8)
            java.lang.String r4 = ",value="
            r3.append(r4)
            r3.append(r9)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "mtopsdk.MtopSetting"
            mtopsdk.common.util.TBSdkLog.i(r4, r3)
        L_0x0059:
            r7.hashCode()
            r3 = -1
            int r4 = r7.hashCode()
            switch(r4) {
                case 77406376: goto L_0x007a;
                case 1924418611: goto L_0x006f;
                case 2127025805: goto L_0x0066;
                default: goto L_0x0064;
            }
        L_0x0064:
            r0 = -1
            goto L_0x0084
        L_0x0066:
            java.lang.String r1 = "HEADER"
            boolean r7 = r7.equals(r1)
            if (r7 != 0) goto L_0x0084
            goto L_0x0064
        L_0x006f:
            java.lang.String r0 = "ABTEST"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x0078
            goto L_0x0064
        L_0x0078:
            r0 = 1
            goto L_0x0084
        L_0x007a:
            java.lang.String r0 = "QUERY"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x0083
            goto L_0x0064
        L_0x0083:
            r0 = 0
        L_0x0084:
            switch(r0) {
                case 0: goto L_0x0094;
                case 1: goto L_0x008e;
                case 2: goto L_0x0088;
                default: goto L_0x0087;
            }
        L_0x0087:
            goto L_0x0099
        L_0x0088:
            java.util.Map<java.lang.String, java.lang.String> r6 = r6.mtopGlobalHeaders
            r6.put(r8, r9)
            goto L_0x0099
        L_0x008e:
            java.util.Map<java.lang.String, java.lang.String> r6 = r6.mtopGlobalABTestParams
            r6.put(r8, r9)
            goto L_0x0099
        L_0x0094:
            java.util.Map<java.lang.String, java.lang.String> r6 = r6.mtopGlobalQuerys
            r6.put(r8, r9)
        L_0x0099:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mtopsdk.mtop.intf.MtopSetting.setParam(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    @Deprecated
    public static void setAppVersion(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cefab34a", new Object[]{str});
        } else {
            setAppVersion(null, str);
        }
    }

    @Deprecated
    public static void setAuthCode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b493188", new Object[]{str});
        } else {
            setAuthCode(null, str);
        }
    }

    @Deprecated
    public static void setAppKeyIndex(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17b256d9", new Object[]{new Integer(i), new Integer(i2)});
        } else {
            setAppKeyIndex(null, i, i2);
        }
    }

    @Deprecated
    public static void setMtopDomain(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ac98453", new Object[]{str, str2, str3});
        } else {
            setMtopDomain(null, str, str2, str3);
        }
    }
}
