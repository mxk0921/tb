package com.taobao.browser.jsbridge.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.viewpager.widget.PagerAdapter;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.browser.jsbridge.ui.ImageTouchView;
import com.taobao.tao.image.ImageStrategyConfig;
import com.taobao.tao.util.ImageStrategyDecider;
import java.util.ArrayList;
import tb.s0m;
import tb.t2o;
import tb.uuo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class HorizontalPagerAdapter extends PagerAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Context mContext;
    private ArrayList<String> mPaths;
    private ImageStrategyConfig mConfig = ImageStrategyConfig.v("windvane", 98).a();
    public boolean isLongClick = false;

    static {
        t2o.a(619708571);
    }

    public HorizontalPagerAdapter(Context context) {
        this.mContext = context;
    }

    public static /* synthetic */ Context access$000(HorizontalPagerAdapter horizontalPagerAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("d329fa5a", new Object[]{horizontalPagerAdapter});
        }
        return horizontalPagerAdapter.mContext;
    }

    public static /* synthetic */ Object ipc$super(HorizontalPagerAdapter horizontalPagerAdapter, String str, Object... objArr) {
        if (str.hashCode() == -2093417530) {
            super.setPrimaryItem((ViewGroup) objArr[0], ((Number) objArr[1]).intValue(), objArr[2]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/browser/jsbridge/ui/HorizontalPagerAdapter");
    }

    public void change(ArrayList<String> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73f471d3", new Object[]{this, arrayList});
        } else {
            this.mPaths = arrayList;
        }
    }

    public void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
        } else {
            this.mPaths = null;
        }
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
        return this.mPaths.size();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("1038d332", new Object[]{this, viewGroup, new Integer(i)});
        }
        ImageTouchView imageTouchView = new ImageTouchView(this.mContext);
        imageTouchView.setScaleType(ImageView.ScaleType.MATRIX);
        imageTouchView.setMaxZoom(5.0f);
        final String str = this.mPaths.get(i);
        if (str.startsWith("http") || str.startsWith("https")) {
            s0m.B().T(ImageStrategyDecider.decideUrl(str, 2000, 2000, this.mConfig)).into(imageTouchView);
        } else {
            s0m.B().T(uuo.q(str)).into(imageTouchView);
        }
        final ImageViewPager imageViewPager = (ImageViewPager) viewGroup;
        imageViewPager.addView(imageTouchView, 0);
        imageTouchView.setImageClickListener(new ImageTouchView.OnImageClickListener() { // from class: com.taobao.browser.jsbridge.ui.HorizontalPagerAdapter.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.browser.jsbridge.ui.ImageTouchView.OnImageClickListener
            public void onLongClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7edba0fe", new Object[]{this, view});
                } else {
                    TBImageSaveView.getInstance().save(str, HorizontalPagerAdapter.access$000(HorizontalPagerAdapter.this), view);
                }
            }

            @Override // com.taobao.browser.jsbridge.ui.ImageTouchView.OnImageClickListener
            public boolean onSingleClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("de0710e", new Object[]{this, view})).booleanValue();
                }
                if (!(imageViewPager.getContext() instanceof Activity)) {
                    return false;
                }
                TBImageSaveView.getInstance().destroy();
                ((Activity) imageViewPager.getContext()).finish();
                return true;
            }
        });
        return imageTouchView;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e758b33", new Object[]{this, view, obj})).booleanValue();
        }
        if (view == ((View) obj)) {
            return true;
        }
        return false;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8338fbc6", new Object[]{this, viewGroup, new Integer(i), obj});
            return;
        }
        super.setPrimaryItem(viewGroup, i, obj);
        ImageViewPager imageViewPager = (ImageViewPager) viewGroup;
        ImageTouchView imageTouchView = (ImageTouchView) obj;
        ImageTouchView currentView = imageViewPager.getCurrentView();
        if (currentView != imageTouchView) {
            if (currentView != null) {
                currentView.resetScale();
            }
            imageViewPager.setCurrentView(imageTouchView);
        }
    }
}
