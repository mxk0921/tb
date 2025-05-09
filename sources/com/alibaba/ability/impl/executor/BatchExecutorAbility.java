package com.alibaba.ability.impl.executor;

import com.alibaba.ability.hub.AbilityHubAdapter;
import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.AbsExecutorAbility;
import com.taobao.android.abilityidl.ability.ExecutorBatchExecuteResult;
import com.taobao.android.abilityidl.ability.ExecutorTaskResult;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import tb.a07;
import tb.ckf;
import tb.gn8;
import tb.hn8;
import tb.kdb;
import tb.qn8;
import tb.s2d;
import tb.t2o;
import tb.tsq;
import tb.xhv;
import tb.y3c;
import tb.yz3;
import tb.zz3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class BatchExecutorAbility extends AbsExecutorAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(105906177);
    }

    public static final /* synthetic */ void access$executeTask(BatchExecutorAbility batchExecutorAbility, AbilityHubAdapter abilityHubAdapter, kdb kdbVar, y3c y3cVar, List list, int i, ExecutorBatchExecuteResult executorBatchExecuteResult, List list2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74a33a9c", new Object[]{batchExecutorAbility, abilityHubAdapter, kdbVar, y3cVar, list, new Integer(i), executorBatchExecuteResult, list2, new Boolean(z)});
        } else {
            batchExecutorAbility.a(abilityHubAdapter, kdbVar, y3cVar, list, i, executorBatchExecuteResult, list2, z);
        }
    }

    public static final /* synthetic */ boolean access$isSameType(BatchExecutorAbility batchExecutorAbility, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d52cc348", new Object[]{batchExecutorAbility, str, str2})).booleanValue();
        }
        return batchExecutorAbility.b(str, str2);
    }

    public static final /* synthetic */ boolean access$isTaskBlockOnError(BatchExecutorAbility batchExecutorAbility, qn8 qn8Var, ExecutorTaskResult executorTaskResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c35ece12", new Object[]{batchExecutorAbility, qn8Var, executorTaskResult})).booleanValue();
        }
        return batchExecutorAbility.c(qn8Var, executorTaskResult);
    }

    public static /* synthetic */ Object ipc$super(BatchExecutorAbility batchExecutorAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ability/impl/executor/BatchExecutorAbility");
    }

    public final boolean c(qn8 qn8Var, ExecutorTaskResult executorTaskResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e54e4cb3", new Object[]{this, qn8Var, executorTaskResult})).booleanValue();
        }
        if (!qn8Var.b || ckf.b(executorTaskResult.status, "SUCCESS")) {
            return false;
        }
        return true;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class a implements s2d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ gn8 f1942a;
        public final /* synthetic */ ExecutorTaskResult b;
        public final /* synthetic */ CopyOnWriteArrayList c;
        public final /* synthetic */ AtomicInteger d;
        public final /* synthetic */ qn8 e;
        public final /* synthetic */ BatchExecutorAbility f;
        public final /* synthetic */ List g;
        public final /* synthetic */ ExecutorBatchExecuteResult h;
        public final /* synthetic */ int i;
        public final /* synthetic */ List j;
        public final /* synthetic */ y3c k;
        public final /* synthetic */ AbilityHubAdapter l;
        public final /* synthetic */ kdb m;

        public a(gn8 gn8Var, ExecutorTaskResult executorTaskResult, CopyOnWriteArrayList copyOnWriteArrayList, AtomicInteger atomicInteger, qn8 qn8Var, BatchExecutorAbility batchExecutorAbility, List list, boolean z, ExecutorBatchExecuteResult executorBatchExecuteResult, int i, List list2, y3c y3cVar, AbilityHubAdapter abilityHubAdapter, kdb kdbVar) {
            this.f1942a = gn8Var;
            this.b = executorTaskResult;
            this.c = copyOnWriteArrayList;
            this.d = atomicInteger;
            this.e = qn8Var;
            this.f = batchExecutorAbility;
            this.g = list;
            this.h = executorBatchExecuteResult;
            this.i = i;
            this.j = list2;
            this.k = y3cVar;
            this.l = abilityHubAdapter;
            this.m = kdbVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x003d, code lost:
            if (com.alibaba.ability.impl.executor.BatchExecutorAbility.access$isSameType(r3, r4, r5) != false) goto L_0x003f;
         */
        @Override // tb.s2d
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onCallback(com.alibaba.ability.result.ExecuteResult r11) {
            /*
                Method dump skipped, instructions count: 296
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ability.impl.executor.BatchExecutorAbility.a.onCallback(com.alibaba.ability.result.ExecuteResult):void");
        }
    }

    public final boolean b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bc33b829", new Object[]{this, str, str2})).booleanValue();
        }
        if (str2.length() <= 2 || !tsq.I(str2, "on", false, 2, null)) {
            return false;
        }
        String substring = str2.substring(2);
        ckf.f(substring, "(this as java.lang.String).substring(startIndex)");
        Locale locale = Locale.ROOT;
        ckf.f(locale, "Locale.ROOT");
        String lowerCase = substring.toLowerCase(locale);
        ckf.f(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
        return ckf.b(lowerCase, str);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsExecutorAbility
    public void batchExecute(kdb kdbVar, hn8 hn8Var, y3c y3cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e37b5f3", new Object[]{this, kdbVar, hn8Var, y3cVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(hn8Var, "params");
        ckf.g(y3cVar, "callback");
        AbilityHubAdapter adapter = kdbVar.l().getAdapter();
        if (adapter != null) {
            ExecutorBatchExecuteResult executorBatchExecuteResult = new ExecutorBatchExecuteResult();
            CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
            executorBatchExecuteResult.status = "ALL_SUCCESS_DONE";
            executorBatchExecuteResult.taskResults = copyOnWriteArrayList;
            if (hn8Var.f20759a.size() > 0) {
                List<qn8> list = hn8Var.f20759a;
                ckf.f(list, "params.tasks");
                a(adapter, kdbVar, y3cVar, list, 0, executorBatchExecuteResult, copyOnWriteArrayList, false);
                return;
            }
            y3cVar.d0(executorBatchExecuteResult);
            return;
        }
        y3cVar.O(new ErrorResult("ADAPTER_NOT_FOUND", "没有找到合适的调度器", (Map) null, 4, (a07) null));
    }

    public final void a(AbilityHubAdapter abilityHubAdapter, kdb kdbVar, y3c y3cVar, List<qn8> list, int i, ExecutorBatchExecuteResult executorBatchExecuteResult, List<ExecutorTaskResult> list2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1472155b", new Object[]{this, abilityHubAdapter, kdbVar, y3cVar, list, new Integer(i), executorBatchExecuteResult, list2, new Boolean(z)});
            return;
        }
        qn8 qn8Var = list.get(i);
        ExecutorTaskResult executorTaskResult = new ExecutorTaskResult();
        list2.add(executorTaskResult);
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        executorTaskResult.status = "SUCCESS";
        executorTaskResult.apiResults = copyOnWriteArrayList;
        if (z) {
            executorTaskResult.status = "BLOCKED";
            executorBatchExecuteResult.status = "ERROR_STOP";
            if (i == yz3.k(list)) {
                y3cVar.d0(executorBatchExecuteResult);
            } else {
                a(abilityHubAdapter, kdbVar, y3cVar, list, i + 1, executorBatchExecuteResult, list2, true);
            }
        } else if (qn8Var.f26834a.size() != 0) {
            AtomicInteger atomicInteger = new AtomicInteger(qn8Var.f26834a.size());
            List<gn8> list3 = qn8Var.f26834a;
            ckf.f(list3, "task.apis");
            List<gn8> list4 = list3;
            ArrayList arrayList = new ArrayList(zz3.q(list4, 10));
            for (gn8 gn8Var : list4) {
                String str = gn8Var.f20108a;
                ckf.f(str, "api.ability");
                String str2 = gn8Var.b;
                ckf.f(str2, "api.api");
                abilityHubAdapter.j(str, str2, kdbVar, gn8Var.c, new a(gn8Var, executorTaskResult, copyOnWriteArrayList, atomicInteger, qn8Var, this, list2, z, executorBatchExecuteResult, i, list, y3cVar, abilityHubAdapter, kdbVar));
                arrayList.add(xhv.INSTANCE);
                arrayList = arrayList;
                atomicInteger = atomicInteger;
                copyOnWriteArrayList = copyOnWriteArrayList;
                executorTaskResult = executorTaskResult;
                qn8Var = qn8Var;
            }
        } else if (i == yz3.k(list)) {
            y3cVar.d0(executorBatchExecuteResult);
        } else {
            a(abilityHubAdapter, kdbVar, y3cVar, list, i + 1, executorBatchExecuteResult, list2, false);
        }
    }
}
