package com.taobao.themis.widget.platformview;

import com.alibaba.ariver.integration.embedview.BaseEmbedView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.widget.platformview.TMSWidgetEmbedInnerFrameLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.d1a;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/taobao/themis/widget/platformview/TMSWidgetEmbedInnerFrameLayout;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class TMSBasePlatformView$mRootView$2 extends Lambda implements d1a<TMSWidgetEmbedInnerFrameLayout> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ TMSBasePlatformView this$0;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a implements TMSWidgetEmbedInnerFrameLayout.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TMSBasePlatformView f13826a;

        public a(TMSBasePlatformView tMSBasePlatformView) {
            this.f13826a = tMSBasePlatformView;
        }

        @Override // com.taobao.themis.widget.platformview.TMSWidgetEmbedInnerFrameLayout.a
        public final void onSizeChanged(int i, int i2, int i3, int i4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("52d28ddb", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
                return;
            }
            BaseEmbedView a2 = TMSBasePlatformView.a(this.f13826a);
            if (a2 != null) {
                a2.onEmbedViewSizeChanged(i, i2);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class b implements TMSWidgetEmbedInnerFrameLayout.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TMSBasePlatformView f13827a;

        public b(TMSBasePlatformView tMSBasePlatformView) {
            this.f13827a = tMSBasePlatformView;
        }

        @Override // com.taobao.themis.widget.platformview.TMSWidgetEmbedInnerFrameLayout.b
        public final void onWindowVisibilityChanged(int i) {
            BaseEmbedView a2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e480fae9", new Object[]{this, new Integer(i)});
            } else if (i == 0) {
                BaseEmbedView a3 = TMSBasePlatformView.a(this.f13827a);
                if (a3 != null) {
                    a3.onWebViewResume();
                }
            } else if ((i == 4 || i == 8) && (a2 = TMSBasePlatformView.a(this.f13827a)) != null) {
                a2.onWebViewPause();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TMSBasePlatformView$mRootView$2(TMSBasePlatformView tMSBasePlatformView) {
        super(0);
        this.this$0 = tMSBasePlatformView;
    }

    public static /* synthetic */ Object ipc$super(TMSBasePlatformView$mRootView$2 tMSBasePlatformView$mRootView$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/widget/platformview/TMSBasePlatformView$mRootView$2");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // tb.d1a
    public final TMSWidgetEmbedInnerFrameLayout invoke() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TMSWidgetEmbedInnerFrameLayout) ipChange.ipc$dispatch("c637008", new Object[]{this}) : new TMSWidgetEmbedInnerFrameLayout(this.this$0.c()).whenSizeChanged(new a(this.this$0)).whenWindowVisibilityChanged(new b(this.this$0));
    }
}
