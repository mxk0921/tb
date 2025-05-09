package com.alibaba.triver.triver_shop.shop2023.nativeview;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.triver.triver_shop.newShop.data.ShopDataParser;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.d1a;
import tb.g1a;
import tb.kew;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class Shop2023CategoryNativeComponent$initView$1$3 extends Lambda implements d1a<RecyclerView> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ ViewGroup $container;
    public final /* synthetic */ Shop2023CategoryNativeComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Shop2023CategoryNativeComponent$initView$1$3(ViewGroup viewGroup, Shop2023CategoryNativeComponent shop2023CategoryNativeComponent) {
        super(0);
        this.$container = viewGroup;
        this.this$0 = shop2023CategoryNativeComponent;
    }

    public static /* synthetic */ Object ipc$super(Shop2023CategoryNativeComponent$initView$1$3 shop2023CategoryNativeComponent$initView$1$3, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/shop2023/nativeview/Shop2023CategoryNativeComponent$initView$1$3");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // tb.d1a
    public final RecyclerView invoke() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("7aba0066", new Object[]{this});
        }
        Context context = this.$container.getContext();
        final Shop2023CategoryNativeComponent shop2023CategoryNativeComponent = this.this$0;
        return new RecyclerView(context) { // from class: com.alibaba.triver.triver_shop.shop2023.nativeview.Shop2023CategoryNativeComponent$initView$1$3.1
            public static volatile transient /* synthetic */ IpChange $ipChange;
            private boolean detectSwipeOrientation;
            private float startY;
            private boolean swipeUp;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                if (str.hashCode() == 2075560917) {
                    return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
                }
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/shop2023/nativeview/Shop2023CategoryNativeComponent$initView$1$3$1");
            }

            @Override // android.view.ViewGroup, android.view.View
            public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                ShopDataParser o;
                ShopDataParser.ShopViewContext m1;
                g1a<Boolean, xhv> m;
                ShopDataParser o2;
                ShopDataParser.ShopViewContext m12;
                g1a<Boolean, xhv> m2;
                ShopDataParser.ShopViewContext m13;
                g1a<Boolean, xhv> m3;
                boolean z = false;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
                }
                if (motionEvent == null) {
                    return false;
                }
                if (kew.E(motionEvent)) {
                    this.swipeUp = false;
                    this.detectSwipeOrientation = false;
                    this.startY = motionEvent.getRawY();
                    ShopDataParser o3 = Shop2023CategoryNativeComponent.this.z().o();
                    if (!(o3 == null || (m13 = o3.m1()) == null || (m3 = m13.m()) == null)) {
                        m3.invoke(Boolean.FALSE);
                    }
                    return super.dispatchTouchEvent(motionEvent);
                }
                if (!((!kew.G(motionEvent) && !kew.D(motionEvent)) || (o2 = Shop2023CategoryNativeComponent.this.z().o()) == null || (m12 = o2.m1()) == null || (m2 = m12.m()) == null)) {
                    m2.invoke(Boolean.TRUE);
                }
                if (kew.F(motionEvent)) {
                    if (!this.detectSwipeOrientation) {
                        if (motionEvent.getRawY() < this.startY) {
                            z = true;
                        }
                        this.swipeUp = z;
                        this.detectSwipeOrientation = true;
                    }
                    if (!(!this.swipeUp || canScrollVertically(1) || (o = Shop2023CategoryNativeComponent.this.z().o()) == null || (m1 = o.m1()) == null || (m = m1.m()) == null)) {
                        m.invoke(Boolean.TRUE);
                    }
                }
                return super.dispatchTouchEvent(motionEvent);
            }

            public final boolean getDetectSwipeOrientation() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("9a98a6fa", new Object[]{this})).booleanValue();
                }
                return this.detectSwipeOrientation;
            }

            public final float getStartY() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Number) ipChange2.ipc$dispatch("90071124", new Object[]{this})).floatValue();
                }
                return this.startY;
            }

            public final boolean getSwipeUp() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("36c6c4a", new Object[]{this})).booleanValue();
                }
                return this.swipeUp;
            }

            public final void setDetectSwipeOrientation(boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("c094f612", new Object[]{this, new Boolean(z)});
                } else {
                    this.detectSwipeOrientation = z;
                }
            }

            public final void setStartY(float f) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("740f080", new Object[]{this, new Float(f)});
                } else {
                    this.startY = f;
                }
            }

            public final void setSwipeUp(boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a06aca5a", new Object[]{this, new Boolean(z)});
                } else {
                    this.swipeUp = z;
                }
            }
        };
    }
}
