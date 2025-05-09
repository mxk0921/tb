package com.taobao.android.turbo.subpage.component.dx;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.turbo.subpage.component.dx.DxContainer;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import tb.ckf;
import tb.d1a;
import tb.g1a;
import tb.k66;
import tb.sm8;
import tb.tfs;
import tb.w1a;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltb/k66;", AdvanceSetting.NETWORK_TYPE, "Ltb/xhv;", "invoke", "(Ltb/k66;)V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class DxContainer$createView$1 extends Lambda implements g1a<k66, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ DxContainer.b $customParams;
    public final /* synthetic */ g1a $downloadCallBak;
    public final /* synthetic */ int $height;
    public final /* synthetic */ String $name;
    public final /* synthetic */ w1a $renderCallback;
    public final /* synthetic */ DXTemplateItem $sourceDXTemplateItem;
    public final /* synthetic */ long $startRenderTime;
    public final /* synthetic */ Ref$ObjectRef $targetDXTemplateItem;
    public final /* synthetic */ String $url;
    public final /* synthetic */ long $version;
    public final /* synthetic */ int $width;
    public final /* synthetic */ DxContainer this$0;

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    /* renamed from: com.taobao.android.turbo.subpage.component.dx.DxContainer$createView$1$3  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class AnonymousClass3 extends Lambda implements d1a<xhv> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public AnonymousClass3() {
            super(0);
        }

        public static /* synthetic */ Object ipc$super(AnonymousClass3 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/turbo/subpage/component/dx/DxContainer$createView$1$3");
        }

        @Override // tb.d1a
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7560ccff", new Object[]{this});
                return;
            }
            DxContainer$createView$1 dxContainer$createView$1 = DxContainer$createView$1.this;
            dxContainer$createView$1.this$0.n(dxContainer$createView$1.$height, dxContainer$createView$1.$width, dxContainer$createView$1.$name, dxContainer$createView$1.$version, dxContainer$createView$1.$url, dxContainer$createView$1.$customParams, dxContainer$createView$1.$downloadCallBak, dxContainer$createView$1.$renderCallback);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DxContainer$createView$1(DxContainer dxContainer, String str, long j, String str2, Ref$ObjectRef ref$ObjectRef, int i, int i2, DxContainer.b bVar, long j2, g1a g1aVar, w1a w1aVar, DXTemplateItem dXTemplateItem) {
        super(1);
        this.this$0 = dxContainer;
        this.$name = str;
        this.$version = j;
        this.$url = str2;
        this.$targetDXTemplateItem = ref$ObjectRef;
        this.$height = i;
        this.$width = i2;
        this.$customParams = bVar;
        this.$startRenderTime = j2;
        this.$downloadCallBak = g1aVar;
        this.$renderCallback = w1aVar;
        this.$sourceDXTemplateItem = dXTemplateItem;
    }

    public static /* synthetic */ Object ipc$super(DxContainer$createView$1 dxContainer$createView$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/turbo/subpage/component/dx/DxContainer$createView$1");
    }

    @Override // tb.g1a
    public /* bridge */ /* synthetic */ xhv invoke(k66 k66Var) {
        invoke2(k66Var);
        return xhv.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r2v24, types: [com.taobao.android.dinamicx.template.download.DXTemplateItem, T] */
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(k66 k66Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bb0d835", new Object[]{this, k66Var});
            return;
        }
        ckf.g(k66Var, AdvanceSetting.NETWORK_TYPE);
        if (!DxContainer.h(this.this$0)) {
            try {
                if (!(k66Var.f22428a == null || DxContainer.g(this.this$0) == null)) {
                    tfs.e("DxContainer", "当前成功下载的模板个数：" + k66Var.f22428a.size());
                    List<DXTemplateItem> list = k66Var.f22428a;
                    ckf.f(list, "it.finishedTemplateItems");
                    for (DXTemplateItem dXTemplateItem : list) {
                        if (ckf.b(dXTemplateItem.f7343a, this.$name)) {
                            tfs.e("DxContainer", "下载成功模板：name:" + this.$name + ",version:" + this.$version + ",url:" + this.$url);
                            Ref$ObjectRef ref$ObjectRef = this.$targetDXTemplateItem;
                            DinamicXEngine g = DxContainer.g(this.this$0);
                            ckf.d(g);
                            ref$ObjectRef.element = g.u(dXTemplateItem);
                            DxContainer.a(this.this$0, this.$height, this.$width, (DXTemplateItem) this.$targetDXTemplateItem.element, this.$customParams, this.$startRenderTime, this.$downloadCallBak, this.$renderCallback);
                        }
                    }
                    List<DXTemplateItem> list2 = k66Var.b;
                    if (list2 != null) {
                        for (DXTemplateItem dXTemplateItem2 : list2) {
                            if (ckf.b(dXTemplateItem2.f7343a, this.$name)) {
                                DxTemplateVersionManager dxTemplateVersionManager = DxTemplateVersionManager.INSTANCE;
                                String str = this.$sourceDXTemplateItem.f7343a;
                                ckf.f(str, "sourceDXTemplateItem.name");
                                DXTemplateItem j = dxTemplateVersionManager.j(str);
                                if (j == null) {
                                    j = this.$sourceDXTemplateItem;
                                }
                                DxContainer dxContainer = this.this$0;
                                String str2 = this.$name;
                                DxContainer.j(dxContainer, str2, "显示页面错误", "下载模板失败:" + this.$name, "", new DxContainer$createView$1$$special$$inlined$forEach$lambda$1(j, this));
                            }
                        }
                    }
                }
                g1a g1aVar = this.$downloadCallBak;
                if (g1aVar != null) {
                    xhv xhvVar = (xhv) g1aVar.invoke(k66Var);
                }
            } catch (Throwable th) {
                String message = th.getMessage();
                String str3 = "";
                if (message == null) {
                    message = str3;
                }
                tfs.e("DxContainer", "下载回调执行异常:".concat(message));
                DxContainer dxContainer2 = this.this$0;
                String str4 = this.$name;
                String message2 = th.getMessage();
                if (message2 != null) {
                    str3 = message2;
                }
                DxContainer.j(dxContainer2, str4, "显示页面错误", "下载回调执行异常:".concat(str3), sm8.b(th), new AnonymousClass3());
            }
        }
    }
}
