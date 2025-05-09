package android.taobao.windvane.jsbridge.api;

import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.thread.WVThreadPool;
import android.text.TextUtils;
import com.alipay.android.msp.utils.UserLocation;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.address.wrapper.weex.WXAddressModule2;
import com.taobao.phenix.compat.stat.TBImageFlowMonitor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import tb.dqw;
import tb.hzl;
import tb.kpw;
import tb.nsw;
import tb.p78;
import tb.r4p;
import tb.t2o;
import tb.v7t;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class WVLocation extends kpw implements LocationListener, Handler.Callback {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int GPS_TIMEOUT = 15000;
    private static final String TAG = "WVLocation";
    private Handler mHandler;
    private int MIN_TIME = 20000;
    private int MIN_DISTANCE = 30;
    private ArrayList<WVCallBackContext> mCallbacks = new ArrayList<>();
    private boolean getLocationSuccess = false;
    private boolean enableAddress = false;
    private LocationManager locationManager = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ WVCallBackContext f1805a;
        public final /* synthetic */ String b;

        public a(WVCallBackContext wVCallBackContext, String str) {
            this.f1805a = wVCallBackContext;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                WVLocation.this.requestLocation(this.f1805a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                WVLocation.access$000(WVLocation.this).sendEmptyMessageDelayed(1, 15000L);
            }
        }
    }

    static {
        t2o.a(989856281);
    }

    public WVLocation() {
        this.mHandler = null;
        this.mHandler = new Handler(Looper.getMainLooper(), this);
    }

    public static /* synthetic */ Handler access$000(WVLocation wVLocation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("2bc8a1fe", new Object[]{wVLocation});
        }
        return wVLocation.mHandler;
    }

    public static /* synthetic */ boolean access$100(WVLocation wVLocation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("53797aab", new Object[]{wVLocation})).booleanValue();
        }
        return wVLocation.enableAddress;
    }

    public static /* synthetic */ Address access$200(WVLocation wVLocation, double d, double d2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Address) ipChange.ipc$dispatch("d4f36025", new Object[]{wVLocation, new Double(d), new Double(d2)});
        }
        return wVLocation.getAddress(d, d2);
    }

    public static /* synthetic */ ArrayList access$300(WVLocation wVLocation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("6bd9dfbf", new Object[]{wVLocation});
        }
        return wVLocation.mCallbacks;
    }

    public static /* synthetic */ Object ipc$super(WVLocation wVLocation, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in android/taobao/windvane/jsbridge/api/WVLocation");
    }

    private void wrapResult(Location location) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7d8c04", new Object[]{this, location});
            return;
        }
        ArrayList<WVCallBackContext> arrayList = this.mCallbacks;
        if (arrayList == null || arrayList.isEmpty()) {
            v7t.a(TAG, "GetLocation wrapResult callbackContext is null");
        } else if (location == null) {
            v7t.n(TAG, "getLocation: location is null");
            Iterator<WVCallBackContext> it = this.mCallbacks.iterator();
            while (it.hasNext()) {
                it.next().error(new nsw());
            }
            this.mCallbacks.clear();
        } else {
            AsyncTask.execute(new c(location));
        }
    }

    public synchronized void getLocation(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bc2f279", new Object[]{this, wVCallBackContext, str});
        } else {
            try {
                hzl.b(this.mContext, new String[]{p78.ACCESS_FINE_LOCATION, "android.permission.ACCESS_COARSE_LOCATION"}).i(new a(wVCallBackContext, str)).h(new dqw(wVCallBackContext, "no permission")).d();
            } catch (Exception unused) {
            }
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("282a8c1d", new Object[]{this, message})).booleanValue();
        }
        if (message.what == 1) {
            LocationManager locationManager = this.locationManager;
            if (locationManager != null) {
                try {
                    locationManager.removeUpdates(this);
                    ArrayList<WVCallBackContext> arrayList = this.mCallbacks;
                    if (arrayList != null && !arrayList.isEmpty()) {
                        if (!this.getLocationSuccess) {
                            Iterator<WVCallBackContext> it = this.mCallbacks.iterator();
                            while (it.hasNext()) {
                                it.next().error(new nsw());
                            }
                            this.mCallbacks.clear();
                        }
                    }
                    v7t.a(TAG, "GetLocation wrapResult callbackContext is null");
                } catch (Exception e) {
                    v7t.d(TAG, "GetLocation timeout" + e.getMessage());
                    Iterator<WVCallBackContext> it2 = this.mCallbacks.iterator();
                    while (it2.hasNext()) {
                        it2.next().error(new nsw());
                    }
                    this.mCallbacks.clear();
                }
            }
            return true;
        }
        return false;
    }

    @Override // tb.kpw, com.uc.webview.export.extension.IEmbedViewContainer.OnStateChangedListener
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        LocationManager locationManager = this.locationManager;
        if (locationManager != null) {
            if (!this.getLocationSuccess) {
                try {
                    locationManager.removeUpdates(this);
                } catch (Exception unused) {
                }
            }
            this.locationManager = null;
        }
        ArrayList<WVCallBackContext> arrayList = this.mCallbacks;
        if (arrayList != null) {
            arrayList.clear();
        }
    }

    @Override // android.location.LocationListener
    public void onLocationChanged(Location location) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d13e08b", new Object[]{this, location});
            return;
        }
        if (v7t.h()) {
            v7t.a(TAG, " onLocationChanged. ");
        }
        if (this.locationManager != null) {
            wrapResult(location);
            this.locationManager.removeUpdates(this);
            this.getLocationSuccess = true;
        }
    }

    @Override // android.location.LocationListener
    public void onProviderDisabled(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20eea11d", new Object[]{this, str});
        } else if (v7t.h()) {
            v7t.a(TAG, " onProviderDisabled. provider: " + str);
        }
    }

    @Override // android.location.LocationListener
    public void onProviderEnabled(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("faf9c02", new Object[]{this, str});
        } else if (v7t.h()) {
            v7t.a(TAG, " onProviderEnabled. provider: " + str);
        }
    }

    @Override // android.location.LocationListener
    public void onStatusChanged(String str, int i, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adf45405", new Object[]{this, str, new Integer(i), bundle});
        } else if (v7t.h()) {
            v7t.a(TAG, " onStatusChanged. provider: " + str + ";status: " + i);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Location f1807a;

        public c(Location location) {
            this.f1807a = location;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            nsw nswVar = new nsw();
            JSONObject jSONObject = new JSONObject();
            double longitude = this.f1807a.getLongitude();
            double latitude = this.f1807a.getLatitude();
            try {
                jSONObject.put("longitude", longitude);
                jSONObject.put("latitude", latitude);
                jSONObject.put("altitude", this.f1807a.getAltitude());
                jSONObject.put(UserLocation.KEY_DOUBLE_ACCURACY, this.f1807a.getAccuracy());
                jSONObject.put("heading", this.f1807a.getBearing());
                jSONObject.put(TBImageFlowMonitor.SPEED_MEASURE, this.f1807a.getSpeed());
            } catch (JSONException e) {
                e.printStackTrace();
            }
            nswVar.d("coords", jSONObject);
            if (v7t.h()) {
                v7t.a(WVLocation.TAG, " getLocation success. latitude: " + latitude + "; longitude: " + longitude);
            }
            if (WVLocation.access$100(WVLocation.this)) {
                Address access$200 = WVLocation.access$200(WVLocation.this, latitude, longitude);
                JSONObject jSONObject2 = new JSONObject();
                if (access$200 != null) {
                    try {
                        jSONObject2.put("country", access$200.getCountryName());
                        jSONObject2.put("province", access$200.getAdminArea());
                        jSONObject2.put("city", access$200.getLocality());
                        jSONObject2.put(r4p.KEY_CITY_CODE, access$200.getPostalCode());
                        jSONObject2.put("area", access$200.getSubLocality());
                        jSONObject2.put("road", access$200.getThoroughfare());
                        StringBuilder sb = new StringBuilder();
                        for (int i = 1; i <= 2; i++) {
                            if (!TextUtils.isEmpty(access$200.getAddressLine(i))) {
                                sb.append(access$200.getAddressLine(i));
                            }
                        }
                        jSONObject2.put("addressLine", sb.toString());
                        if (v7t.h()) {
                            v7t.a(WVLocation.TAG, " getAddress success. " + access$200.getAddressLine(0));
                        }
                    } catch (JSONException e2) {
                        e2.printStackTrace();
                    }
                } else if (v7t.h()) {
                    v7t.n(WVLocation.TAG, " getAddress fail. ");
                }
                nswVar.d(WXAddressModule2.PLUGIN_NAME, jSONObject2);
            }
            try {
                Iterator it = WVLocation.access$300(WVLocation.this).iterator();
                while (it.hasNext()) {
                    ((WVCallBackContext) it.next()).success(nswVar);
                }
                WVLocation.access$300(WVLocation.this).clear();
                if (v7t.h()) {
                    v7t.a(WVLocation.TAG, "callback success. retString: " + nswVar.m());
                }
            } catch (Throwable unused) {
            }
        }
    }

    private Address getAddress(double d, double d2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Address) ipChange.ipc$dispatch("3140106", new Object[]{this, new Double(d), new Double(d2)});
        }
        try {
            List<Address> fromLocation = new Geocoder(this.mContext).getFromLocation(d, d2, 1);
            if (fromLocation == null || fromLocation.size() <= 0) {
                return null;
            }
            return fromLocation.get(0);
        } catch (Exception e) {
            v7t.d(TAG, "getAddress: getFromLocation error. " + e.getMessage());
            return null;
        }
    }

    private void registerLocation(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ac9cab5", new Object[]{this, new Boolean(z)});
            return;
        }
        if (this.locationManager == null) {
            this.locationManager = (LocationManager) this.mContext.getSystemService("location");
        }
        try {
            this.getLocationSuccess = false;
            this.locationManager.requestLocationUpdates("network", this.MIN_TIME, this.MIN_DISTANCE, this);
            this.locationManager.requestLocationUpdates("gps", this.MIN_TIME, this.MIN_DISTANCE, this);
            if (v7t.h()) {
                v7t.a(TAG, " registerLocation start provider GPS and NETWORK");
            }
        } catch (Exception e) {
            v7t.d(TAG, "registerLocation error: " + e.getMessage());
        }
    }

    public void requestLocation(WVCallBackContext wVCallBackContext, String str) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b991172", new Object[]{this, wVCallBackContext, str});
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                boolean optBoolean = jSONObject.optBoolean("enableHighAcuracy");
                this.enableAddress = jSONObject.optBoolean(WXAddressModule2.PLUGIN_NAME);
                z = optBoolean;
            } catch (JSONException unused) {
                v7t.d(TAG, "getLocation: param parse to JSON error, param=" + str);
                nsw nswVar = new nsw();
                nswVar.j("HY_PARAM_ERR");
                wVCallBackContext.error(nswVar);
                return;
            }
        }
        if (this.mCallbacks == null) {
            this.mCallbacks = new ArrayList<>();
        }
        this.mCallbacks.add(wVCallBackContext);
        registerLocation(z);
        WVThreadPool.getInstance().execute(new b());
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (!"getLocation".equals(str)) {
            return false;
        }
        getLocation(wVCallBackContext, str2);
        return true;
    }
}
