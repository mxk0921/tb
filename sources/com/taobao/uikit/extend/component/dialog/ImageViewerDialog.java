package com.taobao.uikit.extend.component.dialog;

import android.app.Dialog;
import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TZoomImageView;
import com.taobao.uikit.extend.feature.view.TZoomPagerItem;
import com.taobao.uikit.feature.features.ImageSaveFeature;
import com.taobao.uikit.feature.view.TImageView;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ImageViewerDialog extends Dialog {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private MyAdapter mAdapter;
    private boolean mHidePageNum;
    private TextView mImageDescText;
    private String[] mImageDescs;
    private String[] mImageUrls;
    private SparseArray<TZoomPagerItem> mPageList;
    private TextView mPageNumText;
    private boolean mSave;
    private ViewPager mViewPager;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class MyAdapter extends PagerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(932184099);
        }

        public MyAdapter() {
        }

        public static /* synthetic */ Object ipc$super(MyAdapter myAdapter, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/uikit/extend/component/dialog/ImageViewerDialog$MyAdapter");
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2a141ccc", new Object[]{this, viewGroup, new Integer(i), obj});
                return;
            }
            viewGroup.removeView((View) obj);
            ImageViewerDialog.access$000(ImageViewerDialog.this).remove(i);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue();
            }
            if (ImageViewerDialog.access$400(ImageViewerDialog.this) == null) {
                return 0;
            }
            return ImageViewerDialog.access$400(ImageViewerDialog.this).length;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getItemPosition(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("304bee8", new Object[]{this, obj})).intValue();
            }
            return -2;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public Object instantiateItem(ViewGroup viewGroup, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("1038d332", new Object[]{this, viewGroup, new Integer(i)});
            }
            TZoomPagerItem tZoomPagerItem = (TZoomPagerItem) ImageViewerDialog.access$000(ImageViewerDialog.this).get(i);
            if (tZoomPagerItem == null) {
                tZoomPagerItem = new TZoomPagerItem(ImageViewerDialog.this.getContext());
                TZoomImageView imageView = tZoomPagerItem.getImageView();
                if (ImageViewerDialog.access$600(ImageViewerDialog.this) && imageView.findFeature(ImageSaveFeature.class) == null) {
                    imageView.addFeature(new ImageSaveFeature());
                    imageView.setLongClickable(true);
                }
                imageView.setImageUrl(ImageViewerDialog.access$400(ImageViewerDialog.this)[i]);
                imageView.setTag(Integer.valueOf(i));
                imageView.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.uikit.extend.component.dialog.ImageViewerDialog.MyAdapter.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        } else {
                            ImageViewerDialog.this.dismiss();
                        }
                    }
                });
                ImageViewerDialog.access$000(ImageViewerDialog.this).put(i, tZoomPagerItem);
            }
            viewGroup.addView(tZoomPagerItem);
            return tZoomPagerItem;
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

    static {
        t2o.a(932184097);
    }

    public ImageViewerDialog(Context context) {
        this(context, R.style.ImageViewerDialog);
    }

    public static /* synthetic */ SparseArray access$000(ImageViewerDialog imageViewerDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SparseArray) ipChange.ipc$dispatch("eb6cb6a8", new Object[]{imageViewerDialog});
        }
        return imageViewerDialog.mPageList;
    }

    public static /* synthetic */ String[] access$100(ImageViewerDialog imageViewerDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("16c18f01", new Object[]{imageViewerDialog});
        }
        return imageViewerDialog.mImageDescs;
    }

    public static /* synthetic */ TextView access$200(ImageViewerDialog imageViewerDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("98e43ee7", new Object[]{imageViewerDialog});
        }
        return imageViewerDialog.mImageDescText;
    }

    public static /* synthetic */ boolean access$300(ImageViewerDialog imageViewerDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8c377b38", new Object[]{imageViewerDialog})).booleanValue();
        }
        return imageViewerDialog.mHidePageNum;
    }

    public static /* synthetic */ String[] access$400(ImageViewerDialog imageViewerDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("3e86d784", new Object[]{imageViewerDialog});
        }
        return imageViewerDialog.mImageUrls;
    }

    public static /* synthetic */ TextView access$500(ImageViewerDialog imageViewerDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("eb63d92a", new Object[]{imageViewerDialog});
        }
        return imageViewerDialog.mPageNumText;
    }

    public static /* synthetic */ boolean access$600(ImageViewerDialog imageViewerDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1f7bee7b", new Object[]{imageViewerDialog})).booleanValue();
        }
        return imageViewerDialog.mSave;
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(getContext().getResources().getDisplayMetrics().widthPixels, -1);
        View inflate = getLayoutInflater().inflate(R.layout.uik_imageviewer_dialog, (ViewGroup) null);
        setContentView(inflate, layoutParams);
        this.mImageDescText = (TextView) inflate.findViewById(R.id.img_desc);
        this.mPageNumText = (TextView) inflate.findViewById(R.id.page_num);
        this.mViewPager = (ViewPager) inflate.findViewById(R.id.viewpager);
        MyAdapter myAdapter = new MyAdapter();
        this.mAdapter = myAdapter;
        this.mViewPager.setAdapter(myAdapter);
        this.mViewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() { // from class: com.taobao.uikit.extend.component.dialog.ImageViewerDialog.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("6581cc1e", new Object[]{this, new Integer(i)});
                }
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrolled(int i, float f, int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f4c13b05", new Object[]{this, new Integer(i), new Float(f), new Integer(i2)});
                }
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageSelected(int i) {
                TZoomImageView imageView;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i)});
                    return;
                }
                int size = ImageViewerDialog.access$000(ImageViewerDialog.this).size();
                for (int i2 = 0; i2 < size; i2++) {
                    if (!(i2 == i || ImageViewerDialog.access$000(ImageViewerDialog.this).get(i2) == null || (imageView = ((TZoomPagerItem) ImageViewerDialog.access$000(ImageViewerDialog.this).get(i2)).getImageView()) == null)) {
                        imageView.reset();
                    }
                }
                if (ImageViewerDialog.access$100(ImageViewerDialog.this) != null && ImageViewerDialog.access$100(ImageViewerDialog.this).length > i) {
                    ImageViewerDialog.access$200(ImageViewerDialog.this).setText(ImageViewerDialog.access$100(ImageViewerDialog.this)[i]);
                }
                if (!ImageViewerDialog.access$300(ImageViewerDialog.this)) {
                    TextView access$500 = ImageViewerDialog.access$500(ImageViewerDialog.this);
                    access$500.setText((i + 1) + "/" + ImageViewerDialog.access$400(ImageViewerDialog.this).length);
                }
            }
        });
    }

    public static /* synthetic */ Object ipc$super(ImageViewerDialog imageViewerDialog, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/uikit/extend/component/dialog/ImageViewerDialog");
    }

    public void enableSaveImage(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be1fec72", new Object[]{this, new Boolean(z)});
        } else {
            this.mSave = z;
        }
    }

    public TImageView getCurrentImageView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TImageView) ipChange.ipc$dispatch("b04391e4", new Object[]{this});
        }
        return this.mPageList.get(this.mViewPager.getCurrentItem()).getImageView();
    }

    public void hidePageNum(boolean z) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdbd7d78", new Object[]{this, new Boolean(z)});
            return;
        }
        this.mHidePageNum = z;
        TextView textView = this.mPageNumText;
        if (z) {
            i = 8;
        }
        textView.setVisibility(i);
    }

    public void setImageDescs(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f2ee5af", new Object[]{this, strArr});
            return;
        }
        this.mImageDescs = strArr;
        int currentItem = this.mViewPager.getCurrentItem();
        String[] strArr2 = this.mImageDescs;
        if (strArr2.length > currentItem) {
            this.mImageDescText.setText(strArr2[currentItem]);
        }
        if (!this.mHidePageNum) {
            TextView textView = this.mPageNumText;
            textView.setText((currentItem + 1) + "/" + this.mImageUrls.length);
        }
    }

    public void setImageUrls(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("517199fb", new Object[]{this, strArr});
        } else if (strArr != null) {
            this.mPageList.clear();
            this.mImageUrls = strArr;
            this.mAdapter.notifyDataSetChanged();
            int currentItem = this.mViewPager.getCurrentItem();
            if (!this.mHidePageNum) {
                TextView textView = this.mPageNumText;
                textView.setText((currentItem + 1) + "/" + this.mImageUrls.length);
            }
        }
    }

    public void show(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bb7fa7f", new Object[]{this, new Integer(i)});
            return;
        }
        String[] strArr = this.mImageUrls;
        if (strArr != null && i >= 0 && i < strArr.length) {
            this.mViewPager.setCurrentItem(i);
            show();
        }
    }

    public ImageViewerDialog(Context context, int i) {
        super(context, i);
        this.mPageList = new SparseArray<>();
        this.mSave = false;
        this.mHidePageNum = false;
        init();
    }
}
