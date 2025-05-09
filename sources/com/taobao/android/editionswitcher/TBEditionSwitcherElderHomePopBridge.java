package com.taobao.android.editionswitcher;

import android.content.Intent;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.android.revisionswitch.TBRevisionSwitchManager;
import com.taobao.statistic.TBS;
import com.taobao.tao.Globals;
import com.taobao.tao.log.TLog;
import tb.a3w;
import tb.kpw;
import tb.nsw;
import tb.r78;
import tb.s78;
import tb.t2o;
import tb.t7l;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class TBEditionSwitcherElderHomePopBridge extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ACTION_SETTING_RECEIVER = "com.taobao.option.checkoption";
    private static final String PAGE_HOME = "Page_Home";
    private static final String TAG = "EditionPositionSwitcher";

    static {
        t2o.a(456130593);
    }

    public static void commitEvent(String str, int i, Object obj, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb96d94", new Object[]{str, new Integer(i), obj, strArr});
            return;
        }
        try {
            TBS.Ext.commitEvent(str, i, obj, null, null, strArr);
        } catch (Exception unused) {
        }
    }

    public static /* synthetic */ Object ipc$super(TBEditionSwitcherElderHomePopBridge tBEditionSwitcherElderHomePopBridge, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/editionswitcher/TBEditionSwitcherElderHomePopBridge");
    }

    private boolean isElder() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f4e0938b", new Object[]{this})).booleanValue();
        }
        return "1".equals(TBRevisionSwitchManager.c().e("elderHome"));
    }

    private boolean exitElderHome(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b9a9e01d", new Object[]{this, str, wVCallBackContext})).booleanValue();
        }
        if (!isElder()) {
            return true;
        }
        String str2 = "unknown";
        if (!TextUtils.isEmpty(str)) {
            try {
                String string = JSON.parseObject(str).getString("source");
                if (!TextUtils.isEmpty(str2)) {
                    str2 = string;
                }
            } catch (Exception unused) {
            }
        }
        Intent intent = new Intent(ACTION_SETTING_RECEIVER);
        intent.putExtra("TaoOptionKey", "switcherVersion");
        intent.putExtra("switcherVersion", "standard_version");
        LocalBroadcastManager.getInstance(Globals.getApplication()).sendBroadcast(intent);
        r78.b().a(s78.d().a("ElderHomePopBridge").b(a3w.h().f("standard_version").c("switcherVersion", "standard_version")), new t7l(r78.TRIGGER_REQUEST));
        commitEvent("Page_Home", 2101, "button-elder—change", "action=exitElderHome", "source=" + str2);
        TLog.loge("Page_Home", "EditionPositionSwitcher", "action=exitElderHome,source=" + str2);
        wVCallBackContext.success();
        return true;
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        TLog.logd("Edition_Switcher", "TBEditionSwitcherElderHomePopBridge; bridge: action" + str + "params:" + str2);
        if ("enterElderHome".equals(str)) {
            return enterElderHome(str2, wVCallBackContext);
        }
        if ("exitElderHome".equals(str)) {
            return exitElderHome(str2, wVCallBackContext);
        }
        nsw nswVar = new nsw();
        nswVar.b("errorMsg", "no matched method");
        wVCallBackContext.error(nswVar);
        return false;
    }

    private boolean enterElderHome(String str, WVCallBackContext wVCallBackContext) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e4240423", new Object[]{this, str, wVCallBackContext})).booleanValue();
        }
        if ("1".equals(TBRevisionSwitchManager.c().e("elderHome"))) {
            return true;
        }
        String str2 = "unknown";
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject parseObject = JSON.parseObject(str);
                z = "true".equals(parseObject.getString("backHome"));
                String string = parseObject.getString("source");
                if (!TextUtils.isEmpty(str2)) {
                    str2 = string;
                }
            } catch (Exception unused) {
            }
        }
        r78.b().a(s78.d().a("ElderHomePopBridge").b(a3w.h().f("elder_version").c("switcherVersion", "elder_version")), new t7l(r78.TRIGGER_REQUEST));
        if (z) {
            Nav.from(this.mContext).toUri("http://m.taobao.com/index.htm");
        }
        commitEvent("Page_Home", 2101, "button-elder—change", "action=enterElderHome", "source=" + str2);
        TLog.loge("Page_Home", "EditionPositionSwitcher", "action=enterElderHome,source=" + str2);
        wVCallBackContext.success();
        return true;
    }
}
