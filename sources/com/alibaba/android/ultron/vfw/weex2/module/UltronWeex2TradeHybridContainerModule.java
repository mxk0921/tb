package com.alibaba.android.ultron.vfw.weex2.module;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.alibaba.android.ultron.vfw.weex2.UltronWeex2DialogFragment;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.widget.UltronTradeHybridActivity;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.a;
import com.taobao.android.weex_framework.module.MUSModule;
import com.taobao.android.weex_framework.ui.MUSMethod;
import com.taobao.taobao.R;
import tb.hav;
import tb.rgv;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class UltronWeex2TradeHybridContainerModule extends MUSModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MODULE_NAME = "TradeHybridContainer";
    private static final String TAG = "UltronWeex2TradeHybridContainerModule";

    static {
        t2o.a(157286962);
    }

    public UltronWeex2TradeHybridContainerModule(String str, MUSDKInstance mUSDKInstance) {
        super(str, mUSDKInstance);
    }

    private UltronWeex2DialogFragment getCurrentWeexContainer() {
        Fragment fragment;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UltronWeex2DialogFragment) ipChange.ipc$dispatch("9be21b8c", new Object[]{this});
        }
        try {
            a instance = getInstance();
            if (instance == null) {
                hav.g(TAG, "getCurrentWeexContainer:", "instance is null");
                return null;
            }
            Context uIContext = instance.getUIContext();
            if (!(uIContext instanceof FragmentActivity)) {
                hav.g(TAG, "getCurrentWeexContainer:", "context is not a FragmentActivity");
                return null;
            }
            FragmentManager supportFragmentManager = ((FragmentActivity) uIContext).getSupportFragmentManager();
            if (uIContext instanceof UltronTradeHybridActivity) {
                fragment = supportFragmentManager.findFragmentById(R.id.fragmentContainer);
            } else {
                fragment = supportFragmentManager.findFragmentByTag(UltronWeex2DialogFragment.FRAGMENT_TAG);
            }
            if (fragment instanceof UltronWeex2DialogFragment) {
                return (UltronWeex2DialogFragment) fragment;
            }
            hav.g(TAG, "getCurrentWeexContainer:", "fragment is not a UltronWeex2DialogFragment");
            return null;
        } catch (Throwable unused) {
            hav.g(TAG, "getCurrentWeexContainer:", "get UltronWeex2DialogFragment exception.");
            return null;
        }
    }

    public static /* synthetic */ Object ipc$super(UltronWeex2TradeHybridContainerModule ultronWeex2TradeHybridContainerModule, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/vfw/weex2/module/UltronWeex2TradeHybridContainerModule");
    }

    @MUSMethod(uiThread = true)
    public void whiteMonitorDone(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7ea5316", new Object[]{this, jSONObject});
            return;
        }
        UltronWeex2DialogFragment currentWeexContainer = getCurrentWeexContainer();
        if (currentWeexContainer == null) {
            hav.g(TAG, "whiteMonitorDone:", "fragment is null");
            return;
        }
        rgv M0 = currentWeexContainer.M0();
        boolean booleanValue = jSONObject.getBooleanValue("success");
        M0.p(booleanValue);
        if (!booleanValue) {
            M0.o(jSONObject.getString("message"));
        }
    }

    @MUSMethod(uiThread = true)
    public void whiteMonitorMark(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61dc32ab", new Object[]{this, jSONObject});
            return;
        }
        UltronWeex2DialogFragment currentWeexContainer = getCurrentWeexContainer();
        if (currentWeexContainer == null) {
            hav.g(TAG, "whiteMonitorMark:", "fragment is null");
            return;
        }
        rgv M0 = currentWeexContainer.M0();
        for (int i = 1; i <= 5; i++) {
            String str = "c" + i;
            String str2 = "d" + i;
            String string = jSONObject.getString(str);
            String string2 = jSONObject.getString(str2);
            if (string != null) {
                M0.t(str, string);
            }
            if (string2 != null) {
                M0.s(str2, string2);
            }
        }
    }
}
