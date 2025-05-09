package com.etao.feimagesearch.capture.dynamic.bottom.album;

import android.app.Activity;
import android.widget.TextView;
import android.widget.Toast;
import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.taobao.taobao.R;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.g1a;
import tb.mzu;
import tb.pei;
import tb.s63;
import tb.web;
import tb.wyn;
import tb.xhv;
import tb.z7n;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class CaptureAlbumView$albumAdapter$1 extends Lambda implements g1a<pei, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ Activity $activity;
    public final /* synthetic */ CaptureAlbumView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CaptureAlbumView$albumAdapter$1(Activity activity, CaptureAlbumView captureAlbumView) {
        super(1);
        this.$activity = activity;
        this.this$0 = captureAlbumView;
    }

    public static /* synthetic */ Object ipc$super(CaptureAlbumView$albumAdapter$1 captureAlbumView$albumAdapter$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/capture/dynamic/bottom/album/CaptureAlbumView$albumAdapter$1");
    }

    @Override // tb.g1a
    public /* bridge */ /* synthetic */ xhv invoke(pei peiVar) {
        invoke2(peiVar);
        return xhv.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(pei peiVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1205f0e6", new Object[]{this, peiVar});
            return;
        }
        ckf.g(peiVar, AdvanceSetting.NETWORK_TYPE);
        if (!peiVar.p() || wyn.INSTANCE.h()) {
            if (peiVar.p()) {
                str = "video";
            } else {
                if (z7n.k(peiVar.g())) {
                    str = Localization.q(R.string.taobao_app_1007_1_18944);
                } else {
                    str = Localization.q(R.string.taobao_app_1007_1_18966);
                }
                ckf.f(str, "{\n        if (QueryMedia…_18966)\n        }\n      }");
            }
            if (!CaptureAlbumView.b0(this.this$0)) {
                String p = ckf.p("pssource=", this.this$0.p().getPssource());
                TextView S = CaptureAlbumView.S(this.this$0);
                if (S != null) {
                    mzu.k(s63.ALBUM_PAGE_NAME, "OuterAlbumLocal", p, ckf.p("folder=", S.getText()), ckf.p("picCreateTime=", Long.valueOf(peiVar.c())), ckf.p("picIndex=", Integer.valueOf(peiVar.h())), ckf.p("queryType=", str), ckf.p("album_type=", Integer.valueOf(CaptureAlbumView.Q(this.this$0))));
                } else {
                    ckf.y("folderLabel");
                    throw null;
                }
            }
            String p2 = ckf.p("pssource=", this.this$0.p().getPssource());
            TextView S2 = CaptureAlbumView.S(this.this$0);
            if (S2 != null) {
                mzu.k(s63.ALBUM_PAGE_NAME, "SelectedPhoto", p2, ckf.p("folder=", S2.getText()), ckf.p("picCreateTime=", Long.valueOf(peiVar.c())), ckf.p("picIndex=", Integer.valueOf(peiVar.h())), ckf.p("queryType=", str), ckf.p("album_type=", Integer.valueOf(CaptureAlbumView.Q(this.this$0))));
                web k = this.this$0.m().k();
                if (k != null) {
                    k.n(peiVar, CaptureAlbumView.b0(this.this$0));
                    return;
                }
                return;
            }
            ckf.y("folderLabel");
            throw null;
        }
        Toast.makeText(this.$activity, Localization.q(R.string.taobao_app_1007_1_19012), 0).show();
    }
}
