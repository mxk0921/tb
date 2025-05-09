package com.taobao.taolive.uikit.view;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.uikit.component.Banner;
import com.taobao.uikit.component.IndicatorView;
import com.taobao.uikit.component.LoopViewPager;
import java.util.ArrayList;
import java.util.Iterator;
import tb.t2d;
import tb.t2o;
import tb.v5d;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TBLiveBanner extends Banner {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private SimpleAdapter mAdapter;
    private t2d mCardChangeListener;
    private ArrayList<View> mChildViews;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class SimpleAdapter extends PagerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final ArrayList<View> f13353a;

        static {
            t2o.a(779093691);
        }

        public SimpleAdapter(ArrayList<View> arrayList) {
            this.f13353a = arrayList;
        }

        public static /* synthetic */ Object ipc$super(SimpleAdapter simpleAdapter, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/uikit/view/TBLiveBanner$SimpleAdapter");
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2a141ccc", new Object[]{this, viewGroup, new Integer(i), obj});
            } else {
                viewGroup.removeView((View) obj);
            }
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue();
            }
            return this.f13353a.size();
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getItemPosition(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("304bee8", new Object[]{this, obj})).intValue();
            }
            return -2;
        }

        public void h() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a6532022", new Object[]{this});
            } else {
                this.f13353a.clear();
            }
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public Object instantiateItem(ViewGroup viewGroup, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("1038d332", new Object[]{this, viewGroup, new Integer(i)});
            }
            View view = this.f13353a.get(i);
            viewGroup.removeView(view);
            viewGroup.addView(view);
            if (TBLiveBanner.access$100(TBLiveBanner.this) != null) {
                TBLiveBanner.access$100(TBLiveBanner.this).a(i);
            }
            return view;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public boolean isViewFromObject(View view, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("9e758b33", new Object[]{this, view, obj})).booleanValue();
            }
            if (view == obj) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements LoopViewPager.OnPageChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.uikit.component.LoopViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6581cc1e", new Object[]{this, new Integer(i)});
            }
        }

        @Override // com.taobao.uikit.component.LoopViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f4c13b05", new Object[]{this, new Integer(i), new Float(f), new Integer(i2)});
            }
        }

        @Override // com.taobao.uikit.component.LoopViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i)});
                return;
            }
            TBLiveBanner.access$000(TBLiveBanner.this).setIndex(i);
            if (TBLiveBanner.access$100(TBLiveBanner.this) != null) {
                TBLiveBanner.access$100(TBLiveBanner.this).b(i);
            }
        }
    }

    static {
        t2o.a(779093689);
        t2o.a(779093577);
        t2o.a(779093579);
    }

    public TBLiveBanner(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }

    public static /* synthetic */ IndicatorView access$000(TBLiveBanner tBLiveBanner) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IndicatorView) ipChange.ipc$dispatch("878083ac", new Object[]{tBLiveBanner});
        }
        return tBLiveBanner.mIndicator;
    }

    public static /* synthetic */ t2d access$100(TBLiveBanner tBLiveBanner) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (t2d) ipChange.ipc$dispatch("619a9e90", new Object[]{tBLiveBanner});
        }
        return tBLiveBanner.mCardChangeListener;
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.tbliveuikit_banner_layout, (ViewGroup) null, false);
        if (inflate != null) {
            View findViewById = inflate.findViewById(R.id.tbliveuikit_banner_viewpager);
            if (findViewById != null) {
                findViewById.setId(R.id.viewpager);
            }
            View findViewById2 = inflate.findViewById(R.id.tbliveuikit_banner_indicator);
            if (findViewById2 != null) {
                findViewById2.setId(R.id.indicator);
                ((IndicatorView) findViewById2).setFocusColor(Color.parseColor("#ff2851"));
            }
            setLayout(inflate);
            setRatio(1.0f);
            setAutoScroll(true);
            setScrollInterval(10000);
            setBackgroundColor(0);
            this.mViewPager.setOnPageChangeListener(new a());
        }
    }

    public static /* synthetic */ Object ipc$super(TBLiveBanner tBLiveBanner, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -265261157) {
            super.destory();
            return null;
        } else if (hashCode == 650865254) {
            super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/taolive/uikit/view/TBLiveBanner");
        }
    }

    public void addChildView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51bfb6ab", new Object[]{this, view});
            return;
        }
        if (this.mChildViews == null) {
            this.mChildViews = new ArrayList<>();
        }
        if (view != null) {
            this.mChildViews.add(view);
        }
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        super.destory();
        SimpleAdapter simpleAdapter = (SimpleAdapter) this.mViewPager.getAdapter();
        if (simpleAdapter != null) {
            simpleAdapter.h();
        }
    }

    public v5d getInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (v5d) ipChange.ipc$dispatch("d003153", new Object[]{this});
        }
        return null;
    }

    public void makeView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("960c80ba", new Object[]{this});
        } else if (this.mChildViews != null) {
            SimpleAdapter simpleAdapter = this.mAdapter;
            if (simpleAdapter == null) {
                SimpleAdapter simpleAdapter2 = new SimpleAdapter(this.mChildViews);
                this.mAdapter = simpleAdapter2;
                setAdapter(simpleAdapter2);
                return;
            }
            simpleAdapter.notifyDataSetChanged();
            this.mIndicator.setTotal(this.mChildViews.size());
        }
    }

    public boolean needLazyLoad() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4c7455bb", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            super.onMeasure(i, i2);
        }
    }

    public void pause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
        }
    }

    public void removeChildViews() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4d36fdd", new Object[]{this});
            return;
        }
        ArrayList<View> arrayList = this.mChildViews;
        if (arrayList != null) {
            arrayList.clear();
            SimpleAdapter simpleAdapter = this.mAdapter;
            if (simpleAdapter != null) {
                simpleAdapter.notifyDataSetChanged();
                this.mAdapter = null;
            }
        }
    }

    public void resume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("deb96e34", new Object[]{this});
        }
    }

    public void setChildViews(ArrayList<View> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f643e54f", new Object[]{this, arrayList});
        } else if (arrayList != null && arrayList.size() > 0) {
            removeChildViews();
            Iterator<View> it = arrayList.iterator();
            while (it.hasNext()) {
                addChildView(it.next());
            }
        }
    }

    public void setCurrentCard(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e45e555", new Object[]{this, new Integer(i)});
        } else if (i >= 0 && i < this.mChildViews.size()) {
            this.mViewPager.setCurrentItem(i);
            t2d t2dVar = this.mCardChangeListener;
            if (t2dVar != null) {
                t2dVar.b(i);
            }
        }
    }

    public void setOnCardChangeListener(t2d t2dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a757c6ec", new Object[]{this, t2dVar});
        } else {
            this.mCardChangeListener = t2dVar;
        }
    }

    public TBLiveBanner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public TBLiveBanner(Context context) {
        super(context);
        init();
    }
}
