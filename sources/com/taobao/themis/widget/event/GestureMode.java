package com.taobao.themis.widget.event;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/taobao/themis/widget/event/GestureMode;", "", "(Ljava/lang/String;I)V", "DEFAULT", "VERTICAL", "HORIZONTAL", "ALL", "NONE", "themis_widget_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class GestureMode extends Enum<GestureMode> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final GestureMode DEFAULT = new GestureMode("DEFAULT", 0);
    public static final GestureMode VERTICAL = new GestureMode("VERTICAL", 1);
    public static final GestureMode HORIZONTAL = new GestureMode("HORIZONTAL", 2);
    public static final GestureMode ALL = new GestureMode("ALL", 3);
    public static final GestureMode NONE = new GestureMode("NONE", 4);
    private static final /* synthetic */ GestureMode[] $VALUES = $values();

    private static final /* synthetic */ GestureMode[] $values() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (GestureMode[]) ipChange.ipc$dispatch("ca5d14ff", new Object[0]) : new GestureMode[]{DEFAULT, VERTICAL, HORIZONTAL, ALL, NONE};
    }

    private GestureMode(String str, int i) {
    }

    public static /* synthetic */ Object ipc$super(GestureMode gestureMode, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/widget/event/GestureMode");
    }

    public static GestureMode valueOf(String str) {
        Object valueOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            valueOf = ipChange.ipc$dispatch("f9b194ea", new Object[]{str});
        } else {
            valueOf = Enum.valueOf(GestureMode.class, str);
        }
        return (GestureMode) valueOf;
    }

    public static GestureMode[] values() {
        Object clone;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            clone = ipChange.ipc$dispatch("fa8117db", new Object[0]);
        } else {
            clone = $VALUES.clone();
        }
        return (GestureMode[]) clone;
    }
}
