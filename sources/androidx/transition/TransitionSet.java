package androidx.transition;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.res.TypedArrayUtils;
import androidx.transition.Transition;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class TransitionSet extends Transition {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int FLAG_CHANGE_EPICENTER = 8;
    private static final int FLAG_CHANGE_INTERPOLATOR = 1;
    private static final int FLAG_CHANGE_PATH_MOTION = 4;
    private static final int FLAG_CHANGE_PROPAGATION = 2;
    public static final int ORDERING_SEQUENTIAL = 1;
    public static final int ORDERING_TOGETHER = 0;
    public int mCurrentListeners;
    private ArrayList<Transition> mTransitions = new ArrayList<>();
    private boolean mPlayTogether = true;
    public boolean mStarted = false;
    private int mChangeFlags = 0;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class TransitionSetListener extends TransitionListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public TransitionSet mTransitionSet;

        public TransitionSetListener(TransitionSet transitionSet) {
            this.mTransitionSet = transitionSet;
        }

        public static /* synthetic */ Object ipc$super(TransitionSetListener transitionSetListener, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/transition/TransitionSet$TransitionSetListener");
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57f909f4", new Object[]{this, transition});
                return;
            }
            TransitionSet transitionSet = this.mTransitionSet;
            int i = transitionSet.mCurrentListeners - 1;
            transitionSet.mCurrentListeners = i;
            if (i == 0) {
                transitionSet.mStarted = false;
                transitionSet.end();
            }
            transition.removeListener(this);
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4ef14afb", new Object[]{this, transition});
                return;
            }
            TransitionSet transitionSet = this.mTransitionSet;
            if (!transitionSet.mStarted) {
                transitionSet.start();
                this.mTransitionSet.mStarted = true;
            }
        }
    }

    public TransitionSet() {
    }

    private void addTransitionInternal(Transition transition) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95ec0a00", new Object[]{this, transition});
            return;
        }
        this.mTransitions.add(transition);
        transition.mParent = this;
    }

    public static /* synthetic */ Object ipc$super(TransitionSet transitionSet, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1974882885:
                return super.addListener((Transition.TransitionListener) objArr[0]);
            case -1902940022:
                return super.setSceneRoot((ViewGroup) objArr[0]);
            case -1859825739:
                return super.removeTarget(((Number) objArr[0]).intValue());
            case -1131537853:
                return super.toString((String) objArr[0]);
            case -1109476894:
                return super.setStartDelay(((Number) objArr[0]).longValue());
            case -1098484472:
                return super.excludeTarget((View) objArr[0], ((Boolean) objArr[1]).booleanValue());
            case -997138701:
                super.capturePropagationValues((TransitionValues) objArr[0]);
                return null;
            case -849209826:
                super.resume((View) objArr[0]);
                return null;
            case -768063947:
                super.pause((View) objArr[0]);
                return null;
            case -757835079:
                return super.excludeTarget(((Number) objArr[0]).intValue(), ((Boolean) objArr[1]).booleanValue());
            case -357761319:
                return super.addTarget((String) objArr[0]);
            case -316522451:
                super.setPropagation((TransitionPropagation) objArr[0]);
                return null;
            case 3952911:
                super.setEpicenterCallback((Transition.EpicenterCallback) objArr[0]);
                return null;
            case 99682268:
                return super.setInterpolator((TimeInterpolator) objArr[0]);
            case 253868787:
                return super.excludeTarget((Class) objArr[0], ((Boolean) objArr[1]).booleanValue());
            case 435101208:
                return super.addTarget((Class) objArr[0]);
            case 556117220:
                super.setPathMotion((PathMotion) objArr[0]);
                return null;
            case 562935288:
                return super.clone();
            case 582269265:
                super.setCanRemoveViews(((Boolean) objArr[0]).booleanValue());
                return null;
            case 741304227:
                return super.addTarget((View) objArr[0]);
            case 889054814:
                return super.removeListener((Transition.TransitionListener) objArr[0]);
            case 1187015739:
                return super.removeTarget((Class) objArr[0]);
            case 1323165307:
                super.forceToEnd((ViewGroup) objArr[0]);
                return null;
            case 1476752662:
                return super.removeTarget((String) objArr[0]);
            case 1642909924:
                return super.excludeTarget((String) objArr[0], ((Boolean) objArr[1]).booleanValue());
            case 1776662790:
                return super.removeTarget((View) objArr[0]);
            case 1869479989:
                return super.setDuration(((Number) objArr[0]).longValue());
            case 1887430145:
                super.cancel();
                return null;
            case 1965382546:
                return super.addTarget(((Number) objArr[0]).intValue());
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/transition/TransitionSet");
        }
    }

    private void setupStartEndListeners() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f585bc30", new Object[]{this});
            return;
        }
        TransitionSetListener transitionSetListener = new TransitionSetListener(this);
        Iterator<Transition> it = this.mTransitions.iterator();
        while (it.hasNext()) {
            it.next().addListener(transitionSetListener);
        }
        this.mCurrentListeners = this.mTransitions.size();
    }

    public TransitionSet addTransition(Transition transition) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TransitionSet) ipChange.ipc$dispatch("16979ddb", new Object[]{this, transition});
        }
        addTransitionInternal(transition);
        long j = this.mDuration;
        if (j >= 0) {
            transition.setDuration(j);
        }
        if ((1 & this.mChangeFlags) != 0) {
            transition.setInterpolator(getInterpolator());
        }
        if ((this.mChangeFlags & 2) != 0) {
            transition.setPropagation(getPropagation());
        }
        if ((this.mChangeFlags & 4) != 0) {
            transition.setPathMotion(getPathMotion());
        }
        if ((this.mChangeFlags & 8) != 0) {
            transition.setEpicenterCallback(getEpicenterCallback());
        }
        return this;
    }

    @Override // androidx.transition.Transition
    public void cancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
            return;
        }
        super.cancel();
        int size = this.mTransitions.size();
        for (int i = 0; i < size; i++) {
            this.mTransitions.get(i).cancel();
        }
    }

    @Override // androidx.transition.Transition
    public void captureEndValues(TransitionValues transitionValues) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a950ba02", new Object[]{this, transitionValues});
        } else if (isValidTarget(transitionValues.view)) {
            Iterator<Transition> it = this.mTransitions.iterator();
            while (it.hasNext()) {
                Transition next = it.next();
                if (next.isValidTarget(transitionValues.view)) {
                    next.captureEndValues(transitionValues);
                    transitionValues.mTargetedTransitions.add(next);
                }
            }
        }
    }

    @Override // androidx.transition.Transition
    public void capturePropagationValues(TransitionValues transitionValues) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c490def3", new Object[]{this, transitionValues});
            return;
        }
        super.capturePropagationValues(transitionValues);
        int size = this.mTransitions.size();
        for (int i = 0; i < size; i++) {
            this.mTransitions.get(i).capturePropagationValues(transitionValues);
        }
    }

    @Override // androidx.transition.Transition
    public void captureStartValues(TransitionValues transitionValues) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6ddd09", new Object[]{this, transitionValues});
        } else if (isValidTarget(transitionValues.view)) {
            Iterator<Transition> it = this.mTransitions.iterator();
            while (it.hasNext()) {
                Transition next = it.next();
                if (next.isValidTarget(transitionValues.view)) {
                    next.captureStartValues(transitionValues);
                    transitionValues.mTargetedTransitions.add(next);
                }
            }
        }
    }

    @Override // androidx.transition.Transition
    public void createAnimators(ViewGroup viewGroup, TransitionValuesMaps transitionValuesMaps, TransitionValuesMaps transitionValuesMaps2, ArrayList<TransitionValues> arrayList, ArrayList<TransitionValues> arrayList2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21437ff0", new Object[]{this, viewGroup, transitionValuesMaps, transitionValuesMaps2, arrayList, arrayList2});
            return;
        }
        long startDelay = getStartDelay();
        int size = this.mTransitions.size();
        for (int i = 0; i < size; i++) {
            Transition transition = this.mTransitions.get(i);
            if (startDelay > 0 && (this.mPlayTogether || i == 0)) {
                long startDelay2 = transition.getStartDelay();
                if (startDelay2 > 0) {
                    transition.setStartDelay(startDelay2 + startDelay);
                } else {
                    transition.setStartDelay(startDelay);
                }
            }
            transition.createAnimators(viewGroup, transitionValuesMaps, transitionValuesMaps2, arrayList, arrayList2);
        }
    }

    @Override // androidx.transition.Transition
    public Transition excludeTarget(View view, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Transition) ipChange.ipc$dispatch("be867508", new Object[]{this, view, new Boolean(z)});
        }
        for (int i = 0; i < this.mTransitions.size(); i++) {
            this.mTransitions.get(i).excludeTarget(view, z);
        }
        return super.excludeTarget(view, z);
    }

    @Override // androidx.transition.Transition
    public void forceToEnd(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4edde67b", new Object[]{this, viewGroup});
            return;
        }
        super.forceToEnd(viewGroup);
        int size = this.mTransitions.size();
        for (int i = 0; i < size; i++) {
            this.mTransitions.get(i).forceToEnd(viewGroup);
        }
    }

    public int getOrdering() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a6ab32c4", new Object[]{this})).intValue();
        }
        return 1 ^ (this.mPlayTogether ? 1 : 0);
    }

    public Transition getTransitionAt(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Transition) ipChange.ipc$dispatch("2d9792de", new Object[]{this, new Integer(i)});
        }
        if (i < 0 || i >= this.mTransitions.size()) {
            return null;
        }
        return this.mTransitions.get(i);
    }

    public int getTransitionCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1ad374fe", new Object[]{this})).intValue();
        }
        return this.mTransitions.size();
    }

    @Override // androidx.transition.Transition
    public void pause(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2384635", new Object[]{this, view});
            return;
        }
        super.pause(view);
        int size = this.mTransitions.size();
        for (int i = 0; i < size; i++) {
            this.mTransitions.get(i).pause(view);
        }
    }

    public TransitionSet removeTransition(Transition transition) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TransitionSet) ipChange.ipc$dispatch("a2225fbe", new Object[]{this, transition});
        }
        this.mTransitions.remove(transition);
        transition.mParent = null;
        return this;
    }

    @Override // androidx.transition.Transition
    public void resume(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd62161e", new Object[]{this, view});
            return;
        }
        super.resume(view);
        int size = this.mTransitions.size();
        for (int i = 0; i < size; i++) {
            this.mTransitions.get(i).resume(view);
        }
    }

    @Override // androidx.transition.Transition
    public void runAnimators() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cf1d028", new Object[]{this});
        } else if (this.mTransitions.isEmpty()) {
            start();
            end();
        } else {
            setupStartEndListeners();
            if (!this.mPlayTogether) {
                for (int i = 1; i < this.mTransitions.size(); i++) {
                    final Transition transition = this.mTransitions.get(i);
                    this.mTransitions.get(i - 1).addListener(new TransitionListenerAdapter() { // from class: androidx.transition.TransitionSet.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                            str.hashCode();
                            int hashCode = str.hashCode();
                            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/transition/TransitionSet$1");
                        }

                        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
                        public void onTransitionEnd(Transition transition2) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("57f909f4", new Object[]{this, transition2});
                                return;
                            }
                            transition.runAnimators();
                            transition2.removeListener(this);
                        }
                    });
                }
                Transition transition2 = this.mTransitions.get(0);
                if (transition2 != null) {
                    transition2.runAnimators();
                    return;
                }
                return;
            }
            Iterator<Transition> it = this.mTransitions.iterator();
            while (it.hasNext()) {
                it.next().runAnimators();
            }
        }
    }

    @Override // androidx.transition.Transition
    public void setCanRemoveViews(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22b4b951", new Object[]{this, new Boolean(z)});
            return;
        }
        super.setCanRemoveViews(z);
        int size = this.mTransitions.size();
        for (int i = 0; i < size; i++) {
            this.mTransitions.get(i).setCanRemoveViews(z);
        }
    }

    @Override // androidx.transition.Transition
    public void setEpicenterCallback(Transition.EpicenterCallback epicenterCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c510f", new Object[]{this, epicenterCallback});
            return;
        }
        super.setEpicenterCallback(epicenterCallback);
        this.mChangeFlags |= 8;
        int size = this.mTransitions.size();
        for (int i = 0; i < size; i++) {
            this.mTransitions.get(i).setEpicenterCallback(epicenterCallback);
        }
    }

    public TransitionSet setOrdering(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TransitionSet) ipChange.ipc$dispatch("dc1a163e", new Object[]{this, new Integer(i)});
        }
        if (i == 0) {
            this.mPlayTogether = true;
        } else if (i == 1) {
            this.mPlayTogether = false;
        } else {
            throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + i);
        }
        return this;
    }

    @Override // androidx.transition.Transition
    public void setPathMotion(PathMotion pathMotion) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2125ace4", new Object[]{this, pathMotion});
            return;
        }
        super.setPathMotion(pathMotion);
        this.mChangeFlags |= 4;
        if (this.mTransitions != null) {
            for (int i = 0; i < this.mTransitions.size(); i++) {
                this.mTransitions.get(i).setPathMotion(pathMotion);
            }
        }
    }

    @Override // androidx.transition.Transition
    public void setPropagation(TransitionPropagation transitionPropagation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed22402d", new Object[]{this, transitionPropagation});
            return;
        }
        super.setPropagation(transitionPropagation);
        this.mChangeFlags = 2 | this.mChangeFlags;
        int size = this.mTransitions.size();
        for (int i = 0; i < size; i++) {
            this.mTransitions.get(i).setPropagation(transitionPropagation);
        }
    }

    @Override // androidx.transition.Transition
    public String toString(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bc8e1a43", new Object[]{this, str});
        }
        String transition = super.toString(str);
        for (int i = 0; i < this.mTransitions.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(transition);
            sb.append("\n");
            sb.append(this.mTransitions.get(i).toString(str + "  "));
            transition = sb.toString();
        }
        return transition;
    }

    @Override // androidx.transition.Transition
    public TransitionSet addListener(Transition.TransitionListener transitionListener) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TransitionSet) ipChange.ipc$dispatch("b41ca6b9", new Object[]{this, transitionListener}) : (TransitionSet) super.addListener(transitionListener);
    }

    @Override // androidx.transition.Transition
    public Transition clone() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Transition) ipChange.ipc$dispatch("218db5f8", new Object[]{this});
        }
        TransitionSet transitionSet = (TransitionSet) super.clone();
        transitionSet.mTransitions = new ArrayList<>();
        int size = this.mTransitions.size();
        for (int i = 0; i < size; i++) {
            transitionSet.addTransitionInternal(this.mTransitions.get(i).clone());
        }
        return transitionSet;
    }

    @Override // androidx.transition.Transition
    public TransitionSet removeListener(Transition.TransitionListener transitionListener) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TransitionSet) ipChange.ipc$dispatch("b6a78736", new Object[]{this, transitionListener}) : (TransitionSet) super.removeListener(transitionListener);
    }

    @Override // androidx.transition.Transition
    public TransitionSet setDuration(long j) {
        ArrayList<Transition> arrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TransitionSet) ipChange.ipc$dispatch("31f689ff", new Object[]{this, new Long(j)});
        }
        super.setDuration(j);
        if (this.mDuration >= 0 && (arrayList = this.mTransitions) != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.mTransitions.get(i).setDuration(j);
            }
        }
        return this;
    }

    @Override // androidx.transition.Transition
    public TransitionSet setInterpolator(TimeInterpolator timeInterpolator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TransitionSet) ipChange.ipc$dispatch("6c0e0cf8", new Object[]{this, timeInterpolator});
        }
        this.mChangeFlags |= 1;
        ArrayList<Transition> arrayList = this.mTransitions;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.mTransitions.get(i).setInterpolator(timeInterpolator);
            }
        }
        return (TransitionSet) super.setInterpolator(timeInterpolator);
    }

    @Override // androidx.transition.Transition
    public TransitionSet setSceneRoot(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TransitionSet) ipChange.ipc$dispatch("b7c1bd8a", new Object[]{this, viewGroup});
        }
        super.setSceneRoot(viewGroup);
        int size = this.mTransitions.size();
        for (int i = 0; i < size; i++) {
            this.mTransitions.get(i).setSceneRoot(viewGroup);
        }
        return this;
    }

    @Override // androidx.transition.Transition
    public TransitionSet setStartDelay(long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TransitionSet) ipChange.ipc$dispatch("61edd532", new Object[]{this, new Long(j)}) : (TransitionSet) super.setStartDelay(j);
    }

    @Override // androidx.transition.Transition
    public Transition excludeTarget(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Transition) ipChange.ipc$dispatch("61ecd0e4", new Object[]{this, str, new Boolean(z)});
        }
        for (int i = 0; i < this.mTransitions.size(); i++) {
            this.mTransitions.get(i).excludeTarget(str, z);
        }
        return super.excludeTarget(str, z);
    }

    @Override // androidx.transition.Transition
    public TransitionSet addTarget(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TransitionSet) ipChange.ipc$dispatch("e099c3d1", new Object[]{this, view});
        }
        for (int i = 0; i < this.mTransitions.size(); i++) {
            this.mTransitions.get(i).addTarget(view);
        }
        return (TransitionSet) super.addTarget(view);
    }

    @Override // androidx.transition.Transition
    public TransitionSet removeTarget(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TransitionSet) ipChange.ipc$dispatch("c5030a7f", new Object[]{this, new Integer(i)});
        }
        for (int i2 = 0; i2 < this.mTransitions.size(); i2++) {
            this.mTransitions.get(i2).removeTarget(i);
        }
        return (TransitionSet) super.removeTarget(i);
    }

    public TransitionSet(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Styleable.TRANSITION_SET);
        setOrdering(TypedArrayUtils.getNamedInt(obtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionOrdering", 0, 0));
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.transition.Transition
    public Transition excludeTarget(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Transition) ipChange.ipc$dispatch("d2d45ab9", new Object[]{this, new Integer(i), new Boolean(z)});
        }
        for (int i2 = 0; i2 < this.mTransitions.size(); i2++) {
            this.mTransitions.get(i2).excludeTarget(i, z);
        }
        return super.excludeTarget(i, z);
    }

    @Override // androidx.transition.Transition
    public TransitionSet addTarget(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TransitionSet) ipChange.ipc$dispatch("66679582", new Object[]{this, new Integer(i)});
        }
        for (int i2 = 0; i2 < this.mTransitions.size(); i2++) {
            this.mTransitions.get(i2).addTarget(i);
        }
        return (TransitionSet) super.addTarget(i);
    }

    @Override // androidx.transition.Transition
    public TransitionSet removeTarget(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TransitionSet) ipChange.ipc$dispatch("6422d38e", new Object[]{this, view});
        }
        for (int i = 0; i < this.mTransitions.size(); i++) {
            this.mTransitions.get(i).removeTarget(view);
        }
        return (TransitionSet) super.removeTarget(view);
    }

    @Override // androidx.transition.Transition
    public Transition excludeTarget(Class<?> cls, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Transition) ipChange.ipc$dispatch("f21baf3", new Object[]{this, cls, new Boolean(z)});
        }
        for (int i = 0; i < this.mTransitions.size(); i++) {
            this.mTransitions.get(i).excludeTarget(cls, z);
        }
        return super.excludeTarget(cls, z);
    }

    @Override // androidx.transition.Transition
    public TransitionSet addTarget(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TransitionSet) ipChange.ipc$dispatch("79b958db", new Object[]{this, str});
        }
        for (int i = 0; i < this.mTransitions.size(); i++) {
            this.mTransitions.get(i).addTarget(str);
        }
        return (TransitionSet) super.addTarget(str);
    }

    @Override // androidx.transition.Transition
    public TransitionSet removeTarget(Class<?> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TransitionSet) ipChange.ipc$dispatch("727f5839", new Object[]{this, cls});
        }
        for (int i = 0; i < this.mTransitions.size(); i++) {
            this.mTransitions.get(i).removeTarget(cls);
        }
        return (TransitionSet) super.removeTarget(cls);
    }

    @Override // androidx.transition.Transition
    public TransitionSet addTarget(Class<?> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TransitionSet) ipChange.ipc$dispatch("f96b7d3c", new Object[]{this, cls});
        }
        for (int i = 0; i < this.mTransitions.size(); i++) {
            this.mTransitions.get(i).addTarget(cls);
        }
        return (TransitionSet) super.addTarget(cls);
    }

    @Override // androidx.transition.Transition
    public TransitionSet removeTarget(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TransitionSet) ipChange.ipc$dispatch("2320dd7e", new Object[]{this, str});
        }
        for (int i = 0; i < this.mTransitions.size(); i++) {
            this.mTransitions.get(i).removeTarget(str);
        }
        return (TransitionSet) super.removeTarget(str);
    }
}
