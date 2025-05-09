package com.taobao.android.promotion.content;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.motion.widget.Key;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.recycler.loadmore.DXAbsOnLoadMoreView;
import com.taobao.taobao.R;
import tb.s0m;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class DXContentLoadMoreView extends DXAbsOnLoadMoreView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String iconUrl = "https://gw.alicdn.com/imgextra/i4/O1CN01kBqOxq1fNl95fpJWn_!!6000000003995-2-tps-72-72.png";
    private ImageView mLoadMoreIcon;
    private TextView mLoadMoreText;
    private View mLoadMoreView;
    private ObjectAnimator mRotation;

    static {
        t2o.a(629145624);
    }

    public DXContentLoadMoreView(Context context) {
        super(context);
        init(context);
    }

    private void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
            return;
        }
        View inflate = View.inflate(context, R.layout.tt_detail_content_load_more, this);
        this.mLoadMoreView = inflate;
        this.mLoadMoreIcon = (ImageView) inflate.findViewById(R.id.detail_content_load_more_icon);
        this.mLoadMoreText = (TextView) this.mLoadMoreView.findViewById(R.id.detail_content_load_more_text);
        s0m.B().T(this.iconUrl).into(this.mLoadMoreIcon);
        ObjectAnimator animatorInit = animatorInit(this.mLoadMoreIcon);
        this.mRotation = animatorInit;
        animatorInit.start();
    }

    public static /* synthetic */ Object ipc$super(DXContentLoadMoreView dXContentLoadMoreView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/promotion/content/DXContentLoadMoreView");
    }

    @Override // com.taobao.android.dinamicx.widget.recycler.loadmore.DXAbsOnLoadMoreView
    public void onLoadMoreStatusUpdate(int i, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49b6d829", new Object[]{this, new Integer(i), jSONObject});
            return;
        }
        switch (i) {
            case 1:
            case 3:
            case 4:
            case 6:
                this.mLoadMoreIcon.setVisibility(8);
                this.mLoadMoreText.setVisibility(8);
                return;
            case 2:
                this.mLoadMoreIcon.setVisibility(0);
                this.mLoadMoreText.setVisibility(8);
                return;
            case 5:
                this.mLoadMoreIcon.setVisibility(8);
                this.mLoadMoreText.setVisibility(0);
                return;
            default:
                return;
        }
    }

    private ObjectAnimator animatorInit(ImageView imageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ObjectAnimator) ipChange.ipc$dispatch("b12e1f5c", new Object[]{this, imageView});
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView, Key.ROTATION, 0.0f, 360.0f);
        ofFloat.setDuration(1000L);
        ofFloat.setRepeatCount(-1);
        ofFloat.setInterpolator(new LinearInterpolator());
        return ofFloat;
    }

    public DXContentLoadMoreView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context);
    }

    public DXContentLoadMoreView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context);
    }
}
