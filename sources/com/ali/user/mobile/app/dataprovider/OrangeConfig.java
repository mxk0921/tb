package com.ali.user.mobile.app.dataprovider;

import android.text.TextUtils;
import com.ali.user.mobile.utils.LanguageUtil;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.utils.LoginSwitch;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class OrangeConfig {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String DEFAULT_VALUE = "none";

    static {
        t2o.a(68157457);
    }

    public StringOrangeResult customProtocol() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StringOrangeResult) ipChange.ipc$dispatch("76b8ab07", new Object[]{this});
        }
        String language = LanguageUtil.getLanguage();
        return doStringReadOrangeConfig("custom_protocol_" + language);
    }

    public StringOrangeResult customXianyuProtocol() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StringOrangeResult) ipChange.ipc$dispatch("a38623e1", new Object[]{this});
        }
        String language = LanguageUtil.getLanguage();
        return doStringReadOrangeConfig("custom_protocol_xianyu_" + language);
    }

    public IntOrangeResult getMtopTimeOutMilliSecond() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IntOrangeResult) ipChange.ipc$dispatch("9691da64", new Object[]{this});
        }
        return doIntReadOrangeConfig(LoginSwitch.RPC_TIMEOUT_MS);
    }

    public StringOrangeResult helpLink() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StringOrangeResult) ipChange.ipc$dispatch("8f8cb1b9", new Object[]{this});
        }
        return doStringReadOrangeConfig(LoginSwitch.HELP_LINK);
    }

    public BooleanOrangeResult needRegister() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BooleanOrangeResult) ipChange.ipc$dispatch("6aabcb50", new Object[]{this});
        }
        return doBooleanReadOrangeConfig(LoginSwitch.ENABLE_REGISTER);
    }

    private BooleanOrangeResult doBooleanReadOrangeConfig(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BooleanOrangeResult) ipChange.ipc$dispatch("51e34ddc", new Object[]{this, str});
        }
        BooleanOrangeResult booleanOrangeResult = new BooleanOrangeResult();
        String config = LoginSwitch.getConfig(str, "none");
        if (TextUtils.equals(config, "none")) {
            booleanOrangeResult.orangeExist = false;
        } else {
            booleanOrangeResult.orangeExist = true;
            booleanOrangeResult.value = TextUtils.equals("true", config);
        }
        return booleanOrangeResult;
    }

    private IntOrangeResult doIntReadOrangeConfig(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IntOrangeResult) ipChange.ipc$dispatch("e214acce", new Object[]{this, str});
        }
        IntOrangeResult intOrangeResult = new IntOrangeResult();
        String config = LoginSwitch.getConfig(str, "none");
        if (TextUtils.equals(config, "none")) {
            intOrangeResult.orangeExist = false;
        } else {
            intOrangeResult.orangeExist = true;
            try {
                intOrangeResult.value = Integer.parseInt(config);
            } catch (Throwable unused) {
                intOrangeResult.orangeExist = false;
            }
        }
        return intOrangeResult;
    }

    public StringOrangeResult doStringReadOrangeConfig(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StringOrangeResult) ipChange.ipc$dispatch("37ae4a", new Object[]{this, str});
        }
        StringOrangeResult stringOrangeResult = new StringOrangeResult();
        String config = LoginSwitch.getConfig(str, "none");
        if (TextUtils.equals(config, "none")) {
            stringOrangeResult.orangeExist = false;
        } else {
            stringOrangeResult.orangeExist = true;
            stringOrangeResult.value = config;
        }
        return stringOrangeResult;
    }
}
