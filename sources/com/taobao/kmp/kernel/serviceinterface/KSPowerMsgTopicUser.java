package com.taobao.kmp.kernel.serviceinterface;

import com.alipay.mobile.common.logging.util.LoggingSPCache;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import kotlin.Metadata;
import tb.a07;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\u0018\u0000 \u00122\u00060\u0001j\u0002`\u0002:\u0001\u0013B\u0007¢\u0006\u0004\b\u0003\u0010\u0004R$\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0007\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR$\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0007\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/taobao/kmp/kernel/serviceinterface/KSPowerMsgTopicUser;", "Ljava/io/Serializable;", "Lcom/taobao/uniinfra_kmp/common_utils/serialization/Serializable;", "<init>", "()V", "", "addTime", "Ljava/lang/String;", "getAddTime", "()Ljava/lang/String;", "setAddTime", "(Ljava/lang/String;)V", LoggingSPCache.STORAGE_USERID, "getUserID", "setUserID", "nick", "getNick", "setNick", "Companion", "a", "kernel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class KSPowerMsgTopicUser implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    private String addTime;
    private String nick;
    private String userID;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        static {
            t2o.a(1002438945);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(1002438944);
    }

    public final String getAddTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c546a321", new Object[]{this});
        }
        return this.addTime;
    }

    public final String getNick() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9d48c0c0", new Object[]{this});
        }
        return this.nick;
    }

    public final String getUserID() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("87f5e75d", new Object[]{this});
        }
        return this.userID;
    }

    public final void setAddTime(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea9149dd", new Object[]{this, str});
        } else {
            this.addTime = str;
        }
    }

    public final void setNick(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a04e97b6", new Object[]{this, str});
        } else {
            this.nick = str;
        }
    }

    public final void setUserID(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1670f1b9", new Object[]{this, str});
        } else {
            this.userID = str;
        }
    }
}
