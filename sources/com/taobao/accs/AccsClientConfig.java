package com.taobao.accs;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.common.Constants;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.NoTraceTriggerHelper;
import com.taobao.android.icart.recommend.CartRecommendRefreshScene;
import java.io.Serializable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.czv;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class AccsClientConfig implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ACCS_VER_V1 = 1;
    public static final int ACCS_VER_V2 = 2;
    public static final String DEFAULT_CONFIGTAG = "default";
    public static final int SECURITY_OFF = 2;
    public static final int SECURITY_OPEN = 1;
    public static final int SECURITY_TAOBAO = 0;
    private static final String TAG = "AccsClientConfig";
    public static final String V2_EXCLUSIVE_CONFIGTAG = "accs_v2_exclusive";
    private static Context mContext;
    private String connType;
    private boolean mAccsHeartbeatEnable;
    private String mAppKey;
    private String mAppSecret;
    private String mAuthCode;
    private boolean mAutoUnit;
    private int mConfigEnv;
    private boolean mForePingEnable;
    private String mInappHost;
    private int mInappPubKey;
    private boolean mKeepalive;
    private int mPingTimeout;
    private boolean mPullUpEnable;
    private boolean mQuickReconnect;
    private int mSecurity;
    private String mStoreId;
    private String mTag;
    private int version = 1;
    public static final String[] DEFAULT_CENTER_HOSTS = {"msgacs.m.taobao.com", "msgacs.wapa.taobao.com", "msgacs.waptest.taobao.com"};
    public static boolean loadedStaticConfig = false;
    public static volatile int mEnv = 0;
    public static Map<String, AccsClientConfig> mReleaseConfigs = new ConcurrentHashMap(1);
    public static Map<String, AccsClientConfig> mPreviewConfigs = new ConcurrentHashMap(1);
    public static Map<String, AccsClientConfig> mDebugConfigs = new ConcurrentHashMap(1);

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.CLASS)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public @interface ENV {
    }

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.CLASS)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public @interface SECURITY_TYPE {
    }

    public static /* synthetic */ String access$002(AccsClientConfig accsClientConfig, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9eaa7377", new Object[]{accsClientConfig, str});
        }
        accsClientConfig.mAppKey = str;
        return str;
    }

    public static /* synthetic */ String access$100(AccsClientConfig accsClientConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c4eb47a2", new Object[]{accsClientConfig});
        }
        return accsClientConfig.mAppSecret;
    }

    public static /* synthetic */ boolean access$1002(AccsClientConfig accsClientConfig, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a27a42ea", new Object[]{accsClientConfig, new Boolean(z)})).booleanValue();
        }
        accsClientConfig.mQuickReconnect = z;
        return z;
    }

    public static /* synthetic */ String access$102(AccsClientConfig accsClientConfig, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e0c1a0d6", new Object[]{accsClientConfig, str});
        }
        accsClientConfig.mAppSecret = str;
        return str;
    }

    public static /* synthetic */ boolean access$1102(AccsClientConfig accsClientConfig, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9df7809", new Object[]{accsClientConfig, new Boolean(z)})).booleanValue();
        }
        accsClientConfig.mAccsHeartbeatEnable = z;
        return z;
    }

    public static /* synthetic */ boolean access$1202(AccsClientConfig accsClientConfig, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b144ad28", new Object[]{accsClientConfig, new Boolean(z)})).booleanValue();
        }
        accsClientConfig.mPullUpEnable = z;
        return z;
    }

    public static /* synthetic */ boolean access$1302(AccsClientConfig accsClientConfig, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b8a9e247", new Object[]{accsClientConfig, new Boolean(z)})).booleanValue();
        }
        accsClientConfig.mForePingEnable = z;
        return z;
    }

    public static /* synthetic */ int access$1402(AccsClientConfig accsClientConfig, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c00ed784", new Object[]{accsClientConfig, new Integer(i)})).intValue();
        }
        accsClientConfig.mPingTimeout = i;
        return i;
    }

    public static /* synthetic */ String access$1502(AccsClientConfig accsClientConfig, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b72f4683", new Object[]{accsClientConfig, str});
        }
        accsClientConfig.connType = str;
        return str;
    }

    public static /* synthetic */ int access$1602(AccsClientConfig accsClientConfig, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ced941c2", new Object[]{accsClientConfig, new Integer(i)})).intValue();
        }
        accsClientConfig.version = i;
        return i;
    }

    public static /* synthetic */ int access$1702(AccsClientConfig accsClientConfig, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d63e76e1", new Object[]{accsClientConfig, new Integer(i)})).intValue();
        }
        accsClientConfig.mSecurity = i;
        return i;
    }

    public static /* synthetic */ String access$202(AccsClientConfig accsClientConfig, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("22d8ce35", new Object[]{accsClientConfig, str});
        }
        accsClientConfig.mAuthCode = str;
        return str;
    }

    public static /* synthetic */ boolean access$302(AccsClientConfig accsClientConfig, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9b7295d6", new Object[]{accsClientConfig, new Boolean(z)})).booleanValue();
        }
        accsClientConfig.mKeepalive = z;
        return z;
    }

    public static /* synthetic */ boolean access$402(AccsClientConfig accsClientConfig, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a2d7caf5", new Object[]{accsClientConfig, new Boolean(z)})).booleanValue();
        }
        accsClientConfig.mAutoUnit = z;
        return z;
    }

    public static /* synthetic */ int access$502(AccsClientConfig accsClientConfig, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("aa3cc032", new Object[]{accsClientConfig, new Integer(i)})).intValue();
        }
        accsClientConfig.mInappPubKey = i;
        return i;
    }

    public static /* synthetic */ String access$600(AccsClientConfig accsClientConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("858cbb3d", new Object[]{accsClientConfig});
        }
        return accsClientConfig.mInappHost;
    }

    public static /* synthetic */ String access$602(AccsClientConfig accsClientConfig, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2b3583b1", new Object[]{accsClientConfig, str});
        }
        accsClientConfig.mInappHost = str;
        return str;
    }

    public static /* synthetic */ String access$700(AccsClientConfig accsClientConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1279d25c", new Object[]{accsClientConfig});
        }
        return accsClientConfig.mTag;
    }

    public static /* synthetic */ String access$702(AccsClientConfig accsClientConfig, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6d4cb110", new Object[]{accsClientConfig, str});
        }
        accsClientConfig.mTag = str;
        return str;
    }

    public static /* synthetic */ String access$802(AccsClientConfig accsClientConfig, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("af63de6f", new Object[]{accsClientConfig, str});
        }
        accsClientConfig.mStoreId = str;
        return str;
    }

    public static /* synthetic */ int access$900(AccsClientConfig accsClientConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4b25d8b9", new Object[]{accsClientConfig})).intValue();
        }
        return accsClientConfig.mConfigEnv;
    }

    public static /* synthetic */ int access$902(AccsClientConfig accsClientConfig, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c7d194ae", new Object[]{accsClientConfig, new Integer(i)})).intValue();
        }
        accsClientConfig.mConfigEnv = i;
        return i;
    }

    public static Context getContext() {
        Context context = mContext;
        if (context != null) {
            return context;
        }
        synchronized (AccsClientConfig.class) {
            Context context2 = mContext;
            if (context2 != null) {
                return context2;
            }
            try {
                Class<?> cls = Class.forName(ProcessUtils.ACTIVITY_THREAD);
                Object invoke = cls.getMethod(ProcessUtils.CURRENT_ACTIVITY_THREAD, new Class[0]).invoke(cls, new Object[0]);
                mContext = (Context) invoke.getClass().getMethod("getApplication", new Class[0]).invoke(invoke, new Object[0]);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return mContext;
        }
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccsClientConfig)) {
            return false;
        }
        AccsClientConfig accsClientConfig = (AccsClientConfig) obj;
        if (this.mSecurity == accsClientConfig.mSecurity && this.mInappPubKey == accsClientConfig.mInappPubKey && this.mKeepalive == accsClientConfig.mKeepalive && this.mAutoUnit == accsClientConfig.mAutoUnit && this.mConfigEnv == accsClientConfig.mConfigEnv && this.mQuickReconnect == accsClientConfig.mQuickReconnect && this.mAccsHeartbeatEnable == accsClientConfig.mAccsHeartbeatEnable && this.mPullUpEnable == accsClientConfig.mPullUpEnable && this.mForePingEnable == accsClientConfig.mForePingEnable && this.mPingTimeout == accsClientConfig.mPingTimeout && czv.c(this.mAppKey, accsClientConfig.mAppKey) && czv.c(this.mAppSecret, accsClientConfig.mAppSecret) && czv.c(this.mInappHost, accsClientConfig.mInappHost) && czv.c(this.mStoreId, accsClientConfig.mStoreId) && czv.c(this.mAuthCode, accsClientConfig.mAuthCode) && czv.c(this.mTag, accsClientConfig.mTag)) {
            return true;
        }
        return false;
    }

    public String getAppKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("49079005", new Object[]{this});
        }
        return this.mAppKey;
    }

    public String getAppSecret() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("96a305e", new Object[]{this});
        }
        return this.mAppSecret;
    }

    public String getAuthCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4213feae", new Object[]{this});
        }
        return this.mAuthCode;
    }

    public int getConfigEnv() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3f9bd18f", new Object[]{this})).intValue();
        }
        return this.mConfigEnv;
    }

    public String getConnType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bc970a7d", new Object[]{this});
        }
        return this.connType;
    }

    public String getInappHost() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5c0f63cb", new Object[]{this});
        }
        return this.mInappHost;
    }

    public int getInappPubKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bf11c362", new Object[]{this})).intValue();
        }
        return this.mInappPubKey;
    }

    public int getPingTimeout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("55353653", new Object[]{this})).intValue();
        }
        return this.mPingTimeout;
    }

    public int getSecurity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("910cee30", new Object[]{this})).intValue();
        }
        return this.mSecurity;
    }

    public String getStoreId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f5844913", new Object[]{this});
        }
        return this.mStoreId;
    }

    public String getTag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("54a5a515", new Object[]{this});
        }
        return this.mTag;
    }

    public int getVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2d6bc1c", new Object[]{this})).intValue();
        }
        return this.version;
    }

    public boolean isAccsHeartbeatEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("300550ae", new Object[]{this})).booleanValue();
        }
        return this.mAccsHeartbeatEnable;
    }

    public boolean isAutoUnit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b6be1128", new Object[]{this})).booleanValue();
        }
        return this.mAutoUnit;
    }

    public boolean isForePingEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8bf95a46", new Object[]{this})).booleanValue();
        }
        return this.mForePingEnable;
    }

    public boolean isKeepalive() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5bd13fe9", new Object[]{this})).booleanValue();
        }
        return this.mKeepalive;
    }

    public boolean isPullUpEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ed7b55b8", new Object[]{this})).booleanValue();
        }
        return this.mPullUpEnable;
    }

    public boolean isQuickReconnect() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f6d5023f", new Object[]{this})).booleanValue();
        }
        return this.mQuickReconnect;
    }

    public void setConnType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61279f99", new Object[]{this, str});
        } else {
            this.connType = str;
        }
    }

    public void setForePingEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1683769a", new Object[]{this, new Boolean(z)});
        } else {
            this.mForePingEnable = z;
        }
    }

    public void setVersion(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e4a3706", new Object[]{this, new Integer(i)});
        } else {
            this.version = i;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "AccsClientConfig{mAppKey='" + this.mAppKey + "', mAppSecret='" + this.mAppSecret + "', mInappHost='" + this.mInappHost + "', mStoreId='" + this.mStoreId + "', mSecurity=" + this.mSecurity + ", mAuthCode='" + this.mAuthCode + "', mInappPubKey=" + this.mInappPubKey + ", mKeepalive=" + this.mKeepalive + ", mAutoUnit=" + this.mAutoUnit + ", mTag='" + this.mTag + "', mConfigEnv=" + this.mConfigEnv + ", mQuickReconnect=" + this.mQuickReconnect + ", mAccsHeartbeatEnable=" + this.mAccsHeartbeatEnable + ", mPullUpEnable=" + this.mPullUpEnable + ", mForePingEnable=" + this.mForePingEnable + ", mPingTimeout=" + this.mPingTimeout + '}';
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Builder {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private String connType;
        private String mAppKey = "";
        private String mTag = "";
        private String mAppSecret = "";
        private String mInappHost = "";
        private String mAuthCode = "";
        private String mStoreId = "";
        private int mInappPubKey = -1;
        private boolean mKeepalive = true;
        private boolean mAutoUnit = true;
        private int mConfigEnv = -1;
        private boolean mQuickReconnect = false;
        private boolean mAccsHeartbeatEnable = false;
        private boolean mPullUpEnable = true;
        private boolean mForePingEnable = false;
        private int mPingTimeout = 0;
        private int version = 1;
        private int mTriggerChannel = 0;

        static {
            t2o.a(343932933);
        }

        public String getConnType() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("bc970a7d", new Object[]{this});
            }
            return this.connType;
        }

        public int getVersion() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("2d6bc1c", new Object[]{this})).intValue();
            }
            return this.version;
        }

        public Builder setAccsHeartbeatEnable(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("e5e42283", new Object[]{this, new Boolean(z)});
            }
            this.mAccsHeartbeatEnable = z;
            return this;
        }

        public Builder setAppKey(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("e2e3abf4", new Object[]{this, str});
            }
            this.mAppKey = str;
            return this;
        }

        public Builder setAppSecret(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("f26753a5", new Object[]{this, str});
            }
            this.mAppSecret = str;
            return this;
        }

        public Builder setAutoCode(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("ab85d0f6", new Object[]{this, str});
            }
            this.mAuthCode = str;
            return this;
        }

        public Builder setAutoUnit(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("a044c7ed", new Object[]{this, new Boolean(z)});
            }
            this.mAutoUnit = z;
            return this;
        }

        public Builder setConfigEnv(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("f20d7352", new Object[]{this, new Integer(i)});
            }
            this.mConfigEnv = i;
            return this;
        }

        public Builder setConnType(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("3af1c36c", new Object[]{this, str});
            }
            this.connType = str;
            return this;
        }

        public Builder setForePingEnable(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("ef9018b", new Object[]{this, new Boolean(z)});
            }
            this.mForePingEnable = z;
            return this;
        }

        public Builder setInappHost(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("ccb8eed2", new Object[]{this, str});
            }
            this.mInappHost = str;
            return this;
        }

        public Builder setInappPubKey(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("8a84e065", new Object[]{this, new Integer(i)});
            }
            this.mInappPubKey = i;
            return this;
        }

        public Builder setKeepAlive(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("17dbb9de", new Object[]{this, new Boolean(z)});
            }
            this.mKeepalive = z;
            return this;
        }

        public Builder setPingTimeout(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("bad31616", new Object[]{this, new Integer(i)});
            }
            this.mPingTimeout = i;
            return this;
        }

        public Builder setPullUpEnable(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("267dfc7d", new Object[]{this, new Boolean(z)});
            }
            this.mPullUpEnable = z;
            return this;
        }

        public Builder setQuickReconnect(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("63f8a244", new Object[]{this, new Boolean(z)});
            }
            this.mQuickReconnect = z;
            return this;
        }

        public Builder setStoreId(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("400b8d1a", new Object[]{this, str});
            }
            this.mStoreId = str;
            return this;
        }

        public Builder setTag(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("6f80ac9c", new Object[]{this, str});
            }
            this.mTag = str;
            return this;
        }

        public Builder setTriggerChannel(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("b595c976", new Object[]{this, new Integer(i)});
            }
            this.mTriggerChannel = i;
            return this;
        }

        public Builder setVersion(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("947caa9f", new Object[]{this, new Integer(i)});
            }
            this.version = i;
            return this;
        }

        public AccsClientConfig build() throws AccsException {
            Map<String, AccsClientConfig> map;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (AccsClientConfig) ipChange.ipc$dispatch("89319e87", new Object[]{this});
            }
            if (!TextUtils.isEmpty(this.mAppKey)) {
                AccsClientConfig accsClientConfig = new AccsClientConfig();
                AccsClientConfig.access$002(accsClientConfig, this.mAppKey);
                AccsClientConfig.access$102(accsClientConfig, this.mAppSecret);
                AccsClientConfig.access$202(accsClientConfig, this.mAuthCode);
                AccsClientConfig.access$302(accsClientConfig, this.mKeepalive);
                AccsClientConfig.access$402(accsClientConfig, this.mAutoUnit);
                AccsClientConfig.access$502(accsClientConfig, this.mInappPubKey);
                AccsClientConfig.access$602(accsClientConfig, this.mInappHost);
                AccsClientConfig.access$702(accsClientConfig, this.mTag);
                AccsClientConfig.access$802(accsClientConfig, this.mStoreId);
                AccsClientConfig.access$902(accsClientConfig, this.mConfigEnv);
                AccsClientConfig.access$1002(accsClientConfig, this.mQuickReconnect);
                AccsClientConfig.access$1102(accsClientConfig, this.mAccsHeartbeatEnable);
                AccsClientConfig.access$1202(accsClientConfig, this.mPullUpEnable);
                AccsClientConfig.access$1302(accsClientConfig, this.mForePingEnable);
                AccsClientConfig.access$1402(accsClientConfig, this.mPingTimeout);
                AccsClientConfig.access$1502(accsClientConfig, this.connType);
                AccsClientConfig.access$1602(accsClientConfig, this.version);
                NoTraceTriggerHelper.f6094a = this.mTriggerChannel;
                if (AccsClientConfig.access$900(accsClientConfig) < 0) {
                    AccsClientConfig.access$902(accsClientConfig, AccsClientConfig.mEnv);
                }
                if (TextUtils.isEmpty(AccsClientConfig.access$100(accsClientConfig))) {
                    AccsClientConfig.access$1702(accsClientConfig, 0);
                } else {
                    AccsClientConfig.access$1702(accsClientConfig, 2);
                }
                if (TextUtils.isEmpty(AccsClientConfig.access$600(accsClientConfig))) {
                    AccsClientConfig.access$602(accsClientConfig, AccsClientConfig.DEFAULT_CENTER_HOSTS[AccsClientConfig.access$900(accsClientConfig)]);
                }
                if (TextUtils.isEmpty(AccsClientConfig.access$700(accsClientConfig))) {
                    AccsClientConfig.access$702(accsClientConfig, "default");
                }
                int access$900 = AccsClientConfig.access$900(accsClientConfig);
                if (access$900 == 1) {
                    map = AccsClientConfig.mPreviewConfigs;
                } else if (access$900 != 2) {
                    map = AccsClientConfig.mReleaseConfigs;
                } else {
                    map = AccsClientConfig.mDebugConfigs;
                }
                ALog.d(AccsClientConfig.TAG, CartRecommendRefreshScene.build, "config", accsClientConfig);
                AccsClientConfig accsClientConfig2 = map.get(accsClientConfig.getTag());
                if (accsClientConfig2 != null) {
                    ALog.w(AccsClientConfig.TAG, "build conver", "old config", accsClientConfig2);
                }
                map.put(accsClientConfig.getTag(), accsClientConfig);
                return accsClientConfig;
            }
            throw new AccsException("appkey null");
        }
    }

    static {
        t2o.a(343932932);
    }

    @Deprecated
    public static AccsClientConfig getConfig(String str) {
        Map<String, AccsClientConfig> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AccsClientConfig) ipChange.ipc$dispatch("7259c633", new Object[]{str});
        }
        int i = mEnv;
        if (i == 1) {
            map = mPreviewConfigs;
        } else if (i != 2) {
            map = mReleaseConfigs;
        } else {
            map = mDebugConfigs;
        }
        for (AccsClientConfig accsClientConfig : map.values()) {
            if (accsClientConfig.mAppKey.equals(str) && accsClientConfig.mConfigEnv == mEnv) {
                return accsClientConfig;
            }
        }
        ALog.e(TAG, "getConfigByTag return null", "appkey", str);
        return null;
    }

    public static AccsClientConfig getConfigByTag(String str) {
        AccsClientConfig accsClientConfig;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AccsClientConfig) ipChange.ipc$dispatch("2b9c5aa0", new Object[]{str});
        }
        int i = mEnv;
        if (i == 0) {
            accsClientConfig = mReleaseConfigs.get(str);
        } else if (i == 1) {
            accsClientConfig = mPreviewConfigs.get(str);
        } else if (i != 2) {
            accsClientConfig = mReleaseConfigs.get(str);
        } else {
            accsClientConfig = mDebugConfigs.get(str);
        }
        if (accsClientConfig == null) {
            ALog.e(TAG, "getConfigByTag return null", Constants.KEY_CONFIG_TAG, str);
        }
        return accsClientConfig;
    }

    public static void setAccsConfig(int i, AccsClientConfig accsClientConfig) {
        Map<String, AccsClientConfig> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("941ff3ac", new Object[]{new Integer(i), accsClientConfig});
            return;
        }
        if (i == 1) {
            map = mPreviewConfigs;
        } else if (i != 2) {
            map = mReleaseConfigs;
        } else {
            map = mDebugConfigs;
        }
        AccsClientConfig accsClientConfig2 = map.get(accsClientConfig.getTag());
        if (accsClientConfig2 != null) {
            ALog.w(TAG, "build conver", "old config", accsClientConfig2);
        }
        map.put(accsClientConfig.getTag(), accsClientConfig);
    }
}
