package androidx.constraintlayout.solver;

import androidx.constraintlayout.solver.Pools;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class Cache {
    public Pools.Pool<ArrayRow> arrayRowPool = new Pools.SimplePool(256);
    public Pools.Pool<SolverVariable> solverVariablePool = new Pools.SimplePool(256);
    public SolverVariable[] mIndexedVariables = new SolverVariable[32];
}
