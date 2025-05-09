package com.taobao.weex.ui.animation;

import android.util.Property;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class CameraDistanceProperty extends Property<View, Float> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "CameraDistance";
    private static CameraDistanceProperty instance;

    static {
        t2o.a(985661669);
    }

    private CameraDistanceProperty() {
        super(Float.class, TAG);
    }

    public static Property<View, Float> getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Property) ipChange.ipc$dispatch("735939c1", new Object[0]);
        }
        return instance;
    }

    public static /* synthetic */ Object ipc$super(CameraDistanceProperty cameraDistanceProperty, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/weex/ui/animation/CameraDistanceProperty");
    }

    public Float get(View view) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Float) ipChange.ipc$dispatch("abe63b1e", new Object[]{this, view}) : Float.valueOf(view.getCameraDistance());
    }

    public void set(View view, Float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0588b0", new Object[]{this, view, f});
        } else {
            view.setCameraDistance(f.floatValue());
        }
    }
}
