package com.etao.feimagesearch.capture.tool.bottom.album;

import android.widget.TextView;
import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.capture.dynamic.bottom.album.CaptureAlbumAdapter;
import com.etao.feimagesearch.capture.tool.base.CaptureRainbowManager;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.taobao.taobao.R;
import kotlin.jvm.internal.Lambda;
import tb.b43;
import tb.ckf;
import tb.d1a;
import tb.g1a;
import tb.mzu;
import tb.pei;
import tb.s63;
import tb.xhv;
import tb.z7n;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class CaptureAlbumWidget$albumAdapter$2 extends Lambda implements d1a<CaptureAlbumAdapter> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ CaptureAlbumWidget this$0;

    /* compiled from: Taobao */
    /* renamed from: com.etao.feimagesearch.capture.tool.bottom.album.CaptureAlbumWidget$albumAdapter$2$1  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class AnonymousClass1 extends Lambda implements g1a<pei, xhv> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ CaptureAlbumWidget this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(CaptureAlbumWidget captureAlbumWidget) {
            super(1);
            this.this$0 = captureAlbumWidget;
        }

        public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/capture/tool/bottom/album/CaptureAlbumWidget$albumAdapter$2$1");
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
            if (peiVar.p()) {
                str = "video";
            } else {
                if (z7n.k(peiVar.g())) {
                    str = Localization.q(R.string.taobao_app_1007_1_18944);
                } else {
                    str = Localization.q(R.string.taobao_app_1007_1_18966);
                }
                ckf.f(str, "{\n          if (QueryMed…66)\n          }\n        }");
            }
            if (!CaptureAlbumWidget.A0(this.this$0)) {
                String p = ckf.p("pssource=", this.this$0.K0().a().b());
                TextView r0 = CaptureAlbumWidget.r0(this.this$0);
                if (r0 != null) {
                    mzu.k(s63.ALBUM_PAGE_NAME, "OuterAlbumLocal", p, ckf.p("folder=", r0.getText()), ckf.p("picCreateTime=", Long.valueOf(peiVar.c())), ckf.p("picIndex=", Integer.valueOf(peiVar.h())), ckf.p("queryType=", str), ckf.p("album_type=", Integer.valueOf(CaptureAlbumWidget.o0(this.this$0))));
                } else {
                    ckf.y("folderLabel");
                    throw null;
                }
            }
            String p2 = ckf.p("pssource=", this.this$0.K0().a().b());
            TextView r02 = CaptureAlbumWidget.r0(this.this$0);
            if (r02 != null) {
                mzu.k(s63.ALBUM_PAGE_NAME, "SelectedPhoto", p2, ckf.p("folder=", r02.getText()), ckf.p("picCreateTime=", Long.valueOf(peiVar.c())), ckf.p("picIndex=", Integer.valueOf(peiVar.h())), ckf.p("queryType=", str), ckf.p("album_type=", Integer.valueOf(CaptureAlbumWidget.o0(this.this$0))));
                CaptureAlbumWidget.t0(this.this$0).invoke(peiVar, Boolean.valueOf(CaptureAlbumWidget.A0(this.this$0)));
                return;
            }
            ckf.y("folderLabel");
            throw null;
        }
    }

    /* compiled from: Taobao */
    /* renamed from: com.etao.feimagesearch.capture.tool.bottom.album.CaptureAlbumWidget$albumAdapter$2$2  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class AnonymousClass2 extends Lambda implements d1a<xhv> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ CaptureAlbumWidget this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(CaptureAlbumWidget captureAlbumWidget) {
            super(0);
            this.this$0 = captureAlbumWidget;
        }

        public static /* synthetic */ Object ipc$super(AnonymousClass2 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/capture/tool/bottom/album/CaptureAlbumWidget$albumAdapter$2$2");
        }

        @Override // tb.d1a
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            } else {
                ((b43) this.this$0.i0()).U(true);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CaptureAlbumWidget$albumAdapter$2(CaptureAlbumWidget captureAlbumWidget) {
        super(0);
        this.this$0 = captureAlbumWidget;
    }

    public static /* synthetic */ Object ipc$super(CaptureAlbumWidget$albumAdapter$2 captureAlbumWidget$albumAdapter$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/capture/tool/bottom/album/CaptureAlbumWidget$albumAdapter$2");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // tb.d1a
    public final CaptureAlbumAdapter invoke() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CaptureAlbumAdapter) ipChange.ipc$dispatch("5c2903a6", new Object[]{this}) : new CaptureAlbumAdapter(null, CaptureAlbumWidget.y0(this.this$0), CaptureAlbumWidget.m0(this.this$0), CaptureRainbowManager.Companion.a().d(), new AnonymousClass1(this.this$0), new AnonymousClass2(this.this$0));
    }
}
