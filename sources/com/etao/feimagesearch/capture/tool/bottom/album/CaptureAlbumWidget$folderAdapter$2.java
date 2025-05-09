package com.etao.feimagesearch.capture.tool.bottom.album;

import android.app.Activity;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.capture.dynamic.bottom.album.CaptureAlbumFolderAdapter;
import com.etao.feimagesearch.capture.tool.base.CaptureRainbowManager;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import kotlin.jvm.internal.Lambda;
import tb.b43;
import tb.ckf;
import tb.d1a;
import tb.g1a;
import tb.xhv;
import tb.zs9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class CaptureAlbumWidget$folderAdapter$2 extends Lambda implements d1a<CaptureAlbumFolderAdapter> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ Activity $activity;
    public final /* synthetic */ CaptureAlbumWidget this$0;

    /* compiled from: Taobao */
    /* renamed from: com.etao.feimagesearch.capture.tool.bottom.album.CaptureAlbumWidget$folderAdapter$2$1  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class AnonymousClass1 extends Lambda implements g1a<zs9, xhv> {
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
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/capture/tool/bottom/album/CaptureAlbumWidget$folderAdapter$2$1");
        }

        @Override // tb.g1a
        public /* bridge */ /* synthetic */ xhv invoke(zs9 zs9Var) {
            invoke2(zs9Var);
            return xhv.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(zs9 zs9Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("27eba92", new Object[]{this, zs9Var});
                return;
            }
            ckf.g(zs9Var, AdvanceSetting.NETWORK_TYPE);
            TextView r0 = CaptureAlbumWidget.r0(this.this$0);
            if (r0 != null) {
                r0.setText(zs9Var.g());
                CaptureAlbumWidget.k0(this.this$0).N(zs9Var, ((b43) this.this$0.i0()).Q().e());
                CaptureAlbumWidget captureAlbumWidget = this.this$0;
                CaptureAlbumWidget.E0(captureAlbumWidget, CaptureAlbumWidget.k0(captureAlbumWidget).getItemCount() == 0);
                zs9 n0 = CaptureAlbumWidget.n0(this.this$0);
                if (n0 != null) {
                    n0.l(false);
                }
                CaptureAlbumWidget.q0(this.this$0).Q(CaptureAlbumWidget.n0(this.this$0));
                zs9Var.l(true);
                CaptureAlbumWidget.q0(this.this$0).Q(zs9Var);
                CaptureAlbumWidget.C0(this.this$0, zs9Var);
                CaptureAlbumWidget.F0(this.this$0, false);
                return;
            }
            ckf.y("folderLabel");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CaptureAlbumWidget$folderAdapter$2(Activity activity, CaptureAlbumWidget captureAlbumWidget) {
        super(0);
        this.$activity = activity;
        this.this$0 = captureAlbumWidget;
    }

    public static /* synthetic */ Object ipc$super(CaptureAlbumWidget$folderAdapter$2 captureAlbumWidget$folderAdapter$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/capture/tool/bottom/album/CaptureAlbumWidget$folderAdapter$2");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // tb.d1a
    public final CaptureAlbumFolderAdapter invoke() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CaptureAlbumFolderAdapter) ipChange.ipc$dispatch("561daab4", new Object[]{this}) : new CaptureAlbumFolderAdapter(this.$activity, CaptureRainbowManager.Companion.a().d(), CaptureAlbumWidget.y0(this.this$0), new AnonymousClass1(this.this$0));
    }
}
