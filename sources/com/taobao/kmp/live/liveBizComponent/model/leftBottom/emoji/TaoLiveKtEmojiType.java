package com.taobao.kmp.live.liveBizComponent.model.leftBottom.emoji;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import tb.a07;
import tb.ckf;
import tb.fg8;
import tb.t2o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0080\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/taobao/kmp/live/liveBizComponent/model/leftBottom/emoji/TaoLiveKtEmojiType;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion", "a", "OfficialNormal", "OfficialLarge", "CustomLarge", "CustomOldLarge", "taoliveroombizsdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class TaoLiveKtEmojiType extends Enum<TaoLiveKtEmojiType> {
    private static final /* synthetic */ fg8 $ENTRIES;
    private static final /* synthetic */ TaoLiveKtEmojiType[] $VALUES;
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String value;
    public static final TaoLiveKtEmojiType OfficialNormal = new TaoLiveKtEmojiType("OfficialNormal", 0, "official_sticker");
    public static final TaoLiveKtEmojiType OfficialLarge = new TaoLiveKtEmojiType("OfficialLarge", 1, "official_strip_sticker");
    public static final TaoLiveKtEmojiType CustomLarge = new TaoLiveKtEmojiType("CustomLarge", 2, "anchor_custom_sticker");
    public static final TaoLiveKtEmojiType CustomOldLarge = new TaoLiveKtEmojiType("CustomOldLarge", 3, "custom");
    public static final a Companion = new a(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(1003487307);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final boolean b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5a38b896", new Object[]{this, str})).booleanValue();
            }
            ckf.g(str, "value");
            return ckf.b(str, TaoLiveKtEmojiType.OfficialNormal.getValue());
        }

        public a() {
        }

        public final boolean a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6d89b5ea", new Object[]{this, str})).booleanValue();
            }
            ckf.g(str, "value");
            return ckf.b(str, TaoLiveKtEmojiType.OfficialLarge.getValue()) || ckf.b(str, TaoLiveKtEmojiType.CustomLarge.getValue()) || ckf.b(str, TaoLiveKtEmojiType.CustomOldLarge.getValue());
        }
    }

    private static final /* synthetic */ TaoLiveKtEmojiType[] $values() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TaoLiveKtEmojiType[]) ipChange.ipc$dispatch("a705c7e2", new Object[0]) : new TaoLiveKtEmojiType[]{OfficialNormal, OfficialLarge, CustomLarge, CustomOldLarge};
    }

    static {
        TaoLiveKtEmojiType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private TaoLiveKtEmojiType(String str, int i, String str2) {
        this.value = str2;
    }

    public static fg8<TaoLiveKtEmojiType> getEntries() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fg8) ipChange.ipc$dispatch("24e60520", new Object[0]);
        }
        return $ENTRIES;
    }

    public static /* synthetic */ Object ipc$super(TaoLiveKtEmojiType taoLiveKtEmojiType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/kmp/live/liveBizComponent/model/leftBottom/emoji/TaoLiveKtEmojiType");
    }

    public static TaoLiveKtEmojiType valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoLiveKtEmojiType) ipChange.ipc$dispatch("955ee4d", new Object[]{str});
        }
        return (TaoLiveKtEmojiType) Enum.valueOf(TaoLiveKtEmojiType.class, str);
    }

    public static TaoLiveKtEmojiType[] values() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoLiveKtEmojiType[]) ipChange.ipc$dispatch("c90a8cbe", new Object[0]);
        }
        return (TaoLiveKtEmojiType[]) $VALUES.clone();
    }

    public final String getValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5308aa1e", new Object[]{this});
        }
        return this.value;
    }
}
