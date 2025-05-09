package com.taobao.passivelocation.report.service;

import android.app.Application;
import android.app.IntentService;
import android.content.Intent;
import android.location.Location;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.passivelocation.business.PassiveLocationBusiness;
import com.taobao.passivelocation.domain.LBSDTO;
import com.taobao.passivelocation.domain.LBSWifiDTO;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import org.json.JSONArray;
import org.json.JSONObject;
import tb.cq1;
import tb.ich;
import tb.mdh;
import tb.np6;
import tb.t2o;
import tb.v5a;
import tb.vu3;
import tb.yah;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class LocationReportService extends IntentService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String LOCATION_EXTRA_REPORT_ACTION = "location_extra_report_data";
    public static final String LOCATION_UPLOAD_ACTION = "com.taobao.passivelocation.report.service.LOCATION_UPLOAD_ACTION";
    public static final String LOCATION_UPLOAD_SINGLE_ACTION = "com.taobao.passivelocation.report.service.LOCATION_UPLOAD_SINGLE_ACTION";
    public static final String LOCATION_UPLOAD_START = "com.taobao.passivelocation.report.service.LOCATION_UPLOAD_START";
    private static final String LOG = "lbs_passive.report_LCPSER";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class UpdateLocationBizListener implements IRemoteBaseListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(789577860);
            t2o.a(589299719);
        }

        private UpdateLocationBizListener() {
        }

        private void deleteData(MtopResponse mtopResponse, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7a0f7033", new Object[]{this, mtopResponse, new Boolean(z)});
            } else if (mtopResponse != null && !TextUtils.isEmpty(mtopResponse.getRetCode()) && !mtopResponse.getRetCode().startsWith("FAIL_SYS")) {
                mdh.a(LocationReportService.LOG, "retCode=" + mtopResponse.getRetCode());
                try {
                    mdh.a(LocationReportService.LOG, "delete data operation done");
                    if (!z) {
                        np6.c(null);
                    }
                } catch (Exception unused) {
                    mdh.b(LocationReportService.LOG, "delete data operation failed");
                }
            }
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteListener
        public void onError(int i, MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                return;
            }
            mdh.a(LocationReportService.LOG, "[onError] deleting data");
            deleteData(mtopResponse, false);
            mdh.a(LocationReportService.LOG, "[onError] delete data success");
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteListener
        public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                return;
            }
            mdh.a(LocationReportService.LOG, "[onSuccess] deleting data");
            deleteData(mtopResponse, true);
            mdh.a(LocationReportService.LOG, "[onSuccess] delete data success");
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
        public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                return;
            }
            mdh.a(LocationReportService.LOG, "[onSystemError] deleting data");
            deleteData(mtopResponse, false);
            mdh.a(LocationReportService.LOG, "[onSystemError] delete data success");
        }
    }

    static {
        t2o.a(789577858);
    }

    public LocationReportService() {
        this("LocationReportService");
    }

    private void doDataReport(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90a0a10a", new Object[]{this, jSONArray});
            return;
        }
        mdh.a(LOG, "doDataReport invoked");
        PassiveLocationBusiness passiveLocationBusiness = new PassiveLocationBusiness((Application) yah.f31937a);
        passiveLocationBusiness.registerRemoteListener(new UpdateLocationBizListener());
        if (jSONArray != null && jSONArray.length() > 0) {
            mdh.a(LOG, "data to be reported through MTOP：" + jSONArray.toString());
            String jSONArray2 = jSONArray.toString();
            if (!TextUtils.isEmpty(jSONArray2)) {
                mdh.a(LOG, "report data is: " + jSONArray2);
                passiveLocationBusiness.reportLbsData(jSONArray.toString());
                return;
            }
            mdh.a(LOG, "report data is null!");
        }
    }

    private void doDowngradableUploadData(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38ec61e4", new Object[]{this, intent});
            return;
        }
        String config = OrangeConfig.getInstance().getConfig("gps", "reportSwitch", "on");
        if ("on".equalsIgnoreCase(config)) {
            mdh.a(LOG, "report switch is on, reportSwitch=" + config);
            uploadLocationData(intent);
            return;
        }
        mdh.a(LOG, "report switch is off, reportSwitch=" + config);
    }

    public static /* synthetic */ Object ipc$super(LocationReportService locationReportService, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1899989668) {
            super.onStart((Intent) objArr[0], ((Number) objArr[1]).intValue());
            return null;
        } else if (hashCode == 413640386) {
            super.onCreate();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/passivelocation/report/service/LocationReportService");
        }
    }

    private LBSDTO storeLocationData(Location location) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LBSDTO) ipChange.ipc$dispatch("99793c73", new Object[]{this, location});
        }
        return v5a.a(location);
    }

    @Override // android.app.IntentService, android.app.Service
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
            return;
        }
        mdh.a(LOG, "[onStart] onCreate invoked");
        super.onCreate();
        yah.f31937a = getApplicationContext();
    }

    @Override // android.app.IntentService
    public void onHandleIntent(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1253e327", new Object[]{this, intent});
        } else if (intent != null && !TextUtils.isEmpty(intent.getAction())) {
            String action = intent.getAction();
            if (!LOCATION_UPLOAD_SINGLE_ACTION.equals(action)) {
                if (LOCATION_UPLOAD_ACTION.equals(action)) {
                    doDowngradableUploadData(intent);
                } else {
                    mdh.a(LOG, "unknown location report source");
                }
            }
        }
    }

    @Override // android.app.IntentService, android.app.Service
    public void onStart(Intent intent, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ec0755c", new Object[]{this, intent, new Integer(i)});
            return;
        }
        mdh.a(LOG, "[onStart] onStart invoked");
        super.onStart(intent, i);
        if (intent != null) {
            TextUtils.isEmpty(intent.getAction());
        }
    }

    public LocationReportService(String str) {
        super(str);
    }

    public void uploadLocationData(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("912180e4", new Object[]{this, intent});
            return;
        }
        mdh.a(LOG, "data report begin");
        JSONArray jSONArray = new JSONArray();
        try {
            Location location = intent.hasExtra(LOCATION_EXTRA_REPORT_ACTION) ? (Location) intent.getExtras().get(LOCATION_EXTRA_REPORT_ACTION) : null;
            if (location != null && location.getLongitude() > vu3.b.GEO_NOT_SUPPORT && location.getLatitude() > vu3.b.GEO_NOT_SUPPORT) {
                mdh.a(LOG, "processReportData(cursor, array) invoked");
                processReportData(location, jSONArray);
                mdh.a(LOG, "doDataReport(array)");
                if (jSONArray.length() > 0) {
                    doDataReport(jSONArray);
                    yah.c = false;
                    return;
                }
                mdh.a(LOG, "JSONArray is null!");
                return;
            }
            mdh.a(LOG, "no data to report, report progress ends");
        } catch (Exception e) {
            mdh.a(LOG, "upload data error: " + e.getMessage());
        } finally {
        }
    }

    private void doBase64Wifis(LBSDTO lbsdto) {
        LBSWifiDTO[] wifis;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edce9753", new Object[]{this, lbsdto});
        } else if (lbsdto != null && lbsdto.getWifis() != null) {
            for (LBSWifiDTO lBSWifiDTO : lbsdto.getWifis()) {
                String ssid = lBSWifiDTO.getSsid();
                if (!TextUtils.isEmpty(ssid)) {
                    lBSWifiDTO.setSsid(new String(cq1.c(ssid.getBytes())));
                } else {
                    mdh.a(LOG, "ssid=" + ssid + "，data：" + JSON.toJSONString(lBSWifiDTO));
                }
            }
        } else if (lbsdto != null) {
            mdh.a(LOG, "isTimeOnly=" + lbsdto.isTimeOnly());
        }
    }

    private void processReportData(Location location, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("457e2318", new Object[]{this, location, jSONArray});
            return;
        }
        LBSDTO storeLocationData = storeLocationData(location);
        doBase64Wifis(storeLocationData);
        if (ich.f) {
            storeLocationData.setGatherType((short) 2);
        } else {
            storeLocationData.setGatherType((short) 1);
        }
        try {
            String jSONString = JSON.toJSONString(storeLocationData);
            if (!TextUtils.isEmpty(jSONString)) {
                jSONArray.put(new JSONObject(jSONString));
            } else {
                mdh.a(LOG, "this data is null");
            }
        } catch (Exception unused) {
            mdh.a(LOG, "an exception occurs when doing data transition");
        }
    }
}
