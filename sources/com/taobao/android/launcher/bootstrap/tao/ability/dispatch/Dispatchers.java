package com.taobao.android.launcher.bootstrap.tao.ability.dispatch;

import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.common.LauncherRuntime;
import com.taobao.android.tcrash.TCrashSDK;
import com.taobao.android.tcrash.UncaughtCrashHeader;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.atomic.AtomicReference;
import tb.b8l;
import tb.f7k;
import tb.f7l;
import tb.fxp;
import tb.sng;
import tb.t;
import tb.v9m;
import tb.whh;
import tb.xhq;
import tb.xq7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class Dispatchers {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TYPE_ACTIVITY = "Activity";
    public static final String TYPE_CUSTOMIZED = "Customized";
    public static final String TYPE_RECEIVER = "Receiver";
    public static final String TYPE_SERVICE = "Service";

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicReference<xq7> f8154a = new AtomicReference<>(null);

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public @interface Type {
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6130aa94", new Object[]{str, str2});
            return;
        }
        UncaughtCrashHeader crashCaughtHeader = TCrashSDK.instance().getCrashCaughtHeader();
        crashCaughtHeader.addHeaderInfo("NGQoSDispatchers" + str, str2);
    }

    public static void b(xq7 xq7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("537fb830", new Object[]{xq7Var});
        } else {
            sng.a(f8154a, null, xq7Var);
        }
    }

    public static xq7 c(Message message, String str, b8l b8lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xq7) ipChange.ipc$dispatch("bedbc076", new Object[]{message, str, b8lVar});
        }
        return d(message, str, b8lVar, null);
    }

    public static xq7 d(Message message, String str, b8l b8lVar, xhq xhqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xq7) ipChange.ipc$dispatch("1abe5155", new Object[]{message, str, b8lVar, xhqVar});
        }
        whh.a("Dispatchers", "create Dispatcher with type=" + str + ", msg.what=" + message.what + ", process=" + b8lVar.b);
        if (!t.a(null, "ngMultiSessionEnabledV2_" + str)) {
            return new f7k(message, str);
        }
        if (e(b8lVar, xhqVar)) {
            return new f7k(message, str);
        }
        String f = f(b8lVar.b);
        if (!t.a(null, "ngActivityThread_" + f)) {
            return new f7k(message, str);
        }
        return new v9m(message, str);
    }

    public static boolean e(b8l b8lVar, xhq xhqVar) {
        fxp fxpVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("979b3feb", new Object[]{b8lVar, xhqVar})).booleanValue();
        }
        if (TextUtils.equals(LauncherRuntime.PROCESS_SAFEMODE, b8lVar.b)) {
            return true;
        }
        if (!TextUtils.equals(b8lVar.f16248a, b8lVar.b)) {
            return false;
        }
        if (xhqVar != null) {
            fxpVar = fxp.b(xhqVar);
        } else {
            fxpVar = fxp.j();
        }
        if (fxp.g(fxpVar) == 1) {
            return true;
        }
        return false;
    }

    public static void g(String str, xq7 xq7Var, Message message) {
        boolean c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32f19124", new Object[]{str, xq7Var, message});
            return;
        }
        Handler target = message.getTarget();
        try {
            whh.a(str, "run#" + xq7Var.getType() + "(what=" + message.what + f7l.BRACKET_END_STR);
            target.handleMessage(message);
        } finally {
            if (c) {
            }
        }
    }

    public static String f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a9ba71ed", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int lastIndexOf = str.lastIndexOf(":");
        if (lastIndexOf < 0) {
            return "main";
        }
        return str.substring(lastIndexOf + 1);
    }
}
