package tb;

import android.text.TextUtils;
import android.util.Log;
import com.alibaba.ariver.kernel.RVStartParams;
import com.alibaba.ariver.resource.api.models.AppModel;
import com.alibaba.ariver.resource.api.models.PluginModel;
import com.alibaba.ariver.resource.api.models.TemplateConfigModel;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.plugininfo.request.IPluginInfoRequestClient;
import com.taobao.themis.kernel.plugininfo.storage.PluginInfoDao;
import java.util.HashMap;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class r8m {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(839909896);
    }

    public static void a(List<PluginModel> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0f46ba9", new Object[]{list});
            return;
        }
        for (PluginModel pluginModel : list) {
            b(pluginModel);
        }
    }

    public static void b(PluginModel pluginModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2958a50", new Object[]{pluginModel});
        } else if (pluginModel != null && !TextUtils.isEmpty(pluginModel.getAppId()) && !TextUtils.isEmpty(pluginModel.getVersion())) {
            PluginInfoDao pluginInfoDao = new PluginInfoDao();
            pluginInfoDao.pluginInfo = pluginModel;
            pluginInfoDao.lastRequestTimeStamp = System.currentTimeMillis();
            pluginInfoDao.pluginId = pluginModel.getAppId();
            pluginInfoDao.lastUsedTimeStamp = System.currentTimeMillis();
            pluginInfoDao.version = pluginModel.getDeveloperVersion();
            t8m.b().c(pluginInfoDao);
        }
    }

    public static s8m c(AppModel appModel, List<Object> list, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (s8m) ipChange.ipc$dispatch("b6512539", new Object[]{appModel, list, jSONObject});
        }
        if (appModel == null || list == null || list.isEmpty()) {
            return new s8m(false).b("invalid Params").c("appModel or pluginsParams is null");
        }
        try {
            JSONArray parseArray = JSON.parseArray(JSON.toJSONString(list));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(appModel.getAppId(), (Object) parseArray);
            HashMap hashMap = new HashMap();
            TemplateConfigModel templateConfig = appModel.getAppInfoModel().getTemplateConfig();
            if (templateConfig != null) {
                hashMap.put("templateVersion", templateConfig.getTemplateVersion());
                hashMap.put(RVStartParams.KEY_TEMPLATE_ID, templateConfig.getTemplateId());
                hashMap.put("templateAppKey", templateConfig.getAppKey());
            }
            JSONObject extendInfos = appModel.getExtendInfos();
            if (extendInfos != null) {
                String string = extendInfos.getString("openType");
                if (!TextUtils.isEmpty(string)) {
                    hashMap.put("openType", string);
                }
            }
            r64<List<PluginModel>, JSONObject> requestPluginInfo = ((IPluginInfoRequestClient) p8s.g(IPluginInfoRequestClient.class)).requestPluginInfo(appModel.getAppId(), jSONObject2.toJSONString(), hashMap, jSONObject);
            if (!requestPluginInfo.f27135a) {
                return new s8m(false).b(requestPluginInfo.b).c(requestPluginInfo.c);
            }
            a(requestPluginInfo.d);
            return new s8m(true).a(requestPluginInfo.d);
        } catch (Exception e) {
            TMSLogger.b("PluginInfoManager", Log.getStackTraceString(e));
            TMSLogger.b("PluginInfoManager", "requestPluginModel error : " + e.getMessage());
            return new s8m(false).b("update Plugin exception").c(e.getMessage());
        }
    }
}
