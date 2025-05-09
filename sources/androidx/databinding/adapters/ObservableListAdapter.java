package androidx.databinding.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import androidx.databinding.ObservableList;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ObservableListAdapter<T> extends BaseAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final Context mContext;
    private final int mDropDownResourceId;
    private final LayoutInflater mLayoutInflater;
    private List<T> mList;
    private ObservableList.OnListChangedCallback mListChangedCallback;
    private final int mResourceId;
    private final int mTextViewResourceId;

    public ObservableListAdapter(Context context, List<T> list, int i, int i2, int i3) {
        this.mContext = context;
        this.mResourceId = i;
        this.mDropDownResourceId = i2;
        this.mTextViewResourceId = i3;
        this.mLayoutInflater = i == 0 ? null : (LayoutInflater) context.getSystemService("layout_inflater");
        setList(list);
    }

    public static /* synthetic */ Object ipc$super(ObservableListAdapter observableListAdapter, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/databinding/adapters/ObservableListAdapter");
    }

    @Override // android.widget.Adapter
    public int getCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue();
        }
        return this.mList.size();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("a1077123", new Object[]{this, new Integer(i), view, viewGroup});
        }
        return getViewForResource(this.mDropDownResourceId, i, view, viewGroup);
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("8bc6621f", new Object[]{this, new Integer(i)});
        }
        return this.mList.get(i);
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
        return getViewForResource(this.mResourceId, i, view, viewGroup);
    }

    public View getViewForResource(int i, int i2, View view, ViewGroup viewGroup) {
        View view2;
        CharSequence charSequence;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("722337f0", new Object[]{this, new Integer(i), new Integer(i2), view, viewGroup});
        }
        if (view == null) {
            if (i == 0) {
                view = new TextView(this.mContext);
            } else {
                view = this.mLayoutInflater.inflate(i, viewGroup, false);
            }
        }
        int i3 = this.mTextViewResourceId;
        if (i3 == 0) {
            view2 = view;
        } else {
            view2 = view.findViewById(i3);
        }
        TextView textView = (TextView) view2;
        T t = this.mList.get(i2);
        if (t instanceof CharSequence) {
            charSequence = (CharSequence) t;
        } else {
            charSequence = String.valueOf(t);
        }
        textView.setText(charSequence);
        return view;
    }

    public void setList(List<T> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c34bb398", new Object[]{this, list});
            return;
        }
        List<T> list2 = this.mList;
        if (list2 != list) {
            if (list2 instanceof ObservableList) {
                ((ObservableList) list2).removeOnListChangedCallback(this.mListChangedCallback);
            }
            this.mList = list;
            if (list instanceof ObservableList) {
                if (this.mListChangedCallback == null) {
                    this.mListChangedCallback = new ObservableList.OnListChangedCallback() { // from class: androidx.databinding.adapters.ObservableListAdapter.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                            str.hashCode();
                            int hashCode = str.hashCode();
                            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/databinding/adapters/ObservableListAdapter$1");
                        }

                        @Override // androidx.databinding.ObservableList.OnListChangedCallback
                        public void onChanged(ObservableList observableList) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("995db58a", new Object[]{this, observableList});
                            } else {
                                ObservableListAdapter.this.notifyDataSetChanged();
                            }
                        }

                        @Override // androidx.databinding.ObservableList.OnListChangedCallback
                        public void onItemRangeChanged(ObservableList observableList, int i, int i2) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("20433956", new Object[]{this, observableList, new Integer(i), new Integer(i2)});
                            } else {
                                ObservableListAdapter.this.notifyDataSetChanged();
                            }
                        }

                        @Override // androidx.databinding.ObservableList.OnListChangedCallback
                        public void onItemRangeInserted(ObservableList observableList, int i, int i2) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("453f217c", new Object[]{this, observableList, new Integer(i), new Integer(i2)});
                            } else {
                                ObservableListAdapter.this.notifyDataSetChanged();
                            }
                        }

                        @Override // androidx.databinding.ObservableList.OnListChangedCallback
                        public void onItemRangeMoved(ObservableList observableList, int i, int i2, int i3) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("e8efc72c", new Object[]{this, observableList, new Integer(i), new Integer(i2), new Integer(i3)});
                            } else {
                                ObservableListAdapter.this.notifyDataSetChanged();
                            }
                        }

                        @Override // androidx.databinding.ObservableList.OnListChangedCallback
                        public void onItemRangeRemoved(ObservableList observableList, int i, int i2) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5392302a", new Object[]{this, observableList, new Integer(i), new Integer(i2)});
                            } else {
                                ObservableListAdapter.this.notifyDataSetChanged();
                            }
                        }
                    };
                }
                ((ObservableList) this.mList).addOnListChangedCallback(this.mListChangedCallback);
            }
            notifyDataSetChanged();
        }
    }
}
