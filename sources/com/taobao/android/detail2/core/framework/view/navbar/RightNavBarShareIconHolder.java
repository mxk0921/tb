package com.taobao.android.detail2.core.framework.view.navbar;

import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.view.navbar.RightNavBarGenericIconHolder;
import com.taobao.android.trade.event.Event;
import java.util.HashMap;
import java.util.List;
import tb.cxj;
import tb.dh7;
import tb.hxj;
import tb.rj8;
import tb.seo;
import tb.sqj;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class RightNavBarShareIconHolder extends RightNavBarGenericIconHolder {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b extends RightNavBarGenericIconHolder.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(352322106);
        }

        public b() {
            super();
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail2/core/framework/view/navbar/RightNavBarShareIconHolder$OnShareItemClickListener");
        }

        @Override // com.taobao.android.detail2.core.framework.view.navbar.RightNavBarGenericIconHolder.b
        public void a(View view) {
            List<Event> b;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4b7778ab", new Object[]{this, view});
                return;
            }
            seo seoVar = RightNavBarShareIconHolder.this.c;
            if (!(seoVar == null || seoVar.b() == null || RightNavBarShareIconHolder.this.c.b().L == null || (b = hxj.b(RightNavBarShareIconHolder.this.c.b().L.getJSONArray("shareAction"))) == null)) {
                for (Event event : b) {
                    rj8.d(RightNavBarShareIconHolder.this.f7194a.i(), event);
                }
                b();
            }
        }

        public final void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cd67ef3a", new Object[]{this});
                return;
            }
            HashMap hashMap = new HashMap();
            seo seoVar = RightNavBarShareIconHolder.this.c;
            if (seoVar != null && seoVar.b() != null) {
                RightNavBarShareIconHolder.this.b.a0().d(RightNavBarShareIconHolder.this.c.b().b, "Navigation_Share", "", "", hashMap, RightNavBarShareIconHolder.this.c.b());
            }
        }
    }

    static {
        t2o.a(352322104);
    }

    public RightNavBarShareIconHolder(View view, dh7 dh7Var, cxj cxjVar) {
        super(view, dh7Var, cxjVar);
        sqj.b(this.e, sqj.SHARE_BUTTON);
        sqj.b(this.d, sqj.SHARE_BUTTON);
    }

    public static /* synthetic */ Object ipc$super(RightNavBarShareIconHolder rightNavBarShareIconHolder, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail2/core/framework/view/navbar/RightNavBarShareIconHolder");
    }

    public static RightNavBarIconHolder j0(ViewGroup viewGroup, dh7 dh7Var, cxj cxjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RightNavBarIconHolder) ipChange.ipc$dispatch("edfab863", new Object[]{viewGroup, dh7Var, cxjVar});
        }
        return new RightNavBarShareIconHolder(RightNavBarGenericIconHolder.f0(viewGroup.getContext(), viewGroup), dh7Var, cxjVar);
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
