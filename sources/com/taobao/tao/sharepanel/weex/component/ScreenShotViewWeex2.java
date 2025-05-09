package com.taobao.tao.sharepanel.weex.component;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import io.unicorn.plugin.platform.WeexPlatformView;
import tb.bwr;
import tb.s0m;
import tb.t2o;
import tb.tn1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ScreenShotViewWeex2 extends WeexPlatformView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Context context;
    public ImageView imageView = null;

    static {
        t2o.a(666894593);
    }

    public ScreenShotViewWeex2(Context context, int i) {
        super(context, i);
        this.context = context;
    }

    public static /* synthetic */ Object ipc$super(ScreenShotViewWeex2 screenShotViewWeex2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/sharepanel/weex/component/ScreenShotViewWeex2");
    }

    @Override // io.unicorn.plugin.platform.WeexPlatformView, tb.l5m
    public View getView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        ImageView imageView = this.imageView;
        if (imageView != null) {
            return imageView;
        }
        ImageView imageView2 = new ImageView(this.context);
        imageView2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        if (tn1.m(bwr.h().e().businessId)) {
            s0m.B().N0(this.context).T(bwr.h().e().screenshot).into(imageView2);
        }
        return imageView2;
    }
}
