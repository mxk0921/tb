package com.taobao.themis.open.packages.parser;

import com.alibaba.ariver.resource.api.models.AppModel;
import com.alibaba.ariver.resource.api.models.TemplateConfigModel;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.regex.Pattern;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ParseContext {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String appId;
    public List<Pattern> ignorePatterns;
    public String mainFileName;
    public long mainTarSize;
    public String onlineHost;
    public String packagePath;
    public String templateAppId;
    public String templateVersion;
    public boolean needVerify = true;
    public boolean needCache = false;
    public boolean fromCache = false;

    static {
        t2o.a(843055300);
    }

    public void adaptAppModel(AppModel appModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fd7da96", new Object[]{this, appModel});
        } else if (appModel != null && appModel.getAppInfoModel() != null) {
            this.appId = appModel.getAppId();
            this.onlineHost = appModel.getAppInfoModel().getVhost();
            TemplateConfigModel templateConfig = appModel.getAppInfoModel().getTemplateConfig();
            if (templateConfig != null && templateConfig.isTemplateValid()) {
                this.mainFileName = templateConfig.getTemplateId() + ".tar";
                this.templateAppId = templateConfig.getTemplateId();
                this.templateVersion = templateConfig.getTemplateVersion();
            }
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "ParseContext{packagePath='" + this.packagePath + "', mainFileName='" + this.mainFileName + "', appId='" + this.appId + "', onlineHost='" + this.onlineHost + "', templateAppId='" + this.templateAppId + "', ignorePatterns=" + this.ignorePatterns + '}';
    }
}
