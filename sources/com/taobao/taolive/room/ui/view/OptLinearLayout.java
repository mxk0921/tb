package com.taobao.taolive.room.ui.view;

import android.content.Context;
import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Adapter;
import android.widget.LinearLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.schedule.ViewProxy;
import java.util.ArrayList;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class OptLinearLayout extends LinearLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private DecorAdapter mAdapter;
    private int mItemCount;
    private c onItemClickListener;
    private DataSetObserver mDataSetObserver = new a();
    private View.OnClickListener mOnClickListener = new b();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static abstract class DecorAdapter implements Adapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final DataSetObservable mDataSetObservable = new DataSetObservable();

        static {
            t2o.a(806355837);
        }

        @Override // android.widget.Adapter
        public final long getItemId(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("19b1c34c", new Object[]{this, new Integer(i)})).longValue();
            }
            return i;
        }

        @Override // android.widget.Adapter
        public final int getItemViewType(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("65c98627", new Object[]{this, new Integer(i)})).intValue();
            }
            return 0;
        }

        @Override // android.widget.Adapter
        public final int getViewTypeCount() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("aaed7894", new Object[]{this})).intValue();
            }
            return 0;
        }

        @Override // android.widget.Adapter
        public final boolean hasStableIds() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("35312b0e", new Object[]{this})).booleanValue();
            }
            return false;
        }

        @Override // android.widget.Adapter
        public boolean isEmpty() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f187dd4e", new Object[]{this})).booleanValue();
            }
            return false;
        }

        public void notifyDataSetChanged() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("eee9a4ec", new Object[]{this});
            } else {
                this.mDataSetObservable.notifyChanged();
            }
        }

        @Override // android.widget.Adapter
        public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("63701d27", new Object[]{this, dataSetObserver});
            } else {
                this.mDataSetObservable.registerObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("66db852e", new Object[]{this, dataSetObserver});
            } else {
                this.mDataSetObservable.unregisterObserver(dataSetObserver);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a extends DataSetObserver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -1172900388) {
                super.onChanged();
                return null;
            } else if (hashCode == 1641176753) {
                super.onInvalidated();
                return null;
            } else {
                int hashCode2 = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/taolive/room/ui/view/OptLinearLayout$1");
            }
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ba16f5dc", new Object[]{this});
                return;
            }
            super.onChanged();
            OptLinearLayout optLinearLayout = OptLinearLayout.this;
            OptLinearLayout.access$002(optLinearLayout, OptLinearLayout.access$100(optLinearLayout).getCount());
            if (OptLinearLayout.access$000(OptLinearLayout.this) == 0 || OptLinearLayout.access$100(OptLinearLayout.this).isEmpty()) {
                OptLinearLayout.this.setVisibility(8);
                return;
            }
            OptLinearLayout.this.setVisibility(0);
            int childCount = OptLinearLayout.this.getChildCount();
            for (int access$000 = OptLinearLayout.access$000(OptLinearLayout.this); access$000 < childCount; access$000++) {
                OptLinearLayout.this.getChildAt(access$000).setVisibility(8);
            }
            for (int i = 0; i < OptLinearLayout.access$000(OptLinearLayout.this); i++) {
                View childAt = OptLinearLayout.this.getChildAt(i);
                if (childAt == null) {
                    childAt = OptLinearLayout.access$100(OptLinearLayout.this).getView(i, null, OptLinearLayout.this);
                    OptLinearLayout.this.addView(childAt);
                } else {
                    childAt.setVisibility(0);
                    OptLinearLayout.access$100(OptLinearLayout.this).getView(i, childAt, OptLinearLayout.this);
                }
                childAt.setTag(Integer.valueOf(i));
                ViewProxy.setOnClickListener(childAt, OptLinearLayout.access$200(OptLinearLayout.this));
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("61d25eb1", new Object[]{this});
            } else {
                super.onInvalidated();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else if (OptLinearLayout.access$300(OptLinearLayout.this) != null) {
                OptLinearLayout.access$300(OptLinearLayout.this).onItemClick(view, ((Integer) view.getTag()).intValue());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface c {
        void onItemClick(View view, int i);
    }

    static {
        t2o.a(806355834);
    }

    public OptLinearLayout(Context context) {
        super(context);
    }

    public static /* synthetic */ int access$000(OptLinearLayout optLinearLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("52cb75ca", new Object[]{optLinearLayout})).intValue();
        }
        return optLinearLayout.mItemCount;
    }

    public static /* synthetic */ int access$002(OptLinearLayout optLinearLayout, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("594c6281", new Object[]{optLinearLayout, new Integer(i)})).intValue();
        }
        optLinearLayout.mItemCount = i;
        return i;
    }

    public static /* synthetic */ DecorAdapter access$100(OptLinearLayout optLinearLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DecorAdapter) ipChange.ipc$dispatch("54071394", new Object[]{optLinearLayout});
        }
        return optLinearLayout.mAdapter;
    }

    public static /* synthetic */ View.OnClickListener access$200(OptLinearLayout optLinearLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View.OnClickListener) ipChange.ipc$dispatch("edba9be", new Object[]{optLinearLayout});
        }
        return optLinearLayout.mOnClickListener;
    }

    public static /* synthetic */ c access$300(OptLinearLayout optLinearLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("25f4e0ac", new Object[]{optLinearLayout});
        }
        return optLinearLayout.onItemClickListener;
    }

    public static /* synthetic */ Object ipc$super(OptLinearLayout optLinearLayout, String str, Object... objArr) {
        if (str.hashCode() == 949399698) {
            super.onDetachedFromWindow();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/room/ui/view/OptLinearLayout");
    }

    public Adapter getAdapter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Adapter) ipChange.ipc$dispatch("f752eae1", new Object[]{this});
        }
        return this.mAdapter;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        DecorAdapter decorAdapter = this.mAdapter;
        if (decorAdapter != null) {
            try {
                decorAdapter.unregisterDataSetObserver(this.mDataSetObserver);
            } catch (Exception unused) {
            }
        }
    }

    public void setAdapter(DecorAdapter decorAdapter) {
        DataSetObserver dataSetObserver;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa806348", new Object[]{this, decorAdapter});
        } else if (decorAdapter != null) {
            DecorAdapter decorAdapter2 = this.mAdapter;
            if (!(decorAdapter2 == null || (dataSetObserver = this.mDataSetObserver) == null)) {
                decorAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
            this.mAdapter = decorAdapter;
            decorAdapter.registerDataSetObserver(this.mDataSetObserver);
            this.mAdapter.notifyDataSetChanged();
        }
    }

    public void setOnItemClickListener(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81d99339", new Object[]{this, cVar});
        } else {
            this.onItemClickListener = cVar;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static abstract class ListAdapter<T> extends DecorAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public Context context;
        public List<T> mData;
        public LayoutInflater mInflater;
        public boolean mIsChangeFlag;

        static {
            t2o.a(806355838);
        }

        public ListAdapter(Context context) {
            this.mData = new ArrayList();
            this.context = context;
            this.mInflater = LayoutInflater.from(context);
        }

        public static /* synthetic */ Object ipc$super(ListAdapter listAdapter, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/room/ui/view/OptLinearLayout$ListAdapter");
        }

        @Override // android.widget.Adapter
        public int getCount() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue();
            }
            return this.mData.size();
        }

        public List<T> getData() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("dbd142c0", new Object[]{this});
            }
            return this.mData;
        }

        @Override // android.widget.Adapter
        public T getItem(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (T) ipChange.ipc$dispatch("8bc6621f", new Object[]{this, new Integer(i)});
            }
            return this.mData.get(i);
        }

        public LayoutInflater getLayoutInflater() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (LayoutInflater) ipChange.ipc$dispatch("bd31d6e4", new Object[]{this});
            }
            return this.mInflater;
        }

        public void remove(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ebab3958", new Object[]{this, new Integer(i)});
                return;
            }
            this.mData.remove(i);
            notifyDataSetChanged();
        }

        public void update(List<T> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("28dd1dc1", new Object[]{this, list});
            } else if (list != null) {
                this.mData = list;
                notifyDataSetChanged();
                this.mIsChangeFlag = true;
            }
        }

        public ListAdapter(List<T> list, Context context) {
            new ArrayList();
            this.mData = list;
            this.context = context;
            this.mInflater = LayoutInflater.from(context);
        }
    }

    public OptLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public OptLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
