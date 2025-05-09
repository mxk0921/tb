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
public @interface ContainerRendererMode {
    public static final a Companion = a.$$INSTANCE;
    public static final String dx = "dx";
    public static final String fcanvas = "fcanvas";
    public static final String web = "web";
    public static final String weex = "weex";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class a {
        public static final /* synthetic */ a $$INSTANCE = new a();
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final String dx = "dx";
        public static final String fcanvas = "fcanvas";
        public static final String web = "web";
        public static final String weex = "weex";

        static {
            t2o.a(525336810);
        }

        public final String a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("ad0c5f3b", new Object[]{this, str});
            }
            if (str != null) {
                int hashCode = str.hashCode();
                if (hashCode != -1036644034) {
                    if (hashCode != 3220) {
                        if (hashCode != 117588) {
                            if (hashCode == 3645441 && str.equals("weex")) {
                                return "weex";
                            }
                        } else if (str.equals("web")) {
                            return "web";
                        }
                    } else if (str.equals("dx")) {
                        return "dx";
                    }
                } else if (str.equals("fcanvas")) {
                    return "fcanvas";
                }
            }
            return null;
        }
    }
}
