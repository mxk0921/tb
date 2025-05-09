package com.alipay.mobile.common.transportext.biz.mmtp.mrpc.cookie;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Locale;
import org.apache.http.cookie.Cookie;
import org.apache.http.cookie.CookieOrigin;
import org.apache.http.cookie.MalformedCookieException;
import org.apache.http.impl.cookie.RFC2109DomainHandler;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class MRFC2109DomainHandler extends RFC2109DomainHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(MRFC2109DomainHandler mRFC2109DomainHandler, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/common/transportext/biz/mmtp/mrpc/cookie/MRFC2109DomainHandler");
    }

    public void validate(Cookie cookie, CookieOrigin cookieOrigin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bdad8b7", new Object[]{this, cookie, cookieOrigin});
        } else if (cookie == null) {
            throw new IllegalArgumentException("Cookie may not be null");
        } else if (cookieOrigin != null) {
            String host = cookieOrigin.getHost();
            String domain = cookie.getDomain();
            if (domain == null) {
                throw new MalformedCookieException("Cookie domain may not be null");
            } else if (domain.equals(host)) {
            } else {
                if (domain.indexOf(46) == -1) {
                    throw new MalformedCookieException("Domain attribute \"" + domain + "\" does not match the host \"" + host + "\"");
                } else if (domain.startsWith(".")) {
                    int indexOf = domain.indexOf(46, 1);
                    if (indexOf < 0 || indexOf == domain.length() - 1) {
                        throw new MalformedCookieException("Domain attribute \"" + domain + "\" violates RFC 2109: domain must contain an embedded dot");
                    }
                    String lowerCase = host.toLowerCase(Locale.ENGLISH);
                    if (!lowerCase.endsWith(domain)) {
                        throw new MalformedCookieException("Illegal domain attribute \"" + domain + "\". Domain of origin: \"" + lowerCase + "\"");
                    }
                } else {
                    throw new MalformedCookieException("Domain attribute \"" + domain + "\" violates RFC 2109: domain must start with a dot");
                }
            }
        } else {
            throw new IllegalArgumentException("Cookie origin may not be null");
        }
    }
}
