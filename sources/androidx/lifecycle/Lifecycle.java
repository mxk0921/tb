package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlinx.coroutines.flow.m;
import tb.a07;
import tb.ajq;
import tb.ckf;
import tb.hfj;
import tb.mcs;
import tb.pg1;
import tb.yp9;

/* compiled from: Taobao */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001:\u0002\u001b\u001cB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\t\u0010\bRR\u0010\r\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00010\nj\n\u0012\u0006\u0012\u0004\u0018\u00010\u0001`\u000b2\u001a\u0010\f\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00010\nj\n\u0012\u0006\u0012\u0004\u0018\u00010\u0001`\u000b8G@GX\u0087\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00130\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Landroidx/lifecycle/Lifecycle;", "", "<init>", "()V", "Landroidx/lifecycle/LifecycleObserver;", "observer", "Ltb/xhv;", "addObserver", "(Landroidx/lifecycle/LifecycleObserver;)V", "removeObserver", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/lifecycle/AtomicReference;", "<set-?>", "internalScopeRef", "Ljava/util/concurrent/atomic/AtomicReference;", "getInternalScopeRef", "()Ljava/util/concurrent/atomic/AtomicReference;", "setInternalScopeRef", "(Ljava/util/concurrent/atomic/AtomicReference;)V", "Landroidx/lifecycle/Lifecycle$State;", "getCurrentState", "()Landroidx/lifecycle/Lifecycle$State;", "currentState", "Ltb/ajq;", "getCurrentStateFlow", "()Ltb/ajq;", "currentStateFlow", pg1.ATOM_EXT_Event, "State", "lifecycle-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class Lifecycle {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private AtomicReference<Object> internalScopeRef = new AtomicReference<>(null);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0001\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, d2 = {"Landroidx/lifecycle/Lifecycle$Event;", "", "(Ljava/lang/String;I)V", "targetState", "Landroidx/lifecycle/Lifecycle$State;", "getTargetState", "()Landroidx/lifecycle/Lifecycle$State;", "ON_CREATE", mcs.EVENT_ON_START, "ON_RESUME", "ON_PAUSE", "ON_STOP", "ON_DESTROY", "ON_ANY", "Companion", "lifecycle-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class Event extends Enum<Event> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final Event ON_CREATE = new Event("ON_CREATE", 0);
        public static final Event ON_START = new Event(mcs.EVENT_ON_START, 1);
        public static final Event ON_RESUME = new Event("ON_RESUME", 2);
        public static final Event ON_PAUSE = new Event("ON_PAUSE", 3);
        public static final Event ON_STOP = new Event("ON_STOP", 4);
        public static final Event ON_DESTROY = new Event("ON_DESTROY", 5);
        public static final Event ON_ANY = new Event("ON_ANY", 6);
        private static final /* synthetic */ Event[] $VALUES = $values();
        public static final Companion Companion = new Companion(null);

        /* compiled from: Taobao */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0012\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\n"}, d2 = {"Landroidx/lifecycle/Lifecycle$Event$Companion;", "", "()V", "downFrom", "Landroidx/lifecycle/Lifecycle$Event;", "state", "Landroidx/lifecycle/Lifecycle$State;", "downTo", "upFrom", "upTo", "lifecycle-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public static final class Companion {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* compiled from: Taobao */
            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[State.values().length];
                    try {
                        iArr[State.CREATED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[State.STARTED.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[State.RESUMED.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[State.DESTROYED.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[State.INITIALIZED.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(a07 a07Var) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final Event downFrom(State state) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Event) ipChange.ipc$dispatch("2e3bbd3a", new Object[]{this, state});
                }
                ckf.g(state, "state");
                int i = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
                if (i == 1) {
                    return Event.ON_DESTROY;
                }
                if (i == 2) {
                    return Event.ON_STOP;
                }
                if (i != 3) {
                    return null;
                }
                return Event.ON_PAUSE;
            }

            @JvmStatic
            public final Event downTo(State state) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Event) ipChange.ipc$dispatch("2114b949", new Object[]{this, state});
                }
                ckf.g(state, "state");
                int i = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
                if (i == 1) {
                    return Event.ON_STOP;
                }
                if (i == 2) {
                    return Event.ON_PAUSE;
                }
                if (i != 4) {
                    return null;
                }
                return Event.ON_DESTROY;
            }

            @JvmStatic
            public final Event upFrom(State state) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Event) ipChange.ipc$dispatch("7de1ca21", new Object[]{this, state});
                }
                ckf.g(state, "state");
                int i = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
                if (i == 1) {
                    return Event.ON_START;
                }
                if (i == 2) {
                    return Event.ON_RESUME;
                }
                if (i != 5) {
                    return null;
                }
                return Event.ON_CREATE;
            }

            @JvmStatic
            public final Event upTo(State state) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Event) ipChange.ipc$dispatch("58d6d3f0", new Object[]{this, state});
                }
                ckf.g(state, "state");
                int i = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
                if (i == 1) {
                    return Event.ON_CREATE;
                }
                if (i == 2) {
                    return Event.ON_START;
                }
                if (i != 3) {
                    return null;
                }
                return Event.ON_RESUME;
            }
        }

        /* compiled from: Taobao */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Event.values().length];
                try {
                    iArr[Event.ON_CREATE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Event.ON_STOP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Event.ON_START.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[Event.ON_PAUSE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[Event.ON_RESUME.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[Event.ON_DESTROY.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[Event.ON_ANY.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        private static final /* synthetic */ Event[] $values() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Event[]) ipChange.ipc$dispatch("523d008c", new Object[0]) : new Event[]{ON_CREATE, ON_START, ON_RESUME, ON_PAUSE, ON_STOP, ON_DESTROY, ON_ANY};
        }

        private Event(String str, int i) {
        }

        @JvmStatic
        public static final Event downFrom(State state) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Event) ipChange.ipc$dispatch("2e3bbd3a", new Object[]{state});
            }
            return Companion.downFrom(state);
        }

        @JvmStatic
        public static final Event downTo(State state) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Event) ipChange.ipc$dispatch("2114b949", new Object[]{state});
            }
            return Companion.downTo(state);
        }

        public static /* synthetic */ Object ipc$super(Event event, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/lifecycle/Lifecycle$Event");
        }

        @JvmStatic
        public static final Event upFrom(State state) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Event) ipChange.ipc$dispatch("7de1ca21", new Object[]{state});
            }
            return Companion.upFrom(state);
        }

        @JvmStatic
        public static final Event upTo(State state) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Event) ipChange.ipc$dispatch("58d6d3f0", new Object[]{state});
            }
            return Companion.upTo(state);
        }

        public static Event valueOf(String str) {
            Object valueOf;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                valueOf = ipChange.ipc$dispatch("b7f99b77", new Object[]{str});
            } else {
                valueOf = Enum.valueOf(Event.class, str);
            }
            return (Event) valueOf;
        }

        public static Event[] values() {
            Object clone;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                clone = ipChange.ipc$dispatch("cd0f9f68", new Object[0]);
            } else {
                clone = $VALUES.clone();
            }
            return (Event[]) clone;
        }

        public final State getTargetState() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (State) ipChange.ipc$dispatch("672cf548", new Object[]{this});
            }
            switch (WhenMappings.$EnumSwitchMapping$0[ordinal()]) {
                case 1:
                case 2:
                    return State.CREATED;
                case 3:
                case 4:
                    return State.STARTED;
                case 5:
                    return State.RESUMED;
                case 6:
                    return State.DESTROYED;
                default:
                    throw new IllegalArgumentException(this + " has no target state");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _get_currentStateFlow_$lambda$0(hfj hfjVar, LifecycleOwner lifecycleOwner, Event event) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("633e49", new Object[]{hfjVar, lifecycleOwner, event});
            return;
        }
        ckf.g(hfjVar, "$mutableStateFlow");
        ckf.g(lifecycleOwner, "<anonymous parameter 0>");
        ckf.g(event, "event");
        hfjVar.setValue(event.getTargetState());
    }

    public abstract void addObserver(LifecycleObserver lifecycleObserver);

    public abstract State getCurrentState();

    public ajq<State> getCurrentStateFlow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ajq) ipChange.ipc$dispatch("615555fa", new Object[]{this});
        }
        final hfj a2 = m.a(getCurrentState());
        addObserver(new LifecycleEventObserver() { // from class: tb.lng
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                Lifecycle._get_currentStateFlow_$lambda$0(hfj.this, lifecycleOwner, event);
            }
        });
        return yp9.a(a2);
    }

    public final AtomicReference<Object> getInternalScopeRef() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicReference) ipChange.ipc$dispatch("ab075036", new Object[]{this});
        }
        return this.internalScopeRef;
    }

    public abstract void removeObserver(LifecycleObserver lifecycleObserver);

    public final void setInternalScopeRef(AtomicReference<Object> atomicReference) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("404c51e8", new Object[]{this, atomicReference});
            return;
        }
        ckf.g(atomicReference, "<set-?>");
        this.internalScopeRef = atomicReference;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0000j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Landroidx/lifecycle/Lifecycle$State;", "", "(Ljava/lang/String;I)V", "isAtLeast", "", "state", "DESTROYED", "INITIALIZED", "CREATED", "STARTED", "RESUMED", "lifecycle-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class State extends Enum<State> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final State DESTROYED = new State("DESTROYED", 0);
        public static final State INITIALIZED = new State("INITIALIZED", 1);
        public static final State CREATED = new State("CREATED", 2);
        public static final State STARTED = new State("STARTED", 3);
        public static final State RESUMED = new State("RESUMED", 4);
        private static final /* synthetic */ State[] $VALUES = $values();

        private static final /* synthetic */ State[] $values() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (State[]) ipChange.ipc$dispatch("6a02ed75", new Object[0]) : new State[]{DESTROYED, INITIALIZED, CREATED, STARTED, RESUMED};
        }

        private State(String str, int i) {
        }

        public static /* synthetic */ Object ipc$super(State state, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/lifecycle/Lifecycle$State");
        }

        public static State valueOf(String str) {
            Object valueOf;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                valueOf = ipChange.ipc$dispatch("cfbf8860", new Object[]{str});
            } else {
                valueOf = Enum.valueOf(State.class, str);
            }
            return (State) valueOf;
        }

        public static State[] values() {
            Object clone;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                clone = ipChange.ipc$dispatch("e4d58c51", new Object[0]);
            } else {
                clone = $VALUES.clone();
            }
            return (State[]) clone;
        }

        public final boolean isAtLeast(State state) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("c80b42da", new Object[]{this, state})).booleanValue();
            }
            ckf.g(state, "state");
            return compareTo(state) >= 0;
        }
    }
}
