package tb;

import android.app.Application;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import com.taobao.tao.topmultitab.service.data.impl.MessageBroadcastReceiver;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class vs8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public MessageBroadcastReceiver f30219a;
    public String b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            vs8 vs8Var = vs8.this;
            vs8.a(vs8Var, vs8.b(vs8Var));
            bqa.d("ExternalDataProcessor", "ExternalDataProcessor 获取SharedPreferencesInfo");
        }
    }

    static {
        t2o.a(729810180);
    }

    public vs8(wcc wccVar) {
        g(wccVar);
        m5a.a().e(new a());
    }

    public static /* synthetic */ String a(vs8 vs8Var, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9d55d989", new Object[]{vs8Var, str});
        }
        vs8Var.b = str;
        return str;
    }

    public static /* synthetic */ String b(vs8 vs8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("67ecd5f4", new Object[]{vs8Var});
        }
        return vs8Var.f();
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            h();
        }
    }

    public Object d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ce22285a", new Object[]{this, str, str2});
        }
        if (!TextUtils.equals("message", str)) {
            return null;
        }
        JSONObject e = e();
        bqa.d("ExternalDataProcessor", "messageTipInfo: " + e);
        if (e != null) {
            return e.get(str2);
        }
        return null;
    }

    public final JSONObject e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("980fb446", new Object[]{this});
        }
        JSONObject a2 = this.f30219a.a();
        if (a2 != null) {
            return a2;
        }
        bqa.d("ExternalDataProcessor", "广播数据为空");
        if (TextUtils.isEmpty(this.b)) {
            bqa.d("ExternalDataProcessor", "mSharedPreferencesMessageTipInfo为空");
            this.b = f();
        }
        if (!TextUtils.isEmpty(this.b)) {
            return JSON.parseObject(this.b);
        }
        bqa.d("ExternalDataProcessor", "sp为空");
        return null;
    }

    public final String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b7405cee", new Object[]{this});
        }
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(Globals.getApplication());
        return defaultSharedPreferences.getString("mpMessageBoxGlobalsTipInfo_" + p7p.h(), "");
    }

    public final void g(wcc wccVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9edf2f6", new Object[]{this, wccVar});
            return;
        }
        Application application = Globals.getApplication();
        if (application != null) {
            LocalBroadcastManager instance = LocalBroadcastManager.getInstance(application);
            MessageBroadcastReceiver messageBroadcastReceiver = new MessageBroadcastReceiver(wccVar);
            this.f30219a = messageBroadcastReceiver;
            instance.registerReceiver(messageBroadcastReceiver, new IntentFilter("com.taobao.message.unreader.change"));
        }
    }

    public final void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2bad1cc", new Object[]{this});
            return;
        }
        Application application = Globals.getApplication();
        if (application != null) {
            LocalBroadcastManager.getInstance(application).unregisterReceiver(this.f30219a);
        }
    }
}
