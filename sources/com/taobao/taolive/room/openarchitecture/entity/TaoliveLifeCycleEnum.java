package com.taobao.taolive.room.openarchitecture.entity;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public enum TaoliveLifeCycleEnum {
    onCreate,
    onWillAppear,
    onDidAppear,
    onWillDisappear,
    onDidDisappear,
    onPause,
    onStart,
    onResume,
    onStop,
    onDestory;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(TaoliveLifeCycleEnum taoliveLifeCycleEnum, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/room/openarchitecture/entity/TaoliveLifeCycleEnum");
    }

    public static TaoliveLifeCycleEnum valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoliveLifeCycleEnum) ipChange.ipc$dispatch("89520855", new Object[]{str});
        }
        return (TaoliveLifeCycleEnum) Enum.valueOf(TaoliveLifeCycleEnum.class, str);
    }
}
