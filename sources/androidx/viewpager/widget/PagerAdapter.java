package androidx.viewpager.widget;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class PagerAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int POSITION_NONE = -2;
    public static final int POSITION_UNCHANGED = -1;
    private final DataSetObservable mObservable = new DataSetObservable();
    private DataSetObserver mViewPagerObserver;

    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a141ccc", new Object[]{this, viewGroup, new Integer(i), obj});
        } else {
            destroyItem((View) viewGroup, i, obj);
        }
    }

    @Deprecated
    public void finishUpdate(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a80a62f", new Object[]{this, view});
        }
    }

    public abstract int getCount();

    public int getItemPosition(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("304bee8", new Object[]{this, obj})).intValue();
        }
        return -1;
    }

    public CharSequence getPageTitle(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("1a9ab8b1", new Object[]{this, new Integer(i)});
        }
        return null;
    }

    public float getPageWidth(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b5c622b", new Object[]{this, new Integer(i)})).floatValue();
        }
        return 1.0f;
    }

    public Object instantiateItem(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("1038d332", new Object[]{this, viewGroup, new Integer(i)}) : instantiateItem((View) viewGroup, i);
    }

    public abstract boolean isViewFromObject(View view, Object obj);

    public void notifyDataSetChanged() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eee9a4ec", new Object[]{this});
            return;
        }
        synchronized (this) {
            try {
                DataSetObserver dataSetObserver = this.mViewPagerObserver;
                if (dataSetObserver != null) {
                    dataSetObserver.onChanged();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.mObservable.notifyChanged();
    }

    public void registerDataSetObserver(DataSetObserver dataSetObserver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63701d27", new Object[]{this, dataSetObserver});
        } else {
            this.mObservable.registerObserver(dataSetObserver);
        }
    }

    public void restoreState(Parcelable parcelable, ClassLoader classLoader) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4ccff61", new Object[]{this, parcelable, classLoader});
        }
    }

    public Parcelable saveState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Parcelable) ipChange.ipc$dispatch("b5f2b05e", new Object[]{this});
        }
        return null;
    }

    @Deprecated
    public void setPrimaryItem(View view, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("383ff807", new Object[]{this, view, new Integer(i), obj});
        }
    }

    public void setViewPagerObserver(DataSetObserver dataSetObserver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1015ae8e", new Object[]{this, dataSetObserver});
            return;
        }
        synchronized (this) {
            this.mViewPagerObserver = dataSetObserver;
        }
    }

    @Deprecated
    public void startUpdate(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("481d94c0", new Object[]{this, view});
        }
    }

    public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66db852e", new Object[]{this, dataSetObserver});
        } else {
            this.mObservable.unregisterObserver(dataSetObserver);
        }
    }

    @Deprecated
    public void destroyItem(View view, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c889cb41", new Object[]{this, view, new Integer(i), obj});
            return;
        }
        throw new UnsupportedOperationException("Required method destroyItem was not overridden");
    }

    public void finishUpdate(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fad9102", new Object[]{this, viewGroup});
        } else {
            finishUpdate((View) viewGroup);
        }
    }

    @Deprecated
    public Object instantiateItem(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("542dde3d", new Object[]{this, view, new Integer(i)});
        }
        throw new UnsupportedOperationException("Required method instantiateItem was not overridden");
    }

    public void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8338fbc6", new Object[]{this, viewGroup, new Integer(i), obj});
        } else {
            setPrimaryItem((View) viewGroup, i, obj);
        }
    }

    public void startUpdate(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c641511", new Object[]{this, viewGroup});
        } else {
            startUpdate((View) viewGroup);
        }
    }
}
