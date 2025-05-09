package com.taobao.search.m3.feedback;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.m3.feedback.FeedbackCoverView;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import tb.a07;
import tb.hfn;
import tb.o1p;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class FeedbackCoverView extends ViewGroup {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final float descTextSize = 14.0f;
    private final TextView commonText;
    private final TextView desc;
    private final TUrlImageView img;
    public static final b Companion = new b(null);
    private static final int textMargin = o1p.a(4.5f);
    private static final int commonTextColor = Color.parseColor("#111111");
    private static final float commonTextSize = 15.0f;
    private static final int imgSize = o1p.a(commonTextSize);
    private static final int descTextColor = Color.parseColor("#111111");
    private static final int bgColor = Color.parseColor("#F2F2F2");

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class b {
        static {
            t2o.a(815792351);
        }

        public /* synthetic */ b(a07 a07Var) {
            this();
        }

        public b() {
        }
    }

    static {
        t2o.a(815792350);
    }

    public FeedbackCoverView(Context context) {
        super(context);
        TextView textView = new TextView(context);
        this.commonText = textView;
        TextView textView2 = new TextView(context);
        this.desc = textView2;
        TUrlImageView tUrlImageView = new TUrlImageView(context);
        this.img = tUrlImageView;
        addView(textView);
        int i = imgSize;
        addView(tUrlImageView, new ViewGroup.LayoutParams(i, i));
        addView(textView2);
        textView.setTextSize(1, commonTextSize);
        textView2.setTextSize(1, descTextSize);
        textView.setTextColor(commonTextColor);
        textView.getPaint().setFakeBoldText(true);
        textView2.setTextColor(descTextColor);
        setBackgroundColor(bgColor);
        setOnClickListener(new View.OnClickListener() { // from class: tb.p6z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FeedbackCoverView._init_$lambda$0(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcf964a4", new Object[]{view});
        }
    }

    public static /* synthetic */ Object ipc$super(FeedbackCoverView feedbackCoverView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/m3/feedback/FeedbackCoverView");
    }

    public final void bind(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94832922", new Object[]{this, str, str2, str3});
            return;
        }
        this.commonText.setText(str);
        this.img.setImageUrl(str2);
        this.desc.setText(str3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        int c = hfn.c(this.commonText.getMeasuredHeight(), this.img.getMeasuredHeight());
        int i5 = textMargin;
        int height = (getHeight() - ((c + i5) + this.desc.getMeasuredHeight())) >> 1;
        int c2 = hfn.c(this.commonText.getMeasuredHeight(), this.img.getMeasuredHeight());
        int width = (getWidth() - (this.commonText.getMeasuredWidth() + this.img.getMeasuredWidth())) >> 1;
        TextView textView = this.commonText;
        textView.layout(width, ((c2 - textView.getMeasuredHeight()) >> 1) + height, this.commonText.getMeasuredWidth() + width, ((this.commonText.getMeasuredHeight() + c2) >> 1) + height);
        this.img.layout(this.commonText.getMeasuredWidth() + width, ((c2 - this.img.getMeasuredHeight()) >> 1) + height, width + this.commonText.getMeasuredWidth() + this.img.getMeasuredWidth(), ((this.img.getMeasuredHeight() + c2) >> 1) + height);
        int i6 = height + c2 + i5;
        int width2 = (getWidth() - this.desc.getMeasuredWidth()) >> 1;
        TextView textView2 = this.desc;
        textView2.layout(width2, i6, textView2.getMeasuredWidth() + width2, this.desc.getMeasuredHeight() + i6);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.commonText.measure(makeMeasureSpec, makeMeasureSpec);
        ViewGroup.LayoutParams layoutParams = this.img.getLayoutParams();
        this.img.measure(View.MeasureSpec.makeMeasureSpec(layoutParams.width, 1073741824), View.MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824));
        this.desc.measure(makeMeasureSpec, makeMeasureSpec);
    }
}
