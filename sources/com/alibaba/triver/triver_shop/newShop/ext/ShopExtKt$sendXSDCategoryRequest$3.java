package com.alibaba.triver.triver_shop.newShop.ext;

import com.alibaba.triver.triver_shop.preload.CommonPrefetchDataManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.brf;
import tb.d1a;
import tb.jpu;
import tb.r54;
import tb.u1a;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ShopExtKt$sendXSDCategoryRequest$3 extends Lambda implements u1a<Integer, String, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ long $startToken;

    /* compiled from: Taobao */
    /* renamed from: com.alibaba.triver.triver_shop.newShop.ext.ShopExtKt$sendXSDCategoryRequest$3$1  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class AnonymousClass1 extends Lambda implements d1a<xhv> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ long $startToken;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(long j) {
            super(0);
            this.$startToken = j;
        }

        public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/ext/ShopExtKt$sendXSDCategoryRequest$3$1");
        }

        @Override // tb.d1a
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            } else {
                CommonPrefetchDataManager.INSTANCE.c(this.$startToken, brf.a(jpu.a("success", Boolean.FALSE)));
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopExtKt$sendXSDCategoryRequest$3(long j) {
        super(2);
        this.$startToken = j;
    }

    public static /* synthetic */ Object ipc$super(ShopExtKt$sendXSDCategoryRequest$3 shopExtKt$sendXSDCategoryRequest$3, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/ext/ShopExtKt$sendXSDCategoryRequest$3");
    }

    @Override // tb.u1a
    public /* bridge */ /* synthetic */ xhv invoke(Integer num, String str) {
        invoke(num.intValue(), str);
        return xhv.INSTANCE;
    }

    public final void invoke(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5563eae", new Object[]{this, new Integer(i), str});
        } else {
            r54.C(new AnonymousClass1(this.$startToken));
        }
    }
}
