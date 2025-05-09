package com.alibaba.security.realidentity.biz.config;

import com.alibaba.security.realidentity.RPConfig;
import com.alibaba.security.realidentity.biz.dynamic.model.CtidConfigResponse;
import com.alibaba.security.realidentity.biz.dynamic.model.OssConfig;
import com.alibaba.security.realidentity.biz.dynamic.model.ScConfig;
import com.alibaba.security.realidentity.biz.dynamic.model.WukongConfig;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class RPBizConfig implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public CtidConfig ctidConfig;
    public CtidConfigResponse ctidConfigResponse;
    public String dynamicWebUrl;
    public OssConfig ossConfig;
    public RPConfig rpConfig;
    public ScConfig scConfig;
    public WukongConfig wukongConfig;
    public int biometricsType = 1;
    public final DegradeConfig degradeConfig = new DegradeConfig();
    public final BasicsConfig basicsConfig = new BasicsConfig();
    public final BiometricsConfig biometricsConfig = new BiometricsConfig();

    public static RPBizConfig create() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RPBizConfig) ipChange.ipc$dispatch("ca7a1417", new Object[0]);
        }
        return new RPBizConfig();
    }

    public BasicsConfig getBasicsConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BasicsConfig) ipChange.ipc$dispatch("72d44682", new Object[]{this});
        }
        return this.basicsConfig;
    }

    public BiometricsConfig getBiometricsConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BiometricsConfig) ipChange.ipc$dispatch("5e71c5c2", new Object[]{this});
        }
        return this.biometricsConfig;
    }

    public int getBiometricsType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("16f1cc85", new Object[]{this})).intValue();
        }
        return this.biometricsType;
    }

    public CtidConfig getCtidConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CtidConfig) ipChange.ipc$dispatch("df7abbe2", new Object[]{this});
        }
        return this.ctidConfig;
    }

    public CtidConfigResponse getCtidConfigResponse() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CtidConfigResponse) ipChange.ipc$dispatch("5f29a1f3", new Object[]{this});
        }
        return this.ctidConfigResponse;
    }

    public DegradeConfig getDegradeConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DegradeConfig) ipChange.ipc$dispatch("57433f70", new Object[]{this});
        }
        return this.degradeConfig;
    }

    public String getDynamicWebUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e23db695", new Object[]{this});
        }
        return this.dynamicWebUrl;
    }

    public OssConfig getOssConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OssConfig) ipChange.ipc$dispatch("6232ac59", new Object[]{this});
        }
        return this.ossConfig;
    }

    public RPConfig getRpConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RPConfig) ipChange.ipc$dispatch("715f45a3", new Object[]{this});
        }
        if (this.rpConfig == null) {
            this.rpConfig = new RPConfig.Builder().build();
        }
        return this.rpConfig;
    }

    public ScConfig getScConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScConfig) ipChange.ipc$dispatch("e1c07cad", new Object[]{this});
        }
        return this.scConfig;
    }

    public WukongConfig getWukongConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WukongConfig) ipChange.ipc$dispatch("71e65717", new Object[]{this});
        }
        return this.wukongConfig;
    }

    public void setBiometricsType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("158cf825", new Object[]{this, new Integer(i)});
        } else {
            this.biometricsType = i;
        }
    }

    public void setCtidConfig(CtidConfig ctidConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a06d170", new Object[]{this, ctidConfig});
        } else {
            this.ctidConfig = ctidConfig;
        }
    }

    public void setCtidConfigResponse(CtidConfigResponse ctidConfigResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20c19941", new Object[]{this, ctidConfigResponse});
        } else {
            this.ctidConfigResponse = ctidConfigResponse;
        }
    }

    public void setDynamicWebUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a18fde9", new Object[]{this, str});
        } else {
            this.dynamicWebUrl = str;
        }
    }

    public void setOssConfig(OssConfig ossConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36ad5e71", new Object[]{this, ossConfig});
        } else {
            this.ossConfig = ossConfig;
        }
    }

    public void setRpConfig(RPConfig rPConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53298e73", new Object[]{this, rPConfig});
        } else {
            this.rpConfig = rPConfig;
        }
    }

    public void setScConfig(ScConfig scConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b8d7a21", new Object[]{this, scConfig});
        } else {
            this.scConfig = scConfig;
        }
    }

    public void setWukongConfig(WukongConfig wukongConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5882fb81", new Object[]{this, wukongConfig});
        } else {
            this.wukongConfig = wukongConfig;
        }
    }
}
