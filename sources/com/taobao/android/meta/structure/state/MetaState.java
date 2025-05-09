package com.taobao.android.meta.structure.state;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.enums.a;
import tb.fg8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class MetaState extends Enum<MetaState> {
    private static final /* synthetic */ fg8 $ENTRIES;
    private static final /* synthetic */ MetaState[] $VALUES;
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final MetaState DEFAULT = new MetaState("DEFAULT", 0);
    public static final MetaState LOADING_MORE = new MetaState("LOADING_MORE", 1);
    public static final MetaState UPDATING = new MetaState("UPDATING", 2);
    public static final MetaState LOAD_MORE_ERROR = new MetaState("LOAD_MORE_ERROR", 3);
    public static final MetaState UPDATE_ERROR = new MetaState("UPDATE_ERROR", 4);
    public static final MetaState EMPTY = new MetaState("EMPTY", 5);
    public static final MetaState WAITING_FOR_UPDATE = new MetaState("WAITING_FOR_UPDATE", 6);
    public static final MetaState LIST_FINISHED = new MetaState("LIST_FINISHED", 7);

    private static final /* synthetic */ MetaState[] $values() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MetaState[]) ipChange.ipc$dispatch("880dcafa", new Object[0]) : new MetaState[]{DEFAULT, LOADING_MORE, UPDATING, LOAD_MORE_ERROR, UPDATE_ERROR, EMPTY, WAITING_FOR_UPDATE, LIST_FINISHED};
    }

    static {
        MetaState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private MetaState(String str, int i) {
    }

    public static fg8<MetaState> getEntries() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fg8) ipChange.ipc$dispatch("24e60520", new Object[0]);
        }
        return $ENTRIES;
    }

    public static /* synthetic */ Object ipc$super(MetaState metaState, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/meta/structure/state/MetaState");
    }

    public static MetaState valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MetaState) ipChange.ipc$dispatch("43309caf", new Object[]{str});
        }
        return (MetaState) Enum.valueOf(MetaState.class, str);
    }

    public static MetaState[] values() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MetaState[]) ipChange.ipc$dispatch("af46189e", new Object[0]);
        }
        return (MetaState[]) $VALUES.clone();
    }
}
