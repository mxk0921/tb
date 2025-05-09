package com.taobao.kmp.remoteinterops.classloader;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.common.Constants;
import com.taobao.search.sf.util.tlog.TLogTracker;
import java.util.Iterator;
import kotlin.Metadata;
import tb.a07;
import tb.ckf;
import tb.fg8;
import tb.t2o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0086\u0081\u0002\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0012B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\b\u001a\u00060\u0002j\u0002`\u00072\u0006\u0010\u0006\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\b\u0010\tJ \u0010\b\u001a\u00060\u0002j\u0002`\u00072\n\u0010\u0006\u001a\u00060\u0002j\u0002`\u0007H\u0086\u0002¢\u0006\u0004\b\b\u0010\nJ\u0018\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001c\u0010\u000b\u001a\u00020\u00002\n\u0010\u0006\u001a\u00060\u0002j\u0002`\u0007H\u0086\u0002¢\u0006\u0004\b\u000b\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018¨\u0006\u0019"}, d2 = {"Lcom/taobao/kmp/remoteinterops/classloader/RemoteInteropLoaderOption;", "", "", "bit", "<init>", "(Ljava/lang/String;II)V", "other", "Lcom/taobao/kmp/remoteinterops/classloader/RemoteInteropLoaderOptionValue;", "plus", "(Lcom/taobao/kmp/remoteinterops/classloader/RemoteInteropLoaderOption;)I", "(I)I", Constants.KEY_TIMES, "(Lcom/taobao/kmp/remoteinterops/classloader/RemoteInteropLoaderOption;)Lcom/taobao/kmp/remoteinterops/classloader/RemoteInteropLoaderOption;", "(I)Lcom/taobao/kmp/remoteinterops/classloader/RemoteInteropLoaderOption;", TLogTracker.LEVEL_INFO, "getBit", "()I", "Companion", "a", "NONE", "LOAD_MODULE_AFTER_INIT", "LOAD_MODULE_MANUALLY", "PERFORM_INVOKE_MIXIN_MODE", "PERFORM_INVOKE_PURE_REMOTE_MODE", "PERFORM_INVOKE_LOCAL_ONLY_MODE", "remote-interops_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class RemoteInteropLoaderOption extends Enum<RemoteInteropLoaderOption> {
    private static final /* synthetic */ fg8 $ENTRIES;
    private static final /* synthetic */ RemoteInteropLoaderOption[] $VALUES;
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final int DEFAULT;
    public static final RemoteInteropLoaderOption LOAD_MODULE_AFTER_INIT;
    public static final RemoteInteropLoaderOption PERFORM_INVOKE_MIXIN_MODE;
    private final int bit;
    public static final RemoteInteropLoaderOption NONE = new RemoteInteropLoaderOption("NONE", 0, 0);
    public static final RemoteInteropLoaderOption LOAD_MODULE_MANUALLY = new RemoteInteropLoaderOption("LOAD_MODULE_MANUALLY", 2, 2);
    public static final RemoteInteropLoaderOption PERFORM_INVOKE_PURE_REMOTE_MODE = new RemoteInteropLoaderOption("PERFORM_INVOKE_PURE_REMOTE_MODE", 4, 8);
    public static final RemoteInteropLoaderOption PERFORM_INVOKE_LOCAL_ONLY_MODE = new RemoteInteropLoaderOption("PERFORM_INVOKE_LOCAL_ONLY_MODE", 5, 16);
    public static final a Companion = new a(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(1006632965);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final RemoteInteropLoaderOption a(int i) {
            Object obj;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (RemoteInteropLoaderOption) ipChange.ipc$dispatch("9eee2521", new Object[]{this, new Integer(i)});
            }
            Iterator<E> it = RemoteInteropLoaderOption.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((RemoteInteropLoaderOption) obj).getBit() == i) {
                    break;
                }
            }
            RemoteInteropLoaderOption remoteInteropLoaderOption = (RemoteInteropLoaderOption) obj;
            if (remoteInteropLoaderOption == null) {
                return RemoteInteropLoaderOption.NONE;
            }
            return remoteInteropLoaderOption;
        }

        public a() {
        }
    }

    private static final /* synthetic */ RemoteInteropLoaderOption[] $values() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RemoteInteropLoaderOption[]) ipChange.ipc$dispatch("7e9a0a59", new Object[0]) : new RemoteInteropLoaderOption[]{NONE, LOAD_MODULE_AFTER_INIT, LOAD_MODULE_MANUALLY, PERFORM_INVOKE_MIXIN_MODE, PERFORM_INVOKE_PURE_REMOTE_MODE, PERFORM_INVOKE_LOCAL_ONLY_MODE};
    }

    static {
        RemoteInteropLoaderOption remoteInteropLoaderOption = new RemoteInteropLoaderOption("LOAD_MODULE_AFTER_INIT", 1, 1);
        LOAD_MODULE_AFTER_INIT = remoteInteropLoaderOption;
        RemoteInteropLoaderOption remoteInteropLoaderOption2 = new RemoteInteropLoaderOption("PERFORM_INVOKE_MIXIN_MODE", 3, 4);
        PERFORM_INVOKE_MIXIN_MODE = remoteInteropLoaderOption2;
        RemoteInteropLoaderOption[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
        DEFAULT = remoteInteropLoaderOption.plus(remoteInteropLoaderOption2);
    }

    private RemoteInteropLoaderOption(String str, int i, int i2) {
        this.bit = i2;
    }

    public static final /* synthetic */ int access$getDEFAULT$cp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f2ec7fe0", new Object[0])).intValue();
        }
        return DEFAULT;
    }

    public static fg8<RemoteInteropLoaderOption> getEntries() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fg8) ipChange.ipc$dispatch("24e60520", new Object[0]);
        }
        return $ENTRIES;
    }

    public static /* synthetic */ Object ipc$super(RemoteInteropLoaderOption remoteInteropLoaderOption, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/kmp/remoteinterops/classloader/RemoteInteropLoaderOption");
    }

    public static RemoteInteropLoaderOption valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RemoteInteropLoaderOption) ipChange.ipc$dispatch("f881b8ce", new Object[]{str});
        }
        return (RemoteInteropLoaderOption) Enum.valueOf(RemoteInteropLoaderOption.class, str);
    }

    public static RemoteInteropLoaderOption[] values() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RemoteInteropLoaderOption[]) ipChange.ipc$dispatch("485fb6fd", new Object[0]);
        }
        return (RemoteInteropLoaderOption[]) $VALUES.clone();
    }

    public final int getBit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3794eed1", new Object[]{this})).intValue();
        }
        return this.bit;
    }

    public final int plus(RemoteInteropLoaderOption remoteInteropLoaderOption) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e84a7617", new Object[]{this, remoteInteropLoaderOption})).intValue();
        }
        ckf.g(remoteInteropLoaderOption, "other");
        return remoteInteropLoaderOption.bit | this.bit;
    }

    public final RemoteInteropLoaderOption times(RemoteInteropLoaderOption remoteInteropLoaderOption) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RemoteInteropLoaderOption) ipChange.ipc$dispatch("a66a978d", new Object[]{this, remoteInteropLoaderOption});
        }
        ckf.g(remoteInteropLoaderOption, "other");
        return Companion.a(remoteInteropLoaderOption.bit & this.bit);
    }

    public final int plus(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a50161f5", new Object[]{this, new Integer(i)})).intValue() : i | this.bit;
    }

    public final RemoteInteropLoaderOption times(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RemoteInteropLoaderOption) ipChange.ipc$dispatch("d1f1e6b", new Object[]{this, new Integer(i)}) : Companion.a(i & this.bit);
    }
}
