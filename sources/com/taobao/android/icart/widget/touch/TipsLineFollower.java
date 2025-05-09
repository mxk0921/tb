package com.taobao.android.icart.widget.touch;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.icart.widget.touch.DragFloatLayer;
import com.taobao.android.icart.widget.touch.tips.DragTips;
import com.taobao.taobao.R;
import tb.kmb;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class TipsLineFollower extends FrameLayout implements DragFloatLayer.f {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private kmb mCartPresenter;
    private final Context mContext;
    private final View mDownLine;
    private boolean mIsBlack;
    private boolean mIsFull;
    private Rect mLastChildRect;
    private Rect mLastDragRect;
    private a mOnShowInCardListener;
    private boolean mShowInCardUp = false;
    private String mText;
    private final TextView mTips;
    private final View mTipsLineLayout;
    private final View mUpLine;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface a {
    }

    static {
        t2o.a(478151160);
        t2o.a(478151153);
    }

    public TipsLineFollower(kmb kmbVar) {
        super(kmbVar.getContext());
        this.mCartPresenter = kmbVar;
        Activity context = kmbVar.getContext();
        this.mContext = context;
        View inflate = LayoutInflater.from(context).inflate(R.layout.icart_drag_tips_line, this);
        this.mTipsLineLayout = inflate;
        this.mUpLine = inflate.findViewById(R.id.up_line);
        this.mDownLine = inflate.findViewById(R.id.down_line);
        this.mTips = (TextView) inflate.findViewById(R.id.line_enter_tips);
        setVisibility(8);
    }

    public static /* synthetic */ Object ipc$super(TipsLineFollower tipsLineFollower, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/icart/widget/touch/TipsLineFollower");
    }

    private void move() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9b46fd8", new Object[]{this});
            return;
        }
        Rect rect = this.mLastDragRect;
        if (rect == null) {
            return;
        }
        if (this.mShowInCardUp) {
            setTranslationY(rect.top - this.mTipsLineLayout.getHeight());
        } else {
            setTranslationY(rect.bottom);
        }
    }

    private void render() {
        int i;
        Rect rect;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("471a0b1d", new Object[]{this});
            return;
        }
        Rect rect2 = this.mLastChildRect;
        if (rect2 == null || (rect = this.mLastDragRect) == null) {
            this.mShowInCardUp = false;
        } else {
            if (rect.top < rect2.top) {
                z = false;
            }
            this.mShowInCardUp = z;
        }
        move();
        if (TextUtils.isEmpty(this.mText)) {
            setVisibility(8);
        } else {
            setVisibility(0);
        }
        this.mTips.setText(this.mText);
        if (this.mIsFull) {
            i = 0;
        } else {
            i = this.mCartPresenter.e().d0(6.0f);
        }
        if (!this.mShowInCardUp) {
            this.mUpLine.setVisibility(0);
            this.mDownLine.setVisibility(8);
            if (this.mIsBlack) {
                this.mTips.setBackgroundResource(R.drawable.icart_drag_tips_line_down_dark);
            } else {
                this.mTips.setBackgroundResource(R.drawable.icart_drag_tips_line_down);
            }
        } else {
            this.mUpLine.setVisibility(8);
            this.mDownLine.setVisibility(0);
            if (this.mIsBlack) {
                this.mTips.setBackgroundResource(R.drawable.icart_drag_tips_line_up_dark);
            } else {
                this.mTips.setBackgroundResource(R.drawable.icart_drag_tips_line_up);
            }
        }
        if (this.mIsBlack) {
            this.mUpLine.setBackgroundColor(-5460820);
            this.mDownLine.setBackgroundColor(-5460820);
        } else {
            this.mUpLine.setBackgroundColor(-1152467);
            this.mDownLine.setBackgroundColor(-1152467);
        }
        if (this.mDownLine.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) this.mDownLine.getLayoutParams()).leftMargin = i;
            ((ViewGroup.MarginLayoutParams) this.mDownLine.getLayoutParams()).rightMargin = i;
            this.mDownLine.requestLayout();
        }
        if (this.mUpLine.getLayoutParams() != null) {
            ((ViewGroup.MarginLayoutParams) this.mUpLine.getLayoutParams()).leftMargin = i;
            ((ViewGroup.MarginLayoutParams) this.mUpLine.getLayoutParams()).rightMargin = i;
            this.mUpLine.requestLayout();
        }
    }

    public boolean isShowInCardUp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1a3980c2", new Object[]{this})).booleanValue();
        }
        return this.mShowInCardUp;
    }

    @Override // com.taobao.android.icart.widget.touch.DragFloatLayer.f
    public void onViewPositionChanged(Rect rect, Rect rect2, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe8ee8ce", new Object[]{this, rect, rect2, new Integer(i), new Integer(i2)});
            return;
        }
        this.mLastChildRect = rect;
        this.mLastDragRect = rect2;
        move();
        a aVar = this.mOnShowInCardListener;
        if (aVar != null) {
            ((DragTips.b) aVar).a(this.mShowInCardUp);
        }
    }

    public void setData(String str, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89f68ffd", new Object[]{this, str, new Boolean(z), new Boolean(z2)});
            return;
        }
        this.mIsBlack = z2;
        this.mIsFull = z;
        this.mText = str;
        render();
    }

    public void setShowInCardUp(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee73994e", new Object[]{this, aVar});
        } else {
            this.mOnShowInCardListener = aVar;
        }
    }
}
