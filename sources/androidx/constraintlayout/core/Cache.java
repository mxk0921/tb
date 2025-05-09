package androidx.constraintlayout.core;

import androidx.constraintlayout.core.Pools;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class Cache {
    public Pools.Pool<ArrayRow> mOptimizedArrayRowPool = new Pools.SimplePool(256);
    public Pools.Pool<ArrayRow> mArrayRowPool = new Pools.SimplePool(256);
    public Pools.Pool<SolverVariable> mSolverVariablePool = new Pools.SimplePool(256);
    public SolverVariable[] mIndexedVariables = new SolverVariable[32];
}
