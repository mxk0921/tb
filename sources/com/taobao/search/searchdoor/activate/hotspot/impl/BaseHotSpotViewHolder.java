package com.taobao.search.searchdoor.activate.hotspot.impl;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.triver.triver_shop.newShop.event.broadcast.a;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import tb.ckf;
import tb.k6b;
import tb.t2o;
import tb.x6b;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class BaseHotSpotViewHolder extends RecyclerView.ViewHolder {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Rect f11619a = new Rect();

    static {
        t2o.a(815793005);
    }

    public BaseHotSpotViewHolder(View view) {
        super(view);
    }

    public static /* synthetic */ Object ipc$super(BaseHotSpotViewHolder baseHotSpotViewHolder, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/searchdoor/activate/hotspot/impl/BaseHotSpotViewHolder");
    }

    public final Rect b0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("ab374c6a", new Object[]{this});
        }
        return this.f11619a;
    }

    public final boolean c0(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("36947b82", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)})).booleanValue();
        }
        if (i2 > i || i > i3) {
            return false;
        }
        return true;
    }

    public void onHitDarkMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f95f2594", new Object[]{this});
        }
    }

    public boolean f0(Rect rect, int i, x6b x6bVar, k6b k6bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("288f152e", new Object[]{this, rect, new Integer(i), x6bVar, k6bVar})).booleanValue();
        }
        ckf.g(rect, "parentRect");
        ckf.g(x6bVar, "tabItem");
        ckf.g(k6bVar, DataReceiveMonitor.CB_LISTENER);
        return false;
    }

    public final boolean d0(Rect rect, Rect rect2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a77ab26d", new Object[]{this, rect, rect2})).booleanValue();
        }
        ckf.g(rect, "child");
        ckf.g(rect2, a.MSG_SOURCE_PARENT);
        return c0(rect.left, rect2.left, rect2.right) || c0(rect.right, rect2.left, rect2.right);
    }

    public final boolean e0(Rect rect, Rect rect2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("482e613f", new Object[]{this, rect, rect2})).booleanValue();
        }
        ckf.g(rect, "child");
        ckf.g(rect2, a.MSG_SOURCE_PARENT);
        return c0(rect.top, rect2.top, rect2.bottom) || c0(rect.bottom, rect2.top, rect2.bottom);
    }
}
