package com.taobao.android.detail.ttdetail.skeleton.desc.natives;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;
import tb.yc7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class DetailDescViewAdapter extends BaseAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean isPlayerOpt = false;
    private yc7 mDescRecyleEngine;

    static {
        t2o.a(912262290);
    }

    public static /* synthetic */ Object ipc$super(DetailDescViewAdapter detailDescViewAdapter, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/skeleton/desc/natives/DetailDescViewAdapter");
    }

    @Override // android.widget.Adapter
    public int getCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue();
        }
        return this.mDescRecyleEngine.b();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("8bc6621f", new Object[]{this, new Integer(i)});
        }
        return this.mDescRecyleEngine.d(i);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("19b1c34c", new Object[]{this, new Integer(i)})).longValue();
        }
        return this.mDescRecyleEngine.q(i);
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("65c98627", new Object[]{this, new Integer(i)})).intValue();
        }
        return this.mDescRecyleEngine.f(i);
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("277ed392", new Object[]{this, new Integer(i), view, viewGroup});
        }
        return this.mDescRecyleEngine.g(i, view, viewGroup);
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("aaed7894", new Object[]{this})).intValue();
        }
        return this.mDescRecyleEngine.j();
    }

    public void setDescRecyleEngine(yc7 yc7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("521df8ab", new Object[]{this, yc7Var});
            return;
        }
        this.mDescRecyleEngine = yc7Var;
        yc7Var.o(this.isPlayerOpt);
    }

    public void setDetailPlayerOpt(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9a1448e", new Object[]{this, new Boolean(z)});
        } else {
            this.isPlayerOpt = z;
        }
    }
}
