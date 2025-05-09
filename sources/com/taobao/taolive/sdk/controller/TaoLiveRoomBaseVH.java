package com.taobao.taolive.sdk.controller;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.controller2.state.State;
import tb.cba;
import tb.naj;
import tb.t2o;
import tb.x5t;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public abstract class TaoLiveRoomBaseVH extends RecyclerView.ViewHolder {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public cba mGlobalContext;
    private State mState = State.INITIAL;
    private boolean appeared = false;

    static {
        t2o.a(779093438);
    }

    public TaoLiveRoomBaseVH(View view) {
        super(view);
    }

    public static /* synthetic */ Object ipc$super(TaoLiveRoomBaseVH taoLiveRoomBaseVH, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/sdk/controller/TaoLiveRoomBaseVH");
    }

    public State getVHState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (State) ipChange.ipc$dispatch("7b4b4d07", new Object[]{this});
        }
        return this.mState;
    }

    public boolean hasDidAppeared() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("81a923a4", new Object[]{this})).booleanValue();
        }
        return this.appeared;
    }

    public void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        }
    }

    public void initMultiRoomVideoControllerObserver(naj najVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b9dfc9", new Object[]{this, najVar});
        }
    }

    public void onStop(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c7ea54c", new Object[]{this, new Boolean(z)});
        }
    }

    public void setDidAppeared(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecbf9cfc", new Object[]{this, new Boolean(z)});
        } else {
            this.appeared = z;
        }
    }

    public void setGlobalContext(cba cbaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13c924ce", new Object[]{this, cbaVar});
        } else {
            this.mGlobalContext = cbaVar;
        }
    }

    public void setVHState(State state) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6c7bc43", new Object[]{this, state});
            return;
        }
        this.mState = state;
        x5t.h(BaseListAdapterV2.TAG, "VH position = " + getAdapterPosition() + " new mState = " + state);
    }
}
