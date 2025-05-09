package com.taobao.live.home.view;

import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.ArrayList;
import java.util.List;
import tb.orq;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class LiveTabView extends LinearLayout implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int DEFAULT_COUNT = 4;
    private Handler mHandler;
    private b mOnTabClickListener;
    private List<View> mTabViews = new ArrayList(4);
    private List<c> mTabs = new ArrayList(4);
    private int mClickCount = 0;
    private int mCurPos = -1;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                LiveTabView.access$002(LiveTabView.this, 0);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface b {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(806355514);
        }
    }

    static {
        t2o.a(806355511);
    }

    public LiveTabView(Context context) {
        super(context);
        init();
    }

    public static /* synthetic */ int access$002(LiveTabView liveTabView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("26a5d12", new Object[]{liveTabView, new Integer(i)})).intValue();
        }
        liveTabView.mClickCount = i;
        return i;
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        setOrientation(0);
        setGravity(17);
    }

    public static /* synthetic */ Object ipc$super(LiveTabView liveTabView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 949399698) {
            super.onDetachedFromWindow();
            return null;
        } else if (hashCode == 1626033557) {
            super.onAttachedToWindow();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/live/home/view/LiveTabView");
        }
    }

    public void addTab(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f72c971", new Object[]{this, cVar});
            return;
        }
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.live_tab_view, (ViewGroup) this, false);
        TUrlImageView tUrlImageView = (TUrlImageView) inflate.findViewById(R.id.live_tab_img);
        TextView textView = (TextView) inflate.findViewById(R.id.live_tab_title);
        cVar.getClass();
        if (!orq.a(null)) {
            tUrlImageView.setImageUrl(null);
        } else {
            tUrlImageView.setImageResource(0);
        }
        textView.setText((CharSequence) null);
        textView.setTextColor(0);
        inflate.setTag(Integer.valueOf(this.mTabViews.size()));
        ViewProxy.setOnClickListener(inflate, this);
        this.mTabViews.add(inflate);
        this.mTabs.add(cVar);
        addView(inflate);
    }

    public void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
            return;
        }
        this.mTabs.clear();
        this.mTabViews.clear();
        this.mCurPos = -1;
        removeAllViewsInLayout();
    }

    public c getTab(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("d295e719", new Object[]{this, new Integer(i)});
        }
        if (i < 0 || i >= this.mTabs.size()) {
            return null;
        }
        return this.mTabs.get(i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        reLayout();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        int intValue = ((Integer) view.getTag()).intValue();
        this.mCurPos = intValue;
        updateState(intValue);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        this.mTabViews.clear();
        this.mTabs.clear();
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    public void reLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b672e144", new Object[]{this});
        } else if (!this.mTabViews.isEmpty()) {
            int size = getResources().getDisplayMetrics().widthPixels / this.mTabViews.size();
            for (int i = 0; i < this.mTabViews.size(); i++) {
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(size, -1);
                View view = this.mTabViews.get(i);
                if (view != null) {
                    view.setLayoutParams(layoutParams);
                }
            }
            requestLayout();
            invalidate();
        }
    }

    public void reLayoutAdaptiveMarketing() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("649399a", new Object[]{this});
        } else if (!this.mTabViews.isEmpty()) {
            int size = getResources().getDisplayMetrics().widthPixels / (this.mTabViews.size() + 1);
            for (int i = 0; i < this.mTabViews.size(); i++) {
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(size, -1);
                View view = this.mTabViews.get(i);
                if (view != null) {
                    if (i == 1) {
                        layoutParams.rightMargin = size / 2;
                    } else if (i == 2) {
                        layoutParams.leftMargin = size / 2;
                    }
                    view.setLayoutParams(layoutParams);
                }
            }
            requestLayout();
            invalidate();
        }
    }

    public void setCurrentItem(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d416f32", new Object[]{this, new Integer(i)});
            return;
        }
        if (i >= this.mTabViews.size() || i < 0) {
            i = 0;
        }
        if (i != this.mTabViews.size()) {
            this.mTabViews.get(i).performClick();
            updateState(i);
        }
    }

    public void setOnTabClickListener(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7922ecb8", new Object[]{this, bVar});
        }
    }

    public void updateState(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3165b14", new Object[]{this, new Integer(i)});
            return;
        }
        for (int i2 = 0; i2 < this.mTabViews.size(); i2++) {
            View view = this.mTabViews.get(i2);
            if (view != null) {
                TUrlImageView tUrlImageView = (TUrlImageView) view.findViewById(R.id.live_tab_img);
                TextView textView = (TextView) view.findViewById(R.id.live_tab_title);
                c cVar = this.mTabs.get(i2);
                if (i == i2) {
                    cVar.getClass();
                    if (!orq.a(null)) {
                        tUrlImageView.setImageUrl(null);
                    } else {
                        tUrlImageView.setImageResource(0);
                    }
                    textView.setVisibility(0);
                    textView.setTextColor(0);
                } else {
                    cVar.getClass();
                    if (!orq.a(null)) {
                        tUrlImageView.setImageUrl(null);
                    } else {
                        tUrlImageView.setImageResource(0);
                    }
                    textView.setVisibility(0);
                    textView.setTextColor(0);
                }
            }
        }
    }

    public LiveTabView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public LiveTabView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }
}
