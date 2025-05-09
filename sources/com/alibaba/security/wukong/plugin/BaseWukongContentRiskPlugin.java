package com.alibaba.security.wukong.plugin;

import android.content.Context;
import com.alibaba.security.ccrc.common.keep.IKeep;
import com.alibaba.security.ccrc.common.log.Logging;
import com.alibaba.security.ccrc.service.CcrcService;
import com.alibaba.security.ccrc.service.build.C1195v;
import com.alibaba.security.ccrc.service.build.Kb;
import com.alibaba.security.ccrc.service.build.r;
import com.alibaba.security.client.smart.core.track.TrackManager;
import com.alibaba.security.client.smart.core.track.model.TrackLog;
import com.alibaba.security.wukong.interfaces.IContentRiskPlatform;
import com.alibaba.security.wukong.interfaces.IContentRiskPlugin;
import com.alibaba.security.wukong.model.CCRCRiskSample;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class BaseWukongContentRiskPlugin implements IContentRiskPlugin, IContentRiskPlatform, IKeep {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "BaseWukongContentRiskPlugin";
    public final Map<String, Boolean> mAlgoCodeSwitches = new HashMap();
    public C1195v mAlgoResultWatcher;
    public String mCcrcCode;
    public CcrcService.Config mConfig;
    public r mContentRiskListener;
    public final Context mContext;

    public BaseWukongContentRiskPlugin(Context context) {
        this.mContext = context;
        onCreate(context);
        String name = name();
        Logging.d(TAG, "plugin " + name + " onCreate");
    }

    public boolean activate(String str, CcrcService.Config config, r rVar) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a4e17cd7", new Object[]{this, str, config, rVar})).booleanValue();
        }
        this.mCcrcCode = str;
        this.mConfig = config;
        this.mContentRiskListener = rVar;
        boolean onActivate = onActivate(config);
        reportPluginActivateLog(this.mConfig.getPid(), this.mCcrcCode, onActivate);
        StringBuilder a2 = Kb.a("plugin ");
        a2.append(name());
        a2.append(" activate result: ");
        if (onActivate) {
            str2 = "success";
        } else {
            str2 = "fail";
        }
        a2.append(str2);
        Logging.d(TAG, a2.toString());
        return onActivate;
    }

    @Override // com.alibaba.security.wukong.interfaces.IContentRiskPlatform
    public void addAlgoHeartBeat(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2165d979", new Object[]{this, str});
            return;
        }
        r rVar = this.mContentRiskListener;
        if (rVar != null) {
            rVar.a(str);
        }
    }

    public void deactivate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0bfafb", new Object[]{this});
            return;
        }
        String name = name();
        Logging.d(TAG, name + " plugin deactivate");
        onDeActivate();
    }

    public void detect(CCRCRiskSample cCRCRiskSample) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2425b203", new Object[]{this, cCRCRiskSample});
        } else {
            onDetectSample(cCRCRiskSample);
        }
    }

    @Override // com.alibaba.security.wukong.interfaces.IContentRiskPlatform
    public String getCcrcCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2a2081e5", new Object[]{this});
        }
        return this.mCcrcCode;
    }

    public CcrcService.Config getConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CcrcService.Config) ipChange.ipc$dispatch("3cc16fba", new Object[]{this});
        }
        return this.mConfig;
    }

    @Override // com.alibaba.security.wukong.interfaces.IContentRiskPlatform
    public Context getContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        return this.mContext;
    }

    @Override // com.alibaba.security.wukong.interfaces.IContentRiskPlugin
    public IContentRiskPlatform getPlatform() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IContentRiskPlatform) ipChange.ipc$dispatch("c7895e0", new Object[]{this});
        }
        return this;
    }

    public boolean inputConfig(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("82de60ac", new Object[]{this, str, map})).booleanValue();
        }
        this.mCcrcCode = str;
        return onInputConfig(map);
    }

    @Override // com.alibaba.security.wukong.interfaces.IContentRiskPlatform
    public void inputInferData(Map<String, Object> map, CCRCRiskSample cCRCRiskSample) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4877bfc9", new Object[]{this, map, cCRCRiskSample});
        } else if (map == null) {
            Logging.e(TAG, "notifyWukongEngine fail,AlgoResult is null");
        } else {
            C1195v vVar = this.mAlgoResultWatcher;
            if (vVar != null) {
                vVar.a(map);
            }
            r rVar = this.mContentRiskListener;
            if (rVar != null) {
                rVar.a(this.mConfig, name(), map, cCRCRiskSample);
            }
        }
    }

    public boolean isAlgoOpen(String str) {
        Boolean bool;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("242325dc", new Object[]{this, str})).booleanValue();
        }
        if (!this.mAlgoCodeSwitches.isEmpty() && this.mAlgoCodeSwitches.containsKey(str) && (bool = this.mAlgoCodeSwitches.get(str)) != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public void setAlgoWatcher(C1195v vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e253e88", new Object[]{this, vVar});
        } else {
            this.mAlgoResultWatcher = vVar;
        }
    }

    public void switchAlgo(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54cc72dc", new Object[]{this, str, new Boolean(z)});
        } else {
            this.mAlgoCodeSwitches.put(str, Boolean.valueOf(z));
        }
    }

    @Override // com.alibaba.security.wukong.interfaces.IContentRiskPlatform
    public void trackLog(TrackLog trackLog, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8a5808a", new Object[]{this, trackLog, new Boolean(z)});
        } else {
            TrackManager.track(trackLog);
        }
    }

    private void reportPluginActivateLog(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d00d9e0f", new Object[]{this, str, str2, new Boolean(z)});
            return;
        }
        TrackLog.Builder phase = TrackLog.newBuilder().setpId(str).setCcrcCode(str2).setPhase("init");
        String name = name();
        trackLog(phase.setOperation("plugin_" + name + "_init_end").setStatus(z ? 0 : -1).build(), false);
    }
}
