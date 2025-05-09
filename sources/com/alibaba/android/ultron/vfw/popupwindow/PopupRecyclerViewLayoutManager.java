package com.alibaba.android.ultron.vfw.popupwindow;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class PopupRecyclerViewLayoutManager extends LinearLayoutManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f2341a = true;

    static {
        t2o.a(157286697);
    }

    public PopupRecyclerViewLayoutManager(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(PopupRecyclerViewLayoutManager popupRecyclerViewLayoutManager, String str, Object... objArr) {
        if (str.hashCode() == 514551467) {
            return new Boolean(super.canScrollVertically());
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/vfw/popupwindow/PopupRecyclerViewLayoutManager");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollVertically() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1eab6eab", new Object[]{this})).booleanValue();
        }
        if (!this.f2341a || !super.canScrollVertically()) {
            return false;
        }
        return true;
    }

    public void y(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39f267fb", new Object[]{this, new Boolean(z)});
        } else {
            this.f2341a = z;
        }
    }

    public PopupRecyclerViewLayoutManager(Context context, int i, boolean z) {
        super(context, i, z);
    }
}
