package com.alibaba.triver.triver_shop.newShop.view.component;

import androidx.viewpager.widget.ViewPager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.d1a;
import tb.r54;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ContentShopComponent$allTemplateLoadFinish$1 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ ContentShopComponent this$0;

    /* compiled from: Taobao */
    /* renamed from: com.alibaba.triver.triver_shop.newShop.view.component.ContentShopComponent$allTemplateLoadFinish$1$1  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class AnonymousClass1 extends Lambda implements d1a<xhv> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ ContentShopComponent this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ContentShopComponent contentShopComponent) {
            super(0);
            this.this$0 = contentShopComponent;
        }

        public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/component/ContentShopComponent$allTemplateLoadFinish$1$1");
        }

        @Override // tb.d1a
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            } else {
                this.this$0.M();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContentShopComponent$allTemplateLoadFinish$1(ContentShopComponent contentShopComponent) {
        super(0);
        this.this$0 = contentShopComponent;
    }

    public static /* synthetic */ Object ipc$super(ContentShopComponent$allTemplateLoadFinish$1 contentShopComponent$allTemplateLoadFinish$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/component/ContentShopComponent$allTemplateLoadFinish$1");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            return;
        }
        if (this.this$0.u() == 0) {
            ContentShopComponent contentShopComponent = this.this$0;
            contentShopComponent.onPageSelected(contentShopComponent.u());
        } else {
            ViewPager b1 = ContentShopComponent.b1(this.this$0);
            if (b1 != null) {
                b1.setCurrentItem(this.this$0.u(), false);
            } else {
                ckf.y("contentViewPager");
                throw null;
            }
        }
        r54.E(new AnonymousClass1(this.this$0), 350L);
    }
}
