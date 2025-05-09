package com.alibaba.android.ultron.vfw.weex2.module;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.alibaba.android.ultron.vfw.weex2.UltronWeex2DialogFragment;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.widget.UltronTradeHybridActivity;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.a;
import com.taobao.android.weex_framework.module.MUSModule;
import com.taobao.android.weex_framework.ui.MUSMethod;
import tb.dbv;
import tb.hav;
import tb.mbv;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class UltronWeex2BackKeyModule extends MUSModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MODULE_NAME = "UltronWeex2BackKeyModule";

    static {
        t2o.a(157286955);
    }

    public UltronWeex2BackKeyModule(String str, MUSDKInstance mUSDKInstance) {
        super(str, mUSDKInstance);
    }

    public static /* synthetic */ Object ipc$super(UltronWeex2BackKeyModule ultronWeex2BackKeyModule, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/vfw/weex2/module/UltronWeex2BackKeyModule");
    }

    @MUSMethod(uiThread = true)
    public void onBack() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2372e0ed", new Object[]{this});
            return;
        }
        a instance = getInstance();
        if (instance == null) {
            hav.g(MODULE_NAME, "onBack:", "instance is null");
            return;
        }
        Context uIContext = instance.getUIContext();
        if (!(uIContext instanceof FragmentActivity)) {
            hav.g(MODULE_NAME, "onBack:", "context is not a FragmentActivity");
            return;
        }
        FragmentActivity fragmentActivity = (FragmentActivity) uIContext;
        FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        boolean z = fragmentActivity instanceof UltronTradeHybridActivity;
        if (!z || !((UltronTradeHybridActivity) fragmentActivity).y3() || supportFragmentManager.getBackStackEntryCount() <= 0) {
            Fragment findFragmentByTag = supportFragmentManager.findFragmentByTag(UltronWeex2DialogFragment.FRAGMENT_TAG);
            if (!(findFragmentByTag instanceof UltronWeex2DialogFragment)) {
                hav.g(MODULE_NAME, "onBack:", "fragment is not a UltronWeex2DialogFragment");
                fragmentActivity.finish();
                return;
            }
            UltronWeex2DialogFragment ultronWeex2DialogFragment = (UltronWeex2DialogFragment) findFragmentByTag;
            if (!ultronWeex2DialogFragment.X2()) {
                hav.g(MODULE_NAME, "onBack:", "fragment is not display");
                fragmentActivity.finish();
            } else if (!z || ((UltronTradeHybridActivity) fragmentActivity).y3() || !mbv.a(ultronWeex2DialogFragment.U2(), dbv.PRE_RENDER_URL_ORDER_DETAIL)) {
                ultronWeex2DialogFragment.dismiss();
            } else {
                hav.g(MODULE_NAME, "onBack:", "orderDetail should finish UltronTradeHybridActivity");
                fragmentActivity.finish();
            }
        } else {
            supportFragmentManager.popBackStack();
        }
    }

    @MUSMethod(uiThread = true)
    public void onDowngrade(String str, String str2) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2dc82171", new Object[]{this, str, str2});
            return;
        }
        a instance = getInstance();
        if (instance == null) {
            hav.g(MODULE_NAME, "onDowngrade:", "instance is null");
            return;
        }
        Context uIContext = instance.getUIContext();
        if (!(uIContext instanceof FragmentActivity)) {
            hav.g(MODULE_NAME, "onDowngrade:", "context is not a FragmentActivity");
            return;
        }
        FragmentActivity fragmentActivity = (FragmentActivity) uIContext;
        Fragment findFragmentByTag = fragmentActivity.getSupportFragmentManager().findFragmentByTag(UltronWeex2DialogFragment.FRAGMENT_TAG);
        if (!(findFragmentByTag instanceof UltronWeex2DialogFragment)) {
            hav.g(MODULE_NAME, "onDowngrade:", "fragment is not a UltronWeex2DialogFragment");
            fragmentActivity.finish();
            return;
        }
        UltronWeex2DialogFragment ultronWeex2DialogFragment = (UltronWeex2DialogFragment) findFragmentByTag;
        if (!ultronWeex2DialogFragment.X2()) {
            hav.g(MODULE_NAME, "onDowngrade:", "fragment is not display");
            fragmentActivity.finish();
            return;
        }
        try {
            z = Boolean.parseBoolean(str2);
        } catch (Throwable unused) {
            hav.g(MODULE_NAME, "onDowngrade:", "dismissImmediately invalid!");
        }
        ultronWeex2DialogFragment.i3(str, z);
    }
}
