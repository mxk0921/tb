package com.taobao.browser.fragment;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.browser.jsbridge.ui.HorizontalPagerAdapter;
import com.taobao.browser.jsbridge.ui.ImageViewPager;
import com.taobao.browser.utils.BrowserUtil;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class HorizontalImageListFragment extends Fragment {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String TAG = "HorizontalImageListFragmentContainer";
    public ArrayList<String> mImageUrls = new ArrayList<>();
    private HorizontalPagerAdapter mAdapter = null;
    private View mView = null;
    private List<View> dots = null;
    private String index = "0";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class PageChangeListener implements ViewPager.OnPageChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private int oldPosition;

        static {
            t2o.a(619708497);
        }

        private PageChangeListener() {
            this.oldPosition = 0;
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6581cc1e", new Object[]{this, new Integer(i)});
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f4c13b05", new Object[]{this, new Integer(i), new Float(f), new Integer(i2)});
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i)});
                return;
            }
            ((View) HorizontalImageListFragment.access$100(HorizontalImageListFragment.this).get(this.oldPosition)).setBackgroundResource(R.drawable.image_dot_normal);
            ((View) HorizontalImageListFragment.access$100(HorizontalImageListFragment.this).get(i)).setBackgroundResource(R.drawable.image_dot_focused);
            this.oldPosition = i;
        }
    }

    static {
        t2o.a(619708495);
    }

    public static /* synthetic */ List access$100(HorizontalImageListFragment horizontalImageListFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("e575a53e", new Object[]{horizontalImageListFragment});
        }
        return horizontalImageListFragment.dots;
    }

    public static /* synthetic */ Object ipc$super(HorizontalImageListFragment horizontalImageListFragment, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/browser/fragment/HorizontalImageListFragment");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        BrowserUtil.b(this.TAG, BrowserUtil.b, BrowserUtil.c, null, null);
        Bundle arguments = getArguments();
        if (arguments != null) {
            String[] stringArray = arguments.getStringArray("image_list_urls");
            if (stringArray != null) {
                for (String str : stringArray) {
                    if (str != null) {
                        this.mImageUrls.add(str);
                    }
                }
            }
            String string = arguments.getString("image_position");
            this.index = string;
            if (TextUtils.isEmpty(string)) {
                this.index = "0";
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        View inflate = layoutInflater.inflate(R.layout.horizontalimagelist_layout, viewGroup, false);
        this.mView = inflate;
        if (inflate == null) {
            return null;
        }
        Context context = inflate.getContext();
        ImageViewPager imageViewPager = (ImageViewPager) this.mView.findViewById(R.id.image_Horizontallist);
        HorizontalPagerAdapter horizontalPagerAdapter = new HorizontalPagerAdapter(context);
        this.mAdapter = horizontalPagerAdapter;
        horizontalPagerAdapter.change(this.mImageUrls);
        imageViewPager.setAdapter(this.mAdapter);
        imageViewPager.setCurrentItem(Integer.parseInt(this.index));
        int size = this.mImageUrls.size();
        ViewGroup viewGroup2 = (ViewGroup) this.mView.findViewById(R.id.v_dots);
        if (size >= 10 || size <= 1) {
            viewGroup2.setVisibility(8);
        } else {
            PageChangeListener pageChangeListener = new PageChangeListener();
            imageViewPager.setOnPageChangeListener(pageChangeListener);
            this.dots = new ArrayList();
            View findViewById = this.mView.findViewById(R.id.v_dot);
            this.dots.add(findViewById);
            for (int i = 1; i < size; i++) {
                View view = new View(context);
                view.setLayoutParams(findViewById.getLayoutParams());
                view.setBackgroundResource(R.drawable.image_dot_normal);
                this.dots.add(view);
                viewGroup2.addView(view);
            }
            pageChangeListener.onPageSelected(Integer.parseInt(this.index));
        }
        return this.mView;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        HorizontalPagerAdapter horizontalPagerAdapter = this.mAdapter;
        if (horizontalPagerAdapter != null) {
            horizontalPagerAdapter.clear();
        }
        this.mAdapter = null;
        super.onDestroy();
    }
}
