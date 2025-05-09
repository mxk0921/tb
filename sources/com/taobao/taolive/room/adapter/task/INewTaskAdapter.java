package com.taobao.taolive.room.adapter.task;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface INewTaskAdapter {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public enum LiveRoomUserActionOuter {
        LIVE_ROOM_USER_ACTION_REWARD;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(LiveRoomUserActionOuter liveRoomUserActionOuter, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/room/adapter/task/INewTaskAdapter$LiveRoomUserActionOuter");
        }

        public static LiveRoomUserActionOuter valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (LiveRoomUserActionOuter) ipChange.ipc$dispatch("8669b2b4", new Object[]{str});
            }
            return (LiveRoomUserActionOuter) Enum.valueOf(LiveRoomUserActionOuter.class, str);
        }
    }

    void a(LiveRoomUserActionOuter liveRoomUserActionOuter);
}
