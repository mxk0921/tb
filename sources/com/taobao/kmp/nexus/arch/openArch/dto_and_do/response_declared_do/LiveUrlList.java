package com.taobao.kmp.nexus.arch.openArch.dto_and_do.response_declared_do;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.media.MediaConstant;
import java.io.Serializable;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import tb.a07;
import tb.a0g;
import tb.dun;
import tb.mh1;
import tb.mzf;
import tb.qjg;
import tb.t2o;
import tb.yj4;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b<\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\t\b\u0007\u0018\u0000 K2\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0001LB\u0007¢\u0006\u0004\b\u0004\u0010\u0005R/\u0010\u000e\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR/\u0010\u0012\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\t\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR/\u0010\u0016\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\t\u001a\u0004\b\u0014\u0010\u000b\"\u0004\b\u0015\u0010\rR/\u0010\u001a\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\t\u001a\u0004\b\u0018\u0010\u000b\"\u0004\b\u0019\u0010\rR/\u0010\u001e\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\t\u001a\u0004\b\u001c\u0010\u000b\"\u0004\b\u001d\u0010\rR/\u0010\"\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001f\u0010\t\u001a\u0004\b \u0010\u000b\"\u0004\b!\u0010\rR/\u0010&\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b#\u0010\t\u001a\u0004\b$\u0010\u000b\"\u0004\b%\u0010\rR/\u0010*\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b'\u0010\t\u001a\u0004\b(\u0010\u000b\"\u0004\b)\u0010\rR/\u0010.\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b+\u0010\t\u001a\u0004\b,\u0010\u000b\"\u0004\b-\u0010\rR/\u00102\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b/\u0010\t\u001a\u0004\b0\u0010\u000b\"\u0004\b1\u0010\rR/\u00106\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b3\u0010\t\u001a\u0004\b4\u0010\u000b\"\u0004\b5\u0010\rR/\u0010:\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b7\u0010\t\u001a\u0004\b8\u0010\u000b\"\u0004\b9\u0010\rR/\u0010>\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b;\u0010\t\u001a\u0004\b<\u0010\u000b\"\u0004\b=\u0010\rR/\u0010B\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b?\u0010\t\u001a\u0004\b@\u0010\u000b\"\u0004\bA\u0010\rRG\u0010J\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020D\u0018\u00010C2\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020D\u0018\u00010C8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bE\u0010\t\u001a\u0004\bF\u0010G\"\u0004\bH\u0010I¨\u0006M"}, d2 = {"Lcom/taobao/kmp/nexus/arch/openArch/dto_and_do/response_declared_do/LiveUrlList;", "Ltb/mzf;", "Ljava/io/Serializable;", "Lcom/taobao/uniinfra_kmp/common_utils/serialization/Serializable;", "<init>", "()V", "", "<set-?>", "codeLevel$delegate", "Ltb/qjg;", "getCodeLevel", "()Ljava/lang/String;", "setCodeLevel", "(Ljava/lang/String;)V", "codeLevel", "definition$delegate", "getDefinition", "setDefinition", "definition", "flvUrl$delegate", "getFlvUrl", "setFlvUrl", yj4.PARAM_MEDIA_INFO_FLVURL, "hlsUrl$delegate", "getHlsUrl", "setHlsUrl", yj4.PARAM_MEDIA_INFO_HLSURL, "h265Url$delegate", "getH265Url", "setH265Url", yj4.PARAM_MEDIA_INFO_H265URL, "artpUrl$delegate", "getArtpUrl", "setArtpUrl", yj4.PARAM_MEDIA_INFO_ARTPURL, "bfrtcUrl$delegate", "getBfrtcUrl", "setBfrtcUrl", MediaConstant.BFRTC_URL_NAME, "name$delegate", "getName", "setName", "name", "rtcLiveUrl$delegate", "getRtcLiveUrl", "setRtcLiveUrl", MediaConstant.RTCLIVE_URL_NAME, "unit$delegate", "getUnit", "setUnit", mh1.PRICE_UNIT, "unitType$delegate", "getUnitType", "setUnitType", "unitType", "newName$delegate", "getNewName", "setNewName", "newName", "newDefinition$delegate", "getNewDefinition", "setNewDefinition", "newDefinition", "recomm$delegate", "getRecomm", "setRecomm", "recomm", "", "", "liveStreamStatsInfo$delegate", "getLiveStreamStatsInfo", "()Ljava/util/Map;", "setLiveStreamStatsInfo", "(Ljava/util/Map;)V", "liveStreamStatsInfo", "Companion", "a", "nexus_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class LiveUrlList extends mzf implements Serializable {
    public static final /* synthetic */ a0g<Object>[] $$delegatedProperties;
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    private final qjg codeLevel$delegate = new qjg(null, this, LiveUrlList$codeLevel$2.INSTANCE);
    private final qjg definition$delegate = new qjg(null, this, LiveUrlList$definition$2.INSTANCE);
    private final qjg flvUrl$delegate = new qjg(null, this, LiveUrlList$flvUrl$2.INSTANCE);
    private final qjg hlsUrl$delegate = new qjg(null, this, LiveUrlList$hlsUrl$2.INSTANCE);
    private final qjg h265Url$delegate = new qjg(null, this, LiveUrlList$h265Url$2.INSTANCE);
    private final qjg artpUrl$delegate = new qjg(null, this, LiveUrlList$artpUrl$2.INSTANCE);
    private final qjg bfrtcUrl$delegate = new qjg(null, this, LiveUrlList$bfrtcUrl$2.INSTANCE);
    private final qjg name$delegate = new qjg(null, this, LiveUrlList$name$2.INSTANCE);
    private final qjg rtcLiveUrl$delegate = new qjg(null, this, LiveUrlList$rtcLiveUrl$2.INSTANCE);
    private final qjg unit$delegate = new qjg(null, this, LiveUrlList$unit$2.INSTANCE);
    private final qjg unitType$delegate = new qjg(null, this, LiveUrlList$unitType$2.INSTANCE);
    private final qjg newName$delegate = new qjg(null, this, LiveUrlList$newName$2.INSTANCE);
    private final qjg newDefinition$delegate = new qjg(null, this, LiveUrlList$newDefinition$2.INSTANCE);
    private final qjg recomm$delegate = new qjg(null, this, LiveUrlList$recomm$2.INSTANCE);
    private final qjg liveStreamStatsInfo$delegate = new qjg(null, this, LiveUrlList$liveStreamStatsInfo$2.INSTANCE);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        static {
            t2o.a(1004536370);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    public static /* synthetic */ Object ipc$super(LiveUrlList liveUrlList, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/kmp/nexus/arch/openArch/dto_and_do/response_declared_do/LiveUrlList");
    }

    public final String getArtpUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("eb141aed", new Object[]{this});
        }
        return (String) this.artpUrl$delegate.b(this, $$delegatedProperties[5]);
    }

    public final String getBfrtcUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9cf1d1f1", new Object[]{this});
        }
        return (String) this.bfrtcUrl$delegate.b(this, $$delegatedProperties[6]);
    }

    public final String getCodeLevel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("355a5ab8", new Object[]{this});
        }
        return (String) this.codeLevel$delegate.b(this, $$delegatedProperties[0]);
    }

    public final String getDefinition() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("57099950", new Object[]{this});
        }
        return (String) this.definition$delegate.b(this, $$delegatedProperties[1]);
    }

    public final String getFlvUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("41234844", new Object[]{this});
        }
        return (String) this.flvUrl$delegate.b(this, $$delegatedProperties[2]);
    }

    public final String getH265Url() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("42c33d89", new Object[]{this});
        }
        return (String) this.h265Url$delegate.b(this, $$delegatedProperties[4]);
    }

    public final String getHlsUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("273482c3", new Object[]{this});
        }
        return (String) this.hlsUrl$delegate.b(this, $$delegatedProperties[3]);
    }

    public final Map<String, Object> getLiveStreamStatsInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("bab49647", new Object[]{this});
        }
        return (Map) this.liveStreamStatsInfo$delegate.b(this, $$delegatedProperties[14]);
    }

    public final String getName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return (String) this.name$delegate.b(this, $$delegatedProperties[7]);
    }

    public final String getNewDefinition() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("572e6bbc", new Object[]{this});
        }
        return (String) this.newDefinition$delegate.b(this, $$delegatedProperties[12]);
    }

    public final String getNewName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6327fa04", new Object[]{this});
        }
        return (String) this.newName$delegate.b(this, $$delegatedProperties[11]);
    }

    public final String getRecomm() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c01f5364", new Object[]{this});
        }
        return (String) this.recomm$delegate.b(this, $$delegatedProperties[13]);
    }

    public final String getRtcLiveUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1e4ea6c1", new Object[]{this});
        }
        return (String) this.rtcLiveUrl$delegate.b(this, $$delegatedProperties[8]);
    }

    public final String getUnit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9e7fcd3f", new Object[]{this});
        }
        return (String) this.unit$delegate.b(this, $$delegatedProperties[9]);
    }

    public final String getUnitType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9fe6b325", new Object[]{this});
        }
        return (String) this.unitType$delegate.b(this, $$delegatedProperties[10]);
    }

    public final void setArtpUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e72cb91", new Object[]{this, str});
        } else {
            this.artpUrl$delegate.a(this, $$delegatedProperties[5], str);
        }
    }

    public final void setBfrtcUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c25c6a5", new Object[]{this, str});
        } else {
            this.bfrtcUrl$delegate.a(this, $$delegatedProperties[6], str);
        }
    }

    public final void setCodeLevel(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f82eb826", new Object[]{this, str});
        } else {
            this.codeLevel$delegate.a(this, $$delegatedProperties[0], str);
        }
    }

    public final void setDefinition(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1131826", new Object[]{this, str});
        } else {
            this.definition$delegate.a(this, $$delegatedProperties[1], str);
        }
    }

    public final void setFlvUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82efadb2", new Object[]{this, str});
        } else {
            this.flvUrl$delegate.a(this, $$delegatedProperties[2], str);
        }
    }

    public final void setH265Url(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ca7fc75", new Object[]{this, str});
        } else {
            this.h265Url$delegate.a(this, $$delegatedProperties[4], str);
        }
    }

    public final void setHlsUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f05c313", new Object[]{this, str});
        } else {
            this.hlsUrl$delegate.a(this, $$delegatedProperties[3], str);
        }
    }

    public final void setLiveStreamStatsInfo(Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b21ddbf", new Object[]{this, map});
        } else {
            this.liveStreamStatsInfo$delegate.a(this, $$delegatedProperties[14], map);
        }
    }

    public final void setName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99b22cde", new Object[]{this, str});
        } else {
            this.name$delegate.a(this, $$delegatedProperties[7], str);
        }
    }

    public final void setNewDefinition(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c33eeda2", new Object[]{this, str});
        } else {
            this.newDefinition$delegate.a(this, $$delegatedProperties[12], str);
        }
    }

    public final void setNewName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dacf5a", new Object[]{this, str});
        } else {
            this.newName$delegate.a(this, $$delegatedProperties[11], str);
        }
    }

    public final void setRecomm(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3750692", new Object[]{this, str});
        } else {
            this.recomm$delegate.a(this, $$delegatedProperties[13], str);
        }
    }

    public final void setRtcLiveUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("226fb8d5", new Object[]{this, str});
        } else {
            this.rtcLiveUrl$delegate.a(this, $$delegatedProperties[8], str);
        }
    }

    public final void setUnit(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5f91b17", new Object[]{this, str});
        } else {
            this.unit$delegate.a(this, $$delegatedProperties[9], str);
        }
    }

    public final void setUnitType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7cd0bf1", new Object[]{this, str});
        } else {
            this.unitType$delegate.a(this, $$delegatedProperties[10], str);
        }
    }

    static {
        t2o.a(1004536369);
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(LiveUrlList.class, "codeLevel", "getCodeLevel()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl);
        MutablePropertyReference1Impl mutablePropertyReference1Impl2 = new MutablePropertyReference1Impl(LiveUrlList.class, "definition", "getDefinition()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl2);
        MutablePropertyReference1Impl mutablePropertyReference1Impl3 = new MutablePropertyReference1Impl(LiveUrlList.class, yj4.PARAM_MEDIA_INFO_FLVURL, "getFlvUrl()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl3);
        MutablePropertyReference1Impl mutablePropertyReference1Impl4 = new MutablePropertyReference1Impl(LiveUrlList.class, yj4.PARAM_MEDIA_INFO_HLSURL, "getHlsUrl()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl4);
        MutablePropertyReference1Impl mutablePropertyReference1Impl5 = new MutablePropertyReference1Impl(LiveUrlList.class, yj4.PARAM_MEDIA_INFO_H265URL, "getH265Url()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl5);
        MutablePropertyReference1Impl mutablePropertyReference1Impl6 = new MutablePropertyReference1Impl(LiveUrlList.class, yj4.PARAM_MEDIA_INFO_ARTPURL, "getArtpUrl()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl6);
        MutablePropertyReference1Impl mutablePropertyReference1Impl7 = new MutablePropertyReference1Impl(LiveUrlList.class, MediaConstant.BFRTC_URL_NAME, "getBfrtcUrl()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl7);
        MutablePropertyReference1Impl mutablePropertyReference1Impl8 = new MutablePropertyReference1Impl(LiveUrlList.class, "name", "getName()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl8);
        MutablePropertyReference1Impl mutablePropertyReference1Impl9 = new MutablePropertyReference1Impl(LiveUrlList.class, MediaConstant.RTCLIVE_URL_NAME, "getRtcLiveUrl()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl9);
        MutablePropertyReference1Impl mutablePropertyReference1Impl10 = new MutablePropertyReference1Impl(LiveUrlList.class, mh1.PRICE_UNIT, "getUnit()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl10);
        MutablePropertyReference1Impl mutablePropertyReference1Impl11 = new MutablePropertyReference1Impl(LiveUrlList.class, "unitType", "getUnitType()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl11);
        MutablePropertyReference1Impl mutablePropertyReference1Impl12 = new MutablePropertyReference1Impl(LiveUrlList.class, "newName", "getNewName()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl12);
        MutablePropertyReference1Impl mutablePropertyReference1Impl13 = new MutablePropertyReference1Impl(LiveUrlList.class, "newDefinition", "getNewDefinition()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl13);
        MutablePropertyReference1Impl mutablePropertyReference1Impl14 = new MutablePropertyReference1Impl(LiveUrlList.class, "recomm", "getRecomm()Ljava/lang/String;", 0);
        dun.f(mutablePropertyReference1Impl14);
        MutablePropertyReference1Impl mutablePropertyReference1Impl15 = new MutablePropertyReference1Impl(LiveUrlList.class, "liveStreamStatsInfo", "getLiveStreamStatsInfo()Ljava/util/Map;", 0);
        dun.f(mutablePropertyReference1Impl15);
        $$delegatedProperties = new a0g[]{mutablePropertyReference1Impl, mutablePropertyReference1Impl2, mutablePropertyReference1Impl3, mutablePropertyReference1Impl4, mutablePropertyReference1Impl5, mutablePropertyReference1Impl6, mutablePropertyReference1Impl7, mutablePropertyReference1Impl8, mutablePropertyReference1Impl9, mutablePropertyReference1Impl10, mutablePropertyReference1Impl11, mutablePropertyReference1Impl12, mutablePropertyReference1Impl13, mutablePropertyReference1Impl14, mutablePropertyReference1Impl15};
    }
}
