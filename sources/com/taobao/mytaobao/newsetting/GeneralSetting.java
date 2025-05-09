package com.taobao.mytaobao.newsetting;

import android.content.Intent;
import android.content.SharedPreferences;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.utils.Global;
import tb.t2o;
import tb.v7t;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class GeneralSetting {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String GENERAL_SETTING_CHANGED_ACTION = "com.taobao.generalsetting.switch.change";
    public static final String SETTING_SP_NAME = "TAO_GENERAL_SETTING_SP";
    public static final String SWITCH_CHANGE_KEY = "SwitchKey";
    public static final String TAG = "GeneralSetting";
    public static final boolean VIRTUAL_ASSISTANT_DEFAULT_VALUE = true;
    public static final String VIRTUAL_ASSISTANT_KEY = "VIRTUAL_ASSISTANT_KEY";

    static {
        t2o.a(745537774);
    }

    public static void a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f23e340a", new Object[]{str, new Boolean(z)});
            return;
        }
        Intent intent = new Intent(GENERAL_SETTING_CHANGED_ACTION);
        intent.putExtra(SWITCH_CHANGE_KEY, str);
        intent.putExtra(str, z);
        LocalBroadcastManager.getInstance(Global.getApplication()).sendBroadcast(intent);
        v7t.d(TAG, "sendBroadCast: send broadcast, key is: " + str + " value is: " + z);
    }

    public static boolean getGeneralSetting(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1d97af69", new Object[]{str, new Boolean(z)})).booleanValue();
        }
        boolean z2 = Global.getApplication().getSharedPreferences(SETTING_SP_NAME, 0).getBoolean(str, z);
        v7t.d(TAG, "getGeneralSetting: get general setting, key is: " + str + " value is: " + z2);
        return z2;
    }

    public static void b(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32fef9d9", new Object[]{str, new Boolean(z)});
            return;
        }
        SharedPreferences.Editor edit = Global.getApplication().getSharedPreferences(SETTING_SP_NAME, 0).edit();
        edit.putBoolean(str, z);
        edit.apply();
        v7t.d(TAG, "setGeneralSetting: set general setting, key is: " + str + " value is: " + z);
        a(str, z);
    }
}
