package com.taobao.themis.web.runtime;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.g1a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class TMSWebScripts$getRequiredElementsCheckJS$1 extends Lambda implements g1a<String, CharSequence> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final TMSWebScripts$getRequiredElementsCheckJS$1 INSTANCE = new TMSWebScripts$getRequiredElementsCheckJS$1();

    public TMSWebScripts$getRequiredElementsCheckJS$1() {
        super(1);
    }

    public static /* synthetic */ Object ipc$super(TMSWebScripts$getRequiredElementsCheckJS$1 tMSWebScripts$getRequiredElementsCheckJS$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/web/runtime/TMSWebScripts$getRequiredElementsCheckJS$1");
    }

    public final CharSequence invoke(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("90353891", new Object[]{this, str});
        }
        ckf.g(str, AdvanceSetting.NETWORK_TYPE);
        return "\"" + str + '\"';
    }
}
