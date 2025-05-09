package com.taobao.kmp.kernel.serviceinterface;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.enums.a;
import tb.fg8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, d2 = {"Lcom/taobao/kmp/kernel/serviceinterface/KSSharePanelShareTarget;", "", "rawValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getRawValue", "()Ljava/lang/String;", "copy", "wxfriend", "wxtimeline", "wxminiapp", "qq", "weibo", "alipay", "dingtalk", "sms", "taopassword", "tyq", "contacts", "kernel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class KSSharePanelShareTarget extends Enum<KSSharePanelShareTarget> {
    private static final /* synthetic */ fg8 $ENTRIES;
    private static final /* synthetic */ KSSharePanelShareTarget[] $VALUES;
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String rawValue;
    public static final KSSharePanelShareTarget copy = new KSSharePanelShareTarget("copy", 0, "copy");
    public static final KSSharePanelShareTarget wxfriend = new KSSharePanelShareTarget("wxfriend", 1, "wxfriend");
    public static final KSSharePanelShareTarget wxtimeline = new KSSharePanelShareTarget("wxtimeline", 2, "wxtimeline");
    public static final KSSharePanelShareTarget wxminiapp = new KSSharePanelShareTarget("wxminiapp", 3, "wxminiapp");
    public static final KSSharePanelShareTarget qq = new KSSharePanelShareTarget("qq", 4, "qq");
    public static final KSSharePanelShareTarget weibo = new KSSharePanelShareTarget("weibo", 5, "weibo");
    public static final KSSharePanelShareTarget alipay = new KSSharePanelShareTarget("alipay", 6, "alipay");
    public static final KSSharePanelShareTarget dingtalk = new KSSharePanelShareTarget("dingtalk", 7, "dingtalk");
    public static final KSSharePanelShareTarget sms = new KSSharePanelShareTarget("sms", 8, "sms");
    public static final KSSharePanelShareTarget taopassword = new KSSharePanelShareTarget("taopassword", 9, "taopassword");
    public static final KSSharePanelShareTarget tyq = new KSSharePanelShareTarget("tyq", 10, "tyq");
    public static final KSSharePanelShareTarget contacts = new KSSharePanelShareTarget("contacts", 11, "contacts");

    private static final /* synthetic */ KSSharePanelShareTarget[] $values() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (KSSharePanelShareTarget[]) ipChange.ipc$dispatch("b310a90b", new Object[0]) : new KSSharePanelShareTarget[]{copy, wxfriend, wxtimeline, wxminiapp, qq, weibo, alipay, dingtalk, sms, taopassword, tyq, contacts};
    }

    static {
        KSSharePanelShareTarget[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private KSSharePanelShareTarget(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static fg8<KSSharePanelShareTarget> getEntries() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fg8) ipChange.ipc$dispatch("24e60520", new Object[0]);
        }
        return $ENTRIES;
    }

    public static /* synthetic */ Object ipc$super(KSSharePanelShareTarget kSSharePanelShareTarget, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/kmp/kernel/serviceinterface/KSSharePanelShareTarget");
    }

    public static KSSharePanelShareTarget valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (KSSharePanelShareTarget) ipChange.ipc$dispatch("62990576", new Object[]{str});
        }
        return (KSSharePanelShareTarget) Enum.valueOf(KSSharePanelShareTarget.class, str);
    }

    public static KSSharePanelShareTarget[] values() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (KSSharePanelShareTarget[]) ipChange.ipc$dispatch("6e92a5e7", new Object[0]);
        }
        return (KSSharePanelShareTarget[]) $VALUES.clone();
    }

    public final String getRawValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("31a878ba", new Object[]{this});
        }
        return this.rawValue;
    }
}
