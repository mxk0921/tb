package com.taobao.live.timemove.base.data;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public enum ContentType {
    NewTimeMoving,
    SimpleLive;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(ContentType contentType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/live/timemove/base/data/ContentType");
    }

    public static ContentType valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ContentType) ipChange.ipc$dispatch("7fbed301", new Object[]{str});
        }
        return (ContentType) Enum.valueOf(ContentType.class, str);
    }
}
