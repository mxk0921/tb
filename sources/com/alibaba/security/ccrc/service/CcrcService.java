package com.alibaba.security.ccrc.service;

import android.text.TextUtils;
import com.alibaba.security.ccrc.common.log.Logging;
import com.alibaba.security.ccrc.enums.InitState;
import com.alibaba.security.ccrc.enums.Mode;
import com.alibaba.security.ccrc.interfaces.OnAlgoResultCallback;
import com.alibaba.security.ccrc.interfaces.OnCcrcCallback;
import com.alibaba.security.ccrc.interfaces.OnDetectRiskListener;
import com.alibaba.security.ccrc.interfaces.Uploader;
import com.alibaba.security.ccrc.manager.CcrcContextImpl;
import com.alibaba.security.ccrc.model.InitResult;
import com.alibaba.security.ccrc.service.CcrcService;
import com.alibaba.security.ccrc.service.build.C1199x;
import com.alibaba.security.ccrc.service.build.HandlerC1156ea;
import com.alibaba.security.ccrc.service.build.I;
import com.alibaba.security.ccrc.service.enums.WukongResultCode;
import com.alibaba.security.ccrc.service.interfaces.AbsWuKongDetectListener;
import com.alibaba.security.ccrc.service.model.WukongActivateRiskResult;
import com.alibaba.security.client.smart.core.wukong.action.BaseActionPerform;
import com.alibaba.security.wukong.model.CCRCRiskSample;
import com.alibaba.security.wukong.plugin.BaseWukongContentRiskPlugin;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class CcrcService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "CcrcService";
    public static final Map<String, CcrcService> mServiceMap = new HashMap();
    public final C1199x mCcrcServiceManager;
    public HandlerC1156ea mMainHandler;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class Config implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public Map<String, Object> extras;
        public final Mode mode;
        public final String pid;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public static class Builder implements Serializable {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public Map<String, Object> extras;
            public Mode mode = Mode.DEFAULT;
            public String pid;

            public Config build() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Config) ipChange.ipc$dispatch("4033044", new Object[]{this});
                }
                return new Config(this.pid, this.extras, this.mode);
            }

            @Deprecated
            public Builder setCcrcCode(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Builder) ipChange.ipc$dispatch("b1de3391", new Object[]{this, str});
                }
                return this;
            }

            public Builder setExtras(Map<String, Object> map) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Builder) ipChange.ipc$dispatch("be43b29", new Object[]{this, map});
                }
                this.extras = map;
                return this;
            }

            public Builder setMode(Mode mode) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Builder) ipChange.ipc$dispatch("3cac1317", new Object[]{this, mode});
                }
                this.mode = mode;
                return this;
            }

            public Builder setPid(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Builder) ipChange.ipc$dispatch("5bdbf9c8", new Object[]{this, str});
                }
                this.pid = str;
                return this;
            }
        }

        public Config(String str, Map<String, Object> map, Mode mode) {
            this.pid = str;
            this.extras = map;
            this.mode = mode;
        }

        public Map<String, Object> getExtras() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("cf016b95", new Object[]{this});
            }
            if (this.extras == null) {
                this.extras = new HashMap();
            }
            return this.extras;
        }

        public Mode getMode() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Mode) ipChange.ipc$dispatch("8128d435", new Object[]{this});
            }
            return this.mode;
        }

        public String getPid() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("229b03c4", new Object[]{this});
            }
            return this.pid;
        }
    }

    public CcrcService(String str) {
        this.mCcrcServiceManager = new C1199x(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(final OnCcrcCallback onCcrcCallback, final WukongActivateRiskResult wukongActivateRiskResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b6bbb44", new Object[]{this, onCcrcCallback, wukongActivateRiskResult});
            return;
        }
        if (this.mMainHandler == null) {
            this.mMainHandler = new HandlerC1156ea(null);
        }
        this.mMainHandler.post(new Runnable() { // from class: tb.gg3
            @Override // java.lang.Runnable
            public final void run() {
                CcrcService.this.b(onCcrcCallback, wukongActivateRiskResult);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(OnCcrcCallback onCcrcCallback, WukongActivateRiskResult wukongActivateRiskResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67a50ea3", new Object[]{this, onCcrcCallback, wukongActivateRiskResult});
        } else if (onCcrcCallback != null) {
            try {
                onCcrcCallback.onInit(transferInitState(wukongActivateRiskResult.resultCode), InitResult.createResult(wukongActivateRiskResult.errorMsg, wukongActivateRiskResult.pid));
            } catch (Throwable th) {
                Logging.e(TAG, "onInit callback fail", th);
            }
        }
    }

    public static synchronized CcrcService getService(String str) {
        synchronized (CcrcService.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (CcrcService) ipChange.ipc$dispatch("78168fe7", new Object[]{str});
            } else if (TextUtils.isEmpty(str)) {
                Logging.e(TAG, "ccrcCode is null");
                return null;
            } else if (CcrcContextImpl.getContext() == null) {
                Logging.w(TAG, "ccrc context is not init yet");
                return null;
            } else {
                Map<String, CcrcService> map = mServiceMap;
                if (map.get(str) != null) {
                    return map.get(str);
                }
                CcrcService ccrcService = new CcrcService(str);
                map.put(str, ccrcService);
                return ccrcService;
            }
        }
    }

    private InitState transferInitState(WukongResultCode wukongResultCode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InitState) ipChange.ipc$dispatch("33739dfd", new Object[]{this, wukongResultCode});
        }
        WukongResultCode wukongResultCode2 = WukongResultCode.ACTIVATED;
        if (wukongResultCode == wukongResultCode2) {
            return InitState.INITED;
        }
        if (wukongResultCode == WukongResultCode.ACTIVATE_FAIL) {
            return InitState.INIT_FAIL;
        }
        if (wukongResultCode == WukongResultCode.ACTIVATE_ING) {
            return InitState.INIT_ING;
        }
        if (wukongResultCode == WukongResultCode.ACTIVATE_SUCCESS) {
            return InitState.INIT_SUCCESS;
        }
        if (wukongResultCode == wukongResultCode2) {
            return InitState.INITED;
        }
        return InitState.INIT_FAIL;
    }

    @Deprecated
    public void activate(Config config, final OnCcrcCallback onCcrcCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c0404ca", new Object[]{this, config, onCcrcCallback});
        } else {
            this.mCcrcServiceManager.a(config, new I() { // from class: tb.hg3
                @Override // com.alibaba.security.ccrc.service.build.I
                public final void a(WukongActivateRiskResult wukongActivateRiskResult) {
                    CcrcService.this.a(onCcrcCallback, wukongActivateRiskResult);
                }
            });
        }
    }

    public void deActivate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16d74f1b", new Object[]{this});
        } else {
            this.mCcrcServiceManager.e();
        }
    }

    @Deprecated
    public void detect(CCRCRiskSample cCRCRiskSample) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2425b203", new Object[]{this, cCRCRiskSample});
        } else {
            detect(cCRCRiskSample, true);
        }
    }

    public void enableHeartBeat(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e3e3bf4", new Object[]{this, new Boolean(z)});
        } else {
            this.mCcrcServiceManager.a(z);
        }
    }

    public void enableLowDevice(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc511f06", new Object[]{this, new Boolean(z)});
        } else {
            this.mCcrcServiceManager.b(z);
        }
    }

    public String getCcrcCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2a2081e5", new Object[]{this});
        }
        return this.mCcrcServiceManager.getCcrcCode();
    }

    public C1199x getCcrcServiceManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (C1199x) ipChange.ipc$dispatch("5fe25fca", new Object[]{this});
        }
        return this.mCcrcServiceManager;
    }

    public int getDetectFrequency() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("417902bd", new Object[]{this})).intValue();
        }
        return this.mCcrcServiceManager.f();
    }

    public Uploader getFileUploader() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uploader) ipChange.ipc$dispatch("f47b19c5", new Object[]{this});
        }
        return this.mCcrcServiceManager.h();
    }

    public String getPid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("229b03c4", new Object[]{this});
        }
        return this.mCcrcServiceManager.d();
    }

    public boolean isActivate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8b569a48", new Object[]{this})).booleanValue();
        }
        return this.mCcrcServiceManager.a();
    }

    public boolean isSwitchClosed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ed76af95", new Object[]{this})).booleanValue();
        }
        return this.mCcrcServiceManager.j();
    }

    public void prepare() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1afb60e", new Object[]{this});
        } else {
            this.mCcrcServiceManager.k();
        }
    }

    public void registerAction(BaseActionPerform baseActionPerform) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("383d604e", new Object[]{this, baseActionPerform});
        } else {
            this.mCcrcServiceManager.a(baseActionPerform);
        }
    }

    public void registerAlgoCallback(OnAlgoResultCallback onAlgoResultCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c3de186", new Object[]{this, onAlgoResultCallback});
        } else {
            this.mCcrcServiceManager.a(onAlgoResultCallback);
        }
    }

    public void registerBizFeature(String str, Object obj, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33e8d5a1", new Object[]{this, str, obj, new Boolean(z)});
        } else {
            this.mCcrcServiceManager.a(str, obj, z);
        }
    }

    public void registerPlugin(BaseWukongContentRiskPlugin baseWukongContentRiskPlugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b18c973", new Object[]{this, baseWukongContentRiskPlugin});
        } else {
            this.mCcrcServiceManager.a(baseWukongContentRiskPlugin);
        }
    }

    public void setFileUploader(Uploader uploader) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcff859b", new Object[]{this, uploader});
        } else {
            this.mCcrcServiceManager.a(uploader);
        }
    }

    @Deprecated
    public void setRiskCallback(OnDetectRiskListener onDetectRiskListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbf0669a", new Object[]{this, onDetectRiskListener});
        } else {
            this.mCcrcServiceManager.a(onDetectRiskListener);
        }
    }

    public void setWuKongDetectListener(AbsWuKongDetectListener absWuKongDetectListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68b2c0b1", new Object[]{this, absWuKongDetectListener});
        } else {
            this.mCcrcServiceManager.a(absWuKongDetectListener);
        }
    }

    public void switchWithCode(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8da2075c", new Object[]{this, str, new Boolean(z)});
        } else {
            this.mCcrcServiceManager.a(str, z);
        }
    }

    public void updateHeartBeatInfo(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8f274dd", new Object[]{this, map});
        } else {
            this.mCcrcServiceManager.a(map);
        }
    }

    public void activate(Config config, I i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97fd7a6", new Object[]{this, config, i});
        } else {
            this.mCcrcServiceManager.a(config, i);
        }
    }

    @Deprecated
    public void detect(CCRCRiskSample cCRCRiskSample, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60914131", new Object[]{this, cCRCRiskSample, new Boolean(z)});
        } else {
            this.mCcrcServiceManager.a(cCRCRiskSample, z);
        }
    }

    public void registerBizFeature(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9651cf93", new Object[]{this, str, obj});
        } else {
            registerBizFeature(str, obj, false);
        }
    }
}
