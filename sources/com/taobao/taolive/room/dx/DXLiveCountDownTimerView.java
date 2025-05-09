package com.taobao.taolive.room.dx;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.view.DXNativeCountDownTimerView;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class DXLiveCountDownTimerView extends DXNativeCountDownTimerView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private long live_futureTime;

    static {
        t2o.a(779092950);
    }

    public DXLiveCountDownTimerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public static /* synthetic */ Object ipc$super(DXLiveCountDownTimerView dXLiveCountDownTimerView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -461309207) {
            super.onWindowVisibilityChanged(((Number) objArr[0]).intValue());
            return null;
        } else if (hashCode == 1626033557) {
            super.onAttachedToWindow();
            return null;
        } else if (hashCode == 2122464244) {
            return new Long(super.getLastTime());
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/taolive/room/dx/DXLiveCountDownTimerView");
        }
    }

    @Override // com.taobao.android.dinamicx.view.DXNativeCountDownTimerView
    public long getLastTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7e823bf4", new Object[]{this})).longValue();
        }
        long j = this.live_futureTime;
        if (j <= 0) {
            return super.getLastTime();
        }
        long currentTimeMillis = j - System.currentTimeMillis();
        Log.e("guanhua", "live_futureTime " + this.live_futureTime + " " + System.currentTimeMillis() + " " + currentTimeMillis);
        return currentTimeMillis;
    }

    @Override // com.taobao.android.dinamicx.view.DXNativeCountDownTimerView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        if (this.live_futureTime > 0) {
            updateCountView();
        }
    }

    @Override // com.taobao.android.dinamicx.view.DXNativeCountDownTimerView, android.view.View
    public void onWindowVisibilityChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e480fae9", new Object[]{this, new Integer(i)});
            return;
        }
        super.onWindowVisibilityChanged(i);
        if (i == 0 && this.live_futureTime > 0) {
            updateCountView();
        }
    }

    public void setLive_futureTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23a1e01c", new Object[]{this, new Long(j)});
        } else {
            this.live_futureTime = j;
        }
    }

    public DXLiveCountDownTimerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DXLiveCountDownTimerView(Context context) {
        this(context, null);
    }
}
