package tb;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Looper;
import android.text.TextUtils;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.stdpop.api.PopGravity;
import com.taobao.tao.log.TLog;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class kyt {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TMCS_PAY_SUCCESS_HOST = "pages.tmall.com";
    public static final String TMCS_PAY_SUCCESS_HOST_PRE = "pre-wormhole.wapa.tmall.com";

    /* renamed from: a  reason: collision with root package name */
    public static final List<String> f23007a = Arrays.asList("com.taobao.android.detail2.core.framework.NewDetailActivity", "com.taobao.android.detail.wrapper.activity.DetailActivity", "com.taobao.android.detail.alittdetail.TTDetailActivity");
    public static final List<String> b = Arrays.asList("/wow/an/base/paysuccess/19004fe3174", "/wow/an/base/paysuccess/18cf234d11b");
    public static Class<?> c = null;
    public static Method d = null;
    public static Field e = null;

    public static void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d82b8928", new Object[]{map});
        } else {
            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder("Page_Extend", 2201, "Page_SMPaySucc_Middleware_Expo", null, null, map).build());
        }
    }

    public static void b(String str) {
        List<String> d2 = d(str);
        if (d2 == null || d2.isEmpty()) {
            TLog.logi(gyt.TLOG_MODULE, "kyt", "removedActivities为空, 没有需要手动关闭的activity。fromChannel: " + str);
            return;
        }
        try {
            if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                TLog.logi(gyt.TLOG_MODULE, "kyt", "非主线程，不处理中间页");
                return;
            }
            if (c == null) {
                c = Class.forName(ProcessUtils.ACTIVITY_THREAD);
            }
            if (d == null) {
                Method declaredMethod = c.getDeclaredMethod(ProcessUtils.CURRENT_ACTIVITY_THREAD, new Class[0]);
                d = declaredMethod;
                declaredMethod.setAccessible(true);
            }
            if (e == null) {
                Field declaredField = c.getDeclaredField("mActivities");
                e = declaredField;
                declaredField.setAccessible(true);
            }
            for (Object obj : ((Map) e.get(d.invoke(null, new Object[0]))).values()) {
                Field declaredField2 = obj.getClass().getDeclaredField("activity");
                declaredField2.setAccessible(true);
                Activity activity = (Activity) declaredField2.get(obj);
                if (d2.contains(activity.getComponentName().getClassName())) {
                    TLog.logi(gyt.TLOG_MODULE, "kyt", "手动关闭: " + activity.getComponentName().getClassName());
                    activity.finish();
                }
            }
        } catch (Throwable th) {
            TLog.loge(gyt.TLOG_MODULE, "kyt", "关闭中间页失败：" + th);
        }
    }

    public static void c(String str, zmj zmjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3395aa74", new Object[]{str, zmjVar});
            return;
        }
        if (TextUtils.equals(str, wvl.a())) {
            TLog.logi(gyt.TLOG_MODULE, "kyt", "直播间场景，发送广播、关闭中间页");
            LocalBroadcastManager.getInstance(zmjVar.d()).sendBroadcast(new Intent("TradePay.Event.livebag.close"));
        } else {
            TLog.logi(gyt.TLOG_MODULE, "kyt", "非直播间场景，关闭中间页");
        }
        Intent intent = new Intent("auraEventNotification");
        intent.putExtra("type", "pop");
        LocalBroadcastManager.getInstance(zmjVar.d()).sendBroadcast(intent);
        b(str);
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

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0089, code lost:
        if (r7.equals("sxltmcssearch") == false) goto L_0x0068;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.List<java.lang.String> d(java.lang.String r7) {
        /*
            r0 = 0
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = tb.kyt.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0015
            java.lang.String r3 = "b6f30c9"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r7
            java.lang.Object r7 = r2.ipc$dispatch(r3, r1)
            java.util.List r7 = (java.util.List) r7
            return r7
        L_0x0015:
            boolean r2 = android.text.TextUtils.isEmpty(r7)
            java.lang.String r3 = "kyt"
            java.lang.String r4 = "tmcs_nav_processor"
            r5 = 0
            if (r2 == 0) goto L_0x0028
            java.lang.String r7 = "fromChannel is null"
            com.taobao.tao.log.TLog.logi(r4, r3, r7)
            return r5
        L_0x0028:
            java.lang.String r2 = tb.wvl.e()
            if (r2 == 0) goto L_0x005d
            com.alibaba.fastjson.JSONObject r2 = com.alibaba.fastjson.JSON.parseObject(r2)     // Catch: all -> 0x0049
            if (r2 == 0) goto L_0x005d
            com.alibaba.fastjson.JSONArray r6 = r2.getJSONArray(r7)     // Catch: all -> 0x0049
            if (r6 == 0) goto L_0x005d
            com.alibaba.fastjson.JSONArray r7 = r2.getJSONArray(r7)     // Catch: all -> 0x0049
            java.lang.String r7 = r7.toJSONString()     // Catch: all -> 0x0049
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            java.util.List r7 = com.alibaba.fastjson.JSON.parseArray(r7, r0)     // Catch: all -> 0x0049
            return r7
        L_0x0049:
            r7 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "loadFinishedDialogActivities, onError: "
            r0.<init>(r1)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            com.taobao.tao.log.TLog.loge(r4, r3, r7)
            return r5
        L_0x005d:
            r7.hashCode()
            r2 = -1
            int r3 = r7.hashCode()
            switch(r3) {
                case 478330232: goto L_0x0082;
                case 989204668: goto L_0x0076;
                case 1850222064: goto L_0x006a;
                default: goto L_0x0068;
            }
        L_0x0068:
            r0 = -1
            goto L_0x008c
        L_0x006a:
            java.lang.String r0 = "todaycrazy"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x0074
            goto L_0x0068
        L_0x0074:
            r0 = 2
            goto L_0x008c
        L_0x0076:
            java.lang.String r0 = "recommend"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x0080
            goto L_0x0068
        L_0x0080:
            r0 = 1
            goto L_0x008c
        L_0x0082:
            java.lang.String r1 = "sxltmcssearch"
            boolean r7 = r7.equals(r1)
            if (r7 != 0) goto L_0x008c
            goto L_0x0068
        L_0x008c:
            switch(r0) {
                case 0: goto L_0x0090;
                case 1: goto L_0x0090;
                case 2: goto L_0x0090;
                default: goto L_0x008f;
            }
        L_0x008f:
            return r5
        L_0x0090:
            java.util.List<java.lang.String> r7 = tb.kyt.f23007a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.kyt.d(java.lang.String):java.util.List");
    }

    public static boolean f(Intent intent, zmj zmjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3ebca67", new Object[]{intent, zmjVar})).booleanValue();
        }
        if (!wvl.f()) {
            TLog.logi(gyt.TLOG_MODULE, "kyt", "路由拦截开关关闭");
            return true;
        }
        Uri data = intent.getData();
        if (data != null) {
            if (data.isOpaque()) {
                TLog.logi(gyt.TLOG_MODULE, "kyt", "uri opaque: " + data);
                return true;
            }
            data.getScheme();
            String host = data.getHost();
            String path = data.getPath();
            String queryParameter = data.getQueryParameter("pagetype");
            String queryParameter2 = data.getQueryParameter("fromchannel");
            List<String> d2 = wvl.d();
            String c2 = wvl.c();
            if ((TMCS_PAY_SUCCESS_HOST.equals(host) || TMCS_PAY_SUCCESS_HOST_PRE.equals(host)) && d2.size() > 0 && d2.contains(path) && !TextUtils.isEmpty(c2) && TextUtils.equals(queryParameter, "pop") && !TextUtils.isEmpty(queryParameter2)) {
                TLog.logi(gyt.TLOG_MODULE, "kyt", "拦截到支付成功页页面！");
                String queryParameter3 = data.getQueryParameter("bizOrderIds");
                if (!wvl.g(queryParameter2)) {
                    TLog.logi(gyt.TLOG_MODULE, "kyt", "AB开关关闭");
                    e(false, queryParameter2, queryParameter3, data);
                    return true;
                }
                e(true, queryParameter2, queryParameter3, data);
                c(queryParameter2, zmjVar);
                if (g(c2, queryParameter3, queryParameter2, zmjVar)) {
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
            Uri build = Uri.parse(str).buildUpon().appendQueryParameter("bizOrderIds", str2).appendQueryParameter("fromchannel", str3).appendQueryParameter("popid", plqVar.f()).build();
            TLog.logi(gyt.TLOG_MODULE, "kyt", "展示支付成功浮层, url: " + build.toString());
            plqVar.w(zmjVar.d().getApplicationContext(), build.toString(), null);
            return true;
        } catch (Exception e2) {
            TLog.loge(gyt.TLOG_MODULE, "kyt", "打开pop失败: " + e2);
            return false;
        }
    }
}
