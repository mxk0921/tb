package com.alibaba.triver.triver_shop.newShop.view;

import android.view.View;
import android.widget.TextView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.d1a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class Tab3LiveContentRender$shopHeaderExtraView$2 extends Lambda implements d1a<View> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ Tab3LiveContentRender this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Tab3LiveContentRender$shopHeaderExtraView$2(Tab3LiveContentRender tab3LiveContentRender) {
        super(0);
        this.this$0 = tab3LiveContentRender;
    }

    public static /* synthetic */ Object ipc$super(Tab3LiveContentRender$shopHeaderExtraView$2 tab3LiveContentRender$shopHeaderExtraView$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/Tab3LiveContentRender$shopHeaderExtraView$2");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // tb.d1a
    public final View invoke() {
        Object obj;
        String obj2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("287bc381", new Object[]{this});
        }
        View inflate = View.inflate(Tab3LiveContentRender.q(this.this$0), R.layout.view_tab3_live_header_extra_layout, null);
        ((TUrlImageView) inflate.findViewById(R.id.shop_live_header_logo)).setImageUrl(Tab3LiveContentRender.w(this.this$0));
        TextView textView = (TextView) inflate.findViewById(R.id.shop_tab3_live_id);
        JSONObject i = Tab3LiveContentRender.x(this.this$0).i();
        String str = "";
        if (!(i == null || (obj = i.get("roomNum")) == null || (obj2 = obj.toString()) == null)) {
            str = obj2;
        }
        textView.setText(ckf.p("ID:", str));
        return inflate;
    }
}
