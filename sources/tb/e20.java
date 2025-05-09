package tb;

import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.location.aidl.ITBLocationCallback;
import com.taobao.location.common.LocationErrorCode;
import com.taobao.location.common.LocationTypeEnum;
import com.taobao.location.common.TBLocationDTO;
import com.taobao.location.common.TBLocationOption;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.Globals;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class e20 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final TBLocationOption f18219a;
    public final ITBLocationCallback b;
    public final Handler c;
    public LocationTypeEnum d;
    public final Application e = Globals.getApplication();
    public final HashMap<String, String> f;

    static {
        t2o.a(789577732);
    }

    public e20(Handler handler, TBLocationOption tBLocationOption, ITBLocationCallback iTBLocationCallback, LocationTypeEnum locationTypeEnum, HashMap<String, String> hashMap) {
        this.c = handler;
        this.f18219a = tBLocationOption;
        this.b = iTBLocationCallback;
        this.d = locationTypeEnum;
        this.f = hashMap;
    }

    public abstract LocationTypeEnum a();

    public abstract void b();

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d09a5221", new Object[]{this});
        }
        TBLocationOption tBLocationOption = this.f18219a;
        if (tBLocationOption != null) {
            return tBLocationOption.getOptionId();
        }
        return null;
    }

    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b1317935", new Object[]{this});
        }
        TBLocationOption tBLocationOption = this.f18219a;
        if (tBLocationOption != null) {
            return tBLocationOption.getRegionType().name();
        }
        return "tblocation";
    }

    public void e(LocationTypeEnum locationTypeEnum) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b370857e", new Object[]{this, locationTypeEnum});
        } else {
            this.d = locationTypeEnum;
        }
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd42bfa4", new Object[]{this});
        } else {
            g(null);
        }
    }

    public final void g(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3444c78f", new Object[]{this, hashMap});
            return;
        }
        Message obtainMessage = this.c.obtainMessage(1, this.b);
        Bundle bundle = new Bundle();
        LocationTypeEnum a2 = a();
        if (a2 != null) {
            bundle.putInt(zah.f32647a, a2.getType());
        }
        bundle.putParcelable(zah.b, this.f18219a);
        if (hashMap != null) {
            String str = zah.d;
            bundle.putString(str, hashMap.get(str));
            String str2 = zah.e;
            bundle.putString(str2, hashMap.get(str2));
        } else {
            HashMap<String, String> hashMap2 = this.f;
            if (hashMap2 != null) {
                String str3 = zah.d;
                bundle.putString(str3, hashMap2.get(str3));
                String str4 = zah.e;
                bundle.putString(str4, this.f.get(str4));
            }
        }
        obtainMessage.setData(bundle);
        this.c.sendMessage(obtainMessage);
        JSONObject jSONObject = new JSONObject();
        String str5 = zah.d;
        jSONObject.put(str5, (Object) bundle.getString(str5));
        String str6 = zah.e;
        jSONObject.put(str6, (Object) bundle.getString(str6));
        try {
            AppMonitor.Counter.commit("passivelocation", this.d.name(), jSONObject.toString(), 1.0d);
        } catch (JSONException unused) {
        }
    }

    public final void h(TBLocationDTO tBLocationDTO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5bda618", new Object[]{this, tBLocationDTO});
            return;
        }
        if (!(this instanceof ali) || "true".equalsIgnoreCase(OrangeConfig.getInstance().getConfig("gps", "absLocationAlwaysUpdateTs", "false"))) {
            tBLocationDTO.timeStamp = Long.valueOf(System.currentTimeMillis());
        }
        tBLocationDTO.isNavSuccess = true;
        tBLocationDTO.locationType = Integer.valueOf(this.d.getType());
        tBLocationDTO.errorCode = Integer.valueOf(LocationErrorCode.SUCCESS.code);
        Message obtainMessage = this.c.obtainMessage(0, this.b);
        Bundle bundle = new Bundle();
        bundle.putParcelable(zah.c, tBLocationDTO);
        bundle.putParcelable(zah.b, this.f18219a);
        obtainMessage.setData(bundle);
        this.c.sendMessage(obtainMessage);
    }
}
