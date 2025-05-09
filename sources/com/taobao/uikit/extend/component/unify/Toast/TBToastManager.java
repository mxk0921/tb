package com.taobao.uikit.extend.component.unify.Toast;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.os.Handler;
import android.os.Message;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.schedule.ViewProxy;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TBToastManager extends Handler {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "ManagerTBToast";
    private static TBToastManager mTBToastManager;
    private float mCurrentScale = 1.0f;
    private float mSmallerScale = 0.8f;
    private final Queue<TBToast> mQueue = new LinkedBlockingQueue();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class Messages {
        private static final int ADD_TBToast = 4281172;
        private static final int DISPLAY_TBToast = 4477780;
        private static final int REMOVE_TBToast = 5395284;
        private static final int SMALLER_SCALE = 0;

        static {
            t2o.a(932184182);
        }

        private Messages() {
        }
    }

    static {
        t2o.a(932184175);
    }

    private TBToastManager() {
    }

    public static /* synthetic */ float access$000(TBToastManager tBToastManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8ad9b6c7", new Object[]{tBToastManager})).floatValue();
        }
        return tBToastManager.mCurrentScale;
    }

    public static /* synthetic */ float access$002(TBToastManager tBToastManager, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9398477", new Object[]{tBToastManager, new Float(f)})).floatValue();
        }
        tBToastManager.mCurrentScale = f;
        return f;
    }

    public static /* synthetic */ void access$100(TBToastManager tBToastManager, TBToast tBToast, int i, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("808000ec", new Object[]{tBToastManager, tBToast, new Integer(i), new Long(j)});
        } else {
            tBToastManager.sendMessageDelayed(tBToast, i, j);
        }
    }

    private void displayTBToast(TBToast tBToast) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbf530c5", new Object[]{this, tBToast});
        } else if (!tBToast.isShowing()) {
            WindowManager windowManager = tBToast.getWindowManager();
            View view = tBToast.getView();
            WindowManager.LayoutParams windowManagerParams = tBToast.getWindowManagerParams();
            if (windowManager != null) {
                if (tBToast instanceof TBActivityToast) {
                    try {
                        Activity activity = ((TBActivityToast) tBToast).getActivity();
                        if (activity == null || activity.isFinishing()) {
                            sendMessageDelayed(tBToast, 5395284, 0L);
                        } else if (!activity.isDestroyed()) {
                            windowManager.addView(view, windowManagerParams);
                            sendMessageDelayed(tBToast, 5395284, tBToast.getDuration());
                        } else {
                            sendMessageDelayed(tBToast, 5395284, 0L);
                        }
                        return;
                    } catch (Throwable unused) {
                        return;
                    }
                } else {
                    windowManager.addView(view, windowManagerParams);
                }
            }
            sendMessageDelayed(tBToast, 0, 1600L);
        }
    }

    private long getDuration(TBToast tBToast) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("26ce1326", new Object[]{this, tBToast})).longValue();
        }
        return tBToast.getDuration() + 1000;
    }

    public static synchronized TBToastManager getInstance() {
        synchronized (TBToastManager.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TBToastManager) ipChange.ipc$dispatch("a9b9d5a4", new Object[0]);
            }
            TBToastManager tBToastManager = mTBToastManager;
            if (tBToastManager != null) {
                return tBToastManager;
            }
            TBToastManager tBToastManager2 = new TBToastManager();
            mTBToastManager = tBToastManager2;
            return tBToastManager2;
        }
    }

    public static /* synthetic */ Object ipc$super(TBToastManager tBToastManager, String str, Object... objArr) {
        if (str.hashCode() == 673877017) {
            super.handleMessage((Message) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/uikit/extend/component/unify/Toast/TBToastManager");
    }

    private void sendMessageDelayed(TBToast tBToast, int i, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e869f7a", new Object[]{this, tBToast, new Integer(i), new Long(j)});
            return;
        }
        Message obtainMessage = obtainMessage(i);
        obtainMessage.obj = tBToast;
        sendMessageDelayed(obtainMessage, j);
    }

    private void showNextTBToast() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("378ab2d0", new Object[]{this});
        } else if (!this.mQueue.isEmpty()) {
            TBToast peek = this.mQueue.peek();
            if (!peek.isShowing()) {
                Message obtainMessage = obtainMessage(4281172);
                obtainMessage.obj = peek;
                sendMessage(obtainMessage);
                return;
            }
            sendMessageDelayed(peek, 4477780, getDuration(peek));
        }
    }

    public void add(TBToast tBToast) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("862ffb3b", new Object[]{this, tBToast});
            return;
        }
        this.mQueue.add(tBToast);
        showNextTBToast();
    }

    public void cancelAllTBToasts() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4560908", new Object[]{this});
            return;
        }
        removeMessages(4281172);
        removeMessages(4477780);
        removeMessages(5395284);
        for (TBToast tBToast : this.mQueue) {
            if (tBToast.isShowing()) {
                tBToast.getWindowManager().removeView(tBToast.getView());
            }
        }
        this.mQueue.clear();
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
            return;
        }
        TBToast tBToast = (TBToast) message.obj;
        int i = message.what;
        if (i == 0) {
            startSmallerAnim(tBToast);
        } else if (i == 4281172) {
            displayTBToast(tBToast);
        } else if (i == 4477780) {
            showNextTBToast();
        } else if (i != 5395284) {
            super.handleMessage(message);
        } else {
            removeTBToast(tBToast);
        }
    }

    public void removeTBToast(TBToast tBToast) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16c71807", new Object[]{this, tBToast});
        } else if (this.mQueue.contains(tBToast)) {
            WindowManager windowManager = tBToast.getWindowManager();
            if (windowManager == null || !(tBToast instanceof TBActivityToast)) {
                View view = tBToast.getView();
                view.setClickable(false);
                view.setLongClickable(false);
                if (windowManager != null) {
                    this.mQueue.poll();
                    windowManager.removeView(view);
                    sendMessageDelayed(tBToast, 4477780, 500L);
                    return;
                }
                return;
            }
            try {
                Activity activity = ((TBActivityToast) tBToast).getActivity();
                if (activity != null && !activity.isFinishing() && !activity.isDestroyed()) {
                    windowManager.removeView(tBToast.getView());
                }
                this.mQueue.poll();
                sendMessageDelayed(tBToast, 4477780, 500L);
            } catch (Throwable unused) {
            }
        }
    }

    public void startSmallerAnim(final TBToast tBToast) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dcea839", new Object[]{this, tBToast});
            return;
        }
        final View view = tBToast.getView();
        view.setClickable(true);
        view.setLongClickable(true);
        final WindowManager windowManager = tBToast.getWindowManager();
        final WindowManager.LayoutParams windowManagerParams = tBToast.getWindowManagerParams();
        final ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, this.mSmallerScale);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.taobao.uikit.extend.component.unify.Toast.TBToastManager.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                } else if (view.getWindowToken() == null) {
                    valueAnimator.cancel();
                } else {
                    float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    tBToast.mAnimView.setScaleX(floatValue);
                    tBToast.mAnimView.setScaleY(floatValue);
                    TBToastManager.access$002(TBToastManager.this, floatValue);
                }
            }
        });
        ofFloat.addListener(new Animator.AnimatorListener() { // from class: com.taobao.uikit.extend.component.unify.Toast.TBToastManager.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("90a3af63", new Object[]{this, animator});
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                } else {
                    TBToastManager.access$100(TBToastManager.this, tBToast, 5395284, 800L);
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4388ea84", new Object[]{this, animator});
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3a405721", new Object[]{this, animator});
                }
            }
        });
        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        ofFloat.setDuration(300L);
        ofFloat.start();
        ViewProxy.setOnLongClickListener(view, new View.OnLongClickListener() { // from class: com.taobao.uikit.extend.component.unify.Toast.TBToastManager.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnLongClickListener
            public boolean onLongClick(View view2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("7edba102", new Object[]{this, view2})).booleanValue();
                }
                if (!tBToast.mLongClicked) {
                    if (ofFloat.isRunning()) {
                        ofFloat.cancel();
                    } else {
                        TBToastManager.this.removeMessages(5395284, tBToast);
                    }
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(TBToastManager.access$000(TBToastManager.this), 1.0f);
                    ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.taobao.uikit.extend.component.unify.Toast.TBToastManager.3.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public void onAnimationUpdate(ValueAnimator valueAnimator) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                            } else if (view.getWindowToken() == null) {
                                valueAnimator.cancel();
                            } else {
                                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                tBToast.mAnimView.setScaleX(floatValue);
                                tBToast.mAnimView.setScaleY(floatValue);
                                TBToastManager.access$002(TBToastManager.this, floatValue);
                                AnonymousClass3 r5 = AnonymousClass3.this;
                                windowManagerParams.height = view.getHeight();
                                AnonymousClass3 r52 = AnonymousClass3.this;
                                windowManagerParams.width = view.getWidth();
                                AnonymousClass3 r53 = AnonymousClass3.this;
                                windowManager.updateViewLayout(view, windowManagerParams);
                            }
                        }
                    });
                    ofFloat2.addListener(new Animator.AnimatorListener() { // from class: com.taobao.uikit.extend.component.unify.Toast.TBToastManager.3.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.animation.Animator.AnimatorListener
                        public void onAnimationCancel(Animator animator) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("90a3af63", new Object[]{this, animator});
                            }
                        }

                        @Override // android.animation.Animator.AnimatorListener
                        public void onAnimationEnd(Animator animator) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("8024e25a", new Object[]{this, animator});
                            }
                        }

                        @Override // android.animation.Animator.AnimatorListener
                        public void onAnimationRepeat(Animator animator) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("4388ea84", new Object[]{this, animator});
                            }
                        }

                        @Override // android.animation.Animator.AnimatorListener
                        public void onAnimationStart(Animator animator) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("3a405721", new Object[]{this, animator});
                            }
                        }
                    });
                    ofFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
                    ofFloat2.setDuration(300L);
                    ofFloat2.start();
                    tBToast.mLongClicked = true;
                }
                return true;
            }
        });
        ViewProxy.setOnTouchListener(view, new View.OnTouchListener() { // from class: com.taobao.uikit.extend.component.unify.Toast.TBToastManager.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view2, MotionEvent motionEvent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("d4aa3aa4", new Object[]{this, view2, motionEvent})).booleanValue();
                }
                if (motionEvent.getAction() == 1 && tBToast.mLongClicked) {
                    view.setClickable(false);
                    view.setLongClickable(false);
                    TBToastManager.access$100(TBToastManager.this, tBToast, 5395284, 800L);
                }
                return false;
            }
        });
    }
}
