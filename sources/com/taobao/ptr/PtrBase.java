package com.taobao.ptr;

import android.content.Context;
import android.util.AttributeSet;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.ptr.PullBase;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.List;
import tb.l2n;
import tb.n2n;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class PtrBase extends PullBase {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int INVALID_VALUE = -1;
    private List<n2n> endPtrProxies;
    private PtrLayout mEndLayout;
    private volatile boolean mFreezeEnd;
    private volatile boolean mFreezeStart;
    private e mOnRefreshListener;
    private PtrLayout mStartLayout;
    private State mState = State.RESET;
    private List<n2n> startPtrProxies;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public enum State {
        RESET(0),
        PULL(1),
        READY(2),
        REFRESHING(3),
        COMPLETE(4);
        
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private int mIntValue;

        State(int i) {
            this.mIntValue = i;
        }

        public static /* synthetic */ Object ipc$super(State state, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/ptr/PtrBase$State");
        }

        public static State mapIntToValue(int i) {
            State[] values;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (State) ipChange.ipc$dispatch("56b0094", new Object[]{new Integer(i)});
            }
            for (State state : values()) {
                if (i == state.getIntValue()) {
                    return state;
                }
            }
            return RESET;
        }

        public static State valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (State) ipChange.ipc$dispatch("3e5a8ed4", new Object[]{str});
            }
            return (State) Enum.valueOf(State.class, str);
        }

        public int getIntValue() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("7e178cb2", new Object[]{this})).intValue();
            }
            return this.mIntValue;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements PullBase.g {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.ptr.PullBase.g
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3f03d2b3", new Object[]{this});
            } else {
                PtrBase.access$000(PtrBase.this, State.RESET, PullBase.Mode.PULL_FROM_END, new CharSequence[0]);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements PullBase.g {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // com.taobao.ptr.PullBase.g
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3f03d2b3", new Object[]{this});
            } else {
                PtrBase.access$000(PtrBase.this, State.RESET, PullBase.Mode.PULL_FROM_START, new CharSequence[0]);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements PullBase.g {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ PullBase.Mode f11482a;

        public c(PullBase.Mode mode) {
            this.f11482a = mode;
        }

        @Override // com.taobao.ptr.PullBase.g
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3f03d2b3", new Object[]{this});
            } else {
                PtrBase.access$000(PtrBase.this, State.RESET, this.f11482a, new CharSequence[0]);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static /* synthetic */ class d {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$ptr$PtrBase$State;
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$ptr$PullBase$Mode;

        static {
            int[] iArr = new int[State.values().length];
            $SwitchMap$com$taobao$ptr$PtrBase$State = iArr;
            try {
                iArr[State.RESET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$ptr$PtrBase$State[State.PULL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$taobao$ptr$PtrBase$State[State.READY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$taobao$ptr$PtrBase$State[State.REFRESHING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$taobao$ptr$PtrBase$State[State.COMPLETE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[PullBase.Mode.values().length];
            $SwitchMap$com$taobao$ptr$PullBase$Mode = iArr2;
            try {
                iArr2[PullBase.Mode.DISABLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$taobao$ptr$PullBase$Mode[PullBase.Mode.PULL_FROM_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$taobao$ptr$PullBase$Mode[PullBase.Mode.PULL_FROM_END.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$taobao$ptr$PullBase$Mode[PullBase.Mode.BOTH.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface e {
        void a(PtrBase ptrBase);

        void b(PtrBase ptrBase);
    }

    static {
        t2o.a(632291334);
    }

    public PtrBase(Context context) {
        super(context);
    }

    public static /* synthetic */ void access$000(PtrBase ptrBase, State state, PullBase.Mode mode, CharSequence[] charSequenceArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("401f8fb5", new Object[]{ptrBase, state, mode, charSequenceArr});
        } else {
            ptrBase.setState(state, mode, charSequenceArr);
        }
    }

    private void callRefreshListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36de0a78", new Object[]{this});
        } else if (this.mOnRefreshListener == null) {
        } else {
            if (getCurrentMode() == PullBase.Mode.PULL_FROM_START) {
                this.mOnRefreshListener.b(this);
            } else if (getCurrentMode() == PullBase.Mode.PULL_FROM_END) {
                this.mOnRefreshListener.a(this);
            }
        }
    }

    private boolean checkIfFreeze(PullBase.Mode mode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4f92aa39", new Object[]{this, mode})).booleanValue();
        }
        int i = d.$SwitchMap$com$taobao$ptr$PullBase$Mode[mode.ordinal()];
        if (i != 2) {
            if (i == 3 && this.mFreezeEnd) {
                return true;
            }
        } else if (this.mFreezeStart) {
            return true;
        }
        return false;
    }

    private int getPullLayoutContentSize(PullBase.Mode mode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3216b1c1", new Object[]{this, mode})).intValue();
        }
        int pullDirectionInternal = getPullDirectionInternal();
        int i = d.$SwitchMap$com$taobao$ptr$PullBase$Mode[mode.ordinal()];
        if (i != 2) {
            if (i == 3 && !this.mEndLayout.isDisableIntrinsicPullFeature()) {
                return this.mEndLayout.getContentSize(pullDirectionInternal);
            }
        } else if (!this.mStartLayout.isDisableIntrinsicPullFeature()) {
            return -this.mStartLayout.getContentSize(pullDirectionInternal);
        }
        return -1;
    }

    private int getRefreshingValue(PullBase.Mode mode) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fd157940", new Object[]{this, mode})).intValue();
        }
        int pullDirectionInternal = getPullDirectionInternal();
        if (getPullAdapter() instanceof com.taobao.ptr.a) {
            i = ((com.taobao.ptr.a) getPullAdapter()).getReadyToRefreshingValue(this, mode, pullDirectionInternal);
        } else {
            i = -1;
        }
        if (i == -1) {
            return getPullLayoutContentSize(mode);
        }
        return i;
    }

    private int getReleaseValue(PullBase.Mode mode) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("69b37e0c", new Object[]{this, mode})).intValue();
        }
        int pullDirectionInternal = getPullDirectionInternal();
        if (getPullAdapter() instanceof com.taobao.ptr.a) {
            i = ((com.taobao.ptr.a) getPullAdapter()).getReleaseTargetValue(this, mode, pullDirectionInternal);
        } else {
            i = -1;
        }
        if (i == -1) {
            return getPullLayoutContentSize(mode);
        }
        return i;
    }

    public static /* synthetic */ Object ipc$super(PtrBase ptrBase, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1863181809:
                super.onDirectionUpdated((PullBase.Mode) objArr[0], ((Number) objArr[1]).intValue());
                return null;
            case -1019106259:
                return new Boolean(super.allowCheckPullWhenRollBack());
            case -797660137:
                return new Integer(super.onRelease((PullBase.Mode) objArr[0], ((Number) objArr[1]).floatValue(), ((Number) objArr[2]).intValue()));
            case 2095602:
                super.onModeUpdated((PullBase.Mode) objArr[0]);
                return null;
            case 94498214:
                return new Boolean(super.allowCatchPullEndTouch());
            case 110925887:
                return new Boolean(super.allowCatchPullStartTouch());
            case 1717374400:
                super.onPull((PullBase.Mode) objArr[0], ((Number) objArr[1]).floatValue(), ((Number) objArr[2]).intValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/ptr/PtrBase");
        }
    }

    private boolean isIdle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d3f261a9", new Object[]{this})).booleanValue();
        }
        if (getState() != State.RESET || isRunnableScrolling()) {
            return false;
        }
        return true;
    }

    private void onComplete(PullBase.Mode mode, CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8d275d5", new Object[]{this, mode, charSequence});
            return;
        }
        int i = d.$SwitchMap$com$taobao$ptr$PullBase$Mode[mode.ordinal()];
        if (i == 2) {
            for (n2n n2nVar : this.startPtrProxies) {
                n2nVar.onCompleteUpdate(charSequence);
            }
        } else if (i == 3) {
            for (n2n n2nVar2 : this.endPtrProxies) {
                n2nVar2.onCompleteUpdate(charSequence);
            }
        }
    }

    private void onRefreshing(PullBase.Mode mode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2f226df", new Object[]{this, mode});
            return;
        }
        int i = d.$SwitchMap$com$taobao$ptr$PullBase$Mode[mode.ordinal()];
        if (i == 2) {
            for (n2n n2nVar : this.startPtrProxies) {
                n2nVar.onRefreshing();
            }
        } else if (i == 3) {
            for (n2n n2nVar2 : this.endPtrProxies) {
                n2nVar2.onRefreshing();
            }
        }
    }

    private void pullEvent(PullBase.Mode mode, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c616f972", new Object[]{this, mode, new Float(f)});
            return;
        }
        onPull(mode, f);
        int refreshingValue = getRefreshingValue(mode);
        if (refreshingValue != -1) {
            int i = d.$SwitchMap$com$taobao$ptr$PullBase$Mode[mode.ordinal()];
            if (i != 2) {
                if (i == 3) {
                    if (f >= refreshingValue) {
                        setState(State.READY, mode, new CharSequence[0]);
                    } else {
                        setState(State.PULL, mode, new CharSequence[0]);
                    }
                }
            } else if (f <= refreshingValue) {
                setState(State.READY, mode, new CharSequence[0]);
            } else {
                setState(State.PULL, mode, new CharSequence[0]);
            }
        }
    }

    private int releaseEvent(PullBase.Mode mode, float f) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("90970927", new Object[]{this, mode, new Float(f)})).intValue();
        }
        onRelease(mode, f);
        if (getState() == State.READY) {
            i = getReleaseValue(mode);
        } else {
            i = 0;
        }
        if (i == -1) {
            return 0;
        }
        return i;
    }

    private void resetEvent(PullBase.Mode mode, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a83f167c", new Object[]{this, mode, new Float(f)});
        } else if (getState() == State.READY) {
            setState(State.REFRESHING, mode, new CharSequence[0]);
        } else {
            setState(State.RESET, mode, new CharSequence[0]);
        }
    }

    private synchronized void setState(State state, PullBase.Mode mode, CharSequence... charSequenceArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cdbe9ffa", new Object[]{this, state, mode, charSequenceArr});
            return;
        }
        this.mState = state;
        int i = d.$SwitchMap$com$taobao$ptr$PtrBase$State[state.ordinal()];
        if (i != 1) {
            if (i != 4) {
                if (i == 5 && !checkIfFreeze(mode)) {
                    CharSequence string = getContext().getString(R.string.ptr_complete_label);
                    if (charSequenceArr != null && charSequenceArr.length > 0) {
                        string = charSequenceArr[0];
                    }
                    onComplete(mode, string);
                    smoothScrollTo(0, allowCheckPullWhenRollBack(), new c(mode));
                }
            } else if (!checkIfFreeze(mode)) {
                onRefreshing(mode);
                callRefreshListener();
            }
        } else if (!checkIfFreeze(mode)) {
            onReset(mode);
            updateCurrentMode(PullBase.Mode.DISABLED);
        }
    }

    private void updateEndDirection(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5131b2f", new Object[]{this, new Integer(i)});
            return;
        }
        for (n2n n2nVar : this.endPtrProxies) {
            n2nVar.onUpdateDirection(i);
        }
    }

    private void updateStartDirection(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20f26cb6", new Object[]{this, new Integer(i)});
            return;
        }
        for (n2n n2nVar : this.startPtrProxies) {
            n2nVar.onUpdateDirection(i);
        }
    }

    public final void addEndPtrProxy(n2n n2nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9435c92c", new Object[]{this, n2nVar});
            return;
        }
        if (this.endPtrProxies == null) {
            this.endPtrProxies = new ArrayList();
        }
        if (n2nVar != null) {
            this.endPtrProxies.add(n2nVar);
        }
    }

    public final void addStartPtrProxy(n2n n2nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfb19c5", new Object[]{this, n2nVar});
            return;
        }
        if (this.startPtrProxies == null) {
            this.startPtrProxies = new ArrayList();
        }
        if (n2nVar != null) {
            this.startPtrProxies.add(n2nVar);
        }
    }

    @Override // com.taobao.ptr.PullBase
    public final boolean allowCatchPullEndTouch() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a1eda6", new Object[]{this})).booleanValue();
        }
        if (getState() == State.REFRESHING) {
            return false;
        }
        return super.allowCatchPullEndTouch();
    }

    @Override // com.taobao.ptr.PullBase
    public final boolean allowCatchPullStartTouch() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("69c983f", new Object[]{this})).booleanValue();
        }
        if (getState() == State.REFRESHING) {
            return false;
        }
        return super.allowCatchPullStartTouch();
    }

    @Override // com.taobao.ptr.PullBase
    public boolean allowCheckPullWhenRollBack() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c341ac2d", new Object[]{this})).booleanValue();
        }
        if (getState() == State.READY || getState() == State.COMPLETE) {
            return false;
        }
        return super.allowCheckPullWhenRollBack();
    }

    public final void freezeEnd(boolean z, CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("696a988d", new Object[]{this, new Boolean(z), charSequence});
            return;
        }
        if (getMode().permitsPullEnd()) {
            this.mFreezeEnd = z;
            for (n2n n2nVar : this.endPtrProxies) {
                n2nVar.onFreeze(z, charSequence);
            }
        }
        if (z && getCurrentMode() == PullBase.Mode.PULL_FROM_END) {
            smoothScrollTo(0, new a());
        }
    }

    public final void freezeStart(boolean z, CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d9feca6", new Object[]{this, new Boolean(z), charSequence});
            return;
        }
        if (getMode().permitsPullStart()) {
            this.mFreezeStart = z;
            for (n2n n2nVar : this.startPtrProxies) {
                n2nVar.onFreeze(z, charSequence);
            }
        }
        if (z && getCurrentMode() == PullBase.Mode.PULL_FROM_START) {
            smoothScrollTo(0, new b());
        }
    }

    public final State getState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (State) ipChange.ipc$dispatch("fc5e314b", new Object[]{this});
        }
        return this.mState;
    }

    @Override // com.taobao.ptr.PullBase
    public final void onDirectionUpdated(PullBase.Mode mode, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90f21a0f", new Object[]{this, mode, new Integer(i)});
            return;
        }
        super.onDirectionUpdated(mode, i);
        setState(State.RESET, mode, new CharSequence[0]);
        int i2 = d.$SwitchMap$com$taobao$ptr$PullBase$Mode[mode.ordinal()];
        if (i2 == 1) {
            return;
        }
        if (i2 == 2) {
            updateStartDirection(i);
        } else if (i2 != 3) {
            updateStartDirection(i);
            updateEndDirection(i);
        } else {
            updateEndDirection(i);
        }
    }

    @Override // com.taobao.ptr.PullBase
    public final void onModeUpdated(PullBase.Mode mode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ff9f2", new Object[]{this, mode});
            return;
        }
        super.onModeUpdated(mode);
        int i = d.$SwitchMap$com$taobao$ptr$PullBase$Mode[mode.ordinal()];
        if (i == 1) {
            for (n2n n2nVar : this.startPtrProxies) {
                n2nVar.onDisable();
            }
            for (n2n n2nVar2 : this.endPtrProxies) {
                n2nVar2.onDisable();
            }
        } else if (i == 2) {
            for (n2n n2nVar3 : this.startPtrProxies) {
                n2nVar3.onEnable();
            }
            for (n2n n2nVar4 : this.endPtrProxies) {
                n2nVar4.onDisable();
            }
        } else if (i != 3) {
            for (n2n n2nVar5 : this.startPtrProxies) {
                n2nVar5.onEnable();
            }
            for (n2n n2nVar6 : this.endPtrProxies) {
                n2nVar6.onEnable();
            }
        } else {
            for (n2n n2nVar7 : this.startPtrProxies) {
                n2nVar7.onDisable();
            }
            for (n2n n2nVar8 : this.endPtrProxies) {
                n2nVar8.onEnable();
            }
        }
    }

    @Override // com.taobao.ptr.PullBase
    public final void onPull(PullBase.Mode mode, float f, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("665d0dc0", new Object[]{this, mode, new Float(f), new Integer(i)});
            return;
        }
        super.onPull(mode, f, i);
        if (!checkIfFreeze(mode)) {
            pullEvent(mode, i);
        }
    }

    @Override // com.taobao.ptr.PullBase
    public final int onRelease(PullBase.Mode mode, float f, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d074ac17", new Object[]{this, mode, new Float(f), new Integer(i)})).intValue();
        }
        if (checkIfFreeze(mode)) {
            return super.onRelease(mode, f, i);
        }
        return releaseEvent(mode, i);
    }

    @Override // com.taobao.ptr.PullBase
    public final void onReset(PullBase.Mode mode, float f, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec4151ac", new Object[]{this, mode, new Float(f), new Integer(i)});
        } else if (!checkIfFreeze(mode)) {
            resetEvent(mode, i);
        }
    }

    public final void refreshComplete(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb920b5f", new Object[]{this, charSequence});
        } else if (!checkIfFreeze(getCurrentMode())) {
            setState(State.COMPLETE, getCurrentMode(), charSequence);
        }
    }

    public final void removeEndPtrProxy(n2n n2nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6da6a0f", new Object[]{this, n2nVar});
            return;
        }
        List<n2n> list = this.endPtrProxies;
        if (list != null) {
            list.remove(n2nVar);
        }
    }

    public final void removeStartPtrProxy(n2n n2nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27fb0de8", new Object[]{this, n2nVar});
            return;
        }
        List<n2n> list = this.endPtrProxies;
        if (list != null) {
            list.remove(n2nVar);
        }
    }

    public final void setEndLoadingDelegate(l2n l2nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ea2efcb", new Object[]{this, l2nVar});
        } else {
            this.mEndLayout.setLoadingDelegate(l2nVar);
        }
    }

    public final void setOnRefreshListener(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c02c98d", new Object[]{this, eVar});
        } else {
            this.mOnRefreshListener = eVar;
        }
    }

    public final void setRefreshing(PullBase.Mode mode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7361f232", new Object[]{this, mode, new Boolean(z)});
        } else if (getMode().isUnderPermit(mode) && !checkIfFreeze(mode) && isIdle()) {
            if (z) {
                int refreshingValue = getRefreshingValue(mode);
                if (refreshingValue != -1) {
                    simulateDrag((int) (refreshingValue * 1.2f));
                    return;
                }
                return;
            }
            updateCurrentMode(mode);
            setState(State.REFRESHING, mode, new CharSequence[0]);
        }
    }

    public final void setStartLoadingDelegate(l2n l2nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a26892", new Object[]{this, l2nVar});
        } else {
            this.mStartLayout.setLoadingDelegate(l2nVar);
        }
    }

    @Override // com.taobao.ptr.PullBase
    public PtrLayout createEndPullLayout(Context context, PullBase.Mode mode, AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PtrLayout) ipChange.ipc$dispatch("81b6bd38", new Object[]{this, context, mode, attributeSet});
        }
        PtrLayout ptrLayout = new PtrLayout(context, mode, getPullDirectionInternal(), attributeSet);
        this.mEndLayout = ptrLayout;
        addEndPtrProxy(ptrLayout);
        return this.mEndLayout;
    }

    @Override // com.taobao.ptr.PullBase
    public PtrLayout createStartPullLayout(Context context, PullBase.Mode mode, AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PtrLayout) ipChange.ipc$dispatch("17491", new Object[]{this, context, mode, attributeSet});
        }
        PtrLayout ptrLayout = new PtrLayout(context, mode, getPullDirectionInternal(), attributeSet);
        this.mStartLayout = ptrLayout;
        addStartPtrProxy(ptrLayout);
        return this.mStartLayout;
    }

    @Override // com.taobao.ptr.PullBase
    public PtrLayout getEndLayout() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PtrLayout) ipChange.ipc$dispatch("3cede1ab", new Object[]{this}) : this.mEndLayout;
    }

    @Override // com.taobao.ptr.PullBase
    public PtrLayout getStartLayout() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PtrLayout) ipChange.ipc$dispatch("a0d29b44", new Object[]{this}) : this.mStartLayout;
    }

    public PtrBase(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private void onReset(PullBase.Mode mode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3696d4a9", new Object[]{this, mode});
            return;
        }
        int i = d.$SwitchMap$com$taobao$ptr$PullBase$Mode[mode.ordinal()];
        if (i == 2) {
            for (n2n n2nVar : this.startPtrProxies) {
                n2nVar.onReset();
            }
        } else if (i == 3) {
            for (n2n n2nVar2 : this.endPtrProxies) {
                n2nVar2.onReset();
            }
        }
    }

    private void onPull(PullBase.Mode mode, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a87699a3", new Object[]{this, mode, new Float(f)});
            return;
        }
        int i = d.$SwitchMap$com$taobao$ptr$PullBase$Mode[mode.ordinal()];
        if (i == 2) {
            for (n2n n2nVar : this.startPtrProxies) {
                n2nVar.onPull(f);
            }
        } else if (i == 3) {
            for (n2n n2nVar2 : this.endPtrProxies) {
                n2nVar2.onPull(f);
            }
        }
    }

    private void onRelease(PullBase.Mode mode, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f7f9ebf", new Object[]{this, mode, new Float(f)});
            return;
        }
        int i = d.$SwitchMap$com$taobao$ptr$PullBase$Mode[mode.ordinal()];
        if (i == 2) {
            for (n2n n2nVar : this.startPtrProxies) {
                n2nVar.onRelease(f);
            }
        } else if (i == 3) {
            for (n2n n2nVar2 : this.endPtrProxies) {
                n2nVar2.onRelease(f);
            }
        }
    }

    public PtrBase(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
