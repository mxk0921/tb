package com.taobao.android.dinamicx.widget.recycler.event;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import java.util.HashMap;
import tb.mw5;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class DXRecyclerLayoutOnPullDistanceEvent extends DXEvent {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXRECYCLERLAYOUT_ONPULLDISTANCE_ANDROID = 3971096853043757787L;
    private int distance;

    static {
        t2o.a(444597543);
    }

    public DXRecyclerLayoutOnPullDistanceEvent(int i) {
        super(DXRECYCLERLAYOUT_ONPULLDISTANCE_ANDROID);
        this.distance = i;
        HashMap hashMap = new HashMap();
        hashMap.put("distance", mw5.K(i));
        setArgs(hashMap);
    }

    public static /* synthetic */ Object ipc$super(DXRecyclerLayoutOnPullDistanceEvent dXRecyclerLayoutOnPullDistanceEvent, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/widget/recycler/event/DXRecyclerLayoutOnPullDistanceEvent");
    }

    public int getDistance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("25f8a065", new Object[]{this})).intValue();
        }
        return this.distance;
    }
}
