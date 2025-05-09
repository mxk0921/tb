package com.taobao.android.dinamicx.widget.scroller;

import android.util.SparseArray;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.DXScrollerLayout;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ViewHolder extends DXScrollerLayout.ScrollerAdapter.ItemViewHolder {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final View b;

    static {
        t2o.a(444597683);
    }

    public ViewHolder(View view) {
        super(view);
        this.b = view;
        new SparseArray();
    }

    public static ViewHolder b0(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewHolder) ipChange.ipc$dispatch("c4e30c68", new Object[]{view});
        }
        return new ViewHolder(view);
    }

    public static /* synthetic */ Object ipc$super(ViewHolder viewHolder, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/widget/scroller/ViewHolder");
    }
}
