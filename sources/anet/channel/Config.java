package anet.channel;

import android.text.TextUtils;
import anet.channel.entity.ENV;
import anet.channel.security.ISecurity;
import anet.channel.security.SecurityManager;
import anet.channel.util.ALog;
import anet.channel.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class Config {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "awcn.Config";
    private String appSecret;
    private String appkey;
    private String authCode;
    private ENV env = ENV.ONLINE;
    private ISecurity iSecurity;
    private String tag;
    private static Map<String, Config> configMap = new HashMap();
    public static final Config DEFAULT_CONFIG = new Builder().setTag("[default]").setAppkey("[default]").setEnv(ENV.ONLINE).build();

    static {
        t2o.a(607125509);
    }

    public static /* synthetic */ Map access$000() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c8ee3d6c", new Object[0]);
        }
        return configMap;
    }

    public static /* synthetic */ ENV access$100(Config config) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ENV) ipChange.ipc$dispatch("860a4cd9", new Object[]{config});
        }
        return config.env;
    }

    public static /* synthetic */ ENV access$102(Config config, ENV env) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ENV) ipChange.ipc$dispatch("2b480a4c", new Object[]{config, env});
        }
        config.env = env;
        return env;
    }

    public static /* synthetic */ String access$200(Config config) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5b90b8f9", new Object[]{config});
        }
        return config.appkey;
    }

    public static /* synthetic */ String access$202(Config config, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("523d5931", new Object[]{config, str});
        }
        config.appkey = str;
        return str;
    }

    public static /* synthetic */ String access$300(Config config) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f6317b7a", new Object[]{config});
        }
        return config.tag;
    }

    public static /* synthetic */ String access$302(Config config, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("45ccdd72", new Object[]{config, str});
        }
        config.tag = str;
        return str;
    }

    public static /* synthetic */ String access$402(Config config, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("395c61b3", new Object[]{config, str});
        }
        config.appSecret = str;
        return str;
    }

    public static /* synthetic */ String access$502(Config config, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2cebe5f4", new Object[]{config, str});
        }
        config.authCode = str;
        return str;
    }

    public static /* synthetic */ ISecurity access$602(Config config, ISecurity iSecurity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ISecurity) ipChange.ipc$dispatch("b104335f", new Object[]{config, iSecurity});
        }
        config.iSecurity = iSecurity;
        return iSecurity;
    }

    public static Config getConfig(String str, ENV env) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Config) ipChange.ipc$dispatch("76650828", new Object[]{str, env});
        }
        synchronized (configMap) {
            try {
                for (Config config : configMap.values()) {
                    if (config.env == env && config.appkey.equals(str)) {
                        return config;
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static Config getConfigByTag(String str) {
        Config config;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Config) ipChange.ipc$dispatch("34a2194c", new Object[]{str});
        }
        synchronized (configMap) {
            config = configMap.get(str);
        }
        return config;
    }

    public String getAppkey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c9396be5", new Object[]{this});
        }
        return this.appkey;
    }

    public ENV getEnv() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ENV) ipChange.ipc$dispatch("491cc26f", new Object[]{this});
        }
        return this.env;
    }

    public String getTag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("54a5a515", new Object[]{this});
        }
        return this.tag;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return this.tag;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Builder {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private String appSecret;
        private String appkey;
        private String authCode;
        private ENV env = ENV.ONLINE;
        private String tag;

        static {
            t2o.a(607125510);
        }

        public Builder setAppSecret(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("799ec8d9", new Object[]{this, str});
            }
            this.appSecret = str;
            return this;
        }

        public Builder setAppkey(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("dc644c4a", new Object[]{this, str});
            }
            this.appkey = str;
            return this;
        }

        public Builder setAuthCode(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("803ba721", new Object[]{this, str});
            }
            this.authCode = str;
            return this;
        }

        public Builder setEnv(ENV env) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("fff5ed68", new Object[]{this, env});
            }
            this.env = env;
            return this;
        }

        public Builder setTag(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("71152a82", new Object[]{this, str});
            }
            this.tag = str;
            return this;
        }

        public Config build() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Config) ipChange.ipc$dispatch("63e98a05", new Object[]{this});
            }
            if (!TextUtils.isEmpty(this.appkey)) {
                synchronized (Config.access$000()) {
                    try {
                        for (Config config : Config.access$000().values()) {
                            if (Config.access$100(config) == this.env && Config.access$200(config).equals(this.appkey)) {
                                ALog.w(Config.TAG, "duplicated config exist!", null, "appkey", this.appkey, "env", this.env);
                                if (!TextUtils.isEmpty(this.tag)) {
                                    Config.access$000().put(this.tag, config);
                                }
                                return config;
                            }
                        }
                        Config config2 = new Config();
                        Config.access$202(config2, this.appkey);
                        Config.access$102(config2, this.env);
                        if (TextUtils.isEmpty(this.tag)) {
                            Config.access$302(config2, StringUtils.concatString(this.appkey, "$", this.env.toString()));
                        } else {
                            Config.access$302(config2, this.tag);
                        }
                        Config.access$402(config2, this.appSecret);
                        Config.access$502(config2, this.authCode);
                        Config.access$602(config2, null);
                        synchronized (Config.access$000()) {
                            Config.access$000().put(Config.access$300(config2), config2);
                        }
                        return config2;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } else {
                throw new RuntimeException("appkey can not be null or empty!");
            }
        }
    }

    public ISecurity getSecurity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ISecurity) ipChange.ipc$dispatch("ca509a15", new Object[]{this});
        }
        if (this.iSecurity == null) {
            ALog.e(TAG, "lazy load security open! getSecurity!", null, new Object[0]);
            if (!TextUtils.isEmpty(this.appSecret)) {
                this.iSecurity = SecurityManager.getSecurityFactory().createNonSecurity(this.appSecret);
            } else {
                this.iSecurity = SecurityManager.getSecurityFactory().createSecurity(this.authCode);
            }
        }
        return this.iSecurity;
    }
}
