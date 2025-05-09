package com.alilive.adapter.uikit;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;
import tb.vvd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class TLiveRoundedCornersProcessor implements vvd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public enum CornerType {
        ALL,
        TOP,
        BOTTOM,
        LEFT,
        RIGHT;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(CornerType cornerType, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alilive/adapter/uikit/TLiveRoundedCornersProcessor$CornerType");
        }

        public static CornerType valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (CornerType) ipChange.ipc$dispatch("143c9a38", new Object[]{str});
            }
            return (CornerType) Enum.valueOf(CornerType.class, str);
        }
    }

    static {
        t2o.a(806354985);
        t2o.a(806355909);
    }

    public CornerType a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CornerType) ipChange.ipc$dispatch("f6b966eb", new Object[]{this});
        }
        return null;
    }

    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("63ac3b1e", new Object[]{this})).intValue();
        }
        return 0;
    }

    public int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f9581002", new Object[]{this})).intValue();
        }
        return 0;
    }

    public int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c5dbde08", new Object[]{this})).intValue();
        }
        return 0;
    }

    public int e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("63791279", new Object[]{this})).intValue();
        }
        return 0;
    }
}
