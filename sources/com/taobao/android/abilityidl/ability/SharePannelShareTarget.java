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
public @interface SharePannelShareTarget {
    public static final a Companion = a.$$INSTANCE;
    public static final String alipay = "alipay";
    public static final String contacts = "contacts";
    public static final String copy = "copy";
    public static final String dingtalk = "dingtalk";
    public static final String qq = "qq";
    public static final String sms = "sms";
    public static final String taopassword = "taopassword";
    public static final String tyq = "tyq";
    public static final String weibo = "weibo";
    public static final String wxfriend = "wxfriend";
    public static final String wxminiapp = "wxminiapp";
    public static final String wxtimeline = "wxtimeline";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class a {
        public static final /* synthetic */ a $$INSTANCE = new a();
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final String alipay = "alipay";
        public static final String contacts = "contacts";
        public static final String copy = "copy";
        public static final String dingtalk = "dingtalk";
        public static final String qq = "qq";
        public static final String sms = "sms";
        public static final String taopassword = "taopassword";
        public static final String tyq = "tyq";
        public static final String weibo = "weibo";
        public static final String wxfriend = "wxfriend";
        public static final String wxminiapp = "wxminiapp";
        public static final String wxtimeline = "wxtimeline";

        static {
            t2o.a(525337513);
        }

        public final String a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("ad0c5f3b", new Object[]{this, str});
            }
            if (str != null) {
                switch (str.hashCode()) {
                    case -1838124510:
                        if (str.equals("wxtimeline")) {
                            return "wxtimeline";
                        }
                        break;
                    case -1716864963:
                        if (str.equals("taopassword")) {
                            return "taopassword";
                        }
                        break;
                    case -1414960566:
                        if (str.equals("alipay")) {
                            return "alipay";
                        }
                        break;
                    case -904024897:
                        if (str.equals("wxfriend")) {
                            return "wxfriend";
                        }
                        break;
                    case -590347159:
                        if (str.equals("wxminiapp")) {
                            return "wxminiapp";
                        }
                        break;
                    case -567451565:
                        if (str.equals("contacts")) {
                            return "contacts";
                        }
                        break;
                    case 3616:
                        if (str.equals("qq")) {
                            return "qq";
                        }
                        break;
                    case 114009:
                        if (str.equals("sms")) {
                            return "sms";
                        }
                        break;
                    case 115340:
                        if (str.equals("tyq")) {
                            return "tyq";
                        }
                        break;
                    case 3059573:
                        if (str.equals("copy")) {
                            return "copy";
                        }
                        break;
                    case 113011944:
                        if (str.equals("weibo")) {
                            return "weibo";
                        }
                        break;
                    case 133862058:
                        if (str.equals("dingtalk")) {
                            return "dingtalk";
                        }
                        break;
                }
            }
            return null;
        }
    }
}
