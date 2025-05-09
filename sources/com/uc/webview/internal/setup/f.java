package com.uc.webview.internal.setup;

import android.text.TextUtils;
import com.uc.webview.base.EnvInfo;
import com.uc.webview.base.ErrorCode;
import com.uc.webview.base.Log;
import com.uc.webview.base.UCKnownException;
import com.uc.webview.base.b;
import com.uc.webview.base.io.PathUtils;
import com.uc.webview.base.io.d;
import com.uc.webview.base.task.c;
import com.uc.webview.base.timing.StartupTimingKeys;
import com.uc.webview.export.Build;
import com.uc.webview.export.extension.ICoreVersion;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class f extends c {
    private static final String f = "f";
    n c;
    l d;
    UCKnownException e;
    private final String g;

    private f(String str) {
        this.g = str;
    }

    public static f h() {
        return new f("ucbsinit");
    }

    private b.a i() {
        String str;
        String str2 = null;
        if (TextUtils.isEmpty(this.g)) {
            Log.w(f, "buildLogInfo invalid type");
            return null;
        }
        UCKnownException uCKnownException = this.e;
        if (uCKnownException == null) {
            l lVar = this.d;
            uCKnownException = (lVar == null || lVar.failedInfo() == null) ? null : this.d.failedInfo().exception();
        }
        if (uCKnownException == null) {
            Log.w(f, "buildLogInfo invalid exception");
            return null;
        }
        Throwable rootCause = uCKnownException.getRootCause();
        b.a aVar = new b.a(this.g, rootCause);
        ICoreVersion iCoreVersion = ICoreVersion.Instance.get();
        if (iCoreVersion != null) {
            aVar.a("coreVersion", iCoreVersion.version()).a("coreTimestamp", iCoreVersion.buildTimestamp());
        }
        int errCode = uCKnownException.errCode();
        String errMsg = uCKnownException.errMsg();
        if (rootCause instanceof UCKnownException) {
            StringBuilder sb = new StringBuilder();
            sb.append(errCode);
            if (!TextUtils.isEmpty(uCKnownException.errCodeDescription())) {
                sb.append(":");
                sb.append(uCKnownException.errCodeDescription());
            }
            if (!TextUtils.isEmpty(errMsg)) {
                sb.append(":");
                sb.append(errMsg);
            }
            str = sb.toString();
            aVar.a("stackFunc", str);
        } else {
            str = rootCause.toString();
        }
        aVar.a("ucbsVersion", Build.Version.NAME).a("supportMin", Build.Version.SUPPORT_U4_MIN).a("apiLevel", String.valueOf(Build.Version.API_LEVEL)).a("errorCode", String.valueOf(errCode)).a("errorMessage", errMsg).a("k_reason", str);
        if (!ErrorCode.COMPATIABLE_NOT_SUPPORT_ARCH.equals(errCode)) {
            n nVar = this.c;
            String str3 = "null";
            b.a b = aVar.b("setupConfigs", nVar != null ? nVar.toString() : str3);
            l lVar2 = this.d;
            if (lVar2 != null) {
                str3 = lVar2.toString();
            }
            b.b("runningCore", str3).b("rootDirFiles", d.a(EnvInfo.getContext()));
            l lVar3 = this.d;
            if (lVar3 != null) {
                str2 = a(lVar3.coreClassLoader());
            }
            if (!TextUtils.isEmpty(str2)) {
                aVar.b("nativeLibsInfo", str2);
            }
            Map<String, String> map = PathUtils.f14269a;
            if (map != null) {
                aVar.b("namesMap", map.toString());
            }
        }
        StringBuilder sb2 = new StringBuilder();
        try {
            Log.a(sb2);
        } catch (Throwable th) {
            sb2.append("flushCachedLogs failed:" + Log.a(th));
        }
        aVar.b("init logs", sb2.toString());
        return aVar;
    }

    @Override // com.uc.webview.base.task.c
    public final c a() {
        return a(1000L);
    }

    @Override // com.uc.webview.base.task.c, java.util.concurrent.Callable
    public final /* synthetic */ c.C0833c call() throws Exception {
        return call();
    }

    @Override // com.uc.webview.base.task.c
    public final void d() {
        b.a i = i();
        if (i != null) {
            b.a(i);
        }
    }

    @Override // com.uc.webview.base.task.c
    public final String e() {
        return f;
    }

    @Override // com.uc.webview.base.task.c
    public final int f() {
        return StartupTimingKeys.FAILURE_REPORTER;
    }

    public static String a(ClassLoader classLoader) {
        String[][] a2;
        if (classLoader == null || (a2 = EnvInfo.a(classLoader)) == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder("[name, length, md5, sha1, sha256]\n");
        for (String[] strArr : a2) {
            sb.append(Arrays.toString(strArr));
            sb.append("\n");
        }
        return sb.toString();
    }
}
