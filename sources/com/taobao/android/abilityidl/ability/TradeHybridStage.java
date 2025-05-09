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
public @interface TradeHybridStage {
    public static final a Companion = a.$$INSTANCE;
    public static final String ON_CONFIRM_SUCCESS_FLOAT_CLOSE = "ON_CONFIRM_SUCCESS_FLOAT_CLOSE";
    public static final String ON_CONTAINER_CREATE = "ON_CONTAINER_CREATE";
    public static final String ON_CONTAINER_DESTROY = "ON_CONTAINER_DESTROY";
    public static final String ON_CONTAINER_PAUSE = "ON_CONTAINER_PAUSE";
    public static final String ON_CONTAINER_RESUME = "ON_CONTAINER_RESUME";
    public static final String ON_DATA_PRE_LOAD = "ON_DATA_PRE_LOAD";
    public static final String ON_EVENT_CHAIN_AFTER = "ON_EVENT_CHAIN_AFTER";
    public static final String ON_MEMORY_WARNING = "ON_MEMORY_WARNING";
    public static final String ON_MTOP_END = "ON_MTOP_END";
    public static final String ON_MTOP_START = "ON_MTOP_START";
    public static final String ON_NAV = "ON_NAV";
    public static final String ON_RENDER_END = "ON_RENDER_END";
    public static final String ON_RENDER_START = "ON_RENDER_START";
    public static final String ON_VIEW_SCROLLING = "ON_VIEW_SCROLLING";
    public static final String ON_VIEW_SCROLL_END = "ON_VIEW_SCROLL_END";
    public static final String ON_VIEW_SCROLL_START = "ON_VIEW_SCROLL_START";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class a {
        public static final /* synthetic */ a $$INSTANCE = new a();
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final String ON_CONFIRM_SUCCESS_FLOAT_CLOSE = "ON_CONFIRM_SUCCESS_FLOAT_CLOSE";
        public static final String ON_CONTAINER_CREATE = "ON_CONTAINER_CREATE";
        public static final String ON_CONTAINER_DESTROY = "ON_CONTAINER_DESTROY";
        public static final String ON_CONTAINER_PAUSE = "ON_CONTAINER_PAUSE";
        public static final String ON_CONTAINER_RESUME = "ON_CONTAINER_RESUME";
        public static final String ON_DATA_PRE_LOAD = "ON_DATA_PRE_LOAD";
        public static final String ON_EVENT_CHAIN_AFTER = "ON_EVENT_CHAIN_AFTER";
        public static final String ON_MEMORY_WARNING = "ON_MEMORY_WARNING";
        public static final String ON_MTOP_END = "ON_MTOP_END";
        public static final String ON_MTOP_START = "ON_MTOP_START";
        public static final String ON_NAV = "ON_NAV";
        public static final String ON_RENDER_END = "ON_RENDER_END";
        public static final String ON_RENDER_START = "ON_RENDER_START";
        public static final String ON_VIEW_SCROLLING = "ON_VIEW_SCROLLING";
        public static final String ON_VIEW_SCROLL_END = "ON_VIEW_SCROLL_END";
        public static final String ON_VIEW_SCROLL_START = "ON_VIEW_SCROLL_START";

        static {
            t2o.a(525337568);
        }

        public final String a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("ad0c5f3b", new Object[]{this, str});
            }
            if (str != null) {
                switch (str.hashCode()) {
                    case -1958322525:
                        if (str.equals("ON_NAV")) {
                            return "ON_NAV";
                        }
                        break;
                    case -1946079196:
                        if (str.equals("ON_MTOP_END")) {
                            return "ON_MTOP_END";
                        }
                        break;
                    case -1858225813:
                        if (str.equals("ON_MTOP_START")) {
                            return "ON_MTOP_START";
                        }
                        break;
                    case -1751682830:
                        if (str.equals("ON_RENDER_END")) {
                            return "ON_RENDER_END";
                        }
                        break;
                    case -1746197992:
                        if (str.equals("ON_CONTAINER_PAUSE")) {
                            return "ON_CONTAINER_PAUSE";
                        }
                        break;
                    case -1461108406:
                        if (str.equals("ON_VIEW_SCROLL_START")) {
                            return "ON_VIEW_SCROLL_START";
                        }
                        break;
                    case -765779005:
                        if (str.equals("ON_VIEW_SCROLL_END")) {
                            return "ON_VIEW_SCROLL_END";
                        }
                        break;
                    case -711452772:
                        if (str.equals("ON_CONTAINER_DESTROY")) {
                            return "ON_CONTAINER_DESTROY";
                        }
                        break;
                    case -412890185:
                        if (str.equals("ON_DATA_PRE_LOAD")) {
                            return "ON_DATA_PRE_LOAD";
                        }
                        break;
                    case -301818085:
                        if (str.equals("ON_VIEW_SCROLLING")) {
                            return "ON_VIEW_SCROLLING";
                        }
                        break;
                    case 42599738:
                        if (str.equals("ON_CONFIRM_SUCCESS_FLOAT_CLOSE")) {
                            return "ON_CONFIRM_SUCCESS_FLOAT_CLOSE";
                        }
                        break;
                    case 273088185:
                        if (str.equals("ON_RENDER_START")) {
                            return "ON_RENDER_START";
                        }
                        break;
                    case 956533918:
                        if (str.equals("ON_MEMORY_WARNING")) {
                            return "ON_MEMORY_WARNING";
                        }
                        break;
                    case 1345464570:
                        if (str.equals("ON_CONTAINER_CREATE")) {
                            return "ON_CONTAINER_CREATE";
                        }
                        break;
                    case 1763332139:
                        if (str.equals("ON_CONTAINER_RESUME")) {
                            return "ON_CONTAINER_RESUME";
                        }
                        break;
                    case 2021187065:
                        if (str.equals("ON_EVENT_CHAIN_AFTER")) {
                            return "ON_EVENT_CHAIN_AFTER";
                        }
                        break;
                }
            }
            return null;
        }
    }
}
