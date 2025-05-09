package com.taobao.themis.kernel.utils;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import tb.a07;
import tb.t2o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/taobao/themis/kernel/utils/FrameType;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "a", "PubArea", "Default", "themis_kernel_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class FrameType extends Enum<FrameType> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String DEFAULT = "default";
    private static final String PRI_AREA = "priArea";
    private static final String PRI_TOOL = "priTool";
    private static final String PUB_AREA = "pubArea";
    public static final FrameType PubArea = new FrameType("PubArea", 0);
    public static final FrameType Default = new FrameType("Default", 1);
    private static final /* synthetic */ FrameType[] $VALUES = $values();
    public static final a Companion = new a(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(839909952);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    private static final /* synthetic */ FrameType[] $values() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FrameType[]) ipChange.ipc$dispatch("b103ed54", new Object[0]) : new FrameType[]{PubArea, Default};
    }

    private FrameType(String str, int i) {
    }

    public static /* synthetic */ Object ipc$super(FrameType frameType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/kernel/utils/FrameType");
    }

    public static FrameType valueOf(String str) {
        Object valueOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            valueOf = ipChange.ipc$dispatch("e8bd6bff", new Object[]{str});
        } else {
            valueOf = Enum.valueOf(FrameType.class, str);
        }
        return (FrameType) valueOf;
    }

    public static FrameType[] values() {
        Object clone;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            clone = ipChange.ipc$dispatch("d4c2f730", new Object[0]);
        } else {
            clone = $VALUES.clone();
        }
        return (FrameType[]) clone;
    }
}
