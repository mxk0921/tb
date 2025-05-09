package com.taobao.android.detail2.core.framework.view.navbar;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.view.navbar.RightNavBarGenericIconHolder;
import java.util.HashMap;
import tb.cxj;
import tb.dh7;
import tb.seo;
import tb.sqj;
import tb.t2o;
import tb.xq0;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class RightNavBarNormalIconHolder extends RightNavBarGenericIconHolder {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b extends RightNavBarGenericIconHolder.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(352322103);
        }

        public b() {
            super();
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail2/core/framework/view/navbar/RightNavBarNormalIconHolder$OnNormalItemClickListener");
        }

        @Override // com.taobao.android.detail2.core.framework.view.navbar.RightNavBarGenericIconHolder.b
        public void a(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4b7778ab", new Object[]{this, view});
                return;
            }
            seo seoVar = RightNavBarNormalIconHolder.this.c;
            if (seoVar != null && seoVar.f() != null) {
                String string = RightNavBarNormalIconHolder.this.c.f().getString("url");
                if (!TextUtils.isEmpty(string)) {
                    if (RightNavBarNormalIconHolder.this.c.b() != null) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("url", string);
                        RightNavBarNormalIconHolder.this.b.a0().d(RightNavBarNormalIconHolder.this.c.b().b, "NavigationCart", "", "", hashMap, RightNavBarNormalIconHolder.this.c.b());
                    }
                    xq0.c().a(RightNavBarNormalIconHolder.this.f7194a.i()).c(string);
                }
            }
        }
    }

    static {
        t2o.a(352322101);
    }

    public RightNavBarNormalIconHolder(View view, dh7 dh7Var, cxj cxjVar) {
        super(view, dh7Var, cxjVar);
    }

    public static /* synthetic */ Object ipc$super(RightNavBarNormalIconHolder rightNavBarNormalIconHolder, String str, Object... objArr) {
        if (str.hashCode() == 1169278186) {
            super.c0((seo) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail2/core/framework/view/navbar/RightNavBarNormalIconHolder");
    }

    public static RightNavBarIconHolder j0(ViewGroup viewGroup, dh7 dh7Var, cxj cxjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RightNavBarIconHolder) ipChange.ipc$dispatch("edfab863", new Object[]{viewGroup, dh7Var, cxjVar});
        }
        return new RightNavBarNormalIconHolder(RightNavBarGenericIconHolder.f0(viewGroup.getContext(), viewGroup), dh7Var, cxjVar);
    }

    @Override // com.taobao.android.detail2.core.framework.view.navbar.RightNavBarGenericIconHolder, com.taobao.android.detail2.core.framework.view.navbar.RightNavBarIconHolder
    public void c0(seo seoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45b1c4ea", new Object[]{this, seoVar});
            return;
        }
        super.c0(seoVar);
        seo seoVar2 = this.c;
        if (seoVar2 == null) {
            sqj.b(this.d, sqj.DEFAULT_BUTTON);
            sqj.b(this.e, sqj.DEFAULT_BUTTON);
        } else if ("cart".equals(seoVar2.c())) {
            sqj.b(this.d, sqj.CART_BUTTON);
            sqj.b(this.e, sqj.CART_BUTTON);
        }
    }

    @Override // com.taobao.android.detail2.core.framework.view.navbar.RightNavBarGenericIconHolder
    public RightNavBarGenericIconHolder.b g0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RightNavBarGenericIconHolder.b) ipChange.ipc$dispatch("d0dd7565", new Object[]{this});
        }
        return new b();
    }
}
