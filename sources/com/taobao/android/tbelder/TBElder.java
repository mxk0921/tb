package com.taobao.android.tbelder;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.revisionswitch.TBRevisionSwitchManager;
import com.taobao.android.tbelder.jsplugins.TBElderJSBridge;
import com.taobao.android.tbelder.jsplugins.TBElderWXModule;
import com.taobao.mytaobao.newsetting.FontSetting;
import com.taobao.weex.WXSDKEngine;
import com.taobao.weex.common.WXException;
import java.util.HashMap;
import mtopsdk.mtop.intf.Mtop;
import tb.fsw;
import tb.vbr;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class TBElder {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_REVISION_SWITCH_CHANGE = "taobao.action.ACTION_REVISION_SWITCH_CHANGE";
    public static final String ACTION_TBELDER_VALUE_CHANGED = "taobao.action.ACTION_TBELDER_VALUE_CHANGED";
    public static final int DEFAULT_ELDER_FONT_LEVEL = 3;
    public static final String DEFAULT_FLAG_TRUE_VALUE = "1";
    public static final String SP_COEFFICIENT_KEY = "coefficient";
    public static final String SP_NAME = "fontSetting";
    public static final int STANDARD_FONT_LEVEL = 1;

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("843ec47a", new Object[0])).booleanValue();
        }
        if (!vbr.c(true)) {
            Log.e("TBElder", "orange ab-test switched off");
            return false;
        } else if (!c()) {
            return false;
        } else {
            String e = TBRevisionSwitchManager.c().e("evo_is_large_font");
            Log.e("TBElder", "largeFontValue" + e);
            return "1".equals(e);
        }
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5178e50a", new Object[0])).booleanValue();
        }
        String e = TBRevisionSwitchManager.c().e("elderHome");
        Log.e("TBElder", "elderHomeValue" + e);
        return "1".equals(e);
    }

    public static void d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f703eb0", new Object[]{context});
            return;
        }
        try {
            Mtop.instance(context).getMtopConfig().mtopGlobalHeaders.remove("elderFont");
        } catch (Throwable th) {
            Log.e("TBElder", "error in recoverMTopGlobalConfig: " + th.getMessage());
        }
    }

    public static void f() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e36f455b", new Object[0]);
            return;
        }
        try {
            WXSDKEngine.registerModule("TBElder", TBElderWXModule.class);
            i = 1;
            fsw.h("TBElder", TBElderJSBridge.class);
        } catch (WXException unused) {
            Log.e("TBElder", "error in registerJSPlugins, step " + i);
        }
    }

    public static void h(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71d7f36b", new Object[]{context});
            return;
        }
        try {
            Mtop.instance(context).getMtopConfig().mtopGlobalHeaders.put("elderFont", "true");
        } catch (Throwable th) {
            Log.e("TBElder", "error in updateMTopGlobalConfig: " + th.getMessage());
        }
    }

    public static void i(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d025151", new Object[]{context});
        } else if (!b()) {
            d(context);
            e(context);
        } else {
            h(context);
            g(context, 3);
        }
    }

    public static void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{application, hashMap});
            return;
        }
        vbr.e();
        Log.e("TBElder", "init");
        if (!vbr.d(true)) {
            Log.e("TBElder", "abort init");
            return;
        }
        i(application);
        Log.e("TBElder", "register broadcast receiver.");
        LocalBroadcastManager.getInstance(application).registerReceiver(new BroadcastReceiver() { // from class: com.taobao.android.tbelder.TBElder.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tbelder/TBElder$1");
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                    return;
                }
                Log.e("TBElder", "onReceive.");
                LocalBroadcastManager.getInstance(context).sendBroadcast(new Intent(TBElder.ACTION_TBELDER_VALUE_CHANGED));
                TBElder.i(context);
            }
        }, new IntentFilter("taobao.action.ACTION_REVISION_SWITCH_CHANGE"));
        f();
    }

    public static void e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e1d942c", new Object[]{context});
            return;
        }
        Log.e("TBElder", "recover config");
        g(context, 1);
    }

    public static void g(Context context, int i) {
        try {
            IpChange ipChange = FontSetting.$ipChange;
            FontSetting.class.getMethod("setFontCofficient", Context.class, Integer.TYPE, String.class).invoke(null, context, Integer.valueOf(i), "TBElder");
        } catch (Exception unused) {
            Log.e("TBElder", "error in updateFontGlobalConfig. " + i);
        }
    }
}
