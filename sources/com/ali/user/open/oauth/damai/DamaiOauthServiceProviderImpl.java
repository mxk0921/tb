package com.ali.user.open.oauth.damai;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.webkit.CookieManager;
import com.ali.user.open.core.config.ConfigManager;
import com.ali.user.open.oauth.AppCredential;
import com.ali.user.open.oauth.OauthCallback;
import com.ali.user.open.oauth.base.BaseOauthServiceProviderImpl;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Pattern;
import tb.h1p;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class DamaiOauthServiceProviderImpl extends BaseOauthServiceProviderImpl {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "oa.DamaiOauthServiceProviderImpl";
    private transient Pattern[] mLoginPatterns;

    public static /* synthetic */ Object ipc$super(DamaiOauthServiceProviderImpl damaiOauthServiceProviderImpl, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ali/user/open/oauth/damai/DamaiOauthServiceProviderImpl");
    }

    @Override // com.ali.user.open.oauth.OauthServiceProvider
    public boolean isLoginUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cf81cf25", new Object[]{this, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            if (this.mLoginPatterns == null && !TextUtils.isEmpty(ConfigManager.DAMAI_LOGIN_URLS)) {
                String[] split = ConfigManager.DAMAI_LOGIN_URLS.split("[,]");
                Pattern[] patternArr = new Pattern[split.length];
                this.mLoginPatterns = patternArr;
                int length = patternArr.length;
                for (int i = 0; i < length; i++) {
                    this.mLoginPatterns[i] = Pattern.compile(split[i]);
                }
            }
            for (Pattern pattern : this.mLoginPatterns) {
                if (pattern.matcher(str).matches()) {
                    return true;
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return false;
    }

    @Override // com.ali.user.open.oauth.OauthServiceProvider
    public void logout(Context context, String str) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0d96de1", new Object[]{this, context, str});
            return;
        }
        try {
            Iterator<String> it = new ArrayList<String>() { // from class: com.ali.user.open.oauth.damai.DamaiOauthServiceProviderImpl.1
                {
                    add("damai.cn");
                }
            }.iterator();
            while (it.hasNext()) {
                String next = it.next();
                String cookie = CookieManager.getInstance().getCookie(next);
                if (!TextUtils.isEmpty(cookie) && (split = cookie.split(";")) != null && split.length > 0) {
                    for (String str2 : split) {
                        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd-MMM-yyyy HH:mm:ss 'GMT'", Locale.ENGLISH);
                        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT+8"));
                        CookieManager.getInstance().setCookie(h1p.HTTP_PREFIX + next, str2 + "; Domain=." + next + "; Expires=" + simpleDateFormat.format((Object) 1000));
                    }
                    CookieManager.getInstance().flush();
                }
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.ali.user.open.oauth.OauthServiceProvider
    public void oauth(Activity activity, String str, AppCredential appCredential, Map<String, String> map, OauthCallback oauthCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ed2f1ff", new Object[]{this, activity, str, appCredential, map, oauthCallback});
        }
    }
}
