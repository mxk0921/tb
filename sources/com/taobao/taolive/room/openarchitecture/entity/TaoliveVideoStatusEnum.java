package com.taobao.taolive.room.openarchitecture.entity;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public enum TaoliveVideoStatusEnum {
    onVideoStart,
    onVideoPause,
    onVideoFinish,
    onVideoResume,
    onVideoError,
    onVideoMuted,
    onVideoFrameRender;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(TaoliveVideoStatusEnum taoliveVideoStatusEnum, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/room/openarchitecture/entity/TaoliveVideoStatusEnum");
    }

    public static TaoliveVideoStatusEnum valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoliveVideoStatusEnum) ipChange.ipc$dispatch("a2afebf2", new Object[]{str});
        }
        return (TaoliveVideoStatusEnum) Enum.valueOf(TaoliveVideoStatusEnum.class, str);
    }
}
