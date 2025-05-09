package androidx.core.animation;

import android.animation.Animator;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import tb.g1a;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\u001a9\u0010\b\u001a\u00020\u0007*\u00020\u00002#\b\u0004\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0086\b¢\u0006\u0004\b\b\u0010\t\u001a9\u0010\n\u001a\u00020\u0007*\u00020\u00002#\b\u0004\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0086\b¢\u0006\u0004\b\n\u0010\t\u001a9\u0010\u000b\u001a\u00020\u0007*\u00020\u00002#\b\u0004\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0086\b¢\u0006\u0004\b\u000b\u0010\t\u001a9\u0010\f\u001a\u00020\u0007*\u00020\u00002#\b\u0004\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0086\b¢\u0006\u0004\b\f\u0010\t\u001a4\u0010\u000e\u001a\u00020\r*\u00020\u00002!\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a4\u0010\u0010\u001a\u00020\r*\u00020\u00002!\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0001¢\u0006\u0004\b\u0010\u0010\u000f\u001a¨\u0001\u0010\u0015\u001a\u00020\u0007*\u00020\u00002#\b\u0006\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u00012#\b\u0006\u0010\u0012\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u00012#\b\u0006\u0010\u0013\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u00012#\b\u0006\u0010\u0014\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0086\b¢\u0006\u0004\b\u0015\u0010\u0016\u001a[\u0010\u0019\u001a\u00020\r*\u00020\u00002#\b\u0002\u0010\u0017\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u00012#\b\u0002\u0010\u0018\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0001¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Landroid/animation/Animator;", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "animator", "Ltb/xhv;", "action", "Landroid/animation/Animator$AnimatorListener;", "doOnEnd", "(Landroid/animation/Animator;Ltb/g1a;)Landroid/animation/Animator$AnimatorListener;", "doOnStart", "doOnCancel", "doOnRepeat", "Landroid/animation/Animator$AnimatorPauseListener;", "doOnResume", "(Landroid/animation/Animator;Ltb/g1a;)Landroid/animation/Animator$AnimatorPauseListener;", "doOnPause", "onEnd", "onStart", "onCancel", "onRepeat", "addListener", "(Landroid/animation/Animator;Ltb/g1a;Ltb/g1a;Ltb/g1a;Ltb/g1a;)Landroid/animation/Animator$AnimatorListener;", "onResume", "onPause", "addPauseListener", "(Landroid/animation/Animator;Ltb/g1a;Ltb/g1a;)Landroid/animation/Animator$AnimatorPauseListener;", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class AnimatorKt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static final Animator.AnimatorListener addListener(Animator animator, g1a<? super Animator, xhv> g1aVar, g1a<? super Animator, xhv> g1aVar2, g1a<? super Animator, xhv> g1aVar3, g1a<? super Animator, xhv> g1aVar4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animator.AnimatorListener) ipChange.ipc$dispatch("c9403c95", new Object[]{animator, g1aVar, g1aVar2, g1aVar3, g1aVar4});
        }
        AnimatorKt$addListener$listener$1 animatorKt$addListener$listener$1 = new AnimatorKt$addListener$listener$1(g1aVar4, g1aVar, g1aVar3, g1aVar2);
        animator.addListener(animatorKt$addListener$listener$1);
        return animatorKt$addListener$listener$1;
    }

    public static /* synthetic */ Animator.AnimatorListener addListener$default(Animator animator, g1a g1aVar, g1a g1aVar2, g1a g1aVar3, g1a g1aVar4, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animator.AnimatorListener) ipChange.ipc$dispatch("ae7251f5", new Object[]{animator, g1aVar, g1aVar2, g1aVar3, g1aVar4, new Integer(i), obj});
        }
        if ((i & 1) != 0) {
            g1aVar = AnimatorKt$addListener$1.INSTANCE;
        }
        if ((i & 2) != 0) {
            g1aVar2 = AnimatorKt$addListener$2.INSTANCE;
        }
        if ((i & 4) != 0) {
            g1aVar3 = AnimatorKt$addListener$3.INSTANCE;
        }
        if ((i & 8) != 0) {
            g1aVar4 = AnimatorKt$addListener$4.INSTANCE;
        }
        AnimatorKt$addListener$listener$1 animatorKt$addListener$listener$1 = new AnimatorKt$addListener$listener$1(g1aVar4, g1aVar, g1aVar3, g1aVar2);
        animator.addListener(animatorKt$addListener$listener$1);
        return animatorKt$addListener$listener$1;
    }

    public static final Animator.AnimatorPauseListener addPauseListener(Animator animator, final g1a<? super Animator, xhv> g1aVar, final g1a<? super Animator, xhv> g1aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animator.AnimatorPauseListener) ipChange.ipc$dispatch("a939023b", new Object[]{animator, g1aVar, g1aVar2});
        }
        Animator.AnimatorPauseListener animatorKt$addPauseListener$listener$1 = new Animator.AnimatorPauseListener() { // from class: androidx.core.animation.AnimatorKt$addPauseListener$listener$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.Animator.AnimatorPauseListener
            public void onAnimationPause(Animator animator2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("450268b5", new Object[]{this, animator2});
                } else {
                    g1aVar2.invoke(animator2);
                }
            }

            @Override // android.animation.Animator.AnimatorPauseListener
            public void onAnimationResume(Animator animator2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8babbd16", new Object[]{this, animator2});
                } else {
                    g1aVar.invoke(animator2);
                }
            }
        };
        animator.addPauseListener(animatorKt$addPauseListener$listener$1);
        return animatorKt$addPauseListener$listener$1;
    }

    public static /* synthetic */ Animator.AnimatorPauseListener addPauseListener$default(Animator animator, g1a g1aVar, g1a g1aVar2, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animator.AnimatorPauseListener) ipChange.ipc$dispatch("6597472b", new Object[]{animator, g1aVar, g1aVar2, new Integer(i), obj});
        }
        if ((i & 1) != 0) {
            g1aVar = AnimatorKt$addPauseListener$1.INSTANCE;
        }
        if ((i & 2) != 0) {
            g1aVar2 = AnimatorKt$addPauseListener$2.INSTANCE;
        }
        return addPauseListener(animator, g1aVar, g1aVar2);
    }

    public static final Animator.AnimatorListener doOnCancel(Animator animator, final g1a<? super Animator, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animator.AnimatorListener) ipChange.ipc$dispatch("8a272a32", new Object[]{animator, g1aVar});
        }
        Animator.AnimatorListener animatorKt$doOnCancel$$inlined$addListener$default$1 = new Animator.AnimatorListener() { // from class: androidx.core.animation.AnimatorKt$doOnCancel$$inlined$addListener$default$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("90a3af63", new Object[]{this, animator2});
                } else {
                    g1a.this.invoke(animator2);
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator2});
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4388ea84", new Object[]{this, animator2});
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3a405721", new Object[]{this, animator2});
                }
            }
        };
        animator.addListener(animatorKt$doOnCancel$$inlined$addListener$default$1);
        return animatorKt$doOnCancel$$inlined$addListener$default$1;
    }

    public static final Animator.AnimatorListener doOnEnd(Animator animator, final g1a<? super Animator, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animator.AnimatorListener) ipChange.ipc$dispatch("ad502c7f", new Object[]{animator, g1aVar});
        }
        Animator.AnimatorListener animatorKt$doOnEnd$$inlined$addListener$default$1 = new Animator.AnimatorListener() { // from class: androidx.core.animation.AnimatorKt$doOnEnd$$inlined$addListener$default$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("90a3af63", new Object[]{this, animator2});
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator2});
                } else {
                    g1a.this.invoke(animator2);
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4388ea84", new Object[]{this, animator2});
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3a405721", new Object[]{this, animator2});
                }
            }
        };
        animator.addListener(animatorKt$doOnEnd$$inlined$addListener$default$1);
        return animatorKt$doOnEnd$$inlined$addListener$default$1;
    }

    public static final Animator.AnimatorPauseListener doOnPause(Animator animator, g1a<? super Animator, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animator.AnimatorPauseListener) ipChange.ipc$dispatch("502d5efe", new Object[]{animator, g1aVar});
        }
        return addPauseListener$default(animator, null, g1aVar, 1, null);
    }

    public static final Animator.AnimatorListener doOnRepeat(Animator animator, final g1a<? super Animator, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animator.AnimatorListener) ipChange.ipc$dispatch("175233d3", new Object[]{animator, g1aVar});
        }
        Animator.AnimatorListener animatorKt$doOnRepeat$$inlined$addListener$default$1 = new Animator.AnimatorListener() { // from class: androidx.core.animation.AnimatorKt$doOnRepeat$$inlined$addListener$default$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("90a3af63", new Object[]{this, animator2});
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator2});
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4388ea84", new Object[]{this, animator2});
                } else {
                    g1a.this.invoke(animator2);
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3a405721", new Object[]{this, animator2});
                }
            }
        };
        animator.addListener(animatorKt$doOnRepeat$$inlined$addListener$default$1);
        return animatorKt$doOnRepeat$$inlined$addListener$default$1;
    }

    public static final Animator.AnimatorPauseListener doOnResume(Animator animator, g1a<? super Animator, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animator.AnimatorPauseListener) ipChange.ipc$dispatch("2db6f213", new Object[]{animator, g1aVar});
        }
        return addPauseListener$default(animator, g1aVar, null, 2, null);
    }

    public static final Animator.AnimatorListener doOnStart(Animator animator, final g1a<? super Animator, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animator.AnimatorListener) ipChange.ipc$dispatch("b8426406", new Object[]{animator, g1aVar});
        }
        Animator.AnimatorListener animatorKt$doOnStart$$inlined$addListener$default$1 = new Animator.AnimatorListener() { // from class: androidx.core.animation.AnimatorKt$doOnStart$$inlined$addListener$default$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("90a3af63", new Object[]{this, animator2});
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator2});
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4388ea84", new Object[]{this, animator2});
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3a405721", new Object[]{this, animator2});
                } else {
                    g1a.this.invoke(animator2);
                }
            }
        };
        animator.addListener(animatorKt$doOnStart$$inlined$addListener$default$1);
        return animatorKt$doOnStart$$inlined$addListener$default$1;
    }
}
