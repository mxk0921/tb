package com.taobao.taolive.room.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.livehome.plugin.atype.flexalocal.business.search.TaoliveSearchHotWords;
import com.taobao.taobao.R;
import com.taobao.taolive.room.ui.view.OptLinearLayout;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import tb.giv;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class HorizontalLabelView extends HorizontalScrollView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Adapter mAdapter;
    private List<Label> mLabels;
    private b mOnLabelSelectedListener;
    private OptLinearLayout mOptLinearLayout;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class Label implements Serializable {
        public boolean isSelected;
        public String text;

        static {
            t2o.a(806355823);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements OptLinearLayout.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.taolive.room.ui.view.OptLinearLayout.c
        public void onItemClick(View view, int i) {
            boolean z;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d3dff88e", new Object[]{this, view, new Integer(i)});
                return;
            }
            for (int i2 = 0; i2 < HorizontalLabelView.access$000(HorizontalLabelView.this).size(); i2++) {
                Label label = (Label) HorizontalLabelView.access$000(HorizontalLabelView.this).get(i2);
                if (i2 == i) {
                    z = true;
                } else {
                    z = false;
                }
                label.isSelected = z;
            }
            HorizontalLabelView.access$100(HorizontalLabelView.this).notifyDataSetChanged();
            if (HorizontalLabelView.access$200(HorizontalLabelView.this) != null) {
                HorizontalLabelView.access$200(HorizontalLabelView.this).a(i, ((Label) HorizontalLabelView.access$000(HorizontalLabelView.this).get(i)).text);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface b {
        void a(int i, String str);
    }

    static {
        t2o.a(806355820);
    }

    public HorizontalLabelView(Context context) {
        super(context);
        init();
    }

    public static /* synthetic */ List access$000(HorizontalLabelView horizontalLabelView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("2fe2b843", new Object[]{horizontalLabelView});
        }
        return horizontalLabelView.mLabels;
    }

    public static /* synthetic */ Adapter access$100(HorizontalLabelView horizontalLabelView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Adapter) ipChange.ipc$dispatch("33b7c043", new Object[]{horizontalLabelView});
        }
        return horizontalLabelView.mAdapter;
    }

    public static /* synthetic */ b access$200(HorizontalLabelView horizontalLabelView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("9ed9a62d", new Object[]{horizontalLabelView});
        }
        return horizontalLabelView.mOnLabelSelectedListener;
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        LayoutInflater.from(getContext()).inflate(R.layout.taolive_horizontal_label_view, this);
        OptLinearLayout optLinearLayout = (OptLinearLayout) findViewById(R.id.label_container);
        this.mOptLinearLayout = optLinearLayout;
        optLinearLayout.setOnItemClickListener(new a());
        Adapter adapter = new Adapter(getContext());
        this.mAdapter = adapter;
        this.mOptLinearLayout.setAdapter(adapter);
    }

    public static /* synthetic */ Object ipc$super(HorizontalLabelView horizontalLabelView, String str, Object... objArr) {
        if (str.hashCode() == 2075560917) {
            return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/room/ui/view/HorizontalLabelView");
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        return super.dispatchTouchEvent(motionEvent);
    }

    public void setData(List<Label> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28ddf4a4", new Object[]{this, list});
            return;
        }
        this.mLabels = list;
        this.mAdapter.update(list);
    }

    public void setOnLabelSelectedListener(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60e19472", new Object[]{this, bVar});
        } else {
            this.mOnLabelSelectedListener = bVar;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class Adapter extends OptLinearLayout.ListAdapter<Label> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(806355822);
        }

        public Adapter(Context context) {
            super(context);
        }

        public static /* synthetic */ Object ipc$super(Adapter adapter, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/room/ui/view/HorizontalLabelView$Adapter");
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("277ed392", new Object[]{this, new Integer(i), view, viewGroup});
            }
            Label item = getItem(i);
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put("poi", String.valueOf(i));
            hashMap.put(TaoliveSearchHotWords.TYPE_WORD, item.text);
            if (view == null) {
                view = getLayoutInflater().inflate(R.layout.taolive_label_item_view, viewGroup, false);
                giv.f().a("Show-chooseCom_EXP", hashMap);
            } else {
                if (this.mIsChangeFlag) {
                    giv.f().a("Show-chooseCom_EXP", hashMap);
                }
                if (i == getCount() - 1) {
                    this.mIsChangeFlag = false;
                }
            }
            TextView textView = (TextView) view.findViewById(R.id.label_item);
            textView.setText(item.text);
            textView.setSelected(item.isSelected);
            return view;
        }
    }

    public HorizontalLabelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public HorizontalLabelView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }
}
