package com.alipay.android.app.cctemplate.transport;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alipay.android.app.cctemplate.TemplateValue;
import com.alipay.android.app.cctemplate.api.TemplateService;
import com.alipay.android.app.cctemplate.model.Template;
import com.alipay.android.app.safepaylog.utils.LogUtils;
import com.alipay.android.app.safepaylogv2.api.StatisticCollector;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.umipublish.draft.DraftMediaHelper;
import org.json.JSONObject;
import tb.slo;

/* compiled from: Taobao */
@MpaasClassInfo(ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-safepaybase")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class TemplateManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static int compareVersion(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d9bbef41", new Object[]{str, str2})).intValue();
        }
        if (TextUtils.equals(str, str2)) {
            return 0;
        }
        if (!TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            return 1;
        }
        if (TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            return -1;
        }
        String[] split = str.split("\\.");
        String[] split2 = str2.split("\\.");
        if (!(split.length == 3 && split2.length == 3)) {
            return str.compareTo(str2);
        }
        for (int i = 0; i < 3; i++) {
            if (!TextUtils.equals(split[i], split2[i])) {
                return Integer.parseInt(split[i]) - Integer.parseInt(split2[i]);
            }
        }
        return 0;
    }

    public static String getTemplateVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ba17df31", new Object[0]);
        }
        return TemplateService.getBirdNestVersion();
    }

    public String createBirdParamsFromTemplate(Template template) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5084097b", new Object[]{this, template});
        }
        String str = template.tplId;
        String str2 = template.tplVersion;
        String str3 = template.publishVersion;
        String str4 = template.time;
        String str5 = template.userId;
        String str6 = template.tplUrl;
        String str7 = template.tplHash;
        String str8 = template.expId;
        StringBuilder sb = new StringBuilder("{\"needGray\":\"Y\",\"tplId\":\"");
        sb.append(str);
        sb.append("\",\"tplVersion\":\"");
        sb.append(str2);
        sb.append("\",\"publishVersion\":\"");
        sb.append(str3);
        sb.append("\",\"time\":\"");
        sb.append(str4);
        sb.append("\",\"tplUrl\":\"");
        sb.append(str6);
        sb.append("\",\"tplHash\":\"");
        sb.append(str7);
        sb.append("\",\"platform\":\"android\"");
        if (!TextUtils.isEmpty(str8)) {
            sb.append(",\"expId\":\"");
            sb.append(str8);
            sb.append("\"");
        }
        if (!TextUtils.isEmpty(str5)) {
            sb.append(",\"uid\":\"");
            sb.append(str5);
            sb.append("\"");
        }
        sb.append("}");
        return sb.toString();
    }

    public Template getTemplateItem(String str) {
        Exception e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Template) ipChange.ipc$dispatch("2613adc1", new Object[]{this, str});
        }
        LogUtils.record(2, "TemplateManager::getTemplateItem", "data=" + str);
        Template template = null;
        if (str == null) {
            return null;
        }
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.equals(str, " ")) {
                JSONObject jSONObject = new JSONObject(str);
                Template template2 = new Template();
                try {
                    template2.data = jSONObject.optString("data");
                    template2.tag = jSONObject.optString("tag");
                    template2.time = jSONObject.optString("time");
                    template2.html = jSONObject.optString("html");
                    template2.name = jSONObject.optString("name");
                    template2.tplId = jSONObject.optString("tplId");
                    template2.format = jSONObject.optString("format");
                    template2.tplVersion = jSONObject.optString("tplVersion");
                    template2.publishVersion = jSONObject.optString("publishVersion");
                    template2.rollbackString = jSONObject.optString("rollBack");
                    template2.userId = jSONObject.optString("userId");
                    template2.tplUrl = jSONObject.optString("tplUrl");
                    template2.tplHash = jSONObject.optString("tplHash");
                    template2.expId = jSONObject.optString("expId");
                    template2.expInfo = jSONObject.optJSONObject("expInfo");
                    template2.expLog = jSONObject.optJSONObject("expLog");
                    template2.crossTime = jSONObject.optString("crossTime");
                    template2.crossVersion = jSONObject.optString("crossVersion");
                    template2.requireTime = jSONObject.optString("requireTime");
                    LogUtils.record(2, "TemplateManager::getTemplateItem rollbackString userId tplVersion tplUrl", template2.rollbackString + template2.userId + template2.tplVersion + template2.tplUrl + ", " + template2.requireTime);
                    return template2;
                } catch (Exception e2) {
                    e = e2;
                    template = template2;
                    StatisticCollector.addError(StatisticCollector.GLOBAL_AGENT, "tpl", TemplateValue.EC_TPL_MANAGER_PARSE_FROM_JSON_EX, e);
                    return template;
                }
            }
            return null;
        } catch (Exception e3) {
            e = e3;
        }
    }

    public static boolean needRollback(Template template, Template template2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dc7ae023", new Object[]{template, template2})).booleanValue();
        }
        if (template == null || template2 == null) {
            LogUtils.record(2, "TemplateManager::needRollback rollbackString:", "time version equals");
            return false;
        } else if (TextUtils.equals(template.time, template2.time) && TextUtils.equals(template.tplVersion, template2.tplVersion)) {
            LogUtils.record(2, "TemplateManager::needRollback rollbackString:", "time version equals");
            return false;
        } else if (TextUtils.isEmpty(template.rollbackString)) {
            LogUtils.record(2, "TemplateManager::needRollback rollbackString:", "isEmpty");
            return false;
        } else {
            try {
                JSONArray parseArray = JSON.parseArray(template.rollbackString);
                LogUtils.record(2, "TemplateManager::needRollback rollbackString:", template.rollbackString);
                int size = parseArray.size();
                for (int i = 0; i < size; i++) {
                    com.alibaba.fastjson.JSONObject jSONObject = parseArray.getJSONObject(i);
                    String string = jSONObject.getString("tplVersion");
                    String string2 = jSONObject.getString("time");
                    if (TextUtils.equals(string, template2.tplVersion) && TextUtils.equals(string2, template2.time)) {
                        LogUtils.record(2, "TemplateManager::needRollback:", string + " " + string2 + " false");
                        return true;
                    }
                }
            } catch (Exception unused) {
            }
            return false;
        }
    }

    public static boolean whetherNeedUpdate(Template template, Template template2) {
        String str;
        String str2;
        String str3;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cbe8d33d", new Object[]{template, template2})).booleanValue();
        }
        if (template == null) {
            return false;
        }
        String str4 = template.tplVersion;
        boolean z2 = compareVersion(str4, getTemplateVersion()) <= 0;
        boolean z3 = compareVersion(str4, "5.0.0") > 0;
        if (!z2 || !z3) {
            StatisticCollector.addError(StatisticCollector.GLOBAL_AGENT, "tpl", TemplateValue.EC_TPL_MANAGER_TPLVERSION_ILLEGAL, "remoteTplVersion is invalid:" + str4);
            return false;
        } else if (template2 == null) {
            LogUtils.record(2, "TemplateManager::whetherNeedUpdate", "local template is null, need update");
            return true;
        } else {
            boolean z4 = !TextUtils.isEmpty(template.publishVersion) && TextUtils.equals(template.publishVersion, template2.publishVersion);
            int compareVersion = compareVersion(template.tplVersion, template2.tplVersion);
            boolean equals = TextUtils.equals(template.tplId, template2.tplId);
            boolean isEmpty = TextUtils.isEmpty(template.expId);
            boolean z5 = !isEmpty;
            if (isEmpty ? !(!equals || (compareVersion <= 0 && (compareVersion != 0 || (z4 && (str2 = template.time) != null && str2.compareTo(template2.time) <= 0)))) : !((!equals || (z4 && compareVersion == 0 && (str3 = template.time) != null && str3.compareTo(template2.time) == 0)) && TextUtils.equals(template2.tplHash, template.tplHash))) {
                z = true;
            }
            StringBuilder sb = new StringBuilder("模版更新:");
            if (z) {
                str = slo.VALUE_YES;
            } else {
                str = "NO";
            }
            sb.append(str);
            sb.append(" ");
            sb.append(template2.tplVersion);
            sb.append("#");
            sb.append(template2.time);
            sb.append(" -> ");
            sb.append(template.tplVersion);
            sb.append("#");
            sb.append(template.time);
            LogUtils.record(2, "TemplateManager::compareTemplateForUpdate", sb.toString() + "， isExpTpl=" + z5);
            StringBuilder sb2 = new StringBuilder("call compareTemplateForUpdate(...) result:");
            sb2.append(z);
            LogUtils.record(2, "TemplateManager::whetherNeedUpdate", sb2.toString());
            return z;
        }
    }
}
