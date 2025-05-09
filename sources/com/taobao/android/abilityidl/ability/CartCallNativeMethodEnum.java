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
public @interface CartCallNativeMethodEnum {
    public static final a Companion = a.$$INSTANCE;
    public static final String aliPayService = "aliPayService";
    public static final String bizReady = "bizReady";
    public static final String closeStdPop = "closeStdPop";
    public static final String downgradeNative = "downgradeNative";
    public static final String getCloseDate = "getCloseDate";
    public static final String getFirstCache = "getFirstCache";
    public static final String hideLoading = "hideLoading";
    public static final String preloadImages = "preloadImages";
    public static final String renderSuccess = "renderSuccess";
    public static final String saveInstanceState = "saveInstanceState";
    public static final String setCloseDate = "setCloseDate";
    public static final String setFirstCache = "setFirstCache";
    public static final String showIndustrySku = "showIndustrySku";
    public static final String showItemOperateDialog = "showItemOperateDialog";
    public static final String showLoading = "showLoading";
    public static final String showStdPop = "showStdPop";
    public static final String updateCartTabBadge = "updateCartTabBadge";
    public static final String updateGroupName = "updateGroupName";
    public static final String updatePopState = "updatePopState";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class a {
        public static final /* synthetic */ a $$INSTANCE = new a();
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final String aliPayService = "aliPayService";
        public static final String bizReady = "bizReady";
        public static final String closeStdPop = "closeStdPop";
        public static final String downgradeNative = "downgradeNative";
        public static final String getCloseDate = "getCloseDate";
        public static final String getFirstCache = "getFirstCache";
        public static final String hideLoading = "hideLoading";
        public static final String preloadImages = "preloadImages";
        public static final String renderSuccess = "renderSuccess";
        public static final String saveInstanceState = "saveInstanceState";
        public static final String setCloseDate = "setCloseDate";
        public static final String setFirstCache = "setFirstCache";
        public static final String showIndustrySku = "showIndustrySku";
        public static final String showItemOperateDialog = "showItemOperateDialog";
        public static final String showLoading = "showLoading";
        public static final String showStdPop = "showStdPop";
        public static final String updateCartTabBadge = "updateCartTabBadge";
        public static final String updateGroupName = "updateGroupName";
        public static final String updatePopState = "updatePopState";

        static {
            t2o.a(525336761);
        }

        public final String a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("ad0c5f3b", new Object[]{this, str});
            }
            if (str != null) {
                switch (str.hashCode()) {
                    case -492570864:
                        if (str.equals("getCloseDate")) {
                            return "getCloseDate";
                        }
                        break;
                    case -484978008:
                        if (str.equals("getFirstCache")) {
                            return "getFirstCache";
                        }
                        break;
                    case -296564809:
                        if (str.equals("updateCartTabBadge")) {
                            return "updateCartTabBadge";
                        }
                        break;
                    case -277657887:
                        if (str.equals("updateGroupName")) {
                            return "updateGroupName";
                        }
                        break;
                    case 172561734:
                        if (str.equals("closeStdPop")) {
                            return "closeStdPop";
                        }
                        break;
                    case 216239514:
                        if (str.equals("hideLoading")) {
                            return "hideLoading";
                        }
                        break;
                    case 289153204:
                        if (str.equals("setFirstCache")) {
                            return "setFirstCache";
                        }
                        break;
                    case 305496300:
                        if (str.equals("downgradeNative")) {
                            return "downgradeNative";
                        }
                        break;
                    case 415651455:
                        if (str.equals("saveInstanceState")) {
                            return "saveInstanceState";
                        }
                        break;
                    case 674269483:
                        if (str.equals("aliPayService")) {
                            return "aliPayService";
                        }
                        break;
                    case 724809599:
                        if (str.equals("showLoading")) {
                            return "showLoading";
                        }
                        break;
                    case 782662283:
                        if (str.equals("showStdPop")) {
                            return "showStdPop";
                        }
                        break;
                    case 1016031772:
                        if (str.equals("showItemOperateDialog")) {
                            return "showItemOperateDialog";
                        }
                        break;
                    case 1056421764:
                        if (str.equals("setCloseDate")) {
                            return "setCloseDate";
                        }
                        break;
                    case 1266917456:
                        if (str.equals("bizReady")) {
                            return "bizReady";
                        }
                        break;
                    case 1511764137:
                        if (str.equals("updatePopState")) {
                            return "updatePopState";
                        }
                        break;
                    case 1536672141:
                        if (str.equals("renderSuccess")) {
                            return "renderSuccess";
                        }
                        break;
                    case 1716613601:
                        if (str.equals("preloadImages")) {
                            return "preloadImages";
                        }
                        break;
                    case 2136361762:
                        if (str.equals("showIndustrySku")) {
                            return "showIndustrySku";
                        }
                        break;
                }
            }
            return null;
        }
    }
}
