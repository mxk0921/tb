package tb;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.common.Constants;
import com.taobao.accs.utl.UTMini;
import com.taobao.message.notification.banner.support.MarketingInnerNotificationAdapter;
import com.taobao.message.notification.base.ABService;
import com.taobao.message.notification.base.EnvService;
import com.taobao.message.notification.system.base.IOldAgooNotification;
import com.taobao.message.notification.util.EnvUtil;
import com.taobao.msgnotification.mode.MsgNotficationDTO;
import com.taobao.msgnotification.notifications.BannerAssembleNotification;
import com.taobao.msgnotification.notifications.BannerPicNotification;
import com.taobao.msgnotification.notifications.PicPriceNotification;
import com.taobao.msgnotification.notifications.PicTextLargeExpandNotification;
import com.taobao.msgnotification.notifications.template.PicText;
import com.taobao.orange.OrangeConfig;
import com.taobao.statistic.TBS;
import com.taobao.tao.log.TLog;
import org.android.agoo.common.AgooConstants;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class gi0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(588251140);
    }

    public static void a(Bundle bundle, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59a496b9", new Object[]{bundle, str, str2});
            return;
        }
        try {
            JSONObject parseObject = JSON.parseObject(bundle.getString(AgooConstants.MESSAGE_BODY));
            JSONObject jSONObject = parseObject.getJSONObject(Constants.KEY_EXTS);
            if (jSONObject != null) {
                String string = jSONObject.getString(MarketingInnerNotificationAdapter.KEY_PUSHUTARGS);
                if (!TextUtils.isEmpty(string)) {
                    JSONObject parseObject2 = JSON.parseObject(string);
                    parseObject2.put(str, (Object) str2);
                    jSONObject.put(MarketingInnerNotificationAdapter.KEY_PUSHUTARGS, (Object) parseObject2.toString());
                } else {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(str, (Object) str2);
                    jSONObject.put(MarketingInnerNotificationAdapter.KEY_PUSHUTARGS, (Object) jSONObject2.toString());
                }
            }
            bundle.putString(AgooConstants.MESSAGE_BODY, parseObject.toString());
        } catch (Throwable unused) {
        }
    }

    public static IOldAgooNotification b(Intent intent, Intent intent2, Context context) {
        String str;
        IOldAgooNotification c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IOldAgooNotification) ipChange.ipc$dispatch("494572f5", new Object[]{intent, intent2, context});
        }
        if (intent == null) {
            return null;
        }
        MsgNotficationDTO a2 = bt4.a(intent);
        Bundle d = bt4.d(intent);
        String str2 = "";
        AppMonitor.Counter.commit("accs", "agoo_arrive_biz_id", d != null ? d.getString("id") : str2, vu3.b.GEO_NOT_SUPPORT);
        StringBuilder sb = new StringBuilder("messageId=");
        sb.append(d != null ? d.getString("id") : str2);
        TBS.Ext.commitEvent(UTMini.PAGE_AGOO, 19999, "agoo_arrive_biz_id", null, null, null, sb.toString());
        StringBuilder sb2 = new StringBuilder(" agoo_arrive_biz_id, messageId=");
        if (d != null) {
            str2 = d.getString("id");
        }
        sb2.append(str2);
        TLog.loge("agoo_push", sb2.toString());
        if (a2 == null) {
            return null;
        }
        try {
            TLog.loge("AgooNotficationFactory", "AgooNotificationFactory view_type=" + a2.view_type + ",data.personalImgUrl=" + a2.personalImgUrl);
            if (Build.VERSION.SDK_INT < 24) {
                a2.sceneTemplateId = 131004;
                PicText picText = new PicText();
                picText.title = a2.title;
                picText.subTitle = a2.text;
                picText.bigIcon = a2.personalImgUrl;
                a2.sceneTemplateData = new org.json.JSONObject(JSON.toJSONString(picText));
            }
            if (f()) {
                str = "1";
            } else {
                str = "0";
            }
            a(d, "newPushStyle", str);
            return (a2.sceneTemplateId == -1 || !e() || (c = c(context, a2, d, intent2)) == null) ? d(context, a2, d, intent2) : c;
        } catch (Throwable th) {
            y7t.a("AgooNotficationFactory", "showSystemMsg is error,e=" + th.toString());
            TLog.loge("AgooNotficationFactory", Log.getStackTraceString(th));
            return null;
        }
    }

    public static IOldAgooNotification c(Context context, MsgNotficationDTO msgNotficationDTO, Bundle bundle, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IOldAgooNotification) ipChange.ipc$dispatch("7c834c5", new Object[]{context, msgNotficationDTO, bundle, intent});
        }
        switch (msgNotficationDTO.sceneTemplateId) {
            case 131003:
                bundle.putString("show_type", "0");
                a(bundle, "templateId", String.valueOf(msgNotficationDTO.sceneTemplateId));
                TLog.loge("AgooNotficationFactory", "图片海报Banner");
                return new BannerPicNotification(context, msgNotficationDTO, bundle, intent);
            case 131004:
                bundle.putString("show_type", "2");
                a(bundle, "templateId", String.valueOf(msgNotficationDTO.sceneTemplateId));
                TLog.loge("AgooNotficationFactory", "图片加文本");
                return new t2m(context, msgNotficationDTO, bundle, intent);
            case 131005:
                bundle.putString("show_type", "3");
                a(bundle, "templateId", String.valueOf(msgNotficationDTO.sceneTemplateId));
                TLog.loge("AgooNotficationFactory", "图片加价格Banner");
                return new PicPriceNotification(context, msgNotficationDTO, bundle, intent);
            case 131006:
                bundle.putString("show_type", "1");
                a(bundle, "templateId", String.valueOf(msgNotficationDTO.sceneTemplateId));
                TLog.loge("AgooNotficationFactory", "组合海报Banner");
                return new BannerAssembleNotification(context, msgNotficationDTO, bundle, intent);
            case 131007:
                bundle.putString("show_type", "4");
                a(bundle, "templateId", String.valueOf(msgNotficationDTO.sceneTemplateId));
                TLog.loge("AgooNotficationFactory", "图片文本加展开大图");
                return new PicTextLargeExpandNotification(context, msgNotficationDTO, bundle, intent);
            default:
                return null;
        }
    }

    public static IOldAgooNotification d(Context context, MsgNotficationDTO msgNotficationDTO, Bundle bundle, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IOldAgooNotification) ipChange.ipc$dispatch("abd471ae", new Object[]{context, msgNotficationDTO, bundle, intent});
        }
        int i = msgNotficationDTO.view_type;
        if (i == 1) {
            return new ki0(context, msgNotficationDTO, bundle, intent);
        }
        if (i == 2) {
            return new vh0(1, context, msgNotficationDTO, bundle, intent);
        }
        if (i == 3) {
            return new vh0(2, context, msgNotficationDTO, bundle, intent);
        }
        if (i != 4) {
            return new mi0(context, msgNotficationDTO, bundle, intent);
        }
        return new uh0(context, msgNotficationDTO, bundle, intent);
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c6f24c5f", new Object[0])).booleanValue();
        }
        if (EnvUtil.isNightMode()) {
            return false;
        }
        return f() && TextUtils.equals("true", OrangeConfig.getInstance().getConfig("mpm_business_switch", "isEnableSceneTemplate", String.valueOf(EnvService.instance().checkBrand("oppo"))));
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("18ef174c", new Object[0])).booleanValue();
        }
        return "true".equals(ABService.instance().getABResult("pushStyle", "messageModule", "enableShading"));
    }
}
