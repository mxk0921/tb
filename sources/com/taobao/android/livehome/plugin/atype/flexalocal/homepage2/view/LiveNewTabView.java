package com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.view;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.livehome.plugin.atype.flexalocal.TaoLiveNewHomePage;
import com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.controller.TabManager;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.schedule.ViewProxy;
import com.taobao.tao.util.ImageStrategyDecider;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.lrq;
import tb.nvs;
import tb.qw0;
import tb.s0m;
import tb.s8d;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class LiveNewTabView extends LinearLayout implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int DEFAULT_COUNT = 4;
    private Handler mHandler;
    private c mOnTabClickListener;
    private List<View> mTabViews = new ArrayList(4);
    private List<d> mTabs = new ArrayList(4);
    private int mClickCount = 0;
    private int mCurPos = -1;
    private Map<Integer, String> mDownLoadFailImageMap = new HashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
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
                LiveNewTabView.access$002(LiveNewTabView.this, 0);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements s8d<FailPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f8874a;

        public b(int i) {
            this.f8874a = i;
        }

        /* renamed from: a */
        public boolean onHappen(FailPhenixEvent failPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5fa0e8d0", new Object[]{this, failPhenixEvent})).booleanValue();
            }
            LiveNewTabView.access$100(LiveNewTabView.this).put(Integer.valueOf(this.f8874a), failPhenixEvent.getUrl());
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface c {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public boolean f8875a;
        public String b;
        public String c;
        public String d;
        public int e;
        public int f;
        public String g;
        public String h;
        public String i;
        public boolean j;
        public boolean k;

        static {
            t2o.a(310378866);
        }

        public boolean a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("e5951b57", new Object[]{this})).booleanValue();
            }
            return this.j;
        }

        public d b(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("4db338f5", new Object[]{this, new Boolean(z)});
            }
            this.k = z;
            return this;
        }

        public d c(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("bbcba9ca", new Object[]{this, new Integer(i)});
            }
            this.e = i;
            return this;
        }

        public d d(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("3ef6857b", new Object[]{this, str});
            }
            this.c = str;
            return this;
        }

        public void e(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f05fd7a9", new Object[]{this, new Boolean(z)});
            } else {
                this.j = z;
            }
        }

        public d f(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("679bf741", new Object[]{this, new Integer(i)});
            }
            this.f = i;
            return this;
        }

        public d g(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("e18304f2", new Object[]{this, str});
            }
            this.d = str;
            return this;
        }

        public d h(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("31fd479e", new Object[]{this, str});
            }
            this.b = str;
            return this;
        }

        public d i(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("6ba0daa8", new Object[]{this, str});
            }
            this.g = str;
            return this;
        }

        public void j(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a268a28b", new Object[]{this, str});
            } else {
                this.h = str;
            }
        }

        public void k(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b9a3ff01", new Object[]{this, str});
            } else {
                this.i = str;
            }
        }
    }

    static {
        t2o.a(310378862);
    }

    public LiveNewTabView(Context context) {
        super(context);
        init();
    }

    public static /* synthetic */ int access$002(LiveNewTabView liveNewTabView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("68edfee6", new Object[]{liveNewTabView, new Integer(i)})).intValue();
        }
        liveNewTabView.mClickCount = i;
        return i;
    }

    public static /* synthetic */ Map access$100(LiveNewTabView liveNewTabView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("7af69be6", new Object[]{liveNewTabView});
        }
        return liveNewTabView.mDownLoadFailImageMap;
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

    public static /* synthetic */ Object ipc$super(LiveNewTabView liveNewTabView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 949399698) {
            super.onDetachedFromWindow();
            return null;
        } else if (hashCode == 1626033557) {
            super.onAttachedToWindow();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/livehome/plugin/atype/flexalocal/homepage2/view/LiveNewTabView");
        }
    }

    private void setImageUrl(TUrlImageView tUrlImageView, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f597516", new Object[]{this, tUrlImageView, str, new Integer(i)});
        } else if (tUrlImageView != null && !lrq.a(str)) {
            tUrlImageView.setImageUrl(str);
            tUrlImageView.failListener(new b(i));
        }
    }

    public void addTab(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cc9221d", new Object[]{this, dVar});
            return;
        }
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.live_tab_view_flexalocal, (ViewGroup) this, false);
        TUrlImageView tUrlImageView = (TUrlImageView) inflate.findViewById(R.id.live_tab_img);
        TextView textView = (TextView) inflate.findViewById(R.id.live_tab_title);
        if (!lrq.a(dVar.c)) {
            tUrlImageView.setImageUrl(dVar.c);
        }
        textView.setText(dVar.g);
        textView.setTextColor(dVar.e);
        inflate.setTag(Integer.valueOf(this.mTabViews.size()));
        ViewProxy.setOnClickListener(inflate, this);
        this.mTabViews.add(inflate);
        this.mTabs.add(dVar);
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

    public void clearDownLoadFailImageMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18cc807b", new Object[]{this});
        } else {
            this.mDownLoadFailImageMap.clear();
        }
    }

    public Map<Integer, String> getDownLoadFailImageMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("5bc469b9", new Object[]{this});
        }
        return this.mDownLoadFailImageMap;
    }

    public d getTab(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("90631f45", new Object[]{this, new Integer(i)});
        }
        List<d> list = this.mTabs;
        if (list == null || list.size() == 0 || i < 0 || i >= this.mTabs.size()) {
            return null;
        }
        return this.mTabs.get(i);
    }

    public View getTabView(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("ff7d487a", new Object[]{this, new Integer(i)});
        }
        List<View> list = this.mTabViews;
        if (list == null || list.size() == 0 || i < 0 || i >= this.mTabViews.size()) {
            return null;
        }
        return this.mTabViews.get(i);
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
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        int intValue = ((Integer) view.getTag()).intValue();
        c cVar = this.mOnTabClickListener;
        if (cVar == null || ((TaoLiveNewHomePage) cVar).d0()) {
            z = false;
        } else {
            z = true;
        }
        if (this.mCurPos != intValue || !z) {
            this.mCurPos = intValue;
            c cVar2 = this.mOnTabClickListener;
            if (cVar2 != null) {
                ((TaoLiveNewHomePage) cVar2).Z(view, intValue);
            }
            updateState(intValue);
            return;
        }
        c cVar3 = this.mOnTabClickListener;
        if (cVar3 != null) {
            ((TaoLiveNewHomePage) cVar3).Y(view, intValue);
        }
        int i = this.mClickCount + 1;
        this.mClickCount = i;
        if (1 == i) {
            if (this.mHandler == null) {
                this.mHandler = new Handler();
            }
            this.mHandler.postDelayed(new a(), 250L);
        } else if (2 == i) {
            this.mClickCount = 0;
            c cVar4 = this.mOnTabClickListener;
            if (cVar4 != null) {
                ((TaoLiveNewHomePage) cVar4).X(view, intValue);
            }
        }
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

    public void refreshTabIcon(int i, d dVar) {
        View view;
        TUrlImageView tUrlImageView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcedf32f", new Object[]{this, new Integer(i), dVar});
        } else if (i < this.mTabViews.size() && (view = this.mTabViews.get(i)) != null && (tUrlImageView = (TUrlImageView) view.findViewById(R.id.live_tab_img)) != null && this.mTabs != null) {
            s0m B = s0m.B();
            int width = tUrlImageView.getWidth();
            int height = tUrlImageView.getHeight();
            if (!lrq.a(dVar.c)) {
                B.T(ImageStrategyDecider.decideUrl(dVar.c, Integer.valueOf(width), Integer.valueOf(height), null)).limitSize(null, width, height).fetch();
            }
            if (!lrq.a(dVar.d)) {
                B.T(ImageStrategyDecider.decideUrl(dVar.d, Integer.valueOf(width), Integer.valueOf(height), null)).limitSize(null, width, height).fetch();
            }
            if (!lrq.a(dVar.h)) {
                B.T(ImageStrategyDecider.decideUrl(dVar.h, Integer.valueOf(width), Integer.valueOf(height), null)).limitSize(null, width, height).fetch();
            }
            if (dVar.a() && !lrq.a(dVar.h)) {
                tUrlImageView.setImageUrl(dVar.h);
            } else if (this.mCurPos == i) {
                tUrlImageView.setImageUrl(dVar.d);
            } else {
                tUrlImageView.setImageUrl(dVar.c);
            }
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

    public void setOnTabClickListener(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23ae188c", new Object[]{this, cVar});
        } else {
            this.mOnTabClickListener = cVar;
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
                d dVar = this.mTabs.get(i2);
                TUrlImageView tUrlImageView = (TUrlImageView) view.findViewById(R.id.live_tab_img);
                TextView textView = (TextView) view.findViewById(R.id.live_tab_title);
                if (i == i2) {
                    if (dVar.k) {
                        if (!dVar.f8875a) {
                            dVar.f8875a = true;
                            LayoutInflater.from(getContext()).inflate(R.layout.live_tab_view_viewstub_flexalocal, (ViewGroup) view.findViewById(R.id.live_tab_rl), true);
                        }
                        dVar.k = false;
                        tUrlImageView.setVisibility(0);
                        textView.setVisibility(0);
                        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.live_tab_sjsd_img_layer);
                        if (frameLayout != null) {
                            frameLayout.setVisibility(8);
                        }
                    }
                    if (!nvs.C() || lrq.a(dVar.h) || lrq.a(dVar.i)) {
                        if (!lrq.a(dVar.d)) {
                            setImageUrl(tUrlImageView, dVar.d, i2);
                        }
                        if (!lrq.a(dVar.g)) {
                            textView.setText(dVar.g);
                        }
                    } else if (dVar.a()) {
                        if (!lrq.a(dVar.h)) {
                            setImageUrl(tUrlImageView, dVar.h, i2);
                        }
                        if (!lrq.a(dVar.i)) {
                            textView.setText(dVar.i);
                        }
                    } else {
                        if (!lrq.a(dVar.d)) {
                            setImageUrl(tUrlImageView, dVar.d, i2);
                        }
                        if (!lrq.a(dVar.g)) {
                            textView.setText(dVar.g);
                        }
                    }
                    textView.setVisibility(0);
                    textView.setTextColor(dVar.f);
                    textView.setTypeface(Typeface.defaultFromStyle(1));
                } else if (!dVar.k) {
                    if (!lrq.a(dVar.c)) {
                        setImageUrl(tUrlImageView, dVar.c, i2);
                    }
                    if (!lrq.a(dVar.g)) {
                        textView.setText(dVar.g);
                    }
                    textView.setVisibility(0);
                    textView.setTextColor(dVar.e);
                    textView.setTypeface(Typeface.defaultFromStyle(0));
                }
            }
        }
    }

    public void updateTab(int i, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c8cf368", new Object[]{this, new Integer(i), dVar});
        } else if (i < this.mTabViews.size()) {
            View view = this.mTabViews.get(i);
            if (!dVar.f8875a) {
                dVar.f8875a = true;
                LayoutInflater.from(getContext()).inflate(R.layout.live_tab_view_viewstub_flexalocal, (ViewGroup) view.findViewById(R.id.live_tab_rl), true);
            }
            if (view != null) {
                TUrlImageView tUrlImageView = (TUrlImageView) view.findViewById(R.id.live_tab_img);
                TextView textView = (TextView) view.findViewById(R.id.live_tab_title);
                TUrlImageView tUrlImageView2 = (TUrlImageView) view.findViewById(R.id.live_tab_sjsd_img);
                FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.live_tab_sjsd_img_layer);
                if (dVar.k) {
                    tUrlImageView.setVisibility(4);
                    textView.setVisibility(4);
                    frameLayout.setVisibility(0);
                    setImageUrl(tUrlImageView2, dVar.b, i);
                } else {
                    tUrlImageView.setVisibility(0);
                    textView.setVisibility(0);
                    frameLayout.setVisibility(8);
                }
                if (tUrlImageView != null && textView != null && this.mTabs != null) {
                    setImageUrl(tUrlImageView, dVar.c, i);
                    textView.setText(dVar.g);
                    textView.setTextColor(dVar.e);
                    invalidate();
                    this.mTabs.set(i, dVar);
                }
            }
        }
    }

    public void setTabCornerMark(int i, TabManager.TabBottom tabBottom) {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9771736b", new Object[]{this, new Integer(i), tabBottom});
            return;
        }
        List<View> list = this.mTabViews;
        if (list != null && tabBottom != null && tabBottom.subscriptInfo != null && i < list.size() && (view = this.mTabViews.get(i)) != null) {
            d dVar = this.mTabs.get(i);
            if (!dVar.f8875a) {
                dVar.f8875a = true;
                LayoutInflater.from(getContext()).inflate(R.layout.live_tab_view_viewstub_flexalocal, (ViewGroup) view.findViewById(R.id.live_tab_rl), true);
            }
            if (!TextUtils.isEmpty(tabBottom.subscriptInfo.getString("backgroundPicUrl"))) {
                TUrlImageView tUrlImageView = (TUrlImageView) view.findViewById(R.id.live_tab_corner_mark_img);
                if (tUrlImageView == null) {
                    return;
                }
                if (tabBottom.isSelected) {
                    tUrlImageView.setVisibility(8);
                    return;
                }
                tUrlImageView.setImageUrl(tabBottom.subscriptInfo.getString("backgroundPicUrl"));
                if (tabBottom.subscriptInfo.getBoolean("animation") != null && tabBottom.subscriptInfo.getBoolean("animation").booleanValue()) {
                    tUrlImageView.setSkipAutoSize(true);
                }
                tUrlImageView.setVisibility(0);
                return;
            }
            TextView textView = (TextView) view.findViewById(R.id.live_tab_corner_mark_text);
            if (textView == null) {
                return;
            }
            if (tabBottom.isSelected) {
                textView.setVisibility(8);
                return;
            }
            String string = tabBottom.subscriptInfo.getString("title");
            if (string.length() <= 4) {
                if (string.length() == 1) {
                    float f = getResources().getDisplayMetrics().density;
                    int i2 = (int) (5.0f * f);
                    int i3 = (int) (f * 1.0f);
                    textView.setPadding(i2, i3, i2, i3);
                    textView.requestLayout();
                }
                if (i == this.mTabViews.size() - 1 && string.length() == 4) {
                    ((RelativeLayout.LayoutParams) textView.getLayoutParams()).setMarginStart((qw0.l() * 35) / 750);
                }
                textView.setText(string);
            }
            textView.setVisibility(0);
        }
    }

    public LiveNewTabView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public LiveNewTabView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }

    public void updateTab(int i, boolean z, d dVar, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a5b0ba0", new Object[]{this, new Integer(i), new Boolean(z), dVar, new Boolean(z2)});
            return;
        }
        List<View> list = this.mTabViews;
        if (list != null && this.mTabs != null && i < list.size() && i == this.mCurPos && dVar != null) {
            String str = dVar.d;
            String str2 = dVar.h;
            String str3 = dVar.g;
            String str4 = dVar.i;
            if (!lrq.a(str2) && !lrq.a(str) && !lrq.a(str3) && !lrq.a(str4)) {
                if (z) {
                    str = str2;
                    str3 = str4;
                }
                View view = this.mTabViews.get(i);
                if (view != null) {
                    TUrlImageView tUrlImageView = (TUrlImageView) view.findViewById(R.id.live_tab_img);
                    TextView textView = (TextView) view.findViewById(R.id.live_tab_title);
                    if (tUrlImageView != null && textView != null) {
                        String imageUrl = tUrlImageView.getImageUrl();
                        if (!lrq.a(imageUrl) && !imageUrl.equals(str)) {
                            if (z2) {
                                if (z) {
                                    dVar.e(true);
                                } else {
                                    dVar.e(false);
                                }
                            }
                            setImageUrl(tUrlImageView, str, i);
                            textView.setText(str3);
                            invalidate();
                        }
                    }
                }
            }
        }
    }
}
