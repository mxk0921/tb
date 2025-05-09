package tb;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Looper;
import android.text.TextUtils;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.stdpop.api.PopGravity;
import com.taobao.tao.log.TLog;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class wht {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TCC_PAY_SUCCESS_HOST = "pages-fast.m.taobao.com";
    public static final String TCC_PAY_SUCCESS_HOST_PRE = "pre-pages-fast.m.taobao.com";

    /* renamed from: a  reason: collision with root package name */
    public static Class<?> f30706a;
    public static Method b;
    public static Field c;

    public static void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d82b8928", new Object[]{map});
        } else {
            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder("Page_Extend", 2201, "Page_CCPaySucc_Middleware_Expo", null, null, map).build());
        }
    }

    public static void b(String str) {
        List<String> d = d(str);
        if (d == null || d.isEmpty()) {
            TLog.logi(sht.TLOG_MODULE, "wht", "removedActivities为空, 没有需要手动关闭的activity。fromChannel: " + str);
            return;
        }
        try {
            if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                TLog.logi(sht.TLOG_MODULE, "wht", "非主线程，不处理中间页");
                return;
            }
            if (f30706a == null) {
                f30706a = Class.forName(ProcessUtils.ACTIVITY_THREAD);
            }
            if (b == null) {
                Method declaredMethod = f30706a.getDeclaredMethod(ProcessUtils.CURRENT_ACTIVITY_THREAD, new Class[0]);
                b = declaredMethod;
                declaredMethod.setAccessible(true);
            }
            if (c == null) {
                Field declaredField = f30706a.getDeclaredField("mActivities");
                c = declaredField;
                declaredField.setAccessible(true);
            }
            for (Object obj : ((Map) c.get(b.invoke(null, new Object[0]))).values()) {
                Field declaredField2 = obj.getClass().getDeclaredField("activity");
                declaredField2.setAccessible(true);
                Activity activity = (Activity) declaredField2.get(obj);
                if (d.contains(activity.getComponentName().getClassName())) {
                    TLog.logi(sht.TLOG_MODULE, "wht", "主动关闭: " + activity.getComponentName().getClassName());
                    activity.finish();
                }
            }
        } catch (Throwable th) {
            TLog.loge(sht.TLOG_MODULE, "wht", "关闭中间页失败：" + th);
        }
    }

    public static void c(String str, zmj zmjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3395aa74", new Object[]{str, zmjVar});
            return;
        }
        if (TextUtils.equals(str, vht.b())) {
            TLog.logi(sht.TLOG_MODULE, "wht", "直播间场景，发送广播、关闭中间页");
            LocalBroadcastManager.getInstance(zmjVar.d()).sendBroadcast(new Intent("TradePay.Event.livebag.close"));
        } else {
            TLog.logi(sht.TLOG_MODULE, "wht", "非直播间场景，关闭中间页");
        }
        Intent intent = new Intent("auraEventNotification");
        intent.putExtra("type", "pop");
        LocalBroadcastManager.getInstance(zmjVar.d()).sendBroadcast(intent);
        b(str);
    }

    public static List<String> d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("b6f30c9", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            TLog.logi(sht.TLOG_MODULE, "wht", "fromChannel is null");
            return null;
        }
        String f = vht.f();
        if (f != null) {
            try {
                JSONObject parseObject = JSON.parseObject(f);
                if (!(parseObject == null || parseObject.getJSONArray(str) == null)) {
                    return JSON.parseArray(parseObject.getJSONArray(str).toJSONString(), String.class);
                }
            } catch (Throwable th) {
                TLog.loge(sht.TLOG_MODULE, "wht", "loadFinishedDialogActivities, onError: " + th);
            }
        }
        return null;
    }

    public static void e(boolean z, String str, String str2, Uri uri) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("633348b9", new Object[]{new Boolean(z), str, str2, uri});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("url_parameters", uri.getQuery());
        hashMap.put("from_channel", str);
        if (z) {
            str3 = "true";
        } else {
            str3 = "false";
        }
        hashMap.put("ab_ispop", str3);
        hashMap.put("biz_orderids", str2);
        a(hashMap);
    }

    public static boolean f(Intent intent, zmj zmjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a6f63e4", new Object[]{intent, zmjVar})).booleanValue();
        }
        if (!vht.g()) {
            TLog.logi(sht.TLOG_MODULE, "wht", "路由拦截开关关闭");
            return true;
        }
        Uri data = intent.getData();
        if (data != null) {
            if (data.isOpaque()) {
                TLog.logi(sht.TLOG_MODULE, "wht", "uri opaque: " + data);
                return true;
            }
            data.getScheme();
            String host = data.getHost();
            String path = data.getPath();
            String queryParameter = data.getQueryParameter("pagetype");
            String queryParameter2 = data.getQueryParameter("fromchannel");
            List<String> e = vht.e();
            String d = vht.d();
            if (("pages-fast.m.taobao.com".equals(host) || TCC_PAY_SUCCESS_HOST_PRE.equals(host)) && e.size() > 0 && e.contains(path) && !TextUtils.isEmpty(d) && TextUtils.equals(queryParameter, "pop") && !TextUtils.isEmpty(queryParameter2)) {
                TLog.logi(sht.TLOG_MODULE, "wht", "拦截到支付成功页页面！");
                String queryParameter3 = data.getQueryParameter("orderIds");
                if (!rht.b(queryParameter2)) {
                    TLog.logi(sht.TLOG_MODULE, "wht", "AB开关关闭");
                    e(false, queryParameter2, queryParameter3, data);
                    return true;
                }
                e(true, queryParameter2, queryParameter3, data);
                c(queryParameter2, zmjVar);
                if (g(d, queryParameter3, queryParameter2, zmjVar)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean g(String str, String str2, String str3, zmj zmjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("889453bc", new Object[]{str, str2, str3, zmjVar})).booleanValue();
        }
        try {
            plq plqVar = new plq();
            plqVar.q(1.0f);
            plqVar.o(PopGravity.CENTER);
            Uri build = Uri.parse(str).buildUpon().appendQueryParameter("orderIds", str2).appendQueryParameter("fromchannel", str3).appendQueryParameter("popid", plqVar.f()).build();
            TLog.logi(sht.TLOG_MODULE, "wht", "展示支付成功浮层, url: " + build.toString());
            plqVar.w(zmjVar.d().getApplicationContext(), build.toString(), null);
            return true;
        } catch (Exception e) {
            TLog.loge(sht.TLOG_MODULE, "wht", "打开pop失败: " + e);
            return false;
        }
    }
}
