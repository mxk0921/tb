package com.taobao.taolive.sdk.monitor;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public enum SceneStage {
    SCENE_STAGE_T0,
    SCENE_STAGE_T1,
    SCENE_STAGE_T2,
    SCENE_STAGE_T3,
    SCENE_STAGE_T4,
    SCENE_STAGE_T5;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(SceneStage sceneStage, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/sdk/monitor/SceneStage");
    }

    public static SceneStage valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SceneStage) ipChange.ipc$dispatch("f55996da", new Object[]{str});
        }
        return (SceneStage) Enum.valueOf(SceneStage.class, str);
    }
}
