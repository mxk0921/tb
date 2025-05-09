package androidx.fragment.app.strictmode;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.android.icart.recommend.CartRecommendRefreshScene;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.a;
import kotlin.jvm.JvmStatic;
import tb.a07;
import tb.ckf;
import tb.gl4;
import tb.i04;
import tb.kfp;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003>?@B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0019\u0010\u0018J\u001f\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ'\u0010!\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u0013H\u0007¢\u0006\u0004\b!\u0010\u0016J\u0017\u0010\"\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\"\u0010\u0018J\u0017\u0010#\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b#\u0010\u0018J\u001f\u0010$\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b$\u0010\u0011J\u0017\u0010'\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b'\u0010(J7\u0010-\u001a\u00020\u001a2\u0006\u0010)\u001a\u00020\u00062\u000e\u0010+\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040*2\u000e\u0010,\u001a\n\u0012\u0006\b\u0001\u0012\u00020%0*H\u0002¢\u0006\u0004\b-\u0010.J\u001f\u0010/\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020\u00062\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b/\u00100J\u001f\u00103\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u00102\u001a\u000201H\u0002¢\u0006\u0004\b3\u00104J\u0017\u00105\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020%H\u0007¢\u0006\u0004\b5\u0010(R\u0014\u00106\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b6\u00107R\"\u00108\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=¨\u0006A"}, d2 = {"Landroidx/fragment/app/strictmode/FragmentStrictMode;", "", "<init>", "()V", "Landroidx/fragment/app/Fragment;", "fragment", "Landroidx/fragment/app/strictmode/FragmentStrictMode$Policy;", "getNearestPolicy", "(Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/strictmode/FragmentStrictMode$Policy;", "", "previousFragmentId", "Ltb/xhv;", "onFragmentReuse", "(Landroidx/fragment/app/Fragment;Ljava/lang/String;)V", "Landroid/view/ViewGroup;", "container", "onFragmentTagUsage", "(Landroidx/fragment/app/Fragment;Landroid/view/ViewGroup;)V", "expectedParentFragment", "", "containerId", "onWrongNestedHierarchy", "(Landroidx/fragment/app/Fragment;Landroidx/fragment/app/Fragment;I)V", "onSetRetainInstanceUsage", "(Landroidx/fragment/app/Fragment;)V", "onGetRetainInstanceUsage", "", "isVisibleToUser", "onSetUserVisibleHint", "(Landroidx/fragment/app/Fragment;Z)V", "violatingFragment", "targetFragment", "requestCode", "onSetTargetFragmentUsage", "onGetTargetFragmentUsage", "onGetTargetFragmentRequestCodeUsage", "onWrongFragmentContainer", "Landroidx/fragment/app/strictmode/Violation;", "violation", "logIfDebuggingEnabled", "(Landroidx/fragment/app/strictmode/Violation;)V", gl4.CONFIG_POLICY, "Ljava/lang/Class;", "fragmentClass", "violationClass", "shouldHandlePolicyViolation", "(Landroidx/fragment/app/strictmode/FragmentStrictMode$Policy;Ljava/lang/Class;Ljava/lang/Class;)Z", "handlePolicyViolation", "(Landroidx/fragment/app/strictmode/FragmentStrictMode$Policy;Landroidx/fragment/app/strictmode/Violation;)V", "Ljava/lang/Runnable;", "runnable", "runOnHostThread", "(Landroidx/fragment/app/Fragment;Ljava/lang/Runnable;)V", "onPolicyViolation", RPCDataItems.SWITCH_TAG_LOG, "Ljava/lang/String;", "defaultPolicy", "Landroidx/fragment/app/strictmode/FragmentStrictMode$Policy;", "getDefaultPolicy", "()Landroidx/fragment/app/strictmode/FragmentStrictMode$Policy;", "setDefaultPolicy", "(Landroidx/fragment/app/strictmode/FragmentStrictMode$Policy;)V", "Flag", "OnViolationListener", "Policy", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class FragmentStrictMode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "FragmentStrictMode";
    public static final FragmentStrictMode INSTANCE = new FragmentStrictMode();
    private static Policy defaultPolicy = Policy.LAX;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Landroidx/fragment/app/strictmode/FragmentStrictMode$Flag;", "", "(Ljava/lang/String;I)V", "PENALTY_LOG", "PENALTY_DEATH", "DETECT_FRAGMENT_REUSE", "DETECT_FRAGMENT_TAG_USAGE", "DETECT_WRONG_NESTED_HIERARCHY", "DETECT_RETAIN_INSTANCE_USAGE", "DETECT_SET_USER_VISIBLE_HINT", "DETECT_TARGET_FRAGMENT_USAGE", "DETECT_WRONG_FRAGMENT_CONTAINER", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class Flag extends Enum<Flag> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final Flag PENALTY_LOG = new Flag("PENALTY_LOG", 0);
        public static final Flag PENALTY_DEATH = new Flag("PENALTY_DEATH", 1);
        public static final Flag DETECT_FRAGMENT_REUSE = new Flag("DETECT_FRAGMENT_REUSE", 2);
        public static final Flag DETECT_FRAGMENT_TAG_USAGE = new Flag("DETECT_FRAGMENT_TAG_USAGE", 3);
        public static final Flag DETECT_WRONG_NESTED_HIERARCHY = new Flag("DETECT_WRONG_NESTED_HIERARCHY", 4);
        public static final Flag DETECT_RETAIN_INSTANCE_USAGE = new Flag("DETECT_RETAIN_INSTANCE_USAGE", 5);
        public static final Flag DETECT_SET_USER_VISIBLE_HINT = new Flag("DETECT_SET_USER_VISIBLE_HINT", 6);
        public static final Flag DETECT_TARGET_FRAGMENT_USAGE = new Flag("DETECT_TARGET_FRAGMENT_USAGE", 7);
        public static final Flag DETECT_WRONG_FRAGMENT_CONTAINER = new Flag("DETECT_WRONG_FRAGMENT_CONTAINER", 8);
        private static final /* synthetic */ Flag[] $VALUES = $values();

        private static final /* synthetic */ Flag[] $values() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Flag[]) ipChange.ipc$dispatch("efa0d929", new Object[0]) : new Flag[]{PENALTY_LOG, PENALTY_DEATH, DETECT_FRAGMENT_REUSE, DETECT_FRAGMENT_TAG_USAGE, DETECT_WRONG_NESTED_HIERARCHY, DETECT_RETAIN_INSTANCE_USAGE, DETECT_SET_USER_VISIBLE_HINT, DETECT_TARGET_FRAGMENT_USAGE, DETECT_WRONG_FRAGMENT_CONTAINER};
        }

        private Flag(String str, int i) {
        }

        public static /* synthetic */ Object ipc$super(Flag flag, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/fragment/app/strictmode/FragmentStrictMode$Flag");
        }

        public static Flag valueOf(String str) {
            Object valueOf;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                valueOf = ipChange.ipc$dispatch("1215a1d4", new Object[]{str});
            } else {
                valueOf = Enum.valueOf(Flag.class, str);
            }
            return (Flag) valueOf;
        }

        public static Flag[] values() {
            Object clone;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                clone = ipChange.ipc$dispatch("28ab05", new Object[0]);
            } else {
                clone = $VALUES.clone();
            }
            return (Flag[]) clone;
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Landroidx/fragment/app/strictmode/FragmentStrictMode$OnViolationListener;", "", "Landroidx/fragment/app/strictmode/Violation;", "violation", "Ltb/xhv;", "onViolation", "(Landroidx/fragment/app/strictmode/Violation;)V", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface OnViolationListener {
        void onViolation(Violation violation);
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u00162\u00020\u0001:\u0002\u0015\u0016BA\b\u0000\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012 \u0010\u0007\u001a\u001c\u0012\u0004\u0012\u00020\t\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\f0\u000b0\n0\b¢\u0006\u0002\u0010\rR\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R.\u0010\u0012\u001a\u001c\u0012\u0004\u0012\u00020\t\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\f0\u000b0\u00030\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Landroidx/fragment/app/strictmode/FragmentStrictMode$Policy;", "", "flags", "", "Landroidx/fragment/app/strictmode/FragmentStrictMode$Flag;", DataReceiveMonitor.CB_LISTENER, "Landroidx/fragment/app/strictmode/FragmentStrictMode$OnViolationListener;", "allowedViolations", "", "", "", "Ljava/lang/Class;", "Landroidx/fragment/app/strictmode/Violation;", "(Ljava/util/Set;Landroidx/fragment/app/strictmode/FragmentStrictMode$OnViolationListener;Ljava/util/Map;)V", "getFlags$fragment_release", "()Ljava/util/Set;", "getListener$fragment_release", "()Landroidx/fragment/app/strictmode/FragmentStrictMode$OnViolationListener;", "mAllowedViolations", "getMAllowedViolations$fragment_release", "()Ljava/util/Map;", "Builder", "Companion", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class Policy {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final Companion Companion = new Companion(null);
        public static final Policy LAX = new Policy(kfp.d(), null, a.h());
        private final Set<Flag> flags;
        private final OnViolationListener listener;
        private final Map<String, Set<Class<? extends Violation>>> mAllowedViolations;

        /* compiled from: Taobao */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Landroidx/fragment/app/strictmode/FragmentStrictMode$Policy$Companion;", "", "()V", "LAX", "Landroidx/fragment/app/strictmode/FragmentStrictMode$Policy;", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public static final class Companion {
            public /* synthetic */ Companion(a07 a07Var) {
                this();
            }

            private Companion() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Policy(Set<? extends Flag> set, OnViolationListener onViolationListener, Map<String, ? extends Set<Class<? extends Violation>>> map) {
            ckf.g(set, "flags");
            ckf.g(map, "allowedViolations");
            this.flags = set;
            this.listener = onViolationListener;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, ? extends Set<Class<? extends Violation>>> entry : map.entrySet()) {
                linkedHashMap.put(entry.getKey(), (Set) entry.getValue());
            }
            this.mAllowedViolations = linkedHashMap;
        }

        public final Set<Flag> getFlags$fragment_release() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Set) ipChange.ipc$dispatch("6c419c01", new Object[]{this});
            }
            return this.flags;
        }

        public final OnViolationListener getListener$fragment_release() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (OnViolationListener) ipChange.ipc$dispatch("b962589c", new Object[]{this});
            }
            return this.listener;
        }

        public final Map<String, Set<Class<? extends Violation>>> getMAllowedViolations$fragment_release() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("ddcd799", new Object[]{this});
            }
            return this.mAllowedViolations;
        }

        /* compiled from: Taobao */
        @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J(\u0010\r\u001a\u00020\u00002\u000e\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000f0\u000b2\u000e\u0010\u0010\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\u000bH\u0007J \u0010\r\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\n2\u000e\u0010\u0010\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\u000bH\u0007J\u0006\u0010\u0011\u001a\u00020\u0012J\b\u0010\u0013\u001a\u00020\u0000H\u0007J\b\u0010\u0014\u001a\u00020\u0000H\u0007J\b\u0010\u0015\u001a\u00020\u0000H\u0007J\b\u0010\u0016\u001a\u00020\u0000H\u0007J\b\u0010\u0017\u001a\u00020\u0000H\u0007J\b\u0010\u0018\u001a\u00020\u0000H\u0007J\b\u0010\u0019\u001a\u00020\u0000H\u0007J\b\u0010\u001a\u001a\u00020\u0000H\u0007J\u0010\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\b\u0010\u001c\u001a\u00020\u0000H\u0007R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R(\u0010\b\u001a\u001c\u0012\u0004\u0012\u00020\n\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\f0\u000b0\u00040\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Landroidx/fragment/app/strictmode/FragmentStrictMode$Policy$Builder;", "", "()V", "flags", "", "Landroidx/fragment/app/strictmode/FragmentStrictMode$Flag;", DataReceiveMonitor.CB_LISTENER, "Landroidx/fragment/app/strictmode/FragmentStrictMode$OnViolationListener;", "mAllowedViolations", "", "", "Ljava/lang/Class;", "Landroidx/fragment/app/strictmode/Violation;", "allowViolation", "fragmentClass", "Landroidx/fragment/app/Fragment;", "violationClass", CartRecommendRefreshScene.build, "Landroidx/fragment/app/strictmode/FragmentStrictMode$Policy;", "detectFragmentReuse", "detectFragmentTagUsage", "detectRetainInstanceUsage", "detectSetUserVisibleHint", "detectTargetFragmentUsage", "detectWrongFragmentContainer", "detectWrongNestedHierarchy", "penaltyDeath", "penaltyListener", "penaltyLog", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public static final class Builder {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            private OnViolationListener listener;
            private final Set<Flag> flags = new LinkedHashSet();
            private final Map<String, Set<Class<? extends Violation>>> mAllowedViolations = new LinkedHashMap();

            public final Builder allowViolation(Class<? extends Fragment> cls, Class<? extends Violation> cls2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Builder) ipChange.ipc$dispatch("1ab0e4cd", new Object[]{this, cls, cls2});
                }
                ckf.g(cls, "fragmentClass");
                ckf.g(cls2, "violationClass");
                return allowViolation(cls.getName(), cls2);
            }

            public final Policy build() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Policy) ipChange.ipc$dispatch("d2e19dd2", new Object[]{this});
                }
                if (this.listener == null && !this.flags.contains(Flag.PENALTY_DEATH)) {
                    penaltyLog();
                }
                return new Policy(this.flags, this.listener, this.mAllowedViolations);
            }

            public final Builder detectFragmentReuse() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Builder) ipChange.ipc$dispatch("1d3ac9c8", new Object[]{this});
                }
                this.flags.add(Flag.DETECT_FRAGMENT_REUSE);
                return this;
            }

            public final Builder detectFragmentTagUsage() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Builder) ipChange.ipc$dispatch("1878266f", new Object[]{this});
                }
                this.flags.add(Flag.DETECT_FRAGMENT_TAG_USAGE);
                return this;
            }

            public final Builder detectRetainInstanceUsage() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Builder) ipChange.ipc$dispatch("6ab23325", new Object[]{this});
                }
                this.flags.add(Flag.DETECT_RETAIN_INSTANCE_USAGE);
                return this;
            }

            public final Builder detectSetUserVisibleHint() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Builder) ipChange.ipc$dispatch("9e11ad9a", new Object[]{this});
                }
                this.flags.add(Flag.DETECT_SET_USER_VISIBLE_HINT);
                return this;
            }

            public final Builder detectTargetFragmentUsage() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Builder) ipChange.ipc$dispatch("9f5dcaec", new Object[]{this});
                }
                this.flags.add(Flag.DETECT_TARGET_FRAGMENT_USAGE);
                return this;
            }

            public final Builder detectWrongFragmentContainer() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Builder) ipChange.ipc$dispatch("e3be2c2", new Object[]{this});
                }
                this.flags.add(Flag.DETECT_WRONG_FRAGMENT_CONTAINER);
                return this;
            }

            public final Builder detectWrongNestedHierarchy() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Builder) ipChange.ipc$dispatch("6c275b5", new Object[]{this});
                }
                this.flags.add(Flag.DETECT_WRONG_NESTED_HIERARCHY);
                return this;
            }

            public final Builder penaltyDeath() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Builder) ipChange.ipc$dispatch("c5eb4b3e", new Object[]{this});
                }
                this.flags.add(Flag.PENALTY_DEATH);
                return this;
            }

            public final Builder penaltyListener(OnViolationListener onViolationListener) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Builder) ipChange.ipc$dispatch("65b458a1", new Object[]{this, onViolationListener});
                }
                ckf.g(onViolationListener, DataReceiveMonitor.CB_LISTENER);
                this.listener = onViolationListener;
                return this;
            }

            public final Builder penaltyLog() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Builder) ipChange.ipc$dispatch("5262e6ae", new Object[]{this});
                }
                this.flags.add(Flag.PENALTY_LOG);
                return this;
            }

            public final Builder allowViolation(String str, Class<? extends Violation> cls) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Builder) ipChange.ipc$dispatch("e6d30f80", new Object[]{this, str, cls});
                }
                ckf.g(str, "fragmentClass");
                ckf.g(cls, "violationClass");
                Set<Class<? extends Violation>> set = this.mAllowedViolations.get(str);
                if (set == null) {
                    set = new LinkedHashSet<>();
                }
                set.add(cls);
                this.mAllowedViolations.put(str, set);
                return this;
            }
        }
    }

    private FragmentStrictMode() {
    }

    private final Policy getNearestPolicy(Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Policy) ipChange.ipc$dispatch("2ea04f4e", new Object[]{this, fragment});
        }
        while (fragment != null) {
            if (fragment.isAdded()) {
                FragmentManager parentFragmentManager = fragment.getParentFragmentManager();
                ckf.f(parentFragmentManager, "declaringFragment.parentFragmentManager");
                if (parentFragmentManager.getStrictModePolicy() != null) {
                    Policy strictModePolicy = parentFragmentManager.getStrictModePolicy();
                    ckf.d(strictModePolicy);
                    return strictModePolicy;
                }
            }
            fragment = fragment.getParentFragment();
        }
        return defaultPolicy;
    }

    private final void handlePolicyViolation(final Policy policy, final Violation violation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f37acde9", new Object[]{this, policy, violation});
            return;
        }
        Fragment fragment = violation.getFragment();
        final String name = fragment.getClass().getName();
        if (policy.getFlags$fragment_release().contains(Flag.PENALTY_LOG)) {
            "Policy violation in ".concat(name);
        }
        if (policy.getListener$fragment_release() != null) {
            runOnHostThread(fragment, new Runnable() { // from class: tb.lx9
                @Override // java.lang.Runnable
                public final void run() {
                    FragmentStrictMode.handlePolicyViolation$lambda$0(FragmentStrictMode.Policy.this, violation);
                }
            });
        }
        if (policy.getFlags$fragment_release().contains(Flag.PENALTY_DEATH)) {
            runOnHostThread(fragment, new Runnable() { // from class: tb.mx9
                @Override // java.lang.Runnable
                public final void run() {
                    FragmentStrictMode.handlePolicyViolation$lambda$1(name, violation);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handlePolicyViolation$lambda$0(Policy policy, Violation violation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("786709ea", new Object[]{policy, violation});
            return;
        }
        ckf.g(policy, "$policy");
        ckf.g(violation, "$violation");
        policy.getListener$fragment_release().onViolation(violation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handlePolicyViolation$lambda$1(String str, Violation violation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5408ba4", new Object[]{str, violation});
            return;
        }
        ckf.g(violation, "$violation");
        Log.e(TAG, "Policy violation with PENALTY_DEATH in " + str, violation);
        throw violation;
    }

    private final void logIfDebuggingEnabled(Violation violation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de7d8ba1", new Object[]{this, violation});
        } else if (FragmentManager.isLoggingEnabled(3)) {
            "StrictMode violation in ".concat(violation.getFragment().getClass().getName());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmStatic
    public static final void onFragmentReuse(Fragment fragment, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddbf8a2e", new Object[]{fragment, str});
            return;
        }
        ckf.g(fragment, "fragment");
        ckf.g(str, "previousFragmentId");
        FragmentReuseViolation fragmentReuseViolation = new FragmentReuseViolation(fragment, str);
        FragmentStrictMode fragmentStrictMode = INSTANCE;
        fragmentStrictMode.logIfDebuggingEnabled(fragmentReuseViolation);
        Policy nearestPolicy = fragmentStrictMode.getNearestPolicy(fragment);
        if (nearestPolicy.getFlags$fragment_release().contains(Flag.DETECT_FRAGMENT_REUSE) && fragmentStrictMode.shouldHandlePolicyViolation(nearestPolicy, fragment.getClass(), fragmentReuseViolation.getClass())) {
            fragmentStrictMode.handlePolicyViolation(nearestPolicy, fragmentReuseViolation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmStatic
    public static final void onFragmentTagUsage(Fragment fragment, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb20e854", new Object[]{fragment, viewGroup});
            return;
        }
        ckf.g(fragment, "fragment");
        FragmentTagUsageViolation fragmentTagUsageViolation = new FragmentTagUsageViolation(fragment, viewGroup);
        FragmentStrictMode fragmentStrictMode = INSTANCE;
        fragmentStrictMode.logIfDebuggingEnabled(fragmentTagUsageViolation);
        Policy nearestPolicy = fragmentStrictMode.getNearestPolicy(fragment);
        if (nearestPolicy.getFlags$fragment_release().contains(Flag.DETECT_FRAGMENT_TAG_USAGE) && fragmentStrictMode.shouldHandlePolicyViolation(nearestPolicy, fragment.getClass(), fragmentTagUsageViolation.getClass())) {
            fragmentStrictMode.handlePolicyViolation(nearestPolicy, fragmentTagUsageViolation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmStatic
    public static final void onGetRetainInstanceUsage(Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("349800f", new Object[]{fragment});
            return;
        }
        ckf.g(fragment, "fragment");
        GetRetainInstanceUsageViolation getRetainInstanceUsageViolation = new GetRetainInstanceUsageViolation(fragment);
        FragmentStrictMode fragmentStrictMode = INSTANCE;
        fragmentStrictMode.logIfDebuggingEnabled(getRetainInstanceUsageViolation);
        Policy nearestPolicy = fragmentStrictMode.getNearestPolicy(fragment);
        if (nearestPolicy.getFlags$fragment_release().contains(Flag.DETECT_RETAIN_INSTANCE_USAGE) && fragmentStrictMode.shouldHandlePolicyViolation(nearestPolicy, fragment.getClass(), getRetainInstanceUsageViolation.getClass())) {
            fragmentStrictMode.handlePolicyViolation(nearestPolicy, getRetainInstanceUsageViolation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmStatic
    public static final void onGetTargetFragmentRequestCodeUsage(Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("188dd8dc", new Object[]{fragment});
            return;
        }
        ckf.g(fragment, "fragment");
        GetTargetFragmentRequestCodeUsageViolation getTargetFragmentRequestCodeUsageViolation = new GetTargetFragmentRequestCodeUsageViolation(fragment);
        FragmentStrictMode fragmentStrictMode = INSTANCE;
        fragmentStrictMode.logIfDebuggingEnabled(getTargetFragmentRequestCodeUsageViolation);
        Policy nearestPolicy = fragmentStrictMode.getNearestPolicy(fragment);
        if (nearestPolicy.getFlags$fragment_release().contains(Flag.DETECT_TARGET_FRAGMENT_USAGE) && fragmentStrictMode.shouldHandlePolicyViolation(nearestPolicy, fragment.getClass(), getTargetFragmentRequestCodeUsageViolation.getClass())) {
            fragmentStrictMode.handlePolicyViolation(nearestPolicy, getTargetFragmentRequestCodeUsageViolation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmStatic
    public static final void onGetTargetFragmentUsage(Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6acbf9a8", new Object[]{fragment});
            return;
        }
        ckf.g(fragment, "fragment");
        GetTargetFragmentUsageViolation getTargetFragmentUsageViolation = new GetTargetFragmentUsageViolation(fragment);
        FragmentStrictMode fragmentStrictMode = INSTANCE;
        fragmentStrictMode.logIfDebuggingEnabled(getTargetFragmentUsageViolation);
        Policy nearestPolicy = fragmentStrictMode.getNearestPolicy(fragment);
        if (nearestPolicy.getFlags$fragment_release().contains(Flag.DETECT_TARGET_FRAGMENT_USAGE) && fragmentStrictMode.shouldHandlePolicyViolation(nearestPolicy, fragment.getClass(), getTargetFragmentUsageViolation.getClass())) {
            fragmentStrictMode.handlePolicyViolation(nearestPolicy, getTargetFragmentUsageViolation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmStatic
    public static final void onSetRetainInstanceUsage(Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e669583", new Object[]{fragment});
            return;
        }
        ckf.g(fragment, "fragment");
        SetRetainInstanceUsageViolation setRetainInstanceUsageViolation = new SetRetainInstanceUsageViolation(fragment);
        FragmentStrictMode fragmentStrictMode = INSTANCE;
        fragmentStrictMode.logIfDebuggingEnabled(setRetainInstanceUsageViolation);
        Policy nearestPolicy = fragmentStrictMode.getNearestPolicy(fragment);
        if (nearestPolicy.getFlags$fragment_release().contains(Flag.DETECT_RETAIN_INSTANCE_USAGE) && fragmentStrictMode.shouldHandlePolicyViolation(nearestPolicy, fragment.getClass(), setRetainInstanceUsageViolation.getClass())) {
            fragmentStrictMode.handlePolicyViolation(nearestPolicy, setRetainInstanceUsageViolation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmStatic
    public static final void onSetTargetFragmentUsage(Fragment fragment, Fragment fragment2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fa1296f", new Object[]{fragment, fragment2, new Integer(i)});
            return;
        }
        ckf.g(fragment, "violatingFragment");
        ckf.g(fragment2, "targetFragment");
        SetTargetFragmentUsageViolation setTargetFragmentUsageViolation = new SetTargetFragmentUsageViolation(fragment, fragment2, i);
        FragmentStrictMode fragmentStrictMode = INSTANCE;
        fragmentStrictMode.logIfDebuggingEnabled(setTargetFragmentUsageViolation);
        Policy nearestPolicy = fragmentStrictMode.getNearestPolicy(fragment);
        if (nearestPolicy.getFlags$fragment_release().contains(Flag.DETECT_TARGET_FRAGMENT_USAGE) && fragmentStrictMode.shouldHandlePolicyViolation(nearestPolicy, fragment.getClass(), setTargetFragmentUsageViolation.getClass())) {
            fragmentStrictMode.handlePolicyViolation(nearestPolicy, setTargetFragmentUsageViolation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmStatic
    public static final void onSetUserVisibleHint(Fragment fragment, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d46b4a", new Object[]{fragment, new Boolean(z)});
            return;
        }
        ckf.g(fragment, "fragment");
        SetUserVisibleHintViolation setUserVisibleHintViolation = new SetUserVisibleHintViolation(fragment, z);
        FragmentStrictMode fragmentStrictMode = INSTANCE;
        fragmentStrictMode.logIfDebuggingEnabled(setUserVisibleHintViolation);
        Policy nearestPolicy = fragmentStrictMode.getNearestPolicy(fragment);
        if (nearestPolicy.getFlags$fragment_release().contains(Flag.DETECT_SET_USER_VISIBLE_HINT) && fragmentStrictMode.shouldHandlePolicyViolation(nearestPolicy, fragment.getClass(), setUserVisibleHintViolation.getClass())) {
            fragmentStrictMode.handlePolicyViolation(nearestPolicy, setUserVisibleHintViolation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmStatic
    public static final void onWrongFragmentContainer(Fragment fragment, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b2fc4e1", new Object[]{fragment, viewGroup});
            return;
        }
        ckf.g(fragment, "fragment");
        ckf.g(viewGroup, "container");
        WrongFragmentContainerViolation wrongFragmentContainerViolation = new WrongFragmentContainerViolation(fragment, viewGroup);
        FragmentStrictMode fragmentStrictMode = INSTANCE;
        fragmentStrictMode.logIfDebuggingEnabled(wrongFragmentContainerViolation);
        Policy nearestPolicy = fragmentStrictMode.getNearestPolicy(fragment);
        if (nearestPolicy.getFlags$fragment_release().contains(Flag.DETECT_WRONG_FRAGMENT_CONTAINER) && fragmentStrictMode.shouldHandlePolicyViolation(nearestPolicy, fragment.getClass(), wrongFragmentContainerViolation.getClass())) {
            fragmentStrictMode.handlePolicyViolation(nearestPolicy, wrongFragmentContainerViolation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmStatic
    public static final void onWrongNestedHierarchy(Fragment fragment, Fragment fragment2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d31175c", new Object[]{fragment, fragment2, new Integer(i)});
            return;
        }
        ckf.g(fragment, "fragment");
        ckf.g(fragment2, "expectedParentFragment");
        WrongNestedHierarchyViolation wrongNestedHierarchyViolation = new WrongNestedHierarchyViolation(fragment, fragment2, i);
        FragmentStrictMode fragmentStrictMode = INSTANCE;
        fragmentStrictMode.logIfDebuggingEnabled(wrongNestedHierarchyViolation);
        Policy nearestPolicy = fragmentStrictMode.getNearestPolicy(fragment);
        if (nearestPolicy.getFlags$fragment_release().contains(Flag.DETECT_WRONG_NESTED_HIERARCHY) && fragmentStrictMode.shouldHandlePolicyViolation(nearestPolicy, fragment.getClass(), wrongNestedHierarchyViolation.getClass())) {
            fragmentStrictMode.handlePolicyViolation(nearestPolicy, wrongNestedHierarchyViolation);
        }
    }

    private final void runOnHostThread(Fragment fragment, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fcc2db9", new Object[]{this, fragment, runnable});
        } else if (fragment.isAdded()) {
            Handler handler = fragment.getParentFragmentManager().getHost().getHandler();
            if (ckf.b(handler.getLooper(), Looper.myLooper())) {
                runnable.run();
            } else {
                handler.post(runnable);
            }
        } else {
            runnable.run();
        }
    }

    private final boolean shouldHandlePolicyViolation(Policy policy, Class<? extends Fragment> cls, Class<? extends Violation> cls2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8c3c6894", new Object[]{this, policy, cls, cls2})).booleanValue();
        }
        Set<Class<? extends Violation>> set = policy.getMAllowedViolations$fragment_release().get(cls.getName());
        if (set == null) {
            return true;
        }
        if (ckf.b(cls2.getSuperclass(), Violation.class) || !i04.R(set, cls2.getSuperclass())) {
            return !set.contains(cls2);
        }
        return false;
    }

    public final Policy getDefaultPolicy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Policy) ipChange.ipc$dispatch("418f5b43", new Object[]{this});
        }
        return defaultPolicy;
    }

    public final void onPolicyViolation(Violation violation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82ada5c1", new Object[]{this, violation});
            return;
        }
        ckf.g(violation, "violation");
        logIfDebuggingEnabled(violation);
        Fragment fragment = violation.getFragment();
        Policy nearestPolicy = getNearestPolicy(fragment);
        if (shouldHandlePolicyViolation(nearestPolicy, fragment.getClass(), violation.getClass())) {
            handlePolicyViolation(nearestPolicy, violation);
        }
    }

    public final void setDefaultPolicy(Policy policy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ceb0fa9", new Object[]{this, policy});
            return;
        }
        ckf.g(policy, "<set-?>");
        defaultPolicy = policy;
    }
}
