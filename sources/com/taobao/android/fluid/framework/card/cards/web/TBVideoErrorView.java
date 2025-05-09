package com.taobao.android.fluid.framework.card.cards.web;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class TBVideoErrorView extends LinearLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private TextView tvSubtitle;
    private TextView tvTitle;
    private View vErrorAction;

    static {
        t2o.a(468714104);
    }

    public TBVideoErrorView(Context context) {
        super(context);
        initView(context);
    }

    private void initView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f359fd6c", new Object[]{this, context});
            return;
        }
        View inflate = LayoutInflater.from(context).inflate(R.layout.fluid_sdk_layout_tbvideo_error, this);
        this.tvTitle = (TextView) inflate.findViewById(R.id.tv_error_title);
        this.tvSubtitle = (TextView) inflate.findViewById(R.id.tv_error_subtitle);
        this.vErrorAction = inflate.findViewById(R.id.v_error_action);
        setClickable(true);
        setGravity(17);
        setOrientation(1);
    }

    public static /* synthetic */ Object ipc$super(TBVideoErrorView tBVideoErrorView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/framework/card/cards/web/TBVideoErrorView");
    }

    public void setActionVisibility(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("305d0332", new Object[]{this, new Integer(i)});
            return;
        }
        View view = this.vErrorAction;
        if (view != null) {
            view.setVisibility(i);
        }
    }

    public void setErrorAction(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1dcee36", new Object[]{this, onClickListener});
            return;
        }
        View view = this.vErrorAction;
        if (view != null) {
            ViewProxy.setOnClickListener(view, onClickListener);
        }
    }

    public void setSubTitleVisibility(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("402671b0", new Object[]{this, new Integer(i)});
            return;
        }
        TextView textView = this.tvSubtitle;
        if (textView != null) {
            textView.setVisibility(i);
        }
    }

    public void setSubtitle(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13c7d5ab", new Object[]{this, str});
            return;
        }
        TextView textView = this.tvSubtitle;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void setTitle(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c820927", new Object[]{this, str});
            return;
        }
        TextView textView = this.tvTitle;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public TBVideoErrorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        initView(context);
    }

    public TBVideoErrorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        initView(context);
    }
}
