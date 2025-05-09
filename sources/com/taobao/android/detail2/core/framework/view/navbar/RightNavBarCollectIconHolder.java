package com.taobao.android.detail2.core.framework.view.navbar;

import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.view.navbar.a;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TIconFontTextView;
import tb.cxj;
import tb.dh7;
import tb.seo;
import tb.sqj;
import tb.t2o;
import tb.ue7;
import tb.x3w;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class RightNavBarCollectIconHolder extends RightNavBarIconHolder {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final TIconFontTextView d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements a.e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c75bbd0b", new Object[]{this, new Boolean(z)});
                return;
            }
            RightNavBarCollectIconHolder rightNavBarCollectIconHolder = RightNavBarCollectIconHolder.this;
            rightNavBarCollectIconHolder.e0(rightNavBarCollectIconHolder.c);
        }
    }

    static {
        t2o.a(352322088);
    }

    public RightNavBarCollectIconHolder(View view, dh7 dh7Var, cxj cxjVar) {
        super(view, dh7Var, cxjVar);
        TIconFontTextView tIconFontTextView = (TIconFontTextView) view.findViewById(R.id.nav_icon);
        this.d = tIconFontTextView;
        g0();
        sqj.b(tIconFontTextView, sqj.COLLECT_BUTTON);
    }

    public static RightNavBarIconHolder f0(ViewGroup viewGroup, dh7 dh7Var, cxj cxjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RightNavBarIconHolder) ipChange.ipc$dispatch("edfab863", new Object[]{viewGroup, dh7Var, cxjVar});
        }
        return new RightNavBarCollectIconHolder(RightNavBarIconHolder.b0(viewGroup.getContext(), viewGroup), dh7Var, cxjVar);
    }

    public static /* synthetic */ Object ipc$super(RightNavBarCollectIconHolder rightNavBarCollectIconHolder, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail2/core/framework/view/navbar/RightNavBarCollectIconHolder");
    }

    @Override // com.taobao.android.detail2.core.framework.view.navbar.RightNavBarIconHolder
    public void c0(seo seoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45b1c4ea", new Object[]{this, seoVar});
            return;
        }
        this.d.setText(seoVar.h());
        this.d.setTextColor(seoVar.g());
    }

    public final void g0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a55b981", new Object[]{this});
            return;
        }
        x3w b = this.c.b();
        if (b instanceof ue7) {
            com.taobao.android.detail2.core.framework.view.navbar.a aVar = new com.taobao.android.detail2.core.framework.view.navbar.a(this.f7194a, this.b, (ue7) b, this.d, this.c.e(), -16777216);
            if (aVar.j()) {
                aVar.p(new a());
            }
        }
    }
}
