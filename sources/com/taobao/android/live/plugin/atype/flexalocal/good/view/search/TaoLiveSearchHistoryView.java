package com.taobao.android.live.plugin.atype.flexalocal.good.view.search;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.List;
import tb.nw0;
import tb.p3p;
import tb.t2o;
import tb.xea;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class TaoLiveSearchHistoryView extends LinearLayout implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Context mContext;
    private b mDataClearListener;
    private TUrlImageView mDeleteAllHistoryBtn;
    private TBLiveAutoTagLayout mHistoryWords;
    private p3p mSearchHistoryRecord;
    private c mSearchHistoryTagClickListener;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ SearchHistory f8559a;

        public a(SearchHistory searchHistory) {
            this.f8559a = searchHistory;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else if (TaoLiveSearchHistoryView.access$000(TaoLiveSearchHistoryView.this) != null && (view instanceof TextView)) {
                TaoLiveSearchHistoryView.access$000(TaoLiveSearchHistoryView.this).onSearchHistoryTagClicked(this.f8559a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface b {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface c {
        void onSearchHistoryTagClicked(SearchHistory searchHistory);
    }

    static {
        t2o.a(295699401);
    }

    public TaoLiveSearchHistoryView(Context context) {
        super(context);
        init(context);
    }

    public static /* synthetic */ c access$000(TaoLiveSearchHistoryView taoLiveSearchHistoryView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("779b5704", new Object[]{taoLiveSearchHistoryView});
        }
        return taoLiveSearchHistoryView.mSearchHistoryTagClickListener;
    }

    private TextView getNewTextView(xea xeaVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("4312bb25", new Object[]{this, xeaVar, str});
        }
        TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(R.layout.taolive_goods_search_tag_layout_flexalocal, (ViewGroup) null);
        textView.setMaxWidth(nw0.h() - nw0.d(this.mContext, 36.0f));
        textView.setText(str);
        return textView;
    }

    private void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
            return;
        }
        this.mContext = context;
        LayoutInflater.from(context).inflate(R.layout.taolive_goods_search_history_layout_flexalocal, this);
        this.mHistoryWords = (TBLiveAutoTagLayout) findViewById(R.id.taolive_good_history_words);
        TUrlImageView tUrlImageView = (TUrlImageView) findViewById(R.id.taolive_good_history_clear_btn);
        this.mDeleteAllHistoryBtn = tUrlImageView;
        tUrlImageView.setImageUrl("https://gw.alicdn.com/imgextra/i2/O1CN01TnGZlA1Mr5xyCMopg_!!6000000001487-2-tps-60-60.png");
        this.mDeleteAllHistoryBtn.setOnClickListener(this);
    }

    public static /* synthetic */ Object ipc$super(TaoLiveSearchHistoryView taoLiveSearchHistoryView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/good/view/search/TaoLiveSearchHistoryView");
    }

    private void reset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
        } else {
            this.mHistoryWords.removeAllViews();
        }
    }

    public void hide() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9631f0c9", new Object[]{this});
        } else {
            setVisibility(8);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else if (view.getId() == R.id.taolive_good_history_clear_btn) {
            reset();
            hide();
            b bVar = this.mDataClearListener;
            if (bVar != null) {
                ((com.taobao.android.live.plugin.atype.flexalocal.good.view.search.a) bVar).V();
            }
        }
    }

    public void setDataClearListener(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5e078cc", new Object[]{this, bVar});
        } else {
            this.mDataClearListener = bVar;
        }
    }

    public void setHistoryKeyWords(p3p p3pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61198db8", new Object[]{this, p3pVar});
        } else if (p3pVar != null) {
            this.mSearchHistoryRecord = p3pVar;
        }
    }

    public void setSearchTagClickListener(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f28d01bd", new Object[]{this, cVar});
        } else {
            this.mSearchHistoryTagClickListener = cVar;
        }
    }

    public boolean updateView(xea xeaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2b39ebbd", new Object[]{this, xeaVar})).booleanValue();
        }
        List<SearchHistory> b2 = this.mSearchHistoryRecord.b();
        if (b2 == null || b2.isEmpty()) {
            return true;
        }
        if (getVisibility() == 0) {
            return false;
        }
        reset();
        for (int i = 0; i < b2.size(); i++) {
            if (b2.get(i) != null) {
                SearchHistory searchHistory = b2.get(i);
                TextView newTextView = getNewTextView(xeaVar, searchHistory.getKey());
                this.mHistoryWords.addView(newTextView);
                newTextView.setOnClickListener(new a(searchHistory));
            }
        }
        return false;
    }

    public TaoLiveSearchHistoryView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context);
    }

    public TaoLiveSearchHistoryView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context);
    }
}
