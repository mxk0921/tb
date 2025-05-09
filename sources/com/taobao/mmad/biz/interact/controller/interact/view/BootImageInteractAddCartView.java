package com.taobao.mmad.biz.interact.controller.interact.view;

import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.bootimage.data.BootImageInfo;
import com.taobao.taobao.R;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class BootImageInteractAddCartView extends BootImageInteractNaitveSlideView {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(573571107);
    }

    public BootImageInteractAddCartView(Context context, BootImageInfo bootImageInfo) {
        super(context, bootImageInfo);
    }

    public static /* synthetic */ Object ipc$super(BootImageInteractAddCartView bootImageInteractAddCartView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1383171873:
                super.stopInteract();
                return null;
            case -828457319:
                super.onSlide();
                return null;
            case -483678593:
                super.close();
                return null;
            case -165291571:
                super.onAdClick();
                return null;
            case 2144052543:
                super.startInteract();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mmad/biz/interact/controller/interact/view/BootImageInteractAddCartView");
        }
    }

    @Override // com.taobao.mmad.biz.interact.controller.interact.view.BootImageInteractNaitveSlideView, com.taobao.mmad.biz.interact.controller.interact.view.BootImageInteractBaseView
    public void close() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
        } else {
            super.close();
        }
    }

    @Override // com.taobao.mmad.biz.interact.controller.interact.view.BootImageInteractNaitveSlideView
    public int getInteractCartLayoutId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("25944aeb", new Object[]{this})).intValue();
        }
        return R.layout.bootimage_interact_card_add_cart;
    }

    @Override // com.taobao.mmad.biz.interact.controller.interact.view.BootImageInteractNaitveSlideView
    public String getSlideActionText() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2b4056db", new Object[]{this});
        }
        return "";
    }

    @Override // com.taobao.mmad.biz.interact.controller.interact.view.BootImageInteractNaitveSlideView, com.taobao.mmad.biz.interact.controller.interact.view.BootImageInteractSlideView
    public void onAdClick() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f625d9cd", new Object[]{this});
        } else {
            super.onAdClick();
        }
    }

    @Override // com.taobao.mmad.biz.interact.controller.interact.view.BootImageInteractNaitveSlideView, com.taobao.mmad.biz.interact.controller.interact.view.BootImageInteractSlideView
    public void onSlide() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce9ebe99", new Object[]{this});
        } else {
            super.onSlide();
        }
    }

    @Override // com.taobao.mmad.biz.interact.controller.interact.view.BootImageInteractNaitveSlideView, com.taobao.mmad.biz.interact.controller.interact.view.BootImageInteractSlideView
    public void renderDefaultCard() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a83db882", new Object[]{this});
        }
    }

    @Override // com.taobao.mmad.biz.interact.controller.interact.view.BootImageInteractNaitveSlideView, com.taobao.mmad.biz.interact.controller.interact.view.BootImageInteractSlideView, com.taobao.mmad.biz.interact.controller.interact.view.BootImageInteractBaseView
    public void startInteract() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fcba53f", new Object[]{this});
        } else {
            super.startInteract();
        }
    }

    @Override // com.taobao.mmad.biz.interact.controller.interact.view.BootImageInteractNaitveSlideView, com.taobao.mmad.biz.interact.controller.interact.view.BootImageInteractSlideView, com.taobao.mmad.biz.interact.controller.interact.view.BootImageInteractBaseView
    public void stopInteract() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad8e78df", new Object[]{this});
        } else {
            super.stopInteract();
        }
    }
}
