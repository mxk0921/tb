package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import tb.ar4;
import tb.d1a;
import tb.fzh;
import tb.pg1;
import tb.zq7;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a2\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u000e\b\u0004\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0086H¢\u0006\u0004\b\u0006\u0010\u0007\u001a*\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u000e\b\u0004\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0086H¢\u0006\u0004\b\b\u0010\t\u001a*\u0010\n\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u000e\b\u0004\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0086H¢\u0006\u0004\b\n\u0010\t\u001a*\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u000e\b\u0004\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0086H¢\u0006\u0004\b\u000b\u0010\t\u001a2\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u000e\b\u0004\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0086H¢\u0006\u0004\b\u0006\u0010\r\u001a*\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\f2\u000e\b\u0004\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0086H¢\u0006\u0004\b\b\u0010\u000e\u001a*\u0010\n\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\f2\u000e\b\u0004\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0086H¢\u0006\u0004\b\n\u0010\u000e\u001a*\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\f2\u000e\b\u0004\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0086H¢\u0006\u0004\b\u000b\u0010\u000e\u001a2\u0010\u000f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u000e\b\u0004\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0081H¢\u0006\u0004\b\u000f\u0010\u0007\u001a@\u0010\u0014\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0081@¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"R", "Landroidx/lifecycle/Lifecycle;", "Landroidx/lifecycle/Lifecycle$State;", "state", "Lkotlin/Function0;", pg1.ATOM_EXT_block, "withStateAtLeast", "(Landroidx/lifecycle/Lifecycle;Landroidx/lifecycle/Lifecycle$State;Ltb/d1a;Ltb/ar4;)Ljava/lang/Object;", "withCreated", "(Landroidx/lifecycle/Lifecycle;Ltb/d1a;Ltb/ar4;)Ljava/lang/Object;", "withStarted", "withResumed", "Landroidx/lifecycle/LifecycleOwner;", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$State;Ltb/d1a;Ltb/ar4;)Ljava/lang/Object;", "(Landroidx/lifecycle/LifecycleOwner;Ltb/d1a;Ltb/ar4;)Ljava/lang/Object;", "withStateAtLeastUnchecked", "", "dispatchNeeded", "Lkotlinx/coroutines/CoroutineDispatcher;", "lifecycleDispatcher", "suspendWithStateAtLeastUnchecked", "(Landroidx/lifecycle/Lifecycle;Landroidx/lifecycle/Lifecycle$State;ZLkotlinx/coroutines/CoroutineDispatcher;Ltb/d1a;Ltb/ar4;)Ljava/lang/Object;", "lifecycle-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class WithLifecycleStateKt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1, androidx.lifecycle.LifecycleObserver] */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <R> java.lang.Object suspendWithStateAtLeastUnchecked(final androidx.lifecycle.Lifecycle r4, final androidx.lifecycle.Lifecycle.State r5, boolean r6, kotlinx.coroutines.CoroutineDispatcher r7, final tb.d1a<? extends R> r8, tb.ar4<? super R> r9) {
        /*
            r0 = 1
            com.android.alibaba.ip.runtime.IpChange r1 = androidx.lifecycle.WithLifecycleStateKt.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L_0x0027
            java.lang.Boolean r2 = new java.lang.Boolean
            r2.<init>(r6)
            r6 = 6
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r3 = 0
            r6[r3] = r4
            r6[r0] = r5
            r4 = 2
            r6[r4] = r2
            r4 = 3
            r6[r4] = r7
            r4 = 4
            r6[r4] = r8
            r4 = 5
            r6[r4] = r9
            java.lang.String r4 = "8b7660ba"
            java.lang.Object r4 = r1.ipc$dispatch(r4, r6)
            return r4
        L_0x0027:
            kotlinx.coroutines.c r1 = new kotlinx.coroutines.c
            tb.ar4 r2 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.c(r9)
            r1.<init>(r2, r0)
            r1.E()
            androidx.lifecycle.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 r0 = new androidx.lifecycle.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1
            r0.<init>()
            if (r6 == 0) goto L_0x0045
            kotlin.coroutines.EmptyCoroutineContext r5 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            androidx.lifecycle.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$lambda$2$$inlined$Runnable$1 r6 = new androidx.lifecycle.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$lambda$2$$inlined$Runnable$1
            r6.<init>()
            r7.dispatch(r5, r6)
            goto L_0x0048
        L_0x0045:
            r4.addObserver(r0)
        L_0x0048:
            androidx.lifecycle.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$2 r5 = new androidx.lifecycle.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$2
            r5.<init>(r7, r4, r0)
            r1.h(r5)
            java.lang.Object r4 = r1.A()
            java.lang.Object r5 = tb.dkf.d()
            if (r4 != r5) goto L_0x005d
            tb.jv6.c(r9)
        L_0x005d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.WithLifecycleStateKt.suspendWithStateAtLeastUnchecked(androidx.lifecycle.Lifecycle, androidx.lifecycle.Lifecycle$State, boolean, kotlinx.coroutines.CoroutineDispatcher, tb.d1a, tb.ar4):java.lang.Object");
    }

    public static final <R> Object withCreated(Lifecycle lifecycle, d1a<? extends R> d1aVar, ar4<? super R> ar4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("2f0d4160", new Object[]{lifecycle, d1aVar, ar4Var});
        }
        Lifecycle.State state = Lifecycle.State.CREATED;
        fzh N0 = zq7.c().N0();
        boolean isDispatchNeeded = N0.isDispatchNeeded(ar4Var.getContext());
        if (!isDispatchNeeded) {
            if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
                throw new LifecycleDestroyedException();
            } else if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                return d1aVar.invoke();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, isDispatchNeeded, N0, new WithLifecycleStateKt$withStateAtLeastUnchecked$2(d1aVar), ar4Var);
    }

    private static final <R> Object withCreated$$forInline(Lifecycle lifecycle, d1a<? extends R> d1aVar, ar4<? super R> ar4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("61e0f422", new Object[]{lifecycle, d1aVar, ar4Var});
        }
        IpChange ipChange2 = Lifecycle.State.$ipChange;
        zq7.c().N0();
        throw null;
    }

    public static final <R> Object withResumed(Lifecycle lifecycle, d1a<? extends R> d1aVar, ar4<? super R> ar4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("199dda11", new Object[]{lifecycle, d1aVar, ar4Var});
        }
        Lifecycle.State state = Lifecycle.State.RESUMED;
        fzh N0 = zq7.c().N0();
        boolean isDispatchNeeded = N0.isDispatchNeeded(ar4Var.getContext());
        if (!isDispatchNeeded) {
            if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
                throw new LifecycleDestroyedException();
            } else if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                return d1aVar.invoke();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, isDispatchNeeded, N0, new WithLifecycleStateKt$withStateAtLeastUnchecked$2(d1aVar), ar4Var);
    }

    private static final <R> Object withResumed$$forInline(Lifecycle lifecycle, d1a<? extends R> d1aVar, ar4<? super R> ar4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("954b2d1", new Object[]{lifecycle, d1aVar, ar4Var});
        }
        IpChange ipChange2 = Lifecycle.State.$ipChange;
        zq7.c().N0();
        throw null;
    }

    public static final <R> Object withStarted(Lifecycle lifecycle, d1a<? extends R> d1aVar, ar4<? super R> ar4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("73156b27", new Object[]{lifecycle, d1aVar, ar4Var});
        }
        Lifecycle.State state = Lifecycle.State.STARTED;
        fzh N0 = zq7.c().N0();
        boolean isDispatchNeeded = N0.isDispatchNeeded(ar4Var.getContext());
        if (!isDispatchNeeded) {
            if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
                throw new LifecycleDestroyedException();
            } else if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                return d1aVar.invoke();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, isDispatchNeeded, N0, new WithLifecycleStateKt$withStateAtLeastUnchecked$2(d1aVar), ar4Var);
    }

    private static final <R> Object withStarted$$forInline(Lifecycle lifecycle, d1a<? extends R> d1aVar, ar4<? super R> ar4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("376cb7fb", new Object[]{lifecycle, d1aVar, ar4Var});
        }
        IpChange ipChange2 = Lifecycle.State.$ipChange;
        zq7.c().N0();
        throw null;
    }

    public static final <R> Object withStateAtLeast(Lifecycle lifecycle, Lifecycle.State state, d1a<? extends R> d1aVar, ar4<? super R> ar4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("5fa678f4", new Object[]{lifecycle, state, d1aVar, ar4Var});
        }
        if (state.compareTo(Lifecycle.State.CREATED) >= 0) {
            fzh N0 = zq7.c().N0();
            boolean isDispatchNeeded = N0.isDispatchNeeded(ar4Var.getContext());
            if (!isDispatchNeeded) {
                if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
                    throw new LifecycleDestroyedException();
                } else if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                    return d1aVar.invoke();
                }
            }
            return suspendWithStateAtLeastUnchecked(lifecycle, state, isDispatchNeeded, N0, new WithLifecycleStateKt$withStateAtLeastUnchecked$2(d1aVar), ar4Var);
        }
        throw new IllegalArgumentException(("target state must be CREATED or greater, found " + state).toString());
    }

    private static final <R> Object withStateAtLeast$$forInline(Lifecycle lifecycle, Lifecycle.State state, d1a<? extends R> d1aVar, ar4<? super R> ar4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("e0b80428", new Object[]{lifecycle, state, d1aVar, ar4Var});
        }
        if (state.compareTo(Lifecycle.State.CREATED) >= 0) {
            zq7.c().N0();
            throw null;
        }
        throw new IllegalArgumentException(("target state must be CREATED or greater, found " + state).toString());
    }

    public static final <R> Object withStateAtLeastUnchecked(Lifecycle lifecycle, Lifecycle.State state, d1a<? extends R> d1aVar, ar4<? super R> ar4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("6eddb6dc", new Object[]{lifecycle, state, d1aVar, ar4Var});
        }
        fzh N0 = zq7.c().N0();
        boolean isDispatchNeeded = N0.isDispatchNeeded(ar4Var.getContext());
        if (!isDispatchNeeded) {
            if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
                throw new LifecycleDestroyedException();
            } else if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                return d1aVar.invoke();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, isDispatchNeeded, N0, new WithLifecycleStateKt$withStateAtLeastUnchecked$2(d1aVar), ar4Var);
    }

    private static final <R> Object withStateAtLeastUnchecked$$forInline(Lifecycle lifecycle, Lifecycle.State state, d1a<? extends R> d1aVar, ar4<? super R> ar4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("46868540", new Object[]{lifecycle, state, d1aVar, ar4Var});
        }
        zq7.c().N0();
        throw null;
    }

    private static final <R> Object withCreated$$forInline(LifecycleOwner lifecycleOwner, d1a<? extends R> d1aVar, ar4<? super R> ar4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("fc873133", new Object[]{lifecycleOwner, d1aVar, ar4Var});
        }
        lifecycleOwner.getLifecycle();
        IpChange ipChange2 = Lifecycle.State.$ipChange;
        zq7.c().N0();
        throw null;
    }

    private static final <R> Object withResumed$$forInline(LifecycleOwner lifecycleOwner, d1a<? extends R> d1aVar, ar4<? super R> ar4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("685a47e4", new Object[]{lifecycleOwner, d1aVar, ar4Var});
        }
        lifecycleOwner.getLifecycle();
        IpChange ipChange2 = Lifecycle.State.$ipChange;
        zq7.c().N0();
        throw null;
    }

    private static final <R> Object withStarted$$forInline(LifecycleOwner lifecycleOwner, d1a<? extends R> d1aVar, ar4<? super R> ar4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("1928ecfa", new Object[]{lifecycleOwner, d1aVar, ar4Var});
        }
        lifecycleOwner.getLifecycle();
        IpChange ipChange2 = Lifecycle.State.$ipChange;
        zq7.c().N0();
        throw null;
    }

    private static final <R> Object withStateAtLeast$$forInline(LifecycleOwner lifecycleOwner, Lifecycle.State state, d1a<? extends R> d1aVar, ar4<? super R> ar4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("2ee12d47", new Object[]{lifecycleOwner, state, d1aVar, ar4Var});
        }
        lifecycleOwner.getLifecycle();
        if (state.compareTo(Lifecycle.State.CREATED) >= 0) {
            zq7.c().N0();
            throw null;
        }
        throw new IllegalArgumentException(("target state must be CREATED or greater, found " + state).toString());
    }

    public static final <R> Object withCreated(LifecycleOwner lifecycleOwner, d1a<? extends R> d1aVar, ar4<? super R> ar4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("59cf7ab5", new Object[]{lifecycleOwner, d1aVar, ar4Var});
        }
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        Lifecycle.State state = Lifecycle.State.CREATED;
        fzh N0 = zq7.c().N0();
        boolean isDispatchNeeded = N0.isDispatchNeeded(ar4Var.getContext());
        if (!isDispatchNeeded) {
            if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
                throw new LifecycleDestroyedException();
            } else if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                return d1aVar.invoke();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, isDispatchNeeded, N0, new WithLifecycleStateKt$withStateAtLeastUnchecked$2(d1aVar), ar4Var);
    }

    public static final <R> Object withResumed(LifecycleOwner lifecycleOwner, d1a<? extends R> d1aVar, ar4<? super R> ar4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("17e7a8a4", new Object[]{lifecycleOwner, d1aVar, ar4Var});
        }
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        Lifecycle.State state = Lifecycle.State.RESUMED;
        fzh N0 = zq7.c().N0();
        boolean isDispatchNeeded = N0.isDispatchNeeded(ar4Var.getContext());
        if (!isDispatchNeeded) {
            if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
                throw new LifecycleDestroyedException();
            } else if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                return d1aVar.invoke();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, isDispatchNeeded, N0, new WithLifecycleStateKt$withStateAtLeastUnchecked$2(d1aVar), ar4Var);
    }

    public static final <R> Object withStarted(LifecycleOwner lifecycleOwner, d1a<? extends R> d1aVar, ar4<? super R> ar4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("a50d554e", new Object[]{lifecycleOwner, d1aVar, ar4Var});
        }
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        Lifecycle.State state = Lifecycle.State.STARTED;
        fzh N0 = zq7.c().N0();
        boolean isDispatchNeeded = N0.isDispatchNeeded(ar4Var.getContext());
        if (!isDispatchNeeded) {
            if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
                throw new LifecycleDestroyedException();
            } else if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                return d1aVar.invoke();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, isDispatchNeeded, N0, new WithLifecycleStateKt$withStateAtLeastUnchecked$2(d1aVar), ar4Var);
    }

    public static final <R> Object withStateAtLeast(LifecycleOwner lifecycleOwner, Lifecycle.State state, d1a<? extends R> d1aVar, ar4<? super R> ar4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("22f7d7fb", new Object[]{lifecycleOwner, state, d1aVar, ar4Var});
        }
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        if (state.compareTo(Lifecycle.State.CREATED) >= 0) {
            fzh N0 = zq7.c().N0();
            boolean isDispatchNeeded = N0.isDispatchNeeded(ar4Var.getContext());
            if (!isDispatchNeeded) {
                if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
                    throw new LifecycleDestroyedException();
                } else if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                    return d1aVar.invoke();
                }
            }
            return suspendWithStateAtLeastUnchecked(lifecycle, state, isDispatchNeeded, N0, new WithLifecycleStateKt$withStateAtLeastUnchecked$2(d1aVar), ar4Var);
        }
        throw new IllegalArgumentException(("target state must be CREATED or greater, found " + state).toString());
    }
}
