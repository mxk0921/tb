package com.alibaba.android.ultron.vfw.viewholder;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.HashMap;
import java.util.Map;
import tb.f8v;
import tb.sz;
import tb.t2o;
import tb.xo7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class RecyclerViewHolder extends RecyclerView.ViewHolder {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final sz f2349a;
    public ViewGroup b;
    public final Map<String, Object> c;
    public boolean d;
    public IDMComponent e;

    static {
        t2o.a(157286756);
    }

    public RecyclerViewHolder(View view) {
        this(view, null);
    }

    public static /* synthetic */ Object ipc$super(RecyclerViewHolder recyclerViewHolder, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/vfw/viewholder/RecyclerViewHolder");
    }

    public IDMComponent b0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDMComponent) ipChange.ipc$dispatch("80a38852", new Object[]{this});
        }
        return this.e;
    }

    public Map<String, Object> c0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("2da72c7", new Object[]{this});
        }
        return this.c;
    }

    public boolean d0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d3559d9d", new Object[]{this})).booleanValue();
        }
        return this.d;
    }

    public sz e0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sz) ipChange.ipc$dispatch("b278cc2", new Object[]{this});
        }
        return this.f2349a;
    }

    public ViewGroup f0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("2ed30c29", new Object[]{this});
        }
        return this.b;
    }

    public Map<String, Object> g0(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("7668ba5d", new Object[]{this, iDMComponent});
        }
        this.e = iDMComponent;
        ((HashMap) this.c).clear();
        ((HashMap) this.c).put(xo7.TAG_DINAMICX_VIEW_COMPONENT, iDMComponent);
        ((HashMap) this.c).put(f8v.KEY_TRIGGER_VIEW_HOLDER, this);
        return this.c;
    }

    public View getRootView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("17b33166", new Object[]{this});
        }
        return this.itemView;
    }

    public void h0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5a387cf", new Object[]{this, new Boolean(z)});
        } else {
            this.d = z;
        }
    }

    public void i0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89171b58", new Object[]{this, new Integer(i)});
        }
    }

    public void j0(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db7300b7", new Object[]{this, viewGroup});
        } else {
            this.b = viewGroup;
        }
    }

    public RecyclerViewHolder(View view, sz szVar) {
        super(view);
        this.c = new HashMap();
        this.f2349a = szVar;
    }
}
