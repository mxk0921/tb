package com.taobao.weex.common;

import android.widget.ImageView;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class WXImageStrategy {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int blurRadius;
    public ImageListener imageListener;
    public String instanceId;
    @Deprecated
    public boolean isClipping;
    public boolean isSharpen;
    public String placeHolder;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface ImageListener {
        void onImageFinish(String str, ImageView imageView, boolean z, Map map);
    }

    static {
        t2o.a(985661572);
    }

    public WXImageStrategy() {
    }

    public ImageListener getImageListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageListener) ipChange.ipc$dispatch("d973c1d6", new Object[]{this});
        }
        return this.imageListener;
    }

    public void setImageListener(ImageListener imageListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42e4db74", new Object[]{this, imageListener});
        } else {
            this.imageListener = imageListener;
        }
    }

    public WXImageStrategy(String str) {
        this.instanceId = str;
    }
}
