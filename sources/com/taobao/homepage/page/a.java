package com.taobao.homepage.page;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.page.MagicWindowActivity;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.themis.external.embed.TMSEmbedSolutionType;
import tb.hqk;
import tb.m5a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class a implements hqk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ MagicWindowActivity f10594a;

    /* compiled from: Taobao */
    /* renamed from: com.taobao.homepage.page.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class RunnableC0560a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public RunnableC0560a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            String l3 = MagicWindowActivity.l3(a.this.f10594a);
            if (!TextUtils.isEmpty(l3)) {
                if (MagicWindowActivity.m3(a.this.f10594a) != MagicWindowActivity.PageState.ACTIVITY) {
                    MagicWindowActivity.p3(a.this.f10594a, l3, TMSEmbedSolutionType.WEB_SINGLE_PAGE, false);
                } else if (!TextUtils.equals(MagicWindowActivity.n3(a.this.f10594a), l3)) {
                    MagicWindowActivity.o3(a.this.f10594a, l3);
                }
            } else if (MagicWindowActivity.m3(a.this.f10594a) != MagicWindowActivity.PageState.ORDER && MagicWindowActivity.q3(a.this.f10594a)) {
                MagicWindowActivity.r3(a.this.f10594a);
            }
        }
    }

    public a(MagicWindowActivity magicWindowActivity) {
        this.f10594a = magicWindowActivity;
    }

    @Override // tb.hqk
    public void a(JSONObject jSONObject, IContainerDataModel<?> iContainerDataModel, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a114a6e", new Object[]{this, jSONObject, iContainerDataModel, str});
        } else {
            m5a.a().i(new RunnableC0560a());
        }
    }

    @Override // tb.hqk
    public void b(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c0a53b0", new Object[]{this, jSONObject, str});
        }
    }
}
