package com.taobao.kmp.live.liveBizComponent.model.leftBottom.emoji;

import anet.channel.session.dns.DnsNavConfigTask;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.network.diagnosis.model.NetworkAbility;
import com.taobao.kmp.live.liveBizComponent.model.base.TaoLiveKtBaseModel;
import kotlin.Metadata;
import tb.a07;
import tb.ckf;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\f\u0018\u0000 !2\u00020\u0001:\u0001\"B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR$\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR$\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u000f\u0010\b\"\u0004\b\u0010\u0010\nR$\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\b\"\u0004\b\u0013\u0010\nR$\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0006\u001a\u0004\b\u0015\u0010\b\"\u0004\b\u0016\u0010\nR\u0011\u0010\u001a\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001c\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0019R\u0011\u0010\u001e\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0019R\u0011\u0010 \u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0019¨\u0006#"}, d2 = {"Lcom/taobao/kmp/live/liveBizComponent/model/leftBottom/emoji/TaoLiveKtEmojiIconItem;", "Lcom/taobao/kmp/live/liveBizComponent/model/base/TaoLiveKtBaseModel;", "<init>", "()V", "", "thumbnail", "Ljava/lang/String;", "getThumbnail", "()Ljava/lang/String;", "setThumbnail", "(Ljava/lang/String;)V", DnsNavConfigTask.MatchKey, "getMatchKey", "setMatchKey", "type", NetworkAbility.API_GET_TYPE, "setType", "stickerType", "getStickerType", "setStickerType", "stickerId", "getStickerId", "setStickerId", "", "getNormalType", "()Z", "normalType", "getLargeType", "largeType", "getOfficialType", "officialType", "getCustomType", "customType", "Companion", "a", "taoliveroombizsdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class TaoLiveKtEmojiIconItem extends TaoLiveKtBaseModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    private String thumbnail = "";
    private String matchKey = "";
    private String type = "";
    private String stickerType = "";
    private String stickerId = "";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        static {
            t2o.a(1003487299);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(1003487298);
    }

    public static /* synthetic */ Object ipc$super(TaoLiveKtEmojiIconItem taoLiveKtEmojiIconItem, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/kmp/live/liveBizComponent/model/leftBottom/emoji/TaoLiveKtEmojiIconItem");
    }

    public final boolean getCustomType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1e20a24c", new Object[]{this})).booleanValue();
        }
        String str = this.type;
        if (str == null) {
            str = "";
        }
        if (ckf.b(str, TaoLiveKtEmojiType.CustomLarge.getValue()) || ckf.b(str, TaoLiveKtEmojiType.CustomOldLarge.getValue())) {
            return true;
        }
        return false;
    }

    public final boolean getLargeType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("38d2576a", new Object[]{this})).booleanValue();
        }
        String str = this.stickerType;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        if (str.length() > 0 && ckf.b(str, TaoLiveKtStickerType.Large.getValue())) {
            return true;
        }
        String str3 = this.type;
        if (str3 != null) {
            str2 = str3;
        }
        if (str2.length() <= 0 || !TaoLiveKtEmojiType.Companion.a(str2)) {
            return false;
        }
        return true;
    }

    public final String getMatchKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cfa6b929", new Object[]{this});
        }
        return this.matchKey;
    }

    public final boolean getNormalType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("315afdc2", new Object[]{this})).booleanValue();
        }
        String str = this.stickerType;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        if (str.length() > 0 && ckf.b(str, TaoLiveKtStickerType.Normal.getValue())) {
            return true;
        }
        String str3 = this.type;
        if (str3 != null) {
            str2 = str3;
        }
        return TaoLiveKtEmojiType.Companion.b(str2);
    }

    public final boolean getOfficialType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("194b3246", new Object[]{this})).booleanValue();
        }
        String str = this.type;
        if (str == null) {
            str = "";
        }
        if (ckf.b(str, TaoLiveKtEmojiType.OfficialNormal.getValue()) || ckf.b(str, TaoLiveKtEmojiType.OfficialLarge.getValue())) {
            return true;
        }
        return false;
    }

    public final String getStickerId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("47d7cbb7", new Object[]{this});
        }
        return this.stickerId;
    }

    public final String getStickerType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("39cd48b8", new Object[]{this});
        }
        return this.stickerType;
    }

    public final String getThumbnail() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("33120a83", new Object[]{this});
        }
        return this.thumbnail;
    }

    public final String getType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("13e5e549", new Object[]{this});
        }
        return this.type;
    }

    public final void setMatchKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b00dc66d", new Object[]{this, str});
        } else {
            this.matchKey = str;
        }
    }

    public final void setStickerId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("355f6707", new Object[]{this, str});
        } else {
            this.stickerId = str;
        }
    }

    public final void setStickerType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1792fd26", new Object[]{this, str});
        } else {
            this.stickerType = str;
        }
    }

    public final void setThumbnail(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b16d01bb", new Object[]{this, str});
        } else {
            this.thumbnail = str;
        }
    }

    public final void setType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd56044d", new Object[]{this, str});
        } else {
            this.type = str;
        }
    }
}
