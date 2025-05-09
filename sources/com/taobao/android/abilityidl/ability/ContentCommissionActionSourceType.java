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
public @interface ContentCommissionActionSourceType {
    public static final String ACTION_ADD_CART = "ACTION_ADD_CART";
    public static final String ACTION_CREATE_ORDER = "ACTION_CREATE_ORDER";
    public static final String ACTION_ENTER_LIVE = "ACTION_ENTER_LIVE";
    public static final String ACTION_GOTO_DETAIL = "ACTION_GOTO_DETAIL";
    public static final a Companion = a.$$INSTANCE;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class a {
        public static final /* synthetic */ a $$INSTANCE = new a();
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final String ACTION_ADD_CART = "ACTION_ADD_CART";
        public static final String ACTION_CREATE_ORDER = "ACTION_CREATE_ORDER";
        public static final String ACTION_ENTER_LIVE = "ACTION_ENTER_LIVE";
        public static final String ACTION_GOTO_DETAIL = "ACTION_GOTO_DETAIL";

        static {
            t2o.a(525336840);
        }

        public final String a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("ad0c5f3b", new Object[]{this, str});
            }
            if (str != null) {
                switch (str.hashCode()) {
                    case -1982116932:
                        if (str.equals("ACTION_ENTER_LIVE")) {
                            return "ACTION_ENTER_LIVE";
                        }
                        break;
                    case -1351044089:
                        if (str.equals("ACTION_ADD_CART")) {
                            return "ACTION_ADD_CART";
                        }
                        break;
                    case -1272538732:
                        if (str.equals("ACTION_CREATE_ORDER")) {
                            return "ACTION_CREATE_ORDER";
                        }
                        break;
                    case 1605171748:
                        if (str.equals("ACTION_GOTO_DETAIL")) {
                            return "ACTION_GOTO_DETAIL";
                        }
                        break;
                }
            }
            return null;
        }
    }
}
