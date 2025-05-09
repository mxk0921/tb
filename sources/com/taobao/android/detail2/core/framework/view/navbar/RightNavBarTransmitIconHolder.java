package com.taobao.android.detail2.core.framework.view.navbar;

import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.view.navbar.RightNavBarGenericIconHolder;
import tb.bfu;
import tb.cxj;
import tb.dh7;
import tb.seo;
import tb.t2o;
import tb.txj;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class RightNavBarTransmitIconHolder extends RightNavBarGenericIconHolder {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b extends RightNavBarGenericIconHolder.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(352322109);
        }

        public b() {
            super();
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail2/core/framework/view/navbar/RightNavBarTransmitIconHolder$OnTransmitItemClickListener");
        }

        @Override // com.taobao.android.detail2.core.framework.view.navbar.RightNavBarGenericIconHolder.b
        public void a(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4b7778ab", new Object[]{this, view});
                return;
            }
            seo seoVar = RightNavBarTransmitIconHolder.this.c;
            if (seoVar != null && seoVar.e() != null) {
                try {
                    bfu.b(RightNavBarTransmitIconHolder.this.c.e().getJSONArray("events"), RightNavBarTransmitIconHolder.this.b);
                } catch (Exception e) {
                    txj.f("new_detail异常", "转发按钮点击处理异常", e);
                }
            }
        }
    }

    static {
        t2o.a(352322107);
    }

    public RightNavBarTransmitIconHolder(View view, dh7 dh7Var, cxj cxjVar) {
        super(view, dh7Var, cxjVar);
    }

    public static /* synthetic */ Object ipc$super(RightNavBarTransmitIconHolder rightNavBarTransmitIconHolder, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail2/core/framework/view/navbar/RightNavBarTransmitIconHolder");
    }

    public static RightNavBarIconHolder j0(ViewGroup viewGroup, dh7 dh7Var, cxj cxjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RightNavBarIconHolder) ipChange.ipc$dispatch("edfab863", new Object[]{viewGroup, dh7Var, cxjVar});
        }
        return new RightNavBarTransmitIconHolder(RightNavBarGenericIconHolder.f0(viewGroup.getContext(), viewGroup), dh7Var, cxjVar);
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
