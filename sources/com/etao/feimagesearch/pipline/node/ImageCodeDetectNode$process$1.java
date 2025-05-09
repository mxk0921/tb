package com.etao.feimagesearch.pipline.node;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.model.PhotoFrom;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.g1a;
import tb.lg4;
import tb.lwq;
import tb.qrl;
import tb.xhv;
import tb.y7m;
import tb.zmf;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ImageCodeDetectNode$process$1 extends Lambda implements g1a<y7m, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ Integer $token;
    public final /* synthetic */ ImageCodeDetectNode this$0;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a implements zmf.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ImageCodeDetectNode f4850a;
        public final /* synthetic */ y7m b;
        public final /* synthetic */ Integer c;

        public a(ImageCodeDetectNode imageCodeDetectNode, y7m y7mVar, Integer num) {
            this.f4850a = imageCodeDetectNode;
            this.b = y7mVar;
            this.c = num;
        }

        @Override // tb.zmf.c
        public final void a(List<zmf.a> list, PhotoFrom.Values values) {
            lwq lwqVar;
            int i = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b9bc4d99", new Object[]{this, list, values});
                return;
            }
            if (list == null || list.isEmpty()) {
                lwqVar = this.f4850a.f(null);
            } else {
                lwqVar = this.f4850a.f(list);
            }
            ImageCodeDetectNode imageCodeDetectNode = this.f4850a;
            if (list != null) {
                i = list.size();
            }
            imageCodeDetectNode.a("codeDetectCount", String.valueOf(i));
            this.f4850a.n();
            if (qrl.g(lg4.Y1("ImgCodeDetectDelayTime"), 0L) <= 0) {
                this.b.c(lwqVar);
            } else {
                this.b.d(lwqVar, 5000L);
            }
            zmf.g().k(this.c.intValue());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageCodeDetectNode$process$1(Integer num, ImageCodeDetectNode imageCodeDetectNode) {
        super(1);
        this.$token = num;
        this.this$0 = imageCodeDetectNode;
    }

    public static /* synthetic */ Object ipc$super(ImageCodeDetectNode$process$1 imageCodeDetectNode$process$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/pipline/node/ImageCodeDetectNode$process$1");
    }

    @Override // tb.g1a
    public /* bridge */ /* synthetic */ xhv invoke(y7m y7mVar) {
        invoke2(y7mVar);
        return xhv.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(y7m y7mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3346a156", new Object[]{this, y7mVar});
            return;
        }
        ckf.g(y7mVar, "pipLineEventBus");
        zmf.g().i(this.$token.intValue(), new a(this.this$0, y7mVar, this.$token));
    }
}
