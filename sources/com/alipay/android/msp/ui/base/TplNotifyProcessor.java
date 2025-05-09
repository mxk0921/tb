package com.alipay.android.msp.ui.base;

import android.net.Uri;
import android.os.Bundle;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.app.cctemplate.model.Template;
import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.alipay.android.msp.framework.statisticsv2.StatisticInfo;
import com.alipay.android.msp.plugin.IRender;
import com.alipay.android.msp.plugin.manager.PluginManager;
import com.alipay.android.msp.ui.birdnest.render.api.MspRenderImpl;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class TplNotifyProcessor {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TPL_NOTIFY_BIZTYPE_SCAN_PAY_CODE = "ScanPayCode";

    public static void route(String str, Bundle bundle, StatisticInfo statisticInfo) throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8786af0c", new Object[]{str, bundle, statisticInfo});
            return;
        }
        str.hashCode();
        if (!str.equals(TPL_NOTIFY_BIZTYPE_SCAN_PAY_CODE)) {
            LogUtil.record(8, "TplNotifyProcessor::route", "unknown bizScene: ".concat(str));
            return;
        }
        LogUtil.record(2, "TplNotifyProcessor::onScanPayCode", "verification");
        Uri parse = Uri.parse(bundle.getString("scheme"));
        if (!"platformapi".equalsIgnoreCase(parse.getHost())) {
            LogUtil.record(8, "TplNotifyProcessor::onScanPayCode", "verification failed: host");
        } else if (!"20001001".equalsIgnoreCase(parse.getQueryParameter("appId"))) {
            LogUtil.record(8, "TplNotifyProcessor::onScanPayCode", "verification failed: appid");
        } else {
            JSONObject parseObject = JSON.parseObject(parse.getQueryParameter("pageData"));
            String string = parseObject.getString(MspFlybirdDefine.FLYBIRD_TEMPLATE_ID);
            JSONObject parseObject2 = JSON.parseObject(parseObject.getString("tpl"));
            IRender render = PluginManager.getRender();
            if (!(render instanceof MspRenderImpl)) {
                LogUtil.record(8, "TplNotifyProcessor::onScanPayCode", "render is ".concat(String.valueOf(render)));
                return;
            }
            Template notifyTplUpdate = ((MspRenderImpl) render).notifyTplUpdate(string, parseObject2.toJSONString());
            LogUtil.record(2, "TplNotifyProcessor::onScanPayCode", "update result: " + notifyTplUpdate.tplId + "|" + notifyTplUpdate.tplVersion + "|" + notifyTplUpdate.time);
        }
    }
}
