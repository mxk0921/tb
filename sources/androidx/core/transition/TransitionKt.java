package androidx.core.transition;

import android.transition.Transition;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import tb.g1a;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u001a9\u0010\b\u001a\u00020\u0007*\u00020\u00002#\b\u0004\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0086\b¢\u0006\u0004\b\b\u0010\t\u001a9\u0010\n\u001a\u00020\u0007*\u00020\u00002#\b\u0004\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0086\b¢\u0006\u0004\b\n\u0010\t\u001a9\u0010\u000b\u001a\u00020\u0007*\u00020\u00002#\b\u0004\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0086\b¢\u0006\u0004\b\u000b\u0010\t\u001a9\u0010\f\u001a\u00020\u0007*\u00020\u00002#\b\u0004\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0086\b¢\u0006\u0004\b\f\u0010\t\u001a9\u0010\r\u001a\u00020\u0007*\u00020\u00002#\b\u0004\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0086\b¢\u0006\u0004\b\r\u0010\t\u001aÍ\u0001\u0010\u0013\u001a\u00020\u0007*\u00020\u00002#\b\u0006\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u00012#\b\u0006\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u00012#\b\u0006\u0010\u0010\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u00012#\b\u0006\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u00012#\b\u0006\u0010\u0012\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0086\b¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Landroid/transition/Transition;", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "transition", "Ltb/xhv;", "action", "Landroid/transition/Transition$TransitionListener;", "doOnEnd", "(Landroid/transition/Transition;Ltb/g1a;)Landroid/transition/Transition$TransitionListener;", "doOnStart", "doOnCancel", "doOnResume", "doOnPause", "onEnd", "onStart", "onCancel", "onResume", "onPause", "addListener", "(Landroid/transition/Transition;Ltb/g1a;Ltb/g1a;Ltb/g1a;Ltb/g1a;Ltb/g1a;)Landroid/transition/Transition$TransitionListener;", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class TransitionKt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static final Transition.TransitionListener addListener(Transition transition, g1a<? super Transition, xhv> g1aVar, g1a<? super Transition, xhv> g1aVar2, g1a<? super Transition, xhv> g1aVar3, g1a<? super Transition, xhv> g1aVar4, g1a<? super Transition, xhv> g1aVar5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Transition.TransitionListener) ipChange.ipc$dispatch("c75dc453", new Object[]{transition, g1aVar, g1aVar2, g1aVar3, g1aVar4, g1aVar5});
        }
        TransitionKt$addListener$listener$1 transitionKt$addListener$listener$1 = new TransitionKt$addListener$listener$1(g1aVar, g1aVar4, g1aVar5, g1aVar3, g1aVar2);
        transition.addListener(transitionKt$addListener$listener$1);
        return transitionKt$addListener$listener$1;
    }

    public static final Transition.TransitionListener doOnCancel(Transition transition, final g1a<? super Transition, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Transition.TransitionListener) ipChange.ipc$dispatch("d00b815a", new Object[]{transition, g1aVar});
        }
        Transition.TransitionListener transitionKt$doOnCancel$$inlined$addListener$default$1 = new Transition.TransitionListener() { // from class: androidx.core.transition.TransitionKt$doOnCancel$$inlined$addListener$default$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionCancel(Transition transition2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4f3bc7d", new Object[]{this, transition2});
                } else {
                    g1a.this.invoke(transition2);
                }
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionEnd(Transition transition2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5f39e64", new Object[]{this, transition2});
                }
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionPause(Transition transition2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3df73669", new Object[]{this, transition2});
                }
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionResume(Transition transition2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d325edea", new Object[]{this, transition2});
                }
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionStart(Transition transition2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4ffba07d", new Object[]{this, transition2});
                }
            }
        };
        transition.addListener(transitionKt$doOnCancel$$inlined$addListener$default$1);
        return transitionKt$doOnCancel$$inlined$addListener$default$1;
    }

    public static final Transition.TransitionListener doOnEnd(Transition transition, final g1a<? super Transition, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Transition.TransitionListener) ipChange.ipc$dispatch("dba7e6a7", new Object[]{transition, g1aVar});
        }
        Transition.TransitionListener transitionKt$doOnEnd$$inlined$addListener$default$1 = new Transition.TransitionListener() { // from class: androidx.core.transition.TransitionKt$doOnEnd$$inlined$addListener$default$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionCancel(Transition transition2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4f3bc7d", new Object[]{this, transition2});
                }
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionEnd(Transition transition2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5f39e64", new Object[]{this, transition2});
                } else {
                    g1a.this.invoke(transition2);
                }
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionPause(Transition transition2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3df73669", new Object[]{this, transition2});
                }
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionResume(Transition transition2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d325edea", new Object[]{this, transition2});
                }
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionStart(Transition transition2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4ffba07d", new Object[]{this, transition2});
                }
            }
        };
        transition.addListener(transitionKt$doOnEnd$$inlined$addListener$default$1);
        return transitionKt$doOnEnd$$inlined$addListener$default$1;
    }

    public static final Transition.TransitionListener doOnPause(Transition transition, final g1a<? super Transition, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Transition.TransitionListener) ipChange.ipc$dispatch("c64086c2", new Object[]{transition, g1aVar});
        }
        Transition.TransitionListener transitionKt$doOnPause$$inlined$addListener$default$1 = new Transition.TransitionListener() { // from class: androidx.core.transition.TransitionKt$doOnPause$$inlined$addListener$default$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionCancel(Transition transition2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4f3bc7d", new Object[]{this, transition2});
                }
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionEnd(Transition transition2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5f39e64", new Object[]{this, transition2});
                }
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionPause(Transition transition2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3df73669", new Object[]{this, transition2});
                } else {
                    g1a.this.invoke(transition2);
                }
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionResume(Transition transition2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d325edea", new Object[]{this, transition2});
                }
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionStart(Transition transition2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4ffba07d", new Object[]{this, transition2});
                }
            }
        };
        transition.addListener(transitionKt$doOnPause$$inlined$addListener$default$1);
        return transitionKt$doOnPause$$inlined$addListener$default$1;
    }

    public static final Transition.TransitionListener doOnResume(Transition transition, final g1a<? super Transition, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Transition.TransitionListener) ipChange.ipc$dispatch("52f39f8d", new Object[]{transition, g1aVar});
        }
        Transition.TransitionListener transitionKt$doOnResume$$inlined$addListener$default$1 = new Transition.TransitionListener() { // from class: androidx.core.transition.TransitionKt$doOnResume$$inlined$addListener$default$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionCancel(Transition transition2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4f3bc7d", new Object[]{this, transition2});
                }
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionEnd(Transition transition2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5f39e64", new Object[]{this, transition2});
                }
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionPause(Transition transition2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3df73669", new Object[]{this, transition2});
                }
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionResume(Transition transition2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d325edea", new Object[]{this, transition2});
                } else {
                    g1a.this.invoke(transition2);
                }
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionStart(Transition transition2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4ffba07d", new Object[]{this, transition2});
                }
            }
        };
        transition.addListener(transitionKt$doOnResume$$inlined$addListener$default$1);
        return transitionKt$doOnResume$$inlined$addListener$default$1;
    }

    public static final Transition.TransitionListener doOnStart(Transition transition, final g1a<? super Transition, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Transition.TransitionListener) ipChange.ipc$dispatch("b889a72e", new Object[]{transition, g1aVar});
        }
        Transition.TransitionListener transitionKt$doOnStart$$inlined$addListener$default$1 = new Transition.TransitionListener() { // from class: androidx.core.transition.TransitionKt$doOnStart$$inlined$addListener$default$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionCancel(Transition transition2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4f3bc7d", new Object[]{this, transition2});
                }
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionEnd(Transition transition2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5f39e64", new Object[]{this, transition2});
                }
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionPause(Transition transition2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3df73669", new Object[]{this, transition2});
                }
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionResume(Transition transition2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d325edea", new Object[]{this, transition2});
                }
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionStart(Transition transition2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4ffba07d", new Object[]{this, transition2});
                } else {
                    g1a.this.invoke(transition2);
                }
            }
        };
        transition.addListener(transitionKt$doOnStart$$inlined$addListener$default$1);
        return transitionKt$doOnStart$$inlined$addListener$default$1;
    }

    public static /* synthetic */ Transition.TransitionListener addListener$default(Transition transition, g1a g1aVar, g1a g1aVar2, g1a g1aVar3, g1a g1aVar4, g1a g1aVar5, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Transition.TransitionListener) ipChange.ipc$dispatch("eeb67dbf", new Object[]{transition, g1aVar, g1aVar2, g1aVar3, g1aVar4, g1aVar5, new Integer(i), obj});
        }
        if ((i & 1) != 0) {
            g1aVar = TransitionKt$addListener$1.INSTANCE;
        }
        if ((i & 2) != 0) {
            g1aVar2 = TransitionKt$addListener$2.INSTANCE;
        }
        if ((i & 4) != 0) {
            g1aVar3 = TransitionKt$addListener$3.INSTANCE;
        }
        if ((i & 8) != 0) {
            g1aVar4 = TransitionKt$addListener$4.INSTANCE;
        }
        if ((i & 16) != 0) {
            g1aVar5 = TransitionKt$addListener$5.INSTANCE;
        }
        TransitionKt$addListener$listener$1 transitionKt$addListener$listener$1 = new TransitionKt$addListener$listener$1(g1aVar, g1aVar4, g1aVar5, g1aVar3, g1aVar2);
        transition.addListener(transitionKt$addListener$listener$1);
        return transitionKt$addListener$listener$1;
    }
}
