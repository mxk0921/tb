package com.taobao.taolive.sdk.model.message;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.f;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public enum UserMessageType {
    MSG_VIDEO_START,
    MSG_VIDEO_END,
    MSG_VIDEO_PAUSE;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int type;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class Counter {
        public static int count = f.DX_ERROR_CODE_SLIDER_LAYOUT_ITEM_COUNT_0;

        static {
            t2o.a(806356350);
        }

        private Counter() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    UserMessageType() {
        /*
            r2 = this;
            int r0 = com.taobao.taolive.sdk.model.message.UserMessageType.Counter.count
            int r1 = r0 + 1
            com.taobao.taolive.sdk.model.message.UserMessageType.Counter.count = r1
            r2.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.taolive.sdk.model.message.UserMessageType.<init>(java.lang.String, int):void");
    }

    public static /* synthetic */ Object ipc$super(UserMessageType userMessageType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/sdk/model/message/UserMessageType");
    }

    public static UserMessageType valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UserMessageType) ipChange.ipc$dispatch("b3d1f5ed", new Object[]{str});
        }
        return (UserMessageType) Enum.valueOf(UserMessageType.class, str);
    }

    public int getType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5378242a", new Object[]{this})).intValue();
        }
        return this.type;
    }

    UserMessageType(int i) {
        this.type = i;
    }
}
