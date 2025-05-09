package com.taobao.infoflow.core.subservice.base.item.itemrenderservice.dinamic.utils;

import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import tb.fve;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class RecyclerViewScrollEventPost extends RecyclerView.OnScrollListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_ON_SCROLL_START = 7952648158329995189L;
    public static final long DX_ON_SCROLL_STOP = -7968002352509477560L;
    public static final String KEY_INFO_FLOW_SCROLL_EVENT_POST = "scrollEventPost";

    /* renamed from: a  reason: collision with root package name */
    public int f10645a;

    static {
        t2o.a(486539502);
    }

    public static /* synthetic */ Object ipc$super(RecyclerViewScrollEventPost recyclerViewScrollEventPost, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/core/subservice/base/item/itemrenderservice/dinamic/utils/RecyclerViewScrollEventPost");
    }

    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3bcdd87b", new Object[]{this})).intValue();
        }
        return this.f10645a;
    }

    public boolean o(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fabfd655", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (i == 1 || i == 2) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51239a02", new Object[]{this, recyclerView, new Integer(i)});
            return;
        }
        try {
            int i2 = this.f10645a;
            if (i2 == -1 || o(i2) != o(i)) {
                this.f10645a = i;
                throw null;
            }
        } catch (Exception e) {
            e.printStackTrace();
            fve.c("RecyclerViewScrollEventPost", "onScrollStateChanged error", e);
        }
    }

    public void p(DXRootView dXRootView, boolean z) {
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("939bd7de", new Object[]{this, dXRootView, new Boolean(z)});
        } else if (dXRootView != null) {
            if (z) {
                j = 7952648158329995189L;
            } else {
                j = -7968002352509477560L;
            }
            DXEvent dXEvent = new DXEvent(j);
            DXWidgetNode expandWidgetNode = dXRootView.getExpandWidgetNode();
            if (expandWidgetNode != null) {
                expandWidgetNode.sendBroadcastEvent(dXEvent);
            }
        }
    }
}
