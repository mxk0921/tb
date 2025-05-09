package com.taobao.android.dinamicx.widget;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.component.DXWebView;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.d1a;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class DXWebViewWidgetNode$loadUrl$1 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ String $url;
    public final /* synthetic */ DXWebViewWidgetNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DXWebViewWidgetNode$loadUrl$1(DXWebViewWidgetNode dXWebViewWidgetNode, String str) {
        super(0);
        this.this$0 = dXWebViewWidgetNode;
        this.$url = str;
    }

    public static /* synthetic */ Object ipc$super(DXWebViewWidgetNode$loadUrl$1 dXWebViewWidgetNode$loadUrl$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/widget/DXWebViewWidgetNode$loadUrl$1");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
        } else if (TextUtils.isEmpty(this.$url)) {
            DXWebView x = DXWebViewWidgetNode.x(this.this$0, "loadUrl 1");
            if (x != null) {
                x.loadUrl(DXWebViewWidgetNode.v(this.this$0));
            }
        } else {
            DXWebView x2 = DXWebViewWidgetNode.x(this.this$0, "loadUrl 2");
            if (x2 != null) {
                x2.loadUrl(this.$url);
            }
            DXWebViewWidgetNode.y(this.this$0, this.$url);
        }
    }
}
