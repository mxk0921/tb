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
public @interface ErrorViewWidgetButtonStyle {
    public static final String BUTTON_STYLE_ALL = "BUTTON_STYLE_ALL";
    public static final String BUTTON_STYLE_FEEDBACK = "BUTTON_STYLE_FEEDBACK";
    public static final String BUTTON_STYLE_NONE = "BUTTON_STYLE_NONE";
    public static final String BUTTON_STYLE_NORMAL_ACTION = "BUTTON_STYLE_NORMAL_ACTION";
    public static final a Companion = a.$$INSTANCE;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class a {
        public static final /* synthetic */ a $$INSTANCE = new a();
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final String BUTTON_STYLE_ALL = "BUTTON_STYLE_ALL";
        public static final String BUTTON_STYLE_FEEDBACK = "BUTTON_STYLE_FEEDBACK";
        public static final String BUTTON_STYLE_NONE = "BUTTON_STYLE_NONE";
        public static final String BUTTON_STYLE_NORMAL_ACTION = "BUTTON_STYLE_NORMAL_ACTION";

        static {
            t2o.a(525336879);
        }

        public final String a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("ad0c5f3b", new Object[]{this, str});
            }
            if (str != null) {
                switch (str.hashCode()) {
                    case -1536117677:
                        if (str.equals("BUTTON_STYLE_NONE")) {
                            return "BUTTON_STYLE_NONE";
                        }
                        break;
                    case -1221345837:
                        if (str.equals("BUTTON_STYLE_NORMAL_ACTION")) {
                            return "BUTTON_STYLE_NORMAL_ACTION";
                        }
                        break;
                    case -742301434:
                        if (str.equals("BUTTON_STYLE_ALL")) {
                            return "BUTTON_STYLE_ALL";
                        }
                        break;
                    case 2050351904:
                        if (str.equals("BUTTON_STYLE_FEEDBACK")) {
                            return "BUTTON_STYLE_FEEDBACK";
                        }
                        break;
                }
            }
            return null;
        }
    }
}
