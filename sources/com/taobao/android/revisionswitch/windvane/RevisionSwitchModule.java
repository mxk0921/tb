package com.taobao.android.revisionswitch.windvane;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.revisionswitch.TBRevisionSwitchManager;
import com.taobao.weex.annotation.JSMethod;
import com.taobao.weex.common.WXModule;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class RevisionSwitchModule extends WXModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MODULE_NAME = "RevisionSwitchModule";

    public static /* synthetic */ Object ipc$super(RevisionSwitchModule revisionSwitchModule, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/revisionswitch/windvane/RevisionSwitchModule");
    }

    @JSMethod(uiThread = false)
    public String getBucket() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b4b88e19", new Object[]{this});
        }
        return TBRevisionSwitchManager.c().b();
    }

    @JSMethod(uiThread = false)
    public String getSimpleSwitchValue(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("571d53ba", new Object[]{this, str});
        }
        return TBRevisionSwitchManager.c().e(str);
    }

    @JSMethod(uiThread = false)
    public boolean getSwitchValue(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d957b4bc", new Object[]{this, str})).booleanValue();
        }
        return TBRevisionSwitchManager.c().d(str);
    }
}
