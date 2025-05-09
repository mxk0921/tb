package tb;

import android.app.Activity;
import android.content.Intent;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.Properties;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public abstract class vmo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public wmo f30110a;

    static {
        t2o.a(69206253);
    }

    public void a(Activity activity, wmo wmoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68da4e51", new Object[]{this, activity, wmoVar});
        }
    }

    public void b(Activity activity, wmo wmoVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1df5b00d", new Object[]{this, activity, wmoVar, jSONObject});
        } else {
            a(activity, wmoVar);
        }
    }

    public void c(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
        }
    }

    public void d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58ad5597", new Object[]{this, str, str2});
            return;
        }
        Properties properties = new Properties();
        properties.setProperty("result", str2);
        UserTrackAdapter.sendUT(str, "GetAuthKey_Result", properties);
    }

    public vmo e(wmo wmoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vmo) ipChange.ipc$dispatch("8dc6b9c7", new Object[]{this, wmoVar});
        }
        this.f30110a = wmoVar;
        return this;
    }

    public abstract void f(Activity activity, Map<String, String> map);
}
