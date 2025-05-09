package com.taobao.android.xsearchplugin.muise;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.ay4;
import tb.gu1;
import tb.m8j;
import tb.t2o;
import tb.w02;
import tb.yko;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class SFMuiseSDK implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MUISE_BUNDLE_TYPE = "bundleType";
    public static final String MUISE_EVENT_LISTENER = "MuiseEventListener";
    private static volatile boolean STATIC_REGISTER_FLAG = false;
    public static final ay4<gu1, m8j> MUS_MOD_WIDGET_CREATOR = new a();
    public static final ay4<w02, BaseMuiseCellViewHolder> MUS_CELL_CREATOR = new b();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements ay4<gu1, m8j> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: b */
        public m8j a(gu1 gu1Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (m8j) ipChange.ipc$dispatch("28afc945", new Object[]{this, gu1Var});
            }
            return new m8j(gu1Var.f31046a, gu1Var.b, gu1Var.c, gu1Var.f, gu1Var.d, gu1Var.e);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements ay4<w02, BaseMuiseCellViewHolder> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: b */
        public BaseMuiseCellViewHolder a(w02 w02Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (BaseMuiseCellViewHolder) ipChange.ipc$dispatch("cc346b6a", new Object[]{this, w02Var});
            }
            return new BaseMuiseCellViewHolder(w02Var.f31046a, w02Var.c, w02Var.b, w02Var.g, w02Var.d, w02Var.f);
        }
    }

    static {
        t2o.a(993002158);
    }

    public static void install(yko ykoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bc27d2d", new Object[]{ykoVar});
            return;
        }
        ykoVar.f().b().c(MUS_CELL_CREATOR);
        ykoVar.f().i().a(MUS_MOD_WIDGET_CREATOR);
        if (!STATIC_REGISTER_FLAG) {
            STATIC_REGISTER_FLAG = true;
            MuiseXSearchUtilModule.install(ykoVar.g());
        }
    }
}
