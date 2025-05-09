package com.taobao.android.detail.ttdetail.widget.desc.picgallery;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.b5m;
import tb.mr7;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class IndexView extends TextView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int mIndexHeight;
    private RectF mIndexRect;
    private int mIndexWidth;
    private Drawable mSelectedIndexDrawable;
    private Drawable mUnselectedIndexDrawable;
    public static int MAX_DOT_NUM = 6;
    private static final int DEFAULT_INDEX_WIDTH = mr7.a(8.0f);
    private static final int DEFAULT_INDEX_HEIGHT = mr7.a(8.0f);
    private static final int DEFAULT_INDEX_MARGIN = mr7.a(8.0f);
    private int mSelectedIndex = 0;
    private int mTotalCount = 0;
    private int mSelectedIndexResId = R.drawable.tt_detail_index_dot_selected;
    private int mUnselectedIndexResId = R.drawable.tt_detail_index_dot_normal;
    private int mIndexMargin = DEFAULT_INDEX_MARGIN;
    private int mIndexBottomMargin = 0;

    static {
        t2o.a(912263000);
    }

    public IndexView(Context context) {
        super(context);
        int i = DEFAULT_INDEX_WIDTH;
        this.mIndexWidth = i;
        int i2 = DEFAULT_INDEX_HEIGHT;
        this.mIndexHeight = i2;
        this.mIndexRect = new RectF(0.0f, 0.0f, i, i2);
        init(context);
    }

    private void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
            return;
        }
        Resources resources = context.getResources();
        int i = this.mSelectedIndexResId;
        if (i > 0) {
            this.mSelectedIndexDrawable = resources.getDrawable(i);
        }
        int i2 = this.mUnselectedIndexResId;
        if (i2 > 0) {
            this.mUnselectedIndexDrawable = resources.getDrawable(i2);
        }
        setTextColor(getResources().getColor(R.color.tt_detail_ff));
        setTextSize(1, 10.0f);
    }

    public static /* synthetic */ Object ipc$super(IndexView indexView, String str, Object... objArr) {
        if (str.hashCode() == -1117127205) {
            super.onDraw((Canvas) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/widget/desc/picgallery/IndexView");
    }

    private void updateIndexLayout() {
        int i;
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad83351a", new Object[]{this});
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-2, -2);
        }
        int i3 = this.mTotalCount;
        if (i3 <= MAX_DOT_NUM) {
            if (i3 == 0) {
                i = 0;
            } else {
                i = (this.mIndexWidth * i3) + ((i3 - 1) * this.mIndexMargin);
            }
            layoutParams.width = i;
            if (i3 != 0) {
                i2 = this.mIndexHeight;
            }
            layoutParams.height = i2 + this.mIndexBottomMargin;
        } else {
            layoutParams.height = -2;
            layoutParams.width = -2;
        }
        setLayoutParams(layoutParams);
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        this.mIndexRect = null;
        this.mSelectedIndexDrawable = null;
        this.mUnselectedIndexDrawable = null;
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        Drawable drawable;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        super.onDraw(canvas);
        int i = this.mTotalCount;
        if (i > 1 && i <= MAX_DOT_NUM && this.mSelectedIndexDrawable != null && this.mUnselectedIndexDrawable != null) {
            int i2 = this.mIndexWidth + this.mIndexMargin;
            for (int i3 = 0; i3 < this.mTotalCount; i3++) {
                try {
                    this.mIndexRect.offsetTo(i3 * i2, 0.0f);
                    if (i3 == this.mSelectedIndex) {
                        drawable = this.mSelectedIndexDrawable;
                    } else {
                        drawable = this.mUnselectedIndexDrawable;
                    }
                    RectF rectF = this.mIndexRect;
                    drawable.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                    drawable.draw(canvas);
                } catch (Exception unused) {
                    return;
                }
            }
        }
    }

    public void setBottomMargin(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ade7f01", new Object[]{this, new Integer(i)});
        } else {
            this.mIndexBottomMargin = i;
        }
    }

    public void setIndexHeight(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f96b2e5", new Object[]{this, new Integer(i)});
        } else if (i > 0) {
            this.mIndexHeight = i;
            this.mIndexRect.bottom = i;
            updateIndexLayout();
        }
    }

    public void setIndexMargin(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7f97abe", new Object[]{this, new Integer(i)});
        } else if (i >= 0) {
            this.mIndexMargin = i;
            updateIndexLayout();
        }
    }

    public void setIndexWidth(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("185f0f06", new Object[]{this, new Integer(i)});
        } else if (i > 0) {
            this.mIndexWidth = i;
            this.mIndexRect.right = i;
            updateIndexLayout();
        }
    }

    public void setSelectedIndex(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a74476c7", new Object[]{this, new Integer(i)});
            return;
        }
        this.mSelectedIndex = i;
        if (i < 0) {
            this.mSelectedIndex = 0;
            setVisibility(8);
            return;
        }
        int i2 = this.mTotalCount;
        if (i > i2 - 1) {
            this.mSelectedIndex = i2 - 1;
            setVisibility(8);
        } else if (i2 > MAX_DOT_NUM) {
            setBackgroundResource(R.drawable.tt_detail_image_viewer_index_bg);
            setText((this.mSelectedIndex + 1) + "/" + this.mTotalCount);
        } else {
            setText("");
            setBackgroundDrawable(null);
        }
    }

    public void setSelectedIndexDrawable(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f483dc9", new Object[]{this, new Integer(i)});
        } else if (i > 0) {
            this.mSelectedIndexResId = i;
            this.mSelectedIndexDrawable = b5m.z().a().getResources().getDrawable(this.mSelectedIndexResId);
        }
    }

    public void setTotalCount(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6425d4f", new Object[]{this, new Integer(i)});
            return;
        }
        if (i <= 0) {
            i = 0;
        }
        this.mTotalCount = i;
        updateIndexLayout();
    }

    public void setUnselectedIndexDrawable(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d77d56a2", new Object[]{this, new Integer(i)});
        } else if (i > 0) {
            this.mUnselectedIndexResId = i;
            this.mUnselectedIndexDrawable = b5m.z().a().getResources().getDrawable(this.mUnselectedIndexResId);
        }
    }

    public IndexView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i = DEFAULT_INDEX_WIDTH;
        this.mIndexWidth = i;
        int i2 = DEFAULT_INDEX_HEIGHT;
        this.mIndexHeight = i2;
        this.mIndexRect = new RectF(0.0f, 0.0f, i, i2);
        init(context);
    }

    public IndexView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int i2 = DEFAULT_INDEX_WIDTH;
        this.mIndexWidth = i2;
        int i3 = DEFAULT_INDEX_HEIGHT;
        this.mIndexHeight = i3;
        this.mIndexRect = new RectF(0.0f, 0.0f, i2, i3);
        init(context);
    }
}
