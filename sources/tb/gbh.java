package tb;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.bundleInfo.BundleInfoManager;
import com.taobao.activelocation.mtop.pois.MtopPoiRequest;
import com.taobao.activelocation.mtop.pois.MtopPoiResponse;
import com.taobao.activelocation.mtop.pois.MtopPoiResponseData;
import com.taobao.activelocation.mtop.pois.Poi;
import com.taobao.activelocation.report.service.ActiveReportService;
import com.taobao.location.aidl.ITBLocationCallback;
import com.taobao.location.common.LocationErrorCode;
import com.taobao.location.common.LocationTypeEnum;
import com.taobao.location.common.TBLocationDTO;
import com.taobao.location.common.TBLocationOption;
import com.taobao.location.common.TBPoiDetailDO;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.Globals;
import com.taobao.tao.TaoApplication;
import com.taobao.tao.log.TLog;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.intf.Mtop;
import mtopsdk.mtop.util.MtopConvert;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class gbh implements anc {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String NAVI_RESULT = "tb_location_navi_result";
    public static gbh d;

    /* renamed from: a  reason: collision with root package name */
    public final Handler f19863a;
    public TBLocationDTO b = null;
    public Context c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(Looper looper) {
            super(looper);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == 673877017) {
                super.handleMessage((Message) objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/activelocation/manager/LocationManager$1");
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            ITBLocationCallback iTBLocationCallback = (ITBLocationCallback) message.obj;
            Bundle data = message.getData();
            int i = message.what;
            if (i == 0) {
                TBLocationDTO tBLocationDTO = (TBLocationDTO) data.getParcelable(zah.c);
                TBLocationOption tBLocationOption = (TBLocationOption) data.getParcelable(zah.b);
                if (!tBLocationOption.getDataModel().matchAddressModel(tBLocationDTO)) {
                    gbh.a(gbh.this, tBLocationDTO);
                }
                if (!tBLocationOption.getDataModel().matchPoiModel(tBLocationDTO)) {
                    tBLocationDTO.pois = gbh.b(gbh.this, tBLocationDTO.latitude, tBLocationDTO.longitude);
                }
                gbh.this.x(tBLocationDTO);
                gbh.c(gbh.this, tBLocationDTO);
                gbh.d(gbh.this, tBLocationDTO);
                gbh.e(gbh.this, iTBLocationCallback, tBLocationDTO);
            } else if (i == 1) {
                HashMap hashMap = new HashMap();
                String str = zah.d;
                hashMap.put(str, data.getString(str));
                String str2 = zah.e;
                hashMap.put(str2, data.getString(str2));
                String str3 = zah.f32647a;
                if (data.containsKey(str3)) {
                    int i2 = data.getInt(str3);
                    try {
                        awv.e(i2, gbh.f(gbh.this), (TBLocationOption) data.getParcelable(zah.b), iTBLocationCallback, gbh.g(), hashMap).b();
                    } catch (Exception e) {
                        Log.e("lbs_LocationManager", "handleMessage, MSG_DO_LOCATION", e);
                        gbh gbhVar = gbh.this;
                        gbh.e(gbhVar, iTBLocationCallback, gbh.h(gbhVar, hashMap));
                        gbh.i(gbh.this, hashMap);
                    }
                    if (LocationTypeEnum.valueOfType(i2) == LocationTypeEnum.NLPLOCATION) {
                        gbh.i(gbh.this, hashMap);
                    }
                } else {
                    gbh gbhVar2 = gbh.this;
                    gbh.e(gbhVar2, iTBLocationCallback, gbh.h(gbhVar2, hashMap));
                    gbh.i(gbh.this, hashMap);
                }
            }
            super.handleMessage(message);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Intent f19865a;

        public b(Intent intent) {
            this.f19865a = intent;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                ActiveReportService.g(this.f19865a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Intent f19866a;

        public c(Intent intent) {
            this.f19866a = intent;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                ActiveReportService.g(this.f19866a);
            }
        }
    }

    static {
        t2o.a(789577743);
        t2o.a(789577742);
    }

    public gbh() {
        HandlerThread handlerThread = new HandlerThread("location message process");
        handlerThread.start();
        this.f19863a = new a(handlerThread.getLooper());
        t();
    }

    public static /* synthetic */ void a(gbh gbhVar, TBLocationDTO tBLocationDTO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4cdc2545", new Object[]{gbhVar, tBLocationDTO});
        } else {
            gbhVar.o(tBLocationDTO);
        }
    }

    public static /* synthetic */ List b(gbh gbhVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("149aaadf", new Object[]{gbhVar, str, str2});
        }
        return gbhVar.s(str, str2);
    }

    public static /* synthetic */ void c(gbh gbhVar, TBLocationDTO tBLocationDTO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdf5a603", new Object[]{gbhVar, tBLocationDTO});
        } else {
            gbhVar.l(tBLocationDTO);
        }
    }

    public static /* synthetic */ void d(gbh gbhVar, TBLocationDTO tBLocationDTO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76826662", new Object[]{gbhVar, tBLocationDTO});
        } else {
            gbhVar.k(tBLocationDTO);
        }
    }

    public static /* synthetic */ void e(gbh gbhVar, ITBLocationCallback iTBLocationCallback, TBLocationDTO tBLocationDTO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b80c037", new Object[]{gbhVar, iTBLocationCallback, tBLocationDTO});
        } else {
            gbhVar.m(iTBLocationCallback, tBLocationDTO);
        }
    }

    public static /* synthetic */ Handler f(gbh gbhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("299cb0f6", new Object[]{gbhVar});
        }
        return gbhVar.f19863a;
    }

    public static /* synthetic */ gbh g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gbh) ipChange.ipc$dispatch("802b40b9", new Object[0]);
        }
        return d;
    }

    public static /* synthetic */ TBLocationDTO h(gbh gbhVar, HashMap hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBLocationDTO) ipChange.ipc$dispatch("83010f61", new Object[]{gbhVar, hashMap});
        }
        return gbhVar.p(hashMap);
    }

    public static /* synthetic */ void i(gbh gbhVar, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5df72ab8", new Object[]{gbhVar, map});
        } else {
            gbhVar.j(map);
        }
    }

    public static synchronized gbh r() {
        synchronized (gbh.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (gbh) ipChange.ipc$dispatch("6c0c8245", new Object[0]);
            }
            if (d == null) {
                d = new gbh();
            }
            return d;
        }
    }

    public final void A(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8e2764c", new Object[]{this, str});
            return;
        }
        try {
            String path = Globals.getApplication().getFilesDir().getPath();
            FileOutputStream fileOutputStream = new FileOutputStream(path + "/tb_location_navi_result");
            fileOutputStream.write(str.getBytes());
            fileOutputStream.close();
        } catch (Exception e) {
            Log.e("lbs_LocationManager", "写缓存异常", e);
        }
    }

    public final void B(String str) {
        StringBuilder sb;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("515ca1ec", new Object[]{this, str});
        } else if ("true".equalsIgnoreCase(OrangeConfig.getInstance().getConfig("gps", "isWriteFileSync", "true"))) {
            try {
                ReentrantLock reentrantLock = e2u.b;
                reentrantLock.lock();
                A(str);
                try {
                    reentrantLock.unlock();
                } catch (Throwable th) {
                    th = th;
                    sb = new StringBuilder("unlock error");
                    sb.append(th);
                    TLog.loge("lbs_LocationManager", sb.toString());
                }
            } catch (Throwable th2) {
                try {
                    TLog.loge("lbs_LocationManager", "writeFileWithAsync error = " + th2);
                    AppMonitor.Counter.commit("passivelocation", "writeFileWithAsyncError", 1.0d);
                    try {
                        e2u.b.unlock();
                    } catch (Throwable th3) {
                        th = th3;
                        sb = new StringBuilder("unlock error");
                        sb.append(th);
                        TLog.loge("lbs_LocationManager", sb.toString());
                    }
                } catch (Throwable th4) {
                    try {
                        e2u.b.unlock();
                    } catch (Throwable th5) {
                        TLog.loge("lbs_LocationManager", "unlock error" + th5);
                    }
                    throw th4;
                }
            }
        } else {
            A(str);
        }
    }

    public final void k(TBLocationDTO tBLocationDTO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b2584ea", new Object[]{this, tBLocationDTO});
            return;
        }
        try {
            Mtop.instance(Globals.getApplication(), TaoApplication.getTTID()).setCoordinates(tBLocationDTO.getLongitude(), tBLocationDTO.getLatitude());
        } catch (Exception e) {
            Log.e("lbs_LocationManager", "设置mtop接口经纬度异常", e);
        }
    }

    public final void m(ITBLocationCallback iTBLocationCallback, TBLocationDTO tBLocationDTO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d80d9a04", new Object[]{this, iTBLocationCallback, tBLocationDTO});
            return;
        }
        try {
            iTBLocationCallback.onLocationChanged(tBLocationDTO);
        } catch (RemoteException e) {
            Log.e("lbs_LocationManager", "结果回调异常", e);
        }
    }

    public boolean n(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b27b20d7", new Object[]{this, str})).booleanValue();
        }
        try {
            if (!new File(str).exists()) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public final TBLocationDTO p(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBLocationDTO) ipChange.ipc$dispatch("bec8e32b", new Object[]{this, hashMap});
        }
        TBLocationDTO tBLocationDTO = new TBLocationDTO();
        tBLocationDTO.isNavSuccess = false;
        tBLocationDTO.setErrorCode(Integer.valueOf(LocationErrorCode.FAIL.getCode()));
        if (hashMap != null) {
            String str = hashMap.get(zah.d);
            String str2 = hashMap.get(zah.e);
            if (str != null) {
                try {
                    tBLocationDTO.setErrorCode(Integer.valueOf(Integer.parseInt(str) + 1000));
                } catch (Exception unused) {
                }
            }
            if (str2 != null) {
                try {
                    tBLocationDTO.setErrorCode(Integer.valueOf(Integer.parseInt(str2)));
                } catch (Exception unused2) {
                }
            }
        }
        awv.i(tBLocationDTO);
        return tBLocationDTO;
    }

    public TBLocationDTO q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBLocationDTO) ipChange.ipc$dispatch("55a8e48", new Object[]{this});
        }
        TBLocationDTO tBLocationDTO = this.b;
        if (tBLocationDTO != null) {
            return tBLocationDTO;
        }
        String w = w();
        if (!TextUtils.isEmpty(w)) {
            this.b = (TBLocationDTO) JSON.parseObject(w, TBLocationDTO.class);
        }
        return this.b;
    }

    public final List<TBPoiDetailDO> s(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("e2776d38", new Object[]{this, str, str2});
        }
        ArrayList arrayList = new ArrayList();
        try {
            double parseDouble = Double.parseDouble(str);
            double parseDouble2 = Double.parseDouble(str2);
            MtopPoiRequest mtopPoiRequest = new MtopPoiRequest();
            mtopPoiRequest.setLatitude(parseDouble);
            mtopPoiRequest.setLongitude(parseDouble2);
            MtopResponse syncRequest = RemoteBusiness.build(Globals.getApplication(), mtopPoiRequest, TaoApplication.getTTID()).showLoginUI(false).setBizId(75).syncRequest();
            if (syncRequest.isApiSuccess()) {
                for (Poi poi : ((MtopPoiResponseData) MtopConvert.mtopResponseToOutputDO(syncRequest, MtopPoiResponse.class).getData()).getPois()) {
                    TBPoiDetailDO tBPoiDetailDO = new TBPoiDetailDO();
                    tBPoiDetailDO.name = poi.getName();
                    tBPoiDetailDO.type = poi.getType();
                    tBPoiDetailDO.tel = poi.getTel();
                    tBPoiDetailDO.distance = poi.getDistance();
                    tBPoiDetailDO.direction = poi.getDirection();
                    tBPoiDetailDO.address = poi.getAddress();
                    String location = poi.getLocation();
                    if (!location.isEmpty() && location.contains(",")) {
                        String[] split = location.split(",");
                        tBPoiDetailDO.longitude = split[0];
                        tBPoiDetailDO.latitude = split[1];
                    }
                    arrayList.add(tBPoiDetailDO);
                }
            }
        } catch (Exception e) {
            e.getMessage();
        }
        return arrayList;
    }

    public void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b880fd9", new Object[]{this});
        }
    }

    public final boolean v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a49c51c7", new Object[]{this})).booleanValue();
        }
        try {
            Context context = this.c;
            if (context == null) {
                return false;
            }
            if ((context.getApplicationInfo().flags & 2) != 0) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public final String w() {
        Exception e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("717a9a07", new Object[]{this});
        }
        String str = "";
        try {
            String str2 = Globals.getApplication().getFilesDir().getPath() + "/tb_location_navi_result";
            if (!n(str2)) {
                return str;
            }
            FileInputStream fileInputStream = new FileInputStream(str2);
            byte[] bArr = new byte[fileInputStream.available()];
            fileInputStream.read(bArr);
            String str3 = new String(bArr, "utf-8");
            try {
                fileInputStream.close();
                return str3;
            } catch (Exception e2) {
                e = e2;
                str = str3;
                Log.e("lbs_LocationManager", "读缓存异常", e);
                return str;
            }
        } catch (Exception e3) {
            e = e3;
        }
    }

    public void x(TBLocationDTO tBLocationDTO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6de967", new Object[]{this, tBLocationDTO});
            return;
        }
        this.b = tBLocationDTO;
        B(JSON.toJSONString(tBLocationDTO));
    }

    public void y(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a164154", new Object[]{this, context});
        } else {
            this.c = context;
        }
    }

    public final void j(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770fa8ad", new Object[]{this, map});
        } else if (ActiveReportService.f(ActiveReportService.LOCATION_ERROR_ACTION)) {
            try {
                Intent intent = new Intent(ActiveReportService.LOCATION_ERROR_ACTION);
                if (map != null) {
                    String str = zah.d;
                    intent.putExtra(str, map.get(str));
                    String str2 = zah.e;
                    intent.putExtra(str2, map.get(str2));
                }
                intent.putExtra(ActiveReportService.REPORT_TIME_THRESHOLD_CKECKED, true);
                intent.setPackage(Globals.getApplication().getPackageName());
                this.f19863a.post(new c(intent));
            } catch (Exception e) {
                Log.e("lbs_LocationManager", "ErrorReport异常", e);
            }
        }
    }

    public final void l(TBLocationDTO tBLocationDTO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("167ac676", new Object[]{this, tBLocationDTO});
        } else if (ActiveReportService.f(ActiveReportService.LOCATION_CHANGE_ACTION)) {
            try {
                Intent intent = new Intent(ActiveReportService.LOCATION_CHANGE_ACTION);
                intent.putExtra("locationdto", tBLocationDTO);
                intent.putExtra(ActiveReportService.REPORT_TIME_THRESHOLD_CKECKED, true);
                intent.setPackage(Globals.getApplication().getPackageName());
                this.f19863a.post(new b(intent));
            } catch (Exception unused) {
            }
        }
    }

    public synchronized void z(TBLocationOption tBLocationOption, ITBLocationCallback iTBLocationCallback) {
        TBLocationDTO f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd71b405", new Object[]{this, tBLocationOption, iTBLocationCallback});
            return;
        }
        Handler handler = this.f19863a;
        if (handler != null) {
            Message obtainMessage = handler.obtainMessage(1, iTBLocationCallback);
            Bundle bundle = new Bundle();
            if (!"on".equalsIgnoreCase(OrangeConfig.getInstance().getConfig("gps", "allLocation", "on"))) {
                Log.e("lbs_LocationManager", "主动定位模块降级");
            } else if (!v() || (f = awv.f(Globals.getApplication())) == null) {
                bundle.putInt(zah.f32647a, LocationTypeEnum.MEMORYLOCATION.getType());
            } else {
                x(f);
                m(iTBLocationCallback, f);
                return;
            }
            bundle.putParcelable(zah.b, tBLocationOption);
            obtainMessage.setData(bundle);
            this.f19863a.sendMessage(obtainMessage);
        }
    }

    public final boolean u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("379397a3", new Object[]{this})).booleanValue();
        }
        if (BundleInfoManager.instance().getDynamicFeatureInfo(u58.DYNAMIC_NAME_TAOBAO_ANDROID_AMAP_DYNAMIC) == null) {
            TLog.loge("lbs_LocationManager", "AmapSearch 未远程化");
            return true;
        }
        ucq a2 = vcq.a(this.c);
        if (a2.f().contains(u58.DYNAMIC_NAME_TAOBAO_ANDROID_AMAP_DYNAMIC)) {
            TLog.loge("lbs_LocationManager", "AmapSearch 已安装");
            return true;
        }
        TLog.loge("lbs_LocationManager", "AmapSearch 未安装");
        ArrayList arrayList = new ArrayList();
        arrayList.add(u58.DYNAMIC_NAME_TAOBAO_ANDROID_AMAP_DYNAMIC);
        a2.d(arrayList);
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x01aa, code lost:
        if (r0.endsWith("市") != false) goto L_0x01ac;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void o(com.taobao.location.common.TBLocationDTO r20) {
        /*
            Method dump skipped, instructions count: 541
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.gbh.o(com.taobao.location.common.TBLocationDTO):void");
    }
}
