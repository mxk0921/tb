package com.etao.feimagesearch.pipline.node;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import tb.ckf;
import tb.dnf;
import tb.g1a;
import tb.xhv;
import tb.y7m;
import tb.yeu;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ImageTranslateNode$process$1 extends Lambda implements g1a<y7m, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ Ref$ObjectRef<Integer> $token;
    public final /* synthetic */ ImageTranslateNode this$0;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a implements dnf.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ y7m f4853a;
        public final /* synthetic */ ImageTranslateNode b;

        public a(y7m y7mVar, ImageTranslateNode imageTranslateNode) {
            this.f4853a = y7mVar;
            this.b = imageTranslateNode;
        }

        @Override // tb.dnf.a
        public void onError(int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7a671c9d", new Object[]{this, new Integer(i), str});
                return;
            }
            ckf.g(str, "errorMsg");
            this.f4853a.c(this.b.d(Integer.valueOf(i), str, false, new Pair(Boolean.valueOf(ImageTranslateNode.p(this.b)), ImageTranslateNode.o(this.b))));
        }

        @Override // tb.dnf.a
        public void a(int i, ArrayList<yeu> arrayList) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("330eeffa", new Object[]{this, new Integer(i), arrayList});
                return;
            }
            ckf.g(arrayList, "result");
            if (arrayList.isEmpty()) {
                this.f4853a.c(this.b.d(-10099, "翻译结果为空", false, new Pair(Boolean.valueOf(ImageTranslateNode.p(this.b)), ImageTranslateNode.o(this.b))));
                return;
            }
            y7m y7mVar = this.f4853a;
            ImageTranslateNode imageTranslateNode = this.b;
            y7mVar.c(imageTranslateNode.f(new Pair(ImageTranslateNode.o(imageTranslateNode), arrayList)));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageTranslateNode$process$1(Ref$ObjectRef<Integer> ref$ObjectRef, ImageTranslateNode imageTranslateNode) {
        super(1);
        this.$token = ref$ObjectRef;
        this.this$0 = imageTranslateNode;
    }

    public static /* synthetic */ Object ipc$super(ImageTranslateNode$process$1 imageTranslateNode$process$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/pipline/node/ImageTranslateNode$process$1");
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
        dnf.INSTANCE.f(this.$token.element.intValue(), new a(y7mVar, this.this$0));
    }
}
