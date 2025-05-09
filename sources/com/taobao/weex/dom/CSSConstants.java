package com.taobao.weex.dom;

import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class CSSConstants {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final float UNDEFINED = Float.NaN;

    static {
        t2o.a(985661590);
    }

    public static boolean isUndefined(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("711fec97", new Object[]{new Float(f)})).booleanValue();
        }
        if (Float.compare(f, Float.NaN) == 0) {
            return true;
        }
        return false;
    }
}
