package com.alipay.android.msp.core.model;

import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class MspExtInfoModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @JSONField(name = "VIData")
    private String VIData;
    private String ap_link_token;
    private Context context;
    private Device device;
    private Env env;
    private String insideEnv;
    private String lang;
    private String userToken;
    private String userTokenType;
    private String utdid;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class Context {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private String bindingAlipay;
        private String codeExtInfo;
        private String expDisableConfig;
        private String tcVerifyToken;
        private String terminalCustomInfo;
        private String terminalSource;

        public String getBindingAlipay() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("9152fb20", new Object[]{this});
            }
            return this.bindingAlipay;
        }

        public String getCodeExtInfo() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("fc5277ed", new Object[]{this});
            }
            return this.codeExtInfo;
        }

        public String getExpDisableConfig() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("2ae51a36", new Object[]{this});
            }
            return this.expDisableConfig;
        }

        public String getTcVerifyToken() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("6d11f67e", new Object[]{this});
            }
            return this.tcVerifyToken;
        }

        public String getTerminalCustomInfo() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("cc4cb248", new Object[]{this});
            }
            return this.terminalCustomInfo;
        }

        public String getTerminalSource() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("1702266c", new Object[]{this});
            }
            return this.terminalSource;
        }

        public void setBindingAlipay(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cdac4abe", new Object[]{this, str});
            } else {
                this.bindingAlipay = str;
            }
        }

        public void setCodeExtInfo(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a5b3b491", new Object[]{this, str});
            } else {
                this.codeExtInfo = str;
            }
        }

        public void setExpDisableConfig(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6e00bb00", new Object[]{this, str});
            } else {
                this.expDisableConfig = str;
            }
        }

        public void setTcVerifyToken(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("69ccbb20", new Object[]{this, str});
            } else {
                this.tcVerifyToken = str;
            }
        }

        public void setTerminalCustomInfo(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("211b522e", new Object[]{this, str});
            } else {
                this.terminalCustomInfo = str;
            }
        }

        public void setTerminalSource(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("da0ec88a", new Object[]{this, str});
            } else {
                this.terminalSource = str;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class Device {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private boolean accessibility;
        private boolean agednessVersion;
        private String appMode;
        private String brand;
        private String cpuCore;
        private String density;
        private String drmVersion;
        private boolean foldable;
        private boolean lowPerf;
        private String model;
        private boolean pad;
        private String screenHeight;
        private String screenWidth;

        public String getAppMode() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("3a3c2c8b", new Object[]{this});
            }
            return this.appMode;
        }

        public String getBrand() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("935139c8", new Object[]{this});
            }
            return this.brand;
        }

        public String getCpuCore() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("9f03a68", new Object[]{this});
            }
            return this.cpuCore;
        }

        public String getDensity() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("6f2f2187", new Object[]{this});
            }
            return this.density;
        }

        public String getDrmVersion() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("2a140c2a", new Object[]{this});
            }
            return this.drmVersion;
        }

        public String getModel() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("a78b0366", new Object[]{this});
            }
            return this.model;
        }

        public String getScreenHeight() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("2316a370", new Object[]{this});
            }
            return this.screenHeight;
        }

        public String getScreenWidth() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("443ea1f5", new Object[]{this});
            }
            return this.screenWidth;
        }

        public boolean isAccessibility() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("8d12dacf", new Object[]{this})).booleanValue();
            }
            return this.accessibility;
        }

        public boolean isAgednessVersion() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("563f931d", new Object[]{this})).booleanValue();
            }
            return this.agednessVersion;
        }

        public boolean isFoldable() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("c6ac4a30", new Object[]{this})).booleanValue();
            }
            return this.foldable;
        }

        public boolean isLowPerf() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("71866ade", new Object[]{this})).booleanValue();
            }
            return this.lowPerf;
        }

        public boolean isPad() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("ad47fb14", new Object[]{this})).booleanValue();
            }
            return this.pad;
        }

        public void setAccessibility(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ed2282a1", new Object[]{this, new Boolean(z)});
            } else {
                this.accessibility = z;
            }
        }

        public void setAgednessVersion(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b87d6613", new Object[]{this, new Boolean(z)});
            } else {
                this.agednessVersion = z;
            }
        }

        public void setAppMode(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("144cedb3", new Object[]{this, str});
            } else {
                this.appMode = str;
            }
        }

        public void setBrand(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("83ae9516", new Object[]{this, str});
            } else {
                this.brand = str;
            }
        }

        public void setCpuCore(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3b1a9b76", new Object[]{this, str});
            } else {
                this.cpuCore = str;
            }
        }

        public void setDensity(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7db89837", new Object[]{this, str});
            } else {
                this.density = str;
            }
        }

        public void setDrmVersion(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8f57008c", new Object[]{this, str});
            } else {
                this.drmVersion = str;
            }
        }

        public void setFoldable(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ddd479f0", new Object[]{this, new Boolean(z)});
            } else {
                this.foldable = z;
            }
        }

        public void setLowPerf(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("83e43e72", new Object[]{this, new Boolean(z)});
            } else {
                this.lowPerf = z;
            }
        }

        public void setModel(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f6adff38", new Object[]{this, str});
            } else {
                this.model = str;
            }
        }

        public void setPad(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a19310fc", new Object[]{this, new Boolean(z)});
            } else {
                this.pad = z;
            }
        }

        public void setScreenHeight(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d05c3f06", new Object[]{this, str});
            } else {
                this.screenHeight = str;
            }
        }

        public void setScreenWidth(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5b4ccb89", new Object[]{this, str});
            } else {
                this.screenWidth = str;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class Env {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private String alipayTopAppId;
        private boolean fromWallet;
        private String invokeFromApi;
        private String invokeFromAppName;
        private String invokeFromAppSign;
        private String invokeFromClientAppId;
        private String invokeFromReferUrl;
        private String invokeFromSource;
        private String supported3rdPay;

        public String getAlipayTopAppId() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("f2ed1132", new Object[]{this});
            }
            return this.alipayTopAppId;
        }

        public String getInvokeFromApi() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("17977177", new Object[]{this});
            }
            return this.invokeFromApi;
        }

        public String getInvokeFromAppName() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("34b6c285", new Object[]{this});
            }
            return this.invokeFromAppName;
        }

        public String getInvokeFromAppSign() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("a73eb293", new Object[]{this});
            }
            return this.invokeFromAppSign;
        }

        public String getInvokeFromClientAppId() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("681341e0", new Object[]{this});
            }
            return this.invokeFromClientAppId;
        }

        public String getInvokeFromReferUrl() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("e5fff432", new Object[]{this});
            }
            return this.invokeFromReferUrl;
        }

        public String getInvokeFromSource() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("3678ee66", new Object[]{this});
            }
            return this.invokeFromSource;
        }

        public String getSupported3rdPay() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("be70491e", new Object[]{this});
            }
            return this.supported3rdPay;
        }

        public boolean isFromWallet() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a09ea318", new Object[]{this})).booleanValue();
            }
            return this.fromWallet;
        }

        public void setAlipayTopAppId(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7b813684", new Object[]{this, str});
            } else {
                this.alipayTopAppId = str;
            }
        }

        public void setFromWallet(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5fa96c08", new Object[]{this, new Boolean(z)});
            } else {
                this.fromWallet = z;
            }
        }

        public void setInvokeFromApi(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ff69f47", new Object[]{this, str});
            } else {
                this.invokeFromApi = str;
            }
        }

        public void setInvokeFromAppName(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5fa095f9", new Object[]{this, str});
            } else {
                this.invokeFromAppName = str;
            }
        }

        public void setInvokeFromAppSign(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3e16a7ab", new Object[]{this, str});
            } else {
                this.invokeFromAppSign = str;
            }
        }

        public void setInvokeFromClientAppId(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f0b027fe", new Object[]{this, str});
            } else {
                this.invokeFromClientAppId = str;
            }
        }

        public void setInvokeFromReferUrl(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3dd04d84", new Object[]{this, str});
            } else {
                this.invokeFromReferUrl = str;
            }
        }

        public void setInvokeFromSource(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d4e76cd0", new Object[]{this, str});
            } else {
                this.invokeFromSource = str;
            }
        }

        public void setSupported3rdPay(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c9c0af80", new Object[]{this, str});
            } else {
                this.supported3rdPay = str;
            }
        }
    }

    public String getAp_link_token() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("893befeb", new Object[]{this});
        }
        return this.ap_link_token;
    }

    public Context getContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("6cfd041c", new Object[]{this});
        }
        return this.context;
    }

    public Device getDevice() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Device) ipChange.ipc$dispatch("7f6e8402", new Object[]{this});
        }
        return this.device;
    }

    public Env getEnv() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Env) ipChange.ipc$dispatch("4173cf5c", new Object[]{this});
        }
        return this.env;
    }

    public String getInsideEnv() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dea54d3e", new Object[]{this});
        }
        return this.insideEnv;
    }

    public String getLang() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cae65b15", new Object[]{this});
        }
        return this.lang;
    }

    public String getUserToken() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3254cbc1", new Object[]{this});
        }
        return this.userToken;
    }

    public String getUserTokenType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2c34a0a7", new Object[]{this});
        }
        return this.userTokenType;
    }

    public String getUtdid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3fdfad6f", new Object[]{this});
        }
        return this.utdid;
    }

    public String getVIData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("60c5cd06", new Object[]{this});
        }
        return this.VIData;
    }

    public void setAp_link_token(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2e1ef53", new Object[]{this, str});
        } else {
            this.ap_link_token = str;
        }
    }

    public void setContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f9b5838", new Object[]{this, context});
        } else {
            this.context = context;
        }
    }

    public void setDevice(Device device) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d34c307e", new Object[]{this, device});
        } else {
            this.device = device;
        }
    }

    public void setEnv(Env env) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("817a4abc", new Object[]{this, env});
        } else {
            this.env = env;
        }
    }

    public void setInsideEnv(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78421660", new Object[]{this, str});
        } else {
            this.insideEnv = str;
        }
    }

    public void setLang(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26644801", new Object[]{this, str});
        } else {
            this.lang = str;
        }
    }

    public void setUserToken(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a82683d", new Object[]{this, str});
        } else {
            this.userToken = str;
        }
    }

    public void setUserTokenType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8eff5617", new Object[]{this, str});
        } else {
            this.userTokenType = str;
        }
    }

    public void setUtdid(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68ee964f", new Object[]{this, str});
        } else {
            this.utdid = str;
        }
    }

    public void setVIData(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("579dc130", new Object[]{this, str});
        } else {
            this.VIData = str;
        }
    }
}
