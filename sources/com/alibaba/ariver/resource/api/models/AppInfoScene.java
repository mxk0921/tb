package com.alibaba.ariver.resource.api.models;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public enum AppInfoScene {
    ONLINE,
    DEBUG,
    TRIAL,
    REVIEW,
    YUNTEST,
    CRAWLINGANTPLUGIN,
    INSPECT;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(AppInfoScene appInfoScene, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ariver/resource/api/models/AppInfoScene");
    }

    public static AppInfoScene valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AppInfoScene) ipChange.ipc$dispatch("dcd640bb", new Object[]{str});
        }
        return (AppInfoScene) Enum.valueOf(AppInfoScene.class, str);
    }
}
