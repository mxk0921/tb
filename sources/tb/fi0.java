package tb;

import android.app.Application;
import android.app.NotificationChannel;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.common.Constants;
import com.taobao.accs.utl.UTMini;
import com.taobao.agoo.TaobaoRegister;
import com.taobao.message.notification.banner.support.MarketingInnerNotificationAdapter;
import com.taobao.message.notification.base.VibratorAndMediaManager;
import com.taobao.message.notification.system.base.IOldAgooNotification;
import com.taobao.message.notification.util.EnvUtil;
import com.taobao.msgnotification.Constants.BizSoundType;
import com.taobao.msgnotification.mode.MsgNotficationDTO;
import com.taobao.orange.OrangeConfig;
import com.taobao.statistic.TBS;
import com.taobao.tao.Globals;
import com.taobao.tao.log.TLog;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import org.android.agoo.common.AgooConstants;
import tb.vu3;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public abstract class fi0 implements IOldAgooNotification {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String NOTIFICATION_CHANNEL_DESC = "taobao_agoo_channel_push";
    public static final String NOTIFICATION_CHANNEL_ID = "taobao_agoo_channel_id";
    public static final String NOTIFICATION_CHANNEL_NAME = "消息";
    public static final String NOTIFICATION_CHANNEL_OTHER_DESC = "其他类型的通知";
    public static final String NOTIFICATION_CHANNEL_OTHER_ID = "taobao_agoo_channel_other_id";
    public static final String NOTIFICATION_CHANNEL_OTHER_NAME = "其他通知";
    public static final String NOTIFICATION_CHANNEL_PRIVATE_DESC = "来自当前应用的平台通知消息";
    public static final String NOTIFICATION_CHANNEL_PRIVATE_ID = "agoo_channel_private_id";
    public static final String NOTIFICATION_CHANNEL_PRIVATE_NAME = "应用通知";
    public static final String NOTI_DEFAULT_PRIORITY = "NOTI_DEFAULT_PRIORITY";
    public static final String ORANGE_CONFIG_BUSINESS = "mpm_business_switch";
    private String TAG = "AgooNotification";
    public NotificationCompat.Builder mBuilder;
    public Bundle mExtras;
    public MsgNotficationDTO mMsgData;
    public Intent mParam;
    public static Random notificationRandom = new Random(100000);
    public static long[] VIBRATE = {0, 140, 80, 140};
    public static Context mContext = null;

    static {
        t2o.a(588251155);
        t2o.a(610271316);
    }

    public fi0(Context context, MsgNotficationDTO msgNotficationDTO, Bundle bundle, Intent intent) {
        String id;
        mContext = context;
        this.mMsgData = msgNotficationDTO;
        this.mExtras = bundle;
        this.mParam = intent;
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannel createChannel = createChannel();
            Application application = Globals.getApplication();
            id = createChannel.getId();
            NotificationCompat.Builder builder = new NotificationCompat.Builder(application, id);
            this.mBuilder = builder;
            builder.setPriority(1);
        } else {
            NotificationCompat.Builder builder2 = new NotificationCompat.Builder(Globals.getApplication());
            this.mBuilder = builder2;
            builder2.setPriority(1);
        }
        try {
            if (!EnvUtil.isAppBackGround(this.TAG)) {
                this.mBuilder.setPriority(0);
                TLog.loge(this.TAG, "use default priority");
            }
        } catch (Throwable th) {
            TLog.loge(this.TAG, Log.getStackTraceString(th));
        }
        this.mBuilder.setVisibility(1);
        this.mBuilder.setFullScreenIntent(null, true);
        this.mBuilder.setWhen(System.currentTimeMillis());
    }

    public static void createNotificationGroup(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1368b8d3", new Object[]{str, str2});
        } else if (Build.VERSION.SDK_INT >= 26) {
            ii0.g().e().createNotificationChannelGroup(di0.a(str2, str));
        }
    }

    public static boolean getChannelSwitch() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f9823a6c", new Object[0])).booleanValue();
        }
        return TextUtils.equals("1", OrangeConfig.getInstance().getConfig("mpm_data_switch", "message_push_channel_switch", "1"));
    }

    public static NotificationChannel getNotificationChannel(String str) {
        NotificationChannel notificationChannel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return u8k.a(ipChange.ipc$dispatch("882fe3fa", new Object[]{str}));
        }
        if (Build.VERSION.SDK_INT < 26) {
            return null;
        }
        notificationChannel = ii0.g().e().getNotificationChannel(str);
        return notificationChannel;
    }

    public static boolean isVibrate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5aca46f0", new Object[0])).booleanValue();
        }
        if (((AudioManager) Globals.getApplication().getSystemService("audio")).getRingerMode() != 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
        r0 = tb.ii0.g().e().getNotificationChannels();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.app.NotificationChannel searchNotificationChannel(java.lang.String r4) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = tb.fi0.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0017
            java.lang.String r1 = "1da799e8"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r4
            java.lang.Object r4 = r0.ipc$dispatch(r1, r2)
            android.app.NotificationChannel r4 = tb.u8k.a(r4)
            return r4
        L_0x0017:
            boolean r0 = com.taobao.message.notification.util.BrandUtil.isXiaoMi()
            if (r0 != 0) goto L_0x0023
            boolean r0 = com.taobao.message.notification.util.BrandUtil.isOPPO()
            if (r0 == 0) goto L_0x005a
        L_0x0023:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L_0x005a
            tb.ii0 r0 = tb.ii0.g()
            android.app.NotificationManager r0 = r0.e()
            java.util.List r0 = tb.bi0.a(r0)
            if (r0 == 0) goto L_0x005a
            int r1 = r0.size()
            if (r1 <= 0) goto L_0x005a
            java.util.Iterator r0 = r0.iterator()
        L_0x0041:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x005a
            java.lang.Object r1 = r0.next()
            android.app.NotificationChannel r1 = tb.u8k.a(r1)
            java.lang.String r2 = tb.l42.a(r1)
            boolean r2 = r2.contains(r4)
            if (r2 == 0) goto L_0x0041
            return r1
        L_0x005a:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.fi0.searchNotificationChannel(java.lang.String):android.app.NotificationChannel");
    }

    @Override // com.taobao.message.notification.system.base.IOldAgooNotification
    public int getMergeType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("461bf356", new Object[]{this})).intValue();
        }
        MsgNotficationDTO msgNotficationDTO = this.mMsgData;
        if (msgNotficationDTO != null) {
            return msgNotficationDTO.mergeType;
        }
        return 0;
    }

    @Override // com.taobao.message.notification.system.base.IOldAgooNotification
    public String getMessageId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ff27d1ad", new Object[]{this});
        }
        Bundle bundle = this.mExtras;
        if (bundle != null) {
            return bundle.getString("id");
        }
        return "";
    }

    public Intent getParam() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("3b75c375", new Object[]{this});
        }
        return this.mParam;
    }

    @Override // com.taobao.message.notification.system.base.IOldAgooNotification
    public void setContent(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52a9c508", new Object[]{this, str});
        }
    }

    public void setTicker(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c85ab9d", new Object[]{this, str});
        }
    }

    @Override // com.taobao.message.notification.system.base.IOldAgooNotification
    public void setTitle(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c820927", new Object[]{this, str});
        }
    }

    @Override // com.taobao.message.notification.system.base.IOldAgooNotification
    public void setUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1dea87e", new Object[]{this, str});
        }
    }

    private NotificationChannel createChannel() {
        BizSoundType bizSoundType;
        NotificationChannel createChannelV2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return u8k.a(ipChange.ipc$dispatch("3427d1f5", new Object[]{this}));
        }
        if (getChannelSwitch() && (createChannelV2 = createChannelV2(this.mMsgData.channelId)) != null && !BizSoundType.HONGBAO.getType().equals(this.mMsgData.sound)) {
            return createChannelV2;
        }
        if (Build.VERSION.SDK_INT < 26) {
            return null;
        }
        NotificationChannel a2 = aig.a("taobao_agoo_channel_id", "消息", 4);
        a2.setDescription(NOTIFICATION_CHANNEL_DESC);
        try {
            if (!EnvUtil.isAppBackGround(this.TAG)) {
                e73.a();
                a2 = aig.a("taobao_agoo_channel_other_id", "其他通知", 3);
                a2.setDescription(NOTIFICATION_CHANNEL_OTHER_DESC);
                TLog.loge(this.TAG, "use  IMPORTANCE_DEFAULT");
            }
        } catch (Throwable th) {
            TLog.loge(this.TAG, Log.getStackTraceString(th));
        }
        String string = mContext.getSharedPreferences("Agoo_AppStore", 4).getString(TaobaoRegister.PROPERTY_APP_NOTIFICATION_CUSTOM_SOUND, null);
        AudioAttributes build = new AudioAttributes.Builder().setUsage(5).build();
        if (!TextUtils.isEmpty(string)) {
            a2.setSound(Uri.parse(string), build);
        } else if (PreferenceManager.getDefaultSharedPreferences(Globals.getApplication()).getBoolean(VibratorAndMediaManager.RINGON, true) && EnvUtil.isAppBackGround(this.TAG)) {
            if (BizSoundType.HONGBAO.getType().equals(this.mMsgData.sound)) {
                e73.a();
                a2 = aig.a("taobao_agoo_channel_id_" + bizSoundType.getType(), "消息_" + bizSoundType.getType(), 4);
                a2.setSound(Uri.parse("android.resource://" + Globals.getApplication().getPackageName() + "/" + R.raw.push_hongbao), build);
            } else {
                a2.setSound(Uri.parse("android.resource://" + Globals.getApplication().getPackageName() + "/" + R.raw.sound_push), build);
            }
        }
        a2.enableLights(true);
        a2.enableVibration(true);
        a2.setShowBadge(true);
        a2.setLockscreenVisibility(0);
        a2.setVibrationPattern(VIBRATE);
        a2.setBypassDnd(true);
        ii0.g().e().createNotificationChannel(a2);
        return a2;
    }

    private NotificationChannel createChannelV2(String str) {
        BizSoundType bizSoundType;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return u8k.a(ipChange.ipc$dispatch("6634e41b", new Object[]{this, str}));
        }
        TLog.loge(this.TAG, " createChannelV2 " + str);
        if (Build.VERSION.SDK_INT < 26) {
            return null;
        }
        NotificationChannel searchNotificationChannel = searchNotificationChannel(str);
        if (searchNotificationChannel != null) {
            return searchNotificationChannel;
        }
        NotificationChannel notificationChannel = getNotificationChannel("taobao_agoo_channel_other_id");
        if (notificationChannel == null) {
            NotificationChannel a2 = aig.a("taobao_agoo_channel_other_id", "其他通知", 4);
            a2.setDescription(NOTIFICATION_CHANNEL_OTHER_DESC);
            String string = mContext.getSharedPreferences("Agoo_AppStore", 4).getString(TaobaoRegister.PROPERTY_APP_NOTIFICATION_CUSTOM_SOUND, null);
            AudioAttributes build = new AudioAttributes.Builder().setUsage(5).build();
            if (!TextUtils.isEmpty(string)) {
                a2.setSound(Uri.parse(string), build);
            } else if (PreferenceManager.getDefaultSharedPreferences(Globals.getApplication()).getBoolean(VibratorAndMediaManager.RINGON, true) && EnvUtil.isAppBackGround(this.TAG)) {
                if (BizSoundType.HONGBAO.getType().equals(this.mMsgData.sound)) {
                    e73.a();
                    a2 = aig.a("taobao_agoo_channel_id_" + bizSoundType.getType(), "消息_" + bizSoundType.getType(), 4);
                    a2.setSound(Uri.parse("android.resource://" + Globals.getApplication().getPackageName() + "/" + R.raw.push_hongbao), build);
                } else {
                    a2.setSound(Uri.parse("android.resource://" + Globals.getApplication().getPackageName() + "/" + R.raw.sound_push), build);
                }
            }
            a2.enableLights(true);
            a2.enableVibration(true);
            a2.setShowBadge(true);
            a2.setLockscreenVisibility(0);
            a2.setVibrationPattern(VIBRATE);
            a2.setBypassDnd(true);
            ii0.g().e().createNotificationChannel(a2);
        }
        return notificationChannel;
    }

    public void setVibrateSound(NotificationCompat.Builder builder, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70ecb699", new Object[]{this, builder, intent});
        } else if (Build.VERSION.SDK_INT < 26) {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(Globals.getApplication());
            if (intent == null) {
                if (defaultSharedPreferences.getBoolean(VibratorAndMediaManager.RINGON, true) && EnvUtil.isAppBackGround(this.TAG)) {
                    if (BizSoundType.HONGBAO.getType().equals(this.mMsgData.sound)) {
                        builder.setSound(Uri.parse("android.resource://" + Globals.getApplication().getPackageName() + "/" + R.raw.push_hongbao));
                    } else {
                        builder.setSound(Uri.parse("android.resource://" + Globals.getApplication().getPackageName() + "/" + R.raw.sound_push));
                    }
                }
                if (isVibrate() && defaultSharedPreferences.getBoolean(VibratorAndMediaManager.ISVIBRATIONON, false)) {
                    builder.setVibrate(VIBRATE);
                    return;
                }
                return;
            }
            String stringExtra = intent.getStringExtra("notifySound");
            String stringExtra2 = intent.getStringExtra("notifyVibrate");
            if (!TextUtils.isEmpty(stringExtra)) {
                builder.setSound(Uri.parse(stringExtra));
            } else if (defaultSharedPreferences.getBoolean(VibratorAndMediaManager.RINGON, true) && EnvUtil.isAppBackGround(this.TAG)) {
                if (BizSoundType.HONGBAO.getType().equals(this.mMsgData.sound)) {
                    builder.setSound(Uri.parse("android.resource://" + Globals.getApplication().getPackageName() + "/" + R.raw.push_hongbao));
                } else {
                    builder.setSound(Uri.parse("android.resource://" + Globals.getApplication().getPackageName() + "/" + R.raw.sound_push));
                }
            }
            if (!TextUtils.isEmpty(stringExtra2)) {
                builder.setDefaults(Integer.parseInt(stringExtra2));
            } else if (isVibrate() && defaultSharedPreferences.getBoolean(VibratorAndMediaManager.ISVIBRATIONON, false)) {
                builder.setVibrate(VIBRATE);
            }
        }
    }

    public void reportNotify() {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("386a8fa4", new Object[]{this});
            return;
        }
        try {
            Bundle bundle = this.mExtras;
            if (bundle != null) {
                str = bundle.getString("id");
            } else {
                str = "";
            }
            AppMonitor.Counter.commit("accs", "agoo_notify", "", vu3.b.GEO_NOT_SUPPORT);
            AppMonitor.Counter.commit("accs", "agoo_notify_id", str, vu3.b.GEO_NOT_SUPPORT);
            TBS.Ext.commitEvent(UTMini.PAGE_AGOO, 19999, "agoo_notify_id", null, null, null, "messageId=" + str);
            TLog.loge("agoo_push", "agoo_notify_id, messageId=" + str);
            TaobaoRegister.exposureMessage(mContext, str, "");
            String string = this.mExtras.getString("show_type");
            HashMap hashMap = new HashMap();
            if (this.mExtras.getBoolean("is_agoo_notify")) {
                str2 = "true";
            } else {
                str2 = "false";
            }
            hashMap.put("is_agoo_notify", str2);
            if (!TextUtils.isEmpty(string)) {
                hashMap.put("show_type", string);
            }
            HashMap<String, String> createUTData = EnvUtil.createUTData("agoo^0^" + str, str, null, "0", null, null, hashMap);
            if (p9k.c()) {
                createUTData.put("pushType", "old:".concat(getClass().getSimpleName()));
                createUTData.put("isBackground", String.valueOf(EnvUtil.isAppBackGround()));
                try {
                    createUTData.put("isMainProcess", String.valueOf(xd0.h(EnvUtil.getApplication())));
                } catch (Throwable unused) {
                }
                HashMap hashMap2 = new HashMap();
                JSONObject jSONObject = JSON.parseObject(this.mExtras.getString(AgooConstants.MESSAGE_BODY)).getJSONObject(Constants.KEY_EXTS);
                if (jSONObject != null) {
                    String string2 = jSONObject.getString(MarketingInnerNotificationAdapter.KEY_PUSHUTARGS);
                    if (!TextUtils.isEmpty(string2)) {
                        try {
                            for (Map.Entry<String, Object> entry : JSON.parseObject(string2).entrySet()) {
                                if (entry.getValue() instanceof String) {
                                    hashMap2.put(entry.getKey(), (String) entry.getValue());
                                }
                            }
                            if (!hashMap2.isEmpty()) {
                                createUTData.putAll(hashMap2);
                            }
                        } catch (Throwable unused2) {
                        }
                    }
                }
            }
            EnvUtil.UTShow(createUTData, 0, null);
        } catch (Exception e) {
            y7t.a("AgooNotification", "reportNotify,error=" + e);
        }
    }
}
