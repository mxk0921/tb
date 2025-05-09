package tb;

import android.app.Activity;
import android.content.Intent;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.external.UCPManager;
import com.taobao.tao.homepage.HomepageFragment;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class kem {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Boolean f22618a;

    static {
        t2o.a(729810273);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82388e89", new Object[0]);
        } else if (!f22618a.booleanValue()) {
            sfh.d("PopLayer_And_ucp_trigger", "当前新链路开关没开");
        } else {
            try {
                UCPManager.c(HomepageFragment.class.getName());
            } catch (Exception e) {
                sfh.d("PopLayer_And_ucp_trigger", "addIgnorePage 出现异常" + e);
            }
        }
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("89715c6e", new Object[0])).booleanValue();
        }
        if (f22618a == null) {
            f22618a = Boolean.valueOf(f4b.b("sendSceneChangedNotifyEnable", true));
            a();
        }
        return f22618a.booleanValue();
    }

    public static void d(Activity activity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c4cfb8f", new Object[]{activity, str});
        } else if (!b()) {
            sfh.d("PopLayer_And_ucp_trigger", "orange开关关闭，不允许给pop发消息");
        } else if (activity == null) {
            sfh.d("PopLayer_And_ucp_trigger", "notifyPopLayerPageSwitch activity == null");
        } else {
            try {
                c(activity, str);
            } catch (Exception e) {
                sfh.d("PopLayer_And_ucp_trigger", "notifyPopLayerPageSwitch 出现异常：" + e);
            }
        }
    }

    public static void e(String str, String str2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3245ec72", new Object[]{str, str2, jSONObject});
        } else if (!b()) {
            sfh.d("PopLayer_And_ucp_trigger", "orange开关关闭，不允许给pop发消息");
        } else {
            try {
                UCPManager.o(str, str2, jSONObject);
                sfh.d("PopLayer_And_ucp_trigger", "发送通知给ucp,scene: " + str + " url：" + str2 + " bizArgs： " + jSONObject);
            } catch (Exception e) {
                sfh.d("PopLayer_And_ucp_trigger", "sendBizCustomSceneChangedToUcp 出现异常" + e);
            }
        }
    }

    public static void c(Activity activity, String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7af848d1", new Object[]{activity, str});
            return;
        }
        Intent intent = activity.getIntent();
        if (intent == null || intent.getData() == null) {
            str2 = "";
        } else {
            str2 = intent.getData().toString();
        }
        sfh.d("PopLayer_And_ucp_trigger", "发送通知给pop,subTabName: " + str + " param：" + str2);
        jem.d().k(str, str2, false);
    }
}
