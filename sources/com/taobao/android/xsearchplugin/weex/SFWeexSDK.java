package com.taobao.android.xsearchplugin.weex;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.xsearchplugin.weex.biz.srp.BaseSrpListWeexCellViewHolder;
import com.taobao.android.xsearchplugin.weex.weex.XSearchUtilModule;
import java.io.Serializable;
import tb.ay4;
import tb.b7x;
import tb.gu1;
import tb.t2o;
import tb.w02;
import tb.yko;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class SFWeexSDK implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static volatile boolean STATIC_REGISTER_FLAG = false;
    public static final ay4<gu1, b7x> WEEX_MOD_WIDGET_CREATOR = new a();
    public static final ay4<w02, BaseSrpListWeexCellViewHolder> WEEX_CELL_CREATOR = new b();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements ay4<gu1, b7x> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: b */
        public b7x a(gu1 gu1Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b7x) ipChange.ipc$dispatch("a74a7faa", new Object[]{this, gu1Var});
            }
            return new b7x(gu1Var.f31046a, gu1Var.b, gu1Var.c, gu1Var.f, gu1Var.d, gu1Var.e);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements ay4<w02, BaseSrpListWeexCellViewHolder> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: b */
        public BaseSrpListWeexCellViewHolder a(w02 w02Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (BaseSrpListWeexCellViewHolder) ipChange.ipc$dispatch("b2ff7d69", new Object[]{this, w02Var});
            }
            return new BaseSrpListWeexCellViewHolder(w02Var.f31046a, w02Var.c, w02Var.b, w02Var.g, w02Var.d, w02Var.f);
        }
    }

    static {
        t2o.a(993002178);
    }

    public static void install(yko ykoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bc27d2d", new Object[]{ykoVar});
            return;
        }
        ykoVar.f().b().d(WEEX_CELL_CREATOR);
        ykoVar.f().i().b(WEEX_MOD_WIDGET_CREATOR);
        if (!STATIC_REGISTER_FLAG) {
            STATIC_REGISTER_FLAG = true;
            XSearchUtilModule.install(ykoVar.g());
        }
    }
}
