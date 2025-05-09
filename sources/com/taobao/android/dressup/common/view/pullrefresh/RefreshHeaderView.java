package com.taobao.android.dressup.common.view.pullrefresh;

import android.content.Context;
import android.graphics.Color;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import kotlin.Metadata;
import tb.at4;
import tb.ckf;
import tb.t2o;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\t\u001a\u00020\u0006J\u0006\u0010\n\u001a\u00020\bR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/taobao/android/dressup/common/view/pullrefresh/RefreshHeaderView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "iconView", "Lcom/taobao/uikit/extend/feature/view/TUrlImageView;", "statusText", "Landroid/widget/TextView;", "getIconImageView", "getStatusTextView", "turboflow_dressup_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class RefreshHeaderView extends LinearLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private TUrlImageView iconView;
    private TextView statusText;

    static {
        t2o.a(918552814);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RefreshHeaderView(Context context) {
        super(context);
        ckf.g(context, "context");
        setOrientation(1);
        setGravity(1);
        this.iconView = new TUrlImageView(context);
        TextView textView = new TextView(context);
        textView.setTextColor(Color.parseColor("#E6FFFFFF"));
        at4.a aVar = at4.Companion;
        textView.setTextSize(0, at4.a.c(aVar, context, 24, false, 4, null));
        textView.setSingleLine();
        textView.setGravity(1);
        xhv xhvVar = xhv.INSTANCE;
        this.statusText = textView;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(at4.a.c(aVar, context, 64, false, 4, null), at4.a.c(aVar, context, 64, false, 4, null));
        layoutParams.bottomMargin = at4.a.c(aVar, context, 8, false, 4, null);
        addView(this.iconView, layoutParams);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.bottomMargin = at4.a.c(aVar, context, 38, false, 4, null);
        addView(this.statusText, layoutParams2);
    }

    public static /* synthetic */ Object ipc$super(RefreshHeaderView refreshHeaderView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dressup/common/view/pullrefresh/RefreshHeaderView");
    }

    public final TUrlImageView getIconImageView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TUrlImageView) ipChange.ipc$dispatch("2299b284", new Object[]{this});
        }
        return this.iconView;
    }

    public final TextView getStatusTextView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("dc103175", new Object[]{this});
        }
        return this.statusText;
    }
}
