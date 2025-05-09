package mtopsdk.mtop.deviceid;

import android.content.Context;
import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.device.UTDevice;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import mtopsdk.common.util.ConfigStoreManager;
import mtopsdk.common.util.StringUtils;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.deviceid.domain.MtopSysNewDeviceIdRequest;
import mtopsdk.mtop.deviceid.domain.MtopSysNewDeviceIdResponse;
import mtopsdk.mtop.deviceid.domain.MtopSysNewDeviceIdResponseData;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.IMTOPDataObject;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.global.SwitchConfig;
import mtopsdk.mtop.intf.Mtop;
import mtopsdk.mtop.util.MtopConvert;
import mtopsdk.mtop.util.MtopSDKThreadPoolExecutorFactory;
import tb.inx;
import tb.s1m;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class DeviceIDManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String CREATED_NO = "0";
    private static final String CREATED_YES = "1";
    private static final String DEVICEID_CREATED_KEY = "deviceId_created";
    private static final String DEVICEID_KEY = "deviceId";
    private static final String MTOPSDK_DEVICEID_STORE_PREFIX = "MTOPSDK_DEVICEID_STORE.";
    private static final String TAG = "mtopsdk.DeviceIDManager";
    private static Map<String, DeviceIdDomain> deviceIdMap = new HashMap();
    private static DeviceIDManager instance;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class DeviceIdDomain {
        public boolean mCreated;
        public String mDeviceId;
        public Future<String> mLastFuture;

        static {
            t2o.a(589299898);
        }

        public DeviceIdDomain(Future<String> future) {
            this.mLastFuture = future;
        }
    }

    static {
        t2o.a(589299895);
    }

    public static DeviceIDManager getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DeviceIDManager) ipChange.ipc$dispatch("9b4de17b", new Object[0]);
        }
        if (instance == null) {
            synchronized (DeviceIDManager.class) {
                try {
                    if (instance == null) {
                        instance = new DeviceIDManager();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return instance;
    }

    public void clear(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cb11abe", new Object[]{this, context, str});
            return;
        }
        deviceIdMap.remove(str);
        saveDeviceIdToStore(context, str, "", "0");
    }

    public Future<String> getDeviceID(final Context context, final String str) {
        Future<String> future;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Future) ipChange.ipc$dispatch("415b5bfa", new Object[]{this, context, str});
        }
        if (StringUtils.isBlank(str)) {
            TBSdkLog.e(TAG, "appkey is null,get DeviceId error");
            return null;
        }
        DeviceIdDomain deviceIdDomain = deviceIdMap.get(str);
        if (deviceIdDomain == null || (future = deviceIdDomain.mLastFuture) == null || future.isDone()) {
            final FutureTask futureTask = new FutureTask(new Callable<String>() { // from class: mtopsdk.mtop.deviceid.DeviceIDManager.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.util.concurrent.Callable
                public String call() throws Exception {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (String) ipChange2.ipc$dispatch("5fe77b5b", new Object[]{this});
                    }
                    String localDeviceID = DeviceIDManager.this.getLocalDeviceID(context, str);
                    String localUtdid = DeviceIDManager.this.getLocalUtdid(context);
                    if (StringUtils.isBlank(localDeviceID) || StringUtils.isBlank(localUtdid)) {
                        localDeviceID = DeviceIDManager.this.getRemoteDeviceID(context, str);
                    }
                    if (StringUtils.isNotBlank(localDeviceID)) {
                        Mtop.instance(Mtop.Id.INNER, (Context) null).registerDeviceId(localDeviceID);
                    }
                    return localDeviceID;
                }
            });
            MtopSDKThreadPoolExecutorFactory.submit(new Runnable() { // from class: mtopsdk.mtop.deviceid.DeviceIDManager.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        futureTask.run();
                    }
                }
            });
            deviceIdMap.put(str, new DeviceIdDomain(futureTask));
            return futureTask;
        }
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            TBSdkLog.i(TAG, "[getDeviceID] appKey=" + str + " return mLastFuture");
        }
        return future;
    }

    public String getLocalUtdid(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("24d6832a", new Object[]{this, context});
        }
        String c = inx.c("utdid");
        if (StringUtils.isNotBlank(c)) {
            Mtop.instance(Mtop.Id.INNER, (Context) null).registerUtdid(c);
            return c;
        } else if (context == null) {
            if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.WarnEnable)) {
                TBSdkLog.w(TAG, "[getLocalUtdid] Context is null,get Utdid failed");
            }
            return null;
        } else {
            String utdid = UTDevice.getUtdid(context);
            Mtop.instance(Mtop.Id.INNER, (Context) null).registerUtdid(utdid);
            return utdid;
        }
    }

    public String getLocalDeviceID(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3cc83e1b", new Object[]{this, context, str});
        }
        DeviceIdDomain deviceIdDomain = deviceIdMap.get(str);
        if (deviceIdDomain != null && StringUtils.isNotBlank(deviceIdDomain.mDeviceId)) {
            return deviceIdDomain.mDeviceId;
        }
        if (context == null) {
            return null;
        }
        ConfigStoreManager instance2 = ConfigStoreManager.getInstance();
        String configItem = instance2.getConfigItem(context, ConfigStoreManager.MTOP_CONFIG_STORE, MTOPSDK_DEVICEID_STORE_PREFIX + str, "deviceId");
        ConfigStoreManager instance3 = ConfigStoreManager.getInstance();
        if ("1".equalsIgnoreCase(instance3.getConfigItem(context, ConfigStoreManager.MTOP_CONFIG_STORE, MTOPSDK_DEVICEID_STORE_PREFIX + str, DEVICEID_CREATED_KEY))) {
            DeviceIdDomain deviceIdDomain2 = new DeviceIdDomain(null);
            deviceIdDomain2.mDeviceId = configItem;
            deviceIdDomain2.mCreated = true;
            deviceIdMap.put(str, deviceIdDomain2);
        }
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            TBSdkLog.i(TAG, "[getLocalDeviceID]get DeviceId from store appkey=" + str + "; deviceId=" + configItem);
        }
        return configItem;
    }

    public String getRemoteDeviceID(Context context, String str) {
        String str2;
        String str3;
        String str4;
        String str5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6c20a4a2", new Object[]{this, context, str});
        }
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            TBSdkLog.i(TAG, "[getRemoteDeviceID] called!appkey=" + str);
        }
        boolean allowRemoveDeviceInfo = SwitchConfig.getInstance().allowRemoveDeviceInfo();
        String localUtdid = getLocalUtdid(context);
        if (!allowRemoveDeviceInfo) {
            str5 = s1m.b(context);
            str4 = s1m.c(context);
            str3 = s1m.e();
            str2 = s1m.a(context);
        } else {
            str5 = "";
            str4 = str5;
            str3 = str4;
            str2 = str3;
        }
        StringBuilder sb = new StringBuilder(64);
        if (StringUtils.isNotBlank(localUtdid)) {
            sb.append(localUtdid);
        }
        if (StringUtils.isNotBlank(str5)) {
            sb.append(str5);
        }
        if (StringUtils.isNotBlank(str4)) {
            sb.append(str4);
        }
        String str6 = null;
        if (StringUtils.isBlank(sb.toString())) {
            TBSdkLog.e(TAG, "[getRemoteDeviceID]device_global_id is blank");
            return null;
        }
        MtopSysNewDeviceIdRequest mtopSysNewDeviceIdRequest = new MtopSysNewDeviceIdRequest();
        mtopSysNewDeviceIdRequest.device_global_id = sb.toString();
        mtopSysNewDeviceIdRequest.new_device = true;
        mtopSysNewDeviceIdRequest.c0 = Build.BRAND;
        mtopSysNewDeviceIdRequest.c1 = Build.MODEL;
        mtopSysNewDeviceIdRequest.c2 = str5;
        mtopSysNewDeviceIdRequest.c3 = str4;
        mtopSysNewDeviceIdRequest.c4 = "";
        mtopSysNewDeviceIdRequest.c5 = str3;
        mtopSysNewDeviceIdRequest.c6 = str2;
        MtopResponse syncRequest = Mtop.instance(Mtop.Id.INNER, (Context) null).build((IMTOPDataObject) mtopSysNewDeviceIdRequest, (String) null).setBizId(4099).syncRequest();
        if (syncRequest.isApiSuccess()) {
            try {
                BaseOutDo baseOutDo = (BaseOutDo) MtopConvert.convertJsonToOutputDO(syncRequest.getBytedata(), MtopSysNewDeviceIdResponse.class);
                if (baseOutDo != null) {
                    str6 = ((MtopSysNewDeviceIdResponseData) baseOutDo.getData()).device_id;
                    if (StringUtils.isNotBlank(str6)) {
                        saveDeviceIdToStore(context, str, str6, "1");
                    }
                }
            } catch (Throwable th) {
                TBSdkLog.e(TAG, "[getRemoteDeviceID] error ---" + th.toString());
            }
        }
        return str6;
    }

    private void saveDeviceIdToStore(Context context, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("908480a7", new Object[]{this, context, str, str2, str3});
        } else if (context != null) {
            ConfigStoreManager instance2 = ConfigStoreManager.getInstance();
            instance2.saveConfigItem(context, ConfigStoreManager.MTOP_CONFIG_STORE, MTOPSDK_DEVICEID_STORE_PREFIX + str, "deviceId", str2);
            ConfigStoreManager instance3 = ConfigStoreManager.getInstance();
            instance3.saveConfigItem(context, ConfigStoreManager.MTOP_CONFIG_STORE, MTOPSDK_DEVICEID_STORE_PREFIX + str, DEVICEID_CREATED_KEY, str3);
            DeviceIdDomain deviceIdDomain = deviceIdMap.get(str);
            if (deviceIdDomain == null) {
                deviceIdDomain = new DeviceIdDomain(null);
            }
            deviceIdDomain.mDeviceId = str2;
            deviceIdDomain.mCreated = true;
            deviceIdMap.put(str, deviceIdDomain);
            if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                StringBuilder sb = new StringBuilder(32);
                sb.append("[saveDeviceIdToStore] appkey=");
                sb.append(str);
                sb.append("; deviceId=");
                sb.append(str2);
                sb.append("; mCreated=");
                sb.append(str3);
                TBSdkLog.i(TAG, sb.toString());
            }
        }
    }
}
