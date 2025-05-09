package com.taobao.android.editionswitcher;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.m78;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class EditionListAdapter extends BaseAdapter implements AdapterView.OnItemClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int LIST_TYPE_ACTIVITY = 2;
    public static final int LIST_TYPE_DIALOG = 1;
    public static final int UNCHECKED_POSITION = -1;
    private Map<Integer, View> areaItemViews;
    private int currentCheckPosition;
    private List<m78> data;
    private int listType;

    static {
        t2o.a(729808899);
    }

    public EditionListAdapter(List<m78> list) {
        this(list, 1);
    }

    private void bindView(View view, m78 m78Var, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8610edd9", new Object[]{this, view, m78Var, new Integer(i)});
            return;
        }
        ((TextView) view.findViewById(R.id.item_area_name)).setText(m78Var.b);
        if (this.listType == 2) {
            if (TextUtils.equals(m78Var.f23817a, "CUN")) {
                view.findViewById(R.id.item_area_desc).setVisibility(0);
            } else {
                view.findViewById(R.id.item_area_desc).setVisibility(8);
            }
        }
        if (this.currentCheckPosition == i) {
            checkCurrentRowStatus(view, i);
        } else {
            uncheckCurrentRowStatus(view, i);
        }
    }

    private void checkCurrentRowStatus(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffaeac93", new Object[]{this, view, new Integer(i)});
        } else if (view != null) {
            view.findViewById(R.id.item_area_checked).setVisibility(0);
            this.data.get(i).c = true;
        }
    }

    private void initCheckedStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14082f50", new Object[]{this});
            return;
        }
        for (int i = 0; i < this.data.size(); i++) {
            if (this.data.get(i).c) {
                this.currentCheckPosition = i;
                return;
            }
        }
    }

    public static /* synthetic */ Object ipc$super(EditionListAdapter editionListAdapter, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/editionswitcher/EditionListAdapter");
    }

    private boolean isValidPosition(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9cb4405", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (i < 0 || i >= this.data.size()) {
            return false;
        }
        return true;
    }

    private void uncheckCurrentRowStatus(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61e1029a", new Object[]{this, view, new Integer(i)});
        } else if (view != null) {
            view.findViewById(R.id.item_area_checked).setVisibility(8);
            this.data.get(i).c = false;
        }
    }

    public m78 getCheckedAreaItem() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m78) ipChange.ipc$dispatch("9797b4bf", new Object[]{this});
        }
        int i = this.currentCheckPosition;
        if (i < 0 || i >= this.data.size()) {
            return null;
        }
        return this.data.get(this.currentCheckPosition);
    }

    public View getConvertView(ViewGroup viewGroup) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("a2ce7cca", new Object[]{this, viewGroup});
        }
        if (this.listType == 1) {
            i = R.layout.homepage_area_list_item;
        } else {
            i = R.layout.homepage_area_list_item_activity;
        }
        return LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue();
        }
        return this.data.size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("19b1c34c", new Object[]{this, new Integer(i)})).longValue();
        }
        return i;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("277ed392", new Object[]{this, new Integer(i), view, viewGroup});
        }
        if (!isValidPosition(i)) {
            return null;
        }
        if (this.areaItemViews == null) {
            this.areaItemViews = new HashMap();
        }
        View view2 = this.areaItemViews.get(Integer.valueOf(i));
        if (view2 != null) {
            return view2;
        }
        View convertView = getConvertView(viewGroup);
        bindView(convertView, this.data.get(i), i);
        this.areaItemViews.put(Integer.valueOf(i), convertView);
        return convertView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dafa70", new Object[]{this, adapterView, view, new Integer(i), new Long(j)});
        } else if (this.currentCheckPosition != i && !TextUtils.isEmpty(this.data.get(i).f23817a)) {
            uncheckCurrentRowStatus(this.areaItemViews.get(Integer.valueOf(this.currentCheckPosition)), this.currentCheckPosition);
            checkCurrentRowStatus(this.areaItemViews.get(Integer.valueOf(i)), i);
            this.currentCheckPosition = i;
        }
    }

    public EditionListAdapter(List<m78> list, int i) {
        this.listType = 1;
        this.data = new ArrayList(0);
        this.currentCheckPosition = -1;
        if (list != null && !list.isEmpty()) {
            this.data = list;
        }
        this.listType = i;
        initCheckedStatus();
    }

    @Override // android.widget.Adapter
    public m78 getItem(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m78) ipChange.ipc$dispatch("6df201c4", new Object[]{this, new Integer(i)});
        }
        if (isValidPosition(i)) {
            return this.data.get(i);
        }
        return null;
    }
}
