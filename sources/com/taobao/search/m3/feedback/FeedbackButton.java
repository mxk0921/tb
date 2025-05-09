package com.taobao.search.m3.feedback;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Outline;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import tb.a07;
import tb.ckf;
import tb.o1p;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class FeedbackButton extends LinearLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int bgColor = -1;
    private static final float textSize = 14.0f;
    private final TUrlImageView img;
    private Float radius;
    private final TextView text;
    public static final b Companion = new b(null);
    private static final int imgSize = o1p.a(18.0f);
    private static final int imgMargin = o1p.a(6.0f);
    private static final int padding = o1p.a(9.0f);
    private static final int textColor = Color.parseColor("#333333");

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a extends ViewOutlineProvider {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/m3/feedback/FeedbackButton$2");
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            float height;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7054f590", new Object[]{this, view, outline});
                return;
            }
            ckf.g(view, "view");
            ckf.g(outline, "outline");
            Float access$getRadius$p = FeedbackButton.access$getRadius$p(FeedbackButton.this);
            if (access$getRadius$p != null) {
                height = access$getRadius$p.floatValue();
            } else {
                height = view.getHeight() / 2.0f;
            }
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), height);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class b {
        static {
            t2o.a(815792349);
        }

        public /* synthetic */ b(a07 a07Var) {
            this();
        }

        public b() {
        }
    }

    static {
        t2o.a(815792347);
    }

    public FeedbackButton(Context context) {
        super(context);
        TUrlImageView tUrlImageView = new TUrlImageView(context);
        this.img = tUrlImageView;
        TextView textView = new TextView(context);
        this.text = textView;
        setOrientation(0);
        setGravity(16);
        int i = imgSize;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i, i);
        layoutParams.rightMargin = imgMargin;
        layoutParams.leftMargin = padding;
        addView(tUrlImageView, layoutParams);
        addView(textView, new LinearLayout.LayoutParams(-2, -2));
        textView.setTextSize(1, textSize);
        textView.setTextColor(textColor);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        setBackgroundColor(-1);
        setClipToOutline(true);
        setOutlineProvider(new a());
    }

    public static final /* synthetic */ Float access$getRadius$p(FeedbackButton feedbackButton) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Float) ipChange.ipc$dispatch("2b6b5b47", new Object[]{feedbackButton});
        }
        return feedbackButton.radius;
    }

    public static /* synthetic */ Object ipc$super(FeedbackButton feedbackButton, String str, Object... objArr) {
        if (str.hashCode() == 650865254) {
            super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/m3/feedback/FeedbackButton");
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.text.setMaxWidth(((View.MeasureSpec.getSize(i) - (padding * 2)) - imgMargin) - imgSize);
        super.onMeasure(i, i2);
    }

    public final void update(JSONObject jSONObject, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76f387a0", new Object[]{this, jSONObject, new Float(f)});
            return;
        }
        ckf.g(jSONObject, "data");
        this.radius = Float.valueOf(f);
        this.img.setImageUrl(jSONObject.getString("icon"));
        this.text.setText(jSONObject.getString("text"));
    }
}
