package androidx.constraintlayout.motion.widget;

import android.graphics.Rect;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import androidx.constraintlayout.motion.widget.ViewTransition;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.constraintlayout.widget.SharedValues;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ViewTransitionController {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public ArrayList<ViewTransition.Animate> mAnimations;
    private final MotionLayout mMotionLayout;
    private HashSet<View> mRelatedViews;
    private ArrayList<ViewTransition> mViewTransitions = new ArrayList<>();
    private String mTAG = "ViewTransitionController";
    public ArrayList<ViewTransition.Animate> mRemoveList = new ArrayList<>();

    public ViewTransitionController(MotionLayout motionLayout) {
        this.mMotionLayout = motionLayout;
    }

    public static /* synthetic */ MotionLayout access$000(ViewTransitionController viewTransitionController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MotionLayout) ipChange.ipc$dispatch("8c223c35", new Object[]{viewTransitionController});
        }
        return viewTransitionController.mMotionLayout;
    }

    private void listenForSharedVariable(final ViewTransition viewTransition, final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a139f1c9", new Object[]{this, viewTransition, new Boolean(z)});
            return;
        }
        final int sharedValueID = viewTransition.getSharedValueID();
        final int sharedValue = viewTransition.getSharedValue();
        ConstraintLayout.getSharedValues().addListener(viewTransition.getSharedValueID(), new SharedValues.SharedValuesListener() { // from class: androidx.constraintlayout.motion.widget.ViewTransitionController.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // androidx.constraintlayout.widget.SharedValues.SharedValuesListener
            public void onNewValue(int i, int i2, int i3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("dacd740c", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
                    return;
                }
                int sharedValueCurrent = viewTransition.getSharedValueCurrent();
                viewTransition.setSharedValueCurrent(i2);
                if (sharedValueID == i && sharedValueCurrent != i2) {
                    if (z) {
                        if (sharedValue == i2) {
                            int childCount = ViewTransitionController.access$000(ViewTransitionController.this).getChildCount();
                            for (int i4 = 0; i4 < childCount; i4++) {
                                View childAt = ViewTransitionController.access$000(ViewTransitionController.this).getChildAt(i4);
                                if (viewTransition.matchesView(childAt)) {
                                    int currentState = ViewTransitionController.access$000(ViewTransitionController.this).getCurrentState();
                                    ConstraintSet constraintSet = ViewTransitionController.access$000(ViewTransitionController.this).getConstraintSet(currentState);
                                    ViewTransition viewTransition2 = viewTransition;
                                    ViewTransitionController viewTransitionController = ViewTransitionController.this;
                                    viewTransition2.applyTransition(viewTransitionController, ViewTransitionController.access$000(viewTransitionController), currentState, constraintSet, childAt);
                                }
                            }
                        }
                    } else if (sharedValue != i2) {
                        int childCount2 = ViewTransitionController.access$000(ViewTransitionController.this).getChildCount();
                        for (int i5 = 0; i5 < childCount2; i5++) {
                            View childAt2 = ViewTransitionController.access$000(ViewTransitionController.this).getChildAt(i5);
                            if (viewTransition.matchesView(childAt2)) {
                                int currentState2 = ViewTransitionController.access$000(ViewTransitionController.this).getCurrentState();
                                ConstraintSet constraintSet2 = ViewTransitionController.access$000(ViewTransitionController.this).getConstraintSet(currentState2);
                                ViewTransition viewTransition3 = viewTransition;
                                ViewTransitionController viewTransitionController2 = ViewTransitionController.this;
                                viewTransition3.applyTransition(viewTransitionController2, ViewTransitionController.access$000(viewTransitionController2), currentState2, constraintSet2, childAt2);
                            }
                        }
                    }
                }
            }
        });
    }

    private void viewTransition(ViewTransition viewTransition, View... viewArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8512dabf", new Object[]{this, viewTransition, viewArr});
            return;
        }
        int currentState = this.mMotionLayout.getCurrentState();
        if (viewTransition.mViewTransitionMode == 2) {
            viewTransition.applyTransition(this, this.mMotionLayout, currentState, null, viewArr);
        } else if (currentState == -1) {
            new StringBuilder("No support for ViewTransition within transition yet. Currently: ").append(this.mMotionLayout.toString());
        } else {
            ConstraintSet constraintSet = this.mMotionLayout.getConstraintSet(currentState);
            if (constraintSet != null) {
                viewTransition.applyTransition(this, this.mMotionLayout, currentState, constraintSet, viewArr);
            }
        }
    }

    public void addAnimation(ViewTransition.Animate animate) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2da20bee", new Object[]{this, animate});
            return;
        }
        if (this.mAnimations == null) {
            this.mAnimations = new ArrayList<>();
        }
        this.mAnimations.add(animate);
    }

    public void animate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43fb5ee8", new Object[]{this});
            return;
        }
        ArrayList<ViewTransition.Animate> arrayList = this.mAnimations;
        if (arrayList != null) {
            Iterator<ViewTransition.Animate> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mutate();
            }
            this.mAnimations.removeAll(this.mRemoveList);
            this.mRemoveList.clear();
            if (this.mAnimations.isEmpty()) {
                this.mAnimations = null;
            }
        }
    }

    public boolean applyViewTransition(int i, MotionController motionController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c51269e1", new Object[]{this, new Integer(i), motionController})).booleanValue();
        }
        Iterator<ViewTransition> it = this.mViewTransitions.iterator();
        while (it.hasNext()) {
            ViewTransition next = it.next();
            if (next.getId() == i) {
                next.mKeyFrames.addAllFrames(motionController);
                return true;
            }
        }
        return false;
    }

    public void enableViewTransition(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92db8775", new Object[]{this, new Integer(i), new Boolean(z)});
            return;
        }
        Iterator<ViewTransition> it = this.mViewTransitions.iterator();
        while (it.hasNext()) {
            ViewTransition next = it.next();
            if (next.getId() == i) {
                next.setEnabled(z);
                return;
            }
        }
    }

    public void invalidate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60a4a042", new Object[]{this});
        } else {
            this.mMotionLayout.invalidate();
        }
    }

    public boolean isViewTransitionEnabled(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c72e9483", new Object[]{this, new Integer(i)})).booleanValue();
        }
        Iterator<ViewTransition> it = this.mViewTransitions.iterator();
        while (it.hasNext()) {
            ViewTransition next = it.next();
            if (next.getId() == i) {
                return next.isEnabled();
            }
        }
        return false;
    }

    public void remove(int i) {
        ViewTransition viewTransition;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebab3958", new Object[]{this, new Integer(i)});
            return;
        }
        Iterator<ViewTransition> it = this.mViewTransitions.iterator();
        while (true) {
            if (!it.hasNext()) {
                viewTransition = null;
                break;
            }
            viewTransition = it.next();
            if (viewTransition.getId() == i) {
                break;
            }
        }
        if (viewTransition != null) {
            this.mRelatedViews = null;
            this.mViewTransitions.remove(viewTransition);
        }
    }

    public void removeAnimation(ViewTransition.Animate animate) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fa24ceb", new Object[]{this, animate});
        } else {
            this.mRemoveList.add(animate);
        }
    }

    public void add(ViewTransition viewTransition) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff5f9e9", new Object[]{this, viewTransition});
            return;
        }
        this.mViewTransitions.add(viewTransition);
        this.mRelatedViews = null;
        if (viewTransition.getStateTransition() == 4) {
            listenForSharedVariable(viewTransition, true);
        } else if (viewTransition.getStateTransition() == 5) {
            listenForSharedVariable(viewTransition, false);
        }
    }

    public void touchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbae537", new Object[]{this, motionEvent});
            return;
        }
        int currentState = this.mMotionLayout.getCurrentState();
        if (currentState != -1) {
            if (this.mRelatedViews == null) {
                this.mRelatedViews = new HashSet<>();
                Iterator<ViewTransition> it = this.mViewTransitions.iterator();
                while (it.hasNext()) {
                    ViewTransition next = it.next();
                    int childCount = this.mMotionLayout.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        View childAt = this.mMotionLayout.getChildAt(i);
                        if (next.matchesView(childAt)) {
                            childAt.getId();
                            this.mRelatedViews.add(childAt);
                        }
                    }
                }
            }
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            Rect rect = new Rect();
            int action = motionEvent.getAction();
            ArrayList<ViewTransition.Animate> arrayList = this.mAnimations;
            if (arrayList != null && !arrayList.isEmpty()) {
                Iterator<ViewTransition.Animate> it2 = this.mAnimations.iterator();
                while (it2.hasNext()) {
                    it2.next().reactTo(action, x, y);
                }
            }
            if (action == 0 || action == 1) {
                ConstraintSet constraintSet = this.mMotionLayout.getConstraintSet(currentState);
                Iterator<ViewTransition> it3 = this.mViewTransitions.iterator();
                while (it3.hasNext()) {
                    ViewTransition next2 = it3.next();
                    if (next2.supports(action)) {
                        Iterator<View> it4 = this.mRelatedViews.iterator();
                        while (it4.hasNext()) {
                            View next3 = it4.next();
                            if (next2.matchesView(next3)) {
                                next3.getHitRect(rect);
                                if (rect.contains((int) x, (int) y)) {
                                    next2 = next2;
                                    next2.applyTransition(this, this.mMotionLayout, currentState, constraintSet, next3);
                                } else {
                                    next2 = next2;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public void viewTransition(int i, View... viewArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ebdf0df", new Object[]{this, new Integer(i), viewArr});
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<ViewTransition> it = this.mViewTransitions.iterator();
        ViewTransition viewTransition = null;
        while (it.hasNext()) {
            ViewTransition next = it.next();
            if (next.getId() == i) {
                for (View view : viewArr) {
                    if (next.checkTags(view)) {
                        arrayList.add(view);
                    }
                }
                if (!arrayList.isEmpty()) {
                    viewTransition(next, (View[]) arrayList.toArray(new View[0]));
                    arrayList.clear();
                }
                viewTransition = next;
            }
        }
        if (viewTransition == null) {
            Log.e(this.mTAG, " Could not find ViewTransition");
        }
    }
}
