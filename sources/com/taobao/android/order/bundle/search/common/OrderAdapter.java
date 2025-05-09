package com.taobao.android.order.bundle.search.common;

import android.app.Activity;
import android.widget.BaseAdapter;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import tb.ka4;
import tb.lor;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public abstract class OrderAdapter extends BaseAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String TAG = OrderAdapter.class.getSimpleName();
    public Activity mAct;
    public List<ka4> mDatas;

    static {
        t2o.a(713031861);
    }

    public OrderAdapter(Activity activity) {
        this.mAct = activity;
    }

    public static /* synthetic */ Object ipc$super(OrderAdapter orderAdapter, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/bundle/search/common/OrderAdapter");
    }

    public boolean addData(ka4 ka4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dbbcd15", new Object[]{this, ka4Var})).booleanValue();
        }
        if (ka4Var == null) {
            lor.c(this.TAG, "addData data is null", new String[0]);
            return false;
        }
        if (this.mDatas == null) {
            this.mDatas = new ArrayList();
        }
        this.mDatas.add(ka4Var);
        notifyDataSetChanged();
        lor.c(this.TAG, "addData notifyDataSetChanged", new String[0]);
        return true;
    }

    public void clearData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e900c9e", new Object[]{this});
            return;
        }
        List<ka4> list = this.mDatas;
        if (list != null) {
            list.clear();
            notifyDataSetChanged();
        }
    }

    @Override // android.widget.Adapter
    public int getCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue();
        }
        List<ka4> list = this.mDatas;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public List<ka4> getDatas() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("23d823ad", new Object[]{this});
        }
        return this.mDatas;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("8bc6621f", new Object[]{this, new Integer(i)});
        }
        List<ka4> list = this.mDatas;
        if (list != null && i < list.size() && i >= 0) {
            return this.mDatas.get(i);
        }
        return null;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("19b1c34c", new Object[]{this, new Integer(i)})).longValue();
        }
        return i;
    }

    public boolean removeData(List<? extends ka4> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c69d6aca", new Object[]{this, list})).booleanValue();
        }
        List<ka4> list2 = this.mDatas;
        if (list2 == null || list == null) {
            lor.c(this.TAG, "removeData mDatas is null", new String[0]);
            return false;
        }
        list2.removeAll(list);
        notifyDataSetChanged();
        lor.c(this.TAG, "removeData", new String[0]);
        return true;
    }

    public boolean setData(List<ka4> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("28ddf4a8", new Object[]{this, list})).booleanValue();
        }
        if (list == null) {
            lor.c(this.TAG, "setData data is null", new String[0]);
            return false;
        }
        List<ka4> list2 = this.mDatas;
        if (list2 != null) {
            list2.clear();
        }
        this.mDatas = list;
        notifyDataSetChanged();
        lor.c(this.TAG, "setData notifyDataSetChanged", new String[0]);
        return true;
    }

    public boolean addData(List<? extends ka4> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dc4ca3e7", new Object[]{this, list})).booleanValue();
        }
        addData(list, -1);
        return true;
    }

    public boolean addData(List<? extends ka4> list, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ad484b84", new Object[]{this, list, new Integer(i)})).booleanValue();
        }
        if (list == null) {
            lor.c(this.TAG, "addData data is null", new String[0]);
            return false;
        }
        if (this.mDatas == null) {
            this.mDatas = new ArrayList();
        }
        if (i > this.mDatas.size()) {
            return false;
        }
        if (i < 0) {
            this.mDatas.addAll(list);
        } else {
            this.mDatas.addAll(i, list);
        }
        notifyDataSetChanged();
        lor.c(this.TAG, "addData notifyDataSetChanged", new String[0]);
        return true;
    }
}
