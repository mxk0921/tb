package com.taobao.android.detail.ttdetail.widget.desc;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.taobao.R;
import kotlin.Metadata;
import tb.ckf;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\"B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0005\u0010\tB#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0005\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000e\u0010\u0006J\u0017\u0010\u0011\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\r¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010 \u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006#"}, d2 = {"Lcom/taobao/android/detail/ttdetail/widget/desc/TTDetailErrorView;", "Landroid/widget/RelativeLayout;", "Landroid/view/View$OnClickListener;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Ltb/xhv;", "init", "Lcom/taobao/android/detail/ttdetail/widget/desc/TTDetailErrorView$a;", DataReceiveMonitor.CB_LISTENER, "setOnReloadButtonClickListener", "(Lcom/taobao/android/detail/ttdetail/widget/desc/TTDetailErrorView$a;)Lcom/taobao/android/detail/ttdetail/widget/desc/TTDetailErrorView;", "loadEmpty", "()V", "Landroid/view/View;", "v", "onClick", "(Landroid/view/View;)V", "Landroid/widget/TextView;", "mErrorTitleView", "Landroid/widget/TextView;", "mErrorTipView", "Landroid/widget/LinearLayout;", "mLinearLayout", "Landroid/widget/LinearLayout;", "mListener", "Lcom/taobao/android/detail/ttdetail/widget/desc/TTDetailErrorView$a;", "a", "tt-detail_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class TTDetailErrorView extends RelativeLayout implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private TextView mErrorTipView;
    private TextView mErrorTitleView;
    private LinearLayout mLinearLayout;
    private a mListener;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface a {
        void b(View view);
    }

    static {
        t2o.a(912262964);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TTDetailErrorView(Context context) {
        super(context);
        ckf.h(context, "context");
        init(context);
    }

    private final void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
            return;
        }
        LayoutInflater.from(context).inflate(R.layout.tt_detail_desc_error_view, (ViewGroup) this, true);
        this.mErrorTitleView = (TextView) findViewById(R.id.tt_detail_errorview_title);
        this.mErrorTipView = (TextView) findViewById(R.id.tt_detail_errorview_tip);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.tt_detail_reload_linear);
        this.mLinearLayout = linearLayout;
        if (linearLayout != null) {
            linearLayout.setOnClickListener(this);
        }
    }

    public static /* synthetic */ Object ipc$super(TTDetailErrorView tTDetailErrorView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/widget/desc/TTDetailErrorView");
    }

    public final void loadEmpty() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef62190e", new Object[]{this});
            return;
        }
        TextView textView = this.mErrorTitleView;
        if (textView != null) {
            textView.setText(R.string.tt_detail_desc_empty_title);
        }
        TextView textView2 = this.mErrorTipView;
        if (textView2 != null) {
            textView2.setText(R.string.tt_detail_desc_empty_tip);
        }
        LinearLayout linearLayout = this.mLinearLayout;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        ckf.h(view, "v");
        a aVar = this.mListener;
        if (aVar != null) {
            aVar.b(view);
        }
    }

    public final TTDetailErrorView setOnReloadButtonClickListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TTDetailErrorView) ipChange.ipc$dispatch("5e069d8f", new Object[]{this, aVar});
        }
        this.mListener = aVar;
        return this;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TTDetailErrorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ckf.h(context, "context");
        init(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TTDetailErrorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ckf.h(context, "context");
        init(context);
    }
}
