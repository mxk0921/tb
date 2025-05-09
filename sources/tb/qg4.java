package tb;

import android.net.Uri;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.alibaba.fastjson.JSON;
import com.alibaba.poplayer.PopLayer;
import com.alibaba.poplayer.trigger.BaseConfigItem;
import com.alibaba.poplayer.trigger.Event;
import com.alibaba.poplayer.trigger.InternalTriggerController;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class qg4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(625999894);
    }

    public static BaseConfigItem a(BaseConfigItem baseConfigItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseConfigItem) ipChange.ipc$dispatch("bcdf4680", new Object[]{baseConfigItem});
        }
        return baseConfigItem;
    }

    public static BaseConfigItem b(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseConfigItem) ipChange.ipc$dispatch("adba63c0", new Object[]{str, str2, str3});
        }
        BaseConfigItem baseConfigItem = (BaseConfigItem) JSON.parseObject(str, BaseConfigItem.class);
        if (baseConfigItem != null && TextUtils.isEmpty(baseConfigItem.type) && TextUtils.isEmpty(baseConfigItem.params)) {
            if (!TextUtils.isEmpty(fig.c().b())) {
                baseConfigItem.type = fig.c().b();
            } else {
                baseConfigItem.type = "webview";
            }
            HashMap hashMap = new HashMap();
            hashMap.put("url", baseConfigItem.url);
            hashMap.put("enableHardwareAcceleration", Boolean.valueOf(baseConfigItem.enableHardwareAcceleration));
            baseConfigItem.params = JSON.toJSONString(hashMap);
        }
        if (baseConfigItem != null) {
            baseConfigItem.parseTimeStamps();
            baseConfigItem.parseConfigParams();
            baseConfigItem.indexID = str2;
            baseConfigItem.configVersion = str3;
            baseConfigItem.json = str;
        }
        return baseConfigItem;
    }

    public static BaseConfigItem c(Event event, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseConfigItem) ipChange.ipc$dispatch("33cb8df", new Object[]{event, list});
        }
        Uri parse = Uri.parse(event.originUri);
        if (!"directly".equals(parse.getQueryParameter("openType"))) {
            return null;
        }
        BaseConfigItem baseConfigItem = (BaseConfigItem) JSON.parseObject(d(parse), BaseConfigItem.class);
        try {
            String curUri = InternalTriggerController.getCurUri();
            HashMap hashMap = new HashMap();
            hashMap.put(NotificationCompat.MessagingStyle.Message.KEY_DATA_URI, String.valueOf(parse.getHost()));
            hashMap.put("error", "usingOpenTypeDirectly");
            hashMap.put("page", curUri);
            hashMap.put("pageUrl", InternalTriggerController.getCurActivityInfo());
            hashMap.put("type", "directly");
            hashMap.put("uuid", baseConfigItem.uuid);
            hashMap.put("indexID", baseConfigItem.indexID);
            hashMap.put("config", event.originUri);
            auv.a().d("other", curUri, null, hashMap);
        } catch (Throwable th) {
            wdm.h("PageConfigMgr.parseEventUriConfig.trackAction.error.", th);
        }
        baseConfigItem.parseConfigParams();
        if (PopLayer.getReference().getPopLayerViewAdapter() == null || !PopLayer.getReference().getPopLayerViewAdapter().isHitBlackList(parse, baseConfigItem, list)) {
            return baseConfigItem;
        }
        wdm.f(wdm.CATEGORY_CONFIG_CHECK, baseConfigItem.indexID, "PageConfigMgr.parseEventUriConfig.HitBlackList.Ignore.");
        return null;
    }

    public static String d(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9c297f9", new Object[]{uri});
        }
        JSONObject jSONObject = new JSONObject();
        try {
            for (String str : uri.getQueryParameterNames()) {
                jSONObject.put(str, uri.getQueryParameter(str));
            }
        } catch (Throwable unused) {
            wdm.a("DefaultConfigManager.parseUri.");
        }
        return jSONObject.toString();
    }
}
