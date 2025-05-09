package androidx.constraintlayout.core.state.helpers;

import androidx.constraintlayout.core.state.HelperReference;
import androidx.constraintlayout.core.state.State;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ChainReference extends HelperReference {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private HashMap<String, Float> mMapPostGoneMargin;
    private HashMap<String, Float> mMapPreGoneMargin;
    public float mBias = 0.5f;
    @Deprecated
    public HashMap<String, Float> mMapWeights = new HashMap<>();
    @Deprecated
    public HashMap<String, Float> mMapPreMargin = new HashMap<>();
    @Deprecated
    public HashMap<String, Float> mMapPostMargin = new HashMap<>();
    public State.Chain mStyle = State.Chain.SPREAD;

    public ChainReference(State state, State.Helper helper) {
        super(state, helper);
    }

    public static /* synthetic */ Object ipc$super(ChainReference chainReference, String str, Object... objArr) {
        if (str.hashCode() == -1657664405) {
            return super.add((Object[]) objArr[0]);
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/constraintlayout/core/state/helpers/ChainReference");
    }

    public void addChainElement(String str, float f, float f2, float f3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f60b82d3", new Object[]{this, str, new Float(f), new Float(f2), new Float(f3)});
        } else {
            addChainElement(str, f, f2, f3, 0.0f, 0.0f);
        }
    }

    public float getBias() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9e6be026", new Object[]{this})).floatValue();
        }
        return this.mBias;
    }

    public float getPostGoneMargin(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3e6cd724", new Object[]{this, str})).floatValue();
        }
        HashMap<String, Float> hashMap = this.mMapPostGoneMargin;
        if (hashMap == null || !hashMap.containsKey(str)) {
            return 0.0f;
        }
        return this.mMapPostGoneMargin.get(str).floatValue();
    }

    public float getPostMargin(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("67e161e5", new Object[]{this, str})).floatValue();
        }
        if (this.mMapPostMargin.containsKey(str)) {
            return this.mMapPostMargin.get(str).floatValue();
        }
        return 0.0f;
    }

    public float getPreGoneMargin(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("42ba1d7b", new Object[]{this, str})).floatValue();
        }
        HashMap<String, Float> hashMap = this.mMapPreGoneMargin;
        if (hashMap == null || !hashMap.containsKey(str)) {
            return 0.0f;
        }
        return this.mMapPreGoneMargin.get(str).floatValue();
    }

    public float getPreMargin(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53856bbc", new Object[]{this, str})).floatValue();
        }
        if (this.mMapPreMargin.containsKey(str)) {
            return this.mMapPreMargin.get(str).floatValue();
        }
        return 0.0f;
    }

    public State.Chain getStyle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (State.Chain) ipChange.ipc$dispatch("bc8bd721", new Object[]{this});
        }
        return State.Chain.SPREAD;
    }

    public float getWeight(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a189b96f", new Object[]{this, str})).floatValue();
        }
        if (this.mMapWeights.containsKey(str)) {
            return this.mMapWeights.get(str).floatValue();
        }
        return -1.0f;
    }

    public ChainReference style(State.Chain chain) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ChainReference) ipChange.ipc$dispatch("d7c7d676", new Object[]{this, chain});
        }
        this.mStyle = chain;
        return this;
    }

    public void addChainElement(Object obj, float f, float f2, float f3, float f4, float f5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbc74741", new Object[]{this, obj, new Float(f), new Float(f2), new Float(f3), new Float(f4), new Float(f5)});
            return;
        }
        super.add(obj);
        String obj2 = obj.toString();
        if (!Float.isNaN(f)) {
            this.mMapWeights.put(obj2, Float.valueOf(f));
        }
        if (!Float.isNaN(f2)) {
            this.mMapPreMargin.put(obj2, Float.valueOf(f2));
        }
        if (!Float.isNaN(f3)) {
            this.mMapPostMargin.put(obj2, Float.valueOf(f3));
        }
        if (!Float.isNaN(f4)) {
            if (this.mMapPreGoneMargin == null) {
                this.mMapPreGoneMargin = new HashMap<>();
            }
            this.mMapPreGoneMargin.put(obj2, Float.valueOf(f4));
        }
        if (!Float.isNaN(f5)) {
            if (this.mMapPostGoneMargin == null) {
                this.mMapPostGoneMargin = new HashMap<>();
            }
            this.mMapPostGoneMargin.put(obj2, Float.valueOf(f5));
        }
    }

    @Override // androidx.constraintlayout.core.state.ConstraintReference
    public ChainReference bias(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ChainReference) ipChange.ipc$dispatch("f7192f1", new Object[]{this, new Float(f)});
        }
        this.mBias = f;
        return this;
    }
}
