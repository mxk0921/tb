package com.taobao.taolive.crossplatformfoundation.serviceinterface.platformidependent.playcontrol;

import com.ali.user.mobile.rpc.filter.FilterManager;
import com.alipay.mobile.common.transportext.biz.diagnose.network.Configuration;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import tb.fg8;
import tb.t2o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000e\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u000f\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0011"}, d2 = {"Lcom/taobao/taolive/crossplatformfoundation/serviceinterface/platformidependent/playcontrol/TLFPlayControlInstanceState;", "", "code", "", "<init>", "(Ljava/lang/String;II)V", "getCode", "()I", Configuration.IDLE, "CREATING", "PLAYING", "PAUSE", "RESUME", FilterManager.STOP, "RELEASING", "getDescription", "", "tao-live-crossplatform-foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class TLFPlayControlInstanceState extends Enum<TLFPlayControlInstanceState> {
    private static final /* synthetic */ fg8 $ENTRIES;
    private static final /* synthetic */ TLFPlayControlInstanceState[] $VALUES;
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final int code;
    public static final TLFPlayControlInstanceState IDLE = new TLFPlayControlInstanceState(Configuration.IDLE, 0, 0);
    public static final TLFPlayControlInstanceState CREATING = new TLFPlayControlInstanceState("CREATING", 1, 1);
    public static final TLFPlayControlInstanceState PLAYING = new TLFPlayControlInstanceState("PLAYING", 2, 2);
    public static final TLFPlayControlInstanceState PAUSE = new TLFPlayControlInstanceState("PAUSE", 3, 3);
    public static final TLFPlayControlInstanceState RESUME = new TLFPlayControlInstanceState("RESUME", 4, 4);
    public static final TLFPlayControlInstanceState STOP = new TLFPlayControlInstanceState(FilterManager.STOP, 5, 5);
    public static final TLFPlayControlInstanceState RELEASING = new TLFPlayControlInstanceState("RELEASING", 6, 6);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            t2o.a(1010827447);
            int[] iArr = new int[TLFPlayControlInstanceState.values().length];
            try {
                iArr[TLFPlayControlInstanceState.IDLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TLFPlayControlInstanceState.CREATING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TLFPlayControlInstanceState.PLAYING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TLFPlayControlInstanceState.PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[TLFPlayControlInstanceState.RESUME.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[TLFPlayControlInstanceState.STOP.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[TLFPlayControlInstanceState.RELEASING.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final /* synthetic */ TLFPlayControlInstanceState[] $values() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TLFPlayControlInstanceState[]) ipChange.ipc$dispatch("48fbcbfe", new Object[0]) : new TLFPlayControlInstanceState[]{IDLE, CREATING, PLAYING, PAUSE, RESUME, STOP, RELEASING};
    }

    static {
        TLFPlayControlInstanceState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private TLFPlayControlInstanceState(String str, int i, int i2) {
        this.code = i2;
    }

    public static fg8<TLFPlayControlInstanceState> getEntries() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fg8) ipChange.ipc$dispatch("24e60520", new Object[0]);
        }
        return $ENTRIES;
    }

    public static /* synthetic */ Object ipc$super(TLFPlayControlInstanceState tLFPlayControlInstanceState, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/crossplatformfoundation/serviceinterface/platformidependent/playcontrol/TLFPlayControlInstanceState");
    }

    public static TLFPlayControlInstanceState valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TLFPlayControlInstanceState) ipChange.ipc$dispatch("a89feb69", new Object[]{str});
        }
        return (TLFPlayControlInstanceState) Enum.valueOf(TLFPlayControlInstanceState.class, str);
    }

    public static TLFPlayControlInstanceState[] values() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TLFPlayControlInstanceState[]) ipChange.ipc$dispatch("919184da", new Object[0]);
        }
        return (TLFPlayControlInstanceState[]) $VALUES.clone();
    }

    public final int getCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("480bb15d", new Object[]{this})).intValue();
        }
        return this.code;
    }

    public final String getDescription() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b9cffbf3", new Object[]{this});
        }
        switch (a.$EnumSwitchMapping$0[ordinal()]) {
            case 1:
                return "实例闲置状态，可复用状态";
            case 2:
                return "实例创建中，初始化一些配置";
            case 3:
                return "播放中";
            case 4:
                return "暂停中";
            case 5:
                return "恢复播放中";
            case 6:
                return "停止状态";
            case 7:
                return "实例释放中，做一些必要的资源回收";
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
