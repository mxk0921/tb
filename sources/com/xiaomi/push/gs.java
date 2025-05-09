package com.xiaomi.push;

import com.alibaba.wireless.security.SecExceptionCode;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class gs {
    public static int a(Throwable th) {
        boolean z = th instanceof hb;
        if (z) {
            hb hbVar = (hb) th;
            if (hbVar.a() != null) {
                th = hbVar.a();
            }
        }
        String message = th.getMessage();
        if (th.getCause() != null) {
            message = th.getCause().getMessage();
        }
        if (th instanceof SocketTimeoutException) {
            return 105;
        }
        if (th instanceof SocketException) {
            if (message.indexOf("Network is unreachable") != -1) {
                return 102;
            }
            if (message.indexOf("Connection refused") != -1) {
                return 103;
            }
            if (message.indexOf("Connection timed out") != -1) {
                return 105;
            }
            if (message.endsWith("EACCES (Permission denied)")) {
                return 101;
            }
            if (message.indexOf("Connection reset by peer") != -1) {
                return 109;
            }
            if (message.indexOf("Broken pipe") != -1) {
                return 110;
            }
            if (message.indexOf("No route to host") != -1) {
                return 104;
            }
            if (message.endsWith("EINVAL (Invalid argument)")) {
                return 106;
            }
            return 199;
        } else if (th instanceof UnknownHostException) {
            return 107;
        } else {
            if (z) {
                return SecExceptionCode.SEC_ERROR_STA_UNKNOWN_ERROR;
            }
            return 0;
        }
    }
}
