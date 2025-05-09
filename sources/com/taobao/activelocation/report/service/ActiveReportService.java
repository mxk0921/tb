package com.taobao.activelocation.report.service;

import android.content.Intent;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.location.common.TBLocationDTO;
import com.taobao.orange.OrangeConfig;
import com.taobao.passivelocation.domain.LBSDTO;
import com.taobao.passivelocation.domain.LBSWifiDTO;
import com.taobao.tao.Globals;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import org.json.JSONArray;
import org.json.JSONObject;
import tb.cq1;
import tb.f2o;
import tb.t2o;
import tb.w5a;
import tb.zah;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ActiveReportService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FORE_GROUND_ACTION = "com.taobao.activelocation.report.service.FORE_GROUND_ACTION";
    public static final String LOCATION_CHANGE_ACTION = "com.taobao.activelocation.report.service.LOCATION_CHANGE_ACTION";
    public static final String LOCATION_ERROR_ACTION = "com.taobao.activelocation.report.service.LOCATION_ERROR_ACTION";
    public static final String REPORT_TIME_THRESHOLD_CKECKED = "report_time_threshold_checked";

    /* renamed from: a  reason: collision with root package name */
    public static long f6105a = 0;
    public static long b = 0;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class DataReportListener implements IRemoteBaseListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(789577757);
            t2o.a(589299719);
        }

        private DataReportListener() {
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteListener
        public void onError(int i, MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
            }
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteListener
        public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
            }
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
        public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class ErrorReportListener implements IRemoteBaseListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(789577758);
            t2o.a(589299719);
        }

        private ErrorReportListener() {
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteListener
        public void onError(int i, MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
            }
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteListener
        public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
            }
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
        public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
            }
        }
    }

    static {
        t2o.a(789577755);
    }

    public static LBSDTO a(TBLocationDTO tBLocationDTO, short s) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LBSDTO) ipChange.ipc$dispatch("fe6ffc99", new Object[]{tBLocationDTO, new Short(s)});
        }
        LBSDTO i = i(tBLocationDTO, s);
        w5a.c(i);
        w5a.a(i);
        w5a.b(i);
        return i;
    }

    public static LBSDTO b(short s) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LBSDTO) ipChange.ipc$dispatch("1304e749", new Object[]{new Short(s)});
        }
        return a(null, s);
    }

    public static void c(LBSDTO lbsdto) {
        LBSWifiDTO[] lBSWifiDTOArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edce9753", new Object[]{lbsdto});
        } else if (lbsdto != null && (lBSWifiDTOArr = lbsdto.wifis) != null) {
            for (LBSWifiDTO lBSWifiDTO : lBSWifiDTOArr) {
                String ssid = lBSWifiDTO.getSsid();
                if (!TextUtils.isEmpty(ssid)) {
                    lBSWifiDTO.setSsid(new String(cq1.c(ssid.getBytes())));
                }
            }
        }
    }

    public static void d(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90a0a10a", new Object[]{jSONArray});
            return;
        }
        f2o f2oVar = new f2o(Globals.getApplication());
        f2oVar.registerRemoteListener(new DataReportListener());
        if (jSONArray != null && jSONArray.length() > 0 && !TextUtils.isEmpty(jSONArray.toString())) {
            f2oVar.reportLbsData(jSONArray.toString());
        }
    }

    public static void e(Map<String, String> map, LBSDTO lbsdto) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a3a3495", new Object[]{map, lbsdto});
            return;
        }
        f2o f2oVar = new f2o(Globals.getApplication());
        f2oVar.registerRemoteListener(new ErrorReportListener());
        if (lbsdto != null) {
            f2oVar.b(map, lbsdto);
        }
    }

    public static boolean f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eef997ec", new Object[]{str})).booleanValue();
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (LOCATION_ERROR_ACTION.equals(str)) {
            if (currentTimeMillis - b < 300000) {
                return false;
            }
            b = currentTimeMillis;
        } else if (currentTimeMillis - f6105a < 300000) {
            return false;
        } else {
            f6105a = currentTimeMillis;
        }
        return true;
    }

    public static void h(LBSDTO lbsdto, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6261b696", new Object[]{lbsdto, jSONArray});
            return;
        }
        c(lbsdto);
        try {
            String jSONString = JSON.toJSONString(lbsdto);
            if (!TextUtils.isEmpty(jSONString)) {
                jSONArray.put(new JSONObject(jSONString));
            }
        } catch (Exception unused) {
        }
    }

    public static LBSDTO i(TBLocationDTO tBLocationDTO, short s) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LBSDTO) ipChange.ipc$dispatch("3c937554", new Object[]{tBLocationDTO, new Short(s)});
        }
        LBSDTO lbsdto = new LBSDTO();
        if (tBLocationDTO != null) {
            lbsdto.accuracy = tBLocationDTO.accuracy;
            lbsdto.hasLocation = Boolean.TRUE;
            lbsdto.latitude = Double.valueOf(Double.parseDouble(tBLocationDTO.latitude));
            lbsdto.longitude = Double.valueOf(Double.parseDouble(tBLocationDTO.longitude));
            lbsdto.altitude = tBLocationDTO.altitude;
            lbsdto.province = tBLocationDTO.provinceName;
            lbsdto.provinceCode = tBLocationDTO.provinceCode;
            lbsdto.city = tBLocationDTO.cityName;
            lbsdto.cityCode = tBLocationDTO.cityCode;
            lbsdto.area = tBLocationDTO.areaName;
            lbsdto.areaCode = tBLocationDTO.areaCode;
            lbsdto.address = tBLocationDTO.address;
            lbsdto.time = tBLocationDTO.timeStamp.longValue();
            lbsdto.version = 1;
        } else {
            lbsdto.hasLocation = Boolean.FALSE;
        }
        lbsdto.gatherType = s;
        return lbsdto;
    }

    public static void g(Intent intent) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0ef46c0", new Object[]{intent});
        } else if (!"off".equalsIgnoreCase(OrangeConfig.getInstance().getConfig("gps", "activeReport", "off")) && intent != null && !TextUtils.isEmpty(intent.getAction())) {
            try {
                z = intent.getBooleanExtra(REPORT_TIME_THRESHOLD_CKECKED, false);
            } catch (Exception unused) {
                z = false;
            }
            String action = intent.getAction();
            if (z || f(action)) {
                LBSDTO lbsdto = null;
                try {
                    if (FORE_GROUND_ACTION.equals(action)) {
                        lbsdto = b((short) 2);
                    } else if (LOCATION_CHANGE_ACTION.equals(action)) {
                        lbsdto = a((TBLocationDTO) intent.getParcelableExtra("locationdto"), (short) 0);
                    } else if (LOCATION_ERROR_ACTION.equals(action)) {
                        HashMap hashMap = new HashMap();
                        String str = zah.d;
                        hashMap.put(str, intent.getStringExtra(str));
                        String str2 = zah.e;
                        hashMap.put(str2, intent.getStringExtra(str2));
                        LBSDTO lbsdto2 = new LBSDTO();
                        try {
                            w5a.c(lbsdto2);
                            w5a.a(lbsdto2);
                            w5a.b(lbsdto2);
                            e(hashMap, lbsdto2);
                            return;
                        } catch (Exception unused2) {
                            lbsdto = lbsdto2;
                        }
                    }
                } catch (Exception unused3) {
                }
                if (lbsdto != null) {
                    JSONArray jSONArray = new JSONArray();
                    try {
                        h(lbsdto, jSONArray);
                        if (jSONArray.length() > 0) {
                            d(jSONArray);
                        }
                    } catch (Exception unused4) {
                    }
                }
            }
        }
    }
}
