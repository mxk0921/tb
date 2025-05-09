package com.alibaba.android.umbrella.weex;

import com.alibaba.android.umbrella.link.UMLinkLogInterface;
import com.alibaba.android.umbrella.link.export.UMDimKey;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.annotation.JSMethod;
import com.taobao.weex.common.WXModule;
import java.util.Map;
import tb.ayu;
import tb.cyu;
import tb.hdv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class UmbrellaWeexModule extends WXModule {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final UMLinkLogInterface umbrella = hdv.a();

    public static /* synthetic */ Object ipc$super(UmbrellaWeexModule umbrellaWeexModule, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/umbrella/weex/UmbrellaWeexModule");
    }

    @JSMethod(uiThread = false)
    public void commitFailure(String str, String str2, String str3, String str4, String str5, Map<String, String> map, String str6, String str7) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d68fbbcd", new Object[]{this, str, str2, str3, str4, str5, map, str6, str7});
        } else {
            this.umbrella.commitFailure(str, str2, str3, str4, str5, map, str6, str7);
        }
    }

    @JSMethod(uiThread = false)
    public void commitSuccess(String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec5cd960", new Object[]{this, str, str2, str3, str4, str5, map});
        } else {
            this.umbrella.commitSuccess(str, str2, str3, str4, str5, map);
        }
    }

    @JSMethod(uiThread = false)
    public void logInfo(String str, String str2, String str3, ayu ayuVar, Map<UMDimKey, Object> map, Map<String, Object> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30440967", new Object[]{this, str, str2, str3, ayuVar, map, map2});
        } else {
            this.umbrella.logInfo(str, str2, str3, ayuVar, map, cyu.b(map2));
        }
    }
}
