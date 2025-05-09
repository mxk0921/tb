package com.tmall.android.dai.compute;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.tmall.android.dai.DAICallback;
import com.tmall.android.dai.model.DAIModelTriggerType;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import tb.h45;
import tb.zxi;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface DAIComputeService {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public enum TaskPriority {
        HIGH(10),
        NORMAL(8),
        LOW(1);
        
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final int value;

        TaskPriority(int i) {
            this.value = i;
        }

        public static /* synthetic */ Object ipc$super(TaskPriority taskPriority, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/tmall/android/dai/compute/DAIComputeService$TaskPriority");
        }

        public static TaskPriority valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TaskPriority) ipChange.ipc$dispatch("a7b36379", new Object[]{str});
            }
            return (TaskPriority) Enum.valueOf(TaskPriority.class, str);
        }

        public int getValue() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("d1b766b5", new Object[]{this})).intValue();
            }
            return this.value;
        }
    }

    Collection<h45> a();

    void b(h45 h45Var);

    Set<zxi> c(DAIModelTriggerType dAIModelTriggerType);

    Map<String, String> d(String str);

    String e(Map<String, Object> map, String str, String str2, String str3, Map<String, String> map2, Map<String, Map<String, Object>> map3);

    void f(String str);

    h45 g(String str);

    void h(String str, Map<String, Object> map, TaskPriority taskPriority, DAICallback dAICallback, String str2);
}
