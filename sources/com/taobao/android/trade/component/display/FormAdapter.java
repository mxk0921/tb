package com.taobao.android.trade.component.display;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.trade.component.data.Component;
import java.util.ArrayList;
import java.util.List;
import tb.gc4;
import tb.jqu;
import tb.mf2;
import tb.sb4;
import tb.t2o;
import tb.yg3;
import tb.yv9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class FormAdapter extends BaseAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "FormAdapter";
    public Context context;
    public List<Component> dataSource;
    public sb4 engine;
    public yv9 formPort;
    public jqu typeIndex;

    static {
        t2o.a(758120469);
    }

    public FormAdapter(Context context, sb4 sb4Var, yv9 yv9Var) {
        this.context = context;
        this.engine = sb4Var;
        gc4 c = sb4Var.c();
        this.typeIndex = new jqu(c.f(), c.a());
    }

    public static /* synthetic */ Object ipc$super(FormAdapter formAdapter, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/trade/component/display/FormAdapter");
    }

    @Override // android.widget.Adapter
    public int getCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue();
        }
        return this.dataSource.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("8bc6621f", new Object[]{this, new Integer(i)});
        }
        return this.dataSource.get(i);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("19b1c34c", new Object[]{this, new Integer(i)})).longValue();
        }
        return i;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("65c98627", new Object[]{this, new Integer(i)})).intValue();
        }
        return this.typeIndex.b(this.dataSource.get(i));
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        yg3 yg3Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("277ed392", new Object[]{this, new Integer(i), view, viewGroup});
        }
        Component component = this.dataSource.get(i);
        if (view != null) {
            yg3Var = (yg3) view.getTag();
        } else {
            try {
                throw null;
            } catch (Throwable unused) {
                yg3Var = new mf2(this.context);
                view = yg3Var.d(component);
                view.setTag(yg3Var);
            }
        }
        yg3Var.b(component);
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("aaed7894", new Object[]{this})).intValue();
        }
        return this.typeIndex.a() + 8;
    }

    public void setDataSource(List<Component> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88534c5f", new Object[]{this, list});
            return;
        }
        this.dataSource = list;
        if (list == null) {
            this.dataSource = new ArrayList();
        }
    }
}
