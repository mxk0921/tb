package com.taobao.android.searchbaseframe.list;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.util.ListStyle;
import tb.t2o;
import tb.ude;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class BlankCellViewHolder extends WidgetViewHolder<Object, Void> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(993001829);
    }

    public BlankCellViewHolder(Activity activity, ude udeVar, ListStyle listStyle, int i) {
        super(G0(activity), activity, udeVar, listStyle, i, null);
    }

    public static View G0(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("79a2c742", new Object[]{context});
        }
        View view = new View(context);
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return view;
    }

    public static /* synthetic */ Object ipc$super(BlankCellViewHolder blankCellViewHolder, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/searchbaseframe/list/BlankCellViewHolder");
    }

    @Override // com.taobao.android.searchbaseframe.list.WidgetViewHolder
    public String k0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("55d7c1cd", new Object[]{this});
        }
        return "BlankCellViewHolder";
    }

    @Override // com.taobao.android.searchbaseframe.list.WidgetViewHolder
    public void u0(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80b45dfc", new Object[]{this, new Integer(i), obj});
        }
    }
}
