package com.taobao.android.abilityidl.ability;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import tb.t2o;

/* compiled from: Taobao */
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.TYPE_USE})
@kotlin.annotation.Target(allowedTargets = {AnnotationTarget.VALUE_PARAMETER, AnnotationTarget.FIELD, AnnotationTarget.FUNCTION, AnnotationTarget.CLASS, AnnotationTarget.TYPE})
@Retention(RetentionPolicy.SOURCE)
@kotlin.annotation.Retention(AnnotationRetention.SOURCE)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public @interface ErrorViewWidgetUserInterfaceStyle {
    public static final a Companion = a.$$INSTANCE;
    public static final String DARK = "DARK";
    public static final String LIGHT = "LIGHT";
    public static final String UNSPECIFIED = "UNSPECIFIED";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class a {
        public static final /* synthetic */ a $$INSTANCE = new a();
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final String DARK = "DARK";
        public static final String LIGHT = "LIGHT";
        public static final String UNSPECIFIED = "UNSPECIFIED";

        static {
            t2o.a(525336884);
        }

        public final String a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("ad0c5f3b", new Object[]{this, str});
            }
            if (str != null) {
                int hashCode = str.hashCode();
                if (hashCode != 2090870) {
                    if (hashCode != 72432886) {
                        if (hashCode == 526786327 && str.equals("UNSPECIFIED")) {
                            return "UNSPECIFIED";
                        }
                    } else if (str.equals("LIGHT")) {
                        return "LIGHT";
                    }
                } else if (str.equals("DARK")) {
                    return "DARK";
                }
            }
            return null;
        }
    }
}
