package com.taobao.msgnotification;

import android.app.Activity;
import android.app.NotificationChannel;
import android.content.Context;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.content.ContextCompat;
import com.alibaba.ut.abtest.UTABTest;
import com.alibaba.ut.abtest.Variation;
import com.alibaba.ut.abtest.VariationSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.utl.UTMini;
import com.taobao.agoo.TaobaoRegister;
import com.taobao.message.notification.util.BrandUtil;
import com.taobao.message.notification.util.EnvUtil;
import com.taobao.orange.OrangeConfig;
import com.taobao.runtimepermission.api.TBRunTimePermission;
import com.taobao.statistic.TBS;
import com.taobao.tao.Globals;
import com.taobao.tao.log.TLog;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;
import tb.aig;
import tb.e73;
import tb.fi0;
import tb.hi0;
import tb.ii0;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class NotificationIniter {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "NotificationIniter";
    private static String channelConfig = "{\n\t\"groupName\": [{\n\t\t\"name\": \"重要通知\",\n\t\t\"id\": \"0001_importance\"\n\t}, {\n\t\t\"name\": \"普通通知\",\n\t\t\"id\": \"0002_normal\"\n\t}],\n\t\"重要通知\": [{\n\t\t\"id\": \"high_custom_3\",\n\t\t\"name\": \"店铺客服接待\",\n\t\t\"importance\": 4\n\t},{\n\t\t\"id\": \"high_custom_1\",\n\t\t\"name\": \"交易物流通知\",\n\t\t\"importance\": 3\n\t},{\n\t\t\"id\": \"high_custom_2\",\n\t\t\"name\": \"淘宝好友聊天\",\n\t\t\"importance\": 4\n\t},{\n\t\t\"id\": \"high_custom_4\",\n\t\t\"name\": \"服务通知\",\n\t\t\"importance\": 4\n\t}],    \n\t\"普通通知\": [ {\n\t\t\"id\": \"group_im\",\n\t\t\"name\": \"群聊消息\",\n\t\t\"importance\": 3\n\t},{\n\t\t\"id\": \"marketing\",\n\t\t\"name\": \"活动优惠\",\n\t\t\"importance\": 3\n\t}, {\n\t\t\"id\": \"interactivity\",\n\t\t\"name\": \"互动消息\",\n\t\t\"importance\": 3\n\t}, {\n\t\t\"id\": \"taobao_official\",\n\t\t\"name\": \"淘宝团队通知\",\n\t\t\"importance\": 3\n\t}, {\n\t\t\"id\": \"taobao_playground\",\n\t\t\"name\": \"淘宝乐园消息\",\n\t\t\"importance\": 3\n\t}, {\n\t\t\"id\": \"others\",\n\t\t\"name\": \"其他\",\n\t\t\"importance\": 2\n\t}]\n\t\n}";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f11145a;
        public final /* synthetic */ Activity b;
        public final /* synthetic */ String c;
        public final /* synthetic */ boolean d;

        public a(boolean z, Activity activity, String str, boolean z2) {
            this.f11145a = z;
            this.b = activity;
            this.c = str;
            this.d = z2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (this.f11145a) {
                Activity activity = this.b;
                hi0.d(activity, "pushIniter_" + this.c, this.d ? 4 : 5);
            } else {
                TLog.loge(NotificationIniter.TAG, "requestPermissions has been DENIED");
            }
        }
    }

    public static void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{context});
        } else {
            initChannel(context);
        }
    }

    public static void initChannel(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c711142e", new Object[]{context});
            return;
        }
        if (fi0.getChannelSwitch()) {
            TLog.logd(TAG, "initChannelV2");
            TLog.loge(TAG, "initChannelV2");
            initChannelV2(context);
        }
        requestNotificationPermission();
        BrandUtil.getInstance();
        if (BrandUtil.isOPPO() && Build.VERSION.SDK_INT >= 26) {
            AudioAttributes build = new AudioAttributes.Builder().setUsage(5).build();
            NotificationChannel a2 = aig.a("taobao_agoo_channel_id", "消息", 4);
            a2.setDescription(fi0.NOTIFICATION_CHANNEL_DESC);
            preCreateChannel(a2, build, context);
            NotificationChannel a3 = aig.a("taobao_agoo_channel_other_id", "其他通知", 3);
            a3.setDescription(fi0.NOTIFICATION_CHANNEL_OTHER_DESC);
            preCreateChannel(a3, build, context);
            NotificationChannel a4 = aig.a(fi0.NOTIFICATION_CHANNEL_PRIVATE_ID, fi0.NOTIFICATION_CHANNEL_PRIVATE_NAME, 3);
            a4.setDescription(fi0.NOTIFICATION_CHANNEL_PRIVATE_DESC);
            preCreateChannel(a4, build, context);
        }
    }

    public static String loadABStatusFromAB(String str, String str2, String str3) {
        Variation variation;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a6191497", new Object[]{str, str2, str3});
        }
        VariationSet activate = UTABTest.activate(str, str2);
        if (activate == null || (variation = activate.getVariation(str3)) == null) {
            return "";
        }
        return variation.getValueAsString("");
    }

    public static void preCreateChannel(NotificationChannel notificationChannel, AudioAttributes audioAttributes, Context context) {
        CharSequence name;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f8cc6b5", new Object[]{notificationChannel, audioAttributes, context});
        } else if (Build.VERSION.SDK_INT < 26 || context == null) {
            TLog.loge(TAG, "ctx is null");
        } else {
            String string = Globals.getApplication().getSharedPreferences("Agoo_AppStore", 4).getString(TaobaoRegister.PROPERTY_APP_NOTIFICATION_CUSTOM_SOUND, null);
            if (!TextUtils.isEmpty(string)) {
                notificationChannel.setSound(Uri.parse(string), audioAttributes);
            } else {
                notificationChannel.setSound(Uri.parse("android.resource://" + Globals.getApplication().getPackageName() + "/" + R.raw.sound_push), audioAttributes);
            }
            notificationChannel.enableLights(true);
            notificationChannel.enableVibration(true);
            notificationChannel.setShowBadge(true);
            notificationChannel.setLockscreenVisibility(0);
            notificationChannel.setVibrationPattern(fi0.VIBRATE);
            notificationChannel.setBypassDnd(true);
            ii0.g().e().createNotificationChannel(notificationChannel);
            StringBuilder sb = new StringBuilder();
            name = notificationChannel.getName();
            sb.append((Object) name);
            sb.append("init finished");
            TLog.loge(TAG, sb.toString());
        }
    }

    private static void requestNotificationPermission() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88161290", new Object[0]);
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            StringBuilder sb = new StringBuilder();
            int i = Build.VERSION.SDK_INT;
            sb.append(i);
            sb.append("");
            hashMap.put("sdkVersion", sb.toString());
            boolean isPermissionSingleTime = isPermissionSingleTime(hashMap);
            String str = "0";
            hashMap.put("isPermissionSingleTime", isPermissionSingleTime ? "1" : str);
            if (i >= 33) {
                Activity topActivity = EnvUtil.getTopActivity();
                if (topActivity == null) {
                    hashMap.put("topActivity", str);
                    TLog.loge(TAG, "topActivity is null");
                    return;
                }
                hashMap.put("topActivity", "1");
                boolean z = ContextCompat.checkSelfPermission(topActivity, hi0.POST_NOTIFICATIONS_PERMISSION) != 0;
                String valueOf = String.valueOf(System.currentTimeMillis());
                hashMap.put("isHavePermission", z ? str : "1");
                if (z) {
                    str = "1";
                }
                hashMap.put(TBRunTimePermission.REQUEST_PERMISSION_API_NAME, str);
                hashMap.put("requestTime", valueOf);
                topActivity.runOnUiThread(new a(z, topActivity, valueOf, isPermissionSingleTime));
            }
            EnvUtil.UTPermissionShow(hashMap, 0, null);
        } catch (Throwable unused) {
        }
    }

    private static boolean isPermissionSingleTime(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("53329b62", new Object[]{hashMap})).booleanValue();
        }
        String config = OrangeConfig.getInstance().getConfig("mpm_business_switch", "isPermissionSingleTime", "");
        if (!TextUtils.isEmpty(config)) {
            hashMap.put("useOrange", config);
            return "true".equals(config);
        }
        String loadABStatusFromAB = loadABStatusFromAB("AB_", "202312141543_5034", "status");
        hashMap.put("useAbtest", loadABStatusFromAB);
        return !TextUtils.isEmpty(loadABStatusFromAB) && loadABStatusFromAB.contains("open");
    }

    static {
        t2o.a(588251152);
    }

    public static void initChannelV2(Context context) {
        int importance;
        CharSequence name;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9ac4fd2", new Object[]{context});
        } else if (Build.VERSION.SDK_INT >= 26 && BrandUtil.isOPPO()) {
            ArrayList arrayList = new ArrayList();
            AudioAttributes build = new AudioAttributes.Builder().setUsage(5).build();
            try {
                JSONObject jSONObject = new JSONObject(channelConfig);
                JSONArray optJSONArray = jSONObject.optJSONArray("groupName");
                for (int i = 0; i < optJSONArray.length(); i++) {
                    JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                    String string = jSONObject2.getString("name");
                    String string2 = jSONObject2.getString("id");
                    fi0.createNotificationGroup(string, string2);
                    JSONArray optJSONArray2 = jSONObject.optJSONArray(string);
                    for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                        JSONObject jSONObject3 = optJSONArray2.getJSONObject(i2);
                        String optString = jSONObject3.optString("id");
                        String optString2 = jSONObject3.optString("name");
                        int i3 = jSONObject3.getInt("importance");
                        NotificationChannel notificationChannel = fi0.getNotificationChannel(optString);
                        if (notificationChannel == null) {
                            e73.a();
                            NotificationChannel a2 = aig.a(optString, optString2, i3);
                            a2.setGroup(string2);
                            preCreateChannel(a2, build, context);
                        } else {
                            importance = notificationChannel.getImportance();
                            if (importance == 0) {
                                name = notificationChannel.getName();
                                arrayList.add(String.valueOf(name));
                            }
                        }
                    }
                }
                if (arrayList.size() > 0) {
                    StringBuilder sb = new StringBuilder();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        sb.append((String) it.next());
                        sb.append("-");
                    }
                    TLog.loge(TAG, " close channel name  " + ((Object) sb));
                    TBS.Ext.commitEvent(UTMini.PAGE_AGOO, 19999, "channelInfo", null, null, null, "closeChannelName=" + ((Object) sb));
                }
            } catch (Throwable th) {
                th.printStackTrace();
                Log.e(TAG, " error " + Log.getStackTraceString(th));
            }
        }
    }
}
