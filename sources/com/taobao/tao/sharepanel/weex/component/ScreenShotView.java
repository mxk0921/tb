package com.taobao.tao.sharepanel.weex.component;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.ui.ComponentCreator;
import com.taobao.weex.ui.action.BasicComponentData;
import com.taobao.weex.ui.component.WXComponent;
import com.taobao.weex.ui.component.WXVContainer;
import tb.bwr;
import tb.s0m;
import tb.t2o;
import tb.tn1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ScreenShotView extends WXComponent<ImageView> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a implements ComponentCreator {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(666894592);
            t2o.a(985661647);
        }

        @Override // com.taobao.weex.ui.ComponentCreator
        public WXComponent createInstance(WXSDKInstance wXSDKInstance, WXVContainer wXVContainer, BasicComponentData basicComponentData) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (WXComponent) ipChange.ipc$dispatch("a264c511", new Object[]{this, wXSDKInstance, wXVContainer, basicComponentData});
            }
            return new ScreenShotView(wXSDKInstance, wXVContainer, basicComponentData);
        }
    }

    static {
        t2o.a(666894591);
    }

    public ScreenShotView(WXSDKInstance wXSDKInstance, WXVContainer wXVContainer, BasicComponentData basicComponentData) {
        super(wXSDKInstance, wXVContainer, basicComponentData);
    }

    public static /* synthetic */ Object ipc$super(ScreenShotView screenShotView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/sharepanel/weex/component/ScreenShotView");
    }

    @Override // com.taobao.weex.ui.component.WXComponent
    public ImageView initComponentHostView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageView) ipChange.ipc$dispatch("a5b11369", new Object[]{this, context});
        }
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        if (tn1.m(bwr.h().e().businessId)) {
            s0m.B().N0(context).T(bwr.h().e().screenshot).into(imageView);
        }
        return imageView;
    }
}
