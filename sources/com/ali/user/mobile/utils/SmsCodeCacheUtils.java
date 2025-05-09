package com.ali.user.mobile.utils;

import android.text.TextUtils;
import com.ali.user.mobile.model.LoginParam;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.utils.LoginSwitch;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class SmsCodeCacheUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static SmsCodeCache curCodeCache = new SmsCodeCache();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class SmsCodeCache {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public String codeLength;
        public long expireTimeStamp;
        public String loginId;
        public String phoneCode;
        public String smsSid;

        static {
            t2o.a(70254897);
        }

        private SmsCodeCache() {
        }

        public void clear() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
                return;
            }
            this.expireTimeStamp = -1L;
            this.smsSid = "";
            this.codeLength = "";
            this.loginId = "";
            this.phoneCode = "";
        }
    }

    static {
        t2o.a(70254895);
    }

    public static void clearSmsCodeCache() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0ebdb30", new Object[0]);
            return;
        }
        SmsCodeCache smsCodeCache = curCodeCache;
        if (smsCodeCache != null) {
            smsCodeCache.clear();
        }
    }

    public static void setSmsCodeCache(String str, String str2, String str3, String str4, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d2bf9f7", new Object[]{str, str2, str3, str4, new Long(j)});
            return;
        }
        SmsCodeCache smsCodeCache = curCodeCache;
        smsCodeCache.loginId = str;
        smsCodeCache.phoneCode = str2;
        smsCodeCache.smsSid = str3;
        smsCodeCache.codeLength = str4;
        smsCodeCache.expireTimeStamp = j;
    }

    public static boolean checkAndSetSmsCodeVaild(LoginParam loginParam) {
        SmsCodeCache smsCodeCache;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("67da28cb", new Object[]{loginParam})).booleanValue();
        }
        if (loginParam == null) {
            return false;
        }
        if (!TextUtils.isEmpty(loginParam.smsSid) && !TextUtils.isEmpty(loginParam.codeLength)) {
            return true;
        }
        if (!LoginSwitch.getSwitch("use_sms_cache", "true") || (smsCodeCache = curCodeCache) == null || smsCodeCache.expireTimeStamp <= System.currentTimeMillis() || TextUtils.isEmpty(curCodeCache.smsSid) || TextUtils.isEmpty(curCodeCache.codeLength) || TextUtils.isEmpty(curCodeCache.loginId) || !curCodeCache.loginId.equals(loginParam.loginId) || TextUtils.isEmpty(curCodeCache.phoneCode) || !curCodeCache.phoneCode.equals(loginParam.phoneCode)) {
            return false;
        }
        SmsCodeCache smsCodeCache2 = curCodeCache;
        loginParam.smsSid = smsCodeCache2.smsSid;
        loginParam.codeLength = smsCodeCache2.codeLength;
        return true;
    }
}
