package com.taobao.tao.recommend3.container;

import android.content.Intent;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class RecyclerScrollStateChangeListener extends RecyclerView.OnScrollListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Intent f12646a = new Intent("recyclerViewState");
    public int b = -1;

    static {
        t2o.a(729809651);
    }

    public static /* synthetic */ Object ipc$super(RecyclerScrollStateChangeListener recyclerScrollStateChangeListener, String str, Object... objArr) {
        if (str.hashCode() == 1361287682) {
            super.onScrollStateChanged((RecyclerView) objArr[0], ((Number) objArr[1]).intValue());
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/recommend3/container/RecyclerScrollStateChangeListener");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51239a02", new Object[]{this, recyclerView, new Integer(i)});
            return;
        }
        super.onScrollStateChanged(recyclerView, i);
        if (this.b != i) {
            this.b = i;
            this.f12646a.putExtra("recyclerViewState", i);
            LocalBroadcastManager.getInstance(Globals.getApplication()).sendBroadcast(this.f12646a);
        }
    }
}
