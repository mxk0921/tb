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
public @interface UTCommitAction {
    public static final a Companion = a.$$INSTANCE;
    public static final String click = "click";
    public static final String componentExposure = "componentExposure";
    public static final String custom = "custom";
    public static final String pageExposure = "pageExposure";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class a {
        public static final /* synthetic */ a $$INSTANCE = new a();
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final String click = "click";
        public static final String componentExposure = "componentExposure";
        public static final String custom = "custom";
        public static final String pageExposure = "pageExposure";

        static {
            t2o.a(525337589);
        }

        public final String a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("ad0c5f3b", new Object[]{this, str});
            }
            if (str != null) {
                switch (str.hashCode()) {
                    case -1349088399:
                        if (str.equals("custom")) {
                            return "custom";
                        }
                        break;
                    case 94750088:
                        if (str.equals("click")) {
                            return "click";
                        }
                        break;
                    case 570049718:
                        if (str.equals("pageExposure")) {
                            return "pageExposure";
                        }
                        break;
                    case 1113764132:
                        if (str.equals("componentExposure")) {
                            return "componentExposure";
                        }
                        break;
                }
            }
            return null;
        }
    }
}
