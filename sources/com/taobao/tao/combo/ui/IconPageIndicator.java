package com.taobao.tao.combo.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.viewpager.widget.ViewPager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import tb.t2o;
import tb.u24;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class IconPageIndicator extends HorizontalScrollView implements ComboPageIndicator {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int FIRST_NULL_PAGER = -1;
    public static final int LAST_NULL_PAGER = -2;
    private Context mContext;
    private c mIconClickedListener;
    private Runnable mIconSelector;
    private final LinearLayout mLinearLayout;
    private ViewPager.OnPageChangeListener mListener;
    private int mSelectedIndex;
    private DirectionViewPager mViewPager;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f11944a;

        public a(View view) {
            this.f11944a = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            IconPageIndicator.this.smoothScrollTo(this.f11944a.getLeft() - ((IconPageIndicator.this.getWidth() - this.f11944a.getWidth()) / 2), 0);
            IconPageIndicator.access$002(IconPageIndicator.this, null);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            int intValue = ((Integer) view.getTag()).intValue();
            IconPageIndicator.this.setCurrentItem(intValue);
            if (IconPageIndicator.access$100(IconPageIndicator.this) != null) {
                IconPageIndicator.access$100(IconPageIndicator.this).a(intValue);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface c {
        void a(int i);
    }

    static {
        t2o.a(764412086);
        t2o.a(764412079);
    }

    public IconPageIndicator(Context context) {
        this(context, null);
    }

    public static /* synthetic */ Runnable access$002(IconPageIndicator iconPageIndicator, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("a8b6797b", new Object[]{iconPageIndicator, runnable});
        }
        iconPageIndicator.mIconSelector = runnable;
        return runnable;
    }

    public static /* synthetic */ c access$100(IconPageIndicator iconPageIndicator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("e32cfb22", new Object[]{iconPageIndicator});
        }
        return iconPageIndicator.mIconClickedListener;
    }

    private void animateToIcon(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85a1e0a7", new Object[]{this, new Integer(i)});
            return;
        }
        View childAt = this.mLinearLayout.getChildAt(i);
        Runnable runnable = this.mIconSelector;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        a aVar = new a(childAt);
        this.mIconSelector = aVar;
        post(aVar);
    }

    private int dip2px(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("777b781d", new Object[]{this, new Float(f)})).intValue();
        }
        return (int) ((f * getContext().getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static /* synthetic */ Object ipc$super(IconPageIndicator iconPageIndicator, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 949399698) {
            super.onDetachedFromWindow();
            return null;
        } else if (hashCode == 1626033557) {
            super.onAttachedToWindow();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/tao/combo/ui/IconPageIndicator");
        }
    }

    private void setItemShape(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bf8dcd0", new Object[]{this, new Integer(i)});
            return;
        }
        int count = ((u24) this.mViewPager.getAdapter()).getCount();
        int viewPagerClassify = this.mViewPager.getViewPagerClassify();
        if (viewPagerClassify == 0 || viewPagerClassify == 1) {
            count--;
        } else if (viewPagerClassify == 2) {
            count -= 2;
        }
        for (int i2 = 0; i2 < count; i2++) {
            LinearLayout linearLayout = (LinearLayout) this.mLinearLayout.getChildAt(i2);
            if (i2 == i) {
                linearLayout.getChildAt(0).setBackgroundResource(R.drawable.shop_combo_buttom_item_selected_shape);
            } else {
                linearLayout.getChildAt(0).setBackgroundDrawable(getResources().getDrawable(R.drawable.shop_combo_buttom_item_shape));
            }
        }
    }

    public void notifyDataSetChanged() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eee9a4ec", new Object[]{this});
            return;
        }
        this.mLinearLayout.removeAllViews();
        u24 u24Var = (u24) this.mViewPager.getAdapter();
        int count = u24Var.getCount();
        int viewPagerClassify = this.mViewPager.getViewPagerClassify();
        if (viewPagerClassify == 0 || viewPagerClassify == 1) {
            count--;
        } else if (viewPagerClassify == 2) {
            count -= 2;
        }
        LayoutInflater from = LayoutInflater.from(this.mContext);
        int i = 0;
        while (i < count) {
            LinearLayout linearLayout = (LinearLayout) from.inflate(R.layout.shop_combo_buttom_scroll_item, (ViewGroup) null);
            if (linearLayout != null) {
                ((TUrlImageView) linearLayout.findViewById(R.id.shop_combo_buttom_scroll_item_turlImgview)).setImageUrl(u24Var.g(i));
                int i2 = i + 1;
                if (i2 < count) {
                    ((ImageView) linearLayout.findViewById(R.id.shop_combo_buttom_scroll_item_add)).setVisibility(0);
                }
                linearLayout.setTag(Integer.valueOf(i));
                linearLayout.setOnClickListener(new b());
                this.mLinearLayout.addView(linearLayout);
                i = i2;
            } else {
                return;
            }
        }
        if (this.mSelectedIndex > count) {
            this.mSelectedIndex = count - 1;
        }
        setCurrentItem(this.mSelectedIndex);
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        Runnable runnable = this.mIconSelector;
        if (runnable != null) {
            post(runnable);
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
        Runnable runnable = this.mIconSelector;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6581cc1e", new Object[]{this, new Integer(i)});
            return;
        }
        ViewPager.OnPageChangeListener onPageChangeListener = this.mListener;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageScrollStateChanged(i);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i, float f, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4c13b05", new Object[]{this, new Integer(i), new Float(f), new Integer(i2)});
            return;
        }
        ViewPager.OnPageChangeListener onPageChangeListener = this.mListener;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageScrolled(i, f, i2);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i) {
        int i2 = -1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i)});
            return;
        }
        int viewPagerClassify = this.mViewPager.getViewPagerClassify();
        int count = this.mViewPager.getAdapter().getCount();
        if (viewPagerClassify != 0) {
            if (viewPagerClassify != 1) {
                if (viewPagerClassify == 2) {
                    if (i == 0 || count == 1 + i) {
                        ViewPager.OnPageChangeListener onPageChangeListener = this.mListener;
                        if (onPageChangeListener != null) {
                            if (i != 0) {
                                i2 = -2;
                            }
                            onPageChangeListener.onPageSelected(i2);
                            return;
                        }
                        return;
                    }
                }
            } else if (i == 0) {
                ViewPager.OnPageChangeListener onPageChangeListener2 = this.mListener;
                if (onPageChangeListener2 != null) {
                    onPageChangeListener2.onPageSelected(-1);
                    return;
                }
                return;
            }
            i--;
        } else if (count == 1 + i) {
            ViewPager.OnPageChangeListener onPageChangeListener3 = this.mListener;
            if (onPageChangeListener3 != null) {
                onPageChangeListener3.onPageSelected(-2);
                return;
            }
            return;
        }
        setCurrentItem(i);
        ViewPager.OnPageChangeListener onPageChangeListener4 = this.mListener;
        if (onPageChangeListener4 != null) {
            onPageChangeListener4.onPageSelected(i);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
        if (r3 != 3) goto L_0x0043;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setCurrentItem(int r7) {
        /*
            r6 = this;
            r0 = 0
            r1 = 2
            r2 = 1
            com.android.alibaba.ip.runtime.IpChange r3 = com.taobao.tao.combo.ui.IconPageIndicator.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x001a
            java.lang.Integer r4 = new java.lang.Integer
            r4.<init>(r7)
            java.lang.Object[] r7 = new java.lang.Object[r1]
            r7[r0] = r6
            r7[r2] = r4
            java.lang.String r0 = "d416f32"
            r3.ipc$dispatch(r0, r7)
            return
        L_0x001a:
            com.taobao.tao.combo.ui.DirectionViewPager r3 = r6.mViewPager
            if (r3 == 0) goto L_0x0065
            r6.mSelectedIndex = r7
            int r3 = r3.getViewPagerClassify()
            if (r3 == 0) goto L_0x003e
            if (r3 == r2) goto L_0x0036
            if (r3 == r1) goto L_0x002e
            r1 = 3
            if (r3 == r1) goto L_0x003e
            goto L_0x0043
        L_0x002e:
            com.taobao.tao.combo.ui.DirectionViewPager r1 = r6.mViewPager
            int r3 = r7 + 1
            r1.setCurrentItem(r3)
            goto L_0x0043
        L_0x0036:
            com.taobao.tao.combo.ui.DirectionViewPager r1 = r6.mViewPager
            int r3 = r7 + 1
            r1.setCurrentItem(r3)
            goto L_0x0043
        L_0x003e:
            com.taobao.tao.combo.ui.DirectionViewPager r1 = r6.mViewPager
            r1.setCurrentItem(r7)
        L_0x0043:
            r6.setItemShape(r7)
            android.widget.LinearLayout r1 = r6.mLinearLayout
            int r1 = r1.getChildCount()
            r3 = 0
        L_0x004d:
            if (r3 >= r1) goto L_0x0064
            android.widget.LinearLayout r4 = r6.mLinearLayout
            android.view.View r4 = r4.getChildAt(r3)
            if (r3 != r7) goto L_0x0059
            r5 = 1
            goto L_0x005a
        L_0x0059:
            r5 = 0
        L_0x005a:
            r4.setSelected(r5)
            if (r5 == 0) goto L_0x0062
            r6.animateToIcon(r7)
        L_0x0062:
            int r3 = r3 + r2
            goto L_0x004d
        L_0x0064:
            return
        L_0x0065:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "ViewPager has not been bound."
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.combo.ui.IconPageIndicator.setCurrentItem(int):void");
    }

    public void setIconClickedListener(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23dbe66f", new Object[]{this, cVar});
        } else {
            this.mIconClickedListener = cVar;
        }
    }

    public void setOnPageChangeListener(ViewPager.OnPageChangeListener onPageChangeListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1037bbe", new Object[]{this, onPageChangeListener});
        } else {
            this.mListener = onPageChangeListener;
        }
    }

    public void setViewPager(DirectionViewPager directionViewPager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("206abdd9", new Object[]{this, directionViewPager});
            return;
        }
        DirectionViewPager directionViewPager2 = this.mViewPager;
        if (directionViewPager2 != directionViewPager) {
            if (directionViewPager2 != null) {
                directionViewPager2.setOnPageChangeListener(null);
            }
            if (directionViewPager.getAdapter() != null) {
                this.mViewPager = directionViewPager;
                directionViewPager.setOnPageChangeListener(this);
                notifyDataSetChanged();
                return;
            }
            throw new IllegalStateException("ViewPager does not have adapter instance.");
        }
    }

    public IconPageIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mContext = context;
        setHorizontalScrollBarEnabled(false);
        LinearLayout linearLayout = new LinearLayout(context);
        this.mLinearLayout = linearLayout;
        linearLayout.setOrientation(0);
        int dip2px = dip2px(8.0f);
        linearLayout.setPadding(dip2px, dip2px, 0, dip2px);
        addView(linearLayout, new FrameLayout.LayoutParams(-1, -1, 16));
    }

    public void setViewPager(DirectionViewPager directionViewPager, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eced704a", new Object[]{this, directionViewPager, new Integer(i)});
            return;
        }
        setViewPager(directionViewPager);
        setCurrentItem(i);
    }
}
