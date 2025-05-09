package com.taobao.kmp.nexus.arch.openArch.dto_and_do.response_declared_do;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import tb.a07;
import tb.a0g;
import tb.dun;
import tb.mzf;
import tb.qjg;
import tb.t2o;
import tb.yj4;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001e\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0019\b\u0007\u0018\u0000 =2\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0001>B\u0007¢\u0006\u0004\b\u0004\u0010\u0005R/\u0010\u000e\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR/\u0010\u0012\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\t\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR/\u0010\u0014\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\t\u001a\u0004\b\u0014\u0010\u000b\"\u0004\b\u0015\u0010\rR/\u0010\u0019\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0016\u0010\t\u001a\u0004\b\u0017\u0010\u000b\"\u0004\b\u0018\u0010\rR/\u0010\u001b\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001a\u0010\t\u001a\u0004\b\u001b\u0010\u000b\"\u0004\b\u001c\u0010\rR/\u0010 \u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001d\u0010\t\u001a\u0004\b\u001e\u0010\u000b\"\u0004\b\u001f\u0010\rR/\u0010$\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b!\u0010\t\u001a\u0004\b\"\u0010\u000b\"\u0004\b#\u0010\rRG\u0010,\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020&\u0018\u00010%2\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020&\u0018\u00010%8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b'\u0010\t\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+RG\u00100\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020&\u0018\u00010%2\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020&\u0018\u00010%8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b-\u0010\t\u001a\u0004\b.\u0010)\"\u0004\b/\u0010+R/\u00104\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b1\u0010\t\u001a\u0004\b2\u0010\u000b\"\u0004\b3\u0010\rR/\u00108\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b5\u0010\t\u001a\u0004\b6\u0010\u000b\"\u0004\b7\u0010\rR/\u0010<\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b9\u0010\t\u001a\u0004\b:\u0010\u000b\"\u0004\b;\u0010\r¨\u0006?"}, d2 = {"Lcom/taobao/kmp/nexus/arch/openArch/dto_and_do/response_declared_do/TimeMovingPlayInfo;", "Ltb/mzf;", "Ljava/io/Serializable;", "Lcom/taobao/uniinfra_kmp/common_utils/serialization/Serializable;", "<init>", "()V", "", "<set-?>", "timeMovingPageUrl$delegate", "Ltb/qjg;", "getTimeMovingPageUrl", "()Ljava/lang/String;", "setTimeMovingPageUrl", "(Ljava/lang/String;)V", "timeMovingPageUrl", "timeMovingId$delegate", "getTimeMovingId", "setTimeMovingId", "timeMovingId", "isMounting$delegate", "isMounting", "setMounting", "spotDuration$delegate", "getSpotDuration", "setSpotDuration", "spotDuration", "isSpeaking$delegate", "isSpeaking", "setSpeaking", "encryptAnchorId$delegate", "getEncryptAnchorId", "setEncryptAnchorId", "encryptAnchorId", "accountId$delegate", "getAccountId", "setAccountId", "accountId", "", "", "timeMoveCustomedDataDic$delegate", "getTimeMoveCustomedDataDic", "()Ljava/util/Map;", "setTimeMoveCustomedDataDic", "(Ljava/util/Map;)V", "timeMoveCustomedDataDic", "spfPlayVideo$delegate", "getSpfPlayVideo", "setSpfPlayVideo", "spfPlayVideo", "liveGuideTxt$delegate", "getLiveGuideTxt", "setLiveGuideTxt", "liveGuideTxt", "keyPointId$delegate", "getKeyPointId", "setKeyPointId", "keyPointId", "sjsdItemId$delegate", "getSjsdItemId", "setSjsdItemId", yj4.PARAM_SJSD_ITEM_ID, "Companion", "a", "nexus_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class TimeMovingPlayInfo extends mzf implements Serializable {
    public static final /* synthetic */ a0g<Object>[] $$delegatedProperties;
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    private final qjg timeMovingPageUrl$delegate = new qjg(null, this, TimeMovingPlayInfo$timeMovingPageUrl$2.INSTANCE);
    private final qjg timeMovingId$delegate = new qjg(null, this, TimeMovingPlayInfo$timeMovingId$2.INSTANCE);
    private final qjg isMounting$delegate = new qjg(null, this, TimeMovingPlayInfo$isMounting$2.INSTANCE);
    private final qjg spotDuration$delegate = new qjg(null, this, TimeMovingPlayInfo$spotDuration$2.INSTANCE);
    private final qjg isSpeaking$delegate = new qjg(null, this, TimeMovingPlayInfo$isSpeaking$2.INSTANCE);
    private final qjg encryptAnchorId$delegate = new qjg(null, this, TimeMovingPlayInfo$encryptAnchorId$2.INSTANCE);
    private final qjg accountId$delegate = new qjg(null, this, TimeMovingPlayInfo$accountId$2.INSTANCE);
    private final qjg timeMoveCustomedDataDic$delegate = new qjg(null, this, TimeMovingPlayInfo$timeMoveCustomedDataDic$2.INSTANCE);
    private final qjg spfPlayVideo$delegate = new qjg(null, this, TimeMovingPlayInfo$spfPlayVideo$2.INSTANCE);
    private final qjg liveGuideTxt$delegate = new qjg(null, this, TimeMovingPlayInfo$liveGuideTxt$2.INSTANCE);
    private final qjg keyPointId$delegate = new qjg(null, this, TimeMovingPlayInfo$keyPointId$2.INSTANCE);
    private final qjg sjsdItemId$delegate = new qjg(null, this, TimeMovingPlayInfo$sjsdItemId$2.INSTANCE);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        static {
            t2o.a(1004536450);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    public static /* synthetic */ Object ipc$super(TimeMovingPlayInfo timeMovingPlayInfo, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/kmp/nexus/arch/openArch/dto_and_do/response_declared_do/TimeMovingPlayInfo");
    }

    public final String getAccountId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("387f3cc7", new Object[]{this});
        }
        return (String) this.accountId$delegate.b(this, $$delegatedProperties[6]);
    }

    public final String getEncryptAnchorId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a7f0e5a", new Object[]{this});
        }
        return (String) this.encryptAnchorId$delegate.b(this, $$delegatedProperties[5]);
    }

    public final String getKeyPointId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2595acd7", new Object[]{this});
        }
        return (String) this.keyPointId$delegate.b(this, $$delegatedProperties[10]);
    }

    public final String getLiveGuideTxt() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("35242763", new Object[]{this});
        }
        return (String) this.liveGuideTxt$delegate.b(this, $$delegatedProperties[9]);
    }

    public final String getSjsdItemId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b140f9ed", new Object[]{this});
        }
        return (String) this.sjsdItemId$delegate.b(this, $$delegatedProperties[11]);
    }

    public final Map<String, Object> getSpfPlayVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("4019a5f0", new Object[]{this});
        }
        return (Map) this.spfPlayVideo$delegate.b(this, $$delegatedProperties[8]);
    }

    public final String getSpotDuration() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("18f074d", new Object[]{this});
        }
        return (String) this.spotDuration$delegate.b(this, $$delegatedProperties[3]);
    }

    public final Map<String, Object> getTimeMoveCustomedDataDic() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("59caacac", new Object[]{this});
        }
        return (Map) this.timeMoveCustomedDataDic$delegate.b(this, $$delegatedProperties[7]);
    }

    public final String getTimeMovingId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ff62280d", new Object[]{this});
        }
        return (String) this.timeMovingId$delegate.b(this, $$delegatedProperties[1]);
    }

    public final String getTimeMovingPageUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5c1100aa", new Object[]{this});
        }
        return (String) this.timeMovingPageUrl$delegate.b(this, $$delegatedProperties[0]);
    }

    public final String isMounting() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b1132466", new Object[]{this});
        }
        return (String) this.isMounting$delegate.b(this, $$delegatedProperties[2]);
    }

    public final String isSpeaking() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("46f68d1f", new Object[]{this});
        }
        return (String) this.isSpeaking$delegate.b(this, $$delegatedProperties[4]);
    }

    public final void setAccountId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59a617f7", new Object[]{this, str});
        } else {
            this.accountId$delegate.a(this, $$delegatedProperties[6], str);
        }
    }

    public final void setEncryptAnchorId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff8a91c4", new Object[]{this, str});
        } else {
            this.encryptAnchorId$delegate.a(this, $$delegatedProperties[5], str);
        }
    }

    public final void setKeyPointId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("409757f", new Object[]{this, str});
        } else {
            this.keyPointId$delegate.a(this, $$delegatedProperties[10], str);
        }
    }

    public final void setLiveGuideTxt(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffff3973", new Object[]{this, str});
        } else {
            this.liveGuideTxt$delegate.a(this, $$delegatedProperties[9], str);
        }
    }

    public final void setMounting(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92232ffc", new Object[]{this, str});
        } else {
            this.isMounting$delegate.a(this, $$delegatedProperties[2], str);
        }
    }

    public final void setSjsdItemId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edc7cb29", new Object[]{this, str});
        } else {
            this.sjsdItemId$delegate.a(this, $$delegatedProperties[11], str);
        }
    }

    public final void setSpeaking(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8acde63", new Object[]{this, str});
        } else {
            this.isSpeaking$delegate.a(this, $$delegatedProperties[4], str);
        }
    }

    public final void setSpfPlayVideo(Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9859f09e", new Object[]{this, map});
        } else {
            this.spfPlayVideo$delegate.a(this, $$delegatedProperties[8], map);
        }
    }

    public final void setSpotDuration(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0f056c9", new Object[]{this, str});
        } else {
            this.spotDuration$delegate.a(this, $$delegatedProperties[3], str);
        }
    }

    public final void setTimeMoveCustomedDataDic(Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16d5adfa", new Object[]{this, map});
        } else {
            this.timeMoveCustomedDataDic$delegate.a(this, $$delegatedProperties[7], map);
        }
    }

    public final void setTimeMovingId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d814e09", new Object[]{this, str});
        } else {
            this.timeMovingId$delegate.a(this, $$delegatedProperties[1], str);
        }
    }

    public final void setTimeMovingPageUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("238e1c74", new Object[]{this, str});
        } else {
            this.timeMovingPageUrl$delegate.a(this, $$delegatedProperties[0], str);
        }
    }

    static {
        t2o.a(1004536449);
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(TimeMovingPlayInfo.class, "timeMovingPageUrl", "getTimeMovingPageUrl()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl);
        MutablePropertyReference1Impl mutablePropertyReference1Impl2 = new MutablePropertyReference1Impl(TimeMovingPlayInfo.class, "timeMovingId", "getTimeMovingId()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl2);
        MutablePropertyReference1Impl mutablePropertyReference1Impl3 = new MutablePropertyReference1Impl(TimeMovingPlayInfo.class, "isMounting", "isMounting()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl3);
        MutablePropertyReference1Impl mutablePropertyReference1Impl4 = new MutablePropertyReference1Impl(TimeMovingPlayInfo.class, "spotDuration", "getSpotDuration()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl4);
        MutablePropertyReference1Impl mutablePropertyReference1Impl5 = new MutablePropertyReference1Impl(TimeMovingPlayInfo.class, "isSpeaking", "isSpeaking()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl5);
        MutablePropertyReference1Impl mutablePropertyReference1Impl6 = new MutablePropertyReference1Impl(TimeMovingPlayInfo.class, "encryptAnchorId", "getEncryptAnchorId()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl6);
        MutablePropertyReference1Impl mutablePropertyReference1Impl7 = new MutablePropertyReference1Impl(TimeMovingPlayInfo.class, "accountId", "getAccountId()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl7);
        MutablePropertyReference1Impl mutablePropertyReference1Impl8 = new MutablePropertyReference1Impl(TimeMovingPlayInfo.class, "timeMoveCustomedDataDic", "getTimeMoveCustomedDataDic()Ljava/util/Map;", 0);
        dun.f(mutablePropertyReference1Impl8);
        MutablePropertyReference1Impl mutablePropertyReference1Impl9 = new MutablePropertyReference1Impl(TimeMovingPlayInfo.class, "spfPlayVideo", "getSpfPlayVideo()Ljava/util/Map;", 0);
        dun.f(mutablePropertyReference1Impl9);
        MutablePropertyReference1Impl mutablePropertyReference1Impl10 = new MutablePropertyReference1Impl(TimeMovingPlayInfo.class, "liveGuideTxt", "getLiveGuideTxt()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl10);
        MutablePropertyReference1Impl mutablePropertyReference1Impl11 = new MutablePropertyReference1Impl(TimeMovingPlayInfo.class, "keyPointId", "getKeyPointId()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl11);
        MutablePropertyReference1Impl mutablePropertyReference1Impl12 = new MutablePropertyReference1Impl(TimeMovingPlayInfo.class, yj4.PARAM_SJSD_ITEM_ID, "getSjsdItemId()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl12);
        $$delegatedProperties = new a0g[]{mutablePropertyReference1Impl, mutablePropertyReference1Impl2, mutablePropertyReference1Impl3, mutablePropertyReference1Impl4, mutablePropertyReference1Impl5, mutablePropertyReference1Impl6, mutablePropertyReference1Impl7, mutablePropertyReference1Impl8, mutablePropertyReference1Impl9, mutablePropertyReference1Impl10, mutablePropertyReference1Impl11, mutablePropertyReference1Impl12};
    }
}
