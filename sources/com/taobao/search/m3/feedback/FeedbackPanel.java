package com.taobao.search.m3.feedback;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.search.m3.feedback.FeedbackPanel;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.ArrayList;
import tb.a07;
import tb.ckf;
import tb.o1p;
import tb.t2o;
import tb.tqk;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class FeedbackPanel extends ViewGroup {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String closeBtn2024 = "https://gw.alicdn.com/imgextra/i1/O1CN01PdFu2f1NSePmOe6p4_!!6000000001569-2-tps-60-60.png";
    private static final String closeBtnNor2024 = "https://gw.alicdn.com/tfs/TB1L6fbDUH1gK0jSZSyXXXtlpXa-40-42.png";
    private ArrayList<FeedbackButton> buttonList = new ArrayList<>();
    private final TUrlImageView closeButton;
    private boolean showLongPic;
    private final SimilarButton similarBtn;
    private final boolean waterfall;
    public static final a Companion = new a(null);
    private static final int wfHorizontalMargin = o1p.a(8.0f);
    private static final int wfBtnHeight = o1p.a(35.0f);
    private static final int wfSimilarHeight = o1p.a(47.0f);
    private static final int wfBtnVerticalMargin = o1p.a(8.0f);
    private static final int wfBtnSimilarMargin = o1p.a(8.0f);
    private static final int wfPaddingBottom = o1p.a(8.0f);
    private static final int closeBtnSize = o1p.a(15.0f);
    private static final int closeBtnMarginTop = o1p.a(8.0f);
    private static final int closeBtnMarginRight = o1p.a(12.0f);
    private static final int listPaddingLeft = o1p.a(8.0f);
    private static final int listPaddingRight = o1p.a(31.0f);
    private static final int btnHorizontalMargin = o1p.a(8.0f);
    private static final int btnVerticalMargin = o1p.a(8.0f);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {
        static {
            t2o.a(815792354);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(815792353);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedbackPanel(Context context, boolean z) {
        super(context);
        ckf.g(context, "context");
        this.waterfall = z;
        this.similarBtn = new SimilarButton(context, z);
        TUrlImageView tUrlImageView = new TUrlImageView(context);
        this.closeButton = tUrlImageView;
        int i = closeBtnSize;
        tUrlImageView.setLayoutParams(new ViewGroup.LayoutParams(i, i));
    }

    public static /* synthetic */ Object ipc$super(FeedbackPanel feedbackPanel, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/m3/feedback/FeedbackPanel");
    }

    private final void layoutList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e74b6f", new Object[]{this});
            return;
        }
        float ceil = (float) Math.ceil((this.buttonList.size() + 1) / 2.0f);
        int height = (int) ((getHeight() - ((wfBtnHeight * ceil) + ((ceil - 1) * btnVerticalMargin))) / 2);
        int i = listPaddingLeft;
        int childCount = getChildCount();
        int i2 = 0;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt != this.closeButton) {
                childAt.layout(i, height, childAt.getMeasuredWidth() + i, childAt.getMeasuredHeight() + height);
                i += childAt.getMeasuredWidth() + btnHorizontalMargin;
                i2++;
                if (i2 == 2) {
                    i = listPaddingLeft;
                    height += wfBtnHeight + btnVerticalMargin;
                    i2 = 0;
                }
            }
        }
    }

    private final void layoutWaterfall() {
        int i;
        int i2;
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9caa0d8f", new Object[]{this});
            return;
        }
        int childCount = getChildCount();
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt != this.closeButton) {
                i4 += childAt.getMeasuredHeight();
                if (i5 > 0) {
                    if (childAt instanceof FeedbackButton) {
                        i3 = wfBtnVerticalMargin;
                    } else {
                        i3 = wfBtnSimilarMargin;
                    }
                    i4 += i3;
                }
                i5++;
            }
        }
        if (this.showLongPic) {
            i = (getHeight() - i4) / 2;
        } else {
            i = (getHeight() - i4) - wfPaddingBottom;
        }
        int childCount2 = getChildCount();
        int i7 = i;
        int i8 = 0;
        for (int i9 = 0; i9 < childCount2; i9++) {
            View childAt2 = getChildAt(i9);
            if (childAt2 != this.closeButton) {
                if (i8 > 0) {
                    if (childAt2 instanceof FeedbackButton) {
                        i2 = wfBtnVerticalMargin;
                    } else {
                        i2 = wfBtnSimilarMargin;
                    }
                    i7 += i2;
                }
                int i10 = wfHorizontalMargin;
                childAt2.layout(i10, i7, childAt2.getMeasuredWidth() + i10, childAt2.getMeasuredHeight() + i7);
                i7 = childAt2.getBottom();
                i8++;
            }
        }
    }

    private final void measureList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db9681a3", new Object[]{this});
            return;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec((((getMeasuredWidth() - listPaddingLeft) - listPaddingRight) - btnHorizontalMargin) / 2, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(wfBtnHeight, 1073741824);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt != this.closeButton) {
                childAt.measure(makeMeasureSpec, makeMeasureSpec2);
            }
        }
    }

    private final void measureWaterfall() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8c897db", new Object[]{this});
            return;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth() - (wfHorizontalMargin * 2), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(wfBtnHeight, 1073741824);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt != this.closeButton) {
                if (childAt instanceof FeedbackButton) {
                    ((FeedbackButton) childAt).measure(makeMeasureSpec, makeMeasureSpec2);
                } else {
                    childAt.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(wfSimilarHeight, 1073741824));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void update$lambda$1(tqk tqkVar, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a036c2a", new Object[]{tqkVar, view});
            return;
        }
        ckf.g(tqkVar, "$listener");
        tqkVar.O("zszxs_feedback");
    }

    public final TUrlImageView getCloseButton() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TUrlImageView) ipChange.ipc$dispatch("88e80381", new Object[]{this});
        }
        return this.closeButton;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        if (this.waterfall) {
            layoutWaterfall();
        } else {
            layoutList();
        }
        TUrlImageView tUrlImageView = this.closeButton;
        int width = getWidth() - this.closeButton.getMeasuredWidth();
        int i5 = closeBtnMarginRight;
        int i6 = closeBtnMarginTop;
        tUrlImageView.layout(width - i5, i6, getWidth() - i5, this.closeButton.getMeasuredHeight() + i6);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        if (this.waterfall) {
            measureWaterfall();
        } else {
            measureList();
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(closeBtnSize, 1073741824);
        this.closeButton.measure(makeMeasureSpec, makeMeasureSpec);
    }

    public final void update(JSONArray jSONArray, String str, final tqk tqkVar, float f, boolean z, boolean z2) {
        String str2;
        FeedbackButton feedbackButton;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f27d8f44", new Object[]{this, jSONArray, str, tqkVar, new Float(f), new Boolean(z), new Boolean(z2)});
            return;
        }
        ckf.g(jSONArray, "actions");
        ckf.g(tqkVar, DataReceiveMonitor.CB_LISTENER);
        removeAllViews();
        this.showLongPic = z2;
        TUrlImageView tUrlImageView = this.closeButton;
        if (z) {
            str2 = closeBtn2024;
        } else {
            str2 = closeBtnNor2024;
        }
        tUrlImageView.setImageUrl(str2);
        ArrayList<FeedbackButton> arrayList = new ArrayList<>(jSONArray.size());
        int size = jSONArray.size();
        for (int i = 0; i < size; i++) {
            final JSONObject jSONObject = jSONArray.getJSONObject(i);
            if (i < this.buttonList.size()) {
                feedbackButton = this.buttonList.get(i);
            } else {
                feedbackButton = new FeedbackButton(getContext());
            }
            ckf.d(feedbackButton);
            arrayList.add(feedbackButton);
            addView(feedbackButton);
            ckf.d(jSONObject);
            feedbackButton.update(jSONObject, f);
            feedbackButton.setOnClickListener(new View.OnClickListener() { // from class: tb.q6z
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FeedbackPanel.update$lambda$0(tqk.this, jSONObject, view);
                }
            });
        }
        this.buttonList.clear();
        this.buttonList = arrayList;
        this.similarBtn.update(str, f, z);
        this.similarBtn.setOnClickListener(new View.OnClickListener() { // from class: tb.r6z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FeedbackPanel.update$lambda$1(tqk.this, view);
            }
        });
        addView(this.similarBtn);
        if (this.waterfall) {
            this.similarBtn.startEnterAnim();
        }
        addView(this.closeButton);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void update$lambda$0(tqk tqkVar, JSONObject jSONObject, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5d825ab", new Object[]{tqkVar, jSONObject, view});
            return;
        }
        ckf.g(tqkVar, "$listener");
        tqkVar.X(jSONObject.getJSONObject("param"), jSONObject.getJSONObject("coverInfo"), true);
    }
}
