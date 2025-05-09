package android.taobao.windvane.jsbridge.api;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.webview.IWVWebView;
import com.alibaba.security.realidentity.ui.webview.jsbridge.entity.WVResultWrapper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import org.json.JSONObject;
import tb.dsw;
import tb.kpw;
import tb.nsw;
import tb.oyl;
import tb.p78;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class WVBluetoothSilence extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "WVBluetoothSilence";
    private BluetoothAdapter mBTAdapter = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ WVCallBackContext f1789a;

        public a(WVCallBackContext wVCallBackContext) {
            this.f1789a = wVCallBackContext;
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
            try {
                if (WVBluetoothSilence.access$000(WVBluetoothSilence.this) == null) {
                    nswVar.b("msg", "DEVICE_NOT_SUPPORT");
                    nswVar.b("state", "unsupported");
                    this.f1789a.error(nswVar);
                } else if (!WVBluetoothSilence.access$000(WVBluetoothSilence.this).isEnabled()) {
                    nswVar.b("msg", "BLUETOOTH_POWERED_OFF");
                    nswVar.b("state", "poweredOff");
                    this.f1789a.error(nswVar);
                } else {
                    jSONObject.put("state", "poweredOn");
                    nswVar.b("state", "poweredOn");
                    nswVar.d("value", jSONObject);
                    this.f1789a.success(nswVar);
                }
            } catch (Throwable unused) {
                this.f1789a.error();
            }
        }
    }

    static {
        t2o.a(989856255);
    }

    public static /* synthetic */ BluetoothAdapter access$000(WVBluetoothSilence wVBluetoothSilence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BluetoothAdapter) ipChange.ipc$dispatch("466f4319", new Object[]{wVBluetoothSilence});
        }
        return wVBluetoothSilence.mBTAdapter;
    }

    public static /* synthetic */ Object ipc$super(WVBluetoothSilence wVBluetoothSilence, String str, Object... objArr) {
        if (str.hashCode() == -1811143243) {
            super.initialize((Context) objArr[0], (IWVWebView) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in android/taobao/windvane/jsbridge/api/WVBluetoothSilence");
    }

    public void checkStatus(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6737de8", new Object[]{this, str, wVCallBackContext});
            return;
        }
        try {
            oyl.a(this.mContext, new String[]{"android.permission.BLUETOOTH", "android.permission.BLUETOOTH_ADMIN", p78.ACCESS_FINE_LOCATION}).e(new a(wVCallBackContext)).d(new dsw(wVCallBackContext, WVResultWrapper.USER_DENIED, "unauthorized")).c();
        } catch (Exception e) {
            e.printStackTrace();
            wVCallBackContext.error(e.getMessage());
        }
    }

    @Override // tb.kpw
    public void initialize(Context context, IWVWebView iWVWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("940c25b5", new Object[]{this, context, iWVWebView});
            return;
        }
        this.mBTAdapter = BluetoothAdapter.getDefaultAdapter();
        super.initialize(context, iWVWebView);
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (!"checkStatus".equals(str)) {
            return false;
        }
        checkStatus(str2, wVCallBackContext);
        return true;
    }
}
