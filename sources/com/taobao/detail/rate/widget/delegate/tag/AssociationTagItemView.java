package com.taobao.detail.rate.widget.delegate.tag;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.detail.rate.widget.delegate.tag.bean.AssociationTagItem;
import tb.dx1;
import tb.hyd;
import tb.k25;
import tb.ouk;
import tb.zhn;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class AssociationTagItemView extends LinearLayout implements hyd {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private TextView mCountText;
    private int mIndex;
    private boolean mIsSelected;
    private AssociationTagItem mItemTag;
    private k25 mStyle;
    private TextView mTitleText;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ouk f10383a;

        public a(ouk oukVar) {
            this.f10383a = oukVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                this.f10383a.a(AssociationTagItemView.this.getIndex(), AssociationTagItemView.access$000(AssociationTagItemView.this));
            }
        }
    }

    public AssociationTagItemView(Context context) {
        super(context);
        initView();
    }

    public static /* synthetic */ AssociationTagItem access$000(AssociationTagItemView associationTagItemView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AssociationTagItem) ipChange.ipc$dispatch("5f85e4f1", new Object[]{associationTagItemView});
        }
        return associationTagItemView.mItemTag;
    }

    private void initView() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce529ddc", new Object[]{this});
            return;
        }
        setOrientation(0);
        TextView textView = new TextView(getContext());
        this.mTitleText = textView;
        textView.setGravity(17);
        TextView textView2 = new TextView(getContext());
        this.mCountText = textView2;
        textView2.setGravity(17);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        layoutParams.gravity = 17;
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -1);
        layoutParams2.gravity = 17;
        layoutParams2.leftMargin = zhn.j(3.86f);
        TextView textView3 = this.mCountText;
        int paddingLeft = textView3.getPaddingLeft();
        if (dx1.c()) {
            i = 5;
        } else {
            i = 2;
        }
        textView3.setPadding(paddingLeft, i, this.mCountText.getPaddingRight(), this.mCountText.getPaddingBottom());
        addView(this.mTitleText, layoutParams);
        addView(this.mCountText, layoutParams2);
    }

    public static /* synthetic */ Object ipc$super(AssociationTagItemView associationTagItemView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/detail/rate/widget/delegate/tag/AssociationTagItemView");
    }

    private void refreshViewState(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c8fbd7c", new Object[]{this, new Boolean(z)});
            return;
        }
        this.mStyle.c(this.mTitleText, getIndex(), z);
        this.mStyle.d(this.mCountText, getIndex(), z);
        GradientDrawable b = this.mStyle.b(z);
        if (b != null) {
            setBackgroundDrawable(b);
        }
    }

    private void settingTextView(TextView textView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f40e405", new Object[]{this, textView, str});
        } else if (TextUtils.isEmpty(str)) {
            textView.setVisibility(8);
        } else {
            textView.setText(str);
        }
    }

    public void bindData(k25 k25Var, AssociationTagItem associationTagItem, int i, ouk<AssociationTagItem> oukVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8e89341", new Object[]{this, k25Var, associationTagItem, new Integer(i), oukVar});
            return;
        }
        this.mStyle = k25Var;
        this.mItemTag = associationTagItem;
        setIndex(i);
        settingTextView(this.mTitleText, associationTagItem.title);
        settingTextView(this.mCountText, associationTagItem.fuzzyCount);
        this.mStyle.a(this);
        refreshViewState(false);
        setOnClickListener(new a(oukVar));
    }

    public int getIndex() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cf396596", new Object[]{this})).intValue();
        }
        return this.mIndex;
    }

    public boolean isSelectedStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b46e2742", new Object[]{this})).booleanValue();
        }
        return this.mIsSelected;
    }

    public void setIndex(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46180fcc", new Object[]{this, new Integer(i)});
        } else {
            this.mIndex = i;
        }
    }

    @Override // tb.hyd
    public void setSelectedStatus(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fca8491e", new Object[]{this, new Boolean(z)});
        } else if (z != this.mIsSelected) {
            this.mIsSelected = z;
            refreshViewState(z);
        }
    }

    public AssociationTagItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        initView();
    }

    public AssociationTagItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        initView();
    }
}
