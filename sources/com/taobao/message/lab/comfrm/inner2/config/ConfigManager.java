package com.taobao.message.lab.comfrm.inner2.config;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.kit.util.ConfigUtil;
import com.taobao.message.lab.comfrm.constant.Constants;
import com.taobao.message.lab.comfrm.inner2.LayoutProtocol;
import com.taobao.message.lab.comfrm.inner2.resource.IResourceManager;
import com.taobao.message.lab.comfrm.inner2.resource.ResourcePatchCenter;
import com.taobao.message.lab.comfrm.util.Logger;
import com.taobao.message.lab.comfrm.util.Observer;
import com.taobao.message.sp.framework.model.SimpleMessageListData;
import com.taobao.message.uikit.util.ApplicationUtil;
import com.taobao.message.util.MessageNavProcessorV2;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.q2s;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ConfigManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final Map<String, ConfigInfo> sConfigParseCacheMap = new ConcurrentHashMap();
    private final IResourceManager mResourceManager;

    static {
        t2o.a(537919676);
        ResourcePatchCenter.getInstance().addCallback(new Observer<PatchInfo>() { // from class: com.taobao.message.lab.comfrm.inner2.config.ConfigManager.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.message.lab.comfrm.util.Observer
            public void onComplete() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5cbffcbf", new Object[]{this});
                }
            }

            @Override // com.taobao.message.lab.comfrm.util.Observer
            public void onError(String str, String str2, Object obj) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("b263e360", new Object[]{this, str, str2, obj});
                }
            }

            public void onData(PatchInfo patchInfo) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("ab3da5e7", new Object[]{this, patchInfo});
                } else {
                    ConfigManager.access$000().clear();
                }
            }
        });
    }

    public ConfigManager(IResourceManager iResourceManager) {
        this.mResourceManager = iResourceManager;
    }

    public static /* synthetic */ Map access$000() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c8ee3d6c", new Object[0]);
        }
        return sConfigParseCacheMap;
    }

    public static void addConfigCache(String str, ConfigInfo configInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77229983", new Object[]{str, configInfo});
        } else {
            sConfigParseCacheMap.put(str, configInfo);
        }
    }

    private void checkCharset(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f1e62b5", new Object[]{this, str});
        } else if (str != null && ApplicationUtil.isDebug() && str.contains("_")) {
            throw new IllegalArgumentException(str.concat("|not support '_'"));
        }
    }

    public ConfigInfo getConfig(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConfigInfo) ipChange.ipc$dispatch("50411f56", new Object[]{this, str, str2});
        }
        checkCharset(str);
        checkCharset(str2);
        String str3 = !TextUtils.isEmpty(str2) ? str + "_" + str2 : str;
        ConfigInfo configInfo = sConfigParseCacheMap.get(str3);
        if (!(ApplicationUtil.isDebug() || configInfo == null)) {
            return configInfo;
        }
        try {
            configInfo = (ConfigInfo) JSON.parseObject(this.mResourceManager.fetchResource("config/" + str3 + q2s.JSON), ConfigInfo.class);
        } catch (Exception unused) {
            Logger.FormatLog.Builder errMsg = new Logger.FormatLog.Builder().type(1).module(16).point(-1001).errCode("-1").errMsg("config parse error");
            if (str2 == null) {
                str2 = "";
            }
            Logger.ftl(errMsg.ext(MessageNavProcessorV2.KEY_BIZ_CONFIG_CODE, str, "version", str2, "key", str3).build());
        }
        if (configInfo != null) {
            LayoutProtocol.processLayout(configInfo.layout);
            if ("messageSingle".equals(str) && configInfo.source != null && "1".equals(ConfigUtil.getValue(Constants.OrangeNS.CONTAINER, "messageSingleTimeout", "1"))) {
                SourceInfo sourceInfo = configInfo.source;
                sourceInfo.initTimeout = 1500L;
                for (SourceItem sourceItem : sourceInfo.sourceList) {
                    if (SimpleMessageListData.SOURCE_NAME_MESSAGE.equals(sourceItem.name)) {
                        sourceItem.defaultLoad = true;
                    }
                }
            }
            sConfigParseCacheMap.put(str3, configInfo);
        }
        return configInfo;
    }
}
