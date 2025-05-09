package com.taobao.kmp.nexus.arch.openArch.service.message.model;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.sf.util.tlog.TLogTracker;
import java.io.Serializable;
import kotlin.Metadata;
import tb.a07;
import tb.fg8;
import tb.t2o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0017\b\u0086\u0081\u0002\u0018\u0000 \u000b2\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u0003:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\t\u0010\nj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001a¨\u0006\u001b"}, d2 = {"Lcom/taobao/kmp/nexus/arch/openArch/service/message/model/OpenArchPMMessageCategory;", "Ljava/io/Serializable;", "Lcom/taobao/uniinfra_kmp/common_utils/serialization/Serializable;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", TLogTracker.LEVEL_INFO, "getValue", "()I", "Companion", "a", "undefined", "onSubscribed", "onTextMessageArrived", "onJoinMessageArrived", "onCountMessageArrived", "onMessageArrived", "onErrorArrived", "onUnSubscribed", "onReceiveHistoryMsg", "onTopicUsers", "onTopicStatus", "onSend", "onTextSend", "onCount", "nexus_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class OpenArchPMMessageCategory extends Enum<OpenArchPMMessageCategory> implements Serializable {
    private static final /* synthetic */ fg8 $ENTRIES;
    private static final /* synthetic */ OpenArchPMMessageCategory[] $VALUES;
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final int value;
    public static final OpenArchPMMessageCategory undefined = new OpenArchPMMessageCategory("undefined", 0, -1);
    public static final OpenArchPMMessageCategory onSubscribed = new OpenArchPMMessageCategory("onSubscribed", 1, 0);
    public static final OpenArchPMMessageCategory onTextMessageArrived = new OpenArchPMMessageCategory("onTextMessageArrived", 2, 1);
    public static final OpenArchPMMessageCategory onJoinMessageArrived = new OpenArchPMMessageCategory("onJoinMessageArrived", 3, 2);
    public static final OpenArchPMMessageCategory onCountMessageArrived = new OpenArchPMMessageCategory("onCountMessageArrived", 4, 3);
    public static final OpenArchPMMessageCategory onMessageArrived = new OpenArchPMMessageCategory("onMessageArrived", 5, 4);
    public static final OpenArchPMMessageCategory onErrorArrived = new OpenArchPMMessageCategory("onErrorArrived", 6, 5);
    public static final OpenArchPMMessageCategory onUnSubscribed = new OpenArchPMMessageCategory("onUnSubscribed", 7, 6);
    public static final OpenArchPMMessageCategory onReceiveHistoryMsg = new OpenArchPMMessageCategory("onReceiveHistoryMsg", 8, 7);
    public static final OpenArchPMMessageCategory onTopicUsers = new OpenArchPMMessageCategory("onTopicUsers", 9, 8);
    public static final OpenArchPMMessageCategory onTopicStatus = new OpenArchPMMessageCategory("onTopicStatus", 10, 9);
    public static final OpenArchPMMessageCategory onSend = new OpenArchPMMessageCategory("onSend", 11, 10);
    public static final OpenArchPMMessageCategory onTextSend = new OpenArchPMMessageCategory("onTextSend", 12, 11);
    public static final OpenArchPMMessageCategory onCount = new OpenArchPMMessageCategory("onCount", 13, 12);
    public static final a Companion = new a(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        static {
            t2o.a(1004536584);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    private static final /* synthetic */ OpenArchPMMessageCategory[] $values() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (OpenArchPMMessageCategory[]) ipChange.ipc$dispatch("bb6412db", new Object[0]) : new OpenArchPMMessageCategory[]{undefined, onSubscribed, onTextMessageArrived, onJoinMessageArrived, onCountMessageArrived, onMessageArrived, onErrorArrived, onUnSubscribed, onReceiveHistoryMsg, onTopicUsers, onTopicStatus, onSend, onTextSend, onCount};
    }

    static {
        OpenArchPMMessageCategory[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private OpenArchPMMessageCategory(String str, int i, int i2) {
        this.value = i2;
    }

    public static fg8<OpenArchPMMessageCategory> getEntries() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fg8) ipChange.ipc$dispatch("24e60520", new Object[0]);
        }
        return $ENTRIES;
    }

    public static /* synthetic */ Object ipc$super(OpenArchPMMessageCategory openArchPMMessageCategory, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/kmp/nexus/arch/openArch/service/message/model/OpenArchPMMessageCategory");
    }

    public static OpenArchPMMessageCategory valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OpenArchPMMessageCategory) ipChange.ipc$dispatch("93150bc6", new Object[]{str});
        }
        return (OpenArchPMMessageCategory) Enum.valueOf(OpenArchPMMessageCategory.class, str);
    }

    public static OpenArchPMMessageCategory[] values() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OpenArchPMMessageCategory[]) ipChange.ipc$dispatch("118309b7", new Object[0]);
        }
        return (OpenArchPMMessageCategory[]) $VALUES.clone();
    }

    public final int getValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d1b766b5", new Object[]{this})).intValue();
        }
        return this.value;
    }
}
