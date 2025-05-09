package com.taobao.android.order.bundle.widget;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.core.container.UltronListProxy;
import java.util.Arrays;
import java.util.List;
import tb.pb6;
import tb.qrr;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class TBOrderListTabLayout extends HorizontalScrollView implements qrr {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private TextView mAllTabsCover;
    private int mFirstTabLeftPosition;
    private qrr.a mOnTabClickListener;
    private int mSelectedIndex;
    private int mSelectedTextSize;
    private TextView[] mTabItems;
    private int mTabsLayoutPadding;
    private int mTextSize;
    private List<String> mTabCodesKey = Arrays.asList("all", "waitPay", "waitSend", "waitConfirm", "reFund", "waitRate");
    private String[] mTabCodes = {"全部", "待付款", "待发货", "待收货", "退款/售后", "待评价"};

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f9123a;

        public a(int i) {
            this.f9123a = i;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                TBOrderListTabLayout.access$000(TBOrderListTabLayout.this, this.f9123a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                TBOrderListTabLayout.access$000(TBOrderListTabLayout.this, 0);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f9125a;

        public c(int i) {
            this.f9125a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                TBOrderListTabLayout.access$100(TBOrderListTabLayout.this, this.f9125a);
            }
        }
    }

    static {
        t2o.a(713031985);
        t2o.a(614465791);
    }

    public TBOrderListTabLayout(Context context) {
        super(context);
        initView(context);
    }

    public static /* synthetic */ void access$000(TBOrderListTabLayout tBOrderListTabLayout, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ef4b62c", new Object[]{tBOrderListTabLayout, new Integer(i)});
        } else {
            tBOrderListTabLayout.onTabClicked(i);
        }
    }

    public static /* synthetic */ void access$100(TBOrderListTabLayout tBOrderListTabLayout, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("504645ad", new Object[]{tBOrderListTabLayout, new Integer(i)});
        } else {
            tBOrderListTabLayout.scrollToCenter(i);
        }
    }

    private TextView getTextView(Context context, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("d57b36cd", new Object[]{this, context, new Integer(i), new Integer(i2)});
        }
        TextView textView = new TextView(context);
        textView.setText(this.mTabCodes[i]);
        textView.setIncludeFontPadding(false);
        textView.setGravity(16);
        textView.setTextSize(0, this.mTextSize);
        textView.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        textView.setPadding(i2, 0, i2, 0);
        textView.setTextColor(-11509638);
        return textView;
    }

    private void initView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f359fd6c", new Object[]{this, context});
            return;
        }
        setHorizontalScrollBarEnabled(false);
        setBackgroundColor(-1);
        this.mTextSize = pb6.c(context, 15.0f);
        this.mSelectedTextSize = pb6.c(context, 18.0f);
        setLayoutParams(new ViewGroup.LayoutParams(-1, pb6.c(context, 41.0f)));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-2, -1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        int c2 = pb6.c(context, 4.0f);
        this.mTabsLayoutPadding = c2;
        linearLayout.setPadding(c2, 0, c2, 0);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        this.mTabItems = new TextView[this.mTabCodes.length];
        int c3 = pb6.c(context, 12.0f);
        for (int i = 0; i < this.mTabCodes.length; i++) {
            TextView textView = getTextView(context, i, c3);
            textView.setOnClickListener(new a(i));
            linearLayout.addView(textView);
            this.mTabItems[i] = textView;
        }
        TextView textView2 = getTextView(context, 0, c3);
        this.mAllTabsCover = textView2;
        textView2.setAlpha(1.0f);
        this.mAllTabsCover.setBackgroundColor(-1);
        this.mAllTabsCover.setPadding(this.mTabsLayoutPadding + c3, 0, c3, 0);
        this.mAllTabsCover.setOnClickListener(new b());
        frameLayout.addView(linearLayout);
        frameLayout.addView(this.mAllTabsCover);
        addView(frameLayout);
        this.mFirstTabLeftPosition = this.mTabsLayoutPadding + c3;
    }

    public static /* synthetic */ Object ipc$super(TBOrderListTabLayout tBOrderListTabLayout, String str, Object... objArr) {
        if (str.hashCode() == 1004220751) {
            super.onScrollChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/bundle/widget/TBOrderListTabLayout");
    }

    private void onTabClicked(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99489beb", new Object[]{this, new Integer(i)});
            return;
        }
        updateSelectedTab(i);
        scrollToCenter(i);
        ((UltronListProxy.a) this.mOnTabClickListener).a(this.mTabCodesKey.get(i));
    }

    private void scrollToCenter(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b13cecdf", new Object[]{this, new Integer(i)});
            return;
        }
        TextView textView = this.mTabItems[i];
        smoothScrollTo(((textView.getLeft() - (pb6.s(getContext()) / 2)) + (textView.getWidth() / 2)) - (this.mTabsLayoutPadding / 2), 0);
    }

    private void updateSelectedTab(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd0c8b8b", new Object[]{this, new Integer(i)});
        } else if (i >= 0 && i < this.mTabItems.length) {
            if (i != 0) {
                this.mAllTabsCover.setTextColor(-11509638);
                this.mAllTabsCover.setTypeface(Typeface.DEFAULT);
                this.mAllTabsCover.setTextSize(0, this.mTextSize);
            } else {
                this.mAllTabsCover.setTextColor(-15656659);
                this.mAllTabsCover.setTypeface(Typeface.DEFAULT_BOLD);
                this.mAllTabsCover.setTextSize(0, this.mSelectedTextSize);
            }
            this.mTabItems[this.mSelectedIndex].setTextColor(-11509638);
            this.mTabItems[this.mSelectedIndex].setTypeface(Typeface.DEFAULT);
            this.mTabItems[this.mSelectedIndex].setTextSize(0, this.mTextSize);
            this.mTabItems[i].setTextColor(-15656659);
            this.mTabItems[i].setTypeface(Typeface.DEFAULT_BOLD);
            this.mTabItems[i].setTextSize(0, this.mSelectedTextSize);
            this.mSelectedIndex = i;
        }
    }

    @Override // android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bdb314f", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onScrollChanged(i, i2, i3, i4);
        this.mAllTabsCover.setTranslationX(getScrollX());
    }

    @Override // tb.qrr
    public void onTabUpdate(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1759cd1d", new Object[]{this, new Integer(i)});
            return;
        }
        updateSelectedTab(i);
        scrollToCenter(i);
    }

    @Override // tb.qrr
    public void registerOnTabClickListener(qrr.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aaf52c8b", new Object[]{this, aVar});
        } else {
            this.mOnTabClickListener = aVar;
        }
    }

    public void setInitialSelectedTab(String str, Context context) {
        int indexOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6517e63f", new Object[]{this, str, context});
        } else if (this.mTabCodesKey.contains(str) && (indexOf = this.mTabCodesKey.indexOf(str)) >= 0 && indexOf < this.mTabCodes.length) {
            updateSelectedTab(indexOf);
            post(new c(indexOf));
        }
    }

    public TBOrderListTabLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        initView(context);
    }

    public TBOrderListTabLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        initView(context);
    }
}
