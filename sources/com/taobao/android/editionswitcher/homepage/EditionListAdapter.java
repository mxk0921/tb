package com.taobao.android.editionswitcher.homepage;

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
import tb.l78;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class EditionListAdapter extends BaseAdapter implements AdapterView.OnItemClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int LIST_TYPE_ACTIVITY = 2;
    public static final int LIST_TYPE_DIALOG = 1;
    public static final int UNCHECKED_POSITION = -1;
    private Map<Integer, View> mAreaItemViews;
    private int mCurrentCheckPosition;
    private List<l78> mData;
    private int mListType;

    static {
        t2o.a(456130670);
    }

    public EditionListAdapter(List<l78> list) {
        this(list, 1);
    }

    private void bindView(View view, l78 l78Var, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27ac15be", new Object[]{this, view, l78Var, new Integer(i)});
            return;
        }
        ((TextView) view.findViewById(R.id.item_area_name)).setText(l78Var.b);
        if (this.mListType == 2) {
            if (TextUtils.equals(l78Var.f23148a, "CUN")) {
                view.findViewById(R.id.item_area_desc).setVisibility(0);
            } else {
                view.findViewById(R.id.item_area_desc).setVisibility(8);
            }
        }
        if (this.mCurrentCheckPosition == i) {
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
            this.mData.get(i).d = true;
        }
    }

    private void initCheckedStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14082f50", new Object[]{this});
            return;
        }
        for (int i = 0; i < this.mData.size(); i++) {
            if (this.mData.get(i).d) {
                this.mCurrentCheckPosition = i;
                return;
            }
        }
    }

    public static /* synthetic */ Object ipc$super(EditionListAdapter editionListAdapter, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/editionswitcher/homepage/EditionListAdapter");
    }

    private boolean isValidPosition(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9cb4405", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (i < 0 || i >= this.mData.size()) {
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
            this.mData.get(i).d = false;
        }
    }

    public l78 getCheckedAreaItem() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l78) ipChange.ipc$dispatch("494a6476", new Object[]{this});
        }
        int i = this.mCurrentCheckPosition;
        if (i < 0 || i >= this.mData.size()) {
            return null;
        }
        return this.mData.get(this.mCurrentCheckPosition);
    }

    public View getConvertView(ViewGroup viewGroup) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("a2ce7cca", new Object[]{this, viewGroup});
        }
        if (this.mListType == 1) {
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
        return this.mData.size();
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
        if (this.mAreaItemViews == null) {
            this.mAreaItemViews = new HashMap();
        }
        View view2 = this.mAreaItemViews.get(Integer.valueOf(i));
        if (view2 != null) {
            return view2;
        }
        View convertView = getConvertView(viewGroup);
        bindView(convertView, this.mData.get(i), i);
        this.mAreaItemViews.put(Integer.valueOf(i), convertView);
        return convertView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dafa70", new Object[]{this, adapterView, view, new Integer(i), new Long(j)});
        } else if (this.mCurrentCheckPosition != i && !TextUtils.isEmpty(this.mData.get(i).f23148a)) {
            uncheckCurrentRowStatus(this.mAreaItemViews.get(Integer.valueOf(this.mCurrentCheckPosition)), this.mCurrentCheckPosition);
            checkCurrentRowStatus(this.mAreaItemViews.get(Integer.valueOf(i)), i);
            this.mCurrentCheckPosition = i;
        }
    }

    public EditionListAdapter(List<l78> list, int i) {
        this.mData = new ArrayList(0);
        this.mCurrentCheckPosition = -1;
        if (list != null && !list.isEmpty()) {
            this.mData = list;
        }
        this.mListType = i;
        initCheckedStatus();
    }

    @Override // android.widget.Adapter
    public l78 getItem(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l78) ipChange.ipc$dispatch("d4a5ed11", new Object[]{this, new Integer(i)});
        }
        if (isValidPosition(i)) {
            return this.mData.get(i);
        }
        return null;
    }
}
