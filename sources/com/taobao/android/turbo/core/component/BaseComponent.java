package com.taobao.android.turbo.core.component;

import android.content.Context;
import android.view.View;
import com.ali.user.mobile.rpc.filter.FilterManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.turbo.monitor.Monitor;
import com.taobao.search.sf.util.tlog.TLogTracker;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import tb.a07;
import tb.ckf;
import tb.gi8;
import tb.jfp;
import tb.jpu;
import tb.kfp;
import tb.ns1;
import tb.pg1;
import tb.q8u;
import tb.t2o;
import tb.tpu;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u0000 :*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0004:\u0002;<B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u000f\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00028\u0001H$¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0016\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0017\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0018\u0010\u0015J\u0015\u0010\u0019\u001a\u00020\t2\u0006\u0010\f\u001a\u00028\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\t2\u0006\u0010\f\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u001b\u0010\u001aJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001f\u0010\u001eJ\u0017\u0010 \u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b \u0010\u0015R(\u0010\"\u001a\u0004\u0018\u00018\u00012\b\u0010!\u001a\u0004\u0018\u00018\u00018\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u0012R(\u0010\f\u001a\u0004\u0018\u00018\u00002\b\u0010!\u001a\u0004\u0018\u00018\u00008\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\f\u0010%\u001a\u0004\b&\u0010'R*\u0010(\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u00078\u0006@DX\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010\u000bR$\u0010.\u001a\u00020-2\u0006\u0010!\u001a\u00020-8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R*\u00102\u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\u001c8\u0006@DX\u0086\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b2\u0010\u001e\"\u0004\b4\u00105R\u0014\u00109\u001a\u0002068$X¤\u0004¢\u0006\u0006\u001a\u0004\b7\u00108¨\u0006="}, d2 = {"Lcom/taobao/android/turbo/core/component/BaseComponent;", "MODEL", "Landroid/view/View;", "VIEW", "", "<init>", "()V", "Lcom/taobao/android/turbo/core/component/BaseComponent$State;", "targetState", "Ltb/xhv;", "checkAndHandleStateError", "(Lcom/taobao/android/turbo/core/component/BaseComponent$State;)V", "data", "Lcom/taobao/android/turbo/core/component/IComponentLifecycle$TriggerType;", "triggerType", "onCreate", "(Ljava/lang/Object;Lcom/taobao/android/turbo/core/component/IComponentLifecycle$TriggerType;)V", "createView", "()Landroid/view/View;", "createViewImpl", "onStart", "(Lcom/taobao/android/turbo/core/component/IComponentLifecycle$TriggerType;)V", "onResume", "onPause", "onStop", "updateData", "(Ljava/lang/Object;)V", "updateDataImpl", "", "show", "()Z", "hide", "onDestroy", "<set-?>", "view", "Landroid/view/View;", "getView", "Ljava/lang/Object;", "getData", "()Ljava/lang/Object;", "state", "Lcom/taobao/android/turbo/core/component/BaseComponent$State;", "getState", "()Lcom/taobao/android/turbo/core/component/BaseComponent$State;", pg1.ATOM_EXT_setState, "", "resumeCount", TLogTracker.LEVEL_INFO, "getResumeCount", "()I", "isShowing", "Z", "setShowing", "(Z)V", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "context", "Companion", "a", "State", "turboflow_framework_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public abstract class BaseComponent<MODEL, VIEW extends View> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    private static final String TAG = "BaseComponent";
    private MODEL data;
    private int resumeCount;
    private VIEW view;
    private State state = State.NOT_CREATE;
    private boolean isShowing = true;

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0086\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/taobao/android/turbo/core/component/BaseComponent$State;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "a", "NOT_CREATE", "CREATE", "START", "RESUME", "PAUSE", FilterManager.STOP, "DESTROY", "turboflow_framework_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public enum State {
        NOT_CREATE,
        CREATE,
        START,
        RESUME,
        PAUSE,
        STOP,
        DESTROY;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final a Companion = new a(null);

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public static final class a {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            static {
                t2o.a(919601234);
            }

            public a() {
            }

            public /* synthetic */ a(a07 a07Var) {
                this();
            }

            public final boolean a(State state) {
                boolean z = true;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("58ba9608", new Object[]{this, state})).booleanValue();
                }
                ckf.g(state, "parentState");
                if (state != State.RESUME) {
                    z = false;
                }
                tpu.a aVar = tpu.Companion;
                tpu.a.b(aVar, BaseComponent.TAG, "判断是否可以转移到暂停状态，parentState=" + state + "，canTransfer=" + z, null, 4, null);
                return z;
            }

            public final boolean b(State state) {
                boolean z = true;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("4c5ca9b", new Object[]{this, state})).booleanValue();
                }
                ckf.g(state, "parentState");
                if (state != State.RESUME) {
                    z = false;
                }
                tpu.a aVar = tpu.Companion;
                tpu.a.b(aVar, BaseComponent.TAG, "判断是否可以转移到恢复状态，parentState=" + state + "，canTransfer=" + z, null, 4, null);
                return z;
            }

            public final boolean c(State state) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("10d9251c", new Object[]{this, state})).booleanValue();
                }
                ckf.g(state, "parentState");
                boolean contains = kfp.h(State.START, State.RESUME, State.PAUSE).contains(state);
                tpu.a aVar = tpu.Companion;
                tpu.a.b(aVar, BaseComponent.TAG, "判断是否可以转移到启动状态，parentState=" + state + "，canTransfer=" + contains, null, 4, null);
                return contains;
            }

            public final boolean d(State state) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("8ea952a6", new Object[]{this, state})).booleanValue();
                }
                ckf.g(state, "parentState");
                boolean contains = kfp.h(State.START, State.RESUME, State.PAUSE).contains(state);
                tpu.a aVar = tpu.Companion;
                tpu.a.b(aVar, BaseComponent.TAG, "判断是否可以转移到停止状态，parentState=" + state + "，canTransfer=" + contains, null, 4, null);
                return contains;
            }
        }

        public static /* synthetic */ Object ipc$super(State state, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/turbo/core/component/BaseComponent$State");
        }

        public static State valueOf(String str) {
            Object valueOf;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                valueOf = ipChange.ipc$dispatch("b0a2290f", new Object[]{str});
            } else {
                valueOf = Enum.valueOf(State.class, str);
            }
            return (State) valueOf;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        static {
            t2o.a(919601232);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(919601231);
        t2o.a(919601245);
    }

    public VIEW createView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VIEW) ((View) ipChange.ipc$dispatch("5e7be40a", new Object[]{this}));
        }
        tpu.a aVar = tpu.Companion;
        aVar.c(TAG, "创建组件视图，this=" + this);
        q8u.a aVar2 = q8u.Companion;
        aVar2.a("createView");
        VIEW createViewImpl = createViewImpl();
        this.view = createViewImpl;
        aVar2.c();
        return createViewImpl;
    }

    public abstract VIEW createViewImpl();

    public abstract Context getContext();

    public final MODEL getData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MODEL) ipChange.ipc$dispatch("4ca84d6b", new Object[]{this});
        }
        return this.data;
    }

    public final int getResumeCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3befc226", new Object[]{this})).intValue();
        }
        return this.resumeCount;
    }

    public final State getState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (State) ipChange.ipc$dispatch("c917f7b8", new Object[]{this});
        }
        return this.state;
    }

    public final VIEW getView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VIEW) ((View) ipChange.ipc$dispatch("576a35e4", new Object[]{this}));
        }
        return this.view;
    }

    public final boolean isShowing() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d3c33646", new Object[]{this})).booleanValue();
        }
        return this.isShowing;
    }

    public void onCreate(MODEL model, IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f85bfc5d", new Object[]{this, model, iComponentLifecycle$TriggerType});
            return;
        }
        ckf.g(iComponentLifecycle$TriggerType, "triggerType");
        tpu.a aVar = tpu.Companion;
        aVar.c(TAG, "组件创建的时机，data=" + model + "，triggerType=" + iComponentLifecycle$TriggerType + "，this=" + this);
        State state = State.CREATE;
        checkAndHandleStateError(state);
        this.data = model;
        this.state = state;
    }

    public void onDestroy(IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de9daad9", new Object[]{this, iComponentLifecycle$TriggerType});
            return;
        }
        ckf.g(iComponentLifecycle$TriggerType, "triggerType");
        tpu.a aVar = tpu.Companion;
        aVar.c(TAG, "组件销毁的时机，triggerType=" + iComponentLifecycle$TriggerType + "，this=" + this);
        State state = State.DESTROY;
        checkAndHandleStateError(state);
        this.state = state;
    }

    public void onPause(IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("587ab21d", new Object[]{this, iComponentLifecycle$TriggerType});
            return;
        }
        ckf.g(iComponentLifecycle$TriggerType, "triggerType");
        tpu.a aVar = tpu.Companion;
        aVar.c(TAG, "组件暂停的时机，triggerType=" + iComponentLifecycle$TriggerType + "，this=" + this);
        State state = State.PAUSE;
        checkAndHandleStateError(state);
        this.state = state;
    }

    public void onStart(IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6774331", new Object[]{this, iComponentLifecycle$TriggerType});
            return;
        }
        ckf.g(iComponentLifecycle$TriggerType, "triggerType");
        tpu.a aVar = tpu.Companion;
        aVar.c(TAG, "组件启动的时机，triggerType=" + iComponentLifecycle$TriggerType + "，this=" + this);
        State state = State.START;
        checkAndHandleStateError(state);
        this.state = state;
    }

    public void onStop(IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12dbef33", new Object[]{this, iComponentLifecycle$TriggerType});
            return;
        }
        ckf.g(iComponentLifecycle$TriggerType, "triggerType");
        tpu.a aVar = tpu.Companion;
        aVar.c(TAG, "组件停止的时机，triggerType=" + iComponentLifecycle$TriggerType + "，this=" + this);
        State state = State.STOP;
        checkAndHandleStateError(state);
        this.state = state;
    }

    public final void setShowing(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6940e00a", new Object[]{this, new Boolean(z)});
        } else {
            this.isShowing = z;
        }
    }

    public final void setState(State state) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c50c9a10", new Object[]{this, state});
            return;
        }
        ckf.g(state, "<set-?>");
        this.state = state;
    }

    public final void updateData(MODEL model) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75317076", new Object[]{this, model});
            return;
        }
        tpu.a aVar = tpu.Companion;
        aVar.c(TAG, "更新组件数据，data=" + model + "，this=" + this);
        this.data = model;
        updateDataImpl(model);
    }

    public void updateDataImpl(MODEL model) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36a3f536", new Object[]{this, model});
        }
    }

    public void onResume(IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f09370a8", new Object[]{this, iComponentLifecycle$TriggerType});
            return;
        }
        ckf.g(iComponentLifecycle$TriggerType, "triggerType");
        tpu.a aVar = tpu.Companion;
        aVar.c(TAG, "组件恢复的时机，triggerType=" + iComponentLifecycle$TriggerType + "，this=" + this);
        State state = State.RESUME;
        checkAndHandleStateError(state);
        this.state = state;
        this.resumeCount = this.resumeCount + 1;
    }

    public boolean hide() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9631f0cd", new Object[]{this})).booleanValue();
        }
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, TAG, "隐藏组件视图，this=" + this, null, 4, null);
        VIEW view = this.view;
        if (view == null) {
            tpu.a.b(aVar, TAG, "隐藏组件视图，view为空，this=" + this, null, 4, null);
            return false;
        } else if (!this.isShowing) {
            tpu.a.b(aVar, TAG, "隐藏组件视图，当前视图已隐藏，this=" + this, null, 4, null);
            return false;
        } else {
            view.setVisibility(8);
            this.isShowing = false;
            return true;
        }
    }

    public boolean show() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ebbb9908", new Object[]{this})).booleanValue();
        }
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, TAG, "显示组件视图，this=" + this, null, 4, null);
        VIEW view = this.view;
        if (view == null) {
            tpu.a.b(aVar, TAG, "显示组件视图，view为空，this=" + this, null, 4, null);
            return false;
        } else if (this.isShowing) {
            tpu.a.b(aVar, TAG, "显示组件视图，当前视图已显示，this=" + this, null, 4, null);
            return false;
        } else {
            view.setVisibility(0);
            this.isShowing = true;
            return true;
        }
    }

    private final void checkAndHandleStateError(State state) {
        Set set;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9400131", new Object[]{this, state});
            return;
        }
        switch (ns1.$EnumSwitchMapping$0[state.ordinal()]) {
            case 1:
                set = kfp.d();
                break;
            case 2:
                set = jfp.c(State.NOT_CREATE);
                break;
            case 3:
                set = kfp.h(State.CREATE, State.STOP);
                break;
            case 4:
                set = kfp.h(State.START, State.PAUSE);
                break;
            case 5:
                set = jfp.c(State.RESUME);
                break;
            case 6:
                set = kfp.h(State.START, State.PAUSE);
                break;
            case 7:
                set = kfp.h(State.CREATE, State.STOP);
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        if (!set.contains(this.state)) {
            gi8.b(gi8.INSTANCE, "组件生命周期状态错误", kotlin.collections.a.j(jpu.a("state", this.state), jpu.a("expectedStates", set), jpu.a("targetState", state), jpu.a("componentClass", getClass().getSimpleName()), jpu.a("component", toString())), Monitor.Type.FRAMEWORK, Monitor.Code.STATE_ERROR, this.state != state, null, 32, null);
        }
    }
}
