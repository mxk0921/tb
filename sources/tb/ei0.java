package tb;

import android.app.NotificationChannel;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.common.Constants;
import com.taobao.accs.utl.UTMini;
import com.taobao.agoo.TaobaoRegister;
import com.taobao.message.notification.banner.support.MarketingInnerNotificationAdapter;
import com.taobao.message.notification.system.base.BasicLocalPush;
import com.taobao.message.notification.system.base.IOldAgooNotification;
import com.taobao.message.notification.util.BrandUtil;
import com.taobao.message.notification.util.EnvUtil;
import com.taobao.msgnotification.mode.MsgNotficationDTO;
import com.taobao.orange.OrangeConfig;
import com.taobao.statistic.TBS;
import com.taobao.tao.log.TLog;
import java.util.HashMap;
import java.util.Map;
import org.android.agoo.common.AgooConstants;
import org.android.agoo.intent.IntentUtil;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public abstract class ei0 extends dw implements IOldAgooNotification {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f18590a;
    public final MsgNotficationDTO b;
    public final Bundle c;
    public final Intent d;

    static {
        t2o.a(588251157);
        t2o.a(610271316);
    }

    public ei0(Context context, MsgNotficationDTO msgNotficationDTO, Bundle bundle, Intent intent) {
        this.f18590a = context;
        this.b = msgNotficationDTO;
        bundle = bundle == null ? new Bundle() : bundle;
        this.c = bundle;
        this.d = intent;
        if (intent != null) {
            String stringExtra = intent.getStringExtra("notifyContentTargetUrl");
            if (!TextUtils.isEmpty(stringExtra)) {
                bundle.putString("notifyContentTargetUrl", stringExtra);
            }
            Bundle bundleExtra = intent.getBundleExtra("notifyContentParamBundleKey");
            if (bundleExtra != null) {
                bundle.putBundle("notifyContentParamBundleKey", bundleExtra);
            }
        }
    }

    public static Intent g(Context context, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("e0ca68d2", new Object[]{context, bundle});
        }
        String string = bundle.getString(AgooConstants.MESSAGE_BODY);
        TLog.loge(BasicLocalPush.TAG, " agooBody :" + string);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setPackage(context.getApplicationInfo().packageName);
        intent.setData(Uri.parse("http://tb.cn/n/ww/notifyjump"));
        intent.setFlags(335544320);
        intent.putExtras(bundle);
        return intent;
    }

    public static Intent h(Context context, Bundle bundle) {
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("e502ac63", new Object[]{context, bundle});
        }
        Intent createComandIntent = IntentUtil.createComandIntent(context, AgooConstants.AGOO_COMMAND_MESSAGE_DELETED);
        if ("true".equals(OrangeConfig.getInstance().getConfig("mpm_business_switch", "isEnableChannelDeleteMessage", "false"))) {
            createComandIntent.setAction(createComandIntent.getAction() + ".channel");
        }
        if (createComandIntent != null) {
            createComandIntent.putExtras(bundle);
            createComandIntent.setPackage("com.taobao.taobao");
        } else {
            if (bundle != null) {
                try {
                    string = bundle.getString("id");
                } catch (Exception e) {
                    TLog.loge(BasicLocalPush.TAG, Log.getStackTraceString(e));
                }
            } else {
                string = "";
            }
            TBS.Ext.commitEvent(UTMini.PAGE_AGOO, 19999, "deleteIntent_null_id", null, null, null, "messageId=" + string);
            AppMonitor.Counter.commit("accs", "deleteIntent_null_id", string, vu3.b.GEO_NOT_SUPPORT);
            TLog.loge("agoo_push", "deleteIntent is null");
        }
        return createComandIntent;
    }

    public static /* synthetic */ Object ipc$super(ei0 ei0Var, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1865040893:
                super.onShow();
                return null;
            case -1432119014:
                return new Integer(super.genPushRequestId());
            case -1304581520:
                return super.getNotificationChannel();
            case -893005340:
                return new Integer(super.getImportance());
            case -423164667:
                return super.getCategory();
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/msgnotification/local/push/AgooNotification");
        }
    }

    @Override // com.taobao.message.notification.system.base.BasicLocalPush
    public Intent genClickIntent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("d78a2358", new Object[]{this});
        }
        return g(this.f18590a, this.c);
    }

    @Override // com.taobao.message.notification.system.base.BasicLocalPush
    public Intent genDeleteIntent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("4f8922b5", new Object[]{this});
        }
        return h(this.f18590a, this.c);
    }

    @Override // com.taobao.message.notification.system.base.BasicLocalPush
    public int genPushRequestId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("aaa3991a", new Object[]{this})).intValue();
        }
        int genPushRequestId = super.genPushRequestId();
        Intent intent = this.d;
        return intent != null ? intent.getIntExtra("notifyContentIntentRequestCode", genPushRequestId) : genPushRequestId;
    }

    @Override // com.taobao.message.notification.system.base.BasicLocalPush, com.taobao.message.notification.system.base.ILocalPush
    public String getCategory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e6c70505", new Object[]{this});
        }
        Bundle bundle = this.c;
        if (bundle == null || !bundle.containsKey("category")) {
            return super.getCategory();
        }
        return this.c.getString("category");
    }

    @Override // com.taobao.message.notification.system.base.BasicLocalPush, com.taobao.message.notification.system.base.ILocalPush
    public int getImportance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cac5d1e4", new Object[]{this})).intValue();
        }
        Bundle bundle = this.c;
        if (bundle == null || !bundle.containsKey("importance")) {
            return super.getImportance();
        }
        return this.c.getInt("importance");
    }

    @Override // com.taobao.message.notification.system.base.BasicLocalPush, com.taobao.message.notification.system.base.ILocalPush
    public Pair<String, ad2> getLargeIconURL() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("790c3d42", new Object[]{this});
        }
        MsgNotficationDTO msgNotficationDTO = this.b;
        if (msgNotficationDTO == null || TextUtils.isEmpty(msgNotficationDTO.localPushRightImg)) {
            str = null;
        } else {
            str = this.b.localPushRightImg;
        }
        return Pair.create(str, null);
    }

    @Override // com.taobao.message.notification.system.base.IOldAgooNotification
    public int getMergeType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("461bf356", new Object[]{this})).intValue();
        }
        MsgNotficationDTO msgNotficationDTO = this.b;
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
        Bundle bundle = this.c;
        if (bundle != null) {
            return bundle.getString("id");
        }
        return "";
    }

    @Override // tb.dw, com.taobao.message.notification.system.base.BasicLocalPush, com.taobao.message.notification.system.base.ILocalPush
    public NotificationChannel getNotificationChannel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return u8k.a(ipChange.ipc$dispatch("b23daa70", new Object[]{this}));
        }
        NotificationChannel searchNotificationChannel = fi0.searchNotificationChannel(this.b.channelId);
        if (searchNotificationChannel == null) {
            return super.getNotificationChannel();
        }
        return searchNotificationChannel;
    }

    public boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("47c83667", new Object[]{this})).booleanValue();
        }
        if (this.b.closeLocalPush == 1) {
            return true;
        }
        return false;
    }

    @Override // com.taobao.message.notification.system.base.BasicLocalPush
    public boolean isEnabled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56f023c2", new Object[]{this})).booleanValue();
        }
        return BrandUtil.getInstance().shouldNotify();
    }

    @Override // com.taobao.message.notification.system.base.IOldAgooNotification
    public void setContent(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52a9c508", new Object[]{this, str});
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

    @Override // com.taobao.message.notification.system.base.BasicLocalPush
    public void onShow() {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90d5bc03", new Object[]{this});
            return;
        }
        super.onShow();
        ii0.g().j(getMessageId(), getRequestId());
        try {
            Bundle bundle = this.c;
            if (bundle != null) {
                str = bundle.getString("id");
            } else {
                str = "";
            }
            AppMonitor.Counter.commit("accs", "agoo_notify", "", vu3.b.GEO_NOT_SUPPORT);
            AppMonitor.Counter.commit("accs", "agoo_notify_id", str, vu3.b.GEO_NOT_SUPPORT);
            TBS.Ext.commitEvent(UTMini.PAGE_AGOO, 19999, "agoo_notify_id", null, null, null, "messageId=" + str);
            TLog.loge("agoo_push", "agoo_notify_id, messageId=" + str);
            TaobaoRegister.exposureMessage(this.f18590a, str, "");
            String string = this.c.getString("show_type");
            HashMap hashMap = new HashMap();
            if (this.c.getBoolean("is_agoo_notify")) {
                str2 = "true";
            } else {
                str2 = "false";
            }
            hashMap.put("is_agoo_notify", str2);
            hashMap.put("show_type", string);
            hashMap.put("pushType", getClass().getSimpleName());
            hashMap.put("isBackground", String.valueOf(EnvUtil.isAppBackGround()));
            try {
                hashMap.put("isMainProcess", String.valueOf(xd0.h(EnvUtil.getApplication())));
            } catch (Throwable unused) {
            }
            HashMap hashMap2 = new HashMap();
            JSONObject jSONObject = JSON.parseObject(this.c.getString(AgooConstants.MESSAGE_BODY)).getJSONObject(Constants.KEY_EXTS);
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
                            hashMap.putAll(hashMap2);
                        }
                    } catch (Throwable unused2) {
                    }
                }
            }
            EnvUtil.UTShow(EnvUtil.createUTData("agoo^0^" + str, str, null, "0", null, null, hashMap), 0, null);
        } catch (Exception e) {
            y7t.a("AgooNotification", "reportNotify,error=" + e);
        }
    }
}
