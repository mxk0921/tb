package com.taobao.android.detail.ttdetail.widget;

import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class CycleScrollPagerAdapter extends PagerAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final PagerAdapter f6982a;

    static {
        t2o.a(912262894);
    }

    public CycleScrollPagerAdapter(PagerAdapter pagerAdapter) {
        this.f6982a = pagerAdapter;
    }

    public static /* synthetic */ Object ipc$super(CycleScrollPagerAdapter cycleScrollPagerAdapter, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/widget/CycleScrollPagerAdapter");
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a141ccc", new Object[]{this, viewGroup, new Integer(i), obj});
            return;
        }
        int count = this.f6982a.getCount();
        if (count != 0) {
            if (i == 0) {
                this.f6982a.destroyItem(viewGroup, count - 1, obj);
            } else if (i == getCount() - 1) {
                this.f6982a.destroyItem(viewGroup, 0, obj);
            } else {
                this.f6982a.destroyItem(viewGroup, i - 1, obj);
            }
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void finishUpdate(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fad9102", new Object[]{this, viewGroup});
        } else {
            this.f6982a.finishUpdate(viewGroup);
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue();
        }
        if (this.f6982a.getCount() > 0) {
            return this.f6982a.getCount() + 2;
        }
        return 0;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getItemPosition(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("304bee8", new Object[]{this, obj})).intValue();
        }
        return this.f6982a.getItemPosition(obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public float getPageWidth(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b5c622b", new Object[]{this, new Integer(i)})).floatValue();
        }
        int count = this.f6982a.getCount();
        if (count == 0) {
            return 1.0f;
        }
        if (i == 0) {
            return this.f6982a.getPageWidth(count - 1);
        }
        if (i == getCount() - 1) {
            return this.f6982a.getPageWidth(0);
        }
        return this.f6982a.getPageWidth(i - 1);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("1038d332", new Object[]{this, viewGroup, new Integer(i)});
        }
        int count = this.f6982a.getCount();
        if (count == 0) {
            return null;
        }
        if (i == 0) {
            return this.f6982a.instantiateItem(viewGroup, count - 1);
        }
        if (i == getCount() - 1) {
            return this.f6982a.instantiateItem(viewGroup, 0);
        }
        return this.f6982a.instantiateItem(viewGroup, i - 1);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e758b33", new Object[]{this, view, obj})).booleanValue();
        }
        return this.f6982a.isViewFromObject(view, obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void registerDataSetObserver(DataSetObserver dataSetObserver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63701d27", new Object[]{this, dataSetObserver});
        } else {
            this.f6982a.registerDataSetObserver(dataSetObserver);
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void restoreState(Parcelable parcelable, ClassLoader classLoader) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4ccff61", new Object[]{this, parcelable, classLoader});
        } else {
            this.f6982a.restoreState(parcelable, classLoader);
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Parcelable saveState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Parcelable) ipChange.ipc$dispatch("b5f2b05e", new Object[]{this});
        }
        return this.f6982a.saveState();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8338fbc6", new Object[]{this, viewGroup, new Integer(i), obj});
        } else {
            this.f6982a.setPrimaryItem(viewGroup, i, obj);
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void startUpdate(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c641511", new Object[]{this, viewGroup});
        } else {
            this.f6982a.startUpdate(viewGroup);
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66db852e", new Object[]{this, dataSetObserver});
        } else {
            this.f6982a.unregisterDataSetObserver(dataSetObserver);
        }
    }
}
