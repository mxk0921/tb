package com.etao.feimagesearch.ui.coordinatorcard;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.annotation.AnnotationRetention;
import kotlin.jvm.JvmStatic;
import tb.ckf;
import tb.t2o;
import tb.wsq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class FactoryType {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final FactoryType INSTANCE = new FactoryType();
    public static final String TYPE_INVALID = "invalid";
    public static final String TYPE_MUISE = "ms";
    public static final String TYPE_NATIVE = "nt";

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public @interface TypeAnno {
    }

    static {
        t2o.a(481297558);
    }

    @JvmStatic
    public static final String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e5f107d", new Object[]{str});
        }
        if (str == null || TextUtils.isEmpty(str)) {
            return TYPE_INVALID;
        }
        String str2 = (String) wsq.z0(str, new String[]{"_"}, false, 0, 6, null).get(0);
        String str3 = "ms";
        if (!ckf.b(str2, str3)) {
            str3 = "nt";
            if (!ckf.b(str2, str3)) {
                return TYPE_INVALID;
            }
        }
        return str3;
    }
}
