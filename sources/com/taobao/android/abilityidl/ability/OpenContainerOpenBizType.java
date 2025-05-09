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
public @interface OpenContainerOpenBizType {
    public static final a Companion = a.$$INSTANCE;
    public static final String GAME = "GAME";
    public static final String MINIAPP = "MINIAPP";
    public static final String TINYAPP = "TINYAPP";
    public static final String WIDGET = "WIDGET";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class a {
        public static final /* synthetic */ a $$INSTANCE = new a();
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final String GAME = "GAME";
        public static final String MINIAPP = "MINIAPP";
        public static final String TINYAPP = "TINYAPP";
        public static final String WIDGET = "WIDGET";

        static {
            t2o.a(525337350);
        }

        public final String a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("ad0c5f3b", new Object[]{this, str});
            }
            if (str != null) {
                switch (str.hashCode()) {
                    case -1734717884:
                        if (str.equals("WIDGET")) {
                            return "WIDGET";
                        }
                        break;
                    case -594423039:
                        if (str.equals("TINYAPP")) {
                            return "TINYAPP";
                        }
                        break;
                    case 2180082:
                        if (str.equals("GAME")) {
                            return "GAME";
                        }
                        break;
                    case 1782509130:
                        if (str.equals("MINIAPP")) {
                            return "MINIAPP";
                        }
                        break;
                }
            }
            return null;
        }
    }
}
