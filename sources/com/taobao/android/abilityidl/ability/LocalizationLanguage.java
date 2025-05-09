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
public @interface LocalizationLanguage {
    public static final a Companion = a.$$INSTANCE;
    public static final String en_US = "en_US";
    public static final String ms_MY = "ms_MY";
    public static final String ru_RU = "ru_RU";
    public static final String th_TH = "th_TH";
    public static final String zh_CN = "zh_CN";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class a {
        public static final /* synthetic */ a $$INSTANCE = new a();
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final String en_US = "en_US";
        public static final String ms_MY = "ms_MY";
        public static final String ru_RU = "ru_RU";
        public static final String th_TH = "th_TH";
        public static final String zh_CN = "zh_CN";

        static {
            t2o.a(525337252);
        }

        public final String a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("ad0c5f3b", new Object[]{this, str});
            }
            if (str != null) {
                switch (str.hashCode()) {
                    case 96646644:
                        if (str.equals("en_US")) {
                            return "en_US";
                        }
                        break;
                    case 104183525:
                        if (str.equals("ms_MY")) {
                            return "ms_MY";
                        }
                        break;
                    case 108860863:
                        if (str.equals("ru_RU")) {
                            return "ru_RU";
                        }
                        break;
                    case 110320671:
                        if (str.equals("th_TH")) {
                            return "th_TH";
                        }
                        break;
                    case 115861276:
                        if (str.equals("zh_CN")) {
                            return "zh_CN";
                        }
                        break;
                }
            }
            return null;
        }
    }
}
