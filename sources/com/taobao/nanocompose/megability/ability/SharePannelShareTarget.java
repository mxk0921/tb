package com.taobao.nanocompose.megability.ability;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import tb.a07;
import tb.fg8;
import tb.t2o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006\u0017"}, d2 = {"Lcom/taobao/nanocompose/megability/ability/SharePannelShareTarget;", "", "", "rawValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "a", "copy", "wxfriend", "wxtimeline", "wxminiapp", "qq", "weibo", "alipay", "dingtalk", "sms", "taopassword", "tyq", "contacts", "megability_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class SharePannelShareTarget extends Enum<SharePannelShareTarget> {
    private static final /* synthetic */ fg8 $ENTRIES;
    private static final /* synthetic */ SharePannelShareTarget[] $VALUES;
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String rawValue;
    public static final SharePannelShareTarget copy = new SharePannelShareTarget("copy", 0, "copy");
    public static final SharePannelShareTarget wxfriend = new SharePannelShareTarget("wxfriend", 1, "wxfriend");
    public static final SharePannelShareTarget wxtimeline = new SharePannelShareTarget("wxtimeline", 2, "wxtimeline");
    public static final SharePannelShareTarget wxminiapp = new SharePannelShareTarget("wxminiapp", 3, "wxminiapp");
    public static final SharePannelShareTarget qq = new SharePannelShareTarget("qq", 4, "qq");
    public static final SharePannelShareTarget weibo = new SharePannelShareTarget("weibo", 5, "weibo");
    public static final SharePannelShareTarget alipay = new SharePannelShareTarget("alipay", 6, "alipay");
    public static final SharePannelShareTarget dingtalk = new SharePannelShareTarget("dingtalk", 7, "dingtalk");
    public static final SharePannelShareTarget sms = new SharePannelShareTarget("sms", 8, "sms");
    public static final SharePannelShareTarget taopassword = new SharePannelShareTarget("taopassword", 9, "taopassword");
    public static final SharePannelShareTarget tyq = new SharePannelShareTarget("tyq", 10, "tyq");
    public static final SharePannelShareTarget contacts = new SharePannelShareTarget("contacts", 11, "contacts");
    public static final a Companion = new a(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(1022361919);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    private static final /* synthetic */ SharePannelShareTarget[] $values() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SharePannelShareTarget[]) ipChange.ipc$dispatch("4af42b53", new Object[0]) : new SharePannelShareTarget[]{copy, wxfriend, wxtimeline, wxminiapp, qq, weibo, alipay, dingtalk, sms, taopassword, tyq, contacts};
    }

    static {
        SharePannelShareTarget[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private SharePannelShareTarget(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static fg8<SharePannelShareTarget> getEntries() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fg8) ipChange.ipc$dispatch("24e60520", new Object[0]);
        }
        return $ENTRIES;
    }

    public static /* synthetic */ Object ipc$super(SharePannelShareTarget sharePannelShareTarget, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/nanocompose/megability/ability/SharePannelShareTarget");
    }

    public static SharePannelShareTarget valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharePannelShareTarget) ipChange.ipc$dispatch("39d718fe", new Object[]{str});
        }
        return (SharePannelShareTarget) Enum.valueOf(SharePannelShareTarget.class, str);
    }

    public static SharePannelShareTarget[] values() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharePannelShareTarget[]) ipChange.ipc$dispatch("2dea612f", new Object[0]);
        }
        return (SharePannelShareTarget[]) $VALUES.clone();
    }

    public final String getRawValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("31a878ba", new Object[]{this});
        }
        return this.rawValue;
    }
}
