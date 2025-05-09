package com.taobao.kmp.live.updown.model;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.kmp.live.liveBizComponent.model.base.TaoLiveKtBaseModel;
import com.taobao.media.MediaConstant;
import java.util.Map;
import kotlin.Metadata;
import tb.a07;
import tb.mh1;
import tb.t2o;
import tb.yj4;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b-\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u001b\u0018\u0000 L2\u00020\u0001:\u0001MB\u0007¢\u0006\u0004\b\u0002\u0010\u0003R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR$\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR$\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u000f\u0010\b\"\u0004\b\u0010\u0010\nR$\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\b\"\u0004\b\u0013\u0010\nR$\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0006\u001a\u0004\b\u0015\u0010\b\"\u0004\b\u0016\u0010\nR$\u0010\u0017\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0006\u001a\u0004\b\u0018\u0010\b\"\u0004\b\u0019\u0010\nR$\u0010\u001a\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0006\u001a\u0004\b\u001b\u0010\b\"\u0004\b\u001c\u0010\nR$\u0010\u001d\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0006\u001a\u0004\b\u001e\u0010\b\"\u0004\b\u001f\u0010\nR$\u0010 \u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u0006\u001a\u0004\b!\u0010\b\"\u0004\b\"\u0010\nR$\u0010#\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010\u0006\u001a\u0004\b$\u0010\b\"\u0004\b%\u0010\nR$\u0010&\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010\u0006\u001a\u0004\b'\u0010\b\"\u0004\b(\u0010\nR$\u0010)\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010\u0006\u001a\u0004\b*\u0010\b\"\u0004\b+\u0010\nR$\u0010,\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010\u0006\u001a\u0004\b-\u0010\b\"\u0004\b.\u0010\nR$\u0010/\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u0010\u0006\u001a\u0004\b0\u0010\b\"\u0004\b1\u0010\nR2\u00104\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u000103\u0018\u0001028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R$\u0010:\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010\u0006\u001a\u0004\b;\u0010\b\"\u0004\b<\u0010\nR$\u0010=\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010\u0006\u001a\u0004\b>\u0010\b\"\u0004\b?\u0010\nR2\u0010@\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u000103\u0018\u0001028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u00105\u001a\u0004\bA\u00107\"\u0004\bB\u00109R$\u0010C\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bC\u0010\u0006\u001a\u0004\bD\u0010\b\"\u0004\bE\u0010\nR$\u0010F\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bF\u0010\u0006\u001a\u0004\bG\u0010\b\"\u0004\bH\u0010\nR$\u0010I\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bI\u0010\u0006\u001a\u0004\bJ\u0010\b\"\u0004\bK\u0010\n¨\u0006N"}, d2 = {"Lcom/taobao/kmp/live/updown/model/TaoLiveKtLiveUrlItem;", "Lcom/taobao/kmp/live/liveBizComponent/model/base/TaoLiveKtBaseModel;", "<init>", "()V", "", "codeLevel", "Ljava/lang/String;", "getCodeLevel", "()Ljava/lang/String;", "setCodeLevel", "(Ljava/lang/String;)V", "definition", "getDefinition", "setDefinition", yj4.PARAM_MEDIA_INFO_FLVURL, "getFlvUrl", "setFlvUrl", yj4.PARAM_MEDIA_INFO_HLSURL, "getHlsUrl", "setHlsUrl", yj4.PARAM_MEDIA_INFO_H265URL, "getH265Url", "setH265Url", yj4.PARAM_MEDIA_INFO_ARTPURL, "getArtpUrl", "setArtpUrl", MediaConstant.BFRTC_URL_NAME, "getBfrtcUrl", "setBfrtcUrl", "name", "getName", "setName", MediaConstant.RTCLIVE_URL_NAME, "getRtcLiveUrl", "setRtcLiveUrl", mh1.PRICE_UNIT, "getUnit", "setUnit", "unitType", "getUnitType", "setUnitType", "newName", "getNewName", "setNewName", "newDefinition", "getNewDefinition", "setNewDefinition", "recomm", "getRecomm", "setRecomm", "", "", "liveStreamStatsInfo", "Ljava/util/Map;", "getLiveStreamStatsInfo", "()Ljava/util/Map;", "setLiveStreamStatsInfo", "(Ljava/util/Map;)V", "liveUrlMiniBfrtc", "getLiveUrlMiniBfrtc", "setLiveUrlMiniBfrtc", "dataTracks", "getDataTracks", "setDataTracks", "additionUrlMap", "getAdditionUrlMap", "setAdditionUrlMap", "extInfo", "getExtInfo", "setExtInfo", yj4.PARAM_MEDIA_INFO_wholeH265FlvUrl, "getWholeH265FlvUrl", "setWholeH265FlvUrl", yj4.PARAM_MEDIA_INFO_wholeH265ArtpUrl, "getWholeH265ArtpUrl", "setWholeH265ArtpUrl", "Companion", "a", "taoliveroombizsdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class TaoLiveKtLiveUrlItem extends TaoLiveKtBaseModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    private Map<String, ? extends Object> additionUrlMap;
    private String artpUrl;
    private String bfrtcUrl;
    private String codeLevel;
    private String dataTracks;
    private String definition;
    private String extInfo;
    private String flvUrl;
    private String h265Url;
    private String hlsUrl;
    private Map<String, ? extends Object> liveStreamStatsInfo;
    private String liveUrlMiniBfrtc;
    private String name;
    private String newDefinition;
    private String newName;
    private String recomm;
    private String rtcLiveUrl;
    private String unit;
    private String unitType;
    private String wholeH265ArtpUrl;
    private String wholeH265FlvUrl;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        static {
            t2o.a(1003487375);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(1003487374);
    }

    public static /* synthetic */ Object ipc$super(TaoLiveKtLiveUrlItem taoLiveKtLiveUrlItem, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/kmp/live/updown/model/TaoLiveKtLiveUrlItem");
    }

    public final Map<String, Object> getAdditionUrlMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("6642213b", new Object[]{this});
        }
        return this.additionUrlMap;
    }

    public final String getArtpUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("eb141aed", new Object[]{this});
        }
        return this.artpUrl;
    }

    public final String getBfrtcUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9cf1d1f1", new Object[]{this});
        }
        return this.bfrtcUrl;
    }

    public final String getCodeLevel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("355a5ab8", new Object[]{this});
        }
        return this.codeLevel;
    }

    public final String getDataTracks() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ecc9731", new Object[]{this});
        }
        return this.dataTracks;
    }

    public final String getDefinition() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("57099950", new Object[]{this});
        }
        return this.definition;
    }

    public final String getExtInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9847d660", new Object[]{this});
        }
        return this.extInfo;
    }

    public final String getFlvUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("41234844", new Object[]{this});
        }
        return this.flvUrl;
    }

    public final String getH265Url() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("42c33d89", new Object[]{this});
        }
        return this.h265Url;
    }

    public final String getHlsUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("273482c3", new Object[]{this});
        }
        return this.hlsUrl;
    }

    public final Map<String, Object> getLiveStreamStatsInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("bab49647", new Object[]{this});
        }
        return this.liveStreamStatsInfo;
    }

    public final String getLiveUrlMiniBfrtc() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("98995d40", new Object[]{this});
        }
        return this.liveUrlMiniBfrtc;
    }

    public final String getName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return this.name;
    }

    public final String getNewDefinition() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("572e6bbc", new Object[]{this});
        }
        return this.newDefinition;
    }

    public final String getNewName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6327fa04", new Object[]{this});
        }
        return this.newName;
    }

    public final String getRecomm() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c01f5364", new Object[]{this});
        }
        return this.recomm;
    }

    public final String getRtcLiveUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1e4ea6c1", new Object[]{this});
        }
        return this.rtcLiveUrl;
    }

    public final String getUnit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9e7fcd3f", new Object[]{this});
        }
        return this.unit;
    }

    public final String getUnitType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9fe6b325", new Object[]{this});
        }
        return this.unitType;
    }

    public final String getWholeH265ArtpUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fd2b2241", new Object[]{this});
        }
        return this.wholeH265ArtpUrl;
    }

    public final String getWholeH265FlvUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ef240670", new Object[]{this});
        }
        return this.wholeH265FlvUrl;
    }

    public final void setAdditionUrlMap(Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccba51b3", new Object[]{this, map});
        } else {
            this.additionUrlMap = map;
        }
    }

    public final void setArtpUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e72cb91", new Object[]{this, str});
        } else {
            this.artpUrl = str;
        }
    }

    public final void setBfrtcUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c25c6a5", new Object[]{this, str});
        } else {
            this.bfrtcUrl = str;
        }
    }

    public final void setCodeLevel(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f82eb826", new Object[]{this, str});
        } else {
            this.codeLevel = str;
        }
    }

    public final void setDataTracks(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41afd665", new Object[]{this, str});
        } else {
            this.dataTracks = str;
        }
    }

    public final void setDefinition(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1131826", new Object[]{this, str});
        } else {
            this.definition = str;
        }
    }

    public final void setExtInfo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77b67e7e", new Object[]{this, str});
        } else {
            this.extInfo = str;
        }
    }

    public final void setFlvUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82efadb2", new Object[]{this, str});
        } else {
            this.flvUrl = str;
        }
    }

    public final void setH265Url(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ca7fc75", new Object[]{this, str});
        } else {
            this.h265Url = str;
        }
    }

    public final void setHlsUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f05c313", new Object[]{this, str});
        } else {
            this.hlsUrl = str;
        }
    }

    public final void setLiveStreamStatsInfo(Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b21ddbf", new Object[]{this, map});
        } else {
            this.liveStreamStatsInfo = map;
        }
    }

    public final void setLiveUrlMiniBfrtc(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6d4d936", new Object[]{this, str});
        } else {
            this.liveUrlMiniBfrtc = str;
        }
    }

    public final void setName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99b22cde", new Object[]{this, str});
        } else {
            this.name = str;
        }
    }

    public final void setNewDefinition(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c33eeda2", new Object[]{this, str});
        } else {
            this.newDefinition = str;
        }
    }

    public final void setNewName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dacf5a", new Object[]{this, str});
        } else {
            this.newName = str;
        }
    }

    public final void setRecomm(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3750692", new Object[]{this, str});
        } else {
            this.recomm = str;
        }
    }

    public final void setRtcLiveUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("226fb8d5", new Object[]{this, str});
        } else {
            this.rtcLiveUrl = str;
        }
    }

    public final void setUnit(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5f91b17", new Object[]{this, str});
        } else {
            this.unit = str;
        }
    }

    public final void setUnitType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7cd0bf1", new Object[]{this, str});
        } else {
            this.unitType = str;
        }
    }

    public final void setWholeH265ArtpUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e47bb455", new Object[]{this, str});
        } else {
            this.wholeH265ArtpUrl = str;
        }
    }

    public final void setWholeH265FlvUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af849c6e", new Object[]{this, str});
        } else {
            this.wholeH265FlvUrl = str;
        }
    }
}
