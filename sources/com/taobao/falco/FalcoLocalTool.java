package com.taobao.falco;

import android.content.Context;
import android.content.SharedPreferences;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import anet.channel.util.ALog;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.crt;
import tb.e1r;
import tb.fsw;
import tb.kpw;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class FalcoLocalTool extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final long DAY_MS = 86400000;
    private static final String SP_STATUS_KEY = "falco_local_debug_t";
    private static final String TAG = "falco.LocalTool";
    private static final String WV_METHOD_DISABLE = "disable";
    private static final String WV_METHOD_ENABLE = "enable";
    private static final String WV_PLUGIN_NAME = "FalcoLocalDebugPlugin";
    private static volatile boolean enable;
    private static final CopyOnWriteArrayList<b> listeners = new CopyOnWriteArrayList<>();
    private static SharedPreferences preferences;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f10450a;
        public final /* synthetic */ WVCallBackContext b;
        public final /* synthetic */ String d;

        public a(String str, String str2, WVCallBackContext wVCallBackContext) {
            this.d = str;
            this.f10450a = str2;
            this.b = wVCallBackContext;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                FalcoLocalTool.access$000(FalcoLocalTool.this, this.d, this.f10450a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface b {
        void a(boolean z);
    }

    public static /* synthetic */ void access$000(FalcoLocalTool falcoLocalTool, String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45aedbd0", new Object[]{falcoLocalTool, str, str2, wVCallBackContext});
        } else {
            falcoLocalTool.handlerAction(str, str2, wVCallBackContext);
        }
    }

    private void handlerAction(String str, String str2, WVCallBackContext wVCallBackContext) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5ae93f8", new Object[]{this, str, str2, wVCallBackContext});
            return;
        }
        if ("enable".equals(str)) {
            z = !enable;
            enable = true;
        } else if ("disable".equals(str)) {
            z = enable;
            enable = false;
        } else {
            z = false;
        }
        if (enable) {
            preferences.edit().putLong(SP_STATUS_KEY, System.currentTimeMillis()).apply();
        } else {
            preferences.edit().remove(SP_STATUS_KEY).apply();
        }
        if (z) {
            Iterator<b> it = listeners.iterator();
            while (it.hasNext()) {
                try {
                    it.next().a(enable);
                } catch (Exception e) {
                    ALog.e(TAG, "[handlerAction] error", null, e, new Object[0]);
                }
            }
        }
        wVCallBackContext.success();
    }

    public static /* synthetic */ Object ipc$super(FalcoLocalTool falcoLocalTool, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/falco/FalcoLocalTool");
    }

    public static boolean isEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2312d58", new Object[0])).booleanValue();
        }
        return enable;
    }

    public static void register(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("381c355e", new Object[]{context});
            return;
        }
        try {
            fsw.h(WV_PLUGIN_NAME, FalcoLocalTool.class);
        } catch (Throwable th) {
            ALog.e(TAG, "[register] error", null, th, new Object[0]);
        }
        preferences = context.getSharedPreferences(FalcoEnvironmentImpl.MONITOR_MODULE, 0);
        if (e1r.e()) {
            enable = true;
            return;
        }
        long j = preferences.getLong(SP_STATUS_KEY, -1L);
        if (j > 0 && System.currentTimeMillis() - j <= 86400000) {
            enable = true;
        }
    }

    public static void registerEnableListener(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8094dcc1", new Object[]{bVar});
        } else if (bVar != null) {
            CopyOnWriteArrayList<b> copyOnWriteArrayList = listeners;
            if (!copyOnWriteArrayList.contains(bVar)) {
                copyOnWriteArrayList.add(bVar);
                bVar.a(enable);
            }
        }
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (!"enable".equals(str) && !"disable".equals(str)) {
            return false;
        }
        crt.o(new a(str, str2, wVCallBackContext));
        return true;
    }
}
